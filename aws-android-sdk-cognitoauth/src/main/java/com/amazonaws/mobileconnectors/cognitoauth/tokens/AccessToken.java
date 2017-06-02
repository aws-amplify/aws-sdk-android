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
 * Represents a access token and provides methods to read token claims.
 */

public class AccessToken extends UserToken {
    private long SEC_IN_MILLSEC = 1000;

    /**
     * Creates a new access token.
     * @param jwtToken Required: Valid JWT as a {@link String}.
     */
    public AccessToken(final String jwtToken) {
        super(jwtToken);
    }

    /**
     * Returns the access token formatted as JWT.
     * @return Access Token as a {@link String}.
     */
    public String getJWTToken() {
        return super.getToken();
    }

    /**
     * Returns expiration of this token.
     * <p>Parses payload of the JWT to read the expiry.</p>
     * @return access token expiration in UTC as java.util.Date object.
     */
    public Date getExpiration() throws Exception {
        try {
            String claim = JWTParser.getClaim(super.getToken(), "exp");
            if (claim == null) {
                return null;
            }
            long epocTimeSec = Long.parseLong(claim);
            long epocTimeMilliSec = epocTimeSec * SEC_IN_MILLSEC;
            return new Date(epocTimeMilliSec);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Returns the username set in the access token.
     * @return Username.
     */
    public String getUsername() throws Exception {
        return JWTParser.getClaim(super.getToken(), "username");
    }
}
