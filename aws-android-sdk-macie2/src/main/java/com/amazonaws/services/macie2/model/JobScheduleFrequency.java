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
 * Specifies the recurrence pattern for running a classification job.
 * </p>
 */
public class JobScheduleFrequency implements Serializable {
    /**
     * <p>
     * Run the job once a day, every day. If specified, this is an empty object.
     * </p>
     */
    private DailySchedule dailySchedule;

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can
     * be an integer from 1 through 30.
     * </p>
     */
    private MonthlySchedule monthlySchedule;

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are:
     * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     */
    private WeeklySchedule weeklySchedule;

    /**
     * <p>
     * Run the job once a day, every day. If specified, this is an empty object.
     * </p>
     *
     * @return <p>
     *         Run the job once a day, every day. If specified, this is an empty
     *         object.
     *         </p>
     */
    public DailySchedule getDailySchedule() {
        return dailySchedule;
    }

    /**
     * <p>
     * Run the job once a day, every day. If specified, this is an empty object.
     * </p>
     *
     * @param dailySchedule <p>
     *            Run the job once a day, every day. If specified, this is an
     *            empty object.
     *            </p>
     */
    public void setDailySchedule(DailySchedule dailySchedule) {
        this.dailySchedule = dailySchedule;
    }

    /**
     * <p>
     * Run the job once a day, every day. If specified, this is an empty object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dailySchedule <p>
     *            Run the job once a day, every day. If specified, this is an
     *            empty object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobScheduleFrequency withDailySchedule(DailySchedule dailySchedule) {
        this.dailySchedule = dailySchedule;
        return this;
    }

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
    public MonthlySchedule getMonthlySchedule() {
        return monthlySchedule;
    }

    /**
     * <p>
     * Run the job once a month, on a specific day of the month. This value can
     * be an integer from 1 through 30.
     * </p>
     *
     * @param monthlySchedule <p>
     *            Run the job once a month, on a specific day of the month. This
     *            value can be an integer from 1 through 30.
     *            </p>
     */
    public void setMonthlySchedule(MonthlySchedule monthlySchedule) {
        this.monthlySchedule = monthlySchedule;
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
     * @param monthlySchedule <p>
     *            Run the job once a month, on a specific day of the month. This
     *            value can be an integer from 1 through 30.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobScheduleFrequency withMonthlySchedule(MonthlySchedule monthlySchedule) {
        this.monthlySchedule = monthlySchedule;
        return this;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are:
     * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     *
     * @return <p>
     *         Run the job once a week, on a specific day of the week. Valid
     *         values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
     *         SATURDAY, and SUNDAY.
     *         </p>
     */
    public WeeklySchedule getWeeklySchedule() {
        return weeklySchedule;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are:
     * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     *
     * @param weeklySchedule <p>
     *            Run the job once a week, on a specific day of the week. Valid
     *            values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
     *            SATURDAY, and SUNDAY.
     *            </p>
     */
    public void setWeeklySchedule(WeeklySchedule weeklySchedule) {
        this.weeklySchedule = weeklySchedule;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are:
     * MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param weeklySchedule <p>
     *            Run the job once a week, on a specific day of the week. Valid
     *            values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
     *            SATURDAY, and SUNDAY.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobScheduleFrequency withWeeklySchedule(WeeklySchedule weeklySchedule) {
        this.weeklySchedule = weeklySchedule;
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
        if (getDailySchedule() != null)
            sb.append("dailySchedule: " + getDailySchedule() + ",");
        if (getMonthlySchedule() != null)
            sb.append("monthlySchedule: " + getMonthlySchedule() + ",");
        if (getWeeklySchedule() != null)
            sb.append("weeklySchedule: " + getWeeklySchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDailySchedule() == null) ? 0 : getDailySchedule().hashCode());
        hashCode = prime * hashCode
                + ((getMonthlySchedule() == null) ? 0 : getMonthlySchedule().hashCode());
        hashCode = prime * hashCode
                + ((getWeeklySchedule() == null) ? 0 : getWeeklySchedule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobScheduleFrequency == false)
            return false;
        JobScheduleFrequency other = (JobScheduleFrequency) obj;

        if (other.getDailySchedule() == null ^ this.getDailySchedule() == null)
            return false;
        if (other.getDailySchedule() != null
                && other.getDailySchedule().equals(this.getDailySchedule()) == false)
            return false;
        if (other.getMonthlySchedule() == null ^ this.getMonthlySchedule() == null)
            return false;
        if (other.getMonthlySchedule() != null
                && other.getMonthlySchedule().equals(this.getMonthlySchedule()) == false)
            return false;
        if (other.getWeeklySchedule() == null ^ this.getWeeklySchedule() == null)
            return false;
        if (other.getWeeklySchedule() != null
                && other.getWeeklySchedule().equals(this.getWeeklySchedule()) == false)
            return false;
        return true;
    }
}
