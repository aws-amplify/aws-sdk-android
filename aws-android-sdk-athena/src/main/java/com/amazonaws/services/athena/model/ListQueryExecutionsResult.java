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

public class ListQueryExecutionsResult implements Serializable {
    /**
     * <p>
     * The unique IDs of each query execution as an array of strings.
     * </p>
     */
    private java.util.List<String> queryExecutionIds;

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The unique IDs of each query execution as an array of strings.
     * </p>
     *
     * @return <p>
     *         The unique IDs of each query execution as an array of strings.
     *         </p>
     */
    public java.util.List<String> getQueryExecutionIds() {
        return queryExecutionIds;
    }

    /**
     * <p>
     * The unique IDs of each query execution as an array of strings.
     * </p>
     *
     * @param queryExecutionIds <p>
     *            The unique IDs of each query execution as an array of strings.
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
     * The unique IDs of each query execution as an array of strings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutionIds <p>
     *            The unique IDs of each query execution as an array of strings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueryExecutionsResult withQueryExecutionIds(String... queryExecutionIds) {
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
     * The unique IDs of each query execution as an array of strings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutionIds <p>
     *            The unique IDs of each query execution as an array of strings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueryExecutionsResult withQueryExecutionIds(
            java.util.Collection<String> queryExecutionIds) {
        setQueryExecutionIds(queryExecutionIds);
        return this;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A token to be used by the next request if this request is
     *         truncated.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A token to be used by the next request if this request is
     *            truncated.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to be used by the next request if this request is truncated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A token to be used by the next request if this request is
     *            truncated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueryExecutionsResult withNextToken(String nextToken) {
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
        if (getQueryExecutionIds() != null)
            sb.append("QueryExecutionIds: " + getQueryExecutionIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryExecutionIds() == null) ? 0 : getQueryExecutionIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQueryExecutionsResult == false)
            return false;
        ListQueryExecutionsResult other = (ListQueryExecutionsResult) obj;

        if (other.getQueryExecutionIds() == null ^ this.getQueryExecutionIds() == null)
            return false;
        if (other.getQueryExecutionIds() != null
                && other.getQueryExecutionIds().equals(this.getQueryExecutionIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
