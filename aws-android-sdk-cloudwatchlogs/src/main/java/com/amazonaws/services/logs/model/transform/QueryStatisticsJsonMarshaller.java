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
 * JSON marshaller for POJO QueryStatistics
 */
class QueryStatisticsJsonMarshaller {

    public void marshall(QueryStatistics queryStatistics, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (queryStatistics.getRecordsMatched() != null) {
            Double recordsMatched = queryStatistics.getRecordsMatched();
            jsonWriter.name("recordsMatched");
            jsonWriter.value(recordsMatched);
        }
        if (queryStatistics.getRecordsScanned() != null) {
            Double recordsScanned = queryStatistics.getRecordsScanned();
            jsonWriter.name("recordsScanned");
            jsonWriter.value(recordsScanned);
        }
        if (queryStatistics.getBytesScanned() != null) {
            Double bytesScanned = queryStatistics.getBytesScanned();
            jsonWriter.name("bytesScanned");
            jsonWriter.value(bytesScanned);
        }
        jsonWriter.endObject();
    }

    private static QueryStatisticsJsonMarshaller instance;

    public static QueryStatisticsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueryStatisticsJsonMarshaller();
        return instance;
    }
}
