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
 * Specifies, as a map, one or more property-based conditions that filter the
 * results of a query for findings.
 * </p>
 */
public class FindingCriteria implements Serializable {
    /**
     * <p>
     * A condition that specifies the property, operator, and value to use to
     * filter the results.
     * </p>
     */
    private java.util.Map<String, CriterionAdditionalProperties> criterion;

    /**
     * <p>
     * A condition that specifies the property, operator, and value to use to
     * filter the results.
     * </p>
     *
     * @return <p>
     *         A condition that specifies the property, operator, and value to
     *         use to filter the results.
     *         </p>
     */
    public java.util.Map<String, CriterionAdditionalProperties> getCriterion() {
        return criterion;
    }

    /**
     * <p>
     * A condition that specifies the property, operator, and value to use to
     * filter the results.
     * </p>
     *
     * @param criterion <p>
     *            A condition that specifies the property, operator, and value
     *            to use to filter the results.
     *            </p>
     */
    public void setCriterion(java.util.Map<String, CriterionAdditionalProperties> criterion) {
        this.criterion = criterion;
    }

    /**
     * <p>
     * A condition that specifies the property, operator, and value to use to
     * filter the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param criterion <p>
     *            A condition that specifies the property, operator, and value
     *            to use to filter the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingCriteria withCriterion(
            java.util.Map<String, CriterionAdditionalProperties> criterion) {
        this.criterion = criterion;
        return this;
    }

    /**
     * <p>
     * A condition that specifies the property, operator, and value to use to
     * filter the results.
     * </p>
     * <p>
     * The method adds a new key-value pair into criterion parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into criterion.
     * @param value The corresponding value of the entry to be added into
     *            criterion.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingCriteria addcriterionEntry(String key, CriterionAdditionalProperties value) {
        if (null == this.criterion) {
            this.criterion = new java.util.HashMap<String, CriterionAdditionalProperties>();
        }
        if (this.criterion.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.criterion.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into criterion.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public FindingCriteria clearcriterionEntries() {
        this.criterion = null;
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
        if (getCriterion() != null)
            sb.append("criterion: " + getCriterion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriterion() == null) ? 0 : getCriterion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingCriteria == false)
            return false;
        FindingCriteria other = (FindingCriteria) obj;

        if (other.getCriterion() == null ^ this.getCriterion() == null)
            return false;
        if (other.getCriterion() != null
                && other.getCriterion().equals(this.getCriterion()) == false)
            return false;
        return true;
    }
}
