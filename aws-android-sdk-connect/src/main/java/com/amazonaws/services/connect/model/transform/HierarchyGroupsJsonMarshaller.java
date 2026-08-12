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
 * JSON marshaller for POJO HierarchyGroups
 */
class HierarchyGroupsJsonMarshaller {

    public void marshall(HierarchyGroups hierarchyGroups, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hierarchyGroups.getLevel1() != null) {
            AgentHierarchyGroup level1 = hierarchyGroups.getLevel1();
            jsonWriter.name("Level1");
            AgentHierarchyGroupJsonMarshaller.getInstance().marshall(level1, jsonWriter);
        }
        if (hierarchyGroups.getLevel2() != null) {
            AgentHierarchyGroup level2 = hierarchyGroups.getLevel2();
            jsonWriter.name("Level2");
            AgentHierarchyGroupJsonMarshaller.getInstance().marshall(level2, jsonWriter);
        }
        if (hierarchyGroups.getLevel3() != null) {
            AgentHierarchyGroup level3 = hierarchyGroups.getLevel3();
            jsonWriter.name("Level3");
            AgentHierarchyGroupJsonMarshaller.getInstance().marshall(level3, jsonWriter);
        }
        if (hierarchyGroups.getLevel4() != null) {
            AgentHierarchyGroup level4 = hierarchyGroups.getLevel4();
            jsonWriter.name("Level4");
            AgentHierarchyGroupJsonMarshaller.getInstance().marshall(level4, jsonWriter);
        }
        if (hierarchyGroups.getLevel5() != null) {
            AgentHierarchyGroup level5 = hierarchyGroups.getLevel5();
            jsonWriter.name("Level5");
            AgentHierarchyGroupJsonMarshaller.getInstance().marshall(level5, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HierarchyGroupsJsonMarshaller instance;

    public static HierarchyGroupsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HierarchyGroupsJsonMarshaller();
        return instance;
    }
}
