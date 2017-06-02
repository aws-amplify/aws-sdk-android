/*
 * Copyright 2013-2017 Amazon.com, Inc. or its affiliates.
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

package com.amazonaws.mobileconnectors.cognitoauth.tokens;

import com.amazonaws.mobileconnectors.cognitoauth.util.JWTParser;

import java.util.Date;

/**
 * Represents an id-token and provides methods to read token claims.
 */
public class IdToken extends UserToken {
    private long SEC_IN_MILLSEC = 1000;

    /**
     * Create a new id token.
     * @param jwtToken Required: Valid JWT as a {@link String}.
     */
    public IdToken(String jwtToken) {
        super(jwtToken);
    }

    /**
     * Returns the id token formatted as JWT.
     * @return Id Token.
     */
    public String getJWTToken() {
        return super.getToken();
    }

    /**
     * Returns expiration of this id token.
     * @return id token expiration claim as {@link java.util.Date} in UTC.
     */
    public Date getExpiration() throws Exception {
        String claim = JWTParser.getClaim(super.getToken(), "exp");
        if (claim == null) {
            return null;
        }
        long epocTimeSec = Long.parseLong(claim);
        long epocTimeMilliSec = epocTimeSec*SEC_IN_MILLSEC;
        return new Date(epocTimeMilliSec);
    }

    /**
     * Returns "not before" claim of this id token
     * @return not before claim as {@link java.util.Date} in UTC.
     */
    public Date getNotBefore() throws Exception {
        String claim = JWTParser.getClaim(super.getToken(), "nbf");
        if (claim == null) {
            return null;
        }
        long epocTimeSec = Long.parseLong(claim);
        long epocTimeMilliSec = epocTimeSec*SEC_IN_MILLSEC;
        return new Date(epocTimeMilliSec);
    }

    /**
     * Returns "issued at" claim of this id token
     * @return issue at claim as {@link java.util.Date} in UTC.
     */
    public Date getIssuedAt() throws Exception {
        String claim = JWTParser.getClaim(super.getToken(), "iat");
        if (claim == null) {
            return null;
        }
        long epocTimeSec = Long.parseLong(claim);
        long epocTimeMilliSec = epocTimeSec*SEC_IN_MILLSEC;
        return new Date(epocTimeMilliSec);
    }

    /**
     * Returns the Cognito username set in the id token.
     * @return Username set in this Id Token.
     */
    public String getCognitoUsername() throws Exception {
        return JWTParser.getClaim(super.getToken(), "cognito:username");
    }
}
