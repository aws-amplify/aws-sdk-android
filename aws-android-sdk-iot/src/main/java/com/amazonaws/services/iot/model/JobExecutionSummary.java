/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The job execution summary.
 * </p>
 */
public class JobExecutionSummary implements Serializable {
    /**
     * <p>
     * The status of the job execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT,
     * REJECTED, REMOVED, CANCELED
     */
    private String status;

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was
     * queued.
     * </p>
     */
    private java.util.Date queuedAt;

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution
     * started.
     * </p>
     */
    private java.util.Date startedAt;

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was
     * last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * A string (consisting of the digits "0" through "9") which identifies this
     * particular job execution on this particular device. It can be used later
     * in commands which return or update job execution information.
     * </p>
     */
    private Long executionNumber;

    /**
     * <p>
     * The status of the job execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT,
     * REJECTED, REMOVED, CANCELED
     *
     * @return <p>
     *         The status of the job execution.
     *         </p>
     * @see JobExecutionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the job execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT,
     * REJECTED, REMOVED, CANCELED
     *
     * @param status <p>
     *            The status of the job execution.
     *            </p>
     * @see JobExecutionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT,
     * REJECTED, REMOVED, CANCELED
     *
     * @param status <p>
     *            The status of the job execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobExecutionStatus
     */
    public JobExecutionSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the job execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT,
     * REJECTED, REMOVED, CANCELED
     *
     * @param status <p>
     *            The status of the job execution.
     *            </p>
     * @see JobExecutionStatus
     */
    public void setStatus(JobExecutionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the job execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT,
     * REJECTED, REMOVED, CANCELED
     *
     * @param status <p>
     *            The status of the job execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobExecutionStatus
     */
    public JobExecutionSummary withStatus(JobExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was
     * queued.
     * </p>
     *
     * @return <p>
     *         The time, in milliseconds since the epoch, when the job execution
     *         was queued.
     *         </p>
     */
    public java.util.Date getQueuedAt() {
        return queuedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was
     * queued.
     * </p>
     *
     * @param queuedAt <p>
     *            The time, in milliseconds since the epoch, when the job
     *            execution was queued.
     *            </p>
     */
    public void setQueuedAt(java.util.Date queuedAt) {
        this.queuedAt = queuedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was
     * queued.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queuedAt <p>
     *            The time, in milliseconds since the epoch, when the job
     *            execution was queued.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionSummary withQueuedAt(java.util.Date queuedAt) {
        this.queuedAt = queuedAt;
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution
     * started.
     * </p>
     *
     * @return <p>
     *         The time, in milliseconds since the epoch, when the job execution
     *         started.
     *         </p>
     */
    public java.util.Date getStartedAt() {
        return startedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution
     * started.
     * </p>
     *
     * @param startedAt <p>
     *            The time, in milliseconds since the epoch, when the job
     *            execution started.
     *            </p>
     */
    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution
     * started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedAt <p>
     *            The time, in milliseconds since the epoch, when the job
     *            execution started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionSummary withStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was
     * last updated.
     * </p>
     *
     * @return <p>
     *         The time, in milliseconds since the epoch, when the job execution
     *         was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was
     * last updated.
     * </p>
     *
     * @param lastUpdatedAt <p>
     *            The time, in milliseconds since the epoch, when the job
     *            execution was last updated.
     *            </p>
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was
     * last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt <p>
     *            The time, in milliseconds since the epoch, when the job
     *            execution was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * A string (consisting of the digits "0" through "9") which identifies this
     * particular job execution on this particular device. It can be used later
     * in commands which return or update job execution information.
     * </p>
     *
     * @return <p>
     *         A string (consisting of the digits "0" through "9") which
     *         identifies this particular job execution on this particular
     *         device. It can be used later in commands which return or update
     *         job execution information.
     *         </p>
     */
    public Long getExecutionNumber() {
        return executionNumber;
    }

    /**
     * <p>
     * A string (consisting of the digits "0" through "9") which identifies this
     * particular job execution on this particular device. It can be used later
     * in commands which return or update job execution information.
     * </p>
     *
     * @param executionNumber <p>
     *            A string (consisting of the digits "0" through "9") which
     *            identifies this particular job execution on this particular
     *            device. It can be used later in commands which return or
     *            update job execution information.
     *            </p>
     */
    public void setExecutionNumber(Long executionNumber) {
        this.executionNumber = executionNumber;
    }

    /**
     * <p>
     * A string (consisting of the digits "0" through "9") which identifies this
     * particular job execution on this particular device. It can be used later
     * in commands which return or update job execution information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionNumber <p>
     *            A string (consisting of the digits "0" through "9") which
     *            identifies this particular job execution on this particular
     *            device. It can be used later in commands which return or
     *            update job execution information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionSummary withExecutionNumber(Long executionNumber) {
        this.executionNumber = executionNumber;
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
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getQueuedAt() != null)
            sb.append("queuedAt: " + getQueuedAt() + ",");
        if (getStartedAt() != null)
            sb.append("startedAt: " + getStartedAt() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getExecutionNumber() != null)
            sb.append("executionNumber: " + getExecutionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getQueuedAt() == null) ? 0 : getQueuedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionNumber() == null) ? 0 : getExecutionNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobExecutionSummary == false)
            return false;
        JobExecutionSummary other = (JobExecutionSummary) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getQueuedAt() == null ^ this.getQueuedAt() == null)
            return false;
        if (other.getQueuedAt() != null && other.getQueuedAt().equals(this.getQueuedAt()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null
                && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null
                && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getExecutionNumber() == null ^ this.getExecutionNumber() == null)
            return false;
        if (other.getExecutionNumber() != null
                && other.getExecutionNumber().equals(this.getExecutionNumber()) == false)
            return false;
        return true;
    }
}
