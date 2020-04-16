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
 * Provides a summary about a job.
 * </p>
 */
public class AutoMLJobSummary implements Serializable {
    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String autoMLJobName;

    /**
     * <p>
     * The ARN of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     */
    private String autoMLJobArn;

    /**
     * <p>
     * The job's status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     */
    private String autoMLJobStatus;

    /**
     * <p>
     * The job's secondary status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     */
    private String autoMLJobSecondaryStatus;

    /**
     * <p>
     * When the job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The end time.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * When the job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the object you are requesting.
     *         </p>
     */
    public String getAutoMLJobName() {
        return autoMLJobName;
    }

    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param autoMLJobName <p>
     *            The name of the object you are requesting.
     *            </p>
     */
    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * The name of the object you are requesting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param autoMLJobName <p>
     *            The name of the object you are requesting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobSummary withAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
        return this;
    }

    /**
     * <p>
     * The ARN of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     *
     * @return <p>
     *         The ARN of the job.
     *         </p>
     */
    public String getAutoMLJobArn() {
        return autoMLJobArn;
    }

    /**
     * <p>
     * The ARN of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     *
     * @param autoMLJobArn <p>
     *            The ARN of the job.
     *            </p>
     */
    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * The ARN of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:automl-job/.*<br/>
     *
     * @param autoMLJobArn <p>
     *            The ARN of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobSummary withAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @return <p>
     *         The job's status.
     *         </p>
     * @see AutoMLJobStatus
     */
    public String getAutoMLJobStatus() {
        return autoMLJobStatus;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param autoMLJobStatus <p>
     *            The job's status.
     *            </p>
     * @see AutoMLJobStatus
     */
    public void setAutoMLJobStatus(String autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param autoMLJobStatus <p>
     *            The job's status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobStatus
     */
    public AutoMLJobSummary withAutoMLJobStatus(String autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus;
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param autoMLJobStatus <p>
     *            The job's status.
     *            </p>
     * @see AutoMLJobStatus
     */
    public void setAutoMLJobStatus(AutoMLJobStatus autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus.toString();
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param autoMLJobStatus <p>
     *            The job's status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobStatus
     */
    public AutoMLJobSummary withAutoMLJobStatus(AutoMLJobStatus autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The job's secondary status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     *
     * @return <p>
     *         The job's secondary status.
     *         </p>
     * @see AutoMLJobSecondaryStatus
     */
    public String getAutoMLJobSecondaryStatus() {
        return autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * The job's secondary status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     *
     * @param autoMLJobSecondaryStatus <p>
     *            The job's secondary status.
     *            </p>
     * @see AutoMLJobSecondaryStatus
     */
    public void setAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * The job's secondary status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     *
     * @param autoMLJobSecondaryStatus <p>
     *            The job's secondary status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobSecondaryStatus
     */
    public AutoMLJobSummary withAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus;
        return this;
    }

    /**
     * <p>
     * The job's secondary status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     *
     * @param autoMLJobSecondaryStatus <p>
     *            The job's secondary status.
     *            </p>
     * @see AutoMLJobSecondaryStatus
     */
    public void setAutoMLJobSecondaryStatus(AutoMLJobSecondaryStatus autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus.toString();
    }

    /**
     * <p>
     * The job's secondary status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Starting, AnalyzingData, FeatureEngineering,
     * ModelTuning, MaxCandidatesReached, Failed, Stopped,
     * MaxAutoMLJobRuntimeReached, Stopping, CandidateDefinitionsGenerated
     *
     * @param autoMLJobSecondaryStatus <p>
     *            The job's secondary status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLJobSecondaryStatus
     */
    public AutoMLJobSummary withAutoMLJobSecondaryStatus(
            AutoMLJobSecondaryStatus autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus.toString();
        return this;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     *
     * @return <p>
     *         When the job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     *
     * @param creationTime <p>
     *            When the job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            When the job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The end time.
     * </p>
     *
     * @return <p>
     *         The end time.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end time.
     * </p>
     *
     * @param endTime <p>
     *            The end time.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobSummary withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * When the job was last modified.
     * </p>
     *
     * @return <p>
     *         When the job was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * When the job was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            When the job was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the job was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            When the job was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The failure reason.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The failure reason.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            The failure reason.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobSummary withFailureReason(String failureReason) {
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
        if (getAutoMLJobName() != null)
            sb.append("AutoMLJobName: " + getAutoMLJobName() + ",");
        if (getAutoMLJobArn() != null)
            sb.append("AutoMLJobArn: " + getAutoMLJobArn() + ",");
        if (getAutoMLJobStatus() != null)
            sb.append("AutoMLJobStatus: " + getAutoMLJobStatus() + ",");
        if (getAutoMLJobSecondaryStatus() != null)
            sb.append("AutoMLJobSecondaryStatus: " + getAutoMLJobSecondaryStatus() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
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
                + ((getAutoMLJobName() == null) ? 0 : getAutoMLJobName().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLJobArn() == null) ? 0 : getAutoMLJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getAutoMLJobStatus() == null) ? 0 : getAutoMLJobStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMLJobSecondaryStatus() == null) ? 0 : getAutoMLJobSecondaryStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
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

        if (obj instanceof AutoMLJobSummary == false)
            return false;
        AutoMLJobSummary other = (AutoMLJobSummary) obj;

        if (other.getAutoMLJobName() == null ^ this.getAutoMLJobName() == null)
            return false;
        if (other.getAutoMLJobName() != null
                && other.getAutoMLJobName().equals(this.getAutoMLJobName()) == false)
            return false;
        if (other.getAutoMLJobArn() == null ^ this.getAutoMLJobArn() == null)
            return false;
        if (other.getAutoMLJobArn() != null
                && other.getAutoMLJobArn().equals(this.getAutoMLJobArn()) == false)
            return false;
        if (other.getAutoMLJobStatus() == null ^ this.getAutoMLJobStatus() == null)
            return false;
        if (other.getAutoMLJobStatus() != null
                && other.getAutoMLJobStatus().equals(this.getAutoMLJobStatus()) == false)
            return false;
        if (other.getAutoMLJobSecondaryStatus() == null
                ^ this.getAutoMLJobSecondaryStatus() == null)
            return false;
        if (other.getAutoMLJobSecondaryStatus() != null
                && other.getAutoMLJobSecondaryStatus().equals(this.getAutoMLJobSecondaryStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
