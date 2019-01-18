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
 * StAX request marshaller for DeleteScheduledActionRequest
 */
public class DeleteScheduledActionRequestMarshaller implements
        Marshaller<Request<DeleteScheduledActionRequest>, DeleteScheduledActionRequest> {

    public Request<DeleteScheduledActionRequest> marshall(
            DeleteScheduledActionRequest deleteScheduledActionRequest) {
        if (deleteScheduledActionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteScheduledActionRequest)");
        }

        Request<DeleteScheduledActionRequest> request = new DefaultRequest<DeleteScheduledActionRequest>(
                deleteScheduledActionRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DeleteScheduledAction");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (deleteScheduledActionRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = deleteScheduledActionRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (deleteScheduledActionRequest.getScheduledActionName() != null) {
            prefix = "ScheduledActionName";
            String scheduledActionName = deleteScheduledActionRequest.getScheduledActionName();
            request.addParameter(prefix, StringUtils.fromString(scheduledActionName));
        }

        return request;
    }
}
