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
 * JSON marshaller for POJO ColumnStatistics
 */
class ColumnStatisticsJsonMarshaller {

    public void marshall(ColumnStatistics columnStatistics, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (columnStatistics.getColumnName() != null) {
            String columnName = columnStatistics.getColumnName();
            jsonWriter.name("ColumnName");
            jsonWriter.value(columnName);
        }
        if (columnStatistics.getColumnType() != null) {
            String columnType = columnStatistics.getColumnType();
            jsonWriter.name("ColumnType");
            jsonWriter.value(columnType);
        }
        if (columnStatistics.getAnalyzedTime() != null) {
            java.util.Date analyzedTime = columnStatistics.getAnalyzedTime();
            jsonWriter.name("AnalyzedTime");
            jsonWriter.value(analyzedTime);
        }
        if (columnStatistics.getStatisticsData() != null) {
            ColumnStatisticsData statisticsData = columnStatistics.getStatisticsData();
            jsonWriter.name("StatisticsData");
            ColumnStatisticsDataJsonMarshaller.getInstance().marshall(statisticsData, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ColumnStatisticsJsonMarshaller instance;

    public static ColumnStatisticsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ColumnStatisticsJsonMarshaller();
        return instance;
    }
}
