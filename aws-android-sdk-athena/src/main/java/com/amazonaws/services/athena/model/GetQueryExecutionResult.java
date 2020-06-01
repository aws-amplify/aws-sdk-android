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

public class GetQueryExecutionResult implements Serializable {
    /**
     * <p>
     * Information about the query execution.
     * </p>
     */
    private QueryExecution queryExecution;

    /**
     * <p>
     * Information about the query execution.
     * </p>
     *
     * @return <p>
     *         Information about the query execution.
     *         </p>
     */
    public QueryExecution getQueryExecution() {
        return queryExecution;
    }

    /**
     * <p>
     * Information about the query execution.
     * </p>
     *
     * @param queryExecution <p>
     *            Information about the query execution.
     *            </p>
     */
    public void setQueryExecution(QueryExecution queryExecution) {
        this.queryExecution = queryExecution;
    }

    /**
     * <p>
     * Information about the query execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecution <p>
     *            Information about the query execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetQueryExecutionResult withQueryExecution(QueryExecution queryExecution) {
        this.queryExecution = queryExecution;
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
        if (getQueryExecution() != null)
            sb.append("QueryExecution: " + getQueryExecution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryExecution() == null) ? 0 : getQueryExecution().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryExecutionResult == false)
            return false;
        GetQueryExecutionResult other = (GetQueryExecutionResult) obj;

        if (other.getQueryExecution() == null ^ this.getQueryExecution() == null)
            return false;
        if (other.getQueryExecution() != null
                && other.getQueryExecution().equals(this.getQueryExecution()) == false)
            return false;
        return true;
    }
}
