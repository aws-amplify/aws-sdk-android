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

package com.amazonaws.services.health.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the number of events of each event type (issue, scheduled change, and
 * account notification). If no filter is specified, the counts of all events in
 * each category are returned.
 * </p>
 */
public class DescribeEventAggregatesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Values to narrow the results returned.
     * </p>
     */
    private EventFilter filter;

    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eventTypeCategory
     */
    private String aggregateField;

    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100,
     * inclusive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Values to narrow the results returned.
     * </p>
     *
     * @return <p>
     *         Values to narrow the results returned.
     *         </p>
     */
    public EventFilter getFilter() {
        return filter;
    }

    /**
     * <p>
     * Values to narrow the results returned.
     * </p>
     *
     * @param filter <p>
     *            Values to narrow the results returned.
     *            </p>
     */
    public void setFilter(EventFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Values to narrow the results returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            Values to narrow the results returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventAggregatesRequest withFilter(EventFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eventTypeCategory
     *
     * @return <p>
     *         The only currently supported value is
     *         <code>eventTypeCategory</code>.
     *         </p>
     * @see EventAggregateField
     */
    public String getAggregateField() {
        return aggregateField;
    }

    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eventTypeCategory
     *
     * @param aggregateField <p>
     *            The only currently supported value is
     *            <code>eventTypeCategory</code>.
     *            </p>
     * @see EventAggregateField
     */
    public void setAggregateField(String aggregateField) {
        this.aggregateField = aggregateField;
    }

    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eventTypeCategory
     *
     * @param aggregateField <p>
     *            The only currently supported value is
     *            <code>eventTypeCategory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventAggregateField
     */
    public DescribeEventAggregatesRequest withAggregateField(String aggregateField) {
        this.aggregateField = aggregateField;
        return this;
    }

    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eventTypeCategory
     *
     * @param aggregateField <p>
     *            The only currently supported value is
     *            <code>eventTypeCategory</code>.
     *            </p>
     * @see EventAggregateField
     */
    public void setAggregateField(EventAggregateField aggregateField) {
        this.aggregateField = aggregateField.toString();
    }

    /**
     * <p>
     * The only currently supported value is <code>eventTypeCategory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>eventTypeCategory
     *
     * @param aggregateField <p>
     *            The only currently supported value is
     *            <code>eventTypeCategory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventAggregateField
     */
    public DescribeEventAggregatesRequest withAggregateField(EventAggregateField aggregateField) {
        this.aggregateField = aggregateField.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100,
     * inclusive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @return <p>
     *         The maximum number of items to return in one batch, between 10
     *         and 100, inclusive.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100,
     * inclusive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return in one batch, between 10
     *            and 100, inclusive.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in one batch, between 10 and 100,
     * inclusive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return in one batch, between 10
     *            and 100, inclusive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventAggregatesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @return <p>
     *         If the results of a search are large, only a portion of the
     *         results are returned, and a <code>nextToken</code> pagination
     *         token is returned in the response. To retrieve the next batch of
     *         results, reissue the search request and include the returned
     *         token. When all results have been returned, the response does not
     *         contain a pagination token value.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @param nextToken <p>
     *            If the results of a search are large, only a portion of the
     *            results are returned, and a <code>nextToken</code> pagination
     *            token is returned in the response. To retrieve the next batch
     *            of results, reissue the search request and include the
     *            returned token. When all results have been returned, the
     *            response does not contain a pagination token value.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @param nextToken <p>
     *            If the results of a search are large, only a portion of the
     *            results are returned, and a <code>nextToken</code> pagination
     *            token is returned in the response. To retrieve the next batch
     *            of results, reissue the search request and include the
     *            returned token. When all results have been returned, the
     *            response does not contain a pagination token value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventAggregatesRequest withNextToken(String nextToken) {
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
        if (getFilter() != null)
            sb.append("filter: " + getFilter() + ",");
        if (getAggregateField() != null)
            sb.append("aggregateField: " + getAggregateField() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode
                + ((getAggregateField() == null) ? 0 : getAggregateField().hashCode());
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

        if (obj instanceof DescribeEventAggregatesRequest == false)
            return false;
        DescribeEventAggregatesRequest other = (DescribeEventAggregatesRequest) obj;

        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getAggregateField() == null ^ this.getAggregateField() == null)
            return false;
        if (other.getAggregateField() != null
                && other.getAggregateField().equals(this.getAggregateField()) == false)
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
