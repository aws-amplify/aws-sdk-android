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
 * Describes a reservation.
 * </p>
 */
public class RunInstancesResult implements Serializable {
    /**
     * <p>
     * [EC2-Classic only] The security groups.
     * </p>
     */
    private java.util.List<GroupIdentifier> groups;

    /**
     * <p>
     * The instances.
     * </p>
     */
    private java.util.List<Instance> instances;

    /**
     * <p>
     * The ID of the AWS account that owns the reservation.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The ID of the requester that launched the instances on your behalf (for
     * example, AWS Management Console or Auto Scaling).
     * </p>
     */
    private String requesterId;

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     */
    private String reservationId;

    /**
     * <p>
     * [EC2-Classic only] The security groups.
     * </p>
     *
     * @return <p>
     *         [EC2-Classic only] The security groups.
     *         </p>
     */
    public java.util.List<GroupIdentifier> getGroups() {
        return groups;
    }

    /**
     * <p>
     * [EC2-Classic only] The security groups.
     * </p>
     *
     * @param groups <p>
     *            [EC2-Classic only] The security groups.
     *            </p>
     */
    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<GroupIdentifier>(groups);
    }

    /**
     * <p>
     * [EC2-Classic only] The security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            [EC2-Classic only] The security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesResult withGroups(GroupIdentifier... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<GroupIdentifier>(groups.length);
        }
        for (GroupIdentifier value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-Classic only] The security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            [EC2-Classic only] The security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesResult withGroups(java.util.Collection<GroupIdentifier> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The instances.
     * </p>
     *
     * @return <p>
     *         The instances.
     *         </p>
     */
    public java.util.List<Instance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * The instances.
     * </p>
     *
     * @param instances <p>
     *            The instances.
     *            </p>
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<Instance>(instances);
    }

    /**
     * <p>
     * The instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesResult withInstances(Instance... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<Instance>(instances.length);
        }
        for (Instance value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            The instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesResult withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the reservation.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the reservation.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the reservation.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the reservation.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesResult withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The ID of the requester that launched the instances on your behalf (for
     * example, AWS Management Console or Auto Scaling).
     * </p>
     *
     * @return <p>
     *         The ID of the requester that launched the instances on your
     *         behalf (for example, AWS Management Console or Auto Scaling).
     *         </p>
     */
    public String getRequesterId() {
        return requesterId;
    }

    /**
     * <p>
     * The ID of the requester that launched the instances on your behalf (for
     * example, AWS Management Console or Auto Scaling).
     * </p>
     *
     * @param requesterId <p>
     *            The ID of the requester that launched the instances on your
     *            behalf (for example, AWS Management Console or Auto Scaling).
     *            </p>
     */
    public void setRequesterId(String requesterId) {
        this.requesterId = requesterId;
    }

    /**
     * <p>
     * The ID of the requester that launched the instances on your behalf (for
     * example, AWS Management Console or Auto Scaling).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requesterId <p>
     *            The ID of the requester that launched the instances on your
     *            behalf (for example, AWS Management Console or Auto Scaling).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesResult withRequesterId(String requesterId) {
        this.requesterId = requesterId;
        return this;
    }

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     *
     * @return <p>
     *         The ID of the reservation.
     *         </p>
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     *
     * @param reservationId <p>
     *            The ID of the reservation.
     *            </p>
     */
    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservationId <p>
     *            The ID of the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RunInstancesResult withReservationId(String reservationId) {
        this.reservationId = reservationId;
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
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getRequesterId() != null)
            sb.append("RequesterId: " + getRequesterId() + ",");
        if (getReservationId() != null)
            sb.append("ReservationId: " + getReservationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getRequesterId() == null) ? 0 : getRequesterId().hashCode());
        hashCode = prime * hashCode
                + ((getReservationId() == null) ? 0 : getReservationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunInstancesResult == false)
            return false;
        RunInstancesResult other = (RunInstancesResult) obj;

        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getRequesterId() == null ^ this.getRequesterId() == null)
            return false;
        if (other.getRequesterId() != null
                && other.getRequesterId().equals(this.getRequesterId()) == false)
            return false;
        if (other.getReservationId() == null ^ this.getReservationId() == null)
            return false;
        if (other.getReservationId() != null
                && other.getReservationId().equals(this.getReservationId()) == false)
            return false;
        return true;
    }
}
