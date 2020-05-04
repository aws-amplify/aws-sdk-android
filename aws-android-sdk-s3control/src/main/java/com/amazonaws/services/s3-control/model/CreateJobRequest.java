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
 * <p>You can use Amazon S3 Batch Operations to perform large-scale Batch Operations on Amazon S3 objects. Amazon S3 Batch Operations can execute a single operation or action on lists of Amazon S3 objects that you specify. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-basics.html">Amazon S3 Batch Operations</a> in the Amazon Simple Storage Service Developer Guide.</p> <p>Related actions include:</p> <ul> <li> <p> <a>DescribeJob</a> </p> </li> <li> <p> <a>ListJobs</a> </p> </li> <li> <p> <a>UpdateJobPriority</a> </p> </li> <li> <p> <a>UpdateJobStatus</a> </p> </li> </ul>
 */
public class CreateJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String accountId;

    /**
     * <p>Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.</p>
     */
    private Boolean confirmationRequired;

    /**
     * <p>The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     */
    private JobOperation operation;

    /**
     * <p>Configuration parameters for the optional job-completion report.</p>
     */
    private JobReport report;

    /**
     * <p>An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string up to the maximum length.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String clientRequestToken;

    /**
     * <p>Configuration parameters for the manifest.</p>
     */
    private JobManifest manifest;

    /**
     * <p>A description for this job. You can use any string within the permitted length. Descriptions don't need to be unique and can be used for multiple jobs.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String description;

    /**
     * <p>The numerical priority for this job. Higher numbers indicate higher priority.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer priority;

    /**
     * <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that Batch Operations will use to execute this job's operation on each object in the manifest.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>arn:[^:]+:iam::\d{12}:role/.*<br/>
     */
    private String roleArn;

    /**
     * <p>A set of tags to associate with the Amazon S3 Batch Operations job. This is an optional parameter. </p>
     */
    private java.util.List<S3Tag> tags;

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
    public CreateJobRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.</p>
     *
     * @return <p>Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.</p>
     */
    public Boolean isConfirmationRequired() {
        return confirmationRequired;
    }

    /**
     * <p>Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.</p>
     *
     * @return <p>Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.</p>
     */
    public Boolean getConfirmationRequired() {
        return confirmationRequired;
    }

    /**
     * <p>Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.</p>
     *
     * @param confirmationRequired <p>Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.</p>
     */
    public void setConfirmationRequired(Boolean confirmationRequired) {
        this.confirmationRequired = confirmationRequired;
    }

    /**
     * <p>Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param confirmationRequired <p>Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateJobRequest withConfirmationRequired(Boolean confirmationRequired) {
        this.confirmationRequired = confirmationRequired;
        return this;
    }

    /**
     * <p>The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     *
     * @return <p>The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     */
    public JobOperation getOperation() {
        return operation;
    }

    /**
     * <p>The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     *
     * @param operation <p>The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     */
    public void setOperation(JobOperation operation) {
        this.operation = operation;
    }

    /**
     * <p>The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operation <p>The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateJobRequest withOperation(JobOperation operation) {
        this.operation = operation;
        return this;
    }

    /**
     * <p>Configuration parameters for the optional job-completion report.</p>
     *
     * @return <p>Configuration parameters for the optional job-completion report.</p>
     */
    public JobReport getReport() {
        return report;
    }

    /**
     * <p>Configuration parameters for the optional job-completion report.</p>
     *
     * @param report <p>Configuration parameters for the optional job-completion report.</p>
     */
    public void setReport(JobReport report) {
        this.report = report;
    }

    /**
     * <p>Configuration parameters for the optional job-completion report.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param report <p>Configuration parameters for the optional job-completion report.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateJobRequest withReport(JobReport report) {
        this.report = report;
        return this;
    }

    /**
     * <p>An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string up to the maximum length.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string up to the maximum length.</p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string up to the maximum length.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientRequestToken <p>An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string up to the maximum length.</p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string up to the maximum length.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientRequestToken <p>An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string up to the maximum length.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateJobRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>Configuration parameters for the manifest.</p>
     *
     * @return <p>Configuration parameters for the manifest.</p>
     */
    public JobManifest getManifest() {
        return manifest;
    }

    /**
     * <p>Configuration parameters for the manifest.</p>
     *
     * @param manifest <p>Configuration parameters for the manifest.</p>
     */
    public void setManifest(JobManifest manifest) {
        this.manifest = manifest;
    }

    /**
     * <p>Configuration parameters for the manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param manifest <p>Configuration parameters for the manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateJobRequest withManifest(JobManifest manifest) {
        this.manifest = manifest;
        return this;
    }

    /**
     * <p>A description for this job. You can use any string within the permitted length. Descriptions don't need to be unique and can be used for multiple jobs.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>A description for this job. You can use any string within the permitted length. Descriptions don't need to be unique and can be used for multiple jobs.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>A description for this job. You can use any string within the permitted length. Descriptions don't need to be unique and can be used for multiple jobs.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param description <p>A description for this job. You can use any string within the permitted length. Descriptions don't need to be unique and can be used for multiple jobs.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>A description for this job. You can use any string within the permitted length. Descriptions don't need to be unique and can be used for multiple jobs.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param description <p>A description for this job. You can use any string within the permitted length. Descriptions don't need to be unique and can be used for multiple jobs.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateJobRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>The numerical priority for this job. Higher numbers indicate higher priority.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>The numerical priority for this job. Higher numbers indicate higher priority.</p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>The numerical priority for this job. Higher numbers indicate higher priority.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param priority <p>The numerical priority for this job. Higher numbers indicate higher priority.</p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>The numerical priority for this job. Higher numbers indicate higher priority.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param priority <p>The numerical priority for this job. Higher numbers indicate higher priority.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateJobRequest withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that Batch Operations will use to execute this job's operation on each object in the manifest.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>arn:[^:]+:iam::\d{12}:role/.*<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that Batch Operations will use to execute this job's operation on each object in the manifest.</p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that Batch Operations will use to execute this job's operation on each object in the manifest.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>arn:[^:]+:iam::\d{12}:role/.*<br/>
     *
     * @param roleArn <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that Batch Operations will use to execute this job's operation on each object in the manifest.</p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that Batch Operations will use to execute this job's operation on each object in the manifest.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>arn:[^:]+:iam::\d{12}:role/.*<br/>
     *
     * @param roleArn <p>The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that Batch Operations will use to execute this job's operation on each object in the manifest.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateJobRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>A set of tags to associate with the Amazon S3 Batch Operations job. This is an optional parameter. </p>
     *
     * @return <p>A set of tags to associate with the Amazon S3 Batch Operations job. This is an optional parameter. </p>
     */
    public java.util.List<S3Tag> getTags() {
        return tags;
    }

    /**
     * <p>A set of tags to associate with the Amazon S3 Batch Operations job. This is an optional parameter. </p>
     *
     * @param tags <p>A set of tags to associate with the Amazon S3 Batch Operations job. This is an optional parameter. </p>
     */
    public void setTags(java.util.Collection<S3Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<S3Tag>(tags);
    }

    /**
     * <p>A set of tags to associate with the Amazon S3 Batch Operations job. This is an optional parameter. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>A set of tags to associate with the Amazon S3 Batch Operations job. This is an optional parameter. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateJobRequest withTags(S3Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<S3Tag>(tags.length);
        }
        for (S3Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>A set of tags to associate with the Amazon S3 Batch Operations job. This is an optional parameter. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>A set of tags to associate with the Amazon S3 Batch Operations job. This is an optional parameter. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateJobRequest withTags(java.util.Collection<S3Tag> tags) {
        setTags(tags);
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
        if (getConfirmationRequired() != null) sb.append("ConfirmationRequired: " + getConfirmationRequired() + ",");
        if (getOperation() != null) sb.append("Operation: " + getOperation() + ",");
        if (getReport() != null) sb.append("Report: " + getReport() + ",");
        if (getClientRequestToken() != null) sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getManifest() != null) sb.append("Manifest: " + getManifest() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getPriority() != null) sb.append("Priority: " + getPriority() + ",");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getConfirmationRequired() == null) ? 0 : getConfirmationRequired().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getReport() == null) ? 0 : getReport().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getManifest() == null) ? 0 : getManifest().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateJobRequest == false) return false;
        CreateJobRequest other = (CreateJobRequest)obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false;
        if (other.getConfirmationRequired() == null ^ this.getConfirmationRequired() == null) return false;
        if (other.getConfirmationRequired() != null && other.getConfirmationRequired().equals(this.getConfirmationRequired()) == false) return false;
        if (other.getOperation() == null ^ this.getOperation() == null) return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false) return false;
        if (other.getReport() == null ^ this.getReport() == null) return false;
        if (other.getReport() != null && other.getReport().equals(this.getReport()) == false) return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null) return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false) return false;
        if (other.getManifest() == null ^ this.getManifest() == null) return false;
        if (other.getManifest() != null && other.getManifest().equals(this.getManifest()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getPriority() == null ^ this.getPriority() == null) return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false) return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false;
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false;
        return true;
    }
}
