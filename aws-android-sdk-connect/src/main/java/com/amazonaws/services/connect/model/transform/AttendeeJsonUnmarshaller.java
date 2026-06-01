/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Attendee
 */
class AttendeeJsonUnmarshaller implements Unmarshaller<Attendee, JsonUnmarshallerContext> {

    public Attendee unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Attendee attendee = new Attendee();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AttendeeId")) {
                attendee.setAttendeeId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JoinToken")) {
                attendee.setJoinToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return attendee;
    }

    private static AttendeeJsonUnmarshaller instance;

    public static AttendeeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AttendeeJsonUnmarshaller();
        return instance;
    }
}
