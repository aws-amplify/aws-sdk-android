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

package com.amazonaws.services.schemas.model;

import java.io.Serializable;

public class ListDiscoverersResult implements Serializable {
    /**
     * <p>
     * An array of DiscovererSummary information.
     * </p>
     */
    private java.util.List<DiscovererSummary> discoverers;

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of DiscovererSummary information.
     * </p>
     *
     * @return <p>
     *         An array of DiscovererSummary information.
     *         </p>
     */
    public java.util.List<DiscovererSummary> getDiscoverers() {
        return discoverers;
    }

    /**
     * <p>
     * An array of DiscovererSummary information.
     * </p>
     *
     * @param discoverers <p>
     *            An array of DiscovererSummary information.
     *            </p>
     */
    public void setDiscoverers(java.util.Collection<DiscovererSummary> discoverers) {
        if (discoverers == null) {
            this.discoverers = null;
            return;
        }

        this.discoverers = new java.util.ArrayList<DiscovererSummary>(discoverers);
    }

    /**
     * <p>
     * An array of DiscovererSummary information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param discoverers <p>
     *            An array of DiscovererSummary information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDiscoverersResult withDiscoverers(DiscovererSummary... discoverers) {
        if (getDiscoverers() == null) {
            this.discoverers = new java.util.ArrayList<DiscovererSummary>(discoverers.length);
        }
        for (DiscovererSummary value : discoverers) {
            this.discoverers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of DiscovererSummary information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param discoverers <p>
     *            An array of DiscovererSummary information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDiscoverersResult withDiscoverers(java.util.Collection<DiscovererSummary> discoverers) {
        setDiscoverers(discoverers);
        return this;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     *
     * @return <p>
     *         The token that specifies the next page of results to return. To
     *         request the first page, leave NextToken empty. The token will
     *         expire in 24 hours, and cannot be shared with other accounts.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     *
     * @param nextToken <p>
     *            The token that specifies the next page of results to return.
     *            To request the first page, leave NextToken empty. The token
     *            will expire in 24 hours, and cannot be shared with other
     *            accounts.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that specifies the next page of results to return. To request
     * the first page, leave NextToken empty. The token will expire in 24 hours,
     * and cannot be shared with other accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token that specifies the next page of results to return.
     *            To request the first page, leave NextToken empty. The token
     *            will expire in 24 hours, and cannot be shared with other
     *            accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDiscoverersResult withNextToken(String nextToken) {
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
        if (getDiscoverers() != null)
            sb.append("Discoverers: " + getDiscoverers() + ",");
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
                + ((getDiscoverers() == null) ? 0 : getDiscoverers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDiscoverersResult == false)
            return false;
        ListDiscoverersResult other = (ListDiscoverersResult) obj;

        if (other.getDiscoverers() == null ^ this.getDiscoverers() == null)
            return false;
        if (other.getDiscoverers() != null
                && other.getDiscoverers().equals(this.getDiscoverers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
