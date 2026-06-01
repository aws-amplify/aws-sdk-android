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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * A geolocation target that you select to index. Each geolocation target
 * contains a <code>name</code> and <code>order</code> key-value pair that
 * specifies the geolocation target fields.
 * </p>
 */
public class GeoLocationTarget implements Serializable {
    /**
     * <p>
     * The <code>name</code> of the geolocation target field. If the target
     * field is part of a named shadow, you must select the named shadow using
     * the <code>namedShadow</code> filter.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The <code>order</code> of the geolocation target field. This field is
     * optional. The default value is <code>LatLon</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LatLon, LonLat
     */
    private String order;

    /**
     * <p>
     * The <code>name</code> of the geolocation target field. If the target
     * field is part of a named shadow, you must select the named shadow using
     * the <code>namedShadow</code> filter.
     * </p>
     *
     * @return <p>
     *         The <code>name</code> of the geolocation target field. If the
     *         target field is part of a named shadow, you must select the named
     *         shadow using the <code>namedShadow</code> filter.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The <code>name</code> of the geolocation target field. If the target
     * field is part of a named shadow, you must select the named shadow using
     * the <code>namedShadow</code> filter.
     * </p>
     *
     * @param name <p>
     *            The <code>name</code> of the geolocation target field. If the
     *            target field is part of a named shadow, you must select the
     *            named shadow using the <code>namedShadow</code> filter.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The <code>name</code> of the geolocation target field. If the target
     * field is part of a named shadow, you must select the named shadow using
     * the <code>namedShadow</code> filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The <code>name</code> of the geolocation target field. If the
     *            target field is part of a named shadow, you must select the
     *            named shadow using the <code>namedShadow</code> filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeoLocationTarget withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The <code>order</code> of the geolocation target field. This field is
     * optional. The default value is <code>LatLon</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LatLon, LonLat
     *
     * @return <p>
     *         The <code>order</code> of the geolocation target field. This
     *         field is optional. The default value is <code>LatLon</code>.
     *         </p>
     * @see TargetFieldOrder
     */
    public String getOrder() {
        return order;
    }

    /**
     * <p>
     * The <code>order</code> of the geolocation target field. This field is
     * optional. The default value is <code>LatLon</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LatLon, LonLat
     *
     * @param order <p>
     *            The <code>order</code> of the geolocation target field. This
     *            field is optional. The default value is <code>LatLon</code>.
     *            </p>
     * @see TargetFieldOrder
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * The <code>order</code> of the geolocation target field. This field is
     * optional. The default value is <code>LatLon</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LatLon, LonLat
     *
     * @param order <p>
     *            The <code>order</code> of the geolocation target field. This
     *            field is optional. The default value is <code>LatLon</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetFieldOrder
     */
    public GeoLocationTarget withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * <p>
     * The <code>order</code> of the geolocation target field. This field is
     * optional. The default value is <code>LatLon</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LatLon, LonLat
     *
     * @param order <p>
     *            The <code>order</code> of the geolocation target field. This
     *            field is optional. The default value is <code>LatLon</code>.
     *            </p>
     * @see TargetFieldOrder
     */
    public void setOrder(TargetFieldOrder order) {
        this.order = order.toString();
    }

    /**
     * <p>
     * The <code>order</code> of the geolocation target field. This field is
     * optional. The default value is <code>LatLon</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LatLon, LonLat
     *
     * @param order <p>
     *            The <code>order</code> of the geolocation target field. This
     *            field is optional. The default value is <code>LatLon</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetFieldOrder
     */
    public GeoLocationTarget withOrder(TargetFieldOrder order) {
        this.order = order.toString();
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getOrder() != null)
            sb.append("order: " + getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoLocationTarget == false)
            return false;
        GeoLocationTarget other = (GeoLocationTarget) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }
}
