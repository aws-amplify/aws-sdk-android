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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class ListTagOptionsResult implements Serializable {
    /**
     * <p>
     * Information about the TagOptions.
     * </p>
     */
    private java.util.List<TagOptionDetail> tagOptionDetails;

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     */
    private String pageToken;

    /**
     * <p>
     * Information about the TagOptions.
     * </p>
     *
     * @return <p>
     *         Information about the TagOptions.
     *         </p>
     */
    public java.util.List<TagOptionDetail> getTagOptionDetails() {
        return tagOptionDetails;
    }

    /**
     * <p>
     * Information about the TagOptions.
     * </p>
     *
     * @param tagOptionDetails <p>
     *            Information about the TagOptions.
     *            </p>
     */
    public void setTagOptionDetails(java.util.Collection<TagOptionDetail> tagOptionDetails) {
        if (tagOptionDetails == null) {
            this.tagOptionDetails = null;
            return;
        }

        this.tagOptionDetails = new java.util.ArrayList<TagOptionDetail>(tagOptionDetails);
    }

    /**
     * <p>
     * Information about the TagOptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagOptionDetails <p>
     *            Information about the TagOptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagOptionsResult withTagOptionDetails(TagOptionDetail... tagOptionDetails) {
        if (getTagOptionDetails() == null) {
            this.tagOptionDetails = new java.util.ArrayList<TagOptionDetail>(
                    tagOptionDetails.length);
        }
        for (TagOptionDetail value : tagOptionDetails) {
            this.tagOptionDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the TagOptions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagOptionDetails <p>
     *            Information about the TagOptions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagOptionsResult withTagOptionDetails(
            java.util.Collection<TagOptionDetail> tagOptionDetails) {
        setTagOptionDetails(tagOptionDetails);
        return this;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @return <p>
     *         The page token for the next set of results. To retrieve the first
     *         set of results, use null.
     *         </p>
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param pageToken <p>
     *            The page token for the next set of results. To retrieve the
     *            first set of results, use null.
     *            </p>
     */
    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of
     * results, use null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD]*<br/>
     *
     * @param pageToken <p>
     *            The page token for the next set of results. To retrieve the
     *            first set of results, use null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagOptionsResult withPageToken(String pageToken) {
        this.pageToken = pageToken;
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
        if (getTagOptionDetails() != null)
            sb.append("TagOptionDetails: " + getTagOptionDetails() + ",");
        if (getPageToken() != null)
            sb.append("PageToken: " + getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTagOptionDetails() == null) ? 0 : getTagOptionDetails().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagOptionsResult == false)
            return false;
        ListTagOptionsResult other = (ListTagOptionsResult) obj;

        if (other.getTagOptionDetails() == null ^ this.getTagOptionDetails() == null)
            return false;
        if (other.getTagOptionDetails() != null
                && other.getTagOptionDetails().equals(this.getTagOptionDetails()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null
                && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }
}
