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

public class ListPlatformVersionsResult implements Serializable {
    /**
     * <p>
     * Summary information about the platform versions.
     * </p>
     */
    private java.util.List<PlatformSummary> platformSummaryList;

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
     * Summary information about the platform versions.
     * </p>
     *
     * @return <p>
     *         Summary information about the platform versions.
     *         </p>
     */
    public java.util.List<PlatformSummary> getPlatformSummaryList() {
        return platformSummaryList;
    }

    /**
     * <p>
     * Summary information about the platform versions.
     * </p>
     *
     * @param platformSummaryList <p>
     *            Summary information about the platform versions.
     *            </p>
     */
    public void setPlatformSummaryList(java.util.Collection<PlatformSummary> platformSummaryList) {
        if (platformSummaryList == null) {
            this.platformSummaryList = null;
            return;
        }

        this.platformSummaryList = new java.util.ArrayList<PlatformSummary>(platformSummaryList);
    }

    /**
     * <p>
     * Summary information about the platform versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformSummaryList <p>
     *            Summary information about the platform versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformVersionsResult withPlatformSummaryList(
            PlatformSummary... platformSummaryList) {
        if (getPlatformSummaryList() == null) {
            this.platformSummaryList = new java.util.ArrayList<PlatformSummary>(
                    platformSummaryList.length);
        }
        for (PlatformSummary value : platformSummaryList) {
            this.platformSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the platform versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformSummaryList <p>
     *            Summary information about the platform versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformVersionsResult withPlatformSummaryList(
            java.util.Collection<PlatformSummary> platformSummaryList) {
        setPlatformSummaryList(platformSummaryList);
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
    public ListPlatformVersionsResult withNextToken(String nextToken) {
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
        if (getPlatformSummaryList() != null)
            sb.append("PlatformSummaryList: " + getPlatformSummaryList() + ",");
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
                + ((getPlatformSummaryList() == null) ? 0 : getPlatformSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPlatformVersionsResult == false)
            return false;
        ListPlatformVersionsResult other = (ListPlatformVersionsResult) obj;

        if (other.getPlatformSummaryList() == null ^ this.getPlatformSummaryList() == null)
            return false;
        if (other.getPlatformSummaryList() != null
                && other.getPlatformSummaryList().equals(this.getPlatformSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
