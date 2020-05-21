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
 * StAX marshaller for POJO TopicConfiguration
 */
class TopicConfigurationStaxMarshaller {

    public void marshall(TopicConfiguration _topicConfiguration, Request<?> request, String _prefix) {
        String prefix;
        if (_topicConfiguration.getId() != null) {
            prefix = _prefix + "Id";
            String id = _topicConfiguration.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_topicConfiguration.getTopicArn() != null) {
            prefix = _prefix + "Topic";
            String topicArn = _topicConfiguration.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
        if (_topicConfiguration.getEvents() != null) {
            prefix = _prefix + "Events";
            java.util.List<String> events = _topicConfiguration.getEvents();
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
        if (_topicConfiguration.getFilter() != null) {
            prefix = _prefix + "Filter";
            NotificationConfigurationFilter filter = _topicConfiguration.getFilter();
            NotificationConfigurationFilterStaxMarshaller.getInstance().marshall(filter, request,
                    prefix + ".");
        }
    }

    private static TopicConfigurationStaxMarshaller instance;

    public static TopicConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TopicConfigurationStaxMarshaller();
        return instance;
    }
}
