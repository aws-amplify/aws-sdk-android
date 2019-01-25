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
 * The job execution object represents the execution of a job on a particular
 * device.
 * </p>
 */
public class JobExecution implements Serializable {
    /**
     * <p>
     * The unique identifier you assigned to the job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobId;

    /**
     * <p>
     * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCEEDED,
     * TIMED_OUT, CANCELED, or REJECTED).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT,
     * REJECTED, REMOVED, CANCELED
     */
    private String status;

    /**
     * <p>
     * Will be <code>true</code> if the job execution was canceled with the
     * optional <code>force</code> parameter set to <code>true</code>.
     * </p>
     */
    private Boolean forceCanceled;

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job
     * execution.
     * </p>
     */
    private JobExecutionStatusDetails statusDetails;

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     */
    private String thingArn;

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
     * particular job execution on this particular device. It can be used in
     * commands which return or update job execution information.
     * </p>
     */
    private Long executionNumber;

    /**
     * <p>
     * The version of the job execution. Job execution versions are incremented
     * each time they are updated by a device.
     * </p>
     */
    private Long versionNumber;

    /**
     * <p>
     * The estimated number of seconds that remain before the job execution
     * status will be changed to <code>TIMED_OUT</code>. The timeout interval
     * can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The
     * actual job execution timeout can occur up to 60 seconds later than the
     * estimated duration. This value will not be included if the job execution
     * has reached a terminal status.
     * </p>
     */
    private Long approximateSecondsBeforeTimedOut;

    /**
     * <p>
     * The unique identifier you assigned to the job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The unique identifier you assigned to the job when it was
     *         created.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to the job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            The unique identifier you assigned to the job when it was
     *            created.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to the job when it was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            The unique identifier you assigned to the job when it was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecution withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCEEDED,
     * TIMED_OUT, CANCELED, or REJECTED).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT,
     * REJECTED, REMOVED, CANCELED
     *
     * @return <p>
     *         The status of the job execution (IN_PROGRESS, QUEUED, FAILED,
     *         SUCCEEDED, TIMED_OUT, CANCELED, or REJECTED).
     *         </p>
     * @see JobExecutionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCEEDED,
     * TIMED_OUT, CANCELED, or REJECTED).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT,
     * REJECTED, REMOVED, CANCELED
     *
     * @param status <p>
     *            The status of the job execution (IN_PROGRESS, QUEUED, FAILED,
     *            SUCCEEDED, TIMED_OUT, CANCELED, or REJECTED).
     *            </p>
     * @see JobExecutionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCEEDED,
     * TIMED_OUT, CANCELED, or REJECTED).
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
     *            The status of the job execution (IN_PROGRESS, QUEUED, FAILED,
     *            SUCCEEDED, TIMED_OUT, CANCELED, or REJECTED).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobExecutionStatus
     */
    public JobExecution withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCEEDED,
     * TIMED_OUT, CANCELED, or REJECTED).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT,
     * REJECTED, REMOVED, CANCELED
     *
     * @param status <p>
     *            The status of the job execution (IN_PROGRESS, QUEUED, FAILED,
     *            SUCCEEDED, TIMED_OUT, CANCELED, or REJECTED).
     *            </p>
     * @see JobExecutionStatus
     */
    public void setStatus(JobExecutionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCEEDED,
     * TIMED_OUT, CANCELED, or REJECTED).
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
     *            The status of the job execution (IN_PROGRESS, QUEUED, FAILED,
     *            SUCCEEDED, TIMED_OUT, CANCELED, or REJECTED).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobExecutionStatus
     */
    public JobExecution withStatus(JobExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job execution was canceled with the
     * optional <code>force</code> parameter set to <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Will be <code>true</code> if the job execution was canceled with
     *         the optional <code>force</code> parameter set to
     *         <code>true</code>.
     *         </p>
     */
    public Boolean isForceCanceled() {
        return forceCanceled;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job execution was canceled with the
     * optional <code>force</code> parameter set to <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Will be <code>true</code> if the job execution was canceled with
     *         the optional <code>force</code> parameter set to
     *         <code>true</code>.
     *         </p>
     */
    public Boolean getForceCanceled() {
        return forceCanceled;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job execution was canceled with the
     * optional <code>force</code> parameter set to <code>true</code>.
     * </p>
     *
     * @param forceCanceled <p>
     *            Will be <code>true</code> if the job execution was canceled
     *            with the optional <code>force</code> parameter set to
     *            <code>true</code>.
     *            </p>
     */
    public void setForceCanceled(Boolean forceCanceled) {
        this.forceCanceled = forceCanceled;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job execution was canceled with the
     * optional <code>force</code> parameter set to <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceCanceled <p>
     *            Will be <code>true</code> if the job execution was canceled
     *            with the optional <code>force</code> parameter set to
     *            <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecution withForceCanceled(Boolean forceCanceled) {
        this.forceCanceled = forceCanceled;
        return this;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job
     * execution.
     * </p>
     *
     * @return <p>
     *         A collection of name/value pairs that describe the status of the
     *         job execution.
     *         </p>
     */
    public JobExecutionStatusDetails getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job
     * execution.
     * </p>
     *
     * @param statusDetails <p>
     *            A collection of name/value pairs that describe the status of
     *            the job execution.
     *            </p>
     */
    public void setStatusDetails(JobExecutionStatusDetails statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job
     * execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusDetails <p>
     *            A collection of name/value pairs that describe the status of
     *            the job execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecution withStatusDetails(JobExecutionStatusDetails statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     *
     * @return <p>
     *         The ARN of the thing on which the job execution is running.
     *         </p>
     */
    public String getThingArn() {
        return thingArn;
    }

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     *
     * @param thingArn <p>
     *            The ARN of the thing on which the job execution is running.
     *            </p>
     */
    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingArn <p>
     *            The ARN of the thing on which the job execution is running.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecution withThingArn(String thingArn) {
        this.thingArn = thingArn;
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
    public JobExecution withQueuedAt(java.util.Date queuedAt) {
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
    public JobExecution withStartedAt(java.util.Date startedAt) {
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
    public JobExecution withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * A string (consisting of the digits "0" through "9") which identifies this
     * particular job execution on this particular device. It can be used in
     * commands which return or update job execution information.
     * </p>
     *
     * @return <p>
     *         A string (consisting of the digits "0" through "9") which
     *         identifies this particular job execution on this particular
     *         device. It can be used in commands which return or update job
     *         execution information.
     *         </p>
     */
    public Long getExecutionNumber() {
        return executionNumber;
    }

    /**
     * <p>
     * A string (consisting of the digits "0" through "9") which identifies this
     * particular job execution on this particular device. It can be used in
     * commands which return or update job execution information.
     * </p>
     *
     * @param executionNumber <p>
     *            A string (consisting of the digits "0" through "9") which
     *            identifies this particular job execution on this particular
     *            device. It can be used in commands which return or update job
     *            execution information.
     *            </p>
     */
    public void setExecutionNumber(Long executionNumber) {
        this.executionNumber = executionNumber;
    }

    /**
     * <p>
     * A string (consisting of the digits "0" through "9") which identifies this
     * particular job execution on this particular device. It can be used in
     * commands which return or update job execution information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionNumber <p>
     *            A string (consisting of the digits "0" through "9") which
     *            identifies this particular job execution on this particular
     *            device. It can be used in commands which return or update job
     *            execution information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecution withExecutionNumber(Long executionNumber) {
        this.executionNumber = executionNumber;
        return this;
    }

    /**
     * <p>
     * The version of the job execution. Job execution versions are incremented
     * each time they are updated by a device.
     * </p>
     *
     * @return <p>
     *         The version of the job execution. Job execution versions are
     *         incremented each time they are updated by a device.
     *         </p>
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * <p>
     * The version of the job execution. Job execution versions are incremented
     * each time they are updated by a device.
     * </p>
     *
     * @param versionNumber <p>
     *            The version of the job execution. Job execution versions are
     *            incremented each time they are updated by a device.
     *            </p>
     */
    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version of the job execution. Job execution versions are incremented
     * each time they are updated by a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionNumber <p>
     *            The version of the job execution. Job execution versions are
     *            incremented each time they are updated by a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecution withVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    /**
     * <p>
     * The estimated number of seconds that remain before the job execution
     * status will be changed to <code>TIMED_OUT</code>. The timeout interval
     * can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The
     * actual job execution timeout can occur up to 60 seconds later than the
     * estimated duration. This value will not be included if the job execution
     * has reached a terminal status.
     * </p>
     *
     * @return <p>
     *         The estimated number of seconds that remain before the job
     *         execution status will be changed to <code>TIMED_OUT</code>. The
     *         timeout interval can be anywhere between 1 minute and 7 days (1
     *         to 10080 minutes). The actual job execution timeout can occur up
     *         to 60 seconds later than the estimated duration. This value will
     *         not be included if the job execution has reached a terminal
     *         status.
     *         </p>
     */
    public Long getApproximateSecondsBeforeTimedOut() {
        return approximateSecondsBeforeTimedOut;
    }

    /**
     * <p>
     * The estimated number of seconds that remain before the job execution
     * status will be changed to <code>TIMED_OUT</code>. The timeout interval
     * can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The
     * actual job execution timeout can occur up to 60 seconds later than the
     * estimated duration. This value will not be included if the job execution
     * has reached a terminal status.
     * </p>
     *
     * @param approximateSecondsBeforeTimedOut <p>
     *            The estimated number of seconds that remain before the job
     *            execution status will be changed to <code>TIMED_OUT</code>.
     *            The timeout interval can be anywhere between 1 minute and 7
     *            days (1 to 10080 minutes). The actual job execution timeout
     *            can occur up to 60 seconds later than the estimated duration.
     *            This value will not be included if the job execution has
     *            reached a terminal status.
     *            </p>
     */
    public void setApproximateSecondsBeforeTimedOut(Long approximateSecondsBeforeTimedOut) {
        this.approximateSecondsBeforeTimedOut = approximateSecondsBeforeTimedOut;
    }

    /**
     * <p>
     * The estimated number of seconds that remain before the job execution
     * status will be changed to <code>TIMED_OUT</code>. The timeout interval
     * can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The
     * actual job execution timeout can occur up to 60 seconds later than the
     * estimated duration. This value will not be included if the job execution
     * has reached a terminal status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approximateSecondsBeforeTimedOut <p>
     *            The estimated number of seconds that remain before the job
     *            execution status will be changed to <code>TIMED_OUT</code>.
     *            The timeout interval can be anywhere between 1 minute and 7
     *            days (1 to 10080 minutes). The actual job execution timeout
     *            can occur up to 60 seconds later than the estimated duration.
     *            This value will not be included if the job execution has
     *            reached a terminal status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecution withApproximateSecondsBeforeTimedOut(Long approximateSecondsBeforeTimedOut) {
        this.approximateSecondsBeforeTimedOut = approximateSecondsBeforeTimedOut;
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
        if (getJobId() != null)
            sb.append("jobId: " + getJobId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getForceCanceled() != null)
            sb.append("forceCanceled: " + getForceCanceled() + ",");
        if (getStatusDetails() != null)
            sb.append("statusDetails: " + getStatusDetails() + ",");
        if (getThingArn() != null)
            sb.append("thingArn: " + getThingArn() + ",");
        if (getQueuedAt() != null)
            sb.append("queuedAt: " + getQueuedAt() + ",");
        if (getStartedAt() != null)
            sb.append("startedAt: " + getStartedAt() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("lastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getExecutionNumber() != null)
            sb.append("executionNumber: " + getExecutionNumber() + ",");
        if (getVersionNumber() != null)
            sb.append("versionNumber: " + getVersionNumber() + ",");
        if (getApproximateSecondsBeforeTimedOut() != null)
            sb.append("approximateSecondsBeforeTimedOut: " + getApproximateSecondsBeforeTimedOut());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getForceCanceled() == null) ? 0 : getForceCanceled().hashCode());
        hashCode = prime * hashCode
                + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        hashCode = prime * hashCode + ((getQueuedAt() == null) ? 0 : getQueuedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionNumber() == null) ? 0 : getExecutionNumber().hashCode());
        hashCode = prime * hashCode
                + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime
                * hashCode
                + ((getApproximateSecondsBeforeTimedOut() == null) ? 0
                        : getApproximateSecondsBeforeTimedOut().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobExecution == false)
            return false;
        JobExecution other = (JobExecution) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getForceCanceled() == null ^ this.getForceCanceled() == null)
            return false;
        if (other.getForceCanceled() != null
                && other.getForceCanceled().equals(this.getForceCanceled()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null
                && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
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
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null
                && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getApproximateSecondsBeforeTimedOut() == null
                ^ this.getApproximateSecondsBeforeTimedOut() == null)
            return false;
        if (other.getApproximateSecondsBeforeTimedOut() != null
                && other.getApproximateSecondsBeforeTimedOut().equals(
                        this.getApproximateSecondsBeforeTimedOut()) == false)
            return false;
        return true;
    }
}
