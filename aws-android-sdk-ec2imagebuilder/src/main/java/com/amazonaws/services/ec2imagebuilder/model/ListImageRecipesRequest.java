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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of image recipes.
 * </p>
 */
public class ListImageRecipesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The owner defines which image recipes you want to list. By default, this
     * request will only show image recipes owned by your account. You can use
     * this field to specify if you want to view image recipes owned by
     * yourself, by Amazon, or those image recipes that have been shared with
     * you by other customers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Self, Shared, Amazon
     */
    private String owner;

    /**
     * <p>
     * The filters.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The owner defines which image recipes you want to list. By default, this
     * request will only show image recipes owned by your account. You can use
     * this field to specify if you want to view image recipes owned by
     * yourself, by Amazon, or those image recipes that have been shared with
     * you by other customers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Self, Shared, Amazon
     *
     * @return <p>
     *         The owner defines which image recipes you want to list. By
     *         default, this request will only show image recipes owned by your
     *         account. You can use this field to specify if you want to view
     *         image recipes owned by yourself, by Amazon, or those image
     *         recipes that have been shared with you by other customers.
     *         </p>
     * @see Ownership
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The owner defines which image recipes you want to list. By default, this
     * request will only show image recipes owned by your account. You can use
     * this field to specify if you want to view image recipes owned by
     * yourself, by Amazon, or those image recipes that have been shared with
     * you by other customers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Self, Shared, Amazon
     *
     * @param owner <p>
     *            The owner defines which image recipes you want to list. By
     *            default, this request will only show image recipes owned by
     *            your account. You can use this field to specify if you want to
     *            view image recipes owned by yourself, by Amazon, or those
     *            image recipes that have been shared with you by other
     *            customers.
     *            </p>
     * @see Ownership
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner defines which image recipes you want to list. By default, this
     * request will only show image recipes owned by your account. You can use
     * this field to specify if you want to view image recipes owned by
     * yourself, by Amazon, or those image recipes that have been shared with
     * you by other customers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Self, Shared, Amazon
     *
     * @param owner <p>
     *            The owner defines which image recipes you want to list. By
     *            default, this request will only show image recipes owned by
     *            your account. You can use this field to specify if you want to
     *            view image recipes owned by yourself, by Amazon, or those
     *            image recipes that have been shared with you by other
     *            customers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ownership
     */
    public ListImageRecipesRequest withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The owner defines which image recipes you want to list. By default, this
     * request will only show image recipes owned by your account. You can use
     * this field to specify if you want to view image recipes owned by
     * yourself, by Amazon, or those image recipes that have been shared with
     * you by other customers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Self, Shared, Amazon
     *
     * @param owner <p>
     *            The owner defines which image recipes you want to list. By
     *            default, this request will only show image recipes owned by
     *            your account. You can use this field to specify if you want to
     *            view image recipes owned by yourself, by Amazon, or those
     *            image recipes that have been shared with you by other
     *            customers.
     *            </p>
     * @see Ownership
     */
    public void setOwner(Ownership owner) {
        this.owner = owner.toString();
    }

    /**
     * <p>
     * The owner defines which image recipes you want to list. By default, this
     * request will only show image recipes owned by your account. You can use
     * this field to specify if you want to view image recipes owned by
     * yourself, by Amazon, or those image recipes that have been shared with
     * you by other customers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Self, Shared, Amazon
     *
     * @param owner <p>
     *            The owner defines which image recipes you want to list. By
     *            default, this request will only show image recipes owned by
     *            your account. You can use this field to specify if you want to
     *            view image recipes owned by yourself, by Amazon, or those
     *            image recipes that have been shared with you by other
     *            customers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Ownership
     */
    public ListImageRecipesRequest withOwner(Ownership owner) {
        this.owner = owner.toString();
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     *
     * @return <p>
     *         The filters.
     *         </p>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImageRecipesRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImageRecipesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @return <p>
     *         The maximum items to return in a request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param maxResults <p>
     *            The maximum items to return in a request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param maxResults <p>
     *            The maximum items to return in a request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImageRecipesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A token to specify where to start paginating. This is the
     *         NextToken from a previously truncated response.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A token to specify where to start paginating. This is the
     *            NextToken from a previously truncated response.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A token to specify where to start paginating. This is the
     *            NextToken from a previously truncated response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListImageRecipesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getOwner() != null)
            sb.append("owner: " + getOwner() + ",");
        if (getFilters() != null)
            sb.append("filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImageRecipesRequest == false)
            return false;
        ListImageRecipesRequest other = (ListImageRecipesRequest) obj;

        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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
        return true;
    }
}
