// パスキー登録js
const publicKey = {
  challenge: new Uint8Array([0, 1]),
  rp: { name: "rp.name" },
  user: {
    id: new Uint8Array([1, 1, 1, 1, 1]),
    name: "name",
    displayName: "displayName"
  },
  pubKeyCredParams: [{
    type: "public-key",
    alg: -7
  }],
  excludeCredentials: [],
  authenticatorSelection: {
    authenticatorAttachment: "platform",
    requiredResidentKey: true,
    userVerification: "required"
  },
  attestation: "none",
  timeout: 60000
};
// navigator.credentials.createでパスキー生成
let credential = await navigator.credentials.create({ publicKey });
console.log('Credential Created:', credential);




// パスキー認証js
const publicKey = {
  challenge: new Uint8Array([0, 1]),
  rpId: "st.id.softbank.jp",
  timeout: 60000,
  userVerification: "required",
  allowCredentials: []
};
const credential = await navigator.credentials.get({ publicKey });
console.log("credential", credential);
