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

public class DeleteDirectConnectGatewayAssociationProposalResult implements Serializable {
    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     */
    private DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal;

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the associated gateway.
     *         </p>
     */
    public DirectConnectGatewayAssociationProposal getDirectConnectGatewayAssociationProposal() {
        return directConnectGatewayAssociationProposal;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     *
     * @param directConnectGatewayAssociationProposal <p>
     *            The ID of the associated gateway.
     *            </p>
     */
    public void setDirectConnectGatewayAssociationProposal(
            DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal) {
        this.directConnectGatewayAssociationProposal = directConnectGatewayAssociationProposal;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayAssociationProposal <p>
     *            The ID of the associated gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDirectConnectGatewayAssociationProposalResult withDirectConnectGatewayAssociationProposal(
            DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal) {
        this.directConnectGatewayAssociationProposal = directConnectGatewayAssociationProposal;
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
        if (getDirectConnectGatewayAssociationProposal() != null)
            sb.append("directConnectGatewayAssociationProposal: "
                    + getDirectConnectGatewayAssociationProposal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayAssociationProposal() == null) ? 0
                        : getDirectConnectGatewayAssociationProposal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDirectConnectGatewayAssociationProposalResult == false)
            return false;
        DeleteDirectConnectGatewayAssociationProposalResult other = (DeleteDirectConnectGatewayAssociationProposalResult) obj;

        if (other.getDirectConnectGatewayAssociationProposal() == null
                ^ this.getDirectConnectGatewayAssociationProposal() == null)
            return false;
        if (other.getDirectConnectGatewayAssociationProposal() != null
                && other.getDirectConnectGatewayAssociationProposal().equals(
                        this.getDirectConnectGatewayAssociationProposal()) == false)
            return false;
        return true;
    }
}
