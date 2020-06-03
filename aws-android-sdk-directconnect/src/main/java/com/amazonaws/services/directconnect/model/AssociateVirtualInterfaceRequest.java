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
 * Associates a virtual interface with a specified link aggregation group (LAG)
 * or connection. Connectivity to AWS is temporarily interrupted as the virtual
 * interface is being migrated. If the target connection or LAG has an
 * associated virtual interface with a conflicting VLAN number or a conflicting
 * IP address, the operation fails.
 * </p>
 * <p>
 * Virtual interfaces associated with a hosted connection cannot be associated
 * with a LAG; hosted connections must be migrated along with their virtual
 * interfaces using <a>AssociateHostedConnection</a>.
 * </p>
 * <p>
 * To reassociate a virtual interface to a new connection or LAG, the requester
 * must own either the virtual interface itself or the connection to which the
 * virtual interface is currently associated. Additionally, the requester must
 * own the connection or LAG for the association.
 * </p>
 */
public class AssociateVirtualInterfaceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     */
    private String virtualInterfaceId;

    /**
     * <p>
     * The ID of the LAG or connection.
     * </p>
     */
    private String connectionId;

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
    public AssociateVirtualInterfaceRequest withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * <p>
     * The ID of the LAG or connection.
     * </p>
     *
     * @return <p>
     *         The ID of the LAG or connection.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the LAG or connection.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the LAG or connection.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the LAG or connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the LAG or connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateVirtualInterfaceRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
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
        if (getConnectionId() != null)
            sb.append("connectionId: " + getConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateVirtualInterfaceRequest == false)
            return false;
        AssociateVirtualInterfaceRequest other = (AssociateVirtualInterfaceRequest) obj;

        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null
                && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        return true;
    }
}
