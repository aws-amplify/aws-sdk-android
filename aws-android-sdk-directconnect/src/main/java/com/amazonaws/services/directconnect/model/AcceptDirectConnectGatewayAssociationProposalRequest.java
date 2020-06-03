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
 * Accepts a proposal request to attach a virtual private gateway or transit
 * gateway to a Direct Connect gateway.
 * </p>
 */
public class AcceptDirectConnectGatewayAssociationProposalRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;

    /**
     * <p>
     * The ID of the request proposal.
     * </p>
     */
    private String proposalId;

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway or
     * transit gateway.
     * </p>
     */
    private String associatedGatewayOwnerAccount;

    /**
     * <p>
     * Overrides the Amazon VPC prefixes advertised to the Direct Connect
     * gateway.
     * </p>
     * <p>
     * For information about how to set the prefixes, see <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     * >Allowed Prefixes</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     */
    private java.util.List<RouteFilterPrefix> overrideAllowedPrefixesToDirectConnectGateway;

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
    public AcceptDirectConnectGatewayAssociationProposalRequest withDirectConnectGatewayId(
            String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the request proposal.
     * </p>
     *
     * @return <p>
     *         The ID of the request proposal.
     *         </p>
     */
    public String getProposalId() {
        return proposalId;
    }

    /**
     * <p>
     * The ID of the request proposal.
     * </p>
     *
     * @param proposalId <p>
     *            The ID of the request proposal.
     *            </p>
     */
    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    /**
     * <p>
     * The ID of the request proposal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proposalId <p>
     *            The ID of the request proposal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptDirectConnectGatewayAssociationProposalRequest withProposalId(String proposalId) {
        this.proposalId = proposalId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway or
     * transit gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the virtual private gateway
     *         or transit gateway.
     *         </p>
     */
    public String getAssociatedGatewayOwnerAccount() {
        return associatedGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway or
     * transit gateway.
     * </p>
     *
     * @param associatedGatewayOwnerAccount <p>
     *            The ID of the AWS account that owns the virtual private
     *            gateway or transit gateway.
     *            </p>
     */
    public void setAssociatedGatewayOwnerAccount(String associatedGatewayOwnerAccount) {
        this.associatedGatewayOwnerAccount = associatedGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway or
     * transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedGatewayOwnerAccount <p>
     *            The ID of the AWS account that owns the virtual private
     *            gateway or transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptDirectConnectGatewayAssociationProposalRequest withAssociatedGatewayOwnerAccount(
            String associatedGatewayOwnerAccount) {
        this.associatedGatewayOwnerAccount = associatedGatewayOwnerAccount;
        return this;
    }

    /**
     * <p>
     * Overrides the Amazon VPC prefixes advertised to the Direct Connect
     * gateway.
     * </p>
     * <p>
     * For information about how to set the prefixes, see <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     * >Allowed Prefixes</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Overrides the Amazon VPC prefixes advertised to the Direct
     *         Connect gateway.
     *         </p>
     *         <p>
     *         For information about how to set the prefixes, see <a href=
     *         "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     *         >Allowed Prefixes</a> in the <i>AWS Direct Connect User
     *         Guide</i>.
     *         </p>
     */
    public java.util.List<RouteFilterPrefix> getOverrideAllowedPrefixesToDirectConnectGateway() {
        return overrideAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * Overrides the Amazon VPC prefixes advertised to the Direct Connect
     * gateway.
     * </p>
     * <p>
     * For information about how to set the prefixes, see <a href=
     * "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     * >Allowed Prefixes</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     *
     * @param overrideAllowedPrefixesToDirectConnectGateway <p>
     *            Overrides the Amazon VPC prefixes advertised to the Direct
     *            Connect gateway.
     *            </p>
     *            <p>
     *            For information about how to set the prefixes, see <a href=
     *            "https://docs.aws.amazon.com/directconnect/latest/UserGuide/multi-account-associate-vgw.html#allowed-prefixes"
     *            >Allowed Prefixes</a> in the <i>AWS Direct Connect User
     *            Guide</i>.
     *            </p>
     */
    public void setOverrideAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> overrideAllowedPrefixesToDirectConnectGateway) {
        if (overrideAllowedPrefixesToDirectConnectGateway == null) {
            this.overrideAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.overrideAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                overrideAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * Overrides the Amazon VPC prefixes advertised to the Direct Connect
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
     * @param overrideAllowedPrefixesToDirectConnectGateway <p>
     *            Overrides the Amazon VPC prefixes advertised to the Direct
     *            Connect gateway.
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
    public AcceptDirectConnectGatewayAssociationProposalRequest withOverrideAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... overrideAllowedPrefixesToDirectConnectGateway) {
        if (getOverrideAllowedPrefixesToDirectConnectGateway() == null) {
            this.overrideAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                    overrideAllowedPrefixesToDirectConnectGateway.length);
        }
        for (RouteFilterPrefix value : overrideAllowedPrefixesToDirectConnectGateway) {
            this.overrideAllowedPrefixesToDirectConnectGateway.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Overrides the Amazon VPC prefixes advertised to the Direct Connect
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
     * @param overrideAllowedPrefixesToDirectConnectGateway <p>
     *            Overrides the Amazon VPC prefixes advertised to the Direct
     *            Connect gateway.
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
    public AcceptDirectConnectGatewayAssociationProposalRequest withOverrideAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> overrideAllowedPrefixesToDirectConnectGateway) {
        setOverrideAllowedPrefixesToDirectConnectGateway(overrideAllowedPrefixesToDirectConnectGateway);
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
        if (getProposalId() != null)
            sb.append("proposalId: " + getProposalId() + ",");
        if (getAssociatedGatewayOwnerAccount() != null)
            sb.append("associatedGatewayOwnerAccount: " + getAssociatedGatewayOwnerAccount() + ",");
        if (getOverrideAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("overrideAllowedPrefixesToDirectConnectGateway: "
                    + getOverrideAllowedPrefixesToDirectConnectGateway());
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
        hashCode = prime * hashCode + ((getProposalId() == null) ? 0 : getProposalId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssociatedGatewayOwnerAccount() == null) ? 0
                        : getAssociatedGatewayOwnerAccount().hashCode());
        hashCode = prime
                * hashCode
                + ((getOverrideAllowedPrefixesToDirectConnectGateway() == null) ? 0
                        : getOverrideAllowedPrefixesToDirectConnectGateway().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptDirectConnectGatewayAssociationProposalRequest == false)
            return false;
        AcceptDirectConnectGatewayAssociationProposalRequest other = (AcceptDirectConnectGatewayAssociationProposalRequest) obj;

        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null
                && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getProposalId() == null ^ this.getProposalId() == null)
            return false;
        if (other.getProposalId() != null
                && other.getProposalId().equals(this.getProposalId()) == false)
            return false;
        if (other.getAssociatedGatewayOwnerAccount() == null
                ^ this.getAssociatedGatewayOwnerAccount() == null)
            return false;
        if (other.getAssociatedGatewayOwnerAccount() != null
                && other.getAssociatedGatewayOwnerAccount().equals(
                        this.getAssociatedGatewayOwnerAccount()) == false)
            return false;
        if (other.getOverrideAllowedPrefixesToDirectConnectGateway() == null
                ^ this.getOverrideAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getOverrideAllowedPrefixesToDirectConnectGateway() != null
                && other.getOverrideAllowedPrefixesToDirectConnectGateway().equals(
                        this.getOverrideAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        return true;
    }
}
