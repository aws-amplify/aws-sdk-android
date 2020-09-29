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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Configurations for sending notifications.</p>
 */
public class NotificationConfig implements Serializable {
    /**
     * <p>An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.</p>
     */
    private String notificationArn;

    /**
     * <p>The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html">Monitoring Systems Manager status changes using Amazon SNS notifications</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    private java.util.List<String> notificationEvents;

    /**
     * <p>Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Invocation
     */
    private String notificationType;

    /**
     * <p>An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.</p>
     *
     * @return <p>An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.</p>
     */
    public String getNotificationArn() {
        return notificationArn;
    }

    /**
     * <p>An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.</p>
     *
     * @param notificationArn <p>An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.</p>
     */
    public void setNotificationArn(String notificationArn) {
        this.notificationArn = notificationArn;
    }

    /**
     * <p>An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationArn <p>An Amazon Resource Name (ARN) for an Amazon Simple Notification Service (Amazon SNS) topic. Run Command pushes notifications about command status changes to this topic.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public NotificationConfig withNotificationArn(String notificationArn) {
        this.notificationArn = notificationArn;
        return this;
    }

    /**
     * <p>The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html">Monitoring Systems Manager status changes using Amazon SNS notifications</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return <p>The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html">Monitoring Systems Manager status changes using Amazon SNS notifications</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public java.util.List<String> getNotificationEvents() {
        return notificationEvents;
    }

    /**
     * <p>The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html">Monitoring Systems Manager status changes using Amazon SNS notifications</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @param notificationEvents <p>The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html">Monitoring Systems Manager status changes using Amazon SNS notifications</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     */
    public void setNotificationEvents(java.util.Collection<String> notificationEvents) {
        if (notificationEvents == null) {
            this.notificationEvents = null;
            return;
        }

        this.notificationEvents = new java.util.ArrayList<String>(notificationEvents);
    }

    /**
     * <p>The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html">Monitoring Systems Manager status changes using Amazon SNS notifications</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationEvents <p>The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html">Monitoring Systems Manager status changes using Amazon SNS notifications</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public NotificationConfig withNotificationEvents(String... notificationEvents) {
        if (getNotificationEvents() == null) {
            this.notificationEvents = new java.util.ArrayList<String>(notificationEvents.length);
        }
        for (String value : notificationEvents) {
            this.notificationEvents.add(value);
        }
        return this;
    }

    /**
     * <p>The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html">Monitoring Systems Manager status changes using Amazon SNS notifications</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationEvents <p>The different events for which you can receive notifications. These events include the following: All (events), InProgress, Success, TimedOut, Cancelled, Failed. To learn more about these events, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html">Monitoring Systems Manager status changes using Amazon SNS notifications</a> in the <i>AWS Systems Manager User Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public NotificationConfig withNotificationEvents(java.util.Collection<String> notificationEvents) {
        setNotificationEvents(notificationEvents);
        return this;
    }

    /**
     * <p>Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Invocation
     *
     * @return <p>Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. </p>
     *
     * @see NotificationType
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * <p>Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Invocation
     *
     * @param notificationType <p>Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. </p>
     *
     * @see NotificationType
     */
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * <p>Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Invocation
     *
     * @param notificationType <p>Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see NotificationType
     */
    public NotificationConfig withNotificationType(String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * <p>Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Invocation
     *
     * @param notificationType <p>Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. </p>
     *
     * @see NotificationType
     */
    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
    }

    /**
     * <p>Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Command, Invocation
     *
     * @param notificationType <p>Command: Receive notification when the status of a command changes. Invocation: For commands sent to multiple instances, receive notification on a per-instance basis when the status of a command changes. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see NotificationType
     */
    public NotificationConfig withNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNotificationArn() != null) sb.append("NotificationArn: " + getNotificationArn() + ",");
        if (getNotificationEvents() != null) sb.append("NotificationEvents: " + getNotificationEvents() + ",");
        if (getNotificationType() != null) sb.append("NotificationType: " + getNotificationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotificationArn() == null) ? 0 : getNotificationArn().hashCode());
        hashCode = prime * hashCode + ((getNotificationEvents() == null) ? 0 : getNotificationEvents().hashCode());
        hashCode = prime * hashCode + ((getNotificationType() == null) ? 0 : getNotificationType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NotificationConfig == false) return false;
        NotificationConfig other = (NotificationConfig)obj;

        if (other.getNotificationArn() == null ^ this.getNotificationArn() == null) return false;
        if (other.getNotificationArn() != null && other.getNotificationArn().equals(this.getNotificationArn()) == false) return false;
        if (other.getNotificationEvents() == null ^ this.getNotificationEvents() == null) return false;
        if (other.getNotificationEvents() != null && other.getNotificationEvents().equals(this.getNotificationEvents()) == false) return false;
        if (other.getNotificationType() == null ^ this.getNotificationType() == null) return false;
        if (other.getNotificationType() != null && other.getNotificationType().equals(this.getNotificationType()) == false) return false;
        return true;
    }
}
