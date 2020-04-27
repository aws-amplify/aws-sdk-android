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

public class DescribeTrialComponentResult implements Serializable {
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
     * The Amazon Resource Name (ARN) of the source and, optionally, the job
     * type.
     * </p>
     */
    private TrialComponentSource source;

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
     * The hyperparameters of the component.
     * </p>
     */
    private java.util.Map<String, TrialComponentParameterValue> parameters;

    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> inputArtifacts;

    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> outputArtifacts;

    /**
     * <p>
     * The metrics for the component.
     * </p>
     */
    private java.util.List<TrialComponentMetricSummary> metrics;

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
    public DescribeTrialComponentResult withTrialComponentName(String trialComponentName) {
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
    public DescribeTrialComponentResult withTrialComponentArn(String trialComponentArn) {
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
    public DescribeTrialComponentResult withDisplayName(String displayName) {
        this.displayName = displayName;
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
    public TrialComponentSource getSource() {
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
    public void setSource(TrialComponentSource source) {
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
    public DescribeTrialComponentResult withSource(TrialComponentSource source) {
        this.source = source;
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
    public DescribeTrialComponentResult withStatus(TrialComponentStatus status) {
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
    public DescribeTrialComponentResult withStartTime(java.util.Date startTime) {
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
    public DescribeTrialComponentResult withEndTime(java.util.Date endTime) {
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
    public DescribeTrialComponentResult withCreationTime(java.util.Date creationTime) {
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
    public DescribeTrialComponentResult withCreatedBy(UserContext createdBy) {
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
    public DescribeTrialComponentResult withLastModifiedTime(java.util.Date lastModifiedTime) {
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
    public DescribeTrialComponentResult withLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * <p>
     * The hyperparameters of the component.
     * </p>
     *
     * @return <p>
     *         The hyperparameters of the component.
     *         </p>
     */
    public java.util.Map<String, TrialComponentParameterValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The hyperparameters of the component.
     * </p>
     *
     * @param parameters <p>
     *            The hyperparameters of the component.
     *            </p>
     */
    public void setParameters(java.util.Map<String, TrialComponentParameterValue> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The hyperparameters of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The hyperparameters of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialComponentResult withParameters(
            java.util.Map<String, TrialComponentParameterValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * The hyperparameters of the component.
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
    public DescribeTrialComponentResult addParametersEntry(String key,
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
    public DescribeTrialComponentResult clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     *
     * @return <p>
     *         The input artifacts of the component.
     *         </p>
     */
    public java.util.Map<String, TrialComponentArtifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     *
     * @param inputArtifacts <p>
     *            The input artifacts of the component.
     *            </p>
     */
    public void setInputArtifacts(java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
    }

    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputArtifacts <p>
     *            The input artifacts of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialComponentResult withInputArtifacts(
            java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
        return this;
    }

    /**
     * <p>
     * The input artifacts of the component.
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
    public DescribeTrialComponentResult addInputArtifactsEntry(String key,
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
    public DescribeTrialComponentResult clearInputArtifactsEntries() {
        this.inputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     *
     * @return <p>
     *         The output artifacts of the component.
     *         </p>
     */
    public java.util.Map<String, TrialComponentArtifact> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     *
     * @param outputArtifacts <p>
     *            The output artifacts of the component.
     *            </p>
     */
    public void setOutputArtifacts(java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
    }

    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputArtifacts <p>
     *            The output artifacts of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialComponentResult withOutputArtifacts(
            java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
        return this;
    }

    /**
     * <p>
     * The output artifacts of the component.
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
    public DescribeTrialComponentResult addOutputArtifactsEntry(String key,
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
    public DescribeTrialComponentResult clearOutputArtifactsEntries() {
        this.outputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     *
     * @return <p>
     *         The metrics for the component.
     *         </p>
     */
    public java.util.List<TrialComponentMetricSummary> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     *
     * @param metrics <p>
     *            The metrics for the component.
     *            </p>
     */
    public void setMetrics(java.util.Collection<TrialComponentMetricSummary> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<TrialComponentMetricSummary>(metrics);
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            The metrics for the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialComponentResult withMetrics(TrialComponentMetricSummary... metrics) {
        if (getMetrics() == null) {
            this.metrics = new java.util.ArrayList<TrialComponentMetricSummary>(metrics.length);
        }
        for (TrialComponentMetricSummary value : metrics) {
            this.metrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            The metrics for the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrialComponentResult withMetrics(
            java.util.Collection<TrialComponentMetricSummary> metrics) {
        setMetrics(metrics);
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
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
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
            sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: " + getInputArtifacts() + ",");
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: " + getOutputArtifacts() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics());
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
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
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
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        hashCode = prime * hashCode
                + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrialComponentResult == false)
            return false;
        DescribeTrialComponentResult other = (DescribeTrialComponentResult) obj;

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
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
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
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }
}
