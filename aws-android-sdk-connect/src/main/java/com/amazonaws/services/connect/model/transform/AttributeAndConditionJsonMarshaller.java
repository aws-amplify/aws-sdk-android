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
 * JSON marshaller for POJO AttributeAndCondition
 */
class AttributeAndConditionJsonMarshaller {

    public void marshall(AttributeAndCondition attributeAndCondition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (attributeAndCondition.getTagConditions() != null) {
            java.util.List<TagCondition> tagConditions = attributeAndCondition.getTagConditions();
            jsonWriter.name("TagConditions");
            jsonWriter.beginArray();
            for (TagCondition tagConditionsItem : tagConditions) {
                if (tagConditionsItem != null) {
                    TagConditionJsonMarshaller.getInstance()
                            .marshall(tagConditionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (attributeAndCondition.getHierarchyGroupCondition() != null) {
            HierarchyGroupCondition hierarchyGroupCondition = attributeAndCondition
                    .getHierarchyGroupCondition();
            jsonWriter.name("HierarchyGroupCondition");
            HierarchyGroupConditionJsonMarshaller.getInstance().marshall(hierarchyGroupCondition,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AttributeAndConditionJsonMarshaller instance;

    public static AttributeAndConditionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributeAndConditionJsonMarshaller();
        return instance;
    }
}
