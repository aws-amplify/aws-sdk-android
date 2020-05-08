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

public class DescribeTrialResult implements Serializable {
    /**
     * <p>
     * The name of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trialName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     */
    private String trialArn;

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String displayName;

    /**
     * <p>
     * The name of the experiment the trial is part of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String experimentName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source and, optionally, the job
     * type.
     * </p>
     */
    private TrialSource source;

    /**
     * <p>
     * When the trial was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Who created the trial.
     * </p>
     */
    private UserContext createdBy;

    /**
     * <p>
     * When the trial was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Who last modified the trial.
     * </p>
     */
    private UserContext lastModifiedBy;

    /**
     * <p>
     * The name of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the trial.
     *         </p>
     */
    public String getTrialName() {
        return trialName;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialName <p>
     *            The name of the trial.
     *            </p>
     */
    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialName <p>
     *            The name of the trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialResult withTrialName(String trialName) {
        this.trialName = trialName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the trial.
     *         </p>
     */
    public String getTrialArn() {
        return trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @param trialArn <p>
     *            The Amazon Resource Name (ARN) of the trial.
     *            </p>
     */
    public void setTrialArn(String trialArn) {
        this.trialArn = trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @param trialArn <p>
     *            The Amazon Resource Name (ARN) of the trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialResult withTrialArn(String trialArn) {
        this.trialArn = trialArn;
        return this;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the trial as displayed. If <code>DisplayName</code>
     *         isn't specified, <code>TrialName</code> is displayed.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param displayName <p>
     *            The name of the trial as displayed. If
     *            <code>DisplayName</code> isn't specified,
     *            <code>TrialName</code> is displayed.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
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
     *            The name of the trial as displayed. If
     *            <code>DisplayName</code> isn't specified,
     *            <code>TrialName</code> is displayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialResult withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The name of the experiment the trial is part of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the experiment the trial is part of.
     *         </p>
     */
    public String getExperimentName() {
        return experimentName;
    }

    /**
     * <p>
     * The name of the experiment the trial is part of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param experimentName <p>
     *            The name of the experiment the trial is part of.
     *            </p>
     */
    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment the trial is part of.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param experimentName <p>
     *            The name of the experiment the trial is part of.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialResult withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source and, optionally, the job
     * type.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the source and, optionally, the
     *         job type.
     *         </p>
     */
    public TrialSource getSource() {
        return source;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source and, optionally, the job
     * type.
     * </p>
     *
     * @param source <p>
     *            The Amazon Resource Name (ARN) of the source and, optionally,
     *            the job type.
     *            </p>
     */
    public void setSource(TrialSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source and, optionally, the job
     * type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            The Amazon Resource Name (ARN) of the source and, optionally,
     *            the job type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialResult withSource(TrialSource source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     *
     * @return <p>
     *         When the trial was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     *
     * @param creationTime <p>
     *            When the trial was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            When the trial was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Who created the trial.
     * </p>
     *
     * @return <p>
     *         Who created the trial.
     *         </p>
     */
    public UserContext getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * Who created the trial.
     * </p>
     *
     * @param createdBy <p>
     *            Who created the trial.
     *            </p>
     */
    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Who created the trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            Who created the trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialResult withCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>
     * When the trial was last modified.
     * </p>
     *
     * @return <p>
     *         When the trial was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * When the trial was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            When the trial was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the trial was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            When the trial was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * Who last modified the trial.
     * </p>
     *
     * @return <p>
     *         Who last modified the trial.
     *         </p>
     */
    public UserContext getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the trial.
     * </p>
     *
     * @param lastModifiedBy <p>
     *            Who last modified the trial.
     *            </p>
     */
    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedBy <p>
     *            Who last modified the trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialResult withLastModifiedBy(UserContext lastModifiedBy) {
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
        if (getTrialName() != null)
            sb.append("TrialName: " + getTrialName() + ",");
        if (getTrialArn() != null)
            sb.append("TrialArn: " + getTrialArn() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getExperimentName() != null)
            sb.append("ExperimentName: " + getExperimentName() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
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

        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode + ((getTrialArn() == null) ? 0 : getTrialArn().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
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

        if (obj instanceof DescribeTrialResult == false)
            return false;
        DescribeTrialResult other = (DescribeTrialResult) obj;

        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null
                && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        if (other.getTrialArn() == null ^ this.getTrialArn() == null)
            return false;
        if (other.getTrialArn() != null && other.getTrialArn().equals(this.getTrialArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null
                && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
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
