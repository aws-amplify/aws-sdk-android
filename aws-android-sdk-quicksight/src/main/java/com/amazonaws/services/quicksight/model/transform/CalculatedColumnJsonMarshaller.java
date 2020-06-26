/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CalculatedColumn
 */
class CalculatedColumnJsonMarshaller {

    public void marshall(CalculatedColumn calculatedColumn, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (calculatedColumn.getColumnName() != null) {
            String columnName = calculatedColumn.getColumnName();
            jsonWriter.name("ColumnName");
            jsonWriter.value(columnName);
        }
        if (calculatedColumn.getColumnId() != null) {
            String columnId = calculatedColumn.getColumnId();
            jsonWriter.name("ColumnId");
            jsonWriter.value(columnId);
        }
        if (calculatedColumn.getExpression() != null) {
            String expression = calculatedColumn.getExpression();
            jsonWriter.name("Expression");
            jsonWriter.value(expression);
        }
        jsonWriter.endObject();
    }

    private static CalculatedColumnJsonMarshaller instance;

    public static CalculatedColumnJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CalculatedColumnJsonMarshaller();
        return instance;
    }
}
