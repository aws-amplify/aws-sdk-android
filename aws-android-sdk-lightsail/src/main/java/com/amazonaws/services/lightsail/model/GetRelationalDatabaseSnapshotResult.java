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

public class GetRelationalDatabaseSnapshotResult implements Serializable {
    /**
     * <p>
     * An object describing the specified database snapshot.
     * </p>
     */
    private RelationalDatabaseSnapshot relationalDatabaseSnapshot;

    /**
     * <p>
     * An object describing the specified database snapshot.
     * </p>
     *
     * @return <p>
     *         An object describing the specified database snapshot.
     *         </p>
     */
    public RelationalDatabaseSnapshot getRelationalDatabaseSnapshot() {
        return relationalDatabaseSnapshot;
    }

    /**
     * <p>
     * An object describing the specified database snapshot.
     * </p>
     *
     * @param relationalDatabaseSnapshot <p>
     *            An object describing the specified database snapshot.
     *            </p>
     */
    public void setRelationalDatabaseSnapshot(RelationalDatabaseSnapshot relationalDatabaseSnapshot) {
        this.relationalDatabaseSnapshot = relationalDatabaseSnapshot;
    }

    /**
     * <p>
     * An object describing the specified database snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relationalDatabaseSnapshot <p>
     *            An object describing the specified database snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseSnapshotResult withRelationalDatabaseSnapshot(
            RelationalDatabaseSnapshot relationalDatabaseSnapshot) {
        this.relationalDatabaseSnapshot = relationalDatabaseSnapshot;
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
        if (getRelationalDatabaseSnapshot() != null)
            sb.append("relationalDatabaseSnapshot: " + getRelationalDatabaseSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRelationalDatabaseSnapshot() == null) ? 0 : getRelationalDatabaseSnapshot()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseSnapshotResult == false)
            return false;
        GetRelationalDatabaseSnapshotResult other = (GetRelationalDatabaseSnapshotResult) obj;

        if (other.getRelationalDatabaseSnapshot() == null
                ^ this.getRelationalDatabaseSnapshot() == null)
            return false;
        if (other.getRelationalDatabaseSnapshot() != null
                && other.getRelationalDatabaseSnapshot().equals(
                        this.getRelationalDatabaseSnapshot()) == false)
            return false;
        return true;
    }
}
