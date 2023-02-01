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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MqttHeaders
 */
class MqttHeadersJsonUnmarshaller implements Unmarshaller<MqttHeaders, JsonUnmarshallerContext> {

    public MqttHeaders unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MqttHeaders mqttHeaders = new MqttHeaders();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("payloadFormatIndicator")) {
                mqttHeaders.setPayloadFormatIndicator(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("contentType")) {
                mqttHeaders.setContentType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("responseTopic")) {
                mqttHeaders.setResponseTopic(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("correlationData")) {
                mqttHeaders.setCorrelationData(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("messageExpiry")) {
                mqttHeaders.setMessageExpiry(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("userProperties")) {
                mqttHeaders.setUserProperties(new ListUnmarshaller<UserProperty>(
                        UserPropertyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mqttHeaders;
    }

    private static MqttHeadersJsonUnmarshaller instance;

    public static MqttHeadersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MqttHeadersJsonUnmarshaller();
        return instance;
    }
}
