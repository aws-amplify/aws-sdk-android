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
 * JSON marshaller for POJO OrganizationEventFilter
 */
class OrganizationEventFilterJsonMarshaller {

    public void marshall(OrganizationEventFilter organizationEventFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (organizationEventFilter.getEventTypeCodes() != null) {
            java.util.List<String> eventTypeCodes = organizationEventFilter.getEventTypeCodes();
            jsonWriter.name("eventTypeCodes");
            jsonWriter.beginArray();
            for (String eventTypeCodesItem : eventTypeCodes) {
                if (eventTypeCodesItem != null) {
                    jsonWriter.value(eventTypeCodesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (organizationEventFilter.getAwsAccountIds() != null) {
            java.util.List<String> awsAccountIds = organizationEventFilter.getAwsAccountIds();
            jsonWriter.name("awsAccountIds");
            jsonWriter.beginArray();
            for (String awsAccountIdsItem : awsAccountIds) {
                if (awsAccountIdsItem != null) {
                    jsonWriter.value(awsAccountIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (organizationEventFilter.getServices() != null) {
            java.util.List<String> services = organizationEventFilter.getServices();
            jsonWriter.name("services");
            jsonWriter.beginArray();
            for (String servicesItem : services) {
                if (servicesItem != null) {
                    jsonWriter.value(servicesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (organizationEventFilter.getRegions() != null) {
            java.util.List<String> regions = organizationEventFilter.getRegions();
            jsonWriter.name("regions");
            jsonWriter.beginArray();
            for (String regionsItem : regions) {
                if (regionsItem != null) {
                    jsonWriter.value(regionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (organizationEventFilter.getStartTime() != null) {
            DateTimeRange startTime = organizationEventFilter.getStartTime();
            jsonWriter.name("startTime");
            DateTimeRangeJsonMarshaller.getInstance().marshall(startTime, jsonWriter);
        }
        if (organizationEventFilter.getEndTime() != null) {
            DateTimeRange endTime = organizationEventFilter.getEndTime();
            jsonWriter.name("endTime");
            DateTimeRangeJsonMarshaller.getInstance().marshall(endTime, jsonWriter);
        }
        if (organizationEventFilter.getLastUpdatedTime() != null) {
            DateTimeRange lastUpdatedTime = organizationEventFilter.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            DateTimeRangeJsonMarshaller.getInstance().marshall(lastUpdatedTime, jsonWriter);
        }
        if (organizationEventFilter.getEntityArns() != null) {
            java.util.List<String> entityArns = organizationEventFilter.getEntityArns();
            jsonWriter.name("entityArns");
            jsonWriter.beginArray();
            for (String entityArnsItem : entityArns) {
                if (entityArnsItem != null) {
                    jsonWriter.value(entityArnsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (organizationEventFilter.getEntityValues() != null) {
            java.util.List<String> entityValues = organizationEventFilter.getEntityValues();
            jsonWriter.name("entityValues");
            jsonWriter.beginArray();
            for (String entityValuesItem : entityValues) {
                if (entityValuesItem != null) {
                    jsonWriter.value(entityValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (organizationEventFilter.getEventTypeCategories() != null) {
            java.util.List<String> eventTypeCategories = organizationEventFilter
                    .getEventTypeCategories();
            jsonWriter.name("eventTypeCategories");
            jsonWriter.beginArray();
            for (String eventTypeCategoriesItem : eventTypeCategories) {
                if (eventTypeCategoriesItem != null) {
                    jsonWriter.value(eventTypeCategoriesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (organizationEventFilter.getEventStatusCodes() != null) {
            java.util.List<String> eventStatusCodes = organizationEventFilter.getEventStatusCodes();
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

    private static OrganizationEventFilterJsonMarshaller instance;

    public static OrganizationEventFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationEventFilterJsonMarshaller();
        return instance;
    }
}
