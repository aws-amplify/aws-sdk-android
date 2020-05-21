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
 * StAX marshaller for POJO QueueConfiguration
 */
class QueueConfigurationStaxMarshaller {

    public void marshall(QueueConfiguration _queueConfiguration, Request<?> request, String _prefix) {
        String prefix;
        if (_queueConfiguration.getId() != null) {
            prefix = _prefix + "Id";
            String id = _queueConfiguration.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_queueConfiguration.getQueueArn() != null) {
            prefix = _prefix + "Queue";
            String queueArn = _queueConfiguration.getQueueArn();
            request.addParameter(prefix, StringUtils.fromString(queueArn));
        }
        if (_queueConfiguration.getEvents() != null) {
            prefix = _prefix + "Events";
            java.util.List<String> events = _queueConfiguration.getEvents();
            int eventsIndex = 1;
            String eventsPrefix = prefix;
            for (String eventsItem : events) {
                prefix = eventsPrefix + ".member." + eventsIndex;
                if (eventsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(eventsItem));
                }
                eventsIndex++;
            }
            prefix = eventsPrefix;
        }
        if (_queueConfiguration.getFilter() != null) {
            prefix = _prefix + "Filter";
            NotificationConfigurationFilter filter = _queueConfiguration.getFilter();
            NotificationConfigurationFilterStaxMarshaller.getInstance().marshall(filter, request,
                    prefix + ".");
        }
    }

    private static QueueConfigurationStaxMarshaller instance;

    public static QueueConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new QueueConfigurationStaxMarshaller();
        return instance;
    }
}
