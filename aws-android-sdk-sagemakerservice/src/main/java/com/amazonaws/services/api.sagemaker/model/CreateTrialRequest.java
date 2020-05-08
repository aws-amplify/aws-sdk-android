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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an Amazon SageMaker <i>trial</i>. A trial is a set of steps called
 * <i>trial components</i> that produce a machine learning model. A trial is
 * part of a single Amazon SageMaker <i>experiment</i>.
 * </p>
 * <p>
 * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all
 * experiments, trials, and trial components are automatically tracked, logged,
 * and indexed. When you use the AWS SDK for Python (Boto), you must use the
 * logging APIs provided by the SDK.
 * </p>
 * <p>
 * You can add tags to a trial and then use the <a>Search</a> API to search for
 * the tags.
 * </p>
 * <p>
 * To get a list of all your trials, call the <a>ListTrials</a> API. To view a
 * trial's properties, call the <a>DescribeTrial</a> API. To create a trial
 * component, call the <a>CreateTrialComponent</a> API.
 * </p>
 */
public class CreateTrialRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the trial. The name must be unique in your AWS account and is
     * not case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trialName;

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique.
     * If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String displayName;

    /**
     * <p>
     * The name of the experiment to associate the trial with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String experimentName;

    /**
     * <p>
     * A list of tags to associate with the trial. You can use <a>Search</a> API
     * to search on the tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the trial. The name must be unique in your AWS account and is
     * not case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the trial. The name must be unique in your AWS
     *         account and is not case-sensitive.
     *         </p>
     */
    public String getTrialName() {
        return trialName;
    }

    /**
     * <p>
     * The name of the trial. The name must be unique in your AWS account and is
     * not case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialName <p>
     *            The name of the trial. The name must be unique in your AWS
     *            account and is not case-sensitive.
     *            </p>
     */
    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of the trial. The name must be unique in your AWS account and is
     * not case-sensitive.
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
     *            The name of the trial. The name must be unique in your AWS
     *            account and is not case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialRequest withTrialName(String trialName) {
        this.trialName = trialName;
        return this;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique.
     * If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the trial as displayed. The name doesn't need to be
     *         unique. If <code>DisplayName</code> isn't specified,
     *         <code>TrialName</code> is displayed.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique.
     * If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param displayName <p>
     *            The name of the trial as displayed. The name doesn't need to
     *            be unique. If <code>DisplayName</code> isn't specified,
     *            <code>TrialName</code> is displayed.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique.
     * If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
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
     *            The name of the trial as displayed. The name doesn't need to
     *            be unique. If <code>DisplayName</code> isn't specified,
     *            <code>TrialName</code> is displayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The name of the experiment to associate the trial with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the experiment to associate the trial with.
     *         </p>
     */
    public String getExperimentName() {
        return experimentName;
    }

    /**
     * <p>
     * The name of the experiment to associate the trial with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param experimentName <p>
     *            The name of the experiment to associate the trial with.
     *            </p>
     */
    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment to associate the trial with.
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
     *            The name of the experiment to associate the trial with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialRequest withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the trial. You can use <a>Search</a> API
     * to search on the tags.
     * </p>
     *
     * @return <p>
     *         A list of tags to associate with the trial. You can use
     *         <a>Search</a> API to search on the tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the trial. You can use <a>Search</a> API
     * to search on the tags.
     * </p>
     *
     * @param tags <p>
     *            A list of tags to associate with the trial. You can use
     *            <a>Search</a> API to search on the tags.
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
     * A list of tags to associate with the trial. You can use <a>Search</a> API
     * to search on the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with the trial. You can use
     *            <a>Search</a> API to search on the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialRequest withTags(Tag... tags) {
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
     * A list of tags to associate with the trial. You can use <a>Search</a> API
     * to search on the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with the trial. You can use
     *            <a>Search</a> API to search on the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getExperimentName() != null)
            sb.append("ExperimentName: " + getExperimentName() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrialRequest == false)
            return false;
        CreateTrialRequest other = (CreateTrialRequest) obj;

        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null
                && other.getTrialName().equals(this.getTrialName()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
