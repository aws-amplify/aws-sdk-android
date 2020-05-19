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
 * JSON marshaller for POJO Event
 */
class EventJsonMarshaller {

    public void marshall(Event event, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (event.getArn() != null) {
            String arn = event.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (event.getService() != null) {
            String service = event.getService();
            jsonWriter.name("service");
            jsonWriter.value(service);
        }
        if (event.getEventTypeCode() != null) {
            String eventTypeCode = event.getEventTypeCode();
            jsonWriter.name("eventTypeCode");
            jsonWriter.value(eventTypeCode);
        }
        if (event.getEventTypeCategory() != null) {
            String eventTypeCategory = event.getEventTypeCategory();
            jsonWriter.name("eventTypeCategory");
            jsonWriter.value(eventTypeCategory);
        }
        if (event.getRegion() != null) {
            String region = event.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        if (event.getAvailabilityZone() != null) {
            String availabilityZone = event.getAvailabilityZone();
            jsonWriter.name("availabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (event.getStartTime() != null) {
            java.util.Date startTime = event.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (event.getEndTime() != null) {
            java.util.Date endTime = event.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        if (event.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = event.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (event.getStatusCode() != null) {
            String statusCode = event.getStatusCode();
            jsonWriter.name("statusCode");
            jsonWriter.value(statusCode);
        }
        if (event.getEventScopeCode() != null) {
            String eventScopeCode = event.getEventScopeCode();
            jsonWriter.name("eventScopeCode");
            jsonWriter.value(eventScopeCode);
        }
        jsonWriter.endObject();
    }

    private static EventJsonMarshaller instance;

    public static EventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventJsonMarshaller();
        return instance;
    }
}
