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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 */
public class CreateStorediSCSIVolumeResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured volume.
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
     * The Amazon Resource Name (ARN) of the volume target, which includes the
     * iSCSI name that initiators can use to connect to the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     */
    private String targetARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the configured volume.
     *         </p>
     */
    public String getVolumeARN() {
        return volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the configured volume.
     *            </p>
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the configured volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStorediSCSIVolumeResult withVolumeARN(String volumeARN) {
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
    public CreateStorediSCSIVolumeResult withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target, which includes the
     * iSCSI name that initiators can use to connect to the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the volume target, which
     *         includes the iSCSI name that initiators can use to connect to the
     *         target.
     *         </p>
     */
    public String getTargetARN() {
        return targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target, which includes the
     * iSCSI name that initiators can use to connect to the target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN <p>
     *            The Amazon Resource Name (ARN) of the volume target, which
     *            includes the iSCSI name that initiators can use to connect to
     *            the target.
     *            </p>
     */
    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target, which includes the
     * iSCSI name that initiators can use to connect to the target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN <p>
     *            The Amazon Resource Name (ARN) of the volume target, which
     *            includes the iSCSI name that initiators can use to connect to
     *            the target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStorediSCSIVolumeResult withTargetARN(String targetARN) {
        this.targetARN = targetARN;
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
        if (getTargetARN() != null)
            sb.append("TargetARN: " + getTargetARN());
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
        hashCode = prime * hashCode + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStorediSCSIVolumeResult == false)
            return false;
        CreateStorediSCSIVolumeResult other = (CreateStorediSCSIVolumeResult) obj;

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
        if (other.getTargetARN() == null ^ this.getTargetARN() == null)
            return false;
        if (other.getTargetARN() != null
                && other.getTargetARN().equals(this.getTargetARN()) == false)
            return false;
        return true;
    }
}
