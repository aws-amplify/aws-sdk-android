/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MqttHeaders
 */
class MqttHeadersJsonMarshaller {

    public void marshall(MqttHeaders mqttHeaders, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mqttHeaders.getPayloadFormatIndicator() != null) {
            String payloadFormatIndicator = mqttHeaders.getPayloadFormatIndicator();
            jsonWriter.name("payloadFormatIndicator");
            jsonWriter.value(payloadFormatIndicator);
        }
        if (mqttHeaders.getContentType() != null) {
            String contentType = mqttHeaders.getContentType();
            jsonWriter.name("contentType");
            jsonWriter.value(contentType);
        }
        if (mqttHeaders.getResponseTopic() != null) {
            String responseTopic = mqttHeaders.getResponseTopic();
            jsonWriter.name("responseTopic");
            jsonWriter.value(responseTopic);
        }
        if (mqttHeaders.getCorrelationData() != null) {
            String correlationData = mqttHeaders.getCorrelationData();
            jsonWriter.name("correlationData");
            jsonWriter.value(correlationData);
        }
        if (mqttHeaders.getMessageExpiry() != null) {
            String messageExpiry = mqttHeaders.getMessageExpiry();
            jsonWriter.name("messageExpiry");
            jsonWriter.value(messageExpiry);
        }
        if (mqttHeaders.getUserProperties() != null) {
            java.util.List<UserProperty> userProperties = mqttHeaders.getUserProperties();
            jsonWriter.name("userProperties");
            jsonWriter.beginArray();
            for (UserProperty userPropertiesItem : userProperties) {
                if (userPropertiesItem != null) {
                    UserPropertyJsonMarshaller.getInstance().marshall(userPropertiesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MqttHeadersJsonMarshaller instance;

    public static MqttHeadersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MqttHeadersJsonMarshaller();
        return instance;
    }
}
