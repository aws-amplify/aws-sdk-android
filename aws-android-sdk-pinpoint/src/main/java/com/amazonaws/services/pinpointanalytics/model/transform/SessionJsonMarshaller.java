/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpointanalytics.model.transform;

import com.amazonaws.services.pinpointanalytics.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Session
 */
class SessionJsonMarshaller {

    public void marshall(Session session, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (session.getId() != null) {
            String id = session.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (session.getDuration() != null) {
            Long duration = session.getDuration();
            jsonWriter.name("duration");
            jsonWriter.value(duration);
        }
        if (session.getStartTimestamp() != null) {
            String startTimestamp = session.getStartTimestamp();
            jsonWriter.name("startTimestamp");
            jsonWriter.value(startTimestamp);
        }
        if (session.getStopTimestamp() != null) {
            String stopTimestamp = session.getStopTimestamp();
            jsonWriter.name("stopTimestamp");
            jsonWriter.value(stopTimestamp);
        }
        jsonWriter.endObject();
    }

    private static SessionJsonMarshaller instance;

    public static SessionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SessionJsonMarshaller();
        return instance;
    }
}
