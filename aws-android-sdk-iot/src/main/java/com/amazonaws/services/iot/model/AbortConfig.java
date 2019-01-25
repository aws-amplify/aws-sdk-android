/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Details of abort criteria to abort the job.
 * </p>
 */
public class AbortConfig implements Serializable {
    /**
     * <p>
     * The list of abort criteria to define rules to abort the job.
     * </p>
     */
    private java.util.List<AbortCriteria> criteriaList;

    /**
     * <p>
     * The list of abort criteria to define rules to abort the job.
     * </p>
     *
     * @return <p>
     *         The list of abort criteria to define rules to abort the job.
     *         </p>
     */
    public java.util.List<AbortCriteria> getCriteriaList() {
        return criteriaList;
    }

    /**
     * <p>
     * The list of abort criteria to define rules to abort the job.
     * </p>
     *
     * @param criteriaList <p>
     *            The list of abort criteria to define rules to abort the job.
     *            </p>
     */
    public void setCriteriaList(java.util.Collection<AbortCriteria> criteriaList) {
        if (criteriaList == null) {
            this.criteriaList = null;
            return;
        }

        this.criteriaList = new java.util.ArrayList<AbortCriteria>(criteriaList);
    }

    /**
     * <p>
     * The list of abort criteria to define rules to abort the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param criteriaList <p>
     *            The list of abort criteria to define rules to abort the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AbortConfig withCriteriaList(AbortCriteria... criteriaList) {
        if (getCriteriaList() == null) {
            this.criteriaList = new java.util.ArrayList<AbortCriteria>(criteriaList.length);
        }
        for (AbortCriteria value : criteriaList) {
            this.criteriaList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of abort criteria to define rules to abort the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param criteriaList <p>
     *            The list of abort criteria to define rules to abort the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AbortConfig withCriteriaList(java.util.Collection<AbortCriteria> criteriaList) {
        setCriteriaList(criteriaList);
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
        if (getCriteriaList() != null)
            sb.append("criteriaList: " + getCriteriaList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCriteriaList() == null) ? 0 : getCriteriaList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbortConfig == false)
            return false;
        AbortConfig other = (AbortConfig) obj;

        if (other.getCriteriaList() == null ^ this.getCriteriaList() == null)
            return false;
        if (other.getCriteriaList() != null
                && other.getCriteriaList().equals(this.getCriteriaList()) == false)
            return false;
        return true;
    }
}
