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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * A truncated version of the <a>BatchInferenceJob</a> datatype. The
 * <a>ListBatchInferenceJobs</a> operation returns a list of batch inference job
 * summaries.
 * </p>
 */
public class BatchInferenceJobSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String batchInferenceJobArn;

    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * The status of the batch inference job. The status is one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String status;

    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The ARN of the solution version used by the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String solutionVersionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the batch inference job.
     *         </p>
     */
    public String getBatchInferenceJobArn() {
        return batchInferenceJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param batchInferenceJobArn <p>
     *            The Amazon Resource Name (ARN) of the batch inference job.
     *            </p>
     */
    public void setBatchInferenceJobArn(String batchInferenceJobArn) {
        this.batchInferenceJobArn = batchInferenceJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the batch inference job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param batchInferenceJobArn <p>
     *            The Amazon Resource Name (ARN) of the batch inference job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchInferenceJobSummary withBatchInferenceJobArn(String batchInferenceJobArn) {
        this.batchInferenceJobArn = batchInferenceJobArn;
        return this;
    }

    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name of the batch inference job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param jobName <p>
     *            The name of the batch inference job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the batch inference job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param jobName <p>
     *            The name of the batch inference job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchInferenceJobSummary withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The status of the batch inference job. The status is one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The status of the batch inference job. The status is one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IN PROGRESS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE FAILED
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the batch inference job. The status is one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the batch inference job. The status is one of
     *            the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            PENDING
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IN PROGRESS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACTIVE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CREATE FAILED
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the batch inference job. The status is one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the batch inference job. The status is one of
     *            the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            PENDING
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IN PROGRESS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACTIVE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CREATE FAILED
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchInferenceJobSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     *
     * @return <p>
     *         The time at which the batch inference job was created.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     *
     * @param creationDateTime <p>
     *            The time at which the batch inference job was created.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The time at which the batch inference job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchInferenceJobSummary withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     *
     * @return <p>
     *         The time at which the batch inference job was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     *
     * @param lastUpdatedDateTime <p>
     *            The time at which the batch inference job was last updated.
     *            </p>
     */
    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The time at which the batch inference job was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDateTime <p>
     *            The time at which the batch inference job was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchInferenceJobSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }

    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     *
     * @return <p>
     *         If the batch inference job failed, the reason for the failure.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     *
     * @param failureReason <p>
     *            If the batch inference job failed, the reason for the failure.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the batch inference job failed, the reason for the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If the batch inference job failed, the reason for the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchInferenceJobSummary withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The ARN of the solution version used by the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the solution version used by the batch inference job.
     *         </p>
     */
    public String getSolutionVersionArn() {
        return solutionVersionArn;
    }

    /**
     * <p>
     * The ARN of the solution version used by the batch inference job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The ARN of the solution version used by the batch inference
     *            job.
     *            </p>
     */
    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The ARN of the solution version used by the batch inference job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The ARN of the solution version used by the batch inference
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchInferenceJobSummary withSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
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
        if (getBatchInferenceJobArn() != null)
            sb.append("batchInferenceJobArn: " + getBatchInferenceJobArn() + ",");
        if (getJobName() != null)
            sb.append("jobName: " + getJobName() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getCreationDateTime() != null)
            sb.append("creationDateTime: " + getCreationDateTime() + ",");
        if (getLastUpdatedDateTime() != null)
            sb.append("lastUpdatedDateTime: " + getLastUpdatedDateTime() + ",");
        if (getFailureReason() != null)
            sb.append("failureReason: " + getFailureReason() + ",");
        if (getSolutionVersionArn() != null)
            sb.append("solutionVersionArn: " + getSolutionVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBatchInferenceJobArn() == null) ? 0 : getBatchInferenceJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchInferenceJobSummary == false)
            return false;
        BatchInferenceJobSummary other = (BatchInferenceJobSummary) obj;

        if (other.getBatchInferenceJobArn() == null ^ this.getBatchInferenceJobArn() == null)
            return false;
        if (other.getBatchInferenceJobArn() != null
                && other.getBatchInferenceJobArn().equals(this.getBatchInferenceJobArn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null
                && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null
                && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        return true;
    }
}
