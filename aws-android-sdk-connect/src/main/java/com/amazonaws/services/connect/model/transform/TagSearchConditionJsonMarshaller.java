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
 * JSON marshaller for POJO TagSearchCondition
 */
class TagSearchConditionJsonMarshaller {

    public void marshall(TagSearchCondition tagSearchCondition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tagSearchCondition.getTagKey() != null) {
            String tagKey = tagSearchCondition.getTagKey();
            jsonWriter.name("tagKey");
            jsonWriter.value(tagKey);
        }
        if (tagSearchCondition.getTagValue() != null) {
            String tagValue = tagSearchCondition.getTagValue();
            jsonWriter.name("tagValue");
            jsonWriter.value(tagValue);
        }
        if (tagSearchCondition.getTagKeyComparisonType() != null) {
            String tagKeyComparisonType = tagSearchCondition.getTagKeyComparisonType();
            jsonWriter.name("tagKeyComparisonType");
            jsonWriter.value(tagKeyComparisonType);
        }
        if (tagSearchCondition.getTagValueComparisonType() != null) {
            String tagValueComparisonType = tagSearchCondition.getTagValueComparisonType();
            jsonWriter.name("tagValueComparisonType");
            jsonWriter.value(tagValueComparisonType);
        }
        jsonWriter.endObject();
    }

    private static TagSearchConditionJsonMarshaller instance;

    public static TagSearchConditionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagSearchConditionJsonMarshaller();
        return instance;
    }
}
