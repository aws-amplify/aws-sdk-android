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

package com.amazonaws.services.macie.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all Amazon Macie Classic member accounts for the current Amazon Macie
 * Classic master account.
 * </p>
 */
public class ListMemberAccountsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the ListMemberAccounts action.
     * Subsequent calls to the action fill nextToken in the request with the
     * value of nextToken from the previous response to continue listing data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Use this parameter to indicate the maximum number of items that you want
     * in the response. The default value is 250.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the ListMemberAccounts action.
     * Subsequent calls to the action fill nextToken in the request with the
     * value of nextToken from the previous response to continue listing data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         Use this parameter when paginating results. Set the value of this
     *         parameter to null on your first call to the ListMemberAccounts
     *         action. Subsequent calls to the action fill nextToken in the
     *         request with the value of nextToken from the previous response to
     *         continue listing data.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the ListMemberAccounts action.
     * Subsequent calls to the action fill nextToken in the request with the
     * value of nextToken from the previous response to continue listing data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param nextToken <p>
     *            Use this parameter when paginating results. Set the value of
     *            this parameter to null on your first call to the
     *            ListMemberAccounts action. Subsequent calls to the action fill
     *            nextToken in the request with the value of nextToken from the
     *            previous response to continue listing data.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the ListMemberAccounts action.
     * Subsequent calls to the action fill nextToken in the request with the
     * value of nextToken from the previous response to continue listing data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param nextToken <p>
     *            Use this parameter when paginating results. Set the value of
     *            this parameter to null on your first call to the
     *            ListMemberAccounts action. Subsequent calls to the action fill
     *            nextToken in the request with the value of nextToken from the
     *            previous response to continue listing data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMemberAccountsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Use this parameter to indicate the maximum number of items that you want
     * in the response. The default value is 250.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 250<br/>
     *
     * @return <p>
     *         Use this parameter to indicate the maximum number of items that
     *         you want in the response. The default value is 250.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Use this parameter to indicate the maximum number of items that you want
     * in the response. The default value is 250.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 250<br/>
     *
     * @param maxResults <p>
     *            Use this parameter to indicate the maximum number of items
     *            that you want in the response. The default value is 250.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Use this parameter to indicate the maximum number of items that you want
     * in the response. The default value is 250.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 250<br/>
     *
     * @param maxResults <p>
     *            Use this parameter to indicate the maximum number of items
     *            that you want in the response. The default value is 250.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMemberAccountsRequest withMaxResults(Integer maxResults) {
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
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
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

        if (obj instanceof ListMemberAccountsRequest == false)
            return false;
        ListMemberAccountsRequest other = (ListMemberAccountsRequest) obj;

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
