/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO KafkaAction
 */
class KafkaActionJsonMarshaller {

    public void marshall(KafkaAction kafkaAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (kafkaAction.getDestinationArn() != null) {
            String destinationArn = kafkaAction.getDestinationArn();
            jsonWriter.name("destinationArn");
            jsonWriter.value(destinationArn);
        }
        if (kafkaAction.getTopic() != null) {
            String topic = kafkaAction.getTopic();
            jsonWriter.name("topic");
            jsonWriter.value(topic);
        }
        if (kafkaAction.getKey() != null) {
            String key = kafkaAction.getKey();
            jsonWriter.name("key");
            jsonWriter.value(key);
        }
        if (kafkaAction.getPartition() != null) {
            String partition = kafkaAction.getPartition();
            jsonWriter.name("partition");
            jsonWriter.value(partition);
        }
        if (kafkaAction.getClientProperties() != null) {
            java.util.Map<String, String> clientProperties = kafkaAction.getClientProperties();
            jsonWriter.name("clientProperties");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> clientPropertiesEntry : clientProperties
                    .entrySet()) {
                String clientPropertiesValue = clientPropertiesEntry.getValue();
                if (clientPropertiesValue != null) {
                    jsonWriter.name(clientPropertiesEntry.getKey());
                    jsonWriter.value(clientPropertiesValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static KafkaActionJsonMarshaller instance;

    public static KafkaActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KafkaActionJsonMarshaller();
        return instance;
    }
}
