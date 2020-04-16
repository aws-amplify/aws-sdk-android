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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * For a given maintenance window execution, lists the tasks that were run.
 * </p>
 */
public class DescribeMaintenanceWindowExecutionTasksRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The ID of the maintenance window execution whose task executions should
     * be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     */
    private String windowExecutionId;

    /**
     * <p>
     * Optional filters used to scope down the returned tasks. The supported
     * filter key is STATUS with the corresponding values PENDING, IN_PROGRESS,
     * SUCCESS, FAILED, TIMED_OUT, CANCELLING, and CANCELLED.
     * </p>
     */
    private java.util.List<MaintenanceWindowFilter> filters;

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the maintenance window execution whose task executions should
     * be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @return <p>
     *         The ID of the maintenance window execution whose task executions
     *         should be retrieved.
     *         </p>
     */
    public String getWindowExecutionId() {
        return windowExecutionId;
    }

    /**
     * <p>
     * The ID of the maintenance window execution whose task executions should
     * be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowExecutionId <p>
     *            The ID of the maintenance window execution whose task
     *            executions should be retrieved.
     *            </p>
     */
    public void setWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
    }

    /**
     * <p>
     * The ID of the maintenance window execution whose task executions should
     * be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-
     * F]{4}\-[0-9a-fA-F]{12}$<br/>
     *
     * @param windowExecutionId <p>
     *            The ID of the maintenance window execution whose task
     *            executions should be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowExecutionTasksRequest withWindowExecutionId(
            String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
        return this;
    }

    /**
     * <p>
     * Optional filters used to scope down the returned tasks. The supported
     * filter key is STATUS with the corresponding values PENDING, IN_PROGRESS,
     * SUCCESS, FAILED, TIMED_OUT, CANCELLING, and CANCELLED.
     * </p>
     *
     * @return <p>
     *         Optional filters used to scope down the returned tasks. The
     *         supported filter key is STATUS with the corresponding values
     *         PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING, and
     *         CANCELLED.
     *         </p>
     */
    public java.util.List<MaintenanceWindowFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Optional filters used to scope down the returned tasks. The supported
     * filter key is STATUS with the corresponding values PENDING, IN_PROGRESS,
     * SUCCESS, FAILED, TIMED_OUT, CANCELLING, and CANCELLED.
     * </p>
     *
     * @param filters <p>
     *            Optional filters used to scope down the returned tasks. The
     *            supported filter key is STATUS with the corresponding values
     *            PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING,
     *            and CANCELLED.
     *            </p>
     */
    public void setFilters(java.util.Collection<MaintenanceWindowFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<MaintenanceWindowFilter>(filters);
    }

    /**
     * <p>
     * Optional filters used to scope down the returned tasks. The supported
     * filter key is STATUS with the corresponding values PENDING, IN_PROGRESS,
     * SUCCESS, FAILED, TIMED_OUT, CANCELLING, and CANCELLED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Optional filters used to scope down the returned tasks. The
     *            supported filter key is STATUS with the corresponding values
     *            PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING,
     *            and CANCELLED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowExecutionTasksRequest withFilters(
            MaintenanceWindowFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<MaintenanceWindowFilter>(filters.length);
        }
        for (MaintenanceWindowFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Optional filters used to scope down the returned tasks. The supported
     * filter key is STATUS with the corresponding values PENDING, IN_PROGRESS,
     * SUCCESS, FAILED, TIMED_OUT, CANCELLING, and CANCELLED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Optional filters used to scope down the returned tasks. The
     *            supported filter key is STATUS with the corresponding values
     *            PENDING, IN_PROGRESS, SUCCESS, FAILED, TIMED_OUT, CANCELLING,
     *            and CANCELLED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowExecutionTasksRequest withFilters(
            java.util.Collection<MaintenanceWindowFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @return <p>
     *         The maximum number of items to return for this call. The call
     *         also returns a token that you can specify in a subsequent call to
     *         get the next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowExecutionTasksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     *
     * @return <p>
     *         The token for the next set of items to return. (You received this
     *         token from a previous call.)
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowExecutionTasksRequest withNextToken(String nextToken) {
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
        if (getWindowExecutionId() != null)
            sb.append("WindowExecutionId: " + getWindowExecutionId() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWindowExecutionId() == null) ? 0 : getWindowExecutionId().hashCode());
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

        if (obj instanceof DescribeMaintenanceWindowExecutionTasksRequest == false)
            return false;
        DescribeMaintenanceWindowExecutionTasksRequest other = (DescribeMaintenanceWindowExecutionTasksRequest) obj;

        if (other.getWindowExecutionId() == null ^ this.getWindowExecutionId() == null)
            return false;
        if (other.getWindowExecutionId() != null
                && other.getWindowExecutionId().equals(this.getWindowExecutionId()) == false)
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
