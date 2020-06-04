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
package com.amazonaws.services.mediapackage-vod.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Returns a collection of MediaPackage VOD Asset resources.
 */
public class ListAssetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Upper bound on number of records to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * A token used to resume pagination from the end of a previous request.
     */
    private String nextToken;

    /**
     * Returns Assets associated with the specified PackagingGroup.
     */
    private String packagingGroupId;

    /**
     * Upper bound on number of records to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Upper bound on number of records to return.
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Upper bound on number of records to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults Upper bound on number of records to return.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Upper bound on number of records to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults Upper bound on number of records to return.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListAssetsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     *
     * @return A token used to resume pagination from the end of a previous request.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     *
     * @param nextToken A token used to resume pagination from the end of a previous request.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token used to resume pagination from the end of a previous request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A token used to resume pagination from the end of a previous request.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListAssetsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns Assets associated with the specified PackagingGroup.
     *
     * @return Returns Assets associated with the specified PackagingGroup.
     */
    public String getPackagingGroupId() {
        return packagingGroupId;
    }

    /**
     * Returns Assets associated with the specified PackagingGroup.
     *
     * @param packagingGroupId Returns Assets associated with the specified PackagingGroup.
     */
    public void setPackagingGroupId(String packagingGroupId) {
        this.packagingGroupId = packagingGroupId;
    }

    /**
     * Returns Assets associated with the specified PackagingGroup.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param packagingGroupId Returns Assets associated with the specified PackagingGroup.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListAssetsRequest withPackagingGroupId(String packagingGroupId) {
        this.packagingGroupId = packagingGroupId;
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
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getPackagingGroupId() != null) sb.append("PackagingGroupId: " + getPackagingGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPackagingGroupId() == null) ? 0 : getPackagingGroupId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAssetsRequest == false) return false;
        ListAssetsRequest other = (ListAssetsRequest)obj;

        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getPackagingGroupId() == null ^ this.getPackagingGroupId() == null) return false;
        if (other.getPackagingGroupId() != null && other.getPackagingGroupId().equals(this.getPackagingGroupId()) == false) return false;
        return true;
    }
}
