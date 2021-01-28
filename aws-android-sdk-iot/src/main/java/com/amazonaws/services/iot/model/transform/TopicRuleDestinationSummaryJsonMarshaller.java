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
 * JSON marshaller for POJO TopicRuleDestinationSummary
 */
class TopicRuleDestinationSummaryJsonMarshaller {

    public void marshall(TopicRuleDestinationSummary topicRuleDestinationSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (topicRuleDestinationSummary.getArn() != null) {
            String arn = topicRuleDestinationSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (topicRuleDestinationSummary.getStatus() != null) {
            String status = topicRuleDestinationSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (topicRuleDestinationSummary.getCreatedAt() != null) {
            java.util.Date createdAt = topicRuleDestinationSummary.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (topicRuleDestinationSummary.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = topicRuleDestinationSummary.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (topicRuleDestinationSummary.getStatusReason() != null) {
            String statusReason = topicRuleDestinationSummary.getStatusReason();
            jsonWriter.name("statusReason");
            jsonWriter.value(statusReason);
        }
        if (topicRuleDestinationSummary.getHttpUrlSummary() != null) {
            HttpUrlDestinationSummary httpUrlSummary = topicRuleDestinationSummary
                    .getHttpUrlSummary();
            jsonWriter.name("httpUrlSummary");
            HttpUrlDestinationSummaryJsonMarshaller.getInstance().marshall(httpUrlSummary,
                    jsonWriter);
        }
        if (topicRuleDestinationSummary.getVpcDestinationSummary() != null) {
            VpcDestinationSummary vpcDestinationSummary = topicRuleDestinationSummary
                    .getVpcDestinationSummary();
            jsonWriter.name("vpcDestinationSummary");
            VpcDestinationSummaryJsonMarshaller.getInstance().marshall(vpcDestinationSummary,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TopicRuleDestinationSummaryJsonMarshaller instance;

    public static TopicRuleDestinationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TopicRuleDestinationSummaryJsonMarshaller();
        return instance;
    }
}
