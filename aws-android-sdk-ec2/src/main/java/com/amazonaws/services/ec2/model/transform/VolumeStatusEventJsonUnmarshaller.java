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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VolumeStatusEvent
 */
class VolumeStatusEventJsonUnmarshaller implements
        Unmarshaller<VolumeStatusEvent, JsonUnmarshallerContext> {

    public VolumeStatusEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VolumeStatusEvent volumeStatusEvent = new VolumeStatusEvent();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Description")) {
                volumeStatusEvent.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventId")) {
                volumeStatusEvent.setEventId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventType")) {
                volumeStatusEvent.setEventType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotAfter")) {
                volumeStatusEvent.setNotAfter(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NotBefore")) {
                volumeStatusEvent.setNotBefore(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                volumeStatusEvent.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return volumeStatusEvent;
    }

    private static VolumeStatusEventJsonUnmarshaller instance;

    public static VolumeStatusEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VolumeStatusEventJsonUnmarshaller();
        return instance;
    }
}
