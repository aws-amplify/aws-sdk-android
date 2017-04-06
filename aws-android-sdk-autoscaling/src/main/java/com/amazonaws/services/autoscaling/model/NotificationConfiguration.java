/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a notification.
 * </p>
 */
public class NotificationConfiguration implements Serializable {
    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String topicARN;

    /**
     * <p>
     * One of the following event notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:TEST_NOTIFICATION</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String notificationType;

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group.
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
     * @param autoScalingGroupName <p>
     *            The name of the group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (SNS) topic.
     *         </p>
     */
    public String getTopicARN() {
        return topicARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param topicARN <p>
     *            The Amazon Resource Name (ARN) of the Amazon Simple
     *            Notification Service (SNS) topic.
     *            </p>
     */
    public void setTopicARN(String topicARN) {
        this.topicARN = topicARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (SNS) topic.
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
     * @param topicARN <p>
     *            The Amazon Resource Name (ARN) of the Amazon Simple
     *            Notification Service (SNS) topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withTopicARN(String topicARN) {
        this.topicARN = topicARN;
        return this;
    }

    /**
     * <p>
     * One of the following event notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:TEST_NOTIFICATION</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         One of the following event notification types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>autoscaling:TEST_NOTIFICATION</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * <p>
     * One of the following event notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:TEST_NOTIFICATION</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param notificationType <p>
     *            One of the following event notification types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling:TEST_NOTIFICATION</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * <p>
     * One of the following event notification types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling:TEST_NOTIFICATION</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param notificationType <p>
     *            One of the following event notification types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>autoscaling:EC2_INSTANCE_LAUNCH</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling:EC2_INSTANCE_LAUNCH_ERROR</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling:EC2_INSTANCE_TERMINATE</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling:EC2_INSTANCE_TERMINATE_ERROR</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling:TEST_NOTIFICATION</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withNotificationType(String notificationType) {
        this.notificationType = notificationType;
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
        if (getTopicARN() != null)
            sb.append("TopicARN: " + getTopicARN() + ",");
        if (getNotificationType() != null)
            sb.append("NotificationType: " + getNotificationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getTopicARN() == null) ? 0 : getTopicARN().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationType() == null) ? 0 : getNotificationType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationConfiguration == false)
            return false;
        NotificationConfiguration other = (NotificationConfiguration) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getTopicARN() == null ^ this.getTopicARN() == null)
            return false;
        if (other.getTopicARN() != null && other.getTopicARN().equals(this.getTopicARN()) == false)
            return false;
        if (other.getNotificationType() == null ^ this.getNotificationType() == null)
            return false;
        if (other.getNotificationType() != null
                && other.getNotificationType().equals(this.getNotificationType()) == false)
            return false;
        return true;
    }
}
