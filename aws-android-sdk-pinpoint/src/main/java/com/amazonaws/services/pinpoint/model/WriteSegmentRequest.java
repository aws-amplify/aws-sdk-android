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
 * Specifies the configuration, dimension, and other settings for a segment. A
 * WriteSegmentRequest object can include a Dimensions object or a SegmentGroups
 * object, but not both.
 * </p>
 */
public class WriteSegmentRequest implements Serializable {
    /**
     * <p>
     * The criteria that define the dimensions for the segment.
     * </p>
     */
    private SegmentDimensions dimensions;

    /**
     * <p>
     * The name of the segment.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The segment group to use and the dimensions to apply to the group's base
     * segments in order to build the segment. A segment group can consist of
     * zero or more base segments. Your request can include only one segment
     * group.
     * </p>
     */
    private SegmentGroupList segmentGroups;

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the segment. Each tag consists of a required tag key and
     * an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The criteria that define the dimensions for the segment.
     * </p>
     *
     * @return <p>
     *         The criteria that define the dimensions for the segment.
     *         </p>
     */
    public SegmentDimensions getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The criteria that define the dimensions for the segment.
     * </p>
     *
     * @param dimensions <p>
     *            The criteria that define the dimensions for the segment.
     *            </p>
     */
    public void setDimensions(SegmentDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The criteria that define the dimensions for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The criteria that define the dimensions for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteSegmentRequest withDimensions(SegmentDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     *
     * @return <p>
     *         The name of the segment.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     *
     * @param name <p>
     *            The name of the segment.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteSegmentRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The segment group to use and the dimensions to apply to the group's base
     * segments in order to build the segment. A segment group can consist of
     * zero or more base segments. Your request can include only one segment
     * group.
     * </p>
     *
     * @return <p>
     *         The segment group to use and the dimensions to apply to the
     *         group's base segments in order to build the segment. A segment
     *         group can consist of zero or more base segments. Your request can
     *         include only one segment group.
     *         </p>
     */
    public SegmentGroupList getSegmentGroups() {
        return segmentGroups;
    }

    /**
     * <p>
     * The segment group to use and the dimensions to apply to the group's base
     * segments in order to build the segment. A segment group can consist of
     * zero or more base segments. Your request can include only one segment
     * group.
     * </p>
     *
     * @param segmentGroups <p>
     *            The segment group to use and the dimensions to apply to the
     *            group's base segments in order to build the segment. A segment
     *            group can consist of zero or more base segments. Your request
     *            can include only one segment group.
     *            </p>
     */
    public void setSegmentGroups(SegmentGroupList segmentGroups) {
        this.segmentGroups = segmentGroups;
    }

    /**
     * <p>
     * The segment group to use and the dimensions to apply to the group's base
     * segments in order to build the segment. A segment group can consist of
     * zero or more base segments. Your request can include only one segment
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentGroups <p>
     *            The segment group to use and the dimensions to apply to the
     *            group's base segments in order to build the segment. A segment
     *            group can consist of zero or more base segments. Your request
     *            can include only one segment group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteSegmentRequest withSegmentGroups(SegmentGroupList segmentGroups) {
        this.segmentGroups = segmentGroups;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the segment. Each tag consists of a required tag key and
     * an associated tag value.
     * </p>
     *
     * @return <p>
     *         A string-to-string map of key-value pairs that defines the tags
     *         to associate with the segment. Each tag consists of a required
     *         tag key and an associated tag value.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the segment. Each tag consists of a required tag key and
     * an associated tag value.
     * </p>
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that defines the
     *            tags to associate with the segment. Each tag consists of a
     *            required tag key and an associated tag value.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the segment. Each tag consists of a required tag key and
     * an associated tag value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that defines the
     *            tags to associate with the segment. Each tag consists of a
     *            required tag key and an associated tag value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteSegmentRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that defines the tags to
     * associate with the segment. Each tag consists of a required tag key and
     * an associated tag value.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WriteSegmentRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public WriteSegmentRequest cleartagsEntries() {
        this.tags = null;
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
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSegmentGroups() != null)
            sb.append("SegmentGroups: " + getSegmentGroups() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentGroups() == null) ? 0 : getSegmentGroups().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteSegmentRequest == false)
            return false;
        WriteSegmentRequest other = (WriteSegmentRequest) obj;

        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSegmentGroups() == null ^ this.getSegmentGroups() == null)
            return false;
        if (other.getSegmentGroups() != null
                && other.getSegmentGroups().equals(this.getSegmentGroups()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
