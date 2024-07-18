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

/**
 * <p>
 * A circle on the earth, as defined by a center point and a radius.
 * </p>
 */
public class Circle implements Serializable {
    /**
     * <p>
     * A single point geometry, specifying the center of the circle, using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a>
     * coordinates, in the form <code>[longitude, latitude]</code>.
     * </p>
     */
    private java.util.List<Double> center;

    /**
     * <p>
     * The radius of the circle in meters. Must be greater than zero and no
     * larger than 100,000 (100 kilometers).
     * </p>
     */
    private Double radius;

    /**
     * <p>
     * A single point geometry, specifying the center of the circle, using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a>
     * coordinates, in the form <code>[longitude, latitude]</code>.
     * </p>
     *
     * @return <p>
     *         A single point geometry, specifying the center of the circle,
     *         using <a
     *         href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS
     *         84</a> coordinates, in the form
     *         <code>[longitude, latitude]</code>.
     *         </p>
     */
    public java.util.List<Double> getCenter() {
        return center;
    }

    /**
     * <p>
     * A single point geometry, specifying the center of the circle, using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a>
     * coordinates, in the form <code>[longitude, latitude]</code>.
     * </p>
     *
     * @param center <p>
     *            A single point geometry, specifying the center of the circle,
     *            using <a
     *            href="https://gisgeography.com/wgs84-world-geodetic-system/"
     *            >WGS 84</a> coordinates, in the form
     *            <code>[longitude, latitude]</code>.
     *            </p>
     */
    public void setCenter(java.util.Collection<Double> center) {
        if (center == null) {
            this.center = null;
            return;
        }

        this.center = new java.util.ArrayList<Double>(center);
    }

    /**
     * <p>
     * A single point geometry, specifying the center of the circle, using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a>
     * coordinates, in the form <code>[longitude, latitude]</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param center <p>
     *            A single point geometry, specifying the center of the circle,
     *            using <a
     *            href="https://gisgeography.com/wgs84-world-geodetic-system/"
     *            >WGS 84</a> coordinates, in the form
     *            <code>[longitude, latitude]</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Circle withCenter(Double... center) {
        if (getCenter() == null) {
            this.center = new java.util.ArrayList<Double>(center.length);
        }
        for (Double value : center) {
            this.center.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A single point geometry, specifying the center of the circle, using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a>
     * coordinates, in the form <code>[longitude, latitude]</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param center <p>
     *            A single point geometry, specifying the center of the circle,
     *            using <a
     *            href="https://gisgeography.com/wgs84-world-geodetic-system/"
     *            >WGS 84</a> coordinates, in the form
     *            <code>[longitude, latitude]</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Circle withCenter(java.util.Collection<Double> center) {
        setCenter(center);
        return this;
    }

    /**
     * <p>
     * The radius of the circle in meters. Must be greater than zero and no
     * larger than 100,000 (100 kilometers).
     * </p>
     *
     * @return <p>
     *         The radius of the circle in meters. Must be greater than zero and
     *         no larger than 100,000 (100 kilometers).
     *         </p>
     */
    public Double getRadius() {
        return radius;
    }

    /**
     * <p>
     * The radius of the circle in meters. Must be greater than zero and no
     * larger than 100,000 (100 kilometers).
     * </p>
     *
     * @param radius <p>
     *            The radius of the circle in meters. Must be greater than zero
     *            and no larger than 100,000 (100 kilometers).
     *            </p>
     */
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    /**
     * <p>
     * The radius of the circle in meters. Must be greater than zero and no
     * larger than 100,000 (100 kilometers).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param radius <p>
     *            The radius of the circle in meters. Must be greater than zero
     *            and no larger than 100,000 (100 kilometers).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Circle withRadius(Double radius) {
        this.radius = radius;
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
        if (getCenter() != null)
            sb.append("Center: " + getCenter() + ",");
        if (getRadius() != null)
            sb.append("Radius: " + getRadius());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCenter() == null) ? 0 : getCenter().hashCode());
        hashCode = prime * hashCode + ((getRadius() == null) ? 0 : getRadius().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Circle == false)
            return false;
        Circle other = (Circle) obj;

        if (other.getCenter() == null ^ this.getCenter() == null)
            return false;
        if (other.getCenter() != null && other.getCenter().equals(this.getCenter()) == false)
            return false;
        if (other.getRadius() == null ^ this.getRadius() == null)
            return false;
        if (other.getRadius() != null && other.getRadius().equals(this.getRadius()) == false)
            return false;
        return true;
    }
}
