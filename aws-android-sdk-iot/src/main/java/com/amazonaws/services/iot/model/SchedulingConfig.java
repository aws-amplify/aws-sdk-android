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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the date and time that a job will begin the rollout of the job
 * document to all devices in the target group. Additionally, you can specify
 * the end behavior for each job execution when it reaches the scheduled end
 * time.
 * </p>
 */
public class SchedulingConfig implements Serializable {
    /**
     * <p>
     * The time a job will begin rollout of the job document to all devices in
     * the target group for a job. The <code>startTime</code> can be scheduled
     * up to a year in advance and must be scheduled a minimum of thirty minutes
     * from the current time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String startTime;

    /**
     * <p>
     * The time a job will stop rollout of the job document to all devices in
     * the target group for a job. The <code>endTime</code> must take place no
     * later than two years from the current time and be scheduled a minimum of
     * thirty minutes from the current time. The minimum duration between
     * <code>startTime</code> and <code>endTime</code> is thirty minutes. The
     * maximum duration between <code>startTime</code> and <code>endTime</code>
     * is two years.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String endTime;

    /**
     * <p>
     * Specifies the end behavior for all job executions after a job reaches the
     * selected <code>endTime</code>. If <code>endTime</code> is not selected
     * when creating the job, then <code>endBehavior</code> does not apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOP_ROLLOUT, CANCEL, FORCE_CANCEL
     */
    private String endBehavior;

    /**
     * <p>
     * The time a job will begin rollout of the job document to all devices in
     * the target group for a job. The <code>startTime</code> can be scheduled
     * up to a year in advance and must be scheduled a minimum of thirty minutes
     * from the current time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The time a job will begin rollout of the job document to all
     *         devices in the target group for a job. The <code>startTime</code>
     *         can be scheduled up to a year in advance and must be scheduled a
     *         minimum of thirty minutes from the current time.
     *         </p>
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The time a job will begin rollout of the job document to all devices in
     * the target group for a job. The <code>startTime</code> can be scheduled
     * up to a year in advance and must be scheduled a minimum of thirty minutes
     * from the current time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param startTime <p>
     *            The time a job will begin rollout of the job document to all
     *            devices in the target group for a job. The
     *            <code>startTime</code> can be scheduled up to a year in
     *            advance and must be scheduled a minimum of thirty minutes from
     *            the current time.
     *            </p>
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time a job will begin rollout of the job document to all devices in
     * the target group for a job. The <code>startTime</code> can be scheduled
     * up to a year in advance and must be scheduled a minimum of thirty minutes
     * from the current time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param startTime <p>
     *            The time a job will begin rollout of the job document to all
     *            devices in the target group for a job. The
     *            <code>startTime</code> can be scheduled up to a year in
     *            advance and must be scheduled a minimum of thirty minutes from
     *            the current time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SchedulingConfig withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The time a job will stop rollout of the job document to all devices in
     * the target group for a job. The <code>endTime</code> must take place no
     * later than two years from the current time and be scheduled a minimum of
     * thirty minutes from the current time. The minimum duration between
     * <code>startTime</code> and <code>endTime</code> is thirty minutes. The
     * maximum duration between <code>startTime</code> and <code>endTime</code>
     * is two years.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The time a job will stop rollout of the job document to all
     *         devices in the target group for a job. The <code>endTime</code>
     *         must take place no later than two years from the current time and
     *         be scheduled a minimum of thirty minutes from the current time.
     *         The minimum duration between <code>startTime</code> and
     *         <code>endTime</code> is thirty minutes. The maximum duration
     *         between <code>startTime</code> and <code>endTime</code> is two
     *         years.
     *         </p>
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time a job will stop rollout of the job document to all devices in
     * the target group for a job. The <code>endTime</code> must take place no
     * later than two years from the current time and be scheduled a minimum of
     * thirty minutes from the current time. The minimum duration between
     * <code>startTime</code> and <code>endTime</code> is thirty minutes. The
     * maximum duration between <code>startTime</code> and <code>endTime</code>
     * is two years.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param endTime <p>
     *            The time a job will stop rollout of the job document to all
     *            devices in the target group for a job. The
     *            <code>endTime</code> must take place no later than two years
     *            from the current time and be scheduled a minimum of thirty
     *            minutes from the current time. The minimum duration between
     *            <code>startTime</code> and <code>endTime</code> is thirty
     *            minutes. The maximum duration between <code>startTime</code>
     *            and <code>endTime</code> is two years.
     *            </p>
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time a job will stop rollout of the job document to all devices in
     * the target group for a job. The <code>endTime</code> must take place no
     * later than two years from the current time and be scheduled a minimum of
     * thirty minutes from the current time. The minimum duration between
     * <code>startTime</code> and <code>endTime</code> is thirty minutes. The
     * maximum duration between <code>startTime</code> and <code>endTime</code>
     * is two years.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param endTime <p>
     *            The time a job will stop rollout of the job document to all
     *            devices in the target group for a job. The
     *            <code>endTime</code> must take place no later than two years
     *            from the current time and be scheduled a minimum of thirty
     *            minutes from the current time. The minimum duration between
     *            <code>startTime</code> and <code>endTime</code> is thirty
     *            minutes. The maximum duration between <code>startTime</code>
     *            and <code>endTime</code> is two years.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SchedulingConfig withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * Specifies the end behavior for all job executions after a job reaches the
     * selected <code>endTime</code>. If <code>endTime</code> is not selected
     * when creating the job, then <code>endBehavior</code> does not apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOP_ROLLOUT, CANCEL, FORCE_CANCEL
     *
     * @return <p>
     *         Specifies the end behavior for all job executions after a job
     *         reaches the selected <code>endTime</code>. If
     *         <code>endTime</code> is not selected when creating the job, then
     *         <code>endBehavior</code> does not apply.
     *         </p>
     * @see JobEndBehavior
     */
    public String getEndBehavior() {
        return endBehavior;
    }

    /**
     * <p>
     * Specifies the end behavior for all job executions after a job reaches the
     * selected <code>endTime</code>. If <code>endTime</code> is not selected
     * when creating the job, then <code>endBehavior</code> does not apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOP_ROLLOUT, CANCEL, FORCE_CANCEL
     *
     * @param endBehavior <p>
     *            Specifies the end behavior for all job executions after a job
     *            reaches the selected <code>endTime</code>. If
     *            <code>endTime</code> is not selected when creating the job,
     *            then <code>endBehavior</code> does not apply.
     *            </p>
     * @see JobEndBehavior
     */
    public void setEndBehavior(String endBehavior) {
        this.endBehavior = endBehavior;
    }

    /**
     * <p>
     * Specifies the end behavior for all job executions after a job reaches the
     * selected <code>endTime</code>. If <code>endTime</code> is not selected
     * when creating the job, then <code>endBehavior</code> does not apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOP_ROLLOUT, CANCEL, FORCE_CANCEL
     *
     * @param endBehavior <p>
     *            Specifies the end behavior for all job executions after a job
     *            reaches the selected <code>endTime</code>. If
     *            <code>endTime</code> is not selected when creating the job,
     *            then <code>endBehavior</code> does not apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobEndBehavior
     */
    public SchedulingConfig withEndBehavior(String endBehavior) {
        this.endBehavior = endBehavior;
        return this;
    }

    /**
     * <p>
     * Specifies the end behavior for all job executions after a job reaches the
     * selected <code>endTime</code>. If <code>endTime</code> is not selected
     * when creating the job, then <code>endBehavior</code> does not apply.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOP_ROLLOUT, CANCEL, FORCE_CANCEL
     *
     * @param endBehavior <p>
     *            Specifies the end behavior for all job executions after a job
     *            reaches the selected <code>endTime</code>. If
     *            <code>endTime</code> is not selected when creating the job,
     *            then <code>endBehavior</code> does not apply.
     *            </p>
     * @see JobEndBehavior
     */
    public void setEndBehavior(JobEndBehavior endBehavior) {
        this.endBehavior = endBehavior.toString();
    }

    /**
     * <p>
     * Specifies the end behavior for all job executions after a job reaches the
     * selected <code>endTime</code>. If <code>endTime</code> is not selected
     * when creating the job, then <code>endBehavior</code> does not apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STOP_ROLLOUT, CANCEL, FORCE_CANCEL
     *
     * @param endBehavior <p>
     *            Specifies the end behavior for all job executions after a job
     *            reaches the selected <code>endTime</code>. If
     *            <code>endTime</code> is not selected when creating the job,
     *            then <code>endBehavior</code> does not apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobEndBehavior
     */
    public SchedulingConfig withEndBehavior(JobEndBehavior endBehavior) {
        this.endBehavior = endBehavior.toString();
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
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getEndBehavior() != null)
            sb.append("endBehavior: " + getEndBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getEndBehavior() == null) ? 0 : getEndBehavior().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchedulingConfig == false)
            return false;
        SchedulingConfig other = (SchedulingConfig) obj;

        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getEndBehavior() == null ^ this.getEndBehavior() == null)
            return false;
        if (other.getEndBehavior() != null
                && other.getEndBehavior().equals(this.getEndBehavior()) == false)
            return false;
        return true;
    }
}
