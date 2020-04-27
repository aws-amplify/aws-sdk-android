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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the values of pending modifications to a
 * replication instance. This data type is an object of the
 * <code>ReplicationInstance</code> user-defined data type.
 * </p>
 */
public class ReplicationPendingModifiedValues implements Serializable {
    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     */
    private String replicationInstanceClass;

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     */
    private Integer allocatedStorage;

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You
     * can't set the <code>AvailabilityZone</code> parameter if the Multi-AZ
     * parameter is set to <code>true</code>.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     *
     * @return <p>
     *         The compute and memory capacity of the replication instance.
     *         </p>
     *         <p>
     *         Valid Values:
     *         <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     *         </p>
     */
    public String getReplicationInstanceClass() {
        return replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     *
     * @param replicationInstanceClass <p>
     *            The compute and memory capacity of the replication instance.
     *            </p>
     *            <p>
     *            Valid Values:
     *            <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     *            </p>
     */
    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceClass <p>
     *            The compute and memory capacity of the replication instance.
     *            </p>
     *            <p>
     *            Valid Values:
     *            <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationPendingModifiedValues withReplicationInstanceClass(
            String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     *
     * @return <p>
     *         The amount of storage (in gigabytes) that is allocated for the
     *         replication instance.
     *         </p>
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gigabytes) that is allocated for the
     *            replication instance.
     *            </p>
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gigabytes) that is allocated for the
     *            replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationPendingModifiedValues withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You
     * can't set the <code>AvailabilityZone</code> parameter if the Multi-AZ
     * parameter is set to <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the replication instance is a Multi-AZ
     *         deployment. You can't set the <code>AvailabilityZone</code>
     *         parameter if the Multi-AZ parameter is set to <code>true</code>.
     *         </p>
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You
     * can't set the <code>AvailabilityZone</code> parameter if the Multi-AZ
     * parameter is set to <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Specifies whether the replication instance is a Multi-AZ
     *         deployment. You can't set the <code>AvailabilityZone</code>
     *         parameter if the Multi-AZ parameter is set to <code>true</code>.
     *         </p>
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You
     * can't set the <code>AvailabilityZone</code> parameter if the Multi-AZ
     * parameter is set to <code>true</code>.
     * </p>
     *
     * @param multiAZ <p>
     *            Specifies whether the replication instance is a Multi-AZ
     *            deployment. You can't set the <code>AvailabilityZone</code>
     *            parameter if the Multi-AZ parameter is set to
     *            <code>true</code>.
     *            </p>
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies whether the replication instance is a Multi-AZ deployment. You
     * can't set the <code>AvailabilityZone</code> parameter if the Multi-AZ
     * parameter is set to <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZ <p>
     *            Specifies whether the replication instance is a Multi-AZ
     *            deployment. You can't set the <code>AvailabilityZone</code>
     *            parameter if the Multi-AZ parameter is set to
     *            <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationPendingModifiedValues withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     *
     * @return <p>
     *         The engine version number of the replication instance.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     *
     * @param engineVersion <p>
     *            The engine version number of the replication instance.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The engine version number of the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationPendingModifiedValues withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
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
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: " + getReplicationInstanceClass() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationInstanceClass() == null) ? 0 : getReplicationInstanceClass()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationPendingModifiedValues == false)
            return false;
        ReplicationPendingModifiedValues other = (ReplicationPendingModifiedValues) obj;

        if (other.getReplicationInstanceClass() == null
                ^ this.getReplicationInstanceClass() == null)
            return false;
        if (other.getReplicationInstanceClass() != null
                && other.getReplicationInstanceClass().equals(this.getReplicationInstanceClass()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        return true;
    }
}
