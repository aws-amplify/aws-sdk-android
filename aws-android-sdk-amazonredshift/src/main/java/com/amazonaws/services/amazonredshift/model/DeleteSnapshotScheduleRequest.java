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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a snapshot schedule.
 * </p>
 */
public class DeleteSnapshotScheduleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier of the snapshot schedule to delete.
     * </p>
     */
    private String scheduleIdentifier;

    /**
     * <p>
     * A unique identifier of the snapshot schedule to delete.
     * </p>
     *
     * @return <p>
     *         A unique identifier of the snapshot schedule to delete.
     *         </p>
     */
    public String getScheduleIdentifier() {
        return scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier of the snapshot schedule to delete.
     * </p>
     *
     * @param scheduleIdentifier <p>
     *            A unique identifier of the snapshot schedule to delete.
     *            </p>
     */
    public void setScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier of the snapshot schedule to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduleIdentifier <p>
     *            A unique identifier of the snapshot schedule to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSnapshotScheduleRequest withScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
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
        if (getScheduleIdentifier() != null)
            sb.append("ScheduleIdentifier: " + getScheduleIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduleIdentifier() == null) ? 0 : getScheduleIdentifier().hashCode());
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

        if (other.getScheduleIdentifier() == null ^ this.getScheduleIdentifier() == null)
            return false;
        if (other.getScheduleIdentifier() != null
                && other.getScheduleIdentifier().equals(this.getScheduleIdentifier()) == false)
            return false;
        return true;
    }
}
