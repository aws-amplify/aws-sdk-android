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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReplicationTaskStats
 */
class ReplicationTaskStatsJsonUnmarshaller implements
        Unmarshaller<ReplicationTaskStats, JsonUnmarshallerContext> {

    public ReplicationTaskStats unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReplicationTaskStats replicationTaskStats = new ReplicationTaskStats();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FullLoadProgressPercent")) {
                replicationTaskStats.setFullLoadProgressPercent(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ElapsedTimeMillis")) {
                replicationTaskStats.setElapsedTimeMillis(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TablesLoaded")) {
                replicationTaskStats.setTablesLoaded(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TablesLoading")) {
                replicationTaskStats.setTablesLoading(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TablesQueued")) {
                replicationTaskStats.setTablesQueued(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TablesErrored")) {
                replicationTaskStats.setTablesErrored(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FreshStartDate")) {
                replicationTaskStats.setFreshStartDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartDate")) {
                replicationTaskStats.setStartDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StopDate")) {
                replicationTaskStats.setStopDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FullLoadStartDate")) {
                replicationTaskStats.setFullLoadStartDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FullLoadFinishDate")) {
                replicationTaskStats.setFullLoadFinishDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return replicationTaskStats;
    }

    private static ReplicationTaskStatsJsonUnmarshaller instance;

    public static ReplicationTaskStatsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskStatsJsonUnmarshaller();
        return instance;
    }
}
