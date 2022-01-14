/*
 * Copyright 2017-2022 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.cognito.clientcontext.util;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.amazonaws.cognito.clientcontext.data.ConfigurationConstant;

import android.util.Base64;
import android.util.Log;

/**
 * Create the signature for context data. It create HMAC_SHA256 for the
 * stringified JSON payload data and then encode it in Base64. Payload contains
 * username, userpoolId and timestamp so these are already factored in the
 * generated signature.
 */
public class SignatureGenerator {
    private static final String TAG = "HMAC_SHA256_Signature";
    private static final String ALGORITHM = "HmacSHA256";

    /**
     * Generates the signature for the JSON data payload.
     *
     * @param data
     *            JSON payload for contextData.
     * @param secret
     *            secret key used for generating the signature.
     * @return signature string for the payload.
     */
    public String getSignature(String data, String secret, String version) {
        String signature = "";
        try {
            Mac sha256Hmac = Mac.getInstance(ALGORITHM);
            SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(ConfigurationConstant.DEFAULT_CHARSET), ALGORITHM);
            sha256Hmac.init(secretKey);

            byte[] versionBytes = version.getBytes(ConfigurationConstant.DEFAULT_CHARSET);
            sha256Hmac.update(versionBytes);

            byte[] dataBytes = data.getBytes(ConfigurationConstant.DEFAULT_CHARSET);
            signature = Base64.encodeToString(sha256Hmac.doFinal(dataBytes), Base64.DEFAULT);
        } catch (Exception e) {
            logWarning(e);
        }
        return signature;
    }

    private void logWarning(Exception e) {
        Log.w(TAG, "Exception while completing context data signature", e);
    }
}