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
public class BaseKpiResult implements Serializable {
    /**
     * <p>
     * An array of objects that provides the results of a query that retrieved
     * the data for a standard metric that applies to an application or
     * campaign.
     * </p>
     */
    private java.util.List<ResultRow> rows;

    /**
     * <p>
     * An array of objects that provides the results of a query that retrieved
     * the data for a standard metric that applies to an application or
     * campaign.
     * </p>
     *
     * @return <p>
     *         An array of objects that provides the results of a query that
     *         retrieved the data for a standard metric that applies to an
     *         application or campaign.
     *         </p>
     */
    public java.util.List<ResultRow> getRows() {
        return rows;
    }

    /**
     * <p>
     * An array of objects that provides the results of a query that retrieved
     * the data for a standard metric that applies to an application or
     * campaign.
     * </p>
     *
     * @param rows <p>
     *            An array of objects that provides the results of a query that
     *            retrieved the data for a standard metric that applies to an
     *            application or campaign.
     *            </p>
     */
    public void setRows(java.util.Collection<ResultRow> rows) {
        if (rows == null) {
            this.rows = null;
            return;
        }

        this.rows = new java.util.ArrayList<ResultRow>(rows);
    }

    /**
     * <p>
     * An array of objects that provides the results of a query that retrieved
     * the data for a standard metric that applies to an application or
     * campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rows <p>
     *            An array of objects that provides the results of a query that
     *            retrieved the data for a standard metric that applies to an
     *            application or campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaseKpiResult withRows(ResultRow... rows) {
        if (getRows() == null) {
            this.rows = new java.util.ArrayList<ResultRow>(rows.length);
        }
        for (ResultRow value : rows) {
            this.rows.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that provides the results of a query that retrieved
     * the data for a standard metric that applies to an application or
     * campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rows <p>
     *            An array of objects that provides the results of a query that
     *            retrieved the data for a standard metric that applies to an
     *            application or campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BaseKpiResult withRows(java.util.Collection<ResultRow> rows) {
        setRows(rows);
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
        if (getRows() != null)
            sb.append("Rows: " + getRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BaseKpiResult == false)
            return false;
        BaseKpiResult other = (BaseKpiResult) obj;

        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        return true;
    }
}
