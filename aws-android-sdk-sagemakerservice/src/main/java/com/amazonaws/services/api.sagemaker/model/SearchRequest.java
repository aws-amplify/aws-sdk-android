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
 * Finds Amazon SageMaker resources that match a search query. Matching
 * resources are returned as a list of <code>SearchRecord</code> objects in the
 * response. You can sort the search results by any resource property in a
 * ascending or descending order.
 * </p>
 * <p>
 * You can query against the following value types: numeric, text, Boolean, and
 * timestamp.
 * </p>
 */
public class SearchRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     */
    private String resource;

    /**
     * <p>
     * A Boolean conditional statement. Resources must satisfy this condition to
     * be included in search results. You must provide at least one
     * subexpression, filter, or nested filter. The maximum number of recursive
     * <code>SubExpressions</code>, <code>NestedFilters</code>, and
     * <code>Filters</code> that can be included in a
     * <code>SearchExpression</code> object is 50.
     * </p>
     */
    private SearchExpression searchExpression;

    /**
     * <p>
     * The name of the resource property used to sort the
     * <code>SearchResults</code>. The default is <code>LastModifiedTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String sortBy;

    /**
     * <p>
     * How <code>SearchResults</code> are ordered. Valid values are
     * <code>Ascending</code> or <code>Descending</code>. The default is
     * <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     */
    private String sortOrder;

    /**
     * <p>
     * If more than <code>MaxResults</code> resources match the specified
     * <code>SearchExpression</code>, the response includes a
     * <code>NextToken</code>. The <code>NextToken</code> can be passed to the
     * next <code>SearchRequest</code> to continue retrieving results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     *
     * @return <p>
     *         The name of the Amazon SageMaker resource to search for.
     *         </p>
     * @see ResourceType
     */
    public String getResource() {
        return resource;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     *
     * @param resource <p>
     *            The name of the Amazon SageMaker resource to search for.
     *            </p>
     * @see ResourceType
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     *
     * @param resource <p>
     *            The name of the Amazon SageMaker resource to search for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public SearchRequest withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     *
     * @param resource <p>
     *            The name of the Amazon SageMaker resource to search for.
     *            </p>
     * @see ResourceType
     */
    public void setResource(ResourceType resource) {
        this.resource = resource.toString();
    }

    /**
     * <p>
     * The name of the Amazon SageMaker resource to search for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TrainingJob, Experiment, ExperimentTrial,
     * ExperimentTrialComponent
     *
     * @param resource <p>
     *            The name of the Amazon SageMaker resource to search for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public SearchRequest withResource(ResourceType resource) {
        this.resource = resource.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean conditional statement. Resources must satisfy this condition to
     * be included in search results. You must provide at least one
     * subexpression, filter, or nested filter. The maximum number of recursive
     * <code>SubExpressions</code>, <code>NestedFilters</code>, and
     * <code>Filters</code> that can be included in a
     * <code>SearchExpression</code> object is 50.
     * </p>
     *
     * @return <p>
     *         A Boolean conditional statement. Resources must satisfy this
     *         condition to be included in search results. You must provide at
     *         least one subexpression, filter, or nested filter. The maximum
     *         number of recursive <code>SubExpressions</code>,
     *         <code>NestedFilters</code>, and <code>Filters</code> that can be
     *         included in a <code>SearchExpression</code> object is 50.
     *         </p>
     */
    public SearchExpression getSearchExpression() {
        return searchExpression;
    }

    /**
     * <p>
     * A Boolean conditional statement. Resources must satisfy this condition to
     * be included in search results. You must provide at least one
     * subexpression, filter, or nested filter. The maximum number of recursive
     * <code>SubExpressions</code>, <code>NestedFilters</code>, and
     * <code>Filters</code> that can be included in a
     * <code>SearchExpression</code> object is 50.
     * </p>
     *
     * @param searchExpression <p>
     *            A Boolean conditional statement. Resources must satisfy this
     *            condition to be included in search results. You must provide
     *            at least one subexpression, filter, or nested filter. The
     *            maximum number of recursive <code>SubExpressions</code>,
     *            <code>NestedFilters</code>, and <code>Filters</code> that can
     *            be included in a <code>SearchExpression</code> object is 50.
     *            </p>
     */
    public void setSearchExpression(SearchExpression searchExpression) {
        this.searchExpression = searchExpression;
    }

    /**
     * <p>
     * A Boolean conditional statement. Resources must satisfy this condition to
     * be included in search results. You must provide at least one
     * subexpression, filter, or nested filter. The maximum number of recursive
     * <code>SubExpressions</code>, <code>NestedFilters</code>, and
     * <code>Filters</code> that can be included in a
     * <code>SearchExpression</code> object is 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchExpression <p>
     *            A Boolean conditional statement. Resources must satisfy this
     *            condition to be included in search results. You must provide
     *            at least one subexpression, filter, or nested filter. The
     *            maximum number of recursive <code>SubExpressions</code>,
     *            <code>NestedFilters</code>, and <code>Filters</code> that can
     *            be included in a <code>SearchExpression</code> object is 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRequest withSearchExpression(SearchExpression searchExpression) {
        this.searchExpression = searchExpression;
        return this;
    }

    /**
     * <p>
     * The name of the resource property used to sort the
     * <code>SearchResults</code>. The default is <code>LastModifiedTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         The name of the resource property used to sort the
     *         <code>SearchResults</code>. The default is
     *         <code>LastModifiedTime</code>.
     *         </p>
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The name of the resource property used to sort the
     * <code>SearchResults</code>. The default is <code>LastModifiedTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param sortBy <p>
     *            The name of the resource property used to sort the
     *            <code>SearchResults</code>. The default is
     *            <code>LastModifiedTime</code>.
     *            </p>
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The name of the resource property used to sort the
     * <code>SearchResults</code>. The default is <code>LastModifiedTime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param sortBy <p>
     *            The name of the resource property used to sort the
     *            <code>SearchResults</code>. The default is
     *            <code>LastModifiedTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * How <code>SearchResults</code> are ordered. Valid values are
     * <code>Ascending</code> or <code>Descending</code>. The default is
     * <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @return <p>
     *         How <code>SearchResults</code> are ordered. Valid values are
     *         <code>Ascending</code> or <code>Descending</code>. The default is
     *         <code>Descending</code>.
     *         </p>
     * @see SearchSortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * How <code>SearchResults</code> are ordered. Valid values are
     * <code>Ascending</code> or <code>Descending</code>. The default is
     * <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            How <code>SearchResults</code> are ordered. Valid values are
     *            <code>Ascending</code> or <code>Descending</code>. The default
     *            is <code>Descending</code>.
     *            </p>
     * @see SearchSortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * How <code>SearchResults</code> are ordered. Valid values are
     * <code>Ascending</code> or <code>Descending</code>. The default is
     * <code>Descending</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            How <code>SearchResults</code> are ordered. Valid values are
     *            <code>Ascending</code> or <code>Descending</code>. The default
     *            is <code>Descending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchSortOrder
     */
    public SearchRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * How <code>SearchResults</code> are ordered. Valid values are
     * <code>Ascending</code> or <code>Descending</code>. The default is
     * <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            How <code>SearchResults</code> are ordered. Valid values are
     *            <code>Ascending</code> or <code>Descending</code>. The default
     *            is <code>Descending</code>.
     *            </p>
     * @see SearchSortOrder
     */
    public void setSortOrder(SearchSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * How <code>SearchResults</code> are ordered. Valid values are
     * <code>Ascending</code> or <code>Descending</code>. The default is
     * <code>Descending</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            How <code>SearchResults</code> are ordered. Valid values are
     *            <code>Ascending</code> or <code>Descending</code>. The default
     *            is <code>Descending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchSortOrder
     */
    public SearchRequest withSortOrder(SearchSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resources match the specified
     * <code>SearchExpression</code>, the response includes a
     * <code>NextToken</code>. The <code>NextToken</code> can be passed to the
     * next <code>SearchRequest</code> to continue retrieving results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If more than <code>MaxResults</code> resources match the
     *         specified <code>SearchExpression</code>, the response includes a
     *         <code>NextToken</code>. The <code>NextToken</code> can be passed
     *         to the next <code>SearchRequest</code> to continue retrieving
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resources match the specified
     * <code>SearchExpression</code>, the response includes a
     * <code>NextToken</code>. The <code>NextToken</code> can be passed to the
     * next <code>SearchRequest</code> to continue retrieving results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If more than <code>MaxResults</code> resources match the
     *            specified <code>SearchExpression</code>, the response includes
     *            a <code>NextToken</code>. The <code>NextToken</code> can be
     *            passed to the next <code>SearchRequest</code> to continue
     *            retrieving results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> resources match the specified
     * <code>SearchExpression</code>, the response includes a
     * <code>NextToken</code>. The <code>NextToken</code> can be passed to the
     * next <code>SearchRequest</code> to continue retrieving results.
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
     *            If more than <code>MaxResults</code> resources match the
     *            specified <code>SearchExpression</code>, the response includes
     *            a <code>NextToken</code>. The <code>NextToken</code> can be
     *            passed to the next <code>SearchRequest</code> to continue
     *            retrieving results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchRequest withMaxResults(Integer maxResults) {
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
        if (getResource() != null)
            sb.append("Resource: " + getResource() + ",");
        if (getSearchExpression() != null)
            sb.append("SearchExpression: " + getSearchExpression() + ",");
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder() + ",");
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

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode
                + ((getSearchExpression() == null) ? 0 : getSearchExpression().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
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

        if (obj instanceof SearchRequest == false)
            return false;
        SearchRequest other = (SearchRequest) obj;

        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getSearchExpression() == null ^ this.getSearchExpression() == null)
            return false;
        if (other.getSearchExpression() != null
                && other.getSearchExpression().equals(this.getSearchExpression()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
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
