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
 * Lists the executions of a maintenance window. This includes information about
 * when the maintenance window was scheduled to be active, and information about
 * tasks registered and run with the maintenance window.
 * </p>
 */
public class DescribeMaintenanceWindowExecutionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the maintenance window whose executions should be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     */
    private String windowId;

    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Key (string, between 1 and 128 characters)
     * </p>
     * <p>
     * Values (array of strings, each string is between 1 and 256 characters)
     * </p>
     * <p>
     * The supported Keys are ExecutedBefore and ExecutedAfter with the value
     * being a date/time string such as 2016-11-04T05:00:00Z.
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
     * The ID of the maintenance window whose executions should be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @return <p>
     *         The ID of the maintenance window whose executions should be
     *         retrieved.
     *         </p>
     */
    public String getWindowId() {
        return windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window whose executions should be retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the maintenance window whose executions should be
     *            retrieved.
     *            </p>
     */
    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the maintenance window whose executions should be retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 20<br/>
     * <b>Pattern: </b>^mw-[0-9a-f]{17}$<br/>
     *
     * @param windowId <p>
     *            The ID of the maintenance window whose executions should be
     *            retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowExecutionsRequest withWindowId(String windowId) {
        this.windowId = windowId;
        return this;
    }

    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Key (string, between 1 and 128 characters)
     * </p>
     * <p>
     * Values (array of strings, each string is between 1 and 256 characters)
     * </p>
     * <p>
     * The supported Keys are ExecutedBefore and ExecutedAfter with the value
     * being a date/time string such as 2016-11-04T05:00:00Z.
     * </p>
     *
     * @return <p>
     *         Each entry in the array is a structure containing:
     *         </p>
     *         <p>
     *         Key (string, between 1 and 128 characters)
     *         </p>
     *         <p>
     *         Values (array of strings, each string is between 1 and 256
     *         characters)
     *         </p>
     *         <p>
     *         The supported Keys are ExecutedBefore and ExecutedAfter with the
     *         value being a date/time string such as 2016-11-04T05:00:00Z.
     *         </p>
     */
    public java.util.List<MaintenanceWindowFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Key (string, between 1 and 128 characters)
     * </p>
     * <p>
     * Values (array of strings, each string is between 1 and 256 characters)
     * </p>
     * <p>
     * The supported Keys are ExecutedBefore and ExecutedAfter with the value
     * being a date/time string such as 2016-11-04T05:00:00Z.
     * </p>
     *
     * @param filters <p>
     *            Each entry in the array is a structure containing:
     *            </p>
     *            <p>
     *            Key (string, between 1 and 128 characters)
     *            </p>
     *            <p>
     *            Values (array of strings, each string is between 1 and 256
     *            characters)
     *            </p>
     *            <p>
     *            The supported Keys are ExecutedBefore and ExecutedAfter with
     *            the value being a date/time string such as
     *            2016-11-04T05:00:00Z.
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
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Key (string, between 1 and 128 characters)
     * </p>
     * <p>
     * Values (array of strings, each string is between 1 and 256 characters)
     * </p>
     * <p>
     * The supported Keys are ExecutedBefore and ExecutedAfter with the value
     * being a date/time string such as 2016-11-04T05:00:00Z.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Each entry in the array is a structure containing:
     *            </p>
     *            <p>
     *            Key (string, between 1 and 128 characters)
     *            </p>
     *            <p>
     *            Values (array of strings, each string is between 1 and 256
     *            characters)
     *            </p>
     *            <p>
     *            The supported Keys are ExecutedBefore and ExecutedAfter with
     *            the value being a date/time string such as
     *            2016-11-04T05:00:00Z.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowExecutionsRequest withFilters(
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
     * Each entry in the array is a structure containing:
     * </p>
     * <p>
     * Key (string, between 1 and 128 characters)
     * </p>
     * <p>
     * Values (array of strings, each string is between 1 and 256 characters)
     * </p>
     * <p>
     * The supported Keys are ExecutedBefore and ExecutedAfter with the value
     * being a date/time string such as 2016-11-04T05:00:00Z.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Each entry in the array is a structure containing:
     *            </p>
     *            <p>
     *            Key (string, between 1 and 128 characters)
     *            </p>
     *            <p>
     *            Values (array of strings, each string is between 1 and 256
     *            characters)
     *            </p>
     *            <p>
     *            The supported Keys are ExecutedBefore and ExecutedAfter with
     *            the value being a date/time string such as
     *            2016-11-04T05:00:00Z.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowExecutionsRequest withFilters(
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
    public DescribeMaintenanceWindowExecutionsRequest withMaxResults(Integer maxResults) {
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
    public DescribeMaintenanceWindowExecutionsRequest withNextToken(String nextToken) {
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
        if (getWindowId() != null)
            sb.append("WindowId: " + getWindowId() + ",");
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

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
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

        if (obj instanceof DescribeMaintenanceWindowExecutionsRequest == false)
            return false;
        DescribeMaintenanceWindowExecutionsRequest other = (DescribeMaintenanceWindowExecutionsRequest) obj;

        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
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
