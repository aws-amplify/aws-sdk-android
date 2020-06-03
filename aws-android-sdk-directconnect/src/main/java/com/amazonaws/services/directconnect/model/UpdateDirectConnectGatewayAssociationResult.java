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

public class UpdateDirectConnectGatewayAssociationResult implements Serializable {
    /**
     * <p>
     * Information about an association between a Direct Connect gateway and a
     * virtual private gateway or transit gateway.
     * </p>
     */
    private DirectConnectGatewayAssociation directConnectGatewayAssociation;

    /**
     * <p>
     * Information about an association between a Direct Connect gateway and a
     * virtual private gateway or transit gateway.
     * </p>
     *
     * @return <p>
     *         Information about an association between a Direct Connect gateway
     *         and a virtual private gateway or transit gateway.
     *         </p>
     */
    public DirectConnectGatewayAssociation getDirectConnectGatewayAssociation() {
        return directConnectGatewayAssociation;
    }

    /**
     * <p>
     * Information about an association between a Direct Connect gateway and a
     * virtual private gateway or transit gateway.
     * </p>
     *
     * @param directConnectGatewayAssociation <p>
     *            Information about an association between a Direct Connect
     *            gateway and a virtual private gateway or transit gateway.
     *            </p>
     */
    public void setDirectConnectGatewayAssociation(
            DirectConnectGatewayAssociation directConnectGatewayAssociation) {
        this.directConnectGatewayAssociation = directConnectGatewayAssociation;
    }

    /**
     * <p>
     * Information about an association between a Direct Connect gateway and a
     * virtual private gateway or transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayAssociation <p>
     *            Information about an association between a Direct Connect
     *            gateway and a virtual private gateway or transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDirectConnectGatewayAssociationResult withDirectConnectGatewayAssociation(
            DirectConnectGatewayAssociation directConnectGatewayAssociation) {
        this.directConnectGatewayAssociation = directConnectGatewayAssociation;
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
        if (getDirectConnectGatewayAssociation() != null)
            sb.append("directConnectGatewayAssociation: " + getDirectConnectGatewayAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayAssociation() == null) ? 0
                        : getDirectConnectGatewayAssociation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDirectConnectGatewayAssociationResult == false)
            return false;
        UpdateDirectConnectGatewayAssociationResult other = (UpdateDirectConnectGatewayAssociationResult) obj;

        if (other.getDirectConnectGatewayAssociation() == null
                ^ this.getDirectConnectGatewayAssociation() == null)
            return false;
        if (other.getDirectConnectGatewayAssociation() != null
                && other.getDirectConnectGatewayAssociation().equals(
                        this.getDirectConnectGatewayAssociation()) == false)
            return false;
        return true;
    }
}
