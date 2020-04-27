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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information that describes a replication task created by the
 * <code>CreateReplicationTask</code> operation.
 * </p>
 */
public class ReplicationTask implements Serializable {
    /**
     * <p>
     * The user-assigned replication task identifier or name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String replicationTaskIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     */
    private String sourceEndpointArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     */
    private String targetEndpointArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;

    /**
     * <p>
     * The type of migration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     */
    private String migrationType;

    /**
     * <p>
     * Table mappings specified in the task.
     * </p>
     */
    private String tableMappings;

    /**
     * <p>
     * The settings for the replication task.
     * </p>
     */
    private String replicationTaskSettings;

    /**
     * <p>
     * The status of the replication task.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The last error (failure) message generated for the replication instance.
     * </p>
     */
    private String lastFailureMessage;

    /**
     * <p>
     * The reason the replication task was stopped.
     * </p>
     */
    private String stopReason;

    /**
     * <p>
     * The date the replication task was created.
     * </p>
     */
    private java.util.Date replicationTaskCreationDate;

    /**
     * <p>
     * The date the replication task is scheduled to start.
     * </p>
     */
    private java.util.Date replicationTaskStartDate;

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start.
     * Use either <code>CdcStartPosition</code> or <code>CdcStartTime</code> to
     * specify when you want the CDC operation to start. Specifying both values
     * results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     */
    private String cdcStartPosition;

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop.
     * The value can be either server time or commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position
     * “server_time:3018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time:
     * 3018-02-09T12:12:12 “
     * </p>
     */
    private String cdcStopPosition;

    /**
     * <p>
     * Indicates the last checkpoint that occurred during a change data capture
     * (CDC) operation. You can provide this value to the
     * <code>CdcStartPosition</code> parameter to start a CDC operation that
     * begins at that checkpoint.
     * </p>
     */
    private String recoveryCheckpoint;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     */
    private String replicationTaskArn;

    /**
     * <p>
     * The statistics for the task, including elapsed time, tables loaded, and
     * table errors.
     * </p>
     */
    private ReplicationTaskStats replicationTaskStats;

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for
     * certain source and target endpoints. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"
     * >Specifying Supplemental Data for Task Settings</a> in the <i>AWS
     * Database Migration User Guide.</i>
     * </p>
     */
    private String taskData;

    /**
     * <p>
     * The user-assigned replication task identifier or name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The user-assigned replication task identifier or name.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 255 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getReplicationTaskIdentifier() {
        return replicationTaskIdentifier;
    }

    /**
     * <p>
     * The user-assigned replication task identifier or name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     *
     * @param replicationTaskIdentifier <p>
     *            The user-assigned replication task identifier or name.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 255 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setReplicationTaskIdentifier(String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
    }

    /**
     * <p>
     * The user-assigned replication task identifier or name.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskIdentifier <p>
     *            The user-assigned replication task identifier or name.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 255 alphanumeric characters or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withReplicationTaskIdentifier(String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) string that uniquely identifies
     *         the endpoint.
     *         </p>
     */
    public String getSourceEndpointArn() {
        return sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     *
     * @param sourceEndpointArn <p>
     *            The Amazon Resource Name (ARN) string that uniquely identifies
     *            the endpoint.
     *            </p>
     */
    public void setSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceEndpointArn <p>
     *            The Amazon Resource Name (ARN) string that uniquely identifies
     *            the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) string that uniquely identifies
     *         the endpoint.
     *         </p>
     */
    public String getTargetEndpointArn() {
        return targetEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     *
     * @param targetEndpointArn <p>
     *            The Amazon Resource Name (ARN) string that uniquely identifies
     *            the endpoint.
     *            </p>
     */
    public void setTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetEndpointArn <p>
     *            The Amazon Resource Name (ARN) string that uniquely identifies
     *            the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replication instance.
     *         </p>
     */
    public String getReplicationInstanceArn() {
        return replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     */
    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
        return this;
    }

    /**
     * <p>
     * The type of migration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     *
     * @return <p>
     *         The type of migration.
     *         </p>
     * @see MigrationTypeValue
     */
    public String getMigrationType() {
        return migrationType;
    }

    /**
     * <p>
     * The type of migration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     *
     * @param migrationType <p>
     *            The type of migration.
     *            </p>
     * @see MigrationTypeValue
     */
    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    /**
     * <p>
     * The type of migration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     *
     * @param migrationType <p>
     *            The type of migration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MigrationTypeValue
     */
    public ReplicationTask withMigrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }

    /**
     * <p>
     * The type of migration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     *
     * @param migrationType <p>
     *            The type of migration.
     *            </p>
     * @see MigrationTypeValue
     */
    public void setMigrationType(MigrationTypeValue migrationType) {
        this.migrationType = migrationType.toString();
    }

    /**
     * <p>
     * The type of migration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     *
     * @param migrationType <p>
     *            The type of migration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MigrationTypeValue
     */
    public ReplicationTask withMigrationType(MigrationTypeValue migrationType) {
        this.migrationType = migrationType.toString();
        return this;
    }

    /**
     * <p>
     * Table mappings specified in the task.
     * </p>
     *
     * @return <p>
     *         Table mappings specified in the task.
     *         </p>
     */
    public String getTableMappings() {
        return tableMappings;
    }

    /**
     * <p>
     * Table mappings specified in the task.
     * </p>
     *
     * @param tableMappings <p>
     *            Table mappings specified in the task.
     *            </p>
     */
    public void setTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
    }

    /**
     * <p>
     * Table mappings specified in the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableMappings <p>
     *            Table mappings specified in the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
        return this;
    }

    /**
     * <p>
     * The settings for the replication task.
     * </p>
     *
     * @return <p>
     *         The settings for the replication task.
     *         </p>
     */
    public String getReplicationTaskSettings() {
        return replicationTaskSettings;
    }

    /**
     * <p>
     * The settings for the replication task.
     * </p>
     *
     * @param replicationTaskSettings <p>
     *            The settings for the replication task.
     *            </p>
     */
    public void setReplicationTaskSettings(String replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
    }

    /**
     * <p>
     * The settings for the replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskSettings <p>
     *            The settings for the replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withReplicationTaskSettings(String replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
        return this;
    }

    /**
     * <p>
     * The status of the replication task.
     * </p>
     *
     * @return <p>
     *         The status of the replication task.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the replication task.
     * </p>
     *
     * @param status <p>
     *            The status of the replication task.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The last error (failure) message generated for the replication instance.
     * </p>
     *
     * @return <p>
     *         The last error (failure) message generated for the replication
     *         instance.
     *         </p>
     */
    public String getLastFailureMessage() {
        return lastFailureMessage;
    }

    /**
     * <p>
     * The last error (failure) message generated for the replication instance.
     * </p>
     *
     * @param lastFailureMessage <p>
     *            The last error (failure) message generated for the replication
     *            instance.
     *            </p>
     */
    public void setLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
    }

    /**
     * <p>
     * The last error (failure) message generated for the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastFailureMessage <p>
     *            The last error (failure) message generated for the replication
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
        return this;
    }

    /**
     * <p>
     * The reason the replication task was stopped.
     * </p>
     *
     * @return <p>
     *         The reason the replication task was stopped.
     *         </p>
     */
    public String getStopReason() {
        return stopReason;
    }

    /**
     * <p>
     * The reason the replication task was stopped.
     * </p>
     *
     * @param stopReason <p>
     *            The reason the replication task was stopped.
     *            </p>
     */
    public void setStopReason(String stopReason) {
        this.stopReason = stopReason;
    }

    /**
     * <p>
     * The reason the replication task was stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stopReason <p>
     *            The reason the replication task was stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withStopReason(String stopReason) {
        this.stopReason = stopReason;
        return this;
    }

    /**
     * <p>
     * The date the replication task was created.
     * </p>
     *
     * @return <p>
     *         The date the replication task was created.
     *         </p>
     */
    public java.util.Date getReplicationTaskCreationDate() {
        return replicationTaskCreationDate;
    }

    /**
     * <p>
     * The date the replication task was created.
     * </p>
     *
     * @param replicationTaskCreationDate <p>
     *            The date the replication task was created.
     *            </p>
     */
    public void setReplicationTaskCreationDate(java.util.Date replicationTaskCreationDate) {
        this.replicationTaskCreationDate = replicationTaskCreationDate;
    }

    /**
     * <p>
     * The date the replication task was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskCreationDate <p>
     *            The date the replication task was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withReplicationTaskCreationDate(
            java.util.Date replicationTaskCreationDate) {
        this.replicationTaskCreationDate = replicationTaskCreationDate;
        return this;
    }

    /**
     * <p>
     * The date the replication task is scheduled to start.
     * </p>
     *
     * @return <p>
     *         The date the replication task is scheduled to start.
     *         </p>
     */
    public java.util.Date getReplicationTaskStartDate() {
        return replicationTaskStartDate;
    }

    /**
     * <p>
     * The date the replication task is scheduled to start.
     * </p>
     *
     * @param replicationTaskStartDate <p>
     *            The date the replication task is scheduled to start.
     *            </p>
     */
    public void setReplicationTaskStartDate(java.util.Date replicationTaskStartDate) {
        this.replicationTaskStartDate = replicationTaskStartDate;
    }

    /**
     * <p>
     * The date the replication task is scheduled to start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskStartDate <p>
     *            The date the replication task is scheduled to start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withReplicationTaskStartDate(java.util.Date replicationTaskStartDate) {
        this.replicationTaskStartDate = replicationTaskStartDate;
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start.
     * Use either <code>CdcStartPosition</code> or <code>CdcStartTime</code> to
     * specify when you want the CDC operation to start. Specifying both values
     * results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     *
     * @return <p>
     *         Indicates when you want a change data capture (CDC) operation to
     *         start. Use either <code>CdcStartPosition</code> or
     *         <code>CdcStartTime</code> to specify when you want the CDC
     *         operation to start. Specifying both values results in an error.
     *         </p>
     *         <p>
     *         The value can be in date, checkpoint, or LSN/SCN format.
     *         </p>
     *         <p>
     *         Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *         </p>
     *         <p>
     *         Checkpoint Example: --cdc-start-position
     *         "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *         </p>
     *         <p>
     *         LSN Example: --cdc-start-position
     *         “mysql-bin-changelog.000024:373”
     *         </p>
     */
    public String getCdcStartPosition() {
        return cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start.
     * Use either <code>CdcStartPosition</code> or <code>CdcStartTime</code> to
     * specify when you want the CDC operation to start. Specifying both values
     * results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     *
     * @param cdcStartPosition <p>
     *            Indicates when you want a change data capture (CDC) operation
     *            to start. Use either <code>CdcStartPosition</code> or
     *            <code>CdcStartTime</code> to specify when you want the CDC
     *            operation to start. Specifying both values results in an
     *            error.
     *            </p>
     *            <p>
     *            The value can be in date, checkpoint, or LSN/SCN format.
     *            </p>
     *            <p>
     *            Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *            </p>
     *            <p>
     *            Checkpoint Example: --cdc-start-position
     *            "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *            </p>
     *            <p>
     *            LSN Example: --cdc-start-position
     *            “mysql-bin-changelog.000024:373”
     *            </p>
     */
    public void setCdcStartPosition(String cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start.
     * Use either <code>CdcStartPosition</code> or <code>CdcStartTime</code> to
     * specify when you want the CDC operation to start. Specifying both values
     * results in an error.
     * </p>
     * <p>
     * The value can be in date, checkpoint, or LSN/SCN format.
     * </p>
     * <p>
     * Date Example: --cdc-start-position “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Checkpoint Example: --cdc-start-position
     * "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     * </p>
     * <p>
     * LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cdcStartPosition <p>
     *            Indicates when you want a change data capture (CDC) operation
     *            to start. Use either <code>CdcStartPosition</code> or
     *            <code>CdcStartTime</code> to specify when you want the CDC
     *            operation to start. Specifying both values results in an
     *            error.
     *            </p>
     *            <p>
     *            The value can be in date, checkpoint, or LSN/SCN format.
     *            </p>
     *            <p>
     *            Date Example: --cdc-start-position “2018-03-08T12:12:12”
     *            </p>
     *            <p>
     *            Checkpoint Example: --cdc-start-position
     *            "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93"
     *            </p>
     *            <p>
     *            LSN Example: --cdc-start-position
     *            “mysql-bin-changelog.000024:373”
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withCdcStartPosition(String cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop.
     * The value can be either server time or commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position
     * “server_time:3018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time:
     * 3018-02-09T12:12:12 “
     * </p>
     *
     * @return <p>
     *         Indicates when you want a change data capture (CDC) operation to
     *         stop. The value can be either server time or commit time.
     *         </p>
     *         <p>
     *         Server time example: --cdc-stop-position
     *         “server_time:3018-02-09T12:12:12”
     *         </p>
     *         <p>
     *         Commit time example: --cdc-stop-position “commit_time:
     *         3018-02-09T12:12:12 “
     *         </p>
     */
    public String getCdcStopPosition() {
        return cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop.
     * The value can be either server time or commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position
     * “server_time:3018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time:
     * 3018-02-09T12:12:12 “
     * </p>
     *
     * @param cdcStopPosition <p>
     *            Indicates when you want a change data capture (CDC) operation
     *            to stop. The value can be either server time or commit time.
     *            </p>
     *            <p>
     *            Server time example: --cdc-stop-position
     *            “server_time:3018-02-09T12:12:12”
     *            </p>
     *            <p>
     *            Commit time example: --cdc-stop-position “commit_time:
     *            3018-02-09T12:12:12 “
     *            </p>
     */
    public void setCdcStopPosition(String cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to stop.
     * The value can be either server time or commit time.
     * </p>
     * <p>
     * Server time example: --cdc-stop-position
     * “server_time:3018-02-09T12:12:12”
     * </p>
     * <p>
     * Commit time example: --cdc-stop-position “commit_time:
     * 3018-02-09T12:12:12 “
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cdcStopPosition <p>
     *            Indicates when you want a change data capture (CDC) operation
     *            to stop. The value can be either server time or commit time.
     *            </p>
     *            <p>
     *            Server time example: --cdc-stop-position
     *            “server_time:3018-02-09T12:12:12”
     *            </p>
     *            <p>
     *            Commit time example: --cdc-stop-position “commit_time:
     *            3018-02-09T12:12:12 “
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withCdcStopPosition(String cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
        return this;
    }

    /**
     * <p>
     * Indicates the last checkpoint that occurred during a change data capture
     * (CDC) operation. You can provide this value to the
     * <code>CdcStartPosition</code> parameter to start a CDC operation that
     * begins at that checkpoint.
     * </p>
     *
     * @return <p>
     *         Indicates the last checkpoint that occurred during a change data
     *         capture (CDC) operation. You can provide this value to the
     *         <code>CdcStartPosition</code> parameter to start a CDC operation
     *         that begins at that checkpoint.
     *         </p>
     */
    public String getRecoveryCheckpoint() {
        return recoveryCheckpoint;
    }

    /**
     * <p>
     * Indicates the last checkpoint that occurred during a change data capture
     * (CDC) operation. You can provide this value to the
     * <code>CdcStartPosition</code> parameter to start a CDC operation that
     * begins at that checkpoint.
     * </p>
     *
     * @param recoveryCheckpoint <p>
     *            Indicates the last checkpoint that occurred during a change
     *            data capture (CDC) operation. You can provide this value to
     *            the <code>CdcStartPosition</code> parameter to start a CDC
     *            operation that begins at that checkpoint.
     *            </p>
     */
    public void setRecoveryCheckpoint(String recoveryCheckpoint) {
        this.recoveryCheckpoint = recoveryCheckpoint;
    }

    /**
     * <p>
     * Indicates the last checkpoint that occurred during a change data capture
     * (CDC) operation. You can provide this value to the
     * <code>CdcStartPosition</code> parameter to start a CDC operation that
     * begins at that checkpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recoveryCheckpoint <p>
     *            Indicates the last checkpoint that occurred during a change
     *            data capture (CDC) operation. You can provide this value to
     *            the <code>CdcStartPosition</code> parameter to start a CDC
     *            operation that begins at that checkpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withRecoveryCheckpoint(String recoveryCheckpoint) {
        this.recoveryCheckpoint = recoveryCheckpoint;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replication task.
     *         </p>
     */
    public String getReplicationTaskArn() {
        return replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     *
     * @param replicationTaskArn <p>
     *            The Amazon Resource Name (ARN) of the replication task.
     *            </p>
     */
    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskArn <p>
     *            The Amazon Resource Name (ARN) of the replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
        return this;
    }

    /**
     * <p>
     * The statistics for the task, including elapsed time, tables loaded, and
     * table errors.
     * </p>
     *
     * @return <p>
     *         The statistics for the task, including elapsed time, tables
     *         loaded, and table errors.
     *         </p>
     */
    public ReplicationTaskStats getReplicationTaskStats() {
        return replicationTaskStats;
    }

    /**
     * <p>
     * The statistics for the task, including elapsed time, tables loaded, and
     * table errors.
     * </p>
     *
     * @param replicationTaskStats <p>
     *            The statistics for the task, including elapsed time, tables
     *            loaded, and table errors.
     *            </p>
     */
    public void setReplicationTaskStats(ReplicationTaskStats replicationTaskStats) {
        this.replicationTaskStats = replicationTaskStats;
    }

    /**
     * <p>
     * The statistics for the task, including elapsed time, tables loaded, and
     * table errors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskStats <p>
     *            The statistics for the task, including elapsed time, tables
     *            loaded, and table errors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withReplicationTaskStats(ReplicationTaskStats replicationTaskStats) {
        this.replicationTaskStats = replicationTaskStats;
        return this;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for
     * certain source and target endpoints. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"
     * >Specifying Supplemental Data for Task Settings</a> in the <i>AWS
     * Database Migration User Guide.</i>
     * </p>
     *
     * @return <p>
     *         Supplemental information that the task requires to migrate the
     *         data for certain source and target endpoints. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"
     *         >Specifying Supplemental Data for Task Settings</a> in the <i>AWS
     *         Database Migration User Guide.</i>
     *         </p>
     */
    public String getTaskData() {
        return taskData;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for
     * certain source and target endpoints. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"
     * >Specifying Supplemental Data for Task Settings</a> in the <i>AWS
     * Database Migration User Guide.</i>
     * </p>
     *
     * @param taskData <p>
     *            Supplemental information that the task requires to migrate the
     *            data for certain source and target endpoints. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"
     *            >Specifying Supplemental Data for Task Settings</a> in the
     *            <i>AWS Database Migration User Guide.</i>
     *            </p>
     */
    public void setTaskData(String taskData) {
        this.taskData = taskData;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for
     * certain source and target endpoints. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"
     * >Specifying Supplemental Data for Task Settings</a> in the <i>AWS
     * Database Migration User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskData <p>
     *            Supplemental information that the task requires to migrate the
     *            data for certain source and target endpoints. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"
     *            >Specifying Supplemental Data for Task Settings</a> in the
     *            <i>AWS Database Migration User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTask withTaskData(String taskData) {
        this.taskData = taskData;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReplicationTaskIdentifier() != null)
            sb.append("ReplicationTaskIdentifier: " + getReplicationTaskIdentifier() + ",");
        if (getSourceEndpointArn() != null)
            sb.append("SourceEndpointArn: " + getSourceEndpointArn() + ",");
        if (getTargetEndpointArn() != null)
            sb.append("TargetEndpointArn: " + getTargetEndpointArn() + ",");
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: " + getReplicationInstanceArn() + ",");
        if (getMigrationType() != null)
            sb.append("MigrationType: " + getMigrationType() + ",");
        if (getTableMappings() != null)
            sb.append("TableMappings: " + getTableMappings() + ",");
        if (getReplicationTaskSettings() != null)
            sb.append("ReplicationTaskSettings: " + getReplicationTaskSettings() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastFailureMessage() != null)
            sb.append("LastFailureMessage: " + getLastFailureMessage() + ",");
        if (getStopReason() != null)
            sb.append("StopReason: " + getStopReason() + ",");
        if (getReplicationTaskCreationDate() != null)
            sb.append("ReplicationTaskCreationDate: " + getReplicationTaskCreationDate() + ",");
        if (getReplicationTaskStartDate() != null)
            sb.append("ReplicationTaskStartDate: " + getReplicationTaskStartDate() + ",");
        if (getCdcStartPosition() != null)
            sb.append("CdcStartPosition: " + getCdcStartPosition() + ",");
        if (getCdcStopPosition() != null)
            sb.append("CdcStopPosition: " + getCdcStopPosition() + ",");
        if (getRecoveryCheckpoint() != null)
            sb.append("RecoveryCheckpoint: " + getRecoveryCheckpoint() + ",");
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: " + getReplicationTaskArn() + ",");
        if (getReplicationTaskStats() != null)
            sb.append("ReplicationTaskStats: " + getReplicationTaskStats() + ",");
        if (getTaskData() != null)
            sb.append("TaskData: " + getTaskData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationTaskIdentifier() == null) ? 0 : getReplicationTaskIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSourceEndpointArn() == null) ? 0 : getSourceEndpointArn().hashCode());
        hashCode = prime * hashCode
                + ((getTargetEndpointArn() == null) ? 0 : getTargetEndpointArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMigrationType() == null) ? 0 : getMigrationType().hashCode());
        hashCode = prime * hashCode
                + ((getTableMappings() == null) ? 0 : getTableMappings().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationTaskSettings() == null) ? 0 : getReplicationTaskSettings()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastFailureMessage() == null) ? 0 : getLastFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getStopReason() == null) ? 0 : getStopReason().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationTaskCreationDate() == null) ? 0
                        : getReplicationTaskCreationDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationTaskStartDate() == null) ? 0 : getReplicationTaskStartDate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCdcStartPosition() == null) ? 0 : getCdcStartPosition().hashCode());
        hashCode = prime * hashCode
                + ((getCdcStopPosition() == null) ? 0 : getCdcStopPosition().hashCode());
        hashCode = prime * hashCode
                + ((getRecoveryCheckpoint() == null) ? 0 : getRecoveryCheckpoint().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationTaskStats() == null) ? 0 : getReplicationTaskStats().hashCode());
        hashCode = prime * hashCode + ((getTaskData() == null) ? 0 : getTaskData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationTask == false)
            return false;
        ReplicationTask other = (ReplicationTask) obj;

        if (other.getReplicationTaskIdentifier() == null
                ^ this.getReplicationTaskIdentifier() == null)
            return false;
        if (other.getReplicationTaskIdentifier() != null
                && other.getReplicationTaskIdentifier().equals(this.getReplicationTaskIdentifier()) == false)
            return false;
        if (other.getSourceEndpointArn() == null ^ this.getSourceEndpointArn() == null)
            return false;
        if (other.getSourceEndpointArn() != null
                && other.getSourceEndpointArn().equals(this.getSourceEndpointArn()) == false)
            return false;
        if (other.getTargetEndpointArn() == null ^ this.getTargetEndpointArn() == null)
            return false;
        if (other.getTargetEndpointArn() != null
                && other.getTargetEndpointArn().equals(this.getTargetEndpointArn()) == false)
            return false;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null
                && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getMigrationType() == null ^ this.getMigrationType() == null)
            return false;
        if (other.getMigrationType() != null
                && other.getMigrationType().equals(this.getMigrationType()) == false)
            return false;
        if (other.getTableMappings() == null ^ this.getTableMappings() == null)
            return false;
        if (other.getTableMappings() != null
                && other.getTableMappings().equals(this.getTableMappings()) == false)
            return false;
        if (other.getReplicationTaskSettings() == null ^ this.getReplicationTaskSettings() == null)
            return false;
        if (other.getReplicationTaskSettings() != null
                && other.getReplicationTaskSettings().equals(this.getReplicationTaskSettings()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastFailureMessage() == null ^ this.getLastFailureMessage() == null)
            return false;
        if (other.getLastFailureMessage() != null
                && other.getLastFailureMessage().equals(this.getLastFailureMessage()) == false)
            return false;
        if (other.getStopReason() == null ^ this.getStopReason() == null)
            return false;
        if (other.getStopReason() != null
                && other.getStopReason().equals(this.getStopReason()) == false)
            return false;
        if (other.getReplicationTaskCreationDate() == null
                ^ this.getReplicationTaskCreationDate() == null)
            return false;
        if (other.getReplicationTaskCreationDate() != null
                && other.getReplicationTaskCreationDate().equals(
                        this.getReplicationTaskCreationDate()) == false)
            return false;
        if (other.getReplicationTaskStartDate() == null
                ^ this.getReplicationTaskStartDate() == null)
            return false;
        if (other.getReplicationTaskStartDate() != null
                && other.getReplicationTaskStartDate().equals(this.getReplicationTaskStartDate()) == false)
            return false;
        if (other.getCdcStartPosition() == null ^ this.getCdcStartPosition() == null)
            return false;
        if (other.getCdcStartPosition() != null
                && other.getCdcStartPosition().equals(this.getCdcStartPosition()) == false)
            return false;
        if (other.getCdcStopPosition() == null ^ this.getCdcStopPosition() == null)
            return false;
        if (other.getCdcStopPosition() != null
                && other.getCdcStopPosition().equals(this.getCdcStopPosition()) == false)
            return false;
        if (other.getRecoveryCheckpoint() == null ^ this.getRecoveryCheckpoint() == null)
            return false;
        if (other.getRecoveryCheckpoint() != null
                && other.getRecoveryCheckpoint().equals(this.getRecoveryCheckpoint()) == false)
            return false;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null
                && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getReplicationTaskStats() == null ^ this.getReplicationTaskStats() == null)
            return false;
        if (other.getReplicationTaskStats() != null
                && other.getReplicationTaskStats().equals(this.getReplicationTaskStats()) == false)
            return false;
        if (other.getTaskData() == null ^ this.getTaskData() == null)
            return false;
        if (other.getTaskData() != null && other.getTaskData().equals(this.getTaskData()) == false)
            return false;
        return true;
    }
}
