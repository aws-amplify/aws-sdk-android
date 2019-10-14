/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the dimension settings for a segment.
 * </p>
 */
public class SegmentDimensions implements Serializable {
    /**
     * <p>
     * One or more custom attributes to use as criteria for the segment.
     * </p>
     */
    private java.util.Map<String, AttributeDimension> attributes;

    /**
     * <p>
     * The behavior-based criteria, such as how recently users have used your
     * app, for the segment.
     * </p>
     */
    private SegmentBehaviors behavior;

    /**
     * <p>
     * The demographic-based criteria, such as device platform, for the segment.
     * </p>
     */
    private SegmentDemographics demographic;

    /**
     * <p>
     * The location-based criteria, such as region or GPS coordinates, for the
     * segment.
     * </p>
     */
    private SegmentLocation location;

    /**
     * <p>
     * One or more custom metrics to use as criteria for the segment.
     * </p>
     */
    private java.util.Map<String, MetricDimension> metrics;

    /**
     * <p>
     * One or more custom user attributes to use as criteria for the segment.
     * </p>
     */
    private java.util.Map<String, AttributeDimension> userAttributes;

    /**
     * <p>
     * One or more custom attributes to use as criteria for the segment.
     * </p>
     *
     * @return <p>
     *         One or more custom attributes to use as criteria for the segment.
     *         </p>
     */
    public java.util.Map<String, AttributeDimension> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * One or more custom attributes to use as criteria for the segment.
     * </p>
     *
     * @param attributes <p>
     *            One or more custom attributes to use as criteria for the
     *            segment.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, AttributeDimension> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * One or more custom attributes to use as criteria for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            One or more custom attributes to use as criteria for the
     *            segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions withAttributes(java.util.Map<String, AttributeDimension> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * One or more custom attributes to use as criteria for the segment.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions addAttributesEntry(String key, AttributeDimension value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, AttributeDimension>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SegmentDimensions clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The behavior-based criteria, such as how recently users have used your
     * app, for the segment.
     * </p>
     *
     * @return <p>
     *         The behavior-based criteria, such as how recently users have used
     *         your app, for the segment.
     *         </p>
     */
    public SegmentBehaviors getBehavior() {
        return behavior;
    }

    /**
     * <p>
     * The behavior-based criteria, such as how recently users have used your
     * app, for the segment.
     * </p>
     *
     * @param behavior <p>
     *            The behavior-based criteria, such as how recently users have
     *            used your app, for the segment.
     *            </p>
     */
    public void setBehavior(SegmentBehaviors behavior) {
        this.behavior = behavior;
    }

    /**
     * <p>
     * The behavior-based criteria, such as how recently users have used your
     * app, for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param behavior <p>
     *            The behavior-based criteria, such as how recently users have
     *            used your app, for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions withBehavior(SegmentBehaviors behavior) {
        this.behavior = behavior;
        return this;
    }

    /**
     * <p>
     * The demographic-based criteria, such as device platform, for the segment.
     * </p>
     *
     * @return <p>
     *         The demographic-based criteria, such as device platform, for the
     *         segment.
     *         </p>
     */
    public SegmentDemographics getDemographic() {
        return demographic;
    }

    /**
     * <p>
     * The demographic-based criteria, such as device platform, for the segment.
     * </p>
     *
     * @param demographic <p>
     *            The demographic-based criteria, such as device platform, for
     *            the segment.
     *            </p>
     */
    public void setDemographic(SegmentDemographics demographic) {
        this.demographic = demographic;
    }

    /**
     * <p>
     * The demographic-based criteria, such as device platform, for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param demographic <p>
     *            The demographic-based criteria, such as device platform, for
     *            the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions withDemographic(SegmentDemographics demographic) {
        this.demographic = demographic;
        return this;
    }

    /**
     * <p>
     * The location-based criteria, such as region or GPS coordinates, for the
     * segment.
     * </p>
     *
     * @return <p>
     *         The location-based criteria, such as region or GPS coordinates,
     *         for the segment.
     *         </p>
     */
    public SegmentLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The location-based criteria, such as region or GPS coordinates, for the
     * segment.
     * </p>
     *
     * @param location <p>
     *            The location-based criteria, such as region or GPS
     *            coordinates, for the segment.
     *            </p>
     */
    public void setLocation(SegmentLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The location-based criteria, such as region or GPS coordinates, for the
     * segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The location-based criteria, such as region or GPS
     *            coordinates, for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions withLocation(SegmentLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * One or more custom metrics to use as criteria for the segment.
     * </p>
     *
     * @return <p>
     *         One or more custom metrics to use as criteria for the segment.
     *         </p>
     */
    public java.util.Map<String, MetricDimension> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * One or more custom metrics to use as criteria for the segment.
     * </p>
     *
     * @param metrics <p>
     *            One or more custom metrics to use as criteria for the segment.
     *            </p>
     */
    public void setMetrics(java.util.Map<String, MetricDimension> metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * One or more custom metrics to use as criteria for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            One or more custom metrics to use as criteria for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions withMetrics(java.util.Map<String, MetricDimension> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * <p>
     * One or more custom metrics to use as criteria for the segment.
     * </p>
     * <p>
     * The method adds a new key-value pair into Metrics parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Metrics.
     * @param value The corresponding value of the entry to be added into
     *            Metrics.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions addMetricsEntry(String key, MetricDimension value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, MetricDimension>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SegmentDimensions clearMetricsEntries() {
        this.metrics = null;
        return this;
    }

    /**
     * <p>
     * One or more custom user attributes to use as criteria for the segment.
     * </p>
     *
     * @return <p>
     *         One or more custom user attributes to use as criteria for the
     *         segment.
     *         </p>
     */
    public java.util.Map<String, AttributeDimension> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * One or more custom user attributes to use as criteria for the segment.
     * </p>
     *
     * @param userAttributes <p>
     *            One or more custom user attributes to use as criteria for the
     *            segment.
     *            </p>
     */
    public void setUserAttributes(java.util.Map<String, AttributeDimension> userAttributes) {
        this.userAttributes = userAttributes;
    }

    /**
     * <p>
     * One or more custom user attributes to use as criteria for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            One or more custom user attributes to use as criteria for the
     *            segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions withUserAttributes(
            java.util.Map<String, AttributeDimension> userAttributes) {
        this.userAttributes = userAttributes;
        return this;
    }

    /**
     * <p>
     * One or more custom user attributes to use as criteria for the segment.
     * </p>
     * <p>
     * The method adds a new key-value pair into UserAttributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into UserAttributes.
     * @param value The corresponding value of the entry to be added into
     *            UserAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions addUserAttributesEntry(String key, AttributeDimension value) {
        if (null == this.userAttributes) {
            this.userAttributes = new java.util.HashMap<String, AttributeDimension>();
        }
        if (this.userAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.userAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SegmentDimensions clearUserAttributesEntries() {
        this.userAttributes = null;
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
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getBehavior() != null)
            sb.append("Behavior: " + getBehavior() + ",");
        if (getDemographic() != null)
            sb.append("Demographic: " + getDemographic() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics() + ",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getBehavior() == null) ? 0 : getBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getDemographic() == null) ? 0 : getDemographic().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentDimensions == false)
            return false;
        SegmentDimensions other = (SegmentDimensions) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getBehavior() == null ^ this.getBehavior() == null)
            return false;
        if (other.getBehavior() != null && other.getBehavior().equals(this.getBehavior()) == false)
            return false;
        if (other.getDemographic() == null ^ this.getDemographic() == null)
            return false;
        if (other.getDemographic() != null
                && other.getDemographic().equals(this.getDemographic()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        return true;
    }
}
