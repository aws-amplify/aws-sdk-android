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

public class DescribeThingRegistrationTaskResult implements Serializable {
    /**
     * <p>
     * The task ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     */
    private String taskId;

    /**
     * <p>
     * The task creation date.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date when the task was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The task's template.
     * </p>
     */
    private String templateBody;

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     */
    private String inputFileBucket;

    /**
     * <p>
     * The input file key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9!_.*'()-\/]+<br/>
     */
    private String inputFileKey;

    /**
     * <p>
     * The role ARN that grants access to the input file bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     */
    private String status;

    /**
     * <p>
     * The message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String message;

    /**
     * <p>
     * The number of things successfully provisioned.
     * </p>
     */
    private Integer successCount;

    /**
     * <p>
     * The number of things that failed to be provisioned.
     * </p>
     */
    private Integer failureCount;

    /**
     * <p>
     * The progress of the bulk provisioning task expressed as a percentage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer percentageProgress;

    /**
     * <p>
     * The task ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     *
     * @return <p>
     *         The task ID.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     *
     * @param taskId <p>
     *            The task ID.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     *
     * @param taskId <p>
     *            The task ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingRegistrationTaskResult withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * The task creation date.
     * </p>
     *
     * @return <p>
     *         The task creation date.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The task creation date.
     * </p>
     *
     * @param creationDate <p>
     *            The task creation date.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The task creation date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The task creation date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingRegistrationTaskResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date when the task was last modified.
     * </p>
     *
     * @return <p>
     *         The date when the task was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date when the task was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date when the task was last modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the task was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date when the task was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingRegistrationTaskResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The task's template.
     * </p>
     *
     * @return <p>
     *         The task's template.
     *         </p>
     */
    public String getTemplateBody() {
        return templateBody;
    }

    /**
     * <p>
     * The task's template.
     * </p>
     *
     * @param templateBody <p>
     *            The task's template.
     *            </p>
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The task's template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateBody <p>
     *            The task's template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingRegistrationTaskResult withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @return <p>
     *         The S3 bucket that contains the input file.
     *         </p>
     */
    public String getInputFileBucket() {
        return inputFileBucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @param inputFileBucket <p>
     *            The S3 bucket that contains the input file.
     *            </p>
     */
    public void setInputFileBucket(String inputFileBucket) {
        this.inputFileBucket = inputFileBucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]+<br/>
     *
     * @param inputFileBucket <p>
     *            The S3 bucket that contains the input file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingRegistrationTaskResult withInputFileBucket(String inputFileBucket) {
        this.inputFileBucket = inputFileBucket;
        return this;
    }

    /**
     * <p>
     * The input file key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9!_.*'()-\/]+<br/>
     *
     * @return <p>
     *         The input file key.
     *         </p>
     */
    public String getInputFileKey() {
        return inputFileKey;
    }

    /**
     * <p>
     * The input file key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9!_.*'()-\/]+<br/>
     *
     * @param inputFileKey <p>
     *            The input file key.
     *            </p>
     */
    public void setInputFileKey(String inputFileKey) {
        this.inputFileKey = inputFileKey;
    }

    /**
     * <p>
     * The input file key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9!_.*'()-\/]+<br/>
     *
     * @param inputFileKey <p>
     *            The input file key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingRegistrationTaskResult withInputFileKey(String inputFileKey) {
        this.inputFileKey = inputFileKey;
        return this;
    }

    /**
     * <p>
     * The role ARN that grants access to the input file bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The role ARN that grants access to the input file bucket.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The role ARN that grants access to the input file bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The role ARN that grants access to the input file bucket.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The role ARN that grants access to the input file bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The role ARN that grants access to the input file bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingRegistrationTaskResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     *
     * @return <p>
     *         The status of the bulk thing provisioning task.
     *         </p>
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     *
     * @param status <p>
     *            The status of the bulk thing provisioning task.
     *            </p>
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     *
     * @param status <p>
     *            The status of the bulk thing provisioning task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public DescribeThingRegistrationTaskResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     *
     * @param status <p>
     *            The status of the bulk thing provisioning task.
     *            </p>
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     *
     * @param status <p>
     *            The status of the bulk thing provisioning task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public DescribeThingRegistrationTaskResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         The message.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param message <p>
     *            The message.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param message <p>
     *            The message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingRegistrationTaskResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The number of things successfully provisioned.
     * </p>
     *
     * @return <p>
     *         The number of things successfully provisioned.
     *         </p>
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    /**
     * <p>
     * The number of things successfully provisioned.
     * </p>
     *
     * @param successCount <p>
     *            The number of things successfully provisioned.
     *            </p>
     */
    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    /**
     * <p>
     * The number of things successfully provisioned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successCount <p>
     *            The number of things successfully provisioned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingRegistrationTaskResult withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * <p>
     * The number of things that failed to be provisioned.
     * </p>
     *
     * @return <p>
     *         The number of things that failed to be provisioned.
     *         </p>
     */
    public Integer getFailureCount() {
        return failureCount;
    }

    /**
     * <p>
     * The number of things that failed to be provisioned.
     * </p>
     *
     * @param failureCount <p>
     *            The number of things that failed to be provisioned.
     *            </p>
     */
    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    /**
     * <p>
     * The number of things that failed to be provisioned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureCount <p>
     *            The number of things that failed to be provisioned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingRegistrationTaskResult withFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    /**
     * <p>
     * The progress of the bulk provisioning task expressed as a percentage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The progress of the bulk provisioning task expressed as a
     *         percentage.
     *         </p>
     */
    public Integer getPercentageProgress() {
        return percentageProgress;
    }

    /**
     * <p>
     * The progress of the bulk provisioning task expressed as a percentage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param percentageProgress <p>
     *            The progress of the bulk provisioning task expressed as a
     *            percentage.
     *            </p>
     */
    public void setPercentageProgress(Integer percentageProgress) {
        this.percentageProgress = percentageProgress;
    }

    /**
     * <p>
     * The progress of the bulk provisioning task expressed as a percentage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param percentageProgress <p>
     *            The progress of the bulk provisioning task expressed as a
     *            percentage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingRegistrationTaskResult withPercentageProgress(Integer percentageProgress) {
        this.percentageProgress = percentageProgress;
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
        if (getTaskId() != null)
            sb.append("taskId: " + getTaskId() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        if (getTemplateBody() != null)
            sb.append("templateBody: " + getTemplateBody() + ",");
        if (getInputFileBucket() != null)
            sb.append("inputFileBucket: " + getInputFileBucket() + ",");
        if (getInputFileKey() != null)
            sb.append("inputFileKey: " + getInputFileKey() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage() + ",");
        if (getSuccessCount() != null)
            sb.append("successCount: " + getSuccessCount() + ",");
        if (getFailureCount() != null)
            sb.append("failureCount: " + getFailureCount() + ",");
        if (getPercentageProgress() != null)
            sb.append("percentageProgress: " + getPercentageProgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode
                + ((getInputFileBucket() == null) ? 0 : getInputFileBucket().hashCode());
        hashCode = prime * hashCode
                + ((getInputFileKey() == null) ? 0 : getInputFileKey().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getSuccessCount() == null) ? 0 : getSuccessCount().hashCode());
        hashCode = prime * hashCode
                + ((getFailureCount() == null) ? 0 : getFailureCount().hashCode());
        hashCode = prime * hashCode
                + ((getPercentageProgress() == null) ? 0 : getPercentageProgress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThingRegistrationTaskResult == false)
            return false;
        DescribeThingRegistrationTaskResult other = (DescribeThingRegistrationTaskResult) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null
                && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getInputFileBucket() == null ^ this.getInputFileBucket() == null)
            return false;
        if (other.getInputFileBucket() != null
                && other.getInputFileBucket().equals(this.getInputFileBucket()) == false)
            return false;
        if (other.getInputFileKey() == null ^ this.getInputFileKey() == null)
            return false;
        if (other.getInputFileKey() != null
                && other.getInputFileKey().equals(this.getInputFileKey()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSuccessCount() == null ^ this.getSuccessCount() == null)
            return false;
        if (other.getSuccessCount() != null
                && other.getSuccessCount().equals(this.getSuccessCount()) == false)
            return false;
        if (other.getFailureCount() == null ^ this.getFailureCount() == null)
            return false;
        if (other.getFailureCount() != null
                && other.getFailureCount().equals(this.getFailureCount()) == false)
            return false;
        if (other.getPercentageProgress() == null ^ this.getPercentageProgress() == null)
            return false;
        if (other.getPercentageProgress() != null
                && other.getPercentageProgress().equals(this.getPercentageProgress()) == false)
            return false;
        return true;
    }
}
