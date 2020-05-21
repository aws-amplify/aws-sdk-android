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
 * Returns a list of ARNs for the reports that belong to a
 * <code>ReportGroup</code>.
 * </p>
 */
public class ListReportsForReportGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the report group for which you want to return report ARNs.
     * </p>
     */
    private String reportGroupArn;

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
     * Use to specify whether the results are returned in ascending or
     * descending order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     */
    private String sortOrder;

    /**
     * <p>
     * The maximum number of paginated reports in this report group returned per
     * response. Use <code>nextToken</code> to iterate pages in the list of
     * returned <code>Report</code> objects. The default value is 100.
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
     * The ARN of the report group for which you want to return report ARNs.
     * </p>
     *
     * @return <p>
     *         The ARN of the report group for which you want to return report
     *         ARNs.
     *         </p>
     */
    public String getReportGroupArn() {
        return reportGroupArn;
    }

    /**
     * <p>
     * The ARN of the report group for which you want to return report ARNs.
     * </p>
     *
     * @param reportGroupArn <p>
     *            The ARN of the report group for which you want to return
     *            report ARNs.
     *            </p>
     */
    public void setReportGroupArn(String reportGroupArn) {
        this.reportGroupArn = reportGroupArn;
    }

    /**
     * <p>
     * The ARN of the report group for which you want to return report ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reportGroupArn <p>
     *            The ARN of the report group for which you want to return
     *            report ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReportsForReportGroupRequest withReportGroupArn(String reportGroupArn) {
        this.reportGroupArn = reportGroupArn;
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
    public ListReportsForReportGroupRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Use to specify whether the results are returned in ascending or
     * descending order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return <p>
     *         Use to specify whether the results are returned in ascending or
     *         descending order.
     *         </p>
     * @see SortOrderType
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * Use to specify whether the results are returned in ascending or
     * descending order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            Use to specify whether the results are returned in ascending
     *            or descending order.
     *            </p>
     * @see SortOrderType
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Use to specify whether the results are returned in ascending or
     * descending order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            Use to specify whether the results are returned in ascending
     *            or descending order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrderType
     */
    public ListReportsForReportGroupRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * Use to specify whether the results are returned in ascending or
     * descending order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            Use to specify whether the results are returned in ascending
     *            or descending order.
     *            </p>
     * @see SortOrderType
     */
    public void setSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * Use to specify whether the results are returned in ascending or
     * descending order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param sortOrder <p>
     *            Use to specify whether the results are returned in ascending
     *            or descending order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrderType
     */
    public ListReportsForReportGroupRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of paginated reports in this report group returned per
     * response. Use <code>nextToken</code> to iterate pages in the list of
     * returned <code>Report</code> objects. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of paginated reports in this report group
     *         returned per response. Use <code>nextToken</code> to iterate
     *         pages in the list of returned <code>Report</code> objects. The
     *         default value is 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated reports in this report group returned per
     * response. Use <code>nextToken</code> to iterate pages in the list of
     * returned <code>Report</code> objects. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of paginated reports in this report group
     *            returned per response. Use <code>nextToken</code> to iterate
     *            pages in the list of returned <code>Report</code> objects. The
     *            default value is 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of paginated reports in this report group returned per
     * response. Use <code>nextToken</code> to iterate pages in the list of
     * returned <code>Report</code> objects. The default value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of paginated reports in this report group
     *            returned per response. Use <code>nextToken</code> to iterate
     *            pages in the list of returned <code>Report</code> objects. The
     *            default value is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReportsForReportGroupRequest withMaxResults(Integer maxResults) {
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
    public ListReportsForReportGroupRequest withFilter(ReportFilter filter) {
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
        if (getReportGroupArn() != null)
            sb.append("reportGroupArn: " + getReportGroupArn() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getSortOrder() != null)
            sb.append("sortOrder: " + getSortOrder() + ",");
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

        hashCode = prime * hashCode
                + ((getReportGroupArn() == null) ? 0 : getReportGroupArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
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

        if (obj instanceof ListReportsForReportGroupRequest == false)
            return false;
        ListReportsForReportGroupRequest other = (ListReportsForReportGroupRequest) obj;

        if (other.getReportGroupArn() == null ^ this.getReportGroupArn() == null)
            return false;
        if (other.getReportGroupArn() != null
                && other.getReportGroupArn().equals(this.getReportGroupArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
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
