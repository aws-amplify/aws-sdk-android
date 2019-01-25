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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the state of an EC2 instance.
 * </p>
 */
public class InstanceState implements Serializable {
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * <p>
     * Valid values: <code>InService</code> | <code>OutOfService</code> |
     * <code>Unknown</code>
     * </p>
     */
    private String state;

    /**
     * <p>
     * Information about the cause of <code>OutOfService</code> instances.
     * Specifically, whether the cause is Elastic Load Balancing or the
     * instance.
     * </p>
     * <p>
     * Valid values: <code>ELB</code> | <code>Instance</code> | <code>N/A</code>
     * </p>
     */
    private String reasonCode;

    /**
     * <p>
     * A description of the instance state. This string can contain one or more
     * of the following messages.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>N/A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>A transient error occurred. Please try again later.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance has failed at least the UnhealthyThreshold number of health checks consecutively.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance has not passed the configured HealthyThreshold number of health checks consecutively.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance registration is still in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in the EC2 Availability Zone for which LoadBalancer is not configured to route traffic to.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is not currently registered with the LoadBalancer.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance deregistration currently in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disable Availability Zone is currently in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in pending state.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in stopped state.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in terminated state.</code>
     * </p>
     * </li>
     * </ul>
     */
    private String description;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceState withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * <p>
     * Valid values: <code>InService</code> | <code>OutOfService</code> |
     * <code>Unknown</code>
     * </p>
     *
     * @return <p>
     *         The current state of the instance.
     *         </p>
     *         <p>
     *         Valid values: <code>InService</code> | <code>OutOfService</code>
     *         | <code>Unknown</code>
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * <p>
     * Valid values: <code>InService</code> | <code>OutOfService</code> |
     * <code>Unknown</code>
     * </p>
     *
     * @param state <p>
     *            The current state of the instance.
     *            </p>
     *            <p>
     *            Valid values: <code>InService</code> |
     *            <code>OutOfService</code> | <code>Unknown</code>
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * <p>
     * Valid values: <code>InService</code> | <code>OutOfService</code> |
     * <code>Unknown</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The current state of the instance.
     *            </p>
     *            <p>
     *            Valid values: <code>InService</code> |
     *            <code>OutOfService</code> | <code>Unknown</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceState withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * Information about the cause of <code>OutOfService</code> instances.
     * Specifically, whether the cause is Elastic Load Balancing or the
     * instance.
     * </p>
     * <p>
     * Valid values: <code>ELB</code> | <code>Instance</code> | <code>N/A</code>
     * </p>
     *
     * @return <p>
     *         Information about the cause of <code>OutOfService</code>
     *         instances. Specifically, whether the cause is Elastic Load
     *         Balancing or the instance.
     *         </p>
     *         <p>
     *         Valid values: <code>ELB</code> | <code>Instance</code> |
     *         <code>N/A</code>
     *         </p>
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * <p>
     * Information about the cause of <code>OutOfService</code> instances.
     * Specifically, whether the cause is Elastic Load Balancing or the
     * instance.
     * </p>
     * <p>
     * Valid values: <code>ELB</code> | <code>Instance</code> | <code>N/A</code>
     * </p>
     *
     * @param reasonCode <p>
     *            Information about the cause of <code>OutOfService</code>
     *            instances. Specifically, whether the cause is Elastic Load
     *            Balancing or the instance.
     *            </p>
     *            <p>
     *            Valid values: <code>ELB</code> | <code>Instance</code> |
     *            <code>N/A</code>
     *            </p>
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * <p>
     * Information about the cause of <code>OutOfService</code> instances.
     * Specifically, whether the cause is Elastic Load Balancing or the
     * instance.
     * </p>
     * <p>
     * Valid values: <code>ELB</code> | <code>Instance</code> | <code>N/A</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reasonCode <p>
     *            Information about the cause of <code>OutOfService</code>
     *            instances. Specifically, whether the cause is Elastic Load
     *            Balancing or the instance.
     *            </p>
     *            <p>
     *            Valid values: <code>ELB</code> | <code>Instance</code> |
     *            <code>N/A</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceState withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    /**
     * <p>
     * A description of the instance state. This string can contain one or more
     * of the following messages.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>N/A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>A transient error occurred. Please try again later.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance has failed at least the UnhealthyThreshold number of health checks consecutively.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance has not passed the configured HealthyThreshold number of health checks consecutively.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance registration is still in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in the EC2 Availability Zone for which LoadBalancer is not configured to route traffic to.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is not currently registered with the LoadBalancer.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance deregistration currently in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disable Availability Zone is currently in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in pending state.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in stopped state.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in terminated state.</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A description of the instance state. This string can contain one
     *         or more of the following messages.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>N/A</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>A transient error occurred. Please try again later.</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Instance has failed at least the UnhealthyThreshold number of health checks consecutively.</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Instance has not passed the configured HealthyThreshold number of health checks consecutively.</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Instance registration is still in progress.</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Instance is in the EC2 Availability Zone for which LoadBalancer is not configured to route traffic to.</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Instance is not currently registered with the LoadBalancer.</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Instance deregistration currently in progress.</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Disable Availability Zone is currently in progress.</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Instance is in pending state.</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Instance is in stopped state.</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Instance is in terminated state.</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the instance state. This string can contain one or more
     * of the following messages.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>N/A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>A transient error occurred. Please try again later.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance has failed at least the UnhealthyThreshold number of health checks consecutively.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance has not passed the configured HealthyThreshold number of health checks consecutively.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance registration is still in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in the EC2 Availability Zone for which LoadBalancer is not configured to route traffic to.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is not currently registered with the LoadBalancer.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance deregistration currently in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disable Availability Zone is currently in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in pending state.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in stopped state.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in terminated state.</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param description <p>
     *            A description of the instance state. This string can contain
     *            one or more of the following messages.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>N/A</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>A transient error occurred. Please try again later.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance has failed at least the UnhealthyThreshold number of health checks consecutively.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance has not passed the configured HealthyThreshold number of health checks consecutively.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance registration is still in progress.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance is in the EC2 Availability Zone for which LoadBalancer is not configured to route traffic to.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance is not currently registered with the LoadBalancer.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance deregistration currently in progress.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Disable Availability Zone is currently in progress.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance is in pending state.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance is in stopped state.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance is in terminated state.</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the instance state. This string can contain one or more
     * of the following messages.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>N/A</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>A transient error occurred. Please try again later.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance has failed at least the UnhealthyThreshold number of health checks consecutively.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance has not passed the configured HealthyThreshold number of health checks consecutively.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance registration is still in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in the EC2 Availability Zone for which LoadBalancer is not configured to route traffic to.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is not currently registered with the LoadBalancer.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance deregistration currently in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disable Availability Zone is currently in progress.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in pending state.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in stopped state.</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Instance is in terminated state.</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the instance state. This string can contain
     *            one or more of the following messages.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>N/A</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>A transient error occurred. Please try again later.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance has failed at least the UnhealthyThreshold number of health checks consecutively.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance has not passed the configured HealthyThreshold number of health checks consecutively.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance registration is still in progress.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance is in the EC2 Availability Zone for which LoadBalancer is not configured to route traffic to.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance is not currently registered with the LoadBalancer.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance deregistration currently in progress.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Disable Availability Zone is currently in progress.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance is in pending state.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance is in stopped state.</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Instance is in terminated state.</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceState withDescription(String description) {
        this.description = description;
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getReasonCode() != null)
            sb.append("ReasonCode: " + getReasonCode() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getReasonCode() == null) ? 0 : getReasonCode().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceState == false)
            return false;
        InstanceState other = (InstanceState) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getReasonCode() == null ^ this.getReasonCode() == null)
            return false;
        if (other.getReasonCode() != null
                && other.getReasonCode().equals(this.getReasonCode()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
