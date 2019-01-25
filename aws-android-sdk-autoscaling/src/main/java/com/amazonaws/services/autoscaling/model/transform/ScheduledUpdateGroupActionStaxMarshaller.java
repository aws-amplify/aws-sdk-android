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
 * StAX marshaller for POJO ScheduledUpdateGroupAction
 */
class ScheduledUpdateGroupActionStaxMarshaller {

    public void marshall(ScheduledUpdateGroupAction _scheduledUpdateGroupAction,
            Request<?> request, String _prefix) {
        String prefix;
        if (_scheduledUpdateGroupAction.getAutoScalingGroupName() != null) {
            prefix = _prefix + "AutoScalingGroupName";
            String autoScalingGroupName = _scheduledUpdateGroupAction.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (_scheduledUpdateGroupAction.getScheduledActionName() != null) {
            prefix = _prefix + "ScheduledActionName";
            String scheduledActionName = _scheduledUpdateGroupAction.getScheduledActionName();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionName));
        }
        if (_scheduledUpdateGroupAction.getScheduledActionARN() != null) {
            prefix = _prefix + "ScheduledActionARN";
            String scheduledActionARN = _scheduledUpdateGroupAction.getScheduledActionARN();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionARN));
        }
        if (_scheduledUpdateGroupAction.getTime() != null) {
            prefix = _prefix + "Time";
            java.util.Date time = _scheduledUpdateGroupAction.getTime();
            request.addParameter(prefix, StringUtils.fromDate(time));
        }
        if (_scheduledUpdateGroupAction.getStartTime() != null) {
            prefix = _prefix + "StartTime";
            java.util.Date startTime = _scheduledUpdateGroupAction.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (_scheduledUpdateGroupAction.getEndTime() != null) {
            prefix = _prefix + "EndTime";
            java.util.Date endTime = _scheduledUpdateGroupAction.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (_scheduledUpdateGroupAction.getRecurrence() != null) {
            prefix = _prefix + "Recurrence";
            String recurrence = _scheduledUpdateGroupAction.getRecurrence();
            request.addParameter(prefix, StringUtils.fromString(recurrence));
        }
        if (_scheduledUpdateGroupAction.getMinSize() != null) {
            prefix = _prefix + "MinSize";
            Integer minSize = _scheduledUpdateGroupAction.getMinSize();
            request.addParameter(prefix, StringUtils.fromInteger(minSize));
        }
        if (_scheduledUpdateGroupAction.getMaxSize() != null) {
            prefix = _prefix + "MaxSize";
            Integer maxSize = _scheduledUpdateGroupAction.getMaxSize();
            request.addParameter(prefix, StringUtils.fromInteger(maxSize));
        }
        if (_scheduledUpdateGroupAction.getDesiredCapacity() != null) {
            prefix = _prefix + "DesiredCapacity";
            Integer desiredCapacity = _scheduledUpdateGroupAction.getDesiredCapacity();
            request.addParameter(prefix, StringUtils.fromInteger(desiredCapacity));
        }
    }

    private static ScheduledUpdateGroupActionStaxMarshaller instance;

    public static ScheduledUpdateGroupActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledUpdateGroupActionStaxMarshaller();
        return instance;
    }
}
