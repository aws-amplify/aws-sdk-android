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
 * Describes a <code>ClusterDbRevision</code>.
 * </p>
 */
public class ClusterDbRevision implements Serializable {
    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * A string representing the current cluster version.
     * </p>
     */
    private String currentDatabaseRevision;

    /**
     * <p>
     * The date on which the database revision was released.
     * </p>
     */
    private java.util.Date databaseRevisionReleaseDate;

    /**
     * <p>
     * A list of <code>RevisionTarget</code> objects, where each object
     * describes the database revision that a cluster can be updated to.
     * </p>
     */
    private java.util.List<RevisionTarget> revisionTargets;

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the cluster.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterDbRevision withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * A string representing the current cluster version.
     * </p>
     *
     * @return <p>
     *         A string representing the current cluster version.
     *         </p>
     */
    public String getCurrentDatabaseRevision() {
        return currentDatabaseRevision;
    }

    /**
     * <p>
     * A string representing the current cluster version.
     * </p>
     *
     * @param currentDatabaseRevision <p>
     *            A string representing the current cluster version.
     *            </p>
     */
    public void setCurrentDatabaseRevision(String currentDatabaseRevision) {
        this.currentDatabaseRevision = currentDatabaseRevision;
    }

    /**
     * <p>
     * A string representing the current cluster version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentDatabaseRevision <p>
     *            A string representing the current cluster version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterDbRevision withCurrentDatabaseRevision(String currentDatabaseRevision) {
        this.currentDatabaseRevision = currentDatabaseRevision;
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
    public ClusterDbRevision withDatabaseRevisionReleaseDate(
            java.util.Date databaseRevisionReleaseDate) {
        this.databaseRevisionReleaseDate = databaseRevisionReleaseDate;
        return this;
    }

    /**
     * <p>
     * A list of <code>RevisionTarget</code> objects, where each object
     * describes the database revision that a cluster can be updated to.
     * </p>
     *
     * @return <p>
     *         A list of <code>RevisionTarget</code> objects, where each object
     *         describes the database revision that a cluster can be updated to.
     *         </p>
     */
    public java.util.List<RevisionTarget> getRevisionTargets() {
        return revisionTargets;
    }

    /**
     * <p>
     * A list of <code>RevisionTarget</code> objects, where each object
     * describes the database revision that a cluster can be updated to.
     * </p>
     *
     * @param revisionTargets <p>
     *            A list of <code>RevisionTarget</code> objects, where each
     *            object describes the database revision that a cluster can be
     *            updated to.
     *            </p>
     */
    public void setRevisionTargets(java.util.Collection<RevisionTarget> revisionTargets) {
        if (revisionTargets == null) {
            this.revisionTargets = null;
            return;
        }

        this.revisionTargets = new java.util.ArrayList<RevisionTarget>(revisionTargets);
    }

    /**
     * <p>
     * A list of <code>RevisionTarget</code> objects, where each object
     * describes the database revision that a cluster can be updated to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionTargets <p>
     *            A list of <code>RevisionTarget</code> objects, where each
     *            object describes the database revision that a cluster can be
     *            updated to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterDbRevision withRevisionTargets(RevisionTarget... revisionTargets) {
        if (getRevisionTargets() == null) {
            this.revisionTargets = new java.util.ArrayList<RevisionTarget>(revisionTargets.length);
        }
        for (RevisionTarget value : revisionTargets) {
            this.revisionTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>RevisionTarget</code> objects, where each object
     * describes the database revision that a cluster can be updated to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionTargets <p>
     *            A list of <code>RevisionTarget</code> objects, where each
     *            object describes the database revision that a cluster can be
     *            updated to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterDbRevision withRevisionTargets(
            java.util.Collection<RevisionTarget> revisionTargets) {
        setRevisionTargets(revisionTargets);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getCurrentDatabaseRevision() != null)
            sb.append("CurrentDatabaseRevision: " + getCurrentDatabaseRevision() + ",");
        if (getDatabaseRevisionReleaseDate() != null)
            sb.append("DatabaseRevisionReleaseDate: " + getDatabaseRevisionReleaseDate() + ",");
        if (getRevisionTargets() != null)
            sb.append("RevisionTargets: " + getRevisionTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentDatabaseRevision() == null) ? 0 : getCurrentDatabaseRevision()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDatabaseRevisionReleaseDate() == null) ? 0
                        : getDatabaseRevisionReleaseDate().hashCode());
        hashCode = prime * hashCode
                + ((getRevisionTargets() == null) ? 0 : getRevisionTargets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterDbRevision == false)
            return false;
        ClusterDbRevision other = (ClusterDbRevision) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getCurrentDatabaseRevision() == null ^ this.getCurrentDatabaseRevision() == null)
            return false;
        if (other.getCurrentDatabaseRevision() != null
                && other.getCurrentDatabaseRevision().equals(this.getCurrentDatabaseRevision()) == false)
            return false;
        if (other.getDatabaseRevisionReleaseDate() == null
                ^ this.getDatabaseRevisionReleaseDate() == null)
            return false;
        if (other.getDatabaseRevisionReleaseDate() != null
                && other.getDatabaseRevisionReleaseDate().equals(
                        this.getDatabaseRevisionReleaseDate()) == false)
            return false;
        if (other.getRevisionTargets() == null ^ this.getRevisionTargets() == null)
            return false;
        if (other.getRevisionTargets() != null
                && other.getRevisionTargets().equals(this.getRevisionTargets()) == false)
            return false;
        return true;
    }
}
