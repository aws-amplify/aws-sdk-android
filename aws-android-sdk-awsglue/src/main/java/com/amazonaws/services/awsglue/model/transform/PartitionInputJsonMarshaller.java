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
 * JSON marshaller for POJO PartitionInput
 */
class PartitionInputJsonMarshaller {

    public void marshall(PartitionInput partitionInput, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (partitionInput.getValues() != null) {
            java.util.List<String> values = partitionInput.getValues();
            jsonWriter.name("Values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (partitionInput.getLastAccessTime() != null) {
            java.util.Date lastAccessTime = partitionInput.getLastAccessTime();
            jsonWriter.name("LastAccessTime");
            jsonWriter.value(lastAccessTime);
        }
        if (partitionInput.getStorageDescriptor() != null) {
            StorageDescriptor storageDescriptor = partitionInput.getStorageDescriptor();
            jsonWriter.name("StorageDescriptor");
            StorageDescriptorJsonMarshaller.getInstance().marshall(storageDescriptor, jsonWriter);
        }
        if (partitionInput.getParameters() != null) {
            java.util.Map<String, String> parameters = partitionInput.getParameters();
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
        if (partitionInput.getLastAnalyzedTime() != null) {
            java.util.Date lastAnalyzedTime = partitionInput.getLastAnalyzedTime();
            jsonWriter.name("LastAnalyzedTime");
            jsonWriter.value(lastAnalyzedTime);
        }
        jsonWriter.endObject();
    }

    private static PartitionInputJsonMarshaller instance;

    public static PartitionInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PartitionInputJsonMarshaller();
        return instance;
    }
}
