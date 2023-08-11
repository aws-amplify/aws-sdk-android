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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Whether agents with this routing profile will have their routing order
 * calculated based on <i>time since their last inbound contact</i> or
 * <i>longest idle time</i>.
 * </p>
 */
public class UpdateRoutingProfileAgentAvailabilityTimerRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     */
    private String routingProfileId;

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order
     * calculated based on <i>time since their last inbound contact</i> or
     * <i>longest idle time</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIME_SINCE_LAST_ACTIVITY, TIME_SINCE_LAST_INBOUND
     */
    private String agentAvailabilityTimer;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRoutingProfileAgentAvailabilityTimerRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     *
     * @return <p>
     *         The identifier of the routing profile.
     *         </p>
     */
    public String getRoutingProfileId() {
        return routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     *
     * @param routingProfileId <p>
     *            The identifier of the routing profile.
     *            </p>
     */
    public void setRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfileId <p>
     *            The identifier of the routing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRoutingProfileAgentAvailabilityTimerRequest withRoutingProfileId(
            String routingProfileId) {
        this.routingProfileId = routingProfileId;
        return this;
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order
     * calculated based on <i>time since their last inbound contact</i> or
     * <i>longest idle time</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIME_SINCE_LAST_ACTIVITY, TIME_SINCE_LAST_INBOUND
     *
     * @return <p>
     *         Whether agents with this routing profile will have their routing
     *         order calculated based on <i>time since their last inbound
     *         contact</i> or <i>longest idle time</i>.
     *         </p>
     * @see AgentAvailabilityTimer
     */
    public String getAgentAvailabilityTimer() {
        return agentAvailabilityTimer;
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order
     * calculated based on <i>time since their last inbound contact</i> or
     * <i>longest idle time</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIME_SINCE_LAST_ACTIVITY, TIME_SINCE_LAST_INBOUND
     *
     * @param agentAvailabilityTimer <p>
     *            Whether agents with this routing profile will have their
     *            routing order calculated based on <i>time since their last
     *            inbound contact</i> or <i>longest idle time</i>.
     *            </p>
     * @see AgentAvailabilityTimer
     */
    public void setAgentAvailabilityTimer(String agentAvailabilityTimer) {
        this.agentAvailabilityTimer = agentAvailabilityTimer;
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order
     * calculated based on <i>time since their last inbound contact</i> or
     * <i>longest idle time</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIME_SINCE_LAST_ACTIVITY, TIME_SINCE_LAST_INBOUND
     *
     * @param agentAvailabilityTimer <p>
     *            Whether agents with this routing profile will have their
     *            routing order calculated based on <i>time since their last
     *            inbound contact</i> or <i>longest idle time</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AgentAvailabilityTimer
     */
    public UpdateRoutingProfileAgentAvailabilityTimerRequest withAgentAvailabilityTimer(
            String agentAvailabilityTimer) {
        this.agentAvailabilityTimer = agentAvailabilityTimer;
        return this;
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order
     * calculated based on <i>time since their last inbound contact</i> or
     * <i>longest idle time</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIME_SINCE_LAST_ACTIVITY, TIME_SINCE_LAST_INBOUND
     *
     * @param agentAvailabilityTimer <p>
     *            Whether agents with this routing profile will have their
     *            routing order calculated based on <i>time since their last
     *            inbound contact</i> or <i>longest idle time</i>.
     *            </p>
     * @see AgentAvailabilityTimer
     */
    public void setAgentAvailabilityTimer(AgentAvailabilityTimer agentAvailabilityTimer) {
        this.agentAvailabilityTimer = agentAvailabilityTimer.toString();
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order
     * calculated based on <i>time since their last inbound contact</i> or
     * <i>longest idle time</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIME_SINCE_LAST_ACTIVITY, TIME_SINCE_LAST_INBOUND
     *
     * @param agentAvailabilityTimer <p>
     *            Whether agents with this routing profile will have their
     *            routing order calculated based on <i>time since their last
     *            inbound contact</i> or <i>longest idle time</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AgentAvailabilityTimer
     */
    public UpdateRoutingProfileAgentAvailabilityTimerRequest withAgentAvailabilityTimer(
            AgentAvailabilityTimer agentAvailabilityTimer) {
        this.agentAvailabilityTimer = agentAvailabilityTimer.toString();
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getRoutingProfileId() != null)
            sb.append("RoutingProfileId: " + getRoutingProfileId() + ",");
        if (getAgentAvailabilityTimer() != null)
            sb.append("AgentAvailabilityTimer: " + getAgentAvailabilityTimer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getRoutingProfileId() == null) ? 0 : getRoutingProfileId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAgentAvailabilityTimer() == null) ? 0 : getAgentAvailabilityTimer()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoutingProfileAgentAvailabilityTimerRequest == false)
            return false;
        UpdateRoutingProfileAgentAvailabilityTimerRequest other = (UpdateRoutingProfileAgentAvailabilityTimerRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getRoutingProfileId() == null ^ this.getRoutingProfileId() == null)
            return false;
        if (other.getRoutingProfileId() != null
                && other.getRoutingProfileId().equals(this.getRoutingProfileId()) == false)
            return false;
        if (other.getAgentAvailabilityTimer() == null ^ this.getAgentAvailabilityTimer() == null)
            return false;
        if (other.getAgentAvailabilityTimer() != null
                && other.getAgentAvailabilityTimer().equals(this.getAgentAvailabilityTimer()) == false)
            return false;
        return true;
    }
}
