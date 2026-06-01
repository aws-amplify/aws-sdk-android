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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AgentHierarchyGroups
 */
class AgentHierarchyGroupsJsonUnmarshaller implements
        Unmarshaller<AgentHierarchyGroups, JsonUnmarshallerContext> {

    public AgentHierarchyGroups unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AgentHierarchyGroups agentHierarchyGroups = new AgentHierarchyGroups();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("L1Ids")) {
                agentHierarchyGroups.setL1Ids(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("L2Ids")) {
                agentHierarchyGroups.setL2Ids(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("L3Ids")) {
                agentHierarchyGroups.setL3Ids(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("L4Ids")) {
                agentHierarchyGroups.setL4Ids(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("L5Ids")) {
                agentHierarchyGroups.setL5Ids(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return agentHierarchyGroups;
    }

    private static AgentHierarchyGroupsJsonUnmarshaller instance;

    public static AgentHierarchyGroupsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentHierarchyGroupsJsonUnmarshaller();
        return instance;
    }
}
