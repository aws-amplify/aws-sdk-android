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
 * Modifies the specified replication task.
 * </p>
 * <p>
 * You can't modify the task endpoints. The task must be stopped before you can
 * modify it.
 * </p>
 * <p>
 * For more information about AWS DMS tasks, see <a
 * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html"
 * >Working with Migration Tasks</a> in the <i>AWS Database Migration Service
 * User Guide</i>.
 * </p>
 */
public class ModifyReplicationTaskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     */
    private String replicationTaskArn;

    /**
     * <p>
     * The replication task identifier.
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
     * When using the AWS CLI or boto3, provide the path of the JSON file that
     * contains the table mappings. Precede the path with <code>file://</code>.
     * When working with the DMS API, provide the JSON as the parameter value,
     * for example: <code>--table-mappings file://mappingfile.json</code>
     * </p>
     */
    private String tableMappings;

    /**
     * <p>
     * JSON file that contains settings for the task, such as task metadata
     * settings.
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
    public ModifyReplicationTaskRequest withReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
        return this;
    }

    /**
     * <p>
     * The replication task identifier.
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
     *         The replication task identifier.
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
     * The replication task identifier.
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
     *            The replication task identifier.
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
     * The replication task identifier.
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
     *            The replication task identifier.
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
    public ModifyReplicationTaskRequest withReplicationTaskIdentifier(
            String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
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
    public ModifyReplicationTaskRequest withMigrationType(String migrationType) {
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
    public ModifyReplicationTaskRequest withMigrationType(MigrationTypeValue migrationType) {
        this.migrationType = migrationType.toString();
        return this;
    }

    /**
     * <p>
     * When using the AWS CLI or boto3, provide the path of the JSON file that
     * contains the table mappings. Precede the path with <code>file://</code>.
     * When working with the DMS API, provide the JSON as the parameter value,
     * for example: <code>--table-mappings file://mappingfile.json</code>
     * </p>
     *
     * @return <p>
     *         When using the AWS CLI or boto3, provide the path of the JSON
     *         file that contains the table mappings. Precede the path with
     *         <code>file://</code>. When working with the DMS API, provide the
     *         JSON as the parameter value, for example:
     *         <code>--table-mappings file://mappingfile.json</code>
     *         </p>
     */
    public String getTableMappings() {
        return tableMappings;
    }

    /**
     * <p>
     * When using the AWS CLI or boto3, provide the path of the JSON file that
     * contains the table mappings. Precede the path with <code>file://</code>.
     * When working with the DMS API, provide the JSON as the parameter value,
     * for example: <code>--table-mappings file://mappingfile.json</code>
     * </p>
     *
     * @param tableMappings <p>
     *            When using the AWS CLI or boto3, provide the path of the JSON
     *            file that contains the table mappings. Precede the path with
     *            <code>file://</code>. When working with the DMS API, provide
     *            the JSON as the parameter value, for example:
     *            <code>--table-mappings file://mappingfile.json</code>
     *            </p>
     */
    public void setTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
    }

    /**
     * <p>
     * When using the AWS CLI or boto3, provide the path of the JSON file that
     * contains the table mappings. Precede the path with <code>file://</code>.
     * When working with the DMS API, provide the JSON as the parameter value,
     * for example: <code>--table-mappings file://mappingfile.json</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableMappings <p>
     *            When using the AWS CLI or boto3, provide the path of the JSON
     *            file that contains the table mappings. Precede the path with
     *            <code>file://</code>. When working with the DMS API, provide
     *            the JSON as the parameter value, for example:
     *            <code>--table-mappings file://mappingfile.json</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationTaskRequest withTableMappings(String tableMappings) {
        this.tableMappings = tableMappings;
        return this;
    }

    /**
     * <p>
     * JSON file that contains settings for the task, such as task metadata
     * settings.
     * </p>
     *
     * @return <p>
     *         JSON file that contains settings for the task, such as task
     *         metadata settings.
     *         </p>
     */
    public String getReplicationTaskSettings() {
        return replicationTaskSettings;
    }

    /**
     * <p>
     * JSON file that contains settings for the task, such as task metadata
     * settings.
     * </p>
     *
     * @param replicationTaskSettings <p>
     *            JSON file that contains settings for the task, such as task
     *            metadata settings.
     *            </p>
     */
    public void setReplicationTaskSettings(String replicationTaskSettings) {
        this.replicationTaskSettings = replicationTaskSettings;
    }

    /**
     * <p>
     * JSON file that contains settings for the task, such as task metadata
     * settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskSettings <p>
     *            JSON file that contains settings for the task, such as task
     *            metadata settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReplicationTaskRequest withReplicationTaskSettings(String replicationTaskSettings) {
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
    public ModifyReplicationTaskRequest withCdcStartTime(java.util.Date cdcStartTime) {
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
    public ModifyReplicationTaskRequest withCdcStartPosition(String cdcStartPosition) {
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
    public ModifyReplicationTaskRequest withCdcStopPosition(String cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
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
    public ModifyReplicationTaskRequest withTaskData(String taskData) {
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
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: " + getReplicationTaskArn() + ",");
        if (getReplicationTaskIdentifier() != null)
            sb.append("ReplicationTaskIdentifier: " + getReplicationTaskIdentifier() + ",");
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
        if (getTaskData() != null)
            sb.append("TaskData: " + getTaskData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationTaskIdentifier() == null) ? 0 : getReplicationTaskIdentifier()
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
        hashCode = prime * hashCode + ((getTaskData() == null) ? 0 : getTaskData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationTaskRequest == false)
            return false;
        ModifyReplicationTaskRequest other = (ModifyReplicationTaskRequest) obj;

        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null
                && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getReplicationTaskIdentifier() == null
                ^ this.getReplicationTaskIdentifier() == null)
            return false;
        if (other.getReplicationTaskIdentifier() != null
                && other.getReplicationTaskIdentifier().equals(this.getReplicationTaskIdentifier()) == false)
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
        if (other.getTaskData() == null ^ this.getTaskData() == null)
            return false;
        if (other.getTaskData() != null && other.getTaskData().equals(this.getTaskData()) == false)
            return false;
        return true;
    }
}
