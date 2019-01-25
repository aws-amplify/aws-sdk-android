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
 * Describes scaling activity, which is a long-running process that represents a
 * change to your Auto Scaling group, such as changing its size or replacing an
 * instance.
 * </p>
 */
public class Activity implements Serializable {
    /**
     * <p>
     * The ID of the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String activityId;

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
     * A friendly, more verbose description of the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String description;

    /**
     * <p>
     * The reason the activity began.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String cause;

    /**
     * <p>
     * The start time of the activity.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The end time of the activity.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The current status of the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingSpotBidPlacement,
     * WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId,
     * WaitingForInstanceId, PreInService, InProgress,
     * WaitingForELBConnectionDraining, MidLifecycleAction,
     * WaitingForInstanceWarmup, Successful, Failed, Cancelled
     */
    private String statusCode;

    /**
     * <p>
     * A friendly, more verbose description of the activity status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String statusMessage;

    /**
     * <p>
     * A value between 0 and 100 that indicates the progress of the activity.
     * </p>
     */
    private Integer progress;

    /**
     * <p>
     * The details about the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String details;

    /**
     * <p>
     * The ID of the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the activity.
     *         </p>
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * <p>
     * The ID of the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param activityId <p>
     *            The ID of the activity.
     *            </p>
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * <p>
     * The ID of the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param activityId <p>
     *            The ID of the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
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
    public Activity withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A friendly, more verbose description of the activity.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A friendly, more verbose description of the activity.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A friendly, more verbose description of the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The reason the activity began.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The reason the activity began.
     *         </p>
     */
    public String getCause() {
        return cause;
    }

    /**
     * <p>
     * The reason the activity began.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param cause <p>
     *            The reason the activity began.
     *            </p>
     */
    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * The reason the activity began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param cause <p>
     *            The reason the activity began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withCause(String cause) {
        this.cause = cause;
        return this;
    }

    /**
     * <p>
     * The start time of the activity.
     * </p>
     *
     * @return <p>
     *         The start time of the activity.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start time of the activity.
     * </p>
     *
     * @param startTime <p>
     *            The start time of the activity.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start time of the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end time of the activity.
     * </p>
     *
     * @return <p>
     *         The end time of the activity.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end time of the activity.
     * </p>
     *
     * @param endTime <p>
     *            The end time of the activity.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end time of the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The current status of the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingSpotBidPlacement,
     * WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId,
     * WaitingForInstanceId, PreInService, InProgress,
     * WaitingForELBConnectionDraining, MidLifecycleAction,
     * WaitingForInstanceWarmup, Successful, Failed, Cancelled
     *
     * @return <p>
     *         The current status of the activity.
     *         </p>
     * @see ScalingActivityStatusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The current status of the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingSpotBidPlacement,
     * WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId,
     * WaitingForInstanceId, PreInService, InProgress,
     * WaitingForELBConnectionDraining, MidLifecycleAction,
     * WaitingForInstanceWarmup, Successful, Failed, Cancelled
     *
     * @param statusCode <p>
     *            The current status of the activity.
     *            </p>
     * @see ScalingActivityStatusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The current status of the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingSpotBidPlacement,
     * WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId,
     * WaitingForInstanceId, PreInService, InProgress,
     * WaitingForELBConnectionDraining, MidLifecycleAction,
     * WaitingForInstanceWarmup, Successful, Failed, Cancelled
     *
     * @param statusCode <p>
     *            The current status of the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScalingActivityStatusCode
     */
    public Activity withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * The current status of the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingSpotBidPlacement,
     * WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId,
     * WaitingForInstanceId, PreInService, InProgress,
     * WaitingForELBConnectionDraining, MidLifecycleAction,
     * WaitingForInstanceWarmup, Successful, Failed, Cancelled
     *
     * @param statusCode <p>
     *            The current status of the activity.
     *            </p>
     * @see ScalingActivityStatusCode
     */
    public void setStatusCode(ScalingActivityStatusCode statusCode) {
        this.statusCode = statusCode.toString();
    }

    /**
     * <p>
     * The current status of the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingSpotBidPlacement,
     * WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId,
     * WaitingForInstanceId, PreInService, InProgress,
     * WaitingForELBConnectionDraining, MidLifecycleAction,
     * WaitingForInstanceWarmup, Successful, Failed, Cancelled
     *
     * @param statusCode <p>
     *            The current status of the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScalingActivityStatusCode
     */
    public Activity withStatusCode(ScalingActivityStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A friendly, more verbose description of the activity status.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param statusMessage <p>
     *            A friendly, more verbose description of the activity status.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity status.
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
     * @param statusMessage <p>
     *            A friendly, more verbose description of the activity status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * A value between 0 and 100 that indicates the progress of the activity.
     * </p>
     *
     * @return <p>
     *         A value between 0 and 100 that indicates the progress of the
     *         activity.
     *         </p>
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * <p>
     * A value between 0 and 100 that indicates the progress of the activity.
     * </p>
     *
     * @param progress <p>
     *            A value between 0 and 100 that indicates the progress of the
     *            activity.
     *            </p>
     */
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * A value between 0 and 100 that indicates the progress of the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            A value between 0 and 100 that indicates the progress of the
     *            activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * The details about the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The details about the activity.
     *         </p>
     */
    public String getDetails() {
        return details;
    }

    /**
     * <p>
     * The details about the activity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param details <p>
     *            The details about the activity.
     *            </p>
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * The details about the activity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param details <p>
     *            The details about the activity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Activity withDetails(String details) {
        this.details = details;
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
        if (getActivityId() != null)
            sb.append("ActivityId: " + getActivityId() + ",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCause() != null)
            sb.append("Cause: " + getCause() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Activity == false)
            return false;
        Activity other = (Activity) obj;

        if (other.getActivityId() == null ^ this.getActivityId() == null)
            return false;
        if (other.getActivityId() != null
                && other.getActivityId().equals(this.getActivityId()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
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
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }
}
