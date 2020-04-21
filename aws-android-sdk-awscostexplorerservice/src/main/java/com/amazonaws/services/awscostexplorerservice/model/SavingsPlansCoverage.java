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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The amount of Savings Plans eligible usage that is covered by Savings Plans.
 * All calculations consider the On-Demand equivalent of your Savings Plans
 * usage.
 * </p>
 */
public class SavingsPlansCoverage implements Serializable {
    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The amount of Savings Plans eligible usage that the Savings Plans
     * covered.
     * </p>
     */
    private SavingsPlansCoverageData coverage;

    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     *
     * @return <p>
     *         The attribute that applies to a specific <code>Dimension</code>.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     *
     * @param attributes <p>
     *            The attribute that applies to a specific
     *            <code>Dimension</code>.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attribute that applies to a specific
     *            <code>Dimension</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansCoverage withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * The attribute that applies to a specific <code>Dimension</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansCoverage addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SavingsPlansCoverage clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The amount of Savings Plans eligible usage that the Savings Plans
     * covered.
     * </p>
     *
     * @return <p>
     *         The amount of Savings Plans eligible usage that the Savings Plans
     *         covered.
     *         </p>
     */
    public SavingsPlansCoverageData getCoverage() {
        return coverage;
    }

    /**
     * <p>
     * The amount of Savings Plans eligible usage that the Savings Plans
     * covered.
     * </p>
     *
     * @param coverage <p>
     *            The amount of Savings Plans eligible usage that the Savings
     *            Plans covered.
     *            </p>
     */
    public void setCoverage(SavingsPlansCoverageData coverage) {
        this.coverage = coverage;
    }

    /**
     * <p>
     * The amount of Savings Plans eligible usage that the Savings Plans
     * covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coverage <p>
     *            The amount of Savings Plans eligible usage that the Savings
     *            Plans covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansCoverage withCoverage(SavingsPlansCoverageData coverage) {
        this.coverage = coverage;
        return this;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     *
     * @return <p>
     *         The time period that you want the usage and costs for.
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     *
     * @param timePeriod <p>
     *            The time period that you want the usage and costs for.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The time period that you want the usage and costs for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            The time period that you want the usage and costs for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansCoverage withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
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
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getCoverage() != null)
            sb.append("Coverage: " + getCoverage() + ",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: " + getTimePeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCoverage() == null) ? 0 : getCoverage().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansCoverage == false)
            return false;
        SavingsPlansCoverage other = (SavingsPlansCoverage) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCoverage() == null ^ this.getCoverage() == null)
            return false;
        if (other.getCoverage() != null && other.getCoverage().equals(this.getCoverage()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null
                && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        return true;
    }
}
