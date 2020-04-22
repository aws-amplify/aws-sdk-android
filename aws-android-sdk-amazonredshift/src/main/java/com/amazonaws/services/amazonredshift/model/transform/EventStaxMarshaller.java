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
 * StAX marshaller for POJO Event
 */
class EventStaxMarshaller {

    public void marshall(Event _event, Request<?> request, String _prefix) {
        String prefix;
        if (_event.getSourceIdentifier() != null) {
            prefix = _prefix + "SourceIdentifier";
            String sourceIdentifier = _event.getSourceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceIdentifier));
        }
        if (_event.getSourceType() != null) {
            prefix = _prefix + "SourceType";
            String sourceType = _event.getSourceType();
            request.addParameter(prefix, StringUtils.fromString(sourceType));
        }
        if (_event.getMessage() != null) {
            prefix = _prefix + "Message";
            String message = _event.getMessage();
            request.addParameter(prefix, StringUtils.fromString(message));
        }
        if (_event.getEventCategories() != null) {
            prefix = _prefix + "EventCategories";
            java.util.List<String> eventCategories = _event.getEventCategories();
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
        if (_event.getSeverity() != null) {
            prefix = _prefix + "Severity";
            String severity = _event.getSeverity();
            request.addParameter(prefix, StringUtils.fromString(severity));
        }
        if (_event.getDate() != null) {
            prefix = _prefix + "Date";
            java.util.Date dateValue = _event.getDate();
            request.addParameter(prefix, StringUtils.fromDate(dateValue));
        }
        if (_event.getEventId() != null) {
            prefix = _prefix + "EventId";
            String eventId = _event.getEventId();
            request.addParameter(prefix, StringUtils.fromString(eventId));
        }
    }

    private static EventStaxMarshaller instance;

    public static EventStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EventStaxMarshaller();
        return instance;
    }
}
