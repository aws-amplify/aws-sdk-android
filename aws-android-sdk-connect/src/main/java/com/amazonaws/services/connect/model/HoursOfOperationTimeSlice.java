/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The start time or end time for an hours of operation.
 * </p>
 */
public class HoursOfOperationTimeSlice implements Serializable {
    /**
     * <p>
     * The hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     */
    private Integer hours;

    /**
     * <p>
     * The minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     */
    private Integer minutes;

    /**
     * <p>
     * The hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return <p>
     *         The hours.
     *         </p>
     */
    public Integer getHours() {
        return hours;
    }

    /**
     * <p>
     * The hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param hours <p>
     *            The hours.
     *            </p>
     */
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    /**
     * <p>
     * The hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param hours <p>
     *            The hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperationTimeSlice withHours(Integer hours) {
        this.hours = hours;
        return this;
    }

    /**
     * <p>
     * The minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @return <p>
     *         The minutes.
     *         </p>
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * <p>
     * The minutes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @param minutes <p>
     *            The minutes.
     *            </p>
     */
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * <p>
     * The minutes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @param minutes <p>
     *            The minutes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperationTimeSlice withMinutes(Integer minutes) {
        this.minutes = minutes;
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
        if (getHours() != null)
            sb.append("Hours: " + getHours() + ",");
        if (getMinutes() != null)
            sb.append("Minutes: " + getMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHours() == null) ? 0 : getHours().hashCode());
        hashCode = prime * hashCode + ((getMinutes() == null) ? 0 : getMinutes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HoursOfOperationTimeSlice == false)
            return false;
        HoursOfOperationTimeSlice other = (HoursOfOperationTimeSlice) obj;

        if (other.getHours() == null ^ this.getHours() == null)
            return false;
        if (other.getHours() != null && other.getHours().equals(this.getHours()) == false)
            return false;
        if (other.getMinutes() == null ^ this.getMinutes() == null)
            return false;
        if (other.getMinutes() != null && other.getMinutes().equals(this.getMinutes()) == false)
            return false;
        return true;
    }
}
