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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about all the segments that are associated with an
 * application.
 * </p>
 */
public class SegmentsResponse implements Serializable {
    /**
     * <p>
     * An array of responses, one for each segment that's associated with the
     * application (Segments resource) or each version of a segment that's
     * associated with the application (Segment Versions resource).
     * </p>
     */
    private java.util.List<SegmentResponse> item;

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of responses, one for each segment that's associated with the
     * application (Segments resource) or each version of a segment that's
     * associated with the application (Segment Versions resource).
     * </p>
     *
     * @return <p>
     *         An array of responses, one for each segment that's associated
     *         with the application (Segments resource) or each version of a
     *         segment that's associated with the application (Segment Versions
     *         resource).
     *         </p>
     */
    public java.util.List<SegmentResponse> getItem() {
        return item;
    }

    /**
     * <p>
     * An array of responses, one for each segment that's associated with the
     * application (Segments resource) or each version of a segment that's
     * associated with the application (Segment Versions resource).
     * </p>
     *
     * @param item <p>
     *            An array of responses, one for each segment that's associated
     *            with the application (Segments resource) or each version of a
     *            segment that's associated with the application (Segment
     *            Versions resource).
     *            </p>
     */
    public void setItem(java.util.Collection<SegmentResponse> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<SegmentResponse>(item);
    }

    /**
     * <p>
     * An array of responses, one for each segment that's associated with the
     * application (Segments resource) or each version of a segment that's
     * associated with the application (Segment Versions resource).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item <p>
     *            An array of responses, one for each segment that's associated
     *            with the application (Segments resource) or each version of a
     *            segment that's associated with the application (Segment
     *            Versions resource).
     *            </p>
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
     * <p>
     * An array of responses, one for each segment that's associated with the
     * application (Segments resource) or each version of a segment that's
     * associated with the application (Segment Versions resource).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item <p>
     *            An array of responses, one for each segment that's associated
     *            with the application (Segments resource) or each version of a
     *            segment that's associated with the application (Segment
     *            Versions resource).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentsResponse withItem(java.util.Collection<SegmentResponse> item) {
        setItem(item);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     *
     * @return <p>
     *         The string to use in a subsequent request to get the next page of
     *         results in a paginated response. This value is null if there are
     *         no additional pages.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
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
