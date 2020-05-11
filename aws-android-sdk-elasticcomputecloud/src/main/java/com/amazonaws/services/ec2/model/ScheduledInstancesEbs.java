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
 * Describes an EBS volume for a Scheduled Instance.
 * </p>
 */
public class ScheduledInstancesEbs implements Serializable {
    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * Indicates whether the volume is encrypted. You can attached encrypted
     * volumes only to instances that support them.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For io1 volumes, this represents the number of IOPS that are provisioned
     * for the volume. For <code>gp2</code> volumes, this represents the
     * baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting. For more information about
     * <code>gp2</code> baseline performance, I/O credits, and bursting, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes and
     * 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code>volumes; it is not used in requests to create
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code> volumes.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     */
    private Integer volumeSize;

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, Throughput Optimized HDD for
     * <code>st1</code>, Cold HDD for <code>sc1</code>, or <code>standard</code>
     * for Magnetic.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     */
    private String volumeType;

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume is deleted on instance termination.
     *         </p>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume is deleted on instance termination.
     *         </p>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the volume is deleted on instance
     *            termination.
     *            </p>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the volume is deleted on instance termination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the volume is deleted on instance
     *            termination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesEbs withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted. You can attached encrypted
     * volumes only to instances that support them.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume is encrypted. You can attached
     *         encrypted volumes only to instances that support them.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted. You can attached encrypted
     * volumes only to instances that support them.
     * </p>
     *
     * @return <p>
     *         Indicates whether the volume is encrypted. You can attached
     *         encrypted volumes only to instances that support them.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted. You can attached encrypted
     * volumes only to instances that support them.
     * </p>
     *
     * @param encrypted <p>
     *            Indicates whether the volume is encrypted. You can attached
     *            encrypted volumes only to instances that support them.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the volume is encrypted. You can attached encrypted
     * volumes only to instances that support them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Indicates whether the volume is encrypted. You can attached
     *            encrypted volumes only to instances that support them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesEbs withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For io1 volumes, this represents the number of IOPS that are provisioned
     * for the volume. For <code>gp2</code> volumes, this represents the
     * baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting. For more information about
     * <code>gp2</code> baseline performance, I/O credits, and bursting, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes and
     * 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code>volumes; it is not used in requests to create
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code> volumes.
     * </p>
     *
     * @return <p>
     *         The number of I/O operations per second (IOPS) that the volume
     *         supports. For io1 volumes, this represents the number of IOPS
     *         that are provisioned for the volume. For <code>gp2</code>
     *         volumes, this represents the baseline performance of the volume
     *         and the rate at which the volume accumulates I/O credits for
     *         bursting. For more information about <code>gp2</code> baseline
     *         performance, I/O credits, and bursting, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *         >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes
     *         and 100-10000 IOPS for <code>gp2</code> volumes.
     *         </p>
     *         <p>
     *         Condition: This parameter is required for requests to create
     *         <code>io1</code>volumes; it is not used in requests to create
     *         <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     *         <code>standard</code> volumes.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For io1 volumes, this represents the number of IOPS that are provisioned
     * for the volume. For <code>gp2</code> volumes, this represents the
     * baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting. For more information about
     * <code>gp2</code> baseline performance, I/O credits, and bursting, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes and
     * 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code>volumes; it is not used in requests to create
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code> volumes.
     * </p>
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) that the volume
     *            supports. For io1 volumes, this represents the number of IOPS
     *            that are provisioned for the volume. For <code>gp2</code>
     *            volumes, this represents the baseline performance of the
     *            volume and the rate at which the volume accumulates I/O
     *            credits for bursting. For more information about
     *            <code>gp2</code> baseline performance, I/O credits, and
     *            bursting, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Constraint: Range is 100-20000 IOPS for <code>io1</code>
     *            volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     *            </p>
     *            <p>
     *            Condition: This parameter is required for requests to create
     *            <code>io1</code>volumes; it is not used in requests to create
     *            <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     *            <code>standard</code> volumes.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For io1 volumes, this represents the number of IOPS that are provisioned
     * for the volume. For <code>gp2</code> volumes, this represents the
     * baseline performance of the volume and the rate at which the volume
     * accumulates I/O credits for bursting. For more information about
     * <code>gp2</code> baseline performance, I/O credits, and bursting, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Constraint: Range is 100-20000 IOPS for <code>io1</code> volumes and
     * 100-10000 IOPS for <code>gp2</code> volumes.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create
     * <code>io1</code>volumes; it is not used in requests to create
     * <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     * <code>standard</code> volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) that the volume
     *            supports. For io1 volumes, this represents the number of IOPS
     *            that are provisioned for the volume. For <code>gp2</code>
     *            volumes, this represents the baseline performance of the
     *            volume and the rate at which the volume accumulates I/O
     *            credits for bursting. For more information about
     *            <code>gp2</code> baseline performance, I/O credits, and
     *            bursting, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Constraint: Range is 100-20000 IOPS for <code>io1</code>
     *            volumes and 100-10000 IOPS for <code>gp2</code> volumes.
     *            </p>
     *            <p>
     *            Condition: This parameter is required for requests to create
     *            <code>io1</code>volumes; it is not used in requests to create
     *            <code>gp2</code>, <code>st1</code>, <code>sc1</code>, or
     *            <code>standard</code> volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesEbs withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     *
     * @return <p>
     *         The ID of the snapshot.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     *
     * @param snapshotId <p>
     *            The ID of the snapshot.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotId <p>
     *            The ID of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesEbs withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     *
     * @return <p>
     *         The size of the volume, in GiB.
     *         </p>
     *         <p>
     *         Default: If you're creating the volume from a snapshot and don't
     *         specify a volume size, the default is the snapshot size.
     *         </p>
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     *
     * @param volumeSize <p>
     *            The size of the volume, in GiB.
     *            </p>
     *            <p>
     *            Default: If you're creating the volume from a snapshot and
     *            don't specify a volume size, the default is the snapshot size.
     *            </p>
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * <p>
     * Default: If you're creating the volume from a snapshot and don't specify
     * a volume size, the default is the snapshot size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeSize <p>
     *            The size of the volume, in GiB.
     *            </p>
     *            <p>
     *            Default: If you're creating the volume from a snapshot and
     *            don't specify a volume size, the default is the snapshot size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesEbs withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, Throughput Optimized HDD for
     * <code>st1</code>, Cold HDD for <code>sc1</code>, or <code>standard</code>
     * for Magnetic.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     *
     * @return <p>
     *         The volume type. <code>gp2</code> for General Purpose SSD,
     *         <code>io1</code> for Provisioned IOPS SSD, Throughput Optimized
     *         HDD for <code>st1</code>, Cold HDD for <code>sc1</code>, or
     *         <code>standard</code> for Magnetic.
     *         </p>
     *         <p>
     *         Default: <code>gp2</code>
     *         </p>
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, Throughput Optimized HDD for
     * <code>st1</code>, Cold HDD for <code>sc1</code>, or <code>standard</code>
     * for Magnetic.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     *
     * @param volumeType <p>
     *            The volume type. <code>gp2</code> for General Purpose SSD,
     *            <code>io1</code> for Provisioned IOPS SSD, Throughput
     *            Optimized HDD for <code>st1</code>, Cold HDD for
     *            <code>sc1</code>, or <code>standard</code> for Magnetic.
     *            </p>
     *            <p>
     *            Default: <code>gp2</code>
     *            </p>
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, Throughput Optimized HDD for
     * <code>st1</code>, Cold HDD for <code>sc1</code>, or <code>standard</code>
     * for Magnetic.
     * </p>
     * <p>
     * Default: <code>gp2</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeType <p>
     *            The volume type. <code>gp2</code> for General Purpose SSD,
     *            <code>io1</code> for Provisioned IOPS SSD, Throughput
     *            Optimized HDD for <code>st1</code>, Cold HDD for
     *            <code>sc1</code>, or <code>standard</code> for Magnetic.
     *            </p>
     *            <p>
     *            Default: <code>gp2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstancesEbs withVolumeType(String volumeType) {
        this.volumeType = volumeType;
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
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledInstancesEbs == false)
            return false;
        ScheduledInstancesEbs other = (ScheduledInstancesEbs) obj;

        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null
                && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null
                && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        return true;
    }
}
