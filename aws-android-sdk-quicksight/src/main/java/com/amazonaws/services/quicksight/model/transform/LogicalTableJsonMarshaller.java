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
 * JSON marshaller for POJO LogicalTable
 */
class LogicalTableJsonMarshaller {

    public void marshall(LogicalTable logicalTable, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (logicalTable.getAlias() != null) {
            String alias = logicalTable.getAlias();
            jsonWriter.name("Alias");
            jsonWriter.value(alias);
        }
        if (logicalTable.getDataTransforms() != null) {
            java.util.List<TransformOperation> dataTransforms = logicalTable.getDataTransforms();
            jsonWriter.name("DataTransforms");
            jsonWriter.beginArray();
            for (TransformOperation dataTransformsItem : dataTransforms) {
                if (dataTransformsItem != null) {
                    TransformOperationJsonMarshaller.getInstance().marshall(dataTransformsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (logicalTable.getSource() != null) {
            LogicalTableSource source = logicalTable.getSource();
            jsonWriter.name("Source");
            LogicalTableSourceJsonMarshaller.getInstance().marshall(source, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LogicalTableJsonMarshaller instance;

    public static LogicalTableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogicalTableJsonMarshaller();
        return instance;
    }
}
