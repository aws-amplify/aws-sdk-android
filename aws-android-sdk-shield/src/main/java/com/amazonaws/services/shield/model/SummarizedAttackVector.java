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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of information about the attack.
 * </p>
 */
public class SummarizedAttackVector implements Serializable {
    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     */
    private String vectorType;

    /**
     * <p>
     * The list of counters that describe the details of the attack.
     * </p>
     */
    private java.util.List<SummarizedCounter> vectorCounters;

    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     *
     * @return <p>
     *         The attack type, for example, SNMP reflection or SYN flood.
     *         </p>
     */
    public String getVectorType() {
        return vectorType;
    }

    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     *
     * @param vectorType <p>
     *            The attack type, for example, SNMP reflection or SYN flood.
     *            </p>
     */
    public void setVectorType(String vectorType) {
        this.vectorType = vectorType;
    }

    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vectorType <p>
     *            The attack type, for example, SNMP reflection or SYN flood.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SummarizedAttackVector withVectorType(String vectorType) {
        this.vectorType = vectorType;
        return this;
    }

    /**
     * <p>
     * The list of counters that describe the details of the attack.
     * </p>
     *
     * @return <p>
     *         The list of counters that describe the details of the attack.
     *         </p>
     */
    public java.util.List<SummarizedCounter> getVectorCounters() {
        return vectorCounters;
    }

    /**
     * <p>
     * The list of counters that describe the details of the attack.
     * </p>
     *
     * @param vectorCounters <p>
     *            The list of counters that describe the details of the attack.
     *            </p>
     */
    public void setVectorCounters(java.util.Collection<SummarizedCounter> vectorCounters) {
        if (vectorCounters == null) {
            this.vectorCounters = null;
            return;
        }

        this.vectorCounters = new java.util.ArrayList<SummarizedCounter>(vectorCounters);
    }

    /**
     * <p>
     * The list of counters that describe the details of the attack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vectorCounters <p>
     *            The list of counters that describe the details of the attack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SummarizedAttackVector withVectorCounters(SummarizedCounter... vectorCounters) {
        if (getVectorCounters() == null) {
            this.vectorCounters = new java.util.ArrayList<SummarizedCounter>(vectorCounters.length);
        }
        for (SummarizedCounter value : vectorCounters) {
            this.vectorCounters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of counters that describe the details of the attack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vectorCounters <p>
     *            The list of counters that describe the details of the attack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SummarizedAttackVector withVectorCounters(
            java.util.Collection<SummarizedCounter> vectorCounters) {
        setVectorCounters(vectorCounters);
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
        if (getVectorType() != null)
            sb.append("VectorType: " + getVectorType() + ",");
        if (getVectorCounters() != null)
            sb.append("VectorCounters: " + getVectorCounters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVectorType() == null) ? 0 : getVectorType().hashCode());
        hashCode = prime * hashCode
                + ((getVectorCounters() == null) ? 0 : getVectorCounters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SummarizedAttackVector == false)
            return false;
        SummarizedAttackVector other = (SummarizedAttackVector) obj;

        if (other.getVectorType() == null ^ this.getVectorType() == null)
            return false;
        if (other.getVectorType() != null
                && other.getVectorType().equals(this.getVectorType()) == false)
            return false;
        if (other.getVectorCounters() == null ^ this.getVectorCounters() == null)
            return false;
        if (other.getVectorCounters() != null
                && other.getVectorCounters().equals(this.getVectorCounters()) == false)
            return false;
        return true;
    }
}
