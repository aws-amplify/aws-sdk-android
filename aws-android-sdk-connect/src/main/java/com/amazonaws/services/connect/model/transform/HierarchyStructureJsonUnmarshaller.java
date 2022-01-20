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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HierarchyStructure
 */
class HierarchyStructureJsonUnmarshaller implements
        Unmarshaller<HierarchyStructure, JsonUnmarshallerContext> {

    public HierarchyStructure unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HierarchyStructure hierarchyStructure = new HierarchyStructure();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LevelOne")) {
                hierarchyStructure.setLevelOne(HierarchyLevelJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelTwo")) {
                hierarchyStructure.setLevelTwo(HierarchyLevelJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelThree")) {
                hierarchyStructure.setLevelThree(HierarchyLevelJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelFour")) {
                hierarchyStructure.setLevelFour(HierarchyLevelJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelFive")) {
                hierarchyStructure.setLevelFive(HierarchyLevelJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hierarchyStructure;
    }

    private static HierarchyStructureJsonUnmarshaller instance;

    public static HierarchyStructureJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HierarchyStructureJsonUnmarshaller();
        return instance;
    }
}
