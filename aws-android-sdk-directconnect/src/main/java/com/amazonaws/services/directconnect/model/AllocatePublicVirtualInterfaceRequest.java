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
 * Provisions a public virtual interface to be owned by the specified AWS
 * account.
 * </p>
 * <p>
 * The owner of a connection calls this function to provision a public virtual
 * interface to be owned by the specified AWS account.
 * </p>
 * <p>
 * Virtual interfaces created using this function must be confirmed by the owner
 * using <a>ConfirmPublicVirtualInterface</a>. Until this step has been
 * completed, the virtual interface is in the <code>confirming</code> state and
 * is not available to handle traffic.
 * </p>
 * <p>
 * When creating an IPv6 public virtual interface, omit the Amazon address and
 * customer address. IPv6 addresses are automatically assigned from the Amazon
 * pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
 * </p>
 */
public class AllocatePublicVirtualInterfaceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the connection on which the public virtual interface is
     * provisioned.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The ID of the AWS account that owns the public virtual interface.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     */
    private NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation;

    /**
     * <p>
     * The ID of the connection on which the public virtual interface is
     * provisioned.
     * </p>
     *
     * @return <p>
     *         The ID of the connection on which the public virtual interface is
     *         provisioned.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the connection on which the public virtual interface is
     * provisioned.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the connection on which the public virtual interface
     *            is provisioned.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection on which the public virtual interface is
     * provisioned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the connection on which the public virtual interface
     *            is provisioned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocatePublicVirtualInterfaceRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the public virtual interface.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the public virtual interface.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the public virtual interface.
     * </p>
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the public virtual
     *            interface.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the public virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the public virtual
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocatePublicVirtualInterfaceRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     *
     * @return <p>
     *         Information about the public virtual interface.
     *         </p>
     */
    public NewPublicVirtualInterfaceAllocation getNewPublicVirtualInterfaceAllocation() {
        return newPublicVirtualInterfaceAllocation;
    }

    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     *
     * @param newPublicVirtualInterfaceAllocation <p>
     *            Information about the public virtual interface.
     *            </p>
     */
    public void setNewPublicVirtualInterfaceAllocation(
            NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation) {
        this.newPublicVirtualInterfaceAllocation = newPublicVirtualInterfaceAllocation;
    }

    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newPublicVirtualInterfaceAllocation <p>
     *            Information about the public virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocatePublicVirtualInterfaceRequest withNewPublicVirtualInterfaceAllocation(
            NewPublicVirtualInterfaceAllocation newPublicVirtualInterfaceAllocation) {
        this.newPublicVirtualInterfaceAllocation = newPublicVirtualInterfaceAllocation;
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
        if (getNewPublicVirtualInterfaceAllocation() != null)
            sb.append("newPublicVirtualInterfaceAllocation: "
                    + getNewPublicVirtualInterfaceAllocation());
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
                + ((getNewPublicVirtualInterfaceAllocation() == null) ? 0
                        : getNewPublicVirtualInterfaceAllocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocatePublicVirtualInterfaceRequest == false)
            return false;
        AllocatePublicVirtualInterfaceRequest other = (AllocatePublicVirtualInterfaceRequest) obj;

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
        if (other.getNewPublicVirtualInterfaceAllocation() == null
                ^ this.getNewPublicVirtualInterfaceAllocation() == null)
            return false;
        if (other.getNewPublicVirtualInterfaceAllocation() != null
                && other.getNewPublicVirtualInterfaceAllocation().equals(
                        this.getNewPublicVirtualInterfaceAllocation()) == false)
            return false;
        return true;
    }
}
