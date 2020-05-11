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
 * Describes the recurring schedule for a Scheduled Instance.
 * </p>
 */
public class ScheduledInstanceRecurrence implements Serializable {
    /**
     * <p>
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or
     * <code>Monthly</code>).
     * </p>
     */
    private String frequency;

    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of
     * <code>frequency</code>. For example, every 2 weeks or every 2 months.
     * </p>
     */
    private Integer interval;

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month
     * (1-31). For a weekly schedule, this is one or more days of the week (1-7,
     * where 1 is Sunday).
     * </p>
     */
    private java.util.List<Integer> occurrenceDaySet;

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified
     * week or month.
     * </p>
     */
    private Boolean occurrenceRelativeToEnd;

    /**
     * <p>
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>).
     * </p>
     */
    private String occurrenceUnit;

    /**
     * <p>
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or
     * <code>Monthly</code>).
     * </p>
     *
     * @return <p>
     *         The frequency (<code>Daily</code>, <code>Weekly</code>, or
     *         <code>Monthly</code>).
     *         </p>
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * <p>
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or
     * <code>Monthly</code>).
     * </p>
     *
     * @param frequency <p>
     *            The frequency (<code>Daily</code>, <code>Weekly</code>, or
     *            <code>Monthly</code>).
     *            </p>
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * The frequency (<code>Daily</code>, <code>Weekly</code>, or
     * <code>Monthly</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param frequency <p>
     *            The frequency (<code>Daily</code>, <code>Weekly</code>, or
     *            <code>Monthly</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceRecurrence withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of
     * <code>frequency</code>. For example, every 2 weeks or every 2 months.
     * </p>
     *
     * @return <p>
     *         The interval quantity. The interval unit depends on the value of
     *         <code>frequency</code>. For example, every 2 weeks or every 2
     *         months.
     *         </p>
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of
     * <code>frequency</code>. For example, every 2 weeks or every 2 months.
     * </p>
     *
     * @param interval <p>
     *            The interval quantity. The interval unit depends on the value
     *            of <code>frequency</code>. For example, every 2 weeks or every
     *            2 months.
     *            </p>
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The interval quantity. The interval unit depends on the value of
     * <code>frequency</code>. For example, every 2 weeks or every 2 months.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interval <p>
     *            The interval quantity. The interval unit depends on the value
     *            of <code>frequency</code>. For example, every 2 weeks or every
     *            2 months.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceRecurrence withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month
     * (1-31). For a weekly schedule, this is one or more days of the week (1-7,
     * where 1 is Sunday).
     * </p>
     *
     * @return <p>
     *         The days. For a monthly schedule, this is one or more days of the
     *         month (1-31). For a weekly schedule, this is one or more days of
     *         the week (1-7, where 1 is Sunday).
     *         </p>
     */
    public java.util.List<Integer> getOccurrenceDaySet() {
        return occurrenceDaySet;
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month
     * (1-31). For a weekly schedule, this is one or more days of the week (1-7,
     * where 1 is Sunday).
     * </p>
     *
     * @param occurrenceDaySet <p>
     *            The days. For a monthly schedule, this is one or more days of
     *            the month (1-31). For a weekly schedule, this is one or more
     *            days of the week (1-7, where 1 is Sunday).
     *            </p>
     */
    public void setOccurrenceDaySet(java.util.Collection<Integer> occurrenceDaySet) {
        if (occurrenceDaySet == null) {
            this.occurrenceDaySet = null;
            return;
        }

        this.occurrenceDaySet = new java.util.ArrayList<Integer>(occurrenceDaySet);
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month
     * (1-31). For a weekly schedule, this is one or more days of the week (1-7,
     * where 1 is Sunday).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param occurrenceDaySet <p>
     *            The days. For a monthly schedule, this is one or more days of
     *            the month (1-31). For a weekly schedule, this is one or more
     *            days of the week (1-7, where 1 is Sunday).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceRecurrence withOccurrenceDaySet(Integer... occurrenceDaySet) {
        if (getOccurrenceDaySet() == null) {
            this.occurrenceDaySet = new java.util.ArrayList<Integer>(occurrenceDaySet.length);
        }
        for (Integer value : occurrenceDaySet) {
            this.occurrenceDaySet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The days. For a monthly schedule, this is one or more days of the month
     * (1-31). For a weekly schedule, this is one or more days of the week (1-7,
     * where 1 is Sunday).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param occurrenceDaySet <p>
     *            The days. For a monthly schedule, this is one or more days of
     *            the month (1-31). For a weekly schedule, this is one or more
     *            days of the week (1-7, where 1 is Sunday).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceRecurrence withOccurrenceDaySet(
            java.util.Collection<Integer> occurrenceDaySet) {
        setOccurrenceDaySet(occurrenceDaySet);
        return this;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified
     * week or month.
     * </p>
     *
     * @return <p>
     *         Indicates whether the occurrence is relative to the end of the
     *         specified week or month.
     *         </p>
     */
    public Boolean isOccurrenceRelativeToEnd() {
        return occurrenceRelativeToEnd;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified
     * week or month.
     * </p>
     *
     * @return <p>
     *         Indicates whether the occurrence is relative to the end of the
     *         specified week or month.
     *         </p>
     */
    public Boolean getOccurrenceRelativeToEnd() {
        return occurrenceRelativeToEnd;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified
     * week or month.
     * </p>
     *
     * @param occurrenceRelativeToEnd <p>
     *            Indicates whether the occurrence is relative to the end of the
     *            specified week or month.
     *            </p>
     */
    public void setOccurrenceRelativeToEnd(Boolean occurrenceRelativeToEnd) {
        this.occurrenceRelativeToEnd = occurrenceRelativeToEnd;
    }

    /**
     * <p>
     * Indicates whether the occurrence is relative to the end of the specified
     * week or month.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param occurrenceRelativeToEnd <p>
     *            Indicates whether the occurrence is relative to the end of the
     *            specified week or month.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceRecurrence withOccurrenceRelativeToEnd(Boolean occurrenceRelativeToEnd) {
        this.occurrenceRelativeToEnd = occurrenceRelativeToEnd;
        return this;
    }

    /**
     * <p>
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>).
     * </p>
     *
     * @return <p>
     *         The unit for <code>occurrenceDaySet</code> (
     *         <code>DayOfWeek</code> or <code>DayOfMonth</code>).
     *         </p>
     */
    public String getOccurrenceUnit() {
        return occurrenceUnit;
    }

    /**
     * <p>
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>).
     * </p>
     *
     * @param occurrenceUnit <p>
     *            The unit for <code>occurrenceDaySet</code> (
     *            <code>DayOfWeek</code> or <code>DayOfMonth</code>).
     *            </p>
     */
    public void setOccurrenceUnit(String occurrenceUnit) {
        this.occurrenceUnit = occurrenceUnit;
    }

    /**
     * <p>
     * The unit for <code>occurrenceDaySet</code> (<code>DayOfWeek</code> or
     * <code>DayOfMonth</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param occurrenceUnit <p>
     *            The unit for <code>occurrenceDaySet</code> (
     *            <code>DayOfWeek</code> or <code>DayOfMonth</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceRecurrence withOccurrenceUnit(String occurrenceUnit) {
        this.occurrenceUnit = occurrenceUnit;
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
        if (getFrequency() != null)
            sb.append("Frequency: " + getFrequency() + ",");
        if (getInterval() != null)
            sb.append("Interval: " + getInterval() + ",");
        if (getOccurrenceDaySet() != null)
            sb.append("OccurrenceDaySet: " + getOccurrenceDaySet() + ",");
        if (getOccurrenceRelativeToEnd() != null)
            sb.append("OccurrenceRelativeToEnd: " + getOccurrenceRelativeToEnd() + ",");
        if (getOccurrenceUnit() != null)
            sb.append("OccurrenceUnit: " + getOccurrenceUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode
                + ((getOccurrenceDaySet() == null) ? 0 : getOccurrenceDaySet().hashCode());
        hashCode = prime
                * hashCode
                + ((getOccurrenceRelativeToEnd() == null) ? 0 : getOccurrenceRelativeToEnd()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getOccurrenceUnit() == null) ? 0 : getOccurrenceUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledInstanceRecurrence == false)
            return false;
        ScheduledInstanceRecurrence other = (ScheduledInstanceRecurrence) obj;

        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null
                && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getOccurrenceDaySet() == null ^ this.getOccurrenceDaySet() == null)
            return false;
        if (other.getOccurrenceDaySet() != null
                && other.getOccurrenceDaySet().equals(this.getOccurrenceDaySet()) == false)
            return false;
        if (other.getOccurrenceRelativeToEnd() == null ^ this.getOccurrenceRelativeToEnd() == null)
            return false;
        if (other.getOccurrenceRelativeToEnd() != null
                && other.getOccurrenceRelativeToEnd().equals(this.getOccurrenceRelativeToEnd()) == false)
            return false;
        if (other.getOccurrenceUnit() == null ^ this.getOccurrenceUnit() == null)
            return false;
        if (other.getOccurrenceUnit() != null
                && other.getOccurrenceUnit().equals(this.getOccurrenceUnit()) == false)
            return false;
        return true;
    }
}
