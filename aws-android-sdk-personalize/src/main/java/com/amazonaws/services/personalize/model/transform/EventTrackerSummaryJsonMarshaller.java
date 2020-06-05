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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EventTrackerSummary
 */
class EventTrackerSummaryJsonMarshaller {

    public void marshall(EventTrackerSummary eventTrackerSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eventTrackerSummary.getName() != null) {
            String name = eventTrackerSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (eventTrackerSummary.getEventTrackerArn() != null) {
            String eventTrackerArn = eventTrackerSummary.getEventTrackerArn();
            jsonWriter.name("eventTrackerArn");
            jsonWriter.value(eventTrackerArn);
        }
        if (eventTrackerSummary.getStatus() != null) {
            String status = eventTrackerSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (eventTrackerSummary.getCreationDateTime() != null) {
            java.util.Date creationDateTime = eventTrackerSummary.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (eventTrackerSummary.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = eventTrackerSummary.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static EventTrackerSummaryJsonMarshaller instance;

    public static EventTrackerSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventTrackerSummaryJsonMarshaller();
        return instance;
    }
}
