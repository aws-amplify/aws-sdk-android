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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetInstanceSnapshotResult implements Serializable {
    /**
     * <p>
     * An array of key-value pairs containing information about the results of
     * your get instance snapshot request.
     * </p>
     */
    private InstanceSnapshot instanceSnapshot;

    /**
     * <p>
     * An array of key-value pairs containing information about the results of
     * your get instance snapshot request.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs containing information about the
     *         results of your get instance snapshot request.
     *         </p>
     */
    public InstanceSnapshot getInstanceSnapshot() {
        return instanceSnapshot;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of
     * your get instance snapshot request.
     * </p>
     *
     * @param instanceSnapshot <p>
     *            An array of key-value pairs containing information about the
     *            results of your get instance snapshot request.
     *            </p>
     */
    public void setInstanceSnapshot(InstanceSnapshot instanceSnapshot) {
        this.instanceSnapshot = instanceSnapshot;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the results of
     * your get instance snapshot request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceSnapshot <p>
     *            An array of key-value pairs containing information about the
     *            results of your get instance snapshot request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceSnapshotResult withInstanceSnapshot(InstanceSnapshot instanceSnapshot) {
        this.instanceSnapshot = instanceSnapshot;
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
        if (getInstanceSnapshot() != null)
            sb.append("instanceSnapshot: " + getInstanceSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceSnapshot() == null) ? 0 : getInstanceSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceSnapshotResult == false)
            return false;
        GetInstanceSnapshotResult other = (GetInstanceSnapshotResult) obj;

        if (other.getInstanceSnapshot() == null ^ this.getInstanceSnapshot() == null)
            return false;
        if (other.getInstanceSnapshot() != null
                && other.getInstanceSnapshot().equals(this.getInstanceSnapshot()) == false)
            return false;
        return true;
    }
}
