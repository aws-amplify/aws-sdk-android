/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AuthEventType
 */
class AuthEventTypeJsonUnmarshaller implements Unmarshaller<AuthEventType, JsonUnmarshallerContext> {

    public AuthEventType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuthEventType authEventType = new AuthEventType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EventId")) {
                authEventType.setEventId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventType")) {
                authEventType.setEventType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                authEventType.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventResponse")) {
                authEventType.setEventResponse(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventRisk")) {
                authEventType.setEventRisk(EventRiskTypeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ChallengeResponses")) {
                authEventType.setChallengeResponses(new ListUnmarshaller<ChallengeResponseType>(
                        ChallengeResponseTypeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EventContextData")) {
                authEventType.setEventContextData(EventContextDataTypeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventFeedback")) {
                authEventType.setEventFeedback(EventFeedbackTypeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return authEventType;
    }

    private static AuthEventTypeJsonUnmarshaller instance;

    public static AuthEventTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthEventTypeJsonUnmarshaller();
        return instance;
    }
}
