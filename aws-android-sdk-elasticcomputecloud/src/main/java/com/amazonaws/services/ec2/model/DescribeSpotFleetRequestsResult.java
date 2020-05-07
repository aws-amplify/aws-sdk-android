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
 * Contains the output of DescribeSpotFleetRequests.
 * </p>
 */
public class DescribeSpotFleetRequestsResult implements Serializable {
    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the configuration of your Spot Fleet.
     * </p>
     */
    private java.util.List<SpotFleetRequestConfig> spotFleetRequestConfigs;

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token required to retrieve the next set of results. This
     *         value is <code>null</code> when there are no more results to
     *         return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token required to retrieve the next set of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token required to retrieve the next set of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotFleetRequestsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about the configuration of your Spot Fleet.
     * </p>
     *
     * @return <p>
     *         Information about the configuration of your Spot Fleet.
     *         </p>
     */
    public java.util.List<SpotFleetRequestConfig> getSpotFleetRequestConfigs() {
        return spotFleetRequestConfigs;
    }

    /**
     * <p>
     * Information about the configuration of your Spot Fleet.
     * </p>
     *
     * @param spotFleetRequestConfigs <p>
     *            Information about the configuration of your Spot Fleet.
     *            </p>
     */
    public void setSpotFleetRequestConfigs(
            java.util.Collection<SpotFleetRequestConfig> spotFleetRequestConfigs) {
        if (spotFleetRequestConfigs == null) {
            this.spotFleetRequestConfigs = null;
            return;
        }

        this.spotFleetRequestConfigs = new java.util.ArrayList<SpotFleetRequestConfig>(
                spotFleetRequestConfigs);
    }

    /**
     * <p>
     * Information about the configuration of your Spot Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotFleetRequestConfigs <p>
     *            Information about the configuration of your Spot Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotFleetRequestsResult withSpotFleetRequestConfigs(
            SpotFleetRequestConfig... spotFleetRequestConfigs) {
        if (getSpotFleetRequestConfigs() == null) {
            this.spotFleetRequestConfigs = new java.util.ArrayList<SpotFleetRequestConfig>(
                    spotFleetRequestConfigs.length);
        }
        for (SpotFleetRequestConfig value : spotFleetRequestConfigs) {
            this.spotFleetRequestConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the configuration of your Spot Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotFleetRequestConfigs <p>
     *            Information about the configuration of your Spot Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotFleetRequestsResult withSpotFleetRequestConfigs(
            java.util.Collection<SpotFleetRequestConfig> spotFleetRequestConfigs) {
        setSpotFleetRequestConfigs(spotFleetRequestConfigs);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getSpotFleetRequestConfigs() != null)
            sb.append("SpotFleetRequestConfigs: " + getSpotFleetRequestConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getSpotFleetRequestConfigs() == null) ? 0 : getSpotFleetRequestConfigs()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpotFleetRequestsResult == false)
            return false;
        DescribeSpotFleetRequestsResult other = (DescribeSpotFleetRequestsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSpotFleetRequestConfigs() == null ^ this.getSpotFleetRequestConfigs() == null)
            return false;
        if (other.getSpotFleetRequestConfigs() != null
                && other.getSpotFleetRequestConfigs().equals(this.getSpotFleetRequestConfigs()) == false)
            return false;
        return true;
    }
}
