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
 * JSON unmarshaller for response StartWebRTCContactResult
 */
public class StartWebRTCContactResultJsonUnmarshaller implements
        Unmarshaller<StartWebRTCContactResult, JsonUnmarshallerContext> {

    public StartWebRTCContactResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartWebRTCContactResult startWebRTCContactResult = new StartWebRTCContactResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ConnectionData")) {
                startWebRTCContactResult.setConnectionData(ConnectionDataJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContactId")) {
                startWebRTCContactResult.setContactId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParticipantId")) {
                startWebRTCContactResult.setParticipantId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ParticipantToken")) {
                startWebRTCContactResult.setParticipantToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return startWebRTCContactResult;
    }

    private static StartWebRTCContactResultJsonUnmarshaller instance;

    public static StartWebRTCContactResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartWebRTCContactResultJsonUnmarshaller();
        return instance;
    }
}
