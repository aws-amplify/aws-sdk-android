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
 * Gets a list of report groups that are shared with other AWS accounts or
 * users.
 * </p>
 */
public class ListSharedReportGroupsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The order in which to list shared report groups. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List in descending order.
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
     * The criterion to be used to list report groups shared with the current
     * AWS account or user. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ARN</code>: List based on the ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED_TIME</code>: List based on when information about the
     * shared report group was last changed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARN, MODIFIED_TIME
     */
    private String sortBy;

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
     * The maximum number of paginated shared report groups per response. Use
     * <code>nextToken</code> to iterate pages in the list of returned
     * <code>ReportGroup</code> objects. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The order in which to list shared report groups. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List in descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return <p>
     *         The order in which to list shared report groups. Valid values
     *         include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASCENDING</code>: List in ascending order.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DESCENDING</code>: List in descending order.
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
     * The order in which to list shared report groups. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List in descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The order in which to list shared report groups. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: List in ascending order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: List in descending order.
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
     * The order in which to list shared report groups. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List in descending order.
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
     *            The order in which to list shared report groups. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: List in ascending order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: List in descending order.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrderType
     */
    public ListSharedReportGroupsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The order in which to list shared report groups. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List in descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            The order in which to list shared report groups. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: List in ascending order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: List in descending order.
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
     * The order in which to list shared report groups. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASCENDING</code>: List in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESCENDING</code>: List in descending order.
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
     *            The order in which to list shared report groups. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASCENDING</code>: List in ascending order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DESCENDING</code>: List in descending order.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrderType
     */
    public ListSharedReportGroupsRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The criterion to be used to list report groups shared with the current
     * AWS account or user. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ARN</code>: List based on the ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED_TIME</code>: List based on when information about the
     * shared report group was last changed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARN, MODIFIED_TIME
     *
     * @return <p>
     *         The criterion to be used to list report groups shared with the
     *         current AWS account or user. Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ARN</code>: List based on the ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFIED_TIME</code>: List based on when information about
     *         the shared report group was last changed.
     *         </p>
     *         </li>
     *         </ul>
     * @see SharedResourceSortByType
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The criterion to be used to list report groups shared with the current
     * AWS account or user. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ARN</code>: List based on the ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED_TIME</code>: List based on when information about the
     * shared report group was last changed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARN, MODIFIED_TIME
     *
     * @param sortBy <p>
     *            The criterion to be used to list report groups shared with the
     *            current AWS account or user. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ARN</code>: List based on the ARN.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED_TIME</code>: List based on when information
     *            about the shared report group was last changed.
     *            </p>
     *            </li>
     *            </ul>
     * @see SharedResourceSortByType
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The criterion to be used to list report groups shared with the current
     * AWS account or user. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ARN</code>: List based on the ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED_TIME</code>: List based on when information about the
     * shared report group was last changed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARN, MODIFIED_TIME
     *
     * @param sortBy <p>
     *            The criterion to be used to list report groups shared with the
     *            current AWS account or user. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ARN</code>: List based on the ARN.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED_TIME</code>: List based on when information
     *            about the shared report group was last changed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SharedResourceSortByType
     */
    public ListSharedReportGroupsRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The criterion to be used to list report groups shared with the current
     * AWS account or user. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ARN</code>: List based on the ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED_TIME</code>: List based on when information about the
     * shared report group was last changed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARN, MODIFIED_TIME
     *
     * @param sortBy <p>
     *            The criterion to be used to list report groups shared with the
     *            current AWS account or user. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ARN</code>: List based on the ARN.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED_TIME</code>: List based on when information
     *            about the shared report group was last changed.
     *            </p>
     *            </li>
     *            </ul>
     * @see SharedResourceSortByType
     */
    public void setSortBy(SharedResourceSortByType sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The criterion to be used to list report groups shared with the current
     * AWS account or user. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ARN</code>: List based on the ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED_TIME</code>: List based on when information about the
     * shared report group was last changed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ARN, MODIFIED_TIME
     *
     * @param sortBy <p>
     *            The criterion to be used to list report groups shared with the
     *            current AWS account or user. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ARN</code>: List based on the ARN.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED_TIME</code>: List based on when information
     *            about the shared report group was last changed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SharedResourceSortByType
     */
    public ListSharedReportGroupsRequest withSortBy(SharedResourceSortByType sortBy) {
        this.sortBy = sortBy.toString();
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
    public ListSharedReportGroupsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of paginated shared report groups per response. Use
     * <code>nextToken</code> to iterate pages in the list of returned
     * <code>ReportGroup</code> objects. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of paginated shared report groups per
     *         response. Use <code>nextToken</code> to iterate pages in the list
     *         of returned <code>ReportGroup</code> objects. The default value
     *         is 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated shared report groups per response. Use
     * <code>nextToken</code> to iterate pages in the list of returned
     * <code>ReportGroup</code> objects. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of paginated shared report groups per
     *            response. Use <code>nextToken</code> to iterate pages in the
     *            list of returned <code>ReportGroup</code> objects. The default
     *            value is 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated shared report groups per response. Use
     * <code>nextToken</code> to iterate pages in the list of returned
     * <code>ReportGroup</code> objects. The default value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of paginated shared report groups per
     *            response. Use <code>nextToken</code> to iterate pages in the
     *            list of returned <code>ReportGroup</code> objects. The default
     *            value is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSharedReportGroupsRequest withMaxResults(Integer maxResults) {
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
        if (getSortOrder() != null)
            sb.append("sortOrder: " + getSortOrder() + ",");
        if (getSortBy() != null)
            sb.append("sortBy: " + getSortBy() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
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

        if (obj instanceof ListSharedReportGroupsRequest == false)
            return false;
        ListSharedReportGroupsRequest other = (ListSharedReportGroupsRequest) obj;

        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
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
