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

public class DescribeAggregateIdFormatResult implements Serializable {
    /**
     * <p>
     * Indicates whether all resource types in the Region are configured to use
     * longer IDs. This value is only <code>true</code> if all users are
     * configured to use longer IDs for all resources types in the Region.
     * </p>
     */
    private Boolean useLongIdsAggregated;

    /**
     * <p>
     * Information about each resource's ID format.
     * </p>
     */
    private java.util.List<IdFormat> statuses;

    /**
     * <p>
     * Indicates whether all resource types in the Region are configured to use
     * longer IDs. This value is only <code>true</code> if all users are
     * configured to use longer IDs for all resources types in the Region.
     * </p>
     *
     * @return <p>
     *         Indicates whether all resource types in the Region are configured
     *         to use longer IDs. This value is only <code>true</code> if all
     *         users are configured to use longer IDs for all resources types in
     *         the Region.
     *         </p>
     */
    public Boolean isUseLongIdsAggregated() {
        return useLongIdsAggregated;
    }

    /**
     * <p>
     * Indicates whether all resource types in the Region are configured to use
     * longer IDs. This value is only <code>true</code> if all users are
     * configured to use longer IDs for all resources types in the Region.
     * </p>
     *
     * @return <p>
     *         Indicates whether all resource types in the Region are configured
     *         to use longer IDs. This value is only <code>true</code> if all
     *         users are configured to use longer IDs for all resources types in
     *         the Region.
     *         </p>
     */
    public Boolean getUseLongIdsAggregated() {
        return useLongIdsAggregated;
    }

    /**
     * <p>
     * Indicates whether all resource types in the Region are configured to use
     * longer IDs. This value is only <code>true</code> if all users are
     * configured to use longer IDs for all resources types in the Region.
     * </p>
     *
     * @param useLongIdsAggregated <p>
     *            Indicates whether all resource types in the Region are
     *            configured to use longer IDs. This value is only
     *            <code>true</code> if all users are configured to use longer
     *            IDs for all resources types in the Region.
     *            </p>
     */
    public void setUseLongIdsAggregated(Boolean useLongIdsAggregated) {
        this.useLongIdsAggregated = useLongIdsAggregated;
    }

    /**
     * <p>
     * Indicates whether all resource types in the Region are configured to use
     * longer IDs. This value is only <code>true</code> if all users are
     * configured to use longer IDs for all resources types in the Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useLongIdsAggregated <p>
     *            Indicates whether all resource types in the Region are
     *            configured to use longer IDs. This value is only
     *            <code>true</code> if all users are configured to use longer
     *            IDs for all resources types in the Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAggregateIdFormatResult withUseLongIdsAggregated(Boolean useLongIdsAggregated) {
        this.useLongIdsAggregated = useLongIdsAggregated;
        return this;
    }

    /**
     * <p>
     * Information about each resource's ID format.
     * </p>
     *
     * @return <p>
     *         Information about each resource's ID format.
     *         </p>
     */
    public java.util.List<IdFormat> getStatuses() {
        return statuses;
    }

    /**
     * <p>
     * Information about each resource's ID format.
     * </p>
     *
     * @param statuses <p>
     *            Information about each resource's ID format.
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
     * Information about each resource's ID format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statuses <p>
     *            Information about each resource's ID format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAggregateIdFormatResult withStatuses(IdFormat... statuses) {
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
     * Information about each resource's ID format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statuses <p>
     *            Information about each resource's ID format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAggregateIdFormatResult withStatuses(java.util.Collection<IdFormat> statuses) {
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
        if (getUseLongIdsAggregated() != null)
            sb.append("UseLongIdsAggregated: " + getUseLongIdsAggregated() + ",");
        if (getStatuses() != null)
            sb.append("Statuses: " + getStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUseLongIdsAggregated() == null) ? 0 : getUseLongIdsAggregated().hashCode());
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAggregateIdFormatResult == false)
            return false;
        DescribeAggregateIdFormatResult other = (DescribeAggregateIdFormatResult) obj;

        if (other.getUseLongIdsAggregated() == null ^ this.getUseLongIdsAggregated() == null)
            return false;
        if (other.getUseLongIdsAggregated() != null
                && other.getUseLongIdsAggregated().equals(this.getUseLongIdsAggregated()) == false)
            return false;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        return true;
    }
}
