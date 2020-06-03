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
 * Represents the output of a <code>CreateCacheParameterGroup</code> operation.
 * </p>
 */
public class CacheParameterGroup implements Serializable {
    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     */
    private String cacheParameterGroupName;

    /**
     * <p>
     * The name of the cache parameter group family that this cache parameter
     * group is compatible with.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> |
     * <code>redis4.0</code> | <code>redis5.0</code> |
     * </p>
     */
    private String cacheParameterGroupFamily;

    /**
     * <p>
     * The description for this cache parameter group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Indicates whether the parameter group is associated with a Global
     * Datastore
     * </p>
     */
    private Boolean isGlobal;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache parameter group.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     *
     * @return <p>
     *         The name of the cache parameter group.
     *         </p>
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group.
     *            </p>
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroupName <p>
     *            The name of the cache parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheParameterGroup withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the cache parameter group family that this cache parameter
     * group is compatible with.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> |
     * <code>redis4.0</code> | <code>redis5.0</code> |
     * </p>
     *
     * @return <p>
     *         The name of the cache parameter group family that this cache
     *         parameter group is compatible with.
     *         </p>
     *         <p>
     *         Valid values are: <code>memcached1.4</code> |
     *         <code>memcached1.5</code> | <code>redis2.6</code> |
     *         <code>redis2.8</code> | <code>redis3.2</code> |
     *         <code>redis4.0</code> | <code>redis5.0</code> |
     *         </p>
     */
    public String getCacheParameterGroupFamily() {
        return cacheParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cache parameter group family that this cache parameter
     * group is compatible with.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> |
     * <code>redis4.0</code> | <code>redis5.0</code> |
     * </p>
     *
     * @param cacheParameterGroupFamily <p>
     *            The name of the cache parameter group family that this cache
     *            parameter group is compatible with.
     *            </p>
     *            <p>
     *            Valid values are: <code>memcached1.4</code> |
     *            <code>memcached1.5</code> | <code>redis2.6</code> |
     *            <code>redis2.8</code> | <code>redis3.2</code> |
     *            <code>redis4.0</code> | <code>redis5.0</code> |
     *            </p>
     */
    public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cache parameter group family that this cache parameter
     * group is compatible with.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> |
     * <code>redis4.0</code> | <code>redis5.0</code> |
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroupFamily <p>
     *            The name of the cache parameter group family that this cache
     *            parameter group is compatible with.
     *            </p>
     *            <p>
     *            Valid values are: <code>memcached1.4</code> |
     *            <code>memcached1.5</code> | <code>redis2.6</code> |
     *            <code>redis2.8</code> | <code>redis3.2</code> |
     *            <code>redis4.0</code> | <code>redis5.0</code> |
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheParameterGroup withCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
        return this;
    }

    /**
     * <p>
     * The description for this cache parameter group.
     * </p>
     *
     * @return <p>
     *         The description for this cache parameter group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for this cache parameter group.
     * </p>
     *
     * @param description <p>
     *            The description for this cache parameter group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for this cache parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description for this cache parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheParameterGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Indicates whether the parameter group is associated with a Global
     * Datastore
     * </p>
     *
     * @return <p>
     *         Indicates whether the parameter group is associated with a Global
     *         Datastore
     *         </p>
     */
    public Boolean isIsGlobal() {
        return isGlobal;
    }

    /**
     * <p>
     * Indicates whether the parameter group is associated with a Global
     * Datastore
     * </p>
     *
     * @return <p>
     *         Indicates whether the parameter group is associated with a Global
     *         Datastore
     *         </p>
     */
    public Boolean getIsGlobal() {
        return isGlobal;
    }

    /**
     * <p>
     * Indicates whether the parameter group is associated with a Global
     * Datastore
     * </p>
     *
     * @param isGlobal <p>
     *            Indicates whether the parameter group is associated with a
     *            Global Datastore
     *            </p>
     */
    public void setIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
    }

    /**
     * <p>
     * Indicates whether the parameter group is associated with a Global
     * Datastore
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isGlobal <p>
     *            Indicates whether the parameter group is associated with a
     *            Global Datastore
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheParameterGroup withIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache parameter group.
     * </p>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) of the cache parameter group.
     *         </p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache parameter group.
     * </p>
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) of the cache parameter group.
     *            </p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) of the cache parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheParameterGroup withARN(String aRN) {
        this.aRN = aRN;
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
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getCacheParameterGroupFamily() != null)
            sb.append("CacheParameterGroupFamily: " + getCacheParameterGroupFamily() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getIsGlobal() != null)
            sb.append("IsGlobal: " + getIsGlobal() + ",");
        if (getARN() != null)
            sb.append("ARN: " + getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupFamily() == null) ? 0 : getCacheParameterGroupFamily()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIsGlobal() == null) ? 0 : getIsGlobal().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheParameterGroup == false)
            return false;
        CacheParameterGroup other = (CacheParameterGroup) obj;

        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null
                && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getCacheParameterGroupFamily() == null
                ^ this.getCacheParameterGroupFamily() == null)
            return false;
        if (other.getCacheParameterGroupFamily() != null
                && other.getCacheParameterGroupFamily().equals(this.getCacheParameterGroupFamily()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIsGlobal() == null ^ this.getIsGlobal() == null)
            return false;
        if (other.getIsGlobal() != null && other.getIsGlobal().equals(this.getIsGlobal()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }
}
