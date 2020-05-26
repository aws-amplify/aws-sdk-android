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
 * JSON marshaller for POJO ColumnSchema
 */
class ColumnSchemaJsonMarshaller {

    public void marshall(ColumnSchema columnSchema, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (columnSchema.getName() != null) {
            String name = columnSchema.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (columnSchema.getDataType() != null) {
            String dataType = columnSchema.getDataType();
            jsonWriter.name("DataType");
            jsonWriter.value(dataType);
        }
        if (columnSchema.getGeographicRole() != null) {
            String geographicRole = columnSchema.getGeographicRole();
            jsonWriter.name("GeographicRole");
            jsonWriter.value(geographicRole);
        }
        jsonWriter.endObject();
    }

    private static ColumnSchemaJsonMarshaller instance;

    public static ColumnSchemaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ColumnSchemaJsonMarshaller();
        return instance;
    }
}
