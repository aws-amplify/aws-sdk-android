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
 * Lists the machine learning algorithms that have been created.
 * </p>
 */
public class ListAlgorithmsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A filter that returns only algorithms created after the specified time
     * (timestamp).
     * </p>
     */
    private java.util.Date creationTimeAfter;

    /**
     * <p>
     * A filter that returns only algorithms created before the specified time
     * (timestamp).
     * </p>
     */
    private java.util.Date creationTimeBefore;

    /**
     * <p>
     * The maximum number of algorithms to return in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A string in the algorithm name. This filter returns only algorithms whose
     * name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String nameContains;

    /**
     * <p>
     * If the response to a previous <code>ListAlgorithms</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of algorithms, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The parameter by which to sort the results. The default is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     */
    private String sortBy;

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     */
    private String sortOrder;

    /**
     * <p>
     * A filter that returns only algorithms created after the specified time
     * (timestamp).
     * </p>
     *
     * @return <p>
     *         A filter that returns only algorithms created after the specified
     *         time (timestamp).
     *         </p>
     */
    public java.util.Date getCreationTimeAfter() {
        return creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only algorithms created after the specified time
     * (timestamp).
     * </p>
     *
     * @param creationTimeAfter <p>
     *            A filter that returns only algorithms created after the
     *            specified time (timestamp).
     *            </p>
     */
    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only algorithms created after the specified time
     * (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeAfter <p>
     *            A filter that returns only algorithms created after the
     *            specified time (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAlgorithmsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
        return this;
    }

    /**
     * <p>
     * A filter that returns only algorithms created before the specified time
     * (timestamp).
     * </p>
     *
     * @return <p>
     *         A filter that returns only algorithms created before the
     *         specified time (timestamp).
     *         </p>
     */
    public java.util.Date getCreationTimeBefore() {
        return creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only algorithms created before the specified time
     * (timestamp).
     * </p>
     *
     * @param creationTimeBefore <p>
     *            A filter that returns only algorithms created before the
     *            specified time (timestamp).
     *            </p>
     */
    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only algorithms created before the specified time
     * (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeBefore <p>
     *            A filter that returns only algorithms created before the
     *            specified time (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAlgorithmsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
        return this;
    }

    /**
     * <p>
     * The maximum number of algorithms to return in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of algorithms to return in the response.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of algorithms to return in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of algorithms to return in the response.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of algorithms to return in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of algorithms to return in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAlgorithmsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A string in the algorithm name. This filter returns only algorithms whose
     * name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         A string in the algorithm name. This filter returns only
     *         algorithms whose name contains the specified string.
     *         </p>
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * <p>
     * A string in the algorithm name. This filter returns only algorithms whose
     * name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param nameContains <p>
     *            A string in the algorithm name. This filter returns only
     *            algorithms whose name contains the specified string.
     *            </p>
     */
    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A string in the algorithm name. This filter returns only algorithms whose
     * name contains the specified string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param nameContains <p>
     *            A string in the algorithm name. This filter returns only
     *            algorithms whose name contains the specified string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAlgorithmsRequest withNameContains(String nameContains) {
        this.nameContains = nameContains;
        return this;
    }

    /**
     * <p>
     * If the response to a previous <code>ListAlgorithms</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of algorithms, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response to a previous <code>ListAlgorithms</code> request
     *         was truncated, the response includes a <code>NextToken</code>. To
     *         retrieve the next set of algorithms, use the token in the next
     *         request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListAlgorithms</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of algorithms, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response to a previous <code>ListAlgorithms</code>
     *            request was truncated, the response includes a
     *            <code>NextToken</code>. To retrieve the next set of
     *            algorithms, use the token in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListAlgorithms</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of algorithms, use the token in the next request.
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
     *            If the response to a previous <code>ListAlgorithms</code>
     *            request was truncated, the response includes a
     *            <code>NextToken</code>. To retrieve the next set of
     *            algorithms, use the token in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAlgorithmsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     *
     * @return <p>
     *         The parameter by which to sort the results. The default is
     *         <code>CreationTime</code>.
     *         </p>
     * @see AlgorithmSortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @see AlgorithmSortBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlgorithmSortBy
     */
    public ListAlgorithmsRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @see AlgorithmSortBy
     */
    public void setSortBy(AlgorithmSortBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     *
     * @param sortBy <p>
     *            The parameter by which to sort the results. The default is
     *            <code>CreationTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlgorithmSortBy
     */
    public ListAlgorithmsRequest withSortBy(AlgorithmSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @return <p>
     *         The sort order for the results. The default is
     *         <code>Ascending</code>.
     *         </p>
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is
     *            <code>Ascending</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is
     *            <code>Ascending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListAlgorithmsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is
     *            <code>Ascending</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for the results. The default is
     *            <code>Ascending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListAlgorithmsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: " + getCreationTimeAfter() + ",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: " + getCreationTimeBefore() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNameContains() != null)
            sb.append("NameContains: " + getNameContains() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAlgorithmsRequest == false)
            return false;
        ListAlgorithmsRequest other = (ListAlgorithmsRequest) obj;

        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null
                && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null
                && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null
                && other.getNameContains().equals(this.getNameContains()) == false)
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
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }
}
