/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class DescribeJobTemplateResult implements Serializable {
    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     */
    private String jobTemplateArn;

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobTemplateId;

    /**
     * <p>
     * A description of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     */
    private String documentSource;

    /**
     * <p>
     * The job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     */
    private String document;

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     */
    private PresignedUrlConfig presignedUrlConfig;

    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     */
    private JobExecutionsRolloutConfig jobExecutionsRolloutConfig;

    /**
     * <p>
     * The criteria that determine when and how a job abort takes place.
     * </p>
     */
    private AbortConfig abortConfig;

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     */
    private TimeoutConfig timeoutConfig;

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @return <p>
     *         The ARN of the job template.
     *         </p>
     */
    public String getJobTemplateArn() {
        return jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @param jobTemplateArn <p>
     *            The ARN of the job template.
     *            </p>
     */
    public void setJobTemplateArn(String jobTemplateArn) {
        this.jobTemplateArn = jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @param jobTemplateArn <p>
     *            The ARN of the job template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobTemplateResult withJobTemplateArn(String jobTemplateArn) {
        this.jobTemplateArn = jobTemplateArn;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The unique identifier of the job template.
     *         </p>
     */
    public String getJobTemplateId() {
        return jobTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobTemplateId <p>
     *            The unique identifier of the job template.
     *            </p>
     */
    public void setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobTemplateId <p>
     *            The unique identifier of the job template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobTemplateResult withJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
        return this;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         A description of the job template.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A description of the job template.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A description of the job template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobTemplateResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @return <p>
     *         An S3 link to the job document.
     *         </p>
     */
    public String getDocumentSource() {
        return documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param documentSource <p>
     *            An S3 link to the job document.
     *            </p>
     */
    public void setDocumentSource(String documentSource) {
        this.documentSource = documentSource;
    }

    /**
     * <p>
     * An S3 link to the job document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param documentSource <p>
     *            An S3 link to the job document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobTemplateResult withDocumentSource(String documentSource) {
        this.documentSource = documentSource;
        return this;
    }

    /**
     * <p>
     * The job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @return <p>
     *         The job document.
     *         </p>
     */
    public String getDocument() {
        return document;
    }

    /**
     * <p>
     * The job document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @param document <p>
     *            The job document.
     *            </p>
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The job document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @param document <p>
     *            The job document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobTemplateResult withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     *
     * @return <p>
     *         The time, in seconds since the epoch, when the job template was
     *         created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     *
     * @param createdAt <p>
     *            The time, in seconds since the epoch, when the job template
     *            was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time, in seconds since the epoch, when the job template
     *            was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobTemplateResult withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     *
     * @return <p>
     *         Configuration for pre-signed S3 URLs.
     *         </p>
     */
    public PresignedUrlConfig getPresignedUrlConfig() {
        return presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     *
     * @param presignedUrlConfig <p>
     *            Configuration for pre-signed S3 URLs.
     *            </p>
     */
    public void setPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param presignedUrlConfig <p>
     *            Configuration for pre-signed S3 URLs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobTemplateResult withPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
        return this;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     *
     * @return <p>
     *         Allows you to create a staged rollout of a job.
     *         </p>
     */
    public JobExecutionsRolloutConfig getJobExecutionsRolloutConfig() {
        return jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     *
     * @param jobExecutionsRolloutConfig <p>
     *            Allows you to create a staged rollout of a job.
     *            </p>
     */
    public void setJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobExecutionsRolloutConfig <p>
     *            Allows you to create a staged rollout of a job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobTemplateResult withJobExecutionsRolloutConfig(
            JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
        return this;
    }

    /**
     * <p>
     * The criteria that determine when and how a job abort takes place.
     * </p>
     *
     * @return <p>
     *         The criteria that determine when and how a job abort takes place.
     *         </p>
     */
    public AbortConfig getAbortConfig() {
        return abortConfig;
    }

    /**
     * <p>
     * The criteria that determine when and how a job abort takes place.
     * </p>
     *
     * @param abortConfig <p>
     *            The criteria that determine when and how a job abort takes
     *            place.
     *            </p>
     */
    public void setAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    /**
     * <p>
     * The criteria that determine when and how a job abort takes place.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortConfig <p>
     *            The criteria that determine when and how a job abort takes
     *            place.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobTemplateResult withAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
        return this;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the amount of time each device has to finish its
     *         execution of the job. A timer is started when the job execution
     *         status is set to <code>IN_PROGRESS</code>. If the job execution
     *         status is not set to another terminal state before the timer
     *         expires, it will be automatically set to <code>TIMED_OUT</code>.
     *         </p>
     */
    public TimeoutConfig getTimeoutConfig() {
        return timeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     *
     * @param timeoutConfig <p>
     *            Specifies the amount of time each device has to finish its
     *            execution of the job. A timer is started when the job
     *            execution status is set to <code>IN_PROGRESS</code>. If the
     *            job execution status is not set to another terminal state
     *            before the timer expires, it will be automatically set to
     *            <code>TIMED_OUT</code>.
     *            </p>
     */
    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeoutConfig <p>
     *            Specifies the amount of time each device has to finish its
     *            execution of the job. A timer is started when the job
     *            execution status is set to <code>IN_PROGRESS</code>. If the
     *            job execution status is not set to another terminal state
     *            before the timer expires, it will be automatically set to
     *            <code>TIMED_OUT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeJobTemplateResult withTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
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
        if (getJobTemplateArn() != null)
            sb.append("jobTemplateArn: " + getJobTemplateArn() + ",");
        if (getJobTemplateId() != null)
            sb.append("jobTemplateId: " + getJobTemplateId() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getDocumentSource() != null)
            sb.append("documentSource: " + getDocumentSource() + ",");
        if (getDocument() != null)
            sb.append("document: " + getDocument() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getPresignedUrlConfig() != null)
            sb.append("presignedUrlConfig: " + getPresignedUrlConfig() + ",");
        if (getJobExecutionsRolloutConfig() != null)
            sb.append("jobExecutionsRolloutConfig: " + getJobExecutionsRolloutConfig() + ",");
        if (getAbortConfig() != null)
            sb.append("abortConfig: " + getAbortConfig() + ",");
        if (getTimeoutConfig() != null)
            sb.append("timeoutConfig: " + getTimeoutConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobTemplateArn() == null) ? 0 : getJobTemplateArn().hashCode());
        hashCode = prime * hashCode
                + ((getJobTemplateId() == null) ? 0 : getJobTemplateId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentSource() == null) ? 0 : getDocumentSource().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getPresignedUrlConfig() == null) ? 0 : getPresignedUrlConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getJobExecutionsRolloutConfig() == null) ? 0 : getJobExecutionsRolloutConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAbortConfig() == null) ? 0 : getAbortConfig().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutConfig() == null) ? 0 : getTimeoutConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobTemplateResult == false)
            return false;
        DescribeJobTemplateResult other = (DescribeJobTemplateResult) obj;

        if (other.getJobTemplateArn() == null ^ this.getJobTemplateArn() == null)
            return false;
        if (other.getJobTemplateArn() != null
                && other.getJobTemplateArn().equals(this.getJobTemplateArn()) == false)
            return false;
        if (other.getJobTemplateId() == null ^ this.getJobTemplateId() == null)
            return false;
        if (other.getJobTemplateId() != null
                && other.getJobTemplateId().equals(this.getJobTemplateId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDocumentSource() == null ^ this.getDocumentSource() == null)
            return false;
        if (other.getDocumentSource() != null
                && other.getDocumentSource().equals(this.getDocumentSource()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getPresignedUrlConfig() == null ^ this.getPresignedUrlConfig() == null)
            return false;
        if (other.getPresignedUrlConfig() != null
                && other.getPresignedUrlConfig().equals(this.getPresignedUrlConfig()) == false)
            return false;
        if (other.getJobExecutionsRolloutConfig() == null
                ^ this.getJobExecutionsRolloutConfig() == null)
            return false;
        if (other.getJobExecutionsRolloutConfig() != null
                && other.getJobExecutionsRolloutConfig().equals(
                        this.getJobExecutionsRolloutConfig()) == false)
            return false;
        if (other.getAbortConfig() == null ^ this.getAbortConfig() == null)
            return false;
        if (other.getAbortConfig() != null
                && other.getAbortConfig().equals(this.getAbortConfig()) == false)
            return false;
        if (other.getTimeoutConfig() == null ^ this.getTimeoutConfig() == null)
            return false;
        if (other.getTimeoutConfig() != null
                && other.getTimeoutConfig().equals(this.getTimeoutConfig()) == false)
            return false;
        return true;
    }
}
