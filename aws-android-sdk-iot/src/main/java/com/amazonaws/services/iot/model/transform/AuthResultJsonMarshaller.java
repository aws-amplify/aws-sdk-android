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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AuthResult
 */
class AuthResultJsonMarshaller {

    public void marshall(AuthResult authResult, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (authResult.getAuthInfo() != null) {
            AuthInfo authInfo = authResult.getAuthInfo();
            jsonWriter.name("authInfo");
            AuthInfoJsonMarshaller.getInstance().marshall(authInfo, jsonWriter);
        }
        if (authResult.getAllowed() != null) {
            Allowed allowed = authResult.getAllowed();
            jsonWriter.name("allowed");
            AllowedJsonMarshaller.getInstance().marshall(allowed, jsonWriter);
        }
        if (authResult.getDenied() != null) {
            Denied denied = authResult.getDenied();
            jsonWriter.name("denied");
            DeniedJsonMarshaller.getInstance().marshall(denied, jsonWriter);
        }
        if (authResult.getAuthDecision() != null) {
            String authDecision = authResult.getAuthDecision();
            jsonWriter.name("authDecision");
            jsonWriter.value(authDecision);
        }
        if (authResult.getMissingContextValues() != null) {
            java.util.List<String> missingContextValues = authResult.getMissingContextValues();
            jsonWriter.name("missingContextValues");
            jsonWriter.beginArray();
            for (String missingContextValuesItem : missingContextValues) {
                if (missingContextValuesItem != null) {
                    jsonWriter.value(missingContextValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AuthResultJsonMarshaller instance;

    public static AuthResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthResultJsonMarshaller();
        return instance;
    }
}
