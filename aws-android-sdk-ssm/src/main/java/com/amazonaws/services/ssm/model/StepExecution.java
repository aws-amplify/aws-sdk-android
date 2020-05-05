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
 * Detailed information about an the execution state of an Automation step.
 * </p>
 */
public class StepExecution implements Serializable {
    /**
     * <p>
     * The name of this execution step.
     * </p>
     */
    private String stepName;

    /**
     * <p>
     * The action this step performs. The action determines the behavior of the
     * step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^aws:[a-zA-Z]{3,25}$<br/>
     */
    private String action;

    /**
     * <p>
     * The timeout seconds of the step.
     * </p>
     */
    private Long timeoutSeconds;

    /**
     * <p>
     * The action to take if the step fails. The default value is Abort.
     * </p>
     */
    private String onFailure;

    /**
     * <p>
     * The maximum number of tries to run the action of the step. The default
     * value is 1.
     * </p>
     */
    private Integer maxAttempts;

    /**
     * <p>
     * If a step has begun execution, this contains the time the step started.
     * If the step is in Pending status, this field is not populated.
     * </p>
     */
    private java.util.Date executionStartTime;

    /**
     * <p>
     * If a step has finished execution, this contains the time the execution
     * ended. If the step has not yet concluded, this field is not populated.
     * </p>
     */
    private java.util.Date executionEndTime;

    /**
     * <p>
     * The execution status for this step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     */
    private String stepStatus;

    /**
     * <p>
     * The response code returned by the execution of the step.
     * </p>
     */
    private String responseCode;

    /**
     * <p>
     * Fully-resolved values passed into the step before execution.
     * </p>
     */
    private java.util.Map<String, String> inputs;

    /**
     * <p>
     * Returned values from the execution of the step.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> outputs;

    /**
     * <p>
     * A message associated with the response code for an execution.
     * </p>
     */
    private String response;

    /**
     * <p>
     * If a step failed, this message explains why the execution failed.
     * </p>
     */
    private String failureMessage;

    /**
     * <p>
     * Information about the Automation failure.
     * </p>
     */
    private FailureDetails failureDetails;

    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     */
    private String stepExecutionId;

    /**
     * <p>
     * A user-specified list of parameters to override when running a step.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> overriddenParameters;

    /**
     * <p>
     * The flag which can be used to end automation no matter whether the step
     * succeeds or fails.
     * </p>
     */
    private Boolean isEnd;

    /**
     * <p>
     * The next step after the step succeeds.
     * </p>
     */
    private String nextStep;

    /**
     * <p>
     * The flag which can be used to help decide whether the failure of current
     * step leads to the Automation failure.
     * </p>
     */
    private Boolean isCritical;

    /**
     * <p>
     * Strategies used when step fails, we support Continue and Abort. Abort
     * will fail the automation when the step fails. Continue will ignore the
     * failure of current step and allow automation to run the next step. With
     * conditional branching, we add step:stepName to support the automation to
     * go to another specific step.
     * </p>
     */
    private java.util.List<String> validNextSteps;

    /**
     * <p>
     * The targets for the step execution.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * The combination of AWS Regions and accounts targeted by the current
     * Automation execution.
     * </p>
     */
    private TargetLocation targetLocation;

    /**
     * <p>
     * The name of this execution step.
     * </p>
     *
     * @return <p>
     *         The name of this execution step.
     *         </p>
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * <p>
     * The name of this execution step.
     * </p>
     *
     * @param stepName <p>
     *            The name of this execution step.
     *            </p>
     */
    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * The name of this execution step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepName <p>
     *            The name of this execution step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    /**
     * <p>
     * The action this step performs. The action determines the behavior of the
     * step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^aws:[a-zA-Z]{3,25}$<br/>
     *
     * @return <p>
     *         The action this step performs. The action determines the behavior
     *         of the step.
     *         </p>
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action this step performs. The action determines the behavior of the
     * step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^aws:[a-zA-Z]{3,25}$<br/>
     *
     * @param action <p>
     *            The action this step performs. The action determines the
     *            behavior of the step.
     *            </p>
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action this step performs. The action determines the behavior of the
     * step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^aws:[a-zA-Z]{3,25}$<br/>
     *
     * @param action <p>
     *            The action this step performs. The action determines the
     *            behavior of the step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The timeout seconds of the step.
     * </p>
     *
     * @return <p>
     *         The timeout seconds of the step.
     *         </p>
     */
    public Long getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * <p>
     * The timeout seconds of the step.
     * </p>
     *
     * @param timeoutSeconds <p>
     *            The timeout seconds of the step.
     *            </p>
     */
    public void setTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>
     * The timeout seconds of the step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeoutSeconds <p>
     *            The timeout seconds of the step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * <p>
     * The action to take if the step fails. The default value is Abort.
     * </p>
     *
     * @return <p>
     *         The action to take if the step fails. The default value is Abort.
     *         </p>
     */
    public String getOnFailure() {
        return onFailure;
    }

    /**
     * <p>
     * The action to take if the step fails. The default value is Abort.
     * </p>
     *
     * @param onFailure <p>
     *            The action to take if the step fails. The default value is
     *            Abort.
     *            </p>
     */
    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }

    /**
     * <p>
     * The action to take if the step fails. The default value is Abort.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onFailure <p>
     *            The action to take if the step fails. The default value is
     *            Abort.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withOnFailure(String onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    /**
     * <p>
     * The maximum number of tries to run the action of the step. The default
     * value is 1.
     * </p>
     *
     * @return <p>
     *         The maximum number of tries to run the action of the step. The
     *         default value is 1.
     *         </p>
     */
    public Integer getMaxAttempts() {
        return maxAttempts;
    }

    /**
     * <p>
     * The maximum number of tries to run the action of the step. The default
     * value is 1.
     * </p>
     *
     * @param maxAttempts <p>
     *            The maximum number of tries to run the action of the step. The
     *            default value is 1.
     *            </p>
     */
    public void setMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    /**
     * <p>
     * The maximum number of tries to run the action of the step. The default
     * value is 1.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxAttempts <p>
     *            The maximum number of tries to run the action of the step. The
     *            default value is 1.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
        return this;
    }

    /**
     * <p>
     * If a step has begun execution, this contains the time the step started.
     * If the step is in Pending status, this field is not populated.
     * </p>
     *
     * @return <p>
     *         If a step has begun execution, this contains the time the step
     *         started. If the step is in Pending status, this field is not
     *         populated.
     *         </p>
     */
    public java.util.Date getExecutionStartTime() {
        return executionStartTime;
    }

    /**
     * <p>
     * If a step has begun execution, this contains the time the step started.
     * If the step is in Pending status, this field is not populated.
     * </p>
     *
     * @param executionStartTime <p>
     *            If a step has begun execution, this contains the time the step
     *            started. If the step is in Pending status, this field is not
     *            populated.
     *            </p>
     */
    public void setExecutionStartTime(java.util.Date executionStartTime) {
        this.executionStartTime = executionStartTime;
    }

    /**
     * <p>
     * If a step has begun execution, this contains the time the step started.
     * If the step is in Pending status, this field is not populated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionStartTime <p>
     *            If a step has begun execution, this contains the time the step
     *            started. If the step is in Pending status, this field is not
     *            populated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withExecutionStartTime(java.util.Date executionStartTime) {
        this.executionStartTime = executionStartTime;
        return this;
    }

    /**
     * <p>
     * If a step has finished execution, this contains the time the execution
     * ended. If the step has not yet concluded, this field is not populated.
     * </p>
     *
     * @return <p>
     *         If a step has finished execution, this contains the time the
     *         execution ended. If the step has not yet concluded, this field is
     *         not populated.
     *         </p>
     */
    public java.util.Date getExecutionEndTime() {
        return executionEndTime;
    }

    /**
     * <p>
     * If a step has finished execution, this contains the time the execution
     * ended. If the step has not yet concluded, this field is not populated.
     * </p>
     *
     * @param executionEndTime <p>
     *            If a step has finished execution, this contains the time the
     *            execution ended. If the step has not yet concluded, this field
     *            is not populated.
     *            </p>
     */
    public void setExecutionEndTime(java.util.Date executionEndTime) {
        this.executionEndTime = executionEndTime;
    }

    /**
     * <p>
     * If a step has finished execution, this contains the time the execution
     * ended. If the step has not yet concluded, this field is not populated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionEndTime <p>
     *            If a step has finished execution, this contains the time the
     *            execution ended. If the step has not yet concluded, this field
     *            is not populated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withExecutionEndTime(java.util.Date executionEndTime) {
        this.executionEndTime = executionEndTime;
        return this;
    }

    /**
     * <p>
     * The execution status for this step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @return <p>
     *         The execution status for this step.
     *         </p>
     * @see AutomationExecutionStatus
     */
    public String getStepStatus() {
        return stepStatus;
    }

    /**
     * <p>
     * The execution status for this step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @param stepStatus <p>
     *            The execution status for this step.
     *            </p>
     * @see AutomationExecutionStatus
     */
    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
    }

    /**
     * <p>
     * The execution status for this step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @param stepStatus <p>
     *            The execution status for this step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomationExecutionStatus
     */
    public StepExecution withStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
        return this;
    }

    /**
     * <p>
     * The execution status for this step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @param stepStatus <p>
     *            The execution status for this step.
     *            </p>
     * @see AutomationExecutionStatus
     */
    public void setStepStatus(AutomationExecutionStatus stepStatus) {
        this.stepStatus = stepStatus.toString();
    }

    /**
     * <p>
     * The execution status for this step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Waiting, Success, TimedOut,
     * Cancelling, Cancelled, Failed
     *
     * @param stepStatus <p>
     *            The execution status for this step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutomationExecutionStatus
     */
    public StepExecution withStepStatus(AutomationExecutionStatus stepStatus) {
        this.stepStatus = stepStatus.toString();
        return this;
    }

    /**
     * <p>
     * The response code returned by the execution of the step.
     * </p>
     *
     * @return <p>
     *         The response code returned by the execution of the step.
     *         </p>
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * <p>
     * The response code returned by the execution of the step.
     * </p>
     *
     * @param responseCode <p>
     *            The response code returned by the execution of the step.
     *            </p>
     */
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * The response code returned by the execution of the step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseCode <p>
     *            The response code returned by the execution of the step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * <p>
     * Fully-resolved values passed into the step before execution.
     * </p>
     *
     * @return <p>
     *         Fully-resolved values passed into the step before execution.
     *         </p>
     */
    public java.util.Map<String, String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * Fully-resolved values passed into the step before execution.
     * </p>
     *
     * @param inputs <p>
     *            Fully-resolved values passed into the step before execution.
     *            </p>
     */
    public void setInputs(java.util.Map<String, String> inputs) {
        this.inputs = inputs;
    }

    /**
     * <p>
     * Fully-resolved values passed into the step before execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputs <p>
     *            Fully-resolved values passed into the step before execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withInputs(java.util.Map<String, String> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * <p>
     * Fully-resolved values passed into the step before execution.
     * </p>
     * <p>
     * The method adds a new key-value pair into Inputs parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Inputs.
     * @param value The corresponding value of the entry to be added into
     *            Inputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution addInputsEntry(String key, String value) {
        if (null == this.inputs) {
            this.inputs = new java.util.HashMap<String, String>();
        }
        if (this.inputs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.inputs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Inputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public StepExecution clearInputsEntries() {
        this.inputs = null;
        return this;
    }

    /**
     * <p>
     * Returned values from the execution of the step.
     * </p>
     *
     * @return <p>
     *         Returned values from the execution of the step.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * Returned values from the execution of the step.
     * </p>
     *
     * @param outputs <p>
     *            Returned values from the execution of the step.
     *            </p>
     */
    public void setOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        this.outputs = outputs;
    }

    /**
     * <p>
     * Returned values from the execution of the step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputs <p>
     *            Returned values from the execution of the step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * <p>
     * Returned values from the execution of the step.
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
    public StepExecution addOutputsEntry(String key, java.util.List<String> value) {
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
    public StepExecution clearOutputsEntries() {
        this.outputs = null;
        return this;
    }

    /**
     * <p>
     * A message associated with the response code for an execution.
     * </p>
     *
     * @return <p>
     *         A message associated with the response code for an execution.
     *         </p>
     */
    public String getResponse() {
        return response;
    }

    /**
     * <p>
     * A message associated with the response code for an execution.
     * </p>
     *
     * @param response <p>
     *            A message associated with the response code for an execution.
     *            </p>
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * <p>
     * A message associated with the response code for an execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param response <p>
     *            A message associated with the response code for an execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withResponse(String response) {
        this.response = response;
        return this;
    }

    /**
     * <p>
     * If a step failed, this message explains why the execution failed.
     * </p>
     *
     * @return <p>
     *         If a step failed, this message explains why the execution failed.
     *         </p>
     */
    public String getFailureMessage() {
        return failureMessage;
    }

    /**
     * <p>
     * If a step failed, this message explains why the execution failed.
     * </p>
     *
     * @param failureMessage <p>
     *            If a step failed, this message explains why the execution
     *            failed.
     *            </p>
     */
    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * If a step failed, this message explains why the execution failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureMessage <p>
     *            If a step failed, this message explains why the execution
     *            failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }

    /**
     * <p>
     * Information about the Automation failure.
     * </p>
     *
     * @return <p>
     *         Information about the Automation failure.
     *         </p>
     */
    public FailureDetails getFailureDetails() {
        return failureDetails;
    }

    /**
     * <p>
     * Information about the Automation failure.
     * </p>
     *
     * @param failureDetails <p>
     *            Information about the Automation failure.
     *            </p>
     */
    public void setFailureDetails(FailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * Information about the Automation failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureDetails <p>
     *            Information about the Automation failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withFailureDetails(FailureDetails failureDetails) {
        this.failureDetails = failureDetails;
        return this;
    }

    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     *
     * @return <p>
     *         The unique ID of a step execution.
     *         </p>
     */
    public String getStepExecutionId() {
        return stepExecutionId;
    }

    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     *
     * @param stepExecutionId <p>
     *            The unique ID of a step execution.
     *            </p>
     */
    public void setStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    /**
     * <p>
     * The unique ID of a step execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepExecutionId <p>
     *            The unique ID of a step execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
        return this;
    }

    /**
     * <p>
     * A user-specified list of parameters to override when running a step.
     * </p>
     *
     * @return <p>
     *         A user-specified list of parameters to override when running a
     *         step.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getOverriddenParameters() {
        return overriddenParameters;
    }

    /**
     * <p>
     * A user-specified list of parameters to override when running a step.
     * </p>
     *
     * @param overriddenParameters <p>
     *            A user-specified list of parameters to override when running a
     *            step.
     *            </p>
     */
    public void setOverriddenParameters(
            java.util.Map<String, java.util.List<String>> overriddenParameters) {
        this.overriddenParameters = overriddenParameters;
    }

    /**
     * <p>
     * A user-specified list of parameters to override when running a step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overriddenParameters <p>
     *            A user-specified list of parameters to override when running a
     *            step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withOverriddenParameters(
            java.util.Map<String, java.util.List<String>> overriddenParameters) {
        this.overriddenParameters = overriddenParameters;
        return this;
    }

    /**
     * <p>
     * A user-specified list of parameters to override when running a step.
     * </p>
     * <p>
     * The method adds a new key-value pair into OverriddenParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into OverriddenParameters.
     * @param value The corresponding value of the entry to be added into
     *            OverriddenParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution addOverriddenParametersEntry(String key, java.util.List<String> value) {
        if (null == this.overriddenParameters) {
            this.overriddenParameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.overriddenParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.overriddenParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OverriddenParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public StepExecution clearOverriddenParametersEntries() {
        this.overriddenParameters = null;
        return this;
    }

    /**
     * <p>
     * The flag which can be used to end automation no matter whether the step
     * succeeds or fails.
     * </p>
     *
     * @return <p>
     *         The flag which can be used to end automation no matter whether
     *         the step succeeds or fails.
     *         </p>
     */
    public Boolean isIsEnd() {
        return isEnd;
    }

    /**
     * <p>
     * The flag which can be used to end automation no matter whether the step
     * succeeds or fails.
     * </p>
     *
     * @return <p>
     *         The flag which can be used to end automation no matter whether
     *         the step succeeds or fails.
     *         </p>
     */
    public Boolean getIsEnd() {
        return isEnd;
    }

    /**
     * <p>
     * The flag which can be used to end automation no matter whether the step
     * succeeds or fails.
     * </p>
     *
     * @param isEnd <p>
     *            The flag which can be used to end automation no matter whether
     *            the step succeeds or fails.
     *            </p>
     */
    public void setIsEnd(Boolean isEnd) {
        this.isEnd = isEnd;
    }

    /**
     * <p>
     * The flag which can be used to end automation no matter whether the step
     * succeeds or fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isEnd <p>
     *            The flag which can be used to end automation no matter whether
     *            the step succeeds or fails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withIsEnd(Boolean isEnd) {
        this.isEnd = isEnd;
        return this;
    }

    /**
     * <p>
     * The next step after the step succeeds.
     * </p>
     *
     * @return <p>
     *         The next step after the step succeeds.
     *         </p>
     */
    public String getNextStep() {
        return nextStep;
    }

    /**
     * <p>
     * The next step after the step succeeds.
     * </p>
     *
     * @param nextStep <p>
     *            The next step after the step succeeds.
     *            </p>
     */
    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

    /**
     * <p>
     * The next step after the step succeeds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextStep <p>
     *            The next step after the step succeeds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withNextStep(String nextStep) {
        this.nextStep = nextStep;
        return this;
    }

    /**
     * <p>
     * The flag which can be used to help decide whether the failure of current
     * step leads to the Automation failure.
     * </p>
     *
     * @return <p>
     *         The flag which can be used to help decide whether the failure of
     *         current step leads to the Automation failure.
     *         </p>
     */
    public Boolean isIsCritical() {
        return isCritical;
    }

    /**
     * <p>
     * The flag which can be used to help decide whether the failure of current
     * step leads to the Automation failure.
     * </p>
     *
     * @return <p>
     *         The flag which can be used to help decide whether the failure of
     *         current step leads to the Automation failure.
     *         </p>
     */
    public Boolean getIsCritical() {
        return isCritical;
    }

    /**
     * <p>
     * The flag which can be used to help decide whether the failure of current
     * step leads to the Automation failure.
     * </p>
     *
     * @param isCritical <p>
     *            The flag which can be used to help decide whether the failure
     *            of current step leads to the Automation failure.
     *            </p>
     */
    public void setIsCritical(Boolean isCritical) {
        this.isCritical = isCritical;
    }

    /**
     * <p>
     * The flag which can be used to help decide whether the failure of current
     * step leads to the Automation failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isCritical <p>
     *            The flag which can be used to help decide whether the failure
     *            of current step leads to the Automation failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withIsCritical(Boolean isCritical) {
        this.isCritical = isCritical;
        return this;
    }

    /**
     * <p>
     * Strategies used when step fails, we support Continue and Abort. Abort
     * will fail the automation when the step fails. Continue will ignore the
     * failure of current step and allow automation to run the next step. With
     * conditional branching, we add step:stepName to support the automation to
     * go to another specific step.
     * </p>
     *
     * @return <p>
     *         Strategies used when step fails, we support Continue and Abort.
     *         Abort will fail the automation when the step fails. Continue will
     *         ignore the failure of current step and allow automation to run
     *         the next step. With conditional branching, we add step:stepName
     *         to support the automation to go to another specific step.
     *         </p>
     */
    public java.util.List<String> getValidNextSteps() {
        return validNextSteps;
    }

    /**
     * <p>
     * Strategies used when step fails, we support Continue and Abort. Abort
     * will fail the automation when the step fails. Continue will ignore the
     * failure of current step and allow automation to run the next step. With
     * conditional branching, we add step:stepName to support the automation to
     * go to another specific step.
     * </p>
     *
     * @param validNextSteps <p>
     *            Strategies used when step fails, we support Continue and
     *            Abort. Abort will fail the automation when the step fails.
     *            Continue will ignore the failure of current step and allow
     *            automation to run the next step. With conditional branching,
     *            we add step:stepName to support the automation to go to
     *            another specific step.
     *            </p>
     */
    public void setValidNextSteps(java.util.Collection<String> validNextSteps) {
        if (validNextSteps == null) {
            this.validNextSteps = null;
            return;
        }

        this.validNextSteps = new java.util.ArrayList<String>(validNextSteps);
    }

    /**
     * <p>
     * Strategies used when step fails, we support Continue and Abort. Abort
     * will fail the automation when the step fails. Continue will ignore the
     * failure of current step and allow automation to run the next step. With
     * conditional branching, we add step:stepName to support the automation to
     * go to another specific step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validNextSteps <p>
     *            Strategies used when step fails, we support Continue and
     *            Abort. Abort will fail the automation when the step fails.
     *            Continue will ignore the failure of current step and allow
     *            automation to run the next step. With conditional branching,
     *            we add step:stepName to support the automation to go to
     *            another specific step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withValidNextSteps(String... validNextSteps) {
        if (getValidNextSteps() == null) {
            this.validNextSteps = new java.util.ArrayList<String>(validNextSteps.length);
        }
        for (String value : validNextSteps) {
            this.validNextSteps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Strategies used when step fails, we support Continue and Abort. Abort
     * will fail the automation when the step fails. Continue will ignore the
     * failure of current step and allow automation to run the next step. With
     * conditional branching, we add step:stepName to support the automation to
     * go to another specific step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validNextSteps <p>
     *            Strategies used when step fails, we support Continue and
     *            Abort. Abort will fail the automation when the step fails.
     *            Continue will ignore the failure of current step and allow
     *            automation to run the next step. With conditional branching,
     *            we add step:stepName to support the automation to go to
     *            another specific step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withValidNextSteps(java.util.Collection<String> validNextSteps) {
        setValidNextSteps(validNextSteps);
        return this;
    }

    /**
     * <p>
     * The targets for the step execution.
     * </p>
     *
     * @return <p>
     *         The targets for the step execution.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets for the step execution.
     * </p>
     *
     * @param targets <p>
     *            The targets for the step execution.
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
     * The targets for the step execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets for the step execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withTargets(Target... targets) {
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
     * The targets for the step execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets for the step execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The combination of AWS Regions and accounts targeted by the current
     * Automation execution.
     * </p>
     *
     * @return <p>
     *         The combination of AWS Regions and accounts targeted by the
     *         current Automation execution.
     *         </p>
     */
    public TargetLocation getTargetLocation() {
        return targetLocation;
    }

    /**
     * <p>
     * The combination of AWS Regions and accounts targeted by the current
     * Automation execution.
     * </p>
     *
     * @param targetLocation <p>
     *            The combination of AWS Regions and accounts targeted by the
     *            current Automation execution.
     *            </p>
     */
    public void setTargetLocation(TargetLocation targetLocation) {
        this.targetLocation = targetLocation;
    }

    /**
     * <p>
     * The combination of AWS Regions and accounts targeted by the current
     * Automation execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLocation <p>
     *            The combination of AWS Regions and accounts targeted by the
     *            current Automation execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecution withTargetLocation(TargetLocation targetLocation) {
        this.targetLocation = targetLocation;
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
        if (getStepName() != null)
            sb.append("StepName: " + getStepName() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getTimeoutSeconds() != null)
            sb.append("TimeoutSeconds: " + getTimeoutSeconds() + ",");
        if (getOnFailure() != null)
            sb.append("OnFailure: " + getOnFailure() + ",");
        if (getMaxAttempts() != null)
            sb.append("MaxAttempts: " + getMaxAttempts() + ",");
        if (getExecutionStartTime() != null)
            sb.append("ExecutionStartTime: " + getExecutionStartTime() + ",");
        if (getExecutionEndTime() != null)
            sb.append("ExecutionEndTime: " + getExecutionEndTime() + ",");
        if (getStepStatus() != null)
            sb.append("StepStatus: " + getStepStatus() + ",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: " + getResponseCode() + ",");
        if (getInputs() != null)
            sb.append("Inputs: " + getInputs() + ",");
        if (getOutputs() != null)
            sb.append("Outputs: " + getOutputs() + ",");
        if (getResponse() != null)
            sb.append("Response: " + getResponse() + ",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: " + getFailureMessage() + ",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: " + getFailureDetails() + ",");
        if (getStepExecutionId() != null)
            sb.append("StepExecutionId: " + getStepExecutionId() + ",");
        if (getOverriddenParameters() != null)
            sb.append("OverriddenParameters: " + getOverriddenParameters() + ",");
        if (getIsEnd() != null)
            sb.append("IsEnd: " + getIsEnd() + ",");
        if (getNextStep() != null)
            sb.append("NextStep: " + getNextStep() + ",");
        if (getIsCritical() != null)
            sb.append("IsCritical: " + getIsCritical() + ",");
        if (getValidNextSteps() != null)
            sb.append("ValidNextSteps: " + getValidNextSteps() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getTargetLocation() != null)
            sb.append("TargetLocation: " + getTargetLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getOnFailure() == null) ? 0 : getOnFailure().hashCode());
        hashCode = prime * hashCode
                + ((getMaxAttempts() == null) ? 0 : getMaxAttempts().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionStartTime() == null) ? 0 : getExecutionStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionEndTime() == null) ? 0 : getExecutionEndTime().hashCode());
        hashCode = prime * hashCode + ((getStepStatus() == null) ? 0 : getStepStatus().hashCode());
        hashCode = prime * hashCode
                + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getResponse() == null) ? 0 : getResponse().hashCode());
        hashCode = prime * hashCode
                + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode
                + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode
                + ((getStepExecutionId() == null) ? 0 : getStepExecutionId().hashCode());
        hashCode = prime * hashCode
                + ((getOverriddenParameters() == null) ? 0 : getOverriddenParameters().hashCode());
        hashCode = prime * hashCode + ((getIsEnd() == null) ? 0 : getIsEnd().hashCode());
        hashCode = prime * hashCode + ((getNextStep() == null) ? 0 : getNextStep().hashCode());
        hashCode = prime * hashCode + ((getIsCritical() == null) ? 0 : getIsCritical().hashCode());
        hashCode = prime * hashCode
                + ((getValidNextSteps() == null) ? 0 : getValidNextSteps().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getTargetLocation() == null) ? 0 : getTargetLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepExecution == false)
            return false;
        StepExecution other = (StepExecution) obj;

        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getTimeoutSeconds() == null ^ this.getTimeoutSeconds() == null)
            return false;
        if (other.getTimeoutSeconds() != null
                && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false)
            return false;
        if (other.getOnFailure() == null ^ this.getOnFailure() == null)
            return false;
        if (other.getOnFailure() != null
                && other.getOnFailure().equals(this.getOnFailure()) == false)
            return false;
        if (other.getMaxAttempts() == null ^ this.getMaxAttempts() == null)
            return false;
        if (other.getMaxAttempts() != null
                && other.getMaxAttempts().equals(this.getMaxAttempts()) == false)
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
        if (other.getStepStatus() == null ^ this.getStepStatus() == null)
            return false;
        if (other.getStepStatus() != null
                && other.getStepStatus().equals(this.getStepStatus()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null
                && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getResponse() == null ^ this.getResponse() == null)
            return false;
        if (other.getResponse() != null && other.getResponse().equals(this.getResponse()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null
                && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null
                && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        if (other.getStepExecutionId() == null ^ this.getStepExecutionId() == null)
            return false;
        if (other.getStepExecutionId() != null
                && other.getStepExecutionId().equals(this.getStepExecutionId()) == false)
            return false;
        if (other.getOverriddenParameters() == null ^ this.getOverriddenParameters() == null)
            return false;
        if (other.getOverriddenParameters() != null
                && other.getOverriddenParameters().equals(this.getOverriddenParameters()) == false)
            return false;
        if (other.getIsEnd() == null ^ this.getIsEnd() == null)
            return false;
        if (other.getIsEnd() != null && other.getIsEnd().equals(this.getIsEnd()) == false)
            return false;
        if (other.getNextStep() == null ^ this.getNextStep() == null)
            return false;
        if (other.getNextStep() != null && other.getNextStep().equals(this.getNextStep()) == false)
            return false;
        if (other.getIsCritical() == null ^ this.getIsCritical() == null)
            return false;
        if (other.getIsCritical() != null
                && other.getIsCritical().equals(this.getIsCritical()) == false)
            return false;
        if (other.getValidNextSteps() == null ^ this.getValidNextSteps() == null)
            return false;
        if (other.getValidNextSteps() != null
                && other.getValidNextSteps().equals(this.getValidNextSteps()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTargetLocation() == null ^ this.getTargetLocation() == null)
            return false;
        if (other.getTargetLocation() != null
                && other.getTargetLocation().equals(this.getTargetLocation()) == false)
            return false;
        return true;
    }
}
