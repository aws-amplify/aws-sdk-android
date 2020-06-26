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
 * Creates an Amazon SageMaker <i>experiment</i>. An experiment is a collection
 * of <i>trials</i> that are observed, compared and evaluated as a group. A
 * trial is a set of steps, called <i>trial components</i>, that produce a
 * machine learning model.
 * </p>
 * <p>
 * The goal of an experiment is to determine the components that produce the
 * best model. Multiple trials are performed, each one isolating and measuring
 * the impact of a change to one or more inputs, while keeping the remaining
 * inputs constant.
 * </p>
 * <p>
 * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all
 * experiments, trials, and trial components are automatically tracked, logged,
 * and indexed. When you use the AWS SDK for Python (Boto), you must use the
 * logging APIs provided by the SDK.
 * </p>
 * <p>
 * You can add tags to experiments, trials, trial components and then use the
 * <a>Search</a> API to search for the tags.
 * </p>
 * <p>
 * To add a description to an experiment, specify the optional
 * <code>Description</code> parameter. To add a description later, or to change
 * the description, call the <a>UpdateExperiment</a> API.
 * </p>
 * <p>
 * To get a list of all your experiments, call the <a>ListExperiments</a> API.
 * To view an experiment's properties, call the <a>DescribeExperiment</a> API.
 * To get a list of all the trials associated with an experiment, call the
 * <a>ListTrials</a> API. To create a trial call the <a>CreateTrial</a> API.
 * </p>
 */
public class CreateExperimentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the experiment. The name must be unique in your AWS account
     * and is not case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String experimentName;

    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be
     * unique. If you don't specify <code>DisplayName</code>, the value in
     * <code>ExperimentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String displayName;

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3072<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String description;

    /**
     * <p>
     * A list of tags to associate with the experiment. You can use
     * <a>Search</a> API to search on the tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the experiment. The name must be unique in your AWS account
     * and is not case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the experiment. The name must be unique in your AWS
     *         account and is not case-sensitive.
     *         </p>
     */
    public String getExperimentName() {
        return experimentName;
    }

    /**
     * <p>
     * The name of the experiment. The name must be unique in your AWS account
     * and is not case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param experimentName <p>
     *            The name of the experiment. The name must be unique in your
     *            AWS account and is not case-sensitive.
     *            </p>
     */
    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment. The name must be unique in your AWS account
     * and is not case-sensitive.
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
     *            The name of the experiment. The name must be unique in your
     *            AWS account and is not case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExperimentRequest withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be
     * unique. If you don't specify <code>DisplayName</code>, the value in
     * <code>ExperimentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the experiment as displayed. The name doesn't need to
     *         be unique. If you don't specify <code>DisplayName</code>, the
     *         value in <code>ExperimentName</code> is displayed.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be
     * unique. If you don't specify <code>DisplayName</code>, the value in
     * <code>ExperimentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param displayName <p>
     *            The name of the experiment as displayed. The name doesn't need
     *            to be unique. If you don't specify <code>DisplayName</code>,
     *            the value in <code>ExperimentName</code> is displayed.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be
     * unique. If you don't specify <code>DisplayName</code>, the value in
     * <code>ExperimentName</code> is displayed.
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
     *            The name of the experiment as displayed. The name doesn't need
     *            to be unique. If you don't specify <code>DisplayName</code>,
     *            the value in <code>ExperimentName</code> is displayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExperimentRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3072<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The description of the experiment.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3072<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param description <p>
     *            The description of the experiment.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3072<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param description <p>
     *            The description of the experiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExperimentRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the experiment. You can use
     * <a>Search</a> API to search on the tags.
     * </p>
     *
     * @return <p>
     *         A list of tags to associate with the experiment. You can use
     *         <a>Search</a> API to search on the tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the experiment. You can use
     * <a>Search</a> API to search on the tags.
     * </p>
     *
     * @param tags <p>
     *            A list of tags to associate with the experiment. You can use
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
     * A list of tags to associate with the experiment. You can use
     * <a>Search</a> API to search on the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with the experiment. You can use
     *            <a>Search</a> API to search on the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExperimentRequest withTags(Tag... tags) {
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
     * A list of tags to associate with the experiment. You can use
     * <a>Search</a> API to search on the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with the experiment. You can use
     *            <a>Search</a> API to search on the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExperimentRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getExperimentName() != null)
            sb.append("ExperimentName: " + getExperimentName() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExperimentRequest == false)
            return false;
        CreateExperimentRequest other = (CreateExperimentRequest) obj;

        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null
                && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
