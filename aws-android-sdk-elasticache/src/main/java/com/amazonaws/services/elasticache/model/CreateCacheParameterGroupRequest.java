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
 * Creates a new Amazon ElastiCache cache parameter group. An ElastiCache cache
 * parameter group is a collection of parameters and their values that are
 * applied to all of the nodes in any cluster or replication group using the
 * CacheParameterGroup.
 * </p>
 * <p>
 * A newly created CacheParameterGroup is an exact duplicate of the default
 * parameter group for the CacheParameterGroupFamily. To customize the newly
 * created CacheParameterGroup you can change the values of specific parameters.
 * For more information, see:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheParameterGroup.html"
 * >ModifyCacheParameterGroup</a> in the ElastiCache API Reference.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ParameterGroups.html"
 * >Parameters and Parameter Groups</a> in the ElastiCache User Guide.
 * </p>
 * </li>
 * </ul>
 */
public class CreateCacheParameterGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A user-specified name for the cache parameter group.
     * </p>
     */
    private String cacheParameterGroupName;

    /**
     * <p>
     * The name of the cache parameter group family that the cache parameter
     * group can be used with.
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
     * A user-specified description for the cache parameter group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A user-specified name for the cache parameter group.
     * </p>
     *
     * @return <p>
     *         A user-specified name for the cache parameter group.
     *         </p>
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }

    /**
     * <p>
     * A user-specified name for the cache parameter group.
     * </p>
     *
     * @param cacheParameterGroupName <p>
     *            A user-specified name for the cache parameter group.
     *            </p>
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * A user-specified name for the cache parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroupName <p>
     *            A user-specified name for the cache parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCacheParameterGroupRequest withCacheParameterGroupName(
            String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the cache parameter group family that the cache parameter
     * group can be used with.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> |
     * <code>redis4.0</code> | <code>redis5.0</code> |
     * </p>
     *
     * @return <p>
     *         The name of the cache parameter group family that the cache
     *         parameter group can be used with.
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
     * The name of the cache parameter group family that the cache parameter
     * group can be used with.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> |
     * <code>redis4.0</code> | <code>redis5.0</code> |
     * </p>
     *
     * @param cacheParameterGroupFamily <p>
     *            The name of the cache parameter group family that the cache
     *            parameter group can be used with.
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
     * The name of the cache parameter group family that the cache parameter
     * group can be used with.
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
     *            The name of the cache parameter group family that the cache
     *            parameter group can be used with.
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
    public CreateCacheParameterGroupRequest withCacheParameterGroupFamily(
            String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
        return this;
    }

    /**
     * <p>
     * A user-specified description for the cache parameter group.
     * </p>
     *
     * @return <p>
     *         A user-specified description for the cache parameter group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A user-specified description for the cache parameter group.
     * </p>
     *
     * @param description <p>
     *            A user-specified description for the cache parameter group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-specified description for the cache parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A user-specified description for the cache parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCacheParameterGroupRequest withDescription(String description) {
        this.description = description;
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
            sb.append("Description: " + getDescription());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCacheParameterGroupRequest == false)
            return false;
        CreateCacheParameterGroupRequest other = (CreateCacheParameterGroupRequest) obj;

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
        return true;
    }
}
