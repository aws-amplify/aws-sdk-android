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
 * Represents the properties of a global table.
 * </p>
 */
public class GlobalTable implements Serializable {
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
     */
    private java.util.List<Replica> replicationGroup;

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
    public GlobalTable withGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
        return this;
    }

    /**
     * <p>
     * The regions where the global table has replicas.
     * </p>
     *
     * @return <p>
     *         The regions where the global table has replicas.
     *         </p>
     */
    public java.util.List<Replica> getReplicationGroup() {
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
    public void setReplicationGroup(java.util.Collection<Replica> replicationGroup) {
        if (replicationGroup == null) {
            this.replicationGroup = null;
            return;
        }

        this.replicationGroup = new java.util.ArrayList<Replica>(replicationGroup);
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
    public GlobalTable withReplicationGroup(Replica... replicationGroup) {
        if (getReplicationGroup() == null) {
            this.replicationGroup = new java.util.ArrayList<Replica>(replicationGroup.length);
        }
        for (Replica value : replicationGroup) {
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
    public GlobalTable withReplicationGroup(java.util.Collection<Replica> replicationGroup) {
        setReplicationGroup(replicationGroup);
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
        if (getGlobalTableName() != null)
            sb.append("GlobalTableName: " + getGlobalTableName() + ",");
        if (getReplicationGroup() != null)
            sb.append("ReplicationGroup: " + getReplicationGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGlobalTableName() == null) ? 0 : getGlobalTableName().hashCode());
        hashCode = prime * hashCode
                + ((getReplicationGroup() == null) ? 0 : getReplicationGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalTable == false)
            return false;
        GlobalTable other = (GlobalTable) obj;

        if (other.getGlobalTableName() == null ^ this.getGlobalTableName() == null)
            return false;
        if (other.getGlobalTableName() != null
                && other.getGlobalTableName().equals(this.getGlobalTableName()) == false)
            return false;
        if (other.getReplicationGroup() == null ^ this.getReplicationGroup() == null)
            return false;
        if (other.getReplicationGroup() != null
                && other.getReplicationGroup().equals(this.getReplicationGroup()) == false)
            return false;
        return true;
    }
}
