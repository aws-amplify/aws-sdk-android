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
 * The parameters for a block device for an EBS volume.
 * </p>
 */
public class LaunchTemplateEbsBlockDeviceRequest implements Serializable {
    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only
     * be attached to instances that support Amazon EBS encryption. If you are
     * creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For io1, this represents the number of IOPS that are provisioned for the
     * volume. For gp2, this represents the baseline performance of the volume
     * and the rate at which the volume accumulates I/O credits for bursting.
     * For more information about General Purpose SSD baseline performance, I/O
     * credits, and bursting, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create io1 volumes;
     * it is not used in requests to create gp2, st1, sc1, or standard volumes.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * The ARN of the symmetric AWS Key Management Service (AWS KMS) CMK used
     * for encryption.
     * </p>
     */
    private String kmsKeyId;

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
     * The volume type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     */
    private String volumeType;

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only
     * be attached to instances that support Amazon EBS encryption. If you are
     * creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     *
     * @return <p>
     *         Indicates whether the EBS volume is encrypted. Encrypted volumes
     *         can only be attached to instances that support Amazon EBS
     *         encryption. If you are creating a volume from a snapshot, you
     *         can't specify an encryption value.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only
     * be attached to instances that support Amazon EBS encryption. If you are
     * creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     *
     * @return <p>
     *         Indicates whether the EBS volume is encrypted. Encrypted volumes
     *         can only be attached to instances that support Amazon EBS
     *         encryption. If you are creating a volume from a snapshot, you
     *         can't specify an encryption value.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only
     * be attached to instances that support Amazon EBS encryption. If you are
     * creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     *
     * @param encrypted <p>
     *            Indicates whether the EBS volume is encrypted. Encrypted
     *            volumes can only be attached to instances that support Amazon
     *            EBS encryption. If you are creating a volume from a snapshot,
     *            you can't specify an encryption value.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only
     * be attached to instances that support Amazon EBS encryption. If you are
     * creating a volume from a snapshot, you can't specify an encryption value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Indicates whether the EBS volume is encrypted. Encrypted
     *            volumes can only be attached to instances that support Amazon
     *            EBS encryption. If you are creating a volume from a snapshot,
     *            you can't specify an encryption value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateEbsBlockDeviceRequest withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     *
     * @return <p>
     *         Indicates whether the EBS volume is deleted on instance
     *         termination.
     *         </p>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     *
     * @return <p>
     *         Indicates whether the EBS volume is deleted on instance
     *         termination.
     *         </p>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the EBS volume is deleted on instance
     *            termination.
     *            </p>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the EBS volume is deleted on instance
     *            termination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateEbsBlockDeviceRequest withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For io1, this represents the number of IOPS that are provisioned for the
     * volume. For gp2, this represents the baseline performance of the volume
     * and the rate at which the volume accumulates I/O credits for bursting.
     * For more information about General Purpose SSD baseline performance, I/O
     * credits, and bursting, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create io1 volumes;
     * it is not used in requests to create gp2, st1, sc1, or standard volumes.
     * </p>
     *
     * @return <p>
     *         The number of I/O operations per second (IOPS) that the volume
     *         supports. For io1, this represents the number of IOPS that are
     *         provisioned for the volume. For gp2, this represents the baseline
     *         performance of the volume and the rate at which the volume
     *         accumulates I/O credits for bursting. For more information about
     *         General Purpose SSD baseline performance, I/O credits, and
     *         bursting, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *         >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         Condition: This parameter is required for requests to create io1
     *         volumes; it is not used in requests to create gp2, st1, sc1, or
     *         standard volumes.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For io1, this represents the number of IOPS that are provisioned for the
     * volume. For gp2, this represents the baseline performance of the volume
     * and the rate at which the volume accumulates I/O credits for bursting.
     * For more information about General Purpose SSD baseline performance, I/O
     * credits, and bursting, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create io1 volumes;
     * it is not used in requests to create gp2, st1, sc1, or standard volumes.
     * </p>
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) that the volume
     *            supports. For io1, this represents the number of IOPS that are
     *            provisioned for the volume. For gp2, this represents the
     *            baseline performance of the volume and the rate at which the
     *            volume accumulates I/O credits for bursting. For more
     *            information about General Purpose SSD baseline performance,
     *            I/O credits, and bursting, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Condition: This parameter is required for requests to create
     *            io1 volumes; it is not used in requests to create gp2, st1,
     *            sc1, or standard volumes.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The number of I/O operations per second (IOPS) that the volume supports.
     * For io1, this represents the number of IOPS that are provisioned for the
     * volume. For gp2, this represents the baseline performance of the volume
     * and the rate at which the volume accumulates I/O credits for bursting.
     * For more information about General Purpose SSD baseline performance, I/O
     * credits, and bursting, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Condition: This parameter is required for requests to create io1 volumes;
     * it is not used in requests to create gp2, st1, sc1, or standard volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            The number of I/O operations per second (IOPS) that the volume
     *            supports. For io1, this represents the number of IOPS that are
     *            provisioned for the volume. For gp2, this represents the
     *            baseline performance of the volume and the rate at which the
     *            volume accumulates I/O credits for bursting. For more
     *            information about General Purpose SSD baseline performance,
     *            I/O credits, and bursting, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a> in the <i>Amazon Elastic Compute
     *            Cloud User Guide</i>.
     *            </p>
     *            <p>
     *            Condition: This parameter is required for requests to create
     *            io1 volumes; it is not used in requests to create gp2, st1,
     *            sc1, or standard volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateEbsBlockDeviceRequest withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * The ARN of the symmetric AWS Key Management Service (AWS KMS) CMK used
     * for encryption.
     * </p>
     *
     * @return <p>
     *         The ARN of the symmetric AWS Key Management Service (AWS KMS) CMK
     *         used for encryption.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the symmetric AWS Key Management Service (AWS KMS) CMK used
     * for encryption.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The ARN of the symmetric AWS Key Management Service (AWS KMS)
     *            CMK used for encryption.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the symmetric AWS Key Management Service (AWS KMS) CMK used
     * for encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The ARN of the symmetric AWS Key Management Service (AWS KMS)
     *            CMK used for encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateEbsBlockDeviceRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
    public LaunchTemplateEbsBlockDeviceRequest withSnapshotId(String snapshotId) {
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
    public LaunchTemplateEbsBlockDeviceRequest withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     *
     * @return <p>
     *         The volume type.
     *         </p>
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type.
     *            </p>
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public LaunchTemplateEbsBlockDeviceRequest withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type.
     *            </p>
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }

    /**
     * <p>
     * The volume type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The volume type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public LaunchTemplateEbsBlockDeviceRequest withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
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
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
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

        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
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

        if (obj instanceof LaunchTemplateEbsBlockDeviceRequest == false)
            return false;
        LaunchTemplateEbsBlockDeviceRequest other = (LaunchTemplateEbsBlockDeviceRequest) obj;

        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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
