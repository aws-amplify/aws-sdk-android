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
 * Describes a <code>RevisionTarget</code>.
 * </p>
 */
public class RevisionTarget implements Serializable {
    /**
     * <p>
     * A unique string that identifies the version to update the cluster to. You
     * can use this value in <a>ModifyClusterDbRevision</a>.
     * </p>
     */
    private String databaseRevision;

    /**
     * <p>
     * A string that describes the changes and features that will be applied to
     * the cluster when it is updated to the corresponding
     * <a>ClusterDbRevision</a>.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The date on which the database revision was released.
     * </p>
     */
    private java.util.Date databaseRevisionReleaseDate;

    /**
     * <p>
     * A unique string that identifies the version to update the cluster to. You
     * can use this value in <a>ModifyClusterDbRevision</a>.
     * </p>
     *
     * @return <p>
     *         A unique string that identifies the version to update the cluster
     *         to. You can use this value in <a>ModifyClusterDbRevision</a>.
     *         </p>
     */
    public String getDatabaseRevision() {
        return databaseRevision;
    }

    /**
     * <p>
     * A unique string that identifies the version to update the cluster to. You
     * can use this value in <a>ModifyClusterDbRevision</a>.
     * </p>
     *
     * @param databaseRevision <p>
     *            A unique string that identifies the version to update the
     *            cluster to. You can use this value in
     *            <a>ModifyClusterDbRevision</a>.
     *            </p>
     */
    public void setDatabaseRevision(String databaseRevision) {
        this.databaseRevision = databaseRevision;
    }

    /**
     * <p>
     * A unique string that identifies the version to update the cluster to. You
     * can use this value in <a>ModifyClusterDbRevision</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseRevision <p>
     *            A unique string that identifies the version to update the
     *            cluster to. You can use this value in
     *            <a>ModifyClusterDbRevision</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionTarget withDatabaseRevision(String databaseRevision) {
        this.databaseRevision = databaseRevision;
        return this;
    }

    /**
     * <p>
     * A string that describes the changes and features that will be applied to
     * the cluster when it is updated to the corresponding
     * <a>ClusterDbRevision</a>.
     * </p>
     *
     * @return <p>
     *         A string that describes the changes and features that will be
     *         applied to the cluster when it is updated to the corresponding
     *         <a>ClusterDbRevision</a>.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A string that describes the changes and features that will be applied to
     * the cluster when it is updated to the corresponding
     * <a>ClusterDbRevision</a>.
     * </p>
     *
     * @param description <p>
     *            A string that describes the changes and features that will be
     *            applied to the cluster when it is updated to the corresponding
     *            <a>ClusterDbRevision</a>.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A string that describes the changes and features that will be applied to
     * the cluster when it is updated to the corresponding
     * <a>ClusterDbRevision</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A string that describes the changes and features that will be
     *            applied to the cluster when it is updated to the corresponding
     *            <a>ClusterDbRevision</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionTarget withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date on which the database revision was released.
     * </p>
     *
     * @return <p>
     *         The date on which the database revision was released.
     *         </p>
     */
    public java.util.Date getDatabaseRevisionReleaseDate() {
        return databaseRevisionReleaseDate;
    }

    /**
     * <p>
     * The date on which the database revision was released.
     * </p>
     *
     * @param databaseRevisionReleaseDate <p>
     *            The date on which the database revision was released.
     *            </p>
     */
    public void setDatabaseRevisionReleaseDate(java.util.Date databaseRevisionReleaseDate) {
        this.databaseRevisionReleaseDate = databaseRevisionReleaseDate;
    }

    /**
     * <p>
     * The date on which the database revision was released.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseRevisionReleaseDate <p>
     *            The date on which the database revision was released.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionTarget withDatabaseRevisionReleaseDate(java.util.Date databaseRevisionReleaseDate) {
        this.databaseRevisionReleaseDate = databaseRevisionReleaseDate;
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
        if (getDatabaseRevision() != null)
            sb.append("DatabaseRevision: " + getDatabaseRevision() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDatabaseRevisionReleaseDate() != null)
            sb.append("DatabaseRevisionReleaseDate: " + getDatabaseRevisionReleaseDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDatabaseRevision() == null) ? 0 : getDatabaseRevision().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getDatabaseRevisionReleaseDate() == null) ? 0
                        : getDatabaseRevisionReleaseDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevisionTarget == false)
            return false;
        RevisionTarget other = (RevisionTarget) obj;

        if (other.getDatabaseRevision() == null ^ this.getDatabaseRevision() == null)
            return false;
        if (other.getDatabaseRevision() != null
                && other.getDatabaseRevision().equals(this.getDatabaseRevision()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDatabaseRevisionReleaseDate() == null
                ^ this.getDatabaseRevisionReleaseDate() == null)
            return false;
        if (other.getDatabaseRevisionReleaseDate() != null
                && other.getDatabaseRevisionReleaseDate().equals(
                        this.getDatabaseRevisionReleaseDate()) == false)
            return false;
        return true;
    }
}
