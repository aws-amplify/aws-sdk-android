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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a parameter group.
 * </p>
 */
public class ClusterParameterGroup implements Serializable {
    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     */
    private String parameterGroupName;

    /**
     * <p>
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     * </p>
     */
    private String parameterGroupFamily;

    /**
     * <p>
     * The description of the parameter group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The list of tags for the cluster parameter group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     *
     * @return <p>
     *         The name of the cluster parameter group.
     *         </p>
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     *
     * @param parameterGroupName <p>
     *            The name of the cluster parameter group.
     *            </p>
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterGroupName <p>
     *            The name of the cluster parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterGroup withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     * </p>
     *
     * @return <p>
     *         The name of the cluster parameter group family that this cluster
     *         parameter group is compatible with.
     *         </p>
     */
    public String getParameterGroupFamily() {
        return parameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     * </p>
     *
     * @param parameterGroupFamily <p>
     *            The name of the cluster parameter group family that this
     *            cluster parameter group is compatible with.
     *            </p>
     */
    public void setParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterGroupFamily <p>
     *            The name of the cluster parameter group family that this
     *            cluster parameter group is compatible with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterGroup withParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
        return this;
    }

    /**
     * <p>
     * The description of the parameter group.
     * </p>
     *
     * @return <p>
     *         The description of the parameter group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the parameter group.
     * </p>
     *
     * @param description <p>
     *            The description of the parameter group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster parameter group.
     * </p>
     *
     * @return <p>
     *         The list of tags for the cluster parameter group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags for the cluster parameter group.
     * </p>
     *
     * @param tags <p>
     *            The list of tags for the cluster parameter group.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags for the cluster parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the cluster parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterGroup withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the cluster parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterParameterGroup withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: " + getParameterGroupName() + ",");
        if (getParameterGroupFamily() != null)
            sb.append("ParameterGroupFamily: " + getParameterGroupFamily() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getParameterGroupFamily() == null) ? 0 : getParameterGroupFamily().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterParameterGroup == false)
            return false;
        ClusterParameterGroup other = (ClusterParameterGroup) obj;

        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null
                && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getParameterGroupFamily() == null ^ this.getParameterGroupFamily() == null)
            return false;
        if (other.getParameterGroupFamily() != null
                && other.getParameterGroupFamily().equals(this.getParameterGroupFamily()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
