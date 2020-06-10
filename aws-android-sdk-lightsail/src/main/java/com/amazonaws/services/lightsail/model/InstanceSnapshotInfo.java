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

/**
 * <p>
 * Describes an instance snapshot.
 * </p>
 */
public class InstanceSnapshotInfo implements Serializable {
    /**
     * <p>
     * The bundle ID from which the source instance was created (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String fromBundleId;

    /**
     * <p>
     * The blueprint ID from which the source instance (e.g.,
     * <code>os_debian_8_3</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String fromBlueprintId;

    /**
     * <p>
     * A list of objects describing the disks that were attached to the source
     * instance.
     * </p>
     */
    private java.util.List<DiskInfo> fromDiskInfo;

    /**
     * <p>
     * The bundle ID from which the source instance was created (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The bundle ID from which the source instance was created (e.g.,
     *         <code>micro_1_0</code>).
     *         </p>
     */
    public String getFromBundleId() {
        return fromBundleId;
    }

    /**
     * <p>
     * The bundle ID from which the source instance was created (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromBundleId <p>
     *            The bundle ID from which the source instance was created
     *            (e.g., <code>micro_1_0</code>).
     *            </p>
     */
    public void setFromBundleId(String fromBundleId) {
        this.fromBundleId = fromBundleId;
    }

    /**
     * <p>
     * The bundle ID from which the source instance was created (e.g.,
     * <code>micro_1_0</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromBundleId <p>
     *            The bundle ID from which the source instance was created
     *            (e.g., <code>micro_1_0</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshotInfo withFromBundleId(String fromBundleId) {
        this.fromBundleId = fromBundleId;
        return this;
    }

    /**
     * <p>
     * The blueprint ID from which the source instance (e.g.,
     * <code>os_debian_8_3</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The blueprint ID from which the source instance (e.g.,
     *         <code>os_debian_8_3</code>).
     *         </p>
     */
    public String getFromBlueprintId() {
        return fromBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID from which the source instance (e.g.,
     * <code>os_debian_8_3</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromBlueprintId <p>
     *            The blueprint ID from which the source instance (e.g.,
     *            <code>os_debian_8_3</code>).
     *            </p>
     */
    public void setFromBlueprintId(String fromBlueprintId) {
        this.fromBlueprintId = fromBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID from which the source instance (e.g.,
     * <code>os_debian_8_3</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param fromBlueprintId <p>
     *            The blueprint ID from which the source instance (e.g.,
     *            <code>os_debian_8_3</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshotInfo withFromBlueprintId(String fromBlueprintId) {
        this.fromBlueprintId = fromBlueprintId;
        return this;
    }

    /**
     * <p>
     * A list of objects describing the disks that were attached to the source
     * instance.
     * </p>
     *
     * @return <p>
     *         A list of objects describing the disks that were attached to the
     *         source instance.
     *         </p>
     */
    public java.util.List<DiskInfo> getFromDiskInfo() {
        return fromDiskInfo;
    }

    /**
     * <p>
     * A list of objects describing the disks that were attached to the source
     * instance.
     * </p>
     *
     * @param fromDiskInfo <p>
     *            A list of objects describing the disks that were attached to
     *            the source instance.
     *            </p>
     */
    public void setFromDiskInfo(java.util.Collection<DiskInfo> fromDiskInfo) {
        if (fromDiskInfo == null) {
            this.fromDiskInfo = null;
            return;
        }

        this.fromDiskInfo = new java.util.ArrayList<DiskInfo>(fromDiskInfo);
    }

    /**
     * <p>
     * A list of objects describing the disks that were attached to the source
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromDiskInfo <p>
     *            A list of objects describing the disks that were attached to
     *            the source instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshotInfo withFromDiskInfo(DiskInfo... fromDiskInfo) {
        if (getFromDiskInfo() == null) {
            this.fromDiskInfo = new java.util.ArrayList<DiskInfo>(fromDiskInfo.length);
        }
        for (DiskInfo value : fromDiskInfo) {
            this.fromDiskInfo.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects describing the disks that were attached to the source
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromDiskInfo <p>
     *            A list of objects describing the disks that were attached to
     *            the source instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceSnapshotInfo withFromDiskInfo(java.util.Collection<DiskInfo> fromDiskInfo) {
        setFromDiskInfo(fromDiskInfo);
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
        if (getFromBundleId() != null)
            sb.append("fromBundleId: " + getFromBundleId() + ",");
        if (getFromBlueprintId() != null)
            sb.append("fromBlueprintId: " + getFromBlueprintId() + ",");
        if (getFromDiskInfo() != null)
            sb.append("fromDiskInfo: " + getFromDiskInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFromBundleId() == null) ? 0 : getFromBundleId().hashCode());
        hashCode = prime * hashCode
                + ((getFromBlueprintId() == null) ? 0 : getFromBlueprintId().hashCode());
        hashCode = prime * hashCode
                + ((getFromDiskInfo() == null) ? 0 : getFromDiskInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceSnapshotInfo == false)
            return false;
        InstanceSnapshotInfo other = (InstanceSnapshotInfo) obj;

        if (other.getFromBundleId() == null ^ this.getFromBundleId() == null)
            return false;
        if (other.getFromBundleId() != null
                && other.getFromBundleId().equals(this.getFromBundleId()) == false)
            return false;
        if (other.getFromBlueprintId() == null ^ this.getFromBlueprintId() == null)
            return false;
        if (other.getFromBlueprintId() != null
                && other.getFromBlueprintId().equals(this.getFromBlueprintId()) == false)
            return false;
        if (other.getFromDiskInfo() == null ^ this.getFromDiskInfo() == null)
            return false;
        if (other.getFromDiskInfo() != null
                && other.getFromDiskInfo().equals(this.getFromDiskInfo()) == false)
            return false;
        return true;
    }
}
