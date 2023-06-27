/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * This API enables you to specify the duration that the camera, or local media
 * file, should record onto the Edge Agent. The <code>ScheduleConfig</code>
 * consists of the <code>ScheduleExpression</code> and the
 * <code>DurationInMinutes</code> attributes.
 * </p>
 * <p>
 * If the <code>ScheduleConfig</code> is not provided in the
 * <code>RecorderConfig</code>, then the Edge Agent will always be set to
 * recording mode.
 * </p>
 * <p>
 * If the <code>ScheduleConfig</code> is not provided in the
 * <code>UploaderConfig</code>, then the Edge Agent will upload at regular
 * intervals (every 1 hour).
 * </p>
 */
public class ScheduleConfig implements Serializable {
    /**
     * <p>
     * The Quartz cron expression that takes care of scheduling jobs to record
     * from the camera, or local media file, onto the Edge Agent. If the
     * <code>ScheduleExpression</code> is not provided for the
     * <code>RecorderConfig</code>, then the Edge Agent will always be set to
     * recording mode.
     * </p>
     * <p>
     * For more information about Quartz, refer to the <a href=
     * "http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"
     * > <i>Cron Trigger Tutorial</i> </a> page to understand the valid
     * expressions and its use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 100<br/>
     * <b>Pattern: </b>[^\n]{11,100}<br/>
     */
    private String scheduleExpression;

    /**
     * <p>
     * The total duration to record the media. If the
     * <code>ScheduleExpression</code> attribute is provided, then the
     * <code>DurationInSeconds</code> attribute should also be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 3600<br/>
     */
    private Integer durationInSeconds;

    /**
     * <p>
     * The Quartz cron expression that takes care of scheduling jobs to record
     * from the camera, or local media file, onto the Edge Agent. If the
     * <code>ScheduleExpression</code> is not provided for the
     * <code>RecorderConfig</code>, then the Edge Agent will always be set to
     * recording mode.
     * </p>
     * <p>
     * For more information about Quartz, refer to the <a href=
     * "http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"
     * > <i>Cron Trigger Tutorial</i> </a> page to understand the valid
     * expressions and its use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 100<br/>
     * <b>Pattern: </b>[^\n]{11,100}<br/>
     *
     * @return <p>
     *         The Quartz cron expression that takes care of scheduling jobs to
     *         record from the camera, or local media file, onto the Edge Agent.
     *         If the <code>ScheduleExpression</code> is not provided for the
     *         <code>RecorderConfig</code>, then the Edge Agent will always be
     *         set to recording mode.
     *         </p>
     *         <p>
     *         For more information about Quartz, refer to the <a href=
     *         "http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"
     *         > <i>Cron Trigger Tutorial</i> </a> page to understand the valid
     *         expressions and its use.
     *         </p>
     */
    public String getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * <p>
     * The Quartz cron expression that takes care of scheduling jobs to record
     * from the camera, or local media file, onto the Edge Agent. If the
     * <code>ScheduleExpression</code> is not provided for the
     * <code>RecorderConfig</code>, then the Edge Agent will always be set to
     * recording mode.
     * </p>
     * <p>
     * For more information about Quartz, refer to the <a href=
     * "http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"
     * > <i>Cron Trigger Tutorial</i> </a> page to understand the valid
     * expressions and its use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 100<br/>
     * <b>Pattern: </b>[^\n]{11,100}<br/>
     *
     * @param scheduleExpression <p>
     *            The Quartz cron expression that takes care of scheduling jobs
     *            to record from the camera, or local media file, onto the Edge
     *            Agent. If the <code>ScheduleExpression</code> is not provided
     *            for the <code>RecorderConfig</code>, then the Edge Agent will
     *            always be set to recording mode.
     *            </p>
     *            <p>
     *            For more information about Quartz, refer to the <a href=
     *            "http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"
     *            > <i>Cron Trigger Tutorial</i> </a> page to understand the
     *            valid expressions and its use.
     *            </p>
     */
    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The Quartz cron expression that takes care of scheduling jobs to record
     * from the camera, or local media file, onto the Edge Agent. If the
     * <code>ScheduleExpression</code> is not provided for the
     * <code>RecorderConfig</code>, then the Edge Agent will always be set to
     * recording mode.
     * </p>
     * <p>
     * For more information about Quartz, refer to the <a href=
     * "http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"
     * > <i>Cron Trigger Tutorial</i> </a> page to understand the valid
     * expressions and its use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 100<br/>
     * <b>Pattern: </b>[^\n]{11,100}<br/>
     *
     * @param scheduleExpression <p>
     *            The Quartz cron expression that takes care of scheduling jobs
     *            to record from the camera, or local media file, onto the Edge
     *            Agent. If the <code>ScheduleExpression</code> is not provided
     *            for the <code>RecorderConfig</code>, then the Edge Agent will
     *            always be set to recording mode.
     *            </p>
     *            <p>
     *            For more information about Quartz, refer to the <a href=
     *            "http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"
     *            > <i>Cron Trigger Tutorial</i> </a> page to understand the
     *            valid expressions and its use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleConfig withScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    /**
     * <p>
     * The total duration to record the media. If the
     * <code>ScheduleExpression</code> attribute is provided, then the
     * <code>DurationInSeconds</code> attribute should also be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 3600<br/>
     *
     * @return <p>
     *         The total duration to record the media. If the
     *         <code>ScheduleExpression</code> attribute is provided, then the
     *         <code>DurationInSeconds</code> attribute should also be
     *         specified.
     *         </p>
     */
    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * <p>
     * The total duration to record the media. If the
     * <code>ScheduleExpression</code> attribute is provided, then the
     * <code>DurationInSeconds</code> attribute should also be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 3600<br/>
     *
     * @param durationInSeconds <p>
     *            The total duration to record the media. If the
     *            <code>ScheduleExpression</code> attribute is provided, then
     *            the <code>DurationInSeconds</code> attribute should also be
     *            specified.
     *            </p>
     */
    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The total duration to record the media. If the
     * <code>ScheduleExpression</code> attribute is provided, then the
     * <code>DurationInSeconds</code> attribute should also be specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 3600<br/>
     *
     * @param durationInSeconds <p>
     *            The total duration to record the media. If the
     *            <code>ScheduleExpression</code> attribute is provided, then
     *            the <code>DurationInSeconds</code> attribute should also be
     *            specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleConfig withDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
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
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: " + getDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode
                + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleConfig == false)
            return false;
        ScheduleConfig other = (ScheduleConfig) obj;

        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null
                && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null
                && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        return true;
    }
}
