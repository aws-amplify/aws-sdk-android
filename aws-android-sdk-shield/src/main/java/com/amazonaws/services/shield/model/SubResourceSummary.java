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
 * The attack information for the specified SubResource.
 * </p>
 */
public class SubResourceSummary implements Serializable {
    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP, URL
     */
    private String type;

    /**
     * <p>
     * The unique identifier (ID) of the <code>SubResource</code>.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The list of attack types and associated counters.
     * </p>
     */
    private java.util.List<SummarizedAttackVector> attackVectors;

    /**
     * <p>
     * The counters that describe the details of the attack.
     * </p>
     */
    private java.util.List<SummarizedCounter> counters;

    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP, URL
     *
     * @return <p>
     *         The <code>SubResource</code> type.
     *         </p>
     * @see SubResourceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP, URL
     *
     * @param type <p>
     *            The <code>SubResource</code> type.
     *            </p>
     * @see SubResourceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP, URL
     *
     * @param type <p>
     *            The <code>SubResource</code> type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SubResourceType
     */
    public SubResourceSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP, URL
     *
     * @param type <p>
     *            The <code>SubResource</code> type.
     *            </p>
     * @see SubResourceType
     */
    public void setType(SubResourceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The <code>SubResource</code> type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP, URL
     *
     * @param type <p>
     *            The <code>SubResource</code> type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SubResourceType
     */
    public SubResourceSummary withType(SubResourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) of the <code>SubResource</code>.
     * </p>
     *
     * @return <p>
     *         The unique identifier (ID) of the <code>SubResource</code>.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the <code>SubResource</code>.
     * </p>
     *
     * @param id <p>
     *            The unique identifier (ID) of the <code>SubResource</code>.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the <code>SubResource</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier (ID) of the <code>SubResource</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubResourceSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The list of attack types and associated counters.
     * </p>
     *
     * @return <p>
     *         The list of attack types and associated counters.
     *         </p>
     */
    public java.util.List<SummarizedAttackVector> getAttackVectors() {
        return attackVectors;
    }

    /**
     * <p>
     * The list of attack types and associated counters.
     * </p>
     *
     * @param attackVectors <p>
     *            The list of attack types and associated counters.
     *            </p>
     */
    public void setAttackVectors(java.util.Collection<SummarizedAttackVector> attackVectors) {
        if (attackVectors == null) {
            this.attackVectors = null;
            return;
        }

        this.attackVectors = new java.util.ArrayList<SummarizedAttackVector>(attackVectors);
    }

    /**
     * <p>
     * The list of attack types and associated counters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attackVectors <p>
     *            The list of attack types and associated counters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubResourceSummary withAttackVectors(SummarizedAttackVector... attackVectors) {
        if (getAttackVectors() == null) {
            this.attackVectors = new java.util.ArrayList<SummarizedAttackVector>(
                    attackVectors.length);
        }
        for (SummarizedAttackVector value : attackVectors) {
            this.attackVectors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of attack types and associated counters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attackVectors <p>
     *            The list of attack types and associated counters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubResourceSummary withAttackVectors(
            java.util.Collection<SummarizedAttackVector> attackVectors) {
        setAttackVectors(attackVectors);
        return this;
    }

    /**
     * <p>
     * The counters that describe the details of the attack.
     * </p>
     *
     * @return <p>
     *         The counters that describe the details of the attack.
     *         </p>
     */
    public java.util.List<SummarizedCounter> getCounters() {
        return counters;
    }

    /**
     * <p>
     * The counters that describe the details of the attack.
     * </p>
     *
     * @param counters <p>
     *            The counters that describe the details of the attack.
     *            </p>
     */
    public void setCounters(java.util.Collection<SummarizedCounter> counters) {
        if (counters == null) {
            this.counters = null;
            return;
        }

        this.counters = new java.util.ArrayList<SummarizedCounter>(counters);
    }

    /**
     * <p>
     * The counters that describe the details of the attack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param counters <p>
     *            The counters that describe the details of the attack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubResourceSummary withCounters(SummarizedCounter... counters) {
        if (getCounters() == null) {
            this.counters = new java.util.ArrayList<SummarizedCounter>(counters.length);
        }
        for (SummarizedCounter value : counters) {
            this.counters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The counters that describe the details of the attack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param counters <p>
     *            The counters that describe the details of the attack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubResourceSummary withCounters(java.util.Collection<SummarizedCounter> counters) {
        setCounters(counters);
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getAttackVectors() != null)
            sb.append("AttackVectors: " + getAttackVectors() + ",");
        if (getCounters() != null)
            sb.append("Counters: " + getCounters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getAttackVectors() == null) ? 0 : getAttackVectors().hashCode());
        hashCode = prime * hashCode + ((getCounters() == null) ? 0 : getCounters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubResourceSummary == false)
            return false;
        SubResourceSummary other = (SubResourceSummary) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAttackVectors() == null ^ this.getAttackVectors() == null)
            return false;
        if (other.getAttackVectors() != null
                && other.getAttackVectors().equals(this.getAttackVectors()) == false)
            return false;
        if (other.getCounters() == null ^ this.getCounters() == null)
            return false;
        if (other.getCounters() != null && other.getCounters().equals(this.getCounters()) == false)
            return false;
        return true;
    }
}
