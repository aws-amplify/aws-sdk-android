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
 * Describes a connection notification for a VPC endpoint or VPC endpoint
 * service.
 * </p>
 */
public class ConnectionNotification implements Serializable {
    /**
     * <p>
     * The ID of the notification.
     * </p>
     */
    private String connectionNotificationId;

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     */
    private String serviceId;

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     */
    private String vpcEndpointId;

    /**
     * <p>
     * The type of notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Topic
     */
    private String connectionNotificationType;

    /**
     * <p>
     * The ARN of the SNS topic for the notification.
     * </p>
     */
    private String connectionNotificationArn;

    /**
     * <p>
     * The events for the notification. Valid values are <code>Accept</code>,
     * <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     */
    private java.util.List<String> connectionEvents;

    /**
     * <p>
     * The state of the notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String connectionNotificationState;

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
    public ConnectionNotification withConnectionNotificationId(String connectionNotificationId) {
        this.connectionNotificationId = connectionNotificationId;
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     *
     * @return <p>
     *         The ID of the endpoint service.
     *         </p>
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     *
     * @param serviceId <p>
     *            The ID of the endpoint service.
     *            </p>
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceId <p>
     *            The ID of the endpoint service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionNotification withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC endpoint.
     *         </p>
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     *
     * @param vpcEndpointId <p>
     *            The ID of the VPC endpoint.
     *            </p>
     */
    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointId <p>
     *            The ID of the VPC endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionNotification withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * <p>
     * The type of notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Topic
     *
     * @return <p>
     *         The type of notification.
     *         </p>
     * @see ConnectionNotificationType
     */
    public String getConnectionNotificationType() {
        return connectionNotificationType;
    }

    /**
     * <p>
     * The type of notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Topic
     *
     * @param connectionNotificationType <p>
     *            The type of notification.
     *            </p>
     * @see ConnectionNotificationType
     */
    public void setConnectionNotificationType(String connectionNotificationType) {
        this.connectionNotificationType = connectionNotificationType;
    }

    /**
     * <p>
     * The type of notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Topic
     *
     * @param connectionNotificationType <p>
     *            The type of notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionNotificationType
     */
    public ConnectionNotification withConnectionNotificationType(String connectionNotificationType) {
        this.connectionNotificationType = connectionNotificationType;
        return this;
    }

    /**
     * <p>
     * The type of notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Topic
     *
     * @param connectionNotificationType <p>
     *            The type of notification.
     *            </p>
     * @see ConnectionNotificationType
     */
    public void setConnectionNotificationType(ConnectionNotificationType connectionNotificationType) {
        this.connectionNotificationType = connectionNotificationType.toString();
    }

    /**
     * <p>
     * The type of notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Topic
     *
     * @param connectionNotificationType <p>
     *            The type of notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionNotificationType
     */
    public ConnectionNotification withConnectionNotificationType(
            ConnectionNotificationType connectionNotificationType) {
        this.connectionNotificationType = connectionNotificationType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notification.
     * </p>
     *
     * @return <p>
     *         The ARN of the SNS topic for the notification.
     *         </p>
     */
    public String getConnectionNotificationArn() {
        return connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notification.
     * </p>
     *
     * @param connectionNotificationArn <p>
     *            The ARN of the SNS topic for the notification.
     *            </p>
     */
    public void setConnectionNotificationArn(String connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic for the notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionNotificationArn <p>
     *            The ARN of the SNS topic for the notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionNotification withConnectionNotificationArn(String connectionNotificationArn) {
        this.connectionNotificationArn = connectionNotificationArn;
        return this;
    }

    /**
     * <p>
     * The events for the notification. Valid values are <code>Accept</code>,
     * <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     *
     * @return <p>
     *         The events for the notification. Valid values are
     *         <code>Accept</code>, <code>Connect</code>, <code>Delete</code>,
     *         and <code>Reject</code>.
     *         </p>
     */
    public java.util.List<String> getConnectionEvents() {
        return connectionEvents;
    }

    /**
     * <p>
     * The events for the notification. Valid values are <code>Accept</code>,
     * <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     *
     * @param connectionEvents <p>
     *            The events for the notification. Valid values are
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
     * The events for the notification. Valid values are <code>Accept</code>,
     * <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionEvents <p>
     *            The events for the notification. Valid values are
     *            <code>Accept</code>, <code>Connect</code>, <code>Delete</code>
     *            , and <code>Reject</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionNotification withConnectionEvents(String... connectionEvents) {
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
     * The events for the notification. Valid values are <code>Accept</code>,
     * <code>Connect</code>, <code>Delete</code>, and <code>Reject</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionEvents <p>
     *            The events for the notification. Valid values are
     *            <code>Accept</code>, <code>Connect</code>, <code>Delete</code>
     *            , and <code>Reject</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionNotification withConnectionEvents(java.util.Collection<String> connectionEvents) {
        setConnectionEvents(connectionEvents);
        return this;
    }

    /**
     * <p>
     * The state of the notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         The state of the notification.
     *         </p>
     * @see ConnectionNotificationState
     */
    public String getConnectionNotificationState() {
        return connectionNotificationState;
    }

    /**
     * <p>
     * The state of the notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param connectionNotificationState <p>
     *            The state of the notification.
     *            </p>
     * @see ConnectionNotificationState
     */
    public void setConnectionNotificationState(String connectionNotificationState) {
        this.connectionNotificationState = connectionNotificationState;
    }

    /**
     * <p>
     * The state of the notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param connectionNotificationState <p>
     *            The state of the notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionNotificationState
     */
    public ConnectionNotification withConnectionNotificationState(String connectionNotificationState) {
        this.connectionNotificationState = connectionNotificationState;
        return this;
    }

    /**
     * <p>
     * The state of the notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param connectionNotificationState <p>
     *            The state of the notification.
     *            </p>
     * @see ConnectionNotificationState
     */
    public void setConnectionNotificationState(
            ConnectionNotificationState connectionNotificationState) {
        this.connectionNotificationState = connectionNotificationState.toString();
    }

    /**
     * <p>
     * The state of the notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param connectionNotificationState <p>
     *            The state of the notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionNotificationState
     */
    public ConnectionNotification withConnectionNotificationState(
            ConnectionNotificationState connectionNotificationState) {
        this.connectionNotificationState = connectionNotificationState.toString();
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
        if (getConnectionNotificationId() != null)
            sb.append("ConnectionNotificationId: " + getConnectionNotificationId() + ",");
        if (getServiceId() != null)
            sb.append("ServiceId: " + getServiceId() + ",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: " + getVpcEndpointId() + ",");
        if (getConnectionNotificationType() != null)
            sb.append("ConnectionNotificationType: " + getConnectionNotificationType() + ",");
        if (getConnectionNotificationArn() != null)
            sb.append("ConnectionNotificationArn: " + getConnectionNotificationArn() + ",");
        if (getConnectionEvents() != null)
            sb.append("ConnectionEvents: " + getConnectionEvents() + ",");
        if (getConnectionNotificationState() != null)
            sb.append("ConnectionNotificationState: " + getConnectionNotificationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getConnectionNotificationId() == null) ? 0 : getConnectionNotificationId()
                        .hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode
                + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionNotificationType() == null) ? 0 : getConnectionNotificationType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionNotificationArn() == null) ? 0 : getConnectionNotificationArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getConnectionEvents() == null) ? 0 : getConnectionEvents().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionNotificationState() == null) ? 0
                        : getConnectionNotificationState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionNotification == false)
            return false;
        ConnectionNotification other = (ConnectionNotification) obj;

        if (other.getConnectionNotificationId() == null
                ^ this.getConnectionNotificationId() == null)
            return false;
        if (other.getConnectionNotificationId() != null
                && other.getConnectionNotificationId().equals(this.getConnectionNotificationId()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null
                && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null
                && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getConnectionNotificationType() == null
                ^ this.getConnectionNotificationType() == null)
            return false;
        if (other.getConnectionNotificationType() != null
                && other.getConnectionNotificationType().equals(
                        this.getConnectionNotificationType()) == false)
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
        if (other.getConnectionNotificationState() == null
                ^ this.getConnectionNotificationState() == null)
            return false;
        if (other.getConnectionNotificationState() != null
                && other.getConnectionNotificationState().equals(
                        this.getConnectionNotificationState()) == false)
            return false;
        return true;
    }
}
