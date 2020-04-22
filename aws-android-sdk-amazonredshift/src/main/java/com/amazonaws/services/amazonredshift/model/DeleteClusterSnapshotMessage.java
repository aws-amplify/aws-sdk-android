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

/**
 * <p/>
 */
public class DeleteClusterSnapshotMessage implements Serializable {
    /**
     * <p>
     * The unique identifier of the manual snapshot to be deleted.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing snapshot that is in the
     * <code>available</code>, <code>failed</code>, or <code>cancelled</code>
     * state.
     * </p>
     */
    private String snapshotIdentifier;

    /**
     * <p>
     * The unique identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster.
     * </p>
     */
    private String snapshotClusterIdentifier;

    /**
     * <p>
     * The unique identifier of the manual snapshot to be deleted.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing snapshot that is in the
     * <code>available</code>, <code>failed</code>, or <code>cancelled</code>
     * state.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the manual snapshot to be deleted.
     *         </p>
     *         <p>
     *         Constraints: Must be the name of an existing snapshot that is in
     *         the <code>available</code>, <code>failed</code>, or
     *         <code>cancelled</code> state.
     *         </p>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the manual snapshot to be deleted.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing snapshot that is in the
     * <code>available</code>, <code>failed</code>, or <code>cancelled</code>
     * state.
     * </p>
     *
     * @param snapshotIdentifier <p>
     *            The unique identifier of the manual snapshot to be deleted.
     *            </p>
     *            <p>
     *            Constraints: Must be the name of an existing snapshot that is
     *            in the <code>available</code>, <code>failed</code>, or
     *            <code>cancelled</code> state.
     *            </p>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the manual snapshot to be deleted.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing snapshot that is in the
     * <code>available</code>, <code>failed</code>, or <code>cancelled</code>
     * state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifier <p>
     *            The unique identifier of the manual snapshot to be deleted.
     *            </p>
     *            <p>
     *            Constraints: Must be the name of an existing snapshot that is
     *            in the <code>available</code>, <code>failed</code>, or
     *            <code>cancelled</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteClusterSnapshotMessage withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the cluster the snapshot was created
     *         from. This parameter is required if your IAM user has a policy
     *         containing a snapshot resource element that specifies anything
     *         other than * for the cluster name.
     *         </p>
     *         <p>
     *         Constraints: Must be the name of valid cluster.
     *         </p>
     */
    public String getSnapshotClusterIdentifier() {
        return snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster.
     * </p>
     *
     * @param snapshotClusterIdentifier <p>
     *            The unique identifier of the cluster the snapshot was created
     *            from. This parameter is required if your IAM user has a policy
     *            containing a snapshot resource element that specifies anything
     *            other than * for the cluster name.
     *            </p>
     *            <p>
     *            Constraints: Must be the name of valid cluster.
     *            </p>
     */
    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     * <p>
     * Constraints: Must be the name of valid cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotClusterIdentifier <p>
     *            The unique identifier of the cluster the snapshot was created
     *            from. This parameter is required if your IAM user has a policy
     *            containing a snapshot resource element that specifies anything
     *            other than * for the cluster name.
     *            </p>
     *            <p>
     *            Constraints: Must be the name of valid cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteClusterSnapshotMessage withSnapshotClusterIdentifier(
            String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
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
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSnapshotClusterIdentifier() != null)
            sb.append("SnapshotClusterIdentifier: " + getSnapshotClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotClusterIdentifier() == null) ? 0 : getSnapshotClusterIdentifier()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClusterSnapshotMessage == false)
            return false;
        DeleteClusterSnapshotMessage other = (DeleteClusterSnapshotMessage) obj;

        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotClusterIdentifier() == null
                ^ this.getSnapshotClusterIdentifier() == null)
            return false;
        if (other.getSnapshotClusterIdentifier() != null
                && other.getSnapshotClusterIdentifier().equals(this.getSnapshotClusterIdentifier()) == false)
            return false;
        return true;
    }
}
