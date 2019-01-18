/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains details about the global table.
 * </p>
 */
public class GlobalTableDescription implements Serializable {
    /**
     * <p>
     * The regions where the global table has replicas.
     * </p>
     */
    private java.util.List<ReplicaDescription> replicationGroup;

    /**
     * <p>
     * The unique identifier of the global table.
     * </p>
     */
    private String globalTableArn;

    /**
     * <p>
     * The creation time of the global table.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The current state of the global table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, UPDATING
     */
    private String globalTableStatus;

    /**
     * <p>
     * The global table name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String globalTableName;

    /**
     * <p>
     * The regions where the global table has replicas.
     * </p>
     *
     * @return <p>
     *         The regions where the global table has replicas.
     *         </p>
     */
    public java.util.List<ReplicaDescription> getReplicationGroup() {
        return replicationGroup;
    }

    /**
     * <p>
     * The regions where the global table has replicas.
     * </p>
     *
     * @param replicationGroup <p>
     *            The regions where the global table has replicas.
     *            </p>
     */
    public void setReplicationGroup(java.util.Collection<ReplicaDescription> replicationGroup) {
        if (replicationGroup == null) {
            this.replicationGroup = null;
            return;
        }

        this.replicationGroup = new java.util.ArrayList<ReplicaDescription>(replicationGroup);
    }

    /**
     * <p>
     * The regions where the global table has replicas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroup <p>
     *            The regions where the global table has replicas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalTableDescription withReplicationGroup(ReplicaDescription... replicationGroup) {
        if (getReplicationGroup() == null) {
            this.replicationGroup = new java.util.ArrayList<ReplicaDescription>(
                    replicationGroup.length);
        }
        for (ReplicaDescription value : replicationGroup) {
            this.replicationGroup.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The regions where the global table has replicas.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroup <p>
     *            The regions where the global table has replicas.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalTableDescription withReplicationGroup(
            java.util.Collection<ReplicaDescription> replicationGroup) {
        setReplicationGroup(replicationGroup);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the global table.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the global table.
     *         </p>
     */
    public String getGlobalTableArn() {
        return globalTableArn;
    }

    /**
     * <p>
     * The unique identifier of the global table.
     * </p>
     *
     * @param globalTableArn <p>
     *            The unique identifier of the global table.
     *            </p>
     */
    public void setGlobalTableArn(String globalTableArn) {
        this.globalTableArn = globalTableArn;
    }

    /**
     * <p>
     * The unique identifier of the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalTableArn <p>
     *            The unique identifier of the global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalTableDescription withGlobalTableArn(String globalTableArn) {
        this.globalTableArn = globalTableArn;
        return this;
    }

    /**
     * <p>
     * The creation time of the global table.
     * </p>
     *
     * @return <p>
     *         The creation time of the global table.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The creation time of the global table.
     * </p>
     *
     * @param creationDateTime <p>
     *            The creation time of the global table.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation time of the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The creation time of the global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalTableDescription withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The current state of the global table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, UPDATING
     *
     * @return <p>
     *         The current state of the global table:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The global table is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The global table is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The global table is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The global table is ready for use.
     *         </p>
     *         </li>
     *         </ul>
     * @see GlobalTableStatus
     */
    public String getGlobalTableStatus() {
        return globalTableStatus;
    }

    /**
     * <p>
     * The current state of the global table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, UPDATING
     *
     * @param globalTableStatus <p>
     *            The current state of the global table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The global table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The global table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The global table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The global table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see GlobalTableStatus
     */
    public void setGlobalTableStatus(String globalTableStatus) {
        this.globalTableStatus = globalTableStatus;
    }

    /**
     * <p>
     * The current state of the global table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, UPDATING
     *
     * @param globalTableStatus <p>
     *            The current state of the global table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The global table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The global table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The global table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The global table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalTableStatus
     */
    public GlobalTableDescription withGlobalTableStatus(String globalTableStatus) {
        this.globalTableStatus = globalTableStatus;
        return this;
    }

    /**
     * <p>
     * The current state of the global table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, UPDATING
     *
     * @param globalTableStatus <p>
     *            The current state of the global table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The global table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The global table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The global table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The global table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see GlobalTableStatus
     */
    public void setGlobalTableStatus(GlobalTableStatus globalTableStatus) {
        this.globalTableStatus = globalTableStatus.toString();
    }

    /**
     * <p>
     * The current state of the global table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global table is ready for use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, UPDATING
     *
     * @param globalTableStatus <p>
     *            The current state of the global table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The global table is being created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - The global table is being updated.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The global table is being deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The global table is ready for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalTableStatus
     */
    public GlobalTableDescription withGlobalTableStatus(GlobalTableStatus globalTableStatus) {
        this.globalTableStatus = globalTableStatus.toString();
        return this;
    }

    /**
     * <p>
     * The global table name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The global table name.
     *         </p>
     */
    public String getGlobalTableName() {
        return globalTableName;
    }

    /**
     * <p>
     * The global table name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param globalTableName <p>
     *            The global table name.
     *            </p>
     */
    public void setGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
    }

    /**
     * <p>
     * The global table name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param globalTableName <p>
     *            The global table name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalTableDescription withGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
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
        if (getReplicationGroup() != null)
            sb.append("ReplicationGroup: " + getReplicationGroup() + ",");
        if (getGlobalTableArn() != null)
            sb.append("GlobalTableArn: " + getGlobalTableArn() + ",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getGlobalTableStatus() != null)
            sb.append("GlobalTableStatus: " + getGlobalTableStatus() + ",");
        if (getGlobalTableName() != null)
            sb.append("GlobalTableName: " + getGlobalTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationGroup() == null) ? 0 : getReplicationGroup().hashCode());
        hashCode = prime * hashCode
                + ((getGlobalTableArn() == null) ? 0 : getGlobalTableArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getGlobalTableStatus() == null) ? 0 : getGlobalTableStatus().hashCode());
        hashCode = prime * hashCode
                + ((getGlobalTableName() == null) ? 0 : getGlobalTableName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalTableDescription == false)
            return false;
        GlobalTableDescription other = (GlobalTableDescription) obj;

        if (other.getReplicationGroup() == null ^ this.getReplicationGroup() == null)
            return false;
        if (other.getReplicationGroup() != null
                && other.getReplicationGroup().equals(this.getReplicationGroup()) == false)
            return false;
        if (other.getGlobalTableArn() == null ^ this.getGlobalTableArn() == null)
            return false;
        if (other.getGlobalTableArn() != null
                && other.getGlobalTableArn().equals(this.getGlobalTableArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getGlobalTableStatus() == null ^ this.getGlobalTableStatus() == null)
            return false;
        if (other.getGlobalTableStatus() != null
                && other.getGlobalTableStatus().equals(this.getGlobalTableStatus()) == false)
            return false;
        if (other.getGlobalTableName() == null ^ this.getGlobalTableName() == null)
            return false;
        if (other.getGlobalTableName() != null
                && other.getGlobalTableName().equals(this.getGlobalTableName()) == false)
            return false;
        return true;
    }
}
