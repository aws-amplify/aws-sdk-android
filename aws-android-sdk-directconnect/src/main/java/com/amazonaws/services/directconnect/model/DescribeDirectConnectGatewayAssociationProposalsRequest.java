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
 * Describes one or more association proposals for connection between a virtual
 * private gateway or transit gateway and a Direct Connect gateway.
 * </p>
 */
public class DescribeDirectConnectGatewayAssociationProposalsRequest extends
        AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;

    /**
     * <p>
     * The ID of the proposal.
     * </p>
     */
    private String proposalId;

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     */
    private String associatedGatewayId;

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100
     * results are returned.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the Direct Connect gateway.
     *         </p>
     */
    public String getDirectConnectGatewayId() {
        return directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     *
     * @param directConnectGatewayId <p>
     *            The ID of the Direct Connect gateway.
     *            </p>
     */
    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayId <p>
     *            The ID of the Direct Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationProposalsRequest withDirectConnectGatewayId(
            String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
        return this;
    }

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
    public DescribeDirectConnectGatewayAssociationProposalsRequest withProposalId(String proposalId) {
        this.proposalId = proposalId;
        return this;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the associated gateway.
     *         </p>
     */
    public String getAssociatedGatewayId() {
        return associatedGatewayId;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     *
     * @param associatedGatewayId <p>
     *            The ID of the associated gateway.
     *            </p>
     */
    public void setAssociatedGatewayId(String associatedGatewayId) {
        this.associatedGatewayId = associatedGatewayId;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedGatewayId <p>
     *            The ID of the associated gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationProposalsRequest withAssociatedGatewayId(
            String associatedGatewayId) {
        this.associatedGatewayId = associatedGatewayId;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100
     * results are returned.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return with a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>nextToken</code> value.
     *         </p>
     *         <p>
     *         If <code>MaxResults</code> is given a value larger than 100, only
     *         100 results are returned.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100
     * results are returned.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     *            <p>
     *            If <code>MaxResults</code> is given a value larger than 100,
     *            only 100 results are returned.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100
     * results are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     *            <p>
     *            If <code>MaxResults</code> is given a value larger than 100,
     *            only 100 results are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationProposalsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @return <p>
     *         The token for the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationProposalsRequest withNextToken(String nextToken) {
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
        if (getDirectConnectGatewayId() != null)
            sb.append("directConnectGatewayId: " + getDirectConnectGatewayId() + ",");
        if (getProposalId() != null)
            sb.append("proposalId: " + getProposalId() + ",");
        if (getAssociatedGatewayId() != null)
            sb.append("associatedGatewayId: " + getAssociatedGatewayId() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
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
                + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId()
                        .hashCode());
        hashCode = prime * hashCode + ((getProposalId() == null) ? 0 : getProposalId().hashCode());
        hashCode = prime * hashCode
                + ((getAssociatedGatewayId() == null) ? 0 : getAssociatedGatewayId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDirectConnectGatewayAssociationProposalsRequest == false)
            return false;
        DescribeDirectConnectGatewayAssociationProposalsRequest other = (DescribeDirectConnectGatewayAssociationProposalsRequest) obj;

        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null
                && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getProposalId() == null ^ this.getProposalId() == null)
            return false;
        if (other.getProposalId() != null
                && other.getProposalId().equals(this.getProposalId()) == false)
            return false;
        if (other.getAssociatedGatewayId() == null ^ this.getAssociatedGatewayId() == null)
            return false;
        if (other.getAssociatedGatewayId() != null
                && other.getAssociatedGatewayId().equals(this.getAssociatedGatewayId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
