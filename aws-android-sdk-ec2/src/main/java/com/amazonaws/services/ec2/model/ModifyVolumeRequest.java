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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * You can modify several parameters of an existing EBS volume, including volume
 * size, volume type, and IOPS capacity. If your EBS volume is attached to a
 * current-generation EC2 instance type, you may be able to apply these changes
 * without stopping the instance or detaching the volume from it. For more
 * information about modifying an EBS volume running Linux, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html"
 * >Modifying the Size, IOPS, or Type of an EBS Volume on Linux</a>. For more
 * information about modifying an EBS volume running Windows, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-expand-volume.html"
 * >Modifying the Size, IOPS, or Type of an EBS Volume on Windows</a>.
 * </p>
 * <p>
 * When you complete a resize operation on your volume, you need to extend the
 * volume's file-system size to take advantage of the new storage capacity. For
 * information about extending a Linux file system, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#recognize-expanded-volume-linux"
 * >Extending a Linux File System</a>. For information about extending a Windows
 * file system, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-expand-volume.html#recognize-expanded-volume-windows"
 * >Extending a Windows File System</a>.
 * </p>
 * <p>
 * You can use CloudWatch Events to check the status of a modification to an EBS
 * volume. For information about CloudWatch Events, see the <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/">Amazon
 * CloudWatch Events User Guide</a>. You can also track the status of a
 * modification using <a>DescribeVolumesModifications</a>. For information about
 * tracking status changes using either method, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html#monitoring_mods"
 * >Monitoring Volume Modifications</a>.
 * </p>
 * <p>
 * With previous-generation instance types, resizing an EBS volume may require
 * detaching and reattaching the volume or stopping and restarting the instance.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-expand-volume.html"
 * >Modifying the Size, IOPS, or Type of an EBS Volume on Linux</a> and <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ebs-expand-volume.html"
 * >Modifying the Size, IOPS, or Type of an EBS Volume on Windows</a>.
 * </p>
 * <p>
 * If you reach the maximum volume modification rate per volume limit, you will
 * need to wait at least six hours before applying further modifications to the
 * affected EBS volume.
 * </p>
 */
public class ModifyVolumeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be
     * greater than or equal to than the existing size of the volume. For
     * information about available EBS volume sizes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a>.
     * </p>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     */
    private String volumeType;

    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     * <p>
     * This is only valid for Provisioned IOPS SSD (<code>io1</code>) volumes.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops"
     * >Provisioned IOPS SSD (io1) Volumes</a>.
     * </p>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVolumeRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     *
     * @return <p>
     *         The ID of the volume.
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     *
     * @param volumeId <p>
     *            The ID of the volume.
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeId <p>
     *            The ID of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVolumeRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be
     * greater than or equal to than the existing size of the volume. For
     * information about available EBS volume sizes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a>.
     * </p>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     *
     * @return <p>
     *         The target size of the volume, in GiB. The target volume size
     *         must be greater than or equal to than the existing size of the
     *         volume. For information about available EBS volume sizes, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *         >Amazon EBS Volume Types</a>.
     *         </p>
     *         <p>
     *         Default: If no size is specified, the existing size is retained.
     *         </p>
     */
    public Integer getSize() {
        return size;
    }

    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be
     * greater than or equal to than the existing size of the volume. For
     * information about available EBS volume sizes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a>.
     * </p>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     *
     * @param size <p>
     *            The target size of the volume, in GiB. The target volume size
     *            must be greater than or equal to than the existing size of the
     *            volume. For information about available EBS volume sizes, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a>.
     *            </p>
     *            <p>
     *            Default: If no size is specified, the existing size is
     *            retained.
     *            </p>
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The target size of the volume, in GiB. The target volume size must be
     * greater than or equal to than the existing size of the volume. For
     * information about available EBS volume sizes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     * >Amazon EBS Volume Types</a>.
     * </p>
     * <p>
     * Default: If no size is specified, the existing size is retained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            The target size of the volume, in GiB. The target volume size
     *            must be greater than or equal to than the existing size of the
     *            volume. For information about available EBS volume sizes, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"
     *            >Amazon EBS Volume Types</a>.
     *            </p>
     *            <p>
     *            Default: If no size is specified, the existing size is
     *            retained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVolumeRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     *
     * @return <p>
     *         The target EBS volume type of the volume.
     *         </p>
     *         <p>
     *         Default: If no type is specified, the existing type is retained.
     *         </p>
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The target EBS volume type of the volume.
     *            </p>
     *            <p>
     *            Default: If no type is specified, the existing type is
     *            retained.
     *            </p>
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The target EBS volume type of the volume.
     *            </p>
     *            <p>
     *            Default: If no type is specified, the existing type is
     *            retained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public ModifyVolumeRequest withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The target EBS volume type of the volume.
     *            </p>
     *            <p>
     *            Default: If no type is specified, the existing type is
     *            retained.
     *            </p>
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }

    /**
     * <p>
     * The target EBS volume type of the volume.
     * </p>
     * <p>
     * Default: If no type is specified, the existing type is retained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, io1, io2, gp2, sc1, st1
     *
     * @param volumeType <p>
     *            The target EBS volume type of the volume.
     *            </p>
     *            <p>
     *            Default: If no type is specified, the existing type is
     *            retained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public ModifyVolumeRequest withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     * <p>
     * This is only valid for Provisioned IOPS SSD (<code>io1</code>) volumes.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops"
     * >Provisioned IOPS SSD (io1) Volumes</a>.
     * </p>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     *
     * @return <p>
     *         The target IOPS rate of the volume.
     *         </p>
     *         <p>
     *         This is only valid for Provisioned IOPS SSD (<code>io1</code>)
     *         volumes. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops"
     *         >Provisioned IOPS SSD (io1) Volumes</a>.
     *         </p>
     *         <p>
     *         Default: If no IOPS value is specified, the existing value is
     *         retained.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     * <p>
     * This is only valid for Provisioned IOPS SSD (<code>io1</code>) volumes.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops"
     * >Provisioned IOPS SSD (io1) Volumes</a>.
     * </p>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     *
     * @param iops <p>
     *            The target IOPS rate of the volume.
     *            </p>
     *            <p>
     *            This is only valid for Provisioned IOPS SSD (<code>io1</code>)
     *            volumes. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops"
     *            >Provisioned IOPS SSD (io1) Volumes</a>.
     *            </p>
     *            <p>
     *            Default: If no IOPS value is specified, the existing value is
     *            retained.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The target IOPS rate of the volume.
     * </p>
     * <p>
     * This is only valid for Provisioned IOPS SSD (<code>io1</code>) volumes.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops"
     * >Provisioned IOPS SSD (io1) Volumes</a>.
     * </p>
     * <p>
     * Default: If no IOPS value is specified, the existing value is retained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            The target IOPS rate of the volume.
     *            </p>
     *            <p>
     *            This is only valid for Provisioned IOPS SSD (<code>io1</code>)
     *            volumes. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html#EBSVolumeTypes_piops"
     *            >Provisioned IOPS SSD (io1) Volumes</a>.
     *            </p>
     *            <p>
     *            Default: If no IOPS value is specified, the existing value is
     *            retained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVolumeRequest withIops(Integer iops) {
        this.iops = iops;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVolumeRequest == false)
            return false;
        ModifyVolumeRequest other = (ModifyVolumeRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null
                && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        return true;
    }
}
