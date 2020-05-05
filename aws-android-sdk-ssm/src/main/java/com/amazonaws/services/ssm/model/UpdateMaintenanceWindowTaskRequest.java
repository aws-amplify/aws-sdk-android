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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies a task assigned to a maintenance window. You can't change the task
 * type, but you can change the following values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * TaskARN. For example, you can change a RUN_COMMAND task from
 * AWS-RunPowerShellScript to AWS-RunShellScript.
 * </p>
 * </li>
 * <li>
 * <p>
 * ServiceRoleArn
 * </p>
 * </li>
 * <li>
 * <p>
 * TaskInvocationParameters
 * </p>
 * </li>
 * <li>
 * <p>
 * Priority
 * </p>
 * </li>
 * <li>
 * <p>
 * MaxConcurrency
 * </p>
 * </li>
 * <li>
 * <p>
 * MaxErrors
 * </p>
 * </li>
 * </ul>
 * <p>
 * If a parameter is null, then the corresponding field is not modified. Also,
 * if you set Replace to true, then all fields required by the
 * <a>RegisterTaskWithMaintenanceWindow</a> action are required for this
 * request. Optional fields that aren't specified are set to null.
 * </p>
 */
public class UpdateMaintenanceWindowTaskRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The maintenance window ID that contains the task to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>
     * The task ID to modify.
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
     * The targets (either instances or tags) to modify. Instances are specified
     * using Key=instanceids,Values=instanceID_1,instanceID_2. Tags are
     * specified using Key=tag_name,Values=tag_value.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * The task ARN to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     */
    private String taskArn;

    /**
     * <p>
     * The ARN of the IAM service role for Systems Manager to assume when
     * running a maintenance window task. If you do not specify a service role
     * ARN, Systems Manager uses your account's service-linked role. If no
     * service-linked role for Systems Manager exists in your account, it is
     * created when you run <code>RegisterTaskWithMaintenanceWindow</code>.
     * </p>
     * <p>
     * For more information, see the following topics in the in the <i>AWS
     * Systems Manager User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Using service-linked roles for Systems Manager</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I use a service-linked role or a custom service role to run
     * maintenance window tasks? </a>
     * </p>
     * </li>
     * </ul>
     */
    private String serviceRoleArn;

    /**
     * <p>
     * The parameters to modify.
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
    private java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters;

    /**
     * <p>
     * The parameters that the task should use during execution. Populate only
     * the fields that match the task type. All other fields should be empty.
     * </p>
     */
    private MaintenanceWindowTaskInvocationParameters taskInvocationParameters;

    /**
     * <p>
     * The new task priority to specify. The lower the number, the higher the
     * priority. Tasks that have the same priority are scheduled in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer priority;

    /**
     * <p>
     * The new <code>MaxConcurrency</code> value you want to specify.
     * <code>MaxConcurrency</code> is the number of targets that are allowed to
     * run this task in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     */
    private String maxConcurrency;

    /**
     * <p>
     * The new <code>MaxErrors</code> value to specify. <code>MaxErrors</code>
     * is the maximum number of errors that are allowed before the task stops
     * being scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     */
    private String maxErrors;

    /**
     * <p>
     * The new logging location in Amazon S3 to specify.
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
     * The new task name to specify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * The new task description to specify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String description;

    /**
     * <p>
     * If True, then all fields that are required by the
     * RegisterTaskWithMaintenanceWndow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     */
    private Boolean replace;

    /**
     * <p>
     * The maintenance window ID that contains the task to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>
     *         The maintenance window ID that contains the task to modify.
     *         </p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>
     * The maintenance window ID that contains the task to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The maintenance window ID that contains the task to modify.
     *            </p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The maintenance window ID that contains the task to modify.
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
     *            The maintenance window ID that contains the task to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>
     * The task ID to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>
     *         The task ID to modify.
     *         </p>
     */
    public String getWindowTaskId() {
        return windowTaskId;
    }

    /**
     * <p>
     * The task ID to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowTaskId <p>
     *            The task ID to modify.
     *            </p>
     */
    public void setWindowTaskId(String windowTaskId) {
        this.windowTaskId = windowTaskId;
    }

    /**
     * <p>
     * The task ID to modify.
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
     *            The task ID to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withWindowTaskId(String windowTaskId) {
        this.windowTaskId = windowTaskId;
        return this;
    }

    /**
     * <p>
     * The targets (either instances or tags) to modify. Instances are specified
     * using Key=instanceids,Values=instanceID_1,instanceID_2. Tags are
     * specified using Key=tag_name,Values=tag_value.
     * </p>
     *
     * @return <p>
     *         The targets (either instances or tags) to modify. Instances are
     *         specified using Key=instanceids,Values=instanceID_1,instanceID_2.
     *         Tags are specified using Key=tag_name,Values=tag_value.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets (either instances or tags) to modify. Instances are specified
     * using Key=instanceids,Values=instanceID_1,instanceID_2. Tags are
     * specified using Key=tag_name,Values=tag_value.
     * </p>
     *
     * @param targets <p>
     *            The targets (either instances or tags) to modify. Instances
     *            are specified using
     *            Key=instanceids,Values=instanceID_1,instanceID_2. Tags are
     *            specified using Key=tag_name,Values=tag_value.
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
     * The targets (either instances or tags) to modify. Instances are specified
     * using Key=instanceids,Values=instanceID_1,instanceID_2. Tags are
     * specified using Key=tag_name,Values=tag_value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets (either instances or tags) to modify. Instances
     *            are specified using
     *            Key=instanceids,Values=instanceID_1,instanceID_2. Tags are
     *            specified using Key=tag_name,Values=tag_value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withTargets(Target... targets) {
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
     * The targets (either instances or tags) to modify. Instances are specified
     * using Key=instanceids,Values=instanceID_1,instanceID_2. Tags are
     * specified using Key=tag_name,Values=tag_value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The targets (either instances or tags) to modify. Instances
     *            are specified using
     *            Key=instanceids,Values=instanceID_1,instanceID_2. Tags are
     *            specified using Key=tag_name,Values=tag_value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The task ARN to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @return <p>
     *         The task ARN to modify.
     *         </p>
     */
    public String getTaskArn() {
        return taskArn;
    }

    /**
     * <p>
     * The task ARN to modify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @param taskArn <p>
     *            The task ARN to modify.
     *            </p>
     */
    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The task ARN to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     *
     * @param taskArn <p>
     *            The task ARN to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withTaskArn(String taskArn) {
        this.taskArn = taskArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM service role for Systems Manager to assume when
     * running a maintenance window task. If you do not specify a service role
     * ARN, Systems Manager uses your account's service-linked role. If no
     * service-linked role for Systems Manager exists in your account, it is
     * created when you run <code>RegisterTaskWithMaintenanceWindow</code>.
     * </p>
     * <p>
     * For more information, see the following topics in the in the <i>AWS
     * Systems Manager User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Using service-linked roles for Systems Manager</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I use a service-linked role or a custom service role to run
     * maintenance window tasks? </a>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The ARN of the IAM service role for Systems Manager to assume
     *         when running a maintenance window task. If you do not specify a
     *         service role ARN, Systems Manager uses your account's
     *         service-linked role. If no service-linked role for Systems
     *         Manager exists in your account, it is created when you run
     *         <code>RegisterTaskWithMaintenanceWindow</code>.
     *         </p>
     *         <p>
     *         For more information, see the following topics in the in the
     *         <i>AWS Systems Manager User Guide</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     *         >Using service-linked roles for Systems Manager</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     *         >Should I use a service-linked role or a custom service role to
     *         run maintenance window tasks? </a>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role for Systems Manager to assume when
     * running a maintenance window task. If you do not specify a service role
     * ARN, Systems Manager uses your account's service-linked role. If no
     * service-linked role for Systems Manager exists in your account, it is
     * created when you run <code>RegisterTaskWithMaintenanceWindow</code>.
     * </p>
     * <p>
     * For more information, see the following topics in the in the <i>AWS
     * Systems Manager User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Using service-linked roles for Systems Manager</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I use a service-linked role or a custom service role to run
     * maintenance window tasks? </a>
     * </p>
     * </li>
     * </ul>
     *
     * @param serviceRoleArn <p>
     *            The ARN of the IAM service role for Systems Manager to assume
     *            when running a maintenance window task. If you do not specify
     *            a service role ARN, Systems Manager uses your account's
     *            service-linked role. If no service-linked role for Systems
     *            Manager exists in your account, it is created when you run
     *            <code>RegisterTaskWithMaintenanceWindow</code>.
     *            </p>
     *            <p>
     *            For more information, see the following topics in the in the
     *            <i>AWS Systems Manager User Guide</i>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     *            >Using service-linked roles for Systems Manager</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     *            >Should I use a service-linked role or a custom service role
     *            to run maintenance window tasks? </a>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM service role for Systems Manager to assume when
     * running a maintenance window task. If you do not specify a service role
     * ARN, Systems Manager uses your account's service-linked role. If no
     * service-linked role for Systems Manager exists in your account, it is
     * created when you run <code>RegisterTaskWithMaintenanceWindow</code>.
     * </p>
     * <p>
     * For more information, see the following topics in the in the <i>AWS
     * Systems Manager User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     * >Using service-linked roles for Systems Manager</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     * >Should I use a service-linked role or a custom service role to run
     * maintenance window tasks? </a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRoleArn <p>
     *            The ARN of the IAM service role for Systems Manager to assume
     *            when running a maintenance window task. If you do not specify
     *            a service role ARN, Systems Manager uses your account's
     *            service-linked role. If no service-linked role for Systems
     *            Manager exists in your account, it is created when you run
     *            <code>RegisterTaskWithMaintenanceWindow</code>.
     *            </p>
     *            <p>
     *            For more information, see the following topics in the in the
     *            <i>AWS Systems Manager User Guide</i>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/using-service-linked-roles.html#slr-permissions"
     *            >Using service-linked roles for Systems Manager</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-permissions.html#maintenance-window-tasks-service-role"
     *            >Should I use a service-linked role or a custom service role
     *            to run maintenance window tasks? </a>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * <p>
     * The parameters to modify.
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
     *         The parameters to modify.
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
    public java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> getTaskParameters() {
        return taskParameters;
    }

    /**
     * <p>
     * The parameters to modify.
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
     *            The parameters to modify.
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
            java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        this.taskParameters = taskParameters;
    }

    /**
     * <p>
     * The parameters to modify.
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
     *            The parameters to modify.
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
    public UpdateMaintenanceWindowTaskRequest withTaskParameters(
            java.util.Map<String, MaintenanceWindowTaskParameterValueExpression> taskParameters) {
        this.taskParameters = taskParameters;
        return this;
    }

    /**
     * <p>
     * The parameters to modify.
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
    public UpdateMaintenanceWindowTaskRequest addTaskParametersEntry(String key,
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
    public UpdateMaintenanceWindowTaskRequest clearTaskParametersEntries() {
        this.taskParameters = null;
        return this;
    }

    /**
     * <p>
     * The parameters that the task should use during execution. Populate only
     * the fields that match the task type. All other fields should be empty.
     * </p>
     *
     * @return <p>
     *         The parameters that the task should use during execution.
     *         Populate only the fields that match the task type. All other
     *         fields should be empty.
     *         </p>
     */
    public MaintenanceWindowTaskInvocationParameters getTaskInvocationParameters() {
        return taskInvocationParameters;
    }

    /**
     * <p>
     * The parameters that the task should use during execution. Populate only
     * the fields that match the task type. All other fields should be empty.
     * </p>
     *
     * @param taskInvocationParameters <p>
     *            The parameters that the task should use during execution.
     *            Populate only the fields that match the task type. All other
     *            fields should be empty.
     *            </p>
     */
    public void setTaskInvocationParameters(
            MaintenanceWindowTaskInvocationParameters taskInvocationParameters) {
        this.taskInvocationParameters = taskInvocationParameters;
    }

    /**
     * <p>
     * The parameters that the task should use during execution. Populate only
     * the fields that match the task type. All other fields should be empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskInvocationParameters <p>
     *            The parameters that the task should use during execution.
     *            Populate only the fields that match the task type. All other
     *            fields should be empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withTaskInvocationParameters(
            MaintenanceWindowTaskInvocationParameters taskInvocationParameters) {
        this.taskInvocationParameters = taskInvocationParameters;
        return this;
    }

    /**
     * <p>
     * The new task priority to specify. The lower the number, the higher the
     * priority. Tasks that have the same priority are scheduled in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The new task priority to specify. The lower the number, the
     *         higher the priority. Tasks that have the same priority are
     *         scheduled in parallel.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * The new task priority to specify. The lower the number, the higher the
     * priority. Tasks that have the same priority are scheduled in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param priority <p>
     *            The new task priority to specify. The lower the number, the
     *            higher the priority. Tasks that have the same priority are
     *            scheduled in parallel.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The new task priority to specify. The lower the number, the higher the
     * priority. Tasks that have the same priority are scheduled in parallel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param priority <p>
     *            The new task priority to specify. The lower the number, the
     *            higher the priority. Tasks that have the same priority are
     *            scheduled in parallel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * The new <code>MaxConcurrency</code> value you want to specify.
     * <code>MaxConcurrency</code> is the number of targets that are allowed to
     * run this task in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @return <p>
     *         The new <code>MaxConcurrency</code> value you want to specify.
     *         <code>MaxConcurrency</code> is the number of targets that are
     *         allowed to run this task in parallel.
     *         </p>
     */
    public String getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * <p>
     * The new <code>MaxConcurrency</code> value you want to specify.
     * <code>MaxConcurrency</code> is the number of targets that are allowed to
     * run this task in parallel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>
     *            The new <code>MaxConcurrency</code> value you want to specify.
     *            <code>MaxConcurrency</code> is the number of targets that are
     *            allowed to run this task in parallel.
     *            </p>
     */
    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The new <code>MaxConcurrency</code> value you want to specify.
     * <code>MaxConcurrency</code> is the number of targets that are allowed to
     * run this task in parallel.
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
     *            The new <code>MaxConcurrency</code> value you want to specify.
     *            <code>MaxConcurrency</code> is the number of targets that are
     *            allowed to run this task in parallel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * <p>
     * The new <code>MaxErrors</code> value to specify. <code>MaxErrors</code>
     * is the maximum number of errors that are allowed before the task stops
     * being scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @return <p>
     *         The new <code>MaxErrors</code> value to specify.
     *         <code>MaxErrors</code> is the maximum number of errors that are
     *         allowed before the task stops being scheduled.
     *         </p>
     */
    public String getMaxErrors() {
        return maxErrors;
    }

    /**
     * <p>
     * The new <code>MaxErrors</code> value to specify. <code>MaxErrors</code>
     * is the maximum number of errors that are allowed before the task stops
     * being scheduled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>
     *            The new <code>MaxErrors</code> value to specify.
     *            <code>MaxErrors</code> is the maximum number of errors that
     *            are allowed before the task stops being scheduled.
     *            </p>
     */
    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The new <code>MaxErrors</code> value to specify. <code>MaxErrors</code>
     * is the maximum number of errors that are allowed before the task stops
     * being scheduled.
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
     *            The new <code>MaxErrors</code> value to specify.
     *            <code>MaxErrors</code> is the maximum number of errors that
     *            are allowed before the task stops being scheduled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * <p>
     * The new logging location in Amazon S3 to specify.
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
     *         The new logging location in Amazon S3 to specify.
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
     * The new logging location in Amazon S3 to specify.
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
     *            The new logging location in Amazon S3 to specify.
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
     * The new logging location in Amazon S3 to specify.
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
     *            The new logging location in Amazon S3 to specify.
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
    public UpdateMaintenanceWindowTaskRequest withLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
        return this;
    }

    /**
     * <p>
     * The new task name to specify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The new task name to specify.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The new task name to specify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The new task name to specify.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new task name to specify.
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
     *            The new task name to specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The new task description to specify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The new task description to specify.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The new task description to specify.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The new task description to specify.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new task description to specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param description <p>
     *            The new task description to specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * If True, then all fields that are required by the
     * RegisterTaskWithMaintenanceWndow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     *
     * @return <p>
     *         If True, then all fields that are required by the
     *         RegisterTaskWithMaintenanceWndow action are also required for
     *         this API request. Optional fields that are not specified are set
     *         to null.
     *         </p>
     */
    public Boolean isReplace() {
        return replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the
     * RegisterTaskWithMaintenanceWndow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     *
     * @return <p>
     *         If True, then all fields that are required by the
     *         RegisterTaskWithMaintenanceWndow action are also required for
     *         this API request. Optional fields that are not specified are set
     *         to null.
     *         </p>
     */
    public Boolean getReplace() {
        return replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the
     * RegisterTaskWithMaintenanceWndow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     *
     * @param replace <p>
     *            If True, then all fields that are required by the
     *            RegisterTaskWithMaintenanceWndow action are also required for
     *            this API request. Optional fields that are not specified are
     *            set to null.
     *            </p>
     */
    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the
     * RegisterTaskWithMaintenanceWndow action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replace <p>
     *            If True, then all fields that are required by the
     *            RegisterTaskWithMaintenanceWndow action are also required for
     *            this API request. Optional fields that are not specified are
     *            set to null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMaintenanceWindowTaskRequest withReplace(Boolean replace) {
        this.replace = replace;
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
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getTaskArn() != null)
            sb.append("TaskArn: " + getTaskArn() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getTaskParameters() != null)
            sb.append("TaskParameters: " + getTaskParameters() + ",");
        if (getTaskInvocationParameters() != null)
            sb.append("TaskInvocationParameters: " + getTaskInvocationParameters() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: " + getMaxConcurrency() + ",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: " + getMaxErrors() + ",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: " + getLoggingInfo() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getReplace() != null)
            sb.append("Replace: " + getReplace());
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
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getTaskParameters() == null) ? 0 : getTaskParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getTaskInvocationParameters() == null) ? 0 : getTaskInvocationParameters()
                        .hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode
                + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode
                + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMaintenanceWindowTaskRequest == false)
            return false;
        UpdateMaintenanceWindowTaskRequest other = (UpdateMaintenanceWindowTaskRequest) obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getWindowTaskId() == null ^ this.getWindowTaskId() == null)
            return false;
        if (other.getWindowTaskId() != null
                && other.getWindowTaskId().equals(this.getWindowTaskId()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null
                && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getTaskParameters() == null ^ this.getTaskParameters() == null)
            return false;
        if (other.getTaskParameters() != null
                && other.getTaskParameters().equals(this.getTaskParameters()) == false)
            return false;
        if (other.getTaskInvocationParameters() == null
                ^ this.getTaskInvocationParameters() == null)
            return false;
        if (other.getTaskInvocationParameters() != null
                && other.getTaskInvocationParameters().equals(this.getTaskInvocationParameters()) == false)
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
        if (other.getLoggingInfo() == null ^ this.getLoggingInfo() == null)
            return false;
        if (other.getLoggingInfo() != null
                && other.getLoggingInfo().equals(this.getLoggingInfo()) == false)
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
        if (other.getReplace() == null ^ this.getReplace() == null)
            return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false)
            return false;
        return true;
    }
}
