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

public class CreateDirectConnectGatewayAssociationResult implements Serializable {
    /**
     * <p>
     * The association to be created.
     * </p>
     */
    private DirectConnectGatewayAssociation directConnectGatewayAssociation;

    /**
     * <p>
     * The association to be created.
     * </p>
     *
     * @return <p>
     *         The association to be created.
     *         </p>
     */
    public DirectConnectGatewayAssociation getDirectConnectGatewayAssociation() {
        return directConnectGatewayAssociation;
    }

    /**
     * <p>
     * The association to be created.
     * </p>
     *
     * @param directConnectGatewayAssociation <p>
     *            The association to be created.
     *            </p>
     */
    public void setDirectConnectGatewayAssociation(
            DirectConnectGatewayAssociation directConnectGatewayAssociation) {
        this.directConnectGatewayAssociation = directConnectGatewayAssociation;
    }

    /**
     * <p>
     * The association to be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayAssociation <p>
     *            The association to be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationResult withDirectConnectGatewayAssociation(
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

        if (obj instanceof CreateDirectConnectGatewayAssociationResult == false)
            return false;
        CreateDirectConnectGatewayAssociationResult other = (CreateDirectConnectGatewayAssociationResult) obj;

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
