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
 * Returns information about events that meet the specified filter criteria.
 * Events are returned in a summary form and do not include the detailed
 * description, any additional metadata that depends on the event type, or any
 * affected resources. To retrieve that information, use the
 * <a>DescribeEventDetails</a> and <a>DescribeAffectedEntities</a> operations.
 * </p>
 * <p>
 * If no filter criteria are specified, all events are returned. Results are
 * sorted by <code>lastModifiedTime</code>, starting with the most recent.
 * </p>
 */
public class DescribeEventsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Values to narrow the results returned.
     * </p>
     */
    private EventFilter filter;

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
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     */
    private String locale;

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
    public DescribeEventsRequest withFilter(EventFilter filter) {
        this.filter = filter;
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
    public DescribeEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
    public DescribeEventsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     *
     * @return <p>
     *         The locale (language) to return information in. English (en) is
     *         the default and the only supported value at this time.
     *         </p>
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     *
     * @param locale <p>
     *            The locale (language) to return information in. English (en)
     *            is the default and the only supported value at this time.
     *            </p>
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale (language) to return information in. English (en) is the
     * default and the only supported value at this time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 256<br/>
     * <b>Pattern: </b>.{2,256}<br/>
     *
     * @param locale <p>
     *            The locale (language) to return information in. English (en)
     *            is the default and the only supported value at this time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withLocale(String locale) {
        this.locale = locale;
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getLocale() != null)
            sb.append("locale: " + getLocale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventsRequest == false)
            return false;
        DescribeEventsRequest other = (DescribeEventsRequest) obj;

        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        return true;
    }
}
