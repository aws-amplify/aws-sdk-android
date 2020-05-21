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
 * Attaches an EBS volume to a running or stopped instance and exposes it to the
 * instance with the specified device name.
 * </p>
 * <p>
 * Encrypted EBS volumes must be attached to instances that support Amazon EBS
 * encryption. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"
 * >Amazon EBS Encryption</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 * <p>
 * After you attach an EBS volume, you must make it available. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-using-volumes.html"
 * >Making an EBS Volume Available For Use</a>.
 * </p>
 * <p>
 * If a volume has an AWS Marketplace product code:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The volume can be attached only to a stopped instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * AWS Marketplace product codes are copied from the volume to the instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * You must be subscribed to the product.
 * </p>
 * </li>
 * <li>
 * <p>
 * The instance type and operating system of the instance must support the
 * product. For example, you can't detach a volume from a Windows instance and
 * attach it to a Linux instance.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"
 * >Attaching Amazon EBS Volumes</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class AttachVolumeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     */
    private String device;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The ID of the EBS volume. The volume and instance must be within the same
     * Availability Zone.
     * </p>
     */
    private String volumeId;

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
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     *
     * @return <p>
     *         The device name (for example, <code>/dev/sdh</code> or
     *         <code>xvdh</code>).
     *         </p>
     */
    public String getDevice() {
        return device;
    }

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     *
     * @param device <p>
     *            The device name (for example, <code>/dev/sdh</code> or
     *            <code>xvdh</code>).
     *            </p>
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * The device name (for example, <code>/dev/sdh</code> or <code>xvdh</code>
     * ).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param device <p>
     *            The device name (for example, <code>/dev/sdh</code> or
     *            <code>xvdh</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachVolumeRequest withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachVolumeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The ID of the EBS volume. The volume and instance must be within the same
     * Availability Zone.
     * </p>
     *
     * @return <p>
     *         The ID of the EBS volume. The volume and instance must be within
     *         the same Availability Zone.
     *         </p>
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * <p>
     * The ID of the EBS volume. The volume and instance must be within the same
     * Availability Zone.
     * </p>
     *
     * @param volumeId <p>
     *            The ID of the EBS volume. The volume and instance must be
     *            within the same Availability Zone.
     *            </p>
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the EBS volume. The volume and instance must be within the same
     * Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeId <p>
     *            The ID of the EBS volume. The volume and instance must be
     *            within the same Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachVolumeRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
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
    public AttachVolumeRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getDevice() != null)
            sb.append("Device: " + getDevice() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachVolumeRequest == false)
            return false;
        AttachVolumeRequest other = (AttachVolumeRequest) obj;

        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
