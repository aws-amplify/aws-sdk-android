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
 * JSON marshaller for POJO MessageRequest
 */
class MessageRequestJsonMarshaller {

    public void marshall(MessageRequest messageRequest, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (messageRequest.getAddresses() != null) {
            java.util.Map<String, AddressConfiguration> addresses = messageRequest.getAddresses();
            jsonWriter.name("Addresses");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AddressConfiguration> addressesEntry : addresses
                    .entrySet()) {
                AddressConfiguration addressesValue = addressesEntry.getValue();
                if (addressesValue != null) {
                    jsonWriter.name(addressesEntry.getKey());
                    AddressConfigurationJsonMarshaller.getInstance().marshall(addressesValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (messageRequest.getContext() != null) {
            java.util.Map<String, String> context = messageRequest.getContext();
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
        if (messageRequest.getEndpoints() != null) {
            java.util.Map<String, EndpointSendConfiguration> endpoints = messageRequest
                    .getEndpoints();
            jsonWriter.name("Endpoints");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, EndpointSendConfiguration> endpointsEntry : endpoints
                    .entrySet()) {
                EndpointSendConfiguration endpointsValue = endpointsEntry.getValue();
                if (endpointsValue != null) {
                    jsonWriter.name(endpointsEntry.getKey());
                    EndpointSendConfigurationJsonMarshaller.getInstance().marshall(endpointsValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (messageRequest.getMessageConfiguration() != null) {
            DirectMessageConfiguration messageConfiguration = messageRequest
                    .getMessageConfiguration();
            jsonWriter.name("MessageConfiguration");
            DirectMessageConfigurationJsonMarshaller.getInstance().marshall(messageConfiguration,
                    jsonWriter);
        }
        if (messageRequest.getTraceId() != null) {
            String traceId = messageRequest.getTraceId();
            jsonWriter.name("TraceId");
            jsonWriter.value(traceId);
        }
        jsonWriter.endObject();
    }

    private static MessageRequestJsonMarshaller instance;

    public static MessageRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MessageRequestJsonMarshaller();
        return instance;
    }
}
