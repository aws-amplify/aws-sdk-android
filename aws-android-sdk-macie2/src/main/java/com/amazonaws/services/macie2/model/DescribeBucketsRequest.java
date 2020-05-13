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
 * Retrieves (queries) statistical data and other information about one or more
 * S3 buckets that Amazon Macie monitors and analyzes.
 * </p>
 */
public class DescribeBucketsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     */
    private java.util.Map<String, BucketCriteriaAdditionalProperties> criteria;

    /**
     * <p>
     * The maximum number of items to include in each page of the response. The
     * default value is 50.
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
    private BucketSortCriteria sortCriteria;

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     *
     * @return <p>
     *         The criteria to use to filter the query results.
     *         </p>
     */
    public java.util.Map<String, BucketCriteriaAdditionalProperties> getCriteria() {
        return criteria;
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     *
     * @param criteria <p>
     *            The criteria to use to filter the query results.
     *            </p>
     */
    public void setCriteria(java.util.Map<String, BucketCriteriaAdditionalProperties> criteria) {
        this.criteria = criteria;
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param criteria <p>
     *            The criteria to use to filter the query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBucketsRequest withCriteria(
            java.util.Map<String, BucketCriteriaAdditionalProperties> criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * <p>
     * The criteria to use to filter the query results.
     * </p>
     * <p>
     * The method adds a new key-value pair into criteria parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into criteria.
     * @param value The corresponding value of the entry to be added into
     *            criteria.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBucketsRequest addcriteriaEntry(String key,
            BucketCriteriaAdditionalProperties value) {
        if (null == this.criteria) {
            this.criteria = new java.util.HashMap<String, BucketCriteriaAdditionalProperties>();
        }
        if (this.criteria.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.criteria.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into criteria.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DescribeBucketsRequest clearcriteriaEntries() {
        this.criteria = null;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response. The
     * default value is 50.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to include in each page of the
     *         response. The default value is 50.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response. The
     * default value is 50.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of items to include in each page of the
     *            response. The default value is 50.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of the response. The
     * default value is 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of items to include in each page of the
     *            response. The default value is 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBucketsRequest withMaxResults(Integer maxResults) {
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
    public DescribeBucketsRequest withNextToken(String nextToken) {
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
    public BucketSortCriteria getSortCriteria() {
        return sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     *
     * @param sortCriteria <p>
     *            The criteria to use to sort the query results.
     *            </p>
     */
    public void setSortCriteria(BucketSortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    /**
     * <p>
     * The criteria to use to sort the query results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortCriteria <p>
     *            The criteria to use to sort the query results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBucketsRequest withSortCriteria(BucketSortCriteria sortCriteria) {
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
        if (getCriteria() != null)
            sb.append("criteria: " + getCriteria() + ",");
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

        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
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

        if (obj instanceof DescribeBucketsRequest == false)
            return false;
        DescribeBucketsRequest other = (DescribeBucketsRequest) obj;

        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
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
