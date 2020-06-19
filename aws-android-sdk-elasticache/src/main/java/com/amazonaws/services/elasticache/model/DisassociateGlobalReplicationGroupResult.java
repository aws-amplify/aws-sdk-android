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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

public class DisassociateGlobalReplicationGroupResult implements Serializable {
    /**
     * <p>
     * Consists of a primary cluster that accepts writes and an associated
     * secondary cluster that resides in a different AWS region. The secondary
     * cluster accepts only reads. The primary cluster automatically replicates
     * updates to the secondary cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <b>GlobalReplicationGroupIdSuffix</b> represents the name of the
     * Global Datastore, which is what you use to associate a secondary cluster.
     * </p>
     * </li>
     * </ul>
     */
    private GlobalReplicationGroup globalReplicationGroup;

    /**
     * <p>
     * Consists of a primary cluster that accepts writes and an associated
     * secondary cluster that resides in a different AWS region. The secondary
     * cluster accepts only reads. The primary cluster automatically replicates
     * updates to the secondary cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <b>GlobalReplicationGroupIdSuffix</b> represents the name of the
     * Global Datastore, which is what you use to associate a secondary cluster.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Consists of a primary cluster that accepts writes and an
     *         associated secondary cluster that resides in a different AWS
     *         region. The secondary cluster accepts only reads. The primary
     *         cluster automatically replicates updates to the secondary
     *         cluster.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <b>GlobalReplicationGroupIdSuffix</b> represents the name of
     *         the Global Datastore, which is what you use to associate a
     *         secondary cluster.
     *         </p>
     *         </li>
     *         </ul>
     */
    public GlobalReplicationGroup getGlobalReplicationGroup() {
        return globalReplicationGroup;
    }

    /**
     * <p>
     * Consists of a primary cluster that accepts writes and an associated
     * secondary cluster that resides in a different AWS region. The secondary
     * cluster accepts only reads. The primary cluster automatically replicates
     * updates to the secondary cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <b>GlobalReplicationGroupIdSuffix</b> represents the name of the
     * Global Datastore, which is what you use to associate a secondary cluster.
     * </p>
     * </li>
     * </ul>
     *
     * @param globalReplicationGroup <p>
     *            Consists of a primary cluster that accepts writes and an
     *            associated secondary cluster that resides in a different AWS
     *            region. The secondary cluster accepts only reads. The primary
     *            cluster automatically replicates updates to the secondary
     *            cluster.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The <b>GlobalReplicationGroupIdSuffix</b> represents the name
     *            of the Global Datastore, which is what you use to associate a
     *            secondary cluster.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setGlobalReplicationGroup(GlobalReplicationGroup globalReplicationGroup) {
        this.globalReplicationGroup = globalReplicationGroup;
    }

    /**
     * <p>
     * Consists of a primary cluster that accepts writes and an associated
     * secondary cluster that resides in a different AWS region. The secondary
     * cluster accepts only reads. The primary cluster automatically replicates
     * updates to the secondary cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <b>GlobalReplicationGroupIdSuffix</b> represents the name of the
     * Global Datastore, which is what you use to associate a secondary cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroup <p>
     *            Consists of a primary cluster that accepts writes and an
     *            associated secondary cluster that resides in a different AWS
     *            region. The secondary cluster accepts only reads. The primary
     *            cluster automatically replicates updates to the secondary
     *            cluster.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The <b>GlobalReplicationGroupIdSuffix</b> represents the name
     *            of the Global Datastore, which is what you use to associate a
     *            secondary cluster.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateGlobalReplicationGroupResult withGlobalReplicationGroup(
            GlobalReplicationGroup globalReplicationGroup) {
        this.globalReplicationGroup = globalReplicationGroup;
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
        if (getGlobalReplicationGroup() != null)
            sb.append("GlobalReplicationGroup: " + getGlobalReplicationGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGlobalReplicationGroup() == null) ? 0 : getGlobalReplicationGroup()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateGlobalReplicationGroupResult == false)
            return false;
        DisassociateGlobalReplicationGroupResult other = (DisassociateGlobalReplicationGroupResult) obj;

        if (other.getGlobalReplicationGroup() == null ^ this.getGlobalReplicationGroup() == null)
            return false;
        if (other.getGlobalReplicationGroup() != null
                && other.getGlobalReplicationGroup().equals(this.getGlobalReplicationGroup()) == false)
            return false;
        return true;
    }
}
