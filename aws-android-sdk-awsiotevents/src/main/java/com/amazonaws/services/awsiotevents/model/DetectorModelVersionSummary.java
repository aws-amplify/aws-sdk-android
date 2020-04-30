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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the detector model version.
 * </p>
 */
public class DetectorModelVersionSummary implements Serializable {
    /**
     * <p>
     * The name of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     */
    private String detectorModelName;

    /**
     * <p>
     * The ID of the detector model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String detectorModelVersion;

    /**
     * <p>
     * The ARN of the detector model version.
     * </p>
     */
    private String detectorModelArn;

    /**
     * <p>
     * The ARN of the role that grants the detector model permission to perform
     * its tasks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The time the detector model version was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The last time the detector model version was updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The status of the detector model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     */
    private String status;

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     */
    private String evaluationMethod;

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @return <p>
     *         The name of the detector model.
     *         </p>
     */
    public String getDetectorModelName() {
        return detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @param detectorModelName <p>
     *            The name of the detector model.
     *            </p>
     */
    public void setDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
    }

    /**
     * <p>
     * The name of the detector model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_-]+$<br/>
     *
     * @param detectorModelName <p>
     *            The name of the detector model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelVersionSummary withDetectorModelName(String detectorModelName) {
        this.detectorModelName = detectorModelName;
        return this;
    }

    /**
     * <p>
     * The ID of the detector model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The ID of the detector model version.
     *         </p>
     */
    public String getDetectorModelVersion() {
        return detectorModelVersion;
    }

    /**
     * <p>
     * The ID of the detector model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param detectorModelVersion <p>
     *            The ID of the detector model version.
     *            </p>
     */
    public void setDetectorModelVersion(String detectorModelVersion) {
        this.detectorModelVersion = detectorModelVersion;
    }

    /**
     * <p>
     * The ID of the detector model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param detectorModelVersion <p>
     *            The ID of the detector model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelVersionSummary withDetectorModelVersion(String detectorModelVersion) {
        this.detectorModelVersion = detectorModelVersion;
        return this;
    }

    /**
     * <p>
     * The ARN of the detector model version.
     * </p>
     *
     * @return <p>
     *         The ARN of the detector model version.
     *         </p>
     */
    public String getDetectorModelArn() {
        return detectorModelArn;
    }

    /**
     * <p>
     * The ARN of the detector model version.
     * </p>
     *
     * @param detectorModelArn <p>
     *            The ARN of the detector model version.
     *            </p>
     */
    public void setDetectorModelArn(String detectorModelArn) {
        this.detectorModelArn = detectorModelArn;
    }

    /**
     * <p>
     * The ARN of the detector model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorModelArn <p>
     *            The ARN of the detector model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelVersionSummary withDetectorModelArn(String detectorModelArn) {
        this.detectorModelArn = detectorModelArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants the detector model permission to perform
     * its tasks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the role that grants the detector model permission to
     *         perform its tasks.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants the detector model permission to perform
     * its tasks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants the detector model permission
     *            to perform its tasks.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants the detector model permission to perform
     * its tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants the detector model permission
     *            to perform its tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelVersionSummary withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The time the detector model version was created.
     * </p>
     *
     * @return <p>
     *         The time the detector model version was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time the detector model version was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time the detector model version was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the detector model version was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time the detector model version was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelVersionSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The last time the detector model version was updated.
     * </p>
     *
     * @return <p>
     *         The last time the detector model version was updated.
     *         </p>
     */
    public java.util.Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * <p>
     * The last time the detector model version was updated.
     * </p>
     *
     * @param lastUpdateTime <p>
     *            The last time the detector model version was updated.
     *            </p>
     */
    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time the detector model version was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateTime <p>
     *            The last time the detector model version was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelVersionSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * <p>
     * The status of the detector model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     *
     * @return <p>
     *         The status of the detector model version.
     *         </p>
     * @see DetectorModelVersionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the detector model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     *
     * @param status <p>
     *            The status of the detector model version.
     *            </p>
     * @see DetectorModelVersionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the detector model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     *
     * @param status <p>
     *            The status of the detector model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectorModelVersionStatus
     */
    public DetectorModelVersionSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the detector model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     *
     * @param status <p>
     *            The status of the detector model version.
     *            </p>
     * @see DetectorModelVersionStatus
     */
    public void setStatus(DetectorModelVersionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the detector model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ACTIVATING, INACTIVE, DEPRECATED, DRAFT,
     * PAUSED, FAILED
     *
     * @param status <p>
     *            The status of the detector model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DetectorModelVersionStatus
     */
    public DetectorModelVersionSummary withStatus(DetectorModelVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     *
     * @return <p>
     *         Information about the order in which events are evaluated and how
     *         actions are executed.
     *         </p>
     * @see EvaluationMethod
     */
    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     *
     * @param evaluationMethod <p>
     *            Information about the order in which events are evaluated and
     *            how actions are executed.
     *            </p>
     * @see EvaluationMethod
     */
    public void setEvaluationMethod(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     *
     * @param evaluationMethod <p>
     *            Information about the order in which events are evaluated and
     *            how actions are executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationMethod
     */
    public DetectorModelVersionSummary withEvaluationMethod(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
        return this;
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     *
     * @param evaluationMethod <p>
     *            Information about the order in which events are evaluated and
     *            how actions are executed.
     *            </p>
     * @see EvaluationMethod
     */
    public void setEvaluationMethod(EvaluationMethod evaluationMethod) {
        this.evaluationMethod = evaluationMethod.toString();
    }

    /**
     * <p>
     * Information about the order in which events are evaluated and how actions
     * are executed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BATCH, SERIAL
     *
     * @param evaluationMethod <p>
     *            Information about the order in which events are evaluated and
     *            how actions are executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EvaluationMethod
     */
    public DetectorModelVersionSummary withEvaluationMethod(EvaluationMethod evaluationMethod) {
        this.evaluationMethod = evaluationMethod.toString();
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
        if (getDetectorModelName() != null)
            sb.append("detectorModelName: " + getDetectorModelName() + ",");
        if (getDetectorModelVersion() != null)
            sb.append("detectorModelVersion: " + getDetectorModelVersion() + ",");
        if (getDetectorModelArn() != null)
            sb.append("detectorModelArn: " + getDetectorModelArn() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getCreationTime() != null)
            sb.append("creationTime: " + getCreationTime() + ",");
        if (getLastUpdateTime() != null)
            sb.append("lastUpdateTime: " + getLastUpdateTime() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getEvaluationMethod() != null)
            sb.append("evaluationMethod: " + getEvaluationMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDetectorModelName() == null) ? 0 : getDetectorModelName().hashCode());
        hashCode = prime * hashCode
                + ((getDetectorModelVersion() == null) ? 0 : getDetectorModelVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDetectorModelArn() == null) ? 0 : getDetectorModelArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationMethod() == null) ? 0 : getEvaluationMethod().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectorModelVersionSummary == false)
            return false;
        DetectorModelVersionSummary other = (DetectorModelVersionSummary) obj;

        if (other.getDetectorModelName() == null ^ this.getDetectorModelName() == null)
            return false;
        if (other.getDetectorModelName() != null
                && other.getDetectorModelName().equals(this.getDetectorModelName()) == false)
            return false;
        if (other.getDetectorModelVersion() == null ^ this.getDetectorModelVersion() == null)
            return false;
        if (other.getDetectorModelVersion() != null
                && other.getDetectorModelVersion().equals(this.getDetectorModelVersion()) == false)
            return false;
        if (other.getDetectorModelArn() == null ^ this.getDetectorModelArn() == null)
            return false;
        if (other.getDetectorModelArn() != null
                && other.getDetectorModelArn().equals(this.getDetectorModelArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null
                && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEvaluationMethod() == null ^ this.getEvaluationMethod() == null)
            return false;
        if (other.getEvaluationMethod() != null
                && other.getEvaluationMethod().equals(this.getEvaluationMethod()) == false)
            return false;
        return true;
    }
}
