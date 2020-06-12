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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The structure that contains information about a stack set operation.
 * </p>
 */
public class StackSetOperation implements Serializable {
    /**
     * <p>
     * The unique ID of a stack set operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String operationId;

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     */
    private String stackSetId;

    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>
     * , or <code>DELETE</code>. Create and delete operations affect only the
     * specified stack set instances that are associated with the specified
     * stack set. Update operations affect both the stack set itself, as well as
     * <i>all</i> associated stack set instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE, DETECT_DRIFT
     */
    private String action;

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure
     * tolerance. The failure tolerance value that you've set for an operation
     * is applied for each Region during stack create and update operations. If
     * the number of failed stacks within a Region exceeds the failure
     * tolerance, the status of the operation in the Region is set to
     * <code>FAILED</code>. This in turn sets the status of the operation as a
     * whole to <code>FAILED</code>, and AWS CloudFormation cancels the
     * operation in any remaining Regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: [<code>Service-managed</code> permissions] For
     * automatic deployments that require a sequence of operations, the
     * operation is queued to be performed. For more information, see the <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-status-codes"
     * >stack set operation status codes</a> in the AWS CloudFormation User
     * Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at
     * user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all
     * the specified stacks without exceeding the failure tolerance for the
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED, STOPPING, STOPPED,
     * QUEUED
     */
    private String status;

    /**
     * <p>
     * The preferences for how AWS CloudFormation performs this stack set
     * operation.
     * </p>
     */
    private StackSetOperationPreferences operationPreferences;

    /**
     * <p>
     * For stack set operations of action type <code>DELETE</code>, specifies
     * whether to remove the stack instances from the specified stack set, but
     * doesn't delete the stacks. You can't reassociate a retained stack, or add
     * an existing, saved stack to a new stack set.
     * </p>
     */
    private Boolean retainStacks;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to perform this
     * stack set operation.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Define Permissions for Multiple Administrators</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String administrationRoleARN;

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack
     * set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     */
    private String executionRoleName;

    /**
     * <p>
     * The time at which the operation was initiated. Note that the creation
     * times for the stack set operation might differ from the creation time of
     * the individual stacks themselves. This is because AWS CloudFormation
     * needs to perform preparatory work for the operation, such as dispatching
     * the work to the requested Regions, before actually creating the first
     * stacks.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The time at which the stack set operation ended, across all accounts and
     * Regions specified. Note that this doesn't necessarily mean that the stack
     * set operation was successful, or even attempted, in each account or
     * Region.
     * </p>
     */
    private java.util.Date endTimestamp;

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * affected by the stack operation.
     * </p>
     */
    private DeploymentTargets deploymentTargets;

    /**
     * <p>
     * Detailed information about the drift status of the stack set. This
     * includes information about drift operations currently being performed on
     * the stack set.
     * </p>
     * <p>
     * this information will only be present for stack set operations whose
     * <code>Action</code> type is <code>DETECT_DRIFT</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
     * >Detecting Unmanaged Changes in Stack Sets</a> in the AWS CloudFormation
     * User Guide.
     * </p>
     */
    private StackSetDriftDetectionDetails stackSetDriftDetectionDetails;

    /**
     * <p>
     * The unique ID of a stack set operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The unique ID of a stack set operation.
     *         </p>
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * <p>
     * The unique ID of a stack set operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param operationId <p>
     *            The unique ID of a stack set operation.
     *            </p>
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique ID of a stack set operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param operationId <p>
     *            The unique ID of a stack set operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperation withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     *
     * @return <p>
     *         The ID of the stack set.
     *         </p>
     */
    public String getStackSetId() {
        return stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     *
     * @param stackSetId <p>
     *            The ID of the stack set.
     *            </p>
     */
    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetId <p>
     *            The ID of the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperation withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>
     * , or <code>DELETE</code>. Create and delete operations affect only the
     * specified stack set instances that are associated with the specified
     * stack set. Update operations affect both the stack set itself, as well as
     * <i>all</i> associated stack set instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE, DETECT_DRIFT
     *
     * @return <p>
     *         The type of stack set operation: <code>CREATE</code>,
     *         <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *         operations affect only the specified stack set instances that are
     *         associated with the specified stack set. Update operations affect
     *         both the stack set itself, as well as <i>all</i> associated stack
     *         set instances.
     *         </p>
     * @see StackSetOperationAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>
     * , or <code>DELETE</code>. Create and delete operations affect only the
     * specified stack set instances that are associated with the specified
     * stack set. Update operations affect both the stack set itself, as well as
     * <i>all</i> associated stack set instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE, DETECT_DRIFT
     *
     * @param action <p>
     *            The type of stack set operation: <code>CREATE</code>,
     *            <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *            operations affect only the specified stack set instances that
     *            are associated with the specified stack set. Update operations
     *            affect both the stack set itself, as well as <i>all</i>
     *            associated stack set instances.
     *            </p>
     * @see StackSetOperationAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>
     * , or <code>DELETE</code>. Create and delete operations affect only the
     * specified stack set instances that are associated with the specified
     * stack set. Update operations affect both the stack set itself, as well as
     * <i>all</i> associated stack set instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE, DETECT_DRIFT
     *
     * @param action <p>
     *            The type of stack set operation: <code>CREATE</code>,
     *            <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *            operations affect only the specified stack set instances that
     *            are associated with the specified stack set. Update operations
     *            affect both the stack set itself, as well as <i>all</i>
     *            associated stack set instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetOperationAction
     */
    public StackSetOperation withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>
     * , or <code>DELETE</code>. Create and delete operations affect only the
     * specified stack set instances that are associated with the specified
     * stack set. Update operations affect both the stack set itself, as well as
     * <i>all</i> associated stack set instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE, DETECT_DRIFT
     *
     * @param action <p>
     *            The type of stack set operation: <code>CREATE</code>,
     *            <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *            operations affect only the specified stack set instances that
     *            are associated with the specified stack set. Update operations
     *            affect both the stack set itself, as well as <i>all</i>
     *            associated stack set instances.
     *            </p>
     * @see StackSetOperationAction
     */
    public void setAction(StackSetOperationAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>
     * , or <code>DELETE</code>. Create and delete operations affect only the
     * specified stack set instances that are associated with the specified
     * stack set. Update operations affect both the stack set itself, as well as
     * <i>all</i> associated stack set instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE, DETECT_DRIFT
     *
     * @param action <p>
     *            The type of stack set operation: <code>CREATE</code>,
     *            <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *            operations affect only the specified stack set instances that
     *            are associated with the specified stack set. Update operations
     *            affect both the stack set itself, as well as <i>all</i>
     *            associated stack set instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetOperationAction
     */
    public StackSetOperation withAction(StackSetOperationAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure
     * tolerance. The failure tolerance value that you've set for an operation
     * is applied for each Region during stack create and update operations. If
     * the number of failed stacks within a Region exceeds the failure
     * tolerance, the status of the operation in the Region is set to
     * <code>FAILED</code>. This in turn sets the status of the operation as a
     * whole to <code>FAILED</code>, and AWS CloudFormation cancels the
     * operation in any remaining Regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: [<code>Service-managed</code> permissions] For
     * automatic deployments that require a sequence of operations, the
     * operation is queued to be performed. For more information, see the <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-status-codes"
     * >stack set operation status codes</a> in the AWS CloudFormation User
     * Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at
     * user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all
     * the specified stacks without exceeding the failure tolerance for the
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED, STOPPING, STOPPED,
     * QUEUED
     *
     * @return <p>
     *         The status of the operation.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The operation exceeded the specified failure
     *         tolerance. The failure tolerance value that you've set for an
     *         operation is applied for each Region during stack create and
     *         update operations. If the number of failed stacks within a Region
     *         exceeds the failure tolerance, the status of the operation in the
     *         Region is set to <code>FAILED</code>. This in turn sets the
     *         status of the operation as a whole to <code>FAILED</code>, and
     *         AWS CloudFormation cancels the operation in any remaining
     *         Regions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUEUED</code>: [<code>Service-managed</code> permissions]
     *         For automatic deployments that require a sequence of operations,
     *         the operation is queued to be performed. For more information,
     *         see the <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-status-codes"
     *         >stack set operation status codes</a> in the AWS CloudFormation
     *         User Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code>: The operation is currently being performed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code>: The user has cancelled the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPING</code>: The operation is in the process of
     *         stopping, at user request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The operation completed creating or
     *         updating all the specified stacks without exceeding the failure
     *         tolerance for the operation.
     *         </p>
     *         </li>
     *         </ul>
     * @see StackSetOperationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure
     * tolerance. The failure tolerance value that you've set for an operation
     * is applied for each Region during stack create and update operations. If
     * the number of failed stacks within a Region exceeds the failure
     * tolerance, the status of the operation in the Region is set to
     * <code>FAILED</code>. This in turn sets the status of the operation as a
     * whole to <code>FAILED</code>, and AWS CloudFormation cancels the
     * operation in any remaining Regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: [<code>Service-managed</code> permissions] For
     * automatic deployments that require a sequence of operations, the
     * operation is queued to be performed. For more information, see the <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-status-codes"
     * >stack set operation status codes</a> in the AWS CloudFormation User
     * Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at
     * user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all
     * the specified stacks without exceeding the failure tolerance for the
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED, STOPPING, STOPPED,
     * QUEUED
     *
     * @param status <p>
     *            The status of the operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The operation exceeded the specified
     *            failure tolerance. The failure tolerance value that you've set
     *            for an operation is applied for each Region during stack
     *            create and update operations. If the number of failed stacks
     *            within a Region exceeds the failure tolerance, the status of
     *            the operation in the Region is set to <code>FAILED</code>.
     *            This in turn sets the status of the operation as a whole to
     *            <code>FAILED</code>, and AWS CloudFormation cancels the
     *            operation in any remaining Regions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: [<code>Service-managed</code>
     *            permissions] For automatic deployments that require a sequence
     *            of operations, the operation is queued to be performed. For
     *            more information, see the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-status-codes"
     *            >stack set operation status codes</a> in the AWS
     *            CloudFormation User Guide.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>: The operation is currently being
     *            performed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The user has cancelled the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPING</code>: The operation is in the process of
     *            stopping, at user request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation completed creating or
     *            updating all the specified stacks without exceeding the
     *            failure tolerance for the operation.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackSetOperationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure
     * tolerance. The failure tolerance value that you've set for an operation
     * is applied for each Region during stack create and update operations. If
     * the number of failed stacks within a Region exceeds the failure
     * tolerance, the status of the operation in the Region is set to
     * <code>FAILED</code>. This in turn sets the status of the operation as a
     * whole to <code>FAILED</code>, and AWS CloudFormation cancels the
     * operation in any remaining Regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: [<code>Service-managed</code> permissions] For
     * automatic deployments that require a sequence of operations, the
     * operation is queued to be performed. For more information, see the <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-status-codes"
     * >stack set operation status codes</a> in the AWS CloudFormation User
     * Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at
     * user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all
     * the specified stacks without exceeding the failure tolerance for the
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED, STOPPING, STOPPED,
     * QUEUED
     *
     * @param status <p>
     *            The status of the operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The operation exceeded the specified
     *            failure tolerance. The failure tolerance value that you've set
     *            for an operation is applied for each Region during stack
     *            create and update operations. If the number of failed stacks
     *            within a Region exceeds the failure tolerance, the status of
     *            the operation in the Region is set to <code>FAILED</code>.
     *            This in turn sets the status of the operation as a whole to
     *            <code>FAILED</code>, and AWS CloudFormation cancels the
     *            operation in any remaining Regions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: [<code>Service-managed</code>
     *            permissions] For automatic deployments that require a sequence
     *            of operations, the operation is queued to be performed. For
     *            more information, see the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-status-codes"
     *            >stack set operation status codes</a> in the AWS
     *            CloudFormation User Guide.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>: The operation is currently being
     *            performed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The user has cancelled the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPING</code>: The operation is in the process of
     *            stopping, at user request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation completed creating or
     *            updating all the specified stacks without exceeding the
     *            failure tolerance for the operation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetOperationStatus
     */
    public StackSetOperation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure
     * tolerance. The failure tolerance value that you've set for an operation
     * is applied for each Region during stack create and update operations. If
     * the number of failed stacks within a Region exceeds the failure
     * tolerance, the status of the operation in the Region is set to
     * <code>FAILED</code>. This in turn sets the status of the operation as a
     * whole to <code>FAILED</code>, and AWS CloudFormation cancels the
     * operation in any remaining Regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: [<code>Service-managed</code> permissions] For
     * automatic deployments that require a sequence of operations, the
     * operation is queued to be performed. For more information, see the <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-status-codes"
     * >stack set operation status codes</a> in the AWS CloudFormation User
     * Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at
     * user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all
     * the specified stacks without exceeding the failure tolerance for the
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED, STOPPING, STOPPED,
     * QUEUED
     *
     * @param status <p>
     *            The status of the operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The operation exceeded the specified
     *            failure tolerance. The failure tolerance value that you've set
     *            for an operation is applied for each Region during stack
     *            create and update operations. If the number of failed stacks
     *            within a Region exceeds the failure tolerance, the status of
     *            the operation in the Region is set to <code>FAILED</code>.
     *            This in turn sets the status of the operation as a whole to
     *            <code>FAILED</code>, and AWS CloudFormation cancels the
     *            operation in any remaining Regions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: [<code>Service-managed</code>
     *            permissions] For automatic deployments that require a sequence
     *            of operations, the operation is queued to be performed. For
     *            more information, see the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-status-codes"
     *            >stack set operation status codes</a> in the AWS
     *            CloudFormation User Guide.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>: The operation is currently being
     *            performed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The user has cancelled the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPING</code>: The operation is in the process of
     *            stopping, at user request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation completed creating or
     *            updating all the specified stacks without exceeding the
     *            failure tolerance for the operation.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackSetOperationStatus
     */
    public void setStatus(StackSetOperationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure
     * tolerance. The failure tolerance value that you've set for an operation
     * is applied for each Region during stack create and update operations. If
     * the number of failed stacks within a Region exceeds the failure
     * tolerance, the status of the operation in the Region is set to
     * <code>FAILED</code>. This in turn sets the status of the operation as a
     * whole to <code>FAILED</code>, and AWS CloudFormation cancels the
     * operation in any remaining Regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code>: [<code>Service-managed</code> permissions] For
     * automatic deployments that require a sequence of operations, the
     * operation is queued to be performed. For more information, see the <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-status-codes"
     * >stack set operation status codes</a> in the AWS CloudFormation User
     * Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at
     * user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all
     * the specified stacks without exceeding the failure tolerance for the
     * operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED, STOPPING, STOPPED,
     * QUEUED
     *
     * @param status <p>
     *            The status of the operation.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code>: The operation exceeded the specified
     *            failure tolerance. The failure tolerance value that you've set
     *            for an operation is applied for each Region during stack
     *            create and update operations. If the number of failed stacks
     *            within a Region exceeds the failure tolerance, the status of
     *            the operation in the Region is set to <code>FAILED</code>.
     *            This in turn sets the status of the operation as a whole to
     *            <code>FAILED</code>, and AWS CloudFormation cancels the
     *            operation in any remaining Regions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUEUED</code>: [<code>Service-managed</code>
     *            permissions] For automatic deployments that require a sequence
     *            of operations, the operation is queued to be performed. For
     *            more information, see the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-status-codes"
     *            >stack set operation status codes</a> in the AWS
     *            CloudFormation User Guide.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RUNNING</code>: The operation is currently being
     *            performed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPED</code>: The user has cancelled the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STOPPING</code>: The operation is in the process of
     *            stopping, at user request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation completed creating or
     *            updating all the specified stacks without exceeding the
     *            failure tolerance for the operation.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetOperationStatus
     */
    public StackSetOperation withStatus(StackSetOperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The preferences for how AWS CloudFormation performs this stack set
     * operation.
     * </p>
     *
     * @return <p>
     *         The preferences for how AWS CloudFormation performs this stack
     *         set operation.
     *         </p>
     */
    public StackSetOperationPreferences getOperationPreferences() {
        return operationPreferences;
    }

    /**
     * <p>
     * The preferences for how AWS CloudFormation performs this stack set
     * operation.
     * </p>
     *
     * @param operationPreferences <p>
     *            The preferences for how AWS CloudFormation performs this stack
     *            set operation.
     *            </p>
     */
    public void setOperationPreferences(StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
    }

    /**
     * <p>
     * The preferences for how AWS CloudFormation performs this stack set
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationPreferences <p>
     *            The preferences for how AWS CloudFormation performs this stack
     *            set operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperation withOperationPreferences(
            StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }

    /**
     * <p>
     * For stack set operations of action type <code>DELETE</code>, specifies
     * whether to remove the stack instances from the specified stack set, but
     * doesn't delete the stacks. You can't reassociate a retained stack, or add
     * an existing, saved stack to a new stack set.
     * </p>
     *
     * @return <p>
     *         For stack set operations of action type <code>DELETE</code>,
     *         specifies whether to remove the stack instances from the
     *         specified stack set, but doesn't delete the stacks. You can't
     *         reassociate a retained stack, or add an existing, saved stack to
     *         a new stack set.
     *         </p>
     */
    public Boolean isRetainStacks() {
        return retainStacks;
    }

    /**
     * <p>
     * For stack set operations of action type <code>DELETE</code>, specifies
     * whether to remove the stack instances from the specified stack set, but
     * doesn't delete the stacks. You can't reassociate a retained stack, or add
     * an existing, saved stack to a new stack set.
     * </p>
     *
     * @return <p>
     *         For stack set operations of action type <code>DELETE</code>,
     *         specifies whether to remove the stack instances from the
     *         specified stack set, but doesn't delete the stacks. You can't
     *         reassociate a retained stack, or add an existing, saved stack to
     *         a new stack set.
     *         </p>
     */
    public Boolean getRetainStacks() {
        return retainStacks;
    }

    /**
     * <p>
     * For stack set operations of action type <code>DELETE</code>, specifies
     * whether to remove the stack instances from the specified stack set, but
     * doesn't delete the stacks. You can't reassociate a retained stack, or add
     * an existing, saved stack to a new stack set.
     * </p>
     *
     * @param retainStacks <p>
     *            For stack set operations of action type <code>DELETE</code>,
     *            specifies whether to remove the stack instances from the
     *            specified stack set, but doesn't delete the stacks. You can't
     *            reassociate a retained stack, or add an existing, saved stack
     *            to a new stack set.
     *            </p>
     */
    public void setRetainStacks(Boolean retainStacks) {
        this.retainStacks = retainStacks;
    }

    /**
     * <p>
     * For stack set operations of action type <code>DELETE</code>, specifies
     * whether to remove the stack instances from the specified stack set, but
     * doesn't delete the stacks. You can't reassociate a retained stack, or add
     * an existing, saved stack to a new stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retainStacks <p>
     *            For stack set operations of action type <code>DELETE</code>,
     *            specifies whether to remove the stack instances from the
     *            specified stack set, but doesn't delete the stacks. You can't
     *            reassociate a retained stack, or add an existing, saved stack
     *            to a new stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperation withRetainStacks(Boolean retainStacks) {
        this.retainStacks = retainStacks;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to perform this
     * stack set operation.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Define Permissions for Multiple Administrators</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the IAM role used to perform
     *         this stack set operation.
     *         </p>
     *         <p>
     *         Use customized administrator roles to control which users or
     *         groups can manage specific stack sets within the same
     *         administrator account. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     *         >Define Permissions for Multiple Administrators</a> in the <i>AWS
     *         CloudFormation User Guide</i>.
     *         </p>
     */
    public String getAdministrationRoleARN() {
        return administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to perform this
     * stack set operation.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Define Permissions for Multiple Administrators</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param administrationRoleARN <p>
     *            The Amazon Resource Number (ARN) of the IAM role used to
     *            perform this stack set operation.
     *            </p>
     *            <p>
     *            Use customized administrator roles to control which users or
     *            groups can manage specific stack sets within the same
     *            administrator account. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     *            >Define Permissions for Multiple Administrators</a> in the
     *            <i>AWS CloudFormation User Guide</i>.
     *            </p>
     */
    public void setAdministrationRoleARN(String administrationRoleARN) {
        this.administrationRoleARN = administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to perform this
     * stack set operation.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Define Permissions for Multiple Administrators</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param administrationRoleARN <p>
     *            The Amazon Resource Number (ARN) of the IAM role used to
     *            perform this stack set operation.
     *            </p>
     *            <p>
     *            Use customized administrator roles to control which users or
     *            groups can manage specific stack sets within the same
     *            administrator account. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     *            >Define Permissions for Multiple Administrators</a> in the
     *            <i>AWS CloudFormation User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperation withAdministrationRoleARN(String administrationRoleARN) {
        this.administrationRoleARN = administrationRoleARN;
        return this;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack
     * set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM execution role used to create or update the
     *         stack set.
     *         </p>
     *         <p>
     *         Use customized execution roles to control which stack resources
     *         users and groups can include in their stack sets.
     *         </p>
     */
    public String getExecutionRoleName() {
        return executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack
     * set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     *
     * @param executionRoleName <p>
     *            The name of the IAM execution role used to create or update
     *            the stack set.
     *            </p>
     *            <p>
     *            Use customized execution roles to control which stack
     *            resources users and groups can include in their stack sets.
     *            </p>
     */
    public void setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack
     * set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     *
     * @param executionRoleName <p>
     *            The name of the IAM execution role used to create or update
     *            the stack set.
     *            </p>
     *            <p>
     *            Use customized execution roles to control which stack
     *            resources users and groups can include in their stack sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperation withExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
        return this;
    }

    /**
     * <p>
     * The time at which the operation was initiated. Note that the creation
     * times for the stack set operation might differ from the creation time of
     * the individual stacks themselves. This is because AWS CloudFormation
     * needs to perform preparatory work for the operation, such as dispatching
     * the work to the requested Regions, before actually creating the first
     * stacks.
     * </p>
     *
     * @return <p>
     *         The time at which the operation was initiated. Note that the
     *         creation times for the stack set operation might differ from the
     *         creation time of the individual stacks themselves. This is
     *         because AWS CloudFormation needs to perform preparatory work for
     *         the operation, such as dispatching the work to the requested
     *         Regions, before actually creating the first stacks.
     *         </p>
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * <p>
     * The time at which the operation was initiated. Note that the creation
     * times for the stack set operation might differ from the creation time of
     * the individual stacks themselves. This is because AWS CloudFormation
     * needs to perform preparatory work for the operation, such as dispatching
     * the work to the requested Regions, before actually creating the first
     * stacks.
     * </p>
     *
     * @param creationTimestamp <p>
     *            The time at which the operation was initiated. Note that the
     *            creation times for the stack set operation might differ from
     *            the creation time of the individual stacks themselves. This is
     *            because AWS CloudFormation needs to perform preparatory work
     *            for the operation, such as dispatching the work to the
     *            requested Regions, before actually creating the first stacks.
     *            </p>
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The time at which the operation was initiated. Note that the creation
     * times for the stack set operation might differ from the creation time of
     * the individual stacks themselves. This is because AWS CloudFormation
     * needs to perform preparatory work for the operation, such as dispatching
     * the work to the requested Regions, before actually creating the first
     * stacks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimestamp <p>
     *            The time at which the operation was initiated. Note that the
     *            creation times for the stack set operation might differ from
     *            the creation time of the individual stacks themselves. This is
     *            because AWS CloudFormation needs to perform preparatory work
     *            for the operation, such as dispatching the work to the
     *            requested Regions, before actually creating the first stacks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperation withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * <p>
     * The time at which the stack set operation ended, across all accounts and
     * Regions specified. Note that this doesn't necessarily mean that the stack
     * set operation was successful, or even attempted, in each account or
     * Region.
     * </p>
     *
     * @return <p>
     *         The time at which the stack set operation ended, across all
     *         accounts and Regions specified. Note that this doesn't
     *         necessarily mean that the stack set operation was successful, or
     *         even attempted, in each account or Region.
     *         </p>
     */
    public java.util.Date getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * <p>
     * The time at which the stack set operation ended, across all accounts and
     * Regions specified. Note that this doesn't necessarily mean that the stack
     * set operation was successful, or even attempted, in each account or
     * Region.
     * </p>
     *
     * @param endTimestamp <p>
     *            The time at which the stack set operation ended, across all
     *            accounts and Regions specified. Note that this doesn't
     *            necessarily mean that the stack set operation was successful,
     *            or even attempted, in each account or Region.
     *            </p>
     */
    public void setEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * <p>
     * The time at which the stack set operation ended, across all accounts and
     * Regions specified. Note that this doesn't necessarily mean that the stack
     * set operation was successful, or even attempted, in each account or
     * Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTimestamp <p>
     *            The time at which the stack set operation ended, across all
     *            accounts and Regions specified. Note that this doesn't
     *            necessarily mean that the stack set operation was successful,
     *            or even attempted, in each account or Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperation withEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * affected by the stack operation.
     * </p>
     *
     * @return <p>
     *         [<code>Service-managed</code> permissions] The AWS Organizations
     *         accounts affected by the stack operation.
     *         </p>
     */
    public DeploymentTargets getDeploymentTargets() {
        return deploymentTargets;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * affected by the stack operation.
     * </p>
     *
     * @param deploymentTargets <p>
     *            [<code>Service-managed</code> permissions] The AWS
     *            Organizations accounts affected by the stack operation.
     *            </p>
     */
    public void setDeploymentTargets(DeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * affected by the stack operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentTargets <p>
     *            [<code>Service-managed</code> permissions] The AWS
     *            Organizations accounts affected by the stack operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperation withDeploymentTargets(DeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }

    /**
     * <p>
     * Detailed information about the drift status of the stack set. This
     * includes information about drift operations currently being performed on
     * the stack set.
     * </p>
     * <p>
     * this information will only be present for stack set operations whose
     * <code>Action</code> type is <code>DETECT_DRIFT</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
     * >Detecting Unmanaged Changes in Stack Sets</a> in the AWS CloudFormation
     * User Guide.
     * </p>
     *
     * @return <p>
     *         Detailed information about the drift status of the stack set.
     *         This includes information about drift operations currently being
     *         performed on the stack set.
     *         </p>
     *         <p>
     *         this information will only be present for stack set operations
     *         whose <code>Action</code> type is <code>DETECT_DRIFT</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
     *         >Detecting Unmanaged Changes in Stack Sets</a> in the AWS
     *         CloudFormation User Guide.
     *         </p>
     */
    public StackSetDriftDetectionDetails getStackSetDriftDetectionDetails() {
        return stackSetDriftDetectionDetails;
    }

    /**
     * <p>
     * Detailed information about the drift status of the stack set. This
     * includes information about drift operations currently being performed on
     * the stack set.
     * </p>
     * <p>
     * this information will only be present for stack set operations whose
     * <code>Action</code> type is <code>DETECT_DRIFT</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
     * >Detecting Unmanaged Changes in Stack Sets</a> in the AWS CloudFormation
     * User Guide.
     * </p>
     *
     * @param stackSetDriftDetectionDetails <p>
     *            Detailed information about the drift status of the stack set.
     *            This includes information about drift operations currently
     *            being performed on the stack set.
     *            </p>
     *            <p>
     *            this information will only be present for stack set operations
     *            whose <code>Action</code> type is <code>DETECT_DRIFT</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
     *            >Detecting Unmanaged Changes in Stack Sets</a> in the AWS
     *            CloudFormation User Guide.
     *            </p>
     */
    public void setStackSetDriftDetectionDetails(
            StackSetDriftDetectionDetails stackSetDriftDetectionDetails) {
        this.stackSetDriftDetectionDetails = stackSetDriftDetectionDetails;
    }

    /**
     * <p>
     * Detailed information about the drift status of the stack set. This
     * includes information about drift operations currently being performed on
     * the stack set.
     * </p>
     * <p>
     * this information will only be present for stack set operations whose
     * <code>Action</code> type is <code>DETECT_DRIFT</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
     * >Detecting Unmanaged Changes in Stack Sets</a> in the AWS CloudFormation
     * User Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetDriftDetectionDetails <p>
     *            Detailed information about the drift status of the stack set.
     *            This includes information about drift operations currently
     *            being performed on the stack set.
     *            </p>
     *            <p>
     *            this information will only be present for stack set operations
     *            whose <code>Action</code> type is <code>DETECT_DRIFT</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-drift.html"
     *            >Detecting Unmanaged Changes in Stack Sets</a> in the AWS
     *            CloudFormation User Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperation withStackSetDriftDetectionDetails(
            StackSetDriftDetectionDetails stackSetDriftDetectionDetails) {
        this.stackSetDriftDetectionDetails = stackSetDriftDetectionDetails;
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
        if (getOperationId() != null)
            sb.append("OperationId: " + getOperationId() + ",");
        if (getStackSetId() != null)
            sb.append("StackSetId: " + getStackSetId() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getOperationPreferences() != null)
            sb.append("OperationPreferences: " + getOperationPreferences() + ",");
        if (getRetainStacks() != null)
            sb.append("RetainStacks: " + getRetainStacks() + ",");
        if (getAdministrationRoleARN() != null)
            sb.append("AdministrationRoleARN: " + getAdministrationRoleARN() + ",");
        if (getExecutionRoleName() != null)
            sb.append("ExecutionRoleName: " + getExecutionRoleName() + ",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: " + getEndTimestamp() + ",");
        if (getDeploymentTargets() != null)
            sb.append("DeploymentTargets: " + getDeploymentTargets() + ",");
        if (getStackSetDriftDetectionDetails() != null)
            sb.append("StackSetDriftDetectionDetails: " + getStackSetDriftDetectionDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getStackSetId() == null) ? 0 : getStackSetId().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getOperationPreferences() == null) ? 0 : getOperationPreferences().hashCode());
        hashCode = prime * hashCode
                + ((getRetainStacks() == null) ? 0 : getRetainStacks().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdministrationRoleARN() == null) ? 0 : getAdministrationRoleARN().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleName() == null) ? 0 : getExecutionRoleName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentTargets() == null) ? 0 : getDeploymentTargets().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackSetDriftDetectionDetails() == null) ? 0
                        : getStackSetDriftDetectionDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetOperation == false)
            return false;
        StackSetOperation other = (StackSetOperation) obj;

        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null
                && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getStackSetId() == null ^ this.getStackSetId() == null)
            return false;
        if (other.getStackSetId() != null
                && other.getStackSetId().equals(this.getStackSetId()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOperationPreferences() == null ^ this.getOperationPreferences() == null)
            return false;
        if (other.getOperationPreferences() != null
                && other.getOperationPreferences().equals(this.getOperationPreferences()) == false)
            return false;
        if (other.getRetainStacks() == null ^ this.getRetainStacks() == null)
            return false;
        if (other.getRetainStacks() != null
                && other.getRetainStacks().equals(this.getRetainStacks()) == false)
            return false;
        if (other.getAdministrationRoleARN() == null ^ this.getAdministrationRoleARN() == null)
            return false;
        if (other.getAdministrationRoleARN() != null
                && other.getAdministrationRoleARN().equals(this.getAdministrationRoleARN()) == false)
            return false;
        if (other.getExecutionRoleName() == null ^ this.getExecutionRoleName() == null)
            return false;
        if (other.getExecutionRoleName() != null
                && other.getExecutionRoleName().equals(this.getExecutionRoleName()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null
                && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null
                && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
            return false;
        if (other.getDeploymentTargets() == null ^ this.getDeploymentTargets() == null)
            return false;
        if (other.getDeploymentTargets() != null
                && other.getDeploymentTargets().equals(this.getDeploymentTargets()) == false)
            return false;
        if (other.getStackSetDriftDetectionDetails() == null
                ^ this.getStackSetDriftDetectionDetails() == null)
            return false;
        if (other.getStackSetDriftDetectionDetails() != null
                && other.getStackSetDriftDetectionDetails().equals(
                        this.getStackSetDriftDetectionDetails()) == false)
            return false;
        return true;
    }
}
