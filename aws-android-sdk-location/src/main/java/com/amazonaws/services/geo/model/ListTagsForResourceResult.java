/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

public class ListTagsForResourceResult implements Serializable {
    /**
     * <p>
     * Tags that have been applied to the specified resource. Tags are mapped
     * from the tag key to the tag value: <code>"TagKey" : "TagValue"</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>{"tag1" : "value1", "tag2" : "value2"} </code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Tags that have been applied to the specified resource. Tags are mapped
     * from the tag key to the tag value: <code>"TagKey" : "TagValue"</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>{"tag1" : "value1", "tag2" : "value2"} </code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Tags that have been applied to the specified resource. Tags are
     *         mapped from the tag key to the tag value:
     *         <code>"TagKey" : "TagValue"</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example:
     *         <code>{"tag1" : "value1", "tag2" : "value2"} </code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags that have been applied to the specified resource. Tags are mapped
     * from the tag key to the tag value: <code>"TagKey" : "TagValue"</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>{"tag1" : "value1", "tag2" : "value2"} </code>
     * </p>
     * </li>
     * </ul>
     *
     * @param tags <p>
     *            Tags that have been applied to the specified resource. Tags
     *            are mapped from the tag key to the tag value:
     *            <code>"TagKey" : "TagValue"</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>{"tag1" : "value1", "tag2" : "value2"} </code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags that have been applied to the specified resource. Tags are mapped
     * from the tag key to the tag value: <code>"TagKey" : "TagValue"</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>{"tag1" : "value1", "tag2" : "value2"} </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags that have been applied to the specified resource. Tags
     *            are mapped from the tag key to the tag value:
     *            <code>"TagKey" : "TagValue"</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>{"tag1" : "value1", "tag2" : "value2"} </code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Tags that have been applied to the specified resource. Tags are mapped
     * from the tag key to the tag value: <code>"TagKey" : "TagValue"</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>{"tag1" : "value1", "tag2" : "value2"} </code>
     * </p>
     * </li>
     * </ul>
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
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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

        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
