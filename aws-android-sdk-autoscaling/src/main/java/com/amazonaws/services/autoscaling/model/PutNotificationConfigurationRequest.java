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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Configures an Auto Scaling group to send notifications when specified events
 * take place. Subscribers to the specified topic can have messages delivered to
 * an endpoint such as a web server or an email address.
 * </p>
 * <p>
 * This configuration overwrites any existing configuration.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html"
 * >Getting SNS Notifications When Your Auto Scaling Group Scales</a> in the
 * <i>Auto Scaling User Guide</i>.
 * </p>
 */
public class PutNotificationConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
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
     * (Amazon SNS) topic.
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
     * The type of event that causes the notification to be sent. For more
     * information about notification types supported by Amazon EC2 Auto
     * Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * </p>
     */
    private java.util.List<String> notificationTypes = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
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
     * <b>Length: </b>1 - 1600<br/>
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
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutNotificationConfigurationRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (Amazon SNS) topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *         Service (Amazon SNS) topic.
     *         </p>
     */
    public String getTopicARN() {
        return topicARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (Amazon SNS) topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param topicARN <p>
     *            The Amazon Resource Name (ARN) of the Amazon Simple
     *            Notification Service (Amazon SNS) topic.
     *            </p>
     */
    public void setTopicARN(String topicARN) {
        this.topicARN = topicARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service
     * (Amazon SNS) topic.
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
     *            Notification Service (Amazon SNS) topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutNotificationConfigurationRequest withTopicARN(String topicARN) {
        this.topicARN = topicARN;
        return this;
    }

    /**
     * <p>
     * The type of event that causes the notification to be sent. For more
     * information about notification types supported by Amazon EC2 Auto
     * Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * </p>
     *
     * @return <p>
     *         The type of event that causes the notification to be sent. For
     *         more information about notification types supported by Amazon EC2
     *         Auto Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     *         </p>
     */
    public java.util.List<String> getNotificationTypes() {
        return notificationTypes;
    }

    /**
     * <p>
     * The type of event that causes the notification to be sent. For more
     * information about notification types supported by Amazon EC2 Auto
     * Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * </p>
     *
     * @param notificationTypes <p>
     *            The type of event that causes the notification to be sent. For
     *            more information about notification types supported by Amazon
     *            EC2 Auto Scaling, see
     *            <a>DescribeAutoScalingNotificationTypes</a>.
     *            </p>
     */
    public void setNotificationTypes(java.util.Collection<String> notificationTypes) {
        if (notificationTypes == null) {
            this.notificationTypes = null;
            return;
        }

        this.notificationTypes = new java.util.ArrayList<String>(notificationTypes);
    }

    /**
     * <p>
     * The type of event that causes the notification to be sent. For more
     * information about notification types supported by Amazon EC2 Auto
     * Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationTypes <p>
     *            The type of event that causes the notification to be sent. For
     *            more information about notification types supported by Amazon
     *            EC2 Auto Scaling, see
     *            <a>DescribeAutoScalingNotificationTypes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutNotificationConfigurationRequest withNotificationTypes(String... notificationTypes) {
        if (getNotificationTypes() == null) {
            this.notificationTypes = new java.util.ArrayList<String>(notificationTypes.length);
        }
        for (String value : notificationTypes) {
            this.notificationTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type of event that causes the notification to be sent. For more
     * information about notification types supported by Amazon EC2 Auto
     * Scaling, see <a>DescribeAutoScalingNotificationTypes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationTypes <p>
     *            The type of event that causes the notification to be sent. For
     *            more information about notification types supported by Amazon
     *            EC2 Auto Scaling, see
     *            <a>DescribeAutoScalingNotificationTypes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutNotificationConfigurationRequest withNotificationTypes(
            java.util.Collection<String> notificationTypes) {
        setNotificationTypes(notificationTypes);
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
        if (getNotificationTypes() != null)
            sb.append("NotificationTypes: " + getNotificationTypes());
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
                + ((getNotificationTypes() == null) ? 0 : getNotificationTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutNotificationConfigurationRequest == false)
            return false;
        PutNotificationConfigurationRequest other = (PutNotificationConfigurationRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getTopicARN() == null ^ this.getTopicARN() == null)
            return false;
        if (other.getTopicARN() != null && other.getTopicARN().equals(this.getTopicARN()) == false)
            return false;
        if (other.getNotificationTypes() == null ^ this.getNotificationTypes() == null)
            return false;
        if (other.getNotificationTypes() != null
                && other.getNotificationTypes().equals(this.getNotificationTypes()) == false)
            return false;
        return true;
    }
}
