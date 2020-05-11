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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a state change.
 * </p>
 */
public class StateReason implements Serializable {
    /**
     * <p>
     * The reason code for the state change.
     * </p>
     */
    private String code;

    /**
     * <p>
     * The message for the state change.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Server.InsufficientInstanceCapacity</code>: There was insufficient
     * capacity available to satisfy the launch request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.InternalError</code>: An internal error caused the instance
     * to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.ScheduledStop</code>: The instance was stopped due to a
     * scheduled retirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceShutdown</code>: The instance was stopped
     * because the number of Spot requests with a maximum price equal to or
     * higher than the Spot price exceeded available capacity or because of an
     * increase in the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceTermination</code>: The instance was terminated
     * because the number of Spot requests with a maximum price equal to or
     * higher than the Spot price exceeded available capacity or because of an
     * increase in the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceInitiatedShutdown</code>: The instance was shut down
     * using the <code>shutdown -h</code> command from the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceTerminated</code>: The instance was terminated or
     * rebooted during AMI creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InternalError</code>: A client error caused the instance to
     * terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InvalidSnapshot.NotFound</code>: The specified snapshot was
     * not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedHibernate</code>: Hibernation was initiated on
     * the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedShutdown</code>: The instance was shut down
     * using the Amazon EC2 API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.VolumeLimitExceeded</code>: The limit on the number of EBS
     * volumes or total storage was exceeded. Decrease usage or request an
     * increase in your account limits.
     * </p>
     * </li>
     * </ul>
     */
    private String message;

    /**
     * <p>
     * The reason code for the state change.
     * </p>
     *
     * @return <p>
     *         The reason code for the state change.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The reason code for the state change.
     * </p>
     *
     * @param code <p>
     *            The reason code for the state change.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The reason code for the state change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            The reason code for the state change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StateReason withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The message for the state change.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Server.InsufficientInstanceCapacity</code>: There was insufficient
     * capacity available to satisfy the launch request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.InternalError</code>: An internal error caused the instance
     * to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.ScheduledStop</code>: The instance was stopped due to a
     * scheduled retirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceShutdown</code>: The instance was stopped
     * because the number of Spot requests with a maximum price equal to or
     * higher than the Spot price exceeded available capacity or because of an
     * increase in the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceTermination</code>: The instance was terminated
     * because the number of Spot requests with a maximum price equal to or
     * higher than the Spot price exceeded available capacity or because of an
     * increase in the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceInitiatedShutdown</code>: The instance was shut down
     * using the <code>shutdown -h</code> command from the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceTerminated</code>: The instance was terminated or
     * rebooted during AMI creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InternalError</code>: A client error caused the instance to
     * terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InvalidSnapshot.NotFound</code>: The specified snapshot was
     * not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedHibernate</code>: Hibernation was initiated on
     * the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedShutdown</code>: The instance was shut down
     * using the Amazon EC2 API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.VolumeLimitExceeded</code>: The limit on the number of EBS
     * volumes or total storage was exceeded. Decrease usage or request an
     * increase in your account limits.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The message for the state change.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Server.InsufficientInstanceCapacity</code>: There was
     *         insufficient capacity available to satisfy the launch request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Server.InternalError</code>: An internal error caused the
     *         instance to terminate during launch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Server.ScheduledStop</code>: The instance was stopped due
     *         to a scheduled retirement.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Server.SpotInstanceShutdown</code>: The instance was
     *         stopped because the number of Spot requests with a maximum price
     *         equal to or higher than the Spot price exceeded available
     *         capacity or because of an increase in the Spot price.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Server.SpotInstanceTermination</code>: The instance was
     *         terminated because the number of Spot requests with a maximum
     *         price equal to or higher than the Spot price exceeded available
     *         capacity or because of an increase in the Spot price.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.InstanceInitiatedShutdown</code>: The instance was
     *         shut down using the <code>shutdown -h</code> command from the
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.InstanceTerminated</code>: The instance was
     *         terminated or rebooted during AMI creation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.InternalError</code>: A client error caused the
     *         instance to terminate during launch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.InvalidSnapshot.NotFound</code>: The specified
     *         snapshot was not found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.UserInitiatedHibernate</code>: Hibernation was
     *         initiated on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.UserInitiatedShutdown</code>: The instance was shut
     *         down using the Amazon EC2 API.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.VolumeLimitExceeded</code>: The limit on the number
     *         of EBS volumes or total storage was exceeded. Decrease usage or
     *         request an increase in your account limits.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The message for the state change.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Server.InsufficientInstanceCapacity</code>: There was insufficient
     * capacity available to satisfy the launch request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.InternalError</code>: An internal error caused the instance
     * to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.ScheduledStop</code>: The instance was stopped due to a
     * scheduled retirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceShutdown</code>: The instance was stopped
     * because the number of Spot requests with a maximum price equal to or
     * higher than the Spot price exceeded available capacity or because of an
     * increase in the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceTermination</code>: The instance was terminated
     * because the number of Spot requests with a maximum price equal to or
     * higher than the Spot price exceeded available capacity or because of an
     * increase in the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceInitiatedShutdown</code>: The instance was shut down
     * using the <code>shutdown -h</code> command from the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceTerminated</code>: The instance was terminated or
     * rebooted during AMI creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InternalError</code>: A client error caused the instance to
     * terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InvalidSnapshot.NotFound</code>: The specified snapshot was
     * not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedHibernate</code>: Hibernation was initiated on
     * the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedShutdown</code>: The instance was shut down
     * using the Amazon EC2 API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.VolumeLimitExceeded</code>: The limit on the number of EBS
     * volumes or total storage was exceeded. Decrease usage or request an
     * increase in your account limits.
     * </p>
     * </li>
     * </ul>
     *
     * @param message <p>
     *            The message for the state change.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Server.InsufficientInstanceCapacity</code>: There was
     *            insufficient capacity available to satisfy the launch request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Server.InternalError</code>: An internal error caused
     *            the instance to terminate during launch.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Server.ScheduledStop</code>: The instance was stopped
     *            due to a scheduled retirement.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Server.SpotInstanceShutdown</code>: The instance was
     *            stopped because the number of Spot requests with a maximum
     *            price equal to or higher than the Spot price exceeded
     *            available capacity or because of an increase in the Spot
     *            price.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Server.SpotInstanceTermination</code>: The instance was
     *            terminated because the number of Spot requests with a maximum
     *            price equal to or higher than the Spot price exceeded
     *            available capacity or because of an increase in the Spot
     *            price.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.InstanceInitiatedShutdown</code>: The instance
     *            was shut down using the <code>shutdown -h</code> command from
     *            the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.InstanceTerminated</code>: The instance was
     *            terminated or rebooted during AMI creation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.InternalError</code>: A client error caused the
     *            instance to terminate during launch.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.InvalidSnapshot.NotFound</code>: The specified
     *            snapshot was not found.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.UserInitiatedHibernate</code>: Hibernation was
     *            initiated on the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.UserInitiatedShutdown</code>: The instance was
     *            shut down using the Amazon EC2 API.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.VolumeLimitExceeded</code>: The limit on the
     *            number of EBS volumes or total storage was exceeded. Decrease
     *            usage or request an increase in your account limits.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message for the state change.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Server.InsufficientInstanceCapacity</code>: There was insufficient
     * capacity available to satisfy the launch request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.InternalError</code>: An internal error caused the instance
     * to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.ScheduledStop</code>: The instance was stopped due to a
     * scheduled retirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceShutdown</code>: The instance was stopped
     * because the number of Spot requests with a maximum price equal to or
     * higher than the Spot price exceeded available capacity or because of an
     * increase in the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceTermination</code>: The instance was terminated
     * because the number of Spot requests with a maximum price equal to or
     * higher than the Spot price exceeded available capacity or because of an
     * increase in the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceInitiatedShutdown</code>: The instance was shut down
     * using the <code>shutdown -h</code> command from the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceTerminated</code>: The instance was terminated or
     * rebooted during AMI creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InternalError</code>: A client error caused the instance to
     * terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InvalidSnapshot.NotFound</code>: The specified snapshot was
     * not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedHibernate</code>: Hibernation was initiated on
     * the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedShutdown</code>: The instance was shut down
     * using the Amazon EC2 API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.VolumeLimitExceeded</code>: The limit on the number of EBS
     * volumes or total storage was exceeded. Decrease usage or request an
     * increase in your account limits.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The message for the state change.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Server.InsufficientInstanceCapacity</code>: There was
     *            insufficient capacity available to satisfy the launch request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Server.InternalError</code>: An internal error caused
     *            the instance to terminate during launch.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Server.ScheduledStop</code>: The instance was stopped
     *            due to a scheduled retirement.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Server.SpotInstanceShutdown</code>: The instance was
     *            stopped because the number of Spot requests with a maximum
     *            price equal to or higher than the Spot price exceeded
     *            available capacity or because of an increase in the Spot
     *            price.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Server.SpotInstanceTermination</code>: The instance was
     *            terminated because the number of Spot requests with a maximum
     *            price equal to or higher than the Spot price exceeded
     *            available capacity or because of an increase in the Spot
     *            price.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.InstanceInitiatedShutdown</code>: The instance
     *            was shut down using the <code>shutdown -h</code> command from
     *            the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.InstanceTerminated</code>: The instance was
     *            terminated or rebooted during AMI creation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.InternalError</code>: A client error caused the
     *            instance to terminate during launch.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.InvalidSnapshot.NotFound</code>: The specified
     *            snapshot was not found.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.UserInitiatedHibernate</code>: Hibernation was
     *            initiated on the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.UserInitiatedShutdown</code>: The instance was
     *            shut down using the Amazon EC2 API.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Client.VolumeLimitExceeded</code>: The limit on the
     *            number of EBS volumes or total storage was exceeded. Decrease
     *            usage or request an increase in your account limits.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StateReason withMessage(String message) {
        this.message = message;
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StateReason == false)
            return false;
        StateReason other = (StateReason) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
