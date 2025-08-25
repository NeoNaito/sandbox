List<PublicKeyCredentialParameters> pubKeyCredParams = new ArrayList<>();
String algorithms = "-7,-257,-8";
String type = "public-key";
for (String alg : algorithms.split(",")) {
    int algInt = Integer.parseInt(alg);
    COSEAlgorithmIdentifier coseAlg = COSEAlgorithmIdentifier.create(algInt);
    pubKeyCredParams.add(new PublicKeyCredentialParameters(PublicKeyCredentialType.create(type), coseAlg));
}
