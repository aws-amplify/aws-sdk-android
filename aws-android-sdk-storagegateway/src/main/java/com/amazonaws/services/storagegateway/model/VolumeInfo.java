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
 * Describes a storage volume object.
 * </p>
 */
public class VolumeInfo implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the
     * following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the
     * volume Amazon Resource Name (ARN), which you use as input for other
     * operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     */
    private String volumeId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     */
    private String gatewayId;

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     */
    private String volumeType;

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     */
    private Long volumeSizeInBytes;

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     */
    private String volumeAttachmentStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the
     * following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the storage volume. For
     *         example, the following is a valid ARN:
     *         </p>
     *         <p>
     *         <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     *         </p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     *         </p>
     */
    public String getVolumeARN() {
        return volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the
     * following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) for the storage volume. For
     *            example, the following is a valid ARN:
     *            </p>
     *            <p>
     *            <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     *            </p>
     *            <p>
     *            Valid Values: 50 to 500 lowercase letters, numbers, periods
     *            (.), and hyphens (-).
     *            </p>
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the storage volume. For example, the
     * following is a valid ARN:
     * </p>
     * <p>
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) for the storage volume. For
     *            example, the following is a valid ARN:
     *            </p>
     *            <p>
     *            <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/volume/vol-1122AABB</code>
     *            </p>
     *            <p>
     *            Valid Values: 50 to 500 lowercase letters, numbers, periods
     *            (.), and hyphens (-).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeInfo withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the
     * volume Amazon Resource Name (ARN), which you use as input for other
     * operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @return <p>
     *         The unique identifier assigned to the volume. This ID becomes
     *         part of the volume Amazon Resource Name (ARN), which you use as
     *         input for other operations.
     *         </p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the
     * volume Amazon Resource Name (ARN), which you use as input for other
     * operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param volumeId <p>
     *            The unique identifier assigned to the volume. This ID becomes
     *            part of the volume Amazon Resource Name (ARN), which you use
     *            as input for other operations.
     *            </p>
     *            <p>
     *            Valid Values: 50 to 500 lowercase letters, numbers, periods
     *            (.), and hyphens (-).
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The unique identifier assigned to the volume. This ID becomes part of the
     * volume Amazon Resource Name (ARN), which you use as input for other
     * operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param volumeId <p>
     *            The unique identifier assigned to the volume. This ID becomes
     *            part of the volume Amazon Resource Name (ARN), which you use
     *            as input for other operations.
     *            </p>
     *            <p>
     *            Valid Values: 50 to 500 lowercase letters, numbers, periods
     *            (.), and hyphens (-).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeInfo withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeInfo withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @return <p>
     *         The unique identifier assigned to your gateway during activation.
     *         This ID becomes part of the gateway Amazon Resource Name (ARN),
     *         which you use as input for other operations.
     *         </p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     *         </p>
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param gatewayId <p>
     *            The unique identifier assigned to your gateway during
     *            activation. This ID becomes part of the gateway Amazon
     *            Resource Name (ARN), which you use as input for other
     *            operations.
     *            </p>
     *            <p>
     *            Valid Values: 50 to 500 lowercase letters, numbers, periods
     *            (.), and hyphens (-).
     *            </p>
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param gatewayId <p>
     *            The unique identifier assigned to your gateway during
     *            activation. This ID becomes part of the gateway Amazon
     *            Resource Name (ARN), which you use as input for other
     *            operations.
     *            </p>
     *            <p>
     *            Valid Values: 50 to 500 lowercase letters, numbers, periods
     *            (.), and hyphens (-).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeInfo withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @return <p>
     *         One of the VolumeType enumeration values describing the type of
     *         the volume.
     *         </p>
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @param volumeType <p>
     *            One of the VolumeType enumeration values describing the type
     *            of the volume.
     *            </p>
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * One of the VolumeType enumeration values describing the type of the
     * volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 100<br/>
     *
     * @param volumeType <p>
     *            One of the VolumeType enumeration values describing the type
     *            of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeInfo withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     *
     * @return <p>
     *         The size of the volume in bytes.
     *         </p>
     *         <p>
     *         Valid Values: 50 to 500 lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     *         </p>
     */
    public Long getVolumeSizeInBytes() {
        return volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * <p>
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     *
     * @param volumeSizeInBytes <p>
     *            The size of the volume in bytes.
     *            </p>
     *            <p>
     *            Valid Values: 50 to 500 lowercase letters, numbers, periods
     *            (.), and hyphens (-).
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
     * Valid Values: 50 to 500 lowercase letters, numbers, periods (.), and
     * hyphens (-).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeSizeInBytes <p>
     *            The size of the volume in bytes.
     *            </p>
     *            <p>
     *            Valid Values: 50 to 500 lowercase letters, numbers, periods
     *            (.), and hyphens (-).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeInfo withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @return <p>
     *         One of the VolumeStatus values that indicates the state of the
     *         storage volume.
     *         </p>
     */
    public String getVolumeAttachmentStatus() {
        return volumeAttachmentStatus;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage
     * volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param volumeAttachmentStatus <p>
     *            One of the VolumeStatus values that indicates the state of the
     *            storage volume.
     *            </p>
     */
    public void setVolumeAttachmentStatus(String volumeAttachmentStatus) {
        this.volumeAttachmentStatus = volumeAttachmentStatus;
    }

    /**
     * <p>
     * One of the VolumeStatus values that indicates the state of the storage
     * volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param volumeAttachmentStatus <p>
     *            One of the VolumeStatus values that indicates the state of the
     *            storage volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeInfo withVolumeAttachmentStatus(String volumeAttachmentStatus) {
        this.volumeAttachmentStatus = volumeAttachmentStatus;
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
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getGatewayId() != null)
            sb.append("GatewayId: " + getGatewayId() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getVolumeSizeInBytes() != null)
            sb.append("VolumeSizeInBytes: " + getVolumeSizeInBytes() + ",");
        if (getVolumeAttachmentStatus() != null)
            sb.append("VolumeAttachmentStatus: " + getVolumeAttachmentStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode());
        hashCode = prime
                * hashCode
                + ((getVolumeAttachmentStatus() == null) ? 0 : getVolumeAttachmentStatus()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeInfo == false)
            return false;
        VolumeInfo other = (VolumeInfo) obj;

        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null
                && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null
                && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null)
            return false;
        if (other.getVolumeSizeInBytes() != null
                && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false)
            return false;
        if (other.getVolumeAttachmentStatus() == null ^ this.getVolumeAttachmentStatus() == null)
            return false;
        if (other.getVolumeAttachmentStatus() != null
                && other.getVolumeAttachmentStatus().equals(this.getVolumeAttachmentStatus()) == false)
            return false;
        return true;
    }
}
