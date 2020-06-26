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
 * The detailed status of the stack instance.
 * </p>
 */
public class StackInstanceComprehensiveStatus implements Serializable {
    /**
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed. If the stack set operation fails in enough accounts within a
     * Region, the failure tolerance for the stack set operation as a whole
     * might be exceeded.
     * </p>
     * </li>
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
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED,
     * INOPERABLE
     */
    private String detailedStatus;

    /**
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed. If the stack set operation fails in enough accounts within a
     * Region, the failure tolerance for the stack set operation as a whole
     * might be exceeded.
     * </p>
     * </li>
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
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED,
     * INOPERABLE
     *
     * @return <ul>
     *         <li>
     *         <p>
     *         <code>CANCELLED</code>: The operation in the specified account
     *         and Region has been cancelled. This is either because a user has
     *         stopped the stack set operation, or because the failure tolerance
     *         of the stack set operation has been exceeded.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>FAILED</code>: The operation in the specified account and
     *         Region failed. If the stack set operation fails in enough
     *         accounts within a Region, the failure tolerance for the stack set
     *         operation as a whole might be exceeded.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>INOPERABLE</code>: A <code>DeleteStackInstances</code>
     *         operation has failed and left the stack in an unstable state.
     *         Stacks in this state are excluded from further <code>
     *         UpdateStackSet</code> operations. You might need to perform a
     *         <code>DeleteStackInstances</code> operation, with <code>
     *         RetainStacks</code> set to <code>true</code>, to delete the stack
     *         instance, and then delete the stack manually.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>PENDING</code>: The operation in the specified account and
     *         Region has yet to start.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>RUNNING</code>: The operation in the specified account and
     *         Region is currently in progress.
     *         </p>
     *         </li> <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The operation in the specified account
     *         and Region completed successfully.
     *         </p>
     *         </li>
     *         </ul>
     * @see StackInstanceDetailedStatus
     */
    public String getDetailedStatus() {
        return detailedStatus;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed. If the stack set operation fails in enough accounts within a
     * Region, the failure tolerance for the stack set operation as a whole
     * might be exceeded.
     * </p>
     * </li>
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
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED,
     * INOPERABLE
     *
     * @param detailedStatus <ul>
     *            <li>
     *            <p>
     *            <code>CANCELLED</code>: The operation in the specified account
     *            and Region has been cancelled. This is either because a user
     *            has stopped the stack set operation, or because the failure
     *            tolerance of the stack set operation has been exceeded.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>FAILED</code>: The operation in the specified account
     *            and Region failed. If the stack set operation fails in enough
     *            accounts within a Region, the failure tolerance for the stack
     *            set operation as a whole might be exceeded.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>INOPERABLE</code>: A <code>DeleteStackInstances</code>
     *            operation has failed and left the stack in an unstable state.
     *            Stacks in this state are excluded from further <code>
     *            UpdateStackSet</code> operations. You might need to perform a
     *            <code>DeleteStackInstances</code> operation, with <code>
     *            RetainStacks</code> set to <code>true</code>, to delete the
     *            stack instance, and then delete the stack manually.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>PENDING</code>: The operation in the specified account
     *            and Region has yet to start.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>RUNNING</code>: The operation in the specified account
     *            and Region is currently in progress.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation in the specified account
     *            and Region completed successfully.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackInstanceDetailedStatus
     */
    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed. If the stack set operation fails in enough accounts within a
     * Region, the failure tolerance for the stack set operation as a whole
     * might be exceeded.
     * </p>
     * </li>
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
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED,
     * INOPERABLE
     *
     * @param detailedStatus <ul>
     *            <li>
     *            <p>
     *            <code>CANCELLED</code>: The operation in the specified account
     *            and Region has been cancelled. This is either because a user
     *            has stopped the stack set operation, or because the failure
     *            tolerance of the stack set operation has been exceeded.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>FAILED</code>: The operation in the specified account
     *            and Region failed. If the stack set operation fails in enough
     *            accounts within a Region, the failure tolerance for the stack
     *            set operation as a whole might be exceeded.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>INOPERABLE</code>: A <code>DeleteStackInstances</code>
     *            operation has failed and left the stack in an unstable state.
     *            Stacks in this state are excluded from further <code>
     *            UpdateStackSet</code> operations. You might need to perform a
     *            <code>DeleteStackInstances</code> operation, with <code>
     *            RetainStacks</code> set to <code>true</code>, to delete the
     *            stack instance, and then delete the stack manually.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>PENDING</code>: The operation in the specified account
     *            and Region has yet to start.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>RUNNING</code>: The operation in the specified account
     *            and Region is currently in progress.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation in the specified account
     *            and Region completed successfully.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackInstanceDetailedStatus
     */
    public StackInstanceComprehensiveStatus withDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
        return this;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed. If the stack set operation fails in enough accounts within a
     * Region, the failure tolerance for the stack set operation as a whole
     * might be exceeded.
     * </p>
     * </li>
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
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED,
     * INOPERABLE
     *
     * @param detailedStatus <ul>
     *            <li>
     *            <p>
     *            <code>CANCELLED</code>: The operation in the specified account
     *            and Region has been cancelled. This is either because a user
     *            has stopped the stack set operation, or because the failure
     *            tolerance of the stack set operation has been exceeded.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>FAILED</code>: The operation in the specified account
     *            and Region failed. If the stack set operation fails in enough
     *            accounts within a Region, the failure tolerance for the stack
     *            set operation as a whole might be exceeded.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>INOPERABLE</code>: A <code>DeleteStackInstances</code>
     *            operation has failed and left the stack in an unstable state.
     *            Stacks in this state are excluded from further <code>
     *            UpdateStackSet</code> operations. You might need to perform a
     *            <code>DeleteStackInstances</code> operation, with <code>
     *            RetainStacks</code> set to <code>true</code>, to delete the
     *            stack instance, and then delete the stack manually.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>PENDING</code>: The operation in the specified account
     *            and Region has yet to start.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>RUNNING</code>: The operation in the specified account
     *            and Region is currently in progress.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation in the specified account
     *            and Region completed successfully.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackInstanceDetailedStatus
     */
    public void setDetailedStatus(StackInstanceDetailedStatus detailedStatus) {
        this.detailedStatus = detailedStatus.toString();
    }

    /**
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and Region
     * has been cancelled. This is either because a user has stopped the stack
     * set operation, or because the failure tolerance of the stack set
     * operation has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and Region
     * failed. If the stack set operation fails in enough accounts within a
     * Region, the failure tolerance for the stack set operation as a whole
     * might be exceeded.
     * </p>
     * </li>
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
     * <code>PENDING</code>: The operation in the specified account and Region
     * has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and Region
     * is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and Region
     * completed successfully.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, SUCCEEDED, FAILED, CANCELLED,
     * INOPERABLE
     *
     * @param detailedStatus <ul>
     *            <li>
     *            <p>
     *            <code>CANCELLED</code>: The operation in the specified account
     *            and Region has been cancelled. This is either because a user
     *            has stopped the stack set operation, or because the failure
     *            tolerance of the stack set operation has been exceeded.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>FAILED</code>: The operation in the specified account
     *            and Region failed. If the stack set operation fails in enough
     *            accounts within a Region, the failure tolerance for the stack
     *            set operation as a whole might be exceeded.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>INOPERABLE</code>: A <code>DeleteStackInstances</code>
     *            operation has failed and left the stack in an unstable state.
     *            Stacks in this state are excluded from further <code>
     *            UpdateStackSet</code> operations. You might need to perform a
     *            <code>DeleteStackInstances</code> operation, with <code>
     *            RetainStacks</code> set to <code>true</code>, to delete the
     *            stack instance, and then delete the stack manually.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>PENDING</code>: The operation in the specified account
     *            and Region has yet to start.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>RUNNING</code>: The operation in the specified account
     *            and Region is currently in progress.
     *            </p>
     *            </li> <li>
     *            <p>
     *            <code>SUCCEEDED</code>: The operation in the specified account
     *            and Region completed successfully.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackInstanceDetailedStatus
     */
    public StackInstanceComprehensiveStatus withDetailedStatus(
            StackInstanceDetailedStatus detailedStatus) {
        this.detailedStatus = detailedStatus.toString();
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
        if (getDetailedStatus() != null)
            sb.append("DetailedStatus: " + getDetailedStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDetailedStatus() == null) ? 0 : getDetailedStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackInstanceComprehensiveStatus == false)
            return false;
        StackInstanceComprehensiveStatus other = (StackInstanceComprehensiveStatus) obj;

        if (other.getDetailedStatus() == null ^ this.getDetailedStatus() == null)
            return false;
        if (other.getDetailedStatus() != null
                && other.getDetailedStatus().equals(this.getDetailedStatus()) == false)
            return false;
        return true;
    }
}
