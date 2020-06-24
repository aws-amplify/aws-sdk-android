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

import org.json.JSONException;
import org.json.JSONObject;

final class ConnectionParams {
    private final String tokenKeyName;
    private final String token;
    private final String tokenSignature;
    private final String customAuthorizerName;

    ConnectionParams(
            final String tokenKeyName,
            final String token,
            final String tokenSignature,
            final String customAuthorizerName) {
        this.tokenKeyName = tokenKeyName;
        this.token = token;
        this.tokenSignature = tokenSignature;
        this.customAuthorizerName = customAuthorizerName;
    }

    String getTokenKeyName() {
        return tokenKeyName;
    }

    String getToken() {
        return token;
    }

    String getTokenSignature() {
        return tokenSignature;
    }

    public String getCustomAuthorizerName() {
        return customAuthorizerName;
    }

    static ConnectionParams fromPackageConfig(JSONObject config) throws JSONException {
        return new ConnectionParams(
            config.getString(ConfigKey.TOKEN_KEY_NAME.toString()),
            config.getString(ConfigKey.TOKEN.toString()),
            config.getString(ConfigKey.TOKEN_SIGNATURE.toString()),
            config.getString(ConfigKey.CUSTOM_AUTHORIZER_NAME.toString())
        );
    }
}
