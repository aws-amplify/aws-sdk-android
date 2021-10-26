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
 * The channel membership preferences for an <code>AppInstanceUser</code>.
 * </p>
 */
public class ChannelMembershipPreferences implements Serializable {
    /**
     * <p>
     * The push notification configuration of a message.
     * </p>
     */
    private PushNotificationPreferences pushNotifications;

    /**
     * <p>
     * The push notification configuration of a message.
     * </p>
     *
     * @return <p>
     *         The push notification configuration of a message.
     *         </p>
     */
    public PushNotificationPreferences getPushNotifications() {
        return pushNotifications;
    }

    /**
     * <p>
     * The push notification configuration of a message.
     * </p>
     *
     * @param pushNotifications <p>
     *            The push notification configuration of a message.
     *            </p>
     */
    public void setPushNotifications(PushNotificationPreferences pushNotifications) {
        this.pushNotifications = pushNotifications;
    }

    /**
     * <p>
     * The push notification configuration of a message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pushNotifications <p>
     *            The push notification configuration of a message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelMembershipPreferences withPushNotifications(
            PushNotificationPreferences pushNotifications) {
        this.pushNotifications = pushNotifications;
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
        if (getPushNotifications() != null)
            sb.append("PushNotifications: " + getPushNotifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPushNotifications() == null) ? 0 : getPushNotifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelMembershipPreferences == false)
            return false;
        ChannelMembershipPreferences other = (ChannelMembershipPreferences) obj;

        if (other.getPushNotifications() == null ^ this.getPushNotifications() == null)
            return false;
        if (other.getPushNotifications() != null
                && other.getPushNotifications().equals(this.getPushNotifications()) == false)
            return false;
        return true;
    }
}
