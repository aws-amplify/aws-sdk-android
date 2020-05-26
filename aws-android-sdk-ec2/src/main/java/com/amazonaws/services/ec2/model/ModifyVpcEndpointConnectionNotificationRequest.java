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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies a connection notification for VPC endpoint or VPC endpoint service.
 * You can change the SNS topic for the notification, or the events for which to
 * be notified.
 * </p>
 */
public class ModifyVpcEndpointConnectionNotificationRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID of the notification.
     * </p>
     */
    private String connectionNotificationId;

    /**
     * <p>
     * The ARN for the SNS topic for the notification.
     * </p>
     */
    private String connectionNotificationArn;

    /**
     * <p>
     * One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     */
    private java.util.List<String> connectionEvents;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointConnectionNotificationRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the notification.
     * </p>
     *
     * @return <p>
     *         The ID of the notification.
     *         </p>
     */
    public String getConnectionNotificationId() {
        return connectionNotificationId;
    }

    /**
     * <p>
     * The ID of the notification.
     * </p>
     *
     * @param connectionNotificationId <p>
     *            The ID of the notification.
     *            </p>
     */
    public void setConnectionNotificationId(String connectionNotificationId) {
        this.connectionNotificationId = connectionNotificationId;
    }

    /**
     * <p>
     * The ID of the notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionNotificationId <p>
     *            The ID of the notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointConnectionNotificationRequest withConnectionNotificationId(
            String connectionNotificationId) {
        this.connectionNotificationId = connectionNotificationId;
        return this;
    }

    /**
     * <p>
     * The ARN for the SNS topic for the notification.
     * </p>
     *
     * @return <p>
     *         The ARN for the SNS topic for the notification.
     *         </p>
     */
    public String getConnectionNotificationArn() {
        return connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN for the SNS topic for the notification.
     * </p>
     *
     * @param connectionNotificationArn <p>
     *            The ARN for the SNS topic for the notification.
     *            </p>
     */
    public void setConnectionNotificationArn(String connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN for the SNS topic for the notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionNotificationArn <p>
     *            The ARN for the SNS topic for the notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointConnectionNotificationRequest withConnectionNotificationArn(
            String connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
        return this;
    }

    /**
     * <p>
     * One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     *
     * @return <p>
     *         One or more events for the endpoint. Valid values are
     *         <code>Accept</code>, <code>Connect</code>, <code>Delete</code>,
     *         and <code>Reject</code>.
     *         </p>
     */
    public java.util.List<String> getConnectionEvents() {
        return connectionEvents;
    }

    /**
     * <p>
     * One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     *
     * @param connectionEvents <p>
     *            One or more events for the endpoint. Valid values are
     *            <code>Accept</code>, <code>Connect</code>, <code>Delete</code>
     *            , and <code>Reject</code>.
     *            </p>
     */
    public void setConnectionEvents(java.util.Collection<String> connectionEvents) {
        if (connectionEvents == null) {
            this.connectionEvents = null;
            return;
        }

        this.connectionEvents = new java.util.ArrayList<String>(connectionEvents);
    }

    /**
     * <p>
     * One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionEvents <p>
     *            One or more events for the endpoint. Valid values are
     *            <code>Accept</code>, <code>Connect</code>, <code>Delete</code>
     *            , and <code>Reject</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointConnectionNotificationRequest withConnectionEvents(
            String... connectionEvents) {
        if (getConnectionEvents() == null) {
            this.connectionEvents = new java.util.ArrayList<String>(connectionEvents.length);
        }
        for (String value : connectionEvents) {
            this.connectionEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more events for the endpoint. Valid values are <code>Accept</code>, <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionEvents <p>
     *            One or more events for the endpoint. Valid values are
     *            <code>Accept</code>, <code>Connect</code>, <code>Delete</code>
     *            , and <code>Reject</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcEndpointConnectionNotificationRequest withConnectionEvents(
            java.util.Collection<String> connectionEvents) {
        setConnectionEvents(connectionEvents);
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getConnectionNotificationId() != null)
            sb.append("ConnectionNotificationId: " + getConnectionNotificationId() + ",");
        if (getConnectionNotificationArn() != null)
            sb.append("ConnectionNotificationArn: " + getConnectionNotificationArn() + ",");
        if (getConnectionEvents() != null)
            sb.append("ConnectionEvents: " + getConnectionEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionNotificationId() == null) ? 0 : getConnectionNotificationId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionNotificationArn() == null) ? 0 : getConnectionNotificationArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getConnectionEvents() == null) ? 0 : getConnectionEvents().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcEndpointConnectionNotificationRequest == false)
            return false;
        ModifyVpcEndpointConnectionNotificationRequest other = (ModifyVpcEndpointConnectionNotificationRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getConnectionNotificationId() == null
                ^ this.getConnectionNotificationId() == null)
            return false;
        if (other.getConnectionNotificationId() != null
                && other.getConnectionNotificationId().equals(this.getConnectionNotificationId()) == false)
            return false;
        if (other.getConnectionNotificationArn() == null
                ^ this.getConnectionNotificationArn() == null)
            return false;
        if (other.getConnectionNotificationArn() != null
                && other.getConnectionNotificationArn().equals(this.getConnectionNotificationArn()) == false)
            return false;
        if (other.getConnectionEvents() == null ^ this.getConnectionEvents() == null)
            return false;
        if (other.getConnectionEvents() != null
                && other.getConnectionEvents().equals(this.getConnectionEvents()) == false)
            return false;
        return true;
    }
}
