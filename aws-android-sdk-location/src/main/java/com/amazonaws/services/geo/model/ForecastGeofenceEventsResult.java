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

public class ForecastGeofenceEventsResult implements Serializable {
    /**
     * <p>
     * The list of forecasted events.
     * </p>
     */
    private java.util.List<ForecastedEvent> forecastedEvents;

    /**
     * <p>
     * The pagination token specifying which page of results to return in the
     * response. If no token is provided, the default page is the first page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 60000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The distance unit for the forecasted events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     */
    private String distanceUnit;

    /**
     * <p>
     * The speed unit for the forecasted events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     */
    private String speedUnit;

    /**
     * <p>
     * The list of forecasted events.
     * </p>
     *
     * @return <p>
     *         The list of forecasted events.
     *         </p>
     */
    public java.util.List<ForecastedEvent> getForecastedEvents() {
        return forecastedEvents;
    }

    /**
     * <p>
     * The list of forecasted events.
     * </p>
     *
     * @param forecastedEvents <p>
     *            The list of forecasted events.
     *            </p>
     */
    public void setForecastedEvents(java.util.Collection<ForecastedEvent> forecastedEvents) {
        if (forecastedEvents == null) {
            this.forecastedEvents = null;
            return;
        }

        this.forecastedEvents = new java.util.ArrayList<ForecastedEvent>(forecastedEvents);
    }

    /**
     * <p>
     * The list of forecasted events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forecastedEvents <p>
     *            The list of forecasted events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastGeofenceEventsResult withForecastedEvents(ForecastedEvent... forecastedEvents) {
        if (getForecastedEvents() == null) {
            this.forecastedEvents = new java.util.ArrayList<ForecastedEvent>(
                    forecastedEvents.length);
        }
        for (ForecastedEvent value : forecastedEvents) {
            this.forecastedEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of forecasted events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forecastedEvents <p>
     *            The list of forecasted events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastGeofenceEventsResult withForecastedEvents(
            java.util.Collection<ForecastedEvent> forecastedEvents) {
        setForecastedEvents(forecastedEvents);
        return this;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the
     * response. If no token is provided, the default page is the first page.
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
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 60000<br/>
     *
     * @param nextToken <p>
     *            The pagination token specifying which page of results to
     *            return in the response. If no token is provided, the default
     *            page is the first page.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ForecastGeofenceEventsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The distance unit for the forecasted events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @return <p>
     *         The distance unit for the forecasted events.
     *         </p>
     * @see DistanceUnit
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * <p>
     * The distance unit for the forecasted events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the forecasted events.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    /**
     * <p>
     * The distance unit for the forecasted events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the forecasted events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public ForecastGeofenceEventsResult withDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
        return this;
    }

    /**
     * <p>
     * The distance unit for the forecasted events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the forecasted events.
     *            </p>
     * @see DistanceUnit
     */
    public void setDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
    }

    /**
     * <p>
     * The distance unit for the forecasted events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Kilometers, Miles
     *
     * @param distanceUnit <p>
     *            The distance unit for the forecasted events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DistanceUnit
     */
    public ForecastGeofenceEventsResult withDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit.toString();
        return this;
    }

    /**
     * <p>
     * The speed unit for the forecasted events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     *
     * @return <p>
     *         The speed unit for the forecasted events.
     *         </p>
     * @see SpeedUnit
     */
    public String getSpeedUnit() {
        return speedUnit;
    }

    /**
     * <p>
     * The speed unit for the forecasted events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     *
     * @param speedUnit <p>
     *            The speed unit for the forecasted events.
     *            </p>
     * @see SpeedUnit
     */
    public void setSpeedUnit(String speedUnit) {
        this.speedUnit = speedUnit;
    }

    /**
     * <p>
     * The speed unit for the forecasted events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     *
     * @param speedUnit <p>
     *            The speed unit for the forecasted events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpeedUnit
     */
    public ForecastGeofenceEventsResult withSpeedUnit(String speedUnit) {
        this.speedUnit = speedUnit;
        return this;
    }

    /**
     * <p>
     * The speed unit for the forecasted events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     *
     * @param speedUnit <p>
     *            The speed unit for the forecasted events.
     *            </p>
     * @see SpeedUnit
     */
    public void setSpeedUnit(SpeedUnit speedUnit) {
        this.speedUnit = speedUnit.toString();
    }

    /**
     * <p>
     * The speed unit for the forecasted events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KilometersPerHour, MilesPerHour
     *
     * @param speedUnit <p>
     *            The speed unit for the forecasted events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpeedUnit
     */
    public ForecastGeofenceEventsResult withSpeedUnit(SpeedUnit speedUnit) {
        this.speedUnit = speedUnit.toString();
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
        if (getForecastedEvents() != null)
            sb.append("ForecastedEvents: " + getForecastedEvents() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getDistanceUnit() != null)
            sb.append("DistanceUnit: " + getDistanceUnit() + ",");
        if (getSpeedUnit() != null)
            sb.append("SpeedUnit: " + getSpeedUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getForecastedEvents() == null) ? 0 : getForecastedEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getDistanceUnit() == null) ? 0 : getDistanceUnit().hashCode());
        hashCode = prime * hashCode + ((getSpeedUnit() == null) ? 0 : getSpeedUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForecastGeofenceEventsResult == false)
            return false;
        ForecastGeofenceEventsResult other = (ForecastGeofenceEventsResult) obj;

        if (other.getForecastedEvents() == null ^ this.getForecastedEvents() == null)
            return false;
        if (other.getForecastedEvents() != null
                && other.getForecastedEvents().equals(this.getForecastedEvents()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
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
        return true;
    }
}
