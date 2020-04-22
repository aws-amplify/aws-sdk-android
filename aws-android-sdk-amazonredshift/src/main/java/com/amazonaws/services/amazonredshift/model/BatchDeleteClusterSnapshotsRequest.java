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
 * Deletes a set of cluster snapshots.
 * </p>
 */
public class BatchDeleteClusterSnapshotsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A list of identifiers for the snapshots that you want to delete.
     * </p>
     */
    private java.util.List<DeleteClusterSnapshotMessage> identifiers;

    /**
     * <p>
     * A list of identifiers for the snapshots that you want to delete.
     * </p>
     *
     * @return <p>
     *         A list of identifiers for the snapshots that you want to delete.
     *         </p>
     */
    public java.util.List<DeleteClusterSnapshotMessage> getIdentifiers() {
        return identifiers;
    }

    /**
     * <p>
     * A list of identifiers for the snapshots that you want to delete.
     * </p>
     *
     * @param identifiers <p>
     *            A list of identifiers for the snapshots that you want to
     *            delete.
     *            </p>
     */
    public void setIdentifiers(java.util.Collection<DeleteClusterSnapshotMessage> identifiers) {
        if (identifiers == null) {
            this.identifiers = null;
            return;
        }

        this.identifiers = new java.util.ArrayList<DeleteClusterSnapshotMessage>(identifiers);
    }

    /**
     * <p>
     * A list of identifiers for the snapshots that you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifiers <p>
     *            A list of identifiers for the snapshots that you want to
     *            delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteClusterSnapshotsRequest withIdentifiers(
            DeleteClusterSnapshotMessage... identifiers) {
        if (getIdentifiers() == null) {
            this.identifiers = new java.util.ArrayList<DeleteClusterSnapshotMessage>(
                    identifiers.length);
        }
        for (DeleteClusterSnapshotMessage value : identifiers) {
            this.identifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of identifiers for the snapshots that you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifiers <p>
     *            A list of identifiers for the snapshots that you want to
     *            delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteClusterSnapshotsRequest withIdentifiers(
            java.util.Collection<DeleteClusterSnapshotMessage> identifiers) {
        setIdentifiers(identifiers);
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
        if (getIdentifiers() != null)
            sb.append("Identifiers: " + getIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIdentifiers() == null) ? 0 : getIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteClusterSnapshotsRequest == false)
            return false;
        BatchDeleteClusterSnapshotsRequest other = (BatchDeleteClusterSnapshotsRequest) obj;

        if (other.getIdentifiers() == null ^ this.getIdentifiers() == null)
            return false;
        if (other.getIdentifiers() != null
                && other.getIdentifiers().equals(this.getIdentifiers()) == false)
            return false;
        return true;
    }
}
