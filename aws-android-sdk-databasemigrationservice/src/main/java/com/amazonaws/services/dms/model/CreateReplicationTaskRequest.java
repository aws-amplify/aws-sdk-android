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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a replication task using the specified parameters.
 * </p>
 */
public class CreateReplicationTaskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An identifier for the replication task.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     * An Amazon Resource Name (ARN) that uniquely identifies the source
     * endpoint.
     * </p>
     */
    private String sourceEndpointArn;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the target
     * endpoint.
     * </p>
     */
    private String targetEndpointArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a replication instance.
     * </p>
     */
    private String replicationInstanceArn;

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> |
     * <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     */
    private String migrationType;

    /**
     * <p>
     * The table mappings for the task, in JSON format. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html"
     * >Using Table Mapping to Specify Task Settings</a> in the <i>AWS Database
     * Migration Service User Guide.</i>
     * </p>
     */
    private String tableMappings;

    /**
     * <p>
     * Overall settings for the task, in JSON format. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html"
     * >Specifying Task Settings for AWS Database Migration Service Tasks</a> in
     * the <i>AWS Database Migration User Guide.</i>
     * </p>
     */
    private String replicationTaskSettings;

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use
     * either CdcStartTime or CdcStartPosition to specify when you want a CDC
     * operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     */
    private java.util.Date cdcStartTime;

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start.
     * Use either CdcStartPosition or CdcStartTime to specify when you want a
     * CDC operation to start. Specifying both values results in an error.
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
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a
     * logical replication slot should already be created and associated with
     * the source endpoint. You can verify this by setting the
     * <code>slotName</code> extra connection attribute to the name of this
     * logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for AWS
     * DMS</a>.
     * </p>
     * </note>
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
     * One or more tags to be assigned to the replication task.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for
     * certain source and target endpoints. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"
     * >Specifying Supplemental Data for Task Settings</a> in the <i>AWS
     * Database Migration Service User Guide.</i>
     * </p>
     */
    private String taskData;

    /**
     * <p>
     * An identifier for the replication task.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     *         An identifier for the replication task.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1-255 alphanumeric characters or hyphens.
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
     * An identifier for the replication task.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     *            An identifier for the replication task.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain 1-255 alphanumeric characters or hyphens.
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
     * An identifier for the replication task.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1-255 alphanumeric characters or hyphens.
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
     *            An identifier for the replication task.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain 1-255 alphanumeric characters or hyphens.
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
    public CreateReplicationTaskRequest withReplicationTaskIdentifier(
            String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the source
     * endpoint.
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies the source
     *         endpoint.
     *         </p>
     */
    public String getSourceEndpointArn() {
        return sourceEndpointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the source
     * endpoint.
     * </p>
     *
     * @param sourceEndpointArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies the
     *            source endpoint.
     *            </p>
     */
    public void setSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the source
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceEndpointArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies the
     *            source endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationTaskRequest withSourceEndpointArn(String sourceEndpointArn) {
        this.sourceEndpointArn = sourceEndpointArn;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the target
     * endpoint.
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies the target
     *         endpoint.
     *         </p>
     */
    public String getTargetEndpointArn() {
        return targetEndpointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the target
     * endpoint.
     * </p>
     *
     * @param targetEndpointArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies the
     *            target endpoint.
     *            </p>
     */
    public void setTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the target
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetEndpointArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies the
     *            target endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationTaskRequest withTargetEndpointArn(String targetEndpointArn) {
        this.targetEndpointArn = targetEndpointArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a replication instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a replication instance.
     *         </p>
     */
    public String getReplicationInstanceArn() {
        return replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a replication instance.
     * </p>
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of a replication instance.
     *            </p>
     */
    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of a replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationTaskRequest withReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
        return this;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> |
     * <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     *
     * @return <p>
     *         The migration type. Valid values: <code>full-load</code> |
     *         <code>cdc</code> | <code>full-load-and-cdc</code>
     *         </p>
     * @see MigrationTypeValue
     */
    public String getMigrationType() {
        return migrationType;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> |
     * <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     *
     * @param migrationType <p>
     *            The migration type. Valid values: <code>full-load</code> |
     *            <code>cdc</code> | <code>full-load-and-cdc</code>
     *            </p>
     * @see MigrationTypeValue
     */
    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> |
     * <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     *
     * @param migrationType <p>
     *            The migration type. Valid values: <code>full-load</code> |
     *            <code>cdc</code> | <code>full-load-and-cdc</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MigrationTypeValue
     */
    public CreateReplicationTaskRequest withMigrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> |
     * <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     *
     * @param migrationType <p>
     *            The migration type. Valid values: <code>full-load</code> |
     *            <code>cdc</code> | <code>full-load-and-cdc</code>
     *            </p>
     * @see MigrationTypeValue
     */
    public void setMigrationType(MigrationTypeValue migrationType) {
        this.migrationType = migrationType.toString();
    }

    /**
     * <p>
     * The migration type. Valid values: <code>full-load</code> |
     * <code>cdc</code> | <code>full-load-and-cdc</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>full-load, cdc, full-load-and-cdc
     *
     * @param migrationType <p>
     *            The migration type. Valid values: <code>full-load</code> |
     *            <code>cdc</code> | <code>full-load-and-cdc</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MigrationTypeValue
     */
    public CreateReplicationTaskRequest withMigrationType(MigrationTypeValue migrationType) {
        this.migrationType = migrationType.toString();
        return this;
    }

    /**
     * <p>
     * The table mappings for the task, in JSON format. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html"
     * >Using Table Mapping to Specify Task Settings</a> in the <i>AWS Database
     * Migration Service User Guide.</i>
     * </p>
     *
     * @return <p>
     *         The table mappings for the task, in JSON format. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html"
     *         >Using Table Mapping to Specify Task Settings</a> in the <i>AWS
     *         Database Migration Service User Guide.</i>
     *         </p>
     */
    public String getTableMappings() {
        return tableMappings;
    }

    /**
     * <p>
     * The table mappings for the task, in JSON format. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html"
     * >Using Table Mapping to Specify Task Settings</a> in the <i>AWS Database
     * Migration Service User Guide.</i>
     * </p>
     *
     * @param tableMappings <p>
     *            The table mappings for the task, in JSON format. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html"
     *            >Using Table Mapping to Specify Task Settings</a> in the
     *            <i>AWS Database Migration Service User Guide.</i>
     *            </p>
     */
    public void setTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
    }

    /**
     * <p>
     * The table mappings for the task, in JSON format. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html"
     * >Using Table Mapping to Specify Task Settings</a> in the <i>AWS Database
     * Migration Service User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableMappings <p>
     *            The table mappings for the task, in JSON format. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html"
     *            >Using Table Mapping to Specify Task Settings</a> in the
     *            <i>AWS Database Migration Service User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationTaskRequest withTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
        return this;
    }

    /**
     * <p>
     * Overall settings for the task, in JSON format. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html"
     * >Specifying Task Settings for AWS Database Migration Service Tasks</a> in
     * the <i>AWS Database Migration User Guide.</i>
     * </p>
     *
     * @return <p>
     *         Overall settings for the task, in JSON format. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html"
     *         >Specifying Task Settings for AWS Database Migration Service
     *         Tasks</a> in the <i>AWS Database Migration User Guide.</i>
     *         </p>
     */
    public String getReplicationTaskSettings() {
        return replicationTaskSettings;
    }

    /**
     * <p>
     * Overall settings for the task, in JSON format. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html"
     * >Specifying Task Settings for AWS Database Migration Service Tasks</a> in
     * the <i>AWS Database Migration User Guide.</i>
     * </p>
     *
     * @param replicationTaskSettings <p>
     *            Overall settings for the task, in JSON format. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html"
     *            >Specifying Task Settings for AWS Database Migration Service
     *            Tasks</a> in the <i>AWS Database Migration User Guide.</i>
     *            </p>
     */
    public void setReplicationTaskSettings(String replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
    }

    /**
     * <p>
     * Overall settings for the task, in JSON format. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html"
     * >Specifying Task Settings for AWS Database Migration Service Tasks</a> in
     * the <i>AWS Database Migration User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskSettings <p>
     *            Overall settings for the task, in JSON format. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html"
     *            >Specifying Task Settings for AWS Database Migration Service
     *            Tasks</a> in the <i>AWS Database Migration User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationTaskRequest withReplicationTaskSettings(String replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
        return this;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use
     * either CdcStartTime or CdcStartPosition to specify when you want a CDC
     * operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     *
     * @return <p>
     *         Indicates the start time for a change data capture (CDC)
     *         operation. Use either CdcStartTime or CdcStartPosition to specify
     *         when you want a CDC operation to start. Specifying both values
     *         results in an error.
     *         </p>
     *         <p>
     *         Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     *         </p>
     */
    public java.util.Date getCdcStartTime() {
        return cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use
     * either CdcStartTime or CdcStartPosition to specify when you want a CDC
     * operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     *
     * @param cdcStartTime <p>
     *            Indicates the start time for a change data capture (CDC)
     *            operation. Use either CdcStartTime or CdcStartPosition to
     *            specify when you want a CDC operation to start. Specifying
     *            both values results in an error.
     *            </p>
     *            <p>
     *            Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     *            </p>
     */
    public void setCdcStartTime(java.util.Date cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
    }

    /**
     * <p>
     * Indicates the start time for a change data capture (CDC) operation. Use
     * either CdcStartTime or CdcStartPosition to specify when you want a CDC
     * operation to start. Specifying both values results in an error.
     * </p>
     * <p>
     * Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cdcStartTime <p>
     *            Indicates the start time for a change data capture (CDC)
     *            operation. Use either CdcStartTime or CdcStartPosition to
     *            specify when you want a CDC operation to start. Specifying
     *            both values results in an error.
     *            </p>
     *            <p>
     *            Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationTaskRequest withCdcStartTime(java.util.Date cdcStartTime) {
        this.cdcStartTime = cdcStartTime;
        return this;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start.
     * Use either CdcStartPosition or CdcStartTime to specify when you want a
     * CDC operation to start. Specifying both values results in an error.
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
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a
     * logical replication slot should already be created and associated with
     * the source endpoint. You can verify this by setting the
     * <code>slotName</code> extra connection attribute to the name of this
     * logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for AWS
     * DMS</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         Indicates when you want a change data capture (CDC) operation to
     *         start. Use either CdcStartPosition or CdcStartTime to specify
     *         when you want a CDC operation to start. Specifying both values
     *         results in an error.
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
     *         <note>
     *         <p>
     *         When you use this task setting with a source PostgreSQL database,
     *         a logical replication slot should already be created and
     *         associated with the source endpoint. You can verify this by
     *         setting the <code>slotName</code> extra connection attribute to
     *         the name of this logical replication slot. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     *         >Extra Connection Attributes When Using PostgreSQL as a Source
     *         for AWS DMS</a>.
     *         </p>
     *         </note>
     */
    public String getCdcStartPosition() {
        return cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start.
     * Use either CdcStartPosition or CdcStartTime to specify when you want a
     * CDC operation to start. Specifying both values results in an error.
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
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a
     * logical replication slot should already be created and associated with
     * the source endpoint. You can verify this by setting the
     * <code>slotName</code> extra connection attribute to the name of this
     * logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for AWS
     * DMS</a>.
     * </p>
     * </note>
     *
     * @param cdcStartPosition <p>
     *            Indicates when you want a change data capture (CDC) operation
     *            to start. Use either CdcStartPosition or CdcStartTime to
     *            specify when you want a CDC operation to start. Specifying
     *            both values results in an error.
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
     *            <note>
     *            <p>
     *            When you use this task setting with a source PostgreSQL
     *            database, a logical replication slot should already be created
     *            and associated with the source endpoint. You can verify this
     *            by setting the <code>slotName</code> extra connection
     *            attribute to the name of this logical replication slot. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     *            >Extra Connection Attributes When Using PostgreSQL as a Source
     *            for AWS DMS</a>.
     *            </p>
     *            </note>
     */
    public void setCdcStartPosition(String cdcStartPosition) {
        this.cdcStartPosition = cdcStartPosition;
    }

    /**
     * <p>
     * Indicates when you want a change data capture (CDC) operation to start.
     * Use either CdcStartPosition or CdcStartTime to specify when you want a
     * CDC operation to start. Specifying both values results in an error.
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
     * <note>
     * <p>
     * When you use this task setting with a source PostgreSQL database, a
     * logical replication slot should already be created and associated with
     * the source endpoint. You can verify this by setting the
     * <code>slotName</code> extra connection attribute to the name of this
     * logical replication slot. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     * >Extra Connection Attributes When Using PostgreSQL as a Source for AWS
     * DMS</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cdcStartPosition <p>
     *            Indicates when you want a change data capture (CDC) operation
     *            to start. Use either CdcStartPosition or CdcStartTime to
     *            specify when you want a CDC operation to start. Specifying
     *            both values results in an error.
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
     *            <note>
     *            <p>
     *            When you use this task setting with a source PostgreSQL
     *            database, a logical replication slot should already be created
     *            and associated with the source endpoint. You can verify this
     *            by setting the <code>slotName</code> extra connection
     *            attribute to the name of this logical replication slot. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib"
     *            >Extra Connection Attributes When Using PostgreSQL as a Source
     *            for AWS DMS</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationTaskRequest withCdcStartPosition(String cdcStartPosition) {
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
    public CreateReplicationTaskRequest withCdcStopPosition(String cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
        return this;
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication task.
     * </p>
     *
     * @return <p>
     *         One or more tags to be assigned to the replication task.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication task.
     * </p>
     *
     * @param tags <p>
     *            One or more tags to be assigned to the replication task.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags to be assigned to the replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationTaskRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags to be assigned to the replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags to be assigned to the replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationTaskRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Supplemental information that the task requires to migrate the data for
     * certain source and target endpoints. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"
     * >Specifying Supplemental Data for Task Settings</a> in the <i>AWS
     * Database Migration Service User Guide.</i>
     * </p>
     *
     * @return <p>
     *         Supplemental information that the task requires to migrate the
     *         data for certain source and target endpoints. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"
     *         >Specifying Supplemental Data for Task Settings</a> in the <i>AWS
     *         Database Migration Service User Guide.</i>
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
     * Database Migration Service User Guide.</i>
     * </p>
     *
     * @param taskData <p>
     *            Supplemental information that the task requires to migrate the
     *            data for certain source and target endpoints. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html"
     *            >Specifying Supplemental Data for Task Settings</a> in the
     *            <i>AWS Database Migration Service User Guide.</i>
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
     * Database Migration Service User Guide.</i>
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
     *            <i>AWS Database Migration Service User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReplicationTaskRequest withTaskData(String taskData) {
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
        if (getCdcStartTime() != null)
            sb.append("CdcStartTime: " + getCdcStartTime() + ",");
        if (getCdcStartPosition() != null)
            sb.append("CdcStartPosition: " + getCdcStartPosition() + ",");
        if (getCdcStopPosition() != null)
            sb.append("CdcStopPosition: " + getCdcStopPosition() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
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
        hashCode = prime * hashCode
                + ((getCdcStartTime() == null) ? 0 : getCdcStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getCdcStartPosition() == null) ? 0 : getCdcStartPosition().hashCode());
        hashCode = prime * hashCode
                + ((getCdcStopPosition() == null) ? 0 : getCdcStopPosition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTaskData() == null) ? 0 : getTaskData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplicationTaskRequest == false)
            return false;
        CreateReplicationTaskRequest other = (CreateReplicationTaskRequest) obj;

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
        if (other.getCdcStartTime() == null ^ this.getCdcStartTime() == null)
            return false;
        if (other.getCdcStartTime() != null
                && other.getCdcStartTime().equals(this.getCdcStartTime()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTaskData() == null ^ this.getTaskData() == null)
            return false;
        if (other.getTaskData() != null && other.getTaskData().equals(this.getTaskData()) == false)
            return false;
        return true;
    }
}
