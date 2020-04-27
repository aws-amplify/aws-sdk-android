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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts the replication task.
 * </p>
 * <p>
 * For more information about AWS DMS tasks, see <a
 * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html"
 * >Working with Migration Tasks </a> in the <i>AWS Database Migration Service
 * User Guide.</i>
 * </p>
 */
public class StartReplicationTaskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task to be started.
     * </p>
     */
    private String replicationTaskArn;

    /**
     * <p>
     * The type of replication task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>start-replication, resume-processing,
     * reload-target
     */
    private String startReplicationTaskType;

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
     * The Amazon Resource Name (ARN) of the replication task to be started.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replication task to be
     *         started.
     *         </p>
     */
    public String getReplicationTaskArn() {
        return replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task to be started.
     * </p>
     *
     * @param replicationTaskArn <p>
     *            The Amazon Resource Name (ARN) of the replication task to be
     *            started.
     *            </p>
     */
    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task to be started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationTaskArn <p>
     *            The Amazon Resource Name (ARN) of the replication task to be
     *            started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartReplicationTaskRequest withReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
        return this;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>start-replication, resume-processing,
     * reload-target
     *
     * @return <p>
     *         The type of replication task.
     *         </p>
     * @see StartReplicationTaskTypeValue
     */
    public String getStartReplicationTaskType() {
        return startReplicationTaskType;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>start-replication, resume-processing,
     * reload-target
     *
     * @param startReplicationTaskType <p>
     *            The type of replication task.
     *            </p>
     * @see StartReplicationTaskTypeValue
     */
    public void setStartReplicationTaskType(String startReplicationTaskType) {
        this.startReplicationTaskType = startReplicationTaskType;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>start-replication, resume-processing,
     * reload-target
     *
     * @param startReplicationTaskType <p>
     *            The type of replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StartReplicationTaskTypeValue
     */
    public StartReplicationTaskRequest withStartReplicationTaskType(String startReplicationTaskType) {
        this.startReplicationTaskType = startReplicationTaskType;
        return this;
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>start-replication, resume-processing,
     * reload-target
     *
     * @param startReplicationTaskType <p>
     *            The type of replication task.
     *            </p>
     * @see StartReplicationTaskTypeValue
     */
    public void setStartReplicationTaskType(StartReplicationTaskTypeValue startReplicationTaskType) {
        this.startReplicationTaskType = startReplicationTaskType.toString();
    }

    /**
     * <p>
     * The type of replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>start-replication, resume-processing,
     * reload-target
     *
     * @param startReplicationTaskType <p>
     *            The type of replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StartReplicationTaskTypeValue
     */
    public StartReplicationTaskRequest withStartReplicationTaskType(
            StartReplicationTaskTypeValue startReplicationTaskType) {
        this.startReplicationTaskType = startReplicationTaskType.toString();
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
    public StartReplicationTaskRequest withCdcStartTime(java.util.Date cdcStartTime) {
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
    public StartReplicationTaskRequest withCdcStartPosition(String cdcStartPosition) {
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
    public StartReplicationTaskRequest withCdcStopPosition(String cdcStopPosition) {
        this.cdcStopPosition = cdcStopPosition;
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
        if (getStartReplicationTaskType() != null)
            sb.append("StartReplicationTaskType: " + getStartReplicationTaskType() + ",");
        if (getCdcStartTime() != null)
            sb.append("CdcStartTime: " + getCdcStartTime() + ",");
        if (getCdcStartPosition() != null)
            sb.append("CdcStartPosition: " + getCdcStartPosition() + ",");
        if (getCdcStopPosition() != null)
            sb.append("CdcStopPosition: " + getCdcStopPosition());
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
                + ((getStartReplicationTaskType() == null) ? 0 : getStartReplicationTaskType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCdcStartTime() == null) ? 0 : getCdcStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getCdcStartPosition() == null) ? 0 : getCdcStartPosition().hashCode());
        hashCode = prime * hashCode
                + ((getCdcStopPosition() == null) ? 0 : getCdcStopPosition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReplicationTaskRequest == false)
            return false;
        StartReplicationTaskRequest other = (StartReplicationTaskRequest) obj;

        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null
                && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getStartReplicationTaskType() == null
                ^ this.getStartReplicationTaskType() == null)
            return false;
        if (other.getStartReplicationTaskType() != null
                && other.getStartReplicationTaskType().equals(this.getStartReplicationTaskType()) == false)
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
        return true;
    }
}
