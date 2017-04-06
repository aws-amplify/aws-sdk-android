/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class SegmentDimensions implements Serializable {
    /**
     * Custom segment attributes.
     */
    private java.util.Map<String, AttributeDimension> attributes;

    /**
     * The segment behaviors attributes.
     */
    private SegmentBehaviors behavior;

    /**
     * The segment demographics attributes.
     */
    private SegmentDemographics demographic;

    /**
     * The segment location attributes.
     */
    private SegmentLocation location;

    /**
     * Custom segment attributes.
     *
     * @return Custom segment attributes.
     */
    public java.util.Map<String, AttributeDimension> getAttributes() {
        return attributes;
    }

    /**
     * Custom segment attributes.
     *
     * @param attributes Custom segment attributes.
     */
    public void setAttributes(java.util.Map<String, AttributeDimension> attributes) {
        this.attributes = attributes;
    }

    /**
     * Custom segment attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes Custom segment attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions withAttributes(java.util.Map<String, AttributeDimension> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Custom segment attributes.
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
     * The segment behaviors attributes.
     *
     * @return The segment behaviors attributes.
     */
    public SegmentBehaviors getBehavior() {
        return behavior;
    }

    /**
     * The segment behaviors attributes.
     *
     * @param behavior The segment behaviors attributes.
     */
    public void setBehavior(SegmentBehaviors behavior) {
        this.behavior = behavior;
    }

    /**
     * The segment behaviors attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param behavior The segment behaviors attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions withBehavior(SegmentBehaviors behavior) {
        this.behavior = behavior;
        return this;
    }

    /**
     * The segment demographics attributes.
     *
     * @return The segment demographics attributes.
     */
    public SegmentDemographics getDemographic() {
        return demographic;
    }

    /**
     * The segment demographics attributes.
     *
     * @param demographic The segment demographics attributes.
     */
    public void setDemographic(SegmentDemographics demographic) {
        this.demographic = demographic;
    }

    /**
     * The segment demographics attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param demographic The segment demographics attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions withDemographic(SegmentDemographics demographic) {
        this.demographic = demographic;
        return this;
    }

    /**
     * The segment location attributes.
     * 
     * @return The segment location attributes.
     */
    public SegmentLocation getLocation() {
        return location;
    }

    /**
     * The segment location attributes.
     * 
     * @param location The segment location attributes.
     */
    public void setLocation(SegmentLocation location) {
        this.location = location;
    }

    /**
     * The segment location attributes. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location The segment location attributes. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDimensions withLocation(SegmentLocation location) {
        this.location = location;
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
            sb.append("Location: " + getLocation());
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
        return true;
    }
}
