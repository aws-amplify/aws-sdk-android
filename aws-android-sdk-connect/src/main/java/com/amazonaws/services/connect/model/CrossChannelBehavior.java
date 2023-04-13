/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Defines the cross-channel routing behavior that allows an agent working on a
 * contact in one channel to be offered a contact from a different channel.
 * </p>
 */
public class CrossChannelBehavior implements Serializable {
    /**
     * <p>
     * Specifies the other channels that can be routed to an agent handling
     * their current channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTE_CURRENT_CHANNEL_ONLY, ROUTE_ANY_CHANNEL
     */
    private String behaviorType;

    /**
     * <p>
     * Specifies the other channels that can be routed to an agent handling
     * their current channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTE_CURRENT_CHANNEL_ONLY, ROUTE_ANY_CHANNEL
     *
     * @return <p>
     *         Specifies the other channels that can be routed to an agent
     *         handling their current channel.
     *         </p>
     * @see BehaviorType
     */
    public String getBehaviorType() {
        return behaviorType;
    }

    /**
     * <p>
     * Specifies the other channels that can be routed to an agent handling
     * their current channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTE_CURRENT_CHANNEL_ONLY, ROUTE_ANY_CHANNEL
     *
     * @param behaviorType <p>
     *            Specifies the other channels that can be routed to an agent
     *            handling their current channel.
     *            </p>
     * @see BehaviorType
     */
    public void setBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType;
    }

    /**
     * <p>
     * Specifies the other channels that can be routed to an agent handling
     * their current channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTE_CURRENT_CHANNEL_ONLY, ROUTE_ANY_CHANNEL
     *
     * @param behaviorType <p>
     *            Specifies the other channels that can be routed to an agent
     *            handling their current channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BehaviorType
     */
    public CrossChannelBehavior withBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType;
        return this;
    }

    /**
     * <p>
     * Specifies the other channels that can be routed to an agent handling
     * their current channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTE_CURRENT_CHANNEL_ONLY, ROUTE_ANY_CHANNEL
     *
     * @param behaviorType <p>
     *            Specifies the other channels that can be routed to an agent
     *            handling their current channel.
     *            </p>
     * @see BehaviorType
     */
    public void setBehaviorType(BehaviorType behaviorType) {
        this.behaviorType = behaviorType.toString();
    }

    /**
     * <p>
     * Specifies the other channels that can be routed to an agent handling
     * their current channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROUTE_CURRENT_CHANNEL_ONLY, ROUTE_ANY_CHANNEL
     *
     * @param behaviorType <p>
     *            Specifies the other channels that can be routed to an agent
     *            handling their current channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BehaviorType
     */
    public CrossChannelBehavior withBehaviorType(BehaviorType behaviorType) {
        this.behaviorType = behaviorType.toString();
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
        if (getBehaviorType() != null)
            sb.append("BehaviorType: " + getBehaviorType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBehaviorType() == null) ? 0 : getBehaviorType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrossChannelBehavior == false)
            return false;
        CrossChannelBehavior other = (CrossChannelBehavior) obj;

        if (other.getBehaviorType() == null ^ this.getBehaviorType() == null)
            return false;
        if (other.getBehaviorType() != null
                && other.getBehaviorType().equals(this.getBehaviorType()) == false)
            return false;
        return true;
    }
}
