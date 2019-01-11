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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EndpointUser
 */
class EndpointUserJsonMarshaller {

    public void marshall(EndpointUser endpointUser, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (endpointUser.getUserAttributes() != null) {
            java.util.Map<String, java.util.List<String>> userAttributes = endpointUser
                    .getUserAttributes();
            jsonWriter.name("UserAttributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> userAttributesEntry : userAttributes
                    .entrySet()) {
                java.util.List<String> userAttributesValue = userAttributesEntry.getValue();
                if (userAttributesValue != null) {
                    jsonWriter.name(userAttributesEntry.getKey());
                    jsonWriter.beginArray();
                    for (String userAttributesValueItem : userAttributesValue) {
                        if (userAttributesValueItem != null) {
                            jsonWriter.value(userAttributesValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        if (endpointUser.getUserId() != null) {
            String userId = endpointUser.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        jsonWriter.endObject();
    }

    private static EndpointUserJsonMarshaller instance;

    public static EndpointUserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointUserJsonMarshaller();
        return instance;
    }
}
