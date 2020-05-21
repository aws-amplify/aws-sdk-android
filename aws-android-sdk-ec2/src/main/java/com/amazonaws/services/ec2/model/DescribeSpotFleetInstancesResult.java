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
 * Contains the output of DescribeSpotFleetInstances.
 * </p>
 */
public class DescribeSpotFleetInstancesResult implements Serializable {
    /**
     * <p>
     * The running instances. This list is refreshed periodically and might be
     * out of date.
     * </p>
     */
    private java.util.List<ActiveInstance> activeInstances;

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     */
    private String spotFleetRequestId;

    /**
     * <p>
     * The running instances. This list is refreshed periodically and might be
     * out of date.
     * </p>
     *
     * @return <p>
     *         The running instances. This list is refreshed periodically and
     *         might be out of date.
     *         </p>
     */
    public java.util.List<ActiveInstance> getActiveInstances() {
        return activeInstances;
    }

    /**
     * <p>
     * The running instances. This list is refreshed periodically and might be
     * out of date.
     * </p>
     *
     * @param activeInstances <p>
     *            The running instances. This list is refreshed periodically and
     *            might be out of date.
     *            </p>
     */
    public void setActiveInstances(java.util.Collection<ActiveInstance> activeInstances) {
        if (activeInstances == null) {
            this.activeInstances = null;
            return;
        }

        this.activeInstances = new java.util.ArrayList<ActiveInstance>(activeInstances);
    }

    /**
     * <p>
     * The running instances. This list is refreshed periodically and might be
     * out of date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeInstances <p>
     *            The running instances. This list is refreshed periodically and
     *            might be out of date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotFleetInstancesResult withActiveInstances(ActiveInstance... activeInstances) {
        if (getActiveInstances() == null) {
            this.activeInstances = new java.util.ArrayList<ActiveInstance>(activeInstances.length);
        }
        for (ActiveInstance value : activeInstances) {
            this.activeInstances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The running instances. This list is refreshed periodically and might be
     * out of date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeInstances <p>
     *            The running instances. This list is refreshed periodically and
     *            might be out of date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotFleetInstancesResult withActiveInstances(
            java.util.Collection<ActiveInstance> activeInstances) {
        setActiveInstances(activeInstances);
        return this;
    }

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
    public DescribeSpotFleetInstancesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     *
     * @return <p>
     *         The ID of the Spot Fleet request.
     *         </p>
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     *
     * @param spotFleetRequestId <p>
     *            The ID of the Spot Fleet request.
     *            </p>
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotFleetRequestId <p>
     *            The ID of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSpotFleetInstancesResult withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
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
        if (getActiveInstances() != null)
            sb.append("ActiveInstances: " + getActiveInstances() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getSpotFleetRequestId() != null)
            sb.append("SpotFleetRequestId: " + getSpotFleetRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActiveInstances() == null) ? 0 : getActiveInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpotFleetInstancesResult == false)
            return false;
        DescribeSpotFleetInstancesResult other = (DescribeSpotFleetInstancesResult) obj;

        if (other.getActiveInstances() == null ^ this.getActiveInstances() == null)
            return false;
        if (other.getActiveInstances() != null
                && other.getActiveInstances().equals(this.getActiveInstances()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null)
            return false;
        if (other.getSpotFleetRequestId() != null
                && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false)
            return false;
        return true;
    }
}
