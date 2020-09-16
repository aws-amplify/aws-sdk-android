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
 * <p>Returns all State Manager associations in the current AWS account and Region. You can limit the results to a specific State Manager association document or instance by specifying a filter.</p>
 */
public class ListAssociationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>One or more filters. Use a filter to return a more specific list of results.</p>
     */
    private java.util.List<AssociationFilter> associationFilterList;

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    private String nextToken;

    /**
     * <p>One or more filters. Use a filter to return a more specific list of results.</p>
     *
     * @return <p>One or more filters. Use a filter to return a more specific list of results.</p>
     */
    public java.util.List<AssociationFilter> getAssociationFilterList() {
        return associationFilterList;
    }

    /**
     * <p>One or more filters. Use a filter to return a more specific list of results.</p>
     *
     * @param associationFilterList <p>One or more filters. Use a filter to return a more specific list of results.</p>
     */
    public void setAssociationFilterList(java.util.Collection<AssociationFilter> associationFilterList) {
        if (associationFilterList == null) {
            this.associationFilterList = null;
            return;
        }

        this.associationFilterList = new java.util.ArrayList<AssociationFilter>(associationFilterList);
    }

    /**
     * <p>One or more filters. Use a filter to return a more specific list of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationFilterList <p>One or more filters. Use a filter to return a more specific list of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListAssociationsRequest withAssociationFilterList(AssociationFilter... associationFilterList) {
        if (getAssociationFilterList() == null) {
            this.associationFilterList = new java.util.ArrayList<AssociationFilter>(associationFilterList.length);
        }
        for (AssociationFilter value : associationFilterList) {
            this.associationFilterList.add(value);
        }
        return this;
    }

    /**
     * <p>One or more filters. Use a filter to return a more specific list of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationFilterList <p>One or more filters. Use a filter to return a more specific list of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListAssociationsRequest withAssociationFilterList(java.util.Collection<AssociationFilter> associationFilterList) {
        setAssociationFilterList(associationFilterList);
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
    public ListAssociationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @param nextToken <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListAssociationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getAssociationFilterList() != null) sb.append("AssociationFilterList: " + getAssociationFilterList() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationFilterList() == null) ? 0 : getAssociationFilterList().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAssociationsRequest == false) return false;
        ListAssociationsRequest other = (ListAssociationsRequest)obj;

        if (other.getAssociationFilterList() == null ^ this.getAssociationFilterList() == null) return false;
        if (other.getAssociationFilterList() != null && other.getAssociationFilterList().equals(this.getAssociationFilterList()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
