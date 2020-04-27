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
 * An AutoPilot job will return recommendations, or candidates. Each candidate
 * has futher details about the steps involed, and the status.
 * </p>
 */
public class AutoMLCandidate implements Serializable {
    /**
     * <p>
     * The candidate name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String candidateName;

    /**
     * <p>
     * The candidate result from a job.
     * </p>
     */
    private FinalAutoMLJobObjectiveMetric finalAutoMLJobObjectiveMetric;

    /**
     * <p>
     * The objective status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     */
    private String objectiveStatus;

    /**
     * <p>
     * The candidate's steps.
     * </p>
     */
    private java.util.List<AutoMLCandidateStep> candidateSteps;

    /**
     * <p>
     * The candidate's status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     */
    private String candidateStatus;

    /**
     * <p>
     * The inference containers.
     * </p>
     */
    private java.util.List<AutoMLContainerDefinition> inferenceContainers;

    /**
     * <p>
     * The creation time.
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
     * The last modified time.
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
     * The candidate name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The candidate name.
     *         </p>
     */
    public String getCandidateName() {
        return candidateName;
    }

    /**
     * <p>
     * The candidate name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param candidateName <p>
     *            The candidate name.
     *            </p>
     */
    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    /**
     * <p>
     * The candidate name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param candidateName <p>
     *            The candidate name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLCandidate withCandidateName(String candidateName) {
        this.candidateName = candidateName;
        return this;
    }

    /**
     * <p>
     * The candidate result from a job.
     * </p>
     *
     * @return <p>
     *         The candidate result from a job.
     *         </p>
     */
    public FinalAutoMLJobObjectiveMetric getFinalAutoMLJobObjectiveMetric() {
        return finalAutoMLJobObjectiveMetric;
    }

    /**
     * <p>
     * The candidate result from a job.
     * </p>
     *
     * @param finalAutoMLJobObjectiveMetric <p>
     *            The candidate result from a job.
     *            </p>
     */
    public void setFinalAutoMLJobObjectiveMetric(
            FinalAutoMLJobObjectiveMetric finalAutoMLJobObjectiveMetric) {
        this.finalAutoMLJobObjectiveMetric = finalAutoMLJobObjectiveMetric;
    }

    /**
     * <p>
     * The candidate result from a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalAutoMLJobObjectiveMetric <p>
     *            The candidate result from a job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLCandidate withFinalAutoMLJobObjectiveMetric(
            FinalAutoMLJobObjectiveMetric finalAutoMLJobObjectiveMetric) {
        this.finalAutoMLJobObjectiveMetric = finalAutoMLJobObjectiveMetric;
        return this;
    }

    /**
     * <p>
     * The objective status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     *
     * @return <p>
     *         The objective status.
     *         </p>
     * @see ObjectiveStatus
     */
    public String getObjectiveStatus() {
        return objectiveStatus;
    }

    /**
     * <p>
     * The objective status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     *
     * @param objectiveStatus <p>
     *            The objective status.
     *            </p>
     * @see ObjectiveStatus
     */
    public void setObjectiveStatus(String objectiveStatus) {
        this.objectiveStatus = objectiveStatus;
    }

    /**
     * <p>
     * The objective status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     *
     * @param objectiveStatus <p>
     *            The objective status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectiveStatus
     */
    public AutoMLCandidate withObjectiveStatus(String objectiveStatus) {
        this.objectiveStatus = objectiveStatus;
        return this;
    }

    /**
     * <p>
     * The objective status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     *
     * @param objectiveStatus <p>
     *            The objective status.
     *            </p>
     * @see ObjectiveStatus
     */
    public void setObjectiveStatus(ObjectiveStatus objectiveStatus) {
        this.objectiveStatus = objectiveStatus.toString();
    }

    /**
     * <p>
     * The objective status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Succeeded, Pending, Failed
     *
     * @param objectiveStatus <p>
     *            The objective status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectiveStatus
     */
    public AutoMLCandidate withObjectiveStatus(ObjectiveStatus objectiveStatus) {
        this.objectiveStatus = objectiveStatus.toString();
        return this;
    }

    /**
     * <p>
     * The candidate's steps.
     * </p>
     *
     * @return <p>
     *         The candidate's steps.
     *         </p>
     */
    public java.util.List<AutoMLCandidateStep> getCandidateSteps() {
        return candidateSteps;
    }

    /**
     * <p>
     * The candidate's steps.
     * </p>
     *
     * @param candidateSteps <p>
     *            The candidate's steps.
     *            </p>
     */
    public void setCandidateSteps(java.util.Collection<AutoMLCandidateStep> candidateSteps) {
        if (candidateSteps == null) {
            this.candidateSteps = null;
            return;
        }

        this.candidateSteps = new java.util.ArrayList<AutoMLCandidateStep>(candidateSteps);
    }

    /**
     * <p>
     * The candidate's steps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param candidateSteps <p>
     *            The candidate's steps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLCandidate withCandidateSteps(AutoMLCandidateStep... candidateSteps) {
        if (getCandidateSteps() == null) {
            this.candidateSteps = new java.util.ArrayList<AutoMLCandidateStep>(
                    candidateSteps.length);
        }
        for (AutoMLCandidateStep value : candidateSteps) {
            this.candidateSteps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The candidate's steps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param candidateSteps <p>
     *            The candidate's steps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLCandidate withCandidateSteps(
            java.util.Collection<AutoMLCandidateStep> candidateSteps) {
        setCandidateSteps(candidateSteps);
        return this;
    }

    /**
     * <p>
     * The candidate's status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @return <p>
     *         The candidate's status.
     *         </p>
     * @see CandidateStatus
     */
    public String getCandidateStatus() {
        return candidateStatus;
    }

    /**
     * <p>
     * The candidate's status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param candidateStatus <p>
     *            The candidate's status.
     *            </p>
     * @see CandidateStatus
     */
    public void setCandidateStatus(String candidateStatus) {
        this.candidateStatus = candidateStatus;
    }

    /**
     * <p>
     * The candidate's status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param candidateStatus <p>
     *            The candidate's status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CandidateStatus
     */
    public AutoMLCandidate withCandidateStatus(String candidateStatus) {
        this.candidateStatus = candidateStatus;
        return this;
    }

    /**
     * <p>
     * The candidate's status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param candidateStatus <p>
     *            The candidate's status.
     *            </p>
     * @see CandidateStatus
     */
    public void setCandidateStatus(CandidateStatus candidateStatus) {
        this.candidateStatus = candidateStatus.toString();
    }

    /**
     * <p>
     * The candidate's status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Completed, InProgress, Failed, Stopped, Stopping
     *
     * @param candidateStatus <p>
     *            The candidate's status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CandidateStatus
     */
    public AutoMLCandidate withCandidateStatus(CandidateStatus candidateStatus) {
        this.candidateStatus = candidateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The inference containers.
     * </p>
     *
     * @return <p>
     *         The inference containers.
     *         </p>
     */
    public java.util.List<AutoMLContainerDefinition> getInferenceContainers() {
        return inferenceContainers;
    }

    /**
     * <p>
     * The inference containers.
     * </p>
     *
     * @param inferenceContainers <p>
     *            The inference containers.
     *            </p>
     */
    public void setInferenceContainers(
            java.util.Collection<AutoMLContainerDefinition> inferenceContainers) {
        if (inferenceContainers == null) {
            this.inferenceContainers = null;
            return;
        }

        this.inferenceContainers = new java.util.ArrayList<AutoMLContainerDefinition>(
                inferenceContainers);
    }

    /**
     * <p>
     * The inference containers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceContainers <p>
     *            The inference containers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLCandidate withInferenceContainers(AutoMLContainerDefinition... inferenceContainers) {
        if (getInferenceContainers() == null) {
            this.inferenceContainers = new java.util.ArrayList<AutoMLContainerDefinition>(
                    inferenceContainers.length);
        }
        for (AutoMLContainerDefinition value : inferenceContainers) {
            this.inferenceContainers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The inference containers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inferenceContainers <p>
     *            The inference containers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLCandidate withInferenceContainers(
            java.util.Collection<AutoMLContainerDefinition> inferenceContainers) {
        setInferenceContainers(inferenceContainers);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     *
     * @return <p>
     *         The creation time.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     *
     * @param creationTime <p>
     *            The creation time.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLCandidate withCreationTime(java.util.Date creationTime) {
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
    public AutoMLCandidate withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     *
     * @return <p>
     *         The last modified time.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The last modified time.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The last modified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLCandidate withLastModifiedTime(java.util.Date lastModifiedTime) {
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
    public AutoMLCandidate withFailureReason(String failureReason) {
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
        if (getCandidateName() != null)
            sb.append("CandidateName: " + getCandidateName() + ",");
        if (getFinalAutoMLJobObjectiveMetric() != null)
            sb.append("FinalAutoMLJobObjectiveMetric: " + getFinalAutoMLJobObjectiveMetric() + ",");
        if (getObjectiveStatus() != null)
            sb.append("ObjectiveStatus: " + getObjectiveStatus() + ",");
        if (getCandidateSteps() != null)
            sb.append("CandidateSteps: " + getCandidateSteps() + ",");
        if (getCandidateStatus() != null)
            sb.append("CandidateStatus: " + getCandidateStatus() + ",");
        if (getInferenceContainers() != null)
            sb.append("InferenceContainers: " + getInferenceContainers() + ",");
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
                + ((getCandidateName() == null) ? 0 : getCandidateName().hashCode());
        hashCode = prime
                * hashCode
                + ((getFinalAutoMLJobObjectiveMetric() == null) ? 0
                        : getFinalAutoMLJobObjectiveMetric().hashCode());
        hashCode = prime * hashCode
                + ((getObjectiveStatus() == null) ? 0 : getObjectiveStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCandidateSteps() == null) ? 0 : getCandidateSteps().hashCode());
        hashCode = prime * hashCode
                + ((getCandidateStatus() == null) ? 0 : getCandidateStatus().hashCode());
        hashCode = prime * hashCode
                + ((getInferenceContainers() == null) ? 0 : getInferenceContainers().hashCode());
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

        if (obj instanceof AutoMLCandidate == false)
            return false;
        AutoMLCandidate other = (AutoMLCandidate) obj;

        if (other.getCandidateName() == null ^ this.getCandidateName() == null)
            return false;
        if (other.getCandidateName() != null
                && other.getCandidateName().equals(this.getCandidateName()) == false)
            return false;
        if (other.getFinalAutoMLJobObjectiveMetric() == null
                ^ this.getFinalAutoMLJobObjectiveMetric() == null)
            return false;
        if (other.getFinalAutoMLJobObjectiveMetric() != null
                && other.getFinalAutoMLJobObjectiveMetric().equals(
                        this.getFinalAutoMLJobObjectiveMetric()) == false)
            return false;
        if (other.getObjectiveStatus() == null ^ this.getObjectiveStatus() == null)
            return false;
        if (other.getObjectiveStatus() != null
                && other.getObjectiveStatus().equals(this.getObjectiveStatus()) == false)
            return false;
        if (other.getCandidateSteps() == null ^ this.getCandidateSteps() == null)
            return false;
        if (other.getCandidateSteps() != null
                && other.getCandidateSteps().equals(this.getCandidateSteps()) == false)
            return false;
        if (other.getCandidateStatus() == null ^ this.getCandidateStatus() == null)
            return false;
        if (other.getCandidateStatus() != null
                && other.getCandidateStatus().equals(this.getCandidateStatus()) == false)
            return false;
        if (other.getInferenceContainers() == null ^ this.getInferenceContainers() == null)
            return false;
        if (other.getInferenceContainers() != null
                && other.getInferenceContainers().equals(this.getInferenceContainers()) == false)
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
