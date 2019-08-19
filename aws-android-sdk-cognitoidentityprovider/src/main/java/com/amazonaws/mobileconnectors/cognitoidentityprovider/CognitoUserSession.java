/*
 *  Copyright 2013-2019 Amazon.com,
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

package com.amazonaws.mobileconnectors.cognitoidentityprovider;

import android.util.Log;

import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoAccessToken;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoIdToken;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.tokens.CognitoRefreshToken;
import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoIdentityProviderClientConfig;

import java.util.Date;
import java.util.Objects;

/**
 * This wraps all Cognito tokens for a user.
 */
public class CognitoUserSession {
    private static final int SECS_CONVERSION = 1000;

    private static final String TAG = CognitoUserSession.class.getSimpleName();

    /**
     * Cognito identity token.
     */
    private final CognitoIdToken idToken;

    /**
     * Cognito access token.
     */
    private final CognitoAccessToken accessToken;

    /**
     * Cognito refresh token.
     */
    private final CognitoRefreshToken refreshToken;

    /**
     * Constructs a new Cognito session.
     *
     * @param idToken               REQUIRED: ID Token for this session.
     * @param accessToken           REQUIRED: Access Token for this session.
     * @param refreshToken          REQUIRED: Refresh Token.
     */
    public CognitoUserSession(CognitoIdToken idToken, CognitoAccessToken accessToken, CognitoRefreshToken refreshToken) {
        this.idToken = idToken;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    /**
     * Returns ID Token.
     *
     * @return  token as a String.
     */
    public CognitoIdToken getIdToken() {
        return idToken;
    }

    /**
     * Returns Access Token.
     *
     * @return token as a String.
     */
    public CognitoAccessToken getAccessToken() {
        return accessToken;
    }

    /**
     * Returns Refresh Token.
     *
     * @return token as a String.
     */
    public CognitoRefreshToken getRefreshToken() {
        return refreshToken;
    }

    /**
     * Returns if the access and id tokens have not expired.
     *
     * @return boolean to indicate if the access and id tokens have not expired.
     */
    public boolean isValid() {
        final Date currentTimeStamp = new Date();

        try {
            if (idToken == null) {
                Log.w(TAG, "CognitoUserSession is not valid because idToken is null.");
                return false;
            }

            if (accessToken == null) {
                Log.w(TAG, "CognitoUserSession is not valid because accessToken is null.");
                return false;
            }

            return (currentTimeStamp.before(idToken.getExpiration())
                    & currentTimeStamp.before(accessToken.getExpiration()));
        } catch (final Exception e) {
            return false;
        }
    }

    /**
     * Returns true if this session is valid for the threshold set in
     * {@link CognitoIdentityProviderClientConfig#getRefreshThreshold}.
     *
     * Checks for the following conditions to determine if the session is valid:
     * 1) Existence of an idToken
     * 2) Existence of an accessToken
     * 3) idToken is not expired
     * 4) accessToken is not expired
     *
     * @return boolean to indicate if the session is valid for at-least
     * {@link CognitoIdentityProviderClientConfig#getRefreshThreshold} seconds.
     */
    public boolean isValidForThreshold() {
        try {
            if (idToken == null) {
                Log.w(TAG, "CognitoUserSession is not valid because idToken is null.");
                return false;
            }

            if (accessToken == null) {
                Log.w(TAG, "CognitoUserSession is not valid because accessToken is null.");
                return false;
            }

            final long currentTime = System.currentTimeMillis()
                    - SDKGlobalConfiguration.getGlobalTimeOffset() * SECS_CONVERSION;
            final long idTokenExpiresInMilliSeconds = idToken.getExpiration().getTime() - currentTime;
            final long accessTokenExpiresInMilliSeconds = accessToken.getExpiration().getTime() - currentTime;
            return (idTokenExpiresInMilliSeconds > CognitoIdentityProviderClientConfig.getRefreshThreshold()) &&
                    (accessTokenExpiresInMilliSeconds > CognitoIdentityProviderClientConfig.getRefreshThreshold());
        } catch (final Exception e) {
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
