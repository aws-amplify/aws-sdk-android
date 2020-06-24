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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the description of specific Amazon FSx for Lustre data repository
 * tasks, if one or more <code>TaskIds</code> values are provided in the
 * request, or if filters are used in the request. You can use filters to narrow
 * the response to include just tasks for specific file systems, or tasks in a
 * specific lifecycle state. Otherwise, it returns all data repository tasks
 * owned by your AWS account in the AWS Region of the endpoint that you're
 * calling.
 * </p>
 * <p>
 * When retrieving all tasks, you can paginate the response by using the
 * optional <code>MaxResults</code> parameter to limit the number of tasks
 * returned in a response. If more tasks remain, Amazon FSx returns a
 * <code>NextToken</code> value in the response. In this case, send a later
 * request with the <code>NextToken</code> request parameter set to the value of
 * <code>NextToken</code> from the last response.
 * </p>
 */
public class DescribeDataRepositoryTasksRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * (Optional) IDs of the tasks whose descriptions you want to retrieve
     * (String).
     * </p>
     */
    private java.util.List<String> taskIds;

    /**
     * <p>
     * (Optional) You can use filters to narrow the
     * <code>DescribeDataRepositoryTasks</code> response to include just tasks
     * for specific file systems, or tasks in a specific lifecycle state.
     * </p>
     */
    private java.util.List<DataRepositoryTaskFilter> filters;

    /**
     * <p>
     * The maximum number of resources to return in the response. This value
     * must be an integer greater than zero.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous operation
     * (String). If present, this token indicates from what point you can
     * continue processing the request, where the previous
     * <code>NextToken</code> value left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * (Optional) IDs of the tasks whose descriptions you want to retrieve
     * (String).
     * </p>
     *
     * @return <p>
     *         (Optional) IDs of the tasks whose descriptions you want to
     *         retrieve (String).
     *         </p>
     */
    public java.util.List<String> getTaskIds() {
        return taskIds;
    }

    /**
     * <p>
     * (Optional) IDs of the tasks whose descriptions you want to retrieve
     * (String).
     * </p>
     *
     * @param taskIds <p>
     *            (Optional) IDs of the tasks whose descriptions you want to
     *            retrieve (String).
     *            </p>
     */
    public void setTaskIds(java.util.Collection<String> taskIds) {
        if (taskIds == null) {
            this.taskIds = null;
            return;
        }

        this.taskIds = new java.util.ArrayList<String>(taskIds);
    }

    /**
     * <p>
     * (Optional) IDs of the tasks whose descriptions you want to retrieve
     * (String).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskIds <p>
     *            (Optional) IDs of the tasks whose descriptions you want to
     *            retrieve (String).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataRepositoryTasksRequest withTaskIds(String... taskIds) {
        if (getTaskIds() == null) {
            this.taskIds = new java.util.ArrayList<String>(taskIds.length);
        }
        for (String value : taskIds) {
            this.taskIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) IDs of the tasks whose descriptions you want to retrieve
     * (String).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskIds <p>
     *            (Optional) IDs of the tasks whose descriptions you want to
     *            retrieve (String).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataRepositoryTasksRequest withTaskIds(java.util.Collection<String> taskIds) {
        setTaskIds(taskIds);
        return this;
    }

    /**
     * <p>
     * (Optional) You can use filters to narrow the
     * <code>DescribeDataRepositoryTasks</code> response to include just tasks
     * for specific file systems, or tasks in a specific lifecycle state.
     * </p>
     *
     * @return <p>
     *         (Optional) You can use filters to narrow the
     *         <code>DescribeDataRepositoryTasks</code> response to include just
     *         tasks for specific file systems, or tasks in a specific lifecycle
     *         state.
     *         </p>
     */
    public java.util.List<DataRepositoryTaskFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * (Optional) You can use filters to narrow the
     * <code>DescribeDataRepositoryTasks</code> response to include just tasks
     * for specific file systems, or tasks in a specific lifecycle state.
     * </p>
     *
     * @param filters <p>
     *            (Optional) You can use filters to narrow the
     *            <code>DescribeDataRepositoryTasks</code> response to include
     *            just tasks for specific file systems, or tasks in a specific
     *            lifecycle state.
     *            </p>
     */
    public void setFilters(java.util.Collection<DataRepositoryTaskFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<DataRepositoryTaskFilter>(filters);
    }

    /**
     * <p>
     * (Optional) You can use filters to narrow the
     * <code>DescribeDataRepositoryTasks</code> response to include just tasks
     * for specific file systems, or tasks in a specific lifecycle state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            (Optional) You can use filters to narrow the
     *            <code>DescribeDataRepositoryTasks</code> response to include
     *            just tasks for specific file systems, or tasks in a specific
     *            lifecycle state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataRepositoryTasksRequest withFilters(DataRepositoryTaskFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<DataRepositoryTaskFilter>(filters.length);
        }
        for (DataRepositoryTaskFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) You can use filters to narrow the
     * <code>DescribeDataRepositoryTasks</code> response to include just tasks
     * for specific file systems, or tasks in a specific lifecycle state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            (Optional) You can use filters to narrow the
     *            <code>DescribeDataRepositoryTasks</code> response to include
     *            just tasks for specific file systems, or tasks in a specific
     *            lifecycle state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataRepositoryTasksRequest withFilters(
            java.util.Collection<DataRepositoryTaskFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of resources to return in the response. This value
     * must be an integer greater than zero.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return <p>
     *         The maximum number of resources to return in the response. This
     *         value must be an integer greater than zero.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of resources to return in the response. This value
     * must be an integer greater than zero.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param maxResults <p>
     *            The maximum number of resources to return in the response.
     *            This value must be an integer greater than zero.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of resources to return in the response. This value
     * must be an integer greater than zero.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param maxResults <p>
     *            The maximum number of resources to return in the response.
     *            This value must be an integer greater than zero.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataRepositoryTasksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous operation
     * (String). If present, this token indicates from what point you can
     * continue processing the request, where the previous
     * <code>NextToken</code> value left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @return <p>
     *         (Optional) Opaque pagination token returned from a previous
     *         operation (String). If present, this token indicates from what
     *         point you can continue processing the request, where the previous
     *         <code>NextToken</code> value left off.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous operation
     * (String). If present, this token indicates from what point you can
     * continue processing the request, where the previous
     * <code>NextToken</code> value left off.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @param nextToken <p>
     *            (Optional) Opaque pagination token returned from a previous
     *            operation (String). If present, this token indicates from what
     *            point you can continue processing the request, where the
     *            previous <code>NextToken</code> value left off.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous operation
     * (String). If present, this token indicates from what point you can
     * continue processing the request, where the previous
     * <code>NextToken</code> value left off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern:
     * </b>^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$
     * <br/>
     *
     * @param nextToken <p>
     *            (Optional) Opaque pagination token returned from a previous
     *            operation (String). If present, this token indicates from what
     *            point you can continue processing the request, where the
     *            previous <code>NextToken</code> value left off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDataRepositoryTasksRequest withNextToken(String nextToken) {
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
        if (getTaskIds() != null)
            sb.append("TaskIds: " + getTaskIds() + ",");
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

        hashCode = prime * hashCode + ((getTaskIds() == null) ? 0 : getTaskIds().hashCode());
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

        if (obj instanceof DescribeDataRepositoryTasksRequest == false)
            return false;
        DescribeDataRepositoryTasksRequest other = (DescribeDataRepositoryTasksRequest) obj;

        if (other.getTaskIds() == null ^ this.getTaskIds() == null)
            return false;
        if (other.getTaskIds() != null && other.getTaskIds().equals(this.getTaskIds()) == false)
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
