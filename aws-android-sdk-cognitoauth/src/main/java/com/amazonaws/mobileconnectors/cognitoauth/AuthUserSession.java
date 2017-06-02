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

package com.amazonaws.mobileconnectors.cognitoauth;

import com.amazonaws.mobileconnectors.cognitoauth.tokens.AccessToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.IdToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.RefreshToken;
import com.amazonaws.mobileconnectors.cognitoauth.util.AuthClientConfig;

import java.util.Date;

/**
 * Encapsulates all Cognito tokens for a user.
 */
public class AuthUserSession {

    /**
     * Cognito identity token.
     */
    private IdToken idToken;

    /**
     * Cognito access token.
     */
    private AccessToken accessToken;

    /**
     * Cognito refresh token.
     */
    private RefreshToken refreshToken;

    /**
     * Constructs a new Cognito session.
     * @param idToken Required: ID Token for this session.
     * @param accessToken Required: Access Token for this session.
     * @param refreshToken Required: Refresh Token.
     */
    public AuthUserSession(final IdToken idToken,
                           final AccessToken accessToken,
                           final RefreshToken refreshToken) {
        this.idToken = idToken;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    /**
     * Returns ID Token.
     * @return  token as a String.
     */
    public IdToken getIdToken() {
        return idToken;
    }

    /**
     * Returns Access Token.
     * @return token as a String.
     */
    public AccessToken getAccessToken() {
        return accessToken;
    }

    /**
     * Returns Refresh Token.
     * @return token as a String.
     */
    public RefreshToken getRefreshToken() {
        return refreshToken;
    }

    /**
     * Returns if the access and id tokens have not expired.
     * @return boolean to indicate if the access and id tokens have not expired.
     */
    public boolean isValid() {
        if (accessToken == null || accessToken.getJWTToken() == null) {
            return false;
        }
        try {
            Date currentTimeStamp = new Date();
            return (currentTimeStamp.before(accessToken.getExpiration()));
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Returns true if this session for the threshold set in
     * {@link AuthClientConfig#refreshThreshold}.
     * @return boolean to indicate if the session is valid for atleast
     * {@link AuthClientConfig#refreshThreshold} seconds.
     */
    public boolean isValidForThreshold() {

        if (accessToken == null) {
            return false;
        }

        if (accessToken.getJWTToken() == null) {
            return false;
        }

        try {
            long currentTime = System.currentTimeMillis();
            long expiresInMilliSeconds = accessToken.getExpiration().getTime() - currentTime;
            return (expiresInMilliSeconds > AuthClientConfig.getRefreshThreshold());
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Returns username contained in this session.
     * <p>
     *     Reads the username from Access Tokens.
     *     Returns null on Exceptions - This would mean that the contained tokens are not parsable
     *     and hence are not valid.
     * </p>
     * @return Username of the user to whom these tokens belong.
     */
    public String getUsername() {
        if (this.accessToken != null) {
            try {
                return this.accessToken.getUsername();
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
