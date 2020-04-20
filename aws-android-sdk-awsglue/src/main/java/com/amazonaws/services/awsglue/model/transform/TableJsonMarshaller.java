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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Table
 */
class TableJsonMarshaller {

    public void marshall(Table table, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (table.getName() != null) {
            String name = table.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (table.getDatabaseName() != null) {
            String databaseName = table.getDatabaseName();
            jsonWriter.name("DatabaseName");
            jsonWriter.value(databaseName);
        }
        if (table.getDescription() != null) {
            String description = table.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (table.getOwner() != null) {
            String owner = table.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (table.getCreateTime() != null) {
            java.util.Date createTime = table.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (table.getUpdateTime() != null) {
            java.util.Date updateTime = table.getUpdateTime();
            jsonWriter.name("UpdateTime");
            jsonWriter.value(updateTime);
        }
        if (table.getLastAccessTime() != null) {
            java.util.Date lastAccessTime = table.getLastAccessTime();
            jsonWriter.name("LastAccessTime");
            jsonWriter.value(lastAccessTime);
        }
        if (table.getLastAnalyzedTime() != null) {
            java.util.Date lastAnalyzedTime = table.getLastAnalyzedTime();
            jsonWriter.name("LastAnalyzedTime");
            jsonWriter.value(lastAnalyzedTime);
        }
        if (table.getRetention() != null) {
            Integer retention = table.getRetention();
            jsonWriter.name("Retention");
            jsonWriter.value(retention);
        }
        if (table.getStorageDescriptor() != null) {
            StorageDescriptor storageDescriptor = table.getStorageDescriptor();
            jsonWriter.name("StorageDescriptor");
            StorageDescriptorJsonMarshaller.getInstance().marshall(storageDescriptor, jsonWriter);
        }
        if (table.getPartitionKeys() != null) {
            java.util.List<Column> partitionKeys = table.getPartitionKeys();
            jsonWriter.name("PartitionKeys");
            jsonWriter.beginArray();
            for (Column partitionKeysItem : partitionKeys) {
                if (partitionKeysItem != null) {
                    ColumnJsonMarshaller.getInstance().marshall(partitionKeysItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (table.getViewOriginalText() != null) {
            String viewOriginalText = table.getViewOriginalText();
            jsonWriter.name("ViewOriginalText");
            jsonWriter.value(viewOriginalText);
        }
        if (table.getViewExpandedText() != null) {
            String viewExpandedText = table.getViewExpandedText();
            jsonWriter.name("ViewExpandedText");
            jsonWriter.value(viewExpandedText);
        }
        if (table.getTableType() != null) {
            String tableType = table.getTableType();
            jsonWriter.name("TableType");
            jsonWriter.value(tableType);
        }
        if (table.getParameters() != null) {
            java.util.Map<String, String> parameters = table.getParameters();
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
        if (table.getCreatedBy() != null) {
            String createdBy = table.getCreatedBy();
            jsonWriter.name("CreatedBy");
            jsonWriter.value(createdBy);
        }
        if (table.getIsRegisteredWithLakeFormation() != null) {
            Boolean isRegisteredWithLakeFormation = table.getIsRegisteredWithLakeFormation();
            jsonWriter.name("IsRegisteredWithLakeFormation");
            jsonWriter.value(isRegisteredWithLakeFormation);
        }
        jsonWriter.endObject();
    }

    private static TableJsonMarshaller instance;

    public static TableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableJsonMarshaller();
        return instance;
    }
}
