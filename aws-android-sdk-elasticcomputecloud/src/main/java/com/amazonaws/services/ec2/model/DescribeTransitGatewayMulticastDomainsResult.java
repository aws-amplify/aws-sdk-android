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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DescribeTransitGatewayMulticastDomainsResult implements Serializable {
    /**
     * <p>
     * Information about the transit gateway multicast domains.
     * </p>
     */
    private java.util.List<TransitGatewayMulticastDomain> transitGatewayMulticastDomains;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the transit gateway multicast domains.
     * </p>
     *
     * @return <p>
     *         Information about the transit gateway multicast domains.
     *         </p>
     */
    public java.util.List<TransitGatewayMulticastDomain> getTransitGatewayMulticastDomains() {
        return transitGatewayMulticastDomains;
    }

    /**
     * <p>
     * Information about the transit gateway multicast domains.
     * </p>
     *
     * @param transitGatewayMulticastDomains <p>
     *            Information about the transit gateway multicast domains.
     *            </p>
     */
    public void setTransitGatewayMulticastDomains(
            java.util.Collection<TransitGatewayMulticastDomain> transitGatewayMulticastDomains) {
        if (transitGatewayMulticastDomains == null) {
            this.transitGatewayMulticastDomains = null;
            return;
        }

        this.transitGatewayMulticastDomains = new java.util.ArrayList<TransitGatewayMulticastDomain>(
                transitGatewayMulticastDomains);
    }

    /**
     * <p>
     * Information about the transit gateway multicast domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayMulticastDomains <p>
     *            Information about the transit gateway multicast domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewayMulticastDomainsResult withTransitGatewayMulticastDomains(
            TransitGatewayMulticastDomain... transitGatewayMulticastDomains) {
        if (getTransitGatewayMulticastDomains() == null) {
            this.transitGatewayMulticastDomains = new java.util.ArrayList<TransitGatewayMulticastDomain>(
                    transitGatewayMulticastDomains.length);
        }
        for (TransitGatewayMulticastDomain value : transitGatewayMulticastDomains) {
            this.transitGatewayMulticastDomains.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the transit gateway multicast domains.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayMulticastDomains <p>
     *            Information about the transit gateway multicast domains.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTransitGatewayMulticastDomainsResult withTransitGatewayMulticastDomains(
            java.util.Collection<TransitGatewayMulticastDomain> transitGatewayMulticastDomains) {
        setTransitGatewayMulticastDomains(transitGatewayMulticastDomains);
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
    public DescribeTransitGatewayMulticastDomainsResult withNextToken(String nextToken) {
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
        if (getTransitGatewayMulticastDomains() != null)
            sb.append("TransitGatewayMulticastDomains: " + getTransitGatewayMulticastDomains()
                    + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransitGatewayMulticastDomains() == null) ? 0
                        : getTransitGatewayMulticastDomains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTransitGatewayMulticastDomainsResult == false)
            return false;
        DescribeTransitGatewayMulticastDomainsResult other = (DescribeTransitGatewayMulticastDomainsResult) obj;

        if (other.getTransitGatewayMulticastDomains() == null
                ^ this.getTransitGatewayMulticastDomains() == null)
            return false;
        if (other.getTransitGatewayMulticastDomains() != null
                && other.getTransitGatewayMulticastDomains().equals(
                        this.getTransitGatewayMulticastDomains()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
