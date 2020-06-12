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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a storage volume recovery point object.
 * </p>
 */
public class VolumeRecoveryPointInfo implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     */
    private Long volumeSizeInBytes;

    /**
     * <p>
     * The size of the data stored on the volume in bytes.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015,
     * until you store data on the volume.
     * </p>
     * </note>
     */
    private Long volumeUsageInBytes;

    /**
     * <p>
     * The time the recovery point was taken.
     * </p>
     */
    private String volumeRecoveryPointTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the volume target.
     *         </p>
     */
    public String getVolumeARN() {
        return volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the volume target.
     *            </p>
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the volume target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeRecoveryPointInfo withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     *
     * @return <p>
     *         The size of the volume in bytes.
     *         </p>
     */
    public Long getVolumeSizeInBytes() {
        return volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     *
     * @param volumeSizeInBytes <p>
     *            The size of the volume in bytes.
     *            </p>
     */
    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeSizeInBytes <p>
     *            The size of the volume in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeRecoveryPointInfo withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015,
     * until you store data on the volume.
     * </p>
     * </note>
     *
     * @return <p>
     *         The size of the data stored on the volume in bytes.
     *         </p>
     *         <note>
     *         <p>
     *         This value is not available for volumes created prior to May 13,
     *         2015, until you store data on the volume.
     *         </p>
     *         </note>
     */
    public Long getVolumeUsageInBytes() {
        return volumeUsageInBytes;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015,
     * until you store data on the volume.
     * </p>
     * </note>
     *
     * @param volumeUsageInBytes <p>
     *            The size of the data stored on the volume in bytes.
     *            </p>
     *            <note>
     *            <p>
     *            This value is not available for volumes created prior to May
     *            13, 2015, until you store data on the volume.
     *            </p>
     *            </note>
     */
    public void setVolumeUsageInBytes(Long volumeUsageInBytes) {
        this.volumeUsageInBytes = volumeUsageInBytes;
    }

    /**
     * <p>
     * The size of the data stored on the volume in bytes.
     * </p>
     * <note>
     * <p>
     * This value is not available for volumes created prior to May 13, 2015,
     * until you store data on the volume.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeUsageInBytes <p>
     *            The size of the data stored on the volume in bytes.
     *            </p>
     *            <note>
     *            <p>
     *            This value is not available for volumes created prior to May
     *            13, 2015, until you store data on the volume.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeRecoveryPointInfo withVolumeUsageInBytes(Long volumeUsageInBytes) {
        this.volumeUsageInBytes = volumeUsageInBytes;
        return this;
    }

    /**
     * <p>
     * The time the recovery point was taken.
     * </p>
     *
     * @return <p>
     *         The time the recovery point was taken.
     *         </p>
     */
    public String getVolumeRecoveryPointTime() {
        return volumeRecoveryPointTime;
    }

    /**
     * <p>
     * The time the recovery point was taken.
     * </p>
     *
     * @param volumeRecoveryPointTime <p>
     *            The time the recovery point was taken.
     *            </p>
     */
    public void setVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        this.volumeRecoveryPointTime = volumeRecoveryPointTime;
    }

    /**
     * <p>
     * The time the recovery point was taken.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeRecoveryPointTime <p>
     *            The time the recovery point was taken.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeRecoveryPointInfo withVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        this.volumeRecoveryPointTime = volumeRecoveryPointTime;
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getVolumeSizeInBytes() != null)
            sb.append("VolumeSizeInBytes: " + getVolumeSizeInBytes() + ",");
        if (getVolumeUsageInBytes() != null)
            sb.append("VolumeUsageInBytes: " + getVolumeUsageInBytes() + ",");
        if (getVolumeRecoveryPointTime() != null)
            sb.append("VolumeRecoveryPointTime: " + getVolumeRecoveryPointTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeUsageInBytes() == null) ? 0 : getVolumeUsageInBytes().hashCode());
        hashCode = prime
                * hashCode
                + ((getVolumeRecoveryPointTime() == null) ? 0 : getVolumeRecoveryPointTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeRecoveryPointInfo == false)
            return false;
        VolumeRecoveryPointInfo other = (VolumeRecoveryPointInfo) obj;

        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null)
            return false;
        if (other.getVolumeSizeInBytes() != null
                && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false)
            return false;
        if (other.getVolumeUsageInBytes() == null ^ this.getVolumeUsageInBytes() == null)
            return false;
        if (other.getVolumeUsageInBytes() != null
                && other.getVolumeUsageInBytes().equals(this.getVolumeUsageInBytes()) == false)
            return false;
        if (other.getVolumeRecoveryPointTime() == null ^ this.getVolumeRecoveryPointTime() == null)
            return false;
        if (other.getVolumeRecoveryPointTime() != null
                && other.getVolumeRecoveryPointTime().equals(this.getVolumeRecoveryPointTime()) == false)
            return false;
        return true;
    }
}
