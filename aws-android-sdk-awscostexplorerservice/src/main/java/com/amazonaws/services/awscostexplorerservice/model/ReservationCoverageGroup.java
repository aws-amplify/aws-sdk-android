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
 * A group of reservations that share a set of attributes.
 * </p>
 */
public class ReservationCoverageGroup implements Serializable {
    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * How much instance usage this group of reservations covered.
     * </p>
     */
    private Coverage coverage;

    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     *
     * @return <p>
     *         The attributes for this group of reservations.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     *
     * @param attributes <p>
     *            The attributes for this group of reservations.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attributes for this group of reservations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationCoverageGroup withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * The attributes for this group of reservations.
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
    public ReservationCoverageGroup addAttributesEntry(String key, String value) {
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
    public ReservationCoverageGroup clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * How much instance usage this group of reservations covered.
     * </p>
     *
     * @return <p>
     *         How much instance usage this group of reservations covered.
     *         </p>
     */
    public Coverage getCoverage() {
        return coverage;
    }

    /**
     * <p>
     * How much instance usage this group of reservations covered.
     * </p>
     *
     * @param coverage <p>
     *            How much instance usage this group of reservations covered.
     *            </p>
     */
    public void setCoverage(Coverage coverage) {
        this.coverage = coverage;
    }

    /**
     * <p>
     * How much instance usage this group of reservations covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coverage <p>
     *            How much instance usage this group of reservations covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationCoverageGroup withCoverage(Coverage coverage) {
        this.coverage = coverage;
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
            sb.append("Coverage: " + getCoverage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCoverage() == null) ? 0 : getCoverage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationCoverageGroup == false)
            return false;
        ReservationCoverageGroup other = (ReservationCoverageGroup) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCoverage() == null ^ this.getCoverage() == null)
            return false;
        if (other.getCoverage() != null && other.getCoverage().equals(this.getCoverage()) == false)
            return false;
        return true;
    }
}
