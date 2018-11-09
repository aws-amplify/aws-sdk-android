/*
 * Copyright 2018-2018 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobile.client.results;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoJWTParser;

import java.util.Date;

public class Token {

    public static final int MILLIS_PER_SEC = 1000;
    private final String token;

    public Token(final String token) {
        this.token = token;
    }

    /**
     * Returns the id token formatted as JWT.
     *
     * @return JWT as a {@link String}.
     */
    public String getTokenString() {
        return token;
    }

    /**
     * Returns expiration of this id token.
     *
     * @return id token expiration claim as {@link java.util.Date} in UTC.
     */
    public Date getExpiration() {
        return getClaimDate("exp");
    }

    /**
     * Returns "not before" claim of this id token
     *
     * @return not before claim as {@link java.util.Date} in UTC.
     */
    public Date getNotBefore() {
        return getClaimDate("nbf");
    }

    /**
     * Returns "issued at" claim of this id token
     *
     * @return issue at claim as {@link java.util.Date} in UTC.
     */
    public Date getIssuedAt() {
        return getClaimDate("iat");
    }

    Date getClaimDate(final String claimStr) {
        try {
            final String claim = CognitoJWTParser.getClaim(token, claimStr);
            if (claim == null) {
                return null;
            }
            final long epocTimeSec = Long.parseLong(claim);
            final long epocTimeMilliSec = epocTimeSec * MILLIS_PER_SEC;
            return new Date(epocTimeMilliSec);
        } catch (final Exception e) {
            throw new RuntimeException("Failed to get claim from token", e);
        }
    }

    /**
     * Returns the claim if found in the token, otherwise throws
     * @param claim the name of the claim
     * @return value of the claim from the token
     */
    public String getClaim(final String claim) {
        return CognitoJWTParser.getClaim(token, claim);
    }
}
