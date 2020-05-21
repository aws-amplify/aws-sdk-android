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
 * StAX marshaller for POJO QueueConfigurationDeprecated
 */
class QueueConfigurationDeprecatedStaxMarshaller {

    public void marshall(QueueConfigurationDeprecated _queueConfigurationDeprecated,
            Request<?> request, String _prefix) {
        String prefix;
        if (_queueConfigurationDeprecated.getId() != null) {
            prefix = _prefix + "Id";
            String id = _queueConfigurationDeprecated.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_queueConfigurationDeprecated.getEvent() != null) {
            prefix = _prefix + "Event";
            String event = _queueConfigurationDeprecated.getEvent();
            request.addParameter(prefix, StringUtils.fromString(event));
        }
        if (_queueConfigurationDeprecated.getEvents() != null) {
            prefix = _prefix + "Events";
            java.util.List<String> events = _queueConfigurationDeprecated.getEvents();
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
        if (_queueConfigurationDeprecated.getQueue() != null) {
            prefix = _prefix + "Queue";
            String queue = _queueConfigurationDeprecated.getQueue();
            request.addParameter(prefix, StringUtils.fromString(queue));
        }
    }

    private static QueueConfigurationDeprecatedStaxMarshaller instance;

    public static QueueConfigurationDeprecatedStaxMarshaller getInstance() {
        if (instance == null)
            instance = new QueueConfigurationDeprecatedStaxMarshaller();
        return instance;
    }
}
