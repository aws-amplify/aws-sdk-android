/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO HierarchyPathReference
 */
class HierarchyPathReferenceJsonUnmarshaller implements
        Unmarshaller<HierarchyPathReference, JsonUnmarshallerContext> {

    public HierarchyPathReference unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HierarchyPathReference hierarchyPathReference = new HierarchyPathReference();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LevelOne")) {
                hierarchyPathReference.setLevelOne(HierarchyGroupSummaryReferenceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelTwo")) {
                hierarchyPathReference.setLevelTwo(HierarchyGroupSummaryReferenceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelThree")) {
                hierarchyPathReference.setLevelThree(HierarchyGroupSummaryReferenceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelFour")) {
                hierarchyPathReference.setLevelFour(HierarchyGroupSummaryReferenceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LevelFive")) {
                hierarchyPathReference.setLevelFive(HierarchyGroupSummaryReferenceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hierarchyPathReference;
    }

    private static HierarchyPathReferenceJsonUnmarshaller instance;

    public static HierarchyPathReferenceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HierarchyPathReferenceJsonUnmarshaller();
        return instance;
    }
}
