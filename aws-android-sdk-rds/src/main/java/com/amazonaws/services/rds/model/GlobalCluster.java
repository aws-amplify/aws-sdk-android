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

/**
 * <p>
 * A data type representing an Aurora global database.
 * </p>
 */
public class GlobalCluster implements Serializable {
    /**
     * <p>
     * Contains a user-supplied global database cluster identifier. This
     * identifier is the unique key that identifies a global database cluster.
     * </p>
     */
    private String globalClusterIdentifier;

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the global database
     * cluster. This identifier is found in AWS CloudTrail log entries whenever
     * the AWS KMS key for the DB cluster is accessed.
     * </p>
     */
    private String globalClusterResourceId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the global database cluster.
     * </p>
     */
    private String globalClusterArn;

    /**
     * <p>
     * Specifies the current state of this global database cluster.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Aurora database engine used by the global database cluster.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The default database name within the new global database cluster.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The storage encryption setting for the global database cluster.
     * </p>
     */
    private Boolean storageEncrypted;

    /**
     * <p>
     * The deletion protection setting for the new global database cluster.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * The list of cluster IDs for secondary clusters within the global database
     * cluster. Currently limited to 1 item.
     * </p>
     */
    private java.util.List<GlobalClusterMember> globalClusterMembers;

    /**
     * <p>
     * Contains a user-supplied global database cluster identifier. This
     * identifier is the unique key that identifies a global database cluster.
     * </p>
     *
     * @return <p>
     *         Contains a user-supplied global database cluster identifier. This
     *         identifier is the unique key that identifies a global database
     *         cluster.
     *         </p>
     */
    public String getGlobalClusterIdentifier() {
        return globalClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied global database cluster identifier. This
     * identifier is the unique key that identifies a global database cluster.
     * </p>
     *
     * @param globalClusterIdentifier <p>
     *            Contains a user-supplied global database cluster identifier.
     *            This identifier is the unique key that identifies a global
     *            database cluster.
     *            </p>
     */
    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied global database cluster identifier. This
     * identifier is the unique key that identifies a global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusterIdentifier <p>
     *            Contains a user-supplied global database cluster identifier.
     *            This identifier is the unique key that identifies a global
     *            database cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalCluster withGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the global database
     * cluster. This identifier is found in AWS CloudTrail log entries whenever
     * the AWS KMS key for the DB cluster is accessed.
     * </p>
     *
     * @return <p>
     *         The AWS Region-unique, immutable identifier for the global
     *         database cluster. This identifier is found in AWS CloudTrail log
     *         entries whenever the AWS KMS key for the DB cluster is accessed.
     *         </p>
     */
    public String getGlobalClusterResourceId() {
        return globalClusterResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the global database
     * cluster. This identifier is found in AWS CloudTrail log entries whenever
     * the AWS KMS key for the DB cluster is accessed.
     * </p>
     *
     * @param globalClusterResourceId <p>
     *            The AWS Region-unique, immutable identifier for the global
     *            database cluster. This identifier is found in AWS CloudTrail
     *            log entries whenever the AWS KMS key for the DB cluster is
     *            accessed.
     *            </p>
     */
    public void setGlobalClusterResourceId(String globalClusterResourceId) {
        this.globalClusterResourceId = globalClusterResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the global database
     * cluster. This identifier is found in AWS CloudTrail log entries whenever
     * the AWS KMS key for the DB cluster is accessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusterResourceId <p>
     *            The AWS Region-unique, immutable identifier for the global
     *            database cluster. This identifier is found in AWS CloudTrail
     *            log entries whenever the AWS KMS key for the DB cluster is
     *            accessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalCluster withGlobalClusterResourceId(String globalClusterResourceId) {
        this.globalClusterResourceId = globalClusterResourceId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the global database cluster.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the global database cluster.
     *         </p>
     */
    public String getGlobalClusterArn() {
        return globalClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the global database cluster.
     * </p>
     *
     * @param globalClusterArn <p>
     *            The Amazon Resource Name (ARN) for the global database
     *            cluster.
     *            </p>
     */
    public void setGlobalClusterArn(String globalClusterArn) {
        this.globalClusterArn = globalClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusterArn <p>
     *            The Amazon Resource Name (ARN) for the global database
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalCluster withGlobalClusterArn(String globalClusterArn) {
        this.globalClusterArn = globalClusterArn;
        return this;
    }

    /**
     * <p>
     * Specifies the current state of this global database cluster.
     * </p>
     *
     * @return <p>
     *         Specifies the current state of this global database cluster.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the current state of this global database cluster.
     * </p>
     *
     * @param status <p>
     *            Specifies the current state of this global database cluster.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the current state of this global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Specifies the current state of this global database cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalCluster withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The Aurora database engine used by the global database cluster.
     * </p>
     *
     * @return <p>
     *         The Aurora database engine used by the global database cluster.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The Aurora database engine used by the global database cluster.
     * </p>
     *
     * @param engine <p>
     *            The Aurora database engine used by the global database
     *            cluster.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The Aurora database engine used by the global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The Aurora database engine used by the global database
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalCluster withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     *
     * @return <p>
     *         Indicates the database engine version.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     *
     * @param engineVersion <p>
     *            Indicates the database engine version.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            Indicates the database engine version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalCluster withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The default database name within the new global database cluster.
     * </p>
     *
     * @return <p>
     *         The default database name within the new global database cluster.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The default database name within the new global database cluster.
     * </p>
     *
     * @param databaseName <p>
     *            The default database name within the new global database
     *            cluster.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The default database name within the new global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            The default database name within the new global database
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalCluster withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * The storage encryption setting for the global database cluster.
     * </p>
     *
     * @return <p>
     *         The storage encryption setting for the global database cluster.
     *         </p>
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * The storage encryption setting for the global database cluster.
     * </p>
     *
     * @return <p>
     *         The storage encryption setting for the global database cluster.
     *         </p>
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * The storage encryption setting for the global database cluster.
     * </p>
     *
     * @param storageEncrypted <p>
     *            The storage encryption setting for the global database
     *            cluster.
     *            </p>
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * The storage encryption setting for the global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageEncrypted <p>
     *            The storage encryption setting for the global database
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalCluster withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database cluster.
     * </p>
     *
     * @return <p>
     *         The deletion protection setting for the new global database
     *         cluster.
     *         </p>
     */
    public Boolean isDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database cluster.
     * </p>
     *
     * @return <p>
     *         The deletion protection setting for the new global database
     *         cluster.
     *         </p>
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database cluster.
     * </p>
     *
     * @param deletionProtection <p>
     *            The deletion protection setting for the new global database
     *            cluster.
     *            </p>
     */
    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionProtection <p>
     *            The deletion protection setting for the new global database
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalCluster withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    /**
     * <p>
     * The list of cluster IDs for secondary clusters within the global database
     * cluster. Currently limited to 1 item.
     * </p>
     *
     * @return <p>
     *         The list of cluster IDs for secondary clusters within the global
     *         database cluster. Currently limited to 1 item.
     *         </p>
     */
    public java.util.List<GlobalClusterMember> getGlobalClusterMembers() {
        return globalClusterMembers;
    }

    /**
     * <p>
     * The list of cluster IDs for secondary clusters within the global database
     * cluster. Currently limited to 1 item.
     * </p>
     *
     * @param globalClusterMembers <p>
     *            The list of cluster IDs for secondary clusters within the
     *            global database cluster. Currently limited to 1 item.
     *            </p>
     */
    public void setGlobalClusterMembers(
            java.util.Collection<GlobalClusterMember> globalClusterMembers) {
        if (globalClusterMembers == null) {
            this.globalClusterMembers = null;
            return;
        }

        this.globalClusterMembers = new java.util.ArrayList<GlobalClusterMember>(
                globalClusterMembers);
    }

    /**
     * <p>
     * The list of cluster IDs for secondary clusters within the global database
     * cluster. Currently limited to 1 item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusterMembers <p>
     *            The list of cluster IDs for secondary clusters within the
     *            global database cluster. Currently limited to 1 item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalCluster withGlobalClusterMembers(GlobalClusterMember... globalClusterMembers) {
        if (getGlobalClusterMembers() == null) {
            this.globalClusterMembers = new java.util.ArrayList<GlobalClusterMember>(
                    globalClusterMembers.length);
        }
        for (GlobalClusterMember value : globalClusterMembers) {
            this.globalClusterMembers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of cluster IDs for secondary clusters within the global database
     * cluster. Currently limited to 1 item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusterMembers <p>
     *            The list of cluster IDs for secondary clusters within the
     *            global database cluster. Currently limited to 1 item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalCluster withGlobalClusterMembers(
            java.util.Collection<GlobalClusterMember> globalClusterMembers) {
        setGlobalClusterMembers(globalClusterMembers);
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
        if (getGlobalClusterResourceId() != null)
            sb.append("GlobalClusterResourceId: " + getGlobalClusterResourceId() + ",");
        if (getGlobalClusterArn() != null)
            sb.append("GlobalClusterArn: " + getGlobalClusterArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: " + getStorageEncrypted() + ",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection() + ",");
        if (getGlobalClusterMembers() != null)
            sb.append("GlobalClusterMembers: " + getGlobalClusterMembers());
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
                + ((getGlobalClusterResourceId() == null) ? 0 : getGlobalClusterResourceId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGlobalClusterArn() == null) ? 0 : getGlobalClusterArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode
                + ((getGlobalClusterMembers() == null) ? 0 : getGlobalClusterMembers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalCluster == false)
            return false;
        GlobalCluster other = (GlobalCluster) obj;

        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null
                && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getGlobalClusterResourceId() == null ^ this.getGlobalClusterResourceId() == null)
            return false;
        if (other.getGlobalClusterResourceId() != null
                && other.getGlobalClusterResourceId().equals(this.getGlobalClusterResourceId()) == false)
            return false;
        if (other.getGlobalClusterArn() == null ^ this.getGlobalClusterArn() == null)
            return false;
        if (other.getGlobalClusterArn() != null
                && other.getGlobalClusterArn().equals(this.getGlobalClusterArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null
                && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getGlobalClusterMembers() == null ^ this.getGlobalClusterMembers() == null)
            return false;
        if (other.getGlobalClusterMembers() != null
                && other.getGlobalClusterMembers().equals(this.getGlobalClusterMembers()) == false)
            return false;
        return true;
    }
}
