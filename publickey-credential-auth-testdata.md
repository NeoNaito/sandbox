# パスキー認証

## ~~01-010 signCountが0の正常データ~~

## 01-011 データ構造が不整合(ClientDataJSONを空にする)
#### 登録時
###### challenge：tFWCjvfdRTC8z7FHweFJvg
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"q9rcnHgLClwsda94YwjjmKeV_l1s_OI3z4b96GvzwZE","rawId":"q9rcnHgLClwsda94YwjjmKeV_l1s_OI3z4b96GvzwZE","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIKva3Jx4CwpcLHWveGMI45inlf5dbPziN8-G_ehr88GRpQECAyYgASFYIHc-WwcAj7N_VASSe_U1oNL23t2GDpw66ch0iYy7Vg9MIlggbyJ7IahOEqJVff8j5dcNneANSJofWTFBRqHlD19jI10","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIKva3Jx4CwpcLHWveGMI45inlf5dbPziN8-G_ehr88GRpQECAyYgASFYIHc-WwcAj7N_VASSe_U1oNL23t2GDpw66ch0iYy7Vg9MIlggbyJ7IahOEqJVff8j5dcNneANSJofWTFBRqHlD19jI10","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoidEZXQ2p2ZmRSVEM4ejdGSHdlRkp2ZyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEdz5bBwCPs39UBJJ79TWg0vbe3YYOnDrpyHSJjLtWD0xvInshqE4SolV9_yPl1w2d4A1Imh9ZMUFGoeUPX2MjXQ","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}
---
#### 認証時
###### challenge：任意の値（チャレンジ不一致前にデータ構造不整合エラーとなるため）
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"q9rcnHgLClwsda94YwjjmKeV_l1s_OI3z4b96GvzwZE","rawId":"q9rcnHgLClwsda94YwjjmKeV_l1s_OI3z4b96GvzwZE","response":{"authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2MFAAAAAQ","clientDataJSON":"","signature":"MEYCIQDmDsCciwyoayrWRwihDpI5242sUfDg8BUxeefE5zSQPwIhAO-PiRtHwDSjxFFXl61abUMGXNVLMaDHzRPlXOqKjG5e","userHandle":"AQIDBA"},"type":"public-key"}

## 01-017 チャレンジ不一致
#### 登録時
###### challenge：-xgYyaFkTdq2xj85h7VRBw
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","rawId":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIKdOcw5u1mYXH38cobPbQvMzNmwBRWUm7ye0m1THymYvpQECAyYgASFYILqPfdmXqpqGMZ4G4YVAyVG74rVPcylaKyWtL6rPwgXZIlggcBQw3SAs8yNe3o8Q9DRIz0-oo71Dmffc52JeIRyIN3c","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIKdOcw5u1mYXH38cobPbQvMzNmwBRWUm7ye0m1THymYvpQECAyYgASFYILqPfdmXqpqGMZ4G4YVAyVG74rVPcylaKyWtL6rPwgXZIlggcBQw3SAs8yNe3o8Q9DRIz0-oo71Dmffc52JeIRyIN3c","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiLXhnWXlhRmtUZHEyeGo4NWg3VlJCdyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEuo992ZeqmoYxngbhhUDJUbvitU9zKVorJa0vqs_CBdlwFDDdICzzI17ejxD0NEjPT6ijvUOZ99znYl4hHIg3dw","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}
---
#### 認証時
###### challenge：任意の値（チャレンジ不一致とするため）
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","rawId":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","response":{"authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2MFAAAAAQ","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uZ2V0IiwiY2hhbGxlbmdlIjoiSzBaMk9jdVNUWkdfczViOHRsNFo3dyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","signature":"MEUCIQCg-5zfTRhie2nyLzGzaFDyzeEXKyUOe3yS0hqyN8GBBAIgVVRYPAJI7k1Kkv8b0Xfmgd2UkKRI98Drcdnybsalp34","userHandle":"AQIDBA"},"type":"public-key"}

## 01-018 ハッシュ値不一致
#### 登録時
###### challenge：Zm6q251KTyKreonoSL4n8w
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"IXRm6T0Y-bBViiyO57mmC8GeOpJhULL-QRBztSkUfVQ","rawId":"IXRm6T0Y-bBViiyO57mmC8GeOpJhULL-QRBztSkUfVQ","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAICF0Zuk9GPmwVYosjue5pgvBnjqSYVCy_kEQc7UpFH1UpQECAyYgASFYIJqgX8PFPOi9KNs_XuTnZESrMmvz2iyoxpq1Z4-tzgypIlggwe87-YuakLnArkP8Usrr01AYsLzEObxNrXXUL98ZZac","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAICF0Zuk9GPmwVYosjue5pgvBnjqSYVCy_kEQc7UpFH1UpQECAyYgASFYIJqgX8PFPOi9KNs_XuTnZESrMmvz2iyoxpq1Z4-tzgypIlggwe87-YuakLnArkP8Usrr01AYsLzEObxNrXXUL98ZZac","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiWm02cTI1MUtUeUtyZW9ub1NMNG44dyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEmqBfw8U86L0o2z9e5OdkRKsya_PaLKjGmrVnj63ODKnB7zv5i5qQucCuQ_xSyuvTUBiwvMQ5vE2tddQv3xllpw","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}
---
#### 認証時
###### challenge：ljZLQ4CQSkqzSvKmyoi1Aw
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"IXRm6T0Y-bBViiyO57mmC8GeOpJhULL-QRBztSkUfVQ","rawId":"IXRm6T0Y-bBViiyO57mmC8GeOpJhULL-QRBztSkUfVQ","response":{"authenticatorData":"AQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEFAAAAAQ","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uZ2V0IiwiY2hhbGxlbmdlIjoibGpaTFE0Q1FTa3F6U3ZLbXlvaTFBdyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","signature":"MEUCIQCoyv79ycE7tLTX7u21hMS7i1ob8roj6nm6bJjJ3aiX2QIgcxfy4hl3NbYOepjLqz_VPZNR3_UnIytEVdxTAibM_3A","userHandle":"AQIDBA"},"type":"public-key"}

## 01-019 署名検証失敗
#### 登録時
###### challenge：
###### publicKeyCredential：
---
#### 認証時
###### challenge：
###### publicKeyCredential：

## 01-020 UPが0
#### 登録時
###### challenge：PZdxEHLrSwWY5zMVBxX59w
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"B60YyxZ6RT5s2jVIA5nYRfvi7lnJ7MRNOKtkd_z9yoA","rawId":"B60YyxZ6RT5s2jVIA5nYRfvi7lnJ7MRNOKtkd_z9yoA","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIAetGMsWekU-bNo1SAOZ2EX74u5ZyezETTirZHf8_cqApQECAyYgASFYIPGR-VAw058Lutrs484gVD1B57DbYAJGOy2xQVHdiUENIlggsSMycjmVJIa0kf-e11FKps5kJgnoyCh74ICeJYuYkaI","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIAetGMsWekU-bNo1SAOZ2EX74u5ZyezETTirZHf8_cqApQECAyYgASFYIPGR-VAw058Lutrs484gVD1B57DbYAJGOy2xQVHdiUENIlggsSMycjmVJIa0kf-e11FKps5kJgnoyCh74ICeJYuYkaI","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiUFpkeEVITHJTd1dZNXpNVkJ4WDU5dyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE8ZH5UDDTnwu62uzjziBUPUHnsNtgAkY7LbFBUd2JQQ2xIzJyOZUkhrSR_57XUUqmzmQmCejIKHvggJ4li5iRog","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}
---
#### 認証時
###### challenge：uPT6lxgaSZO6FOysc0oPAg
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"B60YyxZ6RT5s2jVIA5nYRfvi7lnJ7MRNOKtkd_z9yoA","rawId":"B60YyxZ6RT5s2jVIA5nYRfvi7lnJ7MRNOKtkd_z9yoA","response":{"authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2MEAAAAAQ","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uZ2V0IiwiY2hhbGxlbmdlIjoidVBUNmx4Z2FTWk82Rk95c2Mwb1BBZyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","signature":"MEUCIQCHz38VE6_Ga8Ep5Ndsotb9oSdRuYvPAuP78owbjGWeAgIgR18PQkcJc-0xuftwdbBlmgptjchvhmdnHH2EzZaLb4c","userHandle":"AQIDBA"},"type":"public-key"}

## 01-021 UVが0
#### 登録時
###### challenge：iGYugwoMSUCo4D69olFRmg
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"ULRwgr79ZvybU932fXWuWuIvxYMRjdPjjWkQeDVcjAA","rawId":"ULRwgr79ZvybU932fXWuWuIvxYMRjdPjjWkQeDVcjAA","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIFC0cIK-_Wb8m1Pd9n11rlriL8WDEY3T441pEHg1XIwApQECAyYgASFYIODTBvdE-nPkwOcr_AMa1JNMu8Lc1Slkgeweo_Aa1znVIlgglBU674Lenbjbb55aEFcUSfWRqp9E-X6KU-i6cToSE5Y","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIFC0cIK-_Wb8m1Pd9n11rlriL8WDEY3T441pEHg1XIwApQECAyYgASFYIODTBvdE-nPkwOcr_AMa1JNMu8Lc1Slkgeweo_Aa1znVIlgglBU674Lenbjbb55aEFcUSfWRqp9E-X6KU-i6cToSE5Y","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiaUdZdWd3b01TVUNvNEQ2OW9sRlJtZyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE4NMG90T6c-TA5yv8AxrUk0y7wtzVKWSB7B6j8BrXOdWUFTrvgt6duNtvnloQVxRJ9ZGqn0T5fopT6LpxOhITlg","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}
---
#### 認証時
###### challenge：xtmz_zdGQE24dBnjfg4pHg
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"ULRwgr79ZvybU932fXWuWuIvxYMRjdPjjWkQeDVcjAA","rawId":"ULRwgr79ZvybU932fXWuWuIvxYMRjdPjjWkQeDVcjAA","response":{"authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2MBAAAAAQ","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uZ2V0IiwiY2hhbGxlbmdlIjoieHRtel96ZEdRRTI0ZEJuamZnNHBIZyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","signature":"MEUCIQC8b5SNOpJZGmTP9O0um_xNqEPiFN4o8tkbVSLT7tOMDwIgKALmyL9eLPHkBQSyzhIAX1_kJ2xdPVPk9UaaM9KpHYQ","userHandle":"AQIDBA"},"type":"public-key"}

## 01-022 オリジンが想定と異なる
#### 登録時
###### challenge：ZoMUy6S2QYOTnAAkgvDDig
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"W-ErMKB2rE0kAVKLD1ep1qL_lwOQMgTYlVTSLt5ipqw","rawId":"W-ErMKB2rE0kAVKLD1ep1qL_lwOQMgTYlVTSLt5ipqw","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIFvhKzCgdqxNJAFSiw9Xqdai_5cDkDIE2JVU0i7eYqaspQECAyYgASFYIMdDnRD0yRptKU7dBVNdpmqlHExl1DiKr0JutmZh2aqmIlggfLtB193rEilR02sYi2HqamvDzf7QJGCdDv5tbP6ZUzU","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIFvhKzCgdqxNJAFSiw9Xqdai_5cDkDIE2JVU0i7eYqaspQECAyYgASFYIMdDnRD0yRptKU7dBVNdpmqlHExl1DiKr0JutmZh2aqmIlggfLtB193rEilR02sYi2HqamvDzf7QJGCdDv5tbP6ZUzU","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiWm9NVXk2UzJRWU9UbkFBa2d2RERpZyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEx0OdEPTJGm0pTt0FU12maqUcTGXUOIqvQm62ZmHZqqZ8u0HX3esSKVHTaxiLYepqa8PN_tAkYJ0O_m1s_plTNQ","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}
---
#### 認証時
###### challenge：0FtFiq-gSWKsJyfR3qiqYg
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"W-ErMKB2rE0kAVKLD1ep1qL_lwOQMgTYlVTSLt5ipqw","rawId":"W-ErMKB2rE0kAVKLD1ep1qL_lwOQMgTYlVTSLt5ipqw","response":{"authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2MFAAAAAQ","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uZ2V0IiwiY2hhbGxlbmdlIjoiMEZ0RmlxLWdTV0tzSnlmUjNxaXFZZyIsIm9yaWdpbiI6Imh0dHBzOi8vZXhhbXBsZS5jb20iLCJjcm9zc09yaWdpbiI6ZmFsc2V9","signature":"MEYCIQD-pVC0-m_Zd7io_k5VfNsb84_11c8kaWHy0UdqjAPCiAIhAKmTDuC0XaILNdeXFxrVr1numysURLyvS67xdQ9v3Y0M","userHandle":"AQIDBA"},"type":"public-key"}

## 01-023 データ種別がwebauthn.getではない
#### 登録時
###### challenge：ZX-HSxJESVGdEaMEP1tjzw
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"3aa68Sa_YDhsjROrTTdfeodD3Y3CWntLaI2eu0-0CBI","rawId":"3aa68Sa_YDhsjROrTTdfeodD3Y3CWntLaI2eu0-0CBI","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIN2muvEmv2A4bI0Tq003X3qHQ92Nwlp7S2iNnrtPtAgSpQECAyYgASFYIPuHwWaY5i9f5x-Zw3RU7o_g-aMlbu3qJCEdajTrbkUSIlgglkiDufuw4gvIJCtzD5cGurLZRfxTX0YqT03tx1UR5S8","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIN2muvEmv2A4bI0Tq003X3qHQ92Nwlp7S2iNnrtPtAgSpQECAyYgASFYIPuHwWaY5i9f5x-Zw3RU7o_g-aMlbu3qJCEdajTrbkUSIlgglkiDufuw4gvIJCtzD5cGurLZRfxTX0YqT03tx1UR5S8","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiWlgtSFN4SkVTVkdkRWFNRVAxdGp6dyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE-4fBZpjmL1_nH5nDdFTuj-D5oyVu7eokIR1qNOtuRRKWSIO5-7DiC8gkK3MPlwa6stlF_FNfRipPTe3HVRHlLw","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}
---
#### 認証時
###### challenge：fuzRdDY6RH-xHhLaXuZ-9w
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"3aa68Sa_YDhsjROrTTdfeodD3Y3CWntLaI2eu0-0CBI","rawId":"3aa68Sa_YDhsjROrTTdfeodD3Y3CWntLaI2eu0-0CBI","response":{"authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2MFAAAAAQ","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiZnV6UmREWTZSSC14SGhMYVh1Wi05dyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","signature":"MEQCID7cuQBAFoNhTQ-PqVLKIRgXh2hLCOHc0zfyLq1l14GpAiAZM3Igpi07MhKMQRfJAXXd4X1695JdvdpRJqEcEsQB2A","userHandle":"AQIDBA"},"type":"public-key"}

## 01-024 その他(flagsのビット3(BE)が0、かつビット4(BS)が1)
#### 登録時
###### challenge：EbTpqXhdTA-33eGaw803Kw
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"FqDIK0pDVTOXjZDwbq_mVIMc5WNvV1AN7lhwLC9IId8","rawId":"FqDIK0pDVTOXjZDwbq_mVIMc5WNvV1AN7lhwLC9IId8","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIBagyCtKQ1Uzl42Q8G6v5lSDHOVjb1dQDe5YcCwvSCHfpQECAyYgASFYIIApAmFM0Mnj7H8trzrh7Sa-NeBWmsJZUNaGs4v5joPXIlggVA9EIN99LYHTQDh5taBSO-CKldzSm6VNfgOAcwTTNAg","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIBagyCtKQ1Uzl42Q8G6v5lSDHOVjb1dQDe5YcCwvSCHfpQECAyYgASFYIIApAmFM0Mnj7H8trzrh7Sa-NeBWmsJZUNaGs4v5joPXIlggVA9EIN99LYHTQDh5taBSO-CKldzSm6VNfgOAcwTTNAg","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiRWJUcHFYaGRUQS0zM2VHYXc4MDNLdyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEgCkCYUzQyePsfy2vOuHtJr414FaawllQ1oazi_mOg9dUD0Qg330tgdNAOHm1oFI74IqV3NKbpU1-A4BzBNM0CA","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}
---
#### 認証時
###### challenge：jed-Mg8tTZSVWSiKqc2QjQ
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"FqDIK0pDVTOXjZDwbq_mVIMc5WNvV1AN7lhwLC9IId8","rawId":"FqDIK0pDVTOXjZDwbq_mVIMc5WNvV1AN7lhwLC9IId8","response":{"authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2MVAAAAAQ","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uZ2V0IiwiY2hhbGxlbmdlIjoiamVkLU1nOHRUWlNWV1NpS3FjMlFqUSIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","signature":"MEUCIG8yjE5k6tH5LyexwvsC6P2vzTea96dCc01U4NQBB3hIAiEAmjLf9NahbhAPEVC5SCRFqB0GQCAgVS7Q1heNuGM4pq4","userHandle":"AQIDBA"},"type":"public-key"}

## 01-025 UserHandle不一致(publicKeyCredentialは正常データなので、Ginger側のUserHandleを適当な値にして不一致させてください)
#### 登録時
###### challenge：-xgYyaFkTdq2xj85h7VRBw
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","rawId":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIKdOcw5u1mYXH38cobPbQvMzNmwBRWUm7ye0m1THymYvpQECAyYgASFYILqPfdmXqpqGMZ4G4YVAyVG74rVPcylaKyWtL6rPwgXZIlggcBQw3SAs8yNe3o8Q9DRIz0-oo71Dmffc52JeIRyIN3c","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIKdOcw5u1mYXH38cobPbQvMzNmwBRWUm7ye0m1THymYvpQECAyYgASFYILqPfdmXqpqGMZ4G4YVAyVG74rVPcylaKyWtL6rPwgXZIlggcBQw3SAs8yNe3o8Q9DRIz0-oo71Dmffc52JeIRyIN3c","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiLXhnWXlhRmtUZHEyeGo4NWg3VlJCdyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEuo992ZeqmoYxngbhhUDJUbvitU9zKVorJa0vqs_CBdlwFDDdICzzI17ejxD0NEjPT6ijvUOZ99znYl4hHIg3dw","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}
---
#### 認証時
###### challenge：K0Z2OcuSTZG_s5b8tl4Z7w
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","rawId":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","response":{"authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2MFAAAAAQ","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uZ2V0IiwiY2hhbGxlbmdlIjoiSzBaMk9jdVNUWkdfczViOHRsNFo3dyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","signature":"MEUCIQCg-5zfTRhie2nyLzGzaFDyzeEXKyUOe3yS0hqyN8GBBAIgVVRYPAJI7k1Kkv8b0Xfmgd2UkKRI98Drcdnybsalp34","userHandle":"AQIDBA"},"type":"public-key"}

## 01-027 signCountが1の正常データ
#### 登録時
###### challenge：-xgYyaFkTdq2xj85h7VRBw
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","rawId":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","response":{"attestationObject":"o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YVikSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIKdOcw5u1mYXH38cobPbQvMzNmwBRWUm7ye0m1THymYvpQECAyYgASFYILqPfdmXqpqGMZ4G4YVAyVG74rVPcylaKyWtL6rPwgXZIlggcBQw3SAs8yNe3o8Q9DRIz0-oo71Dmffc52JeIRyIN3c","authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NFAAAAAAAAAAAAAAAAAAAAAAAAAAAAIKdOcw5u1mYXH38cobPbQvMzNmwBRWUm7ye0m1THymYvpQECAyYgASFYILqPfdmXqpqGMZ4G4YVAyVG74rVPcylaKyWtL6rPwgXZIlggcBQw3SAs8yNe3o8Q9DRIz0-oo71Dmffc52JeIRyIN3c","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uY3JlYXRlIiwiY2hhbGxlbmdlIjoiLXhnWXlhRmtUZHEyeGo4NWg3VlJCdyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","publicKey":"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEuo992ZeqmoYxngbhhUDJUbvitU9zKVorJa0vqs_CBdlwFDDdICzzI17ejxD0NEjPT6ijvUOZ99znYl4hHIg3dw","publicKeyAlgorithm":-7,"transports":["internal"]},"type":"public-key"}
---
#### 認証時
###### challenge：K0Z2OcuSTZG_s5b8tl4Z7w
###### publicKeyCredential：{"authenticatorAttachment":"platform","clientExtensionResults":{},"id":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","rawId":"p05zDm7WZhcffxyhs9tC8zM2bAFFZSbvJ7SbVMfKZi8","response":{"authenticatorData":"SZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2MFAAAAAQ","clientDataJSON":"eyJ0eXBlIjoid2ViYXV0aG4uZ2V0IiwiY2hhbGxlbmdlIjoiSzBaMk9jdVNUWkdfczViOHRsNFo3dyIsIm9yaWdpbiI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImNyb3NzT3JpZ2luIjpmYWxzZX0","signature":"MEUCIQCg-5zfTRhie2nyLzGzaFDyzeEXKyUOe3yS0hqyN8GBBAIgVVRYPAJI7k1Kkv8b0Xfmgd2UkKRI98Drcdnybsalp34","userHandle":"AQIDBA"},"type":"public-key"}
