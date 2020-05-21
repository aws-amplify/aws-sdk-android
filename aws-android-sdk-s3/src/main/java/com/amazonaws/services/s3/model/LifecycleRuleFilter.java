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
 * The <code>Filter</code> is used to identify objects that a Lifecycle Rule
 * applies to. A <code>Filter</code> must have exactly one of
 * <code>Prefix</code>, <code>Tag</code>, or <code>And</code> specified.
 * </p>
 */
public class LifecycleRuleFilter implements Serializable {
    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * This tag must exist in the object's tag set in order for the rule to
     * apply.
     * </p>
     */
    private Tag tag;

    /**
     * <p>
     * This is used in a Lifecycle Rule Filter to apply a logical AND to two or
     * more predicates. The Lifecycle Rule will apply to any object matching all
     * of the predicates configured inside the And operator.
     * </p>
     */
    private LifecycleRuleAndOperator and;

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     *
     * @return <p>
     *         Prefix identifying one or more objects to which the rule applies.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     *
     * @param prefix <p>
     *            Prefix identifying one or more objects to which the rule
     *            applies.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            Prefix identifying one or more objects to which the rule
     *            applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRuleFilter withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * This tag must exist in the object's tag set in order for the rule to
     * apply.
     * </p>
     *
     * @return <p>
     *         This tag must exist in the object's tag set in order for the rule
     *         to apply.
     *         </p>
     */
    public Tag getTag() {
        return tag;
    }

    /**
     * <p>
     * This tag must exist in the object's tag set in order for the rule to
     * apply.
     * </p>
     *
     * @param tag <p>
     *            This tag must exist in the object's tag set in order for the
     *            rule to apply.
     *            </p>
     */
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    /**
     * <p>
     * This tag must exist in the object's tag set in order for the rule to
     * apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tag <p>
     *            This tag must exist in the object's tag set in order for the
     *            rule to apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRuleFilter withTag(Tag tag) {
        this.tag = tag;
        return this;
    }

    /**
     * <p>
     * This is used in a Lifecycle Rule Filter to apply a logical AND to two or
     * more predicates. The Lifecycle Rule will apply to any object matching all
     * of the predicates configured inside the And operator.
     * </p>
     *
     * @return <p>
     *         This is used in a Lifecycle Rule Filter to apply a logical AND to
     *         two or more predicates. The Lifecycle Rule will apply to any
     *         object matching all of the predicates configured inside the And
     *         operator.
     *         </p>
     */
    public LifecycleRuleAndOperator getAnd() {
        return and;
    }

    /**
     * <p>
     * This is used in a Lifecycle Rule Filter to apply a logical AND to two or
     * more predicates. The Lifecycle Rule will apply to any object matching all
     * of the predicates configured inside the And operator.
     * </p>
     *
     * @param and <p>
     *            This is used in a Lifecycle Rule Filter to apply a logical AND
     *            to two or more predicates. The Lifecycle Rule will apply to
     *            any object matching all of the predicates configured inside
     *            the And operator.
     *            </p>
     */
    public void setAnd(LifecycleRuleAndOperator and) {
        this.and = and;
    }

    /**
     * <p>
     * This is used in a Lifecycle Rule Filter to apply a logical AND to two or
     * more predicates. The Lifecycle Rule will apply to any object matching all
     * of the predicates configured inside the And operator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param and <p>
     *            This is used in a Lifecycle Rule Filter to apply a logical AND
     *            to two or more predicates. The Lifecycle Rule will apply to
     *            any object matching all of the predicates configured inside
     *            the And operator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRuleFilter withAnd(LifecycleRuleAndOperator and) {
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

        if (obj instanceof LifecycleRuleFilter == false)
            return false;
        LifecycleRuleFilter other = (LifecycleRuleFilter) obj;

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
