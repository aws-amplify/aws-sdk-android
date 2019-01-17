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
 * StAX marshaller for POJO ScheduledUpdateGroupActionRequest
 */
class ScheduledUpdateGroupActionRequestStaxMarshaller {

    public void marshall(ScheduledUpdateGroupActionRequest _scheduledUpdateGroupActionRequest,
            Request<?> request, String _prefix) {
        String prefix;
        if (_scheduledUpdateGroupActionRequest.getScheduledActionName() != null) {
            prefix = _prefix + "ScheduledActionName";
            String scheduledActionName = _scheduledUpdateGroupActionRequest
                    .getScheduledActionName();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionName));
        }
        if (_scheduledUpdateGroupActionRequest.getStartTime() != null) {
            prefix = _prefix + "StartTime";
            java.util.Date startTime = _scheduledUpdateGroupActionRequest.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (_scheduledUpdateGroupActionRequest.getEndTime() != null) {
            prefix = _prefix + "EndTime";
            java.util.Date endTime = _scheduledUpdateGroupActionRequest.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (_scheduledUpdateGroupActionRequest.getRecurrence() != null) {
            prefix = _prefix + "Recurrence";
            String recurrence = _scheduledUpdateGroupActionRequest.getRecurrence();
            request.addParameter(prefix, StringUtils.fromString(recurrence));
        }
        if (_scheduledUpdateGroupActionRequest.getMinSize() != null) {
            prefix = _prefix + "MinSize";
            Integer minSize = _scheduledUpdateGroupActionRequest.getMinSize();
            request.addParameter(prefix, StringUtils.fromInteger(minSize));
        }
        if (_scheduledUpdateGroupActionRequest.getMaxSize() != null) {
            prefix = _prefix + "MaxSize";
            Integer maxSize = _scheduledUpdateGroupActionRequest.getMaxSize();
            request.addParameter(prefix, StringUtils.fromInteger(maxSize));
        }
        if (_scheduledUpdateGroupActionRequest.getDesiredCapacity() != null) {
            prefix = _prefix + "DesiredCapacity";
            Integer desiredCapacity = _scheduledUpdateGroupActionRequest.getDesiredCapacity();
            request.addParameter(prefix, StringUtils.fromInteger(desiredCapacity));
        }
    }

    private static ScheduledUpdateGroupActionRequestStaxMarshaller instance;

    public static ScheduledUpdateGroupActionRequestStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledUpdateGroupActionRequestStaxMarshaller();
        return instance;
    }
}
