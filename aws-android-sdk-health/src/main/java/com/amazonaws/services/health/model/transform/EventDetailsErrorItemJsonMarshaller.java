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
 * JSON marshaller for POJO EventDetailsErrorItem
 */
class EventDetailsErrorItemJsonMarshaller {

    public void marshall(EventDetailsErrorItem eventDetailsErrorItem, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eventDetailsErrorItem.getEventArn() != null) {
            String eventArn = eventDetailsErrorItem.getEventArn();
            jsonWriter.name("eventArn");
            jsonWriter.value(eventArn);
        }
        if (eventDetailsErrorItem.getErrorName() != null) {
            String errorName = eventDetailsErrorItem.getErrorName();
            jsonWriter.name("errorName");
            jsonWriter.value(errorName);
        }
        if (eventDetailsErrorItem.getErrorMessage() != null) {
            String errorMessage = eventDetailsErrorItem.getErrorMessage();
            jsonWriter.name("errorMessage");
            jsonWriter.value(errorMessage);
        }
        jsonWriter.endObject();
    }

    private static EventDetailsErrorItemJsonMarshaller instance;

    public static EventDetailsErrorItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventDetailsErrorItemJsonMarshaller();
        return instance;
    }
}
