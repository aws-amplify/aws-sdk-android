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
 * JSON marshaller for POJO HierarchyGroup
 */
class HierarchyGroupJsonMarshaller {

    public void marshall(HierarchyGroup hierarchyGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hierarchyGroup.getId() != null) {
            String id = hierarchyGroup.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (hierarchyGroup.getArn() != null) {
            String arn = hierarchyGroup.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (hierarchyGroup.getName() != null) {
            String name = hierarchyGroup.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (hierarchyGroup.getLevelId() != null) {
            String levelId = hierarchyGroup.getLevelId();
            jsonWriter.name("LevelId");
            jsonWriter.value(levelId);
        }
        if (hierarchyGroup.getHierarchyPath() != null) {
            HierarchyPath hierarchyPath = hierarchyGroup.getHierarchyPath();
            jsonWriter.name("HierarchyPath");
            HierarchyPathJsonMarshaller.getInstance().marshall(hierarchyPath, jsonWriter);
        }
        if (hierarchyGroup.getTags() != null) {
            java.util.Map<String, String> tags = hierarchyGroup.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static HierarchyGroupJsonMarshaller instance;

    public static HierarchyGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HierarchyGroupJsonMarshaller();
        return instance;
    }
}
