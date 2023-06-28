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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

public class ListTagsForResourceResult implements Serializable {
    /**
     * <p>
     * If you specify this parameter and the result of a
     * <code>ListTagsForResource</code> call is truncated, the response includes
     * a token that you can use in the next request to fetch the next set of
     * tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A map of tag keys and values associated with the specified signaling
     * channel.
     * </p>
     */
    private java.util.Map<String, String> tags = new java.util.HashMap<String, String>();

    /**
     * <p>
     * If you specify this parameter and the result of a
     * <code>ListTagsForResource</code> call is truncated, the response includes
     * a token that you can use in the next request to fetch the next set of
     * tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @return <p>
     *         If you specify this parameter and the result of a
     *         <code>ListTagsForResource</code> call is truncated, the response
     *         includes a token that you can use in the next request to fetch
     *         the next set of tags.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If you specify this parameter and the result of a
     * <code>ListTagsForResource</code> call is truncated, the response includes
     * a token that you can use in the next request to fetch the next set of
     * tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @param nextToken <p>
     *            If you specify this parameter and the result of a
     *            <code>ListTagsForResource</code> call is truncated, the
     *            response includes a token that you can use in the next request
     *            to fetch the next set of tags.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify this parameter and the result of a
     * <code>ListTagsForResource</code> call is truncated, the response includes
     * a token that you can use in the next request to fetch the next set of
     * tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/=]*<br/>
     *
     * @param nextToken <p>
     *            If you specify this parameter and the result of a
     *            <code>ListTagsForResource</code> call is truncated, the
     *            response includes a token that you can use in the next request
     *            to fetch the next set of tags.
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
     * A map of tag keys and values associated with the specified signaling
     * channel.
     * </p>
     *
     * @return <p>
     *         A map of tag keys and values associated with the specified
     *         signaling channel.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of tag keys and values associated with the specified signaling
     * channel.
     * </p>
     *
     * @param tags <p>
     *            A map of tag keys and values associated with the specified
     *            signaling channel.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of tag keys and values associated with the specified signaling
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map of tag keys and values associated with the specified
     *            signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A map of tag keys and values associated with the specified signaling
     * channel.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ListTagsForResourceResult clearTagsEntries() {
        this.tags = null;
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
            sb.append("NextToken: " + getNextToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
