/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class FilterLogEventsResult implements Serializable {
    /**
     * <p>
     * The matched events.
     * </p>
     */
    private java.util.List<FilteredLogEvent> events;

    /**
     * <p>
     * Indicates which log streams have been searched and whether each has been
     * searched completely.
     * </p>
     */
    private java.util.List<SearchedLogStream> searchedLogStreams;

    /**
     * <p>
     * The token to use when requesting the next set of items. The token expires
     * after 24 hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The matched events.
     * </p>
     *
     * @return <p>
     *         The matched events.
     *         </p>
     */
    public java.util.List<FilteredLogEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * The matched events.
     * </p>
     *
     * @param events <p>
     *            The matched events.
     *            </p>
     */
    public void setEvents(java.util.Collection<FilteredLogEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<FilteredLogEvent>(events);
    }

    /**
     * <p>
     * The matched events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The matched events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsResult withEvents(FilteredLogEvent... events) {
        if (getEvents() == null) {
            this.events = new java.util.ArrayList<FilteredLogEvent>(events.length);
        }
        for (FilteredLogEvent value : events) {
            this.events.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The matched events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The matched events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsResult withEvents(java.util.Collection<FilteredLogEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * Indicates which log streams have been searched and whether each has been
     * searched completely.
     * </p>
     *
     * @return <p>
     *         Indicates which log streams have been searched and whether each
     *         has been searched completely.
     *         </p>
     */
    public java.util.List<SearchedLogStream> getSearchedLogStreams() {
        return searchedLogStreams;
    }

    /**
     * <p>
     * Indicates which log streams have been searched and whether each has been
     * searched completely.
     * </p>
     *
     * @param searchedLogStreams <p>
     *            Indicates which log streams have been searched and whether
     *            each has been searched completely.
     *            </p>
     */
    public void setSearchedLogStreams(java.util.Collection<SearchedLogStream> searchedLogStreams) {
        if (searchedLogStreams == null) {
            this.searchedLogStreams = null;
            return;
        }

        this.searchedLogStreams = new java.util.ArrayList<SearchedLogStream>(searchedLogStreams);
    }

    /**
     * <p>
     * Indicates which log streams have been searched and whether each has been
     * searched completely.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchedLogStreams <p>
     *            Indicates which log streams have been searched and whether
     *            each has been searched completely.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsResult withSearchedLogStreams(SearchedLogStream... searchedLogStreams) {
        if (getSearchedLogStreams() == null) {
            this.searchedLogStreams = new java.util.ArrayList<SearchedLogStream>(
                    searchedLogStreams.length);
        }
        for (SearchedLogStream value : searchedLogStreams) {
            this.searchedLogStreams.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Indicates which log streams have been searched and whether each has been
     * searched completely.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchedLogStreams <p>
     *            Indicates which log streams have been searched and whether
     *            each has been searched completely.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsResult withSearchedLogStreams(
            java.util.Collection<SearchedLogStream> searchedLogStreams) {
        setSearchedLogStreams(searchedLogStreams);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. The token expires
     * after 24 hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The token to use when requesting the next set of items. The token
     *         expires after 24 hours.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. The token expires
     * after 24 hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. The
     *            token expires after 24 hours.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. The token expires
     * after 24 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. The
     *            token expires after 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FilterLogEventsResult withNextToken(String nextToken) {
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
        if (getEvents() != null)
            sb.append("events: " + getEvents() + ",");
        if (getSearchedLogStreams() != null)
            sb.append("searchedLogStreams: " + getSearchedLogStreams() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode
                + ((getSearchedLogStreams() == null) ? 0 : getSearchedLogStreams().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterLogEventsResult == false)
            return false;
        FilterLogEventsResult other = (FilterLogEventsResult) obj;

        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getSearchedLogStreams() == null ^ this.getSearchedLogStreams() == null)
            return false;
        if (other.getSearchedLogStreams() != null
                && other.getSearchedLogStreams().equals(this.getSearchedLogStreams()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
