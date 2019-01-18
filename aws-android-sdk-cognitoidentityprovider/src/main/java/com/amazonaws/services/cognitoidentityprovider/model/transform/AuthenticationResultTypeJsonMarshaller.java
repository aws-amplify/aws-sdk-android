/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AuthenticationResultType
 */
class AuthenticationResultTypeJsonMarshaller {

    public void marshall(AuthenticationResultType authenticationResultType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (authenticationResultType.getAccessToken() != null) {
            String accessToken = authenticationResultType.getAccessToken();
            jsonWriter.name("AccessToken");
            jsonWriter.value(accessToken);
        }
        if (authenticationResultType.getExpiresIn() != null) {
            Integer expiresIn = authenticationResultType.getExpiresIn();
            jsonWriter.name("ExpiresIn");
            jsonWriter.value(expiresIn);
        }
        if (authenticationResultType.getTokenType() != null) {
            String tokenType = authenticationResultType.getTokenType();
            jsonWriter.name("TokenType");
            jsonWriter.value(tokenType);
        }
        if (authenticationResultType.getRefreshToken() != null) {
            String refreshToken = authenticationResultType.getRefreshToken();
            jsonWriter.name("RefreshToken");
            jsonWriter.value(refreshToken);
        }
        if (authenticationResultType.getIdToken() != null) {
            String idToken = authenticationResultType.getIdToken();
            jsonWriter.name("IdToken");
            jsonWriter.value(idToken);
        }
        if (authenticationResultType.getNewDeviceMetadata() != null) {
            NewDeviceMetadataType newDeviceMetadata = authenticationResultType
                    .getNewDeviceMetadata();
            jsonWriter.name("NewDeviceMetadata");
            NewDeviceMetadataTypeJsonMarshaller.getInstance().marshall(newDeviceMetadata,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AuthenticationResultTypeJsonMarshaller instance;

    public static AuthenticationResultTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthenticationResultTypeJsonMarshaller();
        return instance;
    }
}
