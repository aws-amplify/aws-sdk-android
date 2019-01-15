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
 * Given an identity (an email address or a domain), sets whether Amazon SES
 * includes the original email headers in the Amazon Simple Notification Service
 * (Amazon SNS) notifications of a specified type.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 * <p>
 * For more information about using notifications with Amazon SES, see the <a
 * href
 * ="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class SetIdentityHeadersInNotificationsEnabledRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The identity for which to enable or disable headers in notifications.
     * Examples: <code>user@example.com</code>, <code>example.com</code>.
     * </p>
     */
    private String identity;

    /**
     * <p>
     * The notification type for which to enable or disable headers in
     * notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     */
    private String notificationType;

    /**
     * <p>
     * Sets whether Amazon SES includes the original email headers in Amazon SNS
     * notifications of the specified notification type. A value of
     * <code>true</code> specifies that Amazon SES will include headers in
     * notifications, and a value of <code>false</code> specifies that Amazon
     * SES will not include headers in notifications.
     * </p>
     * <p>
     * This value can only be set when <code>NotificationType</code> is already
     * set to use a particular Amazon SNS topic.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The identity for which to enable or disable headers in notifications.
     * Examples: <code>user@example.com</code>, <code>example.com</code>.
     * </p>
     *
     * @return <p>
     *         The identity for which to enable or disable headers in
     *         notifications. Examples: <code>user@example.com</code>,
     *         <code>example.com</code>.
     *         </p>
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * <p>
     * The identity for which to enable or disable headers in notifications.
     * Examples: <code>user@example.com</code>, <code>example.com</code>.
     * </p>
     *
     * @param identity <p>
     *            The identity for which to enable or disable headers in
     *            notifications. Examples: <code>user@example.com</code>,
     *            <code>example.com</code>.
     *            </p>
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity for which to enable or disable headers in notifications.
     * Examples: <code>user@example.com</code>, <code>example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identity <p>
     *            The identity for which to enable or disable headers in
     *            notifications. Examples: <code>user@example.com</code>,
     *            <code>example.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetIdentityHeadersInNotificationsEnabledRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * <p>
     * The notification type for which to enable or disable headers in
     * notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     *
     * @return <p>
     *         The notification type for which to enable or disable headers in
     *         notifications.
     *         </p>
     * @see NotificationType
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * <p>
     * The notification type for which to enable or disable headers in
     * notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     *
     * @param notificationType <p>
     *            The notification type for which to enable or disable headers
     *            in notifications.
     *            </p>
     * @see NotificationType
     */
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * <p>
     * The notification type for which to enable or disable headers in
     * notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     *
     * @param notificationType <p>
     *            The notification type for which to enable or disable headers
     *            in notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotificationType
     */
    public SetIdentityHeadersInNotificationsEnabledRequest withNotificationType(
            String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * <p>
     * The notification type for which to enable or disable headers in
     * notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     *
     * @param notificationType <p>
     *            The notification type for which to enable or disable headers
     *            in notifications.
     *            </p>
     * @see NotificationType
     */
    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
    }

    /**
     * <p>
     * The notification type for which to enable or disable headers in
     * notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Bounce, Complaint, Delivery
     *
     * @param notificationType <p>
     *            The notification type for which to enable or disable headers
     *            in notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotificationType
     */
    public SetIdentityHeadersInNotificationsEnabledRequest withNotificationType(
            NotificationType notificationType) {
        this.notificationType = notificationType.toString();
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SES includes the original email headers in Amazon SNS
     * notifications of the specified notification type. A value of
     * <code>true</code> specifies that Amazon SES will include headers in
     * notifications, and a value of <code>false</code> specifies that Amazon
     * SES will not include headers in notifications.
     * </p>
     * <p>
     * This value can only be set when <code>NotificationType</code> is already
     * set to use a particular Amazon SNS topic.
     * </p>
     *
     * @return <p>
     *         Sets whether Amazon SES includes the original email headers in
     *         Amazon SNS notifications of the specified notification type. A
     *         value of <code>true</code> specifies that Amazon SES will include
     *         headers in notifications, and a value of <code>false</code>
     *         specifies that Amazon SES will not include headers in
     *         notifications.
     *         </p>
     *         <p>
     *         This value can only be set when <code>NotificationType</code> is
     *         already set to use a particular Amazon SNS topic.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES includes the original email headers in Amazon SNS
     * notifications of the specified notification type. A value of
     * <code>true</code> specifies that Amazon SES will include headers in
     * notifications, and a value of <code>false</code> specifies that Amazon
     * SES will not include headers in notifications.
     * </p>
     * <p>
     * This value can only be set when <code>NotificationType</code> is already
     * set to use a particular Amazon SNS topic.
     * </p>
     *
     * @return <p>
     *         Sets whether Amazon SES includes the original email headers in
     *         Amazon SNS notifications of the specified notification type. A
     *         value of <code>true</code> specifies that Amazon SES will include
     *         headers in notifications, and a value of <code>false</code>
     *         specifies that Amazon SES will not include headers in
     *         notifications.
     *         </p>
     *         <p>
     *         This value can only be set when <code>NotificationType</code> is
     *         already set to use a particular Amazon SNS topic.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES includes the original email headers in Amazon SNS
     * notifications of the specified notification type. A value of
     * <code>true</code> specifies that Amazon SES will include headers in
     * notifications, and a value of <code>false</code> specifies that Amazon
     * SES will not include headers in notifications.
     * </p>
     * <p>
     * This value can only be set when <code>NotificationType</code> is already
     * set to use a particular Amazon SNS topic.
     * </p>
     *
     * @param enabled <p>
     *            Sets whether Amazon SES includes the original email headers in
     *            Amazon SNS notifications of the specified notification type. A
     *            value of <code>true</code> specifies that Amazon SES will
     *            include headers in notifications, and a value of
     *            <code>false</code> specifies that Amazon SES will not include
     *            headers in notifications.
     *            </p>
     *            <p>
     *            This value can only be set when <code>NotificationType</code>
     *            is already set to use a particular Amazon SNS topic.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES includes the original email headers in Amazon SNS
     * notifications of the specified notification type. A value of
     * <code>true</code> specifies that Amazon SES will include headers in
     * notifications, and a value of <code>false</code> specifies that Amazon
     * SES will not include headers in notifications.
     * </p>
     * <p>
     * This value can only be set when <code>NotificationType</code> is already
     * set to use a particular Amazon SNS topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Sets whether Amazon SES includes the original email headers in
     *            Amazon SNS notifications of the specified notification type. A
     *            value of <code>true</code> specifies that Amazon SES will
     *            include headers in notifications, and a value of
     *            <code>false</code> specifies that Amazon SES will not include
     *            headers in notifications.
     *            </p>
     *            <p>
     *            This value can only be set when <code>NotificationType</code>
     *            is already set to use a particular Amazon SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetIdentityHeadersInNotificationsEnabledRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
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
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIdentityHeadersInNotificationsEnabledRequest == false)
            return false;
        SetIdentityHeadersInNotificationsEnabledRequest other = (SetIdentityHeadersInNotificationsEnabledRequest) obj;

        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getNotificationType() == null ^ this.getNotificationType() == null)
            return false;
        if (other.getNotificationType() != null
                && other.getNotificationType().equals(this.getNotificationType()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
