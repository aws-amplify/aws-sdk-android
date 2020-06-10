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
 * Specifies the operator to use in an attribute-based condition that filters
 * the results of a query for information about S3 buckets.
 * </p>
 */
public class BucketCriteriaAdditionalProperties implements Serializable {
    /**
     * <p>
     * An equal to condition to apply to a specified attribute value for
     * buckets.
     * </p>
     */
    private java.util.List<String> eq;

    /**
     * <p>
     * A greater than condition to apply to a specified attribute value for
     * buckets.
     * </p>
     */
    private Long gt;

    /**
     * <p>
     * A greater than or equal to condition to apply to a specified attribute
     * value for buckets.
     * </p>
     */
    private Long gte;

    /**
     * <p>
     * A less than condition to apply to a specified attribute value for
     * buckets.
     * </p>
     */
    private Long lt;

    /**
     * <p>
     * A less than or equal to condition to apply to a specified attribute value
     * for buckets.
     * </p>
     */
    private Long lte;

    /**
     * <p>
     * A not equal to condition to apply to a specified attribute value for
     * buckets.
     * </p>
     */
    private java.util.List<String> neq;

    /**
     * <p>
     * The prefix of the buckets to include in the results.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * An equal to condition to apply to a specified attribute value for
     * buckets.
     * </p>
     *
     * @return <p>
     *         An equal to condition to apply to a specified attribute value for
     *         buckets.
     *         </p>
     */
    public java.util.List<String> getEq() {
        return eq;
    }

    /**
     * <p>
     * An equal to condition to apply to a specified attribute value for
     * buckets.
     * </p>
     *
     * @param eq <p>
     *            An equal to condition to apply to a specified attribute value
     *            for buckets.
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
     * An equal to condition to apply to a specified attribute value for
     * buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eq <p>
     *            An equal to condition to apply to a specified attribute value
     *            for buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCriteriaAdditionalProperties withEq(String... eq) {
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
     * An equal to condition to apply to a specified attribute value for
     * buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eq <p>
     *            An equal to condition to apply to a specified attribute value
     *            for buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCriteriaAdditionalProperties withEq(java.util.Collection<String> eq) {
        setEq(eq);
        return this;
    }

    /**
     * <p>
     * A greater than condition to apply to a specified attribute value for
     * buckets.
     * </p>
     *
     * @return <p>
     *         A greater than condition to apply to a specified attribute value
     *         for buckets.
     *         </p>
     */
    public Long getGt() {
        return gt;
    }

    /**
     * <p>
     * A greater than condition to apply to a specified attribute value for
     * buckets.
     * </p>
     *
     * @param gt <p>
     *            A greater than condition to apply to a specified attribute
     *            value for buckets.
     *            </p>
     */
    public void setGt(Long gt) {
        this.gt = gt;
    }

    /**
     * <p>
     * A greater than condition to apply to a specified attribute value for
     * buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gt <p>
     *            A greater than condition to apply to a specified attribute
     *            value for buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCriteriaAdditionalProperties withGt(Long gt) {
        this.gt = gt;
        return this;
    }

    /**
     * <p>
     * A greater than or equal to condition to apply to a specified attribute
     * value for buckets.
     * </p>
     *
     * @return <p>
     *         A greater than or equal to condition to apply to a specified
     *         attribute value for buckets.
     *         </p>
     */
    public Long getGte() {
        return gte;
    }

    /**
     * <p>
     * A greater than or equal to condition to apply to a specified attribute
     * value for buckets.
     * </p>
     *
     * @param gte <p>
     *            A greater than or equal to condition to apply to a specified
     *            attribute value for buckets.
     *            </p>
     */
    public void setGte(Long gte) {
        this.gte = gte;
    }

    /**
     * <p>
     * A greater than or equal to condition to apply to a specified attribute
     * value for buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gte <p>
     *            A greater than or equal to condition to apply to a specified
     *            attribute value for buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCriteriaAdditionalProperties withGte(Long gte) {
        this.gte = gte;
        return this;
    }

    /**
     * <p>
     * A less than condition to apply to a specified attribute value for
     * buckets.
     * </p>
     *
     * @return <p>
     *         A less than condition to apply to a specified attribute value for
     *         buckets.
     *         </p>
     */
    public Long getLt() {
        return lt;
    }

    /**
     * <p>
     * A less than condition to apply to a specified attribute value for
     * buckets.
     * </p>
     *
     * @param lt <p>
     *            A less than condition to apply to a specified attribute value
     *            for buckets.
     *            </p>
     */
    public void setLt(Long lt) {
        this.lt = lt;
    }

    /**
     * <p>
     * A less than condition to apply to a specified attribute value for
     * buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lt <p>
     *            A less than condition to apply to a specified attribute value
     *            for buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCriteriaAdditionalProperties withLt(Long lt) {
        this.lt = lt;
        return this;
    }

    /**
     * <p>
     * A less than or equal to condition to apply to a specified attribute value
     * for buckets.
     * </p>
     *
     * @return <p>
     *         A less than or equal to condition to apply to a specified
     *         attribute value for buckets.
     *         </p>
     */
    public Long getLte() {
        return lte;
    }

    /**
     * <p>
     * A less than or equal to condition to apply to a specified attribute value
     * for buckets.
     * </p>
     *
     * @param lte <p>
     *            A less than or equal to condition to apply to a specified
     *            attribute value for buckets.
     *            </p>
     */
    public void setLte(Long lte) {
        this.lte = lte;
    }

    /**
     * <p>
     * A less than or equal to condition to apply to a specified attribute value
     * for buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lte <p>
     *            A less than or equal to condition to apply to a specified
     *            attribute value for buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCriteriaAdditionalProperties withLte(Long lte) {
        this.lte = lte;
        return this;
    }

    /**
     * <p>
     * A not equal to condition to apply to a specified attribute value for
     * buckets.
     * </p>
     *
     * @return <p>
     *         A not equal to condition to apply to a specified attribute value
     *         for buckets.
     *         </p>
     */
    public java.util.List<String> getNeq() {
        return neq;
    }

    /**
     * <p>
     * A not equal to condition to apply to a specified attribute value for
     * buckets.
     * </p>
     *
     * @param neq <p>
     *            A not equal to condition to apply to a specified attribute
     *            value for buckets.
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
     * A not equal to condition to apply to a specified attribute value for
     * buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param neq <p>
     *            A not equal to condition to apply to a specified attribute
     *            value for buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCriteriaAdditionalProperties withNeq(String... neq) {
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
     * A not equal to condition to apply to a specified attribute value for
     * buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param neq <p>
     *            A not equal to condition to apply to a specified attribute
     *            value for buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCriteriaAdditionalProperties withNeq(java.util.Collection<String> neq) {
        setNeq(neq);
        return this;
    }

    /**
     * <p>
     * The prefix of the buckets to include in the results.
     * </p>
     *
     * @return <p>
     *         The prefix of the buckets to include in the results.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The prefix of the buckets to include in the results.
     * </p>
     *
     * @param prefix <p>
     *            The prefix of the buckets to include in the results.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix of the buckets to include in the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            The prefix of the buckets to include in the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketCriteriaAdditionalProperties withPrefix(String prefix) {
        this.prefix = prefix;
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
            sb.append("eq: " + getEq() + ",");
        if (getGt() != null)
            sb.append("gt: " + getGt() + ",");
        if (getGte() != null)
            sb.append("gte: " + getGte() + ",");
        if (getLt() != null)
            sb.append("lt: " + getLt() + ",");
        if (getLte() != null)
            sb.append("lte: " + getLte() + ",");
        if (getNeq() != null)
            sb.append("neq: " + getNeq() + ",");
        if (getPrefix() != null)
            sb.append("prefix: " + getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEq() == null) ? 0 : getEq().hashCode());
        hashCode = prime * hashCode + ((getGt() == null) ? 0 : getGt().hashCode());
        hashCode = prime * hashCode + ((getGte() == null) ? 0 : getGte().hashCode());
        hashCode = prime * hashCode + ((getLt() == null) ? 0 : getLt().hashCode());
        hashCode = prime * hashCode + ((getLte() == null) ? 0 : getLte().hashCode());
        hashCode = prime * hashCode + ((getNeq() == null) ? 0 : getNeq().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketCriteriaAdditionalProperties == false)
            return false;
        BucketCriteriaAdditionalProperties other = (BucketCriteriaAdditionalProperties) obj;

        if (other.getEq() == null ^ this.getEq() == null)
            return false;
        if (other.getEq() != null && other.getEq().equals(this.getEq()) == false)
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
        if (other.getNeq() == null ^ this.getNeq() == null)
            return false;
        if (other.getNeq() != null && other.getNeq().equals(this.getNeq()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }
}
