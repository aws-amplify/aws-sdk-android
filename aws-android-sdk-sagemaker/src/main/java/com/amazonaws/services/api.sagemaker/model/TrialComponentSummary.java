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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of the properties of a trial component. To get all the properties,
 * call the <a>DescribeTrialComponent</a> API and provide the
 * <code>TrialComponentName</code>.
 * </p>
 */
public class TrialComponentSummary implements Serializable {
    /**
     * <p>
     * The name of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trialComponentName;

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment
     * -trial-component/.*<br/>
     */
    private String trialComponentArn;

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialComponentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String displayName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) and job type of the source of a trial
     * component.
     * </p>
     */
    private TrialComponentSource trialComponentSource;

    /**
     * <p>
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     */
    private TrialComponentStatus status;

    /**
     * <p>
     * When the component started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * When the component ended.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * When the component was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Who created the component.
     * </p>
     */
    private UserContext createdBy;

    /**
     * <p>
     * When the component was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Who last modified the component.
     * </p>
     */
    private UserContext lastModifiedBy;

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the trial component.
     *         </p>
     */
    public String getTrialComponentName() {
        return trialComponentName;
    }

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialComponentName <p>
     *            The name of the trial component.
     *            </p>
     */
    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialComponentName <p>
     *            The name of the trial component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSummary withTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
        return this;
    }

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment
     * -trial-component/.*<br/>
     *
     * @return <p>
     *         The ARN of the trial component.
     *         </p>
     */
    public String getTrialComponentArn() {
        return trialComponentArn;
    }

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment
     * -trial-component/.*<br/>
     *
     * @param trialComponentArn <p>
     *            The ARN of the trial component.
     *            </p>
     */
    public void setTrialComponentArn(String trialComponentArn) {
        this.trialComponentArn = trialComponentArn;
    }

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment
     * -trial-component/.*<br/>
     *
     * @param trialComponentArn <p>
     *            The ARN of the trial component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSummary withTrialComponentArn(String trialComponentArn) {
        this.trialComponentArn = trialComponentArn;
        return this;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialComponentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the component as displayed. If
     *         <code>DisplayName</code> isn't specified,
     *         <code>TrialComponentName</code> is displayed.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialComponentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param displayName <p>
     *            The name of the component as displayed. If
     *            <code>DisplayName</code> isn't specified,
     *            <code>TrialComponentName</code> is displayed.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialComponentName</code> is displayed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param displayName <p>
     *            The name of the component as displayed. If
     *            <code>DisplayName</code> isn't specified,
     *            <code>TrialComponentName</code> is displayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSummary withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and job type of the source of a trial
     * component.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) and job type of the source of a
     *         trial component.
     *         </p>
     */
    public TrialComponentSource getTrialComponentSource() {
        return trialComponentSource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and job type of the source of a trial
     * component.
     * </p>
     *
     * @param trialComponentSource <p>
     *            The Amazon Resource Name (ARN) and job type of the source of a
     *            trial component.
     *            </p>
     */
    public void setTrialComponentSource(TrialComponentSource trialComponentSource) {
        this.trialComponentSource = trialComponentSource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and job type of the source of a trial
     * component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trialComponentSource <p>
     *            The Amazon Resource Name (ARN) and job type of the source of a
     *            trial component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSummary withTrialComponentSource(TrialComponentSource trialComponentSource) {
        this.trialComponentSource = trialComponentSource;
        return this;
    }

    /**
     * <p>
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The status of the component. States include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         InProgress
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Completed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed
     *         </p>
     *         </li>
     *         </ul>
     */
    public TrialComponentStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            The status of the component. States include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            InProgress
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Completed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(TrialComponentStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the component. States include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            InProgress
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Completed
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Failed
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSummary withStatus(TrialComponentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     *
     * @return <p>
     *         When the component started.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     *
     * @param startTime <p>
     *            When the component started.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            When the component started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSummary withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     *
     * @return <p>
     *         When the component ended.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     *
     * @param endTime <p>
     *            When the component ended.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            When the component ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSummary withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     *
     * @return <p>
     *         When the component was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     *
     * @param creationTime <p>
     *            When the component was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            When the component was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Who created the component.
     * </p>
     *
     * @return <p>
     *         Who created the component.
     *         </p>
     */
    public UserContext getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * Who created the component.
     * </p>
     *
     * @param createdBy <p>
     *            Who created the component.
     *            </p>
     */
    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Who created the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            Who created the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSummary withCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     *
     * @return <p>
     *         When the component was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            When the component was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            When the component was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * Who last modified the component.
     * </p>
     *
     * @return <p>
     *         Who last modified the component.
     *         </p>
     */
    public UserContext getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the component.
     * </p>
     *
     * @param lastModifiedBy <p>
     *            Who last modified the component.
     *            </p>
     */
    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedBy <p>
     *            Who last modified the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSummary withLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
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
        if (getTrialComponentName() != null)
            sb.append("TrialComponentName: " + getTrialComponentName() + ",");
        if (getTrialComponentArn() != null)
            sb.append("TrialComponentArn: " + getTrialComponentArn() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getTrialComponentSource() != null)
            sb.append("TrialComponentSource: " + getTrialComponentSource() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: " + getLastModifiedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrialComponentName() == null) ? 0 : getTrialComponentName().hashCode());
        hashCode = prime * hashCode
                + ((getTrialComponentArn() == null) ? 0 : getTrialComponentArn().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getTrialComponentSource() == null) ? 0 : getTrialComponentSource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentSummary == false)
            return false;
        TrialComponentSummary other = (TrialComponentSummary) obj;

        if (other.getTrialComponentName() == null ^ this.getTrialComponentName() == null)
            return false;
        if (other.getTrialComponentName() != null
                && other.getTrialComponentName().equals(this.getTrialComponentName()) == false)
            return false;
        if (other.getTrialComponentArn() == null ^ this.getTrialComponentArn() == null)
            return false;
        if (other.getTrialComponentArn() != null
                && other.getTrialComponentArn().equals(this.getTrialComponentArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getTrialComponentSource() == null ^ this.getTrialComponentSource() == null)
            return false;
        if (other.getTrialComponentSource() != null
                && other.getTrialComponentSource().equals(this.getTrialComponentSource()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null
                && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null
                && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        return true;
    }
}
