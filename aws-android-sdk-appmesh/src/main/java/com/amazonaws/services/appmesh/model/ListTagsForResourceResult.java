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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * 
 */
public class ListTagsForResourceResult implements Serializable {
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListTagsForResource</code> request. When the results of a
     * <code>ListTagsForResource</code> request exceed <code>limit</code>, you
     * can use this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The tags for the resource.
     * </p>
     */
    private java.util.List<TagRef> tags;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListTagsForResource</code> request. When the results of a
     * <code>ListTagsForResource</code> request exceed <code>limit</code>, you
     * can use this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value to include in a future
     *         <code>ListTagsForResource</code> request. When the results of a
     *         <code>ListTagsForResource</code> request exceed
     *         <code>limit</code>, you can use this value to retrieve the next
     *         page of results. This value is <code>null</code> when there are
     *         no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListTagsForResource</code> request. When the results of a
     * <code>ListTagsForResource</code> request exceed <code>limit</code>, you
     * can use this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListTagsForResource</code> request. When the results of
     *            a <code>ListTagsForResource</code> request exceed
     *            <code>limit</code>, you can use this value to retrieve the
     *            next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListTagsForResource</code> request. When the results of a
     * <code>ListTagsForResource</code> request exceed <code>limit</code>, you
     * can use this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListTagsForResource</code> request. When the results of
     *            a <code>ListTagsForResource</code> request exceed
     *            <code>limit</code>, you can use this value to retrieve the
     *            next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The tags for the resource.
     * </p>
     *
     * @return <p>
     *         The tags for the resource.
     *         </p>
     */
    public java.util.List<TagRef> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the resource.
     * </p>
     *
     * @param tags <p>
     *            The tags for the resource.
     *            </p>
     */
    public void setTags(java.util.Collection<TagRef> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagRef>(tags);
    }

    /**
     * <p>
     * The tags for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceResult withTags(TagRef... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<TagRef>(tags.length);
        }
        for (TagRef value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceResult withTags(java.util.Collection<TagRef> tags) {
        setTags(tags);
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceResult == false)
            return false;
        ListTagsForResourceResult other = (ListTagsForResourceResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
