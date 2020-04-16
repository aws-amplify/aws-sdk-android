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
 * JSON marshaller for POJO TableInput
 */
class TableInputJsonMarshaller {

    public void marshall(TableInput tableInput, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tableInput.getName() != null) {
            String name = tableInput.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (tableInput.getDescription() != null) {
            String description = tableInput.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (tableInput.getOwner() != null) {
            String owner = tableInput.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (tableInput.getLastAccessTime() != null) {
            java.util.Date lastAccessTime = tableInput.getLastAccessTime();
            jsonWriter.name("LastAccessTime");
            jsonWriter.value(lastAccessTime);
        }
        if (tableInput.getLastAnalyzedTime() != null) {
            java.util.Date lastAnalyzedTime = tableInput.getLastAnalyzedTime();
            jsonWriter.name("LastAnalyzedTime");
            jsonWriter.value(lastAnalyzedTime);
        }
        if (tableInput.getRetention() != null) {
            Integer retention = tableInput.getRetention();
            jsonWriter.name("Retention");
            jsonWriter.value(retention);
        }
        if (tableInput.getStorageDescriptor() != null) {
            StorageDescriptor storageDescriptor = tableInput.getStorageDescriptor();
            jsonWriter.name("StorageDescriptor");
            StorageDescriptorJsonMarshaller.getInstance().marshall(storageDescriptor, jsonWriter);
        }
        if (tableInput.getPartitionKeys() != null) {
            java.util.List<Column> partitionKeys = tableInput.getPartitionKeys();
            jsonWriter.name("PartitionKeys");
            jsonWriter.beginArray();
            for (Column partitionKeysItem : partitionKeys) {
                if (partitionKeysItem != null) {
                    ColumnJsonMarshaller.getInstance().marshall(partitionKeysItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (tableInput.getViewOriginalText() != null) {
            String viewOriginalText = tableInput.getViewOriginalText();
            jsonWriter.name("ViewOriginalText");
            jsonWriter.value(viewOriginalText);
        }
        if (tableInput.getViewExpandedText() != null) {
            String viewExpandedText = tableInput.getViewExpandedText();
            jsonWriter.name("ViewExpandedText");
            jsonWriter.value(viewExpandedText);
        }
        if (tableInput.getTableType() != null) {
            String tableType = tableInput.getTableType();
            jsonWriter.name("TableType");
            jsonWriter.value(tableType);
        }
        if (tableInput.getParameters() != null) {
            java.util.Map<String, String> parameters = tableInput.getParameters();
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

    private static TableInputJsonMarshaller instance;

    public static TableInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableInputJsonMarshaller();
        return instance;
    }
}
