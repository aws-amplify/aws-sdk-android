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
 * JSON marshaller for POJO OrganizationEvent
 */
class OrganizationEventJsonMarshaller {

    public void marshall(OrganizationEvent organizationEvent, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (organizationEvent.getArn() != null) {
            String arn = organizationEvent.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (organizationEvent.getService() != null) {
            String service = organizationEvent.getService();
            jsonWriter.name("service");
            jsonWriter.value(service);
        }
        if (organizationEvent.getEventTypeCode() != null) {
            String eventTypeCode = organizationEvent.getEventTypeCode();
            jsonWriter.name("eventTypeCode");
            jsonWriter.value(eventTypeCode);
        }
        if (organizationEvent.getEventTypeCategory() != null) {
            String eventTypeCategory = organizationEvent.getEventTypeCategory();
            jsonWriter.name("eventTypeCategory");
            jsonWriter.value(eventTypeCategory);
        }
        if (organizationEvent.getEventScopeCode() != null) {
            String eventScopeCode = organizationEvent.getEventScopeCode();
            jsonWriter.name("eventScopeCode");
            jsonWriter.value(eventScopeCode);
        }
        if (organizationEvent.getRegion() != null) {
            String region = organizationEvent.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        if (organizationEvent.getStartTime() != null) {
            java.util.Date startTime = organizationEvent.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (organizationEvent.getEndTime() != null) {
            java.util.Date endTime = organizationEvent.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        if (organizationEvent.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = organizationEvent.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (organizationEvent.getStatusCode() != null) {
            String statusCode = organizationEvent.getStatusCode();
            jsonWriter.name("statusCode");
            jsonWriter.value(statusCode);
        }
        jsonWriter.endObject();
    }

    private static OrganizationEventJsonMarshaller instance;

    public static OrganizationEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationEventJsonMarshaller();
        return instance;
    }
}
