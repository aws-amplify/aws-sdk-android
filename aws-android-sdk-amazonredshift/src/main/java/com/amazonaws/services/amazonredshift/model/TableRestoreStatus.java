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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the status of a <a>RestoreTableFromClusterSnapshot</a> operation.
 * </p>
 */
public class TableRestoreStatus implements Serializable {
    /**
     * <p>
     * The unique identifier for the table restore request.
     * </p>
     */
    private String tableRestoreRequestId;

    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     */
    private String status;

    /**
     * <p>
     * A description of the status of the table restore request. Status values
     * include <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The time that the table restore request was made, in Universal
     * Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date requestTime;

    /**
     * <p>
     * The amount of data restored to the new table so far, in megabytes (MB).
     * </p>
     */
    private Long progressInMegaBytes;

    /**
     * <p>
     * The total amount of data to restore to the new table, in megabytes (MB).
     * </p>
     */
    private Long totalDataInMegaBytes;

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster that the table is being
     * restored to.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The identifier of the snapshot that the table is being restored from.
     * </p>
     */
    private String snapshotIdentifier;

    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     */
    private String sourceDatabaseName;

    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     */
    private String sourceSchemaName;

    /**
     * <p>
     * The name of the source table being restored.
     * </p>
     */
    private String sourceTableName;

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     */
    private String targetDatabaseName;

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     */
    private String targetSchemaName;

    /**
     * <p>
     * The name of the table to create as a result of the table restore request.
     * </p>
     */
    private String newTableName;

    /**
     * <p>
     * The unique identifier for the table restore request.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the table restore request.
     *         </p>
     */
    public String getTableRestoreRequestId() {
        return tableRestoreRequestId;
    }

    /**
     * <p>
     * The unique identifier for the table restore request.
     * </p>
     *
     * @param tableRestoreRequestId <p>
     *            The unique identifier for the table restore request.
     *            </p>
     */
    public void setTableRestoreRequestId(String tableRestoreRequestId) {
        this.tableRestoreRequestId = tableRestoreRequestId;
    }

    /**
     * <p>
     * The unique identifier for the table restore request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableRestoreRequestId <p>
     *            The unique identifier for the table restore request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withTableRestoreRequestId(String tableRestoreRequestId) {
        this.tableRestoreRequestId = tableRestoreRequestId;
        return this;
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     *
     * @return <p>
     *         A value that describes the current state of the table restore
     *         request.
     *         </p>
     *         <p>
     *         Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     *         <code>CANCELED</code>, <code>PENDING</code>,
     *         <code>IN_PROGRESS</code>
     *         </p>
     * @see TableRestoreStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     *
     * @param status <p>
     *            A value that describes the current state of the table restore
     *            request.
     *            </p>
     *            <p>
     *            Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     *            <code>CANCELED</code>, <code>PENDING</code>,
     *            <code>IN_PROGRESS</code>
     *            </p>
     * @see TableRestoreStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     *
     * @param status <p>
     *            A value that describes the current state of the table restore
     *            request.
     *            </p>
     *            <p>
     *            Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     *            <code>CANCELED</code>, <code>PENDING</code>,
     *            <code>IN_PROGRESS</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TableRestoreStatusType
     */
    public TableRestoreStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     *
     * @param status <p>
     *            A value that describes the current state of the table restore
     *            request.
     *            </p>
     *            <p>
     *            Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     *            <code>CANCELED</code>, <code>PENDING</code>,
     *            <code>IN_PROGRESS</code>
     *            </p>
     * @see TableRestoreStatusType
     */
    public void setStatus(TableRestoreStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * A value that describes the current state of the table restore request.
     * </p>
     * <p>
     * Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
     *
     * @param status <p>
     *            A value that describes the current state of the table restore
     *            request.
     *            </p>
     *            <p>
     *            Valid Values: <code>SUCCEEDED</code>, <code>FAILED</code>,
     *            <code>CANCELED</code>, <code>PENDING</code>,
     *            <code>IN_PROGRESS</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TableRestoreStatusType
     */
    public TableRestoreStatus withStatus(TableRestoreStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the table restore request. Status values
     * include <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     * </p>
     *
     * @return <p>
     *         A description of the status of the table restore request. Status
     *         values include <code>SUCCEEDED</code>, <code>FAILED</code>,
     *         <code>CANCELED</code>, <code>PENDING</code>,
     *         <code>IN_PROGRESS</code>.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A description of the status of the table restore request. Status values
     * include <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     * </p>
     *
     * @param message <p>
     *            A description of the status of the table restore request.
     *            Status values include <code>SUCCEEDED</code>,
     *            <code>FAILED</code>, <code>CANCELED</code>,
     *            <code>PENDING</code>, <code>IN_PROGRESS</code>.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the table restore request. Status values
     * include <code>SUCCEEDED</code>, <code>FAILED</code>,
     * <code>CANCELED</code>, <code>PENDING</code>, <code>IN_PROGRESS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A description of the status of the table restore request.
     *            Status values include <code>SUCCEEDED</code>,
     *            <code>FAILED</code>, <code>CANCELED</code>,
     *            <code>PENDING</code>, <code>IN_PROGRESS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The time that the table restore request was made, in Universal
     * Coordinated Time (UTC).
     * </p>
     *
     * @return <p>
     *         The time that the table restore request was made, in Universal
     *         Coordinated Time (UTC).
     *         </p>
     */
    public java.util.Date getRequestTime() {
        return requestTime;
    }

    /**
     * <p>
     * The time that the table restore request was made, in Universal
     * Coordinated Time (UTC).
     * </p>
     *
     * @param requestTime <p>
     *            The time that the table restore request was made, in Universal
     *            Coordinated Time (UTC).
     *            </p>
     */
    public void setRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * <p>
     * The time that the table restore request was made, in Universal
     * Coordinated Time (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestTime <p>
     *            The time that the table restore request was made, in Universal
     *            Coordinated Time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    /**
     * <p>
     * The amount of data restored to the new table so far, in megabytes (MB).
     * </p>
     *
     * @return <p>
     *         The amount of data restored to the new table so far, in megabytes
     *         (MB).
     *         </p>
     */
    public Long getProgressInMegaBytes() {
        return progressInMegaBytes;
    }

    /**
     * <p>
     * The amount of data restored to the new table so far, in megabytes (MB).
     * </p>
     *
     * @param progressInMegaBytes <p>
     *            The amount of data restored to the new table so far, in
     *            megabytes (MB).
     *            </p>
     */
    public void setProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
    }

    /**
     * <p>
     * The amount of data restored to the new table so far, in megabytes (MB).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progressInMegaBytes <p>
     *            The amount of data restored to the new table so far, in
     *            megabytes (MB).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
        return this;
    }

    /**
     * <p>
     * The total amount of data to restore to the new table, in megabytes (MB).
     * </p>
     *
     * @return <p>
     *         The total amount of data to restore to the new table, in
     *         megabytes (MB).
     *         </p>
     */
    public Long getTotalDataInMegaBytes() {
        return totalDataInMegaBytes;
    }

    /**
     * <p>
     * The total amount of data to restore to the new table, in megabytes (MB).
     * </p>
     *
     * @param totalDataInMegaBytes <p>
     *            The total amount of data to restore to the new table, in
     *            megabytes (MB).
     *            </p>
     */
    public void setTotalDataInMegaBytes(Long totalDataInMegaBytes) {
        this.totalDataInMegaBytes = totalDataInMegaBytes;
    }

    /**
     * <p>
     * The total amount of data to restore to the new table, in megabytes (MB).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalDataInMegaBytes <p>
     *            The total amount of data to restore to the new table, in
     *            megabytes (MB).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withTotalDataInMegaBytes(Long totalDataInMegaBytes) {
        this.totalDataInMegaBytes = totalDataInMegaBytes;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster that the table is being
     * restored to.
     * </p>
     *
     * @return <p>
     *         The identifier of the Amazon Redshift cluster that the table is
     *         being restored to.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster that the table is being
     * restored to.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The identifier of the Amazon Redshift cluster that the table
     *            is being restored to.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster that the table is being
     * restored to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The identifier of the Amazon Redshift cluster that the table
     *            is being restored to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the snapshot that the table is being restored from.
     * </p>
     *
     * @return <p>
     *         The identifier of the snapshot that the table is being restored
     *         from.
     *         </p>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot that the table is being restored from.
     * </p>
     *
     * @param snapshotIdentifier <p>
     *            The identifier of the snapshot that the table is being
     *            restored from.
     *            </p>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot that the table is being restored from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifier <p>
     *            The identifier of the snapshot that the table is being
     *            restored from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     *
     * @return <p>
     *         The name of the source database that contains the table being
     *         restored.
     *         </p>
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     *
     * @param sourceDatabaseName <p>
     *            The name of the source database that contains the table being
     *            restored.
     *            </p>
     */
    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database that contains the table being restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDatabaseName <p>
     *            The name of the source database that contains the table being
     *            restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     *
     * @return <p>
     *         The name of the source schema that contains the table being
     *         restored.
     *         </p>
     */
    public String getSourceSchemaName() {
        return sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     *
     * @param sourceSchemaName <p>
     *            The name of the source schema that contains the table being
     *            restored.
     *            </p>
     */
    public void setSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema that contains the table being restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSchemaName <p>
     *            The name of the source schema that contains the table being
     *            restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
        return this;
    }

    /**
     * <p>
     * The name of the source table being restored.
     * </p>
     *
     * @return <p>
     *         The name of the source table being restored.
     *         </p>
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    /**
     * <p>
     * The name of the source table being restored.
     * </p>
     *
     * @param sourceTableName <p>
     *            The name of the source table being restored.
     *            </p>
     */
    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    /**
     * <p>
     * The name of the source table being restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceTableName <p>
     *            The name of the source table being restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     *
     * @return <p>
     *         The name of the database to restore the table to.
     *         </p>
     */
    public String getTargetDatabaseName() {
        return targetDatabaseName;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     *
     * @param targetDatabaseName <p>
     *            The name of the database to restore the table to.
     *            </p>
     */
    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetDatabaseName <p>
     *            The name of the database to restore the table to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     *
     * @return <p>
     *         The name of the schema to restore the table to.
     *         </p>
     */
    public String getTargetSchemaName() {
        return targetSchemaName;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     *
     * @param targetSchemaName <p>
     *            The name of the schema to restore the table to.
     *            </p>
     */
    public void setTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetSchemaName <p>
     *            The name of the schema to restore the table to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
        return this;
    }

    /**
     * <p>
     * The name of the table to create as a result of the table restore request.
     * </p>
     *
     * @return <p>
     *         The name of the table to create as a result of the table restore
     *         request.
     *         </p>
     */
    public String getNewTableName() {
        return newTableName;
    }

    /**
     * <p>
     * The name of the table to create as a result of the table restore request.
     * </p>
     *
     * @param newTableName <p>
     *            The name of the table to create as a result of the table
     *            restore request.
     *            </p>
     */
    public void setNewTableName(String newTableName) {
        this.newTableName = newTableName;
    }

    /**
     * <p>
     * The name of the table to create as a result of the table restore request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newTableName <p>
     *            The name of the table to create as a result of the table
     *            restore request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableRestoreStatus withNewTableName(String newTableName) {
        this.newTableName = newTableName;
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
        if (getTableRestoreRequestId() != null)
            sb.append("TableRestoreRequestId: " + getTableRestoreRequestId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getRequestTime() != null)
            sb.append("RequestTime: " + getRequestTime() + ",");
        if (getProgressInMegaBytes() != null)
            sb.append("ProgressInMegaBytes: " + getProgressInMegaBytes() + ",");
        if (getTotalDataInMegaBytes() != null)
            sb.append("TotalDataInMegaBytes: " + getTotalDataInMegaBytes() + ",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSourceDatabaseName() != null)
            sb.append("SourceDatabaseName: " + getSourceDatabaseName() + ",");
        if (getSourceSchemaName() != null)
            sb.append("SourceSchemaName: " + getSourceSchemaName() + ",");
        if (getSourceTableName() != null)
            sb.append("SourceTableName: " + getSourceTableName() + ",");
        if (getTargetDatabaseName() != null)
            sb.append("TargetDatabaseName: " + getTargetDatabaseName() + ",");
        if (getTargetSchemaName() != null)
            sb.append("TargetSchemaName: " + getTargetSchemaName() + ",");
        if (getNewTableName() != null)
            sb.append("NewTableName: " + getNewTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTableRestoreRequestId() == null) ? 0 : getTableRestoreRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode());
        hashCode = prime * hashCode
                + ((getProgressInMegaBytes() == null) ? 0 : getProgressInMegaBytes().hashCode());
        hashCode = prime * hashCode
                + ((getTotalDataInMegaBytes() == null) ? 0 : getTotalDataInMegaBytes().hashCode());
        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSourceDatabaseName() == null) ? 0 : getSourceDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceSchemaName() == null) ? 0 : getSourceSchemaName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceTableName() == null) ? 0 : getSourceTableName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetDatabaseName() == null) ? 0 : getTargetDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetSchemaName() == null) ? 0 : getTargetSchemaName().hashCode());
        hashCode = prime * hashCode
                + ((getNewTableName() == null) ? 0 : getNewTableName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableRestoreStatus == false)
            return false;
        TableRestoreStatus other = (TableRestoreStatus) obj;

        if (other.getTableRestoreRequestId() == null ^ this.getTableRestoreRequestId() == null)
            return false;
        if (other.getTableRestoreRequestId() != null
                && other.getTableRestoreRequestId().equals(this.getTableRestoreRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getRequestTime() == null ^ this.getRequestTime() == null)
            return false;
        if (other.getRequestTime() != null
                && other.getRequestTime().equals(this.getRequestTime()) == false)
            return false;
        if (other.getProgressInMegaBytes() == null ^ this.getProgressInMegaBytes() == null)
            return false;
        if (other.getProgressInMegaBytes() != null
                && other.getProgressInMegaBytes().equals(this.getProgressInMegaBytes()) == false)
            return false;
        if (other.getTotalDataInMegaBytes() == null ^ this.getTotalDataInMegaBytes() == null)
            return false;
        if (other.getTotalDataInMegaBytes() != null
                && other.getTotalDataInMegaBytes().equals(this.getTotalDataInMegaBytes()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSourceDatabaseName() == null ^ this.getSourceDatabaseName() == null)
            return false;
        if (other.getSourceDatabaseName() != null
                && other.getSourceDatabaseName().equals(this.getSourceDatabaseName()) == false)
            return false;
        if (other.getSourceSchemaName() == null ^ this.getSourceSchemaName() == null)
            return false;
        if (other.getSourceSchemaName() != null
                && other.getSourceSchemaName().equals(this.getSourceSchemaName()) == false)
            return false;
        if (other.getSourceTableName() == null ^ this.getSourceTableName() == null)
            return false;
        if (other.getSourceTableName() != null
                && other.getSourceTableName().equals(this.getSourceTableName()) == false)
            return false;
        if (other.getTargetDatabaseName() == null ^ this.getTargetDatabaseName() == null)
            return false;
        if (other.getTargetDatabaseName() != null
                && other.getTargetDatabaseName().equals(this.getTargetDatabaseName()) == false)
            return false;
        if (other.getTargetSchemaName() == null ^ this.getTargetSchemaName() == null)
            return false;
        if (other.getTargetSchemaName() != null
                && other.getTargetSchemaName().equals(this.getTargetSchemaName()) == false)
            return false;
        if (other.getNewTableName() == null ^ this.getNewTableName() == null)
            return false;
        if (other.getNewTableName() != null
                && other.getNewTableName().equals(this.getNewTableName()) == false)
            return false;
        return true;
    }
}
