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

public class DeleteSnapshotScheduleResult implements Serializable {
    /**
     * <p>
     * The volume which snapshot schedule was deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * <p>
     * The volume which snapshot schedule was deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The volume which snapshot schedule was deleted.
     *         </p>
     */
    public String getVolumeARN() {
        return volumeARN;
    }

    /**
     * <p>
     * The volume which snapshot schedule was deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The volume which snapshot schedule was deleted.
     *            </p>
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The volume which snapshot schedule was deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The volume which snapshot schedule was deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSnapshotScheduleResult withVolumeARN(String volumeARN) {
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

        if (obj instanceof DeleteSnapshotScheduleResult == false)
            return false;
        DeleteSnapshotScheduleResult other = (DeleteSnapshotScheduleResult) obj;

        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        return true;
    }
}
