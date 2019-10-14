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
 * Provides the results of a query that retrieved the data for a standard metric
 * that applies to an application or campaign.
 * </p>
 */
public class ResultRow implements Serializable {
    /**
     * <p>
     * An array of objects that defines the field and field values that were
     * used to group data in a result set that contains multiple results. This
     * value is null if the data in a result set isn’t grouped.
     * </p>
     */
    private java.util.List<ResultRowValue> groupedBys;

    /**
     * <p>
     * An array of objects that provides pre-aggregated values for a standard
     * metric that applies to an application or campaign.
     * </p>
     */
    private java.util.List<ResultRowValue> values;

    /**
     * <p>
     * An array of objects that defines the field and field values that were
     * used to group data in a result set that contains multiple results. This
     * value is null if the data in a result set isn’t grouped.
     * </p>
     *
     * @return <p>
     *         An array of objects that defines the field and field values that
     *         were used to group data in a result set that contains multiple
     *         results. This value is null if the data in a result set isn’t
     *         grouped.
     *         </p>
     */
    public java.util.List<ResultRowValue> getGroupedBys() {
        return groupedBys;
    }

    /**
     * <p>
     * An array of objects that defines the field and field values that were
     * used to group data in a result set that contains multiple results. This
     * value is null if the data in a result set isn’t grouped.
     * </p>
     *
     * @param groupedBys <p>
     *            An array of objects that defines the field and field values
     *            that were used to group data in a result set that contains
     *            multiple results. This value is null if the data in a result
     *            set isn’t grouped.
     *            </p>
     */
    public void setGroupedBys(java.util.Collection<ResultRowValue> groupedBys) {
        if (groupedBys == null) {
            this.groupedBys = null;
            return;
        }

        this.groupedBys = new java.util.ArrayList<ResultRowValue>(groupedBys);
    }

    /**
     * <p>
     * An array of objects that defines the field and field values that were
     * used to group data in a result set that contains multiple results. This
     * value is null if the data in a result set isn’t grouped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupedBys <p>
     *            An array of objects that defines the field and field values
     *            that were used to group data in a result set that contains
     *            multiple results. This value is null if the data in a result
     *            set isn’t grouped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultRow withGroupedBys(ResultRowValue... groupedBys) {
        if (getGroupedBys() == null) {
            this.groupedBys = new java.util.ArrayList<ResultRowValue>(groupedBys.length);
        }
        for (ResultRowValue value : groupedBys) {
            this.groupedBys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that defines the field and field values that were
     * used to group data in a result set that contains multiple results. This
     * value is null if the data in a result set isn’t grouped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupedBys <p>
     *            An array of objects that defines the field and field values
     *            that were used to group data in a result set that contains
     *            multiple results. This value is null if the data in a result
     *            set isn’t grouped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultRow withGroupedBys(java.util.Collection<ResultRowValue> groupedBys) {
        setGroupedBys(groupedBys);
        return this;
    }

    /**
     * <p>
     * An array of objects that provides pre-aggregated values for a standard
     * metric that applies to an application or campaign.
     * </p>
     *
     * @return <p>
     *         An array of objects that provides pre-aggregated values for a
     *         standard metric that applies to an application or campaign.
     *         </p>
     */
    public java.util.List<ResultRowValue> getValues() {
        return values;
    }

    /**
     * <p>
     * An array of objects that provides pre-aggregated values for a standard
     * metric that applies to an application or campaign.
     * </p>
     *
     * @param values <p>
     *            An array of objects that provides pre-aggregated values for a
     *            standard metric that applies to an application or campaign.
     *            </p>
     */
    public void setValues(java.util.Collection<ResultRowValue> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<ResultRowValue>(values);
    }

    /**
     * <p>
     * An array of objects that provides pre-aggregated values for a standard
     * metric that applies to an application or campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            An array of objects that provides pre-aggregated values for a
     *            standard metric that applies to an application or campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultRow withValues(ResultRowValue... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<ResultRowValue>(values.length);
        }
        for (ResultRowValue value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that provides pre-aggregated values for a standard
     * metric that applies to an application or campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            An array of objects that provides pre-aggregated values for a
     *            standard metric that applies to an application or campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultRow withValues(java.util.Collection<ResultRowValue> values) {
        setValues(values);
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
        if (getGroupedBys() != null)
            sb.append("GroupedBys: " + getGroupedBys() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupedBys() == null) ? 0 : getGroupedBys().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultRow == false)
            return false;
        ResultRow other = (ResultRow) obj;

        if (other.getGroupedBys() == null ^ this.getGroupedBys() == null)
            return false;
        if (other.getGroupedBys() != null
                && other.getGroupedBys().equals(this.getGroupedBys()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
