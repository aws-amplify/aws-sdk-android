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

public class BatchGetQueryExecutionResult implements Serializable {
    /**
     * <p>
     * Information about a query execution.
     * </p>
     */
    private java.util.List<QueryExecution> queryExecutions;

    /**
     * <p>
     * Information about the query executions that failed to run.
     * </p>
     */
    private java.util.List<UnprocessedQueryExecutionId> unprocessedQueryExecutionIds;

    /**
     * <p>
     * Information about a query execution.
     * </p>
     *
     * @return <p>
     *         Information about a query execution.
     *         </p>
     */
    public java.util.List<QueryExecution> getQueryExecutions() {
        return queryExecutions;
    }

    /**
     * <p>
     * Information about a query execution.
     * </p>
     *
     * @param queryExecutions <p>
     *            Information about a query execution.
     *            </p>
     */
    public void setQueryExecutions(java.util.Collection<QueryExecution> queryExecutions) {
        if (queryExecutions == null) {
            this.queryExecutions = null;
            return;
        }

        this.queryExecutions = new java.util.ArrayList<QueryExecution>(queryExecutions);
    }

    /**
     * <p>
     * Information about a query execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutions <p>
     *            Information about a query execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetQueryExecutionResult withQueryExecutions(QueryExecution... queryExecutions) {
        if (getQueryExecutions() == null) {
            this.queryExecutions = new java.util.ArrayList<QueryExecution>(queryExecutions.length);
        }
        for (QueryExecution value : queryExecutions) {
            this.queryExecutions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about a query execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutions <p>
     *            Information about a query execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetQueryExecutionResult withQueryExecutions(
            java.util.Collection<QueryExecution> queryExecutions) {
        setQueryExecutions(queryExecutions);
        return this;
    }

    /**
     * <p>
     * Information about the query executions that failed to run.
     * </p>
     *
     * @return <p>
     *         Information about the query executions that failed to run.
     *         </p>
     */
    public java.util.List<UnprocessedQueryExecutionId> getUnprocessedQueryExecutionIds() {
        return unprocessedQueryExecutionIds;
    }

    /**
     * <p>
     * Information about the query executions that failed to run.
     * </p>
     *
     * @param unprocessedQueryExecutionIds <p>
     *            Information about the query executions that failed to run.
     *            </p>
     */
    public void setUnprocessedQueryExecutionIds(
            java.util.Collection<UnprocessedQueryExecutionId> unprocessedQueryExecutionIds) {
        if (unprocessedQueryExecutionIds == null) {
            this.unprocessedQueryExecutionIds = null;
            return;
        }

        this.unprocessedQueryExecutionIds = new java.util.ArrayList<UnprocessedQueryExecutionId>(
                unprocessedQueryExecutionIds);
    }

    /**
     * <p>
     * Information about the query executions that failed to run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedQueryExecutionIds <p>
     *            Information about the query executions that failed to run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetQueryExecutionResult withUnprocessedQueryExecutionIds(
            UnprocessedQueryExecutionId... unprocessedQueryExecutionIds) {
        if (getUnprocessedQueryExecutionIds() == null) {
            this.unprocessedQueryExecutionIds = new java.util.ArrayList<UnprocessedQueryExecutionId>(
                    unprocessedQueryExecutionIds.length);
        }
        for (UnprocessedQueryExecutionId value : unprocessedQueryExecutionIds) {
            this.unprocessedQueryExecutionIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the query executions that failed to run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedQueryExecutionIds <p>
     *            Information about the query executions that failed to run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetQueryExecutionResult withUnprocessedQueryExecutionIds(
            java.util.Collection<UnprocessedQueryExecutionId> unprocessedQueryExecutionIds) {
        setUnprocessedQueryExecutionIds(unprocessedQueryExecutionIds);
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
        if (getQueryExecutions() != null)
            sb.append("QueryExecutions: " + getQueryExecutions() + ",");
        if (getUnprocessedQueryExecutionIds() != null)
            sb.append("UnprocessedQueryExecutionIds: " + getUnprocessedQueryExecutionIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryExecutions() == null) ? 0 : getQueryExecutions().hashCode());
        hashCode = prime
                * hashCode
                + ((getUnprocessedQueryExecutionIds() == null) ? 0
                        : getUnprocessedQueryExecutionIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetQueryExecutionResult == false)
            return false;
        BatchGetQueryExecutionResult other = (BatchGetQueryExecutionResult) obj;

        if (other.getQueryExecutions() == null ^ this.getQueryExecutions() == null)
            return false;
        if (other.getQueryExecutions() != null
                && other.getQueryExecutions().equals(this.getQueryExecutions()) == false)
            return false;
        if (other.getUnprocessedQueryExecutionIds() == null
                ^ this.getUnprocessedQueryExecutionIds() == null)
            return false;
        if (other.getUnprocessedQueryExecutionIds() != null
                && other.getUnprocessedQueryExecutionIds().equals(
                        this.getUnprocessedQueryExecutionIds()) == false)
            return false;
        return true;
    }
}
