/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO RoutingProfileQueueConfigSummary
 */
class RoutingProfileQueueConfigSummaryJsonMarshaller {

    public void marshall(RoutingProfileQueueConfigSummary routingProfileQueueConfigSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (routingProfileQueueConfigSummary.getQueueId() != null) {
            String queueId = routingProfileQueueConfigSummary.getQueueId();
            jsonWriter.name("QueueId");
            jsonWriter.value(queueId);
        }
        if (routingProfileQueueConfigSummary.getQueueArn() != null) {
            String queueArn = routingProfileQueueConfigSummary.getQueueArn();
            jsonWriter.name("QueueArn");
            jsonWriter.value(queueArn);
        }
        if (routingProfileQueueConfigSummary.getQueueName() != null) {
            String queueName = routingProfileQueueConfigSummary.getQueueName();
            jsonWriter.name("QueueName");
            jsonWriter.value(queueName);
        }
        if (routingProfileQueueConfigSummary.getPriority() != null) {
            Integer priority = routingProfileQueueConfigSummary.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (routingProfileQueueConfigSummary.getDelay() != null) {
            Integer delay = routingProfileQueueConfigSummary.getDelay();
            jsonWriter.name("Delay");
            jsonWriter.value(delay);
        }
        if (routingProfileQueueConfigSummary.getChannel() != null) {
            String channel = routingProfileQueueConfigSummary.getChannel();
            jsonWriter.name("Channel");
            jsonWriter.value(channel);
        }
        jsonWriter.endObject();
    }

    private static RoutingProfileQueueConfigSummaryJsonMarshaller instance;

    public static RoutingProfileQueueConfigSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RoutingProfileQueueConfigSummaryJsonMarshaller();
        return instance;
    }
}
