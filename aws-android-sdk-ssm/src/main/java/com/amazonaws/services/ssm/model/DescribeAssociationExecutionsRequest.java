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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Use this API action to view all executions for a specific association ID.
 * </p>
 */
public class DescribeAssociationExecutionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The association ID for which you want to view execution history details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     */
    private String associationId;

    /**
     * <p>
     * Filters for the request. You can specify the following filters and
     * values.
     * </p>
     * <p>
     * ExecutionId (EQUAL)
     * </p>
     * <p>
     * Status (EQUAL)
     * </p>
     * <p>
     * CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
     * </p>
     */
    private java.util.List<AssociationExecutionFilter> filters;

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The association ID for which you want to view execution history details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The association ID for which you want to view execution history
     *         details.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The association ID for which you want to view execution history details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param associationId <p>
     *            The association ID for which you want to view execution
     *            history details.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID for which you want to view execution history details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param associationId <p>
     *            The association ID for which you want to view execution
     *            history details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssociationExecutionsRequest withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * Filters for the request. You can specify the following filters and
     * values.
     * </p>
     * <p>
     * ExecutionId (EQUAL)
     * </p>
     * <p>
     * Status (EQUAL)
     * </p>
     * <p>
     * CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
     * </p>
     *
     * @return <p>
     *         Filters for the request. You can specify the following filters
     *         and values.
     *         </p>
     *         <p>
     *         ExecutionId (EQUAL)
     *         </p>
     *         <p>
     *         Status (EQUAL)
     *         </p>
     *         <p>
     *         CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
     *         </p>
     */
    public java.util.List<AssociationExecutionFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters for the request. You can specify the following filters and
     * values.
     * </p>
     * <p>
     * ExecutionId (EQUAL)
     * </p>
     * <p>
     * Status (EQUAL)
     * </p>
     * <p>
     * CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
     * </p>
     *
     * @param filters <p>
     *            Filters for the request. You can specify the following filters
     *            and values.
     *            </p>
     *            <p>
     *            ExecutionId (EQUAL)
     *            </p>
     *            <p>
     *            Status (EQUAL)
     *            </p>
     *            <p>
     *            CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
     *            </p>
     */
    public void setFilters(java.util.Collection<AssociationExecutionFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<AssociationExecutionFilter>(filters);
    }

    /**
     * <p>
     * Filters for the request. You can specify the following filters and
     * values.
     * </p>
     * <p>
     * ExecutionId (EQUAL)
     * </p>
     * <p>
     * Status (EQUAL)
     * </p>
     * <p>
     * CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters for the request. You can specify the following filters
     *            and values.
     *            </p>
     *            <p>
     *            ExecutionId (EQUAL)
     *            </p>
     *            <p>
     *            Status (EQUAL)
     *            </p>
     *            <p>
     *            CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssociationExecutionsRequest withFilters(AssociationExecutionFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<AssociationExecutionFilter>(filters.length);
        }
        for (AssociationExecutionFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filters for the request. You can specify the following filters and
     * values.
     * </p>
     * <p>
     * ExecutionId (EQUAL)
     * </p>
     * <p>
     * Status (EQUAL)
     * </p>
     * <p>
     * CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Filters for the request. You can specify the following filters
     *            and values.
     *            </p>
     *            <p>
     *            ExecutionId (EQUAL)
     *            </p>
     *            <p>
     *            Status (EQUAL)
     *            </p>
     *            <p>
     *            CreatedTime (EQUAL, GREATER_THAN, LESS_THAN)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssociationExecutionsRequest withFilters(
            java.util.Collection<AssociationExecutionFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of items to return for this call. The call
     *         also returns a token that you can specify in a subsequent call to
     *         get the next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssociationExecutionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     *
     * @return <p>
     *         A token to start the list. Use this token to get the next set of
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            A token to start the list. Use this token to get the next set
     *            of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token to start the list. Use this token to get the next set
     *            of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssociationExecutionsRequest withNextToken(String nextToken) {
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
        if (getAssociationId() != null)
            sb.append("AssociationId: " + getAssociationId() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
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
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssociationExecutionsRequest == false)
            return false;
        DescribeAssociationExecutionsRequest other = (DescribeAssociationExecutionsRequest) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
