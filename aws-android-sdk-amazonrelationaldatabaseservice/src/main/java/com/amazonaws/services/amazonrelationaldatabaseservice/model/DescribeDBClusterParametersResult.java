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
 * Provides details about a DB cluster parameter group including the parameters
 * in the DB cluster parameter group.
 * </p>
 */
public class DescribeDBClusterParametersResult implements Serializable {
    /**
     * <p>
     * Provides a list of parameters for the DB cluster parameter group.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * An optional pagination token provided by a previous
     * DescribeDBClusterParameters request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Provides a list of parameters for the DB cluster parameter group.
     * </p>
     *
     * @return <p>
     *         Provides a list of parameters for the DB cluster parameter group.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Provides a list of parameters for the DB cluster parameter group.
     * </p>
     *
     * @param parameters <p>
     *            Provides a list of parameters for the DB cluster parameter
     *            group.
     *            </p>
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<Parameter>(parameters);
    }

    /**
     * <p>
     * Provides a list of parameters for the DB cluster parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            Provides a list of parameters for the DB cluster parameter
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterParametersResult withParameters(Parameter... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<Parameter>(parameters.length);
        }
        for (Parameter value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of parameters for the DB cluster parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            Provides a list of parameters for the DB cluster parameter
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterParametersResult withParameters(
            java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * DescribeDBClusterParameters request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     * </p>
     *
     * @return <p>
     *         An optional pagination token provided by a previous
     *         DescribeDBClusterParameters request. If this parameter is
     *         specified, the response includes only records beyond the marker,
     *         up to the value specified by <code>MaxRecords</code> .
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * DescribeDBClusterParameters request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     * </p>
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            DescribeDBClusterParameters request. If this parameter is
     *            specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code> .
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous
     * DescribeDBClusterParameters request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code> .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional pagination token provided by a previous
     *            DescribeDBClusterParameters request. If this parameter is
     *            specified, the response includes only records beyond the
     *            marker, up to the value specified by <code>MaxRecords</code> .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterParametersResult withMarker(String marker) {
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
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterParametersResult == false)
            return false;
        DescribeDBClusterParametersResult other = (DescribeDBClusterParametersResult) obj;

        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
