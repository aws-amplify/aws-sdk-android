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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * A number filter for querying findings.
 * </p>
 */
public class NumberFilter implements Serializable {
    /**
     * <p>
     * The greater-than-equal condition to be applied to a single field when
     * querying for findings.
     * </p>
     */
    private Double gte;

    /**
     * <p>
     * The less-than-equal condition to be applied to a single field when
     * querying for findings.
     * </p>
     */
    private Double lte;

    /**
     * <p>
     * The equal-to condition to be applied to a single field when querying for
     * findings.
     * </p>
     */
    private Double eq;

    /**
     * <p>
     * The greater-than-equal condition to be applied to a single field when
     * querying for findings.
     * </p>
     *
     * @return <p>
     *         The greater-than-equal condition to be applied to a single field
     *         when querying for findings.
     *         </p>
     */
    public Double getGte() {
        return gte;
    }

    /**
     * <p>
     * The greater-than-equal condition to be applied to a single field when
     * querying for findings.
     * </p>
     *
     * @param gte <p>
     *            The greater-than-equal condition to be applied to a single
     *            field when querying for findings.
     *            </p>
     */
    public void setGte(Double gte) {
        this.gte = gte;
    }

    /**
     * <p>
     * The greater-than-equal condition to be applied to a single field when
     * querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gte <p>
     *            The greater-than-equal condition to be applied to a single
     *            field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberFilter withGte(Double gte) {
        this.gte = gte;
        return this;
    }

    /**
     * <p>
     * The less-than-equal condition to be applied to a single field when
     * querying for findings.
     * </p>
     *
     * @return <p>
     *         The less-than-equal condition to be applied to a single field
     *         when querying for findings.
     *         </p>
     */
    public Double getLte() {
        return lte;
    }

    /**
     * <p>
     * The less-than-equal condition to be applied to a single field when
     * querying for findings.
     * </p>
     *
     * @param lte <p>
     *            The less-than-equal condition to be applied to a single field
     *            when querying for findings.
     *            </p>
     */
    public void setLte(Double lte) {
        this.lte = lte;
    }

    /**
     * <p>
     * The less-than-equal condition to be applied to a single field when
     * querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lte <p>
     *            The less-than-equal condition to be applied to a single field
     *            when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberFilter withLte(Double lte) {
        this.lte = lte;
        return this;
    }

    /**
     * <p>
     * The equal-to condition to be applied to a single field when querying for
     * findings.
     * </p>
     *
     * @return <p>
     *         The equal-to condition to be applied to a single field when
     *         querying for findings.
     *         </p>
     */
    public Double getEq() {
        return eq;
    }

    /**
     * <p>
     * The equal-to condition to be applied to a single field when querying for
     * findings.
     * </p>
     *
     * @param eq <p>
     *            The equal-to condition to be applied to a single field when
     *            querying for findings.
     *            </p>
     */
    public void setEq(Double eq) {
        this.eq = eq;
    }

    /**
     * <p>
     * The equal-to condition to be applied to a single field when querying for
     * findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eq <p>
     *            The equal-to condition to be applied to a single field when
     *            querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NumberFilter withEq(Double eq) {
        this.eq = eq;
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
        if (getGte() != null)
            sb.append("Gte: " + getGte() + ",");
        if (getLte() != null)
            sb.append("Lte: " + getLte() + ",");
        if (getEq() != null)
            sb.append("Eq: " + getEq());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGte() == null) ? 0 : getGte().hashCode());
        hashCode = prime * hashCode + ((getLte() == null) ? 0 : getLte().hashCode());
        hashCode = prime * hashCode + ((getEq() == null) ? 0 : getEq().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumberFilter == false)
            return false;
        NumberFilter other = (NumberFilter) obj;

        if (other.getGte() == null ^ this.getGte() == null)
            return false;
        if (other.getGte() != null && other.getGte().equals(this.getGte()) == false)
            return false;
        if (other.getLte() == null ^ this.getLte() == null)
            return false;
        if (other.getLte() != null && other.getLte().equals(this.getLte()) == false)
            return false;
        if (other.getEq() == null ^ this.getEq() == null)
            return false;
        if (other.getEq() != null && other.getEq().equals(this.getEq()) == false)
            return false;
        return true;
    }
}
