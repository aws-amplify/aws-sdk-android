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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the monthly data transfer in and out of your virtual private server
 * (or <i>instance</i>).
 * </p>
 */
public class MonthlyTransfer implements Serializable {
    /**
     * <p>
     * The amount allocated per month (in GB).
     * </p>
     */
    private Integer gbPerMonthAllocated;

    /**
     * <p>
     * The amount allocated per month (in GB).
     * </p>
     *
     * @return <p>
     *         The amount allocated per month (in GB).
     *         </p>
     */
    public Integer getGbPerMonthAllocated() {
        return gbPerMonthAllocated;
    }

    /**
     * <p>
     * The amount allocated per month (in GB).
     * </p>
     *
     * @param gbPerMonthAllocated <p>
     *            The amount allocated per month (in GB).
     *            </p>
     */
    public void setGbPerMonthAllocated(Integer gbPerMonthAllocated) {
        this.gbPerMonthAllocated = gbPerMonthAllocated;
    }

    /**
     * <p>
     * The amount allocated per month (in GB).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gbPerMonthAllocated <p>
     *            The amount allocated per month (in GB).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonthlyTransfer withGbPerMonthAllocated(Integer gbPerMonthAllocated) {
        this.gbPerMonthAllocated = gbPerMonthAllocated;
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
        if (getGbPerMonthAllocated() != null)
            sb.append("gbPerMonthAllocated: " + getGbPerMonthAllocated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGbPerMonthAllocated() == null) ? 0 : getGbPerMonthAllocated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonthlyTransfer == false)
            return false;
        MonthlyTransfer other = (MonthlyTransfer) obj;

        if (other.getGbPerMonthAllocated() == null ^ this.getGbPerMonthAllocated() == null)
            return false;
        if (other.getGbPerMonthAllocated() != null
                && other.getGbPerMonthAllocated().equals(this.getGbPerMonthAllocated()) == false)
            return false;
        return true;
    }
}
