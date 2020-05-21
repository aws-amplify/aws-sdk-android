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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of ARNs for the reports in the current AWS account.
 * </p>
 */
public class ListReportsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the sort order for the list of returned reports. Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: return reports in chronological order based on
     * their creation date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: return reports in the reverse chronological
     * order based on their creation date.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     */
    private String sortOrder;

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned
     * is the value specified in <code>maxResults</code>. If there more items in
     * the list, then a unique string called a <i>nextToken</i> is returned. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call. To get all of the items in the list,
     * keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of paginated reports returned per response. Use
     * <code>nextToken</code> to iterate pages in the list of returned
     * <code>Report</code> objects. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A <code>ReportFilter</code> object used to filter the returned reports.
     * </p>
     */
    private ReportFilter filter;

    /**
     * <p>
     * Specifies the sort order for the list of returned reports. Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: return reports in chronological order based on
     * their creation date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: return reports in the reverse chronological
     * order based on their creation date.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return <p>
     *         Specifies the sort order for the list of returned reports. Valid
     *         values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASCENDING</code>: return reports in chronological order
     *         based on their creation date.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DESCENDING</code>: return reports in the reverse
     *         chronological order based on their creation date.
     *         </p>
     *         </li>
     *         </ul>
     * @see SortOrderType
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * Specifies the sort order for the list of returned reports. Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: return reports in chronological order based on
     * their creation date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: return reports in the reverse chronological
     * order based on their creation date.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            Specifies the sort order for the list of returned reports.
     *            Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: return reports in chronological order
     *            based on their creation date.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: return reports in the reverse
     *            chronological order based on their creation date.
     *            </p>
     *            </li>
     *            </ul>
     * @see SortOrderType
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Specifies the sort order for the list of returned reports. Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: return reports in chronological order based on
     * their creation date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: return reports in the reverse chronological
     * order based on their creation date.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            Specifies the sort order for the list of returned reports.
     *            Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: return reports in chronological order
     *            based on their creation date.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: return reports in the reverse
     *            chronological order based on their creation date.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrderType
     */
    public ListReportsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * Specifies the sort order for the list of returned reports. Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: return reports in chronological order based on
     * their creation date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: return reports in the reverse chronological
     * order based on their creation date.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            Specifies the sort order for the list of returned reports.
     *            Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: return reports in chronological order
     *            based on their creation date.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: return reports in the reverse
     *            chronological order based on their creation date.
     *            </p>
     *            </li>
     *            </ul>
     * @see SortOrderType
     */
    public void setSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * Specifies the sort order for the list of returned reports. Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: return reports in chronological order based on
     * their creation date.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: return reports in the reverse chronological
     * order based on their creation date.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            Specifies the sort order for the list of returned reports.
     *            Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: return reports in chronological order
     *            based on their creation date.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: return reports in the reverse
     *            chronological order based on their creation date.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrderType
     */
    public ListReportsRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned
     * is the value specified in <code>maxResults</code>. If there more items in
     * the list, then a unique string called a <i>nextToken</i> is returned. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call. To get all of the items in the list,
     * keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     *
     * @return <p>
     *         During a previous call, the maximum number of items that can be
     *         returned is the value specified in <code>maxResults</code>. If
     *         there more items in the list, then a unique string called a
     *         <i>nextToken</i> is returned. To get the next batch of items in
     *         the list, call this operation again, adding the next token to the
     *         call. To get all of the items in the list, keep calling this
     *         operation with each subsequent next token that is returned, until
     *         no more next tokens are returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned
     * is the value specified in <code>maxResults</code>. If there more items in
     * the list, then a unique string called a <i>nextToken</i> is returned. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call. To get all of the items in the list,
     * keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     *
     * @param nextToken <p>
     *            During a previous call, the maximum number of items that can
     *            be returned is the value specified in <code>maxResults</code>.
     *            If there more items in the list, then a unique string called a
     *            <i>nextToken</i> is returned. To get the next batch of items
     *            in the list, call this operation again, adding the next token
     *            to the call. To get all of the items in the list, keep calling
     *            this operation with each subsequent next token that is
     *            returned, until no more next tokens are returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned
     * is the value specified in <code>maxResults</code>. If there more items in
     * the list, then a unique string called a <i>nextToken</i> is returned. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call. To get all of the items in the list,
     * keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            During a previous call, the maximum number of items that can
     *            be returned is the value specified in <code>maxResults</code>.
     *            If there more items in the list, then a unique string called a
     *            <i>nextToken</i> is returned. To get the next batch of items
     *            in the list, call this operation again, adding the next token
     *            to the call. To get all of the items in the list, keep calling
     *            this operation with each subsequent next token that is
     *            returned, until no more next tokens are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReportsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of paginated reports returned per response. Use
     * <code>nextToken</code> to iterate pages in the list of returned
     * <code>Report</code> objects. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of paginated reports returned per response.
     *         Use <code>nextToken</code> to iterate pages in the list of
     *         returned <code>Report</code> objects. The default value is 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated reports returned per response. Use
     * <code>nextToken</code> to iterate pages in the list of returned
     * <code>Report</code> objects. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of paginated reports returned per response.
     *            Use <code>nextToken</code> to iterate pages in the list of
     *            returned <code>Report</code> objects. The default value is
     *            100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated reports returned per response. Use
     * <code>nextToken</code> to iterate pages in the list of returned
     * <code>Report</code> objects. The default value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of paginated reports returned per response.
     *            Use <code>nextToken</code> to iterate pages in the list of
     *            returned <code>Report</code> objects. The default value is
     *            100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReportsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A <code>ReportFilter</code> object used to filter the returned reports.
     * </p>
     *
     * @return <p>
     *         A <code>ReportFilter</code> object used to filter the returned
     *         reports.
     *         </p>
     */
    public ReportFilter getFilter() {
        return filter;
    }

    /**
     * <p>
     * A <code>ReportFilter</code> object used to filter the returned reports.
     * </p>
     *
     * @param filter <p>
     *            A <code>ReportFilter</code> object used to filter the returned
     *            reports.
     *            </p>
     */
    public void setFilter(ReportFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A <code>ReportFilter</code> object used to filter the returned reports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            A <code>ReportFilter</code> object used to filter the returned
     *            reports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReportsRequest withFilter(ReportFilter filter) {
        this.filter = filter;
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
        if (getSortOrder() != null)
            sb.append("sortOrder: " + getSortOrder() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getFilter() != null)
            sb.append("filter: " + getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReportsRequest == false)
            return false;
        ListReportsRequest other = (ListReportsRequest) obj;

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
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }
}
