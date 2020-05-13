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
 * Consists of a primary cluster that accepts writes and an associated secondary
 * cluster that resides in a different AWS region. The secondary cluster accepts
 * only reads. The primary cluster automatically replicates updates to the
 * secondary cluster.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <b>GlobalReplicationGroupIdSuffix</b> represents the name of the Global
 * Datastore, which is what you use to associate a secondary cluster.
 * </p>
 * </li>
 * </ul>
 */
public class GlobalReplicationGroup implements Serializable {
    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;

    /**
     * <p>
     * The optional description of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupDescription;

    /**
     * <p>
     * The status of the Global Datastore
     * </p>
     */
    private String status;

    /**
     * <p>
     * The cache node type of the Global Datastore
     * </p>
     */
    private String cacheNodeType;

    /**
     * <p>
     * The Elasticache engine. For Redis only.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The Elasticache Redis engine version. For preview, it is Redis version
     * 5.0.5 only.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The replication groups that comprise the Global Datastore.
     * </p>
     */
    private java.util.List<GlobalReplicationGroupMember> members;

    /**
     * <p>
     * A flag that indicates whether the Global Datastore is cluster enabled.
     * </p>
     */
    private Boolean clusterEnabled;

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice
     * group.
     * </p>
     */
    private java.util.List<GlobalNodeGroup> globalNodeGroups;

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when
     * issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean authTokenEnabled;

    /**
     * <p>
     * A flag that enables in-transit encryption when set to true. You cannot
     * modify the value of <code>TransitEncryptionEnabled</code> after the
     * cluster is created. To enable in-transit encryption on a cluster you must
     * set <code>TransitEncryptionEnabled</code> to true when you create a
     * cluster.
     * </p>
     */
    private Boolean transitEncryptionEnabled;

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the replication group is created. To enable encryption at rest on a
     * replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     */
    private Boolean atRestEncryptionEnabled;

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
    public GlobalReplicationGroup withGlobalReplicationGroupId(String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
        return this;
    }

    /**
     * <p>
     * The optional description of the Global Datastore
     * </p>
     *
     * @return <p>
     *         The optional description of the Global Datastore
     *         </p>
     */
    public String getGlobalReplicationGroupDescription() {
        return globalReplicationGroupDescription;
    }

    /**
     * <p>
     * The optional description of the Global Datastore
     * </p>
     *
     * @param globalReplicationGroupDescription <p>
     *            The optional description of the Global Datastore
     *            </p>
     */
    public void setGlobalReplicationGroupDescription(String globalReplicationGroupDescription) {
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
    }

    /**
     * <p>
     * The optional description of the Global Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroupDescription <p>
     *            The optional description of the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withGlobalReplicationGroupDescription(
            String globalReplicationGroupDescription) {
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
        return this;
    }

    /**
     * <p>
     * The status of the Global Datastore
     * </p>
     *
     * @return <p>
     *         The status of the Global Datastore
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the Global Datastore
     * </p>
     *
     * @param status <p>
     *            The status of the Global Datastore
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Global Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The cache node type of the Global Datastore
     * </p>
     *
     * @return <p>
     *         The cache node type of the Global Datastore
     *         </p>
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }

    /**
     * <p>
     * The cache node type of the Global Datastore
     * </p>
     *
     * @param cacheNodeType <p>
     *            The cache node type of the Global Datastore
     *            </p>
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The cache node type of the Global Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeType <p>
     *            The cache node type of the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * <p>
     * The Elasticache engine. For Redis only.
     * </p>
     *
     * @return <p>
     *         The Elasticache engine. For Redis only.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The Elasticache engine. For Redis only.
     * </p>
     *
     * @param engine <p>
     *            The Elasticache engine. For Redis only.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The Elasticache engine. For Redis only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The Elasticache engine. For Redis only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The Elasticache Redis engine version. For preview, it is Redis version
     * 5.0.5 only.
     * </p>
     *
     * @return <p>
     *         The Elasticache Redis engine version. For preview, it is Redis
     *         version 5.0.5 only.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The Elasticache Redis engine version. For preview, it is Redis version
     * 5.0.5 only.
     * </p>
     *
     * @param engineVersion <p>
     *            The Elasticache Redis engine version. For preview, it is Redis
     *            version 5.0.5 only.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The Elasticache Redis engine version. For preview, it is Redis version
     * 5.0.5 only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The Elasticache Redis engine version. For preview, it is Redis
     *            version 5.0.5 only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The replication groups that comprise the Global Datastore.
     * </p>
     *
     * @return <p>
     *         The replication groups that comprise the Global Datastore.
     *         </p>
     */
    public java.util.List<GlobalReplicationGroupMember> getMembers() {
        return members;
    }

    /**
     * <p>
     * The replication groups that comprise the Global Datastore.
     * </p>
     *
     * @param members <p>
     *            The replication groups that comprise the Global Datastore.
     *            </p>
     */
    public void setMembers(java.util.Collection<GlobalReplicationGroupMember> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<GlobalReplicationGroupMember>(members);
    }

    /**
     * <p>
     * The replication groups that comprise the Global Datastore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param members <p>
     *            The replication groups that comprise the Global Datastore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withMembers(GlobalReplicationGroupMember... members) {
        if (getMembers() == null) {
            this.members = new java.util.ArrayList<GlobalReplicationGroupMember>(members.length);
        }
        for (GlobalReplicationGroupMember value : members) {
            this.members.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The replication groups that comprise the Global Datastore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param members <p>
     *            The replication groups that comprise the Global Datastore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withMembers(
            java.util.Collection<GlobalReplicationGroupMember> members) {
        setMembers(members);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether the Global Datastore is cluster enabled.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether the Global Datastore is cluster
     *         enabled.
     *         </p>
     */
    public Boolean isClusterEnabled() {
        return clusterEnabled;
    }

    /**
     * <p>
     * A flag that indicates whether the Global Datastore is cluster enabled.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether the Global Datastore is cluster
     *         enabled.
     *         </p>
     */
    public Boolean getClusterEnabled() {
        return clusterEnabled;
    }

    /**
     * <p>
     * A flag that indicates whether the Global Datastore is cluster enabled.
     * </p>
     *
     * @param clusterEnabled <p>
     *            A flag that indicates whether the Global Datastore is cluster
     *            enabled.
     *            </p>
     */
    public void setClusterEnabled(Boolean clusterEnabled) {
        this.clusterEnabled = clusterEnabled;
    }

    /**
     * <p>
     * A flag that indicates whether the Global Datastore is cluster enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterEnabled <p>
     *            A flag that indicates whether the Global Datastore is cluster
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withClusterEnabled(Boolean clusterEnabled) {
        this.clusterEnabled = clusterEnabled;
        return this;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice
     * group.
     * </p>
     *
     * @return <p>
     *         Indicates the slot configuration and global identifier for each
     *         slice group.
     *         </p>
     */
    public java.util.List<GlobalNodeGroup> getGlobalNodeGroups() {
        return globalNodeGroups;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice
     * group.
     * </p>
     *
     * @param globalNodeGroups <p>
     *            Indicates the slot configuration and global identifier for
     *            each slice group.
     *            </p>
     */
    public void setGlobalNodeGroups(java.util.Collection<GlobalNodeGroup> globalNodeGroups) {
        if (globalNodeGroups == null) {
            this.globalNodeGroups = null;
            return;
        }

        this.globalNodeGroups = new java.util.ArrayList<GlobalNodeGroup>(globalNodeGroups);
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalNodeGroups <p>
     *            Indicates the slot configuration and global identifier for
     *            each slice group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withGlobalNodeGroups(GlobalNodeGroup... globalNodeGroups) {
        if (getGlobalNodeGroups() == null) {
            this.globalNodeGroups = new java.util.ArrayList<GlobalNodeGroup>(
                    globalNodeGroups.length);
        }
        for (GlobalNodeGroup value : globalNodeGroups) {
            this.globalNodeGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalNodeGroups <p>
     *            Indicates the slot configuration and global identifier for
     *            each slice group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withGlobalNodeGroups(
            java.util.Collection<GlobalNodeGroup> globalNodeGroups) {
        setGlobalNodeGroups(globalNodeGroups);
        return this;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when
     * issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         A flag that enables using an <code>AuthToken</code> (password)
     *         when issuing Redis commands.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean isAuthTokenEnabled() {
        return authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when
     * issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         A flag that enables using an <code>AuthToken</code> (password)
     *         when issuing Redis commands.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean getAuthTokenEnabled() {
        return authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when
     * issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param authTokenEnabled <p>
     *            A flag that enables using an <code>AuthToken</code> (password)
     *            when issuing Redis commands.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     */
    public void setAuthTokenEnabled(Boolean authTokenEnabled) {
        this.authTokenEnabled = authTokenEnabled;
    }

    /**
     * <p>
     * A flag that enables using an <code>AuthToken</code> (password) when
     * issuing Redis commands.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authTokenEnabled <p>
     *            A flag that enables using an <code>AuthToken</code> (password)
     *            when issuing Redis commands.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withAuthTokenEnabled(Boolean authTokenEnabled) {
        this.authTokenEnabled = authTokenEnabled;
        return this;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to true. You cannot
     * modify the value of <code>TransitEncryptionEnabled</code> after the
     * cluster is created. To enable in-transit encryption on a cluster you must
     * set <code>TransitEncryptionEnabled</code> to true when you create a
     * cluster.
     * </p>
     *
     * @return <p>
     *         A flag that enables in-transit encryption when set to true. You
     *         cannot modify the value of <code>TransitEncryptionEnabled</code>
     *         after the cluster is created. To enable in-transit encryption on
     *         a cluster you must set <code>TransitEncryptionEnabled</code> to
     *         true when you create a cluster.
     *         </p>
     */
    public Boolean isTransitEncryptionEnabled() {
        return transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to true. You cannot
     * modify the value of <code>TransitEncryptionEnabled</code> after the
     * cluster is created. To enable in-transit encryption on a cluster you must
     * set <code>TransitEncryptionEnabled</code> to true when you create a
     * cluster.
     * </p>
     *
     * @return <p>
     *         A flag that enables in-transit encryption when set to true. You
     *         cannot modify the value of <code>TransitEncryptionEnabled</code>
     *         after the cluster is created. To enable in-transit encryption on
     *         a cluster you must set <code>TransitEncryptionEnabled</code> to
     *         true when you create a cluster.
     *         </p>
     */
    public Boolean getTransitEncryptionEnabled() {
        return transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to true. You cannot
     * modify the value of <code>TransitEncryptionEnabled</code> after the
     * cluster is created. To enable in-transit encryption on a cluster you must
     * set <code>TransitEncryptionEnabled</code> to true when you create a
     * cluster.
     * </p>
     *
     * @param transitEncryptionEnabled <p>
     *            A flag that enables in-transit encryption when set to true.
     *            You cannot modify the value of
     *            <code>TransitEncryptionEnabled</code> after the cluster is
     *            created. To enable in-transit encryption on a cluster you must
     *            set <code>TransitEncryptionEnabled</code> to true when you
     *            create a cluster.
     *            </p>
     */
    public void setTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables in-transit encryption when set to true. You cannot
     * modify the value of <code>TransitEncryptionEnabled</code> after the
     * cluster is created. To enable in-transit encryption on a cluster you must
     * set <code>TransitEncryptionEnabled</code> to true when you create a
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitEncryptionEnabled <p>
     *            A flag that enables in-transit encryption when set to true.
     *            You cannot modify the value of
     *            <code>TransitEncryptionEnabled</code> after the cluster is
     *            created. To enable in-transit encryption on a cluster you must
     *            set <code>TransitEncryptionEnabled</code> to true when you
     *            create a cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
        return this;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the replication group is created. To enable encryption at rest on a
     * replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     *
     * @return <p>
     *         A flag that enables encryption at rest when set to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         You cannot modify the value of
     *         <code>AtRestEncryptionEnabled</code> after the replication group
     *         is created. To enable encryption at rest on a replication group
     *         you must set <code>AtRestEncryptionEnabled</code> to
     *         <code>true</code> when you create the replication group.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group
     *         in an Amazon VPC using redis version <code>3.2.6</code>,
     *         <code>4.x</code> or later.
     *         </p>
     */
    public Boolean isAtRestEncryptionEnabled() {
        return atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the replication group is created. To enable encryption at rest on a
     * replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     *
     * @return <p>
     *         A flag that enables encryption at rest when set to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         You cannot modify the value of
     *         <code>AtRestEncryptionEnabled</code> after the replication group
     *         is created. To enable encryption at rest on a replication group
     *         you must set <code>AtRestEncryptionEnabled</code> to
     *         <code>true</code> when you create the replication group.
     *         </p>
     *         <p>
     *         <b>Required:</b> Only available when creating a replication group
     *         in an Amazon VPC using redis version <code>3.2.6</code>,
     *         <code>4.x</code> or later.
     *         </p>
     */
    public Boolean getAtRestEncryptionEnabled() {
        return atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the replication group is created. To enable encryption at rest on a
     * replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     *
     * @param atRestEncryptionEnabled <p>
     *            A flag that enables encryption at rest when set to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            You cannot modify the value of
     *            <code>AtRestEncryptionEnabled</code> after the replication
     *            group is created. To enable encryption at rest on a
     *            replication group you must set
     *            <code>AtRestEncryptionEnabled</code> to <code>true</code> when
     *            you create the replication group.
     *            </p>
     *            <p>
     *            <b>Required:</b> Only available when creating a replication
     *            group in an Amazon VPC using redis version <code>3.2.6</code>,
     *            <code>4.x</code> or later.
     *            </p>
     */
    public void setAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
    }

    /**
     * <p>
     * A flag that enables encryption at rest when set to <code>true</code>.
     * </p>
     * <p>
     * You cannot modify the value of <code>AtRestEncryptionEnabled</code> after
     * the replication group is created. To enable encryption at rest on a
     * replication group you must set <code>AtRestEncryptionEnabled</code> to
     * <code>true</code> when you create the replication group.
     * </p>
     * <p>
     * <b>Required:</b> Only available when creating a replication group in an
     * Amazon VPC using redis version <code>3.2.6</code>, <code>4.x</code> or
     * later.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param atRestEncryptionEnabled <p>
     *            A flag that enables encryption at rest when set to
     *            <code>true</code>.
     *            </p>
     *            <p>
     *            You cannot modify the value of
     *            <code>AtRestEncryptionEnabled</code> after the replication
     *            group is created. To enable encryption at rest on a
     *            replication group you must set
     *            <code>AtRestEncryptionEnabled</code> to <code>true</code> when
     *            you create the replication group.
     *            </p>
     *            <p>
     *            <b>Required:</b> Only available when creating a replication
     *            group in an Amazon VPC using redis version <code>3.2.6</code>,
     *            <code>4.x</code> or later.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalReplicationGroup withAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
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
        if (getGlobalReplicationGroupDescription() != null)
            sb.append("GlobalReplicationGroupDescription: "
                    + getGlobalReplicationGroupDescription() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getMembers() != null)
            sb.append("Members: " + getMembers() + ",");
        if (getClusterEnabled() != null)
            sb.append("ClusterEnabled: " + getClusterEnabled() + ",");
        if (getGlobalNodeGroups() != null)
            sb.append("GlobalNodeGroups: " + getGlobalNodeGroups() + ",");
        if (getAuthTokenEnabled() != null)
            sb.append("AuthTokenEnabled: " + getAuthTokenEnabled() + ",");
        if (getTransitEncryptionEnabled() != null)
            sb.append("TransitEncryptionEnabled: " + getTransitEncryptionEnabled() + ",");
        if (getAtRestEncryptionEnabled() != null)
            sb.append("AtRestEncryptionEnabled: " + getAtRestEncryptionEnabled());
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
                + ((getGlobalReplicationGroupDescription() == null) ? 0
                        : getGlobalReplicationGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode
                + ((getClusterEnabled() == null) ? 0 : getClusterEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getGlobalNodeGroups() == null) ? 0 : getGlobalNodeGroups().hashCode());
        hashCode = prime * hashCode
                + ((getAuthTokenEnabled() == null) ? 0 : getAuthTokenEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getTransitEncryptionEnabled() == null) ? 0 : getTransitEncryptionEnabled()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAtRestEncryptionEnabled() == null) ? 0 : getAtRestEncryptionEnabled()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalReplicationGroup == false)
            return false;
        GlobalReplicationGroup other = (GlobalReplicationGroup) obj;

        if (other.getGlobalReplicationGroupId() == null
                ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null
                && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getGlobalReplicationGroupDescription() == null
                ^ this.getGlobalReplicationGroupDescription() == null)
            return false;
        if (other.getGlobalReplicationGroupDescription() != null
                && other.getGlobalReplicationGroupDescription().equals(
                        this.getGlobalReplicationGroupDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null
                && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
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
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        if (other.getClusterEnabled() == null ^ this.getClusterEnabled() == null)
            return false;
        if (other.getClusterEnabled() != null
                && other.getClusterEnabled().equals(this.getClusterEnabled()) == false)
            return false;
        if (other.getGlobalNodeGroups() == null ^ this.getGlobalNodeGroups() == null)
            return false;
        if (other.getGlobalNodeGroups() != null
                && other.getGlobalNodeGroups().equals(this.getGlobalNodeGroups()) == false)
            return false;
        if (other.getAuthTokenEnabled() == null ^ this.getAuthTokenEnabled() == null)
            return false;
        if (other.getAuthTokenEnabled() != null
                && other.getAuthTokenEnabled().equals(this.getAuthTokenEnabled()) == false)
            return false;
        if (other.getTransitEncryptionEnabled() == null
                ^ this.getTransitEncryptionEnabled() == null)
            return false;
        if (other.getTransitEncryptionEnabled() != null
                && other.getTransitEncryptionEnabled().equals(this.getTransitEncryptionEnabled()) == false)
            return false;
        if (other.getAtRestEncryptionEnabled() == null ^ this.getAtRestEncryptionEnabled() == null)
            return false;
        if (other.getAtRestEncryptionEnabled() != null
                && other.getAtRestEncryptionEnabled().equals(this.getAtRestEncryptionEnabled()) == false)
            return false;
        return true;
    }
}
