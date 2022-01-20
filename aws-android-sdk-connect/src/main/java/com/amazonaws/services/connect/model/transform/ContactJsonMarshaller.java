/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO Contact
 */
class ContactJsonMarshaller {

    public void marshall(Contact contact, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (contact.getArn() != null) {
            String arn = contact.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (contact.getId() != null) {
            String id = contact.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (contact.getInitialContactId() != null) {
            String initialContactId = contact.getInitialContactId();
            jsonWriter.name("InitialContactId");
            jsonWriter.value(initialContactId);
        }
        if (contact.getPreviousContactId() != null) {
            String previousContactId = contact.getPreviousContactId();
            jsonWriter.name("PreviousContactId");
            jsonWriter.value(previousContactId);
        }
        if (contact.getInitiationMethod() != null) {
            String initiationMethod = contact.getInitiationMethod();
            jsonWriter.name("InitiationMethod");
            jsonWriter.value(initiationMethod);
        }
        if (contact.getName() != null) {
            String name = contact.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (contact.getDescription() != null) {
            String description = contact.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (contact.getChannel() != null) {
            String channel = contact.getChannel();
            jsonWriter.name("Channel");
            jsonWriter.value(channel);
        }
        if (contact.getQueueInfo() != null) {
            QueueInfo queueInfo = contact.getQueueInfo();
            jsonWriter.name("QueueInfo");
            QueueInfoJsonMarshaller.getInstance().marshall(queueInfo, jsonWriter);
        }
        if (contact.getAgentInfo() != null) {
            AgentInfo agentInfo = contact.getAgentInfo();
            jsonWriter.name("AgentInfo");
            AgentInfoJsonMarshaller.getInstance().marshall(agentInfo, jsonWriter);
        }
        if (contact.getInitiationTimestamp() != null) {
            java.util.Date initiationTimestamp = contact.getInitiationTimestamp();
            jsonWriter.name("InitiationTimestamp");
            jsonWriter.value(initiationTimestamp);
        }
        if (contact.getDisconnectTimestamp() != null) {
            java.util.Date disconnectTimestamp = contact.getDisconnectTimestamp();
            jsonWriter.name("DisconnectTimestamp");
            jsonWriter.value(disconnectTimestamp);
        }
        if (contact.getLastUpdateTimestamp() != null) {
            java.util.Date lastUpdateTimestamp = contact.getLastUpdateTimestamp();
            jsonWriter.name("LastUpdateTimestamp");
            jsonWriter.value(lastUpdateTimestamp);
        }
        if (contact.getScheduledTimestamp() != null) {
            java.util.Date scheduledTimestamp = contact.getScheduledTimestamp();
            jsonWriter.name("ScheduledTimestamp");
            jsonWriter.value(scheduledTimestamp);
        }
        jsonWriter.endObject();
    }

    private static ContactJsonMarshaller instance;

    public static ContactJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactJsonMarshaller();
        return instance;
    }
}
