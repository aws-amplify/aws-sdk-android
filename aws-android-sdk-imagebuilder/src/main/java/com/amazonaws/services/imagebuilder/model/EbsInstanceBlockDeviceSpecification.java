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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

/**
 * <p>
 * Amazon EBS-specific block device mapping specifications.
 * </p>
 */
public class EbsInstanceBlockDeviceSpecification implements Serializable {
    /**
     * <p>
     * Use to configure device encryption.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * Use to configure delete on termination of the associated device.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * Use to configure device IOPS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 10000<br/>
     */
    private Integer iops;

    /**
     * <p>
     * Use to configure the KMS key to use when encrypting the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The snapshot that defines the device contents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String snapshotId;

    /**
     * <p>
     * Use to override the device's volume size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16000<br/>
     */
    private Integer volumeSize;

    /**
     * <p>
     * Use to override the device's volume type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     */
    private String volumeType;

    /**
     * <p>
     * Use to configure device encryption.
     * </p>
     *
     * @return <p>
     *         Use to configure device encryption.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Use to configure device encryption.
     * </p>
     *
     * @return <p>
     *         Use to configure device encryption.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Use to configure device encryption.
     * </p>
     *
     * @param encrypted <p>
     *            Use to configure device encryption.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Use to configure device encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Use to configure device encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsInstanceBlockDeviceSpecification withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * Use to configure delete on termination of the associated device.
     * </p>
     *
     * @return <p>
     *         Use to configure delete on termination of the associated device.
     *         </p>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Use to configure delete on termination of the associated device.
     * </p>
     *
     * @return <p>
     *         Use to configure delete on termination of the associated device.
     *         </p>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Use to configure delete on termination of the associated device.
     * </p>
     *
     * @param deleteOnTermination <p>
     *            Use to configure delete on termination of the associated
     *            device.
     *            </p>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Use to configure delete on termination of the associated device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteOnTermination <p>
     *            Use to configure delete on termination of the associated
     *            device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsInstanceBlockDeviceSpecification withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * <p>
     * Use to configure device IOPS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 10000<br/>
     *
     * @return <p>
     *         Use to configure device IOPS.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * Use to configure device IOPS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 10000<br/>
     *
     * @param iops <p>
     *            Use to configure device IOPS.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Use to configure device IOPS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 10000<br/>
     *
     * @param iops <p>
     *            Use to configure device IOPS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsInstanceBlockDeviceSpecification withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * Use to configure the KMS key to use when encrypting the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Use to configure the KMS key to use when encrypting the device.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * Use to configure the KMS key to use when encrypting the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param kmsKeyId <p>
     *            Use to configure the KMS key to use when encrypting the
     *            device.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Use to configure the KMS key to use when encrypting the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param kmsKeyId <p>
     *            Use to configure the KMS key to use when encrypting the
     *            device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsInstanceBlockDeviceSpecification withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The snapshot that defines the device contents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The snapshot that defines the device contents.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The snapshot that defines the device contents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param snapshotId <p>
     *            The snapshot that defines the device contents.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot that defines the device contents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param snapshotId <p>
     *            The snapshot that defines the device contents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsInstanceBlockDeviceSpecification withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * Use to override the device's volume size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16000<br/>
     *
     * @return <p>
     *         Use to override the device's volume size.
     *         </p>
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    /**
     * <p>
     * Use to override the device's volume size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16000<br/>
     *
     * @param volumeSize <p>
     *            Use to override the device's volume size.
     *            </p>
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * Use to override the device's volume size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16000<br/>
     *
     * @param volumeSize <p>
     *            Use to override the device's volume size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EbsInstanceBlockDeviceSpecification withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * <p>
     * Use to override the device's volume type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @return <p>
     *         Use to override the device's volume type.
     *         </p>
     * @see EbsVolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * <p>
     * Use to override the device's volume type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            Use to override the device's volume type.
     *            </p>
     * @see EbsVolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * Use to override the device's volume type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            Use to override the device's volume type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EbsVolumeType
     */
    public EbsInstanceBlockDeviceSpecification withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * <p>
     * Use to override the device's volume type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            Use to override the device's volume type.
     *            </p>
     * @see EbsVolumeType
     */
    public void setVolumeType(EbsVolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }

    /**
     * <p>
     * Use to override the device's volume type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            Use to override the device's volume type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EbsVolumeType
     */
    public EbsInstanceBlockDeviceSpecification withVolumeType(EbsVolumeType volumeType) {
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
            sb.append("encrypted: " + getEncrypted() + ",");
        if (getDeleteOnTermination() != null)
            sb.append("deleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getIops() != null)
            sb.append("iops: " + getIops() + ",");
        if (getKmsKeyId() != null)
            sb.append("kmsKeyId: " + getKmsKeyId() + ",");
        if (getSnapshotId() != null)
            sb.append("snapshotId: " + getSnapshotId() + ",");
        if (getVolumeSize() != null)
            sb.append("volumeSize: " + getVolumeSize() + ",");
        if (getVolumeType() != null)
            sb.append("volumeType: " + getVolumeType());
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

        if (obj instanceof EbsInstanceBlockDeviceSpecification == false)
            return false;
        EbsInstanceBlockDeviceSpecification other = (EbsInstanceBlockDeviceSpecification) obj;

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
