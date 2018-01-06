/*
 *  Copyright 2013-2016 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoidentityprovider.util;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoInternalErrorException;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoParameterInvalidException;
import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Utility class for all operations involving secret hash.
 */
public final class CognitoSecretHash {
    private static final String HMAC_SHA_256 = "HmacSHA256";

    /**
     * Generates secret hash. Uses HMAC SHA256.
     *
     * @param userId            REQUIRED: User ID
     * @param clientId          REQUIRED: Client ID
     * @param clientSecret      REQUIRED: Client secret
     * @return  secret hash as a {@code String}, {@code null } if {@code clinetSecret if null}
     */
    public static String getSecretHash(String userId, String clientId, String clientSecret) {
        // Arguments userId and clientId have to be not-null.
        if (userId == null) {
            throw new CognitoParameterInvalidException("user ID cannot be null");
        }

        if (clientId == null) {
            throw new CognitoParameterInvalidException("client ID cannot be null");
        }

        // Return null as secret hash if clientSecret is null.
        if (clientSecret == null) {
            return null;
        }

        final SecretKeySpec signingKey = new SecretKeySpec(clientSecret.getBytes(StringUtils.UTF8),
                HMAC_SHA_256);

        try {
            final Mac mac = Mac.getInstance(HMAC_SHA_256);
            mac.init(signingKey);
            mac.update(userId.getBytes(StringUtils.UTF8));
            final byte[] rawHmac = mac.doFinal(clientId.getBytes(StringUtils.UTF8));
            return  new String(Base64.encode(rawHmac));
        } catch (final Exception e) {
            throw new CognitoInternalErrorException("errors in HMAC calculation");
        }
    }
}
