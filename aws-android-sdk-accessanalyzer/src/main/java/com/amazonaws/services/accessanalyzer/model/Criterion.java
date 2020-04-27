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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

/**
 * <p>
 * The criteria to use in the filter that defines the archive rule.
 * </p>
 */
public class Criterion implements Serializable {
    /**
     * <p>
     * A "contains" operator to match for the filter used to create the rule.
     * </p>
     */
    private java.util.List<String> contains;

    /**
     * <p>
     * An "equals" operator to match for the filter used to create the rule.
     * </p>
     */
    private java.util.List<String> eq;

    /**
     * <p>
     * An "exists" operator to match for the filter used to create the rule.
     * </p>
     */
    private Boolean exists;

    /**
     * <p>
     * A "not equals" operator to match for the filter used to create the rule.
     * </p>
     */
    private java.util.List<String> neq;

    /**
     * <p>
     * A "contains" operator to match for the filter used to create the rule.
     * </p>
     *
     * @return <p>
     *         A "contains" operator to match for the filter used to create the
     *         rule.
     *         </p>
     */
    public java.util.List<String> getContains() {
        return contains;
    }

    /**
     * <p>
     * A "contains" operator to match for the filter used to create the rule.
     * </p>
     *
     * @param contains <p>
     *            A "contains" operator to match for the filter used to create
     *            the rule.
     *            </p>
     */
    public void setContains(java.util.Collection<String> contains) {
        if (contains == null) {
            this.contains = null;
            return;
        }

        this.contains = new java.util.ArrayList<String>(contains);
    }

    /**
     * <p>
     * A "contains" operator to match for the filter used to create the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contains <p>
     *            A "contains" operator to match for the filter used to create
     *            the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Criterion withContains(String... contains) {
        if (getContains() == null) {
            this.contains = new java.util.ArrayList<String>(contains.length);
        }
        for (String value : contains) {
            this.contains.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A "contains" operator to match for the filter used to create the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contains <p>
     *            A "contains" operator to match for the filter used to create
     *            the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Criterion withContains(java.util.Collection<String> contains) {
        setContains(contains);
        return this;
    }

    /**
     * <p>
     * An "equals" operator to match for the filter used to create the rule.
     * </p>
     *
     * @return <p>
     *         An "equals" operator to match for the filter used to create the
     *         rule.
     *         </p>
     */
    public java.util.List<String> getEq() {
        return eq;
    }

    /**
     * <p>
     * An "equals" operator to match for the filter used to create the rule.
     * </p>
     *
     * @param eq <p>
     *            An "equals" operator to match for the filter used to create
     *            the rule.
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
     * An "equals" operator to match for the filter used to create the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eq <p>
     *            An "equals" operator to match for the filter used to create
     *            the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Criterion withEq(String... eq) {
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
     * An "equals" operator to match for the filter used to create the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eq <p>
     *            An "equals" operator to match for the filter used to create
     *            the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Criterion withEq(java.util.Collection<String> eq) {
        setEq(eq);
        return this;
    }

    /**
     * <p>
     * An "exists" operator to match for the filter used to create the rule.
     * </p>
     *
     * @return <p>
     *         An "exists" operator to match for the filter used to create the
     *         rule.
     *         </p>
     */
    public Boolean isExists() {
        return exists;
    }

    /**
     * <p>
     * An "exists" operator to match for the filter used to create the rule.
     * </p>
     *
     * @return <p>
     *         An "exists" operator to match for the filter used to create the
     *         rule.
     *         </p>
     */
    public Boolean getExists() {
        return exists;
    }

    /**
     * <p>
     * An "exists" operator to match for the filter used to create the rule.
     * </p>
     *
     * @param exists <p>
     *            An "exists" operator to match for the filter used to create
     *            the rule.
     *            </p>
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    /**
     * <p>
     * An "exists" operator to match for the filter used to create the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exists <p>
     *            An "exists" operator to match for the filter used to create
     *            the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Criterion withExists(Boolean exists) {
        this.exists = exists;
        return this;
    }

    /**
     * <p>
     * A "not equals" operator to match for the filter used to create the rule.
     * </p>
     *
     * @return <p>
     *         A "not equals" operator to match for the filter used to create
     *         the rule.
     *         </p>
     */
    public java.util.List<String> getNeq() {
        return neq;
    }

    /**
     * <p>
     * A "not equals" operator to match for the filter used to create the rule.
     * </p>
     *
     * @param neq <p>
     *            A "not equals" operator to match for the filter used to create
     *            the rule.
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
     * A "not equals" operator to match for the filter used to create the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param neq <p>
     *            A "not equals" operator to match for the filter used to create
     *            the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Criterion withNeq(String... neq) {
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
     * A "not equals" operator to match for the filter used to create the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param neq <p>
     *            A "not equals" operator to match for the filter used to create
     *            the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Criterion withNeq(java.util.Collection<String> neq) {
        setNeq(neq);
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
        if (getContains() != null)
            sb.append("contains: " + getContains() + ",");
        if (getEq() != null)
            sb.append("eq: " + getEq() + ",");
        if (getExists() != null)
            sb.append("exists: " + getExists() + ",");
        if (getNeq() != null)
            sb.append("neq: " + getNeq());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContains() == null) ? 0 : getContains().hashCode());
        hashCode = prime * hashCode + ((getEq() == null) ? 0 : getEq().hashCode());
        hashCode = prime * hashCode + ((getExists() == null) ? 0 : getExists().hashCode());
        hashCode = prime * hashCode + ((getNeq() == null) ? 0 : getNeq().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Criterion == false)
            return false;
        Criterion other = (Criterion) obj;

        if (other.getContains() == null ^ this.getContains() == null)
            return false;
        if (other.getContains() != null && other.getContains().equals(this.getContains()) == false)
            return false;
        if (other.getEq() == null ^ this.getEq() == null)
            return false;
        if (other.getEq() != null && other.getEq().equals(this.getEq()) == false)
            return false;
        if (other.getExists() == null ^ this.getExists() == null)
            return false;
        if (other.getExists() != null && other.getExists().equals(this.getExists()) == false)
            return false;
        if (other.getNeq() == null ^ this.getNeq() == null)
            return false;
        if (other.getNeq() != null && other.getNeq().equals(this.getNeq()) == false)
            return false;
        return true;
    }
}
