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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * The targeted recipient for a streaming configuration notification.
 * </p>
 */
public class StreamingNotificationTarget implements Serializable {
    /**
     * <p>
     * The streaming notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EventBridge, SNS, SQS
     */
    private String notificationTarget;

    /**
     * <p>
     * The streaming notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EventBridge, SNS, SQS
     *
     * @return <p>
     *         The streaming notification target.
     *         </p>
     * @see NotificationTarget
     */
    public String getNotificationTarget() {
        return notificationTarget;
    }

    /**
     * <p>
     * The streaming notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EventBridge, SNS, SQS
     *
     * @param notificationTarget <p>
     *            The streaming notification target.
     *            </p>
     * @see NotificationTarget
     */
    public void setNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    /**
     * <p>
     * The streaming notification target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EventBridge, SNS, SQS
     *
     * @param notificationTarget <p>
     *            The streaming notification target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotificationTarget
     */
    public StreamingNotificationTarget withNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
        return this;
    }

    /**
     * <p>
     * The streaming notification target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EventBridge, SNS, SQS
     *
     * @param notificationTarget <p>
     *            The streaming notification target.
     *            </p>
     * @see NotificationTarget
     */
    public void setNotificationTarget(NotificationTarget notificationTarget) {
        this.notificationTarget = notificationTarget.toString();
    }

    /**
     * <p>
     * The streaming notification target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EventBridge, SNS, SQS
     *
     * @param notificationTarget <p>
     *            The streaming notification target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotificationTarget
     */
    public StreamingNotificationTarget withNotificationTarget(NotificationTarget notificationTarget) {
        this.notificationTarget = notificationTarget.toString();
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
        if (getNotificationTarget() != null)
            sb.append("NotificationTarget: " + getNotificationTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNotificationTarget() == null) ? 0 : getNotificationTarget().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingNotificationTarget == false)
            return false;
        StreamingNotificationTarget other = (StreamingNotificationTarget) obj;

        if (other.getNotificationTarget() == null ^ this.getNotificationTarget() == null)
            return false;
        if (other.getNotificationTarget() != null
                && other.getNotificationTarget().equals(this.getNotificationTarget()) == false)
            return false;
        return true;
    }
}
