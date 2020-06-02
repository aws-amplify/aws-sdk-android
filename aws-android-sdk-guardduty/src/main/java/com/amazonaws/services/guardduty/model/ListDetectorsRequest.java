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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
 * </p>
 */
public class ListDetectorsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items that
     * you want in the response. The default value is 50. The maximum value is
     * 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items that
     * you want in the response. The default value is 50. The maximum value is
     * 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         You can use this parameter to indicate the maximum number of
     *         items that you want in the response. The default value is 50. The
     *         maximum value is 50.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items that
     * you want in the response. The default value is 50. The maximum value is
     * 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            You can use this parameter to indicate the maximum number of
     *            items that you want in the response. The default value is 50.
     *            The maximum value is 50.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items that
     * you want in the response. The default value is 50. The maximum value is
     * 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            You can use this parameter to indicate the maximum number of
     *            items that you want in the response. The default value is 50.
     *            The maximum value is 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectorsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     *
     * @return <p>
     *         You can use this parameter when paginating results. Set the value
     *         of this parameter to null on your first call to the list action.
     *         For subsequent calls to the action, fill nextToken in the request
     *         with the value of NextToken from the previous response to
     *         continue listing data.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     *
     * @param nextToken <p>
     *            You can use this parameter when paginating results. Set the
     *            value of this parameter to null on your first call to the list
     *            action. For subsequent calls to the action, fill nextToken in
     *            the request with the value of NextToken from the previous
     *            response to continue listing data.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            You can use this parameter when paginating results. Set the
     *            value of this parameter to null on your first call to the list
     *            action. For subsequent calls to the action, fill nextToken in
     *            the request with the value of NextToken from the previous
     *            response to continue listing data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectorsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListDetectorsRequest == false)
            return false;
        ListDetectorsRequest other = (ListDetectorsRequest) obj;

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
