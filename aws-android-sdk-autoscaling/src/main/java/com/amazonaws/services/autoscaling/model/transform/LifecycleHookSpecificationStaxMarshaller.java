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
 * StAX marshaller for POJO LifecycleHookSpecification
 */
class LifecycleHookSpecificationStaxMarshaller {

    public void marshall(LifecycleHookSpecification _lifecycleHookSpecification,
            Request<?> request, String _prefix) {
        String prefix;
        if (_lifecycleHookSpecification.getLifecycleHookName() != null) {
            prefix = _prefix + "LifecycleHookName";
            String lifecycleHookName = _lifecycleHookSpecification.getLifecycleHookName();
            request.addParameter(prefix, StringUtils.fromString(lifecycleHookName));
        }
        if (_lifecycleHookSpecification.getLifecycleTransition() != null) {
            prefix = _prefix + "LifecycleTransition";
            String lifecycleTransition = _lifecycleHookSpecification.getLifecycleTransition();
            request.addParameter(prefix, StringUtils.fromString(lifecycleTransition));
        }
        if (_lifecycleHookSpecification.getNotificationMetadata() != null) {
            prefix = _prefix + "NotificationMetadata";
            String notificationMetadata = _lifecycleHookSpecification.getNotificationMetadata();
            request.addParameter(prefix, StringUtils.fromString(notificationMetadata));
        }
        if (_lifecycleHookSpecification.getHeartbeatTimeout() != null) {
            prefix = _prefix + "HeartbeatTimeout";
            Integer heartbeatTimeout = _lifecycleHookSpecification.getHeartbeatTimeout();
            request.addParameter(prefix, StringUtils.fromInteger(heartbeatTimeout));
        }
        if (_lifecycleHookSpecification.getDefaultResult() != null) {
            prefix = _prefix + "DefaultResult";
            String defaultResult = _lifecycleHookSpecification.getDefaultResult();
            request.addParameter(prefix, StringUtils.fromString(defaultResult));
        }
        if (_lifecycleHookSpecification.getNotificationTargetARN() != null) {
            prefix = _prefix + "NotificationTargetARN";
            String notificationTargetARN = _lifecycleHookSpecification.getNotificationTargetARN();
            request.addParameter(prefix, StringUtils.fromString(notificationTargetARN));
        }
        if (_lifecycleHookSpecification.getRoleARN() != null) {
            prefix = _prefix + "RoleARN";
            String roleARN = _lifecycleHookSpecification.getRoleARN();
            request.addParameter(prefix, StringUtils.fromString(roleARN));
        }
    }

    private static LifecycleHookSpecificationStaxMarshaller instance;

    public static LifecycleHookSpecificationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleHookSpecificationStaxMarshaller();
        return instance;
    }
}
