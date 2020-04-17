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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes events for a specified server. Results are ordered by time, with
 * newest events first.
 * </p>
 * <p>
 * This operation is synchronous.
 * </p>
 * <p>
 * A <code>ResourceNotFoundException</code> is thrown when the server does not
 * exist. A <code>ValidationException</code> is raised when parameters of the
 * request are not valid.
 * </p>
 */
public class DescribeEventsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the server for which you want to view events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

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
     * To receive a paginated response, use this parameter to specify the
     * maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the server for which you want to view events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p>
     *         The name of the server for which you want to view events.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The name of the server for which you want to view events.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server for which you want to view events.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server for which you want to view events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>
     *            The name of the server for which you want to view events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withServerName(String serverName) {
        this.serverName = serverName;
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
    public DescribeEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * To receive a paginated response, use this parameter to specify the
     * maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         To receive a paginated response, use this parameter to specify
     *         the maximum number of results to be returned with a single call.
     *         If the number of available results exceeds this maximum, the
     *         response includes a <code>NextToken</code> value that you can
     *         assign to the <code>NextToken</code> request parameter to get the
     *         next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * To receive a paginated response, use this parameter to specify the
     * maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            To receive a paginated response, use this parameter to specify
     *            the maximum number of results to be returned with a single
     *            call. If the number of available results exceeds this maximum,
     *            the response includes a <code>NextToken</code> value that you
     *            can assign to the <code>NextToken</code> request parameter to
     *            get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * To receive a paginated response, use this parameter to specify the
     * maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            To receive a paginated response, use this parameter to specify
     *            the maximum number of results to be returned with a single
     *            call. If the number of available results exceeds this maximum,
     *            the response includes a <code>NextToken</code> value that you
     *            can assign to the <code>NextToken</code> request parameter to
     *            get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeEventsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
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

        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
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
        return true;
    }
}
