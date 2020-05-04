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
 * Describes the status of an instance.
 * </p>
 */
public class InstanceStatus implements Serializable {
    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostArn;

    /**
     * <p>
     * Any scheduled events associated with the instance.
     * </p>
     */
    private java.util.List<InstanceStatusEvent> events;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The intended state of the instance. <a>DescribeInstanceStatus</a>
     * requires that an instance be in the <code>running</code> state.
     * </p>
     */
    private InstanceState instanceState;

    /**
     * <p>
     * Reports impaired functionality that stems from issues internal to the
     * instance, such as impaired reachability.
     * </p>
     */
    private InstanceStatusSummary instanceStatus;

    /**
     * <p>
     * Reports impaired functionality that stems from issues related to the
     * systems that support an instance, such as hardware failures and network
     * connectivity problems.
     * </p>
     */
    private InstanceStatusSummary systemStatus;

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     *
     * @return <p>
     *         The Availability Zone of the instance.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone of the instance.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatus withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Outpost.
     *         </p>
     */
    public String getOutpostArn() {
        return outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     */
    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the Outpost.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatus withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
        return this;
    }

    /**
     * <p>
     * Any scheduled events associated with the instance.
     * </p>
     *
     * @return <p>
     *         Any scheduled events associated with the instance.
     *         </p>
     */
    public java.util.List<InstanceStatusEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * Any scheduled events associated with the instance.
     * </p>
     *
     * @param events <p>
     *            Any scheduled events associated with the instance.
     *            </p>
     */
    public void setEvents(java.util.Collection<InstanceStatusEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<InstanceStatusEvent>(events);
    }

    /**
     * <p>
     * Any scheduled events associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            Any scheduled events associated with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatus withEvents(InstanceStatusEvent... events) {
        if (getEvents() == null) {
            this.events = new java.util.ArrayList<InstanceStatusEvent>(events.length);
        }
        for (InstanceStatusEvent value : events) {
            this.events.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any scheduled events associated with the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            Any scheduled events associated with the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatus withEvents(java.util.Collection<InstanceStatusEvent> events) {
        setEvents(events);
        return this;
    }

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
    public InstanceStatus withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The intended state of the instance. <a>DescribeInstanceStatus</a>
     * requires that an instance be in the <code>running</code> state.
     * </p>
     *
     * @return <p>
     *         The intended state of the instance. <a>DescribeInstanceStatus</a>
     *         requires that an instance be in the <code>running</code> state.
     *         </p>
     */
    public InstanceState getInstanceState() {
        return instanceState;
    }

    /**
     * <p>
     * The intended state of the instance. <a>DescribeInstanceStatus</a>
     * requires that an instance be in the <code>running</code> state.
     * </p>
     *
     * @param instanceState <p>
     *            The intended state of the instance.
     *            <a>DescribeInstanceStatus</a> requires that an instance be in
     *            the <code>running</code> state.
     *            </p>
     */
    public void setInstanceState(InstanceState instanceState) {
        this.instanceState = instanceState;
    }

    /**
     * <p>
     * The intended state of the instance. <a>DescribeInstanceStatus</a>
     * requires that an instance be in the <code>running</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceState <p>
     *            The intended state of the instance.
     *            <a>DescribeInstanceStatus</a> requires that an instance be in
     *            the <code>running</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatus withInstanceState(InstanceState instanceState) {
        this.instanceState = instanceState;
        return this;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues internal to the
     * instance, such as impaired reachability.
     * </p>
     *
     * @return <p>
     *         Reports impaired functionality that stems from issues internal to
     *         the instance, such as impaired reachability.
     *         </p>
     */
    public InstanceStatusSummary getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues internal to the
     * instance, such as impaired reachability.
     * </p>
     *
     * @param instanceStatus <p>
     *            Reports impaired functionality that stems from issues internal
     *            to the instance, such as impaired reachability.
     *            </p>
     */
    public void setInstanceStatus(InstanceStatusSummary instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues internal to the
     * instance, such as impaired reachability.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceStatus <p>
     *            Reports impaired functionality that stems from issues internal
     *            to the instance, such as impaired reachability.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatus withInstanceStatus(InstanceStatusSummary instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues related to the
     * systems that support an instance, such as hardware failures and network
     * connectivity problems.
     * </p>
     *
     * @return <p>
     *         Reports impaired functionality that stems from issues related to
     *         the systems that support an instance, such as hardware failures
     *         and network connectivity problems.
     *         </p>
     */
    public InstanceStatusSummary getSystemStatus() {
        return systemStatus;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues related to the
     * systems that support an instance, such as hardware failures and network
     * connectivity problems.
     * </p>
     *
     * @param systemStatus <p>
     *            Reports impaired functionality that stems from issues related
     *            to the systems that support an instance, such as hardware
     *            failures and network connectivity problems.
     *            </p>
     */
    public void setSystemStatus(InstanceStatusSummary systemStatus) {
        this.systemStatus = systemStatus;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues related to the
     * systems that support an instance, such as hardware failures and network
     * connectivity problems.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param systemStatus <p>
     *            Reports impaired functionality that stems from issues related
     *            to the systems that support an instance, such as hardware
     *            failures and network connectivity problems.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatus withSystemStatus(InstanceStatusSummary systemStatus) {
        this.systemStatus = systemStatus;
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn() + ",");
        if (getEvents() != null)
            sb.append("Events: " + getEvents() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceState() != null)
            sb.append("InstanceState: " + getInstanceState() + ",");
        if (getInstanceStatus() != null)
            sb.append("InstanceStatus: " + getInstanceStatus() + ",");
        if (getSystemStatus() != null)
            sb.append("SystemStatus: " + getSystemStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceState() == null) ? 0 : getInstanceState().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceStatus() == null) ? 0 : getInstanceStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSystemStatus() == null) ? 0 : getSystemStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStatus == false)
            return false;
        InstanceStatus other = (InstanceStatus) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null
                && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceState() == null ^ this.getInstanceState() == null)
            return false;
        if (other.getInstanceState() != null
                && other.getInstanceState().equals(this.getInstanceState()) == false)
            return false;
        if (other.getInstanceStatus() == null ^ this.getInstanceStatus() == null)
            return false;
        if (other.getInstanceStatus() != null
                && other.getInstanceStatus().equals(this.getInstanceStatus()) == false)
            return false;
        if (other.getSystemStatus() == null ^ this.getSystemStatus() == null)
            return false;
        if (other.getSystemStatus() != null
                && other.getSystemStatus().equals(this.getSystemStatus()) == false)
            return false;
        return true;
    }
}
