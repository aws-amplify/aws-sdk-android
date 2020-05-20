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
 * JSON marshaller for POJO ScalingActivity
 */
class ScalingActivityJsonMarshaller {

    public void marshall(ScalingActivity scalingActivity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scalingActivity.getActivityId() != null) {
            String activityId = scalingActivity.getActivityId();
            jsonWriter.name("ActivityId");
            jsonWriter.value(activityId);
        }
        if (scalingActivity.getServiceNamespace() != null) {
            String serviceNamespace = scalingActivity.getServiceNamespace();
            jsonWriter.name("ServiceNamespace");
            jsonWriter.value(serviceNamespace);
        }
        if (scalingActivity.getResourceId() != null) {
            String resourceId = scalingActivity.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (scalingActivity.getScalableDimension() != null) {
            String scalableDimension = scalingActivity.getScalableDimension();
            jsonWriter.name("ScalableDimension");
            jsonWriter.value(scalableDimension);
        }
        if (scalingActivity.getDescription() != null) {
            String description = scalingActivity.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (scalingActivity.getCause() != null) {
            String cause = scalingActivity.getCause();
            jsonWriter.name("Cause");
            jsonWriter.value(cause);
        }
        if (scalingActivity.getStartTime() != null) {
            java.util.Date startTime = scalingActivity.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (scalingActivity.getEndTime() != null) {
            java.util.Date endTime = scalingActivity.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (scalingActivity.getStatusCode() != null) {
            String statusCode = scalingActivity.getStatusCode();
            jsonWriter.name("StatusCode");
            jsonWriter.value(statusCode);
        }
        if (scalingActivity.getStatusMessage() != null) {
            String statusMessage = scalingActivity.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (scalingActivity.getDetails() != null) {
            String details = scalingActivity.getDetails();
            jsonWriter.name("Details");
            jsonWriter.value(details);
        }
        jsonWriter.endObject();
    }

    private static ScalingActivityJsonMarshaller instance;
    public static ScalingActivityJsonMarshaller getInstance() {
        if (instance == null) instance = new ScalingActivityJsonMarshaller();
        return instance;
    }
}
