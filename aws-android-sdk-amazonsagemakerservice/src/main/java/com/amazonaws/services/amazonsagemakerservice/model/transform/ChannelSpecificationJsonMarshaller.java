/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ChannelSpecification
 */
class ChannelSpecificationJsonMarshaller {

    public void marshall(ChannelSpecification channelSpecification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (channelSpecification.getName() != null) {
            String name = channelSpecification.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (channelSpecification.getDescription() != null) {
            String description = channelSpecification.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (channelSpecification.getIsRequired() != null) {
            Boolean isRequired = channelSpecification.getIsRequired();
            jsonWriter.name("IsRequired");
            jsonWriter.value(isRequired);
        }
        if (channelSpecification.getSupportedContentTypes() != null) {
            java.util.List<String> supportedContentTypes = channelSpecification
                    .getSupportedContentTypes();
            jsonWriter.name("SupportedContentTypes");
            jsonWriter.beginArray();
            for (String supportedContentTypesItem : supportedContentTypes) {
                if (supportedContentTypesItem != null) {
                    jsonWriter.value(supportedContentTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (channelSpecification.getSupportedCompressionTypes() != null) {
            java.util.List<String> supportedCompressionTypes = channelSpecification
                    .getSupportedCompressionTypes();
            jsonWriter.name("SupportedCompressionTypes");
            jsonWriter.beginArray();
            for (String supportedCompressionTypesItem : supportedCompressionTypes) {
                if (supportedCompressionTypesItem != null) {
                    jsonWriter.value(supportedCompressionTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (channelSpecification.getSupportedInputModes() != null) {
            java.util.List<String> supportedInputModes = channelSpecification
                    .getSupportedInputModes();
            jsonWriter.name("SupportedInputModes");
            jsonWriter.beginArray();
            for (String supportedInputModesItem : supportedInputModes) {
                if (supportedInputModesItem != null) {
                    jsonWriter.value(supportedInputModesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ChannelSpecificationJsonMarshaller instance;

    public static ChannelSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelSpecificationJsonMarshaller();
        return instance;
    }
}
