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
 * JSON marshaller for POJO EventFilter
 */
class EventFilterJsonMarshaller {

    public void marshall(EventFilter eventFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eventFilter.getEventArns() != null) {
            java.util.List<String> eventArns = eventFilter.getEventArns();
            jsonWriter.name("eventArns");
            jsonWriter.beginArray();
            for (String eventArnsItem : eventArns) {
                if (eventArnsItem != null) {
                    jsonWriter.value(eventArnsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventFilter.getEventTypeCodes() != null) {
            java.util.List<String> eventTypeCodes = eventFilter.getEventTypeCodes();
            jsonWriter.name("eventTypeCodes");
            jsonWriter.beginArray();
            for (String eventTypeCodesItem : eventTypeCodes) {
                if (eventTypeCodesItem != null) {
                    jsonWriter.value(eventTypeCodesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventFilter.getServices() != null) {
            java.util.List<String> services = eventFilter.getServices();
            jsonWriter.name("services");
            jsonWriter.beginArray();
            for (String servicesItem : services) {
                if (servicesItem != null) {
                    jsonWriter.value(servicesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventFilter.getRegions() != null) {
            java.util.List<String> regions = eventFilter.getRegions();
            jsonWriter.name("regions");
            jsonWriter.beginArray();
            for (String regionsItem : regions) {
                if (regionsItem != null) {
                    jsonWriter.value(regionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventFilter.getAvailabilityZones() != null) {
            java.util.List<String> availabilityZones = eventFilter.getAvailabilityZones();
            jsonWriter.name("availabilityZones");
            jsonWriter.beginArray();
            for (String availabilityZonesItem : availabilityZones) {
                if (availabilityZonesItem != null) {
                    jsonWriter.value(availabilityZonesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventFilter.getStartTimes() != null) {
            java.util.List<DateTimeRange> startTimes = eventFilter.getStartTimes();
            jsonWriter.name("startTimes");
            jsonWriter.beginArray();
            for (DateTimeRange startTimesItem : startTimes) {
                if (startTimesItem != null) {
                    DateTimeRangeJsonMarshaller.getInstance().marshall(startTimesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (eventFilter.getEndTimes() != null) {
            java.util.List<DateTimeRange> endTimes = eventFilter.getEndTimes();
            jsonWriter.name("endTimes");
            jsonWriter.beginArray();
            for (DateTimeRange endTimesItem : endTimes) {
                if (endTimesItem != null) {
                    DateTimeRangeJsonMarshaller.getInstance().marshall(endTimesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (eventFilter.getLastUpdatedTimes() != null) {
            java.util.List<DateTimeRange> lastUpdatedTimes = eventFilter.getLastUpdatedTimes();
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
        if (eventFilter.getEntityArns() != null) {
            java.util.List<String> entityArns = eventFilter.getEntityArns();
            jsonWriter.name("entityArns");
            jsonWriter.beginArray();
            for (String entityArnsItem : entityArns) {
                if (entityArnsItem != null) {
                    jsonWriter.value(entityArnsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventFilter.getEntityValues() != null) {
            java.util.List<String> entityValues = eventFilter.getEntityValues();
            jsonWriter.name("entityValues");
            jsonWriter.beginArray();
            for (String entityValuesItem : entityValues) {
                if (entityValuesItem != null) {
                    jsonWriter.value(entityValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventFilter.getEventTypeCategories() != null) {
            java.util.List<String> eventTypeCategories = eventFilter.getEventTypeCategories();
            jsonWriter.name("eventTypeCategories");
            jsonWriter.beginArray();
            for (String eventTypeCategoriesItem : eventTypeCategories) {
                if (eventTypeCategoriesItem != null) {
                    jsonWriter.value(eventTypeCategoriesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventFilter.getTags() != null) {
            java.util.List<java.util.Map<String, String>> tags = eventFilter.getTags();
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
        if (eventFilter.getEventStatusCodes() != null) {
            java.util.List<String> eventStatusCodes = eventFilter.getEventStatusCodes();
            jsonWriter.name("eventStatusCodes");
            jsonWriter.beginArray();
            for (String eventStatusCodesItem : eventStatusCodes) {
                if (eventStatusCodesItem != null) {
                    jsonWriter.value(eventStatusCodesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EventFilterJsonMarshaller instance;

    public static EventFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventFilterJsonMarshaller();
        return instance;
    }
}
