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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AuthEventType
 */
class AuthEventTypeJsonMarshaller {

    public void marshall(AuthEventType authEventType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (authEventType.getEventId() != null) {
            String eventId = authEventType.getEventId();
            jsonWriter.name("EventId");
            jsonWriter.value(eventId);
        }
        if (authEventType.getEventType() != null) {
            String eventType = authEventType.getEventType();
            jsonWriter.name("EventType");
            jsonWriter.value(eventType);
        }
        if (authEventType.getCreationDate() != null) {
            java.util.Date creationDate = authEventType.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (authEventType.getEventResponse() != null) {
            String eventResponse = authEventType.getEventResponse();
            jsonWriter.name("EventResponse");
            jsonWriter.value(eventResponse);
        }
        if (authEventType.getEventRisk() != null) {
            EventRiskType eventRisk = authEventType.getEventRisk();
            jsonWriter.name("EventRisk");
            EventRiskTypeJsonMarshaller.getInstance().marshall(eventRisk, jsonWriter);
        }
        if (authEventType.getChallengeResponses() != null) {
            java.util.List<ChallengeResponseType> challengeResponses = authEventType
                    .getChallengeResponses();
            jsonWriter.name("ChallengeResponses");
            jsonWriter.beginArray();
            for (ChallengeResponseType challengeResponsesItem : challengeResponses) {
                if (challengeResponsesItem != null) {
                    ChallengeResponseTypeJsonMarshaller.getInstance().marshall(
                            challengeResponsesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (authEventType.getEventContextData() != null) {
            EventContextDataType eventContextData = authEventType.getEventContextData();
            jsonWriter.name("EventContextData");
            EventContextDataTypeJsonMarshaller.getInstance().marshall(eventContextData, jsonWriter);
        }
        if (authEventType.getEventFeedback() != null) {
            EventFeedbackType eventFeedback = authEventType.getEventFeedback();
            jsonWriter.name("EventFeedback");
            EventFeedbackTypeJsonMarshaller.getInstance().marshall(eventFeedback, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AuthEventTypeJsonMarshaller instance;

    public static AuthEventTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthEventTypeJsonMarshaller();
        return instance;
    }
}
