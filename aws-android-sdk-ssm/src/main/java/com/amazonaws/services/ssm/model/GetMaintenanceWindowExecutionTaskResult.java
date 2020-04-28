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

public class GetMaintenanceWindowExecutionTaskResult implements Serializable {
    /**
     * <p>
     * The ID of the maintenance window execution that includes the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     */
    private String windowExecutionId;

    /**
     * <p>
     * The ID of the specific task execution in the maintenance window task that
     * was retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     */
    private String taskExecutionId;

    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     */
    private String taskArn;

    /**
     * <p>
     * The role that was assumed when running the task.
     * </p>
     */
    private String serviceRole;

    /**
     * <p>
     * The type of task that was run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     */
    private String type;

    /**
     * <p>
     * The parameters passed to the task when it was run.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to
     * pass to a task when it runs, instead use the <code>Parameters</code>
     * option in the <code>TaskInvocationParameters</code> structure. For
     * information about how Systems Manager handles these options for the
     * supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     */
    private java.util.List<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>> taskParameters;

    /**
     * <p>
     * The priority of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer priority;

    /**
     * <p>
     * The defined maximum number of task executions that could be run in
     * parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     */
    private String maxConcurrency;

    /**
     * <p>
     * The defined maximum number of task execution errors allowed before
     * scheduling of the task execution would have been stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     */
    private String maxErrors;

    /**
     * <p>
     * The status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT,
     * CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     */
    private String status;

    /**
     * <p>
     * The details explaining the Status. Only available for certain status
     * values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     */
    private String statusDetails;

    /**
     * <p>
     * The time the task execution started.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The time the task execution completed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The ID of the maintenance window execution that includes the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>
     *         The ID of the maintenance window execution that includes the
     *         task.
     *         </p>
     */
    public String getWindowExecutionId() {
        return windowExecutionId;
    }

    /**
     * <p>
     * The ID of the maintenance window execution that includes the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowExecutionId <p>
     *            The ID of the maintenance window execution that includes the
     *            task.
     *            </p>
     */
    public void setWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
    }

    /**
     * <p>
     * The ID of the maintenance window execution that includes the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowExecutionId <p>
     *            The ID of the maintenance window execution that includes the
     *            task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
        return this;
    }

    /**
     * <p>
     * The ID of the specific task execution in the maintenance window task that
     * was retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>
     *         The ID of the specific task execution in the maintenance window
     *         task that was retrieved.
     *         </p>
     */
    public String getTaskExecutionId() {
        return taskExecutionId;
    }

    /**
     * <p>
     * The ID of the specific task execution in the maintenance window task that
     * was retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param taskExecutionId <p>
     *            The ID of the specific task execution in the maintenance
     *            window task that was retrieved.
     *            </p>
     */
    public void setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
    }

    /**
     * <p>
     * The ID of the specific task execution in the maintenance window task that
     * was retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param taskExecutionId <p>
     *            The ID of the specific task execution in the maintenance
     *            window task that was retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }

    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @return <p>
     *         The ARN of the task that ran.
     *         </p>
     */
    public String getTaskArn() {
        return taskArn;
    }

    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @param taskArn <p>
     *            The ARN of the task that ran.
     *            </p>
     */
    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @param taskArn <p>
     *            The ARN of the task that ran.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withTaskArn(String taskArn) {
        this.taskArn = taskArn;
        return this;
    }

    /**
     * <p>
     * The role that was assumed when running the task.
     * </p>
     *
     * @return <p>
     *         The role that was assumed when running the task.
     *         </p>
     */
    public String getServiceRole() {
        return serviceRole;
    }

    /**
     * <p>
     * The role that was assumed when running the task.
     * </p>
     *
     * @param serviceRole <p>
     *            The role that was assumed when running the task.
     *            </p>
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The role that was assumed when running the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRole <p>
     *            The role that was assumed when running the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>
     * The type of task that was run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @return <p>
     *         The type of task that was run.
     *         </p>
     * @see MaintenanceWindowTaskType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of task that was run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param type <p>
     *            The type of task that was run.
     *            </p>
     * @see MaintenanceWindowTaskType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of task that was run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param type <p>
     *            The type of task that was run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MaintenanceWindowTaskType
     */
    public GetMaintenanceWindowExecutionTaskResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of task that was run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param type <p>
     *            The type of task that was run.
     *            </p>
     * @see MaintenanceWindowTaskType
     */
    public void setType(MaintenanceWindowTaskType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of task that was run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param type <p>
     *            The type of task that was run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MaintenanceWindowTaskType
     */
    public GetMaintenanceWindowExecutionTaskResult withType(MaintenanceWindowTaskType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The parameters passed to the task when it was run.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to
     * pass to a task when it runs, instead use the <code>Parameters</code>
     * option in the <code>TaskInvocationParameters</code> structure. For
     * information about how Systems Manager handles these options for the
     * supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     *
     * @return <p>
     *         The parameters passed to the task when it was run.
     *         </p>
     *         <note>
     *         <p>
     *         <code>TaskParameters</code> has been deprecated. To specify
     *         parameters to pass to a task when it runs, instead use the
     *         <code>Parameters</code> option in the
     *         <code>TaskInvocationParameters</code> structure. For information
     *         about how Systems Manager handles these options for the supported
     *         maintenance window task types, see
     *         <a>MaintenanceWindowTaskInvocationParameters</a>.
     *         </p>
     *         </note>
     *         <p>
     *         The map has the following format:
     *         </p>
     *         <p>
     *         Key: string, between 1 and 255 characters
     *         </p>
     *         <p>
     *         Value: an array of strings, each string is between 1 and 255
     *         characters
     *         </p>
     */
    public java.util.List<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>> getTaskParameters() {
        return taskParameters;
    }

    /**
     * <p>
     * The parameters passed to the task when it was run.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to
     * pass to a task when it runs, instead use the <code>Parameters</code>
     * option in the <code>TaskInvocationParameters</code> structure. For
     * information about how Systems Manager handles these options for the
     * supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     *
     * @param taskParameters <p>
     *            The parameters passed to the task when it was run.
     *            </p>
     *            <note>
     *            <p>
     *            <code>TaskParameters</code> has been deprecated. To specify
     *            parameters to pass to a task when it runs, instead use the
     *            <code>Parameters</code> option in the
     *            <code>TaskInvocationParameters</code> structure. For
     *            information about how Systems Manager handles these options
     *            for the supported maintenance window task types, see
     *            <a>MaintenanceWindowTaskInvocationParameters</a>.
     *            </p>
     *            </note>
     *            <p>
     *            The map has the following format:
     *            </p>
     *            <p>
     *            Key: string, between 1 and 255 characters
     *            </p>
     *            <p>
     *            Value: an array of strings, each string is between 1 and 255
     *            characters
     *            </p>
     */
    public void setTaskParameters(
            java.util.Collection<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>> taskParameters) {
        if (taskParameters == null) {
            this.taskParameters = null;
            return;
        }

        this.taskParameters = new java.util.ArrayList<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>>(
                taskParameters);
    }

    /**
     * <p>
     * The parameters passed to the task when it was run.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to
     * pass to a task when it runs, instead use the <code>Parameters</code>
     * option in the <code>TaskInvocationParameters</code> structure. For
     * information about how Systems Manager handles these options for the
     * supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskParameters <p>
     *            The parameters passed to the task when it was run.
     *            </p>
     *            <note>
     *            <p>
     *            <code>TaskParameters</code> has been deprecated. To specify
     *            parameters to pass to a task when it runs, instead use the
     *            <code>Parameters</code> option in the
     *            <code>TaskInvocationParameters</code> structure. For
     *            information about how Systems Manager handles these options
     *            for the supported maintenance window task types, see
     *            <a>MaintenanceWindowTaskInvocationParameters</a>.
     *            </p>
     *            </note>
     *            <p>
     *            The map has the following format:
     *            </p>
     *            <p>
     *            Key: string, between 1 and 255 characters
     *            </p>
     *            <p>
     *            Value: an array of strings, each string is between 1 and 255
     *            characters
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withTaskParameters(
            java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>... taskParameters) {
        if (getTaskParameters() == null) {
            this.taskParameters = new java.util.ArrayList<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>>(
                    taskParameters.length);
        }
        for (java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> value : taskParameters) {
            this.taskParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The parameters passed to the task when it was run.
     * </p>
     * <note>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to
     * pass to a task when it runs, instead use the <code>Parameters</code>
     * option in the <code>TaskInvocationParameters</code> structure. For
     * information about how Systems Manager handles these options for the
     * supported maintenance window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * The map has the following format:
     * </p>
     * <p>
     * Key: string, between 1 and 255 characters
     * </p>
     * <p>
     * Value: an array of strings, each string is between 1 and 255 characters
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskParameters <p>
     *            The parameters passed to the task when it was run.
     *            </p>
     *            <note>
     *            <p>
     *            <code>TaskParameters</code> has been deprecated. To specify
     *            parameters to pass to a task when it runs, instead use the
     *            <code>Parameters</code> option in the
     *            <code>TaskInvocationParameters</code> structure. For
     *            information about how Systems Manager handles these options
     *            for the supported maintenance window task types, see
     *            <a>MaintenanceWindowTaskInvocationParameters</a>.
     *            </p>
     *            </note>
     *            <p>
     *            The map has the following format:
     *            </p>
     *            <p>
     *            Key: string, between 1 and 255 characters
     *            </p>
     *            <p>
     *            Value: an array of strings, each string is between 1 and 255
     *            characters
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withTaskParameters(
            java.util.Collection<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>> taskParameters) {
        setTaskParameters(taskParameters);
        return this;
    }

    /**
     * <p>
     * The priority of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The priority of the task.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * The priority of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param priority <p>
     *            The priority of the task.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param priority <p>
     *            The priority of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * The defined maximum number of task executions that could be run in
     * parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @return <p>
     *         The defined maximum number of task executions that could be run
     *         in parallel.
     *         </p>
     */
    public String getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * <p>
     * The defined maximum number of task executions that could be run in
     * parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>
     *            The defined maximum number of task executions that could be
     *            run in parallel.
     *            </p>
     */
    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The defined maximum number of task executions that could be run in
     * parallel.
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
     *            The defined maximum number of task executions that could be
     *            run in parallel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * <p>
     * The defined maximum number of task execution errors allowed before
     * scheduling of the task execution would have been stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @return <p>
     *         The defined maximum number of task execution errors allowed
     *         before scheduling of the task execution would have been stopped.
     *         </p>
     */
    public String getMaxErrors() {
        return maxErrors;
    }

    /**
     * <p>
     * The defined maximum number of task execution errors allowed before
     * scheduling of the task execution would have been stopped.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>
     *            The defined maximum number of task execution errors allowed
     *            before scheduling of the task execution would have been
     *            stopped.
     *            </p>
     */
    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The defined maximum number of task execution errors allowed before
     * scheduling of the task execution would have been stopped.
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
     *            The defined maximum number of task execution errors allowed
     *            before scheduling of the task execution would have been
     *            stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT,
     * CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @return <p>
     *         The status of the task.
     *         </p>
     * @see MaintenanceWindowExecutionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT,
     * CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>
     *            The status of the task.
     *            </p>
     * @see MaintenanceWindowExecutionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT,
     * CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>
     *            The status of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MaintenanceWindowExecutionStatus
     */
    public GetMaintenanceWindowExecutionTaskResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT,
     * CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>
     *            The status of the task.
     *            </p>
     * @see MaintenanceWindowExecutionStatus
     */
    public void setStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT,
     * CANCELLING, CANCELLED, SKIPPED_OVERLAPPING
     *
     * @param status <p>
     *            The status of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MaintenanceWindowExecutionStatus
     */
    public GetMaintenanceWindowExecutionTaskResult withStatus(
            MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The details explaining the Status. Only available for certain status
     * values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @return <p>
     *         The details explaining the Status. Only available for certain
     *         status values.
     *         </p>
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>
     * The details explaining the Status. Only available for certain status
     * values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @param statusDetails <p>
     *            The details explaining the Status. Only available for certain
     *            status values.
     *            </p>
     */
    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * The details explaining the Status. Only available for certain status
     * values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 250<br/>
     *
     * @param statusDetails <p>
     *            The details explaining the Status. Only available for certain
     *            status values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * <p>
     * The time the task execution started.
     * </p>
     *
     * @return <p>
     *         The time the task execution started.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time the task execution started.
     * </p>
     *
     * @param startTime <p>
     *            The time the task execution started.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the task execution started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The time the task execution started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The time the task execution completed.
     * </p>
     *
     * @return <p>
     *         The time the task execution completed.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time the task execution completed.
     * </p>
     *
     * @param endTime <p>
     *            The time the task execution completed.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time the task execution completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time the task execution completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMaintenanceWindowExecutionTaskResult withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
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
        if (getWindowExecutionId() != null)
            sb.append("WindowExecutionId: " + getWindowExecutionId() + ",");
        if (getTaskExecutionId() != null)
            sb.append("TaskExecutionId: " + getTaskExecutionId() + ",");
        if (getTaskArn() != null)
            sb.append("TaskArn: " + getTaskArn() + ",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getTaskParameters() != null)
            sb.append("TaskParameters: " + getTaskParameters() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: " + getMaxConcurrency() + ",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: " + getMaxErrors() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: " + getStatusDetails() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWindowExecutionId() == null) ? 0 : getWindowExecutionId().hashCode());
        hashCode = prime * hashCode
                + ((getTaskExecutionId() == null) ? 0 : getTaskExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getTaskParameters() == null) ? 0 : getTaskParameters().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode
                + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMaintenanceWindowExecutionTaskResult == false)
            return false;
        GetMaintenanceWindowExecutionTaskResult other = (GetMaintenanceWindowExecutionTaskResult) obj;

        if (other.getWindowExecutionId() == null ^ this.getWindowExecutionId() == null)
            return false;
        if (other.getWindowExecutionId() != null
                && other.getWindowExecutionId().equals(this.getWindowExecutionId()) == false)
            return false;
        if (other.getTaskExecutionId() == null ^ this.getTaskExecutionId() == null)
            return false;
        if (other.getTaskExecutionId() != null
                && other.getTaskExecutionId().equals(this.getTaskExecutionId()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null
                && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTaskParameters() == null ^ this.getTaskParameters() == null)
            return false;
        if (other.getTaskParameters() != null
                && other.getTaskParameters().equals(this.getTaskParameters()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null
                && other.getStatusDetails().equals(this.getStatusDetails()) == false)
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
        return true;
    }
}
