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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p>
 * In response to the <code>DescribeOrderableReplicationInstances</code>
 * operation, this object describes an available replication instance. This
 * description includes the replication instance's type, engine version, and
 * allocated storage.
 * </p>
 */
public class OrderableReplicationInstance implements Serializable {
    /**
     * <p>
     * The version of the replication engine.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined
     * for the specified replication instance class. For example to specify the
     * instance class dms.c4.large, set this parameter to
     * <code>"dms.c4.large"</code>.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available
     * replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your
     * migration</a>.
     * </p>
     */
    private String replicationInstanceClass;

    /**
     * <p>
     * The type of storage used by the replication instance.
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for
     * the replication instance.
     * </p>
     */
    private Integer minAllocatedStorage;

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for
     * the replication instance.
     * </p>
     */
    private Integer maxAllocatedStorage;

    /**
     * <p>
     * The default amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     */
    private Integer defaultAllocatedStorage;

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     */
    private Integer includedAllocatedStorage;

    /**
     * <p>
     * List of Availability Zones for this replication instance.
     * </p>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * The value returned when the specified <code>EngineVersion</code> of the
     * replication instance is in Beta or test mode. This indicates some
     * features might not work as expected.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ReleaseStatus</code> parameter in versions
     * 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>beta
     */
    private String releaseStatus;

    /**
     * <p>
     * The version of the replication engine.
     * </p>
     *
     * @return <p>
     *         The version of the replication engine.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The version of the replication engine.
     * </p>
     *
     * @param engineVersion <p>
     *            The version of the replication engine.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the replication engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version of the replication engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableReplicationInstance withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined
     * for the specified replication instance class. For example to specify the
     * instance class dms.c4.large, set this parameter to
     * <code>"dms.c4.large"</code>.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available
     * replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your
     * migration</a>.
     * </p>
     *
     * @return <p>
     *         The compute and memory capacity of the replication instance as
     *         defined for the specified replication instance class. For example
     *         to specify the instance class dms.c4.large, set this parameter to
     *         <code>"dms.c4.large"</code>.
     *         </p>
     *         <p>
     *         For more information on the settings and capacities for the
     *         available replication instance classes, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     *         > Selecting the right AWS DMS replication instance for your
     *         migration</a>.
     *         </p>
     */
    public String getReplicationInstanceClass() {
        return replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined
     * for the specified replication instance class. For example to specify the
     * instance class dms.c4.large, set this parameter to
     * <code>"dms.c4.large"</code>.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available
     * replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your
     * migration</a>.
     * </p>
     *
     * @param replicationInstanceClass <p>
     *            The compute and memory capacity of the replication instance as
     *            defined for the specified replication instance class. For
     *            example to specify the instance class dms.c4.large, set this
     *            parameter to <code>"dms.c4.large"</code>.
     *            </p>
     *            <p>
     *            For more information on the settings and capacities for the
     *            available replication instance classes, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     *            > Selecting the right AWS DMS replication instance for your
     *            migration</a>.
     *            </p>
     */
    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined
     * for the specified replication instance class. For example to specify the
     * instance class dms.c4.large, set this parameter to
     * <code>"dms.c4.large"</code>.
     * </p>
     * <p>
     * For more information on the settings and capacities for the available
     * replication instance classes, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     * > Selecting the right AWS DMS replication instance for your
     * migration</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceClass <p>
     *            The compute and memory capacity of the replication instance as
     *            defined for the specified replication instance class. For
     *            example to specify the instance class dms.c4.large, set this
     *            parameter to <code>"dms.c4.large"</code>.
     *            </p>
     *            <p>
     *            For more information on the settings and capacities for the
     *            available replication instance classes, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_ReplicationInstance.html#CHAP_ReplicationInstance.InDepth"
     *            > Selecting the right AWS DMS replication instance for your
     *            migration</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableReplicationInstance withReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
        return this;
    }

    /**
     * <p>
     * The type of storage used by the replication instance.
     * </p>
     *
     * @return <p>
     *         The type of storage used by the replication instance.
     *         </p>
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * The type of storage used by the replication instance.
     * </p>
     *
     * @param storageType <p>
     *            The type of storage used by the replication instance.
     *            </p>
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The type of storage used by the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageType <p>
     *            The type of storage used by the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableReplicationInstance withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for
     * the replication instance.
     * </p>
     *
     * @return <p>
     *         The minimum amount of storage (in gigabytes) that can be
     *         allocated for the replication instance.
     *         </p>
     */
    public Integer getMinAllocatedStorage() {
        return minAllocatedStorage;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for
     * the replication instance.
     * </p>
     *
     * @param minAllocatedStorage <p>
     *            The minimum amount of storage (in gigabytes) that can be
     *            allocated for the replication instance.
     *            </p>
     */
    public void setMinAllocatedStorage(Integer minAllocatedStorage) {
        this.minAllocatedStorage = minAllocatedStorage;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for
     * the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minAllocatedStorage <p>
     *            The minimum amount of storage (in gigabytes) that can be
     *            allocated for the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableReplicationInstance withMinAllocatedStorage(Integer minAllocatedStorage) {
        this.minAllocatedStorage = minAllocatedStorage;
        return this;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for
     * the replication instance.
     * </p>
     *
     * @return <p>
     *         The minimum amount of storage (in gigabytes) that can be
     *         allocated for the replication instance.
     *         </p>
     */
    public Integer getMaxAllocatedStorage() {
        return maxAllocatedStorage;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for
     * the replication instance.
     * </p>
     *
     * @param maxAllocatedStorage <p>
     *            The minimum amount of storage (in gigabytes) that can be
     *            allocated for the replication instance.
     *            </p>
     */
    public void setMaxAllocatedStorage(Integer maxAllocatedStorage) {
        this.maxAllocatedStorage = maxAllocatedStorage;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for
     * the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxAllocatedStorage <p>
     *            The minimum amount of storage (in gigabytes) that can be
     *            allocated for the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableReplicationInstance withMaxAllocatedStorage(Integer maxAllocatedStorage) {
        this.maxAllocatedStorage = maxAllocatedStorage;
        return this;
    }

    /**
     * <p>
     * The default amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     *
     * @return <p>
     *         The default amount of storage (in gigabytes) that is allocated
     *         for the replication instance.
     *         </p>
     */
    public Integer getDefaultAllocatedStorage() {
        return defaultAllocatedStorage;
    }

    /**
     * <p>
     * The default amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     *
     * @param defaultAllocatedStorage <p>
     *            The default amount of storage (in gigabytes) that is allocated
     *            for the replication instance.
     *            </p>
     */
    public void setDefaultAllocatedStorage(Integer defaultAllocatedStorage) {
        this.defaultAllocatedStorage = defaultAllocatedStorage;
    }

    /**
     * <p>
     * The default amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultAllocatedStorage <p>
     *            The default amount of storage (in gigabytes) that is allocated
     *            for the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableReplicationInstance withDefaultAllocatedStorage(Integer defaultAllocatedStorage) {
        this.defaultAllocatedStorage = defaultAllocatedStorage;
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
    public Integer getIncludedAllocatedStorage() {
        return includedAllocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     *
     * @param includedAllocatedStorage <p>
     *            The amount of storage (in gigabytes) that is allocated for the
     *            replication instance.
     *            </p>
     */
    public void setIncludedAllocatedStorage(Integer includedAllocatedStorage) {
        this.includedAllocatedStorage = includedAllocatedStorage;
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
     * @param includedAllocatedStorage <p>
     *            The amount of storage (in gigabytes) that is allocated for the
     *            replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableReplicationInstance withIncludedAllocatedStorage(
            Integer includedAllocatedStorage) {
        this.includedAllocatedStorage = includedAllocatedStorage;
        return this;
    }

    /**
     * <p>
     * List of Availability Zones for this replication instance.
     * </p>
     *
     * @return <p>
     *         List of Availability Zones for this replication instance.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * List of Availability Zones for this replication instance.
     * </p>
     *
     * @param availabilityZones <p>
     *            List of Availability Zones for this replication instance.
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
     * List of Availability Zones for this replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            List of Availability Zones for this replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableReplicationInstance withAvailabilityZones(String... availabilityZones) {
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
     * List of Availability Zones for this replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            List of Availability Zones for this replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableReplicationInstance withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The value returned when the specified <code>EngineVersion</code> of the
     * replication instance is in Beta or test mode. This indicates some
     * features might not work as expected.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ReleaseStatus</code> parameter in versions
     * 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>beta
     *
     * @return <p>
     *         The value returned when the specified <code>EngineVersion</code>
     *         of the replication instance is in Beta or test mode. This
     *         indicates some features might not work as expected.
     *         </p>
     *         <note>
     *         <p>
     *         AWS DMS supports the <code>ReleaseStatus</code> parameter in
     *         versions 3.1.4 and later.
     *         </p>
     *         </note>
     * @see ReleaseStatusValues
     */
    public String getReleaseStatus() {
        return releaseStatus;
    }

    /**
     * <p>
     * The value returned when the specified <code>EngineVersion</code> of the
     * replication instance is in Beta or test mode. This indicates some
     * features might not work as expected.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ReleaseStatus</code> parameter in versions
     * 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>beta
     *
     * @param releaseStatus <p>
     *            The value returned when the specified
     *            <code>EngineVersion</code> of the replication instance is in
     *            Beta or test mode. This indicates some features might not work
     *            as expected.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the <code>ReleaseStatus</code> parameter in
     *            versions 3.1.4 and later.
     *            </p>
     *            </note>
     * @see ReleaseStatusValues
     */
    public void setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    /**
     * <p>
     * The value returned when the specified <code>EngineVersion</code> of the
     * replication instance is in Beta or test mode. This indicates some
     * features might not work as expected.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ReleaseStatus</code> parameter in versions
     * 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>beta
     *
     * @param releaseStatus <p>
     *            The value returned when the specified
     *            <code>EngineVersion</code> of the replication instance is in
     *            Beta or test mode. This indicates some features might not work
     *            as expected.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the <code>ReleaseStatus</code> parameter in
     *            versions 3.1.4 and later.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReleaseStatusValues
     */
    public OrderableReplicationInstance withReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus;
        return this;
    }

    /**
     * <p>
     * The value returned when the specified <code>EngineVersion</code> of the
     * replication instance is in Beta or test mode. This indicates some
     * features might not work as expected.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ReleaseStatus</code> parameter in versions
     * 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>beta
     *
     * @param releaseStatus <p>
     *            The value returned when the specified
     *            <code>EngineVersion</code> of the replication instance is in
     *            Beta or test mode. This indicates some features might not work
     *            as expected.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the <code>ReleaseStatus</code> parameter in
     *            versions 3.1.4 and later.
     *            </p>
     *            </note>
     * @see ReleaseStatusValues
     */
    public void setReleaseStatus(ReleaseStatusValues releaseStatus) {
        this.releaseStatus = releaseStatus.toString();
    }

    /**
     * <p>
     * The value returned when the specified <code>EngineVersion</code> of the
     * replication instance is in Beta or test mode. This indicates some
     * features might not work as expected.
     * </p>
     * <note>
     * <p>
     * AWS DMS supports the <code>ReleaseStatus</code> parameter in versions
     * 3.1.4 and later.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>beta
     *
     * @param releaseStatus <p>
     *            The value returned when the specified
     *            <code>EngineVersion</code> of the replication instance is in
     *            Beta or test mode. This indicates some features might not work
     *            as expected.
     *            </p>
     *            <note>
     *            <p>
     *            AWS DMS supports the <code>ReleaseStatus</code> parameter in
     *            versions 3.1.4 and later.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReleaseStatusValues
     */
    public OrderableReplicationInstance withReleaseStatus(ReleaseStatusValues releaseStatus) {
        this.releaseStatus = releaseStatus.toString();
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
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: " + getReplicationInstanceClass() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getMinAllocatedStorage() != null)
            sb.append("MinAllocatedStorage: " + getMinAllocatedStorage() + ",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: " + getMaxAllocatedStorage() + ",");
        if (getDefaultAllocatedStorage() != null)
            sb.append("DefaultAllocatedStorage: " + getDefaultAllocatedStorage() + ",");
        if (getIncludedAllocatedStorage() != null)
            sb.append("IncludedAllocatedStorage: " + getIncludedAllocatedStorage() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getReleaseStatus() != null)
            sb.append("ReleaseStatus: " + getReleaseStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceClass() == null) ? 0 : getReplicationInstanceClass()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode
                + ((getMinAllocatedStorage() == null) ? 0 : getMinAllocatedStorage().hashCode());
        hashCode = prime * hashCode
                + ((getMaxAllocatedStorage() == null) ? 0 : getMaxAllocatedStorage().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultAllocatedStorage() == null) ? 0 : getDefaultAllocatedStorage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludedAllocatedStorage() == null) ? 0 : getIncludedAllocatedStorage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode
                + ((getReleaseStatus() == null) ? 0 : getReleaseStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderableReplicationInstance == false)
            return false;
        OrderableReplicationInstance other = (OrderableReplicationInstance) obj;

        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getReplicationInstanceClass() == null
                ^ this.getReplicationInstanceClass() == null)
            return false;
        if (other.getReplicationInstanceClass() != null
                && other.getReplicationInstanceClass().equals(this.getReplicationInstanceClass()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null
                && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getMinAllocatedStorage() == null ^ this.getMinAllocatedStorage() == null)
            return false;
        if (other.getMinAllocatedStorage() != null
                && other.getMinAllocatedStorage().equals(this.getMinAllocatedStorage()) == false)
            return false;
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null
                && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
            return false;
        if (other.getDefaultAllocatedStorage() == null ^ this.getDefaultAllocatedStorage() == null)
            return false;
        if (other.getDefaultAllocatedStorage() != null
                && other.getDefaultAllocatedStorage().equals(this.getDefaultAllocatedStorage()) == false)
            return false;
        if (other.getIncludedAllocatedStorage() == null
                ^ this.getIncludedAllocatedStorage() == null)
            return false;
        if (other.getIncludedAllocatedStorage() != null
                && other.getIncludedAllocatedStorage().equals(this.getIncludedAllocatedStorage()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getReleaseStatus() == null ^ this.getReleaseStatus() == null)
            return false;
        if (other.getReleaseStatus() != null
                && other.getReleaseStatus().equals(this.getReleaseStatus()) == false)
            return false;
        return true;
    }
}
