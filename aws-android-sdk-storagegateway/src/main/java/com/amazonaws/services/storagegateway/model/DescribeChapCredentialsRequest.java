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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns an array of Challenge-Handshake Authentication Protocol (CHAP)
 * credentials information for a specified iSCSI target, one for each
 * target-initiator pair. This operation is supported in the volume and tape
 * gateway types.
 * </p>
 */
public class DescribeChapCredentialsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     */
    private String targetARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the iSCSI volume target. Use
     *         the <a>DescribeStorediSCSIVolumes</a> operation to return to
     *         retrieve the TargetARN for specified VolumeARN.
     *         </p>
     */
    public String getTargetARN() {
        return targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN <p>
     *            The Amazon Resource Name (ARN) of the iSCSI volume target. Use
     *            the <a>DescribeStorediSCSIVolumes</a> operation to return to
     *            retrieve the TargetARN for specified VolumeARN.
     *            </p>
     */
    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN <p>
     *            The Amazon Resource Name (ARN) of the iSCSI volume target. Use
     *            the <a>DescribeStorediSCSIVolumes</a> operation to return to
     *            retrieve the TargetARN for specified VolumeARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeChapCredentialsRequest withTargetARN(String targetARN) {
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
        if (getTargetARN() != null)
            sb.append("TargetARN: " + getTargetARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChapCredentialsRequest == false)
            return false;
        DescribeChapCredentialsRequest other = (DescribeChapCredentialsRequest) obj;

        if (other.getTargetARN() == null ^ this.getTargetARN() == null)
            return false;
        if (other.getTargetARN() != null
                && other.getTargetARN().equals(this.getTargetARN()) == false)
            return false;
        return true;
    }
}
