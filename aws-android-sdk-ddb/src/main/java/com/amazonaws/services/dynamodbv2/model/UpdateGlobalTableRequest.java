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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds or removes replicas in the specified global table. The global table must
 * already exist to be able to use this operation. Any replica to be added must
 * be empty, must have the same name as the global table, must have the same key
 * schema, and must have DynamoDB Streams enabled and must have same provisioned
 * and maximum write capacity units.
 * </p>
 * <note>
 * <p>
 * Although you can use <code>UpdateGlobalTable</code> to add replicas and
 * remove replicas in a single request, for simplicity we recommend that you
 * issue separate requests for adding or removing replicas.
 * </p>
 * </note>
 * <p>
 * If global secondary indexes are specified, then the following conditions must
 * also be met:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The global secondary indexes must have the same name.
 * </p>
 * </li>
 * <li>
 * <p>
 * The global secondary indexes must have the same hash key and sort key (if
 * present).
 * </p>
 * </li>
 * <li>
 * <p>
 * The global secondary indexes must have the same provisioned and maximum write
 * capacity units.
 * </p>
 * </li>
 * </ul>
 */
public class UpdateGlobalTableRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A list of regions that should be added or removed from the global table.
     * </p>
     */
    private java.util.List<ReplicaUpdate> replicaUpdates;

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
    public UpdateGlobalTableRequest withGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
        return this;
    }

    /**
     * <p>
     * A list of regions that should be added or removed from the global table.
     * </p>
     *
     * @return <p>
     *         A list of regions that should be added or removed from the global
     *         table.
     *         </p>
     */
    public java.util.List<ReplicaUpdate> getReplicaUpdates() {
        return replicaUpdates;
    }

    /**
     * <p>
     * A list of regions that should be added or removed from the global table.
     * </p>
     *
     * @param replicaUpdates <p>
     *            A list of regions that should be added or removed from the
     *            global table.
     *            </p>
     */
    public void setReplicaUpdates(java.util.Collection<ReplicaUpdate> replicaUpdates) {
        if (replicaUpdates == null) {
            this.replicaUpdates = null;
            return;
        }

        this.replicaUpdates = new java.util.ArrayList<ReplicaUpdate>(replicaUpdates);
    }

    /**
     * <p>
     * A list of regions that should be added or removed from the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaUpdates <p>
     *            A list of regions that should be added or removed from the
     *            global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableRequest withReplicaUpdates(ReplicaUpdate... replicaUpdates) {
        if (getReplicaUpdates() == null) {
            this.replicaUpdates = new java.util.ArrayList<ReplicaUpdate>(replicaUpdates.length);
        }
        for (ReplicaUpdate value : replicaUpdates) {
            this.replicaUpdates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of regions that should be added or removed from the global table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicaUpdates <p>
     *            A list of regions that should be added or removed from the
     *            global table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateGlobalTableRequest withReplicaUpdates(
            java.util.Collection<ReplicaUpdate> replicaUpdates) {
        setReplicaUpdates(replicaUpdates);
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
        if (getReplicaUpdates() != null)
            sb.append("ReplicaUpdates: " + getReplicaUpdates());
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
                + ((getReplicaUpdates() == null) ? 0 : getReplicaUpdates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlobalTableRequest == false)
            return false;
        UpdateGlobalTableRequest other = (UpdateGlobalTableRequest) obj;

        if (other.getGlobalTableName() == null ^ this.getGlobalTableName() == null)
            return false;
        if (other.getGlobalTableName() != null
                && other.getGlobalTableName().equals(this.getGlobalTableName()) == false)
            return false;
        if (other.getReplicaUpdates() == null ^ this.getReplicaUpdates() == null)
            return false;
        if (other.getReplicaUpdates() != null
                && other.getReplicaUpdates().equals(this.getReplicaUpdates()) == false)
            return false;
        return true;
    }
}
