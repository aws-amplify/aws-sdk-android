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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disconnects a volume from an iSCSI connection and then detaches the volume
 * from the specified gateway. Detaching and attaching a volume enables you to
 * recover your data from one gateway to a different gateway without creating a
 * snapshot. It also makes it easier to move your volumes from an on-premises
 * gateway to a gateway hosted on an Amazon EC2 instance. This operation is only
 * supported in the volume gateway type.
 * </p>
 */
public class DetachVolumeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * <p>
     * Set to <code>true</code> to forcibly remove the iSCSI connection of the
     * target volume and detach the volume. The default is <code>false</code>.
     * If this value is set to <code>false</code>, you must manually disconnect
     * the iSCSI connection from the target volume.
     * </p>
     */
    private Boolean forceDetach;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the volume to detach from the
     *         gateway.
     *         </p>
     */
    public String getVolumeARN() {
        return volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the volume to detach from
     *            the gateway.
     *            </p>
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the volume to detach from
     *            the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachVolumeRequest withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to forcibly remove the iSCSI connection of the
     * target volume and detach the volume. The default is <code>false</code>.
     * If this value is set to <code>false</code>, you must manually disconnect
     * the iSCSI connection from the target volume.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to forcibly remove the iSCSI connection
     *         of the target volume and detach the volume. The default is
     *         <code>false</code>. If this value is set to <code>false</code>,
     *         you must manually disconnect the iSCSI connection from the target
     *         volume.
     *         </p>
     */
    public Boolean isForceDetach() {
        return forceDetach;
    }

    /**
     * <p>
     * Set to <code>true</code> to forcibly remove the iSCSI connection of the
     * target volume and detach the volume. The default is <code>false</code>.
     * If this value is set to <code>false</code>, you must manually disconnect
     * the iSCSI connection from the target volume.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to forcibly remove the iSCSI connection
     *         of the target volume and detach the volume. The default is
     *         <code>false</code>. If this value is set to <code>false</code>,
     *         you must manually disconnect the iSCSI connection from the target
     *         volume.
     *         </p>
     */
    public Boolean getForceDetach() {
        return forceDetach;
    }

    /**
     * <p>
     * Set to <code>true</code> to forcibly remove the iSCSI connection of the
     * target volume and detach the volume. The default is <code>false</code>.
     * If this value is set to <code>false</code>, you must manually disconnect
     * the iSCSI connection from the target volume.
     * </p>
     *
     * @param forceDetach <p>
     *            Set to <code>true</code> to forcibly remove the iSCSI
     *            connection of the target volume and detach the volume. The
     *            default is <code>false</code>. If this value is set to
     *            <code>false</code>, you must manually disconnect the iSCSI
     *            connection from the target volume.
     *            </p>
     */
    public void setForceDetach(Boolean forceDetach) {
        this.forceDetach = forceDetach;
    }

    /**
     * <p>
     * Set to <code>true</code> to forcibly remove the iSCSI connection of the
     * target volume and detach the volume. The default is <code>false</code>.
     * If this value is set to <code>false</code>, you must manually disconnect
     * the iSCSI connection from the target volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceDetach <p>
     *            Set to <code>true</code> to forcibly remove the iSCSI
     *            connection of the target volume and detach the volume. The
     *            default is <code>false</code>. If this value is set to
     *            <code>false</code>, you must manually disconnect the iSCSI
     *            connection from the target volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachVolumeRequest withForceDetach(Boolean forceDetach) {
        this.forceDetach = forceDetach;
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
        if (getForceDetach() != null)
            sb.append("ForceDetach: " + getForceDetach());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode
                + ((getForceDetach() == null) ? 0 : getForceDetach().hashCode());
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

        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getForceDetach() == null ^ this.getForceDetach() == null)
            return false;
        if (other.getForceDetach() != null
                && other.getForceDetach().equals(this.getForceDetach()) == false)
            return false;
        return true;
    }
}
