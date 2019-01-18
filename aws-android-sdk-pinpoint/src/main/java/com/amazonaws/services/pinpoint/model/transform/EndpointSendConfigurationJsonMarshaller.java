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
 * JSON marshaller for POJO EndpointSendConfiguration
 */
class EndpointSendConfigurationJsonMarshaller {

    public void marshall(EndpointSendConfiguration endpointSendConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (endpointSendConfiguration.getBodyOverride() != null) {
            String bodyOverride = endpointSendConfiguration.getBodyOverride();
            jsonWriter.name("BodyOverride");
            jsonWriter.value(bodyOverride);
        }
        if (endpointSendConfiguration.getContext() != null) {
            java.util.Map<String, String> context = endpointSendConfiguration.getContext();
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
        if (endpointSendConfiguration.getRawContent() != null) {
            String rawContent = endpointSendConfiguration.getRawContent();
            jsonWriter.name("RawContent");
            jsonWriter.value(rawContent);
        }
        if (endpointSendConfiguration.getSubstitutions() != null) {
            java.util.Map<String, java.util.List<String>> substitutions = endpointSendConfiguration
                    .getSubstitutions();
            jsonWriter.name("Substitutions");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> substitutionsEntry : substitutions
                    .entrySet()) {
                java.util.List<String> substitutionsValue = substitutionsEntry.getValue();
                if (substitutionsValue != null) {
                    jsonWriter.name(substitutionsEntry.getKey());
                    jsonWriter.beginArray();
                    for (String substitutionsValueItem : substitutionsValue) {
                        if (substitutionsValueItem != null) {
                            jsonWriter.value(substitutionsValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        if (endpointSendConfiguration.getTitleOverride() != null) {
            String titleOverride = endpointSendConfiguration.getTitleOverride();
            jsonWriter.name("TitleOverride");
            jsonWriter.value(titleOverride);
        }
        jsonWriter.endObject();
    }

    private static EndpointSendConfigurationJsonMarshaller instance;

    public static EndpointSendConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointSendConfigurationJsonMarshaller();
        return instance;
    }
}
