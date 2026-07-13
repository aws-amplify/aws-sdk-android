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
 * JSON marshaller for POJO AgentInfo
 */
class AgentInfoJsonMarshaller {

    public void marshall(AgentInfo agentInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (agentInfo.getId() != null) {
            String id = agentInfo.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (agentInfo.getConnectedToAgentTimestamp() != null) {
            java.util.Date connectedToAgentTimestamp = agentInfo.getConnectedToAgentTimestamp();
            jsonWriter.name("ConnectedToAgentTimestamp");
            jsonWriter.value(connectedToAgentTimestamp);
        }
        if (agentInfo.getAgentPauseDurationInSeconds() != null) {
            Integer agentPauseDurationInSeconds = agentInfo.getAgentPauseDurationInSeconds();
            jsonWriter.name("AgentPauseDurationInSeconds");
            jsonWriter.value(agentPauseDurationInSeconds);
        }
        if (agentInfo.getHierarchyGroups() != null) {
            HierarchyGroups hierarchyGroups = agentInfo.getHierarchyGroups();
            jsonWriter.name("HierarchyGroups");
            HierarchyGroupsJsonMarshaller.getInstance().marshall(hierarchyGroups, jsonWriter);
        }
        if (agentInfo.getDeviceInfo() != null) {
            DeviceInfo deviceInfo = agentInfo.getDeviceInfo();
            jsonWriter.name("DeviceInfo");
            DeviceInfoJsonMarshaller.getInstance().marshall(deviceInfo, jsonWriter);
        }
        if (agentInfo.getCapabilities() != null) {
            ParticipantCapabilities capabilities = agentInfo.getCapabilities();
            jsonWriter.name("Capabilities");
            ParticipantCapabilitiesJsonMarshaller.getInstance().marshall(capabilities, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AgentInfoJsonMarshaller instance;

    public static AgentInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AgentInfoJsonMarshaller();
        return instance;
    }
}
