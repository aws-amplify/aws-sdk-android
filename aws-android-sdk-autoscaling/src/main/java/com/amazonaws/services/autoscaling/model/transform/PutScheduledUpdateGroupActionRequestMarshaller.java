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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for PutScheduledUpdateGroupActionRequest
 */
public class PutScheduledUpdateGroupActionRequestMarshaller
        implements
        Marshaller<Request<PutScheduledUpdateGroupActionRequest>, PutScheduledUpdateGroupActionRequest> {

    public Request<PutScheduledUpdateGroupActionRequest> marshall(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest) {
        if (putScheduledUpdateGroupActionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutScheduledUpdateGroupActionRequest)");
        }

        Request<PutScheduledUpdateGroupActionRequest> request = new DefaultRequest<PutScheduledUpdateGroupActionRequest>(
                putScheduledUpdateGroupActionRequest, "AmazonAutoScaling");
        request.addParameter("Action", "PutScheduledUpdateGroupAction");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (putScheduledUpdateGroupActionRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = putScheduledUpdateGroupActionRequest
                    .getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (putScheduledUpdateGroupActionRequest.getScheduledActionName() != null) {
            prefix = "ScheduledActionName";
            String scheduledActionName = putScheduledUpdateGroupActionRequest
                    .getScheduledActionName();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionName));
        }
        if (putScheduledUpdateGroupActionRequest.getTime() != null) {
            prefix = "Time";
            java.util.Date time = putScheduledUpdateGroupActionRequest.getTime();
            request.addParameter(prefix, StringUtils.fromDate(time));
        }
        if (putScheduledUpdateGroupActionRequest.getStartTime() != null) {
            prefix = "StartTime";
            java.util.Date startTime = putScheduledUpdateGroupActionRequest.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (putScheduledUpdateGroupActionRequest.getEndTime() != null) {
            prefix = "EndTime";
            java.util.Date endTime = putScheduledUpdateGroupActionRequest.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (putScheduledUpdateGroupActionRequest.getRecurrence() != null) {
            prefix = "Recurrence";
            String recurrence = putScheduledUpdateGroupActionRequest.getRecurrence();
            request.addParameter(prefix, StringUtils.fromString(recurrence));
        }
        if (putScheduledUpdateGroupActionRequest.getMinSize() != null) {
            prefix = "MinSize";
            Integer minSize = putScheduledUpdateGroupActionRequest.getMinSize();
            request.addParameter(prefix, StringUtils.fromInteger(minSize));
        }
        if (putScheduledUpdateGroupActionRequest.getMaxSize() != null) {
            prefix = "MaxSize";
            Integer maxSize = putScheduledUpdateGroupActionRequest.getMaxSize();
            request.addParameter(prefix, StringUtils.fromInteger(maxSize));
        }
        if (putScheduledUpdateGroupActionRequest.getDesiredCapacity() != null) {
            prefix = "DesiredCapacity";
            Integer desiredCapacity = putScheduledUpdateGroupActionRequest.getDesiredCapacity();
            request.addParameter(prefix, StringUtils.fromInteger(desiredCapacity));
        }

        return request;
    }
}
