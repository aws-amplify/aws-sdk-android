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
 * A short summary of a trial component.
 * </p>
 */
public class TrialComponentSimpleSummary implements Serializable {
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
     * The Amazon Resource Name (ARN) of the trial component.
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
     * The Amazon Resource Name (ARN) and job type of the source of a trial
     * component.
     * </p>
     */
    private TrialComponentSource trialComponentSource;

    /**
     * <p>
     * When the component was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial,
     * or trial component.
     * </p>
     */
    private UserContext createdBy;

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
    public TrialComponentSimpleSummary withTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment
     * -trial-component/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the trial component.
     *         </p>
     */
    public String getTrialComponentArn() {
        return trialComponentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment
     * -trial-component/.*<br/>
     *
     * @param trialComponentArn <p>
     *            The Amazon Resource Name (ARN) of the trial component.
     *            </p>
     */
    public void setTrialComponentArn(String trialComponentArn) {
        this.trialComponentArn = trialComponentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
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
     *            The Amazon Resource Name (ARN) of the trial component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSimpleSummary withTrialComponentArn(String trialComponentArn) {
        this.trialComponentArn = trialComponentArn;
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
    public TrialComponentSimpleSummary withTrialComponentSource(
            TrialComponentSource trialComponentSource) {
        this.trialComponentSource = trialComponentSource;
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
    public TrialComponentSimpleSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial,
     * or trial component.
     * </p>
     *
     * @return <p>
     *         Information about the user who created or modified an experiment,
     *         trial, or trial component.
     *         </p>
     */
    public UserContext getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial,
     * or trial component.
     * </p>
     *
     * @param createdBy <p>
     *            Information about the user who created or modified an
     *            experiment, trial, or trial component.
     *            </p>
     */
    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial,
     * or trial component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            Information about the user who created or modified an
     *            experiment, trial, or trial component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentSimpleSummary withCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
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
        if (getTrialComponentSource() != null)
            sb.append("TrialComponentSource: " + getTrialComponentSource() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy());
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
                + ((getTrialComponentSource() == null) ? 0 : getTrialComponentSource().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentSimpleSummary == false)
            return false;
        TrialComponentSimpleSummary other = (TrialComponentSimpleSummary) obj;

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
        if (other.getTrialComponentSource() == null ^ this.getTrialComponentSource() == null)
            return false;
        if (other.getTrialComponentSource() != null
                && other.getTrialComponentSource().equals(this.getTrialComponentSource()) == false)
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
        return true;
    }
}
