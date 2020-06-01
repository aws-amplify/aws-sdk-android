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
 * JSON marshaller for POJO TableMetadata
 */
class TableMetadataJsonMarshaller {

    public void marshall(TableMetadata tableMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tableMetadata.getName() != null) {
            String name = tableMetadata.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (tableMetadata.getCreateTime() != null) {
            java.util.Date createTime = tableMetadata.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (tableMetadata.getLastAccessTime() != null) {
            java.util.Date lastAccessTime = tableMetadata.getLastAccessTime();
            jsonWriter.name("LastAccessTime");
            jsonWriter.value(lastAccessTime);
        }
        if (tableMetadata.getTableType() != null) {
            String tableType = tableMetadata.getTableType();
            jsonWriter.name("TableType");
            jsonWriter.value(tableType);
        }
        if (tableMetadata.getColumns() != null) {
            java.util.List<Column> columns = tableMetadata.getColumns();
            jsonWriter.name("Columns");
            jsonWriter.beginArray();
            for (Column columnsItem : columns) {
                if (columnsItem != null) {
                    ColumnJsonMarshaller.getInstance().marshall(columnsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tableMetadata.getPartitionKeys() != null) {
            java.util.List<Column> partitionKeys = tableMetadata.getPartitionKeys();
            jsonWriter.name("PartitionKeys");
            jsonWriter.beginArray();
            for (Column partitionKeysItem : partitionKeys) {
                if (partitionKeysItem != null) {
                    ColumnJsonMarshaller.getInstance().marshall(partitionKeysItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tableMetadata.getParameters() != null) {
            java.util.Map<String, String> parameters = tableMetadata.getParameters();
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

    private static TableMetadataJsonMarshaller instance;

    public static TableMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableMetadataJsonMarshaller();
        return instance;
    }
}
