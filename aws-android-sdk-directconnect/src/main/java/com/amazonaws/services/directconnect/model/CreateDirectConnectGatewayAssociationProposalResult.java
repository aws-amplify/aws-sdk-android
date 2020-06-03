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

public class CreateDirectConnectGatewayAssociationProposalResult implements Serializable {
    /**
     * <p>
     * Information about the Direct Connect gateway proposal.
     * </p>
     */
    private DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal;

    /**
     * <p>
     * Information about the Direct Connect gateway proposal.
     * </p>
     *
     * @return <p>
     *         Information about the Direct Connect gateway proposal.
     *         </p>
     */
    public DirectConnectGatewayAssociationProposal getDirectConnectGatewayAssociationProposal() {
        return directConnectGatewayAssociationProposal;
    }

    /**
     * <p>
     * Information about the Direct Connect gateway proposal.
     * </p>
     *
     * @param directConnectGatewayAssociationProposal <p>
     *            Information about the Direct Connect gateway proposal.
     *            </p>
     */
    public void setDirectConnectGatewayAssociationProposal(
            DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal) {
        this.directConnectGatewayAssociationProposal = directConnectGatewayAssociationProposal;
    }

    /**
     * <p>
     * Information about the Direct Connect gateway proposal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayAssociationProposal <p>
     *            Information about the Direct Connect gateway proposal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayAssociationProposalResult withDirectConnectGatewayAssociationProposal(
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

        if (obj instanceof CreateDirectConnectGatewayAssociationProposalResult == false)
            return false;
        CreateDirectConnectGatewayAssociationProposalResult other = (CreateDirectConnectGatewayAssociationProposalResult) obj;

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
