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
 * Deletes the specified BGP peer on the specified virtual interface with the
 * specified customer address and ASN.
 * </p>
 * <p>
 * You cannot delete the last BGP peer from a virtual interface.
 * </p>
 */
public class DeleteBGPPeerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     */
    private String virtualInterfaceId;

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     */
    private Integer asn;

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     */
    private String customerAddress;

    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     */
    private String bgpPeerId;

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
    public DeleteBGPPeerRequest withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     *
     * @return <p>
     *         The autonomous system (AS) number for Border Gateway Protocol
     *         (BGP) configuration.
     *         </p>
     */
    public Integer getAsn() {
        return asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     *
     * @param asn <p>
     *            The autonomous system (AS) number for Border Gateway Protocol
     *            (BGP) configuration.
     *            </p>
     */
    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param asn <p>
     *            The autonomous system (AS) number for Border Gateway Protocol
     *            (BGP) configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteBGPPeerRequest withAsn(Integer asn) {
        this.asn = asn;
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     *
     * @return <p>
     *         The IP address assigned to the customer interface.
     *         </p>
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     *
     * @param customerAddress <p>
     *            The IP address assigned to the customer interface.
     *            </p>
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * <p>
     * The IP address assigned to the customer interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerAddress <p>
     *            The IP address assigned to the customer interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteBGPPeerRequest withCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     *
     * @return <p>
     *         The ID of the BGP peer.
     *         </p>
     */
    public String getBgpPeerId() {
        return bgpPeerId;
    }

    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     *
     * @param bgpPeerId <p>
     *            The ID of the BGP peer.
     *            </p>
     */
    public void setBgpPeerId(String bgpPeerId) {
        this.bgpPeerId = bgpPeerId;
    }

    /**
     * <p>
     * The ID of the BGP peer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bgpPeerId <p>
     *            The ID of the BGP peer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteBGPPeerRequest withBgpPeerId(String bgpPeerId) {
        this.bgpPeerId = bgpPeerId;
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
        if (getAsn() != null)
            sb.append("asn: " + getAsn() + ",");
        if (getCustomerAddress() != null)
            sb.append("customerAddress: " + getCustomerAddress() + ",");
        if (getBgpPeerId() != null)
            sb.append("bgpPeerId: " + getBgpPeerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode());
        hashCode = prime * hashCode + ((getBgpPeerId() == null) ? 0 : getBgpPeerId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBGPPeerRequest == false)
            return false;
        DeleteBGPPeerRequest other = (DeleteBGPPeerRequest) obj;

        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null
                && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null)
            return false;
        if (other.getCustomerAddress() != null
                && other.getCustomerAddress().equals(this.getCustomerAddress()) == false)
            return false;
        if (other.getBgpPeerId() == null ^ this.getBgpPeerId() == null)
            return false;
        if (other.getBgpPeerId() != null
                && other.getBgpPeerId().equals(this.getBgpPeerId()) == false)
            return false;
        return true;
    }
}
