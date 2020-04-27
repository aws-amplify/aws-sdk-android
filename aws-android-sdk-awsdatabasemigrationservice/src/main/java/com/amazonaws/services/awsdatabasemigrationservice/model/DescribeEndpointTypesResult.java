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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DescribeEndpointTypesResult implements Serializable {
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
     * The types of endpoints that are supported.
     * </p>
     */
    private java.util.List<SupportedEndpointType> supportedEndpointTypes;

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
    public DescribeEndpointTypesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The types of endpoints that are supported.
     * </p>
     *
     * @return <p>
     *         The types of endpoints that are supported.
     *         </p>
     */
    public java.util.List<SupportedEndpointType> getSupportedEndpointTypes() {
        return supportedEndpointTypes;
    }

    /**
     * <p>
     * The types of endpoints that are supported.
     * </p>
     *
     * @param supportedEndpointTypes <p>
     *            The types of endpoints that are supported.
     *            </p>
     */
    public void setSupportedEndpointTypes(
            java.util.Collection<SupportedEndpointType> supportedEndpointTypes) {
        if (supportedEndpointTypes == null) {
            this.supportedEndpointTypes = null;
            return;
        }

        this.supportedEndpointTypes = new java.util.ArrayList<SupportedEndpointType>(
                supportedEndpointTypes);
    }

    /**
     * <p>
     * The types of endpoints that are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedEndpointTypes <p>
     *            The types of endpoints that are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointTypesResult withSupportedEndpointTypes(
            SupportedEndpointType... supportedEndpointTypes) {
        if (getSupportedEndpointTypes() == null) {
            this.supportedEndpointTypes = new java.util.ArrayList<SupportedEndpointType>(
                    supportedEndpointTypes.length);
        }
        for (SupportedEndpointType value : supportedEndpointTypes) {
            this.supportedEndpointTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The types of endpoints that are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedEndpointTypes <p>
     *            The types of endpoints that are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEndpointTypesResult withSupportedEndpointTypes(
            java.util.Collection<SupportedEndpointType> supportedEndpointTypes) {
        setSupportedEndpointTypes(supportedEndpointTypes);
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
        if (getSupportedEndpointTypes() != null)
            sb.append("SupportedEndpointTypes: " + getSupportedEndpointTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedEndpointTypes() == null) ? 0 : getSupportedEndpointTypes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointTypesResult == false)
            return false;
        DescribeEndpointTypesResult other = (DescribeEndpointTypesResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getSupportedEndpointTypes() == null ^ this.getSupportedEndpointTypes() == null)
            return false;
        if (other.getSupportedEndpointTypes() != null
                && other.getSupportedEndpointTypes().equals(this.getSupportedEndpointTypes()) == false)
            return false;
        return true;
    }
}
