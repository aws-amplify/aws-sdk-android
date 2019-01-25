/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

public class Endpoint implements Serializable {
    /**
     * The new value for the address property for this object.
     */
    private String address;

    /**
     * The new value for the cachePeriodInMinutes property for this object.
     */
    private Long cachePeriodInMinutes;

    /**
     * Returns the value of the address property for this object.
     *
     * @return The value of the address property for this object.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of address
     *
     * @param address The new value for the address property for this object.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the value of the address property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param address The new value for the address property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Returns the value of the cachePeriodInMinutes property for this object.
     *
     * @return The value of the cachePeriodInMinutes property for this object.
     */
    public Long getCachePeriodInMinutes() {
        return cachePeriodInMinutes;
    }

    /**
     * Sets the value of cachePeriodInMinutes
     *
     * @param cachePeriodInMinutes The new value for the cachePeriodInMinutes
     *            property for this object.
     */
    public void setCachePeriodInMinutes(Long cachePeriodInMinutes) {
        this.cachePeriodInMinutes = cachePeriodInMinutes;
    }

    /**
     * Sets the value of the cachePeriodInMinutes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cachePeriodInMinutes The new value for the cachePeriodInMinutes
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Endpoint withCachePeriodInMinutes(Long cachePeriodInMinutes) {
        this.cachePeriodInMinutes = cachePeriodInMinutes;
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
        if (getAddress() != null)
            sb.append("Address: " + getAddress() + ",");
        if (getCachePeriodInMinutes() != null)
            sb.append("CachePeriodInMinutes: " + getCachePeriodInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode
                + ((getCachePeriodInMinutes() == null) ? 0 : getCachePeriodInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Endpoint == false)
            return false;
        Endpoint other = (Endpoint) obj;

        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getCachePeriodInMinutes() == null ^ this.getCachePeriodInMinutes() == null)
            return false;
        if (other.getCachePeriodInMinutes() != null
                && other.getCachePeriodInMinutes().equals(this.getCachePeriodInMinutes()) == false)
            return false;
        return true;
    }
}
