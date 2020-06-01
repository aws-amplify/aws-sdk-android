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
 * Returns the details of a single named query or a list of up to 50 queries,
 * which you provide as an array of query ID strings. Requires you to have
 * access to the workgroup in which the queries were saved. Use
 * <a>ListNamedQueriesInput</a> to get the list of named query IDs in the
 * specified workgroup. If information could not be retrieved for a submitted
 * query ID, information about the query ID submitted is listed under
 * <a>UnprocessedNamedQueryId</a>. Named queries differ from executed queries.
 * Use <a>BatchGetQueryExecutionInput</a> to get details about each unique query
 * execution, and <a>ListQueryExecutionsInput</a> to get a list of query
 * execution IDs.
 * </p>
 */
public class BatchGetNamedQueryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An array of query IDs.
     * </p>
     */
    private java.util.List<String> namedQueryIds;

    /**
     * <p>
     * An array of query IDs.
     * </p>
     *
     * @return <p>
     *         An array of query IDs.
     *         </p>
     */
    public java.util.List<String> getNamedQueryIds() {
        return namedQueryIds;
    }

    /**
     * <p>
     * An array of query IDs.
     * </p>
     *
     * @param namedQueryIds <p>
     *            An array of query IDs.
     *            </p>
     */
    public void setNamedQueryIds(java.util.Collection<String> namedQueryIds) {
        if (namedQueryIds == null) {
            this.namedQueryIds = null;
            return;
        }

        this.namedQueryIds = new java.util.ArrayList<String>(namedQueryIds);
    }

    /**
     * <p>
     * An array of query IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namedQueryIds <p>
     *            An array of query IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetNamedQueryRequest withNamedQueryIds(String... namedQueryIds) {
        if (getNamedQueryIds() == null) {
            this.namedQueryIds = new java.util.ArrayList<String>(namedQueryIds.length);
        }
        for (String value : namedQueryIds) {
            this.namedQueryIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of query IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namedQueryIds <p>
     *            An array of query IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetNamedQueryRequest withNamedQueryIds(java.util.Collection<String> namedQueryIds) {
        setNamedQueryIds(namedQueryIds);
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
        if (getNamedQueryIds() != null)
            sb.append("NamedQueryIds: " + getNamedQueryIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNamedQueryIds() == null) ? 0 : getNamedQueryIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetNamedQueryRequest == false)
            return false;
        BatchGetNamedQueryRequest other = (BatchGetNamedQueryRequest) obj;

        if (other.getNamedQueryIds() == null ^ this.getNamedQueryIds() == null)
            return false;
        if (other.getNamedQueryIds() != null
                && other.getNamedQueryIds().equals(this.getNamedQueryIds()) == false)
            return false;
        return true;
    }
}
