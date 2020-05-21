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
 * The filter used to describe a set of objects for analyses. A filter must have
 * exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no
 * filter is provided, all objects will be considered in any analysis.
 * </p>
 */
public class AnalyticsFilter implements Serializable {
    /**
     * <p>
     * The prefix to use when evaluating an analytics filter.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The tag to use when evaluating an analytics filter.
     * </p>
     */
    private Tag tag;

    /**
     * <p>
     * A conjunction (logical AND) of predicates, which is used in evaluating an
     * analytics filter. The operator must have at least two predicates.
     * </p>
     */
    private AnalyticsAndOperator and;

    /**
     * <p>
     * The prefix to use when evaluating an analytics filter.
     * </p>
     *
     * @return <p>
     *         The prefix to use when evaluating an analytics filter.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The prefix to use when evaluating an analytics filter.
     * </p>
     *
     * @param prefix <p>
     *            The prefix to use when evaluating an analytics filter.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix to use when evaluating an analytics filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            The prefix to use when evaluating an analytics filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsFilter withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * The tag to use when evaluating an analytics filter.
     * </p>
     *
     * @return <p>
     *         The tag to use when evaluating an analytics filter.
     *         </p>
     */
    public Tag getTag() {
        return tag;
    }

    /**
     * <p>
     * The tag to use when evaluating an analytics filter.
     * </p>
     *
     * @param tag <p>
     *            The tag to use when evaluating an analytics filter.
     *            </p>
     */
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    /**
     * <p>
     * The tag to use when evaluating an analytics filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tag <p>
     *            The tag to use when evaluating an analytics filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsFilter withTag(Tag tag) {
        this.tag = tag;
        return this;
    }

    /**
     * <p>
     * A conjunction (logical AND) of predicates, which is used in evaluating an
     * analytics filter. The operator must have at least two predicates.
     * </p>
     *
     * @return <p>
     *         A conjunction (logical AND) of predicates, which is used in
     *         evaluating an analytics filter. The operator must have at least
     *         two predicates.
     *         </p>
     */
    public AnalyticsAndOperator getAnd() {
        return and;
    }

    /**
     * <p>
     * A conjunction (logical AND) of predicates, which is used in evaluating an
     * analytics filter. The operator must have at least two predicates.
     * </p>
     *
     * @param and <p>
     *            A conjunction (logical AND) of predicates, which is used in
     *            evaluating an analytics filter. The operator must have at
     *            least two predicates.
     *            </p>
     */
    public void setAnd(AnalyticsAndOperator and) {
        this.and = and;
    }

    /**
     * <p>
     * A conjunction (logical AND) of predicates, which is used in evaluating an
     * analytics filter. The operator must have at least two predicates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param and <p>
     *            A conjunction (logical AND) of predicates, which is used in
     *            evaluating an analytics filter. The operator must have at
     *            least two predicates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsFilter withAnd(AnalyticsAndOperator and) {
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

        if (obj instanceof AnalyticsFilter == false)
            return false;
        AnalyticsFilter other = (AnalyticsFilter) obj;

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
