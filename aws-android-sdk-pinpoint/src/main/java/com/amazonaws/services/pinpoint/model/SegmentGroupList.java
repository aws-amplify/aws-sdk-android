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
 * Segment group definition.
 */
public class SegmentGroupList implements Serializable {
    /**
     * A set of segment criteria to evaluate.
     */
    private java.util.List<SegmentGroup> groups;

    /**
     * Specify how to handle multiple segment groups. For example, if the
     * segment includes three segment groups, should the resulting segment
     * include endpoints that are matched by all, any, or none of the segment
     * groups you created. Acceptable values: ALL, ANY, or NONE.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     */
    private String include;

    /**
     * A set of segment criteria to evaluate.
     *
     * @return A set of segment criteria to evaluate.
     */
    public java.util.List<SegmentGroup> getGroups() {
        return groups;
    }

    /**
     * A set of segment criteria to evaluate.
     *
     * @param groups A set of segment criteria to evaluate.
     */
    public void setGroups(java.util.Collection<SegmentGroup> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<SegmentGroup>(groups);
    }

    /**
     * A set of segment criteria to evaluate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups A set of segment criteria to evaluate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentGroupList withGroups(SegmentGroup... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<SegmentGroup>(groups.length);
        }
        for (SegmentGroup value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * A set of segment criteria to evaluate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups A set of segment criteria to evaluate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentGroupList withGroups(java.util.Collection<SegmentGroup> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * Specify how to handle multiple segment groups. For example, if the
     * segment includes three segment groups, should the resulting segment
     * include endpoints that are matched by all, any, or none of the segment
     * groups you created. Acceptable values: ALL, ANY, or NONE.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @return Specify how to handle multiple segment groups. For example, if
     *         the segment includes three segment groups, should the resulting
     *         segment include endpoints that are matched by all, any, or none
     *         of the segment groups you created. Acceptable values: ALL, ANY,
     *         or NONE.
     * @see Include
     */
    public String getInclude() {
        return include;
    }

    /**
     * Specify how to handle multiple segment groups. For example, if the
     * segment includes three segment groups, should the resulting segment
     * include endpoints that are matched by all, any, or none of the segment
     * groups you created. Acceptable values: ALL, ANY, or NONE.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param include Specify how to handle multiple segment groups. For
     *            example, if the segment includes three segment groups, should
     *            the resulting segment include endpoints that are matched by
     *            all, any, or none of the segment groups you created.
     *            Acceptable values: ALL, ANY, or NONE.
     * @see Include
     */
    public void setInclude(String include) {
        this.include = include;
    }

    /**
     * Specify how to handle multiple segment groups. For example, if the
     * segment includes three segment groups, should the resulting segment
     * include endpoints that are matched by all, any, or none of the segment
     * groups you created. Acceptable values: ALL, ANY, or NONE.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param include Specify how to handle multiple segment groups. For
     *            example, if the segment includes three segment groups, should
     *            the resulting segment include endpoints that are matched by
     *            all, any, or none of the segment groups you created.
     *            Acceptable values: ALL, ANY, or NONE.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Include
     */
    public SegmentGroupList withInclude(String include) {
        this.include = include;
        return this;
    }

    /**
     * Specify how to handle multiple segment groups. For example, if the
     * segment includes three segment groups, should the resulting segment
     * include endpoints that are matched by all, any, or none of the segment
     * groups you created. Acceptable values: ALL, ANY, or NONE.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param include Specify how to handle multiple segment groups. For
     *            example, if the segment includes three segment groups, should
     *            the resulting segment include endpoints that are matched by
     *            all, any, or none of the segment groups you created.
     *            Acceptable values: ALL, ANY, or NONE.
     * @see Include
     */
    public void setInclude(Include include) {
        this.include = include.toString();
    }

    /**
     * Specify how to handle multiple segment groups. For example, if the
     * segment includes three segment groups, should the resulting segment
     * include endpoints that are matched by all, any, or none of the segment
     * groups you created. Acceptable values: ALL, ANY, or NONE.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, ANY, NONE
     *
     * @param include Specify how to handle multiple segment groups. For
     *            example, if the segment includes three segment groups, should
     *            the resulting segment include endpoints that are matched by
     *            all, any, or none of the segment groups you created.
     *            Acceptable values: ALL, ANY, or NONE.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Include
     */
    public SegmentGroupList withInclude(Include include) {
        this.include = include.toString();
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
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getInclude() != null)
            sb.append("Include: " + getInclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentGroupList == false)
            return false;
        SegmentGroupList other = (SegmentGroupList) obj;

        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }
}
