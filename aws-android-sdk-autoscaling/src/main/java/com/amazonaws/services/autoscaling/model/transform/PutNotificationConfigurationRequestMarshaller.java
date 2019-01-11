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
 * StAX request marshaller for PutNotificationConfigurationRequest
 */
public class PutNotificationConfigurationRequestMarshaller
        implements
        Marshaller<Request<PutNotificationConfigurationRequest>, PutNotificationConfigurationRequest> {

    public Request<PutNotificationConfigurationRequest> marshall(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest) {
        if (putNotificationConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutNotificationConfigurationRequest)");
        }

        Request<PutNotificationConfigurationRequest> request = new DefaultRequest<PutNotificationConfigurationRequest>(
                putNotificationConfigurationRequest, "AmazonAutoScaling");
        request.addParameter("Action", "PutNotificationConfiguration");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (putNotificationConfigurationRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = putNotificationConfigurationRequest
                    .getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (putNotificationConfigurationRequest.getTopicARN() != null) {
            prefix = "TopicARN";
            String topicARN = putNotificationConfigurationRequest.getTopicARN();
            request.addParameter(prefix, StringUtils.fromString(topicARN));
        }
        if (putNotificationConfigurationRequest.getNotificationTypes() != null) {
            prefix = "NotificationTypes";
            java.util.List<String> notificationTypes = putNotificationConfigurationRequest
                    .getNotificationTypes();
            int notificationTypesIndex = 1;
            String notificationTypesPrefix = prefix;
            for (String notificationTypesItem : notificationTypes) {
                prefix = notificationTypesPrefix + ".member." + notificationTypesIndex;
                if (notificationTypesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(notificationTypesItem));
                }
                notificationTypesIndex++;
            }
            prefix = notificationTypesPrefix;
        }

        return request;
    }
}
