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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HierarchyPathReference
 */
class HierarchyPathReferenceJsonMarshaller {

    public void marshall(HierarchyPathReference hierarchyPathReference, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hierarchyPathReference.getLevelOne() != null) {
            HierarchyGroupSummaryReference levelOne = hierarchyPathReference.getLevelOne();
            jsonWriter.name("LevelOne");
            HierarchyGroupSummaryReferenceJsonMarshaller.getInstance().marshall(levelOne,
                    jsonWriter);
        }
        if (hierarchyPathReference.getLevelTwo() != null) {
            HierarchyGroupSummaryReference levelTwo = hierarchyPathReference.getLevelTwo();
            jsonWriter.name("LevelTwo");
            HierarchyGroupSummaryReferenceJsonMarshaller.getInstance().marshall(levelTwo,
                    jsonWriter);
        }
        if (hierarchyPathReference.getLevelThree() != null) {
            HierarchyGroupSummaryReference levelThree = hierarchyPathReference.getLevelThree();
            jsonWriter.name("LevelThree");
            HierarchyGroupSummaryReferenceJsonMarshaller.getInstance().marshall(levelThree,
                    jsonWriter);
        }
        if (hierarchyPathReference.getLevelFour() != null) {
            HierarchyGroupSummaryReference levelFour = hierarchyPathReference.getLevelFour();
            jsonWriter.name("LevelFour");
            HierarchyGroupSummaryReferenceJsonMarshaller.getInstance().marshall(levelFour,
                    jsonWriter);
        }
        if (hierarchyPathReference.getLevelFive() != null) {
            HierarchyGroupSummaryReference levelFive = hierarchyPathReference.getLevelFive();
            jsonWriter.name("LevelFive");
            HierarchyGroupSummaryReferenceJsonMarshaller.getInstance().marshall(levelFive,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HierarchyPathReferenceJsonMarshaller instance;

    public static HierarchyPathReferenceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HierarchyPathReferenceJsonMarshaller();
        return instance;
    }
}
