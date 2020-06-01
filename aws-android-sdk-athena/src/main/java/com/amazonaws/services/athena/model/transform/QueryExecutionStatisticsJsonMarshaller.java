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
 * JSON marshaller for POJO QueryExecutionStatistics
 */
class QueryExecutionStatisticsJsonMarshaller {

    public void marshall(QueryExecutionStatistics queryExecutionStatistics, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (queryExecutionStatistics.getEngineExecutionTimeInMillis() != null) {
            Long engineExecutionTimeInMillis = queryExecutionStatistics
                    .getEngineExecutionTimeInMillis();
            jsonWriter.name("EngineExecutionTimeInMillis");
            jsonWriter.value(engineExecutionTimeInMillis);
        }
        if (queryExecutionStatistics.getDataScannedInBytes() != null) {
            Long dataScannedInBytes = queryExecutionStatistics.getDataScannedInBytes();
            jsonWriter.name("DataScannedInBytes");
            jsonWriter.value(dataScannedInBytes);
        }
        if (queryExecutionStatistics.getDataManifestLocation() != null) {
            String dataManifestLocation = queryExecutionStatistics.getDataManifestLocation();
            jsonWriter.name("DataManifestLocation");
            jsonWriter.value(dataManifestLocation);
        }
        if (queryExecutionStatistics.getTotalExecutionTimeInMillis() != null) {
            Long totalExecutionTimeInMillis = queryExecutionStatistics
                    .getTotalExecutionTimeInMillis();
            jsonWriter.name("TotalExecutionTimeInMillis");
            jsonWriter.value(totalExecutionTimeInMillis);
        }
        if (queryExecutionStatistics.getQueryQueueTimeInMillis() != null) {
            Long queryQueueTimeInMillis = queryExecutionStatistics.getQueryQueueTimeInMillis();
            jsonWriter.name("QueryQueueTimeInMillis");
            jsonWriter.value(queryQueueTimeInMillis);
        }
        if (queryExecutionStatistics.getQueryPlanningTimeInMillis() != null) {
            Long queryPlanningTimeInMillis = queryExecutionStatistics
                    .getQueryPlanningTimeInMillis();
            jsonWriter.name("QueryPlanningTimeInMillis");
            jsonWriter.value(queryPlanningTimeInMillis);
        }
        if (queryExecutionStatistics.getServiceProcessingTimeInMillis() != null) {
            Long serviceProcessingTimeInMillis = queryExecutionStatistics
                    .getServiceProcessingTimeInMillis();
            jsonWriter.name("ServiceProcessingTimeInMillis");
            jsonWriter.value(serviceProcessingTimeInMillis);
        }
        jsonWriter.endObject();
    }

    private static QueryExecutionStatisticsJsonMarshaller instance;

    public static QueryExecutionStatisticsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueryExecutionStatisticsJsonMarshaller();
        return instance;
    }
}
