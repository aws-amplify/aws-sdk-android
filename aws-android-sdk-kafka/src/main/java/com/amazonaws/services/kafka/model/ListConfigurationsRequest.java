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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 <p>
 * Returns a list of all the MSK configurations in this Region.
 * </p>
 */
public class ListConfigurationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * 
     <p>
     * The maximum number of results to return in the response. If there are
     * more results, the response includes a NextToken parameter.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * 
     <p>
     * The paginated results marker. When the result of the operation is
     * truncated, the call returns NextToken in the response. To get the next
     * batch, provide this token in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * 
     <p>
     * The maximum number of results to return in the response. If there are
     * more results, the response includes a NextToken parameter.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return in the response. If there
     *         are more results, the response includes a NextToken parameter.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * 
     <p>
     * The maximum number of results to return in the response. If there are
     * more results, the response includes a NextToken parameter.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in the response. If
     *            there are more results, the response includes a NextToken
     *            parameter.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * 
     <p>
     * The maximum number of results to return in the response. If there are
     * more results, the response includes a NextToken parameter.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in the response. If
     *            there are more results, the response includes a NextToken
     *            parameter.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConfigurationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * 
     <p>
     * The paginated results marker. When the result of the operation is
     * truncated, the call returns NextToken in the response. To get the next
     * batch, provide this token in your next request.
     * </p>
     * 
     * @return <p>
     *         The paginated results marker. When the result of the operation is
     *         truncated, the call returns NextToken in the response. To get the
     *         next batch, provide this token in your next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * 
     <p>
     * The paginated results marker. When the result of the operation is
     * truncated, the call returns NextToken in the response. To get the next
     * batch, provide this token in your next request.
     * </p>
     * 
     * @param nextToken <p>
     *            The paginated results marker. When the result of the operation
     *            is truncated, the call returns NextToken in the response. To
     *            get the next batch, provide this token in your next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * 
     <p>
     * The paginated results marker. When the result of the operation is
     * truncated, the call returns NextToken in the response. To get the next
     * batch, provide this token in your next request.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The paginated results marker. When the result of the operation
     *            is truncated, the call returns NextToken in the response. To
     *            get the next batch, provide this token in your next request.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConfigurationsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListConfigurationsRequest == false)
            return false;
        ListConfigurationsRequest other = (ListConfigurationsRequest) obj;

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
