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

public class DescribeDirectConnectGatewayAssociationProposalsResult implements Serializable {
    /**
     * <p>
     * Describes the Direct Connect gateway association proposals.
     * </p>
     */
    private java.util.List<DirectConnectGatewayAssociationProposal> directConnectGatewayAssociationProposals;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Describes the Direct Connect gateway association proposals.
     * </p>
     *
     * @return <p>
     *         Describes the Direct Connect gateway association proposals.
     *         </p>
     */
    public java.util.List<DirectConnectGatewayAssociationProposal> getDirectConnectGatewayAssociationProposals() {
        return directConnectGatewayAssociationProposals;
    }

    /**
     * <p>
     * Describes the Direct Connect gateway association proposals.
     * </p>
     *
     * @param directConnectGatewayAssociationProposals <p>
     *            Describes the Direct Connect gateway association proposals.
     *            </p>
     */
    public void setDirectConnectGatewayAssociationProposals(
            java.util.Collection<DirectConnectGatewayAssociationProposal> directConnectGatewayAssociationProposals) {
        if (directConnectGatewayAssociationProposals == null) {
            this.directConnectGatewayAssociationProposals = null;
            return;
        }

        this.directConnectGatewayAssociationProposals = new java.util.ArrayList<DirectConnectGatewayAssociationProposal>(
                directConnectGatewayAssociationProposals);
    }

    /**
     * <p>
     * Describes the Direct Connect gateway association proposals.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayAssociationProposals <p>
     *            Describes the Direct Connect gateway association proposals.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationProposalsResult withDirectConnectGatewayAssociationProposals(
            DirectConnectGatewayAssociationProposal... directConnectGatewayAssociationProposals) {
        if (getDirectConnectGatewayAssociationProposals() == null) {
            this.directConnectGatewayAssociationProposals = new java.util.ArrayList<DirectConnectGatewayAssociationProposal>(
                    directConnectGatewayAssociationProposals.length);
        }
        for (DirectConnectGatewayAssociationProposal value : directConnectGatewayAssociationProposals) {
            this.directConnectGatewayAssociationProposals.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes the Direct Connect gateway association proposals.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayAssociationProposals <p>
     *            Describes the Direct Connect gateway association proposals.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationProposalsResult withDirectConnectGatewayAssociationProposals(
            java.util.Collection<DirectConnectGatewayAssociationProposal> directConnectGatewayAssociationProposals) {
        setDirectConnectGatewayAssociationProposals(directConnectGatewayAssociationProposals);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationProposalsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDirectConnectGatewayAssociationProposals() != null)
            sb.append("directConnectGatewayAssociationProposals: "
                    + getDirectConnectGatewayAssociationProposals() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayAssociationProposals() == null) ? 0
                        : getDirectConnectGatewayAssociationProposals().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDirectConnectGatewayAssociationProposalsResult == false)
            return false;
        DescribeDirectConnectGatewayAssociationProposalsResult other = (DescribeDirectConnectGatewayAssociationProposalsResult) obj;

        if (other.getDirectConnectGatewayAssociationProposals() == null
                ^ this.getDirectConnectGatewayAssociationProposals() == null)
            return false;
        if (other.getDirectConnectGatewayAssociationProposals() != null
                && other.getDirectConnectGatewayAssociationProposals().equals(
                        this.getDirectConnectGatewayAssociationProposals()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
