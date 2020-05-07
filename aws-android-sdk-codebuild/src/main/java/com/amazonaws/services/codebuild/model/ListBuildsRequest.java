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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a list of build IDs, with each build ID representing a single build.
 * </p>
 */
public class ListBuildsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The order to list build IDs. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build
     * ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build
     * ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     */
    private String sortOrder;

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list,
     * only the first 100 items are returned, along with a unique string called
     * a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the
     * items in the list, keep calling this operation with each subsequent next
     * token that is returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The order to list build IDs. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build
     * ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build
     * ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return <p>
     *         The order to list build IDs. Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASCENDING</code>: List the build IDs in ascending order by
     *         build ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DESCENDING</code>: List the build IDs in descending order
     *         by build ID.
     *         </p>
     *         </li>
     *         </ul>
     * @see SortOrderType
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The order to list build IDs. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build
     * ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build
     * ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The order to list build IDs. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: List the build IDs in ascending order
     *            by build ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: List the build IDs in descending
     *            order by build ID.
     *            </p>
     *            </li>
     *            </ul>
     * @see SortOrderType
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order to list build IDs. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build
     * ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build
     * ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The order to list build IDs. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: List the build IDs in ascending order
     *            by build ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: List the build IDs in descending
     *            order by build ID.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrderType
     */
    public ListBuildsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The order to list build IDs. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build
     * ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build
     * ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The order to list build IDs. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: List the build IDs in ascending order
     *            by build ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: List the build IDs in descending
     *            order by build ID.
     *            </p>
     *            </li>
     *            </ul>
     * @see SortOrderType
     */
    public void setSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The order to list build IDs. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List the build IDs in ascending order by build
     * ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List the build IDs in descending order by build
     * ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The order to list build IDs. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: List the build IDs in ascending order
     *            by build ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: List the build IDs in descending
     *            order by build ID.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrderType
     */
    public ListBuildsRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list,
     * only the first 100 items are returned, along with a unique string called
     * a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the
     * items in the list, keep calling this operation with each subsequent next
     * token that is returned, until no more next tokens are returned.
     * </p>
     *
     * @return <p>
     *         During a previous call, if there are more than 100 items in the
     *         list, only the first 100 items are returned, along with a unique
     *         string called a <i>nextToken</i>. To get the next batch of items
     *         in the list, call this operation again, adding the next token to
     *         the call. To get all of the items in the list, keep calling this
     *         operation with each subsequent next token that is returned, until
     *         no more next tokens are returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list,
     * only the first 100 items are returned, along with a unique string called
     * a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the
     * items in the list, keep calling this operation with each subsequent next
     * token that is returned, until no more next tokens are returned.
     * </p>
     *
     * @param nextToken <p>
     *            During a previous call, if there are more than 100 items in
     *            the list, only the first 100 items are returned, along with a
     *            unique string called a <i>nextToken</i>. To get the next batch
     *            of items in the list, call this operation again, adding the
     *            next token to the call. To get all of the items in the list,
     *            keep calling this operation with each subsequent next token
     *            that is returned, until no more next tokens are returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * During a previous call, if there are more than 100 items in the list,
     * only the first 100 items are returned, along with a unique string called
     * a <i>nextToken</i>. To get the next batch of items in the list, call this
     * operation again, adding the next token to the call. To get all of the
     * items in the list, keep calling this operation with each subsequent next
     * token that is returned, until no more next tokens are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            During a previous call, if there are more than 100 items in
     *            the list, only the first 100 items are returned, along with a
     *            unique string called a <i>nextToken</i>. To get the next batch
     *            of items in the list, call this operation again, adding the
     *            next token to the call. To get all of the items in the list,
     *            keep calling this operation with each subsequent next token
     *            that is returned, until no more next tokens are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBuildsRequest withNextToken(String nextToken) {
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
        if (getSortOrder() != null)
            sb.append("sortOrder: " + getSortOrder() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBuildsRequest == false)
            return false;
        ListBuildsRequest other = (ListBuildsRequest) obj;

        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
