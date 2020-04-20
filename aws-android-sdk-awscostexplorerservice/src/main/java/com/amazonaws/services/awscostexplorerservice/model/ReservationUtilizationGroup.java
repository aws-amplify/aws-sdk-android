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
public class ReservationUtilizationGroup implements Serializable {
    /**
     * <p>
     * The key for a specific reservation attribute.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The value of a specific reservation attribute.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The attributes for this group of reservations.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * How much you used this group of reservations.
     * </p>
     */
    private ReservationAggregates utilization;

    /**
     * <p>
     * The key for a specific reservation attribute.
     * </p>
     *
     * @return <p>
     *         The key for a specific reservation attribute.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key for a specific reservation attribute.
     * </p>
     *
     * @param key <p>
     *            The key for a specific reservation attribute.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for a specific reservation attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The key for a specific reservation attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationUtilizationGroup withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The value of a specific reservation attribute.
     * </p>
     *
     * @return <p>
     *         The value of a specific reservation attribute.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of a specific reservation attribute.
     * </p>
     *
     * @param value <p>
     *            The value of a specific reservation attribute.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a specific reservation attribute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of a specific reservation attribute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationUtilizationGroup withValue(String value) {
        this.value = value;
        return this;
    }

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
    public ReservationUtilizationGroup withAttributes(java.util.Map<String, String> attributes) {
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
    public ReservationUtilizationGroup addAttributesEntry(String key, String value) {
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
    public ReservationUtilizationGroup clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * How much you used this group of reservations.
     * </p>
     *
     * @return <p>
     *         How much you used this group of reservations.
     *         </p>
     */
    public ReservationAggregates getUtilization() {
        return utilization;
    }

    /**
     * <p>
     * How much you used this group of reservations.
     * </p>
     *
     * @param utilization <p>
     *            How much you used this group of reservations.
     *            </p>
     */
    public void setUtilization(ReservationAggregates utilization) {
        this.utilization = utilization;
    }

    /**
     * <p>
     * How much you used this group of reservations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param utilization <p>
     *            How much you used this group of reservations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationUtilizationGroup withUtilization(ReservationAggregates utilization) {
        this.utilization = utilization;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getUtilization() != null)
            sb.append("Utilization: " + getUtilization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getUtilization() == null) ? 0 : getUtilization().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationUtilizationGroup == false)
            return false;
        ReservationUtilizationGroup other = (ReservationUtilizationGroup) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getUtilization() == null ^ this.getUtilization() == null)
            return false;
        if (other.getUtilization() != null
                && other.getUtilization().equals(this.getUtilization()) == false)
            return false;
        return true;
    }
}
