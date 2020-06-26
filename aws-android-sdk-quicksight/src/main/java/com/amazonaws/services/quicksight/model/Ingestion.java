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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the SPICE ingestion for a dataset.
 * </p>
 */
public class Ingestion implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * Ingestion ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String ingestionId;

    /**
     * <p>
     * Ingestion status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     */
    private String ingestionStatus;

    /**
     * <p>
     * Error information for this ingestion.
     * </p>
     */
    private ErrorInfo errorInfo;

    /**
     * <p>
     * Information about rows for a data set SPICE ingestion.
     * </p>
     */
    private RowInfo rowInfo;

    /**
     * <p>
     * Information about a queued dataset SPICE ingestion.
     * </p>
     */
    private QueueInfo queueInfo;

    /**
     * <p>
     * The time that this ingestion started.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The time that this ingestion took, measured in seconds.
     * </p>
     */
    private Long ingestionTimeInSeconds;

    /**
     * <p>
     * The size of the data ingested, in bytes.
     * </p>
     */
    private Long ingestionSizeInBytes;

    /**
     * <p>
     * Event source for this ingestion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANUAL, SCHEDULED
     */
    private String requestSource;

    /**
     * <p>
     * Type of this ingestion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIAL_INGESTION, EDIT, INCREMENTAL_REFRESH,
     * FULL_REFRESH
     */
    private String requestType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ingestion withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Ingestion ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Ingestion ID.
     *         </p>
     */
    public String getIngestionId() {
        return ingestionId;
    }

    /**
     * <p>
     * Ingestion ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param ingestionId <p>
     *            Ingestion ID.
     *            </p>
     */
    public void setIngestionId(String ingestionId) {
        this.ingestionId = ingestionId;
    }

    /**
     * <p>
     * Ingestion ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param ingestionId <p>
     *            Ingestion ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ingestion withIngestionId(String ingestionId) {
        this.ingestionId = ingestionId;
        return this;
    }

    /**
     * <p>
     * Ingestion status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     *
     * @return <p>
     *         Ingestion status.
     *         </p>
     * @see IngestionStatus
     */
    public String getIngestionStatus() {
        return ingestionStatus;
    }

    /**
     * <p>
     * Ingestion status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     *
     * @param ingestionStatus <p>
     *            Ingestion status.
     *            </p>
     * @see IngestionStatus
     */
    public void setIngestionStatus(String ingestionStatus) {
        this.ingestionStatus = ingestionStatus;
    }

    /**
     * <p>
     * Ingestion status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     *
     * @param ingestionStatus <p>
     *            Ingestion status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IngestionStatus
     */
    public Ingestion withIngestionStatus(String ingestionStatus) {
        this.ingestionStatus = ingestionStatus;
        return this;
    }

    /**
     * <p>
     * Ingestion status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     *
     * @param ingestionStatus <p>
     *            Ingestion status.
     *            </p>
     * @see IngestionStatus
     */
    public void setIngestionStatus(IngestionStatus ingestionStatus) {
        this.ingestionStatus = ingestionStatus.toString();
    }

    /**
     * <p>
     * Ingestion status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED,
     * CANCELLED
     *
     * @param ingestionStatus <p>
     *            Ingestion status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IngestionStatus
     */
    public Ingestion withIngestionStatus(IngestionStatus ingestionStatus) {
        this.ingestionStatus = ingestionStatus.toString();
        return this;
    }

    /**
     * <p>
     * Error information for this ingestion.
     * </p>
     *
     * @return <p>
     *         Error information for this ingestion.
     *         </p>
     */
    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    /**
     * <p>
     * Error information for this ingestion.
     * </p>
     *
     * @param errorInfo <p>
     *            Error information for this ingestion.
     *            </p>
     */
    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Error information for this ingestion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorInfo <p>
     *            Error information for this ingestion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ingestion withErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    /**
     * <p>
     * Information about rows for a data set SPICE ingestion.
     * </p>
     *
     * @return <p>
     *         Information about rows for a data set SPICE ingestion.
     *         </p>
     */
    public RowInfo getRowInfo() {
        return rowInfo;
    }

    /**
     * <p>
     * Information about rows for a data set SPICE ingestion.
     * </p>
     *
     * @param rowInfo <p>
     *            Information about rows for a data set SPICE ingestion.
     *            </p>
     */
    public void setRowInfo(RowInfo rowInfo) {
        this.rowInfo = rowInfo;
    }

    /**
     * <p>
     * Information about rows for a data set SPICE ingestion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rowInfo <p>
     *            Information about rows for a data set SPICE ingestion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ingestion withRowInfo(RowInfo rowInfo) {
        this.rowInfo = rowInfo;
        return this;
    }

    /**
     * <p>
     * Information about a queued dataset SPICE ingestion.
     * </p>
     *
     * @return <p>
     *         Information about a queued dataset SPICE ingestion.
     *         </p>
     */
    public QueueInfo getQueueInfo() {
        return queueInfo;
    }

    /**
     * <p>
     * Information about a queued dataset SPICE ingestion.
     * </p>
     *
     * @param queueInfo <p>
     *            Information about a queued dataset SPICE ingestion.
     *            </p>
     */
    public void setQueueInfo(QueueInfo queueInfo) {
        this.queueInfo = queueInfo;
    }

    /**
     * <p>
     * Information about a queued dataset SPICE ingestion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueInfo <p>
     *            Information about a queued dataset SPICE ingestion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ingestion withQueueInfo(QueueInfo queueInfo) {
        this.queueInfo = queueInfo;
        return this;
    }

    /**
     * <p>
     * The time that this ingestion started.
     * </p>
     *
     * @return <p>
     *         The time that this ingestion started.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The time that this ingestion started.
     * </p>
     *
     * @param createdTime <p>
     *            The time that this ingestion started.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this ingestion started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The time that this ingestion started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ingestion withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The time that this ingestion took, measured in seconds.
     * </p>
     *
     * @return <p>
     *         The time that this ingestion took, measured in seconds.
     *         </p>
     */
    public Long getIngestionTimeInSeconds() {
        return ingestionTimeInSeconds;
    }

    /**
     * <p>
     * The time that this ingestion took, measured in seconds.
     * </p>
     *
     * @param ingestionTimeInSeconds <p>
     *            The time that this ingestion took, measured in seconds.
     *            </p>
     */
    public void setIngestionTimeInSeconds(Long ingestionTimeInSeconds) {
        this.ingestionTimeInSeconds = ingestionTimeInSeconds;
    }

    /**
     * <p>
     * The time that this ingestion took, measured in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ingestionTimeInSeconds <p>
     *            The time that this ingestion took, measured in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ingestion withIngestionTimeInSeconds(Long ingestionTimeInSeconds) {
        this.ingestionTimeInSeconds = ingestionTimeInSeconds;
        return this;
    }

    /**
     * <p>
     * The size of the data ingested, in bytes.
     * </p>
     *
     * @return <p>
     *         The size of the data ingested, in bytes.
     *         </p>
     */
    public Long getIngestionSizeInBytes() {
        return ingestionSizeInBytes;
    }

    /**
     * <p>
     * The size of the data ingested, in bytes.
     * </p>
     *
     * @param ingestionSizeInBytes <p>
     *            The size of the data ingested, in bytes.
     *            </p>
     */
    public void setIngestionSizeInBytes(Long ingestionSizeInBytes) {
        this.ingestionSizeInBytes = ingestionSizeInBytes;
    }

    /**
     * <p>
     * The size of the data ingested, in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ingestionSizeInBytes <p>
     *            The size of the data ingested, in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ingestion withIngestionSizeInBytes(Long ingestionSizeInBytes) {
        this.ingestionSizeInBytes = ingestionSizeInBytes;
        return this;
    }

    /**
     * <p>
     * Event source for this ingestion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANUAL, SCHEDULED
     *
     * @return <p>
     *         Event source for this ingestion.
     *         </p>
     * @see IngestionRequestSource
     */
    public String getRequestSource() {
        return requestSource;
    }

    /**
     * <p>
     * Event source for this ingestion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANUAL, SCHEDULED
     *
     * @param requestSource <p>
     *            Event source for this ingestion.
     *            </p>
     * @see IngestionRequestSource
     */
    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    /**
     * <p>
     * Event source for this ingestion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANUAL, SCHEDULED
     *
     * @param requestSource <p>
     *            Event source for this ingestion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IngestionRequestSource
     */
    public Ingestion withRequestSource(String requestSource) {
        this.requestSource = requestSource;
        return this;
    }

    /**
     * <p>
     * Event source for this ingestion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANUAL, SCHEDULED
     *
     * @param requestSource <p>
     *            Event source for this ingestion.
     *            </p>
     * @see IngestionRequestSource
     */
    public void setRequestSource(IngestionRequestSource requestSource) {
        this.requestSource = requestSource.toString();
    }

    /**
     * <p>
     * Event source for this ingestion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANUAL, SCHEDULED
     *
     * @param requestSource <p>
     *            Event source for this ingestion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IngestionRequestSource
     */
    public Ingestion withRequestSource(IngestionRequestSource requestSource) {
        this.requestSource = requestSource.toString();
        return this;
    }

    /**
     * <p>
     * Type of this ingestion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIAL_INGESTION, EDIT, INCREMENTAL_REFRESH,
     * FULL_REFRESH
     *
     * @return <p>
     *         Type of this ingestion.
     *         </p>
     * @see IngestionRequestType
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * <p>
     * Type of this ingestion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIAL_INGESTION, EDIT, INCREMENTAL_REFRESH,
     * FULL_REFRESH
     *
     * @param requestType <p>
     *            Type of this ingestion.
     *            </p>
     * @see IngestionRequestType
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /**
     * <p>
     * Type of this ingestion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIAL_INGESTION, EDIT, INCREMENTAL_REFRESH,
     * FULL_REFRESH
     *
     * @param requestType <p>
     *            Type of this ingestion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IngestionRequestType
     */
    public Ingestion withRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }

    /**
     * <p>
     * Type of this ingestion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIAL_INGESTION, EDIT, INCREMENTAL_REFRESH,
     * FULL_REFRESH
     *
     * @param requestType <p>
     *            Type of this ingestion.
     *            </p>
     * @see IngestionRequestType
     */
    public void setRequestType(IngestionRequestType requestType) {
        this.requestType = requestType.toString();
    }

    /**
     * <p>
     * Type of this ingestion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIAL_INGESTION, EDIT, INCREMENTAL_REFRESH,
     * FULL_REFRESH
     *
     * @param requestType <p>
     *            Type of this ingestion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IngestionRequestType
     */
    public Ingestion withRequestType(IngestionRequestType requestType) {
        this.requestType = requestType.toString();
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getIngestionId() != null)
            sb.append("IngestionId: " + getIngestionId() + ",");
        if (getIngestionStatus() != null)
            sb.append("IngestionStatus: " + getIngestionStatus() + ",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: " + getErrorInfo() + ",");
        if (getRowInfo() != null)
            sb.append("RowInfo: " + getRowInfo() + ",");
        if (getQueueInfo() != null)
            sb.append("QueueInfo: " + getQueueInfo() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getIngestionTimeInSeconds() != null)
            sb.append("IngestionTimeInSeconds: " + getIngestionTimeInSeconds() + ",");
        if (getIngestionSizeInBytes() != null)
            sb.append("IngestionSizeInBytes: " + getIngestionSizeInBytes() + ",");
        if (getRequestSource() != null)
            sb.append("RequestSource: " + getRequestSource() + ",");
        if (getRequestType() != null)
            sb.append("RequestType: " + getRequestType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getIngestionId() == null) ? 0 : getIngestionId().hashCode());
        hashCode = prime * hashCode
                + ((getIngestionStatus() == null) ? 0 : getIngestionStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode + ((getRowInfo() == null) ? 0 : getRowInfo().hashCode());
        hashCode = prime * hashCode + ((getQueueInfo() == null) ? 0 : getQueueInfo().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getIngestionTimeInSeconds() == null) ? 0 : getIngestionTimeInSeconds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIngestionSizeInBytes() == null) ? 0 : getIngestionSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getRequestSource() == null) ? 0 : getRequestSource().hashCode());
        hashCode = prime * hashCode
                + ((getRequestType() == null) ? 0 : getRequestType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ingestion == false)
            return false;
        Ingestion other = (Ingestion) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getIngestionId() == null ^ this.getIngestionId() == null)
            return false;
        if (other.getIngestionId() != null
                && other.getIngestionId().equals(this.getIngestionId()) == false)
            return false;
        if (other.getIngestionStatus() == null ^ this.getIngestionStatus() == null)
            return false;
        if (other.getIngestionStatus() != null
                && other.getIngestionStatus().equals(this.getIngestionStatus()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null
                && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        if (other.getRowInfo() == null ^ this.getRowInfo() == null)
            return false;
        if (other.getRowInfo() != null && other.getRowInfo().equals(this.getRowInfo()) == false)
            return false;
        if (other.getQueueInfo() == null ^ this.getQueueInfo() == null)
            return false;
        if (other.getQueueInfo() != null
                && other.getQueueInfo().equals(this.getQueueInfo()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getIngestionTimeInSeconds() == null ^ this.getIngestionTimeInSeconds() == null)
            return false;
        if (other.getIngestionTimeInSeconds() != null
                && other.getIngestionTimeInSeconds().equals(this.getIngestionTimeInSeconds()) == false)
            return false;
        if (other.getIngestionSizeInBytes() == null ^ this.getIngestionSizeInBytes() == null)
            return false;
        if (other.getIngestionSizeInBytes() != null
                && other.getIngestionSizeInBytes().equals(this.getIngestionSizeInBytes()) == false)
            return false;
        if (other.getRequestSource() == null ^ this.getRequestSource() == null)
            return false;
        if (other.getRequestSource() != null
                && other.getRequestSource().equals(this.getRequestSource()) == false)
            return false;
        if (other.getRequestType() == null ^ this.getRequestType() == null)
            return false;
        if (other.getRequestType() != null
                && other.getRequestType().equals(this.getRequestType()) == false)
            return false;
        return true;
    }
}
