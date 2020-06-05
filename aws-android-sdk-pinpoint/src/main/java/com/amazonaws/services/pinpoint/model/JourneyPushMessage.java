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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the message configuration for a push notification that's sent to
 * participants in a journey.
 * </p>
 */
public class JourneyPushMessage implements Serializable {
    /**
     * <p>
     * The number of seconds that the push notification service should keep the
     * message, if the service is unable to deliver the notification the first
     * time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon
     * Device Messaging (ADM) service.
     * </p>
     */
    private String timeToLive;

    /**
     * <p>
     * The number of seconds that the push notification service should keep the
     * message, if the service is unable to deliver the notification the first
     * time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon
     * Device Messaging (ADM) service.
     * </p>
     *
     * @return <p>
     *         The number of seconds that the push notification service should
     *         keep the message, if the service is unable to deliver the
     *         notification the first time. This value is converted to an
     *         expiration value when it's sent to a push-notification service.
     *         If this value is 0, the service treats the notification as if it
     *         expires immediately and the service doesn't store or try to
     *         deliver the notification again.
     *         </p>
     *         <p>
     *         This value doesn't apply to messages that are sent through the
     *         Amazon Device Messaging (ADM) service.
     *         </p>
     */
    public String getTimeToLive() {
        return timeToLive;
    }

    /**
     * <p>
     * The number of seconds that the push notification service should keep the
     * message, if the service is unable to deliver the notification the first
     * time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon
     * Device Messaging (ADM) service.
     * </p>
     *
     * @param timeToLive <p>
     *            The number of seconds that the push notification service
     *            should keep the message, if the service is unable to deliver
     *            the notification the first time. This value is converted to an
     *            expiration value when it's sent to a push-notification
     *            service. If this value is 0, the service treats the
     *            notification as if it expires immediately and the service
     *            doesn't store or try to deliver the notification again.
     *            </p>
     *            <p>
     *            This value doesn't apply to messages that are sent through the
     *            Amazon Device Messaging (ADM) service.
     *            </p>
     */
    public void setTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * The number of seconds that the push notification service should keep the
     * message, if the service is unable to deliver the notification the first
     * time. This value is converted to an expiration value when it's sent to a
     * push-notification service. If this value is 0, the service treats the
     * notification as if it expires immediately and the service doesn't store
     * or try to deliver the notification again.
     * </p>
     * <p>
     * This value doesn't apply to messages that are sent through the Amazon
     * Device Messaging (ADM) service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeToLive <p>
     *            The number of seconds that the push notification service
     *            should keep the message, if the service is unable to deliver
     *            the notification the first time. This value is converted to an
     *            expiration value when it's sent to a push-notification
     *            service. If this value is 0, the service treats the
     *            notification as if it expires immediately and the service
     *            doesn't store or try to deliver the notification again.
     *            </p>
     *            <p>
     *            This value doesn't apply to messages that are sent through the
     *            Amazon Device Messaging (ADM) service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JourneyPushMessage withTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
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
        if (getTimeToLive() != null)
            sb.append("TimeToLive: " + getTimeToLive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JourneyPushMessage == false)
            return false;
        JourneyPushMessage other = (JourneyPushMessage) obj;

        if (other.getTimeToLive() == null ^ this.getTimeToLive() == null)
            return false;
        if (other.getTimeToLive() != null
                && other.getTimeToLive().equals(this.getTimeToLive()) == false)
            return false;
        return true;
    }
}
