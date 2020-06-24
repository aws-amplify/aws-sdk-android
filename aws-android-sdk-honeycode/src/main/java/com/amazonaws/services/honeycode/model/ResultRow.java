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

package com.amazonaws.services.honeycode.model;

import java.io.Serializable;

/**
 * <p>
 * A single row in the ResultSet.
 * </p>
 */
public class ResultRow implements Serializable {
    /**
     * <p>
     * The ID for a particular row.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>row:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-
     * F]{4}-[0-9a-
     * fA-F]{12}\/[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-
     * fA-F]{4}-[0-9a-fA-F]{12}<br/>
     */
    private String rowId;

    /**
     * <p>
     * List of all the data cells in a row.
     * </p>
     */
    private java.util.List<DataItem> dataItems;

    /**
     * <p>
     * The ID for a particular row.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>row:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-
     * F]{4}-[0-9a-
     * fA-F]{12}\/[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-
     * fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The ID for a particular row.
     *         </p>
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * <p>
     * The ID for a particular row.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>row:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-
     * F]{4}-[0-9a-
     * fA-F]{12}\/[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-
     * fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param rowId <p>
     *            The ID for a particular row.
     *            </p>
     */
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    /**
     * <p>
     * The ID for a particular row.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>row:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-
     * F]{4}-[0-9a-
     * fA-F]{12}\/[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-
     * fA-F]{4}-[0-9a-fA-F]{12}<br/>
     *
     * @param rowId <p>
     *            The ID for a particular row.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultRow withRowId(String rowId) {
        this.rowId = rowId;
        return this;
    }

    /**
     * <p>
     * List of all the data cells in a row.
     * </p>
     *
     * @return <p>
     *         List of all the data cells in a row.
     *         </p>
     */
    public java.util.List<DataItem> getDataItems() {
        return dataItems;
    }

    /**
     * <p>
     * List of all the data cells in a row.
     * </p>
     *
     * @param dataItems <p>
     *            List of all the data cells in a row.
     *            </p>
     */
    public void setDataItems(java.util.Collection<DataItem> dataItems) {
        if (dataItems == null) {
            this.dataItems = null;
            return;
        }

        this.dataItems = new java.util.ArrayList<DataItem>(dataItems);
    }

    /**
     * <p>
     * List of all the data cells in a row.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataItems <p>
     *            List of all the data cells in a row.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultRow withDataItems(DataItem... dataItems) {
        if (getDataItems() == null) {
            this.dataItems = new java.util.ArrayList<DataItem>(dataItems.length);
        }
        for (DataItem value : dataItems) {
            this.dataItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of all the data cells in a row.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataItems <p>
     *            List of all the data cells in a row.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultRow withDataItems(java.util.Collection<DataItem> dataItems) {
        setDataItems(dataItems);
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
        if (getRowId() != null)
            sb.append("rowId: " + getRowId() + ",");
        if (getDataItems() != null)
            sb.append("dataItems: " + getDataItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRowId() == null) ? 0 : getRowId().hashCode());
        hashCode = prime * hashCode + ((getDataItems() == null) ? 0 : getDataItems().hashCode());
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

        if (other.getRowId() == null ^ this.getRowId() == null)
            return false;
        if (other.getRowId() != null && other.getRowId().equals(this.getRowId()) == false)
            return false;
        if (other.getDataItems() == null ^ this.getDataItems() == null)
            return false;
        if (other.getDataItems() != null
                && other.getDataItems().equals(this.getDataItems()) == false)
            return false;
        return true;
    }
}
