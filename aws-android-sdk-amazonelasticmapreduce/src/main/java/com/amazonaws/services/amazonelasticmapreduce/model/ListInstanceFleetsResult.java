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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

public class ListInstanceFleetsResult implements Serializable {
    /**
     * <p>
     * The list of instance fleets for the cluster and given filters.
     * </p>
     */
    private java.util.List<InstanceFleet> instanceFleets;

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of instance fleets for the cluster and given filters.
     * </p>
     *
     * @return <p>
     *         The list of instance fleets for the cluster and given filters.
     *         </p>
     */
    public java.util.List<InstanceFleet> getInstanceFleets() {
        return instanceFleets;
    }

    /**
     * <p>
     * The list of instance fleets for the cluster and given filters.
     * </p>
     *
     * @param instanceFleets <p>
     *            The list of instance fleets for the cluster and given filters.
     *            </p>
     */
    public void setInstanceFleets(java.util.Collection<InstanceFleet> instanceFleets) {
        if (instanceFleets == null) {
            this.instanceFleets = null;
            return;
        }

        this.instanceFleets = new java.util.ArrayList<InstanceFleet>(instanceFleets);
    }

    /**
     * <p>
     * The list of instance fleets for the cluster and given filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFleets <p>
     *            The list of instance fleets for the cluster and given filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstanceFleetsResult withInstanceFleets(InstanceFleet... instanceFleets) {
        if (getInstanceFleets() == null) {
            this.instanceFleets = new java.util.ArrayList<InstanceFleet>(instanceFleets.length);
        }
        for (InstanceFleet value : instanceFleets) {
            this.instanceFleets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of instance fleets for the cluster and given filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFleets <p>
     *            The list of instance fleets for the cluster and given filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstanceFleetsResult withInstanceFleets(
            java.util.Collection<InstanceFleet> instanceFleets) {
        setInstanceFleets(instanceFleets);
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
    public ListInstanceFleetsResult withMarker(String marker) {
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
        if (getInstanceFleets() != null)
            sb.append("InstanceFleets: " + getInstanceFleets() + ",");
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
                + ((getInstanceFleets() == null) ? 0 : getInstanceFleets().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInstanceFleetsResult == false)
            return false;
        ListInstanceFleetsResult other = (ListInstanceFleetsResult) obj;

        if (other.getInstanceFleets() == null ^ this.getInstanceFleets() == null)
            return false;
        if (other.getInstanceFleets() != null
                && other.getInstanceFleets().equals(this.getInstanceFleets()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
