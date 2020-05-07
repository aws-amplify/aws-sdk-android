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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetAutoSnapshotsResult implements Serializable {
    /**
     * <p>
     * The name of the source instance or disk for the automatic snapshots.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String resourceName;

    /**
     * <p>
     * The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     */
    private String resourceType;

    /**
     * <p>
     * An array of objects that describe the automatic snapshots that are
     * available for the specified source instance or disk.
     * </p>
     */
    private java.util.List<AutoSnapshotDetails> autoSnapshots;

    /**
     * <p>
     * The name of the source instance or disk for the automatic snapshots.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the source instance or disk for the automatic
     *         snapshots.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk for the automatic snapshots.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The name of the source instance or disk for the automatic
     *            snapshots.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk for the automatic snapshots.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The name of the source instance or disk for the automatic
     *            snapshots.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAutoSnapshotsResult withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The resource type (e.g., <code>Instance</code> or
     *         <code>Disk</code>).
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g., <code>Instance</code> or
     *            <code>Disk</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g., <code>Instance</code> or
     *            <code>Disk</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public GetAutoSnapshotsResult withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g., <code>Instance</code> or
     *            <code>Disk</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The resource type (e.g., <code>Instance</code> or <code>Disk</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g., <code>Instance</code> or
     *            <code>Disk</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public GetAutoSnapshotsResult withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the automatic snapshots that are
     * available for the specified source instance or disk.
     * </p>
     *
     * @return <p>
     *         An array of objects that describe the automatic snapshots that
     *         are available for the specified source instance or disk.
     *         </p>
     */
    public java.util.List<AutoSnapshotDetails> getAutoSnapshots() {
        return autoSnapshots;
    }

    /**
     * <p>
     * An array of objects that describe the automatic snapshots that are
     * available for the specified source instance or disk.
     * </p>
     *
     * @param autoSnapshots <p>
     *            An array of objects that describe the automatic snapshots that
     *            are available for the specified source instance or disk.
     *            </p>
     */
    public void setAutoSnapshots(java.util.Collection<AutoSnapshotDetails> autoSnapshots) {
        if (autoSnapshots == null) {
            this.autoSnapshots = null;
            return;
        }

        this.autoSnapshots = new java.util.ArrayList<AutoSnapshotDetails>(autoSnapshots);
    }

    /**
     * <p>
     * An array of objects that describe the automatic snapshots that are
     * available for the specified source instance or disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoSnapshots <p>
     *            An array of objects that describe the automatic snapshots that
     *            are available for the specified source instance or disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAutoSnapshotsResult withAutoSnapshots(AutoSnapshotDetails... autoSnapshots) {
        if (getAutoSnapshots() == null) {
            this.autoSnapshots = new java.util.ArrayList<AutoSnapshotDetails>(autoSnapshots.length);
        }
        for (AutoSnapshotDetails value : autoSnapshots) {
            this.autoSnapshots.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the automatic snapshots that are
     * available for the specified source instance or disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoSnapshots <p>
     *            An array of objects that describe the automatic snapshots that
     *            are available for the specified source instance or disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAutoSnapshotsResult withAutoSnapshots(
            java.util.Collection<AutoSnapshotDetails> autoSnapshots) {
        setAutoSnapshots(autoSnapshots);
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
        if (getResourceName() != null)
            sb.append("resourceName: " + getResourceName() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getAutoSnapshots() != null)
            sb.append("autoSnapshots: " + getAutoSnapshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getAutoSnapshots() == null) ? 0 : getAutoSnapshots().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAutoSnapshotsResult == false)
            return false;
        GetAutoSnapshotsResult other = (GetAutoSnapshotsResult) obj;

        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getAutoSnapshots() == null ^ this.getAutoSnapshots() == null)
            return false;
        if (other.getAutoSnapshots() != null
                && other.getAutoSnapshots().equals(this.getAutoSnapshots()) == false)
            return false;
        return true;
    }
}
