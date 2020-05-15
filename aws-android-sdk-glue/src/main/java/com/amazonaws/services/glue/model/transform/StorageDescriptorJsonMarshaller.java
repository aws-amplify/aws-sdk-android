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
 * JSON marshaller for POJO StorageDescriptor
 */
class StorageDescriptorJsonMarshaller {

    public void marshall(StorageDescriptor storageDescriptor, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (storageDescriptor.getColumns() != null) {
            java.util.List<Column> columns = storageDescriptor.getColumns();
            jsonWriter.name("Columns");
            jsonWriter.beginArray();
            for (Column columnsItem : columns) {
                if (columnsItem != null) {
                    ColumnJsonMarshaller.getInstance().marshall(columnsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (storageDescriptor.getLocation() != null) {
            String location = storageDescriptor.getLocation();
            jsonWriter.name("Location");
            jsonWriter.value(location);
        }
        if (storageDescriptor.getInputFormat() != null) {
            String inputFormat = storageDescriptor.getInputFormat();
            jsonWriter.name("InputFormat");
            jsonWriter.value(inputFormat);
        }
        if (storageDescriptor.getOutputFormat() != null) {
            String outputFormat = storageDescriptor.getOutputFormat();
            jsonWriter.name("OutputFormat");
            jsonWriter.value(outputFormat);
        }
        if (storageDescriptor.getCompressed() != null) {
            Boolean compressed = storageDescriptor.getCompressed();
            jsonWriter.name("Compressed");
            jsonWriter.value(compressed);
        }
        if (storageDescriptor.getNumberOfBuckets() != null) {
            Integer numberOfBuckets = storageDescriptor.getNumberOfBuckets();
            jsonWriter.name("NumberOfBuckets");
            jsonWriter.value(numberOfBuckets);
        }
        if (storageDescriptor.getSerdeInfo() != null) {
            SerDeInfo serdeInfo = storageDescriptor.getSerdeInfo();
            jsonWriter.name("SerdeInfo");
            SerDeInfoJsonMarshaller.getInstance().marshall(serdeInfo, jsonWriter);
        }
        if (storageDescriptor.getBucketColumns() != null) {
            java.util.List<String> bucketColumns = storageDescriptor.getBucketColumns();
            jsonWriter.name("BucketColumns");
            jsonWriter.beginArray();
            for (String bucketColumnsItem : bucketColumns) {
                if (bucketColumnsItem != null) {
                    jsonWriter.value(bucketColumnsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (storageDescriptor.getSortColumns() != null) {
            java.util.List<Order> sortColumns = storageDescriptor.getSortColumns();
            jsonWriter.name("SortColumns");
            jsonWriter.beginArray();
            for (Order sortColumnsItem : sortColumns) {
                if (sortColumnsItem != null) {
                    OrderJsonMarshaller.getInstance().marshall(sortColumnsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (storageDescriptor.getParameters() != null) {
            java.util.Map<String, String> parameters = storageDescriptor.getParameters();
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
        if (storageDescriptor.getSkewedInfo() != null) {
            SkewedInfo skewedInfo = storageDescriptor.getSkewedInfo();
            jsonWriter.name("SkewedInfo");
            SkewedInfoJsonMarshaller.getInstance().marshall(skewedInfo, jsonWriter);
        }
        if (storageDescriptor.getStoredAsSubDirectories() != null) {
            Boolean storedAsSubDirectories = storageDescriptor.getStoredAsSubDirectories();
            jsonWriter.name("StoredAsSubDirectories");
            jsonWriter.value(storedAsSubDirectories);
        }
        jsonWriter.endObject();
    }

    private static StorageDescriptorJsonMarshaller instance;

    public static StorageDescriptorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StorageDescriptorJsonMarshaller();
        return instance;
    }
}
