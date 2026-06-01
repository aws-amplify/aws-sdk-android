/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO NewSessionDetails
 */
class NewSessionDetailsJsonMarshaller {

    public void marshall(NewSessionDetails newSessionDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (newSessionDetails.getSupportedMessagingContentTypes() != null) {
            java.util.List<String> supportedMessagingContentTypes = newSessionDetails
                    .getSupportedMessagingContentTypes();
            jsonWriter.name("SupportedMessagingContentTypes");
            jsonWriter.beginArray();
            for (String supportedMessagingContentTypesItem : supportedMessagingContentTypes) {
                if (supportedMessagingContentTypesItem != null) {
                    jsonWriter.value(supportedMessagingContentTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (newSessionDetails.getParticipantDetails() != null) {
            ParticipantDetails participantDetails = newSessionDetails.getParticipantDetails();
            jsonWriter.name("ParticipantDetails");
            ParticipantDetailsJsonMarshaller.getInstance().marshall(participantDetails, jsonWriter);
        }
        if (newSessionDetails.getAttributes() != null) {
            java.util.Map<String, String> attributes = newSessionDetails.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> attributesEntry : attributes.entrySet()) {
                String attributesValue = attributesEntry.getValue();
                if (attributesValue != null) {
                    jsonWriter.name(attributesEntry.getKey());
                    jsonWriter.value(attributesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (newSessionDetails.getStreamingConfiguration() != null) {
            ChatStreamingConfiguration streamingConfiguration = newSessionDetails
                    .getStreamingConfiguration();
            jsonWriter.name("StreamingConfiguration");
            ChatStreamingConfigurationJsonMarshaller.getInstance().marshall(streamingConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static NewSessionDetailsJsonMarshaller instance;

    public static NewSessionDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NewSessionDetailsJsonMarshaller();
        return instance;
    }
}
