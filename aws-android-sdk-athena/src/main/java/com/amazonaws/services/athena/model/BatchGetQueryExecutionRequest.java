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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the details of a single query execution or a list of up to 50 query
 * executions, which you provide as an array of query execution ID strings.
 * Requires you to have access to the workgroup in which the queries ran. To get
 * a list of query execution IDs, use <a>ListQueryExecutionsInput$WorkGroup</a>.
 * Query executions differ from named (saved) queries. Use
 * <a>BatchGetNamedQueryInput</a> to get details about named queries.
 * </p>
 */
public class BatchGetQueryExecutionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array of query execution IDs.
     * </p>
     */
    private java.util.List<String> queryExecutionIds;

    /**
     * <p>
     * An array of query execution IDs.
     * </p>
     *
     * @return <p>
     *         An array of query execution IDs.
     *         </p>
     */
    public java.util.List<String> getQueryExecutionIds() {
        return queryExecutionIds;
    }

    /**
     * <p>
     * An array of query execution IDs.
     * </p>
     *
     * @param queryExecutionIds <p>
     *            An array of query execution IDs.
     *            </p>
     */
    public void setQueryExecutionIds(java.util.Collection<String> queryExecutionIds) {
        if (queryExecutionIds == null) {
            this.queryExecutionIds = null;
            return;
        }

        this.queryExecutionIds = new java.util.ArrayList<String>(queryExecutionIds);
    }

    /**
     * <p>
     * An array of query execution IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutionIds <p>
     *            An array of query execution IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetQueryExecutionRequest withQueryExecutionIds(String... queryExecutionIds) {
        if (getQueryExecutionIds() == null) {
            this.queryExecutionIds = new java.util.ArrayList<String>(queryExecutionIds.length);
        }
        for (String value : queryExecutionIds) {
            this.queryExecutionIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of query execution IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutionIds <p>
     *            An array of query execution IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetQueryExecutionRequest withQueryExecutionIds(
            java.util.Collection<String> queryExecutionIds) {
        setQueryExecutionIds(queryExecutionIds);
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
        if (getQueryExecutionIds() != null)
            sb.append("QueryExecutionIds: " + getQueryExecutionIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryExecutionIds() == null) ? 0 : getQueryExecutionIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetQueryExecutionRequest == false)
            return false;
        BatchGetQueryExecutionRequest other = (BatchGetQueryExecutionRequest) obj;

        if (other.getQueryExecutionIds() == null ^ this.getQueryExecutionIds() == null)
            return false;
        if (other.getQueryExecutionIds() != null
                && other.getQueryExecutionIds().equals(this.getQueryExecutionIds()) == false)
            return false;
        return true;
    }
}
