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

public class DescribeLocalGatewayRouteTableVpcAssociationsResult implements Serializable {
    /**
     * <p>
     * Information about the associations.
     * </p>
     */
    private java.util.List<LocalGatewayRouteTableVpcAssociation> localGatewayRouteTableVpcAssociations;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
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
    public java.util.List<LocalGatewayRouteTableVpcAssociation> getLocalGatewayRouteTableVpcAssociations() {
        return localGatewayRouteTableVpcAssociations;
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     *
     * @param localGatewayRouteTableVpcAssociations <p>
     *            Information about the associations.
     *            </p>
     */
    public void setLocalGatewayRouteTableVpcAssociations(
            java.util.Collection<LocalGatewayRouteTableVpcAssociation> localGatewayRouteTableVpcAssociations) {
        if (localGatewayRouteTableVpcAssociations == null) {
            this.localGatewayRouteTableVpcAssociations = null;
            return;
        }

        this.localGatewayRouteTableVpcAssociations = new java.util.ArrayList<LocalGatewayRouteTableVpcAssociation>(
                localGatewayRouteTableVpcAssociations);
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayRouteTableVpcAssociations <p>
     *            Information about the associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLocalGatewayRouteTableVpcAssociationsResult withLocalGatewayRouteTableVpcAssociations(
            LocalGatewayRouteTableVpcAssociation... localGatewayRouteTableVpcAssociations) {
        if (getLocalGatewayRouteTableVpcAssociations() == null) {
            this.localGatewayRouteTableVpcAssociations = new java.util.ArrayList<LocalGatewayRouteTableVpcAssociation>(
                    localGatewayRouteTableVpcAssociations.length);
        }
        for (LocalGatewayRouteTableVpcAssociation value : localGatewayRouteTableVpcAssociations) {
            this.localGatewayRouteTableVpcAssociations.add(value);
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
     * @param localGatewayRouteTableVpcAssociations <p>
     *            Information about the associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLocalGatewayRouteTableVpcAssociationsResult withLocalGatewayRouteTableVpcAssociations(
            java.util.Collection<LocalGatewayRouteTableVpcAssociation> localGatewayRouteTableVpcAssociations) {
        setLocalGatewayRouteTableVpcAssociations(localGatewayRouteTableVpcAssociations);
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
    public DescribeLocalGatewayRouteTableVpcAssociationsResult withNextToken(String nextToken) {
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
        if (getLocalGatewayRouteTableVpcAssociations() != null)
            sb.append("LocalGatewayRouteTableVpcAssociations: "
                    + getLocalGatewayRouteTableVpcAssociations() + ",");
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
                + ((getLocalGatewayRouteTableVpcAssociations() == null) ? 0
                        : getLocalGatewayRouteTableVpcAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocalGatewayRouteTableVpcAssociationsResult == false)
            return false;
        DescribeLocalGatewayRouteTableVpcAssociationsResult other = (DescribeLocalGatewayRouteTableVpcAssociationsResult) obj;

        if (other.getLocalGatewayRouteTableVpcAssociations() == null
                ^ this.getLocalGatewayRouteTableVpcAssociations() == null)
            return false;
        if (other.getLocalGatewayRouteTableVpcAssociations() != null
                && other.getLocalGatewayRouteTableVpcAssociations().equals(
                        this.getLocalGatewayRouteTableVpcAssociations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
