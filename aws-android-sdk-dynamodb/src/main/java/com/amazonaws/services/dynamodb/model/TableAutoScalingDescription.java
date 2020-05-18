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
 * Represents the auto scaling configuration for a global table.
 * </p>
 */
public class TableAutoScalingDescription implements Serializable {
    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE,
     * INACCESSIBLE_ENCRYPTION_CREDENTIALS, ARCHIVING, ARCHIVED
     */
    private String tableStatus;

    /**
     * <p>
     * Represents replicas of the global table.
     * </p>
     */
    private java.util.List<ReplicaAutoScalingDescription> replicas;

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableAutoScalingDescription withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE,
     * INACCESSIBLE_ENCRYPTION_CREDENTIALS, ARCHIVING, ARCHIVED
     *
     * @return <p>
     *         The current state of the table:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The table is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The table is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The table is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The table is ready for use.
     *         </p>
     *         </li>
     *         </ul>
     * @see TableStatus
     */
    public String getTableStatus() {
        return tableStatus;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE,
     * INACCESSIBLE_ENCRYPTION_CREDENTIALS, ARCHIVING, ARCHIVED
     *
     * @param tableStatus <p>
     *            The current state of the table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see TableStatus
     */
    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE,
     * INACCESSIBLE_ENCRYPTION_CREDENTIALS, ARCHIVING, ARCHIVED
     *
     * @param tableStatus <p>
     *            The current state of the table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TableStatus
     */
    public TableAutoScalingDescription withTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
        return this;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE,
     * INACCESSIBLE_ENCRYPTION_CREDENTIALS, ARCHIVING, ARCHIVED
     *
     * @param tableStatus <p>
     *            The current state of the table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see TableStatus
     */
    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus.toString();
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE,
     * INACCESSIBLE_ENCRYPTION_CREDENTIALS, ARCHIVING, ARCHIVED
     *
     * @param tableStatus <p>
     *            The current state of the table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TableStatus
     */
    public TableAutoScalingDescription withTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus.toString();
        return this;
    }

    /**
     * <p>
     * Represents replicas of the global table.
     * </p>
     *
     * @return <p>
     *         Represents replicas of the global table.
     *         </p>
     */
    public java.util.List<ReplicaAutoScalingDescription> getReplicas() {
        return replicas;
    }

    /**
     * <p>
     * Represents replicas of the global table.
     * </p>
     *
     * @param replicas <p>
     *            Represents replicas of the global table.
     *            </p>
     */
    public void setReplicas(java.util.Collection<ReplicaAutoScalingDescription> replicas) {
        if (replicas == null) {
            this.replicas = null;
            return;
        }

        this.replicas = new java.util.ArrayList<ReplicaAutoScalingDescription>(replicas);
    }

    /**
     * <p>
     * Represents replicas of the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicas <p>
     *            Represents replicas of the global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableAutoScalingDescription withReplicas(ReplicaAutoScalingDescription... replicas) {
        if (getReplicas() == null) {
            this.replicas = new java.util.ArrayList<ReplicaAutoScalingDescription>(replicas.length);
        }
        for (ReplicaAutoScalingDescription value : replicas) {
            this.replicas.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents replicas of the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicas <p>
     *            Represents replicas of the global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TableAutoScalingDescription withReplicas(
            java.util.Collection<ReplicaAutoScalingDescription> replicas) {
        setReplicas(replicas);
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
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getTableStatus() != null)
            sb.append("TableStatus: " + getTableStatus() + ",");
        if (getReplicas() != null)
            sb.append("Replicas: " + getReplicas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode
                + ((getTableStatus() == null) ? 0 : getTableStatus().hashCode());
        hashCode = prime * hashCode + ((getReplicas() == null) ? 0 : getReplicas().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableAutoScalingDescription == false)
            return false;
        TableAutoScalingDescription other = (TableAutoScalingDescription) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTableStatus() == null ^ this.getTableStatus() == null)
            return false;
        if (other.getTableStatus() != null
                && other.getTableStatus().equals(this.getTableStatus()) == false)
            return false;
        if (other.getReplicas() == null ^ this.getReplicas() == null)
            return false;
        if (other.getReplicas() != null && other.getReplicas().equals(this.getReplicas()) == false)
            return false;
        return true;
    }
}
