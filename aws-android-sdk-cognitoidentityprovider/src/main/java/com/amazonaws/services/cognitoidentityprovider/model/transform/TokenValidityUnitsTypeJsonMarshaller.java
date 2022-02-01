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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TokenValidityUnitsType
 */
class TokenValidityUnitsTypeJsonMarshaller {

    public void marshall(TokenValidityUnitsType tokenValidityUnitsType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tokenValidityUnitsType.getAccessToken() != null) {
            String accessToken = tokenValidityUnitsType.getAccessToken();
            jsonWriter.name("AccessToken");
            jsonWriter.value(accessToken);
        }
        if (tokenValidityUnitsType.getIdToken() != null) {
            String idToken = tokenValidityUnitsType.getIdToken();
            jsonWriter.name("IdToken");
            jsonWriter.value(idToken);
        }
        if (tokenValidityUnitsType.getRefreshToken() != null) {
            String refreshToken = tokenValidityUnitsType.getRefreshToken();
            jsonWriter.name("RefreshToken");
            jsonWriter.value(refreshToken);
        }
        jsonWriter.endObject();
    }

    private static TokenValidityUnitsTypeJsonMarshaller instance;

    public static TokenValidityUnitsTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TokenValidityUnitsTypeJsonMarshaller();
        return instance;
    }
}
