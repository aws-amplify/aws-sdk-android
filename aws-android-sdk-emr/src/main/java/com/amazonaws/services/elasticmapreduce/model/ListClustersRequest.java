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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides the status of all clusters visible to this AWS account. Allows you
 * to filter the list of clusters based on certain criteria; for example,
 * filtering by cluster creation date and time or by status. This call returns a
 * maximum of 50 clusters per call, but returns a marker to track the paging of
 * the cluster list across multiple ListClusters calls.
 * </p>
 */
public class ListClustersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The creation date and time beginning value filter for listing clusters.
     * </p>
     */
    private java.util.Date createdAfter;

    /**
     * <p>
     * The creation date and time end value filter for listing clusters.
     * </p>
     */
    private java.util.Date createdBefore;

    /**
     * <p>
     * The cluster state filters to apply when listing clusters.
     * </p>
     */
    private java.util.List<String> clusterStates;

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The creation date and time beginning value filter for listing clusters.
     * </p>
     *
     * @return <p>
     *         The creation date and time beginning value filter for listing
     *         clusters.
     *         </p>
     */
    public java.util.Date getCreatedAfter() {
        return createdAfter;
    }

    /**
     * <p>
     * The creation date and time beginning value filter for listing clusters.
     * </p>
     *
     * @param createdAfter <p>
     *            The creation date and time beginning value filter for listing
     *            clusters.
     *            </p>
     */
    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * The creation date and time beginning value filter for listing clusters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAfter <p>
     *            The creation date and time beginning value filter for listing
     *            clusters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersRequest withCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }

    /**
     * <p>
     * The creation date and time end value filter for listing clusters.
     * </p>
     *
     * @return <p>
     *         The creation date and time end value filter for listing clusters.
     *         </p>
     */
    public java.util.Date getCreatedBefore() {
        return createdBefore;
    }

    /**
     * <p>
     * The creation date and time end value filter for listing clusters.
     * </p>
     *
     * @param createdBefore <p>
     *            The creation date and time end value filter for listing
     *            clusters.
     *            </p>
     */
    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * The creation date and time end value filter for listing clusters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBefore <p>
     *            The creation date and time end value filter for listing
     *            clusters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersRequest withCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }

    /**
     * <p>
     * The cluster state filters to apply when listing clusters.
     * </p>
     *
     * @return <p>
     *         The cluster state filters to apply when listing clusters.
     *         </p>
     */
    public java.util.List<String> getClusterStates() {
        return clusterStates;
    }

    /**
     * <p>
     * The cluster state filters to apply when listing clusters.
     * </p>
     *
     * @param clusterStates <p>
     *            The cluster state filters to apply when listing clusters.
     *            </p>
     */
    public void setClusterStates(java.util.Collection<String> clusterStates) {
        if (clusterStates == null) {
            this.clusterStates = null;
            return;
        }

        this.clusterStates = new java.util.ArrayList<String>(clusterStates);
    }

    /**
     * <p>
     * The cluster state filters to apply when listing clusters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterStates <p>
     *            The cluster state filters to apply when listing clusters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersRequest withClusterStates(String... clusterStates) {
        if (getClusterStates() == null) {
            this.clusterStates = new java.util.ArrayList<String>(clusterStates.length);
        }
        for (String value : clusterStates) {
            this.clusterStates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The cluster state filters to apply when listing clusters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterStates <p>
     *            The cluster state filters to apply when listing clusters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersRequest withClusterStates(java.util.Collection<String> clusterStates) {
        setClusterStates(clusterStates);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     *
     * @return <p>
     *         The pagination token that indicates the next set of results to
     *         retrieve.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     *
     * @param marker <p>
     *            The pagination token that indicates the next set of results to
     *            retrieve.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            The pagination token that indicates the next set of results to
     *            retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: " + getCreatedAfter() + ",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: " + getCreatedBefore() + ",");
        if (getClusterStates() != null)
            sb.append("ClusterStates: " + getClusterStates() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode
                + ((getClusterStates() == null) ? 0 : getClusterStates().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClustersRequest == false)
            return false;
        ListClustersRequest other = (ListClustersRequest) obj;

        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null
                && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null
                && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getClusterStates() == null ^ this.getClusterStates() == null)
            return false;
        if (other.getClusterStates() != null
                && other.getClusterStates().equals(this.getClusterStates()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
