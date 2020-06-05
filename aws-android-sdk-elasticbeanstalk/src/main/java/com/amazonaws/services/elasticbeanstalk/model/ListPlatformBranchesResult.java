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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

public class ListPlatformBranchesResult implements Serializable {
    /**
     * <p>
     * Summary information about the platform branches.
     * </p>
     */
    private java.util.List<PlatformBranchSummary> platformBranchSummaryList;

    /**
     * <p>
     * In a paginated request, if this value isn't <code>null</code>, it's the
     * token that you can pass in a subsequent request to get the next response
     * page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the platform branches.
     * </p>
     *
     * @return <p>
     *         Summary information about the platform branches.
     *         </p>
     */
    public java.util.List<PlatformBranchSummary> getPlatformBranchSummaryList() {
        return platformBranchSummaryList;
    }

    /**
     * <p>
     * Summary information about the platform branches.
     * </p>
     *
     * @param platformBranchSummaryList <p>
     *            Summary information about the platform branches.
     *            </p>
     */
    public void setPlatformBranchSummaryList(
            java.util.Collection<PlatformBranchSummary> platformBranchSummaryList) {
        if (platformBranchSummaryList == null) {
            this.platformBranchSummaryList = null;
            return;
        }

        this.platformBranchSummaryList = new java.util.ArrayList<PlatformBranchSummary>(
                platformBranchSummaryList);
    }

    /**
     * <p>
     * Summary information about the platform branches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformBranchSummaryList <p>
     *            Summary information about the platform branches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformBranchesResult withPlatformBranchSummaryList(
            PlatformBranchSummary... platformBranchSummaryList) {
        if (getPlatformBranchSummaryList() == null) {
            this.platformBranchSummaryList = new java.util.ArrayList<PlatformBranchSummary>(
                    platformBranchSummaryList.length);
        }
        for (PlatformBranchSummary value : platformBranchSummaryList) {
            this.platformBranchSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the platform branches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformBranchSummaryList <p>
     *            Summary information about the platform branches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformBranchesResult withPlatformBranchSummaryList(
            java.util.Collection<PlatformBranchSummary> platformBranchSummaryList) {
        setPlatformBranchSummaryList(platformBranchSummaryList);
        return this;
    }

    /**
     * <p>
     * In a paginated request, if this value isn't <code>null</code>, it's the
     * token that you can pass in a subsequent request to get the next response
     * page.
     * </p>
     *
     * @return <p>
     *         In a paginated request, if this value isn't <code>null</code>,
     *         it's the token that you can pass in a subsequent request to get
     *         the next response page.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * In a paginated request, if this value isn't <code>null</code>, it's the
     * token that you can pass in a subsequent request to get the next response
     * page.
     * </p>
     *
     * @param nextToken <p>
     *            In a paginated request, if this value isn't <code>null</code>,
     *            it's the token that you can pass in a subsequent request to
     *            get the next response page.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * In a paginated request, if this value isn't <code>null</code>, it's the
     * token that you can pass in a subsequent request to get the next response
     * page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            In a paginated request, if this value isn't <code>null</code>,
     *            it's the token that you can pass in a subsequent request to
     *            get the next response page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformBranchesResult withNextToken(String nextToken) {
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
        if (getPlatformBranchSummaryList() != null)
            sb.append("PlatformBranchSummaryList: " + getPlatformBranchSummaryList() + ",");
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
                + ((getPlatformBranchSummaryList() == null) ? 0 : getPlatformBranchSummaryList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPlatformBranchesResult == false)
            return false;
        ListPlatformBranchesResult other = (ListPlatformBranchesResult) obj;

        if (other.getPlatformBranchSummaryList() == null
                ^ this.getPlatformBranchSummaryList() == null)
            return false;
        if (other.getPlatformBranchSummaryList() != null
                && other.getPlatformBranchSummaryList().equals(this.getPlatformBranchSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
