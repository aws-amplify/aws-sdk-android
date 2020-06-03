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

public class DescribeDirectConnectGatewayAssociationsResult implements Serializable {
    /**
     * <p>
     * Information about the associations.
     * </p>
     */
    private java.util.List<DirectConnectGatewayAssociation> directConnectGatewayAssociations;

    /**
     * <p>
     * The token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the associations.
     * </p>
     *
     * @return <p>
     *         Information about the associations.
     *         </p>
     */
    public java.util.List<DirectConnectGatewayAssociation> getDirectConnectGatewayAssociations() {
        return directConnectGatewayAssociations;
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     *
     * @param directConnectGatewayAssociations <p>
     *            Information about the associations.
     *            </p>
     */
    public void setDirectConnectGatewayAssociations(
            java.util.Collection<DirectConnectGatewayAssociation> directConnectGatewayAssociations) {
        if (directConnectGatewayAssociations == null) {
            this.directConnectGatewayAssociations = null;
            return;
        }

        this.directConnectGatewayAssociations = new java.util.ArrayList<DirectConnectGatewayAssociation>(
                directConnectGatewayAssociations);
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayAssociations <p>
     *            Information about the associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationsResult withDirectConnectGatewayAssociations(
            DirectConnectGatewayAssociation... directConnectGatewayAssociations) {
        if (getDirectConnectGatewayAssociations() == null) {
            this.directConnectGatewayAssociations = new java.util.ArrayList<DirectConnectGatewayAssociation>(
                    directConnectGatewayAssociations.length);
        }
        for (DirectConnectGatewayAssociation value : directConnectGatewayAssociations) {
            this.directConnectGatewayAssociations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayAssociations <p>
     *            Information about the associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDirectConnectGatewayAssociationsResult withDirectConnectGatewayAssociations(
            java.util.Collection<DirectConnectGatewayAssociation> directConnectGatewayAssociations) {
        setDirectConnectGatewayAssociations(directConnectGatewayAssociations);
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
    public DescribeDirectConnectGatewayAssociationsResult withNextToken(String nextToken) {
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
        if (getDirectConnectGatewayAssociations() != null)
            sb.append("directConnectGatewayAssociations: " + getDirectConnectGatewayAssociations()
                    + ",");
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
                + ((getDirectConnectGatewayAssociations() == null) ? 0
                        : getDirectConnectGatewayAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDirectConnectGatewayAssociationsResult == false)
            return false;
        DescribeDirectConnectGatewayAssociationsResult other = (DescribeDirectConnectGatewayAssociationsResult) obj;

        if (other.getDirectConnectGatewayAssociations() == null
                ^ this.getDirectConnectGatewayAssociations() == null)
            return false;
        if (other.getDirectConnectGatewayAssociations() != null
                && other.getDirectConnectGatewayAssociations().equals(
                        this.getDirectConnectGatewayAssociations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
