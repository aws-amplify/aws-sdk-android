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
 * JSON marshaller for POJO HierarchyPath
 */
class HierarchyPathJsonMarshaller {

    public void marshall(HierarchyPath hierarchyPath, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hierarchyPath.getLevelOne() != null) {
            HierarchyGroupSummary levelOne = hierarchyPath.getLevelOne();
            jsonWriter.name("LevelOne");
            HierarchyGroupSummaryJsonMarshaller.getInstance().marshall(levelOne, jsonWriter);
        }
        if (hierarchyPath.getLevelTwo() != null) {
            HierarchyGroupSummary levelTwo = hierarchyPath.getLevelTwo();
            jsonWriter.name("LevelTwo");
            HierarchyGroupSummaryJsonMarshaller.getInstance().marshall(levelTwo, jsonWriter);
        }
        if (hierarchyPath.getLevelThree() != null) {
            HierarchyGroupSummary levelThree = hierarchyPath.getLevelThree();
            jsonWriter.name("LevelThree");
            HierarchyGroupSummaryJsonMarshaller.getInstance().marshall(levelThree, jsonWriter);
        }
        if (hierarchyPath.getLevelFour() != null) {
            HierarchyGroupSummary levelFour = hierarchyPath.getLevelFour();
            jsonWriter.name("LevelFour");
            HierarchyGroupSummaryJsonMarshaller.getInstance().marshall(levelFour, jsonWriter);
        }
        if (hierarchyPath.getLevelFive() != null) {
            HierarchyGroupSummary levelFive = hierarchyPath.getLevelFive();
            jsonWriter.name("LevelFive");
            HierarchyGroupSummaryJsonMarshaller.getInstance().marshall(levelFive, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HierarchyPathJsonMarshaller instance;

    public static HierarchyPathJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HierarchyPathJsonMarshaller();
        return instance;
    }
}
