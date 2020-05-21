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
 * A conjunction (logical AND) of predicates, which is used in evaluating a
 * metrics filter. The operator must have at least two predicates in any
 * combination, and an object must match all of the predicates for the filter to
 * apply.
 * </p>
 */
public class AnalyticsAndOperator implements Serializable {
    /**
     * <p>
     * The prefix to use when evaluating an AND predicate: The prefix that an
     * object must have to be included in the metrics results.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The list of tags to use when evaluating an AND predicate.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The prefix to use when evaluating an AND predicate: The prefix that an
     * object must have to be included in the metrics results.
     * </p>
     *
     * @return <p>
     *         The prefix to use when evaluating an AND predicate: The prefix
     *         that an object must have to be included in the metrics results.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The prefix to use when evaluating an AND predicate: The prefix that an
     * object must have to be included in the metrics results.
     * </p>
     *
     * @param prefix <p>
     *            The prefix to use when evaluating an AND predicate: The prefix
     *            that an object must have to be included in the metrics
     *            results.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix to use when evaluating an AND predicate: The prefix that an
     * object must have to be included in the metrics results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            The prefix to use when evaluating an AND predicate: The prefix
     *            that an object must have to be included in the metrics
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsAndOperator withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * The list of tags to use when evaluating an AND predicate.
     * </p>
     *
     * @return <p>
     *         The list of tags to use when evaluating an AND predicate.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags to use when evaluating an AND predicate.
     * </p>
     *
     * @param tags <p>
     *            The list of tags to use when evaluating an AND predicate.
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
     * The list of tags to use when evaluating an AND predicate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags to use when evaluating an AND predicate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsAndOperator withTags(Tag... tags) {
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
     * The list of tags to use when evaluating an AND predicate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags to use when evaluating an AND predicate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsAndOperator withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof AnalyticsAndOperator == false)
            return false;
        AnalyticsAndOperator other = (AnalyticsAndOperator) obj;

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
