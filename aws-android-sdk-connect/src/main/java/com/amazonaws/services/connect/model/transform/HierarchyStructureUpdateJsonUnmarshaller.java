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
 * JSON unmarshaller for POJO HierarchyStructureUpdate
 */
class HierarchyStructureUpdateJsonUnmarshaller implements
        Unmarshaller<HierarchyStructureUpdate, JsonUnmarshallerContext> {

    public HierarchyStructureUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HierarchyStructureUpdate hierarchyStructureUpdate = new HierarchyStructureUpdate();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LevelOne")) {
                hierarchyStructureUpdate.setLevelOne(HierarchyLevelUpdateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelTwo")) {
                hierarchyStructureUpdate.setLevelTwo(HierarchyLevelUpdateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelThree")) {
                hierarchyStructureUpdate.setLevelThree(HierarchyLevelUpdateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelFour")) {
                hierarchyStructureUpdate.setLevelFour(HierarchyLevelUpdateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelFive")) {
                hierarchyStructureUpdate.setLevelFive(HierarchyLevelUpdateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hierarchyStructureUpdate;
    }

    private static HierarchyStructureUpdateJsonUnmarshaller instance;

    public static HierarchyStructureUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HierarchyStructureUpdateJsonUnmarshaller();
        return instance;
    }
}
