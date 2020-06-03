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

/**
 * <p>
 * Information about the proposal request to attach a virtual private gateway to
 * a Direct Connect gateway.
 * </p>
 */
public class DirectConnectGatewayAssociationProposal implements Serializable {
    /**
     * <p>
     * The ID of the association proposal.
     * </p>
     */
    private String proposalId;

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
     * The state of the proposal. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepted</code>: The proposal has been accepted. The Direct Connect
     * gateway association is available to use in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The proposal has been deleted by the owner that
     * made the proposal. The Direct Connect gateway association cannot be used
     * in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The proposal has been requested. The Direct
     * Connect gateway association cannot be used in this state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, accepted, deleted
     */
    private String proposalState;

    /**
     * <p>
     * Information about the associated gateway.
     * </p>
     */
    private AssociatedGateway associatedGateway;

    /**
     * <p>
     * The existing Amazon VPC prefixes advertised to the Direct Connect
     * gateway.
     * </p>
     */
    private java.util.List<RouteFilterPrefix> existingAllowedPrefixesToDirectConnectGateway;

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     */
    private java.util.List<RouteFilterPrefix> requestedAllowedPrefixesToDirectConnectGateway;

    /**
     * <p>
     * The ID of the association proposal.
     * </p>
     *
     * @return <p>
     *         The ID of the association proposal.
     *         </p>
     */
    public String getProposalId() {
        return proposalId;
    }

    /**
     * <p>
     * The ID of the association proposal.
     * </p>
     *
     * @param proposalId <p>
     *            The ID of the association proposal.
     *            </p>
     */
    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    /**
     * <p>
     * The ID of the association proposal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proposalId <p>
     *            The ID of the association proposal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociationProposal withProposalId(String proposalId) {
        this.proposalId = proposalId;
        return this;
    }

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
    public DirectConnectGatewayAssociationProposal withDirectConnectGatewayId(
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
    public DirectConnectGatewayAssociationProposal withDirectConnectGatewayOwnerAccount(
            String directConnectGatewayOwnerAccount) {
        this.directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount;
        return this;
    }

    /**
     * <p>
     * The state of the proposal. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepted</code>: The proposal has been accepted. The Direct Connect
     * gateway association is available to use in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The proposal has been deleted by the owner that
     * made the proposal. The Direct Connect gateway association cannot be used
     * in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The proposal has been requested. The Direct
     * Connect gateway association cannot be used in this state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, accepted, deleted
     *
     * @return <p>
     *         The state of the proposal. The following are possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>accepted</code>: The proposal has been accepted. The Direct
     *         Connect gateway association is available to use in this state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The proposal has been deleted by the owner
     *         that made the proposal. The Direct Connect gateway association
     *         cannot be used in this state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requested</code>: The proposal has been requested. The
     *         Direct Connect gateway association cannot be used in this state.
     *         </p>
     *         </li>
     *         </ul>
     * @see DirectConnectGatewayAssociationProposalState
     */
    public String getProposalState() {
        return proposalState;
    }

    /**
     * <p>
     * The state of the proposal. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepted</code>: The proposal has been accepted. The Direct Connect
     * gateway association is available to use in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The proposal has been deleted by the owner that
     * made the proposal. The Direct Connect gateway association cannot be used
     * in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The proposal has been requested. The Direct
     * Connect gateway association cannot be used in this state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, accepted, deleted
     *
     * @param proposalState <p>
     *            The state of the proposal. The following are possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>accepted</code>: The proposal has been accepted. The
     *            Direct Connect gateway association is available to use in this
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The proposal has been deleted by the
     *            owner that made the proposal. The Direct Connect gateway
     *            association cannot be used in this state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requested</code>: The proposal has been requested. The
     *            Direct Connect gateway association cannot be used in this
     *            state.
     *            </p>
     *            </li>
     *            </ul>
     * @see DirectConnectGatewayAssociationProposalState
     */
    public void setProposalState(String proposalState) {
        this.proposalState = proposalState;
    }

    /**
     * <p>
     * The state of the proposal. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepted</code>: The proposal has been accepted. The Direct Connect
     * gateway association is available to use in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The proposal has been deleted by the owner that
     * made the proposal. The Direct Connect gateway association cannot be used
     * in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The proposal has been requested. The Direct
     * Connect gateway association cannot be used in this state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, accepted, deleted
     *
     * @param proposalState <p>
     *            The state of the proposal. The following are possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>accepted</code>: The proposal has been accepted. The
     *            Direct Connect gateway association is available to use in this
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The proposal has been deleted by the
     *            owner that made the proposal. The Direct Connect gateway
     *            association cannot be used in this state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requested</code>: The proposal has been requested. The
     *            Direct Connect gateway association cannot be used in this
     *            state.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectConnectGatewayAssociationProposalState
     */
    public DirectConnectGatewayAssociationProposal withProposalState(String proposalState) {
        this.proposalState = proposalState;
        return this;
    }

    /**
     * <p>
     * The state of the proposal. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepted</code>: The proposal has been accepted. The Direct Connect
     * gateway association is available to use in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The proposal has been deleted by the owner that
     * made the proposal. The Direct Connect gateway association cannot be used
     * in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The proposal has been requested. The Direct
     * Connect gateway association cannot be used in this state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, accepted, deleted
     *
     * @param proposalState <p>
     *            The state of the proposal. The following are possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>accepted</code>: The proposal has been accepted. The
     *            Direct Connect gateway association is available to use in this
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The proposal has been deleted by the
     *            owner that made the proposal. The Direct Connect gateway
     *            association cannot be used in this state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requested</code>: The proposal has been requested. The
     *            Direct Connect gateway association cannot be used in this
     *            state.
     *            </p>
     *            </li>
     *            </ul>
     * @see DirectConnectGatewayAssociationProposalState
     */
    public void setProposalState(DirectConnectGatewayAssociationProposalState proposalState) {
        this.proposalState = proposalState.toString();
    }

    /**
     * <p>
     * The state of the proposal. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>accepted</code>: The proposal has been accepted. The Direct Connect
     * gateway association is available to use in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The proposal has been deleted by the owner that
     * made the proposal. The Direct Connect gateway association cannot be used
     * in this state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>: The proposal has been requested. The Direct
     * Connect gateway association cannot be used in this state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, accepted, deleted
     *
     * @param proposalState <p>
     *            The state of the proposal. The following are possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>accepted</code>: The proposal has been accepted. The
     *            Direct Connect gateway association is available to use in this
     *            state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The proposal has been deleted by the
     *            owner that made the proposal. The Direct Connect gateway
     *            association cannot be used in this state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>requested</code>: The proposal has been requested. The
     *            Direct Connect gateway association cannot be used in this
     *            state.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectConnectGatewayAssociationProposalState
     */
    public DirectConnectGatewayAssociationProposal withProposalState(
            DirectConnectGatewayAssociationProposalState proposalState) {
        this.proposalState = proposalState.toString();
        return this;
    }

    /**
     * <p>
     * Information about the associated gateway.
     * </p>
     *
     * @return <p>
     *         Information about the associated gateway.
     *         </p>
     */
    public AssociatedGateway getAssociatedGateway() {
        return associatedGateway;
    }

    /**
     * <p>
     * Information about the associated gateway.
     * </p>
     *
     * @param associatedGateway <p>
     *            Information about the associated gateway.
     *            </p>
     */
    public void setAssociatedGateway(AssociatedGateway associatedGateway) {
        this.associatedGateway = associatedGateway;
    }

    /**
     * <p>
     * Information about the associated gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedGateway <p>
     *            Information about the associated gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociationProposal withAssociatedGateway(
            AssociatedGateway associatedGateway) {
        this.associatedGateway = associatedGateway;
        return this;
    }

    /**
     * <p>
     * The existing Amazon VPC prefixes advertised to the Direct Connect
     * gateway.
     * </p>
     *
     * @return <p>
     *         The existing Amazon VPC prefixes advertised to the Direct Connect
     *         gateway.
     *         </p>
     */
    public java.util.List<RouteFilterPrefix> getExistingAllowedPrefixesToDirectConnectGateway() {
        return existingAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The existing Amazon VPC prefixes advertised to the Direct Connect
     * gateway.
     * </p>
     *
     * @param existingAllowedPrefixesToDirectConnectGateway <p>
     *            The existing Amazon VPC prefixes advertised to the Direct
     *            Connect gateway.
     *            </p>
     */
    public void setExistingAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> existingAllowedPrefixesToDirectConnectGateway) {
        if (existingAllowedPrefixesToDirectConnectGateway == null) {
            this.existingAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.existingAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                existingAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * The existing Amazon VPC prefixes advertised to the Direct Connect
     * gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param existingAllowedPrefixesToDirectConnectGateway <p>
     *            The existing Amazon VPC prefixes advertised to the Direct
     *            Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociationProposal withExistingAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... existingAllowedPrefixesToDirectConnectGateway) {
        if (getExistingAllowedPrefixesToDirectConnectGateway() == null) {
            this.existingAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                    existingAllowedPrefixesToDirectConnectGateway.length);
        }
        for (RouteFilterPrefix value : existingAllowedPrefixesToDirectConnectGateway) {
            this.existingAllowedPrefixesToDirectConnectGateway.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The existing Amazon VPC prefixes advertised to the Direct Connect
     * gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param existingAllowedPrefixesToDirectConnectGateway <p>
     *            The existing Amazon VPC prefixes advertised to the Direct
     *            Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociationProposal withExistingAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> existingAllowedPrefixesToDirectConnectGateway) {
        setExistingAllowedPrefixesToDirectConnectGateway(existingAllowedPrefixesToDirectConnectGateway);
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
    public java.util.List<RouteFilterPrefix> getRequestedAllowedPrefixesToDirectConnectGateway() {
        return requestedAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     *
     * @param requestedAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
     *            </p>
     */
    public void setRequestedAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> requestedAllowedPrefixesToDirectConnectGateway) {
        if (requestedAllowedPrefixesToDirectConnectGateway == null) {
            this.requestedAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.requestedAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                requestedAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestedAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociationProposal withRequestedAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... requestedAllowedPrefixesToDirectConnectGateway) {
        if (getRequestedAllowedPrefixesToDirectConnectGateway() == null) {
            this.requestedAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                    requestedAllowedPrefixesToDirectConnectGateway.length);
        }
        for (RouteFilterPrefix value : requestedAllowedPrefixesToDirectConnectGateway) {
            this.requestedAllowedPrefixesToDirectConnectGateway.add(value);
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
     * @param requestedAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociationProposal withRequestedAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> requestedAllowedPrefixesToDirectConnectGateway) {
        setRequestedAllowedPrefixesToDirectConnectGateway(requestedAllowedPrefixesToDirectConnectGateway);
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
        if (getProposalId() != null)
            sb.append("proposalId: " + getProposalId() + ",");
        if (getDirectConnectGatewayId() != null)
            sb.append("directConnectGatewayId: " + getDirectConnectGatewayId() + ",");
        if (getDirectConnectGatewayOwnerAccount() != null)
            sb.append("directConnectGatewayOwnerAccount: " + getDirectConnectGatewayOwnerAccount()
                    + ",");
        if (getProposalState() != null)
            sb.append("proposalState: " + getProposalState() + ",");
        if (getAssociatedGateway() != null)
            sb.append("associatedGateway: " + getAssociatedGateway() + ",");
        if (getExistingAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("existingAllowedPrefixesToDirectConnectGateway: "
                    + getExistingAllowedPrefixesToDirectConnectGateway() + ",");
        if (getRequestedAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("requestedAllowedPrefixesToDirectConnectGateway: "
                    + getRequestedAllowedPrefixesToDirectConnectGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProposalId() == null) ? 0 : getProposalId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayOwnerAccount() == null) ? 0
                        : getDirectConnectGatewayOwnerAccount().hashCode());
        hashCode = prime * hashCode
                + ((getProposalState() == null) ? 0 : getProposalState().hashCode());
        hashCode = prime * hashCode
                + ((getAssociatedGateway() == null) ? 0 : getAssociatedGateway().hashCode());
        hashCode = prime
                * hashCode
                + ((getExistingAllowedPrefixesToDirectConnectGateway() == null) ? 0
                        : getExistingAllowedPrefixesToDirectConnectGateway().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestedAllowedPrefixesToDirectConnectGateway() == null) ? 0
                        : getRequestedAllowedPrefixesToDirectConnectGateway().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectConnectGatewayAssociationProposal == false)
            return false;
        DirectConnectGatewayAssociationProposal other = (DirectConnectGatewayAssociationProposal) obj;

        if (other.getProposalId() == null ^ this.getProposalId() == null)
            return false;
        if (other.getProposalId() != null
                && other.getProposalId().equals(this.getProposalId()) == false)
            return false;
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
        if (other.getProposalState() == null ^ this.getProposalState() == null)
            return false;
        if (other.getProposalState() != null
                && other.getProposalState().equals(this.getProposalState()) == false)
            return false;
        if (other.getAssociatedGateway() == null ^ this.getAssociatedGateway() == null)
            return false;
        if (other.getAssociatedGateway() != null
                && other.getAssociatedGateway().equals(this.getAssociatedGateway()) == false)
            return false;
        if (other.getExistingAllowedPrefixesToDirectConnectGateway() == null
                ^ this.getExistingAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getExistingAllowedPrefixesToDirectConnectGateway() != null
                && other.getExistingAllowedPrefixesToDirectConnectGateway().equals(
                        this.getExistingAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        if (other.getRequestedAllowedPrefixesToDirectConnectGateway() == null
                ^ this.getRequestedAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getRequestedAllowedPrefixesToDirectConnectGateway() != null
                && other.getRequestedAllowedPrefixesToDirectConnectGateway().equals(
                        this.getRequestedAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        return true;
    }
}
