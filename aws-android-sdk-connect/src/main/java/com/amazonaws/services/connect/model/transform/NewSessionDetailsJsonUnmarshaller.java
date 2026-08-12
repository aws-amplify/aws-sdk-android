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
 * JSON unmarshaller for POJO NewSessionDetails
 */
class NewSessionDetailsJsonUnmarshaller implements
        Unmarshaller<NewSessionDetails, JsonUnmarshallerContext> {

    public NewSessionDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NewSessionDetails newSessionDetails = new NewSessionDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SupportedMessagingContentTypes")) {
                newSessionDetails.setSupportedMessagingContentTypes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ParticipantDetails")) {
                newSessionDetails.setParticipantDetails(ParticipantDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Attributes")) {
                newSessionDetails.setAttributes(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StreamingConfiguration")) {
                newSessionDetails
                        .setStreamingConfiguration(ChatStreamingConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return newSessionDetails;
    }

    private static NewSessionDetailsJsonUnmarshaller instance;

    public static NewSessionDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NewSessionDetailsJsonUnmarshaller();
        return instance;
    }
}
