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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves (queries) quotas and aggregated usage data for one or more
 * accounts.
 * </p>
 */
public class GetUsageStatisticsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     */
    private java.util.List<UsageStatisticsFilter> filterBy;

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     */
    private UsageStatisticsSortBy sortBy;

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     *
     * @return <p>
     *         The criteria to use to filter the query results.
     *         </p>
     */
    public java.util.List<UsageStatisticsFilter> getFilterBy() {
        return filterBy;
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     *
     * @param filterBy <p>
     *            The criteria to use to filter the query results.
     *            </p>
     */
    public void setFilterBy(java.util.Collection<UsageStatisticsFilter> filterBy) {
        if (filterBy == null) {
            this.filterBy = null;
            return;
        }

        this.filterBy = new java.util.ArrayList<UsageStatisticsFilter>(filterBy);
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterBy <p>
     *            The criteria to use to filter the query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageStatisticsRequest withFilterBy(UsageStatisticsFilter... filterBy) {
        if (getFilterBy() == null) {
            this.filterBy = new java.util.ArrayList<UsageStatisticsFilter>(filterBy.length);
        }
        for (UsageStatisticsFilter value : filterBy) {
            this.filterBy.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterBy <p>
     *            The criteria to use to filter the query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageStatisticsRequest withFilterBy(
            java.util.Collection<UsageStatisticsFilter> filterBy) {
        setFilterBy(filterBy);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to include in each page of the
     *         response.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of items to include in each page of the
     *            response.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of items to include in each page of the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageStatisticsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     *
     * @return <p>
     *         The nextToken string that specifies which page of results to
     *         return in a paginated response.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     *
     * @param nextToken <p>
     *            The nextToken string that specifies which page of results to
     *            return in a paginated response.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string that specifies which page of results to return in a
     * paginated response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The nextToken string that specifies which page of results to
     *            return in a paginated response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageStatisticsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     *
     * @return <p>
     *         The criteria to use to sort the query results.
     *         </p>
     */
    public UsageStatisticsSortBy getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     *
     * @param sortBy <p>
     *            The criteria to use to sort the query results.
     *            </p>
     */
    public void setSortBy(UsageStatisticsSortBy sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortBy <p>
     *            The criteria to use to sort the query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageStatisticsRequest withSortBy(UsageStatisticsSortBy sortBy) {
        this.sortBy = sortBy;
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
        if (getFilterBy() != null)
            sb.append("filterBy: " + getFilterBy() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getSortBy() != null)
            sb.append("sortBy: " + getSortBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterBy() == null) ? 0 : getFilterBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageStatisticsRequest == false)
            return false;
        GetUsageStatisticsRequest other = (GetUsageStatisticsRequest) obj;

        if (other.getFilterBy() == null ^ this.getFilterBy() == null)
            return false;
        if (other.getFilterBy() != null && other.getFilterBy().equals(this.getFilterBy()) == false)
            return false;
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
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        return true;
    }
}
