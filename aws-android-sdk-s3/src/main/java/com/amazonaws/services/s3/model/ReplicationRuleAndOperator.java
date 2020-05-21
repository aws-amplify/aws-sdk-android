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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * A container for specifying rule filters. The filters determine the subset of
 * objects to which the rule applies. This element is required only if you
 * specify more than one filter.
 * </p>
 * <p>
 * For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap
 * these filters in an <code>And</code> tag.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you specify a filter based on multiple tags, wrap the <code>Tag</code>
 * elements in an <code>And</code> tag
 * </p>
 * </li>
 * </ul>
 */
public class ReplicationRuleAndOperator implements Serializable {
    /**
     * <p>
     * An object key name prefix that identifies the subset of objects to which
     * the rule applies.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * An array of tags containing key and value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * An object key name prefix that identifies the subset of objects to which
     * the rule applies.
     * </p>
     *
     * @return <p>
     *         An object key name prefix that identifies the subset of objects
     *         to which the rule applies.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * An object key name prefix that identifies the subset of objects to which
     * the rule applies.
     * </p>
     *
     * @param prefix <p>
     *            An object key name prefix that identifies the subset of
     *            objects to which the rule applies.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An object key name prefix that identifies the subset of objects to which
     * the rule applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            An object key name prefix that identifies the subset of
     *            objects to which the rule applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRuleAndOperator withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * An array of tags containing key and value pairs.
     * </p>
     *
     * @return <p>
     *         An array of tags containing key and value pairs.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of tags containing key and value pairs.
     * </p>
     *
     * @param tags <p>
     *            An array of tags containing key and value pairs.
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
     * An array of tags containing key and value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of tags containing key and value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRuleAndOperator withTags(Tag... tags) {
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
     * An array of tags containing key and value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of tags containing key and value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRuleAndOperator withTags(java.util.Collection<Tag> tags) {
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
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationRuleAndOperator == false)
            return false;
        ReplicationRuleAndOperator other = (ReplicationRuleAndOperator) obj;

        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
