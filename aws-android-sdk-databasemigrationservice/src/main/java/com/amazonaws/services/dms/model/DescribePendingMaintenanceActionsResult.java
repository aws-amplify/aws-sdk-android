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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribePendingMaintenanceActionsResult implements Serializable {
    /**
     * <p>
     * The pending maintenance action.
     * </p>
     */
    private java.util.List<ResourcePendingMaintenanceActions> pendingMaintenanceActions;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The pending maintenance action.
     * </p>
     *
     * @return <p>
     *         The pending maintenance action.
     *         </p>
     */
    public java.util.List<ResourcePendingMaintenanceActions> getPendingMaintenanceActions() {
        return pendingMaintenanceActions;
    }

    /**
     * <p>
     * The pending maintenance action.
     * </p>
     *
     * @param pendingMaintenanceActions <p>
     *            The pending maintenance action.
     *            </p>
     */
    public void setPendingMaintenanceActions(
            java.util.Collection<ResourcePendingMaintenanceActions> pendingMaintenanceActions) {
        if (pendingMaintenanceActions == null) {
            this.pendingMaintenanceActions = null;
            return;
        }

        this.pendingMaintenanceActions = new java.util.ArrayList<ResourcePendingMaintenanceActions>(
                pendingMaintenanceActions);
    }

    /**
     * <p>
     * The pending maintenance action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingMaintenanceActions <p>
     *            The pending maintenance action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePendingMaintenanceActionsResult withPendingMaintenanceActions(
            ResourcePendingMaintenanceActions... pendingMaintenanceActions) {
        if (getPendingMaintenanceActions() == null) {
            this.pendingMaintenanceActions = new java.util.ArrayList<ResourcePendingMaintenanceActions>(
                    pendingMaintenanceActions.length);
        }
        for (ResourcePendingMaintenanceActions value : pendingMaintenanceActions) {
            this.pendingMaintenanceActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The pending maintenance action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingMaintenanceActions <p>
     *            The pending maintenance action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePendingMaintenanceActionsResult withPendingMaintenanceActions(
            java.util.Collection<ResourcePendingMaintenanceActions> pendingMaintenanceActions) {
        setPendingMaintenanceActions(pendingMaintenanceActions);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous request. If
     *         this parameter is specified, the response includes only records
     *         beyond the marker, up to the value specified by
     *         <code>MaxRecords</code>.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous request.
     *            If this parameter is specified, the response includes only
     *            records beyond the marker, up to the value specified by
     *            <code>MaxRecords</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePendingMaintenanceActionsResult withMarker(String marker) {
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
        if (getPendingMaintenanceActions() != null)
            sb.append("PendingMaintenanceActions: " + getPendingMaintenanceActions() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPendingMaintenanceActions() == null) ? 0 : getPendingMaintenanceActions()
                        .hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePendingMaintenanceActionsResult == false)
            return false;
        DescribePendingMaintenanceActionsResult other = (DescribePendingMaintenanceActionsResult) obj;

        if (other.getPendingMaintenanceActions() == null
                ^ this.getPendingMaintenanceActions() == null)
            return false;
        if (other.getPendingMaintenanceActions() != null
                && other.getPendingMaintenanceActions().equals(this.getPendingMaintenanceActions()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
