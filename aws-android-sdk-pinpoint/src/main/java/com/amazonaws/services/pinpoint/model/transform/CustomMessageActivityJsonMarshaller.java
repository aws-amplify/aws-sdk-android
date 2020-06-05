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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CustomMessageActivity
 */
class CustomMessageActivityJsonMarshaller {

    public void marshall(CustomMessageActivity customMessageActivity, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (customMessageActivity.getDeliveryUri() != null) {
            String deliveryUri = customMessageActivity.getDeliveryUri();
            jsonWriter.name("DeliveryUri");
            jsonWriter.value(deliveryUri);
        }
        if (customMessageActivity.getEndpointTypes() != null) {
            java.util.List<String> endpointTypes = customMessageActivity.getEndpointTypes();
            jsonWriter.name("EndpointTypes");
            jsonWriter.beginArray();
            for (String endpointTypesItem : endpointTypes) {
                if (endpointTypesItem != null) {
                    jsonWriter.value(endpointTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (customMessageActivity.getMessageConfig() != null) {
            JourneyCustomMessage messageConfig = customMessageActivity.getMessageConfig();
            jsonWriter.name("MessageConfig");
            JourneyCustomMessageJsonMarshaller.getInstance().marshall(messageConfig, jsonWriter);
        }
        if (customMessageActivity.getNextActivity() != null) {
            String nextActivity = customMessageActivity.getNextActivity();
            jsonWriter.name("NextActivity");
            jsonWriter.value(nextActivity);
        }
        if (customMessageActivity.getTemplateName() != null) {
            String templateName = customMessageActivity.getTemplateName();
            jsonWriter.name("TemplateName");
            jsonWriter.value(templateName);
        }
        if (customMessageActivity.getTemplateVersion() != null) {
            String templateVersion = customMessageActivity.getTemplateVersion();
            jsonWriter.name("TemplateVersion");
            jsonWriter.value(templateVersion);
        }
        jsonWriter.endObject();
    }

    private static CustomMessageActivityJsonMarshaller instance;

    public static CustomMessageActivityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomMessageActivityJsonMarshaller();
        return instance;
    }
}
