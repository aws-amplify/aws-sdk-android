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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves a sortable, filterable list of existing AWS Glue machine learning
 * transforms in this AWS account, or the resources with the specified tag. This
 * operation takes the optional <code>Tags</code> field, which you can use as a
 * filter of the responses so that tagged resources can be retrieved as a group.
 * If you choose to use tag filtering, only resources with the tags are
 * retrieved.
 * </p>
 */
public class ListMLTransformsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A continuation token, if this is a continuation request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A <code>TransformFilterCriteria</code> used to filter the machine
     * learning transforms.
     * </p>
     */
    private TransformFilterCriteria filter;

    /**
     * <p>
     * A <code>TransformSortCriteria</code> used to sort the machine learning
     * transforms.
     * </p>
     */
    private TransformSortCriteria sort;

    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A continuation token, if this is a continuation request.
     * </p>
     *
     * @return <p>
     *         A continuation token, if this is a continuation request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation request.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if this is a continuation request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if this is a continuation request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMLTransformsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum size of a list to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum size of a list to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum size of a list to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMLTransformsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A <code>TransformFilterCriteria</code> used to filter the machine
     * learning transforms.
     * </p>
     *
     * @return <p>
     *         A <code>TransformFilterCriteria</code> used to filter the machine
     *         learning transforms.
     *         </p>
     */
    public TransformFilterCriteria getFilter() {
        return filter;
    }

    /**
     * <p>
     * A <code>TransformFilterCriteria</code> used to filter the machine
     * learning transforms.
     * </p>
     *
     * @param filter <p>
     *            A <code>TransformFilterCriteria</code> used to filter the
     *            machine learning transforms.
     *            </p>
     */
    public void setFilter(TransformFilterCriteria filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A <code>TransformFilterCriteria</code> used to filter the machine
     * learning transforms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            A <code>TransformFilterCriteria</code> used to filter the
     *            machine learning transforms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMLTransformsRequest withFilter(TransformFilterCriteria filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * A <code>TransformSortCriteria</code> used to sort the machine learning
     * transforms.
     * </p>
     *
     * @return <p>
     *         A <code>TransformSortCriteria</code> used to sort the machine
     *         learning transforms.
     *         </p>
     */
    public TransformSortCriteria getSort() {
        return sort;
    }

    /**
     * <p>
     * A <code>TransformSortCriteria</code> used to sort the machine learning
     * transforms.
     * </p>
     *
     * @param sort <p>
     *            A <code>TransformSortCriteria</code> used to sort the machine
     *            learning transforms.
     *            </p>
     */
    public void setSort(TransformSortCriteria sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * A <code>TransformSortCriteria</code> used to sort the machine learning
     * transforms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sort <p>
     *            A <code>TransformSortCriteria</code> used to sort the machine
     *            learning transforms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMLTransformsRequest withSort(TransformSortCriteria sort) {
        this.sort = sort;
        return this;
    }

    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     *
     * @return <p>
     *         Specifies to return only these tagged resources.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     *
     * @param tags <p>
     *            Specifies to return only these tagged resources.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Specifies to return only these tagged resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMLTransformsRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMLTransformsRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ListMLTransformsRequest clearTagsEntries() {
        this.tags = null;
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
            sb.append("Sort: " + getSort() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMLTransformsRequest == false)
            return false;
        ListMLTransformsRequest other = (ListMLTransformsRequest) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
