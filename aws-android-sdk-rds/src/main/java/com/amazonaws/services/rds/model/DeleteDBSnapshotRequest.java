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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is
 * terminated.
 * </p>
 * <note>
 * <p>
 * The DB snapshot must be in the <code>available</code> state to be deleted.
 * </p>
 * </note>
 */
public class DeleteDBSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The DB snapshot identifier.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB snapshot in the
     * <code>available</code> state.
     * </p>
     */
    private String dBSnapshotIdentifier;

    /**
     * <p>
     * The DB snapshot identifier.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB snapshot in the
     * <code>available</code> state.
     * </p>
     *
     * @return <p>
     *         The DB snapshot identifier.
     *         </p>
     *         <p>
     *         Constraints: Must be the name of an existing DB snapshot in the
     *         <code>available</code> state.
     *         </p>
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB snapshot identifier.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB snapshot in the
     * <code>available</code> state.
     * </p>
     *
     * @param dBSnapshotIdentifier <p>
     *            The DB snapshot identifier.
     *            </p>
     *            <p>
     *            Constraints: Must be the name of an existing DB snapshot in
     *            the <code>available</code> state.
     *            </p>
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB snapshot identifier.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB snapshot in the
     * <code>available</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshotIdentifier <p>
     *            The DB snapshot identifier.
     *            </p>
     *            <p>
     *            Constraints: Must be the name of an existing DB snapshot in
     *            the <code>available</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBSnapshotRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
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
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBSnapshotRequest == false)
            return false;
        DeleteDBSnapshotRequest other = (DeleteDBSnapshotRequest) obj;

        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null
                && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        return true;
    }
}
