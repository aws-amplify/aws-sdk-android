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
 * JSON marshaller for POJO ColumnGroupSchema
 */
class ColumnGroupSchemaJsonMarshaller {

    public void marshall(ColumnGroupSchema columnGroupSchema, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (columnGroupSchema.getName() != null) {
            String name = columnGroupSchema.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (columnGroupSchema.getColumnGroupColumnSchemaList() != null) {
            java.util.List<ColumnGroupColumnSchema> columnGroupColumnSchemaList = columnGroupSchema
                    .getColumnGroupColumnSchemaList();
            jsonWriter.name("ColumnGroupColumnSchemaList");
            jsonWriter.beginArray();
            for (ColumnGroupColumnSchema columnGroupColumnSchemaListItem : columnGroupColumnSchemaList) {
                if (columnGroupColumnSchemaListItem != null) {
                    ColumnGroupColumnSchemaJsonMarshaller.getInstance().marshall(
                            columnGroupColumnSchemaListItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ColumnGroupSchemaJsonMarshaller instance;

    public static ColumnGroupSchemaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ColumnGroupSchemaJsonMarshaller();
        return instance;
    }
}
