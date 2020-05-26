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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Dashboard source entity.
 * </p>
 */
public class DashboardSourceEntity implements Serializable {
    /**
     * <p>
     * Source template.
     * </p>
     */
    private DashboardSourceTemplate sourceTemplate;

    /**
     * <p>
     * Source template.
     * </p>
     *
     * @return <p>
     *         Source template.
     *         </p>
     */
    public DashboardSourceTemplate getSourceTemplate() {
        return sourceTemplate;
    }

    /**
     * <p>
     * Source template.
     * </p>
     *
     * @param sourceTemplate <p>
     *            Source template.
     *            </p>
     */
    public void setSourceTemplate(DashboardSourceTemplate sourceTemplate) {
        this.sourceTemplate = sourceTemplate;
    }

    /**
     * <p>
     * Source template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceTemplate <p>
     *            Source template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardSourceEntity withSourceTemplate(DashboardSourceTemplate sourceTemplate) {
        this.sourceTemplate = sourceTemplate;
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
        if (getSourceTemplate() != null)
            sb.append("SourceTemplate: " + getSourceTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceTemplate() == null) ? 0 : getSourceTemplate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardSourceEntity == false)
            return false;
        DashboardSourceEntity other = (DashboardSourceEntity) obj;

        if (other.getSourceTemplate() == null ^ this.getSourceTemplate() == null)
            return false;
        if (other.getSourceTemplate() != null
                && other.getSourceTemplate().equals(this.getSourceTemplate()) == false)
            return false;
        return true;
    }
}
