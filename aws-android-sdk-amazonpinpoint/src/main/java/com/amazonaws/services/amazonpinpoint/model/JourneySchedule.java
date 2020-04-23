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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the schedule settings for a journey.
 * </p>
 */
public class JourneySchedule implements Serializable {
    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey ended or will
     * end.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey began or will
     * begin.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The starting UTC offset for the journey schedule, if the value of the
     * journey's LocalTime property is true. Valid values are: UTC, UTC+01,
     * UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30,
     * UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09,
     * UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+12:45, UTC+13,
     * UTC+13:45, UTC-02, UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06,
     * UTC-07, UTC-08, UTC-09, UTC-09:30, UTC-10, and UTC-11.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey ended or will
     * end.
     * </p>
     *
     * @return <p>
     *         The scheduled time, in ISO 8601 format, when the journey ended or
     *         will end.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey ended or will
     * end.
     * </p>
     *
     * @param endTime <p>
     *            The scheduled time, in ISO 8601 format, when the journey ended
     *            or will end.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey ended or will
     * end.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The scheduled time, in ISO 8601 format, when the journey ended
     *            or will end.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JourneySchedule withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey began or will
     * begin.
     * </p>
     *
     * @return <p>
     *         The scheduled time, in ISO 8601 format, when the journey began or
     *         will begin.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey began or will
     * begin.
     * </p>
     *
     * @param startTime <p>
     *            The scheduled time, in ISO 8601 format, when the journey began
     *            or will begin.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, when the journey began or will
     * begin.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The scheduled time, in ISO 8601 format, when the journey began
     *            or will begin.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JourneySchedule withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The starting UTC offset for the journey schedule, if the value of the
     * journey's LocalTime property is true. Valid values are: UTC, UTC+01,
     * UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30,
     * UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09,
     * UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+12:45, UTC+13,
     * UTC+13:45, UTC-02, UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06,
     * UTC-07, UTC-08, UTC-09, UTC-09:30, UTC-10, and UTC-11.
     * </p>
     *
     * @return <p>
     *         The starting UTC offset for the journey schedule, if the value of
     *         the journey's LocalTime property is true. Valid values are: UTC,
     *         UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05,
     *         UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08,
     *         UTC+08:45, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12,
     *         UTC+12:45, UTC+13, UTC+13:45, UTC-02, UTC-02:30, UTC-03,
     *         UTC-03:30, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09,
     *         UTC-09:30, UTC-10, and UTC-11.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * The starting UTC offset for the journey schedule, if the value of the
     * journey's LocalTime property is true. Valid values are: UTC, UTC+01,
     * UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30,
     * UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09,
     * UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+12:45, UTC+13,
     * UTC+13:45, UTC-02, UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06,
     * UTC-07, UTC-08, UTC-09, UTC-09:30, UTC-10, and UTC-11.
     * </p>
     *
     * @param timezone <p>
     *            The starting UTC offset for the journey schedule, if the value
     *            of the journey's LocalTime property is true. Valid values are:
     *            UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30,
     *            UTC+05, UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07,
     *            UTC+08, UTC+08:45, UTC+09, UTC+09:30, UTC+10, UTC+10:30,
     *            UTC+11, UTC+12, UTC+12:45, UTC+13, UTC+13:45, UTC-02,
     *            UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06, UTC-07,
     *            UTC-08, UTC-09, UTC-09:30, UTC-10, and UTC-11.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The starting UTC offset for the journey schedule, if the value of the
     * journey's LocalTime property is true. Valid values are: UTC, UTC+01,
     * UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30,
     * UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+08:45, UTC+09,
     * UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+12:45, UTC+13,
     * UTC+13:45, UTC-02, UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06,
     * UTC-07, UTC-08, UTC-09, UTC-09:30, UTC-10, and UTC-11.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezone <p>
     *            The starting UTC offset for the journey schedule, if the value
     *            of the journey's LocalTime property is true. Valid values are:
     *            UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30,
     *            UTC+05, UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07,
     *            UTC+08, UTC+08:45, UTC+09, UTC+09:30, UTC+10, UTC+10:30,
     *            UTC+11, UTC+12, UTC+12:45, UTC+13, UTC+13:45, UTC-02,
     *            UTC-02:30, UTC-03, UTC-03:30, UTC-04, UTC-05, UTC-06, UTC-07,
     *            UTC-08, UTC-09, UTC-09:30, UTC-10, and UTC-11.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JourneySchedule withTimezone(String timezone) {
        this.timezone = timezone;
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
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneySchedule == false)
            return false;
        JourneySchedule other = (JourneySchedule) obj;

        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        return true;
    }
}
