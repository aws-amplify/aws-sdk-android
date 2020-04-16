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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OnEnterLifecycle
 */
class OnEnterLifecycleJsonMarshaller {

    public void marshall(OnEnterLifecycle onEnterLifecycle, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (onEnterLifecycle.getEvents() != null) {
            java.util.List<Event> events = onEnterLifecycle.getEvents();
            jsonWriter.name("events");
            jsonWriter.beginArray();
            for (Event eventsItem : events) {
                if (eventsItem != null) {
                    EventJsonMarshaller.getInstance().marshall(eventsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static OnEnterLifecycleJsonMarshaller instance;

    public static OnEnterLifecycleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OnEnterLifecycleJsonMarshaller();
        return instance;
    }
}
