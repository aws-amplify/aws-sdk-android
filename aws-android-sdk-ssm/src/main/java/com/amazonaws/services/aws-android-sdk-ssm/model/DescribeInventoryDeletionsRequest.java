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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Describes a specific delete inventory operation.</p>
 */
public class DescribeInventoryDeletionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>Specify the delete inventory ID for which you want information. This ID was returned by the <code>DeleteInventory</code> action.</p>
     */
    private String deletionId;

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    private String nextToken;

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>Specify the delete inventory ID for which you want information. This ID was returned by the <code>DeleteInventory</code> action.</p>
     *
     * @return <p>Specify the delete inventory ID for which you want information. This ID was returned by the <code>DeleteInventory</code> action.</p>
     */
    public String getDeletionId() {
        return deletionId;
    }

    /**
     * <p>Specify the delete inventory ID for which you want information. This ID was returned by the <code>DeleteInventory</code> action.</p>
     *
     * @param deletionId <p>Specify the delete inventory ID for which you want information. This ID was returned by the <code>DeleteInventory</code> action.</p>
     */
    public void setDeletionId(String deletionId) {
        this.deletionId = deletionId;
    }

    /**
     * <p>Specify the delete inventory ID for which you want information. This ID was returned by the <code>DeleteInventory</code> action.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deletionId <p>Specify the delete inventory ID for which you want information. This ID was returned by the <code>DeleteInventory</code> action.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeInventoryDeletionsRequest withDeletionId(String deletionId) {
        this.deletionId = deletionId;
        return this;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @return <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @param nextToken <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeInventoryDeletionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeInventoryDeletionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeletionId() != null) sb.append("DeletionId: " + getDeletionId() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletionId() == null) ? 0 : getDeletionId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInventoryDeletionsRequest == false) return false;
        DescribeInventoryDeletionsRequest other = (DescribeInventoryDeletionsRequest)obj;

        if (other.getDeletionId() == null ^ this.getDeletionId() == null) return false;
        if (other.getDeletionId() != null && other.getDeletionId().equals(this.getDeletionId()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        return true;
    }
}
