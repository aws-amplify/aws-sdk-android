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

public class CreateCacheParameterGroupResult implements Serializable {
    /**
     * <p>
     * Represents the output of a <code>CreateCacheParameterGroup</code>
     * operation.
     * </p>
     */
    private CacheParameterGroup cacheParameterGroup;

    /**
     * <p>
     * Represents the output of a <code>CreateCacheParameterGroup</code>
     * operation.
     * </p>
     *
     * @return <p>
     *         Represents the output of a <code>CreateCacheParameterGroup</code>
     *         operation.
     *         </p>
     */
    public CacheParameterGroup getCacheParameterGroup() {
        return cacheParameterGroup;
    }

    /**
     * <p>
     * Represents the output of a <code>CreateCacheParameterGroup</code>
     * operation.
     * </p>
     *
     * @param cacheParameterGroup <p>
     *            Represents the output of a
     *            <code>CreateCacheParameterGroup</code> operation.
     *            </p>
     */
    public void setCacheParameterGroup(CacheParameterGroup cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
    }

    /**
     * <p>
     * Represents the output of a <code>CreateCacheParameterGroup</code>
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroup <p>
     *            Represents the output of a
     *            <code>CreateCacheParameterGroup</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCacheParameterGroupResult withCacheParameterGroup(
            CacheParameterGroup cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
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
        if (getCacheParameterGroup() != null)
            sb.append("CacheParameterGroup: " + getCacheParameterGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCacheParameterGroup() == null) ? 0 : getCacheParameterGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCacheParameterGroupResult == false)
            return false;
        CreateCacheParameterGroupResult other = (CreateCacheParameterGroupResult) obj;

        if (other.getCacheParameterGroup() == null ^ this.getCacheParameterGroup() == null)
            return false;
        if (other.getCacheParameterGroup() != null
                && other.getCacheParameterGroup().equals(this.getCacheParameterGroup()) == false)
            return false;
        return true;
    }
}
