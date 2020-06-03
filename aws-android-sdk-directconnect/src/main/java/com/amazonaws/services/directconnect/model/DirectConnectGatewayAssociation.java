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
 * Information about an association between a Direct Connect gateway and a
 * virtual private gateway or transit gateway.
 * </p>
 */
public class DirectConnectGatewayAssociation implements Serializable {
    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;

    /**
     * <p>
     * The ID of the AWS account that owns the associated gateway.
     * </p>
     */
    private String directConnectGatewayOwnerAccount;

    /**
     * <p>
     * The state of the association. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The initial state after calling
     * <a>CreateDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The Direct Connect gateway and virtual private
     * gateway or transit gateway are successfully associated and ready to pass
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The initial state after calling
     * <a>DeleteDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The virtual private gateway or transit
     * gateway is disassociated from the Direct Connect gateway. Traffic flow
     * between the Direct Connect gateway and virtual private gateway or transit
     * gateway is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, updating
     */
    private String associationState;

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     */
    private String stateChangeError;

    /**
     * <p>
     * Information about the associated gateway.
     * </p>
     */
    private AssociatedGateway associatedGateway;

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     */
    private java.util.List<RouteFilterPrefix> allowedPrefixesToDirectConnectGateway;

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual
     * interfaces.
     * </p>
     */
    private String virtualGatewayId;

    /**
     * <p>
     * The AWS Region where the virtual private gateway is located.
     * </p>
     */
    private String virtualGatewayRegion;

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     */
    private String virtualGatewayOwnerAccount;

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
    public DirectConnectGatewayAssociation withDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the associated gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the associated gateway.
     *         </p>
     */
    public String getDirectConnectGatewayOwnerAccount() {
        return directConnectGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the associated gateway.
     * </p>
     *
     * @param directConnectGatewayOwnerAccount <p>
     *            The ID of the AWS account that owns the associated gateway.
     *            </p>
     */
    public void setDirectConnectGatewayOwnerAccount(String directConnectGatewayOwnerAccount) {
        this.directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the associated gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayOwnerAccount <p>
     *            The ID of the AWS account that owns the associated gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociation withDirectConnectGatewayOwnerAccount(
            String directConnectGatewayOwnerAccount) {
        this.directConnectGatewayOwnerAccount = directConnectGatewayOwnerAccount;
        return this;
    }

    /**
     * <p>
     * The state of the association. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The initial state after calling
     * <a>CreateDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The Direct Connect gateway and virtual private
     * gateway or transit gateway are successfully associated and ready to pass
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The initial state after calling
     * <a>DeleteDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The virtual private gateway or transit
     * gateway is disassociated from the Direct Connect gateway. Traffic flow
     * between the Direct Connect gateway and virtual private gateway or transit
     * gateway is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, updating
     *
     * @return <p>
     *         The state of the association. The following are the possible
     *         values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>associating</code>: The initial state after calling
     *         <a>CreateDirectConnectGatewayAssociation</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>associated</code>: The Direct Connect gateway and virtual
     *         private gateway or transit gateway are successfully associated
     *         and ready to pass traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>disassociating</code>: The initial state after calling
     *         <a>DeleteDirectConnectGatewayAssociation</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>disassociated</code>: The virtual private gateway or
     *         transit gateway is disassociated from the Direct Connect gateway.
     *         Traffic flow between the Direct Connect gateway and virtual
     *         private gateway or transit gateway is stopped.
     *         </p>
     *         </li>
     *         </ul>
     * @see DirectConnectGatewayAssociationState
     */
    public String getAssociationState() {
        return associationState;
    }

    /**
     * <p>
     * The state of the association. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The initial state after calling
     * <a>CreateDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The Direct Connect gateway and virtual private
     * gateway or transit gateway are successfully associated and ready to pass
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The initial state after calling
     * <a>DeleteDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The virtual private gateway or transit
     * gateway is disassociated from the Direct Connect gateway. Traffic flow
     * between the Direct Connect gateway and virtual private gateway or transit
     * gateway is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, updating
     *
     * @param associationState <p>
     *            The state of the association. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>associating</code>: The initial state after calling
     *            <a>CreateDirectConnectGatewayAssociation</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>associated</code>: The Direct Connect gateway and
     *            virtual private gateway or transit gateway are successfully
     *            associated and ready to pass traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>disassociating</code>: The initial state after calling
     *            <a>DeleteDirectConnectGatewayAssociation</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>disassociated</code>: The virtual private gateway or
     *            transit gateway is disassociated from the Direct Connect
     *            gateway. Traffic flow between the Direct Connect gateway and
     *            virtual private gateway or transit gateway is stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @see DirectConnectGatewayAssociationState
     */
    public void setAssociationState(String associationState) {
        this.associationState = associationState;
    }

    /**
     * <p>
     * The state of the association. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The initial state after calling
     * <a>CreateDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The Direct Connect gateway and virtual private
     * gateway or transit gateway are successfully associated and ready to pass
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The initial state after calling
     * <a>DeleteDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The virtual private gateway or transit
     * gateway is disassociated from the Direct Connect gateway. Traffic flow
     * between the Direct Connect gateway and virtual private gateway or transit
     * gateway is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, updating
     *
     * @param associationState <p>
     *            The state of the association. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>associating</code>: The initial state after calling
     *            <a>CreateDirectConnectGatewayAssociation</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>associated</code>: The Direct Connect gateway and
     *            virtual private gateway or transit gateway are successfully
     *            associated and ready to pass traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>disassociating</code>: The initial state after calling
     *            <a>DeleteDirectConnectGatewayAssociation</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>disassociated</code>: The virtual private gateway or
     *            transit gateway is disassociated from the Direct Connect
     *            gateway. Traffic flow between the Direct Connect gateway and
     *            virtual private gateway or transit gateway is stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectConnectGatewayAssociationState
     */
    public DirectConnectGatewayAssociation withAssociationState(String associationState) {
        this.associationState = associationState;
        return this;
    }

    /**
     * <p>
     * The state of the association. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The initial state after calling
     * <a>CreateDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The Direct Connect gateway and virtual private
     * gateway or transit gateway are successfully associated and ready to pass
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The initial state after calling
     * <a>DeleteDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The virtual private gateway or transit
     * gateway is disassociated from the Direct Connect gateway. Traffic flow
     * between the Direct Connect gateway and virtual private gateway or transit
     * gateway is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, updating
     *
     * @param associationState <p>
     *            The state of the association. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>associating</code>: The initial state after calling
     *            <a>CreateDirectConnectGatewayAssociation</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>associated</code>: The Direct Connect gateway and
     *            virtual private gateway or transit gateway are successfully
     *            associated and ready to pass traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>disassociating</code>: The initial state after calling
     *            <a>DeleteDirectConnectGatewayAssociation</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>disassociated</code>: The virtual private gateway or
     *            transit gateway is disassociated from the Direct Connect
     *            gateway. Traffic flow between the Direct Connect gateway and
     *            virtual private gateway or transit gateway is stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @see DirectConnectGatewayAssociationState
     */
    public void setAssociationState(DirectConnectGatewayAssociationState associationState) {
        this.associationState = associationState.toString();
    }

    /**
     * <p>
     * The state of the association. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The initial state after calling
     * <a>CreateDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The Direct Connect gateway and virtual private
     * gateway or transit gateway are successfully associated and ready to pass
     * traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The initial state after calling
     * <a>DeleteDirectConnectGatewayAssociation</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The virtual private gateway or transit
     * gateway is disassociated from the Direct Connect gateway. Traffic flow
     * between the Direct Connect gateway and virtual private gateway or transit
     * gateway is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, updating
     *
     * @param associationState <p>
     *            The state of the association. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>associating</code>: The initial state after calling
     *            <a>CreateDirectConnectGatewayAssociation</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>associated</code>: The Direct Connect gateway and
     *            virtual private gateway or transit gateway are successfully
     *            associated and ready to pass traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>disassociating</code>: The initial state after calling
     *            <a>DeleteDirectConnectGatewayAssociation</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>disassociated</code>: The virtual private gateway or
     *            transit gateway is disassociated from the Direct Connect
     *            gateway. Traffic flow between the Direct Connect gateway and
     *            virtual private gateway or transit gateway is stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectConnectGatewayAssociationState
     */
    public DirectConnectGatewayAssociation withAssociationState(
            DirectConnectGatewayAssociationState associationState) {
        this.associationState = associationState.toString();
        return this;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     *
     * @return <p>
     *         The error message if the state of an object failed to advance.
     *         </p>
     */
    public String getStateChangeError() {
        return stateChangeError;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     *
     * @param stateChangeError <p>
     *            The error message if the state of an object failed to advance.
     *            </p>
     */
    public void setStateChangeError(String stateChangeError) {
        this.stateChangeError = stateChangeError;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateChangeError <p>
     *            The error message if the state of an object failed to advance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociation withStateChangeError(String stateChangeError) {
        this.stateChangeError = stateChangeError;
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
    public DirectConnectGatewayAssociation withAssociatedGateway(AssociatedGateway associatedGateway) {
        this.associatedGateway = associatedGateway;
        return this;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     *
     * @return <p>
     *         The ID of the Direct Connect gateway association.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     *
     * @param associationId <p>
     *            The ID of the Direct Connect gateway association.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationId <p>
     *            The ID of the Direct Connect gateway association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociation withAssociationId(String associationId) {
        this.associationId = associationId;
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
    public java.util.List<RouteFilterPrefix> getAllowedPrefixesToDirectConnectGateway() {
        return allowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     *
     * @param allowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
     *            </p>
     */
    public void setAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> allowedPrefixesToDirectConnectGateway) {
        if (allowedPrefixesToDirectConnectGateway == null) {
            this.allowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.allowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                allowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociation withAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... allowedPrefixesToDirectConnectGateway) {
        if (getAllowedPrefixesToDirectConnectGateway() == null) {
            this.allowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                    allowedPrefixesToDirectConnectGateway.length);
        }
        for (RouteFilterPrefix value : allowedPrefixesToDirectConnectGateway) {
            this.allowedPrefixesToDirectConnectGateway.add(value);
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
     * @param allowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociation withAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> allowedPrefixesToDirectConnectGateway) {
        setAllowedPrefixesToDirectConnectGateway(allowedPrefixesToDirectConnectGateway);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual
     * interfaces.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual private gateway. Applies only to private
     *         virtual interfaces.
     *         </p>
     */
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual
     * interfaces.
     * </p>
     *
     * @param virtualGatewayId <p>
     *            The ID of the virtual private gateway. Applies only to private
     *            virtual interfaces.
     *            </p>
     */
    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway. Applies only to private virtual
     * interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualGatewayId <p>
     *            The ID of the virtual private gateway. Applies only to private
     *            virtual interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociation withVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
        return this;
    }

    /**
     * <p>
     * The AWS Region where the virtual private gateway is located.
     * </p>
     *
     * @return <p>
     *         The AWS Region where the virtual private gateway is located.
     *         </p>
     */
    public String getVirtualGatewayRegion() {
        return virtualGatewayRegion;
    }

    /**
     * <p>
     * The AWS Region where the virtual private gateway is located.
     * </p>
     *
     * @param virtualGatewayRegion <p>
     *            The AWS Region where the virtual private gateway is located.
     *            </p>
     */
    public void setVirtualGatewayRegion(String virtualGatewayRegion) {
        this.virtualGatewayRegion = virtualGatewayRegion;
    }

    /**
     * <p>
     * The AWS Region where the virtual private gateway is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualGatewayRegion <p>
     *            The AWS Region where the virtual private gateway is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociation withVirtualGatewayRegion(String virtualGatewayRegion) {
        this.virtualGatewayRegion = virtualGatewayRegion;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the virtual private gateway.
     *         </p>
     */
    public String getVirtualGatewayOwnerAccount() {
        return virtualGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     *
     * @param virtualGatewayOwnerAccount <p>
     *            The ID of the AWS account that owns the virtual private
     *            gateway.
     *            </p>
     */
    public void setVirtualGatewayOwnerAccount(String virtualGatewayOwnerAccount) {
        this.virtualGatewayOwnerAccount = virtualGatewayOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualGatewayOwnerAccount <p>
     *            The ID of the AWS account that owns the virtual private
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAssociation withVirtualGatewayOwnerAccount(
            String virtualGatewayOwnerAccount) {
        this.virtualGatewayOwnerAccount = virtualGatewayOwnerAccount;
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
        if (getAssociationState() != null)
            sb.append("associationState: " + getAssociationState() + ",");
        if (getStateChangeError() != null)
            sb.append("stateChangeError: " + getStateChangeError() + ",");
        if (getAssociatedGateway() != null)
            sb.append("associatedGateway: " + getAssociatedGateway() + ",");
        if (getAssociationId() != null)
            sb.append("associationId: " + getAssociationId() + ",");
        if (getAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("allowedPrefixesToDirectConnectGateway: "
                    + getAllowedPrefixesToDirectConnectGateway() + ",");
        if (getVirtualGatewayId() != null)
            sb.append("virtualGatewayId: " + getVirtualGatewayId() + ",");
        if (getVirtualGatewayRegion() != null)
            sb.append("virtualGatewayRegion: " + getVirtualGatewayRegion() + ",");
        if (getVirtualGatewayOwnerAccount() != null)
            sb.append("virtualGatewayOwnerAccount: " + getVirtualGatewayOwnerAccount());
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
        hashCode = prime * hashCode
                + ((getAssociationState() == null) ? 0 : getAssociationState().hashCode());
        hashCode = prime * hashCode
                + ((getStateChangeError() == null) ? 0 : getStateChangeError().hashCode());
        hashCode = prime * hashCode
                + ((getAssociatedGateway() == null) ? 0 : getAssociatedGateway().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowedPrefixesToDirectConnectGateway() == null) ? 0
                        : getAllowedPrefixesToDirectConnectGateway().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualGatewayRegion() == null) ? 0 : getVirtualGatewayRegion().hashCode());
        hashCode = prime
                * hashCode
                + ((getVirtualGatewayOwnerAccount() == null) ? 0 : getVirtualGatewayOwnerAccount()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectConnectGatewayAssociation == false)
            return false;
        DirectConnectGatewayAssociation other = (DirectConnectGatewayAssociation) obj;

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
        if (other.getAssociationState() == null ^ this.getAssociationState() == null)
            return false;
        if (other.getAssociationState() != null
                && other.getAssociationState().equals(this.getAssociationState()) == false)
            return false;
        if (other.getStateChangeError() == null ^ this.getStateChangeError() == null)
            return false;
        if (other.getStateChangeError() != null
                && other.getStateChangeError().equals(this.getStateChangeError()) == false)
            return false;
        if (other.getAssociatedGateway() == null ^ this.getAssociatedGateway() == null)
            return false;
        if (other.getAssociatedGateway() != null
                && other.getAssociatedGateway().equals(this.getAssociatedGateway()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAllowedPrefixesToDirectConnectGateway() == null
                ^ this.getAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getAllowedPrefixesToDirectConnectGateway() != null
                && other.getAllowedPrefixesToDirectConnectGateway().equals(
                        this.getAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null
                && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        if (other.getVirtualGatewayRegion() == null ^ this.getVirtualGatewayRegion() == null)
            return false;
        if (other.getVirtualGatewayRegion() != null
                && other.getVirtualGatewayRegion().equals(this.getVirtualGatewayRegion()) == false)
            return false;
        if (other.getVirtualGatewayOwnerAccount() == null
                ^ this.getVirtualGatewayOwnerAccount() == null)
            return false;
        if (other.getVirtualGatewayOwnerAccount() != null
                && other.getVirtualGatewayOwnerAccount().equals(
                        this.getVirtualGatewayOwnerAccount()) == false)
            return false;
        return true;
    }
}
