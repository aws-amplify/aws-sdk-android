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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * A scheduling object using a <code>cron</code> statement to schedule an event.
 * </p>
 */
public class Schedule implements Serializable {
    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, specify
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     */
    private String scheduleExpression;

    /**
     * <p>
     * The state of the schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, NOT_SCHEDULED, TRANSITIONING
     */
    private String state;

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, specify
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     *
     * @return <p>
     *         A <code>cron</code> expression used to specify the schedule. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *         >Time-Based Schedules for Jobs and Crawlers</a>. For example, to
     *         run something every day at 12:15 UTC, specify
     *         <code>cron(15 12 * * ? *)</code>.
     *         </p>
     */
    public String getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, specify
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     *
     * @param scheduleExpression <p>
     *            A <code>cron</code> expression used to specify the schedule.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *            >Time-Based Schedules for Jobs and Crawlers</a>. For example,
     *            to run something every day at 12:15 UTC, specify
     *            <code>cron(15 12 * * ? *)</code>.
     *            </p>
     */
    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, specify
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleExpression <p>
     *            A <code>cron</code> expression used to specify the schedule.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *            >Time-Based Schedules for Jobs and Crawlers</a>. For example,
     *            to run something every day at 12:15 UTC, specify
     *            <code>cron(15 12 * * ? *)</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    /**
     * <p>
     * The state of the schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, NOT_SCHEDULED, TRANSITIONING
     *
     * @return <p>
     *         The state of the schedule.
     *         </p>
     * @see ScheduleState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, NOT_SCHEDULED, TRANSITIONING
     *
     * @param state <p>
     *            The state of the schedule.
     *            </p>
     * @see ScheduleState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, NOT_SCHEDULED, TRANSITIONING
     *
     * @param state <p>
     *            The state of the schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduleState
     */
    public Schedule withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, NOT_SCHEDULED, TRANSITIONING
     *
     * @param state <p>
     *            The state of the schedule.
     *            </p>
     * @see ScheduleState
     */
    public void setState(ScheduleState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, NOT_SCHEDULED, TRANSITIONING
     *
     * @param state <p>
     *            The state of the schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScheduleState
     */
    public Schedule withState(ScheduleState state) {
        this.state = state.toString();
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
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: " + getScheduleExpression() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schedule == false)
            return false;
        Schedule other = (Schedule) obj;

        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null
                && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
