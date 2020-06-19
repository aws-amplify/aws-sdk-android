/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * SCTE-35 Descriptor settings.
 */
public class Scte35DescriptorSettings implements Serializable {
    /**
     * SCTE-35 Segmentation Descriptor.
     */
    private Scte35SegmentationDescriptor segmentationDescriptorScte35DescriptorSettings;

    /**
     * SCTE-35 Segmentation Descriptor.
     *
     * @return SCTE-35 Segmentation Descriptor.
     */
    public Scte35SegmentationDescriptor getSegmentationDescriptorScte35DescriptorSettings() {
        return segmentationDescriptorScte35DescriptorSettings;
    }

    /**
     * SCTE-35 Segmentation Descriptor.
     *
     * @param segmentationDescriptorScte35DescriptorSettings SCTE-35
     *            Segmentation Descriptor.
     */
    public void setSegmentationDescriptorScte35DescriptorSettings(
            Scte35SegmentationDescriptor segmentationDescriptorScte35DescriptorSettings) {
        this.segmentationDescriptorScte35DescriptorSettings = segmentationDescriptorScte35DescriptorSettings;
    }

    /**
     * SCTE-35 Segmentation Descriptor.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentationDescriptorScte35DescriptorSettings SCTE-35
     *            Segmentation Descriptor.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35DescriptorSettings withSegmentationDescriptorScte35DescriptorSettings(
            Scte35SegmentationDescriptor segmentationDescriptorScte35DescriptorSettings) {
        this.segmentationDescriptorScte35DescriptorSettings = segmentationDescriptorScte35DescriptorSettings;
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
        if (getSegmentationDescriptorScte35DescriptorSettings() != null)
            sb.append("SegmentationDescriptorScte35DescriptorSettings: "
                    + getSegmentationDescriptorScte35DescriptorSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSegmentationDescriptorScte35DescriptorSettings() == null) ? 0
                        : getSegmentationDescriptorScte35DescriptorSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35DescriptorSettings == false)
            return false;
        Scte35DescriptorSettings other = (Scte35DescriptorSettings) obj;

        if (other.getSegmentationDescriptorScte35DescriptorSettings() == null
                ^ this.getSegmentationDescriptorScte35DescriptorSettings() == null)
            return false;
        if (other.getSegmentationDescriptorScte35DescriptorSettings() != null
                && other.getSegmentationDescriptorScte35DescriptorSettings().equals(
                        this.getSegmentationDescriptorScte35DescriptorSettings()) == false)
            return false;
        return true;
    }
}
