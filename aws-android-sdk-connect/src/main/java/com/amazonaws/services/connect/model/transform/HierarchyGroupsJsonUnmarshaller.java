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
 * JSON unmarshaller for POJO HierarchyGroups
 */
class HierarchyGroupsJsonUnmarshaller implements
        Unmarshaller<HierarchyGroups, JsonUnmarshallerContext> {

    public HierarchyGroups unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HierarchyGroups hierarchyGroups = new HierarchyGroups();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Level1")) {
                hierarchyGroups.setLevel1(AgentHierarchyGroupJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Level2")) {
                hierarchyGroups.setLevel2(AgentHierarchyGroupJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Level3")) {
                hierarchyGroups.setLevel3(AgentHierarchyGroupJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Level4")) {
                hierarchyGroups.setLevel4(AgentHierarchyGroupJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Level5")) {
                hierarchyGroups.setLevel5(AgentHierarchyGroupJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hierarchyGroups;
    }

    private static HierarchyGroupsJsonUnmarshaller instance;

    public static HierarchyGroupsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HierarchyGroupsJsonUnmarshaller();
        return instance;
    }
}
