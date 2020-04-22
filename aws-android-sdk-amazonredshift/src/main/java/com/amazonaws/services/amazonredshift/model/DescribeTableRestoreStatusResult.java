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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeTableRestoreStatusResult implements Serializable {
    /**
     * <p>
     * A list of status details for one or more table restore requests.
     * </p>
     */
    private java.util.List<TableRestoreStatus> tableRestoreStatusDetails;

    /**
     * <p>
     * A pagination token that can be used in a subsequent
     * <a>DescribeTableRestoreStatus</a> request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of status details for one or more table restore requests.
     * </p>
     *
     * @return <p>
     *         A list of status details for one or more table restore requests.
     *         </p>
     */
    public java.util.List<TableRestoreStatus> getTableRestoreStatusDetails() {
        return tableRestoreStatusDetails;
    }

    /**
     * <p>
     * A list of status details for one or more table restore requests.
     * </p>
     *
     * @param tableRestoreStatusDetails <p>
     *            A list of status details for one or more table restore
     *            requests.
     *            </p>
     */
    public void setTableRestoreStatusDetails(
            java.util.Collection<TableRestoreStatus> tableRestoreStatusDetails) {
        if (tableRestoreStatusDetails == null) {
            this.tableRestoreStatusDetails = null;
            return;
        }

        this.tableRestoreStatusDetails = new java.util.ArrayList<TableRestoreStatus>(
                tableRestoreStatusDetails);
    }

    /**
     * <p>
     * A list of status details for one or more table restore requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableRestoreStatusDetails <p>
     *            A list of status details for one or more table restore
     *            requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTableRestoreStatusResult withTableRestoreStatusDetails(
            TableRestoreStatus... tableRestoreStatusDetails) {
        if (getTableRestoreStatusDetails() == null) {
            this.tableRestoreStatusDetails = new java.util.ArrayList<TableRestoreStatus>(
                    tableRestoreStatusDetails.length);
        }
        for (TableRestoreStatus value : tableRestoreStatusDetails) {
            this.tableRestoreStatusDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of status details for one or more table restore requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableRestoreStatusDetails <p>
     *            A list of status details for one or more table restore
     *            requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTableRestoreStatusResult withTableRestoreStatusDetails(
            java.util.Collection<TableRestoreStatus> tableRestoreStatusDetails) {
        setTableRestoreStatusDetails(tableRestoreStatusDetails);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent
     * <a>DescribeTableRestoreStatus</a> request.
     * </p>
     *
     * @return <p>
     *         A pagination token that can be used in a subsequent
     *         <a>DescribeTableRestoreStatus</a> request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent
     * <a>DescribeTableRestoreStatus</a> request.
     * </p>
     *
     * @param marker <p>
     *            A pagination token that can be used in a subsequent
     *            <a>DescribeTableRestoreStatus</a> request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a subsequent
     * <a>DescribeTableRestoreStatus</a> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A pagination token that can be used in a subsequent
     *            <a>DescribeTableRestoreStatus</a> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTableRestoreStatusResult withMarker(String marker) {
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
        if (getTableRestoreStatusDetails() != null)
            sb.append("TableRestoreStatusDetails: " + getTableRestoreStatusDetails() + ",");
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
                + ((getTableRestoreStatusDetails() == null) ? 0 : getTableRestoreStatusDetails()
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

        if (obj instanceof DescribeTableRestoreStatusResult == false)
            return false;
        DescribeTableRestoreStatusResult other = (DescribeTableRestoreStatusResult) obj;

        if (other.getTableRestoreStatusDetails() == null
                ^ this.getTableRestoreStatusDetails() == null)
            return false;
        if (other.getTableRestoreStatusDetails() != null
                && other.getTableRestoreStatusDetails().equals(this.getTableRestoreStatusDetails()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
