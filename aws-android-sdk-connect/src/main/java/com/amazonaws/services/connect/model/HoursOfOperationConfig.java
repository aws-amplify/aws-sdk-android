/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about the hours of operation.
 * </p>
 */
public class HoursOfOperationConfig implements Serializable {
    /**
     * <p>
     * The day that the hours of operation applies to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     */
    private String day;

    /**
     * <p>
     * The start time that your contact center opens.
     * </p>
     */
    private HoursOfOperationTimeSlice startTime;

    /**
     * <p>
     * The end time that your contact center closes.
     * </p>
     */
    private HoursOfOperationTimeSlice endTime;

    /**
     * <p>
     * The day that the hours of operation applies to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     *
     * @return <p>
     *         The day that the hours of operation applies to.
     *         </p>
     * @see HoursOfOperationDays
     */
    public String getDay() {
        return day;
    }

    /**
     * <p>
     * The day that the hours of operation applies to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     *
     * @param day <p>
     *            The day that the hours of operation applies to.
     *            </p>
     * @see HoursOfOperationDays
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * <p>
     * The day that the hours of operation applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     *
     * @param day <p>
     *            The day that the hours of operation applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HoursOfOperationDays
     */
    public HoursOfOperationConfig withDay(String day) {
        this.day = day;
        return this;
    }

    /**
     * <p>
     * The day that the hours of operation applies to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     *
     * @param day <p>
     *            The day that the hours of operation applies to.
     *            </p>
     * @see HoursOfOperationDays
     */
    public void setDay(HoursOfOperationDays day) {
        this.day = day.toString();
    }

    /**
     * <p>
     * The day that the hours of operation applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     *
     * @param day <p>
     *            The day that the hours of operation applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HoursOfOperationDays
     */
    public HoursOfOperationConfig withDay(HoursOfOperationDays day) {
        this.day = day.toString();
        return this;
    }

    /**
     * <p>
     * The start time that your contact center opens.
     * </p>
     *
     * @return <p>
     *         The start time that your contact center opens.
     *         </p>
     */
    public HoursOfOperationTimeSlice getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start time that your contact center opens.
     * </p>
     *
     * @param startTime <p>
     *            The start time that your contact center opens.
     *            </p>
     */
    public void setStartTime(HoursOfOperationTimeSlice startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time that your contact center opens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start time that your contact center opens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperationConfig withStartTime(HoursOfOperationTimeSlice startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end time that your contact center closes.
     * </p>
     *
     * @return <p>
     *         The end time that your contact center closes.
     *         </p>
     */
    public HoursOfOperationTimeSlice getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end time that your contact center closes.
     * </p>
     *
     * @param endTime <p>
     *            The end time that your contact center closes.
     *            </p>
     */
    public void setEndTime(HoursOfOperationTimeSlice endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time that your contact center closes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end time that your contact center closes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HoursOfOperationConfig withEndTime(HoursOfOperationTimeSlice endTime) {
        this.endTime = endTime;
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
        if (getDay() != null)
            sb.append("Day: " + getDay() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDay() == null) ? 0 : getDay().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HoursOfOperationConfig == false)
            return false;
        HoursOfOperationConfig other = (HoursOfOperationConfig) obj;

        if (other.getDay() == null ^ this.getDay() == null)
            return false;
        if (other.getDay() != null && other.getDay().equals(this.getDay()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }
}
