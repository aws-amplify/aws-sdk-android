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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a list of runs for a machine learning transform. Machine learning task
 * runs are asynchronous tasks that AWS Glue runs on your behalf as part of
 * various machine learning workflows. You can get a sortable, filterable list
 * of machine learning task runs by calling <code>GetMLTaskRuns</code> with
 * their parent transform's <code>TransformID</code> and other optional
 * parameters as documented in this section.
 * </p>
 * <p>
 * This operation returns a list of historic runs and must be paginated.
 * </p>
 */
public class GetMLTaskRunsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String transformId;

    /**
     * <p>
     * A token for pagination of the results. The default is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The filter criteria, in the <code>TaskRunFilterCriteria</code> structure,
     * for the task run.
     * </p>
     */
    private TaskRunFilterCriteria filter;

    /**
     * <p>
     * The sorting criteria, in the <code>TaskRunSortCriteria</code> structure,
     * for the task run.
     * </p>
     */
    private TaskRunSortCriteria sort;

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique identifier of the machine learning transform.
     *         </p>
     */
    public String getTransformId() {
        return transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param transformId <p>
     *            The unique identifier of the machine learning transform.
     *            </p>
     */
    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param transformId <p>
     *            The unique identifier of the machine learning transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTaskRunsRequest withTransformId(String transformId) {
        this.transformId = transformId;
        return this;
    }

    /**
     * <p>
     * A token for pagination of the results. The default is empty.
     * </p>
     *
     * @return <p>
     *         A token for pagination of the results. The default is empty.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token for pagination of the results. The default is empty.
     * </p>
     *
     * @param nextToken <p>
     *            A token for pagination of the results. The default is empty.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for pagination of the results. The default is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token for pagination of the results. The default is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTaskRunsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of results to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTaskRunsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The filter criteria, in the <code>TaskRunFilterCriteria</code> structure,
     * for the task run.
     * </p>
     *
     * @return <p>
     *         The filter criteria, in the <code>TaskRunFilterCriteria</code>
     *         structure, for the task run.
     *         </p>
     */
    public TaskRunFilterCriteria getFilter() {
        return filter;
    }

    /**
     * <p>
     * The filter criteria, in the <code>TaskRunFilterCriteria</code> structure,
     * for the task run.
     * </p>
     *
     * @param filter <p>
     *            The filter criteria, in the <code>TaskRunFilterCriteria</code>
     *            structure, for the task run.
     *            </p>
     */
    public void setFilter(TaskRunFilterCriteria filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter criteria, in the <code>TaskRunFilterCriteria</code> structure,
     * for the task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            The filter criteria, in the <code>TaskRunFilterCriteria</code>
     *            structure, for the task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTaskRunsRequest withFilter(TaskRunFilterCriteria filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * The sorting criteria, in the <code>TaskRunSortCriteria</code> structure,
     * for the task run.
     * </p>
     *
     * @return <p>
     *         The sorting criteria, in the <code>TaskRunSortCriteria</code>
     *         structure, for the task run.
     *         </p>
     */
    public TaskRunSortCriteria getSort() {
        return sort;
    }

    /**
     * <p>
     * The sorting criteria, in the <code>TaskRunSortCriteria</code> structure,
     * for the task run.
     * </p>
     *
     * @param sort <p>
     *            The sorting criteria, in the <code>TaskRunSortCriteria</code>
     *            structure, for the task run.
     *            </p>
     */
    public void setSort(TaskRunSortCriteria sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The sorting criteria, in the <code>TaskRunSortCriteria</code> structure,
     * for the task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sort <p>
     *            The sorting criteria, in the <code>TaskRunSortCriteria</code>
     *            structure, for the task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLTaskRunsRequest withSort(TaskRunSortCriteria sort) {
        this.sort = sort;
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
        if (getTransformId() != null)
            sb.append("TransformId: " + getTransformId() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getSort() != null)
            sb.append("Sort: " + getSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLTaskRunsRequest == false)
            return false;
        GetMLTaskRunsRequest other = (GetMLTaskRunsRequest) obj;

        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null
                && other.getTransformId().equals(this.getTransformId()) == false)
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
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        return true;
    }
}
