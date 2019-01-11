/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a scheduled scaling action. Used in response to
 * <a>DescribeScheduledActions</a>.
 * </p>
 */
public class ScheduledUpdateGroupAction implements Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String scheduledActionName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String scheduledActionARN;

    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     */
    private java.util.Date time;

    /**
     * <p>
     * The date and time that the action is scheduled to begin. This date and
     * time can be up to one month in the future.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action starts and stops.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The date and time that the action is scheduled to end. This date and time
     * can be up to one month in the future.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The recurring schedule for the action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String recurrence;

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     */
    private Integer minSize;

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     */
    private Integer maxSize;

    /**
     * <p>
     * The number of instances you prefer to maintain in the group.
     * </p>
     */
    private Integer desiredCapacity;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledUpdateGroupAction withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the scheduled action.
     *         </p>
     */
    public String getScheduledActionName() {
        return scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param scheduledActionName <p>
     *            The name of the scheduled action.
     *            </p>
     */
    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param scheduledActionName <p>
     *            The name of the scheduled action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledUpdateGroupAction withScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the scheduled action.
     *         </p>
     */
    public String getScheduledActionARN() {
        return scheduledActionARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param scheduledActionARN <p>
     *            The Amazon Resource Name (ARN) of the scheduled action.
     *            </p>
     */
    public void setScheduledActionARN(String scheduledActionARN) {
        this.scheduledActionARN = scheduledActionARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduled action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param scheduledActionARN <p>
     *            The Amazon Resource Name (ARN) of the scheduled action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledUpdateGroupAction withScheduledActionARN(String scheduledActionARN) {
        this.scheduledActionARN = scheduledActionARN;
        return this;
    }

    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     *
     * @return <p>
     *         This parameter is deprecated.
     *         </p>
     */
    public java.util.Date getTime() {
        return time;
    }

    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     *
     * @param time <p>
     *            This parameter is deprecated.
     *            </p>
     */
    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * This parameter is deprecated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param time <p>
     *            This parameter is deprecated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledUpdateGroupAction withTime(java.util.Date time) {
        this.time = time;
        return this;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to begin. This date and
     * time can be up to one month in the future.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action starts and stops.
     * </p>
     *
     * @return <p>
     *         The date and time that the action is scheduled to begin. This
     *         date and time can be up to one month in the future.
     *         </p>
     *         <p>
     *         When <code>StartTime</code> and <code>EndTime</code> are
     *         specified with <code>Recurrence</code>, they form the boundaries
     *         of when the recurring action starts and stops.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to begin. This date and
     * time can be up to one month in the future.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action starts and stops.
     * </p>
     *
     * @param startTime <p>
     *            The date and time that the action is scheduled to begin. This
     *            date and time can be up to one month in the future.
     *            </p>
     *            <p>
     *            When <code>StartTime</code> and <code>EndTime</code> are
     *            specified with <code>Recurrence</code>, they form the
     *            boundaries of when the recurring action starts and stops.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to begin. This date and
     * time can be up to one month in the future.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action starts and stops.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The date and time that the action is scheduled to begin. This
     *            date and time can be up to one month in the future.
     *            </p>
     *            <p>
     *            When <code>StartTime</code> and <code>EndTime</code> are
     *            specified with <code>Recurrence</code>, they form the
     *            boundaries of when the recurring action starts and stops.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledUpdateGroupAction withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to end. This date and time
     * can be up to one month in the future.
     * </p>
     *
     * @return <p>
     *         The date and time that the action is scheduled to end. This date
     *         and time can be up to one month in the future.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to end. This date and time
     * can be up to one month in the future.
     * </p>
     *
     * @param endTime <p>
     *            The date and time that the action is scheduled to end. This
     *            date and time can be up to one month in the future.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time that the action is scheduled to end. This date and time
     * can be up to one month in the future.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The date and time that the action is scheduled to end. This
     *            date and time can be up to one month in the future.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledUpdateGroupAction withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The recurring schedule for the action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The recurring schedule for the action.
     *         </p>
     */
    public String getRecurrence() {
        return recurrence;
    }

    /**
     * <p>
     * The recurring schedule for the action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param recurrence <p>
     *            The recurring schedule for the action.
     *            </p>
     */
    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The recurring schedule for the action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param recurrence <p>
     *            The recurring schedule for the action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledUpdateGroupAction withRecurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     *
     * @return <p>
     *         The minimum size of the group.
     *         </p>
     */
    public Integer getMinSize() {
        return minSize;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     *
     * @param minSize <p>
     *            The minimum size of the group.
     *            </p>
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minSize <p>
     *            The minimum size of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledUpdateGroupAction withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     *
     * @return <p>
     *         The maximum size of the group.
     *         </p>
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     *
     * @param maxSize <p>
     *            The maximum size of the group.
     *            </p>
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxSize <p>
     *            The maximum size of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledUpdateGroupAction withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * <p>
     * The number of instances you prefer to maintain in the group.
     * </p>
     *
     * @return <p>
     *         The number of instances you prefer to maintain in the group.
     *         </p>
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * <p>
     * The number of instances you prefer to maintain in the group.
     * </p>
     *
     * @param desiredCapacity <p>
     *            The number of instances you prefer to maintain in the group.
     *            </p>
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of instances you prefer to maintain in the group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredCapacity <p>
     *            The number of instances you prefer to maintain in the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledUpdateGroupAction withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: " + getScheduledActionName() + ",");
        if (getScheduledActionARN() != null)
            sb.append("ScheduledActionARN: " + getScheduledActionARN() + ",");
        if (getTime() != null)
            sb.append("Time: " + getTime() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getRecurrence() != null)
            sb.append("Recurrence: " + getRecurrence() + ",");
        if (getMinSize() != null)
            sb.append("MinSize: " + getMinSize() + ",");
        if (getMaxSize() != null)
            sb.append("MaxSize: " + getMaxSize() + ",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: " + getDesiredCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledActionARN() == null) ? 0 : getScheduledActionARN().hashCode());
        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledUpdateGroupAction == false)
            return false;
        ScheduledUpdateGroupAction other = (ScheduledUpdateGroupAction) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null
                && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        if (other.getScheduledActionARN() == null ^ this.getScheduledActionARN() == null)
            return false;
        if (other.getScheduledActionARN() != null
                && other.getScheduledActionARN().equals(this.getScheduledActionARN()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
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
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null
                && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null
                && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        return true;
    }
}
