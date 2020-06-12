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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns summary information about stack sets that are associated with the
 * user.
 * </p>
 */
public class ListStackSetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining
     * results, the response object's <code>NextToken</code> parameter value is
     * set to a token. To retrieve the next set of results, call
     * <code>ListStackSets</code> again and assign that token to the request
     * object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter
     * is set to <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The status of the stack sets that you want to get summary information
     * about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     */
    private String status;

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining
     * results, the response object's <code>NextToken</code> parameter value is
     * set to a token. To retrieve the next set of results, call
     * <code>ListStackSets</code> again and assign that token to the request
     * object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter
     * is set to <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         If the previous paginated request didn't return all of the
     *         remaining results, the response object's <code>NextToken</code>
     *         parameter value is set to a token. To retrieve the next set of
     *         results, call <code>ListStackSets</code> again and assign that
     *         token to the request object's <code>NextToken</code> parameter.
     *         If there are no remaining results, the previous response object's
     *         <code>NextToken</code> parameter is set to <code>null</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining
     * results, the response object's <code>NextToken</code> parameter value is
     * set to a token. To retrieve the next set of results, call
     * <code>ListStackSets</code> again and assign that token to the request
     * object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter
     * is set to <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous paginated request didn't return all of the
     *            remaining results, the response object's
     *            <code>NextToken</code> parameter value is set to a token. To
     *            retrieve the next set of results, call
     *            <code>ListStackSets</code> again and assign that token to the
     *            request object's <code>NextToken</code> parameter. If there
     *            are no remaining results, the previous response object's
     *            <code>NextToken</code> parameter is set to <code>null</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining
     * results, the response object's <code>NextToken</code> parameter value is
     * set to a token. To retrieve the next set of results, call
     * <code>ListStackSets</code> again and assign that token to the request
     * object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter
     * is set to <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous paginated request didn't return all of the
     *            remaining results, the response object's
     *            <code>NextToken</code> parameter value is set to a token. To
     *            retrieve the next set of results, call
     *            <code>ListStackSets</code> again and assign that token to the
     *            request object's <code>NextToken</code> parameter. If there
     *            are no remaining results, the previous response object's
     *            <code>NextToken</code> parameter is set to <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackSetsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to be returned with a single call.
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
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned with a single
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
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned with a single
     *            call. If the number of available results exceeds this maximum,
     *            the response includes a <code>NextToken</code> value that you
     *            can assign to the <code>NextToken</code> request parameter to
     *            get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackSetsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The status of the stack sets that you want to get summary information
     * about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @return <p>
     *         The status of the stack sets that you want to get summary
     *         information about.
     *         </p>
     * @see StackSetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the stack sets that you want to get summary information
     * about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack sets that you want to get summary
     *            information about.
     *            </p>
     * @see StackSetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stack sets that you want to get summary information
     * about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack sets that you want to get summary
     *            information about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetStatus
     */
    public ListStackSetsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the stack sets that you want to get summary information
     * about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack sets that you want to get summary
     *            information about.
     *            </p>
     * @see StackSetStatus
     */
    public void setStatus(StackSetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the stack sets that you want to get summary information
     * about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack sets that you want to get summary
     *            information about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetStatus
     */
    public ListStackSetsRequest withStatus(StackSetStatus status) {
        this.status = status.toString();
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStackSetsRequest == false)
            return false;
        ListStackSetsRequest other = (ListStackSetsRequest) obj;

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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
