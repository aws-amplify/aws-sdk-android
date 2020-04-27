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
 * Provides a summary of a transform job. Multiple
 * <code>TransformJobSummary</code> objects are returned as a list after in
 * response to a <a>ListTransformJobs</a> call.
 * </p>
 */
public class TransformJobSummary implements Serializable {
    /**
     * <p>
     * The name of the transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String transformJobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:transform-job/.*<br/>
     */
    private String transformJobArn;

    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Indicates when the transform job ends on compute instances. For
     * successful jobs and stopped jobs, this is the exact time recorded after
     * the results are uploaded. For failed jobs, this is when Amazon SageMaker
     * detected that the job failed.
     * </p>
     */
    private java.util.Date transformEndTime;

    /**
     * <p>
     * Indicates when the transform job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     */
    private String transformJobStatus;

    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the transform job.
     *         </p>
     */
    public String getTransformJobName() {
        return transformJobName;
    }

    /**
     * <p>
     * The name of the transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param transformJobName <p>
     *            The name of the transform job.
     *            </p>
     */
    public void setTransformJobName(String transformJobName) {
        this.transformJobName = transformJobName;
    }

    /**
     * <p>
     * The name of the transform job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param transformJobName <p>
     *            The name of the transform job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformJobSummary withTransformJobName(String transformJobName) {
        this.transformJobName = transformJobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:transform-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the transform job.
     *         </p>
     */
    public String getTransformJobArn() {
        return transformJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:transform-job/.*<br/>
     *
     * @param transformJobArn <p>
     *            The Amazon Resource Name (ARN) of the transform job.
     *            </p>
     */
    public void setTransformJobArn(String transformJobArn) {
        this.transformJobArn = transformJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:transform-job/.*<br/>
     *
     * @param transformJobArn <p>
     *            The Amazon Resource Name (ARN) of the transform job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformJobSummary withTransformJobArn(String transformJobArn) {
        this.transformJobArn = transformJobArn;
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that shows when the transform Job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that shows when the transform Job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the transform Job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that shows when the transform Job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformJobSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Indicates when the transform job ends on compute instances. For
     * successful jobs and stopped jobs, this is the exact time recorded after
     * the results are uploaded. For failed jobs, this is when Amazon SageMaker
     * detected that the job failed.
     * </p>
     *
     * @return <p>
     *         Indicates when the transform job ends on compute instances. For
     *         successful jobs and stopped jobs, this is the exact time recorded
     *         after the results are uploaded. For failed jobs, this is when
     *         Amazon SageMaker detected that the job failed.
     *         </p>
     */
    public java.util.Date getTransformEndTime() {
        return transformEndTime;
    }

    /**
     * <p>
     * Indicates when the transform job ends on compute instances. For
     * successful jobs and stopped jobs, this is the exact time recorded after
     * the results are uploaded. For failed jobs, this is when Amazon SageMaker
     * detected that the job failed.
     * </p>
     *
     * @param transformEndTime <p>
     *            Indicates when the transform job ends on compute instances.
     *            For successful jobs and stopped jobs, this is the exact time
     *            recorded after the results are uploaded. For failed jobs, this
     *            is when Amazon SageMaker detected that the job failed.
     *            </p>
     */
    public void setTransformEndTime(java.util.Date transformEndTime) {
        this.transformEndTime = transformEndTime;
    }

    /**
     * <p>
     * Indicates when the transform job ends on compute instances. For
     * successful jobs and stopped jobs, this is the exact time recorded after
     * the results are uploaded. For failed jobs, this is when Amazon SageMaker
     * detected that the job failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transformEndTime <p>
     *            Indicates when the transform job ends on compute instances.
     *            For successful jobs and stopped jobs, this is the exact time
     *            recorded after the results are uploaded. For failed jobs, this
     *            is when Amazon SageMaker detected that the job failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformJobSummary withTransformEndTime(java.util.Date transformEndTime) {
        this.transformEndTime = transformEndTime;
        return this;
    }

    /**
     * <p>
     * Indicates when the transform job was last modified.
     * </p>
     *
     * @return <p>
     *         Indicates when the transform job was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * Indicates when the transform job was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            Indicates when the transform job was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Indicates when the transform job was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            Indicates when the transform job was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @return <p>
     *         The status of the transform job.
     *         </p>
     * @see TransformJobStatus
     */
    public String getTransformJobStatus() {
        return transformJobStatus;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param transformJobStatus <p>
     *            The status of the transform job.
     *            </p>
     * @see TransformJobStatus
     */
    public void setTransformJobStatus(String transformJobStatus) {
        this.transformJobStatus = transformJobStatus;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param transformJobStatus <p>
     *            The status of the transform job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformJobStatus
     */
    public TransformJobSummary withTransformJobStatus(String transformJobStatus) {
        this.transformJobStatus = transformJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param transformJobStatus <p>
     *            The status of the transform job.
     *            </p>
     * @see TransformJobStatus
     */
    public void setTransformJobStatus(TransformJobStatus transformJobStatus) {
        this.transformJobStatus = transformJobStatus.toString();
    }

    /**
     * <p>
     * The status of the transform job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param transformJobStatus <p>
     *            The status of the transform job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransformJobStatus
     */
    public TransformJobSummary withTransformJobStatus(TransformJobStatus transformJobStatus) {
        this.transformJobStatus = transformJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the transform job failed, the reason it failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the transform job failed, the reason it failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the transform job failed, the reason it failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the transform job failed, the reason it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransformJobSummary withFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
        if (getTransformJobName() != null)
            sb.append("TransformJobName: " + getTransformJobName() + ",");
        if (getTransformJobArn() != null)
            sb.append("TransformJobArn: " + getTransformJobArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTransformEndTime() != null)
            sb.append("TransformEndTime: " + getTransformEndTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getTransformJobStatus() != null)
            sb.append("TransformJobStatus: " + getTransformJobStatus() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransformJobName() == null) ? 0 : getTransformJobName().hashCode());
        hashCode = prime * hashCode
                + ((getTransformJobArn() == null) ? 0 : getTransformJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getTransformEndTime() == null) ? 0 : getTransformEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getTransformJobStatus() == null) ? 0 : getTransformJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformJobSummary == false)
            return false;
        TransformJobSummary other = (TransformJobSummary) obj;

        if (other.getTransformJobName() == null ^ this.getTransformJobName() == null)
            return false;
        if (other.getTransformJobName() != null
                && other.getTransformJobName().equals(this.getTransformJobName()) == false)
            return false;
        if (other.getTransformJobArn() == null ^ this.getTransformJobArn() == null)
            return false;
        if (other.getTransformJobArn() != null
                && other.getTransformJobArn().equals(this.getTransformJobArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTransformEndTime() == null ^ this.getTransformEndTime() == null)
            return false;
        if (other.getTransformEndTime() != null
                && other.getTransformEndTime().equals(this.getTransformEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getTransformJobStatus() == null ^ this.getTransformJobStatus() == null)
            return false;
        if (other.getTransformJobStatus() != null
                && other.getTransformJobStatus().equals(this.getTransformJobStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
