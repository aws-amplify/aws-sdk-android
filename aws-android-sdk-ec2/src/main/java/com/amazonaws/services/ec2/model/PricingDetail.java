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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Reserved Instance offering.
 * </p>
 */
public class PricingDetail implements Serializable {
    /**
     * <p>
     * The number of reservations available for the price.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The price per instance.
     * </p>
     */
    private Double price;

    /**
     * <p>
     * The number of reservations available for the price.
     * </p>
     *
     * @return <p>
     *         The number of reservations available for the price.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of reservations available for the price.
     * </p>
     *
     * @param count <p>
     *            The number of reservations available for the price.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of reservations available for the price.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The number of reservations available for the price.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PricingDetail withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The price per instance.
     * </p>
     *
     * @return <p>
     *         The price per instance.
     *         </p>
     */
    public Double getPrice() {
        return price;
    }

    /**
     * <p>
     * The price per instance.
     * </p>
     *
     * @param price <p>
     *            The price per instance.
     *            </p>
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * <p>
     * The price per instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param price <p>
     *            The price per instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PricingDetail withPrice(Double price) {
        this.price = price;
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
        if (getCount() != null)
            sb.append("Count: " + getCount() + ",");
        if (getPrice() != null)
            sb.append("Price: " + getPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PricingDetail == false)
            return false;
        PricingDetail other = (PricingDetail) obj;

        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        return true;
    }
}
