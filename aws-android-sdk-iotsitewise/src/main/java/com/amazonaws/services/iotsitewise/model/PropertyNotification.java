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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains asset property value notification information. When the notification
 * state is enabled, AWS IoT SiteWise publishes property value updates to a
 * unique MQTT topic. For more information, see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html"
 * >Interacting with Other Services</a> in the <i>AWS IoT SiteWise User
 * Guide</i>.
 * </p>
 */
public class PropertyNotification implements Serializable {
    /**
     * <p>
     * The MQTT topic to which AWS IoT SiteWise publishes property value update
     * notifications.
     * </p>
     */
    private String topic;

    /**
     * <p>
     * The current notification state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String state;

    /**
     * <p>
     * The MQTT topic to which AWS IoT SiteWise publishes property value update
     * notifications.
     * </p>
     *
     * @return <p>
     *         The MQTT topic to which AWS IoT SiteWise publishes property value
     *         update notifications.
     *         </p>
     */
    public String getTopic() {
        return topic;
    }

    /**
     * <p>
     * The MQTT topic to which AWS IoT SiteWise publishes property value update
     * notifications.
     * </p>
     *
     * @param topic <p>
     *            The MQTT topic to which AWS IoT SiteWise publishes property
     *            value update notifications.
     *            </p>
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The MQTT topic to which AWS IoT SiteWise publishes property value update
     * notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topic <p>
     *            The MQTT topic to which AWS IoT SiteWise publishes property
     *            value update notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyNotification withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * <p>
     * The current notification state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The current notification state.
     *         </p>
     * @see PropertyNotificationState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current notification state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The current notification state.
     *            </p>
     * @see PropertyNotificationState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current notification state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The current notification state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropertyNotificationState
     */
    public PropertyNotification withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current notification state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The current notification state.
     *            </p>
     * @see PropertyNotificationState
     */
    public void setState(PropertyNotificationState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current notification state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The current notification state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropertyNotificationState
     */
    public PropertyNotification withState(PropertyNotificationState state) {
        this.state = state.toString();
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
        if (getTopic() != null)
            sb.append("topic: " + getTopic() + ",");
        if (getState() != null)
            sb.append("state: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyNotification == false)
            return false;
        PropertyNotification other = (PropertyNotification) obj;

        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
