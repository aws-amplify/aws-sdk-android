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

/**
 * Local SDK constants.
 */

@SuppressWarnings("checkstyle:javadocmethod")
public abstract class ClientConstants {
    public static final String APP_LAST_AUTH_USER = "LastAuthUser";
    public static final String APP_LOCAL_CACHE = "CognitoIdentityProviderCache";
    public static final String APP_LOCAL_CACHE_KEY_PREFIX = "CognitoIdentityProvider";
    public static final String AUTH_RESPONSE_TYPE_CODE = "code";
    public static final String CHROME_PACKAGE = "com.android.chrome";
    public static final int CHROME_NAVIGATION_CANCELLED = 6;
    public static final String DOMAIN_PATH_OAUTH2 = "oauth2";
    public static final String DOMAIN_PATH_SIGN_IN = "authorize";
    public static final String DOMAIN_PATH_SIGN_OUT = "logout";
    public static final String DOMAIN_PATH_TOKEN_ENDPOINT = "token";
    public static final String DOMAIN_QUERY_PARAM_CLIENT_ID = "client_id";
    public static final String DOMAIN_QUERY_PARAM_CODE_CHALLENGE = "code_challenge";
    public static final String DOMAIN_QUERY_PARAM_CODE_CHALLENGE_METHOD = "code_challenge_method";
    public static final String DOMAIN_QUERY_PARAM_CODE_CHALLENGE_METHOD_SHA256 = "S256";
    public static final String DOMAIN_QUERY_PARAM_CODE_VERIFIER = "code_verifier";
    public static final String DOMAIN_QUERY_PARAM_ERROR = "error";
    public static final String DOMAIN_QUERY_PARAM_REDIRECT_URI = "redirect_uri";
    public static final String DOMAIN_QUERY_PARAM_LOGOUT_URI = "logout_uri";
    public static final String DOMAIN_QUERY_PARAM_RESPONSE_TYPE = "response_type";
    public static final String DOMAIN_QUERY_PARAM_SCOPES = "scope";
    public static final String DOMAIN_QUERY_PARAM_STATE = "state";
    public static final String DOMAIN_QUERY_PARAM_USERCONTEXTDATA = "userContextData";
    public static final String DOMAIN_QUERY_PARAM_IDENTITY_PROVIDER = "identity_provider";
    public static final String DOMAIN_QUERY_PARAM_IDP_IDENTIFIER = "idp_identifier";
    public static final String DOMAIN_SCHEME = "https";
    public static final String SESSION_TYPE_JWT = "JWT";
    public static final String TOKEN_AUTH_TYPE_CODE = "code";
    public static final String TOKEN_GRANT_TYPE = "grant_type";
    public static final String TOKEN_GRANT_TYPE_AUTH_CODE = "authorization_code";
    public static final String TOKEN_TYPE_ID = "idToken";
    public static final String TOKEN_TYPE_ACCESS = "accessToken";
    public static final String TOKEN_TYPE_REFRESH = "refreshToken";
    public static final String TOKEN_KEY_TYPE = "tokenType";
    public static final String TOKEN_KEY_SCOPES = "tokenScopes";
    public static final String HTTP_HEADER_TYPE_AUTHORIZE = "Authorization";
    public static final String HTTP_REQUEST_REFRESH_TOKEN = "refresh_token";
    public static final String HTTP_REQUEST_TYPE_POST = "POST";
    public static final String HTTP_RESPONSE_ACCESS_TOKEN = "access_token";
    public static final String HTTP_RESPONSE_ID_TOKEN = "id_token";
    public static final String HTTP_RESPONSE_INVALID_GRANT = "invalid_grant";
    public static final String HTTP_RESPONSE_REFRESH_TOKEN = "refresh_token";
    public static final String HTTP_HEADER_PROP_CONTENT_TYPE = "Content-Type";
    public static final String HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT = "application/x-www-form-urlencoded";
}
