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
 * Modify a setting for an Amazon Aurora global cluster. You can change one or
 * more database configuration parameters by specifying these parameters and the
 * new values in the request. For more information on Amazon Aurora, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
 * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class ModifyGlobalClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The DB cluster identifier for the global cluster being modified. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String globalClusterIdentifier;

    /**
     * <p>
     * The new cluster identifier for the global database cluster when modifying
     * a global database cluster. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     */
    private String newGlobalClusterIdentifier;

    /**
     * <p>
     * Indicates if the global database cluster has deletion protection enabled.
     * The global database cluster can't be deleted when deletion protection is
     * enabled.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * The DB cluster identifier for the global cluster being modified. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The DB cluster identifier for the global cluster being modified.
     *         This parameter isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing global database cluster.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getGlobalClusterIdentifier() {
        return globalClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the global cluster being modified. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     *
     * @param globalClusterIdentifier <p>
     *            The DB cluster identifier for the global cluster being
     *            modified. This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing global database
     *            cluster.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the global cluster being modified. This
     * parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing global database cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusterIdentifier <p>
     *            The DB cluster identifier for the global cluster being
     *            modified. This parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing global database
     *            cluster.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyGlobalClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The new cluster identifier for the global database cluster when modifying
     * a global database cluster. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     *
     * @return <p>
     *         The new cluster identifier for the global database cluster when
     *         modifying a global database cluster. This value is stored as a
     *         lowercase string.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster2</code>
     *         </p>
     */
    public String getNewGlobalClusterIdentifier() {
        return newGlobalClusterIdentifier;
    }

    /**
     * <p>
     * The new cluster identifier for the global database cluster when modifying
     * a global database cluster. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     *
     * @param newGlobalClusterIdentifier <p>
     *            The new cluster identifier for the global database cluster
     *            when modifying a global database cluster. This value is stored
     *            as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster2</code>
     *            </p>
     */
    public void setNewGlobalClusterIdentifier(String newGlobalClusterIdentifier) {
        this.newGlobalClusterIdentifier = newGlobalClusterIdentifier;
    }

    /**
     * <p>
     * The new cluster identifier for the global database cluster when modifying
     * a global database cluster. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newGlobalClusterIdentifier <p>
     *            The new cluster identifier for the global database cluster
     *            when modifying a global database cluster. This value is stored
     *            as a lowercase string.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyGlobalClusterRequest withNewGlobalClusterIdentifier(
            String newGlobalClusterIdentifier) {
        this.newGlobalClusterIdentifier = newGlobalClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * Indicates if the global database cluster has deletion protection enabled.
     * The global database cluster can't be deleted when deletion protection is
     * enabled.
     * </p>
     *
     * @return <p>
     *         Indicates if the global database cluster has deletion protection
     *         enabled. The global database cluster can't be deleted when
     *         deletion protection is enabled.
     *         </p>
     */
    public Boolean isDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * Indicates if the global database cluster has deletion protection enabled.
     * The global database cluster can't be deleted when deletion protection is
     * enabled.
     * </p>
     *
     * @return <p>
     *         Indicates if the global database cluster has deletion protection
     *         enabled. The global database cluster can't be deleted when
     *         deletion protection is enabled.
     *         </p>
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * Indicates if the global database cluster has deletion protection enabled.
     * The global database cluster can't be deleted when deletion protection is
     * enabled.
     * </p>
     *
     * @param deletionProtection <p>
     *            Indicates if the global database cluster has deletion
     *            protection enabled. The global database cluster can't be
     *            deleted when deletion protection is enabled.
     *            </p>
     */
    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates if the global database cluster has deletion protection enabled.
     * The global database cluster can't be deleted when deletion protection is
     * enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionProtection <p>
     *            Indicates if the global database cluster has deletion
     *            protection enabled. The global database cluster can't be
     *            deleted when deletion protection is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyGlobalClusterRequest withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
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
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: " + getGlobalClusterIdentifier() + ",");
        if (getNewGlobalClusterIdentifier() != null)
            sb.append("NewGlobalClusterIdentifier: " + getNewGlobalClusterIdentifier() + ",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNewGlobalClusterIdentifier() == null) ? 0 : getNewGlobalClusterIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyGlobalClusterRequest == false)
            return false;
        ModifyGlobalClusterRequest other = (ModifyGlobalClusterRequest) obj;

        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null
                && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getNewGlobalClusterIdentifier() == null
                ^ this.getNewGlobalClusterIdentifier() == null)
            return false;
        if (other.getNewGlobalClusterIdentifier() != null
                && other.getNewGlobalClusterIdentifier().equals(
                        this.getNewGlobalClusterIdentifier()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        return true;
    }
}
