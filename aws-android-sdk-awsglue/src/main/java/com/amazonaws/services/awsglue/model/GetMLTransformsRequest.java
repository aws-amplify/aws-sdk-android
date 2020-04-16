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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a sortable, filterable list of existing AWS Glue machine learning
 * transforms. Machine learning transforms are a special type of transform that
 * use machine learning to learn the details of the transformation to be
 * performed by learning from examples provided by humans. These transformations
 * are then saved by AWS Glue, and you can retrieve their metadata by calling
 * <code>GetMLTransforms</code>.
 * </p>
 */
public class GetMLTransformsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A paginated token to offset the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The filter transformation criteria.
     * </p>
     */
    private TransformFilterCriteria filter;

    /**
     * <p>
     * The sorting criteria.
     * </p>
     */
    private TransformSortCriteria sort;

    /**
     * <p>
     * A paginated token to offset the results.
     * </p>
     *
     * @return <p>
     *         A paginated token to offset the results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A paginated token to offset the results.
     * </p>
     *
     * @param nextToken <p>
     *            A paginated token to offset the results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A paginated token to offset the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A paginated token to offset the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
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
     * <b>Range: </b>1 - 1000<br/>
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
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The filter transformation criteria.
     * </p>
     *
     * @return <p>
     *         The filter transformation criteria.
     *         </p>
     */
    public TransformFilterCriteria getFilter() {
        return filter;
    }

    /**
     * <p>
     * The filter transformation criteria.
     * </p>
     *
     * @param filter <p>
     *            The filter transformation criteria.
     *            </p>
     */
    public void setFilter(TransformFilterCriteria filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter transformation criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            The filter transformation criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformsRequest withFilter(TransformFilterCriteria filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     *
     * @return <p>
     *         The sorting criteria.
     *         </p>
     */
    public TransformSortCriteria getSort() {
        return sort;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     *
     * @param sort <p>
     *            The sorting criteria.
     *            </p>
     */
    public void setSort(TransformSortCriteria sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sort <p>
     *            The sorting criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTransformsRequest withSort(TransformSortCriteria sort) {
        this.sort = sort;
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
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getSort() != null)
            sb.append("Sort: " + getSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLTransformsRequest == false)
            return false;
        GetMLTransformsRequest other = (GetMLTransformsRequest) obj;

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
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        return true;
    }
}
