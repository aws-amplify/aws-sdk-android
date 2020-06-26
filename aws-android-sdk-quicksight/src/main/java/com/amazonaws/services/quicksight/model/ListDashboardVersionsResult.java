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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

public class ListDashboardVersionsResult implements Serializable {
    /**
     * <p>
     * A structure that contains information about each version of the
     * dashboard.
     * </p>
     */
    private java.util.List<DashboardVersionSummary> dashboardVersionSummaryList;

    /**
     * <p>
     * The token for the next set of results, or null if there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * A structure that contains information about each version of the
     * dashboard.
     * </p>
     *
     * @return <p>
     *         A structure that contains information about each version of the
     *         dashboard.
     *         </p>
     */
    public java.util.List<DashboardVersionSummary> getDashboardVersionSummaryList() {
        return dashboardVersionSummaryList;
    }

    /**
     * <p>
     * A structure that contains information about each version of the
     * dashboard.
     * </p>
     *
     * @param dashboardVersionSummaryList <p>
     *            A structure that contains information about each version of
     *            the dashboard.
     *            </p>
     */
    public void setDashboardVersionSummaryList(
            java.util.Collection<DashboardVersionSummary> dashboardVersionSummaryList) {
        if (dashboardVersionSummaryList == null) {
            this.dashboardVersionSummaryList = null;
            return;
        }

        this.dashboardVersionSummaryList = new java.util.ArrayList<DashboardVersionSummary>(
                dashboardVersionSummaryList);
    }

    /**
     * <p>
     * A structure that contains information about each version of the
     * dashboard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dashboardVersionSummaryList <p>
     *            A structure that contains information about each version of
     *            the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDashboardVersionsResult withDashboardVersionSummaryList(
            DashboardVersionSummary... dashboardVersionSummaryList) {
        if (getDashboardVersionSummaryList() == null) {
            this.dashboardVersionSummaryList = new java.util.ArrayList<DashboardVersionSummary>(
                    dashboardVersionSummaryList.length);
        }
        for (DashboardVersionSummary value : dashboardVersionSummaryList) {
            this.dashboardVersionSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A structure that contains information about each version of the
     * dashboard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dashboardVersionSummaryList <p>
     *            A structure that contains information about each version of
     *            the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDashboardVersionsResult withDashboardVersionSummaryList(
            java.util.Collection<DashboardVersionSummary> dashboardVersionSummaryList) {
        setDashboardVersionSummaryList(dashboardVersionSummaryList);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more
     * results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results, or null if there are no
     *         more results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            more results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            more results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDashboardVersionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     *
     * @return <p>
     *         The HTTP status of the request.
     *         </p>
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDashboardVersionsResult withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     *
     * @return <p>
     *         The AWS request ID for this operation.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     *
     * @param requestId <p>
     *            The AWS request ID for this operation.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId <p>
     *            The AWS request ID for this operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDashboardVersionsResult withRequestId(String requestId) {
        this.requestId = requestId;
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
        if (getDashboardVersionSummaryList() != null)
            sb.append("DashboardVersionSummaryList: " + getDashboardVersionSummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDashboardVersionSummaryList() == null) ? 0
                        : getDashboardVersionSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDashboardVersionsResult == false)
            return false;
        ListDashboardVersionsResult other = (ListDashboardVersionsResult) obj;

        if (other.getDashboardVersionSummaryList() == null
                ^ this.getDashboardVersionSummaryList() == null)
            return false;
        if (other.getDashboardVersionSummaryList() != null
                && other.getDashboardVersionSummaryList().equals(
                        this.getDashboardVersionSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }
}
