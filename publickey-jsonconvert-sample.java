/* 登録レスポンスクラスからCOSEKey情報を取得し、JSON文字列に変換するサンプル */
import com.webauthn4j.converter.util.ObjectConverter;
import com.webauthn4j.data.attestation.authenticator.COSEKey;

// リクエストをパースして登録データクラスに変換
RegistrationData registrationData = manager.parseRegistrationResponseJSON(request);

// JSON変換に使用するObjectConverterを作成
ObjectConverter objectConverter = new ObjectConverter();

COSEKey coseKey = registrationData.getAttestationObject().getAuthenticatorData().getAttestedCredentialData().getCOSEKey();
logger.info("coseKey(json)={}", objectConverter.getJsonConverter().writeValueAsString(coseKey));

/* coseKey(json)の中身は下記のようなJSON文字列となります。
 * このJSON形式はCOSE Keyの標準規格で定められているフォーマットなので、仮にwebauthn4j以外のライブラリに差し替えになった場合でも問題なく使用できるようです。（By ChatGPT）

// RSA公開鍵の場合
{
	"1": "3",
	"3": -257,
	"-1": "zCQrQk8920OEflC_TtMbU5yglp29MMdf1Kf9CBFMbQM5vzPeHiawXM3-yyyQSOJ6YLYZpqBGv6dR3Z_QPbQT7no68bXUbUtqLEYUfu0_Xjfsf9JR_XZ3ozznEdTNa00UtStlQSSe6Y4SrvtrPqMEePd7v-W2aFo5iPONbG6Fimpi6qizZfW5zYVqw6jIODRPBqwjzTgDCdpq2p_isGY3BQ0uVUXfowvxgZ0cioeb_D2lGOeuGwzd10OLD8Eb0wJeLgfw-kp0xmI0jz8UCm0qji91oXXRI2cV9oYbHmFI8T8W6o-bNvmWS-E2X7me1_HKg_FXJUA1wVvCUD3fGBvTeQ",
	"-2": "AQAB"
	"1": 3
}


// EC2公開鍵の場合
{
	"1": "2",
	"3": -7,
	"-1": 1,
	"-2": "ViT4hlouCVHCEDYbULHNBpbva_1y5eJd4jypxySd9pA",
	"-3": "Jx_G-zcw2tAEd2GLz6Epgsnyk_t_WX-Og2ThRn4ZCnQ"
	"1": 2
}

*/
