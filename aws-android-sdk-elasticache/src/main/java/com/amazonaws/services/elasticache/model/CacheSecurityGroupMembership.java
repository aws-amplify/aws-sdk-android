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
 * Represents a cluster's status within a particular cache security group.
 * </p>
 */
public class CacheSecurityGroupMembership implements Serializable {
    /**
     * <p>
     * The name of the cache security group.
     * </p>
     */
    private String cacheSecurityGroupName;

    /**
     * <p>
     * The membership status in the cache security group. The status changes
     * when a cache security group is modified, or when the cache security
     * groups assigned to a cluster are modified.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the cache security group.
     * </p>
     *
     * @return <p>
     *         The name of the cache security group.
     *         </p>
     */
    public String getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cache security group.
     * </p>
     *
     * @param cacheSecurityGroupName <p>
     *            The name of the cache security group.
     *            </p>
     */
    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cache security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroupName <p>
     *            The name of the cache security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSecurityGroupMembership withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }

    /**
     * <p>
     * The membership status in the cache security group. The status changes
     * when a cache security group is modified, or when the cache security
     * groups assigned to a cluster are modified.
     * </p>
     *
     * @return <p>
     *         The membership status in the cache security group. The status
     *         changes when a cache security group is modified, or when the
     *         cache security groups assigned to a cluster are modified.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The membership status in the cache security group. The status changes
     * when a cache security group is modified, or when the cache security
     * groups assigned to a cluster are modified.
     * </p>
     *
     * @param status <p>
     *            The membership status in the cache security group. The status
     *            changes when a cache security group is modified, or when the
     *            cache security groups assigned to a cluster are modified.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The membership status in the cache security group. The status changes
     * when a cache security group is modified, or when the cache security
     * groups assigned to a cluster are modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The membership status in the cache security group. The status
     *            changes when a cache security group is modified, or when the
     *            cache security groups assigned to a cluster are modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSecurityGroupMembership withStatus(String status) {
        this.status = status;
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
        if (getCacheSecurityGroupName() != null)
            sb.append("CacheSecurityGroupName: " + getCacheSecurityGroupName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCacheSecurityGroupName() == null) ? 0 : getCacheSecurityGroupName()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheSecurityGroupMembership == false)
            return false;
        CacheSecurityGroupMembership other = (CacheSecurityGroupMembership) obj;

        if (other.getCacheSecurityGroupName() == null ^ this.getCacheSecurityGroupName() == null)
            return false;
        if (other.getCacheSecurityGroupName() != null
                && other.getCacheSecurityGroupName().equals(this.getCacheSecurityGroupName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
