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
 * Creates a transit virtual interface. A transit virtual interface should be
 * used to access one or more transit gateways associated with Direct Connect
 * gateways. A transit virtual interface enables the connection of multiple VPCs
 * attached to a transit gateway to a Direct Connect gateway.
 * </p>
 * <important>
 * <p>
 * If you associate your transit gateway with one or more Direct Connect
 * gateways, the Autonomous System Number (ASN) used by the transit gateway and
 * the Direct Connect gateway must be different. For example, if you use the
 * default ASN 64512 for both your the transit gateway and Direct Connect
 * gateway, the association request fails.
 * </p>
 * </important>
 * <p>
 * Setting the MTU of a virtual interface to 8500 (jumbo frames) can cause an
 * update to the underlying physical connection if it wasn't updated to support
 * jumbo frames. Updating the connection disrupts network connectivity for all
 * virtual interfaces associated with the connection for up to 30 seconds. To
 * check whether your connection supports jumbo frames, call
 * <a>DescribeConnections</a>. To check whether your virtual interface supports
 * jumbo frames, call <a>DescribeVirtualInterfaces</a>.
 * </p>
 */
public class CreateTransitVirtualInterfaceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     */
    private NewTransitVirtualInterface newTransitVirtualInterface;

    /**
     * <p>
     * The ID of the connection.
     * </p>
     *
     * @return <p>
     *         The ID of the connection.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the connection.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransitVirtualInterfaceRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
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
    public NewTransitVirtualInterface getNewTransitVirtualInterface() {
        return newTransitVirtualInterface;
    }

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     *
     * @param newTransitVirtualInterface <p>
     *            Information about the transit virtual interface.
     *            </p>
     */
    public void setNewTransitVirtualInterface(NewTransitVirtualInterface newTransitVirtualInterface) {
        this.newTransitVirtualInterface = newTransitVirtualInterface;
    }

    /**
     * <p>
     * Information about the transit virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newTransitVirtualInterface <p>
     *            Information about the transit virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransitVirtualInterfaceRequest withNewTransitVirtualInterface(
            NewTransitVirtualInterface newTransitVirtualInterface) {
        this.newTransitVirtualInterface = newTransitVirtualInterface;
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
        if (getNewTransitVirtualInterface() != null)
            sb.append("newTransitVirtualInterface: " + getNewTransitVirtualInterface());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewTransitVirtualInterface() == null) ? 0 : getNewTransitVirtualInterface()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitVirtualInterfaceRequest == false)
            return false;
        CreateTransitVirtualInterfaceRequest other = (CreateTransitVirtualInterfaceRequest) obj;

        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getNewTransitVirtualInterface() == null
                ^ this.getNewTransitVirtualInterface() == null)
            return false;
        if (other.getNewTransitVirtualInterface() != null
                && other.getNewTransitVirtualInterface().equals(
                        this.getNewTransitVirtualInterface()) == false)
            return false;
        return true;
    }
}
