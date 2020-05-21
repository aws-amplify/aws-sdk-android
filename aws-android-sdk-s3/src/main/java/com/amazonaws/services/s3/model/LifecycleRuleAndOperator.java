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
 * This is used in a Lifecycle Rule Filter to apply a logical AND to two or more
 * predicates. The Lifecycle Rule will apply to any object matching all of the
 * predicates configured inside the And operator.
 * </p>
 */
public class LifecycleRuleAndOperator implements Serializable {
    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * All of these tags must exist in the object's tag set in order for the
     * rule to apply.
     * </p>
     */
    private java.util.List<Tag> tags;

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
    public LifecycleRuleAndOperator withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * All of these tags must exist in the object's tag set in order for the
     * rule to apply.
     * </p>
     *
     * @return <p>
     *         All of these tags must exist in the object's tag set in order for
     *         the rule to apply.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * All of these tags must exist in the object's tag set in order for the
     * rule to apply.
     * </p>
     *
     * @param tags <p>
     *            All of these tags must exist in the object's tag set in order
     *            for the rule to apply.
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
     * All of these tags must exist in the object's tag set in order for the
     * rule to apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            All of these tags must exist in the object's tag set in order
     *            for the rule to apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRuleAndOperator withTags(Tag... tags) {
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
     * All of these tags must exist in the object's tag set in order for the
     * rule to apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            All of these tags must exist in the object's tag set in order
     *            for the rule to apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRuleAndOperator withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof LifecycleRuleAndOperator == false)
            return false;
        LifecycleRuleAndOperator other = (LifecycleRuleAndOperator) obj;

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
