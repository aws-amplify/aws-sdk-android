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
 * A summary of the calculated route.
 * </p>
 */
public class CalculateRouteSummary implements Serializable {
    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the
     * route. Indicates one of the available providers:
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
     * The total distance covered by the route. The sum of the distance
     * travelled between every stop on the route.
     * </p>
     * <note>
     * <p>
     * If Esri is the data source for the route calculator, the route distance
     * can’t be greater than 400 km. If the route exceeds 400 km, the response
     * is a <code>400 RoutesValidationException</code> error.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double distance;

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
     * The total travel time for the route measured in seconds. The sum of the
     * travel time between every stop on the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double durationSeconds;

    /**
     * <p>
     * Specifies a geographical box surrounding a route. Used to zoom into a
     * route when displaying it in a map. For example,
     * <code>[min x, min y, max x, max y]</code>.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The next 2 <code>bbox</code> parameters describe the upper northeast
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or latitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Double> routeBBox;

    /**
     * <p>
     * The data provider of traffic and road network data used to calculate the
     * route. Indicates one of the available providers:
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
     *         calculate the route. Indicates one of the available providers:
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
     * route. Indicates one of the available providers:
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
     *            calculate the route. Indicates one of the available providers:
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
     * route. Indicates one of the available providers:
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
     *            calculate the route. Indicates one of the available providers:
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
    public CalculateRouteSummary withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * The total distance covered by the route. The sum of the distance
     * travelled between every stop on the route.
     * </p>
     * <note>
     * <p>
     * If Esri is the data source for the route calculator, the route distance
     * can’t be greater than 400 km. If the route exceeds 400 km, the response
     * is a <code>400 RoutesValidationException</code> error.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total distance covered by the route. The sum of the distance
     *         travelled between every stop on the route.
     *         </p>
     *         <note>
     *         <p>
     *         If Esri is the data source for the route calculator, the route
     *         distance can’t be greater than 400 km. If the route exceeds 400
     *         km, the response is a <code>400 RoutesValidationException</code>
     *         error.
     *         </p>
     *         </note>
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * <p>
     * The total distance covered by the route. The sum of the distance
     * travelled between every stop on the route.
     * </p>
     * <note>
     * <p>
     * If Esri is the data source for the route calculator, the route distance
     * can’t be greater than 400 km. If the route exceeds 400 km, the response
     * is a <code>400 RoutesValidationException</code> error.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param distance <p>
     *            The total distance covered by the route. The sum of the
     *            distance travelled between every stop on the route.
     *            </p>
     *            <note>
     *            <p>
     *            If Esri is the data source for the route calculator, the route
     *            distance can’t be greater than 400 km. If the route exceeds
     *            400 km, the response is a
     *            <code>400 RoutesValidationException</code> error.
     *            </p>
     *            </note>
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * <p>
     * The total distance covered by the route. The sum of the distance
     * travelled between every stop on the route.
     * </p>
     * <note>
     * <p>
     * If Esri is the data source for the route calculator, the route distance
     * can’t be greater than 400 km. If the route exceeds 400 km, the response
     * is a <code>400 RoutesValidationException</code> error.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param distance <p>
     *            The total distance covered by the route. The sum of the
     *            distance travelled between every stop on the route.
     *            </p>
     *            <note>
     *            <p>
     *            If Esri is the data source for the route calculator, the route
     *            distance can’t be greater than 400 km. If the route exceeds
     *            400 km, the response is a
     *            <code>400 RoutesValidationException</code> error.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteSummary withDistance(Double distance) {
        this.distance = distance;
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
    public CalculateRouteSummary withDistanceUnit(String distanceUnit) {
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
    public CalculateRouteSummary withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The total travel time for the route measured in seconds. The sum of the
     * travel time between every stop on the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total travel time for the route measured in seconds. The sum
     *         of the travel time between every stop on the route.
     *         </p>
     */
    public Double getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * The total travel time for the route measured in seconds. The sum of the
     * travel time between every stop on the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationSeconds <p>
     *            The total travel time for the route measured in seconds. The
     *            sum of the travel time between every stop on the route.
     *            </p>
     */
    public void setDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The total travel time for the route measured in seconds. The sum of the
     * travel time between every stop on the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationSeconds <p>
     *            The total travel time for the route measured in seconds. The
     *            sum of the travel time between every stop on the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteSummary withDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * <p>
     * Specifies a geographical box surrounding a route. Used to zoom into a
     * route when displaying it in a map. For example,
     * <code>[min x, min y, max x, max y]</code>.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The next 2 <code>bbox</code> parameters describe the upper northeast
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or latitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies a geographical box surrounding a route. Used to zoom
     *         into a route when displaying it in a map. For example,
     *         <code>[min x, min y, max x, max y]</code>.
     *         </p>
     *         <p>
     *         The first 2 <code>bbox</code> parameters describe the lower
     *         southwest corner:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The first <code>bbox</code> position is the X coordinate or
     *         longitude of the lower southwest corner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The second <code>bbox</code> position is the Y coordinate or
     *         latitude of the lower southwest corner.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The next 2 <code>bbox</code> parameters describe the upper
     *         northeast corner:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The third <code>bbox</code> position is the X coordinate, or
     *         longitude of the upper northeast corner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The fourth <code>bbox</code> position is the Y coordinate, or
     *         latitude of the upper northeast corner.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Double> getRouteBBox() {
        return routeBBox;
    }

    /**
     * <p>
     * Specifies a geographical box surrounding a route. Used to zoom into a
     * route when displaying it in a map. For example,
     * <code>[min x, min y, max x, max y]</code>.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The next 2 <code>bbox</code> parameters describe the upper northeast
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or latitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     *
     * @param routeBBox <p>
     *            Specifies a geographical box surrounding a route. Used to zoom
     *            into a route when displaying it in a map. For example,
     *            <code>[min x, min y, max x, max y]</code>.
     *            </p>
     *            <p>
     *            The first 2 <code>bbox</code> parameters describe the lower
     *            southwest corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first <code>bbox</code> position is the X coordinate or
     *            longitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second <code>bbox</code> position is the Y coordinate or
     *            latitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The next 2 <code>bbox</code> parameters describe the upper
     *            northeast corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The third <code>bbox</code> position is the X coordinate, or
     *            longitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The fourth <code>bbox</code> position is the Y coordinate, or
     *            latitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRouteBBox(java.util.Collection<Double> routeBBox) {
        if (routeBBox == null) {
            this.routeBBox = null;
            return;
        }

        this.routeBBox = new java.util.ArrayList<Double>(routeBBox);
    }

    /**
     * <p>
     * Specifies a geographical box surrounding a route. Used to zoom into a
     * route when displaying it in a map. For example,
     * <code>[min x, min y, max x, max y]</code>.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The next 2 <code>bbox</code> parameters describe the upper northeast
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or latitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeBBox <p>
     *            Specifies a geographical box surrounding a route. Used to zoom
     *            into a route when displaying it in a map. For example,
     *            <code>[min x, min y, max x, max y]</code>.
     *            </p>
     *            <p>
     *            The first 2 <code>bbox</code> parameters describe the lower
     *            southwest corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first <code>bbox</code> position is the X coordinate or
     *            longitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second <code>bbox</code> position is the Y coordinate or
     *            latitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The next 2 <code>bbox</code> parameters describe the upper
     *            northeast corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The third <code>bbox</code> position is the X coordinate, or
     *            longitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The fourth <code>bbox</code> position is the Y coordinate, or
     *            latitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteSummary withRouteBBox(Double... routeBBox) {
        if (getRouteBBox() == null) {
            this.routeBBox = new java.util.ArrayList<Double>(routeBBox.length);
        }
        for (Double value : routeBBox) {
            this.routeBBox.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a geographical box surrounding a route. Used to zoom into a
     * route when displaying it in a map. For example,
     * <code>[min x, min y, max x, max y]</code>.
     * </p>
     * <p>
     * The first 2 <code>bbox</code> parameters describe the lower southwest
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first <code>bbox</code> position is the X coordinate or longitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second <code>bbox</code> position is the Y coordinate or latitude of
     * the lower southwest corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The next 2 <code>bbox</code> parameters describe the upper northeast
     * corner:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The third <code>bbox</code> position is the X coordinate, or longitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * <li>
     * <p>
     * The fourth <code>bbox</code> position is the Y coordinate, or latitude of
     * the upper northeast corner.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeBBox <p>
     *            Specifies a geographical box surrounding a route. Used to zoom
     *            into a route when displaying it in a map. For example,
     *            <code>[min x, min y, max x, max y]</code>.
     *            </p>
     *            <p>
     *            The first 2 <code>bbox</code> parameters describe the lower
     *            southwest corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first <code>bbox</code> position is the X coordinate or
     *            longitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second <code>bbox</code> position is the Y coordinate or
     *            latitude of the lower southwest corner.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The next 2 <code>bbox</code> parameters describe the upper
     *            northeast corner:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The third <code>bbox</code> position is the X coordinate, or
     *            longitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The fourth <code>bbox</code> position is the Y coordinate, or
     *            latitude of the upper northeast corner.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteSummary withRouteBBox(java.util.Collection<Double> routeBBox) {
        setRouteBBox(routeBBox);
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
        if (getDistance() != null)
            sb.append("Distance: " + getDistance() + ",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: " + getDistanceUnit() + ",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds() + ",");
        if (getRouteBBox() != null)
            sb.append("RouteBBox: " + getRouteBBox());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getDistance() == null) ? 0 : getDistance().hashCode());
        hashCode = prime * hashCode
                + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getRouteBBox() == null) ? 0 : getRouteBBox().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculateRouteSummary == false)
            return false;
        CalculateRouteSummary other = (CalculateRouteSummary) obj;

        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDistance() == null ^ this.getDistance() == null)
            return false;
        if (other.getDistance() != null && other.getDistance().equals(this.getDistance()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null
                && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getRouteBBox() == null ^ this.getRouteBBox() == null)
            return false;
        if (other.getRouteBBox() != null
                && other.getRouteBBox().equals(this.getRouteBBox()) == false)
            return false;
        return true;
    }
}
