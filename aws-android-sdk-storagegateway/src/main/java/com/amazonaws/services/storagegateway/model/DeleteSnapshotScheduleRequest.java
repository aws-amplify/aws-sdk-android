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
 * Deletes a snapshot of a volume.
 * </p>
 * <p>
 * You can take snapshots of your gateway volumes on a scheduled or ad hoc
 * basis. This API action enables you to delete a snapshot schedule for a
 * volume. For more information, see <a href=
 * "https://docs.aws.amazon.com/storagegatewaylatest/userguide/backing-up-volumes.html"
 * >Backing up your volumes</a>. In the <code>DeleteSnapshotSchedule</code>
 * request, you identify the volume by providing its Amazon Resource Name (ARN).
 * This operation is only supported in stored and cached volume gateway types.
 * </p>
 * <note>
 * <p>
 * To list or delete a snapshot, you must use the Amazon EC2 API. For more
 * information, go to <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSnapshots.html"
 * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
 * Reference</i>.
 * </p>
 * </note>
 */
public class DeleteSnapshotScheduleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The volume which snapshot schedule to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * <p>
     * The volume which snapshot schedule to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The volume which snapshot schedule to delete.
     *         </p>
     */
    public String getVolumeARN() {
        return volumeARN;
    }

    /**
     * <p>
     * The volume which snapshot schedule to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The volume which snapshot schedule to delete.
     *            </p>
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The volume which snapshot schedule to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The volume which snapshot schedule to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSnapshotScheduleRequest withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
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
            sb.append("VolumeARN: " + getVolumeARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSnapshotScheduleRequest == false)
            return false;
        DeleteSnapshotScheduleRequest other = (DeleteSnapshotScheduleRequest) obj;

        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        return true;
    }
}
