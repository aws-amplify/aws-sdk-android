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
 * <p>
 * Describes the errors returned by a snapshot.
 * </p>
 */
public class SnapshotErrorMessage implements Serializable {
    /**
     * <p>
     * A unique identifier for the snapshot returning the error.
     * </p>
     */
    private String snapshotIdentifier;

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     */
    private String snapshotClusterIdentifier;

    /**
     * <p>
     * The failure code for the error.
     * </p>
     */
    private String failureCode;

    /**
     * <p>
     * The text message describing the error.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * A unique identifier for the snapshot returning the error.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the snapshot returning the error.
     *         </p>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot returning the error.
     * </p>
     *
     * @param snapshotIdentifier <p>
     *            A unique identifier for the snapshot returning the error.
     *            </p>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot returning the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifier <p>
     *            A unique identifier for the snapshot returning the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotErrorMessage withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the cluster.
     *         </p>
     */
    public String getSnapshotClusterIdentifier() {
        return snapshotClusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     *
     * @param snapshotClusterIdentifier <p>
     *            A unique identifier for the cluster.
     *            </p>
     */
    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotClusterIdentifier <p>
     *            A unique identifier for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotErrorMessage withSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The failure code for the error.
     * </p>
     *
     * @return <p>
     *         The failure code for the error.
     *         </p>
     */
    public String getFailureCode() {
        return failureCode;
    }

    /**
     * <p>
     * The failure code for the error.
     * </p>
     *
     * @param failureCode <p>
     *            The failure code for the error.
     *            </p>
     */
    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code for the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureCode <p>
     *            The failure code for the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotErrorMessage withFailureCode(String failureCode) {
        this.failureCode = failureCode;
        return this;
    }

    /**
     * <p>
     * The text message describing the error.
     * </p>
     *
     * @return <p>
     *         The text message describing the error.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The text message describing the error.
     * </p>
     *
     * @param failureReason <p>
     *            The text message describing the error.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The text message describing the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            The text message describing the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnapshotErrorMessage withFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
            sb.append("SnapshotClusterIdentifier: " + getSnapshotClusterIdentifier() + ",");
        if (getFailureCode() != null)
            sb.append("FailureCode: " + getFailureCode() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason());
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
        hashCode = prime * hashCode
                + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotErrorMessage == false)
            return false;
        SnapshotErrorMessage other = (SnapshotErrorMessage) obj;

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
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null
                && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
