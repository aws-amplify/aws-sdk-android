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
 * JSON marshaller for POJO AgentHierarchyGroups
 */
class AgentHierarchyGroupsJsonMarshaller {

    public void marshall(AgentHierarchyGroups agentHierarchyGroups, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (agentHierarchyGroups.getL1Ids() != null) {
            java.util.List<String> l1Ids = agentHierarchyGroups.getL1Ids();
            jsonWriter.name("L1Ids");
            jsonWriter.beginArray();
            for (String l1IdsItem : l1Ids) {
                if (l1IdsItem != null) {
                    jsonWriter.value(l1IdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (agentHierarchyGroups.getL2Ids() != null) {
            java.util.List<String> l2Ids = agentHierarchyGroups.getL2Ids();
            jsonWriter.name("L2Ids");
            jsonWriter.beginArray();
            for (String l2IdsItem : l2Ids) {
                if (l2IdsItem != null) {
                    jsonWriter.value(l2IdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (agentHierarchyGroups.getL3Ids() != null) {
            java.util.List<String> l3Ids = agentHierarchyGroups.getL3Ids();
            jsonWriter.name("L3Ids");
            jsonWriter.beginArray();
            for (String l3IdsItem : l3Ids) {
                if (l3IdsItem != null) {
                    jsonWriter.value(l3IdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (agentHierarchyGroups.getL4Ids() != null) {
            java.util.List<String> l4Ids = agentHierarchyGroups.getL4Ids();
            jsonWriter.name("L4Ids");
            jsonWriter.beginArray();
            for (String l4IdsItem : l4Ids) {
                if (l4IdsItem != null) {
                    jsonWriter.value(l4IdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (agentHierarchyGroups.getL5Ids() != null) {
            java.util.List<String> l5Ids = agentHierarchyGroups.getL5Ids();
            jsonWriter.name("L5Ids");
            jsonWriter.beginArray();
            for (String l5IdsItem : l5Ids) {
                if (l5IdsItem != null) {
                    jsonWriter.value(l5IdsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AgentHierarchyGroupsJsonMarshaller instance;

    public static AgentHierarchyGroupsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AgentHierarchyGroupsJsonMarshaller();
        return instance;
    }
}
