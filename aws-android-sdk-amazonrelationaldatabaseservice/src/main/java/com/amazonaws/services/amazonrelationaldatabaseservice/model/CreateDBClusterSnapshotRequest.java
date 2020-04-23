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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a snapshot of a DB cluster. For more information on Amazon Aurora,
 * see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
 * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class CreateDBClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the DB cluster snapshot. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1-snapshot1</code>
     * </p>
     */
    private String dBClusterSnapshotIdentifier;

    /**
     * <p>
     * The identifier of the DB cluster to create a snapshot for. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The tags to be assigned to the DB cluster snapshot.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier of the DB cluster snapshot. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1-snapshot1</code>
     * </p>
     *
     * @return <p>
     *         The identifier of the DB cluster snapshot. This parameter is
     *         stored as a lowercase string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster1-snapshot1</code>
     *         </p>
     */
    public String getDBClusterSnapshotIdentifier() {
        return dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1-snapshot1</code>
     * </p>
     *
     * @param dBClusterSnapshotIdentifier <p>
     *            The identifier of the DB cluster snapshot. This parameter is
     *            stored as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster1-snapshot1</code>
     *            </p>
     */
    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1-snapshot1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshotIdentifier <p>
     *            The identifier of the DB cluster snapshot. This parameter is
     *            stored as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster1-snapshot1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterSnapshotRequest withDBClusterSnapshotIdentifier(
            String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the DB cluster to create a snapshot for. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     *
     * @return <p>
     *         The identifier of the DB cluster to create a snapshot for. This
     *         parameter isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DBCluster.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster1</code>
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster to create a snapshot for. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The identifier of the DB cluster to create a snapshot for.
     *            This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DBCluster.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster1</code>
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster to create a snapshot for. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The identifier of the DB cluster to create a snapshot for.
     *            This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DBCluster.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterSnapshotRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the DB cluster snapshot.
     * </p>
     *
     * @return <p>
     *         The tags to be assigned to the DB cluster snapshot.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the DB cluster snapshot.
     * </p>
     *
     * @param tags <p>
     *            The tags to be assigned to the DB cluster snapshot.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to be assigned to the DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be assigned to the DB cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterSnapshotRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be assigned to the DB cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDBClusterSnapshotIdentifier() != null)
            sb.append("DBClusterSnapshotIdentifier: " + getDBClusterSnapshotIdentifier() + ",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterSnapshotIdentifier() == null) ? 0
                        : getDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBClusterSnapshotRequest == false)
            return false;
        CreateDBClusterSnapshotRequest other = (CreateDBClusterSnapshotRequest) obj;

        if (other.getDBClusterSnapshotIdentifier() == null
                ^ this.getDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDBClusterSnapshotIdentifier() != null
                && other.getDBClusterSnapshotIdentifier().equals(
                        this.getDBClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
