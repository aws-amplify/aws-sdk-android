/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListTrafficDistributionGroupsResult implements Serializable {
    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of traffic distribution groups.
     * </p>
     */
    private java.util.List<TrafficDistributionGroupSummary> trafficDistributionGroupSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficDistributionGroupsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A list of traffic distribution groups.
     * </p>
     *
     * @return <p>
     *         A list of traffic distribution groups.
     *         </p>
     */
    public java.util.List<TrafficDistributionGroupSummary> getTrafficDistributionGroupSummaryList() {
        return trafficDistributionGroupSummaryList;
    }

    /**
     * <p>
     * A list of traffic distribution groups.
     * </p>
     *
     * @param trafficDistributionGroupSummaryList <p>
     *            A list of traffic distribution groups.
     *            </p>
     */
    public void setTrafficDistributionGroupSummaryList(
            java.util.Collection<TrafficDistributionGroupSummary> trafficDistributionGroupSummaryList) {
        if (trafficDistributionGroupSummaryList == null) {
            this.trafficDistributionGroupSummaryList = null;
            return;
        }

        this.trafficDistributionGroupSummaryList = new java.util.ArrayList<TrafficDistributionGroupSummary>(
                trafficDistributionGroupSummaryList);
    }

    /**
     * <p>
     * A list of traffic distribution groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficDistributionGroupSummaryList <p>
     *            A list of traffic distribution groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficDistributionGroupsResult withTrafficDistributionGroupSummaryList(
            TrafficDistributionGroupSummary... trafficDistributionGroupSummaryList) {
        if (getTrafficDistributionGroupSummaryList() == null) {
            this.trafficDistributionGroupSummaryList = new java.util.ArrayList<TrafficDistributionGroupSummary>(
                    trafficDistributionGroupSummaryList.length);
        }
        for (TrafficDistributionGroupSummary value : trafficDistributionGroupSummaryList) {
            this.trafficDistributionGroupSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of traffic distribution groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficDistributionGroupSummaryList <p>
     *            A list of traffic distribution groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficDistributionGroupsResult withTrafficDistributionGroupSummaryList(
            java.util.Collection<TrafficDistributionGroupSummary> trafficDistributionGroupSummaryList) {
        setTrafficDistributionGroupSummaryList(trafficDistributionGroupSummaryList);
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
        if (getTrafficDistributionGroupSummaryList() != null)
            sb.append("TrafficDistributionGroupSummaryList: "
                    + getTrafficDistributionGroupSummaryList());
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
                + ((getTrafficDistributionGroupSummaryList() == null) ? 0
                        : getTrafficDistributionGroupSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrafficDistributionGroupsResult == false)
            return false;
        ListTrafficDistributionGroupsResult other = (ListTrafficDistributionGroupsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTrafficDistributionGroupSummaryList() == null
                ^ this.getTrafficDistributionGroupSummaryList() == null)
            return false;
        if (other.getTrafficDistributionGroupSummaryList() != null
                && other.getTrafficDistributionGroupSummaryList().equals(
                        this.getTrafficDistributionGroupSummaryList()) == false)
            return false;
        return true;
    }
}
