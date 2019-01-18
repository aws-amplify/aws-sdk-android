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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when
 * delivering notifications. When you use this operation, you specify a verified
 * identity, such as an email address or domain. When you send an email that
 * uses the chosen identity in the Source field, Amazon SES sends notifications
 * to the topic you specified. You can send bounce, complaint, or delivery
 * notifications (or any combination of the three) to the Amazon SNS topic that
 * you specify.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 * <p>
 * For more information about feedback notification, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class SetIdentityNotificationTopicRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identity (email address or domain) that you want to set the Amazon
     * SNS topic for.
     * </p>
     * <important>
     * <p>
     * You can only specify a verified identity for this parameter.
     * </p>
     * </important>
     * <p>
     * You can specify an identity by using its name or by using its Amazon
     * Resource Name (ARN). The following examples are all valid identities:
     * <code>sender@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     */
    private String identity;

    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon
     * SNS topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     */
    private String notificationType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter
     * is omitted from the request or a null value is passed,
     * <code>SnsTopic</code> is cleared and publishing is disabled.
     * </p>
     */
    private String snsTopic;

    /**
     * <p>
     * The identity (email address or domain) that you want to set the Amazon
     * SNS topic for.
     * </p>
     * <important>
     * <p>
     * You can only specify a verified identity for this parameter.
     * </p>
     * </important>
     * <p>
     * You can specify an identity by using its name or by using its Amazon
     * Resource Name (ARN). The following examples are all valid identities:
     * <code>sender@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     *
     * @return <p>
     *         The identity (email address or domain) that you want to set the
     *         Amazon SNS topic for.
     *         </p>
     *         <important>
     *         <p>
     *         You can only specify a verified identity for this parameter.
     *         </p>
     *         </important>
     *         <p>
     *         You can specify an identity by using its name or by using its
     *         Amazon Resource Name (ARN). The following examples are all valid
     *         identities: <code>sender@example.com</code>,
     *         <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *         .
     *         </p>
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * <p>
     * The identity (email address or domain) that you want to set the Amazon
     * SNS topic for.
     * </p>
     * <important>
     * <p>
     * You can only specify a verified identity for this parameter.
     * </p>
     * </important>
     * <p>
     * You can specify an identity by using its name or by using its Amazon
     * Resource Name (ARN). The following examples are all valid identities:
     * <code>sender@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     *
     * @param identity <p>
     *            The identity (email address or domain) that you want to set
     *            the Amazon SNS topic for.
     *            </p>
     *            <important>
     *            <p>
     *            You can only specify a verified identity for this parameter.
     *            </p>
     *            </important>
     *            <p>
     *            You can specify an identity by using its name or by using its
     *            Amazon Resource Name (ARN). The following examples are all
     *            valid identities: <code>sender@example.com</code>,
     *            <code>example.com</code>,
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            .
     *            </p>
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity (email address or domain) that you want to set the Amazon
     * SNS topic for.
     * </p>
     * <important>
     * <p>
     * You can only specify a verified identity for this parameter.
     * </p>
     * </important>
     * <p>
     * You can specify an identity by using its name or by using its Amazon
     * Resource Name (ARN). The following examples are all valid identities:
     * <code>sender@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identity <p>
     *            The identity (email address or domain) that you want to set
     *            the Amazon SNS topic for.
     *            </p>
     *            <important>
     *            <p>
     *            You can only specify a verified identity for this parameter.
     *            </p>
     *            </important>
     *            <p>
     *            You can specify an identity by using its name or by using its
     *            Amazon Resource Name (ARN). The following examples are all
     *            valid identities: <code>sender@example.com</code>,
     *            <code>example.com</code>,
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetIdentityNotificationTopicRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon
     * SNS topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     *
     * @return <p>
     *         The type of notifications that will be published to the specified
     *         Amazon SNS topic.
     *         </p>
     * @see NotificationType
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon
     * SNS topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     *
     * @param notificationType <p>
     *            The type of notifications that will be published to the
     *            specified Amazon SNS topic.
     *            </p>
     * @see NotificationType
     */
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon
     * SNS topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     *
     * @param notificationType <p>
     *            The type of notifications that will be published to the
     *            specified Amazon SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotificationType
     */
    public SetIdentityNotificationTopicRequest withNotificationType(String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon
     * SNS topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     *
     * @param notificationType <p>
     *            The type of notifications that will be published to the
     *            specified Amazon SNS topic.
     *            </p>
     * @see NotificationType
     */
    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
    }

    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon
     * SNS topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     *
     * @param notificationType <p>
     *            The type of notifications that will be published to the
     *            specified Amazon SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotificationType
     */
    public SetIdentityNotificationTopicRequest withNotificationType(
            NotificationType notificationType) {
        this.notificationType = notificationType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter
     * is omitted from the request or a null value is passed,
     * <code>SnsTopic</code> is cleared and publishing is disabled.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon SNS topic. If the
     *         parameter is omitted from the request or a null value is passed,
     *         <code>SnsTopic</code> is cleared and publishing is disabled.
     *         </p>
     */
    public String getSnsTopic() {
        return snsTopic;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter
     * is omitted from the request or a null value is passed,
     * <code>SnsTopic</code> is cleared and publishing is disabled.
     * </p>
     *
     * @param snsTopic <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS topic. If the
     *            parameter is omitted from the request or a null value is
     *            passed, <code>SnsTopic</code> is cleared and publishing is
     *            disabled.
     *            </p>
     */
    public void setSnsTopic(String snsTopic) {
        this.snsTopic = snsTopic;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter
     * is omitted from the request or a null value is passed,
     * <code>SnsTopic</code> is cleared and publishing is disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snsTopic <p>
     *            The Amazon Resource Name (ARN) of the Amazon SNS topic. If the
     *            parameter is omitted from the request or a null value is
     *            passed, <code>SnsTopic</code> is cleared and publishing is
     *            disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetIdentityNotificationTopicRequest withSnsTopic(String snsTopic) {
        this.snsTopic = snsTopic;
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
        if (getIdentity() != null)
            sb.append("Identity: " + getIdentity() + ",");
        if (getNotificationType() != null)
            sb.append("NotificationType: " + getNotificationType() + ",");
        if (getSnsTopic() != null)
            sb.append("SnsTopic: " + getSnsTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationType() == null) ? 0 : getNotificationType().hashCode());
        hashCode = prime * hashCode + ((getSnsTopic() == null) ? 0 : getSnsTopic().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIdentityNotificationTopicRequest == false)
            return false;
        SetIdentityNotificationTopicRequest other = (SetIdentityNotificationTopicRequest) obj;

        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getNotificationType() == null ^ this.getNotificationType() == null)
            return false;
        if (other.getNotificationType() != null
                && other.getNotificationType().equals(this.getNotificationType()) == false)
            return false;
        if (other.getSnsTopic() == null ^ this.getSnsTopic() == null)
            return false;
        if (other.getSnsTopic() != null && other.getSnsTopic().equals(this.getSnsTopic()) == false)
            return false;
        return true;
    }
}
