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
 * JSON marshaller for POJO SendUsersMessageRequest
 */
class SendUsersMessageRequestJsonMarshaller {

    public void marshall(SendUsersMessageRequest sendUsersMessageRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sendUsersMessageRequest.getContext() != null) {
            java.util.Map<String, String> context = sendUsersMessageRequest.getContext();
            jsonWriter.name("Context");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> contextEntry : context.entrySet()) {
                String contextValue = contextEntry.getValue();
                if (contextValue != null) {
                    jsonWriter.name(contextEntry.getKey());
                    jsonWriter.value(contextValue);
                }
            }
            jsonWriter.endObject();
        }
        if (sendUsersMessageRequest.getMessageConfiguration() != null) {
            DirectMessageConfiguration messageConfiguration = sendUsersMessageRequest
                    .getMessageConfiguration();
            jsonWriter.name("MessageConfiguration");
            DirectMessageConfigurationJsonMarshaller.getInstance().marshall(messageConfiguration,
                    jsonWriter);
        }
        if (sendUsersMessageRequest.getTraceId() != null) {
            String traceId = sendUsersMessageRequest.getTraceId();
            jsonWriter.name("TraceId");
            jsonWriter.value(traceId);
        }
        if (sendUsersMessageRequest.getUsers() != null) {
            java.util.Map<String, EndpointSendConfiguration> users = sendUsersMessageRequest
                    .getUsers();
            jsonWriter.name("Users");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, EndpointSendConfiguration> usersEntry : users
                    .entrySet()) {
                EndpointSendConfiguration usersValue = usersEntry.getValue();
                if (usersValue != null) {
                    jsonWriter.name(usersEntry.getKey());
                    EndpointSendConfigurationJsonMarshaller.getInstance().marshall(usersValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static SendUsersMessageRequestJsonMarshaller instance;

    public static SendUsersMessageRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SendUsersMessageRequestJsonMarshaller();
        return instance;
    }
}
