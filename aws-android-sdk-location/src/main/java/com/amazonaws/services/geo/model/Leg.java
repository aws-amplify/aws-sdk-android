/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains the calculated route's details for each path between a pair of
 * positions. The number of legs returned corresponds to one fewer than the
 * total number of positions in the request.
 * </p>
 * <p>
 * For example, a route with a departure position and destination position
 * returns one leg with the positions <a href=
 * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
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
public class Leg implements Serializable {
    /**
     * <p>
     * The distance between the leg's <code>StartPosition</code> and
     * <code>EndPosition</code> along a calculated route.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The default measurement is <code>Kilometers</code> unless the request
     * specifies a <code>DistanceUnit</code> of <code>Miles</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double distance;

    /**
     * <p>
     * The estimated travel time between the leg's <code>StartPosition</code>
     * and <code>EndPosition</code>. The travel mode and departure time that you
     * specify in the request determines the calculated time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double durationSeconds;

    /**
     * <p>
     * The terminating position of the leg. Follows the format
     * <code>[longitude,latitude]</code>.
     * </p>
     * <note>
     * <p>
     * If the <code>EndPosition</code> isn't located on a road, it's <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     * >snapped to a nearby road</a>.
     * </p>
     * </note>
     */
    private java.util.List<Double> endPosition;

    /**
     * <p>
     * Contains the calculated route's path as a linestring geometry.
     * </p>
     */
    private LegGeometry geometry;

    /**
     * <p>
     * The starting position of the leg. Follows the format
     * <code>[longitude,latitude]</code>.
     * </p>
     * <note>
     * <p>
     * If the <code>StartPosition</code> isn't located on a road, it's <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     * >snapped to a nearby road</a>.
     * </p>
     * </note>
     */
    private java.util.List<Double> startPosition;

    /**
     * <p>
     * Contains a list of steps, which represent subsections of a leg. Each step
     * provides instructions for how to move to the next step in the leg such as
     * the step's start position, end position, travel distance, travel
     * duration, and geometry offset.
     * </p>
     */
    private java.util.List<Step> steps;

    /**
     * <p>
     * The distance between the leg's <code>StartPosition</code> and
     * <code>EndPosition</code> along a calculated route.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The default measurement is <code>Kilometers</code> unless the request
     * specifies a <code>DistanceUnit</code> of <code>Miles</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The distance between the leg's <code>StartPosition</code> and
     *         <code>EndPosition</code> along a calculated route.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The default measurement is <code>Kilometers</code> unless the
     *         request specifies a <code>DistanceUnit</code> of
     *         <code>Miles</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * <p>
     * The distance between the leg's <code>StartPosition</code> and
     * <code>EndPosition</code> along a calculated route.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The default measurement is <code>Kilometers</code> unless the request
     * specifies a <code>DistanceUnit</code> of <code>Miles</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param distance <p>
     *            The distance between the leg's <code>StartPosition</code> and
     *            <code>EndPosition</code> along a calculated route.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The default measurement is <code>Kilometers</code> unless the
     *            request specifies a <code>DistanceUnit</code> of
     *            <code>Miles</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    /**
     * <p>
     * The distance between the leg's <code>StartPosition</code> and
     * <code>EndPosition</code> along a calculated route.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The default measurement is <code>Kilometers</code> unless the request
     * specifies a <code>DistanceUnit</code> of <code>Miles</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param distance <p>
     *            The distance between the leg's <code>StartPosition</code> and
     *            <code>EndPosition</code> along a calculated route.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The default measurement is <code>Kilometers</code> unless the
     *            request specifies a <code>DistanceUnit</code> of
     *            <code>Miles</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Leg withDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    /**
     * <p>
     * The estimated travel time between the leg's <code>StartPosition</code>
     * and <code>EndPosition</code>. The travel mode and departure time that you
     * specify in the request determines the calculated time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The estimated travel time between the leg's
     *         <code>StartPosition</code> and <code>EndPosition</code>. The
     *         travel mode and departure time that you specify in the request
     *         determines the calculated time.
     *         </p>
     */
    public Double getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * The estimated travel time between the leg's <code>StartPosition</code>
     * and <code>EndPosition</code>. The travel mode and departure time that you
     * specify in the request determines the calculated time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationSeconds <p>
     *            The estimated travel time between the leg's
     *            <code>StartPosition</code> and <code>EndPosition</code>. The
     *            travel mode and departure time that you specify in the request
     *            determines the calculated time.
     *            </p>
     */
    public void setDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The estimated travel time between the leg's <code>StartPosition</code>
     * and <code>EndPosition</code>. The travel mode and departure time that you
     * specify in the request determines the calculated time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationSeconds <p>
     *            The estimated travel time between the leg's
     *            <code>StartPosition</code> and <code>EndPosition</code>. The
     *            travel mode and departure time that you specify in the request
     *            determines the calculated time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Leg withDurationSeconds(Double durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * <p>
     * The terminating position of the leg. Follows the format
     * <code>[longitude,latitude]</code>.
     * </p>
     * <note>
     * <p>
     * If the <code>EndPosition</code> isn't located on a road, it's <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     * >snapped to a nearby road</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The terminating position of the leg. Follows the format
     *         <code>[longitude,latitude]</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If the <code>EndPosition</code> isn't located on a road, it's <a
     *         href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *         >snapped to a nearby road</a>.
     *         </p>
     *         </note>
     */
    public java.util.List<Double> getEndPosition() {
        return endPosition;
    }

    /**
     * <p>
     * The terminating position of the leg. Follows the format
     * <code>[longitude,latitude]</code>.
     * </p>
     * <note>
     * <p>
     * If the <code>EndPosition</code> isn't located on a road, it's <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     * >snapped to a nearby road</a>.
     * </p>
     * </note>
     *
     * @param endPosition <p>
     *            The terminating position of the leg. Follows the format
     *            <code>[longitude,latitude]</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If the <code>EndPosition</code> isn't located on a road, it's
     *            <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *            >snapped to a nearby road</a>.
     *            </p>
     *            </note>
     */
    public void setEndPosition(java.util.Collection<Double> endPosition) {
        if (endPosition == null) {
            this.endPosition = null;
            return;
        }

        this.endPosition = new java.util.ArrayList<Double>(endPosition);
    }

    /**
     * <p>
     * The terminating position of the leg. Follows the format
     * <code>[longitude,latitude]</code>.
     * </p>
     * <note>
     * <p>
     * If the <code>EndPosition</code> isn't located on a road, it's <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     * >snapped to a nearby road</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endPosition <p>
     *            The terminating position of the leg. Follows the format
     *            <code>[longitude,latitude]</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If the <code>EndPosition</code> isn't located on a road, it's
     *            <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *            >snapped to a nearby road</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Leg withEndPosition(Double... endPosition) {
        if (getEndPosition() == null) {
            this.endPosition = new java.util.ArrayList<Double>(endPosition.length);
        }
        for (Double value : endPosition) {
            this.endPosition.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The terminating position of the leg. Follows the format
     * <code>[longitude,latitude]</code>.
     * </p>
     * <note>
     * <p>
     * If the <code>EndPosition</code> isn't located on a road, it's <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     * >snapped to a nearby road</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endPosition <p>
     *            The terminating position of the leg. Follows the format
     *            <code>[longitude,latitude]</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If the <code>EndPosition</code> isn't located on a road, it's
     *            <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *            >snapped to a nearby road</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Leg withEndPosition(java.util.Collection<Double> endPosition) {
        setEndPosition(endPosition);
        return this;
    }

    /**
     * <p>
     * Contains the calculated route's path as a linestring geometry.
     * </p>
     *
     * @return <p>
     *         Contains the calculated route's path as a linestring geometry.
     *         </p>
     */
    public LegGeometry getGeometry() {
        return geometry;
    }

    /**
     * <p>
     * Contains the calculated route's path as a linestring geometry.
     * </p>
     *
     * @param geometry <p>
     *            Contains the calculated route's path as a linestring geometry.
     *            </p>
     */
    public void setGeometry(LegGeometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Contains the calculated route's path as a linestring geometry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geometry <p>
     *            Contains the calculated route's path as a linestring geometry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Leg withGeometry(LegGeometry geometry) {
        this.geometry = geometry;
        return this;
    }

    /**
     * <p>
     * The starting position of the leg. Follows the format
     * <code>[longitude,latitude]</code>.
     * </p>
     * <note>
     * <p>
     * If the <code>StartPosition</code> isn't located on a road, it's <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     * >snapped to a nearby road</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The starting position of the leg. Follows the format
     *         <code>[longitude,latitude]</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If the <code>StartPosition</code> isn't located on a road, it's
     *         <a href=
     *         "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *         >snapped to a nearby road</a>.
     *         </p>
     *         </note>
     */
    public java.util.List<Double> getStartPosition() {
        return startPosition;
    }

    /**
     * <p>
     * The starting position of the leg. Follows the format
     * <code>[longitude,latitude]</code>.
     * </p>
     * <note>
     * <p>
     * If the <code>StartPosition</code> isn't located on a road, it's <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     * >snapped to a nearby road</a>.
     * </p>
     * </note>
     *
     * @param startPosition <p>
     *            The starting position of the leg. Follows the format
     *            <code>[longitude,latitude]</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If the <code>StartPosition</code> isn't located on a road,
     *            it's <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *            >snapped to a nearby road</a>.
     *            </p>
     *            </note>
     */
    public void setStartPosition(java.util.Collection<Double> startPosition) {
        if (startPosition == null) {
            this.startPosition = null;
            return;
        }

        this.startPosition = new java.util.ArrayList<Double>(startPosition);
    }

    /**
     * <p>
     * The starting position of the leg. Follows the format
     * <code>[longitude,latitude]</code>.
     * </p>
     * <note>
     * <p>
     * If the <code>StartPosition</code> isn't located on a road, it's <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     * >snapped to a nearby road</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startPosition <p>
     *            The starting position of the leg. Follows the format
     *            <code>[longitude,latitude]</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If the <code>StartPosition</code> isn't located on a road,
     *            it's <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *            >snapped to a nearby road</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Leg withStartPosition(Double... startPosition) {
        if (getStartPosition() == null) {
            this.startPosition = new java.util.ArrayList<Double>(startPosition.length);
        }
        for (Double value : startPosition) {
            this.startPosition.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The starting position of the leg. Follows the format
     * <code>[longitude,latitude]</code>.
     * </p>
     * <note>
     * <p>
     * If the <code>StartPosition</code> isn't located on a road, it's <a href=
     * "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     * >snapped to a nearby road</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startPosition <p>
     *            The starting position of the leg. Follows the format
     *            <code>[longitude,latitude]</code>.
     *            </p>
     *            <note>
     *            <p>
     *            If the <code>StartPosition</code> isn't located on a road,
     *            it's <a href=
     *            "https://docs.aws.amazon.com/location/latest/developerguide/calculate-route.html#snap-to-nearby-road"
     *            >snapped to a nearby road</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Leg withStartPosition(java.util.Collection<Double> startPosition) {
        setStartPosition(startPosition);
        return this;
    }

    /**
     * <p>
     * Contains a list of steps, which represent subsections of a leg. Each step
     * provides instructions for how to move to the next step in the leg such as
     * the step's start position, end position, travel distance, travel
     * duration, and geometry offset.
     * </p>
     *
     * @return <p>
     *         Contains a list of steps, which represent subsections of a leg.
     *         Each step provides instructions for how to move to the next step
     *         in the leg such as the step's start position, end position,
     *         travel distance, travel duration, and geometry offset.
     *         </p>
     */
    public java.util.List<Step> getSteps() {
        return steps;
    }

    /**
     * <p>
     * Contains a list of steps, which represent subsections of a leg. Each step
     * provides instructions for how to move to the next step in the leg such as
     * the step's start position, end position, travel distance, travel
     * duration, and geometry offset.
     * </p>
     *
     * @param steps <p>
     *            Contains a list of steps, which represent subsections of a
     *            leg. Each step provides instructions for how to move to the
     *            next step in the leg such as the step's start position, end
     *            position, travel distance, travel duration, and geometry
     *            offset.
     *            </p>
     */
    public void setSteps(java.util.Collection<Step> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<Step>(steps);
    }

    /**
     * <p>
     * Contains a list of steps, which represent subsections of a leg. Each step
     * provides instructions for how to move to the next step in the leg such as
     * the step's start position, end position, travel distance, travel
     * duration, and geometry offset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param steps <p>
     *            Contains a list of steps, which represent subsections of a
     *            leg. Each step provides instructions for how to move to the
     *            next step in the leg such as the step's start position, end
     *            position, travel distance, travel duration, and geometry
     *            offset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Leg withSteps(Step... steps) {
        if (getSteps() == null) {
            this.steps = new java.util.ArrayList<Step>(steps.length);
        }
        for (Step value : steps) {
            this.steps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of steps, which represent subsections of a leg. Each step
     * provides instructions for how to move to the next step in the leg such as
     * the step's start position, end position, travel distance, travel
     * duration, and geometry offset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param steps <p>
     *            Contains a list of steps, which represent subsections of a
     *            leg. Each step provides instructions for how to move to the
     *            next step in the leg such as the step's start position, end
     *            position, travel distance, travel duration, and geometry
     *            offset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Leg withSteps(java.util.Collection<Step> steps) {
        setSteps(steps);
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
        if (getDistance() != null)
            sb.append("Distance: " + getDistance() + ",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds() + ",");
        if (getEndPosition() != null)
            sb.append("EndPosition: " + getEndPosition() + ",");
        if (getGeometry() != null)
            sb.append("Geometry: " + getGeometry() + ",");
        if (getStartPosition() != null)
            sb.append("StartPosition: " + getStartPosition() + ",");
        if (getSteps() != null)
            sb.append("Steps: " + getSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistance() == null) ? 0 : getDistance().hashCode());
        hashCode = prime * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getEndPosition() == null) ? 0 : getEndPosition().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode
                + ((getStartPosition() == null) ? 0 : getStartPosition().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Leg == false)
            return false;
        Leg other = (Leg) obj;

        if (other.getDistance() == null ^ this.getDistance() == null)
            return false;
        if (other.getDistance() != null && other.getDistance().equals(this.getDistance()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getEndPosition() == null ^ this.getEndPosition() == null)
            return false;
        if (other.getEndPosition() != null
                && other.getEndPosition().equals(this.getEndPosition()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getStartPosition() == null ^ this.getStartPosition() == null)
            return false;
        if (other.getStartPosition() != null
                && other.getStartPosition().equals(this.getStartPosition()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        return true;
    }
}
