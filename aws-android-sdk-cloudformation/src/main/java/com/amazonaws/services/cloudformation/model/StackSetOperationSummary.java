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
 * The structures that contain summary information about the specified
 * operation.
 * </p>
 */
public class StackSetOperationSummary implements Serializable {
    /**
     * <p>
     * The unique ID of the stack set operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String operationId;

    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or
     * <code>DELETE</code>. Create and delete operations affect only the
     * specified stack instances that are associated with the specified stack
     * set. Update operations affect both the stack set itself as well as
     * <i>all</i> associated stack set instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE, DETECT_DRIFT
     */
    private String action;

    /**
     * <p>
     * The overall status of the operation.
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
     * The unique ID of the stack set operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The unique ID of the stack set operation.
     *         </p>
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * <p>
     * The unique ID of the stack set operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param operationId <p>
     *            The unique ID of the stack set operation.
     *            </p>
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique ID of the stack set operation.
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
     *            The unique ID of the stack set operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationSummary withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or
     * <code>DELETE</code>. Create and delete operations affect only the
     * specified stack instances that are associated with the specified stack
     * set. Update operations affect both the stack set itself as well as
     * <i>all</i> associated stack set instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE, DETECT_DRIFT
     *
     * @return <p>
     *         The type of operation: <code>CREATE</code>, <code>UPDATE</code>,
     *         or <code>DELETE</code>. Create and delete operations affect only
     *         the specified stack instances that are associated with the
     *         specified stack set. Update operations affect both the stack set
     *         itself as well as <i>all</i> associated stack set instances.
     *         </p>
     * @see StackSetOperationAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or
     * <code>DELETE</code>. Create and delete operations affect only the
     * specified stack instances that are associated with the specified stack
     * set. Update operations affect both the stack set itself as well as
     * <i>all</i> associated stack set instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE, DETECT_DRIFT
     *
     * @param action <p>
     *            The type of operation: <code>CREATE</code>,
     *            <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *            operations affect only the specified stack instances that are
     *            associated with the specified stack set. Update operations
     *            affect both the stack set itself as well as <i>all</i>
     *            associated stack set instances.
     *            </p>
     * @see StackSetOperationAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or
     * <code>DELETE</code>. Create and delete operations affect only the
     * specified stack instances that are associated with the specified stack
     * set. Update operations affect both the stack set itself as well as
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
     *            The type of operation: <code>CREATE</code>,
     *            <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *            operations affect only the specified stack instances that are
     *            associated with the specified stack set. Update operations
     *            affect both the stack set itself as well as <i>all</i>
     *            associated stack set instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetOperationAction
     */
    public StackSetOperationSummary withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or
     * <code>DELETE</code>. Create and delete operations affect only the
     * specified stack instances that are associated with the specified stack
     * set. Update operations affect both the stack set itself as well as
     * <i>all</i> associated stack set instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE, DETECT_DRIFT
     *
     * @param action <p>
     *            The type of operation: <code>CREATE</code>,
     *            <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *            operations affect only the specified stack instances that are
     *            associated with the specified stack set. Update operations
     *            affect both the stack set itself as well as <i>all</i>
     *            associated stack set instances.
     *            </p>
     * @see StackSetOperationAction
     */
    public void setAction(StackSetOperationAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or
     * <code>DELETE</code>. Create and delete operations affect only the
     * specified stack instances that are associated with the specified stack
     * set. Update operations affect both the stack set itself as well as
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
     *            The type of operation: <code>CREATE</code>,
     *            <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *            operations affect only the specified stack instances that are
     *            associated with the specified stack set. Update operations
     *            affect both the stack set itself as well as <i>all</i>
     *            associated stack set instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetOperationAction
     */
    public StackSetOperationSummary withAction(StackSetOperationAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The overall status of the operation.
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
     *         The overall status of the operation.
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
     * The overall status of the operation.
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
     *            The overall status of the operation.
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
     * The overall status of the operation.
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
     *            The overall status of the operation.
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
    public StackSetOperationSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The overall status of the operation.
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
     *            The overall status of the operation.
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
     * The overall status of the operation.
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
     *            The overall status of the operation.
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
    public StackSetOperationSummary withStatus(StackSetOperationStatus status) {
        this.status = status.toString();
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
    public StackSetOperationSummary withCreationTimestamp(java.util.Date creationTimestamp) {
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
    public StackSetOperationSummary withEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: " + getEndTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetOperationSummary == false)
            return false;
        StackSetOperationSummary other = (StackSetOperationSummary) obj;

        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null
                && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        return true;
    }
}
