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
 * Contains the geofence geometry details.
 * </p>
 * <p>
 * A geofence geometry is made up of either a polygon or a circle. Can be either
 * a polygon or a circle. Including both will return a validation error.
 * </p>
 * <note>
 * <p>
 * Amazon Location doesn't currently support polygons with holes, multipolygons,
 * polygons that are wound clockwise, or that cross the antimeridian.
 * </p>
 * </note>
 */
public class GeofenceGeometry implements Serializable {
    /**
     * <p>
     * A circle on the earth, as defined by a center point and a radius.
     * </p>
     */
    private Circle circle;

    /**
     * <p>
     * An array of 1 or more linear rings. A linear ring is an array of 4 or
     * more vertices, where the first and last vertex are the same to form a
     * closed boundary. Each vertex is a 2-dimensional point of the form:
     * <code>[longitude, latitude]</code>.
     * </p>
     * <p>
     * The first linear ring is an outer ring, describing the polygon's
     * boundary. Subsequent linear rings may be inner or outer rings to describe
     * holes and islands. Outer rings must list their vertices in
     * counter-clockwise order around the ring's center, where the left side is
     * the polygon's exterior. Inner rings must list their vertices in clockwise
     * order, where the left side is the polygon's interior.
     * </p>
     * <p>
     * A geofence polygon can consist of between 4 and 1,000 vertices.
     * </p>
     */
    private java.util.List<java.util.List<java.util.List<Double>>> polygon;

    /**
     * <p>
     * A circle on the earth, as defined by a center point and a radius.
     * </p>
     *
     * @return <p>
     *         A circle on the earth, as defined by a center point and a radius.
     *         </p>
     */
    public Circle getCircle() {
        return circle;
    }

    /**
     * <p>
     * A circle on the earth, as defined by a center point and a radius.
     * </p>
     *
     * @param circle <p>
     *            A circle on the earth, as defined by a center point and a
     *            radius.
     *            </p>
     */
    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    /**
     * <p>
     * A circle on the earth, as defined by a center point and a radius.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param circle <p>
     *            A circle on the earth, as defined by a center point and a
     *            radius.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeofenceGeometry withCircle(Circle circle) {
        this.circle = circle;
        return this;
    }

    /**
     * <p>
     * An array of 1 or more linear rings. A linear ring is an array of 4 or
     * more vertices, where the first and last vertex are the same to form a
     * closed boundary. Each vertex is a 2-dimensional point of the form:
     * <code>[longitude, latitude]</code>.
     * </p>
     * <p>
     * The first linear ring is an outer ring, describing the polygon's
     * boundary. Subsequent linear rings may be inner or outer rings to describe
     * holes and islands. Outer rings must list their vertices in
     * counter-clockwise order around the ring's center, where the left side is
     * the polygon's exterior. Inner rings must list their vertices in clockwise
     * order, where the left side is the polygon's interior.
     * </p>
     * <p>
     * A geofence polygon can consist of between 4 and 1,000 vertices.
     * </p>
     *
     * @return <p>
     *         An array of 1 or more linear rings. A linear ring is an array of
     *         4 or more vertices, where the first and last vertex are the same
     *         to form a closed boundary. Each vertex is a 2-dimensional point
     *         of the form: <code>[longitude, latitude]</code>.
     *         </p>
     *         <p>
     *         The first linear ring is an outer ring, describing the polygon's
     *         boundary. Subsequent linear rings may be inner or outer rings to
     *         describe holes and islands. Outer rings must list their vertices
     *         in counter-clockwise order around the ring's center, where the
     *         left side is the polygon's exterior. Inner rings must list their
     *         vertices in clockwise order, where the left side is the polygon's
     *         interior.
     *         </p>
     *         <p>
     *         A geofence polygon can consist of between 4 and 1,000 vertices.
     *         </p>
     */
    public java.util.List<java.util.List<java.util.List<Double>>> getPolygon() {
        return polygon;
    }

    /**
     * <p>
     * An array of 1 or more linear rings. A linear ring is an array of 4 or
     * more vertices, where the first and last vertex are the same to form a
     * closed boundary. Each vertex is a 2-dimensional point of the form:
     * <code>[longitude, latitude]</code>.
     * </p>
     * <p>
     * The first linear ring is an outer ring, describing the polygon's
     * boundary. Subsequent linear rings may be inner or outer rings to describe
     * holes and islands. Outer rings must list their vertices in
     * counter-clockwise order around the ring's center, where the left side is
     * the polygon's exterior. Inner rings must list their vertices in clockwise
     * order, where the left side is the polygon's interior.
     * </p>
     * <p>
     * A geofence polygon can consist of between 4 and 1,000 vertices.
     * </p>
     *
     * @param polygon <p>
     *            An array of 1 or more linear rings. A linear ring is an array
     *            of 4 or more vertices, where the first and last vertex are the
     *            same to form a closed boundary. Each vertex is a 2-dimensional
     *            point of the form: <code>[longitude, latitude]</code>.
     *            </p>
     *            <p>
     *            The first linear ring is an outer ring, describing the
     *            polygon's boundary. Subsequent linear rings may be inner or
     *            outer rings to describe holes and islands. Outer rings must
     *            list their vertices in counter-clockwise order around the
     *            ring's center, where the left side is the polygon's exterior.
     *            Inner rings must list their vertices in clockwise order, where
     *            the left side is the polygon's interior.
     *            </p>
     *            <p>
     *            A geofence polygon can consist of between 4 and 1,000
     *            vertices.
     *            </p>
     */
    public void setPolygon(java.util.Collection<java.util.List<java.util.List<Double>>> polygon) {
        if (polygon == null) {
            this.polygon = null;
            return;
        }

        this.polygon = new java.util.ArrayList<java.util.List<java.util.List<Double>>>(polygon);
    }

    /**
     * <p>
     * An array of 1 or more linear rings. A linear ring is an array of 4 or
     * more vertices, where the first and last vertex are the same to form a
     * closed boundary. Each vertex is a 2-dimensional point of the form:
     * <code>[longitude, latitude]</code>.
     * </p>
     * <p>
     * The first linear ring is an outer ring, describing the polygon's
     * boundary. Subsequent linear rings may be inner or outer rings to describe
     * holes and islands. Outer rings must list their vertices in
     * counter-clockwise order around the ring's center, where the left side is
     * the polygon's exterior. Inner rings must list their vertices in clockwise
     * order, where the left side is the polygon's interior.
     * </p>
     * <p>
     * A geofence polygon can consist of between 4 and 1,000 vertices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param polygon <p>
     *            An array of 1 or more linear rings. A linear ring is an array
     *            of 4 or more vertices, where the first and last vertex are the
     *            same to form a closed boundary. Each vertex is a 2-dimensional
     *            point of the form: <code>[longitude, latitude]</code>.
     *            </p>
     *            <p>
     *            The first linear ring is an outer ring, describing the
     *            polygon's boundary. Subsequent linear rings may be inner or
     *            outer rings to describe holes and islands. Outer rings must
     *            list their vertices in counter-clockwise order around the
     *            ring's center, where the left side is the polygon's exterior.
     *            Inner rings must list their vertices in clockwise order, where
     *            the left side is the polygon's interior.
     *            </p>
     *            <p>
     *            A geofence polygon can consist of between 4 and 1,000
     *            vertices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeofenceGeometry withPolygon(java.util.List<java.util.List<Double>>... polygon) {
        if (getPolygon() == null) {
            this.polygon = new java.util.ArrayList<java.util.List<java.util.List<Double>>>(
                    polygon.length);
        }
        for (java.util.List<java.util.List<Double>> value : polygon) {
            this.polygon.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of 1 or more linear rings. A linear ring is an array of 4 or
     * more vertices, where the first and last vertex are the same to form a
     * closed boundary. Each vertex is a 2-dimensional point of the form:
     * <code>[longitude, latitude]</code>.
     * </p>
     * <p>
     * The first linear ring is an outer ring, describing the polygon's
     * boundary. Subsequent linear rings may be inner or outer rings to describe
     * holes and islands. Outer rings must list their vertices in
     * counter-clockwise order around the ring's center, where the left side is
     * the polygon's exterior. Inner rings must list their vertices in clockwise
     * order, where the left side is the polygon's interior.
     * </p>
     * <p>
     * A geofence polygon can consist of between 4 and 1,000 vertices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param polygon <p>
     *            An array of 1 or more linear rings. A linear ring is an array
     *            of 4 or more vertices, where the first and last vertex are the
     *            same to form a closed boundary. Each vertex is a 2-dimensional
     *            point of the form: <code>[longitude, latitude]</code>.
     *            </p>
     *            <p>
     *            The first linear ring is an outer ring, describing the
     *            polygon's boundary. Subsequent linear rings may be inner or
     *            outer rings to describe holes and islands. Outer rings must
     *            list their vertices in counter-clockwise order around the
     *            ring's center, where the left side is the polygon's exterior.
     *            Inner rings must list their vertices in clockwise order, where
     *            the left side is the polygon's interior.
     *            </p>
     *            <p>
     *            A geofence polygon can consist of between 4 and 1,000
     *            vertices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeofenceGeometry withPolygon(
            java.util.Collection<java.util.List<java.util.List<Double>>> polygon) {
        setPolygon(polygon);
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
        if (getCircle() != null)
            sb.append("Circle: " + getCircle() + ",");
        if (getPolygon() != null)
            sb.append("Polygon: " + getPolygon());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCircle() == null) ? 0 : getCircle().hashCode());
        hashCode = prime * hashCode + ((getPolygon() == null) ? 0 : getPolygon().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeofenceGeometry == false)
            return false;
        GeofenceGeometry other = (GeofenceGeometry) obj;

        if (other.getCircle() == null ^ this.getCircle() == null)
            return false;
        if (other.getCircle() != null && other.getCircle().equals(this.getCircle()) == false)
            return false;
        if (other.getPolygon() == null ^ this.getPolygon() == null)
            return false;
        if (other.getPolygon() != null && other.getPolygon().equals(this.getPolygon()) == false)
            return false;
        return true;
    }
}
