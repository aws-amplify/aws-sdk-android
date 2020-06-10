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
 * Reserved for future use.
 * </p>
 */
public class WeeklySchedule implements Serializable {
    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are:
     * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     */
    private String dayOfWeek;

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are:
     * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     *
     * @return <p>
     *         Run the job once a week, on a specific day of the week. Valid
     *         values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
     *         SATURDAY, and SUNDAY.
     *         </p>
     * @see DayOfWeek
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are:
     * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     *
     * @param dayOfWeek <p>
     *            Run the job once a week, on a specific day of the week. Valid
     *            values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
     *            SATURDAY, and SUNDAY.
     *            </p>
     * @see DayOfWeek
     */
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are:
     * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     *
     * @param dayOfWeek <p>
     *            Run the job once a week, on a specific day of the week. Valid
     *            values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
     *            SATURDAY, and SUNDAY.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DayOfWeek
     */
    public WeeklySchedule withDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are:
     * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     *
     * @param dayOfWeek <p>
     *            Run the job once a week, on a specific day of the week. Valid
     *            values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
     *            SATURDAY, and SUNDAY.
     *            </p>
     * @see DayOfWeek
     */
    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are:
     * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY
     *
     * @param dayOfWeek <p>
     *            Run the job once a week, on a specific day of the week. Valid
     *            values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
     *            SATURDAY, and SUNDAY.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DayOfWeek
     */
    public WeeklySchedule withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
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
        if (getDayOfWeek() != null)
            sb.append("dayOfWeek: " + getDayOfWeek());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WeeklySchedule == false)
            return false;
        WeeklySchedule other = (WeeklySchedule) obj;

        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null
                && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        return true;
    }
}
