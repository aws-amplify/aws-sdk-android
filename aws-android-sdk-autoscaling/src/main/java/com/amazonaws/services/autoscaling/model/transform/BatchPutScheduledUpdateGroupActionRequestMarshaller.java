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
 * StAX request marshaller for BatchPutScheduledUpdateGroupActionRequest
 */
public class BatchPutScheduledUpdateGroupActionRequestMarshaller
        implements
        Marshaller<Request<BatchPutScheduledUpdateGroupActionRequest>, BatchPutScheduledUpdateGroupActionRequest> {

    public Request<BatchPutScheduledUpdateGroupActionRequest> marshall(
            BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest) {
        if (batchPutScheduledUpdateGroupActionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(BatchPutScheduledUpdateGroupActionRequest)");
        }

        Request<BatchPutScheduledUpdateGroupActionRequest> request = new DefaultRequest<BatchPutScheduledUpdateGroupActionRequest>(
                batchPutScheduledUpdateGroupActionRequest, "AmazonAutoScaling");
        request.addParameter("Action", "BatchPutScheduledUpdateGroupAction");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (batchPutScheduledUpdateGroupActionRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = batchPutScheduledUpdateGroupActionRequest
                    .getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (batchPutScheduledUpdateGroupActionRequest.getScheduledUpdateGroupActions() != null) {
            prefix = "ScheduledUpdateGroupActions";
            java.util.List<ScheduledUpdateGroupActionRequest> scheduledUpdateGroupActions = batchPutScheduledUpdateGroupActionRequest
                    .getScheduledUpdateGroupActions();
            int scheduledUpdateGroupActionsIndex = 1;
            String scheduledUpdateGroupActionsPrefix = prefix;
            for (ScheduledUpdateGroupActionRequest scheduledUpdateGroupActionsItem : scheduledUpdateGroupActions) {
                prefix = scheduledUpdateGroupActionsPrefix + ".member."
                        + scheduledUpdateGroupActionsIndex;
                if (scheduledUpdateGroupActionsItem != null) {
                    ScheduledUpdateGroupActionRequestStaxMarshaller.getInstance().marshall(
                            scheduledUpdateGroupActionsItem, request, prefix + ".");
                }
                scheduledUpdateGroupActionsIndex++;
            }
            prefix = scheduledUpdateGroupActionsPrefix;
        }

        return request;
    }
}
