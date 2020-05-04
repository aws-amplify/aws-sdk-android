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


public class UpdateJobStatusResult implements Serializable {
    /**
     * <p>The ID for the job whose status was updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     */
    private String jobId;

    /**
     * <p>The current status for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     */
    private String status;

    /**
     * <p>The reason that the specified job's status was updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String statusUpdateReason;

    /**
     * <p>The ID for the job whose status was updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @return <p>The ID for the job whose status was updated.</p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>The ID for the job whose status was updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @param jobId <p>The ID for the job whose status was updated.</p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>The ID for the job whose status was updated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-\_]+<br/>
     *
     * @param jobId <p>The ID for the job whose status was updated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateJobStatusResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>The current status for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @return <p>The current status for the specified job.</p>
     *
     * @see JobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>The current status for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The current status for the specified job.</p>
     *
     * @see JobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>The current status for the specified job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The current status for the specified job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobStatus
     */
    public UpdateJobStatusResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>The current status for the specified job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The current status for the specified job.</p>
     *
     * @see JobStatus
     */
    public void setStatus(JobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>The current status for the specified job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Cancelled, Cancelling, Complete, Completing, Failed, Failing, New, Paused, Pausing, Preparing, Ready, Suspended
     *
     * @param status <p>The current status for the specified job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobStatus
     */
    public UpdateJobStatusResult withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>The reason that the specified job's status was updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The reason that the specified job's status was updated.</p>
     */
    public String getStatusUpdateReason() {
        return statusUpdateReason;
    }

    /**
     * <p>The reason that the specified job's status was updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param statusUpdateReason <p>The reason that the specified job's status was updated.</p>
     */
    public void setStatusUpdateReason(String statusUpdateReason) {
        this.statusUpdateReason = statusUpdateReason;
    }

    /**
     * <p>The reason that the specified job's status was updated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param statusUpdateReason <p>The reason that the specified job's status was updated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateJobStatusResult withStatusUpdateReason(String statusUpdateReason) {
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
        if (getJobId() != null) sb.append("JobId: " + getJobId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusUpdateReason() != null) sb.append("StatusUpdateReason: " + getStatusUpdateReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateReason() == null) ? 0 : getStatusUpdateReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateJobStatusResult == false) return false;
        UpdateJobStatusResult other = (UpdateJobStatusResult)obj;

        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false;
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false;
        if (other.getStatusUpdateReason() == null ^ this.getStatusUpdateReason() == null) return false;
        if (other.getStatusUpdateReason() != null && other.getStatusUpdateReason().equals(this.getStatusUpdateReason()) == false) return false;
        return true;
    }
}
