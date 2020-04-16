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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the result of a successful invocation of the
 * <code>DescribeSourceRegions</code> action.
 * </p>
 */
public class DescribeSourceRegionsResult implements Serializable {
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
     * A list of SourceRegion instances that contains each source AWS Region
     * that the current AWS Region can get a read replica or a DB snapshot from.
     * </p>
     */
    private java.util.List<SourceRegion> sourceRegions;

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
    public DescribeSourceRegionsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A list of SourceRegion instances that contains each source AWS Region
     * that the current AWS Region can get a read replica or a DB snapshot from.
     * </p>
     *
     * @return <p>
     *         A list of SourceRegion instances that contains each source AWS
     *         Region that the current AWS Region can get a read replica or a DB
     *         snapshot from.
     *         </p>
     */
    public java.util.List<SourceRegion> getSourceRegions() {
        return sourceRegions;
    }

    /**
     * <p>
     * A list of SourceRegion instances that contains each source AWS Region
     * that the current AWS Region can get a read replica or a DB snapshot from.
     * </p>
     *
     * @param sourceRegions <p>
     *            A list of SourceRegion instances that contains each source AWS
     *            Region that the current AWS Region can get a read replica or a
     *            DB snapshot from.
     *            </p>
     */
    public void setSourceRegions(java.util.Collection<SourceRegion> sourceRegions) {
        if (sourceRegions == null) {
            this.sourceRegions = null;
            return;
        }

        this.sourceRegions = new java.util.ArrayList<SourceRegion>(sourceRegions);
    }

    /**
     * <p>
     * A list of SourceRegion instances that contains each source AWS Region
     * that the current AWS Region can get a read replica or a DB snapshot from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceRegions <p>
     *            A list of SourceRegion instances that contains each source AWS
     *            Region that the current AWS Region can get a read replica or a
     *            DB snapshot from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSourceRegionsResult withSourceRegions(SourceRegion... sourceRegions) {
        if (getSourceRegions() == null) {
            this.sourceRegions = new java.util.ArrayList<SourceRegion>(sourceRegions.length);
        }
        for (SourceRegion value : sourceRegions) {
            this.sourceRegions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of SourceRegion instances that contains each source AWS Region
     * that the current AWS Region can get a read replica or a DB snapshot from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceRegions <p>
     *            A list of SourceRegion instances that contains each source AWS
     *            Region that the current AWS Region can get a read replica or a
     *            DB snapshot from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSourceRegionsResult withSourceRegions(
            java.util.Collection<SourceRegion> sourceRegions) {
        setSourceRegions(sourceRegions);
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
        if (getSourceRegions() != null)
            sb.append("SourceRegions: " + getSourceRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getSourceRegions() == null) ? 0 : getSourceRegions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSourceRegionsResult == false)
            return false;
        DescribeSourceRegionsResult other = (DescribeSourceRegionsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getSourceRegions() == null ^ this.getSourceRegions() == null)
            return false;
        if (other.getSourceRegions() != null
                && other.getSourceRegions().equals(this.getSourceRegions()) == false)
            return false;
        return true;
    }
}
