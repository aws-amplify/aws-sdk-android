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
 * Represents the output of a <code>DescribeCacheClusters</code> operation.
 * </p>
 */
public class DescribeCacheClustersResult implements Serializable {
    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of clusters. Each item in the list contains detailed information
     * about one cluster.
     * </p>
     */
    private java.util.List<CacheCluster> cacheClusters;

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
    public DescribeCacheClustersResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of clusters. Each item in the list contains detailed information
     * about one cluster.
     * </p>
     *
     * @return <p>
     *         A list of clusters. Each item in the list contains detailed
     *         information about one cluster.
     *         </p>
     */
    public java.util.List<CacheCluster> getCacheClusters() {
        return cacheClusters;
    }

    /**
     * <p>
     * A list of clusters. Each item in the list contains detailed information
     * about one cluster.
     * </p>
     *
     * @param cacheClusters <p>
     *            A list of clusters. Each item in the list contains detailed
     *            information about one cluster.
     *            </p>
     */
    public void setCacheClusters(java.util.Collection<CacheCluster> cacheClusters) {
        if (cacheClusters == null) {
            this.cacheClusters = null;
            return;
        }

        this.cacheClusters = new java.util.ArrayList<CacheCluster>(cacheClusters);
    }

    /**
     * <p>
     * A list of clusters. Each item in the list contains detailed information
     * about one cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusters <p>
     *            A list of clusters. Each item in the list contains detailed
     *            information about one cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheClustersResult withCacheClusters(CacheCluster... cacheClusters) {
        if (getCacheClusters() == null) {
            this.cacheClusters = new java.util.ArrayList<CacheCluster>(cacheClusters.length);
        }
        for (CacheCluster value : cacheClusters) {
            this.cacheClusters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of clusters. Each item in the list contains detailed information
     * about one cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusters <p>
     *            A list of clusters. Each item in the list contains detailed
     *            information about one cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCacheClustersResult withCacheClusters(
            java.util.Collection<CacheCluster> cacheClusters) {
        setCacheClusters(cacheClusters);
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
        if (getCacheClusters() != null)
            sb.append("CacheClusters: " + getCacheClusters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getCacheClusters() == null) ? 0 : getCacheClusters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheClustersResult == false)
            return false;
        DescribeCacheClustersResult other = (DescribeCacheClustersResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getCacheClusters() == null ^ this.getCacheClusters() == null)
            return false;
        if (other.getCacheClusters() != null
                && other.getCacheClusters().equals(this.getCacheClusters()) == false)
            return false;
        return true;
    }
}
