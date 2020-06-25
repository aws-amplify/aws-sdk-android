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
 * JSON marshaller for POJO GlueTable
 */
class GlueTableJsonMarshaller {

    public void marshall(GlueTable glueTable, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (glueTable.getDatabaseName() != null) {
            String databaseName = glueTable.getDatabaseName();
            jsonWriter.name("DatabaseName");
            jsonWriter.value(databaseName);
        }
        if (glueTable.getTableName() != null) {
            String tableName = glueTable.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        if (glueTable.getCatalogId() != null) {
            String catalogId = glueTable.getCatalogId();
            jsonWriter.name("CatalogId");
            jsonWriter.value(catalogId);
        }
        if (glueTable.getConnectionName() != null) {
            String connectionName = glueTable.getConnectionName();
            jsonWriter.name("ConnectionName");
            jsonWriter.value(connectionName);
        }
        jsonWriter.endObject();
    }

    private static GlueTableJsonMarshaller instance;

    public static GlueTableJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GlueTableJsonMarshaller();
        return instance;
    }
}
