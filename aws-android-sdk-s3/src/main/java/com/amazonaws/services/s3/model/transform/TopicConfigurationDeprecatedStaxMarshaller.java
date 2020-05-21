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
 * StAX marshaller for POJO TopicConfigurationDeprecated
 */
class TopicConfigurationDeprecatedStaxMarshaller {

    public void marshall(TopicConfigurationDeprecated _topicConfigurationDeprecated,
            Request<?> request, String _prefix) {
        String prefix;
        if (_topicConfigurationDeprecated.getId() != null) {
            prefix = _prefix + "Id";
            String id = _topicConfigurationDeprecated.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_topicConfigurationDeprecated.getEvents() != null) {
            prefix = _prefix + "Events";
            java.util.List<String> events = _topicConfigurationDeprecated.getEvents();
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
        if (_topicConfigurationDeprecated.getEvent() != null) {
            prefix = _prefix + "Event";
            String event = _topicConfigurationDeprecated.getEvent();
            request.addParameter(prefix, StringUtils.fromString(event));
        }
        if (_topicConfigurationDeprecated.getTopic() != null) {
            prefix = _prefix + "Topic";
            String topic = _topicConfigurationDeprecated.getTopic();
            request.addParameter(prefix, StringUtils.fromString(topic));
        }
    }

    private static TopicConfigurationDeprecatedStaxMarshaller instance;

    public static TopicConfigurationDeprecatedStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TopicConfigurationDeprecatedStaxMarshaller();
        return instance;
    }
}
