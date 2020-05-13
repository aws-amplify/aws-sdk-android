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

public class RevokeCacheSecurityGroupIngressResult implements Serializable {
    /**
     * <p>
     * Represents the output of one of the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AuthorizeCacheSecurityGroupIngress</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateCacheSecurityGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RevokeCacheSecurityGroupIngress</code>
     * </p>
     * </li>
     * </ul>
     */
    private CacheSecurityGroup cacheSecurityGroup;

    /**
     * <p>
     * Represents the output of one of the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AuthorizeCacheSecurityGroupIngress</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateCacheSecurityGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RevokeCacheSecurityGroupIngress</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Represents the output of one of the following operations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AuthorizeCacheSecurityGroupIngress</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CreateCacheSecurityGroup</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RevokeCacheSecurityGroupIngress</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public CacheSecurityGroup getCacheSecurityGroup() {
        return cacheSecurityGroup;
    }

    /**
     * <p>
     * Represents the output of one of the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AuthorizeCacheSecurityGroupIngress</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateCacheSecurityGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RevokeCacheSecurityGroupIngress</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param cacheSecurityGroup <p>
     *            Represents the output of one of the following operations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AuthorizeCacheSecurityGroupIngress</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CreateCacheSecurityGroup</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RevokeCacheSecurityGroupIngress</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCacheSecurityGroup(CacheSecurityGroup cacheSecurityGroup) {
        this.cacheSecurityGroup = cacheSecurityGroup;
    }

    /**
     * <p>
     * Represents the output of one of the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AuthorizeCacheSecurityGroupIngress</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateCacheSecurityGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RevokeCacheSecurityGroupIngress</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroup <p>
     *            Represents the output of one of the following operations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AuthorizeCacheSecurityGroupIngress</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CreateCacheSecurityGroup</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RevokeCacheSecurityGroupIngress</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeCacheSecurityGroupIngressResult withCacheSecurityGroup(
            CacheSecurityGroup cacheSecurityGroup) {
        this.cacheSecurityGroup = cacheSecurityGroup;
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
        if (getCacheSecurityGroup() != null)
            sb.append("CacheSecurityGroup: " + getCacheSecurityGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCacheSecurityGroup() == null) ? 0 : getCacheSecurityGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeCacheSecurityGroupIngressResult == false)
            return false;
        RevokeCacheSecurityGroupIngressResult other = (RevokeCacheSecurityGroupIngressResult) obj;

        if (other.getCacheSecurityGroup() == null ^ this.getCacheSecurityGroup() == null)
            return false;
        if (other.getCacheSecurityGroup() != null
                && other.getCacheSecurityGroup().equals(this.getCacheSecurityGroup()) == false)
            return false;
        return true;
    }
}
