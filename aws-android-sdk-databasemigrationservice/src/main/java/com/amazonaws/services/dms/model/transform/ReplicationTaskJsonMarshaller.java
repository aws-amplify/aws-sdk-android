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
 * JSON marshaller for POJO ReplicationTask
 */
class ReplicationTaskJsonMarshaller {

    public void marshall(ReplicationTask replicationTask, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (replicationTask.getReplicationTaskIdentifier() != null) {
            String replicationTaskIdentifier = replicationTask.getReplicationTaskIdentifier();
            jsonWriter.name("ReplicationTaskIdentifier");
            jsonWriter.value(replicationTaskIdentifier);
        }
        if (replicationTask.getSourceEndpointArn() != null) {
            String sourceEndpointArn = replicationTask.getSourceEndpointArn();
            jsonWriter.name("SourceEndpointArn");
            jsonWriter.value(sourceEndpointArn);
        }
        if (replicationTask.getTargetEndpointArn() != null) {
            String targetEndpointArn = replicationTask.getTargetEndpointArn();
            jsonWriter.name("TargetEndpointArn");
            jsonWriter.value(targetEndpointArn);
        }
        if (replicationTask.getReplicationInstanceArn() != null) {
            String replicationInstanceArn = replicationTask.getReplicationInstanceArn();
            jsonWriter.name("ReplicationInstanceArn");
            jsonWriter.value(replicationInstanceArn);
        }
        if (replicationTask.getMigrationType() != null) {
            String migrationType = replicationTask.getMigrationType();
            jsonWriter.name("MigrationType");
            jsonWriter.value(migrationType);
        }
        if (replicationTask.getTableMappings() != null) {
            String tableMappings = replicationTask.getTableMappings();
            jsonWriter.name("TableMappings");
            jsonWriter.value(tableMappings);
        }
        if (replicationTask.getReplicationTaskSettings() != null) {
            String replicationTaskSettings = replicationTask.getReplicationTaskSettings();
            jsonWriter.name("ReplicationTaskSettings");
            jsonWriter.value(replicationTaskSettings);
        }
        if (replicationTask.getStatus() != null) {
            String status = replicationTask.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (replicationTask.getLastFailureMessage() != null) {
            String lastFailureMessage = replicationTask.getLastFailureMessage();
            jsonWriter.name("LastFailureMessage");
            jsonWriter.value(lastFailureMessage);
        }
        if (replicationTask.getStopReason() != null) {
            String stopReason = replicationTask.getStopReason();
            jsonWriter.name("StopReason");
            jsonWriter.value(stopReason);
        }
        if (replicationTask.getReplicationTaskCreationDate() != null) {
            java.util.Date replicationTaskCreationDate = replicationTask
                    .getReplicationTaskCreationDate();
            jsonWriter.name("ReplicationTaskCreationDate");
            jsonWriter.value(replicationTaskCreationDate);
        }
        if (replicationTask.getReplicationTaskStartDate() != null) {
            java.util.Date replicationTaskStartDate = replicationTask.getReplicationTaskStartDate();
            jsonWriter.name("ReplicationTaskStartDate");
            jsonWriter.value(replicationTaskStartDate);
        }
        if (replicationTask.getCdcStartPosition() != null) {
            String cdcStartPosition = replicationTask.getCdcStartPosition();
            jsonWriter.name("CdcStartPosition");
            jsonWriter.value(cdcStartPosition);
        }
        if (replicationTask.getCdcStopPosition() != null) {
            String cdcStopPosition = replicationTask.getCdcStopPosition();
            jsonWriter.name("CdcStopPosition");
            jsonWriter.value(cdcStopPosition);
        }
        if (replicationTask.getRecoveryCheckpoint() != null) {
            String recoveryCheckpoint = replicationTask.getRecoveryCheckpoint();
            jsonWriter.name("RecoveryCheckpoint");
            jsonWriter.value(recoveryCheckpoint);
        }
        if (replicationTask.getReplicationTaskArn() != null) {
            String replicationTaskArn = replicationTask.getReplicationTaskArn();
            jsonWriter.name("ReplicationTaskArn");
            jsonWriter.value(replicationTaskArn);
        }
        if (replicationTask.getReplicationTaskStats() != null) {
            ReplicationTaskStats replicationTaskStats = replicationTask.getReplicationTaskStats();
            jsonWriter.name("ReplicationTaskStats");
            ReplicationTaskStatsJsonMarshaller.getInstance().marshall(replicationTaskStats,
                    jsonWriter);
        }
        if (replicationTask.getTaskData() != null) {
            String taskData = replicationTask.getTaskData();
            jsonWriter.name("TaskData");
            jsonWriter.value(taskData);
        }
        jsonWriter.endObject();
    }

    private static ReplicationTaskJsonMarshaller instance;

    public static ReplicationTaskJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskJsonMarshaller();
        return instance;
    }
}
