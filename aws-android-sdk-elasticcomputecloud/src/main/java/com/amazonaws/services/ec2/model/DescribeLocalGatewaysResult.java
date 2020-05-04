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

public class DescribeLocalGatewaysResult implements Serializable {
    /**
     * <p>
     * Information about the local gateways.
     * </p>
     */
    private java.util.List<LocalGateway> localGateways;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the local gateways.
     * </p>
     *
     * @return <p>
     *         Information about the local gateways.
     *         </p>
     */
    public java.util.List<LocalGateway> getLocalGateways() {
        return localGateways;
    }

    /**
     * <p>
     * Information about the local gateways.
     * </p>
     *
     * @param localGateways <p>
     *            Information about the local gateways.
     *            </p>
     */
    public void setLocalGateways(java.util.Collection<LocalGateway> localGateways) {
        if (localGateways == null) {
            this.localGateways = null;
            return;
        }

        this.localGateways = new java.util.ArrayList<LocalGateway>(localGateways);
    }

    /**
     * <p>
     * Information about the local gateways.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGateways <p>
     *            Information about the local gateways.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLocalGatewaysResult withLocalGateways(LocalGateway... localGateways) {
        if (getLocalGateways() == null) {
            this.localGateways = new java.util.ArrayList<LocalGateway>(localGateways.length);
        }
        for (LocalGateway value : localGateways) {
            this.localGateways.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the local gateways.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGateways <p>
     *            Information about the local gateways.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLocalGatewaysResult withLocalGateways(
            java.util.Collection<LocalGateway> localGateways) {
        setLocalGateways(localGateways);
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
    public DescribeLocalGatewaysResult withNextToken(String nextToken) {
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
        if (getLocalGateways() != null)
            sb.append("LocalGateways: " + getLocalGateways() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLocalGateways() == null) ? 0 : getLocalGateways().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocalGatewaysResult == false)
            return false;
        DescribeLocalGatewaysResult other = (DescribeLocalGatewaysResult) obj;

        if (other.getLocalGateways() == null ^ this.getLocalGateways() == null)
            return false;
        if (other.getLocalGateways() != null
                && other.getLocalGateways().equals(this.getLocalGateways()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
