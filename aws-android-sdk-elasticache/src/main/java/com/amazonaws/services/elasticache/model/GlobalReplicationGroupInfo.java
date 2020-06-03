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

/**
 * <p>
 * The name of the Global Datastore and role of this replication group in the
 * Global Datastore.
 * </p>
 */
public class GlobalReplicationGroupInfo implements Serializable {
    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;

    /**
     * <p>
     * The role of the replication group in a Global Datastore. Can be primary
     * or secondary.
     * </p>
     */
    private String globalReplicationGroupMemberRole;

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     *
     * @return <p>
     *         The name of the Global Datastore
     *         </p>
     */
    public String getGlobalReplicationGroupId() {
        return globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     *
     * @param globalReplicationGroupId <p>
     *            The name of the Global Datastore
     *            </p>
     */
    public void setGlobalReplicationGroupId(String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroupId <p>
     *            The name of the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroupInfo withGlobalReplicationGroupId(String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
        return this;
    }

    /**
     * <p>
     * The role of the replication group in a Global Datastore. Can be primary
     * or secondary.
     * </p>
     *
     * @return <p>
     *         The role of the replication group in a Global Datastore. Can be
     *         primary or secondary.
     *         </p>
     */
    public String getGlobalReplicationGroupMemberRole() {
        return globalReplicationGroupMemberRole;
    }

    /**
     * <p>
     * The role of the replication group in a Global Datastore. Can be primary
     * or secondary.
     * </p>
     *
     * @param globalReplicationGroupMemberRole <p>
     *            The role of the replication group in a Global Datastore. Can
     *            be primary or secondary.
     *            </p>
     */
    public void setGlobalReplicationGroupMemberRole(String globalReplicationGroupMemberRole) {
        this.globalReplicationGroupMemberRole = globalReplicationGroupMemberRole;
    }

    /**
     * <p>
     * The role of the replication group in a Global Datastore. Can be primary
     * or secondary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroupMemberRole <p>
     *            The role of the replication group in a Global Datastore. Can
     *            be primary or secondary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroupInfo withGlobalReplicationGroupMemberRole(
            String globalReplicationGroupMemberRole) {
        this.globalReplicationGroupMemberRole = globalReplicationGroupMemberRole;
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
        if (getGlobalReplicationGroupId() != null)
            sb.append("GlobalReplicationGroupId: " + getGlobalReplicationGroupId() + ",");
        if (getGlobalReplicationGroupMemberRole() != null)
            sb.append("GlobalReplicationGroupMemberRole: " + getGlobalReplicationGroupMemberRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalReplicationGroupMemberRole() == null) ? 0
                        : getGlobalReplicationGroupMemberRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalReplicationGroupInfo == false)
            return false;
        GlobalReplicationGroupInfo other = (GlobalReplicationGroupInfo) obj;

        if (other.getGlobalReplicationGroupId() == null
                ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null
                && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getGlobalReplicationGroupMemberRole() == null
                ^ this.getGlobalReplicationGroupMemberRole() == null)
            return false;
        if (other.getGlobalReplicationGroupMemberRole() != null
                && other.getGlobalReplicationGroupMemberRole().equals(
                        this.getGlobalReplicationGroupMemberRole()) == false)
            return false;
        return true;
    }
}
