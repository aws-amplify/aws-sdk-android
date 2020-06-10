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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * An AWS CloudFormation stack, in a specific account and region, that's part of
 * a stack set operation. A stack instance is a reference to an attempted or
 * actual stack in a given account within a given region. A stack instance can
 * exist without a stack—for example, if the stack couldn't be created for some
 * reason. A stack instance is associated with only one stack set. Each stack
 * instance contains the ID of its associated stack set, as well as the ID of
 * the actual stack and the stack status.
 * </p>
 */
public class StackInstance implements Serializable {
    /**
     * <p>
     * The name of the AWS account that the stack instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String account;

    /**
     * <p>
     * The name of the AWS region that the stack instance is associated with.
     * </p>
     */
    private String region;

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
     * <code>RetainStacks</code> set to true, to delete the stack instance, and
     * then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because either the associated stack failed during a
     * <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation, or
     * the stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
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
    private String stackInstanceStatus;

    /**
     * <p>
     * The name of the AWS account that the stack instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The name of the AWS account that the stack instance is associated
     *         with.
     *         </p>
     */
    public String getAccount() {
        return account;
    }

    /**
     * <p>
     * The name of the AWS account that the stack instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param account <p>
     *            The name of the AWS account that the stack instance is
     *            associated with.
     *            </p>
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The name of the AWS account that the stack instance is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param account <p>
     *            The name of the AWS account that the stack instance is
     *            associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackInstance withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * <p>
     * The name of the AWS region that the stack instance is associated with.
     * </p>
     *
     * @return <p>
     *         The name of the AWS region that the stack instance is associated
     *         with.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The name of the AWS region that the stack instance is associated with.
     * </p>
     *
     * @param region <p>
     *            The name of the AWS region that the stack instance is
     *            associated with.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the AWS region that the stack instance is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The name of the AWS region that the stack instance is
     *            associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackInstance withRegion(String region) {
        this.region = region;
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
     * <code>RetainStacks</code> set to true, to delete the stack instance, and
     * then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because either the associated stack failed during a
     * <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation, or
     * the stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
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
     *         <code>RetainStacks</code> set to true, to delete the stack
     *         instance, and then delete the stack manually.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OUTDATED</code>: The stack isn't currently up to date with
     *         the stack set because either the associated stack failed during a
     *         <code>CreateStackSet</code> or <code>UpdateStackSet</code>
     *         operation, or the stack was part of a <code>CreateStackSet</code>
     *         or <code>UpdateStackSet</code> operation that failed or was
     *         stopped before the stack was created or updated.
     *         </p>
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
    public String getStackInstanceStatus() {
        return stackInstanceStatus;
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
     * <code>RetainStacks</code> set to true, to delete the stack instance, and
     * then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because either the associated stack failed during a
     * <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation, or
     * the stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
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
     * @param stackInstanceStatus <p>
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
     *            <code>RetainStacks</code> set to true, to delete the stack
     *            instance, and then delete the stack manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUTDATED</code>: The stack isn't currently up to date
     *            with the stack set because either the associated stack failed
     *            during a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation, or the stack was part
     *            of a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation that failed or was
     *            stopped before the stack was created or updated.
     *            </p>
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
    public void setStackInstanceStatus(String stackInstanceStatus) {
        this.stackInstanceStatus = stackInstanceStatus;
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
     * <code>RetainStacks</code> set to true, to delete the stack instance, and
     * then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because either the associated stack failed during a
     * <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation, or
     * the stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
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
     * @param stackInstanceStatus <p>
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
     *            <code>RetainStacks</code> set to true, to delete the stack
     *            instance, and then delete the stack manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUTDATED</code>: The stack isn't currently up to date
     *            with the stack set because either the associated stack failed
     *            during a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation, or the stack was part
     *            of a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation that failed or was
     *            stopped before the stack was created or updated.
     *            </p>
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
    public StackInstance withStackInstanceStatus(String stackInstanceStatus) {
        this.stackInstanceStatus = stackInstanceStatus;
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
     * <code>RetainStacks</code> set to true, to delete the stack instance, and
     * then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because either the associated stack failed during a
     * <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation, or
     * the stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
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
     * @param stackInstanceStatus <p>
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
     *            <code>RetainStacks</code> set to true, to delete the stack
     *            instance, and then delete the stack manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUTDATED</code>: The stack isn't currently up to date
     *            with the stack set because either the associated stack failed
     *            during a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation, or the stack was part
     *            of a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation that failed or was
     *            stopped before the stack was created or updated.
     *            </p>
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
    public void setStackInstanceStatus(StackInstanceStatus stackInstanceStatus) {
        this.stackInstanceStatus = stackInstanceStatus.toString();
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
     * <code>RetainStacks</code> set to true, to delete the stack instance, and
     * then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the
     * stack set because either the associated stack failed during a
     * <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation, or
     * the stack was part of a <code>CreateStackSet</code> or
     * <code>UpdateStackSet</code> operation that failed or was stopped before
     * the stack was created or updated.
     * </p>
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
     * @param stackInstanceStatus <p>
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
     *            <code>RetainStacks</code> set to true, to delete the stack
     *            instance, and then delete the stack manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OUTDATED</code>: The stack isn't currently up to date
     *            with the stack set because either the associated stack failed
     *            during a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation, or the stack was part
     *            of a <code>CreateStackSet</code> or
     *            <code>UpdateStackSet</code> operation that failed or was
     *            stopped before the stack was created or updated.
     *            </p>
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
    public StackInstance withStackInstanceStatus(StackInstanceStatus stackInstanceStatus) {
        this.stackInstanceStatus = stackInstanceStatus.toString();
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
        if (getAccount() != null)
            sb.append("Account: " + getAccount() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getStackInstanceStatus() != null)
            sb.append("StackInstanceStatus: " + getStackInstanceStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getStackInstanceStatus() == null) ? 0 : getStackInstanceStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackInstance == false)
            return false;
        StackInstance other = (StackInstance) obj;

        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getStackInstanceStatus() == null ^ this.getStackInstanceStatus() == null)
            return false;
        if (other.getStackInstanceStatus() != null
                && other.getStackInstanceStatus().equals(this.getStackInstanceStatus()) == false)
            return false;
        return true;
    }
}
