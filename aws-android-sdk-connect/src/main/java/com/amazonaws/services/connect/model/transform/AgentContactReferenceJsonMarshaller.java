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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AgentContactReference
 */
class AgentContactReferenceJsonMarshaller {

    public void marshall(AgentContactReference agentContactReference, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (agentContactReference.getContactId() != null) {
            String contactId = agentContactReference.getContactId();
            jsonWriter.name("ContactId");
            jsonWriter.value(contactId);
        }
        if (agentContactReference.getChannel() != null) {
            String channel = agentContactReference.getChannel();
            jsonWriter.name("Channel");
            jsonWriter.value(channel);
        }
        if (agentContactReference.getInitiationMethod() != null) {
            String initiationMethod = agentContactReference.getInitiationMethod();
            jsonWriter.name("InitiationMethod");
            jsonWriter.value(initiationMethod);
        }
        if (agentContactReference.getAgentContactState() != null) {
            String agentContactState = agentContactReference.getAgentContactState();
            jsonWriter.name("AgentContactState");
            jsonWriter.value(agentContactState);
        }
        if (agentContactReference.getStateStartTimestamp() != null) {
            java.util.Date stateStartTimestamp = agentContactReference.getStateStartTimestamp();
            jsonWriter.name("StateStartTimestamp");
            jsonWriter.value(stateStartTimestamp);
        }
        if (agentContactReference.getConnectedToAgentTimestamp() != null) {
            java.util.Date connectedToAgentTimestamp = agentContactReference
                    .getConnectedToAgentTimestamp();
            jsonWriter.name("ConnectedToAgentTimestamp");
            jsonWriter.value(connectedToAgentTimestamp);
        }
        if (agentContactReference.getQueue() != null) {
            QueueReference queue = agentContactReference.getQueue();
            jsonWriter.name("Queue");
            QueueReferenceJsonMarshaller.getInstance().marshall(queue, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AgentContactReferenceJsonMarshaller instance;

    public static AgentContactReferenceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AgentContactReferenceJsonMarshaller();
        return instance;
    }
}
