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
 * Returns information about a single execution of a query if you have access to
 * the workgroup in which the query ran. Each time a query executes, information
 * about the query execution is saved with a unique ID.
 * </p>
 */
public class GetQueryExecutionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     */
    private String queryExecutionId;

    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     *
     * @return <p>
     *         The unique ID of the query execution.
     *         </p>
     */
    public String getQueryExecutionId() {
        return queryExecutionId;
    }

    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     *
     * @param queryExecutionId <p>
     *            The unique ID of the query execution.
     *            </p>
     */
    public void setQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
    }

    /**
     * <p>
     * The unique ID of the query execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutionId <p>
     *            The unique ID of the query execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetQueryExecutionRequest withQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
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
        if (getQueryExecutionId() != null)
            sb.append("QueryExecutionId: " + getQueryExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryExecutionId() == null) ? 0 : getQueryExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryExecutionRequest == false)
            return false;
        GetQueryExecutionRequest other = (GetQueryExecutionRequest) obj;

        if (other.getQueryExecutionId() == null ^ this.getQueryExecutionId() == null)
            return false;
        if (other.getQueryExecutionId() != null
                && other.getQueryExecutionId().equals(this.getQueryExecutionId()) == false)
            return false;
        return true;
    }
}
