# パスキー登録

## No.12 解析レスポンスデータのデータ構造が不正(clientDataJSONを空にする)
###### challenge：適当な値でOK(チャレンジ情報不一致前にDataConversionExceptionが発生するため)
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"cUqYQBNCvg6Xl5RavaOH7ERDpWaTRQ6YKxRRLiZg9Hs","rawId":"cUqYQBNCvg6Xl5RavaOH7ERDpWaTRQ6YKxRRLiZg9Hs","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIHFKmEATQr4Ol5eUWr2jh-xEQ6Vmk0UOmCsUUS4mYPR7pQECAyYgASFYIHPqMYzjkVENLhknSXoEBP9jkxV6-M820YI2eWDMXc77IlggGd89abkWW2X99Jo3IgoG7kCuSMkRfDQFjUcVXJgDrbc","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIHFKmEATQr4Ol5eUWr2jh-xEQ6Vmk0UOmCsUUS4mYPR7pQECAyYgASFYIHPqMYzjkVENLhknSXoEBP9jkxV6-M820YI2eWDMXc77IlggGd89abkWW2X99Jo3IgoG7kCuSMkRfDQFjUcVXJgDrbc","clientDataJSON":"","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEc-oxjOORUQ0uGSdJegQE_2OTFXr4zzbRgjZ5YMxdzvsZ3z1puRZbZf30mjciCgbuQK5IyRF8NAWNRxVcmAOttw","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}

## No.13 チャレンジ情報の不一致
###### challenge：適当な値でOK(チャレンジ情報不一致を発生させるため)
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"HY6Z-KJtGxa8LbmvZ6wedAuh7wcLGzusE_1EEHSSFx0","rawId":"HY6Z-KJtGxa8LbmvZ6wedAuh7wcLGzusE_1EEHSSFx0","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIB2OmfiibRsWvC25r2esHnQLoe8HCxs7rBP9RBB0khcdpQECAyYgASFYIGJPPmhQDZy_wZp8yBWAGI0ZXO1khOp3k_BHGIoWaW9aIlgg5kLCQphwjVgKtLpydtAbC1M4lHppLWpH16N_vXLmnso","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIB2OmfiibRsWvC25r2esHnQLoe8HCxs7rBP9RBB0khcdpQECAyYgASFYIGJPPmhQDZy_wZp8yBWAGI0ZXO1khOp3k_BHGIoWaW9aIlgg5kLCQphwjVgKtLpydtAbC1M4lHppLWpH16N_vXLmnso","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoidzhpYzB6VllUVzZzNmk0V3NaUjcxZyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEYk8-aFANnL_BmnzIFYAYjRlc7WSE6neT8EcYihZpb1rmQsJCmHCNWAq0unJ20BsLUziUemktakfXo3-9cuaeyg","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}

## No.14 RPIDのハッシュ値が不正
###### challenge：
###### publicKeyCredential：

## No.15 UPが0
###### challenge：
###### publicKeyCredential：

## No.16 UVが0
###### challenge：
###### publicKeyCredential：

## No.17 オリジンが想定と異なる(https://example.comに改ざん)
###### challenge：
###### publicKeyCredential：

## No.18 データ種別がwebauthn.createではない(webauthn.getに改ざん)
###### challenge：
###### publicKeyCredential：

## No.19 公開鍵のCOSE形式が不正(algの指定を削除)
###### challenge：
###### publicKeyCredential：

## No.20 想定外エラー (flagsのビット3(BE)が0、かつビット4(BS)が1)
###### challenge：
###### publicKeyCredential：

## No.23 Vanilla連携エラー (正常なレスポンスデータ)
###### challenge：oIy-1aRoTgmHl5Eny6bXRQ
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"ISxgCCZf8TCr60UOSwwwehBgxXnzbo2Je3o9HLiV2rU","rawId":"ISxgCCZf8TCr60UOSwwwehBgxXnzbo2Je3o9HLiV2rU","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAICEsYAgmX_Ewq-tFDksMMHoQYMV5826NiXt6PRy4ldq1pQECAyYgASFYIFwZrwijOGc-xufAW6iEuj1iONrt-6TbCZ_4Gk5uZSv0Ilgg9qT_OdemuBgGADLaCUFI0whIdxdzDzNlhGG-pDrgFNs","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAICEsYAgmX_Ewq-tFDksMMHoQYMV5826NiXt6PRy4ldq1pQECAyYgASFYIFwZrwijOGc-xufAW6iEuj1iONrt-6TbCZ_4Gk5uZSv0Ilgg9qT_OdemuBgGADLaCUFI0whIdxdzDzNlhGG-pDrgFNs","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoib0l5LTFhUm9UZ21IbDVFbnk2YlhSUSIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZSwib3RoZXJfa2V5c19jYW5fYmVfYWRkZWRfaGVyZSI6ImRvIG5vdCBjb21wYXJlIGNsaWVudERhdGFKU09OIGFnYWluc3QgYSB0ZW1wbGF0ZS4gU2VlIGh0dHBzOi8vZ29vLmdsL3lhYlBleCJ9","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEXBmvCKM4Zz7G58BbqIS6PWI42u37pNsJn_gaTm5lK_T2pP8516a4GAYAMtoJQUjTCEh3F3MPM2WEYb6kOuAU2w","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}
