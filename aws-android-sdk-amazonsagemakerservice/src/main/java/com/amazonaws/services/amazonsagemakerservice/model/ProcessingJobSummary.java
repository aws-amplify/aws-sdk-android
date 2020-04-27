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
 * Summary of information about a processing job.
 * </p>
 */
public class ProcessingJobSummary implements Serializable {
    /**
     * <p>
     * The name of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String processingJobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job..
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     */
    private String processingJobArn;

    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     */
    private java.util.Date processingEndTime;

    /**
     * <p>
     * A timestamp that indicates the last time the processing job was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     */
    private String processingJobStatus;

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job
     * failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the
     * processing container when the processing job exits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String exitMessage;

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the processing job.
     *         </p>
     */
    public String getProcessingJobName() {
        return processingJobName;
    }

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param processingJobName <p>
     *            The name of the processing job.
     *            </p>
     */
    public void setProcessingJobName(String processingJobName) {
        this.processingJobName = processingJobName;
    }

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param processingJobName <p>
     *            The name of the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJobSummary withProcessingJobName(String processingJobName) {
        this.processingJobName = processingJobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job..
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the processing job..
     *         </p>
     */
    public String getProcessingJobArn() {
        return processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job..
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @param processingJobArn <p>
     *            The Amazon Resource Name (ARN) of the processing job..
     *            </p>
     */
    public void setProcessingJobArn(String processingJobArn) {
        this.processingJobArn = processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job..
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:processing-job/.*
     * <br/>
     *
     * @param processingJobArn <p>
     *            The Amazon Resource Name (ARN) of the processing job..
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJobSummary withProcessingJobArn(String processingJobArn) {
        this.processingJobArn = processingJobArn;
        return this;
    }

    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     *
     * @return <p>
     *         The time at which the processing job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time at which the processing job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time at which the processing job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJobSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     *
     * @return <p>
     *         The time at which the processing job completed.
     *         </p>
     */
    public java.util.Date getProcessingEndTime() {
        return processingEndTime;
    }

    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     *
     * @param processingEndTime <p>
     *            The time at which the processing job completed.
     *            </p>
     */
    public void setProcessingEndTime(java.util.Date processingEndTime) {
        this.processingEndTime = processingEndTime;
    }

    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processingEndTime <p>
     *            The time at which the processing job completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJobSummary withProcessingEndTime(java.util.Date processingEndTime) {
        this.processingEndTime = processingEndTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the processing job was modified.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates the last time the processing job was
     *         modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the processing job was modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            A timestamp that indicates the last time the processing job
     *            was modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the processing job was modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            A timestamp that indicates the last time the processing job
     *            was modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @return <p>
     *         The status of the processing job.
     *         </p>
     * @see ProcessingJobStatus
     */
    public String getProcessingJobStatus() {
        return processingJobStatus;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param processingJobStatus <p>
     *            The status of the processing job.
     *            </p>
     * @see ProcessingJobStatus
     */
    public void setProcessingJobStatus(String processingJobStatus) {
        this.processingJobStatus = processingJobStatus;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param processingJobStatus <p>
     *            The status of the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingJobStatus
     */
    public ProcessingJobSummary withProcessingJobStatus(String processingJobStatus) {
        this.processingJobStatus = processingJobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param processingJobStatus <p>
     *            The status of the processing job.
     *            </p>
     * @see ProcessingJobStatus
     */
    public void setProcessingJobStatus(ProcessingJobStatus processingJobStatus) {
        this.processingJobStatus = processingJobStatus.toString();
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param processingJobStatus <p>
     *            The status of the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProcessingJobStatus
     */
    public ProcessingJobSummary withProcessingJobStatus(ProcessingJobStatus processingJobStatus) {
        this.processingJobStatus = processingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job
     * failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         A string, up to one KB in size, that contains the reason a
     *         processing job failed, if it failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job
     * failed, if it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            A string, up to one KB in size, that contains the reason a
     *            processing job failed, if it failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job
     * failed, if it failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            A string, up to one KB in size, that contains the reason a
     *            processing job failed, if it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJobSummary withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the
     * processing container when the processing job exits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         An optional string, up to one KB in size, that contains metadata
     *         from the processing container when the processing job exits.
     *         </p>
     */
    public String getExitMessage() {
        return exitMessage;
    }

    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the
     * processing container when the processing job exits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param exitMessage <p>
     *            An optional string, up to one KB in size, that contains
     *            metadata from the processing container when the processing job
     *            exits.
     *            </p>
     */
    public void setExitMessage(String exitMessage) {
        this.exitMessage = exitMessage;
    }

    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the
     * processing container when the processing job exits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param exitMessage <p>
     *            An optional string, up to one KB in size, that contains
     *            metadata from the processing container when the processing job
     *            exits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingJobSummary withExitMessage(String exitMessage) {
        this.exitMessage = exitMessage;
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
        if (getProcessingJobName() != null)
            sb.append("ProcessingJobName: " + getProcessingJobName() + ",");
        if (getProcessingJobArn() != null)
            sb.append("ProcessingJobArn: " + getProcessingJobArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getProcessingEndTime() != null)
            sb.append("ProcessingEndTime: " + getProcessingEndTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getProcessingJobStatus() != null)
            sb.append("ProcessingJobStatus: " + getProcessingJobStatus() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getExitMessage() != null)
            sb.append("ExitMessage: " + getExitMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProcessingJobName() == null) ? 0 : getProcessingJobName().hashCode());
        hashCode = prime * hashCode
                + ((getProcessingJobArn() == null) ? 0 : getProcessingJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getProcessingEndTime() == null) ? 0 : getProcessingEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getProcessingJobStatus() == null) ? 0 : getProcessingJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getExitMessage() == null) ? 0 : getExitMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingJobSummary == false)
            return false;
        ProcessingJobSummary other = (ProcessingJobSummary) obj;

        if (other.getProcessingJobName() == null ^ this.getProcessingJobName() == null)
            return false;
        if (other.getProcessingJobName() != null
                && other.getProcessingJobName().equals(this.getProcessingJobName()) == false)
            return false;
        if (other.getProcessingJobArn() == null ^ this.getProcessingJobArn() == null)
            return false;
        if (other.getProcessingJobArn() != null
                && other.getProcessingJobArn().equals(this.getProcessingJobArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getProcessingEndTime() == null ^ this.getProcessingEndTime() == null)
            return false;
        if (other.getProcessingEndTime() != null
                && other.getProcessingEndTime().equals(this.getProcessingEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getProcessingJobStatus() == null ^ this.getProcessingJobStatus() == null)
            return false;
        if (other.getProcessingJobStatus() != null
                && other.getProcessingJobStatus().equals(this.getProcessingJobStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getExitMessage() == null ^ this.getExitMessage() == null)
            return false;
        if (other.getExitMessage() != null
                && other.getExitMessage().equals(this.getExitMessage()) == false)
            return false;
        return true;
    }
}
