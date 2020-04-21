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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the condition.
 * </p>
 */
public class Condition implements Serializable {
    /**
     * <p>
     * Represents the <i>equal</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     */
    private java.util.List<String> eq;

    /**
     * <p>
     * Represents the <i>not equal</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     */
    private java.util.List<String> neq;

    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single
     * field when querying for findings.
     * </p>
     */
    private Integer gt;

    /**
     * <p>
     * Represents a <i>greater than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     */
    private Integer gte;

    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     */
    private Integer lt;

    /**
     * <p>
     * Represents a <i>less than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     */
    private Integer lte;

    /**
     * <p>
     * Represents an <i>equal</i> <b/> condition to be applied to a single field
     * when querying for findings.
     * </p>
     */
    private java.util.List<String> equals;

    /**
     * <p>
     * Represents a <i>not equal</i> <b/> condition to be applied to a single
     * field when querying for findings.
     * </p>
     */
    private java.util.List<String> notEquals;

    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single
     * field when querying for findings.
     * </p>
     */
    private Long greaterThan;

    /**
     * <p>
     * Represents a <i>greater than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     */
    private Long greaterThanOrEqual;

    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     */
    private Long lessThan;

    /**
     * <p>
     * Represents a <i>less than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     */
    private Long lessThanOrEqual;

    /**
     * <p>
     * Represents the <i>equal</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents the <i>equal</i> condition to be applied to a single
     *         field when querying for findings.
     *         </p>
     */
    public java.util.List<String> getEq() {
        return eq;
    }

    /**
     * <p>
     * Represents the <i>equal</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     *
     * @param eq <p>
     *            Represents the <i>equal</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     */
    public void setEq(java.util.Collection<String> eq) {
        if (eq == null) {
            this.eq = null;
            return;
        }

        this.eq = new java.util.ArrayList<String>(eq);
    }

    /**
     * <p>
     * Represents the <i>equal</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eq <p>
     *            Represents the <i>equal</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withEq(String... eq) {
        if (getEq() == null) {
            this.eq = new java.util.ArrayList<String>(eq.length);
        }
        for (String value : eq) {
            this.eq.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the <i>equal</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eq <p>
     *            Represents the <i>equal</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withEq(java.util.Collection<String> eq) {
        setEq(eq);
        return this;
    }

    /**
     * <p>
     * Represents the <i>not equal</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents the <i>not equal</i> condition to be applied to a
     *         single field when querying for findings.
     *         </p>
     */
    public java.util.List<String> getNeq() {
        return neq;
    }

    /**
     * <p>
     * Represents the <i>not equal</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     *
     * @param neq <p>
     *            Represents the <i>not equal</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     */
    public void setNeq(java.util.Collection<String> neq) {
        if (neq == null) {
            this.neq = null;
            return;
        }

        this.neq = new java.util.ArrayList<String>(neq);
    }

    /**
     * <p>
     * Represents the <i>not equal</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param neq <p>
     *            Represents the <i>not equal</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withNeq(String... neq) {
        if (getNeq() == null) {
            this.neq = new java.util.ArrayList<String>(neq.length);
        }
        for (String value : neq) {
            this.neq.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the <i>not equal</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param neq <p>
     *            Represents the <i>not equal</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withNeq(java.util.Collection<String> neq) {
        setNeq(neq);
        return this;
    }

    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single
     * field when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents a <i>greater than</i> condition to be applied to a
     *         single field when querying for findings.
     *         </p>
     */
    public Integer getGt() {
        return gt;
    }

    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single
     * field when querying for findings.
     * </p>
     *
     * @param gt <p>
     *            Represents a <i>greater than</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     */
    public void setGt(Integer gt) {
        this.gt = gt;
    }

    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single
     * field when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gt <p>
     *            Represents a <i>greater than</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withGt(Integer gt) {
        this.gt = gt;
        return this;
    }

    /**
     * <p>
     * Represents a <i>greater than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents a <i>greater than or equal</i> condition to be applied
     *         to a single field when querying for findings.
     *         </p>
     */
    public Integer getGte() {
        return gte;
    }

    /**
     * <p>
     * Represents a <i>greater than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     *
     * @param gte <p>
     *            Represents a <i>greater than or equal</i> condition to be
     *            applied to a single field when querying for findings.
     *            </p>
     */
    public void setGte(Integer gte) {
        this.gte = gte;
    }

    /**
     * <p>
     * Represents a <i>greater than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gte <p>
     *            Represents a <i>greater than or equal</i> condition to be
     *            applied to a single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withGte(Integer gte) {
        this.gte = gte;
        return this;
    }

    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents a <i>less than</i> condition to be applied to a single
     *         field when querying for findings.
     *         </p>
     */
    public Integer getLt() {
        return lt;
    }

    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     *
     * @param lt <p>
     *            Represents a <i>less than</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     */
    public void setLt(Integer lt) {
        this.lt = lt;
    }

    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lt <p>
     *            Represents a <i>less than</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withLt(Integer lt) {
        this.lt = lt;
        return this;
    }

    /**
     * <p>
     * Represents a <i>less than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents a <i>less than or equal</i> condition to be applied to
     *         a single field when querying for findings.
     *         </p>
     */
    public Integer getLte() {
        return lte;
    }

    /**
     * <p>
     * Represents a <i>less than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     *
     * @param lte <p>
     *            Represents a <i>less than or equal</i> condition to be applied
     *            to a single field when querying for findings.
     *            </p>
     */
    public void setLte(Integer lte) {
        this.lte = lte;
    }

    /**
     * <p>
     * Represents a <i>less than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lte <p>
     *            Represents a <i>less than or equal</i> condition to be applied
     *            to a single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withLte(Integer lte) {
        this.lte = lte;
        return this;
    }

    /**
     * <p>
     * Represents an <i>equal</i> <b/> condition to be applied to a single field
     * when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents an <i>equal</i> <b/> condition to be applied to a
     *         single field when querying for findings.
     *         </p>
     */
    public java.util.List<String> getEquals() {
        return equals;
    }

    /**
     * <p>
     * Represents an <i>equal</i> <b/> condition to be applied to a single field
     * when querying for findings.
     * </p>
     *
     * @param equals <p>
     *            Represents an <i>equal</i> <b/> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     */
    public void setEquals(java.util.Collection<String> equals) {
        if (equals == null) {
            this.equals = null;
            return;
        }

        this.equals = new java.util.ArrayList<String>(equals);
    }

    /**
     * <p>
     * Represents an <i>equal</i> <b/> condition to be applied to a single field
     * when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param equals <p>
     *            Represents an <i>equal</i> <b/> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withEquals(String... equals) {
        if (getEquals() == null) {
            this.equals = new java.util.ArrayList<String>(equals.length);
        }
        for (String value : equals) {
            this.equals.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents an <i>equal</i> <b/> condition to be applied to a single field
     * when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param equals <p>
     *            Represents an <i>equal</i> <b/> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withEquals(java.util.Collection<String> equals) {
        setEquals(equals);
        return this;
    }

    /**
     * <p>
     * Represents a <i>not equal</i> <b/> condition to be applied to a single
     * field when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents a <i>not equal</i> <b/> condition to be applied to a
     *         single field when querying for findings.
     *         </p>
     */
    public java.util.List<String> getNotEquals() {
        return notEquals;
    }

    /**
     * <p>
     * Represents a <i>not equal</i> <b/> condition to be applied to a single
     * field when querying for findings.
     * </p>
     *
     * @param notEquals <p>
     *            Represents a <i>not equal</i> <b/> condition to be applied to
     *            a single field when querying for findings.
     *            </p>
     */
    public void setNotEquals(java.util.Collection<String> notEquals) {
        if (notEquals == null) {
            this.notEquals = null;
            return;
        }

        this.notEquals = new java.util.ArrayList<String>(notEquals);
    }

    /**
     * <p>
     * Represents a <i>not equal</i> <b/> condition to be applied to a single
     * field when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notEquals <p>
     *            Represents a <i>not equal</i> <b/> condition to be applied to
     *            a single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withNotEquals(String... notEquals) {
        if (getNotEquals() == null) {
            this.notEquals = new java.util.ArrayList<String>(notEquals.length);
        }
        for (String value : notEquals) {
            this.notEquals.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents a <i>not equal</i> <b/> condition to be applied to a single
     * field when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notEquals <p>
     *            Represents a <i>not equal</i> <b/> condition to be applied to
     *            a single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withNotEquals(java.util.Collection<String> notEquals) {
        setNotEquals(notEquals);
        return this;
    }

    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single
     * field when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents a <i>greater than</i> condition to be applied to a
     *         single field when querying for findings.
     *         </p>
     */
    public Long getGreaterThan() {
        return greaterThan;
    }

    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single
     * field when querying for findings.
     * </p>
     *
     * @param greaterThan <p>
     *            Represents a <i>greater than</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     */
    public void setGreaterThan(Long greaterThan) {
        this.greaterThan = greaterThan;
    }

    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single
     * field when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param greaterThan <p>
     *            Represents a <i>greater than</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withGreaterThan(Long greaterThan) {
        this.greaterThan = greaterThan;
        return this;
    }

    /**
     * <p>
     * Represents a <i>greater than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents a <i>greater than or equal</i> condition to be applied
     *         to a single field when querying for findings.
     *         </p>
     */
    public Long getGreaterThanOrEqual() {
        return greaterThanOrEqual;
    }

    /**
     * <p>
     * Represents a <i>greater than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     *
     * @param greaterThanOrEqual <p>
     *            Represents a <i>greater than or equal</i> condition to be
     *            applied to a single field when querying for findings.
     *            </p>
     */
    public void setGreaterThanOrEqual(Long greaterThanOrEqual) {
        this.greaterThanOrEqual = greaterThanOrEqual;
    }

    /**
     * <p>
     * Represents a <i>greater than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param greaterThanOrEqual <p>
     *            Represents a <i>greater than or equal</i> condition to be
     *            applied to a single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withGreaterThanOrEqual(Long greaterThanOrEqual) {
        this.greaterThanOrEqual = greaterThanOrEqual;
        return this;
    }

    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents a <i>less than</i> condition to be applied to a single
     *         field when querying for findings.
     *         </p>
     */
    public Long getLessThan() {
        return lessThan;
    }

    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     *
     * @param lessThan <p>
     *            Represents a <i>less than</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     */
    public void setLessThan(Long lessThan) {
        this.lessThan = lessThan;
    }

    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field
     * when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lessThan <p>
     *            Represents a <i>less than</i> condition to be applied to a
     *            single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withLessThan(Long lessThan) {
        this.lessThan = lessThan;
        return this;
    }

    /**
     * <p>
     * Represents a <i>less than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     *
     * @return <p>
     *         Represents a <i>less than or equal</i> condition to be applied to
     *         a single field when querying for findings.
     *         </p>
     */
    public Long getLessThanOrEqual() {
        return lessThanOrEqual;
    }

    /**
     * <p>
     * Represents a <i>less than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     *
     * @param lessThanOrEqual <p>
     *            Represents a <i>less than or equal</i> condition to be applied
     *            to a single field when querying for findings.
     *            </p>
     */
    public void setLessThanOrEqual(Long lessThanOrEqual) {
        this.lessThanOrEqual = lessThanOrEqual;
    }

    /**
     * <p>
     * Represents a <i>less than or equal</i> condition to be applied to a
     * single field when querying for findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lessThanOrEqual <p>
     *            Represents a <i>less than or equal</i> condition to be applied
     *            to a single field when querying for findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withLessThanOrEqual(Long lessThanOrEqual) {
        this.lessThanOrEqual = lessThanOrEqual;
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
        if (getEq() != null)
            sb.append("Eq: " + getEq() + ",");
        if (getNeq() != null)
            sb.append("Neq: " + getNeq() + ",");
        if (getGt() != null)
            sb.append("Gt: " + getGt() + ",");
        if (getGte() != null)
            sb.append("Gte: " + getGte() + ",");
        if (getLt() != null)
            sb.append("Lt: " + getLt() + ",");
        if (getLte() != null)
            sb.append("Lte: " + getLte() + ",");
        if (getEquals() != null)
            sb.append("Equals: " + getEquals() + ",");
        if (getNotEquals() != null)
            sb.append("NotEquals: " + getNotEquals() + ",");
        if (getGreaterThan() != null)
            sb.append("GreaterThan: " + getGreaterThan() + ",");
        if (getGreaterThanOrEqual() != null)
            sb.append("GreaterThanOrEqual: " + getGreaterThanOrEqual() + ",");
        if (getLessThan() != null)
            sb.append("LessThan: " + getLessThan() + ",");
        if (getLessThanOrEqual() != null)
            sb.append("LessThanOrEqual: " + getLessThanOrEqual());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEq() == null) ? 0 : getEq().hashCode());
        hashCode = prime * hashCode + ((getNeq() == null) ? 0 : getNeq().hashCode());
        hashCode = prime * hashCode + ((getGt() == null) ? 0 : getGt().hashCode());
        hashCode = prime * hashCode + ((getGte() == null) ? 0 : getGte().hashCode());
        hashCode = prime * hashCode + ((getLt() == null) ? 0 : getLt().hashCode());
        hashCode = prime * hashCode + ((getLte() == null) ? 0 : getLte().hashCode());
        hashCode = prime * hashCode + ((getEquals() == null) ? 0 : getEquals().hashCode());
        hashCode = prime * hashCode + ((getNotEquals() == null) ? 0 : getNotEquals().hashCode());
        hashCode = prime * hashCode
                + ((getGreaterThan() == null) ? 0 : getGreaterThan().hashCode());
        hashCode = prime * hashCode
                + ((getGreaterThanOrEqual() == null) ? 0 : getGreaterThanOrEqual().hashCode());
        hashCode = prime * hashCode + ((getLessThan() == null) ? 0 : getLessThan().hashCode());
        hashCode = prime * hashCode
                + ((getLessThanOrEqual() == null) ? 0 : getLessThanOrEqual().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;

        if (other.getEq() == null ^ this.getEq() == null)
            return false;
        if (other.getEq() != null && other.getEq().equals(this.getEq()) == false)
            return false;
        if (other.getNeq() == null ^ this.getNeq() == null)
            return false;
        if (other.getNeq() != null && other.getNeq().equals(this.getNeq()) == false)
            return false;
        if (other.getGt() == null ^ this.getGt() == null)
            return false;
        if (other.getGt() != null && other.getGt().equals(this.getGt()) == false)
            return false;
        if (other.getGte() == null ^ this.getGte() == null)
            return false;
        if (other.getGte() != null && other.getGte().equals(this.getGte()) == false)
            return false;
        if (other.getLt() == null ^ this.getLt() == null)
            return false;
        if (other.getLt() != null && other.getLt().equals(this.getLt()) == false)
            return false;
        if (other.getLte() == null ^ this.getLte() == null)
            return false;
        if (other.getLte() != null && other.getLte().equals(this.getLte()) == false)
            return false;
        if (other.getEquals() == null ^ this.getEquals() == null)
            return false;
        if (other.getEquals() != null && other.getEquals().equals(this.getEquals()) == false)
            return false;
        if (other.getNotEquals() == null ^ this.getNotEquals() == null)
            return false;
        if (other.getNotEquals() != null
                && other.getNotEquals().equals(this.getNotEquals()) == false)
            return false;
        if (other.getGreaterThan() == null ^ this.getGreaterThan() == null)
            return false;
        if (other.getGreaterThan() != null
                && other.getGreaterThan().equals(this.getGreaterThan()) == false)
            return false;
        if (other.getGreaterThanOrEqual() == null ^ this.getGreaterThanOrEqual() == null)
            return false;
        if (other.getGreaterThanOrEqual() != null
                && other.getGreaterThanOrEqual().equals(this.getGreaterThanOrEqual()) == false)
            return false;
        if (other.getLessThan() == null ^ this.getLessThan() == null)
            return false;
        if (other.getLessThan() != null && other.getLessThan().equals(this.getLessThan()) == false)
            return false;
        if (other.getLessThanOrEqual() == null ^ this.getLessThanOrEqual() == null)
            return false;
        if (other.getLessThanOrEqual() != null
                && other.getLessThanOrEqual().equals(this.getLessThanOrEqual()) == false)
            return false;
        return true;
    }
}
