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

package com.amazonaws.services.athena.model.transform;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO QueryExecutionContext
 */
class QueryExecutionContextJsonMarshaller {

    public void marshall(QueryExecutionContext queryExecutionContext, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (queryExecutionContext.getDatabase() != null) {
            String database = queryExecutionContext.getDatabase();
            jsonWriter.name("Database");
            jsonWriter.value(database);
        }
        if (queryExecutionContext.getCatalog() != null) {
            String catalog = queryExecutionContext.getCatalog();
            jsonWriter.name("Catalog");
            jsonWriter.value(catalog);
        }
        jsonWriter.endObject();
    }

    private static QueryExecutionContextJsonMarshaller instance;

    public static QueryExecutionContextJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueryExecutionContextJsonMarshaller();
        return instance;
    }
}
