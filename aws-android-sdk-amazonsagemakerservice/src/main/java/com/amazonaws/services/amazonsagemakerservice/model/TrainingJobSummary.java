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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides summary information about a training job.
 * </p>
 */
public class TrainingJobSummary implements Serializable {
    /**
     * <p>
     * The name of the training job that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trainingJobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     */
    private String trainingJobArn;

    /**
     * <p>
     * A timestamp that shows when the training job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * A timestamp that shows when the training job ended. This field is set
     * only if the training job has one of the terminal statuses (
     * <code>Completed</code>, <code>Failed</code>, or <code>Stopped</code>).
     * </p>
     */
    private java.util.Date trainingEndTime;

    /**
     * <p>
     * Timestamp when the training job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     */
    private String trainingJobStatus;

    /**
     * <p>
     * The name of the training job that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the training job that you want a summary for.
     *         </p>
     */
    public String getTrainingJobName() {
        return trainingJobName;
    }

    /**
     * <p>
     * The name of the training job that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trainingJobName <p>
     *            The name of the training job that you want a summary for.
     *            </p>
     */
    public void setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
    }

    /**
     * <p>
     * The name of the training job that you want a summary for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trainingJobName <p>
     *            The name of the training job that you want a summary for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobSummary withTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the training job.
     *         </p>
     */
    public String getTrainingJobArn() {
        return trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     *
     * @param trainingJobArn <p>
     *            The Amazon Resource Name (ARN) of the training job.
     *            </p>
     */
    public void setTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*<br/>
     *
     * @param trainingJobArn <p>
     *            The Amazon Resource Name (ARN) of the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobSummary withTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the training job was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the training job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the training job was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the training job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the training job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the training job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the training job ended. This field is set
     * only if the training job has one of the terminal statuses (
     * <code>Completed</code>, <code>Failed</code>, or <code>Stopped</code>).
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the training job ended. This field is
     *         set only if the training job has one of the terminal statuses (
     *         <code>Completed</code>, <code>Failed</code>, or
     *         <code>Stopped</code>).
     *         </p>
     */
    public java.util.Date getTrainingEndTime() {
        return trainingEndTime;
    }

    /**
     * <p>
     * A timestamp that shows when the training job ended. This field is set
     * only if the training job has one of the terminal statuses (
     * <code>Completed</code>, <code>Failed</code>, or <code>Stopped</code>).
     * </p>
     *
     * @param trainingEndTime <p>
     *            A timestamp that shows when the training job ended. This field
     *            is set only if the training job has one of the terminal
     *            statuses (<code>Completed</code>, <code>Failed</code>, or
     *            <code>Stopped</code>).
     *            </p>
     */
    public void setTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
    }

    /**
     * <p>
     * A timestamp that shows when the training job ended. This field is set
     * only if the training job has one of the terminal statuses (
     * <code>Completed</code>, <code>Failed</code>, or <code>Stopped</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingEndTime <p>
     *            A timestamp that shows when the training job ended. This field
     *            is set only if the training job has one of the terminal
     *            statuses (<code>Completed</code>, <code>Failed</code>, or
     *            <code>Stopped</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobSummary withTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
        return this;
    }

    /**
     * <p>
     * Timestamp when the training job was last modified.
     * </p>
     *
     * @return <p>
     *         Timestamp when the training job was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * Timestamp when the training job was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            Timestamp when the training job was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Timestamp when the training job was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            Timestamp when the training job was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @return <p>
     *         The status of the training job.
     *         </p>
     * @see TrainingJobStatus
     */
    public String getTrainingJobStatus() {
        return trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     * @see TrainingJobStatus
     */
    public void setTrainingJobStatus(String trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobStatus
     */
    public TrainingJobSummary withTrainingJobStatus(String trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     * @see TrainingJobStatus
     */
    public void setTrainingJobStatus(TrainingJobStatus trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus.toString();
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param trainingJobStatus <p>
     *            The status of the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobStatus
     */
    public TrainingJobSummary withTrainingJobStatus(TrainingJobStatus trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus.toString();
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
        if (getTrainingJobName() != null)
            sb.append("TrainingJobName: " + getTrainingJobName() + ",");
        if (getTrainingJobArn() != null)
            sb.append("TrainingJobArn: " + getTrainingJobArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTrainingEndTime() != null)
            sb.append("TrainingEndTime: " + getTrainingEndTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getTrainingJobStatus() != null)
            sb.append("TrainingJobStatus: " + getTrainingJobStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrainingJobName() == null) ? 0 : getTrainingJobName().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingJobArn() == null) ? 0 : getTrainingJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingEndTime() == null) ? 0 : getTrainingEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingJobStatus() == null) ? 0 : getTrainingJobStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingJobSummary == false)
            return false;
        TrainingJobSummary other = (TrainingJobSummary) obj;

        if (other.getTrainingJobName() == null ^ this.getTrainingJobName() == null)
            return false;
        if (other.getTrainingJobName() != null
                && other.getTrainingJobName().equals(this.getTrainingJobName()) == false)
            return false;
        if (other.getTrainingJobArn() == null ^ this.getTrainingJobArn() == null)
            return false;
        if (other.getTrainingJobArn() != null
                && other.getTrainingJobArn().equals(this.getTrainingJobArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTrainingEndTime() == null ^ this.getTrainingEndTime() == null)
            return false;
        if (other.getTrainingEndTime() != null
                && other.getTrainingEndTime().equals(this.getTrainingEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getTrainingJobStatus() == null ^ this.getTrainingJobStatus() == null)
            return false;
        if (other.getTrainingJobStatus() != null
                && other.getTrainingJobStatus().equals(this.getTrainingJobStatus()) == false)
            return false;
        return true;
    }
}
