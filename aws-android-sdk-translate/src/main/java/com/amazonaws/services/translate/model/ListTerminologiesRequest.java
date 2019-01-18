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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides a list of custom terminologies associated with your account.
 * </p>
 */
public class ListTerminologiesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If the result of the request to ListTerminologies was truncated, include
     * the NextToken to fetch the next group of custom terminologies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of custom terminologies returned per list request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If the result of the request to ListTerminologies was truncated, include
     * the NextToken to fetch the next group of custom terminologies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @return <p>
     *         If the result of the request to ListTerminologies was truncated,
     *         include the NextToken to fetch the next group of custom
     *         terminologies.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the result of the request to ListTerminologies was truncated, include
     * the NextToken to fetch the next group of custom terminologies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @param nextToken <p>
     *            If the result of the request to ListTerminologies was
     *            truncated, include the NextToken to fetch the next group of
     *            custom terminologies.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the request to ListTerminologies was truncated, include
     * the NextToken to fetch the next group of custom terminologies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @param nextToken <p>
     *            If the result of the request to ListTerminologies was
     *            truncated, include the NextToken to fetch the next group of
     *            custom terminologies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTerminologiesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of custom terminologies returned per list request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @return <p>
     *         The maximum number of custom terminologies returned per list
     *         request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of custom terminologies returned per list request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of custom terminologies returned per list
     *            request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of custom terminologies returned per list request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of custom terminologies returned per list
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTerminologiesRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListTerminologiesRequest == false)
            return false;
        ListTerminologiesRequest other = (ListTerminologiesRequest) obj;

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
