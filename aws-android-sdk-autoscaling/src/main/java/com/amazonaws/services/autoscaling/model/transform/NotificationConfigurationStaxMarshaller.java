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
 * StAX marshaller for POJO NotificationConfiguration
 */
class NotificationConfigurationStaxMarshaller {

    public void marshall(NotificationConfiguration _notificationConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_notificationConfiguration.getAutoScalingGroupName() != null) {
            prefix = _prefix + "AutoScalingGroupName";
            String autoScalingGroupName = _notificationConfiguration.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (_notificationConfiguration.getTopicARN() != null) {
            prefix = _prefix + "TopicARN";
            String topicARN = _notificationConfiguration.getTopicARN();
            request.addParameter(prefix, StringUtils.fromString(topicARN));
        }
        if (_notificationConfiguration.getNotificationType() != null) {
            prefix = _prefix + "NotificationType";
            String notificationType = _notificationConfiguration.getNotificationType();
            request.addParameter(prefix, StringUtils.fromString(notificationType));
        }
    }

    private static NotificationConfigurationStaxMarshaller instance;

    public static NotificationConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NotificationConfigurationStaxMarshaller();
        return instance;
    }
}
