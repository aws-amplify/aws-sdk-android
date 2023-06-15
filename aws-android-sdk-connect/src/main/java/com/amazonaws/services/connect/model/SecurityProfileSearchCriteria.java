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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The search criteria to be used to return security profiles.
 * </p>
 * <note>
 * <p>
 * The <code>name</code> field support "contains" queries with a minimum of 2
 * characters and maximum of 25 characters. Any queries with character lengths
 * outside of this range will throw invalid results.
 * </p>
 * </note>
 */
public class SecurityProfileSearchCriteria implements Serializable {
    /**
     * <p>
     * A list of conditions which would be applied together with an OR
     * condition.
     * </p>
     */
    private java.util.List<SecurityProfileSearchCriteria> orConditions;

    /**
     * <p>
     * A list of conditions which would be applied together with an AND
     * condition.
     * </p>
     */
    private java.util.List<SecurityProfileSearchCriteria> andConditions;

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     */
    private StringCondition stringCondition;

    /**
     * <p>
     * A list of conditions which would be applied together with an OR
     * condition.
     * </p>
     *
     * @return <p>
     *         A list of conditions which would be applied together with an OR
     *         condition.
     *         </p>
     */
    public java.util.List<SecurityProfileSearchCriteria> getOrConditions() {
        return orConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an OR
     * condition.
     * </p>
     *
     * @param orConditions <p>
     *            A list of conditions which would be applied together with an
     *            OR condition.
     *            </p>
     */
    public void setOrConditions(java.util.Collection<SecurityProfileSearchCriteria> orConditions) {
        if (orConditions == null) {
            this.orConditions = null;
            return;
        }

        this.orConditions = new java.util.ArrayList<SecurityProfileSearchCriteria>(orConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an OR
     * condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orConditions <p>
     *            A list of conditions which would be applied together with an
     *            OR condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfileSearchCriteria withOrConditions(
            SecurityProfileSearchCriteria... orConditions) {
        if (getOrConditions() == null) {
            this.orConditions = new java.util.ArrayList<SecurityProfileSearchCriteria>(
                    orConditions.length);
        }
        for (SecurityProfileSearchCriteria value : orConditions) {
            this.orConditions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an OR
     * condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orConditions <p>
     *            A list of conditions which would be applied together with an
     *            OR condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfileSearchCriteria withOrConditions(
            java.util.Collection<SecurityProfileSearchCriteria> orConditions) {
        setOrConditions(orConditions);
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an AND
     * condition.
     * </p>
     *
     * @return <p>
     *         A list of conditions which would be applied together with an AND
     *         condition.
     *         </p>
     */
    public java.util.List<SecurityProfileSearchCriteria> getAndConditions() {
        return andConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an AND
     * condition.
     * </p>
     *
     * @param andConditions <p>
     *            A list of conditions which would be applied together with an
     *            AND condition.
     *            </p>
     */
    public void setAndConditions(java.util.Collection<SecurityProfileSearchCriteria> andConditions) {
        if (andConditions == null) {
            this.andConditions = null;
            return;
        }

        this.andConditions = new java.util.ArrayList<SecurityProfileSearchCriteria>(andConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an AND
     * condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param andConditions <p>
     *            A list of conditions which would be applied together with an
     *            AND condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfileSearchCriteria withAndConditions(
            SecurityProfileSearchCriteria... andConditions) {
        if (getAndConditions() == null) {
            this.andConditions = new java.util.ArrayList<SecurityProfileSearchCriteria>(
                    andConditions.length);
        }
        for (SecurityProfileSearchCriteria value : andConditions) {
            this.andConditions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an AND
     * condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param andConditions <p>
     *            A list of conditions which would be applied together with an
     *            AND condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfileSearchCriteria withAndConditions(
            java.util.Collection<SecurityProfileSearchCriteria> andConditions) {
        setAndConditions(andConditions);
        return this;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     *
     * @return <p>
     *         A leaf node condition which can be used to specify a string
     *         condition.
     *         </p>
     */
    public StringCondition getStringCondition() {
        return stringCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     *
     * @param stringCondition <p>
     *            A leaf node condition which can be used to specify a string
     *            condition.
     *            </p>
     */
    public void setStringCondition(StringCondition stringCondition) {
        this.stringCondition = stringCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringCondition <p>
     *            A leaf node condition which can be used to specify a string
     *            condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfileSearchCriteria withStringCondition(StringCondition stringCondition) {
        this.stringCondition = stringCondition;
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
        if (getOrConditions() != null)
            sb.append("OrConditions: " + getOrConditions() + ",");
        if (getAndConditions() != null)
            sb.append("AndConditions: " + getAndConditions() + ",");
        if (getStringCondition() != null)
            sb.append("StringCondition: " + getStringCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrConditions() == null) ? 0 : getOrConditions().hashCode());
        hashCode = prime * hashCode
                + ((getAndConditions() == null) ? 0 : getAndConditions().hashCode());
        hashCode = prime * hashCode
                + ((getStringCondition() == null) ? 0 : getStringCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityProfileSearchCriteria == false)
            return false;
        SecurityProfileSearchCriteria other = (SecurityProfileSearchCriteria) obj;

        if (other.getOrConditions() == null ^ this.getOrConditions() == null)
            return false;
        if (other.getOrConditions() != null
                && other.getOrConditions().equals(this.getOrConditions()) == false)
            return false;
        if (other.getAndConditions() == null ^ this.getAndConditions() == null)
            return false;
        if (other.getAndConditions() != null
                && other.getAndConditions().equals(this.getAndConditions()) == false)
            return false;
        if (other.getStringCondition() == null ^ this.getStringCondition() == null)
            return false;
        if (other.getStringCondition() != null
                && other.getStringCondition().equals(this.getStringCondition()) == false)
            return false;
        return true;
    }
}
