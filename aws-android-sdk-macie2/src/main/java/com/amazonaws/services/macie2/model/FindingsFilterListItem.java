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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a findings filter.
 * </p>
 */
public class FindingsFilterListItem implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The custom name of the filter.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the filter.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the filter.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the filter.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingsFilterListItem withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the filter.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the filter.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingsFilterListItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The custom name of the filter.
     * </p>
     *
     * @return <p>
     *         The custom name of the filter.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The custom name of the filter.
     * </p>
     *
     * @param name <p>
     *            The custom name of the filter.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The custom name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingsFilterListItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the filter.
     * </p>
     *
     * @return <p>
     *         A map of key-value pairs that identifies the tags (keys and
     *         values) that are associated with the filter.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the filter.
     * </p>
     *
     * @param tags <p>
     *            A map of key-value pairs that identifies the tags (keys and
     *            values) that are associated with the filter.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A map of key-value pairs that identifies the tags (keys and
     *            values) that are associated with the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingsFilterListItem withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that
     * are associated with the filter.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingsFilterListItem addtagsEntry(String key, String value) {
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
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public FindingsFilterListItem cleartagsEntries() {
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingsFilterListItem == false)
            return false;
        FindingsFilterListItem other = (FindingsFilterListItem) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
