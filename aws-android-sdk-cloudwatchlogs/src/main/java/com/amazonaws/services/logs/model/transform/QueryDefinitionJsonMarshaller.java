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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO QueryDefinition
 */
class QueryDefinitionJsonMarshaller {

    public void marshall(QueryDefinition queryDefinition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (queryDefinition.getQueryDefinitionId() != null) {
            String queryDefinitionId = queryDefinition.getQueryDefinitionId();
            jsonWriter.name("queryDefinitionId");
            jsonWriter.value(queryDefinitionId);
        }
        if (queryDefinition.getName() != null) {
            String name = queryDefinition.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (queryDefinition.getQueryString() != null) {
            String queryString = queryDefinition.getQueryString();
            jsonWriter.name("queryString");
            jsonWriter.value(queryString);
        }
        if (queryDefinition.getLastModified() != null) {
            Long lastModified = queryDefinition.getLastModified();
            jsonWriter.name("lastModified");
            jsonWriter.value(lastModified);
        }
        if (queryDefinition.getLogGroupNames() != null) {
            java.util.List<String> logGroupNames = queryDefinition.getLogGroupNames();
            jsonWriter.name("logGroupNames");
            jsonWriter.beginArray();
            for (String logGroupNamesItem : logGroupNames) {
                if (logGroupNamesItem != null) {
                    jsonWriter.value(logGroupNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static QueryDefinitionJsonMarshaller instance;

    public static QueryDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueryDefinitionJsonMarshaller();
        return instance;
    }
}
