/* webauthn4jの各データクラスのシリアライズ、デシリアライズサンプルです */
import com.webauthn4j.converter.util.ObjectConverter;
import com.webauthn4j.converter.AttestationObjectConverter;
import com.webauthn4j.converter.CollectedClientDataConverter;
import com.webauthn4j.data.*;
import com.webauthn4j.data.attestation.AttestationObject;
import com.webauthn4j.data.client.CollectedClientData;
import com.webauthn4j.data.extension.client.AuthenticationExtensionsClientOutputs;
import com.webauthn4j.data.extension.client.RegistrationExtensionClientOutput;
import com.fasterxml.jackson.core.type.TypeReference;

// シリアライズ、デシリアライズに使用するDataConverterを作成
ObjectConverter objectConverter = new ObjectConverter();
AttestationObjectConverter attestationObjectConverter = new AttestationObjectConverter(objectConverter);
CollectedClientDataConverter collectedClientDataConverter = new CollectedClientDataConverter(objectConverter);

// リクエストをパースして登録データクラスに変換
RegistrationData registrationData = manager.parseRegistrationResponseJSON(request);

// シリアライズ
String serializedAttestationObject = attestationObjectConverter.convertToBase64urlString(registrationData.getAttestationObject());
String serializedClientData = collectedClientDataConverter.convertToBase64UrlString(registrationData.getCollectedClientData());
String serializedClientExtensions = objectConverter.getJsonConverter().writeValueAsString(registrationData.getClientExtensions());
String serializedTransports = objectConverter.getJsonConverter().writeValueAsString(registrationData.getTransports());

// デシリアライズ
AttestationObject attestationObject = attestationObjectConverter.convert(serializedAttestationObject);
CollectedClientData collectedClientData = collectedClientDataConverter.convert(serializedClientData);
AuthenticationExtensionsClientOutputs<RegistrationExtensionClientOutput> clientExtensions = objectConverter.getJsonConverter().readValue(
    serializedClientExtensions, 
    new TypeReference<AuthenticationExtensionsClientOutputs<RegistrationExtensionClientOutput>>() {}
);
Set<AuthenticatorTransport> transports = objectConverter.getJsonConverter().readValue(
    serializedTransports,
    new TypeReference<Set<AuthenticatorTransport>>() {}
);

// CredentialRecordの作成
CredentialRecord credentialRecord = new CredentialRecordImpl(
    attestationObject,
    collectedClientData,
    clientExtensions,
    transports
);

/* 参考までに、シリアライズ後の各データは以下のような文字列となります。(あくまでもサンプルなので、実際は異なる場合があります)
serializedAttestationObject=o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIFApSWqMrCeNcDDi8uwxmh-lcpiD1MOVyU2EgzkPKifHpQECAyYgASFYIEdl_-VMiSGzqK8WPTYXDYH3XJi_4mkru7-xqzr_0-ZyIlggzkAw7-IIeb5vSEu-fNEkpRwh7adO5_H_-sdVQ_J2iUA
serializedClientData=eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiMkdEWVNUVGVTTDYtaXhHcE5jZUhrQSIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0
serializedClientExtensions= ※通常であればcreate時に指定したextensionの値が入りますが、今回は指定無し想定なので空です。
serializedTransports=["internal"]
*/
