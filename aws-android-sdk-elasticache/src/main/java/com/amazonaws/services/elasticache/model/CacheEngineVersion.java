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
 * Provides all of the details about a particular cache engine version.
 * </p>
 */
public class CacheEngineVersion implements Serializable {
    /**
     * <p>
     * The name of the cache engine.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The version number of the cache engine.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The name of the cache parameter group family associated with this cache
     * engine.
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
     * The description of the cache engine.
     * </p>
     */
    private String cacheEngineDescription;

    /**
     * <p>
     * The description of the cache engine version.
     * </p>
     */
    private String cacheEngineVersionDescription;

    /**
     * <p>
     * The name of the cache engine.
     * </p>
     *
     * @return <p>
     *         The name of the cache engine.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The name of the cache engine.
     * </p>
     *
     * @param engine <p>
     *            The name of the cache engine.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the cache engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The name of the cache engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheEngineVersion withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The version number of the cache engine.
     * </p>
     *
     * @return <p>
     *         The version number of the cache engine.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The version number of the cache engine.
     * </p>
     *
     * @param engineVersion <p>
     *            The version number of the cache engine.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the cache engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version number of the cache engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheEngineVersion withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The name of the cache parameter group family associated with this cache
     * engine.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> |
     * <code>redis4.0</code> | <code>redis5.0</code> |
     * </p>
     *
     * @return <p>
     *         The name of the cache parameter group family associated with this
     *         cache engine.
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
     * The name of the cache parameter group family associated with this cache
     * engine.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> |
     * <code>redis4.0</code> | <code>redis5.0</code> |
     * </p>
     *
     * @param cacheParameterGroupFamily <p>
     *            The name of the cache parameter group family associated with
     *            this cache engine.
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
     * The name of the cache parameter group family associated with this cache
     * engine.
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
     *            The name of the cache parameter group family associated with
     *            this cache engine.
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
    public CacheEngineVersion withCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
        return this;
    }

    /**
     * <p>
     * The description of the cache engine.
     * </p>
     *
     * @return <p>
     *         The description of the cache engine.
     *         </p>
     */
    public String getCacheEngineDescription() {
        return cacheEngineDescription;
    }

    /**
     * <p>
     * The description of the cache engine.
     * </p>
     *
     * @param cacheEngineDescription <p>
     *            The description of the cache engine.
     *            </p>
     */
    public void setCacheEngineDescription(String cacheEngineDescription) {
        this.cacheEngineDescription = cacheEngineDescription;
    }

    /**
     * <p>
     * The description of the cache engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheEngineDescription <p>
     *            The description of the cache engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheEngineVersion withCacheEngineDescription(String cacheEngineDescription) {
        this.cacheEngineDescription = cacheEngineDescription;
        return this;
    }

    /**
     * <p>
     * The description of the cache engine version.
     * </p>
     *
     * @return <p>
     *         The description of the cache engine version.
     *         </p>
     */
    public String getCacheEngineVersionDescription() {
        return cacheEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the cache engine version.
     * </p>
     *
     * @param cacheEngineVersionDescription <p>
     *            The description of the cache engine version.
     *            </p>
     */
    public void setCacheEngineVersionDescription(String cacheEngineVersionDescription) {
        this.cacheEngineVersionDescription = cacheEngineVersionDescription;
    }

    /**
     * <p>
     * The description of the cache engine version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheEngineVersionDescription <p>
     *            The description of the cache engine version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheEngineVersion withCacheEngineVersionDescription(String cacheEngineVersionDescription) {
        this.cacheEngineVersionDescription = cacheEngineVersionDescription;
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
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getCacheParameterGroupFamily() != null)
            sb.append("CacheParameterGroupFamily: " + getCacheParameterGroupFamily() + ",");
        if (getCacheEngineDescription() != null)
            sb.append("CacheEngineDescription: " + getCacheEngineDescription() + ",");
        if (getCacheEngineVersionDescription() != null)
            sb.append("CacheEngineVersionDescription: " + getCacheEngineVersionDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheParameterGroupFamily() == null) ? 0 : getCacheParameterGroupFamily()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheEngineDescription() == null) ? 0 : getCacheEngineDescription()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheEngineVersionDescription() == null) ? 0
                        : getCacheEngineVersionDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheEngineVersion == false)
            return false;
        CacheEngineVersion other = (CacheEngineVersion) obj;

        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getCacheParameterGroupFamily() == null
                ^ this.getCacheParameterGroupFamily() == null)
            return false;
        if (other.getCacheParameterGroupFamily() != null
                && other.getCacheParameterGroupFamily().equals(this.getCacheParameterGroupFamily()) == false)
            return false;
        if (other.getCacheEngineDescription() == null ^ this.getCacheEngineDescription() == null)
            return false;
        if (other.getCacheEngineDescription() != null
                && other.getCacheEngineDescription().equals(this.getCacheEngineDescription()) == false)
            return false;
        if (other.getCacheEngineVersionDescription() == null
                ^ this.getCacheEngineVersionDescription() == null)
            return false;
        if (other.getCacheEngineVersionDescription() != null
                && other.getCacheEngineVersionDescription().equals(
                        this.getCacheEngineVersionDescription()) == false)
            return false;
        return true;
    }
}
