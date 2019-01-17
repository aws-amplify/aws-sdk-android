/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Activity
 */
class ActivityStaxMarshaller {

    public void marshall(Activity _activity, Request<?> request, String _prefix) {
        String prefix;
        if (_activity.getActivityId() != null) {
            prefix = _prefix + "ActivityId";
            String activityId = _activity.getActivityId();
            request.addParameter(prefix, StringUtils.fromString(activityId));
        }
        if (_activity.getAutoScalingGroupName() != null) {
            prefix = _prefix + "AutoScalingGroupName";
            String autoScalingGroupName = _activity.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (_activity.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _activity.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_activity.getCause() != null) {
            prefix = _prefix + "Cause";
            String cause = _activity.getCause();
            request.addParameter(prefix, StringUtils.fromString(cause));
        }
        if (_activity.getStartTime() != null) {
            prefix = _prefix + "StartTime";
            java.util.Date startTime = _activity.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (_activity.getEndTime() != null) {
            prefix = _prefix + "EndTime";
            java.util.Date endTime = _activity.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (_activity.getStatusCode() != null) {
            prefix = _prefix + "StatusCode";
            String statusCode = _activity.getStatusCode();
            request.addParameter(prefix, StringUtils.fromString(statusCode));
        }
        if (_activity.getStatusMessage() != null) {
            prefix = _prefix + "StatusMessage";
            String statusMessage = _activity.getStatusMessage();
            request.addParameter(prefix, StringUtils.fromString(statusMessage));
        }
        if (_activity.getProgress() != null) {
            prefix = _prefix + "Progress";
            Integer progress = _activity.getProgress();
            request.addParameter(prefix, StringUtils.fromInteger(progress));
        }
        if (_activity.getDetails() != null) {
            prefix = _prefix + "Details";
            String details = _activity.getDetails();
            request.addParameter(prefix, StringUtils.fromString(details));
        }
    }

    private static ActivityStaxMarshaller instance;

    public static ActivityStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ActivityStaxMarshaller();
        return instance;
    }
}
