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
 * JSON marshaller for POJO TopicRuleDestination
 */
class TopicRuleDestinationJsonMarshaller {

    public void marshall(TopicRuleDestination topicRuleDestination, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (topicRuleDestination.getArn() != null) {
            String arn = topicRuleDestination.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (topicRuleDestination.getStatus() != null) {
            String status = topicRuleDestination.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (topicRuleDestination.getCreatedAt() != null) {
            java.util.Date createdAt = topicRuleDestination.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (topicRuleDestination.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = topicRuleDestination.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (topicRuleDestination.getStatusReason() != null) {
            String statusReason = topicRuleDestination.getStatusReason();
            jsonWriter.name("statusReason");
            jsonWriter.value(statusReason);
        }
        if (topicRuleDestination.getHttpUrlProperties() != null) {
            HttpUrlDestinationProperties httpUrlProperties = topicRuleDestination
                    .getHttpUrlProperties();
            jsonWriter.name("httpUrlProperties");
            HttpUrlDestinationPropertiesJsonMarshaller.getInstance().marshall(httpUrlProperties,
                    jsonWriter);
        }
        if (topicRuleDestination.getVpcProperties() != null) {
            VpcDestinationProperties vpcProperties = topicRuleDestination.getVpcProperties();
            jsonWriter.name("vpcProperties");
            VpcDestinationPropertiesJsonMarshaller.getInstance()
                    .marshall(vpcProperties, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TopicRuleDestinationJsonMarshaller instance;

    public static TopicRuleDestinationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TopicRuleDestinationJsonMarshaller();
        return instance;
    }
}
