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
 * JSON marshaller for POJO StringCondition
 */
class StringConditionJsonMarshaller {

    public void marshall(StringCondition stringCondition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (stringCondition.getFieldName() != null) {
            String fieldName = stringCondition.getFieldName();
            jsonWriter.name("FieldName");
            jsonWriter.value(fieldName);
        }
        if (stringCondition.getValue() != null) {
            String value = stringCondition.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (stringCondition.getComparisonType() != null) {
            String comparisonType = stringCondition.getComparisonType();
            jsonWriter.name("ComparisonType");
            jsonWriter.value(comparisonType);
        }
        jsonWriter.endObject();
    }

    private static StringConditionJsonMarshaller instance;

    public static StringConditionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StringConditionJsonMarshaller();
        return instance;
    }
}
