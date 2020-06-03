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
 * Lists the associations between your Direct Connect gateways and virtual
 * private gateways. You must specify a Direct Connect gateway, a virtual
 * private gateway, or both. If you specify a Direct Connect gateway, the
 * response contains all virtual private gateways associated with the Direct
 * Connect gateway. If you specify a virtual private gateway, the response
 * contains all Direct Connect gateways associated with the virtual private
 * gateway. If you specify both, the response contains the association between
 * the Direct Connect gateway and the virtual private gateway.
 * </p>
 */
public class DescribeDirectConnectGatewayAssociationsRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     */
    private String associatedGatewayId;

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;

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
     * The token provided in the previous call to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String virtualGatewayId;

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     *
     * @return <p>
     *         The ID of the Direct Connect gateway association.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     *
     * @param associationId <p>
     *            The ID of the Direct Connect gateway association.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationId <p>
     *            The ID of the Direct Connect gateway association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationsRequest withAssociationId(String associationId) {
        this.associationId = associationId;
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
    public DescribeDirectConnectGatewayAssociationsRequest withAssociatedGatewayId(
            String associatedGatewayId) {
        this.associatedGatewayId = associatedGatewayId;
        return this;
    }

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
    public DescribeDirectConnectGatewayAssociationsRequest withDirectConnectGatewayId(
            String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
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
    public DescribeDirectConnectGatewayAssociationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token provided in the previous call to retrieve the next page.
     * </p>
     *
     * @return <p>
     *         The token provided in the previous call to retrieve the next
     *         page.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token provided in the previous call to retrieve the next page.
     * </p>
     *
     * @param nextToken <p>
     *            The token provided in the previous call to retrieve the next
     *            page.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token provided in the previous call to retrieve the next page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token provided in the previous call to retrieve the next
     *            page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual private gateway.
     *         </p>
     */
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     *
     * @param virtualGatewayId <p>
     *            The ID of the virtual private gateway.
     *            </p>
     */
    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualGatewayId <p>
     *            The ID of the virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationsRequest withVirtualGatewayId(
            String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
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
        if (getAssociationId() != null)
            sb.append("associationId: " + getAssociationId() + ",");
        if (getAssociatedGatewayId() != null)
            sb.append("associatedGatewayId: " + getAssociatedGatewayId() + ",");
        if (getDirectConnectGatewayId() != null)
            sb.append("directConnectGatewayId: " + getDirectConnectGatewayId() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getVirtualGatewayId() != null)
            sb.append("virtualGatewayId: " + getVirtualGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode
                + ((getAssociatedGatewayId() == null) ? 0 : getAssociatedGatewayId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId()
                        .hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDirectConnectGatewayAssociationsRequest == false)
            return false;
        DescribeDirectConnectGatewayAssociationsRequest other = (DescribeDirectConnectGatewayAssociationsRequest) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAssociatedGatewayId() == null ^ this.getAssociatedGatewayId() == null)
            return false;
        if (other.getAssociatedGatewayId() != null
                && other.getAssociatedGatewayId().equals(this.getAssociatedGatewayId()) == false)
            return false;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null
                && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
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
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null)
            return false;
        if (other.getVirtualGatewayId() != null
                && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false)
            return false;
        return true;
    }
}
