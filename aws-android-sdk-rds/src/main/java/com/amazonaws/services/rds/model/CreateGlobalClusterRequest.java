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
 * Creates an Aurora global database spread across multiple regions. The global
 * database contains a single primary cluster with read-write capability, and a
 * read-only secondary cluster that receives data from the primary cluster
 * through high-speed replication performed by the Aurora storage subsystem.
 * </p>
 * <p>
 * You can create a global database that is initially empty, and then add a
 * primary cluster and a secondary cluster to it. Or you can specify an existing
 * Aurora cluster during the create operation, and this cluster becomes the
 * primary cluster of the global database.
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class CreateGlobalClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The cluster identifier of the new global database cluster.
     * </p>
     */
    private String globalClusterIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the
     * global database. This parameter is optional.
     * </p>
     */
    private String sourceDBClusterIdentifier;

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The engine version of the Aurora global database.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The deletion protection setting for the new global database. The global
     * database can't be deleted when deletion protection is enabled.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you
     * do not provide a name, Amazon Aurora will not create a database in the
     * global database cluster you are creating.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The storage encryption setting for the new global database cluster.
     * </p>
     */
    private Boolean storageEncrypted;

    /**
     * <p>
     * The cluster identifier of the new global database cluster.
     * </p>
     *
     * @return <p>
     *         The cluster identifier of the new global database cluster.
     *         </p>
     */
    public String getGlobalClusterIdentifier() {
        return globalClusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the new global database cluster.
     * </p>
     *
     * @param globalClusterIdentifier <p>
     *            The cluster identifier of the new global database cluster.
     *            </p>
     */
    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the new global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalClusterIdentifier <p>
     *            The cluster identifier of the new global database cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the
     * global database. This parameter is optional.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) to use as the primary cluster of
     *         the global database. This parameter is optional.
     *         </p>
     */
    public String getSourceDBClusterIdentifier() {
        return sourceDBClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the
     * global database. This parameter is optional.
     * </p>
     *
     * @param sourceDBClusterIdentifier <p>
     *            The Amazon Resource Name (ARN) to use as the primary cluster
     *            of the global database. This parameter is optional.
     *            </p>
     */
    public void setSourceDBClusterIdentifier(String sourceDBClusterIdentifier) {
        this.sourceDBClusterIdentifier = sourceDBClusterIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to use as the primary cluster of the
     * global database. This parameter is optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDBClusterIdentifier <p>
     *            The Amazon Resource Name (ARN) to use as the primary cluster
     *            of the global database. This parameter is optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalClusterRequest withSourceDBClusterIdentifier(String sourceDBClusterIdentifier) {
        this.sourceDBClusterIdentifier = sourceDBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     *
     * @return <p>
     *         Provides the name of the database engine to be used for this DB
     *         cluster.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     *
     * @param engine <p>
     *            Provides the name of the database engine to be used for this
     *            DB cluster.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            Provides the name of the database engine to be used for this
     *            DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalClusterRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The engine version of the Aurora global database.
     * </p>
     *
     * @return <p>
     *         The engine version of the Aurora global database.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The engine version of the Aurora global database.
     * </p>
     *
     * @param engineVersion <p>
     *            The engine version of the Aurora global database.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version of the Aurora global database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The engine version of the Aurora global database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalClusterRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database. The global
     * database can't be deleted when deletion protection is enabled.
     * </p>
     *
     * @return <p>
     *         The deletion protection setting for the new global database. The
     *         global database can't be deleted when deletion protection is
     *         enabled.
     *         </p>
     */
    public Boolean isDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database. The global
     * database can't be deleted when deletion protection is enabled.
     * </p>
     *
     * @return <p>
     *         The deletion protection setting for the new global database. The
     *         global database can't be deleted when deletion protection is
     *         enabled.
     *         </p>
     */
    public Boolean getDeletionProtection() {
        return deletionProtection;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database. The global
     * database can't be deleted when deletion protection is enabled.
     * </p>
     *
     * @param deletionProtection <p>
     *            The deletion protection setting for the new global database.
     *            The global database can't be deleted when deletion protection
     *            is enabled.
     *            </p>
     */
    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * The deletion protection setting for the new global database. The global
     * database can't be deleted when deletion protection is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionProtection <p>
     *            The deletion protection setting for the new global database.
     *            The global database can't be deleted when deletion protection
     *            is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalClusterRequest withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you
     * do not provide a name, Amazon Aurora will not create a database in the
     * global database cluster you are creating.
     * </p>
     *
     * @return <p>
     *         The name for your database of up to 64 alpha-numeric characters.
     *         If you do not provide a name, Amazon Aurora will not create a
     *         database in the global database cluster you are creating.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you
     * do not provide a name, Amazon Aurora will not create a database in the
     * global database cluster you are creating.
     * </p>
     *
     * @param databaseName <p>
     *            The name for your database of up to 64 alpha-numeric
     *            characters. If you do not provide a name, Amazon Aurora will
     *            not create a database in the global database cluster you are
     *            creating.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alpha-numeric characters. If you
     * do not provide a name, Amazon Aurora will not create a database in the
     * global database cluster you are creating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            The name for your database of up to 64 alpha-numeric
     *            characters. If you do not provide a name, Amazon Aurora will
     *            not create a database in the global database cluster you are
     *            creating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalClusterRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * The storage encryption setting for the new global database cluster.
     * </p>
     *
     * @return <p>
     *         The storage encryption setting for the new global database
     *         cluster.
     *         </p>
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * The storage encryption setting for the new global database cluster.
     * </p>
     *
     * @return <p>
     *         The storage encryption setting for the new global database
     *         cluster.
     *         </p>
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * The storage encryption setting for the new global database cluster.
     * </p>
     *
     * @param storageEncrypted <p>
     *            The storage encryption setting for the new global database
     *            cluster.
     *            </p>
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * The storage encryption setting for the new global database cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageEncrypted <p>
     *            The storage encryption setting for the new global database
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGlobalClusterRequest withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
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
        if (getSourceDBClusterIdentifier() != null)
            sb.append("SourceDBClusterIdentifier: " + getSourceDBClusterIdentifier() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: " + getStorageEncrypted());
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
                + ((getSourceDBClusterIdentifier() == null) ? 0 : getSourceDBClusterIdentifier()
                        .hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode
                + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGlobalClusterRequest == false)
            return false;
        CreateGlobalClusterRequest other = (CreateGlobalClusterRequest) obj;

        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null
                && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getSourceDBClusterIdentifier() == null
                ^ this.getSourceDBClusterIdentifier() == null)
            return false;
        if (other.getSourceDBClusterIdentifier() != null
                && other.getSourceDBClusterIdentifier().equals(this.getSourceDBClusterIdentifier()) == false)
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
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
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
        return true;
    }
}
