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
 * JSON marshaller for POJO HierarchyStructureUpdate
 */
class HierarchyStructureUpdateJsonMarshaller {

    public void marshall(HierarchyStructureUpdate hierarchyStructureUpdate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hierarchyStructureUpdate.getLevelOne() != null) {
            HierarchyLevelUpdate levelOne = hierarchyStructureUpdate.getLevelOne();
            jsonWriter.name("LevelOne");
            HierarchyLevelUpdateJsonMarshaller.getInstance().marshall(levelOne, jsonWriter);
        }
        if (hierarchyStructureUpdate.getLevelTwo() != null) {
            HierarchyLevelUpdate levelTwo = hierarchyStructureUpdate.getLevelTwo();
            jsonWriter.name("LevelTwo");
            HierarchyLevelUpdateJsonMarshaller.getInstance().marshall(levelTwo, jsonWriter);
        }
        if (hierarchyStructureUpdate.getLevelThree() != null) {
            HierarchyLevelUpdate levelThree = hierarchyStructureUpdate.getLevelThree();
            jsonWriter.name("LevelThree");
            HierarchyLevelUpdateJsonMarshaller.getInstance().marshall(levelThree, jsonWriter);
        }
        if (hierarchyStructureUpdate.getLevelFour() != null) {
            HierarchyLevelUpdate levelFour = hierarchyStructureUpdate.getLevelFour();
            jsonWriter.name("LevelFour");
            HierarchyLevelUpdateJsonMarshaller.getInstance().marshall(levelFour, jsonWriter);
        }
        if (hierarchyStructureUpdate.getLevelFive() != null) {
            HierarchyLevelUpdate levelFive = hierarchyStructureUpdate.getLevelFive();
            jsonWriter.name("LevelFive");
            HierarchyLevelUpdateJsonMarshaller.getInstance().marshall(levelFive, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HierarchyStructureUpdateJsonMarshaller instance;

    public static HierarchyStructureUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HierarchyStructureUpdateJsonMarshaller();
        return instance;
    }
}
