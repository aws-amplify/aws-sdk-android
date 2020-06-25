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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Column
 */
class ColumnJsonMarshaller {

    public void marshall(Column column, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (column.getName() != null) {
            String name = column.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (column.getType() != null) {
            String type = column.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (column.getComment() != null) {
            String comment = column.getComment();
            jsonWriter.name("Comment");
            jsonWriter.value(comment);
        }
        if (column.getParameters() != null) {
            java.util.Map<String, String> parameters = column.getParameters();
            jsonWriter.name("Parameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> parametersEntry : parameters.entrySet()) {
                String parametersValue = parametersEntry.getValue();
                if (parametersValue != null) {
                    jsonWriter.name(parametersEntry.getKey());
                    jsonWriter.value(parametersValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ColumnJsonMarshaller instance;

    public static ColumnJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ColumnJsonMarshaller();
        return instance;
    }
}
