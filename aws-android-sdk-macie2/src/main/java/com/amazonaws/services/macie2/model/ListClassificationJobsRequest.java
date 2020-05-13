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
 * Retrieves information about the status and settings for one or more
 * classification jobs.
 * </p>
 */
public class ListClassificationJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The criteria to use to filter the results.
     * </p>
     */
    private ListJobsFilterCriteria filterCriteria;

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
     * The criteria to use to sort the results.
     * </p>
     */
    private ListJobsSortCriteria sortCriteria;

    /**
     * <p>
     * The criteria to use to filter the results.
     * </p>
     *
     * @return <p>
     *         The criteria to use to filter the results.
     *         </p>
     */
    public ListJobsFilterCriteria getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter the results.
     * </p>
     *
     * @param filterCriteria <p>
     *            The criteria to use to filter the results.
     *            </p>
     */
    public void setFilterCriteria(ListJobsFilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * The criteria to use to filter the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterCriteria <p>
     *            The criteria to use to filter the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClassificationJobsRequest withFilterCriteria(ListJobsFilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
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
    public ListClassificationJobsRequest withMaxResults(Integer maxResults) {
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
    public ListClassificationJobsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The criteria to use to sort the results.
     * </p>
     *
     * @return <p>
     *         The criteria to use to sort the results.
     *         </p>
     */
    public ListJobsSortCriteria getSortCriteria() {
        return sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the results.
     * </p>
     *
     * @param sortCriteria <p>
     *            The criteria to use to sort the results.
     *            </p>
     */
    public void setSortCriteria(ListJobsSortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortCriteria <p>
     *            The criteria to use to sort the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClassificationJobsRequest withSortCriteria(ListJobsSortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
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
        if (getFilterCriteria() != null)
            sb.append("filterCriteria: " + getFilterCriteria() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getSortCriteria() != null)
            sb.append("sortCriteria: " + getSortCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClassificationJobsRequest == false)
            return false;
        ListClassificationJobsRequest other = (ListClassificationJobsRequest) obj;

        if (other.getFilterCriteria() == null ^ this.getFilterCriteria() == null)
            return false;
        if (other.getFilterCriteria() != null
                && other.getFilterCriteria().equals(this.getFilterCriteria()) == false)
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
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null
                && other.getSortCriteria().equals(this.getSortCriteria()) == false)
            return false;
        return true;
    }
}
