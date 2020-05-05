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

public class DescribeIdFormatResult implements Serializable {
    /**
     * <p>
     * Information about the ID format for the resource.
     * </p>
     */
    private java.util.List<IdFormat> statuses;

    /**
     * <p>
     * Information about the ID format for the resource.
     * </p>
     *
     * @return <p>
     *         Information about the ID format for the resource.
     *         </p>
     */
    public java.util.List<IdFormat> getStatuses() {
        return statuses;
    }

    /**
     * <p>
     * Information about the ID format for the resource.
     * </p>
     *
     * @param statuses <p>
     *            Information about the ID format for the resource.
     *            </p>
     */
    public void setStatuses(java.util.Collection<IdFormat> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }

        this.statuses = new java.util.ArrayList<IdFormat>(statuses);
    }

    /**
     * <p>
     * Information about the ID format for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statuses <p>
     *            Information about the ID format for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIdFormatResult withStatuses(IdFormat... statuses) {
        if (getStatuses() == null) {
            this.statuses = new java.util.ArrayList<IdFormat>(statuses.length);
        }
        for (IdFormat value : statuses) {
            this.statuses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the ID format for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statuses <p>
     *            Information about the ID format for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeIdFormatResult withStatuses(java.util.Collection<IdFormat> statuses) {
        setStatuses(statuses);
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
        if (getStatuses() != null)
            sb.append("Statuses: " + getStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIdFormatResult == false)
            return false;
        DescribeIdFormatResult other = (DescribeIdFormatResult) obj;

        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        return true;
    }
}
