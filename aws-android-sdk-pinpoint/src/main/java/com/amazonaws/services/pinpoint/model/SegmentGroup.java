/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Segment group definition.
 */
public class SegmentGroup implements Serializable {
    /**
     * List of dimensions to include or exclude.
     */
    private java.util.List<SegmentDimensions> dimensions;

    /**
     * Segments that define the source of this segment. Currently a maximum of 1
     * import segment is supported.
     */
    private java.util.List<SegmentReference> sourceSegments;

    /**
     * Include or exclude the source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     */
    private String sourceType;

    /**
     * How should the dimensions be applied for the result
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     */
    private String type;

    /**
     * List of dimensions to include or exclude.
     *
     * @return List of dimensions to include or exclude.
     */
    public java.util.List<SegmentDimensions> getDimensions() {
        return dimensions;
    }

    /**
     * List of dimensions to include or exclude.
     *
     * @param dimensions List of dimensions to include or exclude.
     */
    public void setDimensions(java.util.Collection<SegmentDimensions> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<SegmentDimensions>(dimensions);
    }

    /**
     * List of dimensions to include or exclude.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions List of dimensions to include or exclude.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentGroup withDimensions(SegmentDimensions... dimensions) {
        if (getDimensions() == null) {
            this.dimensions = new java.util.ArrayList<SegmentDimensions>(dimensions.length);
        }
        for (SegmentDimensions value : dimensions) {
            this.dimensions.add(value);
        }
        return this;
    }

    /**
     * List of dimensions to include or exclude.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions List of dimensions to include or exclude.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentGroup withDimensions(java.util.Collection<SegmentDimensions> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * Segments that define the source of this segment. Currently a maximum of 1
     * import segment is supported.
     *
     * @return Segments that define the source of this segment. Currently a
     *         maximum of 1 import segment is supported.
     */
    public java.util.List<SegmentReference> getSourceSegments() {
        return sourceSegments;
    }

    /**
     * Segments that define the source of this segment. Currently a maximum of 1
     * import segment is supported.
     *
     * @param sourceSegments Segments that define the source of this segment.
     *            Currently a maximum of 1 import segment is supported.
     */
    public void setSourceSegments(java.util.Collection<SegmentReference> sourceSegments) {
        if (sourceSegments == null) {
            this.sourceSegments = null;
            return;
        }

        this.sourceSegments = new java.util.ArrayList<SegmentReference>(sourceSegments);
    }

    /**
     * Segments that define the source of this segment. Currently a maximum of 1
     * import segment is supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSegments Segments that define the source of this segment.
     *            Currently a maximum of 1 import segment is supported.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentGroup withSourceSegments(SegmentReference... sourceSegments) {
        if (getSourceSegments() == null) {
            this.sourceSegments = new java.util.ArrayList<SegmentReference>(sourceSegments.length);
        }
        for (SegmentReference value : sourceSegments) {
            this.sourceSegments.add(value);
        }
        return this;
    }

    /**
     * Segments that define the source of this segment. Currently a maximum of 1
     * import segment is supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSegments Segments that define the source of this segment.
     *            Currently a maximum of 1 import segment is supported.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentGroup withSourceSegments(java.util.Collection<SegmentReference> sourceSegments) {
        setSourceSegments(sourceSegments);
        return this;
    }

    /**
     * Include or exclude the source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     *
     * @return Include or exclude the source.
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Include or exclude the source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     *
     * @param sourceType Include or exclude the source.
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * Include or exclude the source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     *
     * @param sourceType Include or exclude the source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public SegmentGroup withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Include or exclude the source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     *
     * @param sourceType Include or exclude the source.
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * Include or exclude the source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY
     *
     * @param sourceType Include or exclude the source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public SegmentGroup withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * How should the dimensions be applied for the result
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @return How should the dimensions be applied for the result
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * How should the dimensions be applied for the result
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param type How should the dimensions be applied for the result
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * How should the dimensions be applied for the result
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param type How should the dimensions be applied for the result
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public SegmentGroup withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * How should the dimensions be applied for the result
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param type How should the dimensions be applied for the result
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * How should the dimensions be applied for the result
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param type How should the dimensions be applied for the result
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public SegmentGroup withType(Type type) {
        this.type = type.toString();
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
        if (getSourceSegments() != null)
            sb.append("SourceSegments: " + getSourceSegments() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode
                + ((getSourceSegments() == null) ? 0 : getSourceSegments().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentGroup == false)
            return false;
        SegmentGroup other = (SegmentGroup) obj;

        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getSourceSegments() == null ^ this.getSourceSegments() == null)
            return false;
        if (other.getSourceSegments() != null
                && other.getSourceSegments().equals(this.getSourceSegments()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
