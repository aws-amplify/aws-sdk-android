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
 * Creates a public virtual interface. A virtual interface is the VLAN that
 * transports AWS Direct Connect traffic. A public virtual interface supports
 * sending traffic to public services of AWS such as Amazon S3.
 * </p>
 * <p>
 * When creating an IPv6 public virtual interface (<code>addressFamily</code> is
 * <code>ipv6</code>), leave the <code>customer</code> and <code>amazon</code>
 * address fields blank to use auto-assigned IPv6 space. Custom IPv6 addresses
 * are not supported.
 * </p>
 */
public class CreatePublicVirtualInterfaceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     */
    private NewPublicVirtualInterface newPublicVirtualInterface;

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
    public CreatePublicVirtualInterfaceRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     *
     * @return <p>
     *         Information about the public virtual interface.
     *         </p>
     */
    public NewPublicVirtualInterface getNewPublicVirtualInterface() {
        return newPublicVirtualInterface;
    }

    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     *
     * @param newPublicVirtualInterface <p>
     *            Information about the public virtual interface.
     *            </p>
     */
    public void setNewPublicVirtualInterface(NewPublicVirtualInterface newPublicVirtualInterface) {
        this.newPublicVirtualInterface = newPublicVirtualInterface;
    }

    /**
     * <p>
     * Information about the public virtual interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newPublicVirtualInterface <p>
     *            Information about the public virtual interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicVirtualInterfaceRequest withNewPublicVirtualInterface(
            NewPublicVirtualInterface newPublicVirtualInterface) {
        this.newPublicVirtualInterface = newPublicVirtualInterface;
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
        if (getNewPublicVirtualInterface() != null)
            sb.append("newPublicVirtualInterface: " + getNewPublicVirtualInterface());
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
                + ((getNewPublicVirtualInterface() == null) ? 0 : getNewPublicVirtualInterface()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePublicVirtualInterfaceRequest == false)
            return false;
        CreatePublicVirtualInterfaceRequest other = (CreatePublicVirtualInterfaceRequest) obj;

        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getNewPublicVirtualInterface() == null
                ^ this.getNewPublicVirtualInterface() == null)
            return false;
        if (other.getNewPublicVirtualInterface() != null
                && other.getNewPublicVirtualInterface().equals(this.getNewPublicVirtualInterface()) == false)
            return false;
        return true;
    }
}
