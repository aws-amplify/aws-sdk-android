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
 * Details about a specific Automation execution.
 * </p>
 */
public class AutomationExecutionMetadata implements Serializable {
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
     * The name of the Automation document used during execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String documentName;

    /**
     * <p>
     * The document version used during the execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>
     * The status of the execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     */
    private String automationExecutionStatus;

    /**
     * <p>
     * The time the execution started.
     * </p>
     */
    private java.util.Date executionStartTime;

    /**
     * <p>
     * The time the execution finished. This is not populated if the execution
     * is still in progress.
     * </p>
     */
    private java.util.Date executionEndTime;

    /**
     * <p>
     * The IAM role ARN of the user who ran the Automation.
     * </p>
     */
    private String executedBy;

    /**
     * <p>
     * An Amazon S3 bucket where execution information is stored.
     * </p>
     */
    private String logFile;

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> outputs;

    /**
     * <p>
     * The Automation execution mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     */
    private String mode;

    /**
     * <p>
     * The ExecutionId of the parent Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String parentAutomationExecutionId;

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
     * The list of execution outputs as defined in the Automation document.
     * </p>
     */
    private String failureMessage;

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String targetParameterName;

    /**
     * <p>
     * The targets defined by the user when starting the Automation.
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
     * A list of targets that resolved during the execution.
     * </p>
     */
    private ResolvedTargets resolvedTargets;

    /**
     * <p>
     * The MaxConcurrency value specified by the user when starting the
     * Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     */
    private String maxConcurrency;

    /**
     * <p>
     * The MaxErrors value specified by the user when starting the Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     */
    private String maxErrors;

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     */
    private String target;

    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either
     * Local or CrossAccount. CrossAccount is an Automation that runs in
     * multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the
     * <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CrossAccount, Local
     */
    private String automationType;

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
    public AutomationExecutionMetadata withAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
        return this;
    }

    /**
     * <p>
     * The name of the Automation document used during execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the Automation document used during execution.
     *         </p>
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * <p>
     * The name of the Automation document used during execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the Automation document used during execution.
     *            </p>
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the Automation document used during execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the Automation document used during execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * <p>
     * The document version used during the execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The document version used during the execution.
     *         </p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>
     * The document version used during the execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The document version used during the execution.
     *            </p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version used during the execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The document version used during the execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * The status of the execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @return <p>
     *         The status of the execution.
     *         </p>
     * @see AutomationExecutionStatus
     */
    public String getAutomationExecutionStatus() {
        return automationExecutionStatus;
    }

    /**
     * <p>
     * The status of the execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @param automationExecutionStatus <p>
     *            The status of the execution.
     *            </p>
     * @see AutomationExecutionStatus
     */
    public void setAutomationExecutionStatus(String automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus;
    }

    /**
     * <p>
     * The status of the execution.
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
     *            The status of the execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomationExecutionStatus
     */
    public AutomationExecutionMetadata withAutomationExecutionStatus(
            String automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus;
        return this;
    }

    /**
     * <p>
     * The status of the execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @param automationExecutionStatus <p>
     *            The status of the execution.
     *            </p>
     * @see AutomationExecutionStatus
     */
    public void setAutomationExecutionStatus(AutomationExecutionStatus automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus.toString();
    }

    /**
     * <p>
     * The status of the execution.
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
     *            The status of the execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomationExecutionStatus
     */
    public AutomationExecutionMetadata withAutomationExecutionStatus(
            AutomationExecutionStatus automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus.toString();
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
    public AutomationExecutionMetadata withExecutionStartTime(java.util.Date executionStartTime) {
        this.executionStartTime = executionStartTime;
        return this;
    }

    /**
     * <p>
     * The time the execution finished. This is not populated if the execution
     * is still in progress.
     * </p>
     *
     * @return <p>
     *         The time the execution finished. This is not populated if the
     *         execution is still in progress.
     *         </p>
     */
    public java.util.Date getExecutionEndTime() {
        return executionEndTime;
    }

    /**
     * <p>
     * The time the execution finished. This is not populated if the execution
     * is still in progress.
     * </p>
     *
     * @param executionEndTime <p>
     *            The time the execution finished. This is not populated if the
     *            execution is still in progress.
     *            </p>
     */
    public void setExecutionEndTime(java.util.Date executionEndTime) {
        this.executionEndTime = executionEndTime;
    }

    /**
     * <p>
     * The time the execution finished. This is not populated if the execution
     * is still in progress.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionEndTime <p>
     *            The time the execution finished. This is not populated if the
     *            execution is still in progress.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withExecutionEndTime(java.util.Date executionEndTime) {
        this.executionEndTime = executionEndTime;
        return this;
    }

    /**
     * <p>
     * The IAM role ARN of the user who ran the Automation.
     * </p>
     *
     * @return <p>
     *         The IAM role ARN of the user who ran the Automation.
     *         </p>
     */
    public String getExecutedBy() {
        return executedBy;
    }

    /**
     * <p>
     * The IAM role ARN of the user who ran the Automation.
     * </p>
     *
     * @param executedBy <p>
     *            The IAM role ARN of the user who ran the Automation.
     *            </p>
     */
    public void setExecutedBy(String executedBy) {
        this.executedBy = executedBy;
    }

    /**
     * <p>
     * The IAM role ARN of the user who ran the Automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executedBy <p>
     *            The IAM role ARN of the user who ran the Automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withExecutedBy(String executedBy) {
        this.executedBy = executedBy;
        return this;
    }

    /**
     * <p>
     * An Amazon S3 bucket where execution information is stored.
     * </p>
     *
     * @return <p>
     *         An Amazon S3 bucket where execution information is stored.
     *         </p>
     */
    public String getLogFile() {
        return logFile;
    }

    /**
     * <p>
     * An Amazon S3 bucket where execution information is stored.
     * </p>
     *
     * @param logFile <p>
     *            An Amazon S3 bucket where execution information is stored.
     *            </p>
     */
    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    /**
     * <p>
     * An Amazon S3 bucket where execution information is stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logFile <p>
     *            An Amazon S3 bucket where execution information is stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withLogFile(String logFile) {
        this.logFile = logFile;
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     *
     * @return <p>
     *         The list of execution outputs as defined in the Automation
     *         document.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     *
     * @param outputs <p>
     *            The list of execution outputs as defined in the Automation
     *            document.
     *            </p>
     */
    public void setOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        this.outputs = outputs;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputs <p>
     *            The list of execution outputs as defined in the Automation
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withOutputs(
            java.util.Map<String, java.util.List<String>> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
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
    public AutomationExecutionMetadata addOutputsEntry(String key, java.util.List<String> value) {
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
    public AutomationExecutionMetadata clearOutputsEntries() {
        this.outputs = null;
        return this;
    }

    /**
     * <p>
     * The Automation execution mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @return <p>
     *         The Automation execution mode.
     *         </p>
     * @see ExecutionMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * The Automation execution mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The Automation execution mode.
     *            </p>
     * @see ExecutionMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The Automation execution mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The Automation execution mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionMode
     */
    public AutomationExecutionMetadata withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * The Automation execution mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The Automation execution mode.
     *            </p>
     * @see ExecutionMode
     */
    public void setMode(ExecutionMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * The Automation execution mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The Automation execution mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionMode
     */
    public AutomationExecutionMetadata withMode(ExecutionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The ExecutionId of the parent Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>
     *         The ExecutionId of the parent Automation.
     *         </p>
     */
    public String getParentAutomationExecutionId() {
        return parentAutomationExecutionId;
    }

    /**
     * <p>
     * The ExecutionId of the parent Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param parentAutomationExecutionId <p>
     *            The ExecutionId of the parent Automation.
     *            </p>
     */
    public void setParentAutomationExecutionId(String parentAutomationExecutionId) {
        this.parentAutomationExecutionId = parentAutomationExecutionId;
    }

    /**
     * <p>
     * The ExecutionId of the parent Automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param parentAutomationExecutionId <p>
     *            The ExecutionId of the parent Automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withParentAutomationExecutionId(
            String parentAutomationExecutionId) {
        this.parentAutomationExecutionId = parentAutomationExecutionId;
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
    public AutomationExecutionMetadata withCurrentStepName(String currentStepName) {
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
    public AutomationExecutionMetadata withCurrentAction(String currentAction) {
        this.currentAction = currentAction;
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     *
     * @return <p>
     *         The list of execution outputs as defined in the Automation
     *         document.
     *         </p>
     */
    public String getFailureMessage() {
        return failureMessage;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     *
     * @param failureMessage <p>
     *            The list of execution outputs as defined in the Automation
     *            document.
     *            </p>
     */
    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureMessage <p>
     *            The list of execution outputs as defined in the Automation
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         The list of execution outputs as defined in the Automation
     *         document.
     *         </p>
     */
    public String getTargetParameterName() {
        return targetParameterName;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param targetParameterName <p>
     *            The list of execution outputs as defined in the Automation
     *            document.
     *            </p>
     */
    public void setTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param targetParameterName <p>
     *            The list of execution outputs as defined in the Automation
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
        return this;
    }

    /**
     * <p>
     * The targets defined by the user when starting the Automation.
     * </p>
     *
     * @return <p>
     *         The targets defined by the user when starting the Automation.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets defined by the user when starting the Automation.
     * </p>
     *
     * @param targets <p>
     *            The targets defined by the user when starting the Automation.
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
     * The targets defined by the user when starting the Automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets defined by the user when starting the Automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withTargets(Target... targets) {
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
     * The targets defined by the user when starting the Automation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets defined by the user when starting the Automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withTargets(java.util.Collection<Target> targets) {
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
    public AutomationExecutionMetadata withTargetMaps(
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
    public AutomationExecutionMetadata withTargetMaps(
            java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        setTargetMaps(targetMaps);
        return this;
    }

    /**
     * <p>
     * A list of targets that resolved during the execution.
     * </p>
     *
     * @return <p>
     *         A list of targets that resolved during the execution.
     *         </p>
     */
    public ResolvedTargets getResolvedTargets() {
        return resolvedTargets;
    }

    /**
     * <p>
     * A list of targets that resolved during the execution.
     * </p>
     *
     * @param resolvedTargets <p>
     *            A list of targets that resolved during the execution.
     *            </p>
     */
    public void setResolvedTargets(ResolvedTargets resolvedTargets) {
        this.resolvedTargets = resolvedTargets;
    }

    /**
     * <p>
     * A list of targets that resolved during the execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resolvedTargets <p>
     *            A list of targets that resolved during the execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withResolvedTargets(ResolvedTargets resolvedTargets) {
        this.resolvedTargets = resolvedTargets;
        return this;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when starting the
     * Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @return <p>
     *         The MaxConcurrency value specified by the user when starting the
     *         Automation.
     *         </p>
     */
    public String getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when starting the
     * Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>
     *            The MaxConcurrency value specified by the user when starting
     *            the Automation.
     *            </p>
     */
    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The MaxConcurrency value specified by the user when starting the
     * Automation.
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
     *            The MaxConcurrency value specified by the user when starting
     *            the Automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when starting the Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @return <p>
     *         The MaxErrors value specified by the user when starting the
     *         Automation.
     *         </p>
     */
    public String getMaxErrors() {
        return maxErrors;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when starting the Automation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>
     *            The MaxErrors value specified by the user when starting the
     *            Automation.
     *            </p>
     */
    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The MaxErrors value specified by the user when starting the Automation.
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
     *            The MaxErrors value specified by the user when starting the
     *            Automation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     *
     * @return <p>
     *         The list of execution outputs as defined in the Automation
     *         document.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     *
     * @param target <p>
     *            The list of execution outputs as defined in the Automation
     *            document.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the Automation document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            The list of execution outputs as defined in the Automation
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutomationExecutionMetadata withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either
     * Local or CrossAccount. CrossAccount is an Automation that runs in
     * multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the
     * <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CrossAccount, Local
     *
     * @return <p>
     *         Use this filter with <a>DescribeAutomationExecutions</a>. Specify
     *         either Local or CrossAccount. CrossAccount is an Automation that
     *         runs in multiple AWS Regions and accounts. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *         >Executing Automations in Multiple AWS Regions and Accounts</a>
     *         in the <i>AWS Systems Manager User Guide</i>.
     *         </p>
     * @see AutomationType
     */
    public String getAutomationType() {
        return automationType;
    }

    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either
     * Local or CrossAccount. CrossAccount is an Automation that runs in
     * multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the
     * <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CrossAccount, Local
     *
     * @param automationType <p>
     *            Use this filter with <a>DescribeAutomationExecutions</a>.
     *            Specify either Local or CrossAccount. CrossAccount is an
     *            Automation that runs in multiple AWS Regions and accounts. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *            >Executing Automations in Multiple AWS Regions and
     *            Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @see AutomationType
     */
    public void setAutomationType(String automationType) {
        this.automationType = automationType;
    }

    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either
     * Local or CrossAccount. CrossAccount is an Automation that runs in
     * multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the
     * <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CrossAccount, Local
     *
     * @param automationType <p>
     *            Use this filter with <a>DescribeAutomationExecutions</a>.
     *            Specify either Local or CrossAccount. CrossAccount is an
     *            Automation that runs in multiple AWS Regions and accounts. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *            >Executing Automations in Multiple AWS Regions and
     *            Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomationType
     */
    public AutomationExecutionMetadata withAutomationType(String automationType) {
        this.automationType = automationType;
        return this;
    }

    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either
     * Local or CrossAccount. CrossAccount is an Automation that runs in
     * multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the
     * <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CrossAccount, Local
     *
     * @param automationType <p>
     *            Use this filter with <a>DescribeAutomationExecutions</a>.
     *            Specify either Local or CrossAccount. CrossAccount is an
     *            Automation that runs in multiple AWS Regions and accounts. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *            >Executing Automations in Multiple AWS Regions and
     *            Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @see AutomationType
     */
    public void setAutomationType(AutomationType automationType) {
        this.automationType = automationType.toString();
    }

    /**
     * <p>
     * Use this filter with <a>DescribeAutomationExecutions</a>. Specify either
     * Local or CrossAccount. CrossAccount is an Automation that runs in
     * multiple AWS Regions and accounts. For more information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Executing Automations in Multiple AWS Regions and Accounts</a> in the
     * <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CrossAccount, Local
     *
     * @param automationType <p>
     *            Use this filter with <a>DescribeAutomationExecutions</a>.
     *            Specify either Local or CrossAccount. CrossAccount is an
     *            Automation that runs in multiple AWS Regions and accounts. For
     *            more information, see <a href=
     *            "http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *            >Executing Automations in Multiple AWS Regions and
     *            Accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomationType
     */
    public AutomationExecutionMetadata withAutomationType(AutomationType automationType) {
        this.automationType = automationType.toString();
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
        if (getAutomationExecutionStatus() != null)
            sb.append("AutomationExecutionStatus: " + getAutomationExecutionStatus() + ",");
        if (getExecutionStartTime() != null)
            sb.append("ExecutionStartTime: " + getExecutionStartTime() + ",");
        if (getExecutionEndTime() != null)
            sb.append("ExecutionEndTime: " + getExecutionEndTime() + ",");
        if (getExecutedBy() != null)
            sb.append("ExecutedBy: " + getExecutedBy() + ",");
        if (getLogFile() != null)
            sb.append("LogFile: " + getLogFile() + ",");
        if (getOutputs() != null)
            sb.append("Outputs: " + getOutputs() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getParentAutomationExecutionId() != null)
            sb.append("ParentAutomationExecutionId: " + getParentAutomationExecutionId() + ",");
        if (getCurrentStepName() != null)
            sb.append("CurrentStepName: " + getCurrentStepName() + ",");
        if (getCurrentAction() != null)
            sb.append("CurrentAction: " + getCurrentAction() + ",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: " + getFailureMessage() + ",");
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
        if (getAutomationType() != null)
            sb.append("AutomationType: " + getAutomationType());
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
        hashCode = prime
                * hashCode
                + ((getAutomationExecutionStatus() == null) ? 0 : getAutomationExecutionStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getExecutionStartTime() == null) ? 0 : getExecutionStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionEndTime() == null) ? 0 : getExecutionEndTime().hashCode());
        hashCode = prime * hashCode + ((getExecutedBy() == null) ? 0 : getExecutedBy().hashCode());
        hashCode = prime * hashCode + ((getLogFile() == null) ? 0 : getLogFile().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getParentAutomationExecutionId() == null) ? 0
                        : getParentAutomationExecutionId().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentStepName() == null) ? 0 : getCurrentStepName().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentAction() == null) ? 0 : getCurrentAction().hashCode());
        hashCode = prime * hashCode
                + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
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
                + ((getAutomationType() == null) ? 0 : getAutomationType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomationExecutionMetadata == false)
            return false;
        AutomationExecutionMetadata other = (AutomationExecutionMetadata) obj;

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
        if (other.getAutomationExecutionStatus() == null
                ^ this.getAutomationExecutionStatus() == null)
            return false;
        if (other.getAutomationExecutionStatus() != null
                && other.getAutomationExecutionStatus().equals(this.getAutomationExecutionStatus()) == false)
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
        if (other.getExecutedBy() == null ^ this.getExecutedBy() == null)
            return false;
        if (other.getExecutedBy() != null
                && other.getExecutedBy().equals(this.getExecutedBy()) == false)
            return false;
        if (other.getLogFile() == null ^ this.getLogFile() == null)
            return false;
        if (other.getLogFile() != null && other.getLogFile().equals(this.getLogFile()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
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
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null
                && other.getFailureMessage().equals(this.getFailureMessage()) == false)
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
        if (other.getAutomationType() == null ^ this.getAutomationType() == null)
            return false;
        if (other.getAutomationType() != null
                && other.getAutomationType().equals(this.getAutomationType()) == false)
            return false;
        return true;
    }
}
