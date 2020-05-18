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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

/**
 * <p>
 * Represents one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A new replica to be added to an existing regional table or global table. This
 * request invokes the <code>CreateTableReplica</code> action in the destination
 * Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * New parameters for an existing replica. This request invokes the
 * <code>UpdateTable</code> action in the destination Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * An existing replica to be deleted. The request invokes the
 * <code>DeleteTableReplica</code> action in the destination Region, deleting
 * the replica and all if its items in the destination Region.
 * </p>
 * </li>
 * </ul>
 */
public class ReplicationGroupUpdate implements Serializable {
    /**
     * <p>
     * The parameters required for creating a replica for the table.
     * </p>
     */
    private CreateReplicationGroupMemberAction create;

    /**
     * <p>
     * The parameters required for updating a replica for the table.
     * </p>
     */
    private UpdateReplicationGroupMemberAction update;

    /**
     * <p>
     * The parameters required for deleting a replica for the table.
     * </p>
     */
    private DeleteReplicationGroupMemberAction delete;

    /**
     * <p>
     * The parameters required for creating a replica for the table.
     * </p>
     *
     * @return <p>
     *         The parameters required for creating a replica for the table.
     *         </p>
     */
    public CreateReplicationGroupMemberAction getCreate() {
        return create;
    }

    /**
     * <p>
     * The parameters required for creating a replica for the table.
     * </p>
     *
     * @param create <p>
     *            The parameters required for creating a replica for the table.
     *            </p>
     */
    public void setCreate(CreateReplicationGroupMemberAction create) {
        this.create = create;
    }

    /**
     * <p>
     * The parameters required for creating a replica for the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param create <p>
     *            The parameters required for creating a replica for the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroupUpdate withCreate(CreateReplicationGroupMemberAction create) {
        this.create = create;
        return this;
    }

    /**
     * <p>
     * The parameters required for updating a replica for the table.
     * </p>
     *
     * @return <p>
     *         The parameters required for updating a replica for the table.
     *         </p>
     */
    public UpdateReplicationGroupMemberAction getUpdate() {
        return update;
    }

    /**
     * <p>
     * The parameters required for updating a replica for the table.
     * </p>
     *
     * @param update <p>
     *            The parameters required for updating a replica for the table.
     *            </p>
     */
    public void setUpdate(UpdateReplicationGroupMemberAction update) {
        this.update = update;
    }

    /**
     * <p>
     * The parameters required for updating a replica for the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param update <p>
     *            The parameters required for updating a replica for the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroupUpdate withUpdate(UpdateReplicationGroupMemberAction update) {
        this.update = update;
        return this;
    }

    /**
     * <p>
     * The parameters required for deleting a replica for the table.
     * </p>
     *
     * @return <p>
     *         The parameters required for deleting a replica for the table.
     *         </p>
     */
    public DeleteReplicationGroupMemberAction getDelete() {
        return delete;
    }

    /**
     * <p>
     * The parameters required for deleting a replica for the table.
     * </p>
     *
     * @param delete <p>
     *            The parameters required for deleting a replica for the table.
     *            </p>
     */
    public void setDelete(DeleteReplicationGroupMemberAction delete) {
        this.delete = delete;
    }

    /**
     * <p>
     * The parameters required for deleting a replica for the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delete <p>
     *            The parameters required for deleting a replica for the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationGroupUpdate withDelete(DeleteReplicationGroupMemberAction delete) {
        this.delete = delete;
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
        if (getCreate() != null)
            sb.append("Create: " + getCreate() + ",");
        if (getUpdate() != null)
            sb.append("Update: " + getUpdate() + ",");
        if (getDelete() != null)
            sb.append("Delete: " + getDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreate() == null) ? 0 : getCreate().hashCode());
        hashCode = prime * hashCode + ((getUpdate() == null) ? 0 : getUpdate().hashCode());
        hashCode = prime * hashCode + ((getDelete() == null) ? 0 : getDelete().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationGroupUpdate == false)
            return false;
        ReplicationGroupUpdate other = (ReplicationGroupUpdate) obj;

        if (other.getCreate() == null ^ this.getCreate() == null)
            return false;
        if (other.getCreate() != null && other.getCreate().equals(this.getCreate()) == false)
            return false;
        if (other.getUpdate() == null ^ this.getUpdate() == null)
            return false;
        if (other.getUpdate() != null && other.getUpdate().equals(this.getUpdate()) == false)
            return false;
        if (other.getDelete() == null ^ this.getDelete() == null)
            return false;
        if (other.getDelete() != null && other.getDelete().equals(this.getDelete()) == false)
            return false;
        return true;
    }
}
