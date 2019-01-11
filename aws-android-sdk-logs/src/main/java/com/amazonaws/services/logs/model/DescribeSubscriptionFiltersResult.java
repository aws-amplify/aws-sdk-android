/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class DescribeSubscriptionFiltersResult implements Serializable {
    /**
     * <p>
     * The subscription filters.
     * </p>
     */
    private java.util.List<SubscriptionFilter> subscriptionFilters;

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The subscription filters.
     * </p>
     *
     * @return <p>
     *         The subscription filters.
     *         </p>
     */
    public java.util.List<SubscriptionFilter> getSubscriptionFilters() {
        return subscriptionFilters;
    }

    /**
     * <p>
     * The subscription filters.
     * </p>
     *
     * @param subscriptionFilters <p>
     *            The subscription filters.
     *            </p>
     */
    public void setSubscriptionFilters(java.util.Collection<SubscriptionFilter> subscriptionFilters) {
        if (subscriptionFilters == null) {
            this.subscriptionFilters = null;
            return;
        }

        this.subscriptionFilters = new java.util.ArrayList<SubscriptionFilter>(subscriptionFilters);
    }

    /**
     * <p>
     * The subscription filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subscriptionFilters <p>
     *            The subscription filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSubscriptionFiltersResult withSubscriptionFilters(
            SubscriptionFilter... subscriptionFilters) {
        if (getSubscriptionFilters() == null) {
            this.subscriptionFilters = new java.util.ArrayList<SubscriptionFilter>(
                    subscriptionFilters.length);
        }
        for (SubscriptionFilter value : subscriptionFilters) {
            this.subscriptionFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The subscription filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subscriptionFilters <p>
     *            The subscription filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSubscriptionFiltersResult withSubscriptionFilters(
            java.util.Collection<SubscriptionFilter> subscriptionFilters) {
        setSubscriptionFilters(subscriptionFilters);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The token for the next set of items to return. The token expires
     *         after 24 hours.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. The token expires after 24
     * hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. The token
     *            expires after 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSubscriptionFiltersResult withNextToken(String nextToken) {
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
        if (getSubscriptionFilters() != null)
            sb.append("subscriptionFilters: " + getSubscriptionFilters() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSubscriptionFilters() == null) ? 0 : getSubscriptionFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSubscriptionFiltersResult == false)
            return false;
        DescribeSubscriptionFiltersResult other = (DescribeSubscriptionFiltersResult) obj;

        if (other.getSubscriptionFilters() == null ^ this.getSubscriptionFilters() == null)
            return false;
        if (other.getSubscriptionFilters() != null
                && other.getSubscriptionFilters().equals(this.getSubscriptionFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
