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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the summary for an execution job for an Amplify app.
 * </p>
 */
public class JobSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String jobArn;

    /**
     * <p>
     * The unique ID for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String jobId;

    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String commitId;

    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     */
    private String commitMessage;

    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     */
    private java.util.Date commitTime;

    /**
     * <p>
     * The start date and time for the job.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The current status for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     */
    private String status;

    /**
     * <p>
     * The end date and time for the job.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The type for the job. If the value is <code>RELEASE</code>, the job was
     * manually released from its source by using the <code>StartJob</code> API.
     * If the value is <code>RETRY</code>, the job was manually retried using
     * the <code>StartJob</code> API. If the value is <code>WEB_HOOK</code>, the
     * job was automatically triggered by webhooks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     */
    private String jobType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the job.
     *         </p>
     */
    public String getJobArn() {
        return jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param jobArn <p>
     *            The Amazon Resource Name (ARN) for the job.
     *            </p>
     */
    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param jobArn <p>
     *            The Amazon Resource Name (ARN) for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withJobArn(String jobArn) {
        this.jobArn = jobArn;
        return this;
    }

    /**
     * <p>
     * The unique ID for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The unique ID for the job.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The unique ID for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param jobId <p>
     *            The unique ID for the job.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique ID for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param jobId <p>
     *            The unique ID for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The commit ID from a third-party repository provider for the job.
     *         </p>
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param commitId <p>
     *            The commit ID from a third-party repository provider for the
     *            job.
     *            </p>
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param commitId <p>
     *            The commit ID from a third-party repository provider for the
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @return <p>
     *         The commit message from a third-party repository provider for the
     *         job.
     *         </p>
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @param commitMessage <p>
     *            The commit message from a third-party repository provider for
     *            the job.
     *            </p>
     */
    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @param commitMessage <p>
     *            The commit message from a third-party repository provider for
     *            the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     *
     * @return <p>
     *         The commit date and time for the job.
     *         </p>
     */
    public java.util.Date getCommitTime() {
        return commitTime;
    }

    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     *
     * @param commitTime <p>
     *            The commit date and time for the job.
     *            </p>
     */
    public void setCommitTime(java.util.Date commitTime) {
        this.commitTime = commitTime;
    }

    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitTime <p>
     *            The commit date and time for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withCommitTime(java.util.Date commitTime) {
        this.commitTime = commitTime;
        return this;
    }

    /**
     * <p>
     * The start date and time for the job.
     * </p>
     *
     * @return <p>
     *         The start date and time for the job.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start date and time for the job.
     * </p>
     *
     * @param startTime <p>
     *            The start date and time for the job.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start date and time for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start date and time for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     *
     * @return <p>
     *         The current status for the job.
     *         </p>
     * @see JobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     *
     * @param status <p>
     *            The current status for the job.
     *            </p>
     * @see JobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     *
     * @param status <p>
     *            The current status for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public JobSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     *
     * @param status <p>
     *            The current status for the job.
     *            </p>
     * @see JobStatus
     */
    public void setStatus(JobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED,
     * CANCELLING, CANCELLED
     *
     * @param status <p>
     *            The current status for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public JobSummary withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The end date and time for the job.
     * </p>
     *
     * @return <p>
     *         The end date and time for the job.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end date and time for the job.
     * </p>
     *
     * @param endTime <p>
     *            The end date and time for the job.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end date and time for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end date and time for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobSummary withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The type for the job. If the value is <code>RELEASE</code>, the job was
     * manually released from its source by using the <code>StartJob</code> API.
     * If the value is <code>RETRY</code>, the job was manually retried using
     * the <code>StartJob</code> API. If the value is <code>WEB_HOOK</code>, the
     * job was automatically triggered by webhooks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     *
     * @return <p>
     *         The type for the job. If the value is <code>RELEASE</code>, the
     *         job was manually released from its source by using the
     *         <code>StartJob</code> API. If the value is <code>RETRY</code>,
     *         the job was manually retried using the <code>StartJob</code> API.
     *         If the value is <code>WEB_HOOK</code>, the job was automatically
     *         triggered by webhooks.
     *         </p>
     * @see JobType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * <p>
     * The type for the job. If the value is <code>RELEASE</code>, the job was
     * manually released from its source by using the <code>StartJob</code> API.
     * If the value is <code>RETRY</code>, the job was manually retried using
     * the <code>StartJob</code> API. If the value is <code>WEB_HOOK</code>, the
     * job was automatically triggered by webhooks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     *
     * @param jobType <p>
     *            The type for the job. If the value is <code>RELEASE</code>,
     *            the job was manually released from its source by using the
     *            <code>StartJob</code> API. If the value is <code>RETRY</code>,
     *            the job was manually retried using the <code>StartJob</code>
     *            API. If the value is <code>WEB_HOOK</code>, the job was
     *            automatically triggered by webhooks.
     *            </p>
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type for the job. If the value is <code>RELEASE</code>, the job was
     * manually released from its source by using the <code>StartJob</code> API.
     * If the value is <code>RETRY</code>, the job was manually retried using
     * the <code>StartJob</code> API. If the value is <code>WEB_HOOK</code>, the
     * job was automatically triggered by webhooks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     *
     * @param jobType <p>
     *            The type for the job. If the value is <code>RELEASE</code>,
     *            the job was manually released from its source by using the
     *            <code>StartJob</code> API. If the value is <code>RETRY</code>,
     *            the job was manually retried using the <code>StartJob</code>
     *            API. If the value is <code>WEB_HOOK</code>, the job was
     *            automatically triggered by webhooks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public JobSummary withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * <p>
     * The type for the job. If the value is <code>RELEASE</code>, the job was
     * manually released from its source by using the <code>StartJob</code> API.
     * If the value is <code>RETRY</code>, the job was manually retried using
     * the <code>StartJob</code> API. If the value is <code>WEB_HOOK</code>, the
     * job was automatically triggered by webhooks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     *
     * @param jobType <p>
     *            The type for the job. If the value is <code>RELEASE</code>,
     *            the job was manually released from its source by using the
     *            <code>StartJob</code> API. If the value is <code>RETRY</code>,
     *            the job was manually retried using the <code>StartJob</code>
     *            API. If the value is <code>WEB_HOOK</code>, the job was
     *            automatically triggered by webhooks.
     *            </p>
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * <p>
     * The type for the job. If the value is <code>RELEASE</code>, the job was
     * manually released from its source by using the <code>StartJob</code> API.
     * If the value is <code>RETRY</code>, the job was manually retried using
     * the <code>StartJob</code> API. If the value is <code>WEB_HOOK</code>, the
     * job was automatically triggered by webhooks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     *
     * @param jobType <p>
     *            The type for the job. If the value is <code>RELEASE</code>,
     *            the job was manually released from its source by using the
     *            <code>StartJob</code> API. If the value is <code>RETRY</code>,
     *            the job was manually retried using the <code>StartJob</code>
     *            API. If the value is <code>WEB_HOOK</code>, the job was
     *            automatically triggered by webhooks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public JobSummary withJobType(JobType jobType) {
        this.jobType = jobType.toString();
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
        if (getJobArn() != null)
            sb.append("jobArn: " + getJobArn() + ",");
        if (getJobId() != null)
            sb.append("jobId: " + getJobId() + ",");
        if (getCommitId() != null)
            sb.append("commitId: " + getCommitId() + ",");
        if (getCommitMessage() != null)
            sb.append("commitMessage: " + getCommitMessage() + ",");
        if (getCommitTime() != null)
            sb.append("commitTime: " + getCommitTime() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getJobType() != null)
            sb.append("jobType: " + getJobType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode + ((getCommitTime() == null) ? 0 : getCommitTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobSummary == false)
            return false;
        JobSummary other = (JobSummary) obj;

        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null
                && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        if (other.getCommitTime() == null ^ this.getCommitTime() == null)
            return false;
        if (other.getCommitTime() != null
                && other.getCommitTime().equals(this.getCommitTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        return true;
    }
}
