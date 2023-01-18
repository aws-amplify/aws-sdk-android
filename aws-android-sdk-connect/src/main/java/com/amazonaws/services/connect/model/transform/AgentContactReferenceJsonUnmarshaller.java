/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO AgentContactReference
 */
class AgentContactReferenceJsonUnmarshaller implements
        Unmarshaller<AgentContactReference, JsonUnmarshallerContext> {

    public AgentContactReference unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AgentContactReference agentContactReference = new AgentContactReference();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ContactId")) {
                agentContactReference.setContactId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Channel")) {
                agentContactReference.setChannel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InitiationMethod")) {
                agentContactReference.setInitiationMethod(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AgentContactState")) {
                agentContactReference.setAgentContactState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StateStartTimestamp")) {
                agentContactReference.setStateStartTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectedToAgentTimestamp")) {
                agentContactReference.setConnectedToAgentTimestamp(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Queue")) {
                agentContactReference.setQueue(QueueReferenceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return agentContactReference;
    }

    private static AgentContactReferenceJsonUnmarshaller instance;

    public static AgentContactReferenceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentContactReferenceJsonUnmarshaller();
        return instance;
    }
}
