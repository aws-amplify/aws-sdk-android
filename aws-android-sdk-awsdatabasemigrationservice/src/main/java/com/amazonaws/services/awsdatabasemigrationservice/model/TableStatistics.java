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
 * Provides a collection of table statistics in response to a request by the
 * <code>DescribeTableStatistics</code> operation.
 * </p>
 */
public class TableStatistics implements Serializable {
    /**
     * <p>
     * The schema name.
     * </p>
     */
    private String schemaName;

    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;

    /**
     * <p>
     * The number of insert actions performed on a table.
     * </p>
     */
    private Long inserts;

    /**
     * <p>
     * The number of delete actions performed on a table.
     * </p>
     */
    private Long deletes;

    /**
     * <p>
     * The number of update actions performed on a table.
     * </p>
     */
    private Long updates;

    /**
     * <p>
     * The data definition language (DDL) used to build and modify the structure
     * of your tables.
     * </p>
     */
    private Long ddls;

    /**
     * <p>
     * The number of rows added during the full load operation.
     * </p>
     */
    private Long fullLoadRows;

    /**
     * <p>
     * The number of rows that failed conditional checks during the full load
     * operation (valid only for migrations where DynamoDB is the target).
     * </p>
     */
    private Long fullLoadCondtnlChkFailedRows;

    /**
     * <p>
     * The number of rows that failed to load during the full load operation
     * (valid only for migrations where DynamoDB is the target).
     * </p>
     */
    private Long fullLoadErrorRows;

    /**
     * <p>
     * The time when the full load operation started.
     * </p>
     */
    private java.util.Date fullLoadStartTime;

    /**
     * <p>
     * The time when the full load operation completed.
     * </p>
     */
    private java.util.Date fullLoadEndTime;

    /**
     * <p>
     * A value that indicates if the table was reloaded (<code>true</code>) or
     * loaded as part of a new full load operation (<code>false</code>).
     * </p>
     */
    private Boolean fullLoadReloaded;

    /**
     * <p>
     * The last time a table was updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The state of the tables described.
     * </p>
     * <p>
     * Valid states: Table does not exist | Before load | Full load | Table
     * completed | Table cancelled | Table error | Table all | Table updates |
     * Table is being reloaded
     * </p>
     */
    private String tableState;

    /**
     * <p>
     * The number of records that have yet to be validated.
     * </p>
     */
    private Long validationPendingRecords;

    /**
     * <p>
     * The number of records that failed validation.
     * </p>
     */
    private Long validationFailedRecords;

    /**
     * <p>
     * The number of records that couldn't be validated.
     * </p>
     */
    private Long validationSuspendedRecords;

    /**
     * <p>
     * The validation state of the table.
     * </p>
     * <p>
     * This parameter can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not enabled - Validation isn't enabled for the table in the migration
     * task.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending records - Some records in the table are waiting for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mismatched records - Some records in the table don't match between the
     * source and target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suspended records - Some records in the table couldn't be validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * No primary key - The table couldn't be validated because it has no
     * primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table error - The table wasn't validated because it's in an error state
     * and some data wasn't migrated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validated - All rows in the table are validated. If the table is updated,
     * the status can change from Validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Error - The table couldn't be validated because of an unexpected error.
     * </p>
     * </li>
     * </ul>
     */
    private String validationState;

    /**
     * <p>
     * Additional details about the state of validation.
     * </p>
     */
    private String validationStateDetails;

    /**
     * <p>
     * The schema name.
     * </p>
     *
     * @return <p>
     *         The schema name.
     *         </p>
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * <p>
     * The schema name.
     * </p>
     *
     * @param schemaName <p>
     *            The schema name.
     *            </p>
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The schema name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaName <p>
     *            The schema name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     *
     * @return <p>
     *         The name of the table.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     *
     * @param tableName <p>
     *            The name of the table.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableName <p>
     *            The name of the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The number of insert actions performed on a table.
     * </p>
     *
     * @return <p>
     *         The number of insert actions performed on a table.
     *         </p>
     */
    public Long getInserts() {
        return inserts;
    }

    /**
     * <p>
     * The number of insert actions performed on a table.
     * </p>
     *
     * @param inserts <p>
     *            The number of insert actions performed on a table.
     *            </p>
     */
    public void setInserts(Long inserts) {
        this.inserts = inserts;
    }

    /**
     * <p>
     * The number of insert actions performed on a table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inserts <p>
     *            The number of insert actions performed on a table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withInserts(Long inserts) {
        this.inserts = inserts;
        return this;
    }

    /**
     * <p>
     * The number of delete actions performed on a table.
     * </p>
     *
     * @return <p>
     *         The number of delete actions performed on a table.
     *         </p>
     */
    public Long getDeletes() {
        return deletes;
    }

    /**
     * <p>
     * The number of delete actions performed on a table.
     * </p>
     *
     * @param deletes <p>
     *            The number of delete actions performed on a table.
     *            </p>
     */
    public void setDeletes(Long deletes) {
        this.deletes = deletes;
    }

    /**
     * <p>
     * The number of delete actions performed on a table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletes <p>
     *            The number of delete actions performed on a table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withDeletes(Long deletes) {
        this.deletes = deletes;
        return this;
    }

    /**
     * <p>
     * The number of update actions performed on a table.
     * </p>
     *
     * @return <p>
     *         The number of update actions performed on a table.
     *         </p>
     */
    public Long getUpdates() {
        return updates;
    }

    /**
     * <p>
     * The number of update actions performed on a table.
     * </p>
     *
     * @param updates <p>
     *            The number of update actions performed on a table.
     *            </p>
     */
    public void setUpdates(Long updates) {
        this.updates = updates;
    }

    /**
     * <p>
     * The number of update actions performed on a table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            The number of update actions performed on a table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withUpdates(Long updates) {
        this.updates = updates;
        return this;
    }

    /**
     * <p>
     * The data definition language (DDL) used to build and modify the structure
     * of your tables.
     * </p>
     *
     * @return <p>
     *         The data definition language (DDL) used to build and modify the
     *         structure of your tables.
     *         </p>
     */
    public Long getDdls() {
        return ddls;
    }

    /**
     * <p>
     * The data definition language (DDL) used to build and modify the structure
     * of your tables.
     * </p>
     *
     * @param ddls <p>
     *            The data definition language (DDL) used to build and modify
     *            the structure of your tables.
     *            </p>
     */
    public void setDdls(Long ddls) {
        this.ddls = ddls;
    }

    /**
     * <p>
     * The data definition language (DDL) used to build and modify the structure
     * of your tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ddls <p>
     *            The data definition language (DDL) used to build and modify
     *            the structure of your tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withDdls(Long ddls) {
        this.ddls = ddls;
        return this;
    }

    /**
     * <p>
     * The number of rows added during the full load operation.
     * </p>
     *
     * @return <p>
     *         The number of rows added during the full load operation.
     *         </p>
     */
    public Long getFullLoadRows() {
        return fullLoadRows;
    }

    /**
     * <p>
     * The number of rows added during the full load operation.
     * </p>
     *
     * @param fullLoadRows <p>
     *            The number of rows added during the full load operation.
     *            </p>
     */
    public void setFullLoadRows(Long fullLoadRows) {
        this.fullLoadRows = fullLoadRows;
    }

    /**
     * <p>
     * The number of rows added during the full load operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fullLoadRows <p>
     *            The number of rows added during the full load operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withFullLoadRows(Long fullLoadRows) {
        this.fullLoadRows = fullLoadRows;
        return this;
    }

    /**
     * <p>
     * The number of rows that failed conditional checks during the full load
     * operation (valid only for migrations where DynamoDB is the target).
     * </p>
     *
     * @return <p>
     *         The number of rows that failed conditional checks during the full
     *         load operation (valid only for migrations where DynamoDB is the
     *         target).
     *         </p>
     */
    public Long getFullLoadCondtnlChkFailedRows() {
        return fullLoadCondtnlChkFailedRows;
    }

    /**
     * <p>
     * The number of rows that failed conditional checks during the full load
     * operation (valid only for migrations where DynamoDB is the target).
     * </p>
     *
     * @param fullLoadCondtnlChkFailedRows <p>
     *            The number of rows that failed conditional checks during the
     *            full load operation (valid only for migrations where DynamoDB
     *            is the target).
     *            </p>
     */
    public void setFullLoadCondtnlChkFailedRows(Long fullLoadCondtnlChkFailedRows) {
        this.fullLoadCondtnlChkFailedRows = fullLoadCondtnlChkFailedRows;
    }

    /**
     * <p>
     * The number of rows that failed conditional checks during the full load
     * operation (valid only for migrations where DynamoDB is the target).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fullLoadCondtnlChkFailedRows <p>
     *            The number of rows that failed conditional checks during the
     *            full load operation (valid only for migrations where DynamoDB
     *            is the target).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withFullLoadCondtnlChkFailedRows(Long fullLoadCondtnlChkFailedRows) {
        this.fullLoadCondtnlChkFailedRows = fullLoadCondtnlChkFailedRows;
        return this;
    }

    /**
     * <p>
     * The number of rows that failed to load during the full load operation
     * (valid only for migrations where DynamoDB is the target).
     * </p>
     *
     * @return <p>
     *         The number of rows that failed to load during the full load
     *         operation (valid only for migrations where DynamoDB is the
     *         target).
     *         </p>
     */
    public Long getFullLoadErrorRows() {
        return fullLoadErrorRows;
    }

    /**
     * <p>
     * The number of rows that failed to load during the full load operation
     * (valid only for migrations where DynamoDB is the target).
     * </p>
     *
     * @param fullLoadErrorRows <p>
     *            The number of rows that failed to load during the full load
     *            operation (valid only for migrations where DynamoDB is the
     *            target).
     *            </p>
     */
    public void setFullLoadErrorRows(Long fullLoadErrorRows) {
        this.fullLoadErrorRows = fullLoadErrorRows;
    }

    /**
     * <p>
     * The number of rows that failed to load during the full load operation
     * (valid only for migrations where DynamoDB is the target).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fullLoadErrorRows <p>
     *            The number of rows that failed to load during the full load
     *            operation (valid only for migrations where DynamoDB is the
     *            target).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withFullLoadErrorRows(Long fullLoadErrorRows) {
        this.fullLoadErrorRows = fullLoadErrorRows;
        return this;
    }

    /**
     * <p>
     * The time when the full load operation started.
     * </p>
     *
     * @return <p>
     *         The time when the full load operation started.
     *         </p>
     */
    public java.util.Date getFullLoadStartTime() {
        return fullLoadStartTime;
    }

    /**
     * <p>
     * The time when the full load operation started.
     * </p>
     *
     * @param fullLoadStartTime <p>
     *            The time when the full load operation started.
     *            </p>
     */
    public void setFullLoadStartTime(java.util.Date fullLoadStartTime) {
        this.fullLoadStartTime = fullLoadStartTime;
    }

    /**
     * <p>
     * The time when the full load operation started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fullLoadStartTime <p>
     *            The time when the full load operation started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withFullLoadStartTime(java.util.Date fullLoadStartTime) {
        this.fullLoadStartTime = fullLoadStartTime;
        return this;
    }

    /**
     * <p>
     * The time when the full load operation completed.
     * </p>
     *
     * @return <p>
     *         The time when the full load operation completed.
     *         </p>
     */
    public java.util.Date getFullLoadEndTime() {
        return fullLoadEndTime;
    }

    /**
     * <p>
     * The time when the full load operation completed.
     * </p>
     *
     * @param fullLoadEndTime <p>
     *            The time when the full load operation completed.
     *            </p>
     */
    public void setFullLoadEndTime(java.util.Date fullLoadEndTime) {
        this.fullLoadEndTime = fullLoadEndTime;
    }

    /**
     * <p>
     * The time when the full load operation completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fullLoadEndTime <p>
     *            The time when the full load operation completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withFullLoadEndTime(java.util.Date fullLoadEndTime) {
        this.fullLoadEndTime = fullLoadEndTime;
        return this;
    }

    /**
     * <p>
     * A value that indicates if the table was reloaded (<code>true</code>) or
     * loaded as part of a new full load operation (<code>false</code>).
     * </p>
     *
     * @return <p>
     *         A value that indicates if the table was reloaded (
     *         <code>true</code>) or loaded as part of a new full load operation
     *         (<code>false</code>).
     *         </p>
     */
    public Boolean isFullLoadReloaded() {
        return fullLoadReloaded;
    }

    /**
     * <p>
     * A value that indicates if the table was reloaded (<code>true</code>) or
     * loaded as part of a new full load operation (<code>false</code>).
     * </p>
     *
     * @return <p>
     *         A value that indicates if the table was reloaded (
     *         <code>true</code>) or loaded as part of a new full load operation
     *         (<code>false</code>).
     *         </p>
     */
    public Boolean getFullLoadReloaded() {
        return fullLoadReloaded;
    }

    /**
     * <p>
     * A value that indicates if the table was reloaded (<code>true</code>) or
     * loaded as part of a new full load operation (<code>false</code>).
     * </p>
     *
     * @param fullLoadReloaded <p>
     *            A value that indicates if the table was reloaded (
     *            <code>true</code>) or loaded as part of a new full load
     *            operation (<code>false</code>).
     *            </p>
     */
    public void setFullLoadReloaded(Boolean fullLoadReloaded) {
        this.fullLoadReloaded = fullLoadReloaded;
    }

    /**
     * <p>
     * A value that indicates if the table was reloaded (<code>true</code>) or
     * loaded as part of a new full load operation (<code>false</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fullLoadReloaded <p>
     *            A value that indicates if the table was reloaded (
     *            <code>true</code>) or loaded as part of a new full load
     *            operation (<code>false</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withFullLoadReloaded(Boolean fullLoadReloaded) {
        this.fullLoadReloaded = fullLoadReloaded;
        return this;
    }

    /**
     * <p>
     * The last time a table was updated.
     * </p>
     *
     * @return <p>
     *         The last time a table was updated.
     *         </p>
     */
    public java.util.Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * <p>
     * The last time a table was updated.
     * </p>
     *
     * @param lastUpdateTime <p>
     *            The last time a table was updated.
     *            </p>
     */
    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time a table was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateTime <p>
     *            The last time a table was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * <p>
     * The state of the tables described.
     * </p>
     * <p>
     * Valid states: Table does not exist | Before load | Full load | Table
     * completed | Table cancelled | Table error | Table all | Table updates |
     * Table is being reloaded
     * </p>
     *
     * @return <p>
     *         The state of the tables described.
     *         </p>
     *         <p>
     *         Valid states: Table does not exist | Before load | Full load |
     *         Table completed | Table cancelled | Table error | Table all |
     *         Table updates | Table is being reloaded
     *         </p>
     */
    public String getTableState() {
        return tableState;
    }

    /**
     * <p>
     * The state of the tables described.
     * </p>
     * <p>
     * Valid states: Table does not exist | Before load | Full load | Table
     * completed | Table cancelled | Table error | Table all | Table updates |
     * Table is being reloaded
     * </p>
     *
     * @param tableState <p>
     *            The state of the tables described.
     *            </p>
     *            <p>
     *            Valid states: Table does not exist | Before load | Full load |
     *            Table completed | Table cancelled | Table error | Table all |
     *            Table updates | Table is being reloaded
     *            </p>
     */
    public void setTableState(String tableState) {
        this.tableState = tableState;
    }

    /**
     * <p>
     * The state of the tables described.
     * </p>
     * <p>
     * Valid states: Table does not exist | Before load | Full load | Table
     * completed | Table cancelled | Table error | Table all | Table updates |
     * Table is being reloaded
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableState <p>
     *            The state of the tables described.
     *            </p>
     *            <p>
     *            Valid states: Table does not exist | Before load | Full load |
     *            Table completed | Table cancelled | Table error | Table all |
     *            Table updates | Table is being reloaded
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withTableState(String tableState) {
        this.tableState = tableState;
        return this;
    }

    /**
     * <p>
     * The number of records that have yet to be validated.
     * </p>
     *
     * @return <p>
     *         The number of records that have yet to be validated.
     *         </p>
     */
    public Long getValidationPendingRecords() {
        return validationPendingRecords;
    }

    /**
     * <p>
     * The number of records that have yet to be validated.
     * </p>
     *
     * @param validationPendingRecords <p>
     *            The number of records that have yet to be validated.
     *            </p>
     */
    public void setValidationPendingRecords(Long validationPendingRecords) {
        this.validationPendingRecords = validationPendingRecords;
    }

    /**
     * <p>
     * The number of records that have yet to be validated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationPendingRecords <p>
     *            The number of records that have yet to be validated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withValidationPendingRecords(Long validationPendingRecords) {
        this.validationPendingRecords = validationPendingRecords;
        return this;
    }

    /**
     * <p>
     * The number of records that failed validation.
     * </p>
     *
     * @return <p>
     *         The number of records that failed validation.
     *         </p>
     */
    public Long getValidationFailedRecords() {
        return validationFailedRecords;
    }

    /**
     * <p>
     * The number of records that failed validation.
     * </p>
     *
     * @param validationFailedRecords <p>
     *            The number of records that failed validation.
     *            </p>
     */
    public void setValidationFailedRecords(Long validationFailedRecords) {
        this.validationFailedRecords = validationFailedRecords;
    }

    /**
     * <p>
     * The number of records that failed validation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationFailedRecords <p>
     *            The number of records that failed validation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withValidationFailedRecords(Long validationFailedRecords) {
        this.validationFailedRecords = validationFailedRecords;
        return this;
    }

    /**
     * <p>
     * The number of records that couldn't be validated.
     * </p>
     *
     * @return <p>
     *         The number of records that couldn't be validated.
     *         </p>
     */
    public Long getValidationSuspendedRecords() {
        return validationSuspendedRecords;
    }

    /**
     * <p>
     * The number of records that couldn't be validated.
     * </p>
     *
     * @param validationSuspendedRecords <p>
     *            The number of records that couldn't be validated.
     *            </p>
     */
    public void setValidationSuspendedRecords(Long validationSuspendedRecords) {
        this.validationSuspendedRecords = validationSuspendedRecords;
    }

    /**
     * <p>
     * The number of records that couldn't be validated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationSuspendedRecords <p>
     *            The number of records that couldn't be validated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withValidationSuspendedRecords(Long validationSuspendedRecords) {
        this.validationSuspendedRecords = validationSuspendedRecords;
        return this;
    }

    /**
     * <p>
     * The validation state of the table.
     * </p>
     * <p>
     * This parameter can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not enabled - Validation isn't enabled for the table in the migration
     * task.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending records - Some records in the table are waiting for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mismatched records - Some records in the table don't match between the
     * source and target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suspended records - Some records in the table couldn't be validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * No primary key - The table couldn't be validated because it has no
     * primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table error - The table wasn't validated because it's in an error state
     * and some data wasn't migrated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validated - All rows in the table are validated. If the table is updated,
     * the status can change from Validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Error - The table couldn't be validated because of an unexpected error.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The validation state of the table.
     *         </p>
     *         <p>
     *         This parameter can have the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Not enabled - Validation isn't enabled for the table in the
     *         migration task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Pending records - Some records in the table are waiting for
     *         validation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Mismatched records - Some records in the table don't match
     *         between the source and target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Suspended records - Some records in the table couldn't be
     *         validated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No primary key - The table couldn't be validated because it has
     *         no primary key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Table error - The table wasn't validated because it's in an error
     *         state and some data wasn't migrated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Validated - All rows in the table are validated. If the table is
     *         updated, the status can change from Validated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Error - The table couldn't be validated because of an unexpected
     *         error.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getValidationState() {
        return validationState;
    }

    /**
     * <p>
     * The validation state of the table.
     * </p>
     * <p>
     * This parameter can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not enabled - Validation isn't enabled for the table in the migration
     * task.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending records - Some records in the table are waiting for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mismatched records - Some records in the table don't match between the
     * source and target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suspended records - Some records in the table couldn't be validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * No primary key - The table couldn't be validated because it has no
     * primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table error - The table wasn't validated because it's in an error state
     * and some data wasn't migrated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validated - All rows in the table are validated. If the table is updated,
     * the status can change from Validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Error - The table couldn't be validated because of an unexpected error.
     * </p>
     * </li>
     * </ul>
     *
     * @param validationState <p>
     *            The validation state of the table.
     *            </p>
     *            <p>
     *            This parameter can have the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Not enabled - Validation isn't enabled for the table in the
     *            migration task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Pending records - Some records in the table are waiting for
     *            validation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Mismatched records - Some records in the table don't match
     *            between the source and target.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Suspended records - Some records in the table couldn't be
     *            validated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No primary key - The table couldn't be validated because it
     *            has no primary key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Table error - The table wasn't validated because it's in an
     *            error state and some data wasn't migrated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Validated - All rows in the table are validated. If the table
     *            is updated, the status can change from Validated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Error - The table couldn't be validated because of an
     *            unexpected error.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setValidationState(String validationState) {
        this.validationState = validationState;
    }

    /**
     * <p>
     * The validation state of the table.
     * </p>
     * <p>
     * This parameter can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Not enabled - Validation isn't enabled for the table in the migration
     * task.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending records - Some records in the table are waiting for validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mismatched records - Some records in the table don't match between the
     * source and target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suspended records - Some records in the table couldn't be validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * No primary key - The table couldn't be validated because it has no
     * primary key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table error - The table wasn't validated because it's in an error state
     * and some data wasn't migrated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Validated - All rows in the table are validated. If the table is updated,
     * the status can change from Validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Error - The table couldn't be validated because of an unexpected error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationState <p>
     *            The validation state of the table.
     *            </p>
     *            <p>
     *            This parameter can have the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Not enabled - Validation isn't enabled for the table in the
     *            migration task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Pending records - Some records in the table are waiting for
     *            validation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Mismatched records - Some records in the table don't match
     *            between the source and target.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Suspended records - Some records in the table couldn't be
     *            validated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No primary key - The table couldn't be validated because it
     *            has no primary key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Table error - The table wasn't validated because it's in an
     *            error state and some data wasn't migrated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Validated - All rows in the table are validated. If the table
     *            is updated, the status can change from Validated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Error - The table couldn't be validated because of an
     *            unexpected error.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withValidationState(String validationState) {
        this.validationState = validationState;
        return this;
    }

    /**
     * <p>
     * Additional details about the state of validation.
     * </p>
     *
     * @return <p>
     *         Additional details about the state of validation.
     *         </p>
     */
    public String getValidationStateDetails() {
        return validationStateDetails;
    }

    /**
     * <p>
     * Additional details about the state of validation.
     * </p>
     *
     * @param validationStateDetails <p>
     *            Additional details about the state of validation.
     *            </p>
     */
    public void setValidationStateDetails(String validationStateDetails) {
        this.validationStateDetails = validationStateDetails;
    }

    /**
     * <p>
     * Additional details about the state of validation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationStateDetails <p>
     *            Additional details about the state of validation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableStatistics withValidationStateDetails(String validationStateDetails) {
        this.validationStateDetails = validationStateDetails;
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
        if (getSchemaName() != null)
            sb.append("SchemaName: " + getSchemaName() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getInserts() != null)
            sb.append("Inserts: " + getInserts() + ",");
        if (getDeletes() != null)
            sb.append("Deletes: " + getDeletes() + ",");
        if (getUpdates() != null)
            sb.append("Updates: " + getUpdates() + ",");
        if (getDdls() != null)
            sb.append("Ddls: " + getDdls() + ",");
        if (getFullLoadRows() != null)
            sb.append("FullLoadRows: " + getFullLoadRows() + ",");
        if (getFullLoadCondtnlChkFailedRows() != null)
            sb.append("FullLoadCondtnlChkFailedRows: " + getFullLoadCondtnlChkFailedRows() + ",");
        if (getFullLoadErrorRows() != null)
            sb.append("FullLoadErrorRows: " + getFullLoadErrorRows() + ",");
        if (getFullLoadStartTime() != null)
            sb.append("FullLoadStartTime: " + getFullLoadStartTime() + ",");
        if (getFullLoadEndTime() != null)
            sb.append("FullLoadEndTime: " + getFullLoadEndTime() + ",");
        if (getFullLoadReloaded() != null)
            sb.append("FullLoadReloaded: " + getFullLoadReloaded() + ",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: " + getLastUpdateTime() + ",");
        if (getTableState() != null)
            sb.append("TableState: " + getTableState() + ",");
        if (getValidationPendingRecords() != null)
            sb.append("ValidationPendingRecords: " + getValidationPendingRecords() + ",");
        if (getValidationFailedRecords() != null)
            sb.append("ValidationFailedRecords: " + getValidationFailedRecords() + ",");
        if (getValidationSuspendedRecords() != null)
            sb.append("ValidationSuspendedRecords: " + getValidationSuspendedRecords() + ",");
        if (getValidationState() != null)
            sb.append("ValidationState: " + getValidationState() + ",");
        if (getValidationStateDetails() != null)
            sb.append("ValidationStateDetails: " + getValidationStateDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getInserts() == null) ? 0 : getInserts().hashCode());
        hashCode = prime * hashCode + ((getDeletes() == null) ? 0 : getDeletes().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        hashCode = prime * hashCode + ((getDdls() == null) ? 0 : getDdls().hashCode());
        hashCode = prime * hashCode
                + ((getFullLoadRows() == null) ? 0 : getFullLoadRows().hashCode());
        hashCode = prime
                * hashCode
                + ((getFullLoadCondtnlChkFailedRows() == null) ? 0
                        : getFullLoadCondtnlChkFailedRows().hashCode());
        hashCode = prime * hashCode
                + ((getFullLoadErrorRows() == null) ? 0 : getFullLoadErrorRows().hashCode());
        hashCode = prime * hashCode
                + ((getFullLoadStartTime() == null) ? 0 : getFullLoadStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getFullLoadEndTime() == null) ? 0 : getFullLoadEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getFullLoadReloaded() == null) ? 0 : getFullLoadReloaded().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getTableState() == null) ? 0 : getTableState().hashCode());
        hashCode = prime
                * hashCode
                + ((getValidationPendingRecords() == null) ? 0 : getValidationPendingRecords()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getValidationFailedRecords() == null) ? 0 : getValidationFailedRecords()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getValidationSuspendedRecords() == null) ? 0 : getValidationSuspendedRecords()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getValidationState() == null) ? 0 : getValidationState().hashCode());
        hashCode = prime
                * hashCode
                + ((getValidationStateDetails() == null) ? 0 : getValidationStateDetails()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableStatistics == false)
            return false;
        TableStatistics other = (TableStatistics) obj;

        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null
                && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getInserts() == null ^ this.getInserts() == null)
            return false;
        if (other.getInserts() != null && other.getInserts().equals(this.getInserts()) == false)
            return false;
        if (other.getDeletes() == null ^ this.getDeletes() == null)
            return false;
        if (other.getDeletes() != null && other.getDeletes().equals(this.getDeletes()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        if (other.getDdls() == null ^ this.getDdls() == null)
            return false;
        if (other.getDdls() != null && other.getDdls().equals(this.getDdls()) == false)
            return false;
        if (other.getFullLoadRows() == null ^ this.getFullLoadRows() == null)
            return false;
        if (other.getFullLoadRows() != null
                && other.getFullLoadRows().equals(this.getFullLoadRows()) == false)
            return false;
        if (other.getFullLoadCondtnlChkFailedRows() == null
                ^ this.getFullLoadCondtnlChkFailedRows() == null)
            return false;
        if (other.getFullLoadCondtnlChkFailedRows() != null
                && other.getFullLoadCondtnlChkFailedRows().equals(
                        this.getFullLoadCondtnlChkFailedRows()) == false)
            return false;
        if (other.getFullLoadErrorRows() == null ^ this.getFullLoadErrorRows() == null)
            return false;
        if (other.getFullLoadErrorRows() != null
                && other.getFullLoadErrorRows().equals(this.getFullLoadErrorRows()) == false)
            return false;
        if (other.getFullLoadStartTime() == null ^ this.getFullLoadStartTime() == null)
            return false;
        if (other.getFullLoadStartTime() != null
                && other.getFullLoadStartTime().equals(this.getFullLoadStartTime()) == false)
            return false;
        if (other.getFullLoadEndTime() == null ^ this.getFullLoadEndTime() == null)
            return false;
        if (other.getFullLoadEndTime() != null
                && other.getFullLoadEndTime().equals(this.getFullLoadEndTime()) == false)
            return false;
        if (other.getFullLoadReloaded() == null ^ this.getFullLoadReloaded() == null)
            return false;
        if (other.getFullLoadReloaded() != null
                && other.getFullLoadReloaded().equals(this.getFullLoadReloaded()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null
                && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getTableState() == null ^ this.getTableState() == null)
            return false;
        if (other.getTableState() != null
                && other.getTableState().equals(this.getTableState()) == false)
            return false;
        if (other.getValidationPendingRecords() == null
                ^ this.getValidationPendingRecords() == null)
            return false;
        if (other.getValidationPendingRecords() != null
                && other.getValidationPendingRecords().equals(this.getValidationPendingRecords()) == false)
            return false;
        if (other.getValidationFailedRecords() == null ^ this.getValidationFailedRecords() == null)
            return false;
        if (other.getValidationFailedRecords() != null
                && other.getValidationFailedRecords().equals(this.getValidationFailedRecords()) == false)
            return false;
        if (other.getValidationSuspendedRecords() == null
                ^ this.getValidationSuspendedRecords() == null)
            return false;
        if (other.getValidationSuspendedRecords() != null
                && other.getValidationSuspendedRecords().equals(
                        this.getValidationSuspendedRecords()) == false)
            return false;
        if (other.getValidationState() == null ^ this.getValidationState() == null)
            return false;
        if (other.getValidationState() != null
                && other.getValidationState().equals(this.getValidationState()) == false)
            return false;
        if (other.getValidationStateDetails() == null ^ this.getValidationStateDetails() == null)
            return false;
        if (other.getValidationStateDetails() != null
                && other.getValidationStateDetails().equals(this.getValidationStateDetails()) == false)
            return false;
        return true;
    }
}
