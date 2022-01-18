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
 * Returns the result of the route calculation. Metadata includes legs and route
 * summary.
 * </p>
 */
public class CalculateRouteResult implements Serializable {
    /**
     * <p>
     * Contains details about each path between a pair of positions included
     * along a route such as: <code>StartPosition</code>,
     * <code>EndPosition</code>, <code>Distance</code>,
     * <code>DurationSeconds</code>, <code>Geometry</code>, and
     * <code>Steps</code>. The number of legs returned corresponds to one fewer
     * than the total number of positions in the request.
     * </p>
     * <p>
     * For example, a route with a departure position and destination position
     * returns one leg with the positions <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * >snapped to a nearby road</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>StartPosition</code> is the departure position.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A route with a waypoint between the departure and destination position
     * returns two legs with the positions snapped to a nearby road:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Leg 1: The <code>StartPosition</code> is the departure position . The
     * <code>EndPosition</code> is the waypoint positon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Leg 2: The <code>StartPosition</code> is the waypoint position. The
     * <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Leg> legs;

    /**
     * <p>
     * Contains information about the whole route, such as:
     * <code>RouteBBox</code>, <code>DataSource</code>, <code>Distance</code>,
     * <code>DistanceUnit</code>, and <code>DurationSeconds</code>.
     * </p>
     */
    private CalculateRouteSummary summary;

    /**
     * <p>
     * Contains details about each path between a pair of positions included
     * along a route such as: <code>StartPosition</code>,
     * <code>EndPosition</code>, <code>Distance</code>,
     * <code>DurationSeconds</code>, <code>Geometry</code>, and
     * <code>Steps</code>. The number of legs returned corresponds to one fewer
     * than the total number of positions in the request.
     * </p>
     * <p>
     * For example, a route with a departure position and destination position
     * returns one leg with the positions <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * >snapped to a nearby road</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>StartPosition</code> is the departure position.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A route with a waypoint between the departure and destination position
     * returns two legs with the positions snapped to a nearby road:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Leg 1: The <code>StartPosition</code> is the departure position . The
     * <code>EndPosition</code> is the waypoint positon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Leg 2: The <code>StartPosition</code> is the waypoint position. The
     * <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Contains details about each path between a pair of positions
     *         included along a route such as: <code>StartPosition</code>,
     *         <code>EndPosition</code>, <code>Distance</code>,
     *         <code>DurationSeconds</code>, <code>Geometry</code>, and
     *         <code>Steps</code>. The number of legs returned corresponds to
     *         one fewer than the total number of positions in the request.
     *         </p>
     *         <p>
     *         For example, a route with a departure position and destination
     *         position returns one leg with the positions <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *         >snapped to a nearby road</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>StartPosition</code> is the departure position.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>EndPosition</code> is the destination position.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         A route with a waypoint between the departure and destination
     *         position returns two legs with the positions snapped to a nearby
     *         road:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Leg 1: The <code>StartPosition</code> is the departure position .
     *         The <code>EndPosition</code> is the waypoint positon.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Leg 2: The <code>StartPosition</code> is the waypoint position.
     *         The <code>EndPosition</code> is the destination position.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Leg> getLegs() {
        return legs;
    }

    /**
     * <p>
     * Contains details about each path between a pair of positions included
     * along a route such as: <code>StartPosition</code>,
     * <code>EndPosition</code>, <code>Distance</code>,
     * <code>DurationSeconds</code>, <code>Geometry</code>, and
     * <code>Steps</code>. The number of legs returned corresponds to one fewer
     * than the total number of positions in the request.
     * </p>
     * <p>
     * For example, a route with a departure position and destination position
     * returns one leg with the positions <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * >snapped to a nearby road</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>StartPosition</code> is the departure position.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A route with a waypoint between the departure and destination position
     * returns two legs with the positions snapped to a nearby road:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Leg 1: The <code>StartPosition</code> is the departure position . The
     * <code>EndPosition</code> is the waypoint positon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Leg 2: The <code>StartPosition</code> is the waypoint position. The
     * <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     *
     * @param legs <p>
     *            Contains details about each path between a pair of positions
     *            included along a route such as: <code>StartPosition</code>,
     *            <code>EndPosition</code>, <code>Distance</code>,
     *            <code>DurationSeconds</code>, <code>Geometry</code>, and
     *            <code>Steps</code>. The number of legs returned corresponds to
     *            one fewer than the total number of positions in the request.
     *            </p>
     *            <p>
     *            For example, a route with a departure position and destination
     *            position returns one leg with the positions <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *            >snapped to a nearby road</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The <code>StartPosition</code> is the departure position.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>EndPosition</code> is the destination position.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            A route with a waypoint between the departure and destination
     *            position returns two legs with the positions snapped to a
     *            nearby road:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Leg 1: The <code>StartPosition</code> is the departure
     *            position . The <code>EndPosition</code> is the waypoint
     *            positon.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Leg 2: The <code>StartPosition</code> is the waypoint
     *            position. The <code>EndPosition</code> is the destination
     *            position.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setLegs(java.util.Collection<Leg> legs) {
        if (legs == null) {
            this.legs = null;
            return;
        }

        this.legs = new java.util.ArrayList<Leg>(legs);
    }

    /**
     * <p>
     * Contains details about each path between a pair of positions included
     * along a route such as: <code>StartPosition</code>,
     * <code>EndPosition</code>, <code>Distance</code>,
     * <code>DurationSeconds</code>, <code>Geometry</code>, and
     * <code>Steps</code>. The number of legs returned corresponds to one fewer
     * than the total number of positions in the request.
     * </p>
     * <p>
     * For example, a route with a departure position and destination position
     * returns one leg with the positions <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * >snapped to a nearby road</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>StartPosition</code> is the departure position.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A route with a waypoint between the departure and destination position
     * returns two legs with the positions snapped to a nearby road:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Leg 1: The <code>StartPosition</code> is the departure position . The
     * <code>EndPosition</code> is the waypoint positon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Leg 2: The <code>StartPosition</code> is the waypoint position. The
     * <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param legs <p>
     *            Contains details about each path between a pair of positions
     *            included along a route such as: <code>StartPosition</code>,
     *            <code>EndPosition</code>, <code>Distance</code>,
     *            <code>DurationSeconds</code>, <code>Geometry</code>, and
     *            <code>Steps</code>. The number of legs returned corresponds to
     *            one fewer than the total number of positions in the request.
     *            </p>
     *            <p>
     *            For example, a route with a departure position and destination
     *            position returns one leg with the positions <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *            >snapped to a nearby road</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The <code>StartPosition</code> is the departure position.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>EndPosition</code> is the destination position.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            A route with a waypoint between the departure and destination
     *            position returns two legs with the positions snapped to a
     *            nearby road:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Leg 1: The <code>StartPosition</code> is the departure
     *            position . The <code>EndPosition</code> is the waypoint
     *            positon.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Leg 2: The <code>StartPosition</code> is the waypoint
     *            position. The <code>EndPosition</code> is the destination
     *            position.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteResult withLegs(Leg... legs) {
        if (getLegs() == null) {
            this.legs = new java.util.ArrayList<Leg>(legs.length);
        }
        for (Leg value : legs) {
            this.legs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains details about each path between a pair of positions included
     * along a route such as: <code>StartPosition</code>,
     * <code>EndPosition</code>, <code>Distance</code>,
     * <code>DurationSeconds</code>, <code>Geometry</code>, and
     * <code>Steps</code>. The number of legs returned corresponds to one fewer
     * than the total number of positions in the request.
     * </p>
     * <p>
     * For example, a route with a departure position and destination position
     * returns one leg with the positions <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     * >snapped to a nearby road</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>StartPosition</code> is the departure position.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A route with a waypoint between the departure and destination position
     * returns two legs with the positions snapped to a nearby road:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Leg 1: The <code>StartPosition</code> is the departure position . The
     * <code>EndPosition</code> is the waypoint positon.
     * </p>
     * </li>
     * <li>
     * <p>
     * Leg 2: The <code>StartPosition</code> is the waypoint position. The
     * <code>EndPosition</code> is the destination position.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param legs <p>
     *            Contains details about each path between a pair of positions
     *            included along a route such as: <code>StartPosition</code>,
     *            <code>EndPosition</code>, <code>Distance</code>,
     *            <code>DurationSeconds</code>, <code>Geometry</code>, and
     *            <code>Steps</code>. The number of legs returned corresponds to
     *            one fewer than the total number of positions in the request.
     *            </p>
     *            <p>
     *            For example, a route with a departure position and destination
     *            position returns one leg with the positions <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/snap-to-nearby-road.html"
     *            >snapped to a nearby road</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The <code>StartPosition</code> is the departure position.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>EndPosition</code> is the destination position.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            A route with a waypoint between the departure and destination
     *            position returns two legs with the positions snapped to a
     *            nearby road:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Leg 1: The <code>StartPosition</code> is the departure
     *            position . The <code>EndPosition</code> is the waypoint
     *            positon.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Leg 2: The <code>StartPosition</code> is the waypoint
     *            position. The <code>EndPosition</code> is the destination
     *            position.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteResult withLegs(java.util.Collection<Leg> legs) {
        setLegs(legs);
        return this;
    }

    /**
     * <p>
     * Contains information about the whole route, such as:
     * <code>RouteBBox</code>, <code>DataSource</code>, <code>Distance</code>,
     * <code>DistanceUnit</code>, and <code>DurationSeconds</code>.
     * </p>
     *
     * @return <p>
     *         Contains information about the whole route, such as:
     *         <code>RouteBBox</code>, <code>DataSource</code>,
     *         <code>Distance</code>, <code>DistanceUnit</code>, and
     *         <code>DurationSeconds</code>.
     *         </p>
     */
    public CalculateRouteSummary getSummary() {
        return summary;
    }

    /**
     * <p>
     * Contains information about the whole route, such as:
     * <code>RouteBBox</code>, <code>DataSource</code>, <code>Distance</code>,
     * <code>DistanceUnit</code>, and <code>DurationSeconds</code>.
     * </p>
     *
     * @param summary <p>
     *            Contains information about the whole route, such as:
     *            <code>RouteBBox</code>, <code>DataSource</code>,
     *            <code>Distance</code>, <code>DistanceUnit</code>, and
     *            <code>DurationSeconds</code>.
     *            </p>
     */
    public void setSummary(CalculateRouteSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Contains information about the whole route, such as:
     * <code>RouteBBox</code>, <code>DataSource</code>, <code>Distance</code>,
     * <code>DistanceUnit</code>, and <code>DurationSeconds</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summary <p>
     *            Contains information about the whole route, such as:
     *            <code>RouteBBox</code>, <code>DataSource</code>,
     *            <code>Distance</code>, <code>DistanceUnit</code>, and
     *            <code>DurationSeconds</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CalculateRouteResult withSummary(CalculateRouteSummary summary) {
        this.summary = summary;
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
        if (getLegs() != null)
            sb.append("Legs: " + getLegs() + ",");
        if (getSummary() != null)
            sb.append("Summary: " + getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLegs() == null) ? 0 : getLegs().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculateRouteResult == false)
            return false;
        CalculateRouteResult other = (CalculateRouteResult) obj;

        if (other.getLegs() == null ^ this.getLegs() == null)
            return false;
        if (other.getLegs() != null && other.getLegs().equals(this.getLegs()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }
}
