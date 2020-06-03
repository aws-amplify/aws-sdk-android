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
 * Creates an association between a Direct Connect gateway and a virtual private
 * gateway. The virtual private gateway must be attached to a VPC and must not
 * be associated with another Direct Connect gateway.
 * </p>
 */
public class CreateDirectConnectGatewayAssociationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;

    /**
     * <p>
     * The ID of the virtual private gateway or transit gateway.
     * </p>
     */
    private String gatewayId;

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * </p>
     * <p>
     * This parameter is required when you create an association to a transit
     * gateway.
     * </p>
     * <p>
     * For information about how to set the prefixes, see <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     * >Allowed Prefixes</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     */
    private java.util.List<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway;

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String virtualGatewayId;

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the Direct Connect gateway.
     *         </p>
     */
    public String getDirectConnectGatewayId() {
        return directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     *
     * @param directConnectGatewayId <p>
     *            The ID of the Direct Connect gateway.
     *            </p>
     */
    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayId <p>
     *            The ID of the Direct Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationRequest withDirectConnectGatewayId(
            String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway or transit gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual private gateway or transit gateway.
     *         </p>
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway or transit gateway.
     * </p>
     *
     * @param gatewayId <p>
     *            The ID of the virtual private gateway or transit gateway.
     *            </p>
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway or transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayId <p>
     *            The ID of the virtual private gateway or transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationRequest withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * </p>
     * <p>
     * This parameter is required when you create an association to a transit
     * gateway.
     * </p>
     * <p>
     * For information about how to set the prefixes, see <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     * >Allowed Prefixes</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The Amazon VPC prefixes to advertise to the Direct Connect
     *         gateway
     *         </p>
     *         <p>
     *         This parameter is required when you create an association to a
     *         transit gateway.
     *         </p>
     *         <p>
     *         For information about how to set the prefixes, see <a href=
     *         "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     *         >Allowed Prefixes</a> in the <i>AWS Direct Connect User
     *         Guide</i>.
     *         </p>
     */
    public java.util.List<RouteFilterPrefix> getAddAllowedPrefixesToDirectConnectGateway() {
        return addAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * </p>
     * <p>
     * This parameter is required when you create an association to a transit
     * gateway.
     * </p>
     * <p>
     * For information about how to set the prefixes, see <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     * >Allowed Prefixes</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     *
     * @param addAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway
     *            </p>
     *            <p>
     *            This parameter is required when you create an association to a
     *            transit gateway.
     *            </p>
     *            <p>
     *            For information about how to set the prefixes, see <a href=
     *            "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     *            >Allowed Prefixes</a> in the <i>AWS Direct Connect User
     *            Guide</i>.
     *            </p>
     */
    public void setAddAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway) {
        if (addAllowedPrefixesToDirectConnectGateway == null) {
            this.addAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.addAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                addAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * </p>
     * <p>
     * This parameter is required when you create an association to a transit
     * gateway.
     * </p>
     * <p>
     * For information about how to set the prefixes, see <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     * >Allowed Prefixes</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway
     *            </p>
     *            <p>
     *            This parameter is required when you create an association to a
     *            transit gateway.
     *            </p>
     *            <p>
     *            For information about how to set the prefixes, see <a href=
     *            "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     *            >Allowed Prefixes</a> in the <i>AWS Direct Connect User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationRequest withAddAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... addAllowedPrefixesToDirectConnectGateway) {
        if (getAddAllowedPrefixesToDirectConnectGateway() == null) {
            this.addAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                    addAllowedPrefixesToDirectConnectGateway.length);
        }
        for (RouteFilterPrefix value : addAllowedPrefixesToDirectConnectGateway) {
            this.addAllowedPrefixesToDirectConnectGateway.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway
     * </p>
     * <p>
     * This parameter is required when you create an association to a transit
     * gateway.
     * </p>
     * <p>
     * For information about how to set the prefixes, see <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     * >Allowed Prefixes</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway
     *            </p>
     *            <p>
     *            This parameter is required when you create an association to a
     *            transit gateway.
     *            </p>
     *            <p>
     *            For information about how to set the prefixes, see <a href=
     *            "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     *            >Allowed Prefixes</a> in the <i>AWS Direct Connect User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationRequest withAddAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway) {
        setAddAllowedPrefixesToDirectConnectGateway(addAllowedPrefixesToDirectConnectGateway);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual private gateway.
     *         </p>
     */
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     *
     * @param virtualGatewayId <p>
     *            The ID of the virtual private gateway.
     *            </p>
     */
    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualGatewayId <p>
     *            The ID of the virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationRequest withVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
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
        if (getDirectConnectGatewayId() != null)
            sb.append("directConnectGatewayId: " + getDirectConnectGatewayId() + ",");
        if (getGatewayId() != null)
            sb.append("gatewayId: " + getGatewayId() + ",");
        if (getAddAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("addAllowedPrefixesToDirectConnectGateway: "
                    + getAddAllowedPrefixesToDirectConnectGateway() + ",");
        if (getVirtualGatewayId() != null)
            sb.append("virtualGatewayId: " + getVirtualGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId()
                        .hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAddAllowedPrefixesToDirectConnectGateway() == null) ? 0
                        : getAddAllowedPrefixesToDirectConnectGateway().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDirectConnectGatewayAssociationRequest == false)
            return false;
        CreateDirectConnectGatewayAssociationRequest other = (CreateDirectConnectGatewayAssociationRequest) obj;

        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null
                && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null
                && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getAddAllowedPrefixesToDirectConnectGateway() == null
                ^ this.getAddAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getAddAllowedPrefixesToDirectConnectGateway() != null
                && other.getAddAllowedPrefixesToDirectConnectGateway().equals(
                        this.getAddAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null
                && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        return true;
    }
}
