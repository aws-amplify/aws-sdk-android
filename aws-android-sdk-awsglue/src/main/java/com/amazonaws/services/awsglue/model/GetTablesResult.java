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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class GetTablesResult implements Serializable {
    /**
     * <p>
     * A list of the requested <code>Table</code> objects.
     * </p>
     */
    private java.util.List<Table> tableList;

    /**
     * <p>
     * A continuation token, present if the current list segment is not the
     * last.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the requested <code>Table</code> objects.
     * </p>
     *
     * @return <p>
     *         A list of the requested <code>Table</code> objects.
     *         </p>
     */
    public java.util.List<Table> getTableList() {
        return tableList;
    }

    /**
     * <p>
     * A list of the requested <code>Table</code> objects.
     * </p>
     *
     * @param tableList <p>
     *            A list of the requested <code>Table</code> objects.
     *            </p>
     */
    public void setTableList(java.util.Collection<Table> tableList) {
        if (tableList == null) {
            this.tableList = null;
            return;
        }

        this.tableList = new java.util.ArrayList<Table>(tableList);
    }

    /**
     * <p>
     * A list of the requested <code>Table</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableList <p>
     *            A list of the requested <code>Table</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTablesResult withTableList(Table... tableList) {
        if (getTableList() == null) {
            this.tableList = new java.util.ArrayList<Table>(tableList.length);
        }
        for (Table value : tableList) {
            this.tableList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the requested <code>Table</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableList <p>
     *            A list of the requested <code>Table</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTablesResult withTableList(java.util.Collection<Table> tableList) {
        setTableList(tableList);
        return this;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the
     * last.
     * </p>
     *
     * @return <p>
     *         A continuation token, present if the current list segment is not
     *         the last.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the
     * last.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, present if the current list segment is
     *            not the last.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, present if the current list segment is not the
     * last.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, present if the current list segment is
     *            not the last.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTablesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getTableList() != null)
            sb.append("TableList: " + getTableList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableList() == null) ? 0 : getTableList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTablesResult == false)
            return false;
        GetTablesResult other = (GetTablesResult) obj;

        if (other.getTableList() == null ^ this.getTableList() == null)
            return false;
        if (other.getTableList() != null
                && other.getTableList().equals(this.getTableList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
