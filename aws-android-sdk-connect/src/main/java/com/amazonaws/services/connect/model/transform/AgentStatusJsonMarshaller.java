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
 * JSON marshaller for POJO AgentStatus
 */
class AgentStatusJsonMarshaller {

    public void marshall(AgentStatus agentStatus, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (agentStatus.getAgentStatusARN() != null) {
            String agentStatusARN = agentStatus.getAgentStatusARN();
            jsonWriter.name("AgentStatusARN");
            jsonWriter.value(agentStatusARN);
        }
        if (agentStatus.getAgentStatusId() != null) {
            String agentStatusId = agentStatus.getAgentStatusId();
            jsonWriter.name("AgentStatusId");
            jsonWriter.value(agentStatusId);
        }
        if (agentStatus.getName() != null) {
            String name = agentStatus.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (agentStatus.getDescription() != null) {
            String description = agentStatus.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (agentStatus.getType() != null) {
            String type = agentStatus.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (agentStatus.getDisplayOrder() != null) {
            Integer displayOrder = agentStatus.getDisplayOrder();
            jsonWriter.name("DisplayOrder");
            jsonWriter.value(displayOrder);
        }
        if (agentStatus.getState() != null) {
            String state = agentStatus.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (agentStatus.getTags() != null) {
            java.util.Map<String, String> tags = agentStatus.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static AgentStatusJsonMarshaller instance;

    public static AgentStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AgentStatusJsonMarshaller();
        return instance;
    }
}
