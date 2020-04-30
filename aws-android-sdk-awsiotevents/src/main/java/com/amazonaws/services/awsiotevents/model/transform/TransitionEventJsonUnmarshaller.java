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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TransitionEvent
 */
class TransitionEventJsonUnmarshaller implements
        Unmarshaller<TransitionEvent, JsonUnmarshallerContext> {

    public TransitionEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TransitionEvent transitionEvent = new TransitionEvent();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("eventName")) {
                transitionEvent.setEventName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("condition")) {
                transitionEvent.setCondition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("actions")) {
                transitionEvent.setActions(new ListUnmarshaller<Action>(ActionJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextState")) {
                transitionEvent.setNextState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return transitionEvent;
    }

    private static TransitionEventJsonUnmarshaller instance;

    public static TransitionEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitionEventJsonUnmarshaller();
        return instance;
    }
}
