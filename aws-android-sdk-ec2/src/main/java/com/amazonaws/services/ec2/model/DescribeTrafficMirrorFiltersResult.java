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

public class DescribeTrafficMirrorFiltersResult implements Serializable {
    /**
     * <p>
     * Information about one or more Traffic Mirror filters.
     * </p>
     */
    private java.util.List<TrafficMirrorFilter> trafficMirrorFilters;

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about one or more Traffic Mirror filters.
     * </p>
     *
     * @return <p>
     *         Information about one or more Traffic Mirror filters.
     *         </p>
     */
    public java.util.List<TrafficMirrorFilter> getTrafficMirrorFilters() {
        return trafficMirrorFilters;
    }

    /**
     * <p>
     * Information about one or more Traffic Mirror filters.
     * </p>
     *
     * @param trafficMirrorFilters <p>
     *            Information about one or more Traffic Mirror filters.
     *            </p>
     */
    public void setTrafficMirrorFilters(
            java.util.Collection<TrafficMirrorFilter> trafficMirrorFilters) {
        if (trafficMirrorFilters == null) {
            this.trafficMirrorFilters = null;
            return;
        }

        this.trafficMirrorFilters = new java.util.ArrayList<TrafficMirrorFilter>(
                trafficMirrorFilters);
    }

    /**
     * <p>
     * Information about one or more Traffic Mirror filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorFilters <p>
     *            Information about one or more Traffic Mirror filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrafficMirrorFiltersResult withTrafficMirrorFilters(
            TrafficMirrorFilter... trafficMirrorFilters) {
        if (getTrafficMirrorFilters() == null) {
            this.trafficMirrorFilters = new java.util.ArrayList<TrafficMirrorFilter>(
                    trafficMirrorFilters.length);
        }
        for (TrafficMirrorFilter value : trafficMirrorFilters) {
            this.trafficMirrorFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more Traffic Mirror filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorFilters <p>
     *            Information about one or more Traffic Mirror filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrafficMirrorFiltersResult withTrafficMirrorFilters(
            java.util.Collection<TrafficMirrorFilter> trafficMirrorFilters) {
        setTrafficMirrorFilters(trafficMirrorFilters);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. The value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. The
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. The
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrafficMirrorFiltersResult withNextToken(String nextToken) {
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
        if (getTrafficMirrorFilters() != null)
            sb.append("TrafficMirrorFilters: " + getTrafficMirrorFilters() + ",");
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
                + ((getTrafficMirrorFilters() == null) ? 0 : getTrafficMirrorFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrafficMirrorFiltersResult == false)
            return false;
        DescribeTrafficMirrorFiltersResult other = (DescribeTrafficMirrorFiltersResult) obj;

        if (other.getTrafficMirrorFilters() == null ^ this.getTrafficMirrorFilters() == null)
            return false;
        if (other.getTrafficMirrorFilters() != null
                && other.getTrafficMirrorFilters().equals(this.getTrafficMirrorFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
