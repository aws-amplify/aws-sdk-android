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

/**
 * <p>
 * Contains the output of DescribeSpotInstanceRequests.
 * </p>
 */
public class DescribeSpotInstanceRequestsResult implements Serializable {
    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     */
    private java.util.List<SpotInstanceRequest> spotInstanceRequests;

    /**
     * <p>
     * The token to use to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     *
     * @return <p>
     *         One or more Spot Instance requests.
     *         </p>
     */
    public java.util.List<SpotInstanceRequest> getSpotInstanceRequests() {
        return spotInstanceRequests;
    }

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     *
     * @param spotInstanceRequests <p>
     *            One or more Spot Instance requests.
     *            </p>
     */
    public void setSpotInstanceRequests(
            java.util.Collection<SpotInstanceRequest> spotInstanceRequests) {
        if (spotInstanceRequests == null) {
            this.spotInstanceRequests = null;
            return;
        }

        this.spotInstanceRequests = new java.util.ArrayList<SpotInstanceRequest>(
                spotInstanceRequests);
    }

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotInstanceRequests <p>
     *            One or more Spot Instance requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotInstanceRequestsResult withSpotInstanceRequests(
            SpotInstanceRequest... spotInstanceRequests) {
        if (getSpotInstanceRequests() == null) {
            this.spotInstanceRequests = new java.util.ArrayList<SpotInstanceRequest>(
                    spotInstanceRequests.length);
        }
        for (SpotInstanceRequest value : spotInstanceRequests) {
            this.spotInstanceRequests.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotInstanceRequests <p>
     *            One or more Spot Instance requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotInstanceRequestsResult withSpotInstanceRequests(
            java.util.Collection<SpotInstanceRequest> spotInstanceRequests) {
        setSpotInstanceRequests(spotInstanceRequests);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next set of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next set of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next set of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotInstanceRequestsResult withNextToken(String nextToken) {
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
        if (getSpotInstanceRequests() != null)
            sb.append("SpotInstanceRequests: " + getSpotInstanceRequests() + ",");
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
                + ((getSpotInstanceRequests() == null) ? 0 : getSpotInstanceRequests().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpotInstanceRequestsResult == false)
            return false;
        DescribeSpotInstanceRequestsResult other = (DescribeSpotInstanceRequestsResult) obj;

        if (other.getSpotInstanceRequests() == null ^ this.getSpotInstanceRequests() == null)
            return false;
        if (other.getSpotInstanceRequests() != null
                && other.getSpotInstanceRequests().equals(this.getSpotInstanceRequests()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
