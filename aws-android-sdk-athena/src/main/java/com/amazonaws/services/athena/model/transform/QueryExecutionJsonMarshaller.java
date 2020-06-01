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
 * JSON marshaller for POJO QueryExecution
 */
class QueryExecutionJsonMarshaller {

    public void marshall(QueryExecution queryExecution, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (queryExecution.getQueryExecutionId() != null) {
            String queryExecutionId = queryExecution.getQueryExecutionId();
            jsonWriter.name("QueryExecutionId");
            jsonWriter.value(queryExecutionId);
        }
        if (queryExecution.getQuery() != null) {
            String query = queryExecution.getQuery();
            jsonWriter.name("Query");
            jsonWriter.value(query);
        }
        if (queryExecution.getStatementType() != null) {
            String statementType = queryExecution.getStatementType();
            jsonWriter.name("StatementType");
            jsonWriter.value(statementType);
        }
        if (queryExecution.getResultConfiguration() != null) {
            ResultConfiguration resultConfiguration = queryExecution.getResultConfiguration();
            jsonWriter.name("ResultConfiguration");
            ResultConfigurationJsonMarshaller.getInstance().marshall(resultConfiguration,
                    jsonWriter);
        }
        if (queryExecution.getQueryExecutionContext() != null) {
            QueryExecutionContext queryExecutionContext = queryExecution.getQueryExecutionContext();
            jsonWriter.name("QueryExecutionContext");
            QueryExecutionContextJsonMarshaller.getInstance().marshall(queryExecutionContext,
                    jsonWriter);
        }
        if (queryExecution.getStatus() != null) {
            QueryExecutionStatus status = queryExecution.getStatus();
            jsonWriter.name("Status");
            QueryExecutionStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (queryExecution.getStatistics() != null) {
            QueryExecutionStatistics statistics = queryExecution.getStatistics();
            jsonWriter.name("Statistics");
            QueryExecutionStatisticsJsonMarshaller.getInstance().marshall(statistics, jsonWriter);
        }
        if (queryExecution.getWorkGroup() != null) {
            String workGroup = queryExecution.getWorkGroup();
            jsonWriter.name("WorkGroup");
            jsonWriter.value(workGroup);
        }
        jsonWriter.endObject();
    }

    private static QueryExecutionJsonMarshaller instance;

    public static QueryExecutionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueryExecutionJsonMarshaller();
        return instance;
    }
}
