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
 * Creates a BGP peer on the specified virtual interface.
 * </p>
 * <p>
 * You must create a BGP peer for the corresponding address family (IPv4/IPv6)
 * in order to access AWS resources that also use that address family.
 * </p>
 * <p>
 * If logical redundancy is not supported by the connection, interconnect, or
 * LAG, the BGP peer cannot be in the same address family as an existing BGP
 * peer on the virtual interface.
 * </p>
 * <p>
 * When creating a IPv6 BGP peer, omit the Amazon address and customer address.
 * IPv6 addresses are automatically assigned from the Amazon pool of IPv6
 * addresses; you cannot specify custom IPv6 addresses.
 * </p>
 * <p>
 * For a public virtual interface, the Autonomous System Number (ASN) must be
 * private or already whitelisted for the virtual interface.
 * </p>
 */
public class CreateBGPPeerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     */
    private String virtualInterfaceId;

    /**
     * <p>
     * Information about the BGP peer.
     * </p>
     */
    private NewBGPPeer newBGPPeer;

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual interface.
     *         </p>
     */
    public String getVirtualInterfaceId() {
        return virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     *
     * @param virtualInterfaceId <p>
     *            The ID of the virtual interface.
     *            </p>
     */
    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceId <p>
     *            The ID of the virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBGPPeerRequest withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * <p>
     * Information about the BGP peer.
     * </p>
     *
     * @return <p>
     *         Information about the BGP peer.
     *         </p>
     */
    public NewBGPPeer getNewBGPPeer() {
        return newBGPPeer;
    }

    /**
     * <p>
     * Information about the BGP peer.
     * </p>
     *
     * @param newBGPPeer <p>
     *            Information about the BGP peer.
     *            </p>
     */
    public void setNewBGPPeer(NewBGPPeer newBGPPeer) {
        this.newBGPPeer = newBGPPeer;
    }

    /**
     * <p>
     * Information about the BGP peer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newBGPPeer <p>
     *            Information about the BGP peer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBGPPeerRequest withNewBGPPeer(NewBGPPeer newBGPPeer) {
        this.newBGPPeer = newBGPPeer;
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
        if (getVirtualInterfaceId() != null)
            sb.append("virtualInterfaceId: " + getVirtualInterfaceId() + ",");
        if (getNewBGPPeer() != null)
            sb.append("newBGPPeer: " + getNewBGPPeer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getNewBGPPeer() == null) ? 0 : getNewBGPPeer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBGPPeerRequest == false)
            return false;
        CreateBGPPeerRequest other = (CreateBGPPeerRequest) obj;

        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null
                && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getNewBGPPeer() == null ^ this.getNewBGPPeer() == null)
            return false;
        if (other.getNewBGPPeer() != null
                && other.getNewBGPPeer().equals(this.getNewBGPPeer()) == false)
            return false;
        return true;
    }
}
