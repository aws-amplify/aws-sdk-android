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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ContactSearchSummary
 */
class ContactSearchSummaryJsonMarshaller {

    public void marshall(ContactSearchSummary contactSearchSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (contactSearchSummary.getArn() != null) {
            String arn = contactSearchSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (contactSearchSummary.getId() != null) {
            String id = contactSearchSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (contactSearchSummary.getInitialContactId() != null) {
            String initialContactId = contactSearchSummary.getInitialContactId();
            jsonWriter.name("InitialContactId");
            jsonWriter.value(initialContactId);
        }
        if (contactSearchSummary.getPreviousContactId() != null) {
            String previousContactId = contactSearchSummary.getPreviousContactId();
            jsonWriter.name("PreviousContactId");
            jsonWriter.value(previousContactId);
        }
        if (contactSearchSummary.getInitiationMethod() != null) {
            String initiationMethod = contactSearchSummary.getInitiationMethod();
            jsonWriter.name("InitiationMethod");
            jsonWriter.value(initiationMethod);
        }
        if (contactSearchSummary.getChannel() != null) {
            String channel = contactSearchSummary.getChannel();
            jsonWriter.name("Channel");
            jsonWriter.value(channel);
        }
        if (contactSearchSummary.getQueueInfo() != null) {
            ContactSearchSummaryQueueInfo queueInfo = contactSearchSummary.getQueueInfo();
            jsonWriter.name("QueueInfo");
            ContactSearchSummaryQueueInfoJsonMarshaller.getInstance().marshall(queueInfo,
                    jsonWriter);
        }
        if (contactSearchSummary.getAgentInfo() != null) {
            ContactSearchSummaryAgentInfo agentInfo = contactSearchSummary.getAgentInfo();
            jsonWriter.name("AgentInfo");
            ContactSearchSummaryAgentInfoJsonMarshaller.getInstance().marshall(agentInfo,
                    jsonWriter);
        }
        if (contactSearchSummary.getInitiationTimestamp() != null) {
            java.util.Date initiationTimestamp = contactSearchSummary.getInitiationTimestamp();
            jsonWriter.name("InitiationTimestamp");
            jsonWriter.value(initiationTimestamp);
        }
        if (contactSearchSummary.getDisconnectTimestamp() != null) {
            java.util.Date disconnectTimestamp = contactSearchSummary.getDisconnectTimestamp();
            jsonWriter.name("DisconnectTimestamp");
            jsonWriter.value(disconnectTimestamp);
        }
        if (contactSearchSummary.getScheduledTimestamp() != null) {
            java.util.Date scheduledTimestamp = contactSearchSummary.getScheduledTimestamp();
            jsonWriter.name("ScheduledTimestamp");
            jsonWriter.value(scheduledTimestamp);
        }
        jsonWriter.endObject();
    }

    private static ContactSearchSummaryJsonMarshaller instance;

    public static ContactSearchSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactSearchSummaryJsonMarshaller();
        return instance;
    }
}
