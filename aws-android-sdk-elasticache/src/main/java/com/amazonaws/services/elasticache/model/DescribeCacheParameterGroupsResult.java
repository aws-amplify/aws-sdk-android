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
 * Represents the output of a <code>DescribeCacheParameterGroups</code>
 * operation.
 * </p>
 */
public class DescribeCacheParameterGroupsResult implements Serializable {
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of cache parameter groups. Each element in the list contains
     * detailed information about one cache parameter group.
     * </p>
     */
    private java.util.List<CacheParameterGroup> cacheParameterGroups;

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     *
     * @return <p>
     *         Provides an identifier to allow retrieval of paginated results.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     *
     * @param marker <p>
     *            Provides an identifier to allow retrieval of paginated
     *            results.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            Provides an identifier to allow retrieval of paginated
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheParameterGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of cache parameter groups. Each element in the list contains
     * detailed information about one cache parameter group.
     * </p>
     *
     * @return <p>
     *         A list of cache parameter groups. Each element in the list
     *         contains detailed information about one cache parameter group.
     *         </p>
     */
    public java.util.List<CacheParameterGroup> getCacheParameterGroups() {
        return cacheParameterGroups;
    }

    /**
     * <p>
     * A list of cache parameter groups. Each element in the list contains
     * detailed information about one cache parameter group.
     * </p>
     *
     * @param cacheParameterGroups <p>
     *            A list of cache parameter groups. Each element in the list
     *            contains detailed information about one cache parameter group.
     *            </p>
     */
    public void setCacheParameterGroups(
            java.util.Collection<CacheParameterGroup> cacheParameterGroups) {
        if (cacheParameterGroups == null) {
            this.cacheParameterGroups = null;
            return;
        }

        this.cacheParameterGroups = new java.util.ArrayList<CacheParameterGroup>(
                cacheParameterGroups);
    }

    /**
     * <p>
     * A list of cache parameter groups. Each element in the list contains
     * detailed information about one cache parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroups <p>
     *            A list of cache parameter groups. Each element in the list
     *            contains detailed information about one cache parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheParameterGroupsResult withCacheParameterGroups(
            CacheParameterGroup... cacheParameterGroups) {
        if (getCacheParameterGroups() == null) {
            this.cacheParameterGroups = new java.util.ArrayList<CacheParameterGroup>(
                    cacheParameterGroups.length);
        }
        for (CacheParameterGroup value : cacheParameterGroups) {
            this.cacheParameterGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache parameter groups. Each element in the list contains
     * detailed information about one cache parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheParameterGroups <p>
     *            A list of cache parameter groups. Each element in the list
     *            contains detailed information about one cache parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheParameterGroupsResult withCacheParameterGroups(
            java.util.Collection<CacheParameterGroup> cacheParameterGroups) {
        setCacheParameterGroups(cacheParameterGroups);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getCacheParameterGroups() != null)
            sb.append("CacheParameterGroups: " + getCacheParameterGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getCacheParameterGroups() == null) ? 0 : getCacheParameterGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheParameterGroupsResult == false)
            return false;
        DescribeCacheParameterGroupsResult other = (DescribeCacheParameterGroupsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getCacheParameterGroups() == null ^ this.getCacheParameterGroups() == null)
            return false;
        if (other.getCacheParameterGroups() != null
                && other.getCacheParameterGroups().equals(this.getCacheParameterGroups()) == false)
            return false;
        return true;
    }
}
