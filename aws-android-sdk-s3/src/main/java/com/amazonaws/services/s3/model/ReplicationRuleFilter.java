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
 * A filter that identifies the subset of objects to which the replication rule
 * applies. A <code>Filter</code> must specify exactly one <code>Prefix</code>,
 * <code>Tag</code>, or an <code>And</code> child element.
 * </p>
 */
public class ReplicationRuleFilter implements Serializable {
    /**
     * <p>
     * An object key name prefix that identifies the subset of objects to which
     * the rule applies.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * A container for specifying a tag key and value.
     * </p>
     * <p>
     * The rule applies only to objects that have the tag in their tag set.
     * </p>
     */
    private Tag tag;

    /**
     * <p>
     * A container for specifying rule filters. The filters determine the subset
     * of objects to which the rule applies. This element is required only if
     * you specify more than one filter. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter,
     * wrap these filters in an <code>And</code> tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter based on multiple tags, wrap the <code>Tag</code>
     * elements in an <code>And</code> tag.
     * </p>
     * </li>
     * </ul>
     */
    private ReplicationRuleAndOperator and;

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
    public ReplicationRuleFilter withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * A container for specifying a tag key and value.
     * </p>
     * <p>
     * The rule applies only to objects that have the tag in their tag set.
     * </p>
     *
     * @return <p>
     *         A container for specifying a tag key and value.
     *         </p>
     *         <p>
     *         The rule applies only to objects that have the tag in their tag
     *         set.
     *         </p>
     */
    public Tag getTag() {
        return tag;
    }

    /**
     * <p>
     * A container for specifying a tag key and value.
     * </p>
     * <p>
     * The rule applies only to objects that have the tag in their tag set.
     * </p>
     *
     * @param tag <p>
     *            A container for specifying a tag key and value.
     *            </p>
     *            <p>
     *            The rule applies only to objects that have the tag in their
     *            tag set.
     *            </p>
     */
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    /**
     * <p>
     * A container for specifying a tag key and value.
     * </p>
     * <p>
     * The rule applies only to objects that have the tag in their tag set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tag <p>
     *            A container for specifying a tag key and value.
     *            </p>
     *            <p>
     *            The rule applies only to objects that have the tag in their
     *            tag set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRuleFilter withTag(Tag tag) {
        this.tag = tag;
        return this;
    }

    /**
     * <p>
     * A container for specifying rule filters. The filters determine the subset
     * of objects to which the rule applies. This element is required only if
     * you specify more than one filter. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter,
     * wrap these filters in an <code>And</code> tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter based on multiple tags, wrap the <code>Tag</code>
     * elements in an <code>And</code> tag.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A container for specifying rule filters. The filters determine
     *         the subset of objects to which the rule applies. This element is
     *         required only if you specify more than one filter. For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify both a <code>Prefix</code> and a <code>Tag</code>
     *         filter, wrap these filters in an <code>And</code> tag.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify a filter based on multiple tags, wrap the
     *         <code>Tag</code> elements in an <code>And</code> tag.
     *         </p>
     *         </li>
     *         </ul>
     */
    public ReplicationRuleAndOperator getAnd() {
        return and;
    }

    /**
     * <p>
     * A container for specifying rule filters. The filters determine the subset
     * of objects to which the rule applies. This element is required only if
     * you specify more than one filter. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter,
     * wrap these filters in an <code>And</code> tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter based on multiple tags, wrap the <code>Tag</code>
     * elements in an <code>And</code> tag.
     * </p>
     * </li>
     * </ul>
     *
     * @param and <p>
     *            A container for specifying rule filters. The filters determine
     *            the subset of objects to which the rule applies. This element
     *            is required only if you specify more than one filter. For
     *            example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify both a <code>Prefix</code> and a
     *            <code>Tag</code> filter, wrap these filters in an
     *            <code>And</code> tag.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify a filter based on multiple tags, wrap the
     *            <code>Tag</code> elements in an <code>And</code> tag.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAnd(ReplicationRuleAndOperator and) {
        this.and = and;
    }

    /**
     * <p>
     * A container for specifying rule filters. The filters determine the subset
     * of objects to which the rule applies. This element is required only if
     * you specify more than one filter. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter,
     * wrap these filters in an <code>And</code> tag.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter based on multiple tags, wrap the <code>Tag</code>
     * elements in an <code>And</code> tag.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param and <p>
     *            A container for specifying rule filters. The filters determine
     *            the subset of objects to which the rule applies. This element
     *            is required only if you specify more than one filter. For
     *            example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you specify both a <code>Prefix</code> and a
     *            <code>Tag</code> filter, wrap these filters in an
     *            <code>And</code> tag.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify a filter based on multiple tags, wrap the
     *            <code>Tag</code> elements in an <code>And</code> tag.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRuleFilter withAnd(ReplicationRuleAndOperator and) {
        this.and = and;
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
        if (getTag() != null)
            sb.append("Tag: " + getTag() + ",");
        if (getAnd() != null)
            sb.append("And: " + getAnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getTag() == null) ? 0 : getTag().hashCode());
        hashCode = prime * hashCode + ((getAnd() == null) ? 0 : getAnd().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationRuleFilter == false)
            return false;
        ReplicationRuleFilter other = (ReplicationRuleFilter) obj;

        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getTag() == null ^ this.getTag() == null)
            return false;
        if (other.getTag() != null && other.getTag().equals(this.getTag()) == false)
            return false;
        if (other.getAnd() == null ^ this.getAnd() == null)
            return false;
        if (other.getAnd() != null && other.getAnd().equals(this.getAnd()) == false)
            return false;
        return true;
    }
}
