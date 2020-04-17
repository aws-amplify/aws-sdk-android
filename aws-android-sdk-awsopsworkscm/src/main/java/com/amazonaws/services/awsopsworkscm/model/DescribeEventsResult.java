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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

public class DescribeEventsResult implements Serializable {
    /**
     * <p>
     * Contains the response to a <code>DescribeEvents</code> request.
     * </p>
     */
    private java.util.List<ServerEvent> serverEvents;

    /**
     * <p>
     * NextToken is a string that is returned in some command responses. It
     * indicates that not all entries have been returned, and that you must run
     * at least one more request to get remaining items. To get remaining
     * results, call <code>DescribeEvents</code> again, and assign the token
     * from the previous results as the value of the <code>nextToken</code>
     * parameter. If there are no more results, the response object's
     * <code>nextToken</code> parameter value is <code>null</code>. Setting a
     * <code>nextToken</code> value that was not returned in your previous
     * results causes an <code>InvalidNextTokenException</code> to occur.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Contains the response to a <code>DescribeEvents</code> request.
     * </p>
     *
     * @return <p>
     *         Contains the response to a <code>DescribeEvents</code> request.
     *         </p>
     */
    public java.util.List<ServerEvent> getServerEvents() {
        return serverEvents;
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeEvents</code> request.
     * </p>
     *
     * @param serverEvents <p>
     *            Contains the response to a <code>DescribeEvents</code>
     *            request.
     *            </p>
     */
    public void setServerEvents(java.util.Collection<ServerEvent> serverEvents) {
        if (serverEvents == null) {
            this.serverEvents = null;
            return;
        }

        this.serverEvents = new java.util.ArrayList<ServerEvent>(serverEvents);
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeEvents</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverEvents <p>
     *            Contains the response to a <code>DescribeEvents</code>
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsResult withServerEvents(ServerEvent... serverEvents) {
        if (getServerEvents() == null) {
            this.serverEvents = new java.util.ArrayList<ServerEvent>(serverEvents.length);
        }
        for (ServerEvent value : serverEvents) {
            this.serverEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the response to a <code>DescribeEvents</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverEvents <p>
     *            Contains the response to a <code>DescribeEvents</code>
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsResult withServerEvents(java.util.Collection<ServerEvent> serverEvents) {
        setServerEvents(serverEvents);
        return this;
    }

    /**
     * <p>
     * NextToken is a string that is returned in some command responses. It
     * indicates that not all entries have been returned, and that you must run
     * at least one more request to get remaining items. To get remaining
     * results, call <code>DescribeEvents</code> again, and assign the token
     * from the previous results as the value of the <code>nextToken</code>
     * parameter. If there are no more results, the response object's
     * <code>nextToken</code> parameter value is <code>null</code>. Setting a
     * <code>nextToken</code> value that was not returned in your previous
     * results causes an <code>InvalidNextTokenException</code> to occur.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         NextToken is a string that is returned in some command responses.
     *         It indicates that not all entries have been returned, and that
     *         you must run at least one more request to get remaining items. To
     *         get remaining results, call <code>DescribeEvents</code> again,
     *         and assign the token from the previous results as the value of
     *         the <code>nextToken</code> parameter. If there are no more
     *         results, the response object's <code>nextToken</code> parameter
     *         value is <code>null</code>. Setting a <code>nextToken</code>
     *         value that was not returned in your previous results causes an
     *         <code>InvalidNextTokenException</code> to occur.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * NextToken is a string that is returned in some command responses. It
     * indicates that not all entries have been returned, and that you must run
     * at least one more request to get remaining items. To get remaining
     * results, call <code>DescribeEvents</code> again, and assign the token
     * from the previous results as the value of the <code>nextToken</code>
     * parameter. If there are no more results, the response object's
     * <code>nextToken</code> parameter value is <code>null</code>. Setting a
     * <code>nextToken</code> value that was not returned in your previous
     * results causes an <code>InvalidNextTokenException</code> to occur.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nextToken <p>
     *            NextToken is a string that is returned in some command
     *            responses. It indicates that not all entries have been
     *            returned, and that you must run at least one more request to
     *            get remaining items. To get remaining results, call
     *            <code>DescribeEvents</code> again, and assign the token from
     *            the previous results as the value of the
     *            <code>nextToken</code> parameter. If there are no more
     *            results, the response object's <code>nextToken</code>
     *            parameter value is <code>null</code>. Setting a
     *            <code>nextToken</code> value that was not returned in your
     *            previous results causes an
     *            <code>InvalidNextTokenException</code> to occur.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken is a string that is returned in some command responses. It
     * indicates that not all entries have been returned, and that you must run
     * at least one more request to get remaining items. To get remaining
     * results, call <code>DescribeEvents</code> again, and assign the token
     * from the previous results as the value of the <code>nextToken</code>
     * parameter. If there are no more results, the response object's
     * <code>nextToken</code> parameter value is <code>null</code>. Setting a
     * <code>nextToken</code> value that was not returned in your previous
     * results causes an <code>InvalidNextTokenException</code> to occur.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param nextToken <p>
     *            NextToken is a string that is returned in some command
     *            responses. It indicates that not all entries have been
     *            returned, and that you must run at least one more request to
     *            get remaining items. To get remaining results, call
     *            <code>DescribeEvents</code> again, and assign the token from
     *            the previous results as the value of the
     *            <code>nextToken</code> parameter. If there are no more
     *            results, the response object's <code>nextToken</code>
     *            parameter value is <code>null</code>. Setting a
     *            <code>nextToken</code> value that was not returned in your
     *            previous results causes an
     *            <code>InvalidNextTokenException</code> to occur.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsResult withNextToken(String nextToken) {
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
        if (getServerEvents() != null)
            sb.append("ServerEvents: " + getServerEvents() + ",");
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
                + ((getServerEvents() == null) ? 0 : getServerEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventsResult == false)
            return false;
        DescribeEventsResult other = (DescribeEventsResult) obj;

        if (other.getServerEvents() == null ^ this.getServerEvents() == null)
            return false;
        if (other.getServerEvents() != null
                && other.getServerEvents().equals(this.getServerEvents()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
