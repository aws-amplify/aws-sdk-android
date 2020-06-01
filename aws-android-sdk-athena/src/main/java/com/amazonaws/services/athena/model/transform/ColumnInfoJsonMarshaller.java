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

package com.amazonaws.services.athena.model.transform;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ColumnInfo
 */
class ColumnInfoJsonMarshaller {

    public void marshall(ColumnInfo columnInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (columnInfo.getCatalogName() != null) {
            String catalogName = columnInfo.getCatalogName();
            jsonWriter.name("CatalogName");
            jsonWriter.value(catalogName);
        }
        if (columnInfo.getSchemaName() != null) {
            String schemaName = columnInfo.getSchemaName();
            jsonWriter.name("SchemaName");
            jsonWriter.value(schemaName);
        }
        if (columnInfo.getTableName() != null) {
            String tableName = columnInfo.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (columnInfo.getName() != null) {
            String name = columnInfo.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (columnInfo.getLabel() != null) {
            String label = columnInfo.getLabel();
            jsonWriter.name("Label");
            jsonWriter.value(label);
        }
        if (columnInfo.getType() != null) {
            String type = columnInfo.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (columnInfo.getPrecision() != null) {
            Integer precision = columnInfo.getPrecision();
            jsonWriter.name("Precision");
            jsonWriter.value(precision);
        }
        if (columnInfo.getScale() != null) {
            Integer scale = columnInfo.getScale();
            jsonWriter.name("Scale");
            jsonWriter.value(scale);
        }
        if (columnInfo.getNullable() != null) {
            String nullable = columnInfo.getNullable();
            jsonWriter.name("Nullable");
            jsonWriter.value(nullable);
        }
        if (columnInfo.getCaseSensitive() != null) {
            Boolean caseSensitive = columnInfo.getCaseSensitive();
            jsonWriter.name("CaseSensitive");
            jsonWriter.value(caseSensitive);
        }
        jsonWriter.endObject();
    }

    private static ColumnInfoJsonMarshaller instance;

    public static ColumnInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ColumnInfoJsonMarshaller();
        return instance;
    }
}
