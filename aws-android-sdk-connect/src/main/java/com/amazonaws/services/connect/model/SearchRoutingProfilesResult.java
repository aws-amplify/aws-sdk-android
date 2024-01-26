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

public class SearchRoutingProfilesResult implements Serializable {
    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     */
    private java.util.List<RoutingProfile> routingProfiles;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The total number of routing profiles which matched your search query.
     * </p>
     */
    private Long approximateTotalCount;

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     *
     * @return <p>
     *         Information about the routing profiles.
     *         </p>
     */
    public java.util.List<RoutingProfile> getRoutingProfiles() {
        return routingProfiles;
    }

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     *
     * @param routingProfiles <p>
     *            Information about the routing profiles.
     *            </p>
     */
    public void setRoutingProfiles(java.util.Collection<RoutingProfile> routingProfiles) {
        if (routingProfiles == null) {
            this.routingProfiles = null;
            return;
        }

        this.routingProfiles = new java.util.ArrayList<RoutingProfile>(routingProfiles);
    }

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfiles <p>
     *            Information about the routing profiles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRoutingProfilesResult withRoutingProfiles(RoutingProfile... routingProfiles) {
        if (getRoutingProfiles() == null) {
            this.routingProfiles = new java.util.ArrayList<RoutingProfile>(routingProfiles.length);
        }
        for (RoutingProfile value : routingProfiles) {
            this.routingProfiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the routing profiles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfiles <p>
     *            Information about the routing profiles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRoutingProfilesResult withRoutingProfiles(
            java.util.Collection<RoutingProfile> routingProfiles) {
        setRoutingProfiles(routingProfiles);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRoutingProfilesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The total number of routing profiles which matched your search query.
     * </p>
     *
     * @return <p>
     *         The total number of routing profiles which matched your search
     *         query.
     *         </p>
     */
    public Long getApproximateTotalCount() {
        return approximateTotalCount;
    }

    /**
     * <p>
     * The total number of routing profiles which matched your search query.
     * </p>
     *
     * @param approximateTotalCount <p>
     *            The total number of routing profiles which matched your search
     *            query.
     *            </p>
     */
    public void setApproximateTotalCount(Long approximateTotalCount) {
        this.approximateTotalCount = approximateTotalCount;
    }

    /**
     * <p>
     * The total number of routing profiles which matched your search query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approximateTotalCount <p>
     *            The total number of routing profiles which matched your search
     *            query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRoutingProfilesResult withApproximateTotalCount(Long approximateTotalCount) {
        this.approximateTotalCount = approximateTotalCount;
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
        if (getRoutingProfiles() != null)
            sb.append("RoutingProfiles: " + getRoutingProfiles() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getApproximateTotalCount() != null)
            sb.append("ApproximateTotalCount: " + getApproximateTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoutingProfiles() == null) ? 0 : getRoutingProfiles().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getApproximateTotalCount() == null) ? 0 : getApproximateTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchRoutingProfilesResult == false)
            return false;
        SearchRoutingProfilesResult other = (SearchRoutingProfilesResult) obj;

        if (other.getRoutingProfiles() == null ^ this.getRoutingProfiles() == null)
            return false;
        if (other.getRoutingProfiles() != null
                && other.getRoutingProfiles().equals(this.getRoutingProfiles()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getApproximateTotalCount() == null ^ this.getApproximateTotalCount() == null)
            return false;
        if (other.getApproximateTotalCount() != null
                && other.getApproximateTotalCount().equals(this.getApproximateTotalCount()) == false)
            return false;
        return true;
    }
}
