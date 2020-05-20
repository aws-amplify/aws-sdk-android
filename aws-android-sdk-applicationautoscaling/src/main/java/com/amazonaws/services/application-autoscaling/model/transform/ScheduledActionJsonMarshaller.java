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
package com.amazonaws.services.application-autoscaling.model.transform;

import com.amazonaws.services.application-autoscaling.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScheduledAction
 */
class ScheduledActionJsonMarshaller {

    public void marshall(ScheduledAction scheduledAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scheduledAction.getScheduledActionName() != null) {
            String scheduledActionName = scheduledAction.getScheduledActionName();
            jsonWriter.name("ScheduledActionName");
            jsonWriter.value(scheduledActionName);
        }
        if (scheduledAction.getScheduledActionARN() != null) {
            String scheduledActionARN = scheduledAction.getScheduledActionARN();
            jsonWriter.name("ScheduledActionARN");
            jsonWriter.value(scheduledActionARN);
        }
        if (scheduledAction.getServiceNamespace() != null) {
            String serviceNamespace = scheduledAction.getServiceNamespace();
            jsonWriter.name("ServiceNamespace");
            jsonWriter.value(serviceNamespace);
        }
        if (scheduledAction.getSchedule() != null) {
            String schedule = scheduledAction.getSchedule();
            jsonWriter.name("Schedule");
            jsonWriter.value(schedule);
        }
        if (scheduledAction.getResourceId() != null) {
            String resourceId = scheduledAction.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (scheduledAction.getScalableDimension() != null) {
            String scalableDimension = scheduledAction.getScalableDimension();
            jsonWriter.name("ScalableDimension");
            jsonWriter.value(scalableDimension);
        }
        if (scheduledAction.getStartTime() != null) {
            java.util.Date startTime = scheduledAction.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (scheduledAction.getEndTime() != null) {
            java.util.Date endTime = scheduledAction.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (scheduledAction.getScalableTargetAction() != null) {
            ScalableTargetAction scalableTargetAction = scheduledAction.getScalableTargetAction();
            jsonWriter.name("ScalableTargetAction");
            ScalableTargetActionJsonMarshaller.getInstance().marshall(scalableTargetAction, jsonWriter);
        }
        if (scheduledAction.getCreationTime() != null) {
            java.util.Date creationTime = scheduledAction.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        jsonWriter.endObject();
    }

    private static ScheduledActionJsonMarshaller instance;
    public static ScheduledActionJsonMarshaller getInstance() {
        if (instance == null) instance = new ScheduledActionJsonMarshaller();
        return instance;
    }
}
