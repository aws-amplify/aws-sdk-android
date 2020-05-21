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

public class GetTransitGatewayAttachmentPropagationsResult implements Serializable {
    /**
     * <p>
     * Information about the propagation route tables.
     * </p>
     */
    private java.util.List<TransitGatewayAttachmentPropagation> transitGatewayAttachmentPropagations;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the propagation route tables.
     * </p>
     *
     * @return <p>
     *         Information about the propagation route tables.
     *         </p>
     */
    public java.util.List<TransitGatewayAttachmentPropagation> getTransitGatewayAttachmentPropagations() {
        return transitGatewayAttachmentPropagations;
    }

    /**
     * <p>
     * Information about the propagation route tables.
     * </p>
     *
     * @param transitGatewayAttachmentPropagations <p>
     *            Information about the propagation route tables.
     *            </p>
     */
    public void setTransitGatewayAttachmentPropagations(
            java.util.Collection<TransitGatewayAttachmentPropagation> transitGatewayAttachmentPropagations) {
        if (transitGatewayAttachmentPropagations == null) {
            this.transitGatewayAttachmentPropagations = null;
            return;
        }

        this.transitGatewayAttachmentPropagations = new java.util.ArrayList<TransitGatewayAttachmentPropagation>(
                transitGatewayAttachmentPropagations);
    }

    /**
     * <p>
     * Information about the propagation route tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayAttachmentPropagations <p>
     *            Information about the propagation route tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTransitGatewayAttachmentPropagationsResult withTransitGatewayAttachmentPropagations(
            TransitGatewayAttachmentPropagation... transitGatewayAttachmentPropagations) {
        if (getTransitGatewayAttachmentPropagations() == null) {
            this.transitGatewayAttachmentPropagations = new java.util.ArrayList<TransitGatewayAttachmentPropagation>(
                    transitGatewayAttachmentPropagations.length);
        }
        for (TransitGatewayAttachmentPropagation value : transitGatewayAttachmentPropagations) {
            this.transitGatewayAttachmentPropagations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the propagation route tables.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayAttachmentPropagations <p>
     *            Information about the propagation route tables.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTransitGatewayAttachmentPropagationsResult withTransitGatewayAttachmentPropagations(
            java.util.Collection<TransitGatewayAttachmentPropagation> transitGatewayAttachmentPropagations) {
        setTransitGatewayAttachmentPropagations(transitGatewayAttachmentPropagations);
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
    public GetTransitGatewayAttachmentPropagationsResult withNextToken(String nextToken) {
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
        if (getTransitGatewayAttachmentPropagations() != null)
            sb.append("TransitGatewayAttachmentPropagations: "
                    + getTransitGatewayAttachmentPropagations() + ",");
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
                + ((getTransitGatewayAttachmentPropagations() == null) ? 0
                        : getTransitGatewayAttachmentPropagations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTransitGatewayAttachmentPropagationsResult == false)
            return false;
        GetTransitGatewayAttachmentPropagationsResult other = (GetTransitGatewayAttachmentPropagationsResult) obj;

        if (other.getTransitGatewayAttachmentPropagations() == null
                ^ this.getTransitGatewayAttachmentPropagations() == null)
            return false;
        if (other.getTransitGatewayAttachmentPropagations() != null
                && other.getTransitGatewayAttachmentPropagations().equals(
                        this.getTransitGatewayAttachmentPropagations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
