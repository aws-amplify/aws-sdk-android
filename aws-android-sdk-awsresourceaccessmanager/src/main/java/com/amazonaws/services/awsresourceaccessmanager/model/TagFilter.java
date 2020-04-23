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

package com.amazonaws.services.awsresourceaccessmanager.model;

import java.io.Serializable;

/**
 * <p>
 * Used to filter information based on tags.
 * </p>
 */
public class TagFilter implements Serializable {
    /**
     * <p>
     * The tag key.
     * </p>
     */
    private String tagKey;

    /**
     * <p>
     * The tag values.
     * </p>
     */
    private java.util.List<String> tagValues;

    /**
     * <p>
     * The tag key.
     * </p>
     *
     * @return <p>
     *         The tag key.
     *         </p>
     */
    public String getTagKey() {
        return tagKey;
    }

    /**
     * <p>
     * The tag key.
     * </p>
     *
     * @param tagKey <p>
     *            The tag key.
     *            </p>
     */
    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The tag key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKey <p>
     *            The tag key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagFilter withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * <p>
     * The tag values.
     * </p>
     *
     * @return <p>
     *         The tag values.
     *         </p>
     */
    public java.util.List<String> getTagValues() {
        return tagValues;
    }

    /**
     * <p>
     * The tag values.
     * </p>
     *
     * @param tagValues <p>
     *            The tag values.
     *            </p>
     */
    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new java.util.ArrayList<String>(tagValues);
    }

    /**
     * <p>
     * The tag values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagValues <p>
     *            The tag values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagFilter withTagValues(String... tagValues) {
        if (getTagValues() == null) {
            this.tagValues = new java.util.ArrayList<String>(tagValues.length);
        }
        for (String value : tagValues) {
            this.tagValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tag values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagValues <p>
     *            The tag values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagFilter withTagValues(java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
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
        if (getTagKey() != null)
            sb.append("tagKey: " + getTagKey() + ",");
        if (getTagValues() != null)
            sb.append("tagValues: " + getTagValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagFilter == false)
            return false;
        TagFilter other = (TagFilter) obj;

        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null
                && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        return true;
    }
}
