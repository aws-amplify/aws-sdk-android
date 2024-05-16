/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about the dimensions for a set of metrics.
 * </p>
 */
public class Dimensions implements Serializable {
    /**
     * <p>
     * Information about the queue for which metrics are returned.
     * </p>
     */
    private QueueReference queue;

    /**
     * <p>
     * The channel used for grouping and filters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     */
    private String channel;

    /**
     * <p>
     * Information about the routing profile assigned to the user.
     * </p>
     */
    private RoutingProfileReference routingProfile;

    /**
     * <p>
     * The expression of a step in a routing criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     */
    private String routingStepExpression;

    /**
     * <p>
     * Information about the queue for which metrics are returned.
     * </p>
     *
     * @return <p>
     *         Information about the queue for which metrics are returned.
     *         </p>
     */
    public QueueReference getQueue() {
        return queue;
    }

    /**
     * <p>
     * Information about the queue for which metrics are returned.
     * </p>
     *
     * @param queue <p>
     *            Information about the queue for which metrics are returned.
     *            </p>
     */
    public void setQueue(QueueReference queue) {
        this.queue = queue;
    }

    /**
     * <p>
     * Information about the queue for which metrics are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queue <p>
     *            Information about the queue for which metrics are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Dimensions withQueue(QueueReference queue) {
        this.queue = queue;
        return this;
    }

    /**
     * <p>
     * The channel used for grouping and filters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @return <p>
     *         The channel used for grouping and filters.
     *         </p>
     * @see Channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * <p>
     * The channel used for grouping and filters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channel used for grouping and filters.
     *            </p>
     * @see Channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channel used for grouping and filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channel used for grouping and filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Channel
     */
    public Dimensions withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * <p>
     * The channel used for grouping and filters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channel used for grouping and filters.
     *            </p>
     * @see Channel
     */
    public void setChannel(Channel channel) {
        this.channel = channel.toString();
    }

    /**
     * <p>
     * The channel used for grouping and filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE, CHAT, TASK
     *
     * @param channel <p>
     *            The channel used for grouping and filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Channel
     */
    public Dimensions withChannel(Channel channel) {
        this.channel = channel.toString();
        return this;
    }

    /**
     * <p>
     * Information about the routing profile assigned to the user.
     * </p>
     *
     * @return <p>
     *         Information about the routing profile assigned to the user.
     *         </p>
     */
    public RoutingProfileReference getRoutingProfile() {
        return routingProfile;
    }

    /**
     * <p>
     * Information about the routing profile assigned to the user.
     * </p>
     *
     * @param routingProfile <p>
     *            Information about the routing profile assigned to the user.
     *            </p>
     */
    public void setRoutingProfile(RoutingProfileReference routingProfile) {
        this.routingProfile = routingProfile;
    }

    /**
     * <p>
     * Information about the routing profile assigned to the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfile <p>
     *            Information about the routing profile assigned to the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Dimensions withRoutingProfile(RoutingProfileReference routingProfile) {
        this.routingProfile = routingProfile;
        return this;
    }

    /**
     * <p>
     * The expression of a step in a routing criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @return <p>
     *         The expression of a step in a routing criteria.
     *         </p>
     */
    public String getRoutingStepExpression() {
        return routingStepExpression;
    }

    /**
     * <p>
     * The expression of a step in a routing criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param routingStepExpression <p>
     *            The expression of a step in a routing criteria.
     *            </p>
     */
    public void setRoutingStepExpression(String routingStepExpression) {
        this.routingStepExpression = routingStepExpression;
    }

    /**
     * <p>
     * The expression of a step in a routing criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param routingStepExpression <p>
     *            The expression of a step in a routing criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Dimensions withRoutingStepExpression(String routingStepExpression) {
        this.routingStepExpression = routingStepExpression;
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
        if (getQueue() != null)
            sb.append("Queue: " + getQueue() + ",");
        if (getChannel() != null)
            sb.append("Channel: " + getChannel() + ",");
        if (getRoutingProfile() != null)
            sb.append("RoutingProfile: " + getRoutingProfile() + ",");
        if (getRoutingStepExpression() != null)
            sb.append("RoutingStepExpression: " + getRoutingStepExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode
                + ((getRoutingProfile() == null) ? 0 : getRoutingProfile().hashCode());
        hashCode = prime
                * hashCode
                + ((getRoutingStepExpression() == null) ? 0 : getRoutingStepExpression().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dimensions == false)
            return false;
        Dimensions other = (Dimensions) obj;

        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getRoutingProfile() == null ^ this.getRoutingProfile() == null)
            return false;
        if (other.getRoutingProfile() != null
                && other.getRoutingProfile().equals(this.getRoutingProfile()) == false)
            return false;
        if (other.getRoutingStepExpression() == null ^ this.getRoutingStepExpression() == null)
            return false;
        if (other.getRoutingStepExpression() != null
                && other.getRoutingStepExpression().equals(this.getRoutingStepExpression()) == false)
            return false;
        return true;
    }
}
