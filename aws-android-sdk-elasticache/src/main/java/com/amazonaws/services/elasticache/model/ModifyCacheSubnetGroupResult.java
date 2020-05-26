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

public class ModifyCacheSubnetGroupResult implements Serializable {
    /**
     * <p>
     * Represents the output of one of the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateCacheSubnetGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ModifyCacheSubnetGroup</code>
     * </p>
     * </li>
     * </ul>
     */
    private CacheSubnetGroup cacheSubnetGroup;

    /**
     * <p>
     * Represents the output of one of the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateCacheSubnetGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ModifyCacheSubnetGroup</code>
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
     *         <code>CreateCacheSubnetGroup</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ModifyCacheSubnetGroup</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public CacheSubnetGroup getCacheSubnetGroup() {
        return cacheSubnetGroup;
    }

    /**
     * <p>
     * Represents the output of one of the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateCacheSubnetGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ModifyCacheSubnetGroup</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param cacheSubnetGroup <p>
     *            Represents the output of one of the following operations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CreateCacheSubnetGroup</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ModifyCacheSubnetGroup</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCacheSubnetGroup(CacheSubnetGroup cacheSubnetGroup) {
        this.cacheSubnetGroup = cacheSubnetGroup;
    }

    /**
     * <p>
     * Represents the output of one of the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreateCacheSubnetGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ModifyCacheSubnetGroup</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSubnetGroup <p>
     *            Represents the output of one of the following operations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CreateCacheSubnetGroup</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ModifyCacheSubnetGroup</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyCacheSubnetGroupResult withCacheSubnetGroup(CacheSubnetGroup cacheSubnetGroup) {
        this.cacheSubnetGroup = cacheSubnetGroup;
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
        if (getCacheSubnetGroup() != null)
            sb.append("CacheSubnetGroup: " + getCacheSubnetGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCacheSubnetGroup() == null) ? 0 : getCacheSubnetGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyCacheSubnetGroupResult == false)
            return false;
        ModifyCacheSubnetGroupResult other = (ModifyCacheSubnetGroupResult) obj;

        if (other.getCacheSubnetGroup() == null ^ this.getCacheSubnetGroup() == null)
            return false;
        if (other.getCacheSubnetGroup() != null
                && other.getCacheSubnetGroup().equals(this.getCacheSubnetGroup()) == false)
            return false;
        return true;
    }
}
