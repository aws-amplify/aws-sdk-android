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
 * Creates a proposal to associate the specified virtual private gateway or
 * transit gateway with the specified Direct Connect gateway.
 * </p>
 * <p>
 * You can only associate a Direct Connect gateway and virtual private gateway
 * or transit gateway when the account that owns the Direct Connect gateway and
 * the account that owns the virtual private gateway or transit gateway have the
 * same AWS Payer ID.
 * </p>
 */
public class CreateDirectConnectGatewayAssociationProposalRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayOwnerAccount;

    /**
     * <p>
     * The ID of the virtual private gateway or transit gateway.
     * </p>
     */
    private String gatewayId;

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     */
    private java.util.List<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway;

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect
     * gateway.
     * </p>
     */
    private java.util.List<RouteFilterPrefix> removeAllowedPrefixesToDirectConnectGateway;

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
    public CreateDirectConnectGatewayAssociationProposalRequest withDirectConnectGatewayId(
            String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the Direct Connect gateway.
     *         </p>
     */
    public String getDirectConnectGatewayOwnerAccount() {
        return directConnectGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     *
     * @param directConnectGatewayOwnerAccount <p>
     *            The ID of the AWS account that owns the Direct Connect
     *            gateway.
     *            </p>
     */
    public void setDirectConnectGatewayOwnerAccount(String directConnectGatewayOwnerAccount) {
        this.directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayOwnerAccount <p>
     *            The ID of the AWS account that owns the Direct Connect
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationProposalRequest withDirectConnectGatewayOwnerAccount(
            String directConnectGatewayOwnerAccount) {
        this.directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount;
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
    public CreateDirectConnectGatewayAssociationProposalRequest withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     *
     * @return <p>
     *         The Amazon VPC prefixes to advertise to the Direct Connect
     *         gateway.
     *         </p>
     */
    public java.util.List<RouteFilterPrefix> getAddAllowedPrefixesToDirectConnectGateway() {
        return addAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     *
     * @param addAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
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
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationProposalRequest withAddAllowedPrefixesToDirectConnectGateway(
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
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationProposalRequest withAddAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway) {
        setAddAllowedPrefixesToDirectConnectGateway(addAllowedPrefixesToDirectConnectGateway);
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect
     * gateway.
     * </p>
     *
     * @return <p>
     *         The Amazon VPC prefixes to no longer advertise to the Direct
     *         Connect gateway.
     *         </p>
     */
    public java.util.List<RouteFilterPrefix> getRemoveAllowedPrefixesToDirectConnectGateway() {
        return removeAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect
     * gateway.
     * </p>
     *
     * @param removeAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to no longer advertise to the Direct
     *            Connect gateway.
     *            </p>
     */
    public void setRemoveAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> removeAllowedPrefixesToDirectConnectGateway) {
        if (removeAllowedPrefixesToDirectConnectGateway == null) {
            this.removeAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.removeAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                removeAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect
     * gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to no longer advertise to the Direct
     *            Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationProposalRequest withRemoveAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... removeAllowedPrefixesToDirectConnectGateway) {
        if (getRemoveAllowedPrefixesToDirectConnectGateway() == null) {
            this.removeAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                    removeAllowedPrefixesToDirectConnectGateway.length);
        }
        for (RouteFilterPrefix value : removeAllowedPrefixesToDirectConnectGateway) {
            this.removeAllowedPrefixesToDirectConnectGateway.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect
     * gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to no longer advertise to the Direct
     *            Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationProposalRequest withRemoveAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> removeAllowedPrefixesToDirectConnectGateway) {
        setRemoveAllowedPrefixesToDirectConnectGateway(removeAllowedPrefixesToDirectConnectGateway);
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
        if (getDirectConnectGatewayOwnerAccount() != null)
            sb.append("directConnectGatewayOwnerAccount: " + getDirectConnectGatewayOwnerAccount()
                    + ",");
        if (getGatewayId() != null)
            sb.append("gatewayId: " + getGatewayId() + ",");
        if (getAddAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("addAllowedPrefixesToDirectConnectGateway: "
                    + getAddAllowedPrefixesToDirectConnectGateway() + ",");
        if (getRemoveAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("removeAllowedPrefixesToDirectConnectGateway: "
                    + getRemoveAllowedPrefixesToDirectConnectGateway());
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
        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayOwnerAccount() == null) ? 0
                        : getDirectConnectGatewayOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAddAllowedPrefixesToDirectConnectGateway() == null) ? 0
                        : getAddAllowedPrefixesToDirectConnectGateway().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoveAllowedPrefixesToDirectConnectGateway() == null) ? 0
                        : getRemoveAllowedPrefixesToDirectConnectGateway().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDirectConnectGatewayAssociationProposalRequest == false)
            return false;
        CreateDirectConnectGatewayAssociationProposalRequest other = (CreateDirectConnectGatewayAssociationProposalRequest) obj;

        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null
                && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getDirectConnectGatewayOwnerAccount() == null
                ^ this.getDirectConnectGatewayOwnerAccount() == null)
            return false;
        if (other.getDirectConnectGatewayOwnerAccount() != null
                && other.getDirectConnectGatewayOwnerAccount().equals(
                        this.getDirectConnectGatewayOwnerAccount()) == false)
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
        if (other.getRemoveAllowedPrefixesToDirectConnectGateway() == null
                ^ this.getRemoveAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getRemoveAllowedPrefixesToDirectConnectGateway() != null
                && other.getRemoveAllowedPrefixesToDirectConnectGateway().equals(
                        this.getRemoveAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        return true;
    }
}
