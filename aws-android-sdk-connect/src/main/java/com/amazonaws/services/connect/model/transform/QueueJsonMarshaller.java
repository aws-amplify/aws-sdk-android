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
 * JSON marshaller for POJO Queue
 */
class QueueJsonMarshaller {

    public void marshall(Queue queue, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (queue.getName() != null) {
            String name = queue.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (queue.getQueueArn() != null) {
            String queueArn = queue.getQueueArn();
            jsonWriter.name("QueueArn");
            jsonWriter.value(queueArn);
        }
        if (queue.getQueueId() != null) {
            String queueId = queue.getQueueId();
            jsonWriter.name("QueueId");
            jsonWriter.value(queueId);
        }
        if (queue.getDescription() != null) {
            String description = queue.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (queue.getOutboundCallerConfig() != null) {
            OutboundCallerConfig outboundCallerConfig = queue.getOutboundCallerConfig();
            jsonWriter.name("OutboundCallerConfig");
            OutboundCallerConfigJsonMarshaller.getInstance().marshall(outboundCallerConfig,
                    jsonWriter);
        }
        if (queue.getHoursOfOperationId() != null) {
            String hoursOfOperationId = queue.getHoursOfOperationId();
            jsonWriter.name("HoursOfOperationId");
            jsonWriter.value(hoursOfOperationId);
        }
        if (queue.getMaxContacts() != null) {
            Integer maxContacts = queue.getMaxContacts();
            jsonWriter.name("MaxContacts");
            jsonWriter.value(maxContacts);
        }
        if (queue.getStatus() != null) {
            String status = queue.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (queue.getTags() != null) {
            java.util.Map<String, String> tags = queue.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static QueueJsonMarshaller instance;

    public static QueueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueueJsonMarshaller();
        return instance;
    }
}
