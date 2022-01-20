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
 * JSON marshaller for POJO HierarchyStructure
 */
class HierarchyStructureJsonMarshaller {

    public void marshall(HierarchyStructure hierarchyStructure, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hierarchyStructure.getLevelOne() != null) {
            HierarchyLevel levelOne = hierarchyStructure.getLevelOne();
            jsonWriter.name("LevelOne");
            HierarchyLevelJsonMarshaller.getInstance().marshall(levelOne, jsonWriter);
        }
        if (hierarchyStructure.getLevelTwo() != null) {
            HierarchyLevel levelTwo = hierarchyStructure.getLevelTwo();
            jsonWriter.name("LevelTwo");
            HierarchyLevelJsonMarshaller.getInstance().marshall(levelTwo, jsonWriter);
        }
        if (hierarchyStructure.getLevelThree() != null) {
            HierarchyLevel levelThree = hierarchyStructure.getLevelThree();
            jsonWriter.name("LevelThree");
            HierarchyLevelJsonMarshaller.getInstance().marshall(levelThree, jsonWriter);
        }
        if (hierarchyStructure.getLevelFour() != null) {
            HierarchyLevel levelFour = hierarchyStructure.getLevelFour();
            jsonWriter.name("LevelFour");
            HierarchyLevelJsonMarshaller.getInstance().marshall(levelFour, jsonWriter);
        }
        if (hierarchyStructure.getLevelFive() != null) {
            HierarchyLevel levelFive = hierarchyStructure.getLevelFive();
            jsonWriter.name("LevelFive");
            HierarchyLevelJsonMarshaller.getInstance().marshall(levelFive, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HierarchyStructureJsonMarshaller instance;

    public static HierarchyStructureJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HierarchyStructureJsonMarshaller();
        return instance;
    }
}
