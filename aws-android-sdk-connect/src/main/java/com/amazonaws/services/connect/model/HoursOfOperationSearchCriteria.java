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
 * The search criteria to be used to return hours of operations.
 * </p>
 */
public class HoursOfOperationSearchCriteria implements Serializable {
    /**
     * <p>
     * A list of conditions which would be applied together with an OR
     * condition.
     * </p>
     */
    private java.util.List<HoursOfOperationSearchCriteria> orConditions;

    /**
     * <p>
     * A list of conditions which would be applied together with an AND
     * condition.
     * </p>
     */
    private java.util.List<HoursOfOperationSearchCriteria> andConditions;

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are
     * <code>name</code>, <code>description</code>, <code>timezone</code>, and
     * <code>resourceID</code>.
     * </p>
     * </note>
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
    public java.util.List<HoursOfOperationSearchCriteria> getOrConditions() {
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
    public void setOrConditions(java.util.Collection<HoursOfOperationSearchCriteria> orConditions) {
        if (orConditions == null) {
            this.orConditions = null;
            return;
        }

        this.orConditions = new java.util.ArrayList<HoursOfOperationSearchCriteria>(orConditions);
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
    public HoursOfOperationSearchCriteria withOrConditions(
            HoursOfOperationSearchCriteria... orConditions) {
        if (getOrConditions() == null) {
            this.orConditions = new java.util.ArrayList<HoursOfOperationSearchCriteria>(
                    orConditions.length);
        }
        for (HoursOfOperationSearchCriteria value : orConditions) {
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
    public HoursOfOperationSearchCriteria withOrConditions(
            java.util.Collection<HoursOfOperationSearchCriteria> orConditions) {
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
    public java.util.List<HoursOfOperationSearchCriteria> getAndConditions() {
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
    public void setAndConditions(java.util.Collection<HoursOfOperationSearchCriteria> andConditions) {
        if (andConditions == null) {
            this.andConditions = null;
            return;
        }

        this.andConditions = new java.util.ArrayList<HoursOfOperationSearchCriteria>(andConditions);
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
    public HoursOfOperationSearchCriteria withAndConditions(
            HoursOfOperationSearchCriteria... andConditions) {
        if (getAndConditions() == null) {
            this.andConditions = new java.util.ArrayList<HoursOfOperationSearchCriteria>(
                    andConditions.length);
        }
        for (HoursOfOperationSearchCriteria value : andConditions) {
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
    public HoursOfOperationSearchCriteria withAndConditions(
            java.util.Collection<HoursOfOperationSearchCriteria> andConditions) {
        setAndConditions(andConditions);
        return this;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are
     * <code>name</code>, <code>description</code>, <code>timezone</code>, and
     * <code>resourceID</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         A leaf node condition which can be used to specify a string
     *         condition.
     *         </p>
     *         <note>
     *         <p>
     *         The currently supported values for <code>FieldName</code> are
     *         <code>name</code>, <code>description</code>,
     *         <code>timezone</code>, and <code>resourceID</code>.
     *         </p>
     *         </note>
     */
    public StringCondition getStringCondition() {
        return stringCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are
     * <code>name</code>, <code>description</code>, <code>timezone</code>, and
     * <code>resourceID</code>.
     * </p>
     * </note>
     *
     * @param stringCondition <p>
     *            A leaf node condition which can be used to specify a string
     *            condition.
     *            </p>
     *            <note>
     *            <p>
     *            The currently supported values for <code>FieldName</code> are
     *            <code>name</code>, <code>description</code>,
     *            <code>timezone</code>, and <code>resourceID</code>.
     *            </p>
     *            </note>
     */
    public void setStringCondition(StringCondition stringCondition) {
        this.stringCondition = stringCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are
     * <code>name</code>, <code>description</code>, <code>timezone</code>, and
     * <code>resourceID</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringCondition <p>
     *            A leaf node condition which can be used to specify a string
     *            condition.
     *            </p>
     *            <note>
     *            <p>
     *            The currently supported values for <code>FieldName</code> are
     *            <code>name</code>, <code>description</code>,
     *            <code>timezone</code>, and <code>resourceID</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperationSearchCriteria withStringCondition(StringCondition stringCondition) {
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

        if (obj instanceof HoursOfOperationSearchCriteria == false)
            return false;
        HoursOfOperationSearchCriteria other = (HoursOfOperationSearchCriteria) obj;

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
