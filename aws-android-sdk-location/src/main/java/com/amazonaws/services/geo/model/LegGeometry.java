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
 * Contains the geometry details for each path between a pair of positions. Used
 * in plotting a route leg on a map.
 * </p>
 */
public class LegGeometry implements Serializable {
    /**
     * <p>
     * An ordered list of positions used to plot a route on a map.
     * </p>
     * <p>
     * The first position is closest to the start position for the leg, and the
     * last position is the closest to the end position for the leg.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example,
     * <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<java.util.List<Double>> lineString;

    /**
     * <p>
     * An ordered list of positions used to plot a route on a map.
     * </p>
     * <p>
     * The first position is closest to the start position for the leg, and the
     * last position is the closest to the end position for the leg.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example,
     * <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         An ordered list of positions used to plot a route on a map.
     *         </p>
     *         <p>
     *         The first position is closest to the start position for the leg,
     *         and the last position is the closest to the end position for the
     *         leg.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example,
     *         <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<java.util.List<Double>> getLineString() {
        return lineString;
    }

    /**
     * <p>
     * An ordered list of positions used to plot a route on a map.
     * </p>
     * <p>
     * The first position is closest to the start position for the leg, and the
     * last position is the closest to the end position for the leg.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example,
     * <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param lineString <p>
     *            An ordered list of positions used to plot a route on a map.
     *            </p>
     *            <p>
     *            The first position is closest to the start position for the
     *            leg, and the last position is the closest to the end position
     *            for the leg.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example,
     *            <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setLineString(java.util.Collection<java.util.List<Double>> lineString) {
        if (lineString == null) {
            this.lineString = null;
            return;
        }

        this.lineString = new java.util.ArrayList<java.util.List<Double>>(lineString);
    }

    /**
     * <p>
     * An ordered list of positions used to plot a route on a map.
     * </p>
     * <p>
     * The first position is closest to the start position for the leg, and the
     * last position is the closest to the end position for the leg.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example,
     * <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lineString <p>
     *            An ordered list of positions used to plot a route on a map.
     *            </p>
     *            <p>
     *            The first position is closest to the start position for the
     *            leg, and the last position is the closest to the end position
     *            for the leg.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example,
     *            <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LegGeometry withLineString(java.util.List<Double>... lineString) {
        if (getLineString() == null) {
            this.lineString = new java.util.ArrayList<java.util.List<Double>>(lineString.length);
        }
        for (java.util.List<Double> value : lineString) {
            this.lineString.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An ordered list of positions used to plot a route on a map.
     * </p>
     * <p>
     * The first position is closest to the start position for the leg, and the
     * last position is the closest to the end position for the leg.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example,
     * <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lineString <p>
     *            An ordered list of positions used to plot a route on a map.
     *            </p>
     *            <p>
     *            The first position is closest to the start position for the
     *            leg, and the last position is the closest to the end position
     *            for the leg.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For example,
     *            <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LegGeometry withLineString(java.util.Collection<java.util.List<Double>> lineString) {
        setLineString(lineString);
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
        if (getLineString() != null)
            sb.append("LineString: " + getLineString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineString() == null) ? 0 : getLineString().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LegGeometry == false)
            return false;
        LegGeometry other = (LegGeometry) obj;

        if (other.getLineString() == null ^ this.getLineString() == null)
            return false;
        if (other.getLineString() != null
                && other.getLineString().equals(this.getLineString()) == false)
            return false;
        return true;
    }
}
