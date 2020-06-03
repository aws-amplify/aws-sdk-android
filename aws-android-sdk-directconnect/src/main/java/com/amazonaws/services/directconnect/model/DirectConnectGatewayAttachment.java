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
 * Information about an attachment between a Direct Connect gateway and a
 * virtual interface.
 * </p>
 */
public class DirectConnectGatewayAttachment implements Serializable {
    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     */
    private String virtualInterfaceId;

    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     */
    private String virtualInterfaceRegion;

    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     */
    private String virtualInterfaceOwnerAccount;

    /**
     * <p>
     * The state of the attachment. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attaching</code>: The initial state after a virtual interface is
     * created using the Direct Connect gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attached</code>: The Direct Connect gateway and virtual interface
     * are attached and ready to pass traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detaching</code>: The initial state after calling
     * <a>DeleteVirtualInterface</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detached</code>: The virtual interface is detached from the Direct
     * Connect gateway. Traffic flow between the Direct Connect gateway and
     * virtual interface is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     */
    private String attachmentState;

    /**
     * <p>
     * The type of attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TransitVirtualInterface, PrivateVirtualInterface
     */
    private String attachmentType;

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     */
    private String stateChangeError;

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
    public DirectConnectGatewayAttachment withDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
        return this;
    }

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
    public DirectConnectGatewayAttachment withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     *
     * @return <p>
     *         The AWS Region where the virtual interface is located.
     *         </p>
     */
    public String getVirtualInterfaceRegion() {
        return virtualInterfaceRegion;
    }

    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     *
     * @param virtualInterfaceRegion <p>
     *            The AWS Region where the virtual interface is located.
     *            </p>
     */
    public void setVirtualInterfaceRegion(String virtualInterfaceRegion) {
        this.virtualInterfaceRegion = virtualInterfaceRegion;
    }

    /**
     * <p>
     * The AWS Region where the virtual interface is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceRegion <p>
     *            The AWS Region where the virtual interface is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAttachment withVirtualInterfaceRegion(String virtualInterfaceRegion) {
        this.virtualInterfaceRegion = virtualInterfaceRegion;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the virtual interface.
     *         </p>
     */
    public String getVirtualInterfaceOwnerAccount() {
        return virtualInterfaceOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     *
     * @param virtualInterfaceOwnerAccount <p>
     *            The ID of the AWS account that owns the virtual interface.
     *            </p>
     */
    public void setVirtualInterfaceOwnerAccount(String virtualInterfaceOwnerAccount) {
        this.virtualInterfaceOwnerAccount = virtualInterfaceOwnerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceOwnerAccount <p>
     *            The ID of the AWS account that owns the virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGatewayAttachment withVirtualInterfaceOwnerAccount(
            String virtualInterfaceOwnerAccount) {
        this.virtualInterfaceOwnerAccount = virtualInterfaceOwnerAccount;
        return this;
    }

    /**
     * <p>
     * The state of the attachment. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attaching</code>: The initial state after a virtual interface is
     * created using the Direct Connect gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attached</code>: The Direct Connect gateway and virtual interface
     * are attached and ready to pass traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detaching</code>: The initial state after calling
     * <a>DeleteVirtualInterface</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detached</code>: The virtual interface is detached from the Direct
     * Connect gateway. Traffic flow between the Direct Connect gateway and
     * virtual interface is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @return <p>
     *         The state of the attachment. The following are the possible
     *         values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>attaching</code>: The initial state after a virtual
     *         interface is created using the Direct Connect gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attached</code>: The Direct Connect gateway and virtual
     *         interface are attached and ready to pass traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>detaching</code>: The initial state after calling
     *         <a>DeleteVirtualInterface</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>detached</code>: The virtual interface is detached from the
     *         Direct Connect gateway. Traffic flow between the Direct Connect
     *         gateway and virtual interface is stopped.
     *         </p>
     *         </li>
     *         </ul>
     * @see DirectConnectGatewayAttachmentState
     */
    public String getAttachmentState() {
        return attachmentState;
    }

    /**
     * <p>
     * The state of the attachment. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attaching</code>: The initial state after a virtual interface is
     * created using the Direct Connect gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attached</code>: The Direct Connect gateway and virtual interface
     * are attached and ready to pass traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detaching</code>: The initial state after calling
     * <a>DeleteVirtualInterface</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detached</code>: The virtual interface is detached from the Direct
     * Connect gateway. Traffic flow between the Direct Connect gateway and
     * virtual interface is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param attachmentState <p>
     *            The state of the attachment. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>attaching</code>: The initial state after a virtual
     *            interface is created using the Direct Connect gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attached</code>: The Direct Connect gateway and virtual
     *            interface are attached and ready to pass traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>detaching</code>: The initial state after calling
     *            <a>DeleteVirtualInterface</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>detached</code>: The virtual interface is detached from
     *            the Direct Connect gateway. Traffic flow between the Direct
     *            Connect gateway and virtual interface is stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @see DirectConnectGatewayAttachmentState
     */
    public void setAttachmentState(String attachmentState) {
        this.attachmentState = attachmentState;
    }

    /**
     * <p>
     * The state of the attachment. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attaching</code>: The initial state after a virtual interface is
     * created using the Direct Connect gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attached</code>: The Direct Connect gateway and virtual interface
     * are attached and ready to pass traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detaching</code>: The initial state after calling
     * <a>DeleteVirtualInterface</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detached</code>: The virtual interface is detached from the Direct
     * Connect gateway. Traffic flow between the Direct Connect gateway and
     * virtual interface is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param attachmentState <p>
     *            The state of the attachment. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>attaching</code>: The initial state after a virtual
     *            interface is created using the Direct Connect gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attached</code>: The Direct Connect gateway and virtual
     *            interface are attached and ready to pass traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>detaching</code>: The initial state after calling
     *            <a>DeleteVirtualInterface</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>detached</code>: The virtual interface is detached from
     *            the Direct Connect gateway. Traffic flow between the Direct
     *            Connect gateway and virtual interface is stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectConnectGatewayAttachmentState
     */
    public DirectConnectGatewayAttachment withAttachmentState(String attachmentState) {
        this.attachmentState = attachmentState;
        return this;
    }

    /**
     * <p>
     * The state of the attachment. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attaching</code>: The initial state after a virtual interface is
     * created using the Direct Connect gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attached</code>: The Direct Connect gateway and virtual interface
     * are attached and ready to pass traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detaching</code>: The initial state after calling
     * <a>DeleteVirtualInterface</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detached</code>: The virtual interface is detached from the Direct
     * Connect gateway. Traffic flow between the Direct Connect gateway and
     * virtual interface is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param attachmentState <p>
     *            The state of the attachment. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>attaching</code>: The initial state after a virtual
     *            interface is created using the Direct Connect gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attached</code>: The Direct Connect gateway and virtual
     *            interface are attached and ready to pass traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>detaching</code>: The initial state after calling
     *            <a>DeleteVirtualInterface</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>detached</code>: The virtual interface is detached from
     *            the Direct Connect gateway. Traffic flow between the Direct
     *            Connect gateway and virtual interface is stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @see DirectConnectGatewayAttachmentState
     */
    public void setAttachmentState(DirectConnectGatewayAttachmentState attachmentState) {
        this.attachmentState = attachmentState.toString();
    }

    /**
     * <p>
     * The state of the attachment. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attaching</code>: The initial state after a virtual interface is
     * created using the Direct Connect gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attached</code>: The Direct Connect gateway and virtual interface
     * are attached and ready to pass traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detaching</code>: The initial state after calling
     * <a>DeleteVirtualInterface</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>detached</code>: The virtual interface is detached from the Direct
     * Connect gateway. Traffic flow between the Direct Connect gateway and
     * virtual interface is stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>attaching, attached, detaching, detached
     *
     * @param attachmentState <p>
     *            The state of the attachment. The following are the possible
     *            values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>attaching</code>: The initial state after a virtual
     *            interface is created using the Direct Connect gateway.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>attached</code>: The Direct Connect gateway and virtual
     *            interface are attached and ready to pass traffic.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>detaching</code>: The initial state after calling
     *            <a>DeleteVirtualInterface</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>detached</code>: The virtual interface is detached from
     *            the Direct Connect gateway. Traffic flow between the Direct
     *            Connect gateway and virtual interface is stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectConnectGatewayAttachmentState
     */
    public DirectConnectGatewayAttachment withAttachmentState(
            DirectConnectGatewayAttachmentState attachmentState) {
        this.attachmentState = attachmentState.toString();
        return this;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TransitVirtualInterface, PrivateVirtualInterface
     *
     * @return <p>
     *         The type of attachment.
     *         </p>
     * @see DirectConnectGatewayAttachmentType
     */
    public String getAttachmentType() {
        return attachmentType;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TransitVirtualInterface, PrivateVirtualInterface
     *
     * @param attachmentType <p>
     *            The type of attachment.
     *            </p>
     * @see DirectConnectGatewayAttachmentType
     */
    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TransitVirtualInterface, PrivateVirtualInterface
     *
     * @param attachmentType <p>
     *            The type of attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectConnectGatewayAttachmentType
     */
    public DirectConnectGatewayAttachment withAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TransitVirtualInterface, PrivateVirtualInterface
     *
     * @param attachmentType <p>
     *            The type of attachment.
     *            </p>
     * @see DirectConnectGatewayAttachmentType
     */
    public void setAttachmentType(DirectConnectGatewayAttachmentType attachmentType) {
        this.attachmentType = attachmentType.toString();
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TransitVirtualInterface, PrivateVirtualInterface
     *
     * @param attachmentType <p>
     *            The type of attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectConnectGatewayAttachmentType
     */
    public DirectConnectGatewayAttachment withAttachmentType(
            DirectConnectGatewayAttachmentType attachmentType) {
        this.attachmentType = attachmentType.toString();
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
    public DirectConnectGatewayAttachment withStateChangeError(String stateChangeError) {
        this.stateChangeError = stateChangeError;
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
        if (getVirtualInterfaceId() != null)
            sb.append("virtualInterfaceId: " + getVirtualInterfaceId() + ",");
        if (getVirtualInterfaceRegion() != null)
            sb.append("virtualInterfaceRegion: " + getVirtualInterfaceRegion() + ",");
        if (getVirtualInterfaceOwnerAccount() != null)
            sb.append("virtualInterfaceOwnerAccount: " + getVirtualInterfaceOwnerAccount() + ",");
        if (getAttachmentState() != null)
            sb.append("attachmentState: " + getAttachmentState() + ",");
        if (getAttachmentType() != null)
            sb.append("attachmentType: " + getAttachmentType() + ",");
        if (getStateChangeError() != null)
            sb.append("stateChangeError: " + getStateChangeError());
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
        hashCode = prime * hashCode
                + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getVirtualInterfaceRegion() == null) ? 0 : getVirtualInterfaceRegion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getVirtualInterfaceOwnerAccount() == null) ? 0
                        : getVirtualInterfaceOwnerAccount().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentState() == null) ? 0 : getAttachmentState().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentType() == null) ? 0 : getAttachmentType().hashCode());
        hashCode = prime * hashCode
                + ((getStateChangeError() == null) ? 0 : getStateChangeError().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectConnectGatewayAttachment == false)
            return false;
        DirectConnectGatewayAttachment other = (DirectConnectGatewayAttachment) obj;

        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null
                && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null
                && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getVirtualInterfaceRegion() == null ^ this.getVirtualInterfaceRegion() == null)
            return false;
        if (other.getVirtualInterfaceRegion() != null
                && other.getVirtualInterfaceRegion().equals(this.getVirtualInterfaceRegion()) == false)
            return false;
        if (other.getVirtualInterfaceOwnerAccount() == null
                ^ this.getVirtualInterfaceOwnerAccount() == null)
            return false;
        if (other.getVirtualInterfaceOwnerAccount() != null
                && other.getVirtualInterfaceOwnerAccount().equals(
                        this.getVirtualInterfaceOwnerAccount()) == false)
            return false;
        if (other.getAttachmentState() == null ^ this.getAttachmentState() == null)
            return false;
        if (other.getAttachmentState() != null
                && other.getAttachmentState().equals(this.getAttachmentState()) == false)
            return false;
        if (other.getAttachmentType() == null ^ this.getAttachmentType() == null)
            return false;
        if (other.getAttachmentType() != null
                && other.getAttachmentType().equals(this.getAttachmentType()) == false)
            return false;
        if (other.getStateChangeError() == null ^ this.getStateChangeError() == null)
            return false;
        if (other.getStateChangeError() != null
                && other.getStateChangeError().equals(this.getStateChangeError()) == false)
            return false;
        return true;
    }
}
