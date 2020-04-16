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
 * Information about a task defined for a maintenance window.
 * </p>
 */
public class MaintenanceWindowTask implements Serializable {
    /**
     * <p>
     * The ID of the maintenance window where the task is registered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>
     * The task ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     */
    private String windowTaskId;

    /**
     * <p>
     * The resource that the task uses during execution. For RUN_COMMAND and
     * AUTOMATION task types, <code>TaskArn</code> is the Systems Manager
     * document name or ARN. For LAMBDA tasks, it's the function name or ARN.
     * For STEP_FUNCTIONS tasks, it's the state machine ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     */
    private String taskArn;

    /**
     * <p>
     * The type of task. The type can be one of the following: RUN_COMMAND,
     * AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     */
    private String type;

    /**
     * <p>
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are
     * specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * The parameters that should be passed to the task when it is run.
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
     */
    private java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters;

    /**
     * <p>
     * The priority of the task in the maintenance window. The lower the number,
     * the higher the priority. Tasks that have the same priority are scheduled
     * in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer priority;

    /**
     * <p>
     * Information about an Amazon S3 bucket to write task-level logs to.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to
     * contain logs, instead use the <code>OutputS3BucketName</code> and
     * <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about
     * how Systems Manager handles these options for the supported maintenance
     * window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     */
    private LoggingInfo loggingInfo;

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for maintenance window
     * Run Command tasks.
     * </p>
     */
    private String serviceRoleArn;

    /**
     * <p>
     * The maximum number of targets this task can be run for, in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     */
    private String maxConcurrency;

    /**
     * <p>
     * The maximum number of errors allowed before this task stops being
     * scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     */
    private String maxErrors;

    /**
     * <p>
     * The task name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * The ID of the maintenance window where the task is registered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>
     *         The ID of the maintenance window where the task is registered.
     *         </p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window where the task is registered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the maintenance window where the task is registered.
     *            </p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window where the task is registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the maintenance window where the task is registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>
     *         The task ID.
     *         </p>
     */
    public String getWindowTaskId() {
        return windowTaskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowTaskId <p>
     *            The task ID.
     *            </p>
     */
    public void setWindowTaskId(String windowTaskId) {
        this.windowTaskId = windowTaskId;
    }

    /**
     * <p>
     * The task ID.
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
     * @param windowTaskId <p>
     *            The task ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withWindowTaskId(String windowTaskId) {
        this.windowTaskId = windowTaskId;
        return this;
    }

    /**
     * <p>
     * The resource that the task uses during execution. For RUN_COMMAND and
     * AUTOMATION task types, <code>TaskArn</code> is the Systems Manager
     * document name or ARN. For LAMBDA tasks, it's the function name or ARN.
     * For STEP_FUNCTIONS tasks, it's the state machine ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @return <p>
     *         The resource that the task uses during execution. For RUN_COMMAND
     *         and AUTOMATION task types, <code>TaskArn</code> is the Systems
     *         Manager document name or ARN. For LAMBDA tasks, it's the function
     *         name or ARN. For STEP_FUNCTIONS tasks, it's the state machine
     *         ARN.
     *         </p>
     */
    public String getTaskArn() {
        return taskArn;
    }

    /**
     * <p>
     * The resource that the task uses during execution. For RUN_COMMAND and
     * AUTOMATION task types, <code>TaskArn</code> is the Systems Manager
     * document name or ARN. For LAMBDA tasks, it's the function name or ARN.
     * For STEP_FUNCTIONS tasks, it's the state machine ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @param taskArn <p>
     *            The resource that the task uses during execution. For
     *            RUN_COMMAND and AUTOMATION task types, <code>TaskArn</code> is
     *            the Systems Manager document name or ARN. For LAMBDA tasks,
     *            it's the function name or ARN. For STEP_FUNCTIONS tasks, it's
     *            the state machine ARN.
     *            </p>
     */
    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The resource that the task uses during execution. For RUN_COMMAND and
     * AUTOMATION task types, <code>TaskArn</code> is the Systems Manager
     * document name or ARN. For LAMBDA tasks, it's the function name or ARN.
     * For STEP_FUNCTIONS tasks, it's the state machine ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @param taskArn <p>
     *            The resource that the task uses during execution. For
     *            RUN_COMMAND and AUTOMATION task types, <code>TaskArn</code> is
     *            the Systems Manager document name or ARN. For LAMBDA tasks,
     *            it's the function name or ARN. For STEP_FUNCTIONS tasks, it's
     *            the state machine ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withTaskArn(String taskArn) {
        this.taskArn = taskArn;
        return this;
    }

    /**
     * <p>
     * The type of task. The type can be one of the following: RUN_COMMAND,
     * AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @return <p>
     *         The type of task. The type can be one of the following:
     *         RUN_COMMAND, AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
     *         </p>
     * @see MaintenanceWindowTaskType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of task. The type can be one of the following: RUN_COMMAND,
     * AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param type <p>
     *            The type of task. The type can be one of the following:
     *            RUN_COMMAND, AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
     *            </p>
     * @see MaintenanceWindowTaskType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of task. The type can be one of the following: RUN_COMMAND,
     * AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param type <p>
     *            The type of task. The type can be one of the following:
     *            RUN_COMMAND, AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MaintenanceWindowTaskType
     */
    public MaintenanceWindowTask withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of task. The type can be one of the following: RUN_COMMAND,
     * AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param type <p>
     *            The type of task. The type can be one of the following:
     *            RUN_COMMAND, AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
     *            </p>
     * @see MaintenanceWindowTaskType
     */
    public void setType(MaintenanceWindowTaskType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of task. The type can be one of the following: RUN_COMMAND,
     * AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUN_COMMAND, AUTOMATION, STEP_FUNCTIONS, LAMBDA
     *
     * @param type <p>
     *            The type of task. The type can be one of the following:
     *            RUN_COMMAND, AUTOMATION, LAMBDA, or STEP_FUNCTIONS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MaintenanceWindowTaskType
     */
    public MaintenanceWindowTask withType(MaintenanceWindowTaskType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are
     * specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
     * </p>
     *
     * @return <p>
     *         The targets (either instances or tags). Instances are specified
     *         using
     *         Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;.
     *         Tags are specified using Key=&lt;tag name&gt;,Values=&lt;tag
     *         value&gt;.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are
     * specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
     * </p>
     *
     * @param targets <p>
     *            The targets (either instances or tags). Instances are
     *            specified using
     *            Key=instanceids,Values=&lt;instanceid1&gt;,&lt;
     *            instanceid2&gt;. Tags are specified using Key=&lt;tag
     *            name&gt;,Values=&lt;tag value&gt;.
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
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are
     * specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets (either instances or tags). Instances are
     *            specified using
     *            Key=instanceids,Values=&lt;instanceid1&gt;,&lt;
     *            instanceid2&gt;. Tags are specified using Key=&lt;tag
     *            name&gt;,Values=&lt;tag value&gt;.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withTargets(Target... targets) {
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
     * The targets (either instances or tags). Instances are specified using
     * Key=instanceids,Values=&lt;instanceid1&gt;,&lt;instanceid2&gt;. Tags are
     * specified using Key=&lt;tag name&gt;,Values=&lt;tag value&gt;.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets (either instances or tags). Instances are
     *            specified using
     *            Key=instanceids,Values=&lt;instanceid1&gt;,&lt;
     *            instanceid2&gt;. Tags are specified using Key=&lt;tag
     *            name&gt;,Values=&lt;tag value&gt;.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The parameters that should be passed to the task when it is run.
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
     *
     * @return <p>
     *         The parameters that should be passed to the task when it is run.
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
     */
    public java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> getTaskParameters() {
        return taskParameters;
    }

    /**
     * <p>
     * The parameters that should be passed to the task when it is run.
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
     *
     * @param taskParameters <p>
     *            The parameters that should be passed to the task when it is
     *            run.
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
     */
    public void setTaskParameters(
            java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        this.taskParameters = taskParameters;
    }

    /**
     * <p>
     * The parameters that should be passed to the task when it is run.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskParameters <p>
     *            The parameters that should be passed to the task when it is
     *            run.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withTaskParameters(
            java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        this.taskParameters = taskParameters;
        return this;
    }

    /**
     * <p>
     * The parameters that should be passed to the task when it is run.
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
     * The method adds a new key-value pair into TaskParameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into TaskParameters.
     * @param value The corresponding value of the entry to be added into
     *            TaskParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask addTaskParametersEntry(String key,
            MaintenanceWindowTaskParameterValueExpression value) {
        if (null == this.taskParameters) {
            this.taskParameters = new java.util.HashMap<String, MaintenanceWindowTaskParameterValueExpression>();
        }
        if (this.taskParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.taskParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TaskParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public MaintenanceWindowTask clearTaskParametersEntries() {
        this.taskParameters = null;
        return this;
    }

    /**
     * <p>
     * The priority of the task in the maintenance window. The lower the number,
     * the higher the priority. Tasks that have the same priority are scheduled
     * in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The priority of the task in the maintenance window. The lower the
     *         number, the higher the priority. Tasks that have the same
     *         priority are scheduled in parallel.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * The priority of the task in the maintenance window. The lower the number,
     * the higher the priority. Tasks that have the same priority are scheduled
     * in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param priority <p>
     *            The priority of the task in the maintenance window. The lower
     *            the number, the higher the priority. Tasks that have the same
     *            priority are scheduled in parallel.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the task in the maintenance window. The lower the number,
     * the higher the priority. Tasks that have the same priority are scheduled
     * in parallel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param priority <p>
     *            The priority of the task in the maintenance window. The lower
     *            the number, the higher the priority. Tasks that have the same
     *            priority are scheduled in parallel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * Information about an Amazon S3 bucket to write task-level logs to.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to
     * contain logs, instead use the <code>OutputS3BucketName</code> and
     * <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about
     * how Systems Manager handles these options for the supported maintenance
     * window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         Information about an Amazon S3 bucket to write task-level logs
     *         to.
     *         </p>
     *         <note>
     *         <p>
     *         <code>LoggingInfo</code> has been deprecated. To specify an S3
     *         bucket to contain logs, instead use the
     *         <code>OutputS3BucketName</code> and
     *         <code>OutputS3KeyPrefix</code> options in the
     *         <code>TaskInvocationParameters</code> structure. For information
     *         about how Systems Manager handles these options for the supported
     *         maintenance window task types, see
     *         <a>MaintenanceWindowTaskInvocationParameters</a>.
     *         </p>
     *         </note>
     */
    public LoggingInfo getLoggingInfo() {
        return loggingInfo;
    }

    /**
     * <p>
     * Information about an Amazon S3 bucket to write task-level logs to.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to
     * contain logs, instead use the <code>OutputS3BucketName</code> and
     * <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about
     * how Systems Manager handles these options for the supported maintenance
     * window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     *
     * @param loggingInfo <p>
     *            Information about an Amazon S3 bucket to write task-level logs
     *            to.
     *            </p>
     *            <note>
     *            <p>
     *            <code>LoggingInfo</code> has been deprecated. To specify an S3
     *            bucket to contain logs, instead use the
     *            <code>OutputS3BucketName</code> and
     *            <code>OutputS3KeyPrefix</code> options in the
     *            <code>TaskInvocationParameters</code> structure. For
     *            information about how Systems Manager handles these options
     *            for the supported maintenance window task types, see
     *            <a>MaintenanceWindowTaskInvocationParameters</a>.
     *            </p>
     *            </note>
     */
    public void setLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    /**
     * <p>
     * Information about an Amazon S3 bucket to write task-level logs to.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to
     * contain logs, instead use the <code>OutputS3BucketName</code> and
     * <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about
     * how Systems Manager handles these options for the supported maintenance
     * window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingInfo <p>
     *            Information about an Amazon S3 bucket to write task-level logs
     *            to.
     *            </p>
     *            <note>
     *            <p>
     *            <code>LoggingInfo</code> has been deprecated. To specify an S3
     *            bucket to contain logs, instead use the
     *            <code>OutputS3BucketName</code> and
     *            <code>OutputS3KeyPrefix</code> options in the
     *            <code>TaskInvocationParameters</code> structure. For
     *            information about how Systems Manager handles these options
     *            for the supported maintenance window task types, see
     *            <a>MaintenanceWindowTaskInvocationParameters</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for maintenance window
     * Run Command tasks.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM service role to use to publish Amazon Simple
     *         Notification Service (Amazon SNS) notifications for maintenance
     *         window Run Command tasks.
     *         </p>
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for maintenance window
     * Run Command tasks.
     * </p>
     *
     * @param serviceRoleArn <p>
     *            The ARN of the IAM service role to use to publish Amazon
     *            Simple Notification Service (Amazon SNS) notifications for
     *            maintenance window Run Command tasks.
     *            </p>
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role to use to publish Amazon Simple
     * Notification Service (Amazon SNS) notifications for maintenance window
     * Run Command tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRoleArn <p>
     *            The ARN of the IAM service role to use to publish Amazon
     *            Simple Notification Service (Amazon SNS) notifications for
     *            maintenance window Run Command tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * <p>
     * The maximum number of targets this task can be run for, in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @return <p>
     *         The maximum number of targets this task can be run for, in
     *         parallel.
     *         </p>
     */
    public String getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets this task can be run for, in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>
     *            The maximum number of targets this task can be run for, in
     *            parallel.
     *            </p>
     */
    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets this task can be run for, in parallel.
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
     *            The maximum number of targets this task can be run for, in
     *            parallel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * <p>
     * The maximum number of errors allowed before this task stops being
     * scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @return <p>
     *         The maximum number of errors allowed before this task stops being
     *         scheduled.
     *         </p>
     */
    public String getMaxErrors() {
        return maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed before this task stops being
     * scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>
     *            The maximum number of errors allowed before this task stops
     *            being scheduled.
     *            </p>
     */
    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The maximum number of errors allowed before this task stops being
     * scheduled.
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
     *            The maximum number of errors allowed before this task stops
     *            being scheduled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * <p>
     * The task name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The task name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The task name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The task name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The task name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The task name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A description of the task.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            A description of the task.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            A description of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowTask withDescription(String description) {
        this.description = description;
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
        if (getWindowId() != null)
            sb.append("WindowId: " + getWindowId() + ",");
        if (getWindowTaskId() != null)
            sb.append("WindowTaskId: " + getWindowTaskId() + ",");
        if (getTaskArn() != null)
            sb.append("TaskArn: " + getTaskArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getTaskParameters() != null)
            sb.append("TaskParameters: " + getTaskParameters() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: " + getLoggingInfo() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: " + getMaxConcurrency() + ",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: " + getMaxErrors() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode
                + ((getWindowTaskId() == null) ? 0 : getWindowTaskId().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getTaskParameters() == null) ? 0 : getTaskParameters().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode
                + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowTask == false)
            return false;
        MaintenanceWindowTask other = (MaintenanceWindowTask) obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getWindowTaskId() == null ^ this.getWindowTaskId() == null)
            return false;
        if (other.getWindowTaskId() != null
                && other.getWindowTaskId().equals(this.getWindowTaskId()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
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
        if (other.getLoggingInfo() == null ^ this.getLoggingInfo() == null)
            return false;
        if (other.getLoggingInfo() != null
                && other.getLoggingInfo().equals(this.getLoggingInfo()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null
                && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
