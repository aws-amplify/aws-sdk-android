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
 * Provides additional selections for named shadows and geolocation data.
 * </p>
 * <p>
 * To add named shadows to your fleet indexing configuration, set
 * <code>namedShadowIndexingMode</code> to be ON and specify your shadow names
 * in <code>namedShadowNames</code> filter.
 * </p>
 * <p>
 * To add geolocation data to your fleet indexing configuration:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you store geolocation data in a class/unnamed shadow, set
 * <code>thingIndexingMode</code> to be <code>REGISTRY_AND_SHADOW</code> and
 * specify your geolocation data in <code>geoLocations</code> filter.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you store geolocation data in a named shadow, set
 * <code>namedShadowIndexingMode</code> to be <code>ON</code>, add the shadow
 * name in <code>namedShadowNames</code> filter, and specify your geolocation
 * data in <code>geoLocations</code> filter. For more information, see <a href=
 * "https://docs.aws.amazon.com/iot/latest/developerguide/managing-fleet-index.html"
 * >Managing fleet indexing</a>.
 * </p>
 * </li>
 * </ul>
 */
public class IndexingFilter implements Serializable {
    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of
     * shadow names for indexing is 10. To increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     */
    private java.util.List<String> namedShadowNames;

    /**
     * <p>
     * The list of geolocation targets that you select to index. The default
     * maximum number of geolocation targets for indexing is <code>1</code>. To
     * increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     */
    private java.util.List<GeoLocationTarget> geoLocations;

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of
     * shadow names for indexing is 10. To increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     *
     * @return <p>
     *         The shadow names that you select to index. The default maximum
     *         number of shadow names for indexing is 10. To increase the limit,
     *         see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *         >Amazon Web Services IoT Device Management Quotas</a> in the
     *         <i>Amazon Web Services General Reference</i>.
     *         </p>
     */
    public java.util.List<String> getNamedShadowNames() {
        return namedShadowNames;
    }

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of
     * shadow names for indexing is 10. To increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     *
     * @param namedShadowNames <p>
     *            The shadow names that you select to index. The default maximum
     *            number of shadow names for indexing is 10. To increase the
     *            limit, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *            >Amazon Web Services IoT Device Management Quotas</a> in the
     *            <i>Amazon Web Services General Reference</i>.
     *            </p>
     */
    public void setNamedShadowNames(java.util.Collection<String> namedShadowNames) {
        if (namedShadowNames == null) {
            this.namedShadowNames = null;
            return;
        }

        this.namedShadowNames = new java.util.ArrayList<String>(namedShadowNames);
    }

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of
     * shadow names for indexing is 10. To increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namedShadowNames <p>
     *            The shadow names that you select to index. The default maximum
     *            number of shadow names for indexing is 10. To increase the
     *            limit, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *            >Amazon Web Services IoT Device Management Quotas</a> in the
     *            <i>Amazon Web Services General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexingFilter withNamedShadowNames(String... namedShadowNames) {
        if (getNamedShadowNames() == null) {
            this.namedShadowNames = new java.util.ArrayList<String>(namedShadowNames.length);
        }
        for (String value : namedShadowNames) {
            this.namedShadowNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of
     * shadow names for indexing is 10. To increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namedShadowNames <p>
     *            The shadow names that you select to index. The default maximum
     *            number of shadow names for indexing is 10. To increase the
     *            limit, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *            >Amazon Web Services IoT Device Management Quotas</a> in the
     *            <i>Amazon Web Services General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexingFilter withNamedShadowNames(java.util.Collection<String> namedShadowNames) {
        setNamedShadowNames(namedShadowNames);
        return this;
    }

    /**
     * <p>
     * The list of geolocation targets that you select to index. The default
     * maximum number of geolocation targets for indexing is <code>1</code>. To
     * increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     *
     * @return <p>
     *         The list of geolocation targets that you select to index. The
     *         default maximum number of geolocation targets for indexing is
     *         <code>1</code>. To increase the limit, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *         >Amazon Web Services IoT Device Management Quotas</a> in the
     *         <i>Amazon Web Services General Reference</i>.
     *         </p>
     */
    public java.util.List<GeoLocationTarget> getGeoLocations() {
        return geoLocations;
    }

    /**
     * <p>
     * The list of geolocation targets that you select to index. The default
     * maximum number of geolocation targets for indexing is <code>1</code>. To
     * increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     *
     * @param geoLocations <p>
     *            The list of geolocation targets that you select to index. The
     *            default maximum number of geolocation targets for indexing is
     *            <code>1</code>. To increase the limit, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *            >Amazon Web Services IoT Device Management Quotas</a> in the
     *            <i>Amazon Web Services General Reference</i>.
     *            </p>
     */
    public void setGeoLocations(java.util.Collection<GeoLocationTarget> geoLocations) {
        if (geoLocations == null) {
            this.geoLocations = null;
            return;
        }

        this.geoLocations = new java.util.ArrayList<GeoLocationTarget>(geoLocations);
    }

    /**
     * <p>
     * The list of geolocation targets that you select to index. The default
     * maximum number of geolocation targets for indexing is <code>1</code>. To
     * increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geoLocations <p>
     *            The list of geolocation targets that you select to index. The
     *            default maximum number of geolocation targets for indexing is
     *            <code>1</code>. To increase the limit, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *            >Amazon Web Services IoT Device Management Quotas</a> in the
     *            <i>Amazon Web Services General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexingFilter withGeoLocations(GeoLocationTarget... geoLocations) {
        if (getGeoLocations() == null) {
            this.geoLocations = new java.util.ArrayList<GeoLocationTarget>(geoLocations.length);
        }
        for (GeoLocationTarget value : geoLocations) {
            this.geoLocations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of geolocation targets that you select to index. The default
     * maximum number of geolocation targets for indexing is <code>1</code>. To
     * increase the limit, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     * >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon
     * Web Services General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geoLocations <p>
     *            The list of geolocation targets that you select to index. The
     *            default maximum number of geolocation targets for indexing is
     *            <code>1</code>. To increase the limit, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *            >Amazon Web Services IoT Device Management Quotas</a> in the
     *            <i>Amazon Web Services General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexingFilter withGeoLocations(java.util.Collection<GeoLocationTarget> geoLocations) {
        setGeoLocations(geoLocations);
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
        if (getNamedShadowNames() != null)
            sb.append("namedShadowNames: " + getNamedShadowNames() + ",");
        if (getGeoLocations() != null)
            sb.append("geoLocations: " + getGeoLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNamedShadowNames() == null) ? 0 : getNamedShadowNames().hashCode());
        hashCode = prime * hashCode
                + ((getGeoLocations() == null) ? 0 : getGeoLocations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexingFilter == false)
            return false;
        IndexingFilter other = (IndexingFilter) obj;

        if (other.getNamedShadowNames() == null ^ this.getNamedShadowNames() == null)
            return false;
        if (other.getNamedShadowNames() != null
                && other.getNamedShadowNames().equals(this.getNamedShadowNames()) == false)
            return false;
        if (other.getGeoLocations() == null ^ this.getGeoLocations() == null)
            return false;
        if (other.getGeoLocations() != null
                && other.getGeoLocations().equals(this.getGeoLocations()) == false)
            return false;
        return true;
    }
}
