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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Detailed information about the current state of an individual Automation
 * execution.
 * </p>
 */
public class AutomationExecution implements Serializable {
    /**
     * <p>
     * The execution ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String automationExecutionId;

    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String documentName;

    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>
     * The time the execution started.
     * </p>
     */
    private java.util.Date executionStartTime;

    /**
     * <p>
     * The time the execution finished.
     * </p>
     */
    private java.util.Date executionEndTime;

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     */
    private String automationExecutionStatus;

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an
     * execution. An Automation document contains a list of steps that are run
     * in order.
     * </p>
     */
    private java.util.List<StepExecution> stepExecutions;

    /**
     * <p>
     * A boolean value that indicates if the response contains the full list of
     * the Automation step executions. If true, use the
     * DescribeAutomationStepExecutions API action to get the full list of step
     * executions.
     * </p>
     */
    private Boolean stepExecutionsTruncated;

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when
     * calling StartAutomationExecution.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;

    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> outputs;

    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to
     * Failed.
     * </p>
     */
    private String failureMessage;

    /**
     * <p>
     * The automation execution mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     */
    private String mode;

    /**
     * <p>
     * The AutomationExecutionId of the parent automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String parentAutomationExecutionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who ran the automation.
     * </p>
     */
    private String executedBy;

    /**
     * <p>
     * The name of the step that is currently running.
     * </p>
     */
    private String currentStepName;

    /**
     * <p>
     * The action of the step that is currently running.
     * </p>
     */
    private String currentAction;

    /**
     * <p>
     * The parameter name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String targetParameterName;

    /**
     * <p>
     * The specified targets.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * The specified key-value mapping of document parameters to target
     * resources.
     * </p>
     */
    private java.util.List<java.util.Map<String, java.util.List<String>>> targetMaps;

    /**
     * <p>
     * A list of resolved targets in the rate control execution.
     * </p>
     */
    private ResolvedTargets resolvedTargets;

    /**
     * <p>
     * The MaxConcurrency value specified by the user when the execution
     * started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     */
    private String maxConcurrency;

    /**
     * <p>
     * The MaxErrors value specified by the user when the execution started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     */
    private String maxErrors;

    /**
     * <p>
     * The target of the execution.
     * </p>
     */
    private String target;

    /**
     * <p>
     * The combination of AWS Regions and/or AWS accounts where you want to run
     * the Automation.
     * </p>
     */
    private java.util.List<TargetLocation> targetLocations;

    /**
     * <p>
     * An aggregate of step execution statuses displayed in the AWS Console for
     * a multi-Region and multi-account Automation execution.
     * </p>
     */
    private ProgressCounters progressCounters;

    /**
     * <p>
     * The execution ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>
     *         The execution ID.
     *         </p>
     */
    public String getAutomationExecutionId() {
        return automationExecutionId;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param automationExecutionId <p>
     *            The execution ID.
     *            </p>
     */
    public void setAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param automationExecutionId <p>
     *            The execution ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
        return this;
    }

    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the Automation document used during the execution.
     *         </p>
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the Automation document used during the execution.
     *            </p>
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the Automation document used during the execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The version of the document to use during execution.
     *         </p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The version of the document to use during execution.
     *            </p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The version of the document to use during execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     *
     * @return <p>
     *         The time the execution started.
     *         </p>
     */
    public java.util.Date getExecutionStartTime() {
        return executionStartTime;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     *
     * @param executionStartTime <p>
     *            The time the execution started.
     *            </p>
     */
    public void setExecutionStartTime(java.util.Date executionStartTime) {
        this.executionStartTime = executionStartTime;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionStartTime <p>
     *            The time the execution started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withExecutionStartTime(java.util.Date executionStartTime) {
        this.executionStartTime = executionStartTime;
        return this;
    }

    /**
     * <p>
     * The time the execution finished.
     * </p>
     *
     * @return <p>
     *         The time the execution finished.
     *         </p>
     */
    public java.util.Date getExecutionEndTime() {
        return executionEndTime;
    }

    /**
     * <p>
     * The time the execution finished.
     * </p>
     *
     * @param executionEndTime <p>
     *            The time the execution finished.
     *            </p>
     */
    public void setExecutionEndTime(java.util.Date executionEndTime) {
        this.executionEndTime = executionEndTime;
    }

    /**
     * <p>
     * The time the execution finished.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionEndTime <p>
     *            The time the execution finished.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withExecutionEndTime(java.util.Date executionEndTime) {
        this.executionEndTime = executionEndTime;
        return this;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @return <p>
     *         The execution status of the Automation.
     *         </p>
     * @see AutomationExecutionStatus
     */
    public String getAutomationExecutionStatus() {
        return automationExecutionStatus;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @param automationExecutionStatus <p>
     *            The execution status of the Automation.
     *            </p>
     * @see AutomationExecutionStatus
     */
    public void setAutomationExecutionStatus(String automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @param automationExecutionStatus <p>
     *            The execution status of the Automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomationExecutionStatus
     */
    public AutomationExecution withAutomationExecutionStatus(String automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus;
        return this;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @param automationExecutionStatus <p>
     *            The execution status of the Automation.
     *            </p>
     * @see AutomationExecutionStatus
     */
    public void setAutomationExecutionStatus(AutomationExecutionStatus automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus.toString();
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @param automationExecutionStatus <p>
     *            The execution status of the Automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomationExecutionStatus
     */
    public AutomationExecution withAutomationExecutionStatus(
            AutomationExecutionStatus automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an
     * execution. An Automation document contains a list of steps that are run
     * in order.
     * </p>
     *
     * @return <p>
     *         A list of details about the current state of all steps that
     *         comprise an execution. An Automation document contains a list of
     *         steps that are run in order.
     *         </p>
     */
    public java.util.List<StepExecution> getStepExecutions() {
        return stepExecutions;
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an
     * execution. An Automation document contains a list of steps that are run
     * in order.
     * </p>
     *
     * @param stepExecutions <p>
     *            A list of details about the current state of all steps that
     *            comprise an execution. An Automation document contains a list
     *            of steps that are run in order.
     *            </p>
     */
    public void setStepExecutions(java.util.Collection<StepExecution> stepExecutions) {
        if (stepExecutions == null) {
            this.stepExecutions = null;
            return;
        }

        this.stepExecutions = new java.util.ArrayList<StepExecution>(stepExecutions);
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an
     * execution. An Automation document contains a list of steps that are run
     * in order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepExecutions <p>
     *            A list of details about the current state of all steps that
     *            comprise an execution. An Automation document contains a list
     *            of steps that are run in order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withStepExecutions(StepExecution... stepExecutions) {
        if (getStepExecutions() == null) {
            this.stepExecutions = new java.util.ArrayList<StepExecution>(stepExecutions.length);
        }
        for (StepExecution value : stepExecutions) {
            this.stepExecutions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an
     * execution. An Automation document contains a list of steps that are run
     * in order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepExecutions <p>
     *            A list of details about the current state of all steps that
     *            comprise an execution. An Automation document contains a list
     *            of steps that are run in order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withStepExecutions(java.util.Collection<StepExecution> stepExecutions) {
        setStepExecutions(stepExecutions);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates if the response contains the full list of
     * the Automation step executions. If true, use the
     * DescribeAutomationStepExecutions API action to get the full list of step
     * executions.
     * </p>
     *
     * @return <p>
     *         A boolean value that indicates if the response contains the full
     *         list of the Automation step executions. If true, use the
     *         DescribeAutomationStepExecutions API action to get the full list
     *         of step executions.
     *         </p>
     */
    public Boolean isStepExecutionsTruncated() {
        return stepExecutionsTruncated;
    }

    /**
     * <p>
     * A boolean value that indicates if the response contains the full list of
     * the Automation step executions. If true, use the
     * DescribeAutomationStepExecutions API action to get the full list of step
     * executions.
     * </p>
     *
     * @return <p>
     *         A boolean value that indicates if the response contains the full
     *         list of the Automation step executions. If true, use the
     *         DescribeAutomationStepExecutions API action to get the full list
     *         of step executions.
     *         </p>
     */
    public Boolean getStepExecutionsTruncated() {
        return stepExecutionsTruncated;
    }

    /**
     * <p>
     * A boolean value that indicates if the response contains the full list of
     * the Automation step executions. If true, use the
     * DescribeAutomationStepExecutions API action to get the full list of step
     * executions.
     * </p>
     *
     * @param stepExecutionsTruncated <p>
     *            A boolean value that indicates if the response contains the
     *            full list of the Automation step executions. If true, use the
     *            DescribeAutomationStepExecutions API action to get the full
     *            list of step executions.
     *            </p>
     */
    public void setStepExecutionsTruncated(Boolean stepExecutionsTruncated) {
        this.stepExecutionsTruncated = stepExecutionsTruncated;
    }

    /**
     * <p>
     * A boolean value that indicates if the response contains the full list of
     * the Automation step executions. If true, use the
     * DescribeAutomationStepExecutions API action to get the full list of step
     * executions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepExecutionsTruncated <p>
     *            A boolean value that indicates if the response contains the
     *            full list of the Automation step executions. If true, use the
     *            DescribeAutomationStepExecutions API action to get the full
     *            list of step executions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withStepExecutionsTruncated(Boolean stepExecutionsTruncated) {
        this.stepExecutionsTruncated = stepExecutionsTruncated;
        return this;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when
     * calling StartAutomationExecution.
     * </p>
     *
     * @return <p>
     *         The key-value map of execution parameters, which were supplied
     *         when calling StartAutomationExecution.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when
     * calling StartAutomationExecution.
     * </p>
     *
     * @param parameters <p>
     *            The key-value map of execution parameters, which were supplied
     *            when calling StartAutomationExecution.
     *            </p>
     */
    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when
     * calling StartAutomationExecution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The key-value map of execution parameters, which were supplied
     *            when calling StartAutomationExecution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withParameters(
            java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when
     * calling StartAutomationExecution.
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
    public AutomationExecution addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
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
    public AutomationExecution clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     *
     * @return <p>
     *         The list of execution outputs as defined in the automation
     *         document.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     *
     * @param outputs <p>
     *            The list of execution outputs as defined in the automation
     *            document.
     *            </p>
     */
    public void setOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        this.outputs = outputs;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputs <p>
     *            The list of execution outputs as defined in the automation
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     * <p>
     * The method adds a new key-value pair into Outputs parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Outputs.
     * @param value The corresponding value of the entry to be added into
     *            Outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution addOutputsEntry(String key, java.util.List<String> value) {
        if (null == this.outputs) {
            this.outputs = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.outputs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.outputs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AutomationExecution clearOutputsEntries() {
        this.outputs = null;
        return this;
    }

    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to
     * Failed.
     * </p>
     *
     * @return <p>
     *         A message describing why an execution has failed, if the status
     *         is set to Failed.
     *         </p>
     */
    public String getFailureMessage() {
        return failureMessage;
    }

    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to
     * Failed.
     * </p>
     *
     * @param failureMessage <p>
     *            A message describing why an execution has failed, if the
     *            status is set to Failed.
     *            </p>
     */
    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to
     * Failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureMessage <p>
     *            A message describing why an execution has failed, if the
     *            status is set to Failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }

    /**
     * <p>
     * The automation execution mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @return <p>
     *         The automation execution mode.
     *         </p>
     * @see ExecutionMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * The automation execution mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The automation execution mode.
     *            </p>
     * @see ExecutionMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The automation execution mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The automation execution mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionMode
     */
    public AutomationExecution withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * The automation execution mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The automation execution mode.
     *            </p>
     * @see ExecutionMode
     */
    public void setMode(ExecutionMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * The automation execution mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The automation execution mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionMode
     */
    public AutomationExecution withMode(ExecutionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The AutomationExecutionId of the parent automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>
     *         The AutomationExecutionId of the parent automation.
     *         </p>
     */
    public String getParentAutomationExecutionId() {
        return parentAutomationExecutionId;
    }

    /**
     * <p>
     * The AutomationExecutionId of the parent automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param parentAutomationExecutionId <p>
     *            The AutomationExecutionId of the parent automation.
     *            </p>
     */
    public void setParentAutomationExecutionId(String parentAutomationExecutionId) {
        this.parentAutomationExecutionId = parentAutomationExecutionId;
    }

    /**
     * <p>
     * The AutomationExecutionId of the parent automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param parentAutomationExecutionId <p>
     *            The AutomationExecutionId of the parent automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withParentAutomationExecutionId(String parentAutomationExecutionId) {
        this.parentAutomationExecutionId = parentAutomationExecutionId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who ran the automation.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user who ran the
     *         automation.
     *         </p>
     */
    public String getExecutedBy() {
        return executedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who ran the automation.
     * </p>
     *
     * @param executedBy <p>
     *            The Amazon Resource Name (ARN) of the user who ran the
     *            automation.
     *            </p>
     */
    public void setExecutedBy(String executedBy) {
        this.executedBy = executedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who ran the automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executedBy <p>
     *            The Amazon Resource Name (ARN) of the user who ran the
     *            automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withExecutedBy(String executedBy) {
        this.executedBy = executedBy;
        return this;
    }

    /**
     * <p>
     * The name of the step that is currently running.
     * </p>
     *
     * @return <p>
     *         The name of the step that is currently running.
     *         </p>
     */
    public String getCurrentStepName() {
        return currentStepName;
    }

    /**
     * <p>
     * The name of the step that is currently running.
     * </p>
     *
     * @param currentStepName <p>
     *            The name of the step that is currently running.
     *            </p>
     */
    public void setCurrentStepName(String currentStepName) {
        this.currentStepName = currentStepName;
    }

    /**
     * <p>
     * The name of the step that is currently running.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentStepName <p>
     *            The name of the step that is currently running.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withCurrentStepName(String currentStepName) {
        this.currentStepName = currentStepName;
        return this;
    }

    /**
     * <p>
     * The action of the step that is currently running.
     * </p>
     *
     * @return <p>
     *         The action of the step that is currently running.
     *         </p>
     */
    public String getCurrentAction() {
        return currentAction;
    }

    /**
     * <p>
     * The action of the step that is currently running.
     * </p>
     *
     * @param currentAction <p>
     *            The action of the step that is currently running.
     *            </p>
     */
    public void setCurrentAction(String currentAction) {
        this.currentAction = currentAction;
    }

    /**
     * <p>
     * The action of the step that is currently running.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentAction <p>
     *            The action of the step that is currently running.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withCurrentAction(String currentAction) {
        this.currentAction = currentAction;
        return this;
    }

    /**
     * <p>
     * The parameter name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         The parameter name.
     *         </p>
     */
    public String getTargetParameterName() {
        return targetParameterName;
    }

    /**
     * <p>
     * The parameter name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param targetParameterName <p>
     *            The parameter name.
     *            </p>
     */
    public void setTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
    }

    /**
     * <p>
     * The parameter name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param targetParameterName <p>
     *            The parameter name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
        return this;
    }

    /**
     * <p>
     * The specified targets.
     * </p>
     *
     * @return <p>
     *         The specified targets.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The specified targets.
     * </p>
     *
     * @param targets <p>
     *            The specified targets.
     *            </p>
     */
    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * The specified targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The specified targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withTargets(Target... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<Target>(targets.length);
        }
        for (Target value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The specified targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The specified targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The specified key-value mapping of document parameters to target
     * resources.
     * </p>
     *
     * @return <p>
     *         The specified key-value mapping of document parameters to target
     *         resources.
     *         </p>
     */
    public java.util.List<java.util.Map<String, java.util.List<String>>> getTargetMaps() {
        return targetMaps;
    }

    /**
     * <p>
     * The specified key-value mapping of document parameters to target
     * resources.
     * </p>
     *
     * @param targetMaps <p>
     *            The specified key-value mapping of document parameters to
     *            target resources.
     *            </p>
     */
    public void setTargetMaps(
            java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        if (targetMaps == null) {
            this.targetMaps = null;
            return;
        }

        this.targetMaps = new java.util.ArrayList<java.util.Map<String, java.util.List<String>>>(
                targetMaps);
    }

    /**
     * <p>
     * The specified key-value mapping of document parameters to target
     * resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetMaps <p>
     *            The specified key-value mapping of document parameters to
     *            target resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withTargetMaps(
            java.util.Map<String, java.util.List<String>>... targetMaps) {
        if (getTargetMaps() == null) {
            this.targetMaps = new java.util.ArrayList<java.util.Map<String, java.util.List<String>>>(
                    targetMaps.length);
        }
        for (java.util.Map<String, java.util.List<String>> value : targetMaps) {
            this.targetMaps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The specified key-value mapping of document parameters to target
     * resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetMaps <p>
     *            The specified key-value mapping of document parameters to
     *            target resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withTargetMaps(
            java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        setTargetMaps(targetMaps);
        return this;
    }

    /**
     * <p>
     * A list of resolved targets in the rate control execution.
     * </p>
     *
     * @return <p>
     *         A list of resolved targets in the rate control execution.
     *         </p>
     */
    public ResolvedTargets getResolvedTargets() {
        return resolvedTargets;
    }

    /**
     * <p>
     * A list of resolved targets in the rate control execution.
     * </p>
     *
     * @param resolvedTargets <p>
     *            A list of resolved targets in the rate control execution.
     *            </p>
     */
    public void setResolvedTargets(ResolvedTargets resolvedTargets) {
        this.resolvedTargets = resolvedTargets;
    }

    /**
     * <p>
     * A list of resolved targets in the rate control execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resolvedTargets <p>
     *            A list of resolved targets in the rate control execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withResolvedTargets(ResolvedTargets resolvedTargets) {
        this.resolvedTargets = resolvedTargets;
        return this;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when the execution
     * started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @return <p>
     *         The MaxConcurrency value specified by the user when the execution
     *         started.
     *         </p>
     */
    public String getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when the execution
     * started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>
     *            The MaxConcurrency value specified by the user when the
     *            execution started.
     *            </p>
     */
    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when the execution
     * started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>
     *            The MaxConcurrency value specified by the user when the
     *            execution started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when the execution started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @return <p>
     *         The MaxErrors value specified by the user when the execution
     *         started.
     *         </p>
     */
    public String getMaxErrors() {
        return maxErrors;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when the execution started.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>
     *            The MaxErrors value specified by the user when the execution
     *            started.
     *            </p>
     */
    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when the execution started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>
     *            The MaxErrors value specified by the user when the execution
     *            started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * <p>
     * The target of the execution.
     * </p>
     *
     * @return <p>
     *         The target of the execution.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The target of the execution.
     * </p>
     *
     * @param target <p>
     *            The target of the execution.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target of the execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            The target of the execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * The combination of AWS Regions and/or AWS accounts where you want to run
     * the Automation.
     * </p>
     *
     * @return <p>
     *         The combination of AWS Regions and/or AWS accounts where you want
     *         to run the Automation.
     *         </p>
     */
    public java.util.List<TargetLocation> getTargetLocations() {
        return targetLocations;
    }

    /**
     * <p>
     * The combination of AWS Regions and/or AWS accounts where you want to run
     * the Automation.
     * </p>
     *
     * @param targetLocations <p>
     *            The combination of AWS Regions and/or AWS accounts where you
     *            want to run the Automation.
     *            </p>
     */
    public void setTargetLocations(java.util.Collection<TargetLocation> targetLocations) {
        if (targetLocations == null) {
            this.targetLocations = null;
            return;
        }

        this.targetLocations = new java.util.ArrayList<TargetLocation>(targetLocations);
    }

    /**
     * <p>
     * The combination of AWS Regions and/or AWS accounts where you want to run
     * the Automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLocations <p>
     *            The combination of AWS Regions and/or AWS accounts where you
     *            want to run the Automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withTargetLocations(TargetLocation... targetLocations) {
        if (getTargetLocations() == null) {
            this.targetLocations = new java.util.ArrayList<TargetLocation>(targetLocations.length);
        }
        for (TargetLocation value : targetLocations) {
            this.targetLocations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The combination of AWS Regions and/or AWS accounts where you want to run
     * the Automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLocations <p>
     *            The combination of AWS Regions and/or AWS accounts where you
     *            want to run the Automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withTargetLocations(
            java.util.Collection<TargetLocation> targetLocations) {
        setTargetLocations(targetLocations);
        return this;
    }

    /**
     * <p>
     * An aggregate of step execution statuses displayed in the AWS Console for
     * a multi-Region and multi-account Automation execution.
     * </p>
     *
     * @return <p>
     *         An aggregate of step execution statuses displayed in the AWS
     *         Console for a multi-Region and multi-account Automation
     *         execution.
     *         </p>
     */
    public ProgressCounters getProgressCounters() {
        return progressCounters;
    }

    /**
     * <p>
     * An aggregate of step execution statuses displayed in the AWS Console for
     * a multi-Region and multi-account Automation execution.
     * </p>
     *
     * @param progressCounters <p>
     *            An aggregate of step execution statuses displayed in the AWS
     *            Console for a multi-Region and multi-account Automation
     *            execution.
     *            </p>
     */
    public void setProgressCounters(ProgressCounters progressCounters) {
        this.progressCounters = progressCounters;
    }

    /**
     * <p>
     * An aggregate of step execution statuses displayed in the AWS Console for
     * a multi-Region and multi-account Automation execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progressCounters <p>
     *            An aggregate of step execution statuses displayed in the AWS
     *            Console for a multi-Region and multi-account Automation
     *            execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecution withProgressCounters(ProgressCounters progressCounters) {
        this.progressCounters = progressCounters;
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
        if (getAutomationExecutionId() != null)
            sb.append("AutomationExecutionId: " + getAutomationExecutionId() + ",");
        if (getDocumentName() != null)
            sb.append("DocumentName: " + getDocumentName() + ",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getExecutionStartTime() != null)
            sb.append("ExecutionStartTime: " + getExecutionStartTime() + ",");
        if (getExecutionEndTime() != null)
            sb.append("ExecutionEndTime: " + getExecutionEndTime() + ",");
        if (getAutomationExecutionStatus() != null)
            sb.append("AutomationExecutionStatus: " + getAutomationExecutionStatus() + ",");
        if (getStepExecutions() != null)
            sb.append("StepExecutions: " + getStepExecutions() + ",");
        if (getStepExecutionsTruncated() != null)
            sb.append("StepExecutionsTruncated: " + getStepExecutionsTruncated() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getOutputs() != null)
            sb.append("Outputs: " + getOutputs() + ",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: " + getFailureMessage() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getParentAutomationExecutionId() != null)
            sb.append("ParentAutomationExecutionId: " + getParentAutomationExecutionId() + ",");
        if (getExecutedBy() != null)
            sb.append("ExecutedBy: " + getExecutedBy() + ",");
        if (getCurrentStepName() != null)
            sb.append("CurrentStepName: " + getCurrentStepName() + ",");
        if (getCurrentAction() != null)
            sb.append("CurrentAction: " + getCurrentAction() + ",");
        if (getTargetParameterName() != null)
            sb.append("TargetParameterName: " + getTargetParameterName() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getTargetMaps() != null)
            sb.append("TargetMaps: " + getTargetMaps() + ",");
        if (getResolvedTargets() != null)
            sb.append("ResolvedTargets: " + getResolvedTargets() + ",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: " + getMaxConcurrency() + ",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: " + getMaxErrors() + ",");
        if (getTarget() != null)
            sb.append("Target: " + getTarget() + ",");
        if (getTargetLocations() != null)
            sb.append("TargetLocations: " + getTargetLocations() + ",");
        if (getProgressCounters() != null)
            sb.append("ProgressCounters: " + getProgressCounters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutomationExecutionId() == null) ? 0 : getAutomationExecutionId().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionStartTime() == null) ? 0 : getExecutionStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionEndTime() == null) ? 0 : getExecutionEndTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomationExecutionStatus() == null) ? 0 : getAutomationExecutionStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStepExecutions() == null) ? 0 : getStepExecutions().hashCode());
        hashCode = prime
                * hashCode
                + ((getStepExecutionsTruncated() == null) ? 0 : getStepExecutionsTruncated()
                        .hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode
                + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getParentAutomationExecutionId() == null) ? 0
                        : getParentAutomationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getExecutedBy() == null) ? 0 : getExecutedBy().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentStepName() == null) ? 0 : getCurrentStepName().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentAction() == null) ? 0 : getCurrentAction().hashCode());
        hashCode = prime * hashCode
                + ((getTargetParameterName() == null) ? 0 : getTargetParameterName().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTargetMaps() == null) ? 0 : getTargetMaps().hashCode());
        hashCode = prime * hashCode
                + ((getResolvedTargets() == null) ? 0 : getResolvedTargets().hashCode());
        hashCode = prime * hashCode
                + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode
                + ((getTargetLocations() == null) ? 0 : getTargetLocations().hashCode());
        hashCode = prime * hashCode
                + ((getProgressCounters() == null) ? 0 : getProgressCounters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomationExecution == false)
            return false;
        AutomationExecution other = (AutomationExecution) obj;

        if (other.getAutomationExecutionId() == null ^ this.getAutomationExecutionId() == null)
            return false;
        if (other.getAutomationExecutionId() != null
                && other.getAutomationExecutionId().equals(this.getAutomationExecutionId()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null
                && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null
                && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getExecutionStartTime() == null ^ this.getExecutionStartTime() == null)
            return false;
        if (other.getExecutionStartTime() != null
                && other.getExecutionStartTime().equals(this.getExecutionStartTime()) == false)
            return false;
        if (other.getExecutionEndTime() == null ^ this.getExecutionEndTime() == null)
            return false;
        if (other.getExecutionEndTime() != null
                && other.getExecutionEndTime().equals(this.getExecutionEndTime()) == false)
            return false;
        if (other.getAutomationExecutionStatus() == null
                ^ this.getAutomationExecutionStatus() == null)
            return false;
        if (other.getAutomationExecutionStatus() != null
                && other.getAutomationExecutionStatus().equals(this.getAutomationExecutionStatus()) == false)
            return false;
        if (other.getStepExecutions() == null ^ this.getStepExecutions() == null)
            return false;
        if (other.getStepExecutions() != null
                && other.getStepExecutions().equals(this.getStepExecutions()) == false)
            return false;
        if (other.getStepExecutionsTruncated() == null ^ this.getStepExecutionsTruncated() == null)
            return false;
        if (other.getStepExecutionsTruncated() != null
                && other.getStepExecutionsTruncated().equals(this.getStepExecutionsTruncated()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null
                && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getParentAutomationExecutionId() == null
                ^ this.getParentAutomationExecutionId() == null)
            return false;
        if (other.getParentAutomationExecutionId() != null
                && other.getParentAutomationExecutionId().equals(
                        this.getParentAutomationExecutionId()) == false)
            return false;
        if (other.getExecutedBy() == null ^ this.getExecutedBy() == null)
            return false;
        if (other.getExecutedBy() != null
                && other.getExecutedBy().equals(this.getExecutedBy()) == false)
            return false;
        if (other.getCurrentStepName() == null ^ this.getCurrentStepName() == null)
            return false;
        if (other.getCurrentStepName() != null
                && other.getCurrentStepName().equals(this.getCurrentStepName()) == false)
            return false;
        if (other.getCurrentAction() == null ^ this.getCurrentAction() == null)
            return false;
        if (other.getCurrentAction() != null
                && other.getCurrentAction().equals(this.getCurrentAction()) == false)
            return false;
        if (other.getTargetParameterName() == null ^ this.getTargetParameterName() == null)
            return false;
        if (other.getTargetParameterName() != null
                && other.getTargetParameterName().equals(this.getTargetParameterName()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTargetMaps() == null ^ this.getTargetMaps() == null)
            return false;
        if (other.getTargetMaps() != null
                && other.getTargetMaps().equals(this.getTargetMaps()) == false)
            return false;
        if (other.getResolvedTargets() == null ^ this.getResolvedTargets() == null)
            return false;
        if (other.getResolvedTargets() != null
                && other.getResolvedTargets().equals(this.getResolvedTargets()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null
                && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null
                && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getTargetLocations() == null ^ this.getTargetLocations() == null)
            return false;
        if (other.getTargetLocations() != null
                && other.getTargetLocations().equals(this.getTargetLocations()) == false)
            return false;
        if (other.getProgressCounters() == null ^ this.getProgressCounters() == null)
            return false;
        if (other.getProgressCounters() != null
                && other.getProgressCounters().equals(this.getProgressCounters()) == false)
            return false;
        return true;
    }
}
