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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the ID format for a resource.
 * </p>
 */
public class IdFormat implements Serializable {
    /**
     * <p>
     * The date in UTC at which you are permanently switched over to using
     * longer IDs. If a deadline is not yet available for this resource type,
     * this field is not returned.
     * </p>
     */
    private java.util.Date deadline;

    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String resource;

    /**
     * <p>
     * Indicates whether longer IDs (17-character IDs) are enabled for the
     * resource.
     * </p>
     */
    private Boolean useLongIds;

    /**
     * <p>
     * The date in UTC at which you are permanently switched over to using
     * longer IDs. If a deadline is not yet available for this resource type,
     * this field is not returned.
     * </p>
     *
     * @return <p>
     *         The date in UTC at which you are permanently switched over to
     *         using longer IDs. If a deadline is not yet available for this
     *         resource type, this field is not returned.
     *         </p>
     */
    public java.util.Date getDeadline() {
        return deadline;
    }

    /**
     * <p>
     * The date in UTC at which you are permanently switched over to using
     * longer IDs. If a deadline is not yet available for this resource type,
     * this field is not returned.
     * </p>
     *
     * @param deadline <p>
     *            The date in UTC at which you are permanently switched over to
     *            using longer IDs. If a deadline is not yet available for this
     *            resource type, this field is not returned.
     *            </p>
     */
    public void setDeadline(java.util.Date deadline) {
        this.deadline = deadline;
    }

    /**
     * <p>
     * The date in UTC at which you are permanently switched over to using
     * longer IDs. If a deadline is not yet available for this resource type,
     * this field is not returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deadline <p>
     *            The date in UTC at which you are permanently switched over to
     *            using longer IDs. If a deadline is not yet available for this
     *            resource type, this field is not returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdFormat withDeadline(java.util.Date deadline) {
        this.deadline = deadline;
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     *
     * @return <p>
     *         The type of resource.
     *         </p>
     */
    public String getResource() {
        return resource;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     *
     * @param resource <p>
     *            The type of resource.
     *            </p>
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resource <p>
     *            The type of resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdFormat withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * <p>
     * Indicates whether longer IDs (17-character IDs) are enabled for the
     * resource.
     * </p>
     *
     * @return <p>
     *         Indicates whether longer IDs (17-character IDs) are enabled for
     *         the resource.
     *         </p>
     */
    public Boolean isUseLongIds() {
        return useLongIds;
    }

    /**
     * <p>
     * Indicates whether longer IDs (17-character IDs) are enabled for the
     * resource.
     * </p>
     *
     * @return <p>
     *         Indicates whether longer IDs (17-character IDs) are enabled for
     *         the resource.
     *         </p>
     */
    public Boolean getUseLongIds() {
        return useLongIds;
    }

    /**
     * <p>
     * Indicates whether longer IDs (17-character IDs) are enabled for the
     * resource.
     * </p>
     *
     * @param useLongIds <p>
     *            Indicates whether longer IDs (17-character IDs) are enabled
     *            for the resource.
     *            </p>
     */
    public void setUseLongIds(Boolean useLongIds) {
        this.useLongIds = useLongIds;
    }

    /**
     * <p>
     * Indicates whether longer IDs (17-character IDs) are enabled for the
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useLongIds <p>
     *            Indicates whether longer IDs (17-character IDs) are enabled
     *            for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdFormat withUseLongIds(Boolean useLongIds) {
        this.useLongIds = useLongIds;
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
        if (getDeadline() != null)
            sb.append("Deadline: " + getDeadline() + ",");
        if (getResource() != null)
            sb.append("Resource: " + getResource() + ",");
        if (getUseLongIds() != null)
            sb.append("UseLongIds: " + getUseLongIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getUseLongIds() == null) ? 0 : getUseLongIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdFormat == false)
            return false;
        IdFormat other = (IdFormat) obj;

        if (other.getDeadline() == null ^ this.getDeadline() == null)
            return false;
        if (other.getDeadline() != null && other.getDeadline().equals(this.getDeadline()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getUseLongIds() == null ^ this.getUseLongIds() == null)
            return false;
        if (other.getUseLongIds() != null
                && other.getUseLongIds().equals(this.getUseLongIds()) == false)
            return false;
        return true;
    }
}
