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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO EventCategoriesMap
 */
class EventCategoriesMapStaxMarshaller {

    public void marshall(EventCategoriesMap _eventCategoriesMap, Request<?> request, String _prefix) {
        String prefix;
        if (_eventCategoriesMap.getSourceType() != null) {
            prefix = _prefix + "SourceType";
            String sourceType = _eventCategoriesMap.getSourceType();
            request.addParameter(prefix, StringUtils.fromString(sourceType));
        }
        if (_eventCategoriesMap.getEventCategories() != null) {
            prefix = _prefix + "EventCategories";
            java.util.List<String> eventCategories = _eventCategoriesMap.getEventCategories();
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
    }

    private static EventCategoriesMapStaxMarshaller instance;

    public static EventCategoriesMapStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EventCategoriesMapStaxMarshaller();
        return instance;
    }
}
