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

package com.amazonaws.services.health.model.transform;

import com.amazonaws.services.health.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EntityFilter
 */
class EntityFilterJsonMarshaller {

    public void marshall(EntityFilter entityFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (entityFilter.getEventArns() != null) {
            java.util.List<String> eventArns = entityFilter.getEventArns();
            jsonWriter.name("eventArns");
            jsonWriter.beginArray();
            for (String eventArnsItem : eventArns) {
                if (eventArnsItem != null) {
                    jsonWriter.value(eventArnsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (entityFilter.getEntityArns() != null) {
            java.util.List<String> entityArns = entityFilter.getEntityArns();
            jsonWriter.name("entityArns");
            jsonWriter.beginArray();
            for (String entityArnsItem : entityArns) {
                if (entityArnsItem != null) {
                    jsonWriter.value(entityArnsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (entityFilter.getEntityValues() != null) {
            java.util.List<String> entityValues = entityFilter.getEntityValues();
            jsonWriter.name("entityValues");
            jsonWriter.beginArray();
            for (String entityValuesItem : entityValues) {
                if (entityValuesItem != null) {
                    jsonWriter.value(entityValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (entityFilter.getLastUpdatedTimes() != null) {
            java.util.List<DateTimeRange> lastUpdatedTimes = entityFilter.getLastUpdatedTimes();
            jsonWriter.name("lastUpdatedTimes");
            jsonWriter.beginArray();
            for (DateTimeRange lastUpdatedTimesItem : lastUpdatedTimes) {
                if (lastUpdatedTimesItem != null) {
                    DateTimeRangeJsonMarshaller.getInstance().marshall(lastUpdatedTimesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (entityFilter.getTags() != null) {
            java.util.List<java.util.Map<String, String>> tags = entityFilter.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (java.util.Map<String, String> tagsItem : tags) {
                if (tagsItem != null) {
                    jsonWriter.beginObject();
                    for (java.util.Map.Entry<String, String> tagsItemEntry : tagsItem.entrySet()) {
                        String tagsItemValue = tagsItemEntry.getValue();
                        if (tagsItemValue != null) {
                            jsonWriter.name(tagsItemEntry.getKey());
                            jsonWriter.value(tagsItemValue);
                        }
                    }
                    jsonWriter.endObject();
                }
            }
            jsonWriter.endArray();
        }
        if (entityFilter.getStatusCodes() != null) {
            java.util.List<String> statusCodes = entityFilter.getStatusCodes();
            jsonWriter.name("statusCodes");
            jsonWriter.beginArray();
            for (String statusCodesItem : statusCodes) {
                if (statusCodesItem != null) {
                    jsonWriter.value(statusCodesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EntityFilterJsonMarshaller instance;

    public static EntityFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityFilterJsonMarshaller();
        return instance;
    }
}
