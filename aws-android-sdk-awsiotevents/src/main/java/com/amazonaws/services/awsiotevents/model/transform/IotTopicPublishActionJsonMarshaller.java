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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IotTopicPublishAction
 */
class IotTopicPublishActionJsonMarshaller {

    public void marshall(IotTopicPublishAction iotTopicPublishAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (iotTopicPublishAction.getMqttTopic() != null) {
            String mqttTopic = iotTopicPublishAction.getMqttTopic();
            jsonWriter.name("mqttTopic");
            jsonWriter.value(mqttTopic);
        }
        if (iotTopicPublishAction.getPayload() != null) {
            Payload payload = iotTopicPublishAction.getPayload();
            jsonWriter.name("payload");
            PayloadJsonMarshaller.getInstance().marshall(payload, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static IotTopicPublishActionJsonMarshaller instance;

    public static IotTopicPublishActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IotTopicPublishActionJsonMarshaller();
        return instance;
    }
}
