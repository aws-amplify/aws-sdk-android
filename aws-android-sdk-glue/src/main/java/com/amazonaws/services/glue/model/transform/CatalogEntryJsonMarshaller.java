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
 * JSON marshaller for POJO CatalogEntry
 */
class CatalogEntryJsonMarshaller {

    public void marshall(CatalogEntry catalogEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (catalogEntry.getDatabaseName() != null) {
            String databaseName = catalogEntry.getDatabaseName();
            jsonWriter.name("DatabaseName");
            jsonWriter.value(databaseName);
        }
        if (catalogEntry.getTableName() != null) {
            String tableName = catalogEntry.getTableName();
            jsonWriter.name("TableName");
            jsonWriter.value(tableName);
        }
        jsonWriter.endObject();
    }

    private static CatalogEntryJsonMarshaller instance;

    public static CatalogEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CatalogEntryJsonMarshaller();
        return instance;
    }
}
