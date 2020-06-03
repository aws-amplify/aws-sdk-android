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
 * Deletes the association proposal request between the specified Direct Connect
 * gateway and virtual private gateway or transit gateway.
 * </p>
 */
public class DeleteDirectConnectGatewayAssociationProposalRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The ID of the proposal.
     * </p>
     */
    private String proposalId;

    /**
     * <p>
     * The ID of the proposal.
     * </p>
     *
     * @return <p>
     *         The ID of the proposal.
     *         </p>
     */
    public String getProposalId() {
        return proposalId;
    }

    /**
     * <p>
     * The ID of the proposal.
     * </p>
     *
     * @param proposalId <p>
     *            The ID of the proposal.
     *            </p>
     */
    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    /**
     * <p>
     * The ID of the proposal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proposalId <p>
     *            The ID of the proposal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDirectConnectGatewayAssociationProposalRequest withProposalId(String proposalId) {
        this.proposalId = proposalId;
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
        if (getProposalId() != null)
            sb.append("proposalId: " + getProposalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProposalId() == null) ? 0 : getProposalId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDirectConnectGatewayAssociationProposalRequest == false)
            return false;
        DeleteDirectConnectGatewayAssociationProposalRequest other = (DeleteDirectConnectGatewayAssociationProposalRequest) obj;

        if (other.getProposalId() == null ^ this.getProposalId() == null)
            return false;
        if (other.getProposalId() != null
                && other.getProposalId().equals(this.getProposalId()) == false)
            return false;
        return true;
    }
}
