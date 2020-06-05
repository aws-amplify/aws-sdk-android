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
 * JSON marshaller for POJO EventTracker
 */
class EventTrackerJsonMarshaller {

    public void marshall(EventTracker eventTracker, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eventTracker.getName() != null) {
            String name = eventTracker.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (eventTracker.getEventTrackerArn() != null) {
            String eventTrackerArn = eventTracker.getEventTrackerArn();
            jsonWriter.name("eventTrackerArn");
            jsonWriter.value(eventTrackerArn);
        }
        if (eventTracker.getAccountId() != null) {
            String accountId = eventTracker.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        if (eventTracker.getTrackingId() != null) {
            String trackingId = eventTracker.getTrackingId();
            jsonWriter.name("trackingId");
            jsonWriter.value(trackingId);
        }
        if (eventTracker.getDatasetGroupArn() != null) {
            String datasetGroupArn = eventTracker.getDatasetGroupArn();
            jsonWriter.name("datasetGroupArn");
            jsonWriter.value(datasetGroupArn);
        }
        if (eventTracker.getStatus() != null) {
            String status = eventTracker.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (eventTracker.getCreationDateTime() != null) {
            java.util.Date creationDateTime = eventTracker.getCreationDateTime();
            jsonWriter.name("creationDateTime");
            jsonWriter.value(creationDateTime);
        }
        if (eventTracker.getLastUpdatedDateTime() != null) {
            java.util.Date lastUpdatedDateTime = eventTracker.getLastUpdatedDateTime();
            jsonWriter.name("lastUpdatedDateTime");
            jsonWriter.value(lastUpdatedDateTime);
        }
        jsonWriter.endObject();
    }

    private static EventTrackerJsonMarshaller instance;

    public static EventTrackerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventTrackerJsonMarshaller();
        return instance;
    }
}
