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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FlowLog
 */
class FlowLogJsonMarshaller {

    public void marshall(FlowLog flowLog, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (flowLog.getCreationTime() != null) {
            java.util.Date creationTime = flowLog.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (flowLog.getDeliverLogsErrorMessage() != null) {
            String deliverLogsErrorMessage = flowLog.getDeliverLogsErrorMessage();
            jsonWriter.name("DeliverLogsErrorMessage");
            jsonWriter.value(deliverLogsErrorMessage);
        }
        if (flowLog.getDeliverLogsPermissionArn() != null) {
            String deliverLogsPermissionArn = flowLog.getDeliverLogsPermissionArn();
            jsonWriter.name("DeliverLogsPermissionArn");
            jsonWriter.value(deliverLogsPermissionArn);
        }
        if (flowLog.getDeliverLogsStatus() != null) {
            String deliverLogsStatus = flowLog.getDeliverLogsStatus();
            jsonWriter.name("DeliverLogsStatus");
            jsonWriter.value(deliverLogsStatus);
        }
        if (flowLog.getFlowLogId() != null) {
            String flowLogId = flowLog.getFlowLogId();
            jsonWriter.name("FlowLogId");
            jsonWriter.value(flowLogId);
        }
        if (flowLog.getFlowLogStatus() != null) {
            String flowLogStatus = flowLog.getFlowLogStatus();
            jsonWriter.name("FlowLogStatus");
            jsonWriter.value(flowLogStatus);
        }
        if (flowLog.getLogGroupName() != null) {
            String logGroupName = flowLog.getLogGroupName();
            jsonWriter.name("LogGroupName");
            jsonWriter.value(logGroupName);
        }
        if (flowLog.getResourceId() != null) {
            String resourceId = flowLog.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (flowLog.getTrafficType() != null) {
            String trafficType = flowLog.getTrafficType();
            jsonWriter.name("TrafficType");
            jsonWriter.value(trafficType);
        }
        if (flowLog.getLogDestinationType() != null) {
            String logDestinationType = flowLog.getLogDestinationType();
            jsonWriter.name("LogDestinationType");
            jsonWriter.value(logDestinationType);
        }
        if (flowLog.getLogDestination() != null) {
            String logDestination = flowLog.getLogDestination();
            jsonWriter.name("LogDestination");
            jsonWriter.value(logDestination);
        }
        if (flowLog.getLogFormat() != null) {
            String logFormat = flowLog.getLogFormat();
            jsonWriter.name("LogFormat");
            jsonWriter.value(logFormat);
        }
        if (flowLog.getTags() != null) {
            java.util.List<Tag> tags = flowLog.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (flowLog.getMaxAggregationInterval() != null) {
            Integer maxAggregationInterval = flowLog.getMaxAggregationInterval();
            jsonWriter.name("MaxAggregationInterval");
            jsonWriter.value(maxAggregationInterval);
        }
        jsonWriter.endObject();
    }

    private static FlowLogJsonMarshaller instance;

    public static FlowLogJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FlowLogJsonMarshaller();
        return instance;
    }
}
