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
 * StAX marshaller for POJO LifecycleHook
 */
class LifecycleHookStaxMarshaller {

    public void marshall(LifecycleHook _lifecycleHook, Request<?> request, String _prefix) {
        String prefix;
        if (_lifecycleHook.getLifecycleHookName() != null) {
            prefix = _prefix + "LifecycleHookName";
            String lifecycleHookName = _lifecycleHook.getLifecycleHookName();
            request.addParameter(prefix, StringUtils.fromString(lifecycleHookName));
        }
        if (_lifecycleHook.getAutoScalingGroupName() != null) {
            prefix = _prefix + "AutoScalingGroupName";
            String autoScalingGroupName = _lifecycleHook.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (_lifecycleHook.getLifecycleTransition() != null) {
            prefix = _prefix + "LifecycleTransition";
            String lifecycleTransition = _lifecycleHook.getLifecycleTransition();
            request.addParameter(prefix, StringUtils.fromString(lifecycleTransition));
        }
        if (_lifecycleHook.getNotificationTargetARN() != null) {
            prefix = _prefix + "NotificationTargetARN";
            String notificationTargetARN = _lifecycleHook.getNotificationTargetARN();
            request.addParameter(prefix, StringUtils.fromString(notificationTargetARN));
        }
        if (_lifecycleHook.getRoleARN() != null) {
            prefix = _prefix + "RoleARN";
            String roleARN = _lifecycleHook.getRoleARN();
            request.addParameter(prefix, StringUtils.fromString(roleARN));
        }
        if (_lifecycleHook.getNotificationMetadata() != null) {
            prefix = _prefix + "NotificationMetadata";
            String notificationMetadata = _lifecycleHook.getNotificationMetadata();
            request.addParameter(prefix, StringUtils.fromString(notificationMetadata));
        }
        if (_lifecycleHook.getHeartbeatTimeout() != null) {
            prefix = _prefix + "HeartbeatTimeout";
            Integer heartbeatTimeout = _lifecycleHook.getHeartbeatTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(heartbeatTimeout));
        }
        if (_lifecycleHook.getGlobalTimeout() != null) {
            prefix = _prefix + "GlobalTimeout";
            Integer globalTimeout = _lifecycleHook.getGlobalTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(globalTimeout));
        }
        if (_lifecycleHook.getDefaultResult() != null) {
            prefix = _prefix + "DefaultResult";
            String defaultResult = _lifecycleHook.getDefaultResult();
            request.addParameter(prefix, StringUtils.fromString(defaultResult));
        }
    }

    private static LifecycleHookStaxMarshaller instance;

    public static LifecycleHookStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleHookStaxMarshaller();
        return instance;
    }
}
