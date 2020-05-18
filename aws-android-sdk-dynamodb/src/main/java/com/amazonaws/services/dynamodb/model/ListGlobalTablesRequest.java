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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all global tables that have a replica in the specified Region.
 * </p>
 * <note>
 * <p>
 * This operation only applies to <a href=
 * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V1.html"
 * >Version 2017.11.29</a> of global tables.
 * </p>
 * </note>
 */
public class ListGlobalTablesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The first global table name that this operation will evaluate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String exclusiveStartGlobalTableName;

    /**
     * <p>
     * The maximum number of table names to return, if the parameter is not
     * specified DynamoDB defaults to 100.
     * </p>
     * <p>
     * If the number of global tables DynamoDB finds reaches this limit, it
     * stops the operation and returns the table names collected up to that
     * point, with a table name in the <code>LastEvaluatedGlobalTableName</code>
     * to apply in a subsequent operation to the
     * <code>ExclusiveStartGlobalTableName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * <p>
     * Lists the global tables in a specific Region.
     * </p>
     */
    private String regionName;

    /**
     * <p>
     * The first global table name that this operation will evaluate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The first global table name that this operation will evaluate.
     *         </p>
     */
    public String getExclusiveStartGlobalTableName() {
        return exclusiveStartGlobalTableName;
    }

    /**
     * <p>
     * The first global table name that this operation will evaluate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartGlobalTableName <p>
     *            The first global table name that this operation will evaluate.
     *            </p>
     */
    public void setExclusiveStartGlobalTableName(String exclusiveStartGlobalTableName) {
        this.exclusiveStartGlobalTableName = exclusiveStartGlobalTableName;
    }

    /**
     * <p>
     * The first global table name that this operation will evaluate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param exclusiveStartGlobalTableName <p>
     *            The first global table name that this operation will evaluate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGlobalTablesRequest withExclusiveStartGlobalTableName(
            String exclusiveStartGlobalTableName) {
        this.exclusiveStartGlobalTableName = exclusiveStartGlobalTableName;
        return this;
    }

    /**
     * <p>
     * The maximum number of table names to return, if the parameter is not
     * specified DynamoDB defaults to 100.
     * </p>
     * <p>
     * If the number of global tables DynamoDB finds reaches this limit, it
     * stops the operation and returns the table names collected up to that
     * point, with a table name in the <code>LastEvaluatedGlobalTableName</code>
     * to apply in a subsequent operation to the
     * <code>ExclusiveStartGlobalTableName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of table names to return, if the parameter is
     *         not specified DynamoDB defaults to 100.
     *         </p>
     *         <p>
     *         If the number of global tables DynamoDB finds reaches this limit,
     *         it stops the operation and returns the table names collected up
     *         to that point, with a table name in the
     *         <code>LastEvaluatedGlobalTableName</code> to apply in a
     *         subsequent operation to the
     *         <code>ExclusiveStartGlobalTableName</code> parameter.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * The maximum number of table names to return, if the parameter is not
     * specified DynamoDB defaults to 100.
     * </p>
     * <p>
     * If the number of global tables DynamoDB finds reaches this limit, it
     * stops the operation and returns the table names collected up to that
     * point, with a table name in the <code>LastEvaluatedGlobalTableName</code>
     * to apply in a subsequent operation to the
     * <code>ExclusiveStartGlobalTableName</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            The maximum number of table names to return, if the parameter
     *            is not specified DynamoDB defaults to 100.
     *            </p>
     *            <p>
     *            If the number of global tables DynamoDB finds reaches this
     *            limit, it stops the operation and returns the table names
     *            collected up to that point, with a table name in the
     *            <code>LastEvaluatedGlobalTableName</code> to apply in a
     *            subsequent operation to the
     *            <code>ExclusiveStartGlobalTableName</code> parameter.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of table names to return, if the parameter is not
     * specified DynamoDB defaults to 100.
     * </p>
     * <p>
     * If the number of global tables DynamoDB finds reaches this limit, it
     * stops the operation and returns the table names collected up to that
     * point, with a table name in the <code>LastEvaluatedGlobalTableName</code>
     * to apply in a subsequent operation to the
     * <code>ExclusiveStartGlobalTableName</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit <p>
     *            The maximum number of table names to return, if the parameter
     *            is not specified DynamoDB defaults to 100.
     *            </p>
     *            <p>
     *            If the number of global tables DynamoDB finds reaches this
     *            limit, it stops the operation and returns the table names
     *            collected up to that point, with a table name in the
     *            <code>LastEvaluatedGlobalTableName</code> to apply in a
     *            subsequent operation to the
     *            <code>ExclusiveStartGlobalTableName</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGlobalTablesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * Lists the global tables in a specific Region.
     * </p>
     *
     * @return <p>
     *         Lists the global tables in a specific Region.
     *         </p>
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * <p>
     * Lists the global tables in a specific Region.
     * </p>
     *
     * @param regionName <p>
     *            Lists the global tables in a specific Region.
     *            </p>
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * Lists the global tables in a specific Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionName <p>
     *            Lists the global tables in a specific Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGlobalTablesRequest withRegionName(String regionName) {
        this.regionName = regionName;
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
        if (getExclusiveStartGlobalTableName() != null)
            sb.append("ExclusiveStartGlobalTableName: " + getExclusiveStartGlobalTableName() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getRegionName() != null)
            sb.append("RegionName: " + getRegionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getExclusiveStartGlobalTableName() == null) ? 0
                        : getExclusiveStartGlobalTableName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGlobalTablesRequest == false)
            return false;
        ListGlobalTablesRequest other = (ListGlobalTablesRequest) obj;

        if (other.getExclusiveStartGlobalTableName() == null
                ^ this.getExclusiveStartGlobalTableName() == null)
            return false;
        if (other.getExclusiveStartGlobalTableName() != null
                && other.getExclusiveStartGlobalTableName().equals(
                        this.getExclusiveStartGlobalTableName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null
                && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        return true;
    }
}
