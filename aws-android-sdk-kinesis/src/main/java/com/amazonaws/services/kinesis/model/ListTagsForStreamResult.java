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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output for <code>ListTagsForStream</code>.
 * </p>
 */
public class ListTagsForStreamResult implements Serializable {
    /**
     * <p>
     * A list of tags associated with <code>StreamName</code>, starting with the
     * first tag after <code>ExclusiveStartTagKey</code> and up to the specified
     * <code>Limit</code>.
     * </p>
     */
    private java.util.List<Tag> tags = new java.util.ArrayList<Tag>();

    /**
     * <p>
     * If set to <code>true</code>, more tags are available. To request
     * additional tags, set <code>ExclusiveStartTagKey</code> to the key of the
     * last tag returned.
     * </p>
     */
    private Boolean hasMoreTags;

    /**
     * <p>
     * A list of tags associated with <code>StreamName</code>, starting with the
     * first tag after <code>ExclusiveStartTagKey</code> and up to the specified
     * <code>Limit</code>.
     * </p>
     *
     * @return <p>
     *         A list of tags associated with <code>StreamName</code>, starting
     *         with the first tag after <code>ExclusiveStartTagKey</code> and up
     *         to the specified <code>Limit</code>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with <code>StreamName</code>, starting with the
     * first tag after <code>ExclusiveStartTagKey</code> and up to the specified
     * <code>Limit</code>.
     * </p>
     *
     * @param tags <p>
     *            A list of tags associated with <code>StreamName</code>,
     *            starting with the first tag after
     *            <code>ExclusiveStartTagKey</code> and up to the specified
     *            <code>Limit</code>.
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
     * A list of tags associated with <code>StreamName</code>, starting with the
     * first tag after <code>ExclusiveStartTagKey</code> and up to the specified
     * <code>Limit</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags associated with <code>StreamName</code>,
     *            starting with the first tag after
     *            <code>ExclusiveStartTagKey</code> and up to the specified
     *            <code>Limit</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForStreamResult withTags(Tag... tags) {
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
     * A list of tags associated with <code>StreamName</code>, starting with the
     * first tag after <code>ExclusiveStartTagKey</code> and up to the specified
     * <code>Limit</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags associated with <code>StreamName</code>,
     *            starting with the first tag after
     *            <code>ExclusiveStartTagKey</code> and up to the specified
     *            <code>Limit</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForStreamResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, more tags are available. To request
     * additional tags, set <code>ExclusiveStartTagKey</code> to the key of the
     * last tag returned.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, more tags are available. To request
     *         additional tags, set <code>ExclusiveStartTagKey</code> to the key
     *         of the last tag returned.
     *         </p>
     */
    public Boolean isHasMoreTags() {
        return hasMoreTags;
    }

    /**
     * <p>
     * If set to <code>true</code>, more tags are available. To request
     * additional tags, set <code>ExclusiveStartTagKey</code> to the key of the
     * last tag returned.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, more tags are available. To request
     *         additional tags, set <code>ExclusiveStartTagKey</code> to the key
     *         of the last tag returned.
     *         </p>
     */
    public Boolean getHasMoreTags() {
        return hasMoreTags;
    }

    /**
     * <p>
     * If set to <code>true</code>, more tags are available. To request
     * additional tags, set <code>ExclusiveStartTagKey</code> to the key of the
     * last tag returned.
     * </p>
     *
     * @param hasMoreTags <p>
     *            If set to <code>true</code>, more tags are available. To
     *            request additional tags, set <code>ExclusiveStartTagKey</code>
     *            to the key of the last tag returned.
     *            </p>
     */
    public void setHasMoreTags(Boolean hasMoreTags) {
        this.hasMoreTags = hasMoreTags;
    }

    /**
     * <p>
     * If set to <code>true</code>, more tags are available. To request
     * additional tags, set <code>ExclusiveStartTagKey</code> to the key of the
     * last tag returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hasMoreTags <p>
     *            If set to <code>true</code>, more tags are available. To
     *            request additional tags, set <code>ExclusiveStartTagKey</code>
     *            to the key of the last tag returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForStreamResult withHasMoreTags(Boolean hasMoreTags) {
        this.hasMoreTags = hasMoreTags;
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
        if (getHasMoreTags() != null)
            sb.append("HasMoreTags: " + getHasMoreTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getHasMoreTags() == null) ? 0 : getHasMoreTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForStreamResult == false)
            return false;
        ListTagsForStreamResult other = (ListTagsForStreamResult) obj;

        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getHasMoreTags() == null ^ this.getHasMoreTags() == null)
            return false;
        if (other.getHasMoreTags() != null
                && other.getHasMoreTags().equals(this.getHasMoreTags()) == false)
            return false;
        return true;
    }
}
