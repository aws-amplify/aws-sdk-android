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

public class ListTrafficDistributionGroupUsersResult implements Serializable {
    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of traffic distribution group users.
     * </p>
     */
    private java.util.List<TrafficDistributionGroupUserSummary> trafficDistributionGroupUserSummaryList;

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
    public ListTrafficDistributionGroupUsersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A list of traffic distribution group users.
     * </p>
     *
     * @return <p>
     *         A list of traffic distribution group users.
     *         </p>
     */
    public java.util.List<TrafficDistributionGroupUserSummary> getTrafficDistributionGroupUserSummaryList() {
        return trafficDistributionGroupUserSummaryList;
    }

    /**
     * <p>
     * A list of traffic distribution group users.
     * </p>
     *
     * @param trafficDistributionGroupUserSummaryList <p>
     *            A list of traffic distribution group users.
     *            </p>
     */
    public void setTrafficDistributionGroupUserSummaryList(
            java.util.Collection<TrafficDistributionGroupUserSummary> trafficDistributionGroupUserSummaryList) {
        if (trafficDistributionGroupUserSummaryList == null) {
            this.trafficDistributionGroupUserSummaryList = null;
            return;
        }

        this.trafficDistributionGroupUserSummaryList = new java.util.ArrayList<TrafficDistributionGroupUserSummary>(
                trafficDistributionGroupUserSummaryList);
    }

    /**
     * <p>
     * A list of traffic distribution group users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficDistributionGroupUserSummaryList <p>
     *            A list of traffic distribution group users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficDistributionGroupUsersResult withTrafficDistributionGroupUserSummaryList(
            TrafficDistributionGroupUserSummary... trafficDistributionGroupUserSummaryList) {
        if (getTrafficDistributionGroupUserSummaryList() == null) {
            this.trafficDistributionGroupUserSummaryList = new java.util.ArrayList<TrafficDistributionGroupUserSummary>(
                    trafficDistributionGroupUserSummaryList.length);
        }
        for (TrafficDistributionGroupUserSummary value : trafficDistributionGroupUserSummaryList) {
            this.trafficDistributionGroupUserSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of traffic distribution group users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficDistributionGroupUserSummaryList <p>
     *            A list of traffic distribution group users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficDistributionGroupUsersResult withTrafficDistributionGroupUserSummaryList(
            java.util.Collection<TrafficDistributionGroupUserSummary> trafficDistributionGroupUserSummaryList) {
        setTrafficDistributionGroupUserSummaryList(trafficDistributionGroupUserSummaryList);
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
        if (getTrafficDistributionGroupUserSummaryList() != null)
            sb.append("TrafficDistributionGroupUserSummaryList: "
                    + getTrafficDistributionGroupUserSummaryList());
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
                + ((getTrafficDistributionGroupUserSummaryList() == null) ? 0
                        : getTrafficDistributionGroupUserSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrafficDistributionGroupUsersResult == false)
            return false;
        ListTrafficDistributionGroupUsersResult other = (ListTrafficDistributionGroupUsersResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTrafficDistributionGroupUserSummaryList() == null
                ^ this.getTrafficDistributionGroupUserSummaryList() == null)
            return false;
        if (other.getTrafficDistributionGroupUserSummaryList() != null
                && other.getTrafficDistributionGroupUserSummaryList().equals(
                        this.getTrafficDistributionGroupUserSummaryList()) == false)
            return false;
        return true;
    }
}
