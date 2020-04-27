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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReplicationTask
 */
class ReplicationTaskJsonUnmarshaller implements
        Unmarshaller<ReplicationTask, JsonUnmarshallerContext> {

    public ReplicationTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReplicationTask replicationTask = new ReplicationTask();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ReplicationTaskIdentifier")) {
                replicationTask.setReplicationTaskIdentifier(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceEndpointArn")) {
                replicationTask.setSourceEndpointArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetEndpointArn")) {
                replicationTask.setTargetEndpointArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationInstanceArn")) {
                replicationTask.setReplicationInstanceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MigrationType")) {
                replicationTask.setMigrationType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TableMappings")) {
                replicationTask.setTableMappings(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationTaskSettings")) {
                replicationTask.setReplicationTaskSettings(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                replicationTask.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastFailureMessage")) {
                replicationTask.setLastFailureMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StopReason")) {
                replicationTask.setStopReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationTaskCreationDate")) {
                replicationTask.setReplicationTaskCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationTaskStartDate")) {
                replicationTask.setReplicationTaskStartDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CdcStartPosition")) {
                replicationTask.setCdcStartPosition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CdcStopPosition")) {
                replicationTask.setCdcStopPosition(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecoveryCheckpoint")) {
                replicationTask.setRecoveryCheckpoint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationTaskArn")) {
                replicationTask.setReplicationTaskArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationTaskStats")) {
                replicationTask.setReplicationTaskStats(ReplicationTaskStatsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskData")) {
                replicationTask.setTaskData(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return replicationTask;
    }

    private static ReplicationTaskJsonUnmarshaller instance;

    public static ReplicationTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskJsonUnmarshaller();
        return instance;
    }
}
