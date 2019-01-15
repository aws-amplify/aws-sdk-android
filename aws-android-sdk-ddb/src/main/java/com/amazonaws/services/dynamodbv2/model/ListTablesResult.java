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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>ListTables</code> operation.
 * </p>
 */
public class ListTablesResult implements Serializable {
    /**
     * <p>
     * The names of the tables associated with the current account at the
     * current endpoint. The maximum size of this array is 100.
     * </p>
     * <p>
     * If <code>LastEvaluatedTableName</code> also appears in the output, you
     * can use this value as the <code>ExclusiveStartTableName</code> parameter
     * in a subsequent <code>ListTables</code> request and obtain the next page
     * of results.
     * </p>
     */
    private java.util.List<String> tableNames;

    /**
     * <p>
     * The name of the last table in the current page of results. Use this value
     * as the <code>ExclusiveStartTableName</code> in a new request to obtain
     * the next page of results, until all the table names are returned.
     * </p>
     * <p>
     * If you do not receive a <code>LastEvaluatedTableName</code> value in the
     * response, this means that there are no more table names to be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String lastEvaluatedTableName;

    /**
     * <p>
     * The names of the tables associated with the current account at the
     * current endpoint. The maximum size of this array is 100.
     * </p>
     * <p>
     * If <code>LastEvaluatedTableName</code> also appears in the output, you
     * can use this value as the <code>ExclusiveStartTableName</code> parameter
     * in a subsequent <code>ListTables</code> request and obtain the next page
     * of results.
     * </p>
     *
     * @return <p>
     *         The names of the tables associated with the current account at
     *         the current endpoint. The maximum size of this array is 100.
     *         </p>
     *         <p>
     *         If <code>LastEvaluatedTableName</code> also appears in the
     *         output, you can use this value as the
     *         <code>ExclusiveStartTableName</code> parameter in a subsequent
     *         <code>ListTables</code> request and obtain the next page of
     *         results.
     *         </p>
     */
    public java.util.List<String> getTableNames() {
        return tableNames;
    }

    /**
     * <p>
     * The names of the tables associated with the current account at the
     * current endpoint. The maximum size of this array is 100.
     * </p>
     * <p>
     * If <code>LastEvaluatedTableName</code> also appears in the output, you
     * can use this value as the <code>ExclusiveStartTableName</code> parameter
     * in a subsequent <code>ListTables</code> request and obtain the next page
     * of results.
     * </p>
     *
     * @param tableNames <p>
     *            The names of the tables associated with the current account at
     *            the current endpoint. The maximum size of this array is 100.
     *            </p>
     *            <p>
     *            If <code>LastEvaluatedTableName</code> also appears in the
     *            output, you can use this value as the
     *            <code>ExclusiveStartTableName</code> parameter in a subsequent
     *            <code>ListTables</code> request and obtain the next page of
     *            results.
     *            </p>
     */
    public void setTableNames(java.util.Collection<String> tableNames) {
        if (tableNames == null) {
            this.tableNames = null;
            return;
        }

        this.tableNames = new java.util.ArrayList<String>(tableNames);
    }

    /**
     * <p>
     * The names of the tables associated with the current account at the
     * current endpoint. The maximum size of this array is 100.
     * </p>
     * <p>
     * If <code>LastEvaluatedTableName</code> also appears in the output, you
     * can use this value as the <code>ExclusiveStartTableName</code> parameter
     * in a subsequent <code>ListTables</code> request and obtain the next page
     * of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableNames <p>
     *            The names of the tables associated with the current account at
     *            the current endpoint. The maximum size of this array is 100.
     *            </p>
     *            <p>
     *            If <code>LastEvaluatedTableName</code> also appears in the
     *            output, you can use this value as the
     *            <code>ExclusiveStartTableName</code> parameter in a subsequent
     *            <code>ListTables</code> request and obtain the next page of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTablesResult withTableNames(String... tableNames) {
        if (getTableNames() == null) {
            this.tableNames = new java.util.ArrayList<String>(tableNames.length);
        }
        for (String value : tableNames) {
            this.tableNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the tables associated with the current account at the
     * current endpoint. The maximum size of this array is 100.
     * </p>
     * <p>
     * If <code>LastEvaluatedTableName</code> also appears in the output, you
     * can use this value as the <code>ExclusiveStartTableName</code> parameter
     * in a subsequent <code>ListTables</code> request and obtain the next page
     * of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableNames <p>
     *            The names of the tables associated with the current account at
     *            the current endpoint. The maximum size of this array is 100.
     *            </p>
     *            <p>
     *            If <code>LastEvaluatedTableName</code> also appears in the
     *            output, you can use this value as the
     *            <code>ExclusiveStartTableName</code> parameter in a subsequent
     *            <code>ListTables</code> request and obtain the next page of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTablesResult withTableNames(java.util.Collection<String> tableNames) {
        setTableNames(tableNames);
        return this;
    }

    /**
     * <p>
     * The name of the last table in the current page of results. Use this value
     * as the <code>ExclusiveStartTableName</code> in a new request to obtain
     * the next page of results, until all the table names are returned.
     * </p>
     * <p>
     * If you do not receive a <code>LastEvaluatedTableName</code> value in the
     * response, this means that there are no more table names to be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the last table in the current page of results. Use
     *         this value as the <code>ExclusiveStartTableName</code> in a new
     *         request to obtain the next page of results, until all the table
     *         names are returned.
     *         </p>
     *         <p>
     *         If you do not receive a <code>LastEvaluatedTableName</code> value
     *         in the response, this means that there are no more table names to
     *         be retrieved.
     *         </p>
     */
    public String getLastEvaluatedTableName() {
        return lastEvaluatedTableName;
    }

    /**
     * <p>
     * The name of the last table in the current page of results. Use this value
     * as the <code>ExclusiveStartTableName</code> in a new request to obtain
     * the next page of results, until all the table names are returned.
     * </p>
     * <p>
     * If you do not receive a <code>LastEvaluatedTableName</code> value in the
     * response, this means that there are no more table names to be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param lastEvaluatedTableName <p>
     *            The name of the last table in the current page of results. Use
     *            this value as the <code>ExclusiveStartTableName</code> in a
     *            new request to obtain the next page of results, until all the
     *            table names are returned.
     *            </p>
     *            <p>
     *            If you do not receive a <code>LastEvaluatedTableName</code>
     *            value in the response, this means that there are no more table
     *            names to be retrieved.
     *            </p>
     */
    public void setLastEvaluatedTableName(String lastEvaluatedTableName) {
        this.lastEvaluatedTableName = lastEvaluatedTableName;
    }

    /**
     * <p>
     * The name of the last table in the current page of results. Use this value
     * as the <code>ExclusiveStartTableName</code> in a new request to obtain
     * the next page of results, until all the table names are returned.
     * </p>
     * <p>
     * If you do not receive a <code>LastEvaluatedTableName</code> value in the
     * response, this means that there are no more table names to be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param lastEvaluatedTableName <p>
     *            The name of the last table in the current page of results. Use
     *            this value as the <code>ExclusiveStartTableName</code> in a
     *            new request to obtain the next page of results, until all the
     *            table names are returned.
     *            </p>
     *            <p>
     *            If you do not receive a <code>LastEvaluatedTableName</code>
     *            value in the response, this means that there are no more table
     *            names to be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTablesResult withLastEvaluatedTableName(String lastEvaluatedTableName) {
        this.lastEvaluatedTableName = lastEvaluatedTableName;
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
        if (getTableNames() != null)
            sb.append("TableNames: " + getTableNames() + ",");
        if (getLastEvaluatedTableName() != null)
            sb.append("LastEvaluatedTableName: " + getLastEvaluatedTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableNames() == null) ? 0 : getTableNames().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastEvaluatedTableName() == null) ? 0 : getLastEvaluatedTableName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTablesResult == false)
            return false;
        ListTablesResult other = (ListTablesResult) obj;

        if (other.getTableNames() == null ^ this.getTableNames() == null)
            return false;
        if (other.getTableNames() != null
                && other.getTableNames().equals(this.getTableNames()) == false)
            return false;
        if (other.getLastEvaluatedTableName() == null ^ this.getLastEvaluatedTableName() == null)
            return false;
        if (other.getLastEvaluatedTableName() != null
                && other.getLastEvaluatedTableName().equals(this.getLastEvaluatedTableName()) == false)
            return false;
        return true;
    }
}
