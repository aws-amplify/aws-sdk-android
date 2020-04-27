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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TableToReload
 */
class TableToReloadJsonMarshaller {

    public void marshall(TableToReload tableToReload, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (tableToReload.getSchemaName() != null) {
            String schemaName = tableToReload.getSchemaName();
            jsonWriter.name("SchemaName");
            jsonWriter.value(schemaName);
        }
        if (tableToReload.getTableName() != null) {
            String tableName = tableToReload.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        jsonWriter.endObject();
    }

    private static TableToReloadJsonMarshaller instance;

    public static TableToReloadJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TableToReloadJsonMarshaller();
        return instance;
    }
}
