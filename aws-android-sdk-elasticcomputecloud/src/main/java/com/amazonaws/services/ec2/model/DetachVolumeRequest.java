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
 * Detaches an EBS volume from an instance. Make sure to unmount any file
 * systems on the device within your operating system before detaching the
 * volume. Failure to do so can result in the volume becoming stuck in the
 * <code>busy</code> state while detaching. If this happens, detachment can be
 * delayed indefinitely until you unmount the volume, force detachment, reboot
 * the instance, or all three. If an EBS volume is the root device of an
 * instance, it can't be detached while the instance is running. To detach the
 * root volume, stop the instance first.
 * </p>
 * <p>
 * When a volume with an AWS Marketplace product code is detached from an
 * instance, the product code is no longer associated with the instance.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html"
 * >Detaching an Amazon EBS Volume</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 */
public class DetachVolumeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The device name.
     * </p>
     */
    private String device;

    /**
     * <p>
     * Forces detachment if the previous detachment attempt did not occur
     * cleanly (for example, logging into an instance, unmounting the volume,
     * and detaching normally). This option can lead to data loss or a corrupted
     * file system. Use this option only as a last resort to detach a volume
     * from a failed instance. The instance won't have an opportunity to flush
     * file system caches or file system metadata. If you use this option, you
     * must perform file system check and repair procedures.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The ID of the instance. If you are detaching a Multi-Attach enabled
     * volume, you must specify an instance ID.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The ID of the volume.
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
     * The device name.
     * </p>
     *
     * @return <p>
     *         The device name.
     *         </p>
     */
    public String getDevice() {
        return device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     *
     * @param device <p>
     *            The device name.
     *            </p>
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param device <p>
     *            The device name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachVolumeRequest withDevice(String device) {
        this.device = device;
        return this;
    }

    /**
     * <p>
     * Forces detachment if the previous detachment attempt did not occur
     * cleanly (for example, logging into an instance, unmounting the volume,
     * and detaching normally). This option can lead to data loss or a corrupted
     * file system. Use this option only as a last resort to detach a volume
     * from a failed instance. The instance won't have an opportunity to flush
     * file system caches or file system metadata. If you use this option, you
     * must perform file system check and repair procedures.
     * </p>
     *
     * @return <p>
     *         Forces detachment if the previous detachment attempt did not
     *         occur cleanly (for example, logging into an instance, unmounting
     *         the volume, and detaching normally). This option can lead to data
     *         loss or a corrupted file system. Use this option only as a last
     *         resort to detach a volume from a failed instance. The instance
     *         won't have an opportunity to flush file system caches or file
     *         system metadata. If you use this option, you must perform file
     *         system check and repair procedures.
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * Forces detachment if the previous detachment attempt did not occur
     * cleanly (for example, logging into an instance, unmounting the volume,
     * and detaching normally). This option can lead to data loss or a corrupted
     * file system. Use this option only as a last resort to detach a volume
     * from a failed instance. The instance won't have an opportunity to flush
     * file system caches or file system metadata. If you use this option, you
     * must perform file system check and repair procedures.
     * </p>
     *
     * @return <p>
     *         Forces detachment if the previous detachment attempt did not
     *         occur cleanly (for example, logging into an instance, unmounting
     *         the volume, and detaching normally). This option can lead to data
     *         loss or a corrupted file system. Use this option only as a last
     *         resort to detach a volume from a failed instance. The instance
     *         won't have an opportunity to flush file system caches or file
     *         system metadata. If you use this option, you must perform file
     *         system check and repair procedures.
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * Forces detachment if the previous detachment attempt did not occur
     * cleanly (for example, logging into an instance, unmounting the volume,
     * and detaching normally). This option can lead to data loss or a corrupted
     * file system. Use this option only as a last resort to detach a volume
     * from a failed instance. The instance won't have an opportunity to flush
     * file system caches or file system metadata. If you use this option, you
     * must perform file system check and repair procedures.
     * </p>
     *
     * @param force <p>
     *            Forces detachment if the previous detachment attempt did not
     *            occur cleanly (for example, logging into an instance,
     *            unmounting the volume, and detaching normally). This option
     *            can lead to data loss or a corrupted file system. Use this
     *            option only as a last resort to detach a volume from a failed
     *            instance. The instance won't have an opportunity to flush file
     *            system caches or file system metadata. If you use this option,
     *            you must perform file system check and repair procedures.
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Forces detachment if the previous detachment attempt did not occur
     * cleanly (for example, logging into an instance, unmounting the volume,
     * and detaching normally). This option can lead to data loss or a corrupted
     * file system. Use this option only as a last resort to detach a volume
     * from a failed instance. The instance won't have an opportunity to flush
     * file system caches or file system metadata. If you use this option, you
     * must perform file system check and repair procedures.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            Forces detachment if the previous detachment attempt did not
     *            occur cleanly (for example, logging into an instance,
     *            unmounting the volume, and detaching normally). This option
     *            can lead to data loss or a corrupted file system. Use this
     *            option only as a last resort to detach a volume from a failed
     *            instance. The instance won't have an opportunity to flush file
     *            system caches or file system metadata. If you use this option,
     *            you must perform file system check and repair procedures.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachVolumeRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * <p>
     * The ID of the instance. If you are detaching a Multi-Attach enabled
     * volume, you must specify an instance ID.
     * </p>
     *
     * @return <p>
     *         The ID of the instance. If you are detaching a Multi-Attach
     *         enabled volume, you must specify an instance ID.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance. If you are detaching a Multi-Attach enabled
     * volume, you must specify an instance ID.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance. If you are detaching a Multi-Attach
     *            enabled volume, you must specify an instance ID.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance. If you are detaching a Multi-Attach enabled
     * volume, you must specify an instance ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance. If you are detaching a Multi-Attach
     *            enabled volume, you must specify an instance ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachVolumeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
    public DetachVolumeRequest withVolumeId(String volumeId) {
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
    public DetachVolumeRequest withDryRun(Boolean dryRun) {
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
        if (getForce() != null)
            sb.append("Force: " + getForce() + ",");
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
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
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

        if (obj instanceof DetachVolumeRequest == false)
            return false;
        DetachVolumeRequest other = (DetachVolumeRequest) obj;

        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
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
