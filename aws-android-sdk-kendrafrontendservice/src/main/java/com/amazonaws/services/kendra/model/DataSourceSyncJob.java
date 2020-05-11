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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a synchronization job.
 * </p>
 */
public class DataSourceSyncJob implements Serializable {
    /**
     * <p>
     * A unique identifier for the synchronization job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String executionId;

    /**
     * <p>
     * The UNIX datetime that the synchronization job was started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The UNIX datetime that the synchronization job was completed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The execution status of the synchronization job. When the
     * <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     * synchronization job is done. If the status code is set to
     * <code>FAILED</code>, the <code>ErrorCode</code> and
     * <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     */
    private String status;

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the
     * <code>ErrorMessage</code> field contains a description of the error that
     * caused the synchronization to fail.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     */
    private String errorMessage;

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the
     * <code>ErrorCode</code> field contains a the reason that the
     * synchronization failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalError, InvalidRequest
     */
    private String errorCode;

    /**
     * <p>
     * If the reason that the synchronization failed is due to an error with the
     * underlying data source, this field contains a code that identifies the
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String dataSourceErrorCode;

    /**
     * <p>
     * Maps a batch delete document request to a specific data source sync job.
     * This is optional and should only be supplied when documents are deleted
     * by a connector.
     * </p>
     */
    private DataSourceSyncJobMetrics metrics;

    /**
     * <p>
     * A unique identifier for the synchronization job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         A unique identifier for the synchronization job.
     *         </p>
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * <p>
     * A unique identifier for the synchronization job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param executionId <p>
     *            A unique identifier for the synchronization job.
     *            </p>
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * A unique identifier for the synchronization job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param executionId <p>
     *            A unique identifier for the synchronization job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSyncJob withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was started.
     * </p>
     *
     * @return <p>
     *         The UNIX datetime that the synchronization job was started.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was started.
     * </p>
     *
     * @param startTime <p>
     *            The UNIX datetime that the synchronization job was started.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The UNIX datetime that the synchronization job was started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSyncJob withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was completed.
     * </p>
     *
     * @return <p>
     *         The UNIX datetime that the synchronization job was completed.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was completed.
     * </p>
     *
     * @param endTime <p>
     *            The UNIX datetime that the synchronization job was completed.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The UNIX datetime that the synchronization job was completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSyncJob withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The execution status of the synchronization job. When the
     * <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     * synchronization job is done. If the status code is set to
     * <code>FAILED</code>, the <code>ErrorCode</code> and
     * <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     *
     * @return <p>
     *         The execution status of the synchronization job. When the
     *         <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     *         synchronization job is done. If the status code is set to
     *         <code>FAILED</code>, the <code>ErrorCode</code> and
     *         <code>ErrorMessage</code> fields give you the reason for the
     *         failure.
     *         </p>
     * @see DataSourceSyncJobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The execution status of the synchronization job. When the
     * <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     * synchronization job is done. If the status code is set to
     * <code>FAILED</code>, the <code>ErrorCode</code> and
     * <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     *
     * @param status <p>
     *            The execution status of the synchronization job. When the
     *            <code>Status</code> field is set to <code>SUCCEEDED</code>,
     *            the synchronization job is done. If the status code is set to
     *            <code>FAILED</code>, the <code>ErrorCode</code> and
     *            <code>ErrorMessage</code> fields give you the reason for the
     *            failure.
     *            </p>
     * @see DataSourceSyncJobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The execution status of the synchronization job. When the
     * <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     * synchronization job is done. If the status code is set to
     * <code>FAILED</code>, the <code>ErrorCode</code> and
     * <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     *
     * @param status <p>
     *            The execution status of the synchronization job. When the
     *            <code>Status</code> field is set to <code>SUCCEEDED</code>,
     *            the synchronization job is done. If the status code is set to
     *            <code>FAILED</code>, the <code>ErrorCode</code> and
     *            <code>ErrorMessage</code> fields give you the reason for the
     *            failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceSyncJobStatus
     */
    public DataSourceSyncJob withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The execution status of the synchronization job. When the
     * <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     * synchronization job is done. If the status code is set to
     * <code>FAILED</code>, the <code>ErrorCode</code> and
     * <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     *
     * @param status <p>
     *            The execution status of the synchronization job. When the
     *            <code>Status</code> field is set to <code>SUCCEEDED</code>,
     *            the synchronization job is done. If the status code is set to
     *            <code>FAILED</code>, the <code>ErrorCode</code> and
     *            <code>ErrorMessage</code> fields give you the reason for the
     *            failure.
     *            </p>
     * @see DataSourceSyncJobStatus
     */
    public void setStatus(DataSourceSyncJobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The execution status of the synchronization job. When the
     * <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     * synchronization job is done. If the status code is set to
     * <code>FAILED</code>, the <code>ErrorCode</code> and
     * <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING,
     * ABORTED, SYNCING_INDEXING
     *
     * @param status <p>
     *            The execution status of the synchronization job. When the
     *            <code>Status</code> field is set to <code>SUCCEEDED</code>,
     *            the synchronization job is done. If the status code is set to
     *            <code>FAILED</code>, the <code>ErrorCode</code> and
     *            <code>ErrorMessage</code> fields give you the reason for the
     *            failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceSyncJobStatus
     */
    public DataSourceSyncJob withStatus(DataSourceSyncJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the
     * <code>ErrorMessage</code> field contains a description of the error that
     * caused the synchronization to fail.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @return <p>
     *         If the <code>Status</code> field is set to <code>ERROR</code>,
     *         the <code>ErrorMessage</code> field contains a description of the
     *         error that caused the synchronization to fail.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the
     * <code>ErrorMessage</code> field contains a description of the error that
     * caused the synchronization to fail.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param errorMessage <p>
     *            If the <code>Status</code> field is set to <code>ERROR</code>,
     *            the <code>ErrorMessage</code> field contains a description of
     *            the error that caused the synchronization to fail.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the
     * <code>ErrorMessage</code> field contains a description of the error that
     * caused the synchronization to fail.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^\P{C}*$<br/>
     *
     * @param errorMessage <p>
     *            If the <code>Status</code> field is set to <code>ERROR</code>,
     *            the <code>ErrorMessage</code> field contains a description of
     *            the error that caused the synchronization to fail.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSyncJob withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the
     * <code>ErrorCode</code> field contains a the reason that the
     * synchronization failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalError, InvalidRequest
     *
     * @return <p>
     *         If the <code>Status</code> field is set to <code>FAILED</code>,
     *         the <code>ErrorCode</code> field contains a the reason that the
     *         synchronization failed.
     *         </p>
     * @see ErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the
     * <code>ErrorCode</code> field contains a the reason that the
     * synchronization failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalError, InvalidRequest
     *
     * @param errorCode <p>
     *            If the <code>Status</code> field is set to <code>FAILED</code>
     *            , the <code>ErrorCode</code> field contains a the reason that
     *            the synchronization failed.
     *            </p>
     * @see ErrorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the
     * <code>ErrorCode</code> field contains a the reason that the
     * synchronization failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalError, InvalidRequest
     *
     * @param errorCode <p>
     *            If the <code>Status</code> field is set to <code>FAILED</code>
     *            , the <code>ErrorCode</code> field contains a the reason that
     *            the synchronization failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ErrorCode
     */
    public DataSourceSyncJob withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the
     * <code>ErrorCode</code> field contains a the reason that the
     * synchronization failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalError, InvalidRequest
     *
     * @param errorCode <p>
     *            If the <code>Status</code> field is set to <code>FAILED</code>
     *            , the <code>ErrorCode</code> field contains a the reason that
     *            the synchronization failed.
     *            </p>
     * @see ErrorCode
     */
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the
     * <code>ErrorCode</code> field contains a the reason that the
     * synchronization failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InternalError, InvalidRequest
     *
     * @param errorCode <p>
     *            If the <code>Status</code> field is set to <code>FAILED</code>
     *            , the <code>ErrorCode</code> field contains a the reason that
     *            the synchronization failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ErrorCode
     */
    public DataSourceSyncJob withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * If the reason that the synchronization failed is due to an error with the
     * underlying data source, this field contains a code that identifies the
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         If the reason that the synchronization failed is due to an error
     *         with the underlying data source, this field contains a code that
     *         identifies the error.
     *         </p>
     */
    public String getDataSourceErrorCode() {
        return dataSourceErrorCode;
    }

    /**
     * <p>
     * If the reason that the synchronization failed is due to an error with the
     * underlying data source, this field contains a code that identifies the
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param dataSourceErrorCode <p>
     *            If the reason that the synchronization failed is due to an
     *            error with the underlying data source, this field contains a
     *            code that identifies the error.
     *            </p>
     */
    public void setDataSourceErrorCode(String dataSourceErrorCode) {
        this.dataSourceErrorCode = dataSourceErrorCode;
    }

    /**
     * <p>
     * If the reason that the synchronization failed is due to an error with the
     * underlying data source, this field contains a code that identifies the
     * error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param dataSourceErrorCode <p>
     *            If the reason that the synchronization failed is due to an
     *            error with the underlying data source, this field contains a
     *            code that identifies the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSyncJob withDataSourceErrorCode(String dataSourceErrorCode) {
        this.dataSourceErrorCode = dataSourceErrorCode;
        return this;
    }

    /**
     * <p>
     * Maps a batch delete document request to a specific data source sync job.
     * This is optional and should only be supplied when documents are deleted
     * by a connector.
     * </p>
     *
     * @return <p>
     *         Maps a batch delete document request to a specific data source
     *         sync job. This is optional and should only be supplied when
     *         documents are deleted by a connector.
     *         </p>
     */
    public DataSourceSyncJobMetrics getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * Maps a batch delete document request to a specific data source sync job.
     * This is optional and should only be supplied when documents are deleted
     * by a connector.
     * </p>
     *
     * @param metrics <p>
     *            Maps a batch delete document request to a specific data source
     *            sync job. This is optional and should only be supplied when
     *            documents are deleted by a connector.
     *            </p>
     */
    public void setMetrics(DataSourceSyncJobMetrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * Maps a batch delete document request to a specific data source sync job.
     * This is optional and should only be supplied when documents are deleted
     * by a connector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            Maps a batch delete document request to a specific data source
     *            sync job. This is optional and should only be supplied when
     *            documents are deleted by a connector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSyncJob withMetrics(DataSourceSyncJobMetrics metrics) {
        this.metrics = metrics;
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
        if (getExecutionId() != null)
            sb.append("ExecutionId: " + getExecutionId() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getDataSourceErrorCode() != null)
            sb.append("DataSourceErrorCode: " + getDataSourceErrorCode() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getDataSourceErrorCode() == null) ? 0 : getDataSourceErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceSyncJob == false)
            return false;
        DataSourceSyncJob other = (DataSourceSyncJob) obj;

        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null
                && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getDataSourceErrorCode() == null ^ this.getDataSourceErrorCode() == null)
            return false;
        if (other.getDataSourceErrorCode() != null
                && other.getDataSourceErrorCode().equals(this.getDataSourceErrorCode()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }
}
