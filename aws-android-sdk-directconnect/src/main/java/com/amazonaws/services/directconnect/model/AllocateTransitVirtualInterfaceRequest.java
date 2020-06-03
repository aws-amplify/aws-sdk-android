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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provisions a transit virtual interface to be owned by the specified AWS
 * account. Use this type of interface to connect a transit gateway to your
 * Direct Connect gateway.
 * </p>
 * <p>
 * The owner of a connection provisions a transit virtual interface to be owned
 * by the specified AWS account.
 * </p>
 * <p>
 * After you create a transit virtual interface, it must be confirmed by the
 * owner using <a>ConfirmTransitVirtualInterface</a>. Until this step has been
 * completed, the transit virtual interface is in the <code>requested</code>
 * state and is not available to handle traffic.
 * </p>
 */
public class AllocateTransitVirtualInterfaceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the connection on which the transit virtual interface is
     * provisioned.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The ID of the AWS account that owns the transit virtual interface.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     */
    private NewTransitVirtualInterfaceAllocation newTransitVirtualInterfaceAllocation;

    /**
     * <p>
     * The ID of the connection on which the transit virtual interface is
     * provisioned.
     * </p>
     *
     * @return <p>
     *         The ID of the connection on which the transit virtual interface
     *         is provisioned.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the connection on which the transit virtual interface is
     * provisioned.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the connection on which the transit virtual
     *            interface is provisioned.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection on which the transit virtual interface is
     * provisioned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the connection on which the transit virtual
     *            interface is provisioned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateTransitVirtualInterfaceRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit virtual interface.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the transit virtual
     *         interface.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit virtual interface.
     * </p>
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the transit virtual
     *            interface.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the transit virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the transit virtual
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateTransitVirtualInterfaceRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     *
     * @return <p>
     *         Information about the transit virtual interface.
     *         </p>
     */
    public NewTransitVirtualInterfaceAllocation getNewTransitVirtualInterfaceAllocation() {
        return newTransitVirtualInterfaceAllocation;
    }

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     *
     * @param newTransitVirtualInterfaceAllocation <p>
     *            Information about the transit virtual interface.
     *            </p>
     */
    public void setNewTransitVirtualInterfaceAllocation(
            NewTransitVirtualInterfaceAllocation newTransitVirtualInterfaceAllocation) {
        this.newTransitVirtualInterfaceAllocation = newTransitVirtualInterfaceAllocation;
    }

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newTransitVirtualInterfaceAllocation <p>
     *            Information about the transit virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateTransitVirtualInterfaceRequest withNewTransitVirtualInterfaceAllocation(
            NewTransitVirtualInterfaceAllocation newTransitVirtualInterfaceAllocation) {
        this.newTransitVirtualInterfaceAllocation = newTransitVirtualInterfaceAllocation;
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
        if (getConnectionId() != null)
            sb.append("connectionId: " + getConnectionId() + ",");
        if (getOwnerAccount() != null)
            sb.append("ownerAccount: " + getOwnerAccount() + ",");
        if (getNewTransitVirtualInterfaceAllocation() != null)
            sb.append("newTransitVirtualInterfaceAllocation: "
                    + getNewTransitVirtualInterfaceAllocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewTransitVirtualInterfaceAllocation() == null) ? 0
                        : getNewTransitVirtualInterfaceAllocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateTransitVirtualInterfaceRequest == false)
            return false;
        AllocateTransitVirtualInterfaceRequest other = (AllocateTransitVirtualInterfaceRequest) obj;

        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getNewTransitVirtualInterfaceAllocation() == null
                ^ this.getNewTransitVirtualInterfaceAllocation() == null)
            return false;
        if (other.getNewTransitVirtualInterfaceAllocation() != null
                && other.getNewTransitVirtualInterfaceAllocation().equals(
                        this.getNewTransitVirtualInterfaceAllocation()) == false)
            return false;
        return true;
    }
}
