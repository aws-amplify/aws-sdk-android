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
 * ResultSet contains the results of the request for a single block or list
 * defined on the screen.
 * </p>
 */
public class ResultSet implements Serializable {
    /**
     * <p>
     * List of headers for all the data cells in the block. The header
     * identifies the name and default format of the data cell. Data cells
     * appear in the same order in all rows as defined in the header. The names
     * and formats are not repeated in the rows. If a particular row does not
     * have a value for a data cell, a blank value is used.
     * </p>
     * <p>
     * For example, a task list that displays the task name, due date and
     * assigned person might have headers [ { "name": "Task Name"}, {"name":
     * "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"}
     * ]. Every row in the result will have the task name as the first item, due
     * date as the second item and assigned person as the third item. If a
     * particular task does not have a due date, that row will still have a
     * blank value in the second element and the assigned person will still be
     * in the third element.
     * </p>
     */
    private java.util.List<ColumnMetadata> headers;

    /**
     * <p>
     * List of rows returned by the request. Each row has a row Id and a list of
     * data cells in that row. The data cells will be present in the same order
     * as they are defined in the header.
     * </p>
     */
    private java.util.List<ResultRow> rows;

    /**
     * <p>
     * List of headers for all the data cells in the block. The header
     * identifies the name and default format of the data cell. Data cells
     * appear in the same order in all rows as defined in the header. The names
     * and formats are not repeated in the rows. If a particular row does not
     * have a value for a data cell, a blank value is used.
     * </p>
     * <p>
     * For example, a task list that displays the task name, due date and
     * assigned person might have headers [ { "name": "Task Name"}, {"name":
     * "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"}
     * ]. Every row in the result will have the task name as the first item, due
     * date as the second item and assigned person as the third item. If a
     * particular task does not have a due date, that row will still have a
     * blank value in the second element and the assigned person will still be
     * in the third element.
     * </p>
     *
     * @return <p>
     *         List of headers for all the data cells in the block. The header
     *         identifies the name and default format of the data cell. Data
     *         cells appear in the same order in all rows as defined in the
     *         header. The names and formats are not repeated in the rows. If a
     *         particular row does not have a value for a data cell, a blank
     *         value is used.
     *         </p>
     *         <p>
     *         For example, a task list that displays the task name, due date
     *         and assigned person might have headers [ { "name": "Task Name"},
     *         {"name": "Due Date", "format": "DATE"}, {"name": "Assigned",
     *         "format": "CONTACT"} ]. Every row in the result will have the
     *         task name as the first item, due date as the second item and
     *         assigned person as the third item. If a particular task does not
     *         have a due date, that row will still have a blank value in the
     *         second element and the assigned person will still be in the third
     *         element.
     *         </p>
     */
    public java.util.List<ColumnMetadata> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * List of headers for all the data cells in the block. The header
     * identifies the name and default format of the data cell. Data cells
     * appear in the same order in all rows as defined in the header. The names
     * and formats are not repeated in the rows. If a particular row does not
     * have a value for a data cell, a blank value is used.
     * </p>
     * <p>
     * For example, a task list that displays the task name, due date and
     * assigned person might have headers [ { "name": "Task Name"}, {"name":
     * "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"}
     * ]. Every row in the result will have the task name as the first item, due
     * date as the second item and assigned person as the third item. If a
     * particular task does not have a due date, that row will still have a
     * blank value in the second element and the assigned person will still be
     * in the third element.
     * </p>
     *
     * @param headers <p>
     *            List of headers for all the data cells in the block. The
     *            header identifies the name and default format of the data
     *            cell. Data cells appear in the same order in all rows as
     *            defined in the header. The names and formats are not repeated
     *            in the rows. If a particular row does not have a value for a
     *            data cell, a blank value is used.
     *            </p>
     *            <p>
     *            For example, a task list that displays the task name, due date
     *            and assigned person might have headers [ { "name":
     *            "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name":
     *            "Assigned", "format": "CONTACT"} ]. Every row in the result
     *            will have the task name as the first item, due date as the
     *            second item and assigned person as the third item. If a
     *            particular task does not have a due date, that row will still
     *            have a blank value in the second element and the assigned
     *            person will still be in the third element.
     *            </p>
     */
    public void setHeaders(java.util.Collection<ColumnMetadata> headers) {
        if (headers == null) {
            this.headers = null;
            return;
        }

        this.headers = new java.util.ArrayList<ColumnMetadata>(headers);
    }

    /**
     * <p>
     * List of headers for all the data cells in the block. The header
     * identifies the name and default format of the data cell. Data cells
     * appear in the same order in all rows as defined in the header. The names
     * and formats are not repeated in the rows. If a particular row does not
     * have a value for a data cell, a blank value is used.
     * </p>
     * <p>
     * For example, a task list that displays the task name, due date and
     * assigned person might have headers [ { "name": "Task Name"}, {"name":
     * "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"}
     * ]. Every row in the result will have the task name as the first item, due
     * date as the second item and assigned person as the third item. If a
     * particular task does not have a due date, that row will still have a
     * blank value in the second element and the assigned person will still be
     * in the third element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            List of headers for all the data cells in the block. The
     *            header identifies the name and default format of the data
     *            cell. Data cells appear in the same order in all rows as
     *            defined in the header. The names and formats are not repeated
     *            in the rows. If a particular row does not have a value for a
     *            data cell, a blank value is used.
     *            </p>
     *            <p>
     *            For example, a task list that displays the task name, due date
     *            and assigned person might have headers [ { "name":
     *            "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name":
     *            "Assigned", "format": "CONTACT"} ]. Every row in the result
     *            will have the task name as the first item, due date as the
     *            second item and assigned person as the third item. If a
     *            particular task does not have a due date, that row will still
     *            have a blank value in the second element and the assigned
     *            person will still be in the third element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultSet withHeaders(ColumnMetadata... headers) {
        if (getHeaders() == null) {
            this.headers = new java.util.ArrayList<ColumnMetadata>(headers.length);
        }
        for (ColumnMetadata value : headers) {
            this.headers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of headers for all the data cells in the block. The header
     * identifies the name and default format of the data cell. Data cells
     * appear in the same order in all rows as defined in the header. The names
     * and formats are not repeated in the rows. If a particular row does not
     * have a value for a data cell, a blank value is used.
     * </p>
     * <p>
     * For example, a task list that displays the task name, due date and
     * assigned person might have headers [ { "name": "Task Name"}, {"name":
     * "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"}
     * ]. Every row in the result will have the task name as the first item, due
     * date as the second item and assigned person as the third item. If a
     * particular task does not have a due date, that row will still have a
     * blank value in the second element and the assigned person will still be
     * in the third element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param headers <p>
     *            List of headers for all the data cells in the block. The
     *            header identifies the name and default format of the data
     *            cell. Data cells appear in the same order in all rows as
     *            defined in the header. The names and formats are not repeated
     *            in the rows. If a particular row does not have a value for a
     *            data cell, a blank value is used.
     *            </p>
     *            <p>
     *            For example, a task list that displays the task name, due date
     *            and assigned person might have headers [ { "name":
     *            "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name":
     *            "Assigned", "format": "CONTACT"} ]. Every row in the result
     *            will have the task name as the first item, due date as the
     *            second item and assigned person as the third item. If a
     *            particular task does not have a due date, that row will still
     *            have a blank value in the second element and the assigned
     *            person will still be in the third element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultSet withHeaders(java.util.Collection<ColumnMetadata> headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * <p>
     * List of rows returned by the request. Each row has a row Id and a list of
     * data cells in that row. The data cells will be present in the same order
     * as they are defined in the header.
     * </p>
     *
     * @return <p>
     *         List of rows returned by the request. Each row has a row Id and a
     *         list of data cells in that row. The data cells will be present in
     *         the same order as they are defined in the header.
     *         </p>
     */
    public java.util.List<ResultRow> getRows() {
        return rows;
    }

    /**
     * <p>
     * List of rows returned by the request. Each row has a row Id and a list of
     * data cells in that row. The data cells will be present in the same order
     * as they are defined in the header.
     * </p>
     *
     * @param rows <p>
     *            List of rows returned by the request. Each row has a row Id
     *            and a list of data cells in that row. The data cells will be
     *            present in the same order as they are defined in the header.
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
     * List of rows returned by the request. Each row has a row Id and a list of
     * data cells in that row. The data cells will be present in the same order
     * as they are defined in the header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rows <p>
     *            List of rows returned by the request. Each row has a row Id
     *            and a list of data cells in that row. The data cells will be
     *            present in the same order as they are defined in the header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultSet withRows(ResultRow... rows) {
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
     * List of rows returned by the request. Each row has a row Id and a list of
     * data cells in that row. The data cells will be present in the same order
     * as they are defined in the header.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rows <p>
     *            List of rows returned by the request. Each row has a row Id
     *            and a list of data cells in that row. The data cells will be
     *            present in the same order as they are defined in the header.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultSet withRows(java.util.Collection<ResultRow> rows) {
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
        if (getHeaders() != null)
            sb.append("headers: " + getHeaders() + ",");
        if (getRows() != null)
            sb.append("rows: " + getRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultSet == false)
            return false;
        ResultSet other = (ResultSet) obj;

        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        return true;
    }
}
