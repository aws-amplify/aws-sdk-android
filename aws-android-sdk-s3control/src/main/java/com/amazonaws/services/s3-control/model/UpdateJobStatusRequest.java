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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel an existing job. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in the Amazon Simple Storage Service Developer Guide.</p> <p/> <p>Related actions include:</p> <ul> <li> <p> <a>CreateJob</a> </p> </li> <li> <p> <a>ListJobs</a> </p> </li> <li> <p> <a>DescribeJob</a> </p> </li> <li> <p> <a>UpdateJobStatus</a> </p> </li> </ul>
 */
public class UpdateJobStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String accountId;

    /**
     * <p>The ID of the job whose status you want to update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     */
    private String jobId;

    /**
     * <p>The status that you want to move the specified job to.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cancelled, Ready
     */
    private String requestedJobStatus;

    /**
     * <p>A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String statusUpdateReason;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p/>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p/>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateJobStatusRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>The ID of the job whose status you want to update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @return <p>The ID of the job whose status you want to update.</p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>The ID of the job whose status you want to update.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @param jobId <p>The ID of the job whose status you want to update.</p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>The ID of the job whose status you want to update.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @param jobId <p>The ID of the job whose status you want to update.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateJobStatusRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>The status that you want to move the specified job to.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cancelled, Ready
     *
     * @return <p>The status that you want to move the specified job to.</p>
     *
     * @see RequestedJobStatus
     */
    public String getRequestedJobStatus() {
        return requestedJobStatus;
    }

    /**
     * <p>The status that you want to move the specified job to.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cancelled, Ready
     *
     * @param requestedJobStatus <p>The status that you want to move the specified job to.</p>
     *
     * @see RequestedJobStatus
     */
    public void setRequestedJobStatus(String requestedJobStatus) {
        this.requestedJobStatus = requestedJobStatus;
    }

    /**
     * <p>The status that you want to move the specified job to.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cancelled, Ready
     *
     * @param requestedJobStatus <p>The status that you want to move the specified job to.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see RequestedJobStatus
     */
    public UpdateJobStatusRequest withRequestedJobStatus(String requestedJobStatus) {
        this.requestedJobStatus = requestedJobStatus;
        return this;
    }

    /**
     * <p>The status that you want to move the specified job to.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cancelled, Ready
     *
     * @param requestedJobStatus <p>The status that you want to move the specified job to.</p>
     *
     * @see RequestedJobStatus
     */
    public void setRequestedJobStatus(RequestedJobStatus requestedJobStatus) {
        this.requestedJobStatus = requestedJobStatus.toString();
    }

    /**
     * <p>The status that you want to move the specified job to.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Cancelled, Ready
     *
     * @param requestedJobStatus <p>The status that you want to move the specified job to.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see RequestedJobStatus
     */
    public UpdateJobStatusRequest withRequestedJobStatus(RequestedJobStatus requestedJobStatus) {
        this.requestedJobStatus = requestedJobStatus.toString();
        return this;
    }

    /**
     * <p>A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.</p>
     */
    public String getStatusUpdateReason() {
        return statusUpdateReason;
    }

    /**
     * <p>A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param statusUpdateReason <p>A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.</p>
     */
    public void setStatusUpdateReason(String statusUpdateReason) {
        this.statusUpdateReason = statusUpdateReason;
    }

    /**
     * <p>A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param statusUpdateReason <p>A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateJobStatusRequest withStatusUpdateReason(String statusUpdateReason) {
        this.statusUpdateReason = statusUpdateReason;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getJobId() != null) sb.append("JobId: " + getJobId() + ",");
        if (getRequestedJobStatus() != null) sb.append("RequestedJobStatus: " + getRequestedJobStatus() + ",");
        if (getStatusUpdateReason() != null) sb.append("StatusUpdateReason: " + getStatusUpdateReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getRequestedJobStatus() == null) ? 0 : getRequestedJobStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateReason() == null) ? 0 : getStatusUpdateReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateJobStatusRequest == false) return false;
        UpdateJobStatusRequest other = (UpdateJobStatusRequest)obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false;
        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false;
        if (other.getRequestedJobStatus() == null ^ this.getRequestedJobStatus() == null) return false;
        if (other.getRequestedJobStatus() != null && other.getRequestedJobStatus().equals(this.getRequestedJobStatus()) == false) return false;
        if (other.getStatusUpdateReason() == null ^ this.getStatusUpdateReason() == null) return false;
        if (other.getStatusUpdateReason() != null && other.getStatusUpdateReason().equals(this.getStatusUpdateReason()) == false) return false;
        return true;
    }
}
