/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * The channel membership preferences for push notification.
 * </p>
 */
public class PushNotificationPreferences implements Serializable {
    /**
     * <p>
     * Enum value that indicates which push notifications to send to the
     * requested member of a channel. <code>ALL</code> sends all push
     * notifications, <code>NONE</code> sends no push notifications,
     * <code>FILTERED</code> sends only filtered push notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE, FILTERED
     */
    private String allowNotifications;

    /**
     * <p>
     * The simple JSON object used to send a subset of a push notification to
     * the requsted member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String filterRule;

    /**
     * <p>
     * Enum value that indicates which push notifications to send to the
     * requested member of a channel. <code>ALL</code> sends all push
     * notifications, <code>NONE</code> sends no push notifications,
     * <code>FILTERED</code> sends only filtered push notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE, FILTERED
     *
     * @return <p>
     *         Enum value that indicates which push notifications to send to the
     *         requested member of a channel. <code>ALL</code> sends all push
     *         notifications, <code>NONE</code> sends no push notifications,
     *         <code>FILTERED</code> sends only filtered push notifications.
     *         </p>
     * @see AllowNotifications
     */
    public String getAllowNotifications() {
        return allowNotifications;
    }

    /**
     * <p>
     * Enum value that indicates which push notifications to send to the
     * requested member of a channel. <code>ALL</code> sends all push
     * notifications, <code>NONE</code> sends no push notifications,
     * <code>FILTERED</code> sends only filtered push notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE, FILTERED
     *
     * @param allowNotifications <p>
     *            Enum value that indicates which push notifications to send to
     *            the requested member of a channel. <code>ALL</code> sends all
     *            push notifications, <code>NONE</code> sends no push
     *            notifications, <code>FILTERED</code> sends only filtered push
     *            notifications.
     *            </p>
     * @see AllowNotifications
     */
    public void setAllowNotifications(String allowNotifications) {
        this.allowNotifications = allowNotifications;
    }

    /**
     * <p>
     * Enum value that indicates which push notifications to send to the
     * requested member of a channel. <code>ALL</code> sends all push
     * notifications, <code>NONE</code> sends no push notifications,
     * <code>FILTERED</code> sends only filtered push notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE, FILTERED
     *
     * @param allowNotifications <p>
     *            Enum value that indicates which push notifications to send to
     *            the requested member of a channel. <code>ALL</code> sends all
     *            push notifications, <code>NONE</code> sends no push
     *            notifications, <code>FILTERED</code> sends only filtered push
     *            notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllowNotifications
     */
    public PushNotificationPreferences withAllowNotifications(String allowNotifications) {
        this.allowNotifications = allowNotifications;
        return this;
    }

    /**
     * <p>
     * Enum value that indicates which push notifications to send to the
     * requested member of a channel. <code>ALL</code> sends all push
     * notifications, <code>NONE</code> sends no push notifications,
     * <code>FILTERED</code> sends only filtered push notifications.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE, FILTERED
     *
     * @param allowNotifications <p>
     *            Enum value that indicates which push notifications to send to
     *            the requested member of a channel. <code>ALL</code> sends all
     *            push notifications, <code>NONE</code> sends no push
     *            notifications, <code>FILTERED</code> sends only filtered push
     *            notifications.
     *            </p>
     * @see AllowNotifications
     */
    public void setAllowNotifications(AllowNotifications allowNotifications) {
        this.allowNotifications = allowNotifications.toString();
    }

    /**
     * <p>
     * Enum value that indicates which push notifications to send to the
     * requested member of a channel. <code>ALL</code> sends all push
     * notifications, <code>NONE</code> sends no push notifications,
     * <code>FILTERED</code> sends only filtered push notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE, FILTERED
     *
     * @param allowNotifications <p>
     *            Enum value that indicates which push notifications to send to
     *            the requested member of a channel. <code>ALL</code> sends all
     *            push notifications, <code>NONE</code> sends no push
     *            notifications, <code>FILTERED</code> sends only filtered push
     *            notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllowNotifications
     */
    public PushNotificationPreferences withAllowNotifications(AllowNotifications allowNotifications) {
        this.allowNotifications = allowNotifications.toString();
        return this;
    }

    /**
     * <p>
     * The simple JSON object used to send a subset of a push notification to
     * the requsted member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The simple JSON object used to send a subset of a push
     *         notification to the requsted member.
     *         </p>
     */
    public String getFilterRule() {
        return filterRule;
    }

    /**
     * <p>
     * The simple JSON object used to send a subset of a push notification to
     * the requsted member.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param filterRule <p>
     *            The simple JSON object used to send a subset of a push
     *            notification to the requsted member.
     *            </p>
     */
    public void setFilterRule(String filterRule) {
        this.filterRule = filterRule;
    }

    /**
     * <p>
     * The simple JSON object used to send a subset of a push notification to
     * the requsted member.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param filterRule <p>
     *            The simple JSON object used to send a subset of a push
     *            notification to the requsted member.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PushNotificationPreferences withFilterRule(String filterRule) {
        this.filterRule = filterRule;
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
        if (getAllowNotifications() != null)
            sb.append("AllowNotifications: " + getAllowNotifications() + ",");
        if (getFilterRule() != null)
            sb.append("FilterRule: " + getFilterRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllowNotifications() == null) ? 0 : getAllowNotifications().hashCode());
        hashCode = prime * hashCode + ((getFilterRule() == null) ? 0 : getFilterRule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PushNotificationPreferences == false)
            return false;
        PushNotificationPreferences other = (PushNotificationPreferences) obj;

        if (other.getAllowNotifications() == null ^ this.getAllowNotifications() == null)
            return false;
        if (other.getAllowNotifications() != null
                && other.getAllowNotifications().equals(this.getAllowNotifications()) == false)
            return false;
        if (other.getFilterRule() == null ^ this.getFilterRule() == null)
            return false;
        if (other.getFilterRule() != null
                && other.getFilterRule().equals(this.getFilterRule()) == false)
            return false;
        return true;
    }
}
