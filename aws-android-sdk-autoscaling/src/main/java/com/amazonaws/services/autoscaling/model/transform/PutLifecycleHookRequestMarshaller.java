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
 * StAX request marshaller for PutLifecycleHookRequest
 */
public class PutLifecycleHookRequestMarshaller implements
        Marshaller<Request<PutLifecycleHookRequest>, PutLifecycleHookRequest> {

    public Request<PutLifecycleHookRequest> marshall(PutLifecycleHookRequest putLifecycleHookRequest) {
        if (putLifecycleHookRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutLifecycleHookRequest)");
        }

        Request<PutLifecycleHookRequest> request = new DefaultRequest<PutLifecycleHookRequest>(
                putLifecycleHookRequest, "AmazonAutoScaling");
        request.addParameter("Action", "PutLifecycleHook");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (putLifecycleHookRequest.getLifecycleHookName() != null) {
            prefix = "LifecycleHookName";
            String lifecycleHookName = putLifecycleHookRequest.getLifecycleHookName();
            request.addParameter(prefix, StringUtils.fromString(lifecycleHookName));
        }
        if (putLifecycleHookRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = putLifecycleHookRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (putLifecycleHookRequest.getLifecycleTransition() != null) {
            prefix = "LifecycleTransition";
            String lifecycleTransition = putLifecycleHookRequest.getLifecycleTransition();
            request.addParameter(prefix, StringUtils.fromString(lifecycleTransition));
        }
        if (putLifecycleHookRequest.getRoleARN() != null) {
            prefix = "RoleARN";
            String roleARN = putLifecycleHookRequest.getRoleARN();
            request.addParameter(prefix, StringUtils.fromString(roleARN));
        }
        if (putLifecycleHookRequest.getNotificationTargetARN() != null) {
            prefix = "NotificationTargetARN";
            String notificationTargetARN = putLifecycleHookRequest.getNotificationTargetARN();
            request.addParameter(prefix, StringUtils.fromString(notificationTargetARN));
        }
        if (putLifecycleHookRequest.getNotificationMetadata() != null) {
            prefix = "NotificationMetadata";
            String notificationMetadata = putLifecycleHookRequest.getNotificationMetadata();
            request.addParameter(prefix, StringUtils.fromString(notificationMetadata));
        }
        if (putLifecycleHookRequest.getHeartbeatTimeout() != null) {
            prefix = "HeartbeatTimeout";
            Integer heartbeatTimeout = putLifecycleHookRequest.getHeartbeatTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(heartbeatTimeout));
        }
        if (putLifecycleHookRequest.getDefaultResult() != null) {
            prefix = "DefaultResult";
            String defaultResult = putLifecycleHookRequest.getDefaultResult();
            request.addParameter(prefix, StringUtils.fromString(defaultResult));
        }

        return request;
    }
}
