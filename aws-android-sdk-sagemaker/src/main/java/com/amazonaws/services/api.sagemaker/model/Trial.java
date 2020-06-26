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
 * The properties of a trial as returned by the <a>Search</a> API.
 * </p>
 */
public class Trial implements Serializable {
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
     * The source of the trial.
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
     * Information about the user who created or modified an experiment, trial,
     * or trial component.
     * </p>
     */
    private UserContext createdBy;

    /**
     * <p>
     * Who last modified the trial.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial,
     * or trial component.
     * </p>
     */
    private UserContext lastModifiedBy;

    /**
     * <p>
     * The list of tags that are associated with the trial. You can use
     * <a>Search</a> API to search on the tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A list of the components associated with the trial. For each component, a
     * summary of the component's properties is included.
     * </p>
     */
    private java.util.List<TrialComponentSimpleSummary> trialComponentSummaries;

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
    public Trial withTrialName(String trialName) {
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
    public Trial withTrialArn(String trialArn) {
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
    public Trial withDisplayName(String displayName) {
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
    public Trial withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * <p>
     * The source of the trial.
     * </p>
     *
     * @return <p>
     *         The source of the trial.
     *         </p>
     */
    public TrialSource getSource() {
        return source;
    }

    /**
     * <p>
     * The source of the trial.
     * </p>
     *
     * @param source <p>
     *            The source of the trial.
     *            </p>
     */
    public void setSource(TrialSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            The source of the trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trial withSource(TrialSource source) {
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
    public Trial withCreationTime(java.util.Date creationTime) {
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
    public Trial withCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
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
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * Who last modified the trial.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            Who last modified the trial.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Who last modified the trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            Who last modified the trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trial withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
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
    public UserContext getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial,
     * or trial component.
     * </p>
     *
     * @param lastModifiedBy <p>
     *            Information about the user who created or modified an
     *            experiment, trial, or trial component.
     *            </p>
     */
    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
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
     * @param lastModifiedBy <p>
     *            Information about the user who created or modified an
     *            experiment, trial, or trial component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trial withLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * <p>
     * The list of tags that are associated with the trial. You can use
     * <a>Search</a> API to search on the tags.
     * </p>
     *
     * @return <p>
     *         The list of tags that are associated with the trial. You can use
     *         <a>Search</a> API to search on the tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags that are associated with the trial. You can use
     * <a>Search</a> API to search on the tags.
     * </p>
     *
     * @param tags <p>
     *            The list of tags that are associated with the trial. You can
     *            use <a>Search</a> API to search on the tags.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags that are associated with the trial. You can use
     * <a>Search</a> API to search on the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags that are associated with the trial. You can
     *            use <a>Search</a> API to search on the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trial withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags that are associated with the trial. You can use
     * <a>Search</a> API to search on the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags that are associated with the trial. You can
     *            use <a>Search</a> API to search on the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trial withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of the components associated with the trial. For each component, a
     * summary of the component's properties is included.
     * </p>
     *
     * @return <p>
     *         A list of the components associated with the trial. For each
     *         component, a summary of the component's properties is included.
     *         </p>
     */
    public java.util.List<TrialComponentSimpleSummary> getTrialComponentSummaries() {
        return trialComponentSummaries;
    }

    /**
     * <p>
     * A list of the components associated with the trial. For each component, a
     * summary of the component's properties is included.
     * </p>
     *
     * @param trialComponentSummaries <p>
     *            A list of the components associated with the trial. For each
     *            component, a summary of the component's properties is
     *            included.
     *            </p>
     */
    public void setTrialComponentSummaries(
            java.util.Collection<TrialComponentSimpleSummary> trialComponentSummaries) {
        if (trialComponentSummaries == null) {
            this.trialComponentSummaries = null;
            return;
        }

        this.trialComponentSummaries = new java.util.ArrayList<TrialComponentSimpleSummary>(
                trialComponentSummaries);
    }

    /**
     * <p>
     * A list of the components associated with the trial. For each component, a
     * summary of the component's properties is included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trialComponentSummaries <p>
     *            A list of the components associated with the trial. For each
     *            component, a summary of the component's properties is
     *            included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trial withTrialComponentSummaries(TrialComponentSimpleSummary... trialComponentSummaries) {
        if (getTrialComponentSummaries() == null) {
            this.trialComponentSummaries = new java.util.ArrayList<TrialComponentSimpleSummary>(
                    trialComponentSummaries.length);
        }
        for (TrialComponentSimpleSummary value : trialComponentSummaries) {
            this.trialComponentSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the components associated with the trial. For each component, a
     * summary of the component's properties is included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trialComponentSummaries <p>
     *            A list of the components associated with the trial. For each
     *            component, a summary of the component's properties is
     *            included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trial withTrialComponentSummaries(
            java.util.Collection<TrialComponentSimpleSummary> trialComponentSummaries) {
        setTrialComponentSummaries(trialComponentSummaries);
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
            sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getTrialComponentSummaries() != null)
            sb.append("TrialComponentSummaries: " + getTrialComponentSummaries());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrialComponentSummaries() == null) ? 0 : getTrialComponentSummaries()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Trial == false)
            return false;
        Trial other = (Trial) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTrialComponentSummaries() == null ^ this.getTrialComponentSummaries() == null)
            return false;
        if (other.getTrialComponentSummaries() != null
                && other.getTrialComponentSummaries().equals(this.getTrialComponentSummaries()) == false)
            return false;
        return true;
    }
}
