/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class SegmentsResponse implements Serializable {
    /**
     * The list of segments.
     */
    private java.util.List<SegmentResponse> item;

    /**
     * An identifier used to retrieve the next page of results. The token is
     * null if no additional pages exist.
     */
    private String nextToken;

    /**
     * The list of segments.
     *
     * @return The list of segments.
     */
    public java.util.List<SegmentResponse> getItem() {
        return item;
    }

    /**
     * The list of segments.
     *
     * @param item The list of segments.
     */
    public void setItem(java.util.Collection<SegmentResponse> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<SegmentResponse>(item);
    }

    /**
     * The list of segments.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item The list of segments.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentsResponse withItem(SegmentResponse... item) {
        if (getItem() == null) {
            this.item = new java.util.ArrayList<SegmentResponse>(item.length);
        }
        for (SegmentResponse value : item) {
            this.item.add(value);
        }
        return this;
    }

    /**
     * The list of segments.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item The list of segments.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentsResponse withItem(java.util.Collection<SegmentResponse> item) {
        setItem(item);
        return this;
    }

    /**
     * An identifier used to retrieve the next page of results. The token is
     * null if no additional pages exist.
     *
     * @return An identifier used to retrieve the next page of results. The
     *         token is null if no additional pages exist.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * An identifier used to retrieve the next page of results. The token is
     * null if no additional pages exist.
     *
     * @param nextToken An identifier used to retrieve the next page of results.
     *            The token is null if no additional pages exist.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * An identifier used to retrieve the next page of results. The token is
     * null if no additional pages exist.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken An identifier used to retrieve the next page of results.
     *            The token is null if no additional pages exist.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentsResponse withNextToken(String nextToken) {
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
        if (getItem() != null)
            sb.append("Item: " + getItem() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentsResponse == false)
            return false;
        SegmentsResponse other = (SegmentsResponse) obj;

        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
