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
 * JSON marshaller for POJO NamedQuery
 */
class NamedQueryJsonMarshaller {

    public void marshall(NamedQuery namedQuery, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (namedQuery.getName() != null) {
            String name = namedQuery.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (namedQuery.getDescription() != null) {
            String description = namedQuery.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (namedQuery.getDatabase() != null) {
            String database = namedQuery.getDatabase();
            jsonWriter.name("Database");
            jsonWriter.value(database);
        }
        if (namedQuery.getQueryString() != null) {
            String queryString = namedQuery.getQueryString();
            jsonWriter.name("QueryString");
            jsonWriter.value(queryString);
        }
        if (namedQuery.getNamedQueryId() != null) {
            String namedQueryId = namedQuery.getNamedQueryId();
            jsonWriter.name("NamedQueryId");
            jsonWriter.value(namedQueryId);
        }
        if (namedQuery.getWorkGroup() != null) {
            String workGroup = namedQuery.getWorkGroup();
            jsonWriter.name("WorkGroup");
            jsonWriter.value(workGroup);
        }
        jsonWriter.endObject();
    }

    private static NamedQueryJsonMarshaller instance;

    public static NamedQueryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NamedQueryJsonMarshaller();
        return instance;
    }
}
