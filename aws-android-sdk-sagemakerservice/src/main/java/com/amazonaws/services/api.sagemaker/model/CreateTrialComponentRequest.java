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
 * Creates a <i>trial component</i>, which is a stage of a machine learning
 * <i>trial</i>. A trial is composed of one or more trial components. A trial
 * component can be used in multiple trials.
 * </p>
 * <p>
 * Trial components include pre-processing jobs, training jobs, and batch
 * transform jobs.
 * </p>
 * <p>
 * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all
 * experiments, trials, and trial components are automatically tracked, logged,
 * and indexed. When you use the AWS SDK for Python (Boto), you must use the
 * logging APIs provided by the SDK.
 * </p>
 * <p>
 * You can add tags to a trial component and then use the <a>Search</a> API to
 * search for the tags.
 * </p>
 * <note>
 * <p>
 * <code>CreateTrialComponent</code> can only be invoked from within an Amazon
 * SageMaker managed environment. This includes Amazon SageMaker training jobs,
 * processing jobs, transform jobs, and Amazon SageMaker notebooks. A call to
 * <code>CreateTrialComponent</code> from outside one of these environments
 * results in an error.
 * </p>
 * </note>
 */
public class CreateTrialComponentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the component. The name must be unique in your AWS account
     * and is not case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trialComponentName;

    /**
     * <p>
     * The name of the component as displayed. The name doesn't need to be
     * unique. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String displayName;

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
     * The hyperparameters for the component.
     * </p>
     */
    private java.util.Map<String, TrialComponentParameterValue> parameters;

    /**
     * <p>
     * The input artifacts for the component. Examples of input artifacts are
     * datasets, algorithms, hyperparameters, source code, and instance types.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> inputArtifacts;

    /**
     * <p>
     * The output artifacts for the component. Examples of output artifacts are
     * metrics, snapshots, logs, and images.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> outputArtifacts;

    /**
     * <p>
     * A list of tags to associate with the component. You can use <a>Search</a>
     * API to search on the tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the component. The name must be unique in your AWS account
     * and is not case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the component. The name must be unique in your AWS
     *         account and is not case-sensitive.
     *         </p>
     */
    public String getTrialComponentName() {
        return trialComponentName;
    }

    /**
     * <p>
     * The name of the component. The name must be unique in your AWS account
     * and is not case-sensitive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialComponentName <p>
     *            The name of the component. The name must be unique in your AWS
     *            account and is not case-sensitive.
     *            </p>
     */
    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the component. The name must be unique in your AWS account
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
     * @param trialComponentName <p>
     *            The name of the component. The name must be unique in your AWS
     *            account and is not case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialComponentRequest withTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
        return this;
    }

    /**
     * <p>
     * The name of the component as displayed. The name doesn't need to be
     * unique. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the component as displayed. The name doesn't need to
     *         be unique. If <code>DisplayName</code> isn't specified,
     *         <code>TrialComponentName</code> is displayed.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. The name doesn't need to be
     * unique. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param displayName <p>
     *            The name of the component as displayed. The name doesn't need
     *            to be unique. If <code>DisplayName</code> isn't specified,
     *            <code>TrialComponentName</code> is displayed.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. The name doesn't need to be
     * unique. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
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
     *            The name of the component as displayed. The name doesn't need
     *            to be unique. If <code>DisplayName</code> isn't specified,
     *            <code>TrialComponentName</code> is displayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialComponentRequest withDisplayName(String displayName) {
        this.displayName = displayName;
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
    public CreateTrialComponentRequest withStatus(TrialComponentStatus status) {
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
    public CreateTrialComponentRequest withStartTime(java.util.Date startTime) {
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
    public CreateTrialComponentRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The hyperparameters for the component.
     * </p>
     *
     * @return <p>
     *         The hyperparameters for the component.
     *         </p>
     */
    public java.util.Map<String, TrialComponentParameterValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The hyperparameters for the component.
     * </p>
     *
     * @param parameters <p>
     *            The hyperparameters for the component.
     *            </p>
     */
    public void setParameters(java.util.Map<String, TrialComponentParameterValue> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The hyperparameters for the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The hyperparameters for the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialComponentRequest withParameters(
            java.util.Map<String, TrialComponentParameterValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * The hyperparameters for the component.
     * </p>
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into
     *            Parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialComponentRequest addParametersEntry(String key,
            TrialComponentParameterValue value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, TrialComponentParameterValue>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateTrialComponentRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The input artifacts for the component. Examples of input artifacts are
     * datasets, algorithms, hyperparameters, source code, and instance types.
     * </p>
     *
     * @return <p>
     *         The input artifacts for the component. Examples of input
     *         artifacts are datasets, algorithms, hyperparameters, source code,
     *         and instance types.
     *         </p>
     */
    public java.util.Map<String, TrialComponentArtifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * The input artifacts for the component. Examples of input artifacts are
     * datasets, algorithms, hyperparameters, source code, and instance types.
     * </p>
     *
     * @param inputArtifacts <p>
     *            The input artifacts for the component. Examples of input
     *            artifacts are datasets, algorithms, hyperparameters, source
     *            code, and instance types.
     *            </p>
     */
    public void setInputArtifacts(java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
    }

    /**
     * <p>
     * The input artifacts for the component. Examples of input artifacts are
     * datasets, algorithms, hyperparameters, source code, and instance types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputArtifacts <p>
     *            The input artifacts for the component. Examples of input
     *            artifacts are datasets, algorithms, hyperparameters, source
     *            code, and instance types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialComponentRequest withInputArtifacts(
            java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
        return this;
    }

    /**
     * <p>
     * The input artifacts for the component. Examples of input artifacts are
     * datasets, algorithms, hyperparameters, source code, and instance types.
     * </p>
     * <p>
     * The method adds a new key-value pair into InputArtifacts parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into InputArtifacts.
     * @param value The corresponding value of the entry to be added into
     *            InputArtifacts.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialComponentRequest addInputArtifactsEntry(String key,
            TrialComponentArtifact value) {
        if (null == this.inputArtifacts) {
            this.inputArtifacts = new java.util.HashMap<String, TrialComponentArtifact>();
        }
        if (this.inputArtifacts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.inputArtifacts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InputArtifacts.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateTrialComponentRequest clearInputArtifactsEntries() {
        this.inputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The output artifacts for the component. Examples of output artifacts are
     * metrics, snapshots, logs, and images.
     * </p>
     *
     * @return <p>
     *         The output artifacts for the component. Examples of output
     *         artifacts are metrics, snapshots, logs, and images.
     *         </p>
     */
    public java.util.Map<String, TrialComponentArtifact> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * The output artifacts for the component. Examples of output artifacts are
     * metrics, snapshots, logs, and images.
     * </p>
     *
     * @param outputArtifacts <p>
     *            The output artifacts for the component. Examples of output
     *            artifacts are metrics, snapshots, logs, and images.
     *            </p>
     */
    public void setOutputArtifacts(java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
    }

    /**
     * <p>
     * The output artifacts for the component. Examples of output artifacts are
     * metrics, snapshots, logs, and images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputArtifacts <p>
     *            The output artifacts for the component. Examples of output
     *            artifacts are metrics, snapshots, logs, and images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialComponentRequest withOutputArtifacts(
            java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
        return this;
    }

    /**
     * <p>
     * The output artifacts for the component. Examples of output artifacts are
     * metrics, snapshots, logs, and images.
     * </p>
     * <p>
     * The method adds a new key-value pair into OutputArtifacts parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into OutputArtifacts.
     * @param value The corresponding value of the entry to be added into
     *            OutputArtifacts.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialComponentRequest addOutputArtifactsEntry(String key,
            TrialComponentArtifact value) {
        if (null == this.outputArtifacts) {
            this.outputArtifacts = new java.util.HashMap<String, TrialComponentArtifact>();
        }
        if (this.outputArtifacts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.outputArtifacts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OutputArtifacts.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateTrialComponentRequest clearOutputArtifactsEntries() {
        this.outputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the component. You can use <a>Search</a>
     * API to search on the tags.
     * </p>
     *
     * @return <p>
     *         A list of tags to associate with the component. You can use
     *         <a>Search</a> API to search on the tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the component. You can use <a>Search</a>
     * API to search on the tags.
     * </p>
     *
     * @param tags <p>
     *            A list of tags to associate with the component. You can use
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
     * A list of tags to associate with the component. You can use <a>Search</a>
     * API to search on the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with the component. You can use
     *            <a>Search</a> API to search on the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialComponentRequest withTags(Tag... tags) {
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
     * A list of tags to associate with the component. You can use <a>Search</a>
     * API to search on the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with the component. You can use
     *            <a>Search</a> API to search on the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTrialComponentRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getTrialComponentName() != null)
            sb.append("TrialComponentName: " + getTrialComponentName() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: " + getInputArtifacts() + ",");
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: " + getOutputArtifacts() + ",");
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
                + ((getTrialComponentName() == null) ? 0 : getTrialComponentName().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        hashCode = prime * hashCode
                + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrialComponentRequest == false)
            return false;
        CreateTrialComponentRequest other = (CreateTrialComponentRequest) obj;

        if (other.getTrialComponentName() == null ^ this.getTrialComponentName() == null)
            return false;
        if (other.getTrialComponentName() != null
                && other.getTrialComponentName().equals(this.getTrialComponentName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
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
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getInputArtifacts() == null ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null
                && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        if (other.getOutputArtifacts() == null ^ this.getOutputArtifacts() == null)
            return false;
        if (other.getOutputArtifacts() != null
                && other.getOutputArtifacts().equals(this.getOutputArtifacts()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
