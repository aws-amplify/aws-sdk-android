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
 * Contains the geofence geometry details.
 * </p>
 * <p>
 * A geofence geometry is made up of either a polygon or a circle. Can be a
 * polygon, a circle or a polygon encoded in Geobuf format. Including multiple
 * selections will return a validation error.
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
     * A polygon is a list of linear rings which are each made up of a list of
     * vertices.
     * </p>
     * <p>
     * Each vertex is a 2-dimensional point of the form:
     * <code>[longitude, latitude]</code>. This is represented as an array of
     * doubles of length 2 (so <code>[double, double]</code>).
     * </p>
     * <p>
     * An array of 4 or more vertices, where the first and last vertex are the
     * same (to form a closed boundary), is called a linear ring. The linear
     * ring vertices must be listed in counter-clockwise order around the ring’s
     * interior. The linear ring is represented as an array of vertices, or an
     * array of arrays of doubles (<code>[[double, double], ...]</code>).
     * </p>
     * <p>
     * A geofence consists of a single linear ring. To allow for future
     * expansion, the Polygon parameter takes an array of linear rings, which is
     * represented as an array of arrays of arrays of doubles (
     * <code>[[[double, double], ...], ...]</code>).
     * </p>
     * <p>
     * A linear ring for use in geofences can consist of between 4 and 1,000
     * vertices.
     * </p>
     */
    private java.util.List<java.util.List<java.util.List<Double>>> polygon;

    /**
     * <p>
     * A circle on the earth, as defined by a center point and a radius.
     * </p>
     */
    private Circle circle;

    /**
     * <p>
     * Geobuf is a compact binary encoding for geographic data that provides
     * lossless compression of GeoJSON polygons. The Geobuf must be
     * Base64-encoded.
     * </p>
     * <p>
     * A polygon in Geobuf format can have up to 100,000 vertices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 600000<br/>
     */
    private java.nio.ByteBuffer geobuf;

    /**
     * <p>
     * A polygon is a list of linear rings which are each made up of a list of
     * vertices.
     * </p>
     * <p>
     * Each vertex is a 2-dimensional point of the form:
     * <code>[longitude, latitude]</code>. This is represented as an array of
     * doubles of length 2 (so <code>[double, double]</code>).
     * </p>
     * <p>
     * An array of 4 or more vertices, where the first and last vertex are the
     * same (to form a closed boundary), is called a linear ring. The linear
     * ring vertices must be listed in counter-clockwise order around the ring’s
     * interior. The linear ring is represented as an array of vertices, or an
     * array of arrays of doubles (<code>[[double, double], ...]</code>).
     * </p>
     * <p>
     * A geofence consists of a single linear ring. To allow for future
     * expansion, the Polygon parameter takes an array of linear rings, which is
     * represented as an array of arrays of arrays of doubles (
     * <code>[[[double, double], ...], ...]</code>).
     * </p>
     * <p>
     * A linear ring for use in geofences can consist of between 4 and 1,000
     * vertices.
     * </p>
     *
     * @return <p>
     *         A polygon is a list of linear rings which are each made up of a
     *         list of vertices.
     *         </p>
     *         <p>
     *         Each vertex is a 2-dimensional point of the form:
     *         <code>[longitude, latitude]</code>. This is represented as an
     *         array of doubles of length 2 (so <code>[double, double]</code>).
     *         </p>
     *         <p>
     *         An array of 4 or more vertices, where the first and last vertex
     *         are the same (to form a closed boundary), is called a linear
     *         ring. The linear ring vertices must be listed in
     *         counter-clockwise order around the ring’s interior. The linear
     *         ring is represented as an array of vertices, or an array of
     *         arrays of doubles (<code>[[double, double], ...]</code>).
     *         </p>
     *         <p>
     *         A geofence consists of a single linear ring. To allow for future
     *         expansion, the Polygon parameter takes an array of linear rings,
     *         which is represented as an array of arrays of arrays of doubles (
     *         <code>[[[double, double], ...], ...]</code>).
     *         </p>
     *         <p>
     *         A linear ring for use in geofences can consist of between 4 and
     *         1,000 vertices.
     *         </p>
     */
    public java.util.List<java.util.List<java.util.List<Double>>> getPolygon() {
        return polygon;
    }

    /**
     * <p>
     * A polygon is a list of linear rings which are each made up of a list of
     * vertices.
     * </p>
     * <p>
     * Each vertex is a 2-dimensional point of the form:
     * <code>[longitude, latitude]</code>. This is represented as an array of
     * doubles of length 2 (so <code>[double, double]</code>).
     * </p>
     * <p>
     * An array of 4 or more vertices, where the first and last vertex are the
     * same (to form a closed boundary), is called a linear ring. The linear
     * ring vertices must be listed in counter-clockwise order around the ring’s
     * interior. The linear ring is represented as an array of vertices, or an
     * array of arrays of doubles (<code>[[double, double], ...]</code>).
     * </p>
     * <p>
     * A geofence consists of a single linear ring. To allow for future
     * expansion, the Polygon parameter takes an array of linear rings, which is
     * represented as an array of arrays of arrays of doubles (
     * <code>[[[double, double], ...], ...]</code>).
     * </p>
     * <p>
     * A linear ring for use in geofences can consist of between 4 and 1,000
     * vertices.
     * </p>
     *
     * @param polygon <p>
     *            A polygon is a list of linear rings which are each made up of
     *            a list of vertices.
     *            </p>
     *            <p>
     *            Each vertex is a 2-dimensional point of the form:
     *            <code>[longitude, latitude]</code>. This is represented as an
     *            array of doubles of length 2 (so <code>[double, double]</code>
     *            ).
     *            </p>
     *            <p>
     *            An array of 4 or more vertices, where the first and last
     *            vertex are the same (to form a closed boundary), is called a
     *            linear ring. The linear ring vertices must be listed in
     *            counter-clockwise order around the ring’s interior. The linear
     *            ring is represented as an array of vertices, or an array of
     *            arrays of doubles (<code>[[double, double], ...]</code>).
     *            </p>
     *            <p>
     *            A geofence consists of a single linear ring. To allow for
     *            future expansion, the Polygon parameter takes an array of
     *            linear rings, which is represented as an array of arrays of
     *            arrays of doubles (<code>[[[double, double], ...], ...]</code>
     *            ).
     *            </p>
     *            <p>
     *            A linear ring for use in geofences can consist of between 4
     *            and 1,000 vertices.
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
     * A polygon is a list of linear rings which are each made up of a list of
     * vertices.
     * </p>
     * <p>
     * Each vertex is a 2-dimensional point of the form:
     * <code>[longitude, latitude]</code>. This is represented as an array of
     * doubles of length 2 (so <code>[double, double]</code>).
     * </p>
     * <p>
     * An array of 4 or more vertices, where the first and last vertex are the
     * same (to form a closed boundary), is called a linear ring. The linear
     * ring vertices must be listed in counter-clockwise order around the ring’s
     * interior. The linear ring is represented as an array of vertices, or an
     * array of arrays of doubles (<code>[[double, double], ...]</code>).
     * </p>
     * <p>
     * A geofence consists of a single linear ring. To allow for future
     * expansion, the Polygon parameter takes an array of linear rings, which is
     * represented as an array of arrays of arrays of doubles (
     * <code>[[[double, double], ...], ...]</code>).
     * </p>
     * <p>
     * A linear ring for use in geofences can consist of between 4 and 1,000
     * vertices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param polygon <p>
     *            A polygon is a list of linear rings which are each made up of
     *            a list of vertices.
     *            </p>
     *            <p>
     *            Each vertex is a 2-dimensional point of the form:
     *            <code>[longitude, latitude]</code>. This is represented as an
     *            array of doubles of length 2 (so <code>[double, double]</code>
     *            ).
     *            </p>
     *            <p>
     *            An array of 4 or more vertices, where the first and last
     *            vertex are the same (to form a closed boundary), is called a
     *            linear ring. The linear ring vertices must be listed in
     *            counter-clockwise order around the ring’s interior. The linear
     *            ring is represented as an array of vertices, or an array of
     *            arrays of doubles (<code>[[double, double], ...]</code>).
     *            </p>
     *            <p>
     *            A geofence consists of a single linear ring. To allow for
     *            future expansion, the Polygon parameter takes an array of
     *            linear rings, which is represented as an array of arrays of
     *            arrays of doubles (<code>[[[double, double], ...], ...]</code>
     *            ).
     *            </p>
     *            <p>
     *            A linear ring for use in geofences can consist of between 4
     *            and 1,000 vertices.
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
     * A polygon is a list of linear rings which are each made up of a list of
     * vertices.
     * </p>
     * <p>
     * Each vertex is a 2-dimensional point of the form:
     * <code>[longitude, latitude]</code>. This is represented as an array of
     * doubles of length 2 (so <code>[double, double]</code>).
     * </p>
     * <p>
     * An array of 4 or more vertices, where the first and last vertex are the
     * same (to form a closed boundary), is called a linear ring. The linear
     * ring vertices must be listed in counter-clockwise order around the ring’s
     * interior. The linear ring is represented as an array of vertices, or an
     * array of arrays of doubles (<code>[[double, double], ...]</code>).
     * </p>
     * <p>
     * A geofence consists of a single linear ring. To allow for future
     * expansion, the Polygon parameter takes an array of linear rings, which is
     * represented as an array of arrays of arrays of doubles (
     * <code>[[[double, double], ...], ...]</code>).
     * </p>
     * <p>
     * A linear ring for use in geofences can consist of between 4 and 1,000
     * vertices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param polygon <p>
     *            A polygon is a list of linear rings which are each made up of
     *            a list of vertices.
     *            </p>
     *            <p>
     *            Each vertex is a 2-dimensional point of the form:
     *            <code>[longitude, latitude]</code>. This is represented as an
     *            array of doubles of length 2 (so <code>[double, double]</code>
     *            ).
     *            </p>
     *            <p>
     *            An array of 4 or more vertices, where the first and last
     *            vertex are the same (to form a closed boundary), is called a
     *            linear ring. The linear ring vertices must be listed in
     *            counter-clockwise order around the ring’s interior. The linear
     *            ring is represented as an array of vertices, or an array of
     *            arrays of doubles (<code>[[double, double], ...]</code>).
     *            </p>
     *            <p>
     *            A geofence consists of a single linear ring. To allow for
     *            future expansion, the Polygon parameter takes an array of
     *            linear rings, which is represented as an array of arrays of
     *            arrays of doubles (<code>[[[double, double], ...], ...]</code>
     *            ).
     *            </p>
     *            <p>
     *            A linear ring for use in geofences can consist of between 4
     *            and 1,000 vertices.
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
     * Geobuf is a compact binary encoding for geographic data that provides
     * lossless compression of GeoJSON polygons. The Geobuf must be
     * Base64-encoded.
     * </p>
     * <p>
     * A polygon in Geobuf format can have up to 100,000 vertices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 600000<br/>
     *
     * @return <p>
     *         Geobuf is a compact binary encoding for geographic data that
     *         provides lossless compression of GeoJSON polygons. The Geobuf
     *         must be Base64-encoded.
     *         </p>
     *         <p>
     *         A polygon in Geobuf format can have up to 100,000 vertices.
     *         </p>
     */
    public java.nio.ByteBuffer getGeobuf() {
        return geobuf;
    }

    /**
     * <p>
     * Geobuf is a compact binary encoding for geographic data that provides
     * lossless compression of GeoJSON polygons. The Geobuf must be
     * Base64-encoded.
     * </p>
     * <p>
     * A polygon in Geobuf format can have up to 100,000 vertices.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 600000<br/>
     *
     * @param geobuf <p>
     *            Geobuf is a compact binary encoding for geographic data that
     *            provides lossless compression of GeoJSON polygons. The Geobuf
     *            must be Base64-encoded.
     *            </p>
     *            <p>
     *            A polygon in Geobuf format can have up to 100,000 vertices.
     *            </p>
     */
    public void setGeobuf(java.nio.ByteBuffer geobuf) {
        this.geobuf = geobuf;
    }

    /**
     * <p>
     * Geobuf is a compact binary encoding for geographic data that provides
     * lossless compression of GeoJSON polygons. The Geobuf must be
     * Base64-encoded.
     * </p>
     * <p>
     * A polygon in Geobuf format can have up to 100,000 vertices.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 600000<br/>
     *
     * @param geobuf <p>
     *            Geobuf is a compact binary encoding for geographic data that
     *            provides lossless compression of GeoJSON polygons. The Geobuf
     *            must be Base64-encoded.
     *            </p>
     *            <p>
     *            A polygon in Geobuf format can have up to 100,000 vertices.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeofenceGeometry withGeobuf(java.nio.ByteBuffer geobuf) {
        this.geobuf = geobuf;
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
        if (getPolygon() != null)
            sb.append("Polygon: " + getPolygon() + ",");
        if (getCircle() != null)
            sb.append("Circle: " + getCircle() + ",");
        if (getGeobuf() != null)
            sb.append("Geobuf: " + getGeobuf());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolygon() == null) ? 0 : getPolygon().hashCode());
        hashCode = prime * hashCode + ((getCircle() == null) ? 0 : getCircle().hashCode());
        hashCode = prime * hashCode + ((getGeobuf() == null) ? 0 : getGeobuf().hashCode());
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

        if (other.getPolygon() == null ^ this.getPolygon() == null)
            return false;
        if (other.getPolygon() != null && other.getPolygon().equals(this.getPolygon()) == false)
            return false;
        if (other.getCircle() == null ^ this.getCircle() == null)
            return false;
        if (other.getCircle() != null && other.getCircle().equals(this.getCircle()) == false)
            return false;
        if (other.getGeobuf() == null ^ this.getGeobuf() == null)
            return false;
        if (other.getGeobuf() != null && other.getGeobuf().equals(this.getGeobuf()) == false)
            return false;
        return true;
    }
}
