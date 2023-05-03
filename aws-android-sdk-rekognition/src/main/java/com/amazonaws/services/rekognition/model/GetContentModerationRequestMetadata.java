/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Contains metadata about a content moderation request, including the SortBy
 * and AggregateBy options.
 * </p>
 */
public class GetContentModerationRequestMetadata implements Serializable {
    /**
     * <p>
     * The sorting method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     */
    private String sortBy;

    /**
     * <p>
     * The aggregation method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     */
    private String aggregateBy;

    /**
     * <p>
     * The sorting method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @return <p>
     *         The sorting method chosen for a GetContentModeration request.
     *         </p>
     * @see ContentModerationSortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The sorting method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            The sorting method chosen for a GetContentModeration request.
     *            </p>
     * @see ContentModerationSortBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The sorting method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            The sorting method chosen for a GetContentModeration request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentModerationSortBy
     */
    public GetContentModerationRequestMetadata withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The sorting method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            The sorting method chosen for a GetContentModeration request.
     *            </p>
     * @see ContentModerationSortBy
     */
    public void setSortBy(ContentModerationSortBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The sorting method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            The sorting method chosen for a GetContentModeration request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentModerationSortBy
     */
    public GetContentModerationRequestMetadata withSortBy(ContentModerationSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The aggregation method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     *
     * @return <p>
     *         The aggregation method chosen for a GetContentModeration request.
     *         </p>
     * @see ContentModerationAggregateBy
     */
    public String getAggregateBy() {
        return aggregateBy;
    }

    /**
     * <p>
     * The aggregation method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     *
     * @param aggregateBy <p>
     *            The aggregation method chosen for a GetContentModeration
     *            request.
     *            </p>
     * @see ContentModerationAggregateBy
     */
    public void setAggregateBy(String aggregateBy) {
        this.aggregateBy = aggregateBy;
    }

    /**
     * <p>
     * The aggregation method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     *
     * @param aggregateBy <p>
     *            The aggregation method chosen for a GetContentModeration
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentModerationAggregateBy
     */
    public GetContentModerationRequestMetadata withAggregateBy(String aggregateBy) {
        this.aggregateBy = aggregateBy;
        return this;
    }

    /**
     * <p>
     * The aggregation method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     *
     * @param aggregateBy <p>
     *            The aggregation method chosen for a GetContentModeration
     *            request.
     *            </p>
     * @see ContentModerationAggregateBy
     */
    public void setAggregateBy(ContentModerationAggregateBy aggregateBy) {
        this.aggregateBy = aggregateBy.toString();
    }

    /**
     * <p>
     * The aggregation method chosen for a GetContentModeration request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     *
     * @param aggregateBy <p>
     *            The aggregation method chosen for a GetContentModeration
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentModerationAggregateBy
     */
    public GetContentModerationRequestMetadata withAggregateBy(
            ContentModerationAggregateBy aggregateBy) {
        this.aggregateBy = aggregateBy.toString();
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
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getAggregateBy() != null)
            sb.append("AggregateBy: " + getAggregateBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode
                + ((getAggregateBy() == null) ? 0 : getAggregateBy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContentModerationRequestMetadata == false)
            return false;
        GetContentModerationRequestMetadata other = (GetContentModerationRequestMetadata) obj;

        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getAggregateBy() == null ^ this.getAggregateBy() == null)
            return false;
        if (other.getAggregateBy() != null
                && other.getAggregateBy().equals(this.getAggregateBy()) == false)
            return false;
        return true;
    }
}
