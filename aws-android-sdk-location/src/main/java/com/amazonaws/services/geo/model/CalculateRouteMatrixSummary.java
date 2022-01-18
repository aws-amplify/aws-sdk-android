/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of the calculated route matrix.
 * </p>
 */
public class CalculateRouteMatrixSummary implements Serializable {
    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the
     * routes. Indicates one of the available providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     */
    private String dataSource;

    /**
     * <p>
     * The unit of measurement for route distances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     */
    private String distanceUnit;

    /**
     * <p>
     * The count of error results in the route matrix. If this number is 0, all
     * routes were calculated successfully.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 160000<br/>
     */
    private Integer errorCount;

    /**
     * <p>
     * The count of cells in the route matrix. Equal to the number of
     * <code>DeparturePositions</code> multiplied by the number of
     * <code>DestinationPositions</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 160000<br/>
     */
    private Integer routeCount;

    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the
     * routes. Indicates one of the available providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     *
     * @return <p>
     *         The data provider of traffic and road network data used to
     *         calculate the routes. Indicates one of the available providers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Esri</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Here</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about data providers, see <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *         >Amazon Location Service data providers</a>.
     *         </p>
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the
     * routes. Indicates one of the available providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     *
     * @param dataSource <p>
     *            The data provider of traffic and road network data used to
     *            calculate the routes. Indicates one of the available
     *            providers:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Esri</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Here</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about data providers, see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *            >Amazon Location Service data providers</a>.
     *            </p>
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the
     * routes. Indicates one of the available providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about data providers, see <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     * >Amazon Location Service data providers</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSource <p>
     *            The data provider of traffic and road network data used to
     *            calculate the routes. Indicates one of the available
     *            providers:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Esri</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Here</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about data providers, see <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html"
     *            >Amazon Location Service data providers</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixSummary withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * The unit of measurement for route distances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @return <p>
     *         The unit of measurement for route distances.
     *         </p>
     * @see DistanceUnit
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * <p>
     * The unit of measurement for route distances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The unit of measurement for route distances.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The unit of measurement for route distances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The unit of measurement for route distances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public CalculateRouteMatrixSummary withDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
        return this;
    }

    /**
     * <p>
     * The unit of measurement for route distances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The unit of measurement for route distances.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
    }

    /**
     * <p>
     * The unit of measurement for route distances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The unit of measurement for route distances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public CalculateRouteMatrixSummary withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The count of error results in the route matrix. If this number is 0, all
     * routes were calculated successfully.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 160000<br/>
     *
     * @return <p>
     *         The count of error results in the route matrix. If this number is
     *         0, all routes were calculated successfully.
     *         </p>
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    /**
     * <p>
     * The count of error results in the route matrix. If this number is 0, all
     * routes were calculated successfully.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 160000<br/>
     *
     * @param errorCount <p>
     *            The count of error results in the route matrix. If this number
     *            is 0, all routes were calculated successfully.
     *            </p>
     */
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * <p>
     * The count of error results in the route matrix. If this number is 0, all
     * routes were calculated successfully.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 160000<br/>
     *
     * @param errorCount <p>
     *            The count of error results in the route matrix. If this number
     *            is 0, all routes were calculated successfully.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixSummary withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * <p>
     * The count of cells in the route matrix. Equal to the number of
     * <code>DeparturePositions</code> multiplied by the number of
     * <code>DestinationPositions</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 160000<br/>
     *
     * @return <p>
     *         The count of cells in the route matrix. Equal to the number of
     *         <code>DeparturePositions</code> multiplied by the number of
     *         <code>DestinationPositions</code>.
     *         </p>
     */
    public Integer getRouteCount() {
        return routeCount;
    }

    /**
     * <p>
     * The count of cells in the route matrix. Equal to the number of
     * <code>DeparturePositions</code> multiplied by the number of
     * <code>DestinationPositions</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 160000<br/>
     *
     * @param routeCount <p>
     *            The count of cells in the route matrix. Equal to the number of
     *            <code>DeparturePositions</code> multiplied by the number of
     *            <code>DestinationPositions</code>.
     *            </p>
     */
    public void setRouteCount(Integer routeCount) {
        this.routeCount = routeCount;
    }

    /**
     * <p>
     * The count of cells in the route matrix. Equal to the number of
     * <code>DeparturePositions</code> multiplied by the number of
     * <code>DestinationPositions</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 160000<br/>
     *
     * @param routeCount <p>
     *            The count of cells in the route matrix. Equal to the number of
     *            <code>DeparturePositions</code> multiplied by the number of
     *            <code>DestinationPositions</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixSummary withRouteCount(Integer routeCount) {
        this.routeCount = routeCount;
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
        if (getDataSource() != null)
            sb.append("DataSource: " + getDataSource() + ",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: " + getDistanceUnit() + ",");
        if (getErrorCount() != null)
            sb.append("ErrorCount: " + getErrorCount() + ",");
        if (getRouteCount() != null)
            sb.append("RouteCount: " + getRouteCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode
                + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode + ((getErrorCount() == null) ? 0 : getErrorCount().hashCode());
        hashCode = prime * hashCode + ((getRouteCount() == null) ? 0 : getRouteCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculateRouteMatrixSummary == false)
            return false;
        CalculateRouteMatrixSummary other = (CalculateRouteMatrixSummary) obj;

        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null
                && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        if (other.getErrorCount() == null ^ this.getErrorCount() == null)
            return false;
        if (other.getErrorCount() != null
                && other.getErrorCount().equals(this.getErrorCount()) == false)
            return false;
        if (other.getRouteCount() == null ^ this.getRouteCount() == null)
            return false;
        if (other.getRouteCount() != null
                && other.getRouteCount().equals(this.getRouteCount()) == false)
            return false;
        return true;
    }
}
