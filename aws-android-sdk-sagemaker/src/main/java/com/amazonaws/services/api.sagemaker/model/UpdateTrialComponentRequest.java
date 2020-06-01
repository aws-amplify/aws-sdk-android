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
 * Updates one or more properties of a trial component.
 * </p>
 */
public class UpdateTrialComponentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the component to update.
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
     * The new status of the component.
     * </p>
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
     * Replaces all of the component's hyperparameters with the specified
     * hyperparameters.
     * </p>
     */
    private java.util.Map<String, TrialComponentParameterValue> parameters;

    /**
     * <p>
     * The hyperparameters to remove from the component.
     * </p>
     */
    private java.util.List<String> parametersToRemove;

    /**
     * <p>
     * Replaces all of the component's input artifacts with the specified
     * artifacts.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> inputArtifacts;

    /**
     * <p>
     * The input artifacts to remove from the component.
     * </p>
     */
    private java.util.List<String> inputArtifactsToRemove;

    /**
     * <p>
     * Replaces all of the component's output artifacts with the specified
     * artifacts.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> outputArtifacts;

    /**
     * <p>
     * The output artifacts to remove from the component.
     * </p>
     */
    private java.util.List<String> outputArtifactsToRemove;

    /**
     * <p>
     * The name of the component to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the component to update.
     *         </p>
     */
    public String getTrialComponentName() {
        return trialComponentName;
    }

    /**
     * <p>
     * The name of the component to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialComponentName <p>
     *            The name of the component to update.
     *            </p>
     */
    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the component to update.
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
     *            The name of the component to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialComponentRequest withTrialComponentName(String trialComponentName) {
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
    public UpdateTrialComponentRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The new status of the component.
     * </p>
     *
     * @return <p>
     *         The new status of the component.
     *         </p>
     */
    public TrialComponentStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The new status of the component.
     * </p>
     *
     * @param status <p>
     *            The new status of the component.
     *            </p>
     */
    public void setStatus(TrialComponentStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The new status of the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The new status of the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialComponentRequest withStatus(TrialComponentStatus status) {
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
    public UpdateTrialComponentRequest withStartTime(java.util.Date startTime) {
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
    public UpdateTrialComponentRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * Replaces all of the component's hyperparameters with the specified
     * hyperparameters.
     * </p>
     *
     * @return <p>
     *         Replaces all of the component's hyperparameters with the
     *         specified hyperparameters.
     *         </p>
     */
    public java.util.Map<String, TrialComponentParameterValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Replaces all of the component's hyperparameters with the specified
     * hyperparameters.
     * </p>
     *
     * @param parameters <p>
     *            Replaces all of the component's hyperparameters with the
     *            specified hyperparameters.
     *            </p>
     */
    public void setParameters(java.util.Map<String, TrialComponentParameterValue> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Replaces all of the component's hyperparameters with the specified
     * hyperparameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            Replaces all of the component's hyperparameters with the
     *            specified hyperparameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialComponentRequest withParameters(
            java.util.Map<String, TrialComponentParameterValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * Replaces all of the component's hyperparameters with the specified
     * hyperparameters.
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
    public UpdateTrialComponentRequest addParametersEntry(String key,
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
    public UpdateTrialComponentRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The hyperparameters to remove from the component.
     * </p>
     *
     * @return <p>
     *         The hyperparameters to remove from the component.
     *         </p>
     */
    public java.util.List<String> getParametersToRemove() {
        return parametersToRemove;
    }

    /**
     * <p>
     * The hyperparameters to remove from the component.
     * </p>
     *
     * @param parametersToRemove <p>
     *            The hyperparameters to remove from the component.
     *            </p>
     */
    public void setParametersToRemove(java.util.Collection<String> parametersToRemove) {
        if (parametersToRemove == null) {
            this.parametersToRemove = null;
            return;
        }

        this.parametersToRemove = new java.util.ArrayList<String>(parametersToRemove);
    }

    /**
     * <p>
     * The hyperparameters to remove from the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parametersToRemove <p>
     *            The hyperparameters to remove from the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialComponentRequest withParametersToRemove(String... parametersToRemove) {
        if (getParametersToRemove() == null) {
            this.parametersToRemove = new java.util.ArrayList<String>(parametersToRemove.length);
        }
        for (String value : parametersToRemove) {
            this.parametersToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The hyperparameters to remove from the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parametersToRemove <p>
     *            The hyperparameters to remove from the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialComponentRequest withParametersToRemove(
            java.util.Collection<String> parametersToRemove) {
        setParametersToRemove(parametersToRemove);
        return this;
    }

    /**
     * <p>
     * Replaces all of the component's input artifacts with the specified
     * artifacts.
     * </p>
     *
     * @return <p>
     *         Replaces all of the component's input artifacts with the
     *         specified artifacts.
     *         </p>
     */
    public java.util.Map<String, TrialComponentArtifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * Replaces all of the component's input artifacts with the specified
     * artifacts.
     * </p>
     *
     * @param inputArtifacts <p>
     *            Replaces all of the component's input artifacts with the
     *            specified artifacts.
     *            </p>
     */
    public void setInputArtifacts(java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
    }

    /**
     * <p>
     * Replaces all of the component's input artifacts with the specified
     * artifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputArtifacts <p>
     *            Replaces all of the component's input artifacts with the
     *            specified artifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialComponentRequest withInputArtifacts(
            java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
        return this;
    }

    /**
     * <p>
     * Replaces all of the component's input artifacts with the specified
     * artifacts.
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
    public UpdateTrialComponentRequest addInputArtifactsEntry(String key,
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
    public UpdateTrialComponentRequest clearInputArtifactsEntries() {
        this.inputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The input artifacts to remove from the component.
     * </p>
     *
     * @return <p>
     *         The input artifacts to remove from the component.
     *         </p>
     */
    public java.util.List<String> getInputArtifactsToRemove() {
        return inputArtifactsToRemove;
    }

    /**
     * <p>
     * The input artifacts to remove from the component.
     * </p>
     *
     * @param inputArtifactsToRemove <p>
     *            The input artifacts to remove from the component.
     *            </p>
     */
    public void setInputArtifactsToRemove(java.util.Collection<String> inputArtifactsToRemove) {
        if (inputArtifactsToRemove == null) {
            this.inputArtifactsToRemove = null;
            return;
        }

        this.inputArtifactsToRemove = new java.util.ArrayList<String>(inputArtifactsToRemove);
    }

    /**
     * <p>
     * The input artifacts to remove from the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputArtifactsToRemove <p>
     *            The input artifacts to remove from the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialComponentRequest withInputArtifactsToRemove(String... inputArtifactsToRemove) {
        if (getInputArtifactsToRemove() == null) {
            this.inputArtifactsToRemove = new java.util.ArrayList<String>(
                    inputArtifactsToRemove.length);
        }
        for (String value : inputArtifactsToRemove) {
            this.inputArtifactsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The input artifacts to remove from the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputArtifactsToRemove <p>
     *            The input artifacts to remove from the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialComponentRequest withInputArtifactsToRemove(
            java.util.Collection<String> inputArtifactsToRemove) {
        setInputArtifactsToRemove(inputArtifactsToRemove);
        return this;
    }

    /**
     * <p>
     * Replaces all of the component's output artifacts with the specified
     * artifacts.
     * </p>
     *
     * @return <p>
     *         Replaces all of the component's output artifacts with the
     *         specified artifacts.
     *         </p>
     */
    public java.util.Map<String, TrialComponentArtifact> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * Replaces all of the component's output artifacts with the specified
     * artifacts.
     * </p>
     *
     * @param outputArtifacts <p>
     *            Replaces all of the component's output artifacts with the
     *            specified artifacts.
     *            </p>
     */
    public void setOutputArtifacts(java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
    }

    /**
     * <p>
     * Replaces all of the component's output artifacts with the specified
     * artifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputArtifacts <p>
     *            Replaces all of the component's output artifacts with the
     *            specified artifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialComponentRequest withOutputArtifacts(
            java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
        return this;
    }

    /**
     * <p>
     * Replaces all of the component's output artifacts with the specified
     * artifacts.
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
    public UpdateTrialComponentRequest addOutputArtifactsEntry(String key,
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
    public UpdateTrialComponentRequest clearOutputArtifactsEntries() {
        this.outputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The output artifacts to remove from the component.
     * </p>
     *
     * @return <p>
     *         The output artifacts to remove from the component.
     *         </p>
     */
    public java.util.List<String> getOutputArtifactsToRemove() {
        return outputArtifactsToRemove;
    }

    /**
     * <p>
     * The output artifacts to remove from the component.
     * </p>
     *
     * @param outputArtifactsToRemove <p>
     *            The output artifacts to remove from the component.
     *            </p>
     */
    public void setOutputArtifactsToRemove(java.util.Collection<String> outputArtifactsToRemove) {
        if (outputArtifactsToRemove == null) {
            this.outputArtifactsToRemove = null;
            return;
        }

        this.outputArtifactsToRemove = new java.util.ArrayList<String>(outputArtifactsToRemove);
    }

    /**
     * <p>
     * The output artifacts to remove from the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputArtifactsToRemove <p>
     *            The output artifacts to remove from the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialComponentRequest withOutputArtifactsToRemove(
            String... outputArtifactsToRemove) {
        if (getOutputArtifactsToRemove() == null) {
            this.outputArtifactsToRemove = new java.util.ArrayList<String>(
                    outputArtifactsToRemove.length);
        }
        for (String value : outputArtifactsToRemove) {
            this.outputArtifactsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The output artifacts to remove from the component.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputArtifactsToRemove <p>
     *            The output artifacts to remove from the component.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTrialComponentRequest withOutputArtifactsToRemove(
            java.util.Collection<String> outputArtifactsToRemove) {
        setOutputArtifactsToRemove(outputArtifactsToRemove);
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
        if (getParametersToRemove() != null)
            sb.append("ParametersToRemove: " + getParametersToRemove() + ",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: " + getInputArtifacts() + ",");
        if (getInputArtifactsToRemove() != null)
            sb.append("InputArtifactsToRemove: " + getInputArtifactsToRemove() + ",");
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: " + getOutputArtifacts() + ",");
        if (getOutputArtifactsToRemove() != null)
            sb.append("OutputArtifactsToRemove: " + getOutputArtifactsToRemove());
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
                + ((getParametersToRemove() == null) ? 0 : getParametersToRemove().hashCode());
        hashCode = prime * hashCode
                + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        hashCode = prime
                * hashCode
                + ((getInputArtifactsToRemove() == null) ? 0 : getInputArtifactsToRemove()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts().hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputArtifactsToRemove() == null) ? 0 : getOutputArtifactsToRemove()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrialComponentRequest == false)
            return false;
        UpdateTrialComponentRequest other = (UpdateTrialComponentRequest) obj;

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
        if (other.getParametersToRemove() == null ^ this.getParametersToRemove() == null)
            return false;
        if (other.getParametersToRemove() != null
                && other.getParametersToRemove().equals(this.getParametersToRemove()) == false)
            return false;
        if (other.getInputArtifacts() == null ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null
                && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        if (other.getInputArtifactsToRemove() == null ^ this.getInputArtifactsToRemove() == null)
            return false;
        if (other.getInputArtifactsToRemove() != null
                && other.getInputArtifactsToRemove().equals(this.getInputArtifactsToRemove()) == false)
            return false;
        if (other.getOutputArtifacts() == null ^ this.getOutputArtifacts() == null)
            return false;
        if (other.getOutputArtifacts() != null
                && other.getOutputArtifacts().equals(this.getOutputArtifacts()) == false)
            return false;
        if (other.getOutputArtifactsToRemove() == null ^ this.getOutputArtifactsToRemove() == null)
            return false;
        if (other.getOutputArtifactsToRemove() != null
                && other.getOutputArtifactsToRemove().equals(this.getOutputArtifactsToRemove()) == false)
            return false;
        return true;
    }
}
