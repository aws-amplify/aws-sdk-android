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

package com.amazonaws.services.dlm.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies when to create snapshots of EBS volumes.
 * </p>
 * <p>
 * You must specify either a Cron expression or an interval, interval unit, and
 * start time. You cannot specify both.
 * </p>
 */
public class CreateRule implements Serializable {
    /**
     * <p>
     * The interval between snapshots. The supported values are 1, 2, 3, 4, 6,
     * 8, 12, and 24.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer interval;

    /**
     * <p>
     * The interval unit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOURS
     */
    private String intervalUnit;

    /**
     * <p>
     * The time, in UTC, to start the operation. The supported format is hh:mm.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified
     * time. If you do not specify a time, Amazon DLM selects a time within the
     * next 24 hours.
     * </p>
     */
    private java.util.List<String> times;

    /**
     * <p>
     * The schedule, as a Cron expression. The schedule interval must be between
     * 1 hour and 1 year. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     * >Cron expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>17 - 106<br/>
     * <b>Pattern: </b>cron\([^\n]{11,100}\)<br/>
     */
    private String cronExpression;

    /**
     * <p>
     * The interval between snapshots. The supported values are 1, 2, 3, 4, 6,
     * 8, 12, and 24.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The interval between snapshots. The supported values are 1, 2, 3,
     *         4, 6, 8, 12, and 24.
     *         </p>
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * <p>
     * The interval between snapshots. The supported values are 1, 2, 3, 4, 6,
     * 8, 12, and 24.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param interval <p>
     *            The interval between snapshots. The supported values are 1, 2,
     *            3, 4, 6, 8, 12, and 24.
     *            </p>
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The interval between snapshots. The supported values are 1, 2, 3, 4, 6,
     * 8, 12, and 24.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param interval <p>
     *            The interval between snapshots. The supported values are 1, 2,
     *            3, 4, 6, 8, 12, and 24.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRule withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOURS
     *
     * @return <p>
     *         The interval unit.
     *         </p>
     * @see IntervalUnitValues
     */
    public String getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOURS
     *
     * @param intervalUnit <p>
     *            The interval unit.
     *            </p>
     * @see IntervalUnitValues
     */
    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOURS
     *
     * @param intervalUnit <p>
     *            The interval unit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntervalUnitValues
     */
    public CreateRule withIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOURS
     *
     * @param intervalUnit <p>
     *            The interval unit.
     *            </p>
     * @see IntervalUnitValues
     */
    public void setIntervalUnit(IntervalUnitValues intervalUnit) {
        this.intervalUnit = intervalUnit.toString();
    }

    /**
     * <p>
     * The interval unit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HOURS
     *
     * @param intervalUnit <p>
     *            The interval unit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntervalUnitValues
     */
    public CreateRule withIntervalUnit(IntervalUnitValues intervalUnit) {
        this.intervalUnit = intervalUnit.toString();
        return this;
    }

    /**
     * <p>
     * The time, in UTC, to start the operation. The supported format is hh:mm.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified
     * time. If you do not specify a time, Amazon DLM selects a time within the
     * next 24 hours.
     * </p>
     *
     * @return <p>
     *         The time, in UTC, to start the operation. The supported format is
     *         hh:mm.
     *         </p>
     *         <p>
     *         The operation occurs within a one-hour window following the
     *         specified time. If you do not specify a time, Amazon DLM selects
     *         a time within the next 24 hours.
     *         </p>
     */
    public java.util.List<String> getTimes() {
        return times;
    }

    /**
     * <p>
     * The time, in UTC, to start the operation. The supported format is hh:mm.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified
     * time. If you do not specify a time, Amazon DLM selects a time within the
     * next 24 hours.
     * </p>
     *
     * @param times <p>
     *            The time, in UTC, to start the operation. The supported format
     *            is hh:mm.
     *            </p>
     *            <p>
     *            The operation occurs within a one-hour window following the
     *            specified time. If you do not specify a time, Amazon DLM
     *            selects a time within the next 24 hours.
     *            </p>
     */
    public void setTimes(java.util.Collection<String> times) {
        if (times == null) {
            this.times = null;
            return;
        }

        this.times = new java.util.ArrayList<String>(times);
    }

    /**
     * <p>
     * The time, in UTC, to start the operation. The supported format is hh:mm.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified
     * time. If you do not specify a time, Amazon DLM selects a time within the
     * next 24 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param times <p>
     *            The time, in UTC, to start the operation. The supported format
     *            is hh:mm.
     *            </p>
     *            <p>
     *            The operation occurs within a one-hour window following the
     *            specified time. If you do not specify a time, Amazon DLM
     *            selects a time within the next 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRule withTimes(String... times) {
        if (getTimes() == null) {
            this.times = new java.util.ArrayList<String>(times.length);
        }
        for (String value : times) {
            this.times.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The time, in UTC, to start the operation. The supported format is hh:mm.
     * </p>
     * <p>
     * The operation occurs within a one-hour window following the specified
     * time. If you do not specify a time, Amazon DLM selects a time within the
     * next 24 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param times <p>
     *            The time, in UTC, to start the operation. The supported format
     *            is hh:mm.
     *            </p>
     *            <p>
     *            The operation occurs within a one-hour window following the
     *            specified time. If you do not specify a time, Amazon DLM
     *            selects a time within the next 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRule withTimes(java.util.Collection<String> times) {
        setTimes(times);
        return this;
    }

    /**
     * <p>
     * The schedule, as a Cron expression. The schedule interval must be between
     * 1 hour and 1 year. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     * >Cron expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>17 - 106<br/>
     * <b>Pattern: </b>cron\([^\n]{11,100}\)<br/>
     *
     * @return <p>
     *         The schedule, as a Cron expression. The schedule interval must be
     *         between 1 hour and 1 year. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *         >Cron expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     *         </p>
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * <p>
     * The schedule, as a Cron expression. The schedule interval must be between
     * 1 hour and 1 year. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     * >Cron expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>17 - 106<br/>
     * <b>Pattern: </b>cron\([^\n]{11,100}\)<br/>
     *
     * @param cronExpression <p>
     *            The schedule, as a Cron expression. The schedule interval must
     *            be between 1 hour and 1 year. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *            >Cron expressions</a> in the <i>Amazon CloudWatch User
     *            Guide</i>.
     *            </p>
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * <p>
     * The schedule, as a Cron expression. The schedule interval must be between
     * 1 hour and 1 year. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     * >Cron expressions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>17 - 106<br/>
     * <b>Pattern: </b>cron\([^\n]{11,100}\)<br/>
     *
     * @param cronExpression <p>
     *            The schedule, as a Cron expression. The schedule interval must
     *            be between 1 hour and 1 year. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *            >Cron expressions</a> in the <i>Amazon CloudWatch User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRule withCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
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
        if (getInterval() != null)
            sb.append("Interval: " + getInterval() + ",");
        if (getIntervalUnit() != null)
            sb.append("IntervalUnit: " + getIntervalUnit() + ",");
        if (getTimes() != null)
            sb.append("Times: " + getTimes() + ",");
        if (getCronExpression() != null)
            sb.append("CronExpression: " + getCronExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode
                + ((getIntervalUnit() == null) ? 0 : getIntervalUnit().hashCode());
        hashCode = prime * hashCode + ((getTimes() == null) ? 0 : getTimes().hashCode());
        hashCode = prime * hashCode
                + ((getCronExpression() == null) ? 0 : getCronExpression().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRule == false)
            return false;
        CreateRule other = (CreateRule) obj;

        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getIntervalUnit() == null ^ this.getIntervalUnit() == null)
            return false;
        if (other.getIntervalUnit() != null
                && other.getIntervalUnit().equals(this.getIntervalUnit()) == false)
            return false;
        if (other.getTimes() == null ^ this.getTimes() == null)
            return false;
        if (other.getTimes() != null && other.getTimes().equals(this.getTimes()) == false)
            return false;
        if (other.getCronExpression() == null ^ this.getCronExpression() == null)
            return false;
        if (other.getCronExpression() != null
                && other.getCronExpression().equals(this.getCronExpression()) == false)
            return false;
        return true;
    }
}
