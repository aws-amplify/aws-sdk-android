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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EventTracker
 */
class EventTrackerJsonUnmarshaller implements Unmarshaller<EventTracker, JsonUnmarshallerContext> {

    public EventTracker unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EventTracker eventTracker = new EventTracker();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                eventTracker.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventTrackerArn")) {
                eventTracker.setEventTrackerArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("accountId")) {
                eventTracker.setAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("trackingId")) {
                eventTracker.setTrackingId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("datasetGroupArn")) {
                eventTracker.setDatasetGroupArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                eventTracker.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDateTime")) {
                eventTracker.setCreationDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDateTime")) {
                eventTracker.setLastUpdatedDateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return eventTracker;
    }

    private static EventTrackerJsonUnmarshaller instance;

    public static EventTrackerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventTrackerJsonUnmarshaller();
        return instance;
    }
}
