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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new table from a table in an Amazon Redshift cluster snapshot. You
 * must create the new table within the Amazon Redshift cluster that the
 * snapshot was taken from.
 * </p>
 * <p>
 * You cannot use <code>RestoreTableFromClusterSnapshot</code> to restore a
 * table with the same name as an existing table in an Amazon Redshift cluster.
 * That is, you cannot overwrite an existing table in a cluster with a restored
 * table. If you want to replace your original table with a new, restored table,
 * then rename or drop your original table before you call
 * <code>RestoreTableFromClusterSnapshot</code>. When you have renamed your
 * original table, then you can pass the original name of the table as the
 * <code>NewTableName</code> parameter value in the call to
 * <code>RestoreTableFromClusterSnapshot</code>. This way, you can replace the
 * original table with the table created from the snapshot.
 * </p>
 */
public class RestoreTableFromClusterSnapshotRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the Amazon Redshift cluster to restore the table to.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The identifier of the snapshot to restore the table from. This snapshot
     * must have been created from the Amazon Redshift cluster specified by the
     * <code>ClusterIdentifier</code> parameter.
     * </p>
     */
    private String snapshotIdentifier;

    /**
     * <p>
     * The name of the source database that contains the table to restore from.
     * </p>
     */
    private String sourceDatabaseName;

    /**
     * <p>
     * The name of the source schema that contains the table to restore from. If
     * you do not specify a <code>SourceSchemaName</code> value, the default is
     * <code>public</code>.
     * </p>
     */
    private String sourceSchemaName;

    /**
     * <p>
     * The name of the source table to restore from.
     * </p>
     */
    private String sourceTableName;

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     */
    private String targetDatabaseName;

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     */
    private String targetSchemaName;

    /**
     * <p>
     * The name of the table to create as a result of the current request.
     * </p>
     */
    private String newTableName;

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster to restore the table to.
     * </p>
     *
     * @return <p>
     *         The identifier of the Amazon Redshift cluster to restore the
     *         table to.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster to restore the table to.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The identifier of the Amazon Redshift cluster to restore the
     *            table to.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Redshift cluster to restore the table to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The identifier of the Amazon Redshift cluster to restore the
     *            table to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromClusterSnapshotRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the snapshot to restore the table from. This snapshot
     * must have been created from the Amazon Redshift cluster specified by the
     * <code>ClusterIdentifier</code> parameter.
     * </p>
     *
     * @return <p>
     *         The identifier of the snapshot to restore the table from. This
     *         snapshot must have been created from the Amazon Redshift cluster
     *         specified by the <code>ClusterIdentifier</code> parameter.
     *         </p>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot to restore the table from. This snapshot
     * must have been created from the Amazon Redshift cluster specified by the
     * <code>ClusterIdentifier</code> parameter.
     * </p>
     *
     * @param snapshotIdentifier <p>
     *            The identifier of the snapshot to restore the table from. This
     *            snapshot must have been created from the Amazon Redshift
     *            cluster specified by the <code>ClusterIdentifier</code>
     *            parameter.
     *            </p>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot to restore the table from. This snapshot
     * must have been created from the Amazon Redshift cluster specified by the
     * <code>ClusterIdentifier</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifier <p>
     *            The identifier of the snapshot to restore the table from. This
     *            snapshot must have been created from the Amazon Redshift
     *            cluster specified by the <code>ClusterIdentifier</code>
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromClusterSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The name of the source database that contains the table to restore from.
     * </p>
     *
     * @return <p>
     *         The name of the source database that contains the table to
     *         restore from.
     *         </p>
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database that contains the table to restore from.
     * </p>
     *
     * @param sourceDatabaseName <p>
     *            The name of the source database that contains the table to
     *            restore from.
     *            </p>
     */
    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    /**
     * <p>
     * The name of the source database that contains the table to restore from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDatabaseName <p>
     *            The name of the source database that contains the table to
     *            restore from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromClusterSnapshotRequest withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * <p>
     * The name of the source schema that contains the table to restore from. If
     * you do not specify a <code>SourceSchemaName</code> value, the default is
     * <code>public</code>.
     * </p>
     *
     * @return <p>
     *         The name of the source schema that contains the table to restore
     *         from. If you do not specify a <code>SourceSchemaName</code>
     *         value, the default is <code>public</code>.
     *         </p>
     */
    public String getSourceSchemaName() {
        return sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema that contains the table to restore from. If
     * you do not specify a <code>SourceSchemaName</code> value, the default is
     * <code>public</code>.
     * </p>
     *
     * @param sourceSchemaName <p>
     *            The name of the source schema that contains the table to
     *            restore from. If you do not specify a
     *            <code>SourceSchemaName</code> value, the default is
     *            <code>public</code>.
     *            </p>
     */
    public void setSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
    }

    /**
     * <p>
     * The name of the source schema that contains the table to restore from. If
     * you do not specify a <code>SourceSchemaName</code> value, the default is
     * <code>public</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSchemaName <p>
     *            The name of the source schema that contains the table to
     *            restore from. If you do not specify a
     *            <code>SourceSchemaName</code> value, the default is
     *            <code>public</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromClusterSnapshotRequest withSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
        return this;
    }

    /**
     * <p>
     * The name of the source table to restore from.
     * </p>
     *
     * @return <p>
     *         The name of the source table to restore from.
     *         </p>
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    /**
     * <p>
     * The name of the source table to restore from.
     * </p>
     *
     * @param sourceTableName <p>
     *            The name of the source table to restore from.
     *            </p>
     */
    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    /**
     * <p>
     * The name of the source table to restore from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceTableName <p>
     *            The name of the source table to restore from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromClusterSnapshotRequest withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     *
     * @return <p>
     *         The name of the database to restore the table to.
     *         </p>
     */
    public String getTargetDatabaseName() {
        return targetDatabaseName;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     *
     * @param targetDatabaseName <p>
     *            The name of the database to restore the table to.
     *            </p>
     */
    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    /**
     * <p>
     * The name of the database to restore the table to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetDatabaseName <p>
     *            The name of the database to restore the table to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromClusterSnapshotRequest withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     *
     * @return <p>
     *         The name of the schema to restore the table to.
     *         </p>
     */
    public String getTargetSchemaName() {
        return targetSchemaName;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     *
     * @param targetSchemaName <p>
     *            The name of the schema to restore the table to.
     *            </p>
     */
    public void setTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
    }

    /**
     * <p>
     * The name of the schema to restore the table to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetSchemaName <p>
     *            The name of the schema to restore the table to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromClusterSnapshotRequest withTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
        return this;
    }

    /**
     * <p>
     * The name of the table to create as a result of the current request.
     * </p>
     *
     * @return <p>
     *         The name of the table to create as a result of the current
     *         request.
     *         </p>
     */
    public String getNewTableName() {
        return newTableName;
    }

    /**
     * <p>
     * The name of the table to create as a result of the current request.
     * </p>
     *
     * @param newTableName <p>
     *            The name of the table to create as a result of the current
     *            request.
     *            </p>
     */
    public void setNewTableName(String newTableName) {
        this.newTableName = newTableName;
    }

    /**
     * <p>
     * The name of the table to create as a result of the current request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newTableName <p>
     *            The name of the table to create as a result of the current
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromClusterSnapshotRequest withNewTableName(String newTableName) {
        this.newTableName = newTableName;
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
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSourceDatabaseName() != null)
            sb.append("SourceDatabaseName: " + getSourceDatabaseName() + ",");
        if (getSourceSchemaName() != null)
            sb.append("SourceSchemaName: " + getSourceSchemaName() + ",");
        if (getSourceTableName() != null)
            sb.append("SourceTableName: " + getSourceTableName() + ",");
        if (getTargetDatabaseName() != null)
            sb.append("TargetDatabaseName: " + getTargetDatabaseName() + ",");
        if (getTargetSchemaName() != null)
            sb.append("TargetSchemaName: " + getTargetSchemaName() + ",");
        if (getNewTableName() != null)
            sb.append("NewTableName: " + getNewTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSourceDatabaseName() == null) ? 0 : getSourceDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceSchemaName() == null) ? 0 : getSourceSchemaName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceTableName() == null) ? 0 : getSourceTableName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetDatabaseName() == null) ? 0 : getTargetDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetSchemaName() == null) ? 0 : getTargetSchemaName().hashCode());
        hashCode = prime * hashCode
                + ((getNewTableName() == null) ? 0 : getNewTableName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableFromClusterSnapshotRequest == false)
            return false;
        RestoreTableFromClusterSnapshotRequest other = (RestoreTableFromClusterSnapshotRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSourceDatabaseName() == null ^ this.getSourceDatabaseName() == null)
            return false;
        if (other.getSourceDatabaseName() != null
                && other.getSourceDatabaseName().equals(this.getSourceDatabaseName()) == false)
            return false;
        if (other.getSourceSchemaName() == null ^ this.getSourceSchemaName() == null)
            return false;
        if (other.getSourceSchemaName() != null
                && other.getSourceSchemaName().equals(this.getSourceSchemaName()) == false)
            return false;
        if (other.getSourceTableName() == null ^ this.getSourceTableName() == null)
            return false;
        if (other.getSourceTableName() != null
                && other.getSourceTableName().equals(this.getSourceTableName()) == false)
            return false;
        if (other.getTargetDatabaseName() == null ^ this.getTargetDatabaseName() == null)
            return false;
        if (other.getTargetDatabaseName() != null
                && other.getTargetDatabaseName().equals(this.getTargetDatabaseName()) == false)
            return false;
        if (other.getTargetSchemaName() == null ^ this.getTargetSchemaName() == null)
            return false;
        if (other.getTargetSchemaName() != null
                && other.getTargetSchemaName().equals(this.getTargetSchemaName()) == false)
            return false;
        if (other.getNewTableName() == null ^ this.getNewTableName() == null)
            return false;
        if (other.getNewTableName() != null
                && other.getNewTableName().equals(this.getNewTableName()) == false)
            return false;
        return true;
    }
}
