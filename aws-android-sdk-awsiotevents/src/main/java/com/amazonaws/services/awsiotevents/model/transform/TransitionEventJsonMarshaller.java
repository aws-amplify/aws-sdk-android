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
 * JSON marshaller for POJO TransitionEvent
 */
class TransitionEventJsonMarshaller {

    public void marshall(TransitionEvent transitionEvent, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transitionEvent.getEventName() != null) {
            String eventName = transitionEvent.getEventName();
            jsonWriter.name("eventName");
            jsonWriter.value(eventName);
        }
        if (transitionEvent.getCondition() != null) {
            String condition = transitionEvent.getCondition();
            jsonWriter.name("condition");
            jsonWriter.value(condition);
        }
        if (transitionEvent.getActions() != null) {
            java.util.List<Action> actions = transitionEvent.getActions();
            jsonWriter.name("actions");
            jsonWriter.beginArray();
            for (Action actionsItem : actions) {
                if (actionsItem != null) {
                    ActionJsonMarshaller.getInstance().marshall(actionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (transitionEvent.getNextState() != null) {
            String nextState = transitionEvent.getNextState();
            jsonWriter.name("nextState");
            jsonWriter.value(nextState);
        }
        jsonWriter.endObject();
    }

    private static TransitionEventJsonMarshaller instance;

    public static TransitionEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitionEventJsonMarshaller();
        return instance;
    }
}
