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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReplicationTaskStats
 */
class ReplicationTaskStatsJsonMarshaller {

    public void marshall(ReplicationTaskStats replicationTaskStats, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (replicationTaskStats.getFullLoadProgressPercent() != null) {
            Integer fullLoadProgressPercent = replicationTaskStats.getFullLoadProgressPercent();
            jsonWriter.name("FullLoadProgressPercent");
            jsonWriter.value(fullLoadProgressPercent);
        }
        if (replicationTaskStats.getElapsedTimeMillis() != null) {
            Long elapsedTimeMillis = replicationTaskStats.getElapsedTimeMillis();
            jsonWriter.name("ElapsedTimeMillis");
            jsonWriter.value(elapsedTimeMillis);
        }
        if (replicationTaskStats.getTablesLoaded() != null) {
            Integer tablesLoaded = replicationTaskStats.getTablesLoaded();
            jsonWriter.name("TablesLoaded");
            jsonWriter.value(tablesLoaded);
        }
        if (replicationTaskStats.getTablesLoading() != null) {
            Integer tablesLoading = replicationTaskStats.getTablesLoading();
            jsonWriter.name("TablesLoading");
            jsonWriter.value(tablesLoading);
        }
        if (replicationTaskStats.getTablesQueued() != null) {
            Integer tablesQueued = replicationTaskStats.getTablesQueued();
            jsonWriter.name("TablesQueued");
            jsonWriter.value(tablesQueued);
        }
        if (replicationTaskStats.getTablesErrored() != null) {
            Integer tablesErrored = replicationTaskStats.getTablesErrored();
            jsonWriter.name("TablesErrored");
            jsonWriter.value(tablesErrored);
        }
        if (replicationTaskStats.getFreshStartDate() != null) {
            java.util.Date freshStartDate = replicationTaskStats.getFreshStartDate();
            jsonWriter.name("FreshStartDate");
            jsonWriter.value(freshStartDate);
        }
        if (replicationTaskStats.getStartDate() != null) {
            java.util.Date startDate = replicationTaskStats.getStartDate();
            jsonWriter.name("StartDate");
            jsonWriter.value(startDate);
        }
        if (replicationTaskStats.getStopDate() != null) {
            java.util.Date stopDate = replicationTaskStats.getStopDate();
            jsonWriter.name("StopDate");
            jsonWriter.value(stopDate);
        }
        if (replicationTaskStats.getFullLoadStartDate() != null) {
            java.util.Date fullLoadStartDate = replicationTaskStats.getFullLoadStartDate();
            jsonWriter.name("FullLoadStartDate");
            jsonWriter.value(fullLoadStartDate);
        }
        if (replicationTaskStats.getFullLoadFinishDate() != null) {
            java.util.Date fullLoadFinishDate = replicationTaskStats.getFullLoadFinishDate();
            jsonWriter.name("FullLoadFinishDate");
            jsonWriter.value(fullLoadFinishDate);
        }
        jsonWriter.endObject();
    }

    private static ReplicationTaskStatsJsonMarshaller instance;

    public static ReplicationTaskStatsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskStatsJsonMarshaller();
        return instance;
    }
}
