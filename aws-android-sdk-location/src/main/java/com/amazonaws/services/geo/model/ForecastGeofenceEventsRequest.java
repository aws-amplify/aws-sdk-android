/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Evaluates device positions against geofence geometries from a given geofence
 * collection. The event forecasts three states for which a device can be in
 * relative to a geofence:
 * </p>
 * <p>
 * <code>ENTER</code>: If a device is outside of a geofence, but would breach
 * the fence if the device is moving at its current speed within time horizon
 * window.
 * </p>
 * <p>
 * <code>EXIT</code>: If a device is inside of a geofence, but would breach the
 * fence if the device is moving at its current speed within time horizon
 * window.
 * </p>
 * <p>
 * <code>IDLE</code>: If a device is inside of a geofence, and the device is not
 * moving.
 * </p>
 */
public class ForecastGeofenceEventsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String collectionName;

    /**
     * <p>
     * The device's state, including current position and speed.
     * </p>
     */
    private ForecastGeofenceEventsDeviceState deviceState;

    /**
     * <p>
     * Specifies the time horizon in minutes for the forecasted events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     */
    private Double timeHorizonMinutes;

    /**
     * <p>
     * The distance unit used for the <code>NearestDistance</code> property
     * returned in a forecasted event. The measurement system must match for
     * <code>DistanceUnit</code> and <code>SpeedUnit</code>; if
     * <code>Kilometers</code> is specified for <code>DistanceUnit</code>, then
     * <code>SpeedUnit</code> must be <code>KilometersPerHour</code>.
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
     * The speed unit for the device captured by the device state. The
     * measurement system must match for <code>DistanceUnit</code> and
     * <code>SpeedUnit</code>; if <code>Kilometers</code> is specified for
     * <code>DistanceUnit</code>, then <code>SpeedUnit</code> must be
     * <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * Default Value: <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     */
    private String speedUnit;

    /**
     * <p>
     * The pagination token specifying which page of results to return in the
     * response. If no token is provided, the default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 60000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An optional limit for the number of resources returned in a single call.
     * </p>
     * <p>
     * Default value: <code>20</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         The name of the geofence collection.
     *         </p>
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param collectionName <p>
     *            The name of the geofence collection.
     *            </p>
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param collectionName <p>
     *            The name of the geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastGeofenceEventsRequest withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * <p>
     * The device's state, including current position and speed.
     * </p>
     *
     * @return <p>
     *         The device's state, including current position and speed.
     *         </p>
     */
    public ForecastGeofenceEventsDeviceState getDeviceState() {
        return deviceState;
    }

    /**
     * <p>
     * The device's state, including current position and speed.
     * </p>
     *
     * @param deviceState <p>
     *            The device's state, including current position and speed.
     *            </p>
     */
    public void setDeviceState(ForecastGeofenceEventsDeviceState deviceState) {
        this.deviceState = deviceState;
    }

    /**
     * <p>
     * The device's state, including current position and speed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceState <p>
     *            The device's state, including current position and speed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastGeofenceEventsRequest withDeviceState(
            ForecastGeofenceEventsDeviceState deviceState) {
        this.deviceState = deviceState;
        return this;
    }

    /**
     * <p>
     * Specifies the time horizon in minutes for the forecasted events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     *
     * @return <p>
     *         Specifies the time horizon in minutes for the forecasted events.
     *         </p>
     */
    public Double getTimeHorizonMinutes() {
        return timeHorizonMinutes;
    }

    /**
     * <p>
     * Specifies the time horizon in minutes for the forecasted events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     *
     * @param timeHorizonMinutes <p>
     *            Specifies the time horizon in minutes for the forecasted
     *            events.
     *            </p>
     */
    public void setTimeHorizonMinutes(Double timeHorizonMinutes) {
        this.timeHorizonMinutes = timeHorizonMinutes;
    }

    /**
     * <p>
     * Specifies the time horizon in minutes for the forecasted events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - <br/>
     *
     * @param timeHorizonMinutes <p>
     *            Specifies the time horizon in minutes for the forecasted
     *            events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastGeofenceEventsRequest withTimeHorizonMinutes(Double timeHorizonMinutes) {
        this.timeHorizonMinutes = timeHorizonMinutes;
        return this;
    }

    /**
     * <p>
     * The distance unit used for the <code>NearestDistance</code> property
     * returned in a forecasted event. The measurement system must match for
     * <code>DistanceUnit</code> and <code>SpeedUnit</code>; if
     * <code>Kilometers</code> is specified for <code>DistanceUnit</code>, then
     * <code>SpeedUnit</code> must be <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @return <p>
     *         The distance unit used for the <code>NearestDistance</code>
     *         property returned in a forecasted event. The measurement system
     *         must match for <code>DistanceUnit</code> and
     *         <code>SpeedUnit</code>; if <code>Kilometers</code> is specified
     *         for <code>DistanceUnit</code>, then <code>SpeedUnit</code> must
     *         be <code>KilometersPerHour</code>.
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
     * The distance unit used for the <code>NearestDistance</code> property
     * returned in a forecasted event. The measurement system must match for
     * <code>DistanceUnit</code> and <code>SpeedUnit</code>; if
     * <code>Kilometers</code> is specified for <code>DistanceUnit</code>, then
     * <code>SpeedUnit</code> must be <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit used for the <code>NearestDistance</code>
     *            property returned in a forecasted event. The measurement
     *            system must match for <code>DistanceUnit</code> and
     *            <code>SpeedUnit</code>; if <code>Kilometers</code> is
     *            specified for <code>DistanceUnit</code>, then
     *            <code>SpeedUnit</code> must be <code>KilometersPerHour</code>.
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
     * The distance unit used for the <code>NearestDistance</code> property
     * returned in a forecasted event. The measurement system must match for
     * <code>DistanceUnit</code> and <code>SpeedUnit</code>; if
     * <code>Kilometers</code> is specified for <code>DistanceUnit</code>, then
     * <code>SpeedUnit</code> must be <code>KilometersPerHour</code>.
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
     *            The distance unit used for the <code>NearestDistance</code>
     *            property returned in a forecasted event. The measurement
     *            system must match for <code>DistanceUnit</code> and
     *            <code>SpeedUnit</code>; if <code>Kilometers</code> is
     *            specified for <code>DistanceUnit</code>, then
     *            <code>SpeedUnit</code> must be <code>KilometersPerHour</code>.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilometers</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public ForecastGeofenceEventsRequest withDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
        return this;
    }

    /**
     * <p>
     * The distance unit used for the <code>NearestDistance</code> property
     * returned in a forecasted event. The measurement system must match for
     * <code>DistanceUnit</code> and <code>SpeedUnit</code>; if
     * <code>Kilometers</code> is specified for <code>DistanceUnit</code>, then
     * <code>SpeedUnit</code> must be <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * Default Value: <code>Kilometers</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit used for the <code>NearestDistance</code>
     *            property returned in a forecasted event. The measurement
     *            system must match for <code>DistanceUnit</code> and
     *            <code>SpeedUnit</code>; if <code>Kilometers</code> is
     *            specified for <code>DistanceUnit</code>, then
     *            <code>SpeedUnit</code> must be <code>KilometersPerHour</code>.
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
     * The distance unit used for the <code>NearestDistance</code> property
     * returned in a forecasted event. The measurement system must match for
     * <code>DistanceUnit</code> and <code>SpeedUnit</code>; if
     * <code>Kilometers</code> is specified for <code>DistanceUnit</code>, then
     * <code>SpeedUnit</code> must be <code>KilometersPerHour</code>.
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
     *            The distance unit used for the <code>NearestDistance</code>
     *            property returned in a forecasted event. The measurement
     *            system must match for <code>DistanceUnit</code> and
     *            <code>SpeedUnit</code>; if <code>Kilometers</code> is
     *            specified for <code>DistanceUnit</code>, then
     *            <code>SpeedUnit</code> must be <code>KilometersPerHour</code>.
     *            </p>
     *            <p>
     *            Default Value: <code>Kilometers</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public ForecastGeofenceEventsRequest withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The speed unit for the device captured by the device state. The
     * measurement system must match for <code>DistanceUnit</code> and
     * <code>SpeedUnit</code>; if <code>Kilometers</code> is specified for
     * <code>DistanceUnit</code>, then <code>SpeedUnit</code> must be
     * <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * Default Value: <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     *
     * @return <p>
     *         The speed unit for the device captured by the device state. The
     *         measurement system must match for <code>DistanceUnit</code> and
     *         <code>SpeedUnit</code>; if <code>Kilometers</code> is specified
     *         for <code>DistanceUnit</code>, then <code>SpeedUnit</code> must
     *         be <code>KilometersPerHour</code>.
     *         </p>
     *         <p>
     *         Default Value: <code>KilometersPerHour</code>.
     *         </p>
     * @see SpeedUnit
     */
    public String getSpeedUnit() {
        return speedUnit;
    }

    /**
     * <p>
     * The speed unit for the device captured by the device state. The
     * measurement system must match for <code>DistanceUnit</code> and
     * <code>SpeedUnit</code>; if <code>Kilometers</code> is specified for
     * <code>DistanceUnit</code>, then <code>SpeedUnit</code> must be
     * <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * Default Value: <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     *
     * @param speedUnit <p>
     *            The speed unit for the device captured by the device state.
     *            The measurement system must match for
     *            <code>DistanceUnit</code> and <code>SpeedUnit</code>; if
     *            <code>Kilometers</code> is specified for
     *            <code>DistanceUnit</code>, then <code>SpeedUnit</code> must be
     *            <code>KilometersPerHour</code>.
     *            </p>
     *            <p>
     *            Default Value: <code>KilometersPerHour</code>.
     *            </p>
     * @see SpeedUnit
     */
    public void setSpeedUnit(String speedUnit) {
        this.speedUnit = speedUnit;
    }

    /**
     * <p>
     * The speed unit for the device captured by the device state. The
     * measurement system must match for <code>DistanceUnit</code> and
     * <code>SpeedUnit</code>; if <code>Kilometers</code> is specified for
     * <code>DistanceUnit</code>, then <code>SpeedUnit</code> must be
     * <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * Default Value: <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     *
     * @param speedUnit <p>
     *            The speed unit for the device captured by the device state.
     *            The measurement system must match for
     *            <code>DistanceUnit</code> and <code>SpeedUnit</code>; if
     *            <code>Kilometers</code> is specified for
     *            <code>DistanceUnit</code>, then <code>SpeedUnit</code> must be
     *            <code>KilometersPerHour</code>.
     *            </p>
     *            <p>
     *            Default Value: <code>KilometersPerHour</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpeedUnit
     */
    public ForecastGeofenceEventsRequest withSpeedUnit(String speedUnit) {
        this.speedUnit = speedUnit;
        return this;
    }

    /**
     * <p>
     * The speed unit for the device captured by the device state. The
     * measurement system must match for <code>DistanceUnit</code> and
     * <code>SpeedUnit</code>; if <code>Kilometers</code> is specified for
     * <code>DistanceUnit</code>, then <code>SpeedUnit</code> must be
     * <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * Default Value: <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     *
     * @param speedUnit <p>
     *            The speed unit for the device captured by the device state.
     *            The measurement system must match for
     *            <code>DistanceUnit</code> and <code>SpeedUnit</code>; if
     *            <code>Kilometers</code> is specified for
     *            <code>DistanceUnit</code>, then <code>SpeedUnit</code> must be
     *            <code>KilometersPerHour</code>.
     *            </p>
     *            <p>
     *            Default Value: <code>KilometersPerHour</code>.
     *            </p>
     * @see SpeedUnit
     */
    public void setSpeedUnit(SpeedUnit speedUnit) {
        this.speedUnit = speedUnit.toString();
    }

    /**
     * <p>
     * The speed unit for the device captured by the device state. The
     * measurement system must match for <code>DistanceUnit</code> and
     * <code>SpeedUnit</code>; if <code>Kilometers</code> is specified for
     * <code>DistanceUnit</code>, then <code>SpeedUnit</code> must be
     * <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * Default Value: <code>KilometersPerHour</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     *
     * @param speedUnit <p>
     *            The speed unit for the device captured by the device state.
     *            The measurement system must match for
     *            <code>DistanceUnit</code> and <code>SpeedUnit</code>; if
     *            <code>Kilometers</code> is specified for
     *            <code>DistanceUnit</code>, then <code>SpeedUnit</code> must be
     *            <code>KilometersPerHour</code>.
     *            </p>
     *            <p>
     *            Default Value: <code>KilometersPerHour</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpeedUnit
     */
    public ForecastGeofenceEventsRequest withSpeedUnit(SpeedUnit speedUnit) {
        this.speedUnit = speedUnit.toString();
        return this;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the
     * response. If no token is provided, the default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 60000<br/>
     *
     * @return <p>
     *         The pagination token specifying which page of results to return
     *         in the response. If no token is provided, the default page is the
     *         first page.
     *         </p>
     *         <p>
     *         Default value: <code>null</code>
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the
     * response. If no token is provided, the default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 60000<br/>
     *
     * @param nextToken <p>
     *            The pagination token specifying which page of results to
     *            return in the response. If no token is provided, the default
     *            page is the first page.
     *            </p>
     *            <p>
     *            Default value: <code>null</code>
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the
     * response. If no token is provided, the default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 60000<br/>
     *
     * @param nextToken <p>
     *            The pagination token specifying which page of results to
     *            return in the response. If no token is provided, the default
     *            page is the first page.
     *            </p>
     *            <p>
     *            Default value: <code>null</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastGeofenceEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An optional limit for the number of resources returned in a single call.
     * </p>
     * <p>
     * Default value: <code>20</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @return <p>
     *         An optional limit for the number of resources returned in a
     *         single call.
     *         </p>
     *         <p>
     *         Default value: <code>20</code>
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * An optional limit for the number of resources returned in a single call.
     * </p>
     * <p>
     * Default value: <code>20</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            An optional limit for the number of resources returned in a
     *            single call.
     *            </p>
     *            <p>
     *            Default value: <code>20</code>
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional limit for the number of resources returned in a single call.
     * </p>
     * <p>
     * Default value: <code>20</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults <p>
     *            An optional limit for the number of resources returned in a
     *            single call.
     *            </p>
     *            <p>
     *            Default value: <code>20</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastGeofenceEventsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getCollectionName() != null)
            sb.append("CollectionName: " + getCollectionName() + ",");
        if (getDeviceState() != null)
            sb.append("DeviceState: " + getDeviceState() + ",");
        if (getTimeHorizonMinutes() != null)
            sb.append("TimeHorizonMinutes: " + getTimeHorizonMinutes() + ",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: " + getDistanceUnit() + ",");
        if (getSpeedUnit() != null)
            sb.append("SpeedUnit: " + getSpeedUnit() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceState() == null) ? 0 : getDeviceState().hashCode());
        hashCode = prime * hashCode
                + ((getTimeHorizonMinutes() == null) ? 0 : getTimeHorizonMinutes().hashCode());
        hashCode = prime * hashCode
                + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode + ((getSpeedUnit() == null) ? 0 : getSpeedUnit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForecastGeofenceEventsRequest == false)
            return false;
        ForecastGeofenceEventsRequest other = (ForecastGeofenceEventsRequest) obj;

        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null
                && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getDeviceState() == null ^ this.getDeviceState() == null)
            return false;
        if (other.getDeviceState() != null
                && other.getDeviceState().equals(this.getDeviceState()) == false)
            return false;
        if (other.getTimeHorizonMinutes() == null ^ this.getTimeHorizonMinutes() == null)
            return false;
        if (other.getTimeHorizonMinutes() != null
                && other.getTimeHorizonMinutes().equals(this.getTimeHorizonMinutes()) == false)
            return false;
        if (other.getDistanceUnit() == null ^ this.getDistanceUnit() == null)
            return false;
        if (other.getDistanceUnit() != null
                && other.getDistanceUnit().equals(this.getDistanceUnit()) == false)
            return false;
        if (other.getSpeedUnit() == null ^ this.getSpeedUnit() == null)
            return false;
        if (other.getSpeedUnit() != null
                && other.getSpeedUnit().equals(this.getSpeedUnit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
