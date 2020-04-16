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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of findings that match the specified criteria.
 * </p>
 */
public class GetFindingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The finding attributes used to define a condition to filter the returned
     * findings.
     * </p>
     */
    private AwsSecurityFindingFilters filters;

    /**
     * <p>
     * The finding attributes used to sort the list of returned findings.
     * </p>
     */
    private java.util.List<SortCriterion> sortCriteria;

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>GetFindings</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of findings to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The finding attributes used to define a condition to filter the returned
     * findings.
     * </p>
     *
     * @return <p>
     *         The finding attributes used to define a condition to filter the
     *         returned findings.
     *         </p>
     */
    public AwsSecurityFindingFilters getFilters() {
        return filters;
    }

    /**
     * <p>
     * The finding attributes used to define a condition to filter the returned
     * findings.
     * </p>
     *
     * @param filters <p>
     *            The finding attributes used to define a condition to filter
     *            the returned findings.
     *            </p>
     */
    public void setFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The finding attributes used to define a condition to filter the returned
     * findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The finding attributes used to define a condition to filter
     *            the returned findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsRequest withFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
        return this;
    }

    /**
     * <p>
     * The finding attributes used to sort the list of returned findings.
     * </p>
     *
     * @return <p>
     *         The finding attributes used to sort the list of returned
     *         findings.
     *         </p>
     */
    public java.util.List<SortCriterion> getSortCriteria() {
        return sortCriteria;
    }

    /**
     * <p>
     * The finding attributes used to sort the list of returned findings.
     * </p>
     *
     * @param sortCriteria <p>
     *            The finding attributes used to sort the list of returned
     *            findings.
     *            </p>
     */
    public void setSortCriteria(java.util.Collection<SortCriterion> sortCriteria) {
        if (sortCriteria == null) {
            this.sortCriteria = null;
            return;
        }

        this.sortCriteria = new java.util.ArrayList<SortCriterion>(sortCriteria);
    }

    /**
     * <p>
     * The finding attributes used to sort the list of returned findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortCriteria <p>
     *            The finding attributes used to sort the list of returned
     *            findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsRequest withSortCriteria(SortCriterion... sortCriteria) {
        if (getSortCriteria() == null) {
            this.sortCriteria = new java.util.ArrayList<SortCriterion>(sortCriteria.length);
        }
        for (SortCriterion value : sortCriteria) {
            this.sortCriteria.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The finding attributes used to sort the list of returned findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sortCriteria <p>
     *            The finding attributes used to sort the list of returned
     *            findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsRequest withSortCriteria(java.util.Collection<SortCriterion> sortCriteria) {
        setSortCriteria(sortCriteria);
        return this;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>GetFindings</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     *
     * @return <p>
     *         The token that is required for pagination. On your first call to
     *         the <code>GetFindings</code> operation, set the value of this
     *         parameter to <code>NULL</code>.
     *         </p>
     *         <p>
     *         For subsequent calls to the operation, to continue listing data,
     *         set the value of this parameter to the value returned from the
     *         previous response.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>GetFindings</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     *
     * @param nextToken <p>
     *            The token that is required for pagination. On your first call
     *            to the <code>GetFindings</code> operation, set the value of
     *            this parameter to <code>NULL</code>.
     *            </p>
     *            <p>
     *            For subsequent calls to the operation, to continue listing
     *            data, set the value of this parameter to the value returned
     *            from the previous response.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>GetFindings</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token that is required for pagination. On your first call
     *            to the <code>GetFindings</code> operation, set the value of
     *            this parameter to <code>NULL</code>.
     *            </p>
     *            <p>
     *            For subsequent calls to the operation, to continue listing
     *            data, set the value of this parameter to the value returned
     *            from the previous response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of findings to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of findings to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of findings to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of findings to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of findings to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of findings to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFindingsRequest withMaxResults(Integer maxResults) {
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getSortCriteria() != null)
            sb.append("SortCriteria: " + getSortCriteria() + ",");
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
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

        if (obj instanceof GetFindingsRequest == false)
            return false;
        GetFindingsRequest other = (GetFindingsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null
                && other.getSortCriteria().equals(this.getSortCriteria()) == false)
            return false;
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
