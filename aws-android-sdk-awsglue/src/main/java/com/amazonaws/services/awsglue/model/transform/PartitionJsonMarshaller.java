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
 * JSON marshaller for POJO Partition
 */
class PartitionJsonMarshaller {

    public void marshall(Partition partition, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (partition.getValues() != null) {
            java.util.List<String> values = partition.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (partition.getDatabaseName() != null) {
            String databaseName = partition.getDatabaseName();
            jsonWriter.name("DatabaseName");
            jsonWriter.value(databaseName);
        }
        if (partition.getTableName() != null) {
            String tableName = partition.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (partition.getCreationTime() != null) {
            java.util.Date creationTime = partition.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (partition.getLastAccessTime() != null) {
            java.util.Date lastAccessTime = partition.getLastAccessTime();
            jsonWriter.name("LastAccessTime");
            jsonWriter.value(lastAccessTime);
        }
        if (partition.getStorageDescriptor() != null) {
            StorageDescriptor storageDescriptor = partition.getStorageDescriptor();
            jsonWriter.name("StorageDescriptor");
            StorageDescriptorJsonMarshaller.getInstance().marshall(storageDescriptor, jsonWriter);
        }
        if (partition.getParameters() != null) {
            java.util.Map<String, String> parameters = partition.getParameters();
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
        if (partition.getLastAnalyzedTime() != null) {
            java.util.Date lastAnalyzedTime = partition.getLastAnalyzedTime();
            jsonWriter.name("LastAnalyzedTime");
            jsonWriter.value(lastAnalyzedTime);
        }
        jsonWriter.endObject();
    }

    private static PartitionJsonMarshaller instance;

    public static PartitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PartitionJsonMarshaller();
        return instance;
    }
}
