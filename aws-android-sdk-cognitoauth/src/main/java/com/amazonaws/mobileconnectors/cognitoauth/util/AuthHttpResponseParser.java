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

package com.amazonaws.mobileconnectors.cognitoauth.util;

import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthClientException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthInvalidGrantException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthInvalidParameterException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthServiceException;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.AccessToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.IdToken;
import com.amazonaws.mobileconnectors.cognitoauth.tokens.RefreshToken;
import com.amazonaws.mobileconnectors.cognitoauth.AuthUserSession;

import org.json.JSONObject;

/**
 * Helper to parse the response from users.
 */

public class AuthHttpResponseParser {

    /**
     * This is a helper class, cannot instantiate.
     */
    private AuthHttpResponseParser() {
    }

    /**
     * Parses the http response from Cognito service and extracts tokens.
     * <p>
     *     Throws {@link AuthInvalidGrantException when }
     * </p>
     * @param responseStr Required: Response from Cognito Service Token-Endpoint.
     * @return {@link AuthUserSession}.
     */
    public final static AuthUserSession parseHttpResponse(String responseStr) {
        if (responseStr == null || responseStr.isEmpty()) {
            throw new AuthInvalidParameterException(
                    "Invalid (null) response from Amazon Cognito Auth endpoint");
        }

        AccessToken accessToken = new AccessToken(null);
        IdToken idToken = new IdToken(null);
        RefreshToken refreshToken = new RefreshToken(null);

        JSONObject responseJson;
        try {
            responseJson = new JSONObject(responseStr);
            if (responseJson.has(ClientConstants.DOMAIN_QUERY_PARAM_ERROR)) {
                String errorText = responseJson.getString(ClientConstants.DOMAIN_QUERY_PARAM_ERROR);
                if (ClientConstants.HTTP_RESPONSE_INVALID_GRANT.equals(errorText)) {
                    throw new AuthInvalidGrantException(errorText);
                } else {
                    throw new AuthServiceException(errorText);
                }
            }

            if (responseJson.has(ClientConstants.HTTP_RESPONSE_ACCESS_TOKEN)) {
                accessToken = new AccessToken(responseJson.getString(ClientConstants.HTTP_RESPONSE_ACCESS_TOKEN));
            }

            if (responseJson.has(ClientConstants.HTTP_RESPONSE_ID_TOKEN)) {
                idToken = new IdToken(responseJson.getString(ClientConstants.HTTP_RESPONSE_ID_TOKEN));
            }

            if (responseJson.has(ClientConstants.HTTP_RESPONSE_REFRESH_TOKEN)) {
                refreshToken = new RefreshToken(responseJson.getString(ClientConstants.HTTP_RESPONSE_REFRESH_TOKEN));
            }
        } catch (AuthInvalidGrantException invg) {
          throw invg;
        } catch (AuthServiceException seve) {
            throw  seve;
        } catch (Exception e) {
            throw new AuthClientException(e.getMessage(), e);
        }
        return  new AuthUserSession(idToken, accessToken, refreshToken);
    }
}
