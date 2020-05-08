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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists user profiles.
 * </p>
 */
public class ListUserProfilesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list up to a specified limit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     */
    private String sortOrder;

    /**
     * <p>
     * The parameter by which to sort the results. The default is CreationTime.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreationTime, LastModifiedTime
     */
    private String sortBy;

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     */
    private String domainIdEquals;

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String userProfileNameContains;

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the previous response was truncated, you will receive this
     *         token. Use it in your next request to receive the next set of
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use
     * it in your next request to receive the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was truncated, you will receive this
     *            token. Use it in your next request to receive the next set of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserProfilesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Returns a list up to a specified limit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         Returns a list up to a specified limit.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Returns a list up to a specified limit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Returns a list up to a specified limit.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Returns a list up to a specified limit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Returns a list up to a specified limit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserProfilesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @return <p>
     *         The sort order for the results. The default is Ascending.
     *         </p>
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is Ascending.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is Ascending.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListUserProfilesRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is Ascending.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is Ascending.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListUserProfilesRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is CreationTime.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreationTime, LastModifiedTime
     *
     * @return <p>
     *         The parameter by which to sort the results. The default is
     *         CreationTime.
     *         </p>
     * @see UserProfileSortKey
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is CreationTime.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreationTime, LastModifiedTime
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            CreationTime.
     *            </p>
     * @see UserProfileSortKey
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is CreationTime.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreationTime, LastModifiedTime
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            CreationTime.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserProfileSortKey
     */
    public ListUserProfilesRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is CreationTime.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreationTime, LastModifiedTime
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            CreationTime.
     *            </p>
     * @see UserProfileSortKey
     */
    public void setSortBy(UserProfileSortKey sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is CreationTime.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CreationTime, LastModifiedTime
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            CreationTime.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserProfileSortKey
     */
    public ListUserProfilesRequest withSortBy(UserProfileSortKey sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @return <p>
     *         A parameter by which to filter the results.
     *         </p>
     */
    public String getDomainIdEquals() {
        return domainIdEquals;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainIdEquals <p>
     *            A parameter by which to filter the results.
     *            </p>
     */
    public void setDomainIdEquals(String domainIdEquals) {
        this.domainIdEquals = domainIdEquals;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainIdEquals <p>
     *            A parameter by which to filter the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserProfilesRequest withDomainIdEquals(String domainIdEquals) {
        this.domainIdEquals = domainIdEquals;
        return this;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         A parameter by which to filter the results.
     *         </p>
     */
    public String getUserProfileNameContains() {
        return userProfileNameContains;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param userProfileNameContains <p>
     *            A parameter by which to filter the results.
     *            </p>
     */
    public void setUserProfileNameContains(String userProfileNameContains) {
        this.userProfileNameContains = userProfileNameContains;
    }

    /**
     * <p>
     * A parameter by which to filter the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param userProfileNameContains <p>
     *            A parameter by which to filter the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUserProfilesRequest withUserProfileNameContains(String userProfileNameContains) {
        this.userProfileNameContains = userProfileNameContains;
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
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder() + ",");
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getDomainIdEquals() != null)
            sb.append("DomainIdEquals: " + getDomainIdEquals() + ",");
        if (getUserProfileNameContains() != null)
            sb.append("UserProfileNameContains: " + getUserProfileNameContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode
                + ((getDomainIdEquals() == null) ? 0 : getDomainIdEquals().hashCode());
        hashCode = prime
                * hashCode
                + ((getUserProfileNameContains() == null) ? 0 : getUserProfileNameContains()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUserProfilesRequest == false)
            return false;
        ListUserProfilesRequest other = (ListUserProfilesRequest) obj;

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
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getDomainIdEquals() == null ^ this.getDomainIdEquals() == null)
            return false;
        if (other.getDomainIdEquals() != null
                && other.getDomainIdEquals().equals(this.getDomainIdEquals()) == false)
            return false;
        if (other.getUserProfileNameContains() == null ^ this.getUserProfileNameContains() == null)
            return false;
        if (other.getUserProfileNameContains() != null
                && other.getUserProfileNameContains().equals(this.getUserProfileNameContains()) == false)
            return false;
        return true;
    }
}
