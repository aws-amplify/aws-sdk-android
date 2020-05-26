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
 * Represents the output of a <code>DescribeCacheSubnetGroups</code> operation.
 * </p>
 */
public class DescribeCacheSubnetGroupsResult implements Serializable {
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of cache subnet groups. Each element in the list contains detailed
     * information about one group.
     * </p>
     */
    private java.util.List<CacheSubnetGroup> cacheSubnetGroups;

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
    public DescribeCacheSubnetGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of cache subnet groups. Each element in the list contains detailed
     * information about one group.
     * </p>
     *
     * @return <p>
     *         A list of cache subnet groups. Each element in the list contains
     *         detailed information about one group.
     *         </p>
     */
    public java.util.List<CacheSubnetGroup> getCacheSubnetGroups() {
        return cacheSubnetGroups;
    }

    /**
     * <p>
     * A list of cache subnet groups. Each element in the list contains detailed
     * information about one group.
     * </p>
     *
     * @param cacheSubnetGroups <p>
     *            A list of cache subnet groups. Each element in the list
     *            contains detailed information about one group.
     *            </p>
     */
    public void setCacheSubnetGroups(java.util.Collection<CacheSubnetGroup> cacheSubnetGroups) {
        if (cacheSubnetGroups == null) {
            this.cacheSubnetGroups = null;
            return;
        }

        this.cacheSubnetGroups = new java.util.ArrayList<CacheSubnetGroup>(cacheSubnetGroups);
    }

    /**
     * <p>
     * A list of cache subnet groups. Each element in the list contains detailed
     * information about one group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSubnetGroups <p>
     *            A list of cache subnet groups. Each element in the list
     *            contains detailed information about one group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheSubnetGroupsResult withCacheSubnetGroups(
            CacheSubnetGroup... cacheSubnetGroups) {
        if (getCacheSubnetGroups() == null) {
            this.cacheSubnetGroups = new java.util.ArrayList<CacheSubnetGroup>(
                    cacheSubnetGroups.length);
        }
        for (CacheSubnetGroup value : cacheSubnetGroups) {
            this.cacheSubnetGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache subnet groups. Each element in the list contains detailed
     * information about one group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSubnetGroups <p>
     *            A list of cache subnet groups. Each element in the list
     *            contains detailed information about one group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheSubnetGroupsResult withCacheSubnetGroups(
            java.util.Collection<CacheSubnetGroup> cacheSubnetGroups) {
        setCacheSubnetGroups(cacheSubnetGroups);
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
        if (getCacheSubnetGroups() != null)
            sb.append("CacheSubnetGroups: " + getCacheSubnetGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getCacheSubnetGroups() == null) ? 0 : getCacheSubnetGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheSubnetGroupsResult == false)
            return false;
        DescribeCacheSubnetGroupsResult other = (DescribeCacheSubnetGroupsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getCacheSubnetGroups() == null ^ this.getCacheSubnetGroups() == null)
            return false;
        if (other.getCacheSubnetGroups() != null
                && other.getCacheSubnetGroups().equals(this.getCacheSubnetGroups()) == false)
            return false;
        return true;
    }
}
