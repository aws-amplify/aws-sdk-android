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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the settings for a Global Datastore.
 * </p>
 */
public class ModifyGlobalReplicationGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupId;

    /**
     * <p>
     * This parameter causes the modifications in this request and any pending
     * modifications to be applied, asynchronously and as soon as possible.
     * Modifications to Global Replication Groups cannot be requested to be
     * applied in PreferredMaintenceWindow.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * A valid cache node type that you want to scale this Global Datastore to.
     * </p>
     */
    private String cacheNodeType;

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the
     * Global Datastore.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * A description of the Global Datastore
     * </p>
     */
    private String globalReplicationGroupDescription;

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     */
    private Boolean automaticFailoverEnabled;

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
    public ModifyGlobalReplicationGroupRequest withGlobalReplicationGroupId(
            String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
        return this;
    }

    /**
     * <p>
     * This parameter causes the modifications in this request and any pending
     * modifications to be applied, asynchronously and as soon as possible.
     * Modifications to Global Replication Groups cannot be requested to be
     * applied in PreferredMaintenceWindow.
     * </p>
     *
     * @return <p>
     *         This parameter causes the modifications in this request and any
     *         pending modifications to be applied, asynchronously and as soon
     *         as possible. Modifications to Global Replication Groups cannot be
     *         requested to be applied in PreferredMaintenceWindow.
     *         </p>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * This parameter causes the modifications in this request and any pending
     * modifications to be applied, asynchronously and as soon as possible.
     * Modifications to Global Replication Groups cannot be requested to be
     * applied in PreferredMaintenceWindow.
     * </p>
     *
     * @return <p>
     *         This parameter causes the modifications in this request and any
     *         pending modifications to be applied, asynchronously and as soon
     *         as possible. Modifications to Global Replication Groups cannot be
     *         requested to be applied in PreferredMaintenceWindow.
     *         </p>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * This parameter causes the modifications in this request and any pending
     * modifications to be applied, asynchronously and as soon as possible.
     * Modifications to Global Replication Groups cannot be requested to be
     * applied in PreferredMaintenceWindow.
     * </p>
     *
     * @param applyImmediately <p>
     *            This parameter causes the modifications in this request and
     *            any pending modifications to be applied, asynchronously and as
     *            soon as possible. Modifications to Global Replication Groups
     *            cannot be requested to be applied in PreferredMaintenceWindow.
     *            </p>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * This parameter causes the modifications in this request and any pending
     * modifications to be applied, asynchronously and as soon as possible.
     * Modifications to Global Replication Groups cannot be requested to be
     * applied in PreferredMaintenceWindow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyImmediately <p>
     *            This parameter causes the modifications in this request and
     *            any pending modifications to be applied, asynchronously and as
     *            soon as possible. Modifications to Global Replication Groups
     *            cannot be requested to be applied in PreferredMaintenceWindow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyGlobalReplicationGroupRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this Global Datastore to.
     * </p>
     *
     * @return <p>
     *         A valid cache node type that you want to scale this Global
     *         Datastore to.
     *         </p>
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this Global Datastore to.
     * </p>
     *
     * @param cacheNodeType <p>
     *            A valid cache node type that you want to scale this Global
     *            Datastore to.
     *            </p>
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this Global Datastore to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeType <p>
     *            A valid cache node type that you want to scale this Global
     *            Datastore to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyGlobalReplicationGroupRequest withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the
     * Global Datastore.
     * </p>
     *
     * @return <p>
     *         The upgraded version of the cache engine to be run on the
     *         clusters in the Global Datastore.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the
     * Global Datastore.
     * </p>
     *
     * @param engineVersion <p>
     *            The upgraded version of the cache engine to be run on the
     *            clusters in the Global Datastore.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the
     * Global Datastore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The upgraded version of the cache engine to be run on the
     *            clusters in the Global Datastore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyGlobalReplicationGroupRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * A description of the Global Datastore
     * </p>
     *
     * @return <p>
     *         A description of the Global Datastore
     *         </p>
     */
    public String getGlobalReplicationGroupDescription() {
        return globalReplicationGroupDescription;
    }

    /**
     * <p>
     * A description of the Global Datastore
     * </p>
     *
     * @param globalReplicationGroupDescription <p>
     *            A description of the Global Datastore
     *            </p>
     */
    public void setGlobalReplicationGroupDescription(String globalReplicationGroupDescription) {
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
    }

    /**
     * <p>
     * A description of the Global Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalReplicationGroupDescription <p>
     *            A description of the Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyGlobalReplicationGroupRequest withGlobalReplicationGroupDescription(
            String globalReplicationGroupDescription) {
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
        return this;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     *
     * @return <p>
     *         Determines whether a read replica is automatically promoted to
     *         read/write primary if the existing primary encounters a failure.
     *         </p>
     */
    public Boolean isAutomaticFailoverEnabled() {
        return automaticFailoverEnabled;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     *
     * @return <p>
     *         Determines whether a read replica is automatically promoted to
     *         read/write primary if the existing primary encounters a failure.
     *         </p>
     */
    public Boolean getAutomaticFailoverEnabled() {
        return automaticFailoverEnabled;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     *
     * @param automaticFailoverEnabled <p>
     *            Determines whether a read replica is automatically promoted to
     *            read/write primary if the existing primary encounters a
     *            failure.
     *            </p>
     */
    public void setAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write
     * primary if the existing primary encounters a failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automaticFailoverEnabled <p>
     *            Determines whether a read replica is automatically promoted to
     *            read/write primary if the existing primary encounters a
     *            failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyGlobalReplicationGroupRequest withAutomaticFailoverEnabled(
            Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
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
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getGlobalReplicationGroupDescription() != null)
            sb.append("GlobalReplicationGroupDescription: "
                    + getGlobalReplicationGroupDescription() + ",");
        if (getAutomaticFailoverEnabled() != null)
            sb.append("AutomaticFailoverEnabled: " + getAutomaticFailoverEnabled());
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
        hashCode = prime * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getGlobalReplicationGroupDescription() == null) ? 0
                        : getGlobalReplicationGroupDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomaticFailoverEnabled() == null) ? 0 : getAutomaticFailoverEnabled()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyGlobalReplicationGroupRequest == false)
            return false;
        ModifyGlobalReplicationGroupRequest other = (ModifyGlobalReplicationGroupRequest) obj;

        if (other.getGlobalReplicationGroupId() == null
                ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null
                && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null
                && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getGlobalReplicationGroupDescription() == null
                ^ this.getGlobalReplicationGroupDescription() == null)
            return false;
        if (other.getGlobalReplicationGroupDescription() != null
                && other.getGlobalReplicationGroupDescription().equals(
                        this.getGlobalReplicationGroupDescription()) == false)
            return false;
        if (other.getAutomaticFailoverEnabled() == null
                ^ this.getAutomaticFailoverEnabled() == null)
            return false;
        if (other.getAutomaticFailoverEnabled() != null
                && other.getAutomaticFailoverEnabled().equals(this.getAutomaticFailoverEnabled()) == false)
            return false;
        return true;
    }
}
