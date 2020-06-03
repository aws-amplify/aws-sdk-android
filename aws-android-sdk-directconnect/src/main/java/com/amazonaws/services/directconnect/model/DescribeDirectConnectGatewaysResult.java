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

public class DescribeDirectConnectGatewaysResult implements Serializable {
    /**
     * <p>
     * The Direct Connect gateways.
     * </p>
     */
    private java.util.List<DirectConnectGateway> directConnectGateways;

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Direct Connect gateways.
     * </p>
     *
     * @return <p>
     *         The Direct Connect gateways.
     *         </p>
     */
    public java.util.List<DirectConnectGateway> getDirectConnectGateways() {
        return directConnectGateways;
    }

    /**
     * <p>
     * The Direct Connect gateways.
     * </p>
     *
     * @param directConnectGateways <p>
     *            The Direct Connect gateways.
     *            </p>
     */
    public void setDirectConnectGateways(
            java.util.Collection<DirectConnectGateway> directConnectGateways) {
        if (directConnectGateways == null) {
            this.directConnectGateways = null;
            return;
        }

        this.directConnectGateways = new java.util.ArrayList<DirectConnectGateway>(
                directConnectGateways);
    }

    /**
     * <p>
     * The Direct Connect gateways.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGateways <p>
     *            The Direct Connect gateways.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewaysResult withDirectConnectGateways(
            DirectConnectGateway... directConnectGateways) {
        if (getDirectConnectGateways() == null) {
            this.directConnectGateways = new java.util.ArrayList<DirectConnectGateway>(
                    directConnectGateways.length);
        }
        for (DirectConnectGateway value : directConnectGateways) {
            this.directConnectGateways.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Direct Connect gateways.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGateways <p>
     *            The Direct Connect gateways.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewaysResult withDirectConnectGateways(
            java.util.Collection<DirectConnectGateway> directConnectGateways) {
        setDirectConnectGateways(directConnectGateways);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     *
     * @return <p>
     *         The token to retrieve the next page.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     *
     * @param nextToken <p>
     *            The token to retrieve the next page.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to retrieve the next page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewaysResult withNextToken(String nextToken) {
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
        if (getDirectConnectGateways() != null)
            sb.append("directConnectGateways: " + getDirectConnectGateways() + ",");
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
                + ((getDirectConnectGateways() == null) ? 0 : getDirectConnectGateways().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDirectConnectGatewaysResult == false)
            return false;
        DescribeDirectConnectGatewaysResult other = (DescribeDirectConnectGatewaysResult) obj;

        if (other.getDirectConnectGateways() == null ^ this.getDirectConnectGateways() == null)
            return false;
        if (other.getDirectConnectGateways() != null
                && other.getDirectConnectGateways().equals(this.getDirectConnectGateways()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
