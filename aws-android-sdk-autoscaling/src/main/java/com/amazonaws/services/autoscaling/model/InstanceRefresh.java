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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an instance refresh for an Auto Scaling group.
 * </p>
 */
public class InstanceRefresh implements Serializable {
    /**
     * <p>
     * The instance refresh ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceRefreshId;

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
     * The current status for the instance refresh operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can
     * troubleshoot using the status reason and the scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled.
     * Cancellation does not roll back any replacements that have already been
     * completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Successful, Failed,
     * Cancelling, Cancelled
     */
    private String status;

    /**
     * <p>
     * Provides more details about the current status of the instance refresh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String statusReason;

    /**
     * <p>
     * The date and time at which the instance refresh began.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The date and time at which the instance refresh ended.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The percentage of the instance refresh that is complete. For each
     * instance replacement, Amazon EC2 Auto Scaling tracks the instance's
     * health status and warm-up time. When the instance's health status changes
     * to healthy and the specified warm-up time passes, the instance is
     * considered updated and added to the percentage complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer percentageComplete;

    /**
     * <p>
     * The number of instances remaining to update before the instance refresh
     * is complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer instancesToUpdate;

    /**
     * <p>
     * The instance refresh ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The instance refresh ID.
     *         </p>
     */
    public String getInstanceRefreshId() {
        return instanceRefreshId;
    }

    /**
     * <p>
     * The instance refresh ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceRefreshId <p>
     *            The instance refresh ID.
     *            </p>
     */
    public void setInstanceRefreshId(String instanceRefreshId) {
        this.instanceRefreshId = instanceRefreshId;
    }

    /**
     * <p>
     * The instance refresh ID.
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
     * @param instanceRefreshId <p>
     *            The instance refresh ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceRefresh withInstanceRefreshId(String instanceRefreshId) {
        this.instanceRefreshId = instanceRefreshId;
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
    public InstanceRefresh withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The current status for the instance refresh operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can
     * troubleshoot using the status reason and the scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled.
     * Cancellation does not roll back any replacements that have already been
     * completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Successful, Failed,
     * Cancelling, Cancelled
     *
     * @return <p>
     *         The current status for the instance refresh operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Pending</code> - The request was created, but the operation
     *         has not started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InProgress</code> - The operation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Successful</code> - The operation completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The operation failed to complete. You can
     *         troubleshoot using the status reason and the scaling activities.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Cancelling</code> - An ongoing operation is being
     *         cancelled. Cancellation does not roll back any replacements that
     *         have already been completed, but it prevents new replacements
     *         from being started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Cancelled</code> - The operation is cancelled.
     *         </p>
     *         </li>
     *         </ul>
     * @see InstanceRefreshStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status for the instance refresh operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can
     * troubleshoot using the status reason and the scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled.
     * Cancellation does not roll back any replacements that have already been
     * completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Successful, Failed,
     * Cancelling, Cancelled
     *
     * @param status <p>
     *            The current status for the instance refresh operation:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Pending</code> - The request was created, but the
     *            operation has not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The operation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Successful</code> - The operation completed
     *            successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The operation failed to complete. You
     *            can troubleshoot using the status reason and the scaling
     *            activities.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Cancelling</code> - An ongoing operation is being
     *            cancelled. Cancellation does not roll back any replacements
     *            that have already been completed, but it prevents new
     *            replacements from being started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Cancelled</code> - The operation is cancelled.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceRefreshStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status for the instance refresh operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can
     * troubleshoot using the status reason and the scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled.
     * Cancellation does not roll back any replacements that have already been
     * completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Successful, Failed,
     * Cancelling, Cancelled
     *
     * @param status <p>
     *            The current status for the instance refresh operation:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Pending</code> - The request was created, but the
     *            operation has not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The operation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Successful</code> - The operation completed
     *            successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The operation failed to complete. You
     *            can troubleshoot using the status reason and the scaling
     *            activities.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Cancelling</code> - An ongoing operation is being
     *            cancelled. Cancellation does not roll back any replacements
     *            that have already been completed, but it prevents new
     *            replacements from being started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Cancelled</code> - The operation is cancelled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceRefreshStatus
     */
    public InstanceRefresh withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status for the instance refresh operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can
     * troubleshoot using the status reason and the scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled.
     * Cancellation does not roll back any replacements that have already been
     * completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Successful, Failed,
     * Cancelling, Cancelled
     *
     * @param status <p>
     *            The current status for the instance refresh operation:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Pending</code> - The request was created, but the
     *            operation has not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The operation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Successful</code> - The operation completed
     *            successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The operation failed to complete. You
     *            can troubleshoot using the status reason and the scaling
     *            activities.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Cancelling</code> - An ongoing operation is being
     *            cancelled. Cancellation does not roll back any replacements
     *            that have already been completed, but it prevents new
     *            replacements from being started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Cancelled</code> - The operation is cancelled.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceRefreshStatus
     */
    public void setStatus(InstanceRefreshStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status for the instance refresh operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Pending</code> - The request was created, but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Successful</code> - The operation completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The operation failed to complete. You can
     * troubleshoot using the status reason and the scaling activities.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelling</code> - An ongoing operation is being cancelled.
     * Cancellation does not roll back any replacements that have already been
     * completed, but it prevents new replacements from being started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - The operation is cancelled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InProgress, Successful, Failed,
     * Cancelling, Cancelled
     *
     * @param status <p>
     *            The current status for the instance refresh operation:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Pending</code> - The request was created, but the
     *            operation has not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The operation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Successful</code> - The operation completed
     *            successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The operation failed to complete. You
     *            can troubleshoot using the status reason and the scaling
     *            activities.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Cancelling</code> - An ongoing operation is being
     *            cancelled. Cancellation does not roll back any replacements
     *            that have already been completed, but it prevents new
     *            replacements from being started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Cancelled</code> - The operation is cancelled.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceRefreshStatus
     */
    public InstanceRefresh withStatus(InstanceRefreshStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Provides more details about the current status of the instance refresh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Provides more details about the current status of the instance
     *         refresh.
     *         </p>
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * Provides more details about the current status of the instance refresh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param statusReason <p>
     *            Provides more details about the current status of the instance
     *            refresh.
     *            </p>
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Provides more details about the current status of the instance refresh.
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
     * @param statusReason <p>
     *            Provides more details about the current status of the instance
     *            refresh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceRefresh withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * The date and time at which the instance refresh began.
     * </p>
     *
     * @return <p>
     *         The date and time at which the instance refresh began.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The date and time at which the instance refresh began.
     * </p>
     *
     * @param startTime <p>
     *            The date and time at which the instance refresh began.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time at which the instance refresh began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The date and time at which the instance refresh began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceRefresh withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The date and time at which the instance refresh ended.
     * </p>
     *
     * @return <p>
     *         The date and time at which the instance refresh ended.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The date and time at which the instance refresh ended.
     * </p>
     *
     * @param endTime <p>
     *            The date and time at which the instance refresh ended.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time at which the instance refresh ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The date and time at which the instance refresh ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceRefresh withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The percentage of the instance refresh that is complete. For each
     * instance replacement, Amazon EC2 Auto Scaling tracks the instance's
     * health status and warm-up time. When the instance's health status changes
     * to healthy and the specified warm-up time passes, the instance is
     * considered updated and added to the percentage complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The percentage of the instance refresh that is complete. For each
     *         instance replacement, Amazon EC2 Auto Scaling tracks the
     *         instance's health status and warm-up time. When the instance's
     *         health status changes to healthy and the specified warm-up time
     *         passes, the instance is considered updated and added to the
     *         percentage complete.
     *         </p>
     */
    public Integer getPercentageComplete() {
        return percentageComplete;
    }

    /**
     * <p>
     * The percentage of the instance refresh that is complete. For each
     * instance replacement, Amazon EC2 Auto Scaling tracks the instance's
     * health status and warm-up time. When the instance's health status changes
     * to healthy and the specified warm-up time passes, the instance is
     * considered updated and added to the percentage complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param percentageComplete <p>
     *            The percentage of the instance refresh that is complete. For
     *            each instance replacement, Amazon EC2 Auto Scaling tracks the
     *            instance's health status and warm-up time. When the instance's
     *            health status changes to healthy and the specified warm-up
     *            time passes, the instance is considered updated and added to
     *            the percentage complete.
     *            </p>
     */
    public void setPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    /**
     * <p>
     * The percentage of the instance refresh that is complete. For each
     * instance replacement, Amazon EC2 Auto Scaling tracks the instance's
     * health status and warm-up time. When the instance's health status changes
     * to healthy and the specified warm-up time passes, the instance is
     * considered updated and added to the percentage complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param percentageComplete <p>
     *            The percentage of the instance refresh that is complete. For
     *            each instance replacement, Amazon EC2 Auto Scaling tracks the
     *            instance's health status and warm-up time. When the instance's
     *            health status changes to healthy and the specified warm-up
     *            time passes, the instance is considered updated and added to
     *            the percentage complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceRefresh withPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
        return this;
    }

    /**
     * <p>
     * The number of instances remaining to update before the instance refresh
     * is complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of instances remaining to update before the instance
     *         refresh is complete.
     *         </p>
     */
    public Integer getInstancesToUpdate() {
        return instancesToUpdate;
    }

    /**
     * <p>
     * The number of instances remaining to update before the instance refresh
     * is complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param instancesToUpdate <p>
     *            The number of instances remaining to update before the
     *            instance refresh is complete.
     *            </p>
     */
    public void setInstancesToUpdate(Integer instancesToUpdate) {
        this.instancesToUpdate = instancesToUpdate;
    }

    /**
     * <p>
     * The number of instances remaining to update before the instance refresh
     * is complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param instancesToUpdate <p>
     *            The number of instances remaining to update before the
     *            instance refresh is complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceRefresh withInstancesToUpdate(Integer instancesToUpdate) {
        this.instancesToUpdate = instancesToUpdate;
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
        if (getInstanceRefreshId() != null)
            sb.append("InstanceRefreshId: " + getInstanceRefreshId() + ",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusReason() != null)
            sb.append("StatusReason: " + getStatusReason() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getPercentageComplete() != null)
            sb.append("PercentageComplete: " + getPercentageComplete() + ",");
        if (getInstancesToUpdate() != null)
            sb.append("InstancesToUpdate: " + getInstancesToUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceRefreshId() == null) ? 0 : getInstanceRefreshId().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getPercentageComplete() == null) ? 0 : getPercentageComplete().hashCode());
        hashCode = prime * hashCode
                + ((getInstancesToUpdate() == null) ? 0 : getInstancesToUpdate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceRefresh == false)
            return false;
        InstanceRefresh other = (InstanceRefresh) obj;

        if (other.getInstanceRefreshId() == null ^ this.getInstanceRefreshId() == null)
            return false;
        if (other.getInstanceRefreshId() != null
                && other.getInstanceRefreshId().equals(this.getInstanceRefreshId()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
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
        if (other.getPercentageComplete() == null ^ this.getPercentageComplete() == null)
            return false;
        if (other.getPercentageComplete() != null
                && other.getPercentageComplete().equals(this.getPercentageComplete()) == false)
            return false;
        if (other.getInstancesToUpdate() == null ^ this.getInstancesToUpdate() == null)
            return false;
        if (other.getInstancesToUpdate() != null
                && other.getInstancesToUpdate().equals(this.getInstancesToUpdate()) == false)
            return false;
        return true;
    }
}
