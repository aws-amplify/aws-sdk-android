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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disables fast snapshot restores for the specified snapshots in the specified
 * Availability Zones.
 * </p>
 */
public class DisableFastSnapshotRestoresRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * One or more Availability Zones. For example, <code>us-east-2a</code>.
     * </p>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * The IDs of one or more snapshots. For example,
     * <code>snap-1234567890abcdef0</code>.
     * </p>
     */
    private java.util.List<String> sourceSnapshotIds;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * One or more Availability Zones. For example, <code>us-east-2a</code>.
     * </p>
     *
     * @return <p>
     *         One or more Availability Zones. For example,
     *         <code>us-east-2a</code>.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * One or more Availability Zones. For example, <code>us-east-2a</code>.
     * </p>
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones. For example,
     *            <code>us-east-2a</code>.
     *            </p>
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * One or more Availability Zones. For example, <code>us-east-2a</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones. For example,
     *            <code>us-east-2a</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoresRequest withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<String>(availabilityZones.length);
        }
        for (String value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones. For example, <code>us-east-2a</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            One or more Availability Zones. For example,
     *            <code>us-east-2a</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoresRequest withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more snapshots. For example,
     * <code>snap-1234567890abcdef0</code>.
     * </p>
     *
     * @return <p>
     *         The IDs of one or more snapshots. For example,
     *         <code>snap-1234567890abcdef0</code>.
     *         </p>
     */
    public java.util.List<String> getSourceSnapshotIds() {
        return sourceSnapshotIds;
    }

    /**
     * <p>
     * The IDs of one or more snapshots. For example,
     * <code>snap-1234567890abcdef0</code>.
     * </p>
     *
     * @param sourceSnapshotIds <p>
     *            The IDs of one or more snapshots. For example,
     *            <code>snap-1234567890abcdef0</code>.
     *            </p>
     */
    public void setSourceSnapshotIds(java.util.Collection<String> sourceSnapshotIds) {
        if (sourceSnapshotIds == null) {
            this.sourceSnapshotIds = null;
            return;
        }

        this.sourceSnapshotIds = new java.util.ArrayList<String>(sourceSnapshotIds);
    }

    /**
     * <p>
     * The IDs of one or more snapshots. For example,
     * <code>snap-1234567890abcdef0</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSnapshotIds <p>
     *            The IDs of one or more snapshots. For example,
     *            <code>snap-1234567890abcdef0</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoresRequest withSourceSnapshotIds(String... sourceSnapshotIds) {
        if (getSourceSnapshotIds() == null) {
            this.sourceSnapshotIds = new java.util.ArrayList<String>(sourceSnapshotIds.length);
        }
        for (String value : sourceSnapshotIds) {
            this.sourceSnapshotIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more snapshots. For example,
     * <code>snap-1234567890abcdef0</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSnapshotIds <p>
     *            The IDs of one or more snapshots. For example,
     *            <code>snap-1234567890abcdef0</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoresRequest withSourceSnapshotIds(
            java.util.Collection<String> sourceSnapshotIds) {
        setSourceSnapshotIds(sourceSnapshotIds);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableFastSnapshotRestoresRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getSourceSnapshotIds() != null)
            sb.append("SourceSnapshotIds: " + getSourceSnapshotIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode
                + ((getSourceSnapshotIds() == null) ? 0 : getSourceSnapshotIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableFastSnapshotRestoresRequest == false)
            return false;
        DisableFastSnapshotRestoresRequest other = (DisableFastSnapshotRestoresRequest) obj;

        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getSourceSnapshotIds() == null ^ this.getSourceSnapshotIds() == null)
            return false;
        if (other.getSourceSnapshotIds() != null
                && other.getSourceSnapshotIds().equals(this.getSourceSnapshotIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
