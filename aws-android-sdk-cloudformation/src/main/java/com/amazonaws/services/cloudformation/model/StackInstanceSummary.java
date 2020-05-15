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
 * The structure that contains summary information about a stack instance.
 * </p>
 */
public class StackInstanceSummary implements Serializable {
    /**
     * <p>
     * The name or unique ID of the stack set that the stack instance is
     * associated with.
     * </p>
     */
    private String stackSetId;

    /**
     * <p>
     * The name of the AWS Region that the stack instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     */
    private String region;

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The name of the AWS account that
     * the stack instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String account;

    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with
     * its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation
     * has failed and left the stack in an unstable state. Stacks in this state
     * are excluded from further <code>UpdateStackSet</code> operations. You
     * might need to perform a <code>DeleteStackInstances</code> operation, with
     * <code>RetainStacks</code> set to <code>true</code>, to delete the stack
     * instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack
     * set.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, OUTDATED, INOPERABLE
     */
    private String status;

    /**
     * <p>
     * The explanation for the specific status code assigned to this stack
     * instance.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * Reserved for internal use. No data returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$
     * <br/>
     */
    private String organizationalUnitId;

    /**
     * <p>
     * Status of the stack instance's actual configuration compared to the
     * expected template and parameter configuration of the stack set to which
     * it belongs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from the expected template and
     * parameter configuration of the stack set to which it belongs. A stack
     * instance is considered to have drifted if one or more of the resources in
     * the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * instance differs from its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack instance's actual configuration matches
     * its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     */
    private String driftStatus;

    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection
     * operation on the stack instance. This value will be <code>NULL</code> for
     * any stack instance on which drift detection has not yet been performed.
     * </p>
     */
    private java.util.Date lastDriftCheckTimestamp;

    /**
     * <p>
     * The name or unique ID of the stack set that the stack instance is
     * associated with.
     * </p>
     *
     * @return <p>
     *         The name or unique ID of the stack set that the stack instance is
     *         associated with.
     *         </p>
     */
    public String getStackSetId() {
        return stackSetId;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that the stack instance is
     * associated with.
     * </p>
     *
     * @param stackSetId <p>
     *            The name or unique ID of the stack set that the stack instance
     *            is associated with.
     *            </p>
     */
    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that the stack instance is
     * associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetId <p>
     *            The name or unique ID of the stack set that the stack instance
     *            is associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackInstanceSummary withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * <p>
     * The name of the AWS Region that the stack instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     *
     * @return <p>
     *         The name of the AWS Region that the stack instance is associated
     *         with.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The name of the AWS Region that the stack instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     *
     * @param region <p>
     *            The name of the AWS Region that the stack instance is
     *            associated with.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the AWS Region that the stack instance is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     *
     * @param region <p>
     *            The name of the AWS Region that the stack instance is
     *            associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackInstanceSummary withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The name of the AWS account that
     * the stack instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         [<code>Self-managed</code> permissions] The name of the AWS
     *         account that the stack instance is associated with.
     *         </p>
     */
    public String getAccount() {
        return account;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The name of the AWS account that
     * the stack instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param account <p>
     *            [<code>Self-managed</code> permissions] The name of the AWS
     *            account that the stack instance is associated with.
     *            </p>
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The name of the AWS account that
     * the stack instance is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param account <p>
     *            [<code>Self-managed</code> permissions] The name of the AWS
     *            account that the stack instance is associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackInstanceSummary withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     *
     * @return <p>
     *         The ID of the stack instance.
     *         </p>
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     *
     * @param stackId <p>
     *            The ID of the stack instance.
     *            </p>
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackId <p>
     *            The ID of the stack instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackInstanceSummary withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with
     * its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation
     * has failed and left the stack in an unstable state. Stacks in this state
     * are excluded from further <code>UpdateStackSet</code> operations. You
     * might need to perform a <code>DeleteStackInstances</code> operation, with
     * <code>RetainStacks</code> set to <code>true</code>, to delete the stack
     * instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack
     * set.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, OUTDATED, INOPERABLE
     *
     * @return <p>
     *         The status of the stack instance, in terms of its synchronization
     *         with its associated stack set.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INOPERABLE</code>: A <code>DeleteStackInstances</code>
     *         operation has failed and left the stack in an unstable state.
     *         Stacks in this state are excluded from further
     *         <code>UpdateStackSet</code> operations. You might need to perform
     *         a <code>DeleteStackInstances</code> operation, with
     *         <code>RetainStacks</code> set to <code>true</code>, to delete the
     *         stack instance, and then delete the stack manually.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OUTDATED</code>: The stack isn't currently up to date with
     *         the stack set because:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The associated stack failed during a <code>CreateStackSet</code>
     *         or <code>UpdateStackSet</code> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The stack was part of a <code>CreateStackSet</code> or
     *         <code>UpdateStackSet</code> operation that failed or was stopped
     *         before the stack was created or updated.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CURRENT</code>: The stack is currently up to date with the
     *         stack set.
     *         </p>
     *         </li>
     *         </ul>
     * @see StackInstanceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with
     * its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation
     * has failed and left the stack in an unstable state. Stacks in this state
     * are excluded from further <code>UpdateStackSet</code> operations. You
     * might need to perform a <code>DeleteStackInstances</code> operation, with
     * <code>RetainStacks</code> set to <code>true</code>, to delete the stack
     * instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack
     * set.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, OUTDATED, INOPERABLE
     *
     * @param status <p>
     *            The status of the stack instance, in terms of its
     *            synchronization with its associated stack set.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INOPERABLE</code>: A <code>DeleteStackInstances</code>
     *            operation has failed and left the stack in an unstable state.
     *            Stacks in this state are excluded from further
     *            <code>UpdateStackSet</code> operations. You might need to
     *            perform a <code>DeleteStackInstances</code> operation, with
     *            <code>RetainStacks</code> set to <code>true</code>, to delete
     *            the stack instance, and then delete the stack manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUTDATED</code>: The stack isn't currently up to date
     *            with the stack set because:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The associated stack failed during a
     *            <code>CreateStackSet</code> or <code>UpdateStackSet</code>
     *            operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The stack was part of a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation that failed or was
     *            stopped before the stack was created or updated.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CURRENT</code>: The stack is currently up to date with
     *            the stack set.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackInstanceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with
     * its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation
     * has failed and left the stack in an unstable state. Stacks in this state
     * are excluded from further <code>UpdateStackSet</code> operations. You
     * might need to perform a <code>DeleteStackInstances</code> operation, with
     * <code>RetainStacks</code> set to <code>true</code>, to delete the stack
     * instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack
     * set.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, OUTDATED, INOPERABLE
     *
     * @param status <p>
     *            The status of the stack instance, in terms of its
     *            synchronization with its associated stack set.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INOPERABLE</code>: A <code>DeleteStackInstances</code>
     *            operation has failed and left the stack in an unstable state.
     *            Stacks in this state are excluded from further
     *            <code>UpdateStackSet</code> operations. You might need to
     *            perform a <code>DeleteStackInstances</code> operation, with
     *            <code>RetainStacks</code> set to <code>true</code>, to delete
     *            the stack instance, and then delete the stack manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUTDATED</code>: The stack isn't currently up to date
     *            with the stack set because:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The associated stack failed during a
     *            <code>CreateStackSet</code> or <code>UpdateStackSet</code>
     *            operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The stack was part of a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation that failed or was
     *            stopped before the stack was created or updated.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CURRENT</code>: The stack is currently up to date with
     *            the stack set.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackInstanceStatus
     */
    public StackInstanceSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with
     * its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation
     * has failed and left the stack in an unstable state. Stacks in this state
     * are excluded from further <code>UpdateStackSet</code> operations. You
     * might need to perform a <code>DeleteStackInstances</code> operation, with
     * <code>RetainStacks</code> set to <code>true</code>, to delete the stack
     * instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack
     * set.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, OUTDATED, INOPERABLE
     *
     * @param status <p>
     *            The status of the stack instance, in terms of its
     *            synchronization with its associated stack set.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INOPERABLE</code>: A <code>DeleteStackInstances</code>
     *            operation has failed and left the stack in an unstable state.
     *            Stacks in this state are excluded from further
     *            <code>UpdateStackSet</code> operations. You might need to
     *            perform a <code>DeleteStackInstances</code> operation, with
     *            <code>RetainStacks</code> set to <code>true</code>, to delete
     *            the stack instance, and then delete the stack manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUTDATED</code>: The stack isn't currently up to date
     *            with the stack set because:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The associated stack failed during a
     *            <code>CreateStackSet</code> or <code>UpdateStackSet</code>
     *            operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The stack was part of a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation that failed or was
     *            stopped before the stack was created or updated.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CURRENT</code>: The stack is currently up to date with
     *            the stack set.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackInstanceStatus
     */
    public void setStatus(StackInstanceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with
     * its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation
     * has failed and left the stack in an unstable state. Stacks in this state
     * are excluded from further <code>UpdateStackSet</code> operations. You
     * might need to perform a <code>DeleteStackInstances</code> operation, with
     * <code>RetainStacks</code> set to <code>true</code>, to delete the stack
     * instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack
     * set.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CURRENT, OUTDATED, INOPERABLE
     *
     * @param status <p>
     *            The status of the stack instance, in terms of its
     *            synchronization with its associated stack set.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INOPERABLE</code>: A <code>DeleteStackInstances</code>
     *            operation has failed and left the stack in an unstable state.
     *            Stacks in this state are excluded from further
     *            <code>UpdateStackSet</code> operations. You might need to
     *            perform a <code>DeleteStackInstances</code> operation, with
     *            <code>RetainStacks</code> set to <code>true</code>, to delete
     *            the stack instance, and then delete the stack manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUTDATED</code>: The stack isn't currently up to date
     *            with the stack set because:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The associated stack failed during a
     *            <code>CreateStackSet</code> or <code>UpdateStackSet</code>
     *            operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The stack was part of a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation that failed or was
     *            stopped before the stack was created or updated.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CURRENT</code>: The stack is currently up to date with
     *            the stack set.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackInstanceStatus
     */
    public StackInstanceSummary withStatus(StackInstanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The explanation for the specific status code assigned to this stack
     * instance.
     * </p>
     *
     * @return <p>
     *         The explanation for the specific status code assigned to this
     *         stack instance.
     *         </p>
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * The explanation for the specific status code assigned to this stack
     * instance.
     * </p>
     *
     * @param statusReason <p>
     *            The explanation for the specific status code assigned to this
     *            stack instance.
     *            </p>
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The explanation for the specific status code assigned to this stack
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReason <p>
     *            The explanation for the specific status code assigned to this
     *            stack instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackInstanceSummary withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * Reserved for internal use. No data returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$
     * <br/>
     *
     * @return <p>
     *         Reserved for internal use. No data returned.
     *         </p>
     */
    public String getOrganizationalUnitId() {
        return organizationalUnitId;
    }

    /**
     * <p>
     * Reserved for internal use. No data returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$
     * <br/>
     *
     * @param organizationalUnitId <p>
     *            Reserved for internal use. No data returned.
     *            </p>
     */
    public void setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
    }

    /**
     * <p>
     * Reserved for internal use. No data returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(ou-[a-z0-9]{4,32}-[a-z0-9]{8,32}|r-[a-z0-9]{4,32})$
     * <br/>
     *
     * @param organizationalUnitId <p>
     *            Reserved for internal use. No data returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackInstanceSummary withOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }

    /**
     * <p>
     * Status of the stack instance's actual configuration compared to the
     * expected template and parameter configuration of the stack set to which
     * it belongs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from the expected template and
     * parameter configuration of the stack set to which it belongs. A stack
     * instance is considered to have drifted if one or more of the resources in
     * the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * instance differs from its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack instance's actual configuration matches
     * its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     *
     * @return <p>
     *         Status of the stack instance's actual configuration compared to
     *         the expected template and parameter configuration of the stack
     *         set to which it belongs.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DRIFTED</code>: The stack differs from the expected
     *         template and parameter configuration of the stack set to which it
     *         belongs. A stack instance is considered to have drifted if one or
     *         more of the resources in the associated stack have drifted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if
     *         the stack instance differs from its expected stack set
     *         configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The stack instance's actual configuration
     *         matches its expected stack set configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNKNOWN</code>: This value is reserved for future use.
     *         </p>
     *         </li>
     *         </ul>
     * @see StackDriftStatus
     */
    public String getDriftStatus() {
        return driftStatus;
    }

    /**
     * <p>
     * Status of the stack instance's actual configuration compared to the
     * expected template and parameter configuration of the stack set to which
     * it belongs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from the expected template and
     * parameter configuration of the stack set to which it belongs. A stack
     * instance is considered to have drifted if one or more of the resources in
     * the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * instance differs from its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack instance's actual configuration matches
     * its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     *
     * @param driftStatus <p>
     *            Status of the stack instance's actual configuration compared
     *            to the expected template and parameter configuration of the
     *            stack set to which it belongs.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: The stack differs from the expected
     *            template and parameter configuration of the stack set to which
     *            it belongs. A stack instance is considered to have drifted if
     *            one or more of the resources in the associated stack have
     *            drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the stack instance differs from its expected stack set
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The stack instance's actual
     *            configuration matches its expected stack set configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code>: This value is reserved for future use.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackDriftStatus
     */
    public void setDriftStatus(String driftStatus) {
        this.driftStatus = driftStatus;
    }

    /**
     * <p>
     * Status of the stack instance's actual configuration compared to the
     * expected template and parameter configuration of the stack set to which
     * it belongs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from the expected template and
     * parameter configuration of the stack set to which it belongs. A stack
     * instance is considered to have drifted if one or more of the resources in
     * the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * instance differs from its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack instance's actual configuration matches
     * its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     *
     * @param driftStatus <p>
     *            Status of the stack instance's actual configuration compared
     *            to the expected template and parameter configuration of the
     *            stack set to which it belongs.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: The stack differs from the expected
     *            template and parameter configuration of the stack set to which
     *            it belongs. A stack instance is considered to have drifted if
     *            one or more of the resources in the associated stack have
     *            drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the stack instance differs from its expected stack set
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The stack instance's actual
     *            configuration matches its expected stack set configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code>: This value is reserved for future use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackDriftStatus
     */
    public StackInstanceSummary withDriftStatus(String driftStatus) {
        this.driftStatus = driftStatus;
        return this;
    }

    /**
     * <p>
     * Status of the stack instance's actual configuration compared to the
     * expected template and parameter configuration of the stack set to which
     * it belongs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from the expected template and
     * parameter configuration of the stack set to which it belongs. A stack
     * instance is considered to have drifted if one or more of the resources in
     * the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * instance differs from its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack instance's actual configuration matches
     * its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     *
     * @param driftStatus <p>
     *            Status of the stack instance's actual configuration compared
     *            to the expected template and parameter configuration of the
     *            stack set to which it belongs.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: The stack differs from the expected
     *            template and parameter configuration of the stack set to which
     *            it belongs. A stack instance is considered to have drifted if
     *            one or more of the resources in the associated stack have
     *            drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the stack instance differs from its expected stack set
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The stack instance's actual
     *            configuration matches its expected stack set configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code>: This value is reserved for future use.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackDriftStatus
     */
    public void setDriftStatus(StackDriftStatus driftStatus) {
        this.driftStatus = driftStatus.toString();
    }

    /**
     * <p>
     * Status of the stack instance's actual configuration compared to the
     * expected template and parameter configuration of the stack set to which
     * it belongs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: The stack differs from the expected template and
     * parameter configuration of the stack set to which it belongs. A stack
     * instance is considered to have drifted if one or more of the resources in
     * the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked if the stack
     * instance differs from its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The stack instance's actual configuration matches
     * its expected stack set configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRIFTED, IN_SYNC, UNKNOWN, NOT_CHECKED
     *
     * @param driftStatus <p>
     *            Status of the stack instance's actual configuration compared
     *            to the expected template and parameter configuration of the
     *            stack set to which it belongs.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DRIFTED</code>: The stack differs from the expected
     *            template and parameter configuration of the stack set to which
     *            it belongs. A stack instance is considered to have drifted if
     *            one or more of the resources in the associated stack have
     *            drifted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation has not checked
     *            if the stack instance differs from its expected stack set
     *            configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The stack instance's actual
     *            configuration matches its expected stack set configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN</code>: This value is reserved for future use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackDriftStatus
     */
    public StackInstanceSummary withDriftStatus(StackDriftStatus driftStatus) {
        this.driftStatus = driftStatus.toString();
        return this;
    }

    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection
     * operation on the stack instance. This value will be <code>NULL</code> for
     * any stack instance on which drift detection has not yet been performed.
     * </p>
     *
     * @return <p>
     *         Most recent time when CloudFormation performed a drift detection
     *         operation on the stack instance. This value will be
     *         <code>NULL</code> for any stack instance on which drift detection
     *         has not yet been performed.
     *         </p>
     */
    public java.util.Date getLastDriftCheckTimestamp() {
        return lastDriftCheckTimestamp;
    }

    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection
     * operation on the stack instance. This value will be <code>NULL</code> for
     * any stack instance on which drift detection has not yet been performed.
     * </p>
     *
     * @param lastDriftCheckTimestamp <p>
     *            Most recent time when CloudFormation performed a drift
     *            detection operation on the stack instance. This value will be
     *            <code>NULL</code> for any stack instance on which drift
     *            detection has not yet been performed.
     *            </p>
     */
    public void setLastDriftCheckTimestamp(java.util.Date lastDriftCheckTimestamp) {
        this.lastDriftCheckTimestamp = lastDriftCheckTimestamp;
    }

    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection
     * operation on the stack instance. This value will be <code>NULL</code> for
     * any stack instance on which drift detection has not yet been performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastDriftCheckTimestamp <p>
     *            Most recent time when CloudFormation performed a drift
     *            detection operation on the stack instance. This value will be
     *            <code>NULL</code> for any stack instance on which drift
     *            detection has not yet been performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackInstanceSummary withLastDriftCheckTimestamp(java.util.Date lastDriftCheckTimestamp) {
        this.lastDriftCheckTimestamp = lastDriftCheckTimestamp;
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
        if (getStackSetId() != null)
            sb.append("StackSetId: " + getStackSetId() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getAccount() != null)
            sb.append("Account: " + getAccount() + ",");
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusReason() != null)
            sb.append("StatusReason: " + getStatusReason() + ",");
        if (getOrganizationalUnitId() != null)
            sb.append("OrganizationalUnitId: " + getOrganizationalUnitId() + ",");
        if (getDriftStatus() != null)
            sb.append("DriftStatus: " + getDriftStatus() + ",");
        if (getLastDriftCheckTimestamp() != null)
            sb.append("LastDriftCheckTimestamp: " + getLastDriftCheckTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetId() == null) ? 0 : getStackSetId().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode
                + ((getOrganizationalUnitId() == null) ? 0 : getOrganizationalUnitId().hashCode());
        hashCode = prime * hashCode
                + ((getDriftStatus() == null) ? 0 : getDriftStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastDriftCheckTimestamp() == null) ? 0 : getLastDriftCheckTimestamp()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackInstanceSummary == false)
            return false;
        StackInstanceSummary other = (StackInstanceSummary) obj;

        if (other.getStackSetId() == null ^ this.getStackSetId() == null)
            return false;
        if (other.getStackSetId() != null
                && other.getStackSetId().equals(this.getStackSetId()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getOrganizationalUnitId() == null ^ this.getOrganizationalUnitId() == null)
            return false;
        if (other.getOrganizationalUnitId() != null
                && other.getOrganizationalUnitId().equals(this.getOrganizationalUnitId()) == false)
            return false;
        if (other.getDriftStatus() == null ^ this.getDriftStatus() == null)
            return false;
        if (other.getDriftStatus() != null
                && other.getDriftStatus().equals(this.getDriftStatus()) == false)
            return false;
        if (other.getLastDriftCheckTimestamp() == null ^ this.getLastDriftCheckTimestamp() == null)
            return false;
        if (other.getLastDriftCheckTimestamp() != null
                && other.getLastDriftCheckTimestamp().equals(this.getLastDriftCheckTimestamp()) == false)
            return false;
        return true;
    }
}
