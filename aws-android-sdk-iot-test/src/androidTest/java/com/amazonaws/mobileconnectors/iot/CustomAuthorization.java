/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.mobileconnectors.iot.IotClient.KeysAndCertificateInfo;
import com.amazonaws.util.Base64;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;

final class CustomAuthorization {
    private static final String CUSTOM_AUTHORIZER_NAME = "customAuthorizer";

    private final String tokenKeyName;
    private final String tokenValue;
    private final String tokenSignature;
    private final String customAuthorizerName;
    private final String customAuthorizerLambdaArn;

    private CustomAuthorization(
            String tokenKeyName,
            String tokenValue,
            String tokenSignature,
            String customAuthorizerName,
            String customAuthorizerLambdaArn) {
        this.tokenKeyName = tokenKeyName;
        this.tokenValue = tokenValue;
        this.tokenSignature = tokenSignature;
        this.customAuthorizerName = customAuthorizerName;
        this.customAuthorizerLambdaArn = customAuthorizerLambdaArn;
    }

    static CustomAuthorization from(JSONObject iotPackageConfiguration, KeysAndCertificateInfo keysAndCertificateInfo) {
        String tokenKeyName = extractString(iotPackageConfiguration, ConfigKey.CUSTOM_AUTHORIZER_TOKEN_KEY_NAME);
        String tokenValue = extractString(iotPackageConfiguration, ConfigKey.CUSTOM_AUTHORIZER_TOKEN_VALUE);
        PrivateKeyReader reader = new PrivateKeyReader(keysAndCertificateInfo.getPrivateKey());
        PrivateKey privateKey;
        try {
            privateKey = reader.getPrivateKey();
        }  catch (IOException | InvalidKeySpecException parseFailure) {
            throw new RuntimeException(parseFailure);
        }
        String tokenSignature = SHA256withRSASignature.sign(tokenValue, privateKey);
        String customAuthorizerLambdaArn =
            extractString(iotPackageConfiguration, ConfigKey.CUSTOM_AUTHORIZER_LAMBDA_ARN);

        return new CustomAuthorization(
            tokenKeyName,
            tokenValue,
            tokenSignature,
            CUSTOM_AUTHORIZER_NAME,
            customAuthorizerLambdaArn
        );
    }

    private static String extractString(JSONObject configuration, ConfigKey key) {
        try {
            return configuration.getString(key.toString());
        } catch (JSONException extractionFailure) {
            throw new RuntimeException(extractionFailure);
        }
    }

    String getTokenKeyName() {
        return tokenKeyName;
    }

    String getTokenValue() {
        return tokenValue;
    }

    String getTokenSignature() {
        return tokenSignature;
    }

    String getCustomAuthorizerName() {
        return customAuthorizerName;
    }

    String getCustomAuthorizerLamdbaArn() {
        return customAuthorizerLambdaArn;
    }

    static final class SHA256withRSASignature {
        private SHA256withRSASignature() {}

       static String sign(String token, PrivateKey privateKey) {
            final Signature signature;
            try {
                signature = Signature.getInstance("SHA256withRSA");
                signature.initSign(privateKey);
                signature.update(token.getBytes(StandardCharsets.UTF_8));
                return Base64.encodeAsString(signature.sign());
            } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException signatureFailure) {
                throw new RuntimeException(signatureFailure);
            }
        }
    }
}
