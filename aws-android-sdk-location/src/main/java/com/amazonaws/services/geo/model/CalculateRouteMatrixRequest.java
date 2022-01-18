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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html"
 * > Calculates a route matrix</a> given the following required parameters:
 * <code>DeparturePositions</code> and <code>DestinationPositions</code>.
 * <code>CalculateRouteMatrix</code> calculates routes and returns the travel
 * time and travel distance from each departure position to each destination
 * position in the request. For example, given departure positions A and B, and
 * destination positions X and Y, <code>CalculateRouteMatrix</code> will return
 * time and distance for routes from A to X, A to Y, B to X, and B to Y (in that
 * order). The number of results returned (and routes calculated) will be the
 * number of <code>DeparturePositions</code> times the number of
 * <code>DestinationPositions</code>.
 * </p>
 * <note>
 * <p>
 * Your account is charged for each route calculated, not the number of
 * requests.
 * </p>
 * </note>
 * <p>
 * Requires that you first <a href=
 * "https://docs.aws.amazon.com/location-routes/latest/APIReference/API_CreateRouteCalculator.html"
 * >create a route calculator resource</a>.
 * </p>
 * <p>
 * By default, a request that doesn't specify a departure time uses the best
 * time of day to travel with the best traffic conditions when calculating
 * routes.
 * </p>
 * <p>
 * Additional options include:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/location/latest/developerguide/departure-time.html"
 * > Specifying a departure time</a> using either <code>DepartureTime</code> or
 * <code>DepartNow</code>. This calculates routes based on predictive traffic
 * data at the given time.
 * </p>
 * <note>
 * <p>
 * You can't specify both <code>DepartureTime</code> and <code>DepartNow</code>
 * in a single request. Specifying both parameters returns a validation error.
 * </p>
 * </note></li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/location/latest/developerguide/travel-mode.html"
 * >Specifying a travel mode</a> using TravelMode sets the transportation mode
 * used to calculate the routes. This also lets you specify additional route
 * preferences in <code>CarModeOptions</code> if traveling by <code>Car</code>,
 * or <code>TruckModeOptions</code> if traveling by <code>Truck</code>.
 * </p>
 * </li>
 * </ul>
 */
public class CalculateRouteMatrixRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the route calculator resource that you want to use to
     * calculate the route matrix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String calculatorName;

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Car</code>, such as
     * avoiding routes that use ferries or tolls.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as
     * <code>Car</code>.
     * </p>
     */
    private CalculateRouteCarModeOptions carModeOptions;

    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to
     * calculate the route matrix. You can't set both <code>DepartureTime</code>
     * and <code>DepartNow</code>. If neither is set, the best time of day to
     * travel with the best traffic conditions is used to calculate the route
     * matrix.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     */
    private Boolean departNow;

    /**
     * <p>
     * The list of departure (origin) positions for the route matrix. An array
     * of points, each of which is itself a 2-value array defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[longitude, latitude]</code>. For example,
     * <code>[-123.115, 49.285]</code>.
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource
     * there may be additional restrictions on the inputs you can choose. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify
     * a departure that's not located on a road, Amazon Location <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * > moves the position to the nearest road</a>. The snapped value is
     * available in the result in <code>SnappedDeparturePositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     */
    private java.util.List<java.util.List<Double>> departurePositions;

    /**
     * <p>
     * Specifies the desired time of departure. Uses the given time to calculate
     * the route matrix. You can't set both <code>DepartureTime</code> and
     * <code>DepartNow</code>. If neither is set, the best time of day to travel
     * with the best traffic conditions is used to calculate the route matrix.
     * </p>
     * <note>
     * <p>
     * Setting a departure time in the past returns a
     * <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For example,
     * <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date departureTime;

    /**
     * <p>
     * The list of destination positions for the route matrix. An array of
     * points, each of which is itself a 2-value array defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[longitude, latitude]</code>. For example,
     * <code>[-122.339, 47.615]</code>
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource
     * there may be additional restrictions on the inputs you can choose. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify
     * a destination that's not located on a road, Amazon Location <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * > moves the position to the nearest road</a>. The snapped value is
     * available in the result in <code>SnappedDestinationPositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     */
    private java.util.List<java.util.List<Double>> destinationPositions;

    /**
     * <p>
     * Set the unit system to specify the distance.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     */
    private String distanceUnit;

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in
     * estimating the speed of travel and road compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify also determines how you specify
     * route preferences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If traveling by <code>Car</code> use the <code>CarModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If traveling by <code>Truck</code> use the <code>TruckModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default Value: <code>Car</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Car, Truck, Walking
     */
    private String travelMode;

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Truck</code>, such as
     * avoiding routes that use ferries or tolls, and truck specifications to
     * consider when choosing an optimal road.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as
     * <code>Truck</code>.
     * </p>
     */
    private CalculateRouteTruckModeOptions truckModeOptions;

    /**
     * <p>
     * The name of the route calculator resource that you want to use to
     * calculate the route matrix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The name of the route calculator resource that you want to use to
     *         calculate the route matrix.
     *         </p>
     */
    public String getCalculatorName() {
        return calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource that you want to use to
     * calculate the route matrix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param calculatorName <p>
     *            The name of the route calculator resource that you want to use
     *            to calculate the route matrix.
     *            </p>
     */
    public void setCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
    }

    /**
     * <p>
     * The name of the route calculator resource that you want to use to
     * calculate the route matrix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param calculatorName <p>
     *            The name of the route calculator resource that you want to use
     *            to calculate the route matrix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixRequest withCalculatorName(String calculatorName) {
        this.calculatorName = calculatorName;
        return this;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Car</code>, such as
     * avoiding routes that use ferries or tolls.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as
     * <code>Car</code>.
     * </p>
     *
     * @return <p>
     *         Specifies route preferences when traveling by <code>Car</code>,
     *         such as avoiding routes that use ferries or tolls.
     *         </p>
     *         <p>
     *         Requirements: <code>TravelMode</code> must be specified as
     *         <code>Car</code>.
     *         </p>
     */
    public CalculateRouteCarModeOptions getCarModeOptions() {
        return carModeOptions;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Car</code>, such as
     * avoiding routes that use ferries or tolls.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as
     * <code>Car</code>.
     * </p>
     *
     * @param carModeOptions <p>
     *            Specifies route preferences when traveling by <code>Car</code>
     *            , such as avoiding routes that use ferries or tolls.
     *            </p>
     *            <p>
     *            Requirements: <code>TravelMode</code> must be specified as
     *            <code>Car</code>.
     *            </p>
     */
    public void setCarModeOptions(CalculateRouteCarModeOptions carModeOptions) {
        this.carModeOptions = carModeOptions;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Car</code>, such as
     * avoiding routes that use ferries or tolls.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as
     * <code>Car</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param carModeOptions <p>
     *            Specifies route preferences when traveling by <code>Car</code>
     *            , such as avoiding routes that use ferries or tolls.
     *            </p>
     *            <p>
     *            Requirements: <code>TravelMode</code> must be specified as
     *            <code>Car</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixRequest withCarModeOptions(
            CalculateRouteCarModeOptions carModeOptions) {
        this.carModeOptions = carModeOptions;
        return this;
    }

    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to
     * calculate the route matrix. You can't set both <code>DepartureTime</code>
     * and <code>DepartNow</code>. If neither is set, the best time of day to
     * travel with the best traffic conditions is used to calculate the route
     * matrix.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     *
     * @return <p>
     *         Sets the time of departure as the current time. Uses the current
     *         time to calculate the route matrix. You can't set both
     *         <code>DepartureTime</code> and <code>DepartNow</code>. If neither
     *         is set, the best time of day to travel with the best traffic
     *         conditions is used to calculate the route matrix.
     *         </p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     *         </p>
     */
    public Boolean isDepartNow() {
        return departNow;
    }

    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to
     * calculate the route matrix. You can't set both <code>DepartureTime</code>
     * and <code>DepartNow</code>. If neither is set, the best time of day to
     * travel with the best traffic conditions is used to calculate the route
     * matrix.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     *
     * @return <p>
     *         Sets the time of departure as the current time. Uses the current
     *         time to calculate the route matrix. You can't set both
     *         <code>DepartureTime</code> and <code>DepartNow</code>. If neither
     *         is set, the best time of day to travel with the best traffic
     *         conditions is used to calculate the route matrix.
     *         </p>
     *         <p>
     *         Default Value: <code>false</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>false</code> | <code>true</code>
     *         </p>
     */
    public Boolean getDepartNow() {
        return departNow;
    }

    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to
     * calculate the route matrix. You can't set both <code>DepartureTime</code>
     * and <code>DepartNow</code>. If neither is set, the best time of day to
     * travel with the best traffic conditions is used to calculate the route
     * matrix.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     *
     * @param departNow <p>
     *            Sets the time of departure as the current time. Uses the
     *            current time to calculate the route matrix. You can't set both
     *            <code>DepartureTime</code> and <code>DepartNow</code>. If
     *            neither is set, the best time of day to travel with the best
     *            traffic conditions is used to calculate the route matrix.
     *            </p>
     *            <p>
     *            Default Value: <code>false</code>
     *            </p>
     *            <p>
     *            Valid Values: <code>false</code> | <code>true</code>
     *            </p>
     */
    public void setDepartNow(Boolean departNow) {
        this.departNow = departNow;
    }

    /**
     * <p>
     * Sets the time of departure as the current time. Uses the current time to
     * calculate the route matrix. You can't set both <code>DepartureTime</code>
     * and <code>DepartNow</code>. If neither is set, the best time of day to
     * travel with the best traffic conditions is used to calculate the route
     * matrix.
     * </p>
     * <p>
     * Default Value: <code>false</code>
     * </p>
     * <p>
     * Valid Values: <code>false</code> | <code>true</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param departNow <p>
     *            Sets the time of departure as the current time. Uses the
     *            current time to calculate the route matrix. You can't set both
     *            <code>DepartureTime</code> and <code>DepartNow</code>. If
     *            neither is set, the best time of day to travel with the best
     *            traffic conditions is used to calculate the route matrix.
     *            </p>
     *            <p>
     *            Default Value: <code>false</code>
     *            </p>
     *            <p>
     *            Valid Values: <code>false</code> | <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixRequest withDepartNow(Boolean departNow) {
        this.departNow = departNow;
        return this;
    }

    /**
     * <p>
     * The list of departure (origin) positions for the route matrix. An array
     * of points, each of which is itself a 2-value array defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[longitude, latitude]</code>. For example,
     * <code>[-123.115, 49.285]</code>.
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource
     * there may be additional restrictions on the inputs you can choose. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify
     * a departure that's not located on a road, Amazon Location <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * > moves the position to the nearest road</a>. The snapped value is
     * available in the result in <code>SnappedDeparturePositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     *
     * @return <p>
     *         The list of departure (origin) positions for the route matrix. An
     *         array of points, each of which is itself a 2-value array defined
     *         in <a
     *         href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *         84</a> format: <code>[longitude, latitude]</code>. For example,
     *         <code>[-123.115, 49.285]</code>.
     *         </p>
     *         <important>
     *         <p>
     *         Depending on the data provider selected in the route calculator
     *         resource there may be additional restrictions on the inputs you
     *         can choose. See <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *         > Position restrictions</a> in the <i>Amazon Location Service
     *         Developer Guide</i>.
     *         </p>
     *         </important> <note>
     *         <p>
     *         For route calculators that use Esri as the data provider, if you
     *         specify a departure that's not located on a road, Amazon Location
     *         <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *         > moves the position to the nearest road</a>. The snapped value
     *         is available in the result in
     *         <code>SnappedDeparturePositions</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>[-180 to 180,-90 to 90]</code>
     *         </p>
     */
    public java.util.List<java.util.List<Double>> getDeparturePositions() {
        return departurePositions;
    }

    /**
     * <p>
     * The list of departure (origin) positions for the route matrix. An array
     * of points, each of which is itself a 2-value array defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[longitude, latitude]</code>. For example,
     * <code>[-123.115, 49.285]</code>.
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource
     * there may be additional restrictions on the inputs you can choose. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify
     * a departure that's not located on a road, Amazon Location <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * > moves the position to the nearest road</a>. The snapped value is
     * available in the result in <code>SnappedDeparturePositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     *
     * @param departurePositions <p>
     *            The list of departure (origin) positions for the route matrix.
     *            An array of points, each of which is itself a 2-value array
     *            defined in <a
     *            href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *            84</a> format: <code>[longitude, latitude]</code>. For
     *            example, <code>[-123.115, 49.285]</code>.
     *            </p>
     *            <important>
     *            <p>
     *            Depending on the data provider selected in the route
     *            calculator resource there may be additional restrictions on
     *            the inputs you can choose. See <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *            > Position restrictions</a> in the <i>Amazon Location Service
     *            Developer Guide</i>.
     *            </p>
     *            </important> <note>
     *            <p>
     *            For route calculators that use Esri as the data provider, if
     *            you specify a departure that's not located on a road, Amazon
     *            Location <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *            > moves the position to the nearest road</a>. The snapped
     *            value is available in the result in
     *            <code>SnappedDeparturePositions</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid Values: <code>[-180 to 180,-90 to 90]</code>
     *            </p>
     */
    public void setDeparturePositions(
            java.util.Collection<java.util.List<Double>> departurePositions) {
        if (departurePositions == null) {
            this.departurePositions = null;
            return;
        }

        this.departurePositions = new java.util.ArrayList<java.util.List<Double>>(
                departurePositions);
    }

    /**
     * <p>
     * The list of departure (origin) positions for the route matrix. An array
     * of points, each of which is itself a 2-value array defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[longitude, latitude]</code>. For example,
     * <code>[-123.115, 49.285]</code>.
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource
     * there may be additional restrictions on the inputs you can choose. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify
     * a departure that's not located on a road, Amazon Location <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * > moves the position to the nearest road</a>. The snapped value is
     * available in the result in <code>SnappedDeparturePositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param departurePositions <p>
     *            The list of departure (origin) positions for the route matrix.
     *            An array of points, each of which is itself a 2-value array
     *            defined in <a
     *            href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *            84</a> format: <code>[longitude, latitude]</code>. For
     *            example, <code>[-123.115, 49.285]</code>.
     *            </p>
     *            <important>
     *            <p>
     *            Depending on the data provider selected in the route
     *            calculator resource there may be additional restrictions on
     *            the inputs you can choose. See <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *            > Position restrictions</a> in the <i>Amazon Location Service
     *            Developer Guide</i>.
     *            </p>
     *            </important> <note>
     *            <p>
     *            For route calculators that use Esri as the data provider, if
     *            you specify a departure that's not located on a road, Amazon
     *            Location <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *            > moves the position to the nearest road</a>. The snapped
     *            value is available in the result in
     *            <code>SnappedDeparturePositions</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid Values: <code>[-180 to 180,-90 to 90]</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixRequest withDeparturePositions(
            java.util.List<Double>... departurePositions) {
        if (getDeparturePositions() == null) {
            this.departurePositions = new java.util.ArrayList<java.util.List<Double>>(
                    departurePositions.length);
        }
        for (java.util.List<Double> value : departurePositions) {
            this.departurePositions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of departure (origin) positions for the route matrix. An array
     * of points, each of which is itself a 2-value array defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[longitude, latitude]</code>. For example,
     * <code>[-123.115, 49.285]</code>.
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource
     * there may be additional restrictions on the inputs you can choose. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify
     * a departure that's not located on a road, Amazon Location <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * > moves the position to the nearest road</a>. The snapped value is
     * available in the result in <code>SnappedDeparturePositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param departurePositions <p>
     *            The list of departure (origin) positions for the route matrix.
     *            An array of points, each of which is itself a 2-value array
     *            defined in <a
     *            href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *            84</a> format: <code>[longitude, latitude]</code>. For
     *            example, <code>[-123.115, 49.285]</code>.
     *            </p>
     *            <important>
     *            <p>
     *            Depending on the data provider selected in the route
     *            calculator resource there may be additional restrictions on
     *            the inputs you can choose. See <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *            > Position restrictions</a> in the <i>Amazon Location Service
     *            Developer Guide</i>.
     *            </p>
     *            </important> <note>
     *            <p>
     *            For route calculators that use Esri as the data provider, if
     *            you specify a departure that's not located on a road, Amazon
     *            Location <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *            > moves the position to the nearest road</a>. The snapped
     *            value is available in the result in
     *            <code>SnappedDeparturePositions</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid Values: <code>[-180 to 180,-90 to 90]</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixRequest withDeparturePositions(
            java.util.Collection<java.util.List<Double>> departurePositions) {
        setDeparturePositions(departurePositions);
        return this;
    }

    /**
     * <p>
     * Specifies the desired time of departure. Uses the given time to calculate
     * the route matrix. You can't set both <code>DepartureTime</code> and
     * <code>DepartNow</code>. If neither is set, the best time of day to travel
     * with the best traffic conditions is used to calculate the route matrix.
     * </p>
     * <note>
     * <p>
     * Setting a departure time in the past returns a
     * <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For example,
     * <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies the desired time of departure. Uses the given time to
     *         calculate the route matrix. You can't set both
     *         <code>DepartureTime</code> and <code>DepartNow</code>. If neither
     *         is set, the best time of day to travel with the best traffic
     *         conditions is used to calculate the route matrix.
     *         </p>
     *         <note>
     *         <p>
     *         Setting a departure time in the past returns a
     *         <code>400 ValidationException</code> error.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         In <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For
     *         example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Date getDepartureTime() {
        return departureTime;
    }

    /**
     * <p>
     * Specifies the desired time of departure. Uses the given time to calculate
     * the route matrix. You can't set both <code>DepartureTime</code> and
     * <code>DepartNow</code>. If neither is set, the best time of day to travel
     * with the best traffic conditions is used to calculate the route matrix.
     * </p>
     * <note>
     * <p>
     * Setting a departure time in the past returns a
     * <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For example,
     * <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param departureTime <p>
     *            Specifies the desired time of departure. Uses the given time
     *            to calculate the route matrix. You can't set both
     *            <code>DepartureTime</code> and <code>DepartNow</code>. If
     *            neither is set, the best time of day to travel with the best
     *            traffic conditions is used to calculate the route matrix.
     *            </p>
     *            <note>
     *            <p>
     *            Setting a departure time in the past returns a
     *            <code>400 ValidationException</code> error.
     *            </p>
     *            </note>
     *            <ul>
     *            <li>
     *            <p>
     *            In <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For
     *            example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDepartureTime(java.util.Date departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * <p>
     * Specifies the desired time of departure. Uses the given time to calculate
     * the route matrix. You can't set both <code>DepartureTime</code> and
     * <code>DepartNow</code>. If neither is set, the best time of day to travel
     * with the best traffic conditions is used to calculate the route matrix.
     * </p>
     * <note>
     * <p>
     * Setting a departure time in the past returns a
     * <code>400 ValidationException</code> error.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For example,
     * <code>2020–07-2T12:15:20.000Z+01:00</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param departureTime <p>
     *            Specifies the desired time of departure. Uses the given time
     *            to calculate the route matrix. You can't set both
     *            <code>DepartureTime</code> and <code>DepartNow</code>. If
     *            neither is set, the best time of day to travel with the best
     *            traffic conditions is used to calculate the route matrix.
     *            </p>
     *            <note>
     *            <p>
     *            Setting a departure time in the past returns a
     *            <code>400 ValidationException</code> error.
     *            </p>
     *            </note>
     *            <ul>
     *            <li>
     *            <p>
     *            In <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. For
     *            example, <code>2020–07-2T12:15:20.000Z+01:00</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixRequest withDepartureTime(java.util.Date departureTime) {
        this.departureTime = departureTime;
        return this;
    }

    /**
     * <p>
     * The list of destination positions for the route matrix. An array of
     * points, each of which is itself a 2-value array defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[longitude, latitude]</code>. For example,
     * <code>[-122.339, 47.615]</code>
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource
     * there may be additional restrictions on the inputs you can choose. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify
     * a destination that's not located on a road, Amazon Location <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * > moves the position to the nearest road</a>. The snapped value is
     * available in the result in <code>SnappedDestinationPositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     *
     * @return <p>
     *         The list of destination positions for the route matrix. An array
     *         of points, each of which is itself a 2-value array defined in <a
     *         href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *         84</a> format: <code>[longitude, latitude]</code>. For example,
     *         <code>[-122.339, 47.615]</code>
     *         </p>
     *         <important>
     *         <p>
     *         Depending on the data provider selected in the route calculator
     *         resource there may be additional restrictions on the inputs you
     *         can choose. See <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *         > Position restrictions</a> in the <i>Amazon Location Service
     *         Developer Guide</i>.
     *         </p>
     *         </important> <note>
     *         <p>
     *         For route calculators that use Esri as the data provider, if you
     *         specify a destination that's not located on a road, Amazon
     *         Location <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *         > moves the position to the nearest road</a>. The snapped value
     *         is available in the result in
     *         <code>SnappedDestinationPositions</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>[-180 to 180,-90 to 90]</code>
     *         </p>
     */
    public java.util.List<java.util.List<Double>> getDestinationPositions() {
        return destinationPositions;
    }

    /**
     * <p>
     * The list of destination positions for the route matrix. An array of
     * points, each of which is itself a 2-value array defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[longitude, latitude]</code>. For example,
     * <code>[-122.339, 47.615]</code>
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource
     * there may be additional restrictions on the inputs you can choose. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify
     * a destination that's not located on a road, Amazon Location <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * > moves the position to the nearest road</a>. The snapped value is
     * available in the result in <code>SnappedDestinationPositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     *
     * @param destinationPositions <p>
     *            The list of destination positions for the route matrix. An
     *            array of points, each of which is itself a 2-value array
     *            defined in <a
     *            href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *            84</a> format: <code>[longitude, latitude]</code>. For
     *            example, <code>[-122.339, 47.615]</code>
     *            </p>
     *            <important>
     *            <p>
     *            Depending on the data provider selected in the route
     *            calculator resource there may be additional restrictions on
     *            the inputs you can choose. See <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *            > Position restrictions</a> in the <i>Amazon Location Service
     *            Developer Guide</i>.
     *            </p>
     *            </important> <note>
     *            <p>
     *            For route calculators that use Esri as the data provider, if
     *            you specify a destination that's not located on a road, Amazon
     *            Location <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *            > moves the position to the nearest road</a>. The snapped
     *            value is available in the result in
     *            <code>SnappedDestinationPositions</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid Values: <code>[-180 to 180,-90 to 90]</code>
     *            </p>
     */
    public void setDestinationPositions(
            java.util.Collection<java.util.List<Double>> destinationPositions) {
        if (destinationPositions == null) {
            this.destinationPositions = null;
            return;
        }

        this.destinationPositions = new java.util.ArrayList<java.util.List<Double>>(
                destinationPositions);
    }

    /**
     * <p>
     * The list of destination positions for the route matrix. An array of
     * points, each of which is itself a 2-value array defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[longitude, latitude]</code>. For example,
     * <code>[-122.339, 47.615]</code>
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource
     * there may be additional restrictions on the inputs you can choose. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify
     * a destination that's not located on a road, Amazon Location <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * > moves the position to the nearest road</a>. The snapped value is
     * available in the result in <code>SnappedDestinationPositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPositions <p>
     *            The list of destination positions for the route matrix. An
     *            array of points, each of which is itself a 2-value array
     *            defined in <a
     *            href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *            84</a> format: <code>[longitude, latitude]</code>. For
     *            example, <code>[-122.339, 47.615]</code>
     *            </p>
     *            <important>
     *            <p>
     *            Depending on the data provider selected in the route
     *            calculator resource there may be additional restrictions on
     *            the inputs you can choose. See <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *            > Position restrictions</a> in the <i>Amazon Location Service
     *            Developer Guide</i>.
     *            </p>
     *            </important> <note>
     *            <p>
     *            For route calculators that use Esri as the data provider, if
     *            you specify a destination that's not located on a road, Amazon
     *            Location <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *            > moves the position to the nearest road</a>. The snapped
     *            value is available in the result in
     *            <code>SnappedDestinationPositions</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid Values: <code>[-180 to 180,-90 to 90]</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixRequest withDestinationPositions(
            java.util.List<Double>... destinationPositions) {
        if (getDestinationPositions() == null) {
            this.destinationPositions = new java.util.ArrayList<java.util.List<Double>>(
                    destinationPositions.length);
        }
        for (java.util.List<Double> value : destinationPositions) {
            this.destinationPositions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of destination positions for the route matrix. An array of
     * points, each of which is itself a 2-value array defined in <a
     * href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS 84</a>
     * format: <code>[longitude, latitude]</code>. For example,
     * <code>[-122.339, 47.615]</code>
     * </p>
     * <important>
     * <p>
     * Depending on the data provider selected in the route calculator resource
     * there may be additional restrictions on the inputs you can choose. See <a
     * href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     * > Position restrictions</a> in the <i>Amazon Location Service Developer
     * Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * For route calculators that use Esri as the data provider, if you specify
     * a destination that's not located on a road, Amazon Location <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * > moves the position to the nearest road</a>. The snapped value is
     * available in the result in <code>SnappedDestinationPositions</code>.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>[-180 to 180,-90 to 90]</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPositions <p>
     *            The list of destination positions for the route matrix. An
     *            array of points, each of which is itself a 2-value array
     *            defined in <a
     *            href="https://earth-info.nga.mil/GandG/wgs84/index.html">WGS
     *            84</a> format: <code>[longitude, latitude]</code>. For
     *            example, <code>[-122.339, 47.615]</code>
     *            </p>
     *            <important>
     *            <p>
     *            Depending on the data provider selected in the route
     *            calculator resource there may be additional restrictions on
     *            the inputs you can choose. See <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route-matrix.html#matrix-routing-position-limits"
     *            > Position restrictions</a> in the <i>Amazon Location Service
     *            Developer Guide</i>.
     *            </p>
     *            </important> <note>
     *            <p>
     *            For route calculators that use Esri as the data provider, if
     *            you specify a destination that's not located on a road, Amazon
     *            Location <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *            > moves the position to the nearest road</a>. The snapped
     *            value is available in the result in
     *            <code>SnappedDestinationPositions</code>.
     *            </p>
     *            </note>
     *            <p>
     *            Valid Values: <code>[-180 to 180,-90 to 90]</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixRequest withDestinationPositions(
            java.util.Collection<java.util.List<Double>> destinationPositions) {
        setDestinationPositions(destinationPositions);
        return this;
    }

    /**
     * <p>
     * Set the unit system to specify the distance.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @return <p>
     *         Set the unit system to specify the distance.
     *         </p>
     *         <p>
     *         Default Value: <code>Kilometers</code>
     *         </p>
     * @see DistanceUnit
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * <p>
     * Set the unit system to specify the distance.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            Set the unit system to specify the distance.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilometers</code>
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * Set the unit system to specify the distance.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            Set the unit system to specify the distance.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilometers</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public CalculateRouteMatrixRequest withDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
        return this;
    }

    /**
     * <p>
     * Set the unit system to specify the distance.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            Set the unit system to specify the distance.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilometers</code>
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
    }

    /**
     * <p>
     * Set the unit system to specify the distance.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            Set the unit system to specify the distance.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilometers</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public CalculateRouteMatrixRequest withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in
     * estimating the speed of travel and road compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify also determines how you specify
     * route preferences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If traveling by <code>Car</code> use the <code>CarModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If traveling by <code>Truck</code> use the <code>TruckModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default Value: <code>Car</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Car, Truck, Walking
     *
     * @return <p>
     *         Specifies the mode of transport when calculating a route. Used in
     *         estimating the speed of travel and road compatibility.
     *         </p>
     *         <p>
     *         The <code>TravelMode</code> you specify also determines how you
     *         specify route preferences:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If traveling by <code>Car</code> use the
     *         <code>CarModeOptions</code> parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If traveling by <code>Truck</code> use the
     *         <code>TruckModeOptions</code> parameter.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default Value: <code>Car</code>
     *         </p>
     * @see TravelMode
     */
    public String getTravelMode() {
        return travelMode;
    }

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in
     * estimating the speed of travel and road compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify also determines how you specify
     * route preferences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If traveling by <code>Car</code> use the <code>CarModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If traveling by <code>Truck</code> use the <code>TruckModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default Value: <code>Car</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Car, Truck, Walking
     *
     * @param travelMode <p>
     *            Specifies the mode of transport when calculating a route. Used
     *            in estimating the speed of travel and road compatibility.
     *            </p>
     *            <p>
     *            The <code>TravelMode</code> you specify also determines how
     *            you specify route preferences:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If traveling by <code>Car</code> use the
     *            <code>CarModeOptions</code> parameter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If traveling by <code>Truck</code> use the
     *            <code>TruckModeOptions</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default Value: <code>Car</code>
     *            </p>
     * @see TravelMode
     */
    public void setTravelMode(String travelMode) {
        this.travelMode = travelMode;
    }

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in
     * estimating the speed of travel and road compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify also determines how you specify
     * route preferences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If traveling by <code>Car</code> use the <code>CarModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If traveling by <code>Truck</code> use the <code>TruckModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default Value: <code>Car</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Car, Truck, Walking
     *
     * @param travelMode <p>
     *            Specifies the mode of transport when calculating a route. Used
     *            in estimating the speed of travel and road compatibility.
     *            </p>
     *            <p>
     *            The <code>TravelMode</code> you specify also determines how
     *            you specify route preferences:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If traveling by <code>Car</code> use the
     *            <code>CarModeOptions</code> parameter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If traveling by <code>Truck</code> use the
     *            <code>TruckModeOptions</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default Value: <code>Car</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TravelMode
     */
    public CalculateRouteMatrixRequest withTravelMode(String travelMode) {
        this.travelMode = travelMode;
        return this;
    }

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in
     * estimating the speed of travel and road compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify also determines how you specify
     * route preferences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If traveling by <code>Car</code> use the <code>CarModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If traveling by <code>Truck</code> use the <code>TruckModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default Value: <code>Car</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Car, Truck, Walking
     *
     * @param travelMode <p>
     *            Specifies the mode of transport when calculating a route. Used
     *            in estimating the speed of travel and road compatibility.
     *            </p>
     *            <p>
     *            The <code>TravelMode</code> you specify also determines how
     *            you specify route preferences:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If traveling by <code>Car</code> use the
     *            <code>CarModeOptions</code> parameter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If traveling by <code>Truck</code> use the
     *            <code>TruckModeOptions</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default Value: <code>Car</code>
     *            </p>
     * @see TravelMode
     */
    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode.toString();
    }

    /**
     * <p>
     * Specifies the mode of transport when calculating a route. Used in
     * estimating the speed of travel and road compatibility.
     * </p>
     * <p>
     * The <code>TravelMode</code> you specify also determines how you specify
     * route preferences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If traveling by <code>Car</code> use the <code>CarModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * If traveling by <code>Truck</code> use the <code>TruckModeOptions</code>
     * parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default Value: <code>Car</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Car, Truck, Walking
     *
     * @param travelMode <p>
     *            Specifies the mode of transport when calculating a route. Used
     *            in estimating the speed of travel and road compatibility.
     *            </p>
     *            <p>
     *            The <code>TravelMode</code> you specify also determines how
     *            you specify route preferences:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If traveling by <code>Car</code> use the
     *            <code>CarModeOptions</code> parameter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If traveling by <code>Truck</code> use the
     *            <code>TruckModeOptions</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default Value: <code>Car</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TravelMode
     */
    public CalculateRouteMatrixRequest withTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Truck</code>, such as
     * avoiding routes that use ferries or tolls, and truck specifications to
     * consider when choosing an optimal road.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as
     * <code>Truck</code>.
     * </p>
     *
     * @return <p>
     *         Specifies route preferences when traveling by <code>Truck</code>,
     *         such as avoiding routes that use ferries or tolls, and truck
     *         specifications to consider when choosing an optimal road.
     *         </p>
     *         <p>
     *         Requirements: <code>TravelMode</code> must be specified as
     *         <code>Truck</code>.
     *         </p>
     */
    public CalculateRouteTruckModeOptions getTruckModeOptions() {
        return truckModeOptions;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Truck</code>, such as
     * avoiding routes that use ferries or tolls, and truck specifications to
     * consider when choosing an optimal road.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as
     * <code>Truck</code>.
     * </p>
     *
     * @param truckModeOptions <p>
     *            Specifies route preferences when traveling by
     *            <code>Truck</code>, such as avoiding routes that use ferries
     *            or tolls, and truck specifications to consider when choosing
     *            an optimal road.
     *            </p>
     *            <p>
     *            Requirements: <code>TravelMode</code> must be specified as
     *            <code>Truck</code>.
     *            </p>
     */
    public void setTruckModeOptions(CalculateRouteTruckModeOptions truckModeOptions) {
        this.truckModeOptions = truckModeOptions;
    }

    /**
     * <p>
     * Specifies route preferences when traveling by <code>Truck</code>, such as
     * avoiding routes that use ferries or tolls, and truck specifications to
     * consider when choosing an optimal road.
     * </p>
     * <p>
     * Requirements: <code>TravelMode</code> must be specified as
     * <code>Truck</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param truckModeOptions <p>
     *            Specifies route preferences when traveling by
     *            <code>Truck</code>, such as avoiding routes that use ferries
     *            or tolls, and truck specifications to consider when choosing
     *            an optimal road.
     *            </p>
     *            <p>
     *            Requirements: <code>TravelMode</code> must be specified as
     *            <code>Truck</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteMatrixRequest withTruckModeOptions(
            CalculateRouteTruckModeOptions truckModeOptions) {
        this.truckModeOptions = truckModeOptions;
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
        if (getCalculatorName() != null)
            sb.append("CalculatorName: " + getCalculatorName() + ",");
        if (getCarModeOptions() != null)
            sb.append("CarModeOptions: " + getCarModeOptions() + ",");
        if (getDepartNow() != null)
            sb.append("DepartNow: " + getDepartNow() + ",");
        if (getDeparturePositions() != null)
            sb.append("DeparturePositions: " + getDeparturePositions() + ",");
        if (getDepartureTime() != null)
            sb.append("DepartureTime: " + getDepartureTime() + ",");
        if (getDestinationPositions() != null)
            sb.append("DestinationPositions: " + getDestinationPositions() + ",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: " + getDistanceUnit() + ",");
        if (getTravelMode() != null)
            sb.append("TravelMode: " + getTravelMode() + ",");
        if (getTruckModeOptions() != null)
            sb.append("TruckModeOptions: " + getTruckModeOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCalculatorName() == null) ? 0 : getCalculatorName().hashCode());
        hashCode = prime * hashCode
                + ((getCarModeOptions() == null) ? 0 : getCarModeOptions().hashCode());
        hashCode = prime * hashCode + ((getDepartNow() == null) ? 0 : getDepartNow().hashCode());
        hashCode = prime * hashCode
                + ((getDeparturePositions() == null) ? 0 : getDeparturePositions().hashCode());
        hashCode = prime * hashCode
                + ((getDepartureTime() == null) ? 0 : getDepartureTime().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationPositions() == null) ? 0 : getDestinationPositions().hashCode());
        hashCode = prime * hashCode
                + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode + ((getTravelMode() == null) ? 0 : getTravelMode().hashCode());
        hashCode = prime * hashCode
                + ((getTruckModeOptions() == null) ? 0 : getTruckModeOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculateRouteMatrixRequest == false)
            return false;
        CalculateRouteMatrixRequest other = (CalculateRouteMatrixRequest) obj;

        if (other.getCalculatorName() == null ^ this.getCalculatorName() == null)
            return false;
        if (other.getCalculatorName() != null
                && other.getCalculatorName().equals(this.getCalculatorName()) == false)
            return false;
        if (other.getCarModeOptions() == null ^ this.getCarModeOptions() == null)
            return false;
        if (other.getCarModeOptions() != null
                && other.getCarModeOptions().equals(this.getCarModeOptions()) == false)
            return false;
        if (other.getDepartNow() == null ^ this.getDepartNow() == null)
            return false;
        if (other.getDepartNow() != null
                && other.getDepartNow().equals(this.getDepartNow()) == false)
            return false;
        if (other.getDeparturePositions() == null ^ this.getDeparturePositions() == null)
            return false;
        if (other.getDeparturePositions() != null
                && other.getDeparturePositions().equals(this.getDeparturePositions()) == false)
            return false;
        if (other.getDepartureTime() == null ^ this.getDepartureTime() == null)
            return false;
        if (other.getDepartureTime() != null
                && other.getDepartureTime().equals(this.getDepartureTime()) == false)
            return false;
        if (other.getDestinationPositions() == null ^ this.getDestinationPositions() == null)
            return false;
        if (other.getDestinationPositions() != null
                && other.getDestinationPositions().equals(this.getDestinationPositions()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null
                && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        if (other.getTravelMode() == null ^ this.getTravelMode() == null)
            return false;
        if (other.getTravelMode() != null
                && other.getTravelMode().equals(this.getTravelMode()) == false)
            return false;
        if (other.getTruckModeOptions() == null ^ this.getTruckModeOptions() == null)
            return false;
        if (other.getTruckModeOptions() != null
                && other.getTruckModeOptions().equals(this.getTruckModeOptions()) == false)
            return false;
        return true;
    }
}
