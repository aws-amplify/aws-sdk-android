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
 * JSON marshaller for POJO AuthInfo
 */
class AuthInfoJsonMarshaller {

    public void marshall(AuthInfo authInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (authInfo.getActionType() != null) {
            String actionType = authInfo.getActionType();
            jsonWriter.name("actionType");
            jsonWriter.value(actionType);
        }
        if (authInfo.getResources() != null) {
            java.util.List<String> resources = authInfo.getResources();
            jsonWriter.name("resources");
            jsonWriter.beginArray();
            for (String resourcesItem : resources) {
                if (resourcesItem != null) {
                    jsonWriter.value(resourcesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AuthInfoJsonMarshaller instance;

    public static AuthInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthInfoJsonMarshaller();
        return instance;
    }
}
