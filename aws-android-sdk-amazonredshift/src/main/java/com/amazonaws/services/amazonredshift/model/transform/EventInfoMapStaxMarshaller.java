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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO EventInfoMap
 */
class EventInfoMapStaxMarshaller {

    public void marshall(EventInfoMap _eventInfoMap, Request<?> request, String _prefix) {
        String prefix;
        if (_eventInfoMap.getEventId() != null) {
            prefix = _prefix + "EventId";
            String eventId = _eventInfoMap.getEventId();
            request.addParameter(prefix, StringUtils.fromString(eventId));
        }
        if (_eventInfoMap.getEventCategories() != null) {
            prefix = _prefix + "EventCategories";
            java.util.List<String> eventCategories = _eventInfoMap.getEventCategories();
            int eventCategoriesIndex = 1;
            String eventCategoriesPrefix = prefix;
            for (String eventCategoriesItem : eventCategories) {
                prefix = eventCategoriesPrefix + "." + eventCategoriesIndex;
                if (eventCategoriesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(eventCategoriesItem));
                }
                eventCategoriesIndex++;
            }
            prefix = eventCategoriesPrefix;
        }
        if (_eventInfoMap.getEventDescription() != null) {
            prefix = _prefix + "EventDescription";
            String eventDescription = _eventInfoMap.getEventDescription();
            request.addParameter(prefix, StringUtils.fromString(eventDescription));
        }
        if (_eventInfoMap.getSeverity() != null) {
            prefix = _prefix + "Severity";
            String severity = _eventInfoMap.getSeverity();
            request.addParameter(prefix, StringUtils.fromString(severity));
        }
    }

    private static EventInfoMapStaxMarshaller instance;

    public static EventInfoMapStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EventInfoMapStaxMarshaller();
        return instance;
    }
}
