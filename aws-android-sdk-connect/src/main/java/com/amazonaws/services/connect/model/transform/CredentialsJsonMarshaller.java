/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Credentials
 */
class CredentialsJsonMarshaller {

    public void marshall(Credentials credentials, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (credentials.getAccessToken() != null) {
            String accessToken = credentials.getAccessToken();
            jsonWriter.name("AccessToken");
            jsonWriter.value(accessToken);
        }
        if (credentials.getAccessTokenExpiration() != null) {
            java.util.Date accessTokenExpiration = credentials.getAccessTokenExpiration();
            jsonWriter.name("AccessTokenExpiration");
            jsonWriter.value(accessTokenExpiration);
        }
        if (credentials.getRefreshToken() != null) {
            String refreshToken = credentials.getRefreshToken();
            jsonWriter.name("RefreshToken");
            jsonWriter.value(refreshToken);
        }
        if (credentials.getRefreshTokenExpiration() != null) {
            java.util.Date refreshTokenExpiration = credentials.getRefreshTokenExpiration();
            jsonWriter.name("RefreshTokenExpiration");
            jsonWriter.value(refreshTokenExpiration);
        }
        jsonWriter.endObject();
    }

    private static CredentialsJsonMarshaller instance;

    public static CredentialsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CredentialsJsonMarshaller();
        return instance;
    }
}
