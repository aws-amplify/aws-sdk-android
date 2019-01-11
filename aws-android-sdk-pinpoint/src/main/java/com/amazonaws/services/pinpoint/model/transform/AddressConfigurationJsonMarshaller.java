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
 * JSON marshaller for POJO AddressConfiguration
 */
class AddressConfigurationJsonMarshaller {

    public void marshall(AddressConfiguration addressConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (addressConfiguration.getBodyOverride() != null) {
            String bodyOverride = addressConfiguration.getBodyOverride();
            jsonWriter.name("BodyOverride");
            jsonWriter.value(bodyOverride);
        }
        if (addressConfiguration.getChannelType() != null) {
            String channelType = addressConfiguration.getChannelType();
            jsonWriter.name("ChannelType");
            jsonWriter.value(channelType);
        }
        if (addressConfiguration.getContext() != null) {
            java.util.Map<String, String> context = addressConfiguration.getContext();
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
        if (addressConfiguration.getRawContent() != null) {
            String rawContent = addressConfiguration.getRawContent();
            jsonWriter.name("RawContent");
            jsonWriter.value(rawContent);
        }
        if (addressConfiguration.getSubstitutions() != null) {
            java.util.Map<String, java.util.List<String>> substitutions = addressConfiguration
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
        if (addressConfiguration.getTitleOverride() != null) {
            String titleOverride = addressConfiguration.getTitleOverride();
            jsonWriter.name("TitleOverride");
            jsonWriter.value(titleOverride);
        }
        jsonWriter.endObject();
    }

    private static AddressConfigurationJsonMarshaller instance;

    public static AddressConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AddressConfigurationJsonMarshaller();
        return instance;
    }
}
