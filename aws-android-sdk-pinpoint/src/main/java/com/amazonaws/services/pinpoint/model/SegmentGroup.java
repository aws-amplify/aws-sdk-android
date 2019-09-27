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
 * Specifies the base segments and dimensions for a segment, and the
 * relationships between these base segments and dimensions.
 * </p>
 */
public class SegmentGroup implements Serializable {
    /**
     * <p>
     * An array that defines the dimensions for the segment.
     * </p>
     */
    private java.util.List<SegmentDimensions> dimensions;

    /**
     * <p>
     * The base segment to build the segment on. A base segment, also referred
     * to as a <i>source segment</i>, defines the initial population of
     * endpoints for a segment. When you add dimensions to a segment, Amazon
     * Pinpoint filters the base segment by using the dimensions that you
     * specify.
     * </p>
     * <p>
     * You can specify more than one dimensional segment or only one imported
     * segment. If you specify an imported segment, the Amazon Pinpoint console
     * displays a segment size estimate that indicates the size of the imported
     * segment without any filters applied to it.
     * </p>
     */
    private java.util.List<SegmentReference> sourceSegments;

    /**
     * <p>
     * Specifies how to handle multiple base segments for the segment. For
     * example, if you specify three base segments for the segment, whether the
     * resulting segment is based on all, any, or none of the base segments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     */
    private String sourceType;

    /**
     * <p>
     * Specifies how to handle multiple dimensions for the segment. For example,
     * if you specify three dimensions for the segment, whether the resulting
     * segment includes endpoints that match all, any, or none of the
     * dimensions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     */
    private String type;

    /**
     * <p>
     * An array that defines the dimensions for the segment.
     * </p>
     *
     * @return <p>
     *         An array that defines the dimensions for the segment.
     *         </p>
     */
    public java.util.List<SegmentDimensions> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * An array that defines the dimensions for the segment.
     * </p>
     *
     * @param dimensions <p>
     *            An array that defines the dimensions for the segment.
     *            </p>
     */
    public void setDimensions(java.util.Collection<SegmentDimensions> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<SegmentDimensions>(dimensions);
    }

    /**
     * <p>
     * An array that defines the dimensions for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            An array that defines the dimensions for the segment.
     *            </p>
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
     * <p>
     * An array that defines the dimensions for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            An array that defines the dimensions for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentGroup withDimensions(java.util.Collection<SegmentDimensions> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The base segment to build the segment on. A base segment, also referred
     * to as a <i>source segment</i>, defines the initial population of
     * endpoints for a segment. When you add dimensions to a segment, Amazon
     * Pinpoint filters the base segment by using the dimensions that you
     * specify.
     * </p>
     * <p>
     * You can specify more than one dimensional segment or only one imported
     * segment. If you specify an imported segment, the Amazon Pinpoint console
     * displays a segment size estimate that indicates the size of the imported
     * segment without any filters applied to it.
     * </p>
     *
     * @return <p>
     *         The base segment to build the segment on. A base segment, also
     *         referred to as a <i>source segment</i>, defines the initial
     *         population of endpoints for a segment. When you add dimensions to
     *         a segment, Amazon Pinpoint filters the base segment by using the
     *         dimensions that you specify.
     *         </p>
     *         <p>
     *         You can specify more than one dimensional segment or only one
     *         imported segment. If you specify an imported segment, the Amazon
     *         Pinpoint console displays a segment size estimate that indicates
     *         the size of the imported segment without any filters applied to
     *         it.
     *         </p>
     */
    public java.util.List<SegmentReference> getSourceSegments() {
        return sourceSegments;
    }

    /**
     * <p>
     * The base segment to build the segment on. A base segment, also referred
     * to as a <i>source segment</i>, defines the initial population of
     * endpoints for a segment. When you add dimensions to a segment, Amazon
     * Pinpoint filters the base segment by using the dimensions that you
     * specify.
     * </p>
     * <p>
     * You can specify more than one dimensional segment or only one imported
     * segment. If you specify an imported segment, the Amazon Pinpoint console
     * displays a segment size estimate that indicates the size of the imported
     * segment without any filters applied to it.
     * </p>
     *
     * @param sourceSegments <p>
     *            The base segment to build the segment on. A base segment, also
     *            referred to as a <i>source segment</i>, defines the initial
     *            population of endpoints for a segment. When you add dimensions
     *            to a segment, Amazon Pinpoint filters the base segment by
     *            using the dimensions that you specify.
     *            </p>
     *            <p>
     *            You can specify more than one dimensional segment or only one
     *            imported segment. If you specify an imported segment, the
     *            Amazon Pinpoint console displays a segment size estimate that
     *            indicates the size of the imported segment without any filters
     *            applied to it.
     *            </p>
     */
    public void setSourceSegments(java.util.Collection<SegmentReference> sourceSegments) {
        if (sourceSegments == null) {
            this.sourceSegments = null;
            return;
        }

        this.sourceSegments = new java.util.ArrayList<SegmentReference>(sourceSegments);
    }

    /**
     * <p>
     * The base segment to build the segment on. A base segment, also referred
     * to as a <i>source segment</i>, defines the initial population of
     * endpoints for a segment. When you add dimensions to a segment, Amazon
     * Pinpoint filters the base segment by using the dimensions that you
     * specify.
     * </p>
     * <p>
     * You can specify more than one dimensional segment or only one imported
     * segment. If you specify an imported segment, the Amazon Pinpoint console
     * displays a segment size estimate that indicates the size of the imported
     * segment without any filters applied to it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSegments <p>
     *            The base segment to build the segment on. A base segment, also
     *            referred to as a <i>source segment</i>, defines the initial
     *            population of endpoints for a segment. When you add dimensions
     *            to a segment, Amazon Pinpoint filters the base segment by
     *            using the dimensions that you specify.
     *            </p>
     *            <p>
     *            You can specify more than one dimensional segment or only one
     *            imported segment. If you specify an imported segment, the
     *            Amazon Pinpoint console displays a segment size estimate that
     *            indicates the size of the imported segment without any filters
     *            applied to it.
     *            </p>
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
     * <p>
     * The base segment to build the segment on. A base segment, also referred
     * to as a <i>source segment</i>, defines the initial population of
     * endpoints for a segment. When you add dimensions to a segment, Amazon
     * Pinpoint filters the base segment by using the dimensions that you
     * specify.
     * </p>
     * <p>
     * You can specify more than one dimensional segment or only one imported
     * segment. If you specify an imported segment, the Amazon Pinpoint console
     * displays a segment size estimate that indicates the size of the imported
     * segment without any filters applied to it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSegments <p>
     *            The base segment to build the segment on. A base segment, also
     *            referred to as a <i>source segment</i>, defines the initial
     *            population of endpoints for a segment. When you add dimensions
     *            to a segment, Amazon Pinpoint filters the base segment by
     *            using the dimensions that you specify.
     *            </p>
     *            <p>
     *            You can specify more than one dimensional segment or only one
     *            imported segment. If you specify an imported segment, the
     *            Amazon Pinpoint console displays a segment size estimate that
     *            indicates the size of the imported segment without any filters
     *            applied to it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentGroup withSourceSegments(java.util.Collection<SegmentReference> sourceSegments) {
        setSourceSegments(sourceSegments);
        return this;
    }

    /**
     * <p>
     * Specifies how to handle multiple base segments for the segment. For
     * example, if you specify three base segments for the segment, whether the
     * resulting segment is based on all, any, or none of the base segments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @return <p>
     *         Specifies how to handle multiple base segments for the segment.
     *         For example, if you specify three base segments for the segment,
     *         whether the resulting segment is based on all, any, or none of
     *         the base segments.
     *         </p>
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * Specifies how to handle multiple base segments for the segment. For
     * example, if you specify three base segments for the segment, whether the
     * resulting segment is based on all, any, or none of the base segments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param sourceType <p>
     *            Specifies how to handle multiple base segments for the
     *            segment. For example, if you specify three base segments for
     *            the segment, whether the resulting segment is based on all,
     *            any, or none of the base segments.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Specifies how to handle multiple base segments for the segment. For
     * example, if you specify three base segments for the segment, whether the
     * resulting segment is based on all, any, or none of the base segments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param sourceType <p>
     *            Specifies how to handle multiple base segments for the
     *            segment. For example, if you specify three base segments for
     *            the segment, whether the resulting segment is based on all,
     *            any, or none of the base segments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public SegmentGroup withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * Specifies how to handle multiple base segments for the segment. For
     * example, if you specify three base segments for the segment, whether the
     * resulting segment is based on all, any, or none of the base segments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param sourceType <p>
     *            Specifies how to handle multiple base segments for the
     *            segment. For example, if you specify three base segments for
     *            the segment, whether the resulting segment is based on all,
     *            any, or none of the base segments.
     *            </p>
     * @see SourceType
     */
    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
    }

    /**
     * <p>
     * Specifies how to handle multiple base segments for the segment. For
     * example, if you specify three base segments for the segment, whether the
     * resulting segment is based on all, any, or none of the base segments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param sourceType <p>
     *            Specifies how to handle multiple base segments for the
     *            segment. For example, if you specify three base segments for
     *            the segment, whether the resulting segment is based on all,
     *            any, or none of the base segments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceType
     */
    public SegmentGroup withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies how to handle multiple dimensions for the segment. For example,
     * if you specify three dimensions for the segment, whether the resulting
     * segment includes endpoints that match all, any, or none of the
     * dimensions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @return <p>
     *         Specifies how to handle multiple dimensions for the segment. For
     *         example, if you specify three dimensions for the segment, whether
     *         the resulting segment includes endpoints that match all, any, or
     *         none of the dimensions.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Specifies how to handle multiple dimensions for the segment. For example,
     * if you specify three dimensions for the segment, whether the resulting
     * segment includes endpoints that match all, any, or none of the
     * dimensions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param type <p>
     *            Specifies how to handle multiple dimensions for the segment.
     *            For example, if you specify three dimensions for the segment,
     *            whether the resulting segment includes endpoints that match
     *            all, any, or none of the dimensions.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies how to handle multiple dimensions for the segment. For example,
     * if you specify three dimensions for the segment, whether the resulting
     * segment includes endpoints that match all, any, or none of the
     * dimensions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param type <p>
     *            Specifies how to handle multiple dimensions for the segment.
     *            For example, if you specify three dimensions for the segment,
     *            whether the resulting segment includes endpoints that match
     *            all, any, or none of the dimensions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public SegmentGroup withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Specifies how to handle multiple dimensions for the segment. For example,
     * if you specify three dimensions for the segment, whether the resulting
     * segment includes endpoints that match all, any, or none of the
     * dimensions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param type <p>
     *            Specifies how to handle multiple dimensions for the segment.
     *            For example, if you specify three dimensions for the segment,
     *            whether the resulting segment includes endpoints that match
     *            all, any, or none of the dimensions.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specifies how to handle multiple dimensions for the segment. For example,
     * if you specify three dimensions for the segment, whether the resulting
     * segment includes endpoints that match all, any, or none of the
     * dimensions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param type <p>
     *            Specifies how to handle multiple dimensions for the segment.
     *            For example, if you specify three dimensions for the segment,
     *            whether the resulting segment includes endpoints that match
     *            all, any, or none of the dimensions.
     *            </p>
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
