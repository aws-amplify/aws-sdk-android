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

public class DescribeEventAggregatesResult implements Serializable {
    /**
     * <p>
     * The number of events in each category that meet the optional filter
     * criteria.
     * </p>
     */
    private java.util.List<EventAggregate> eventAggregates;

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
     * The number of events in each category that meet the optional filter
     * criteria.
     * </p>
     *
     * @return <p>
     *         The number of events in each category that meet the optional
     *         filter criteria.
     *         </p>
     */
    public java.util.List<EventAggregate> getEventAggregates() {
        return eventAggregates;
    }

    /**
     * <p>
     * The number of events in each category that meet the optional filter
     * criteria.
     * </p>
     *
     * @param eventAggregates <p>
     *            The number of events in each category that meet the optional
     *            filter criteria.
     *            </p>
     */
    public void setEventAggregates(java.util.Collection<EventAggregate> eventAggregates) {
        if (eventAggregates == null) {
            this.eventAggregates = null;
            return;
        }

        this.eventAggregates = new java.util.ArrayList<EventAggregate>(eventAggregates);
    }

    /**
     * <p>
     * The number of events in each category that meet the optional filter
     * criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventAggregates <p>
     *            The number of events in each category that meet the optional
     *            filter criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventAggregatesResult withEventAggregates(EventAggregate... eventAggregates) {
        if (getEventAggregates() == null) {
            this.eventAggregates = new java.util.ArrayList<EventAggregate>(eventAggregates.length);
        }
        for (EventAggregate value : eventAggregates) {
            this.eventAggregates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The number of events in each category that meet the optional filter
     * criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventAggregates <p>
     *            The number of events in each category that meet the optional
     *            filter criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventAggregatesResult withEventAggregates(
            java.util.Collection<EventAggregate> eventAggregates) {
        setEventAggregates(eventAggregates);
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
    public DescribeEventAggregatesResult withNextToken(String nextToken) {
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
        if (getEventAggregates() != null)
            sb.append("eventAggregates: " + getEventAggregates() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventAggregates() == null) ? 0 : getEventAggregates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventAggregatesResult == false)
            return false;
        DescribeEventAggregatesResult other = (DescribeEventAggregatesResult) obj;

        if (other.getEventAggregates() == null ^ this.getEventAggregates() == null)
            return false;
        if (other.getEventAggregates() != null
                && other.getEventAggregates().equals(this.getEventAggregates()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
