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
 * StAX request marshaller for RecordLifecycleActionHeartbeatRequest
 */
public class RecordLifecycleActionHeartbeatRequestMarshaller
        implements
        Marshaller<Request<RecordLifecycleActionHeartbeatRequest>, RecordLifecycleActionHeartbeatRequest> {

    public Request<RecordLifecycleActionHeartbeatRequest> marshall(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest) {
        if (recordLifecycleActionHeartbeatRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RecordLifecycleActionHeartbeatRequest)");
        }

        Request<RecordLifecycleActionHeartbeatRequest> request = new DefaultRequest<RecordLifecycleActionHeartbeatRequest>(
                recordLifecycleActionHeartbeatRequest, "AmazonAutoScaling");
        request.addParameter("Action", "RecordLifecycleActionHeartbeat");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (recordLifecycleActionHeartbeatRequest.getLifecycleHookName() != null) {
            prefix = "LifecycleHookName";
            String lifecycleHookName = recordLifecycleActionHeartbeatRequest.getLifecycleHookName();
            request.addParameter(prefix, StringUtils.fromString(lifecycleHookName));
        }
        if (recordLifecycleActionHeartbeatRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = recordLifecycleActionHeartbeatRequest
                    .getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (recordLifecycleActionHeartbeatRequest.getLifecycleActionToken() != null) {
            prefix = "LifecycleActionToken";
            String lifecycleActionToken = recordLifecycleActionHeartbeatRequest
                    .getLifecycleActionToken();
            request.addParameter(prefix, StringUtils.fromString(lifecycleActionToken));
        }
        if (recordLifecycleActionHeartbeatRequest.getInstanceId() != null) {
            prefix = "InstanceId";
            String instanceId = recordLifecycleActionHeartbeatRequest.getInstanceId();
            request.addParameter(prefix, StringUtils.fromString(instanceId));
        }

        return request;
    }
}
