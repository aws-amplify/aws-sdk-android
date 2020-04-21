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
 * Contains information about finding statistics.
 * </p>
 */
public class FindingStatistics implements Serializable {
    /**
     * <p>
     * Represents a map of severity to count statistics for a set of findings.
     * </p>
     */
    private java.util.Map<String, Integer> countBySeverity;

    /**
     * <p>
     * Represents a map of severity to count statistics for a set of findings.
     * </p>
     *
     * @return <p>
     *         Represents a map of severity to count statistics for a set of
     *         findings.
     *         </p>
     */
    public java.util.Map<String, Integer> getCountBySeverity() {
        return countBySeverity;
    }

    /**
     * <p>
     * Represents a map of severity to count statistics for a set of findings.
     * </p>
     *
     * @param countBySeverity <p>
     *            Represents a map of severity to count statistics for a set of
     *            findings.
     *            </p>
     */
    public void setCountBySeverity(java.util.Map<String, Integer> countBySeverity) {
        this.countBySeverity = countBySeverity;
    }

    /**
     * <p>
     * Represents a map of severity to count statistics for a set of findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param countBySeverity <p>
     *            Represents a map of severity to count statistics for a set of
     *            findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingStatistics withCountBySeverity(java.util.Map<String, Integer> countBySeverity) {
        this.countBySeverity = countBySeverity;
        return this;
    }

    /**
     * <p>
     * Represents a map of severity to count statistics for a set of findings.
     * </p>
     * <p>
     * The method adds a new key-value pair into CountBySeverity parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into CountBySeverity.
     * @param value The corresponding value of the entry to be added into
     *            CountBySeverity.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingStatistics addCountBySeverityEntry(String key, Integer value) {
        if (null == this.countBySeverity) {
            this.countBySeverity = new java.util.HashMap<String, Integer>();
        }
        if (this.countBySeverity.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.countBySeverity.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CountBySeverity.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public FindingStatistics clearCountBySeverityEntries() {
        this.countBySeverity = null;
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
        if (getCountBySeverity() != null)
            sb.append("CountBySeverity: " + getCountBySeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCountBySeverity() == null) ? 0 : getCountBySeverity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingStatistics == false)
            return false;
        FindingStatistics other = (FindingStatistics) obj;

        if (other.getCountBySeverity() == null ^ this.getCountBySeverity() == null)
            return false;
        if (other.getCountBySeverity() != null
                && other.getCountBySeverity().equals(this.getCountBySeverity()) == false)
            return false;
        return true;
    }
}
