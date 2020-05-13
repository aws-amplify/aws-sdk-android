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
 * Run the job once a month, on a specific day of the month. This value can be
 * an integer from 1 through 30.
 * </p>
 */
public class MonthlySchedule implements Serializable {
    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can
     * be an integer from 1 through 30.
     * </p>
     */
    private Integer dayOfMonth;

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can
     * be an integer from 1 through 30.
     * </p>
     *
     * @return <p>
     *         Run the job once a month, on a specific day of the month. This
     *         value can be an integer from 1 through 30.
     *         </p>
     */
    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can
     * be an integer from 1 through 30.
     * </p>
     *
     * @param dayOfMonth <p>
     *            Run the job once a month, on a specific day of the month. This
     *            value can be an integer from 1 through 30.
     *            </p>
     */
    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can
     * be an integer from 1 through 30.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dayOfMonth <p>
     *            Run the job once a month, on a specific day of the month. This
     *            value can be an integer from 1 through 30.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonthlySchedule withDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
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
        if (getDayOfMonth() != null)
            sb.append("dayOfMonth: " + getDayOfMonth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonthlySchedule == false)
            return false;
        MonthlySchedule other = (MonthlySchedule) obj;

        if (other.getDayOfMonth() == null ^ this.getDayOfMonth() == null)
            return false;
        if (other.getDayOfMonth() != null
                && other.getDayOfMonth().equals(this.getDayOfMonth()) == false)
            return false;
        return true;
    }
}
