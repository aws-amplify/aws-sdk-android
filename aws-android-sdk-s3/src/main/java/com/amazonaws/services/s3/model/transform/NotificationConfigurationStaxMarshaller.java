/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO NotificationConfiguration
 */
class NotificationConfigurationStaxMarshaller {

    public void marshall(NotificationConfiguration _notificationConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_notificationConfiguration.getTopicConfigurations() != null) {
            prefix = _prefix + "TopicConfigurations";
            java.util.List<TopicConfiguration> topicConfigurations = _notificationConfiguration
                    .getTopicConfigurations();
            int topicConfigurationsIndex = 1;
            String topicConfigurationsPrefix = prefix;
            for (TopicConfiguration topicConfigurationsItem : topicConfigurations) {
                prefix = topicConfigurationsPrefix + ".member." + topicConfigurationsIndex;
                if (topicConfigurationsItem != null) {
                    TopicConfigurationStaxMarshaller.getInstance().marshall(
                            topicConfigurationsItem, request, prefix + ".");
                }
                topicConfigurationsIndex++;
            }
            prefix = topicConfigurationsPrefix;
        }
        if (_notificationConfiguration.getQueueConfigurations() != null) {
            prefix = _prefix + "QueueConfigurations";
            java.util.List<QueueConfiguration> queueConfigurations = _notificationConfiguration
                    .getQueueConfigurations();
            int queueConfigurationsIndex = 1;
            String queueConfigurationsPrefix = prefix;
            for (QueueConfiguration queueConfigurationsItem : queueConfigurations) {
                prefix = queueConfigurationsPrefix + ".member." + queueConfigurationsIndex;
                if (queueConfigurationsItem != null) {
                    QueueConfigurationStaxMarshaller.getInstance().marshall(
                            queueConfigurationsItem, request, prefix + ".");
                }
                queueConfigurationsIndex++;
            }
            prefix = queueConfigurationsPrefix;
        }
        if (_notificationConfiguration.getLambdaFunctionConfigurations() != null) {
            prefix = _prefix + "LambdaFunctionConfigurations";
            java.util.List<LambdaFunctionConfiguration> lambdaFunctionConfigurations = _notificationConfiguration
                    .getLambdaFunctionConfigurations();
            int lambdaFunctionConfigurationsIndex = 1;
            String lambdaFunctionConfigurationsPrefix = prefix;
            for (LambdaFunctionConfiguration lambdaFunctionConfigurationsItem : lambdaFunctionConfigurations) {
                prefix = lambdaFunctionConfigurationsPrefix + ".member."
                        + lambdaFunctionConfigurationsIndex;
                if (lambdaFunctionConfigurationsItem != null) {
                    LambdaFunctionConfigurationStaxMarshaller.getInstance().marshall(
                            lambdaFunctionConfigurationsItem, request, prefix + ".");
                }
                lambdaFunctionConfigurationsIndex++;
            }
            prefix = lambdaFunctionConfigurationsPrefix;
        }
    }

    private static NotificationConfigurationStaxMarshaller instance;

    public static NotificationConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NotificationConfigurationStaxMarshaller();
        return instance;
    }
}
