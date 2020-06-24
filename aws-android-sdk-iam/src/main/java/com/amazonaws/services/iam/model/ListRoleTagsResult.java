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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

public class ListRoleTagsResult implements Serializable {
    /**
     * <p>
     * The list of tags currently that is attached to the role. Each tag
     * consists of a key name and an associated value. If no tags are attached
     * to the specified role, the response contains an empty list.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can use the <code>Marker</code> request
     * parameter to make a subsequent pagination request that retrieves more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when more results are available. Check
     * <code>IsTruncated</code> after every call to ensure that you receive all
     * of your results.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of tags currently that is attached to the role. Each tag
     * consists of a key name and an associated value. If no tags are attached
     * to the specified role, the response contains an empty list.
     * </p>
     *
     * @return <p>
     *         The list of tags currently that is attached to the role. Each tag
     *         consists of a key name and an associated value. If no tags are
     *         attached to the specified role, the response contains an empty
     *         list.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags currently that is attached to the role. Each tag
     * consists of a key name and an associated value. If no tags are attached
     * to the specified role, the response contains an empty list.
     * </p>
     *
     * @param tags <p>
     *            The list of tags currently that is attached to the role. Each
     *            tag consists of a key name and an associated value. If no tags
     *            are attached to the specified role, the response contains an
     *            empty list.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags currently that is attached to the role. Each tag
     * consists of a key name and an associated value. If no tags are attached
     * to the specified role, the response contains an empty list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags currently that is attached to the role. Each
     *            tag consists of a key name and an associated value. If no tags
     *            are attached to the specified role, the response contains an
     *            empty list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoleTagsResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags currently that is attached to the role. Each tag
     * consists of a key name and an associated value. If no tags are attached
     * to the specified role, the response contains an empty list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags currently that is attached to the role. Each
     *            tag consists of a key name and an associated value. If no tags
     *            are attached to the specified role, the response contains an
     *            empty list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoleTagsResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can use the <code>Marker</code> request
     * parameter to make a subsequent pagination request that retrieves more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when more results are available. Check
     * <code>IsTruncated</code> after every call to ensure that you receive all
     * of your results.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items to return. If
     *         your results were truncated, you can use the <code>Marker</code>
     *         request parameter to make a subsequent pagination request that
     *         retrieves more items. Note that IAM might return fewer than the
     *         <code>MaxItems</code> number of results even when more results
     *         are available. Check <code>IsTruncated</code> after every call to
     *         ensure that you receive all of your results.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can use the <code>Marker</code> request
     * parameter to make a subsequent pagination request that retrieves more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when more results are available. Check
     * <code>IsTruncated</code> after every call to ensure that you receive all
     * of your results.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items to return. If
     *         your results were truncated, you can use the <code>Marker</code>
     *         request parameter to make a subsequent pagination request that
     *         retrieves more items. Note that IAM might return fewer than the
     *         <code>MaxItems</code> number of results even when more results
     *         are available. Check <code>IsTruncated</code> after every call to
     *         ensure that you receive all of your results.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can use the <code>Marker</code> request
     * parameter to make a subsequent pagination request that retrieves more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when more results are available. Check
     * <code>IsTruncated</code> after every call to ensure that you receive all
     * of your results.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more items to return.
     *            If your results were truncated, you can use the
     *            <code>Marker</code> request parameter to make a subsequent
     *            pagination request that retrieves more items. Note that IAM
     *            might return fewer than the <code>MaxItems</code> number of
     *            results even when more results are available. Check
     *            <code>IsTruncated</code> after every call to ensure that you
     *            receive all of your results.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can use the <code>Marker</code> request
     * parameter to make a subsequent pagination request that retrieves more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when more results are available. Check
     * <code>IsTruncated</code> after every call to ensure that you receive all
     * of your results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more items to return.
     *            If your results were truncated, you can use the
     *            <code>Marker</code> request parameter to make a subsequent
     *            pagination request that retrieves more items. Note that IAM
     *            might return fewer than the <code>MaxItems</code> number of
     *            results even when more results are available. Check
     *            <code>IsTruncated</code> after every call to ensure that you
     *            receive all of your results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoleTagsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     *
     * @return <p>
     *         When <code>IsTruncated</code> is <code>true</code>, this element
     *         is present and contains the value to use for the
     *         <code>Marker</code> parameter in a subsequent pagination request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     *
     * @param marker <p>
     *            When <code>IsTruncated</code> is <code>true</code>, this
     *            element is present and contains the value to use for the
     *            <code>Marker</code> parameter in a subsequent pagination
     *            request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            When <code>IsTruncated</code> is <code>true</code>, this
     *            element is present and contains the value to use for the
     *            <code>Marker</code> parameter in a subsequent pagination
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRoleTagsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoleTagsResult == false)
            return false;
        ListRoleTagsResult other = (ListRoleTagsResult) obj;

        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
