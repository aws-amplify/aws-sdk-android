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
 * Creates a private virtual interface. A virtual interface is the VLAN that
 * transports AWS Direct Connect traffic. A private virtual interface can be
 * connected to either a Direct Connect gateway or a Virtual Private Gateway
 * (VGW). Connecting the private virtual interface to a Direct Connect gateway
 * enables the possibility for connecting to multiple VPCs, including VPCs in
 * different AWS Regions. Connecting the private virtual interface to a VGW only
 * provides access to a single VPC within the same Region.
 * </p>
 * <p>
 * Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an
 * update to the underlying physical connection if it wasn't updated to support
 * jumbo frames. Updating the connection disrupts network connectivity for all
 * virtual interfaces associated with the connection for up to 30 seconds. To
 * check whether your connection supports jumbo frames, call
 * <a>DescribeConnections</a>. To check whether your virtual interface supports
 * jumbo frames, call <a>DescribeVirtualInterfaces</a>.
 * </p>
 */
public class CreatePrivateVirtualInterfaceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * Information about the private virtual interface.
     * </p>
     */
    private NewPrivateVirtualInterface newPrivateVirtualInterface;

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
    public CreatePrivateVirtualInterfaceRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * Information about the private virtual interface.
     * </p>
     *
     * @return <p>
     *         Information about the private virtual interface.
     *         </p>
     */
    public NewPrivateVirtualInterface getNewPrivateVirtualInterface() {
        return newPrivateVirtualInterface;
    }

    /**
     * <p>
     * Information about the private virtual interface.
     * </p>
     *
     * @param newPrivateVirtualInterface <p>
     *            Information about the private virtual interface.
     *            </p>
     */
    public void setNewPrivateVirtualInterface(NewPrivateVirtualInterface newPrivateVirtualInterface) {
        this.newPrivateVirtualInterface = newPrivateVirtualInterface;
    }

    /**
     * <p>
     * Information about the private virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newPrivateVirtualInterface <p>
     *            Information about the private virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePrivateVirtualInterfaceRequest withNewPrivateVirtualInterface(
            NewPrivateVirtualInterface newPrivateVirtualInterface) {
        this.newPrivateVirtualInterface = newPrivateVirtualInterface;
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
        if (getNewPrivateVirtualInterface() != null)
            sb.append("newPrivateVirtualInterface: " + getNewPrivateVirtualInterface());
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
                + ((getNewPrivateVirtualInterface() == null) ? 0 : getNewPrivateVirtualInterface()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePrivateVirtualInterfaceRequest == false)
            return false;
        CreatePrivateVirtualInterfaceRequest other = (CreatePrivateVirtualInterfaceRequest) obj;

        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getNewPrivateVirtualInterface() == null
                ^ this.getNewPrivateVirtualInterface() == null)
            return false;
        if (other.getNewPrivateVirtualInterface() != null
                && other.getNewPrivateVirtualInterface().equals(
                        this.getNewPrivateVirtualInterface()) == false)
            return false;
        return true;
    }
}
