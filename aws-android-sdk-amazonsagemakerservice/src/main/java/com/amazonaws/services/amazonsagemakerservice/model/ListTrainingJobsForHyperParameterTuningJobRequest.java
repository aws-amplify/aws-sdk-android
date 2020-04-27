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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a list of <a>TrainingJobSummary</a> objects that describe the training
 * jobs that a hyperparameter tuning job launched.
 * </p>
 */
public class ListTrainingJobsForHyperParameterTuningJobRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name of the tuning job whose training jobs you want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String hyperParameterTuningJobName;

    /**
     * <p>
     * If the result of the previous
     * <code>ListTrainingJobsForHyperParameterTuningJob</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of training jobs, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of training jobs to return. The default value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A filter that returns only training jobs with the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     */
    private String statusEquals;

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * If the value of this field is <code>FinalObjectiveMetricValue</code>, any
     * training jobs that did not return an objective metric are not listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status,
     * FinalObjectiveMetricValue
     */
    private String sortBy;

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     */
    private String sortOrder;

    /**
     * <p>
     * The name of the tuning job whose training jobs you want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the tuning job whose training jobs you want to list.
     *         </p>
     */
    public String getHyperParameterTuningJobName() {
        return hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job whose training jobs you want to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param hyperParameterTuningJobName <p>
     *            The name of the tuning job whose training jobs you want to
     *            list.
     *            </p>
     */
    public void setHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job whose training jobs you want to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param hyperParameterTuningJobName <p>
     *            The name of the tuning job whose training jobs you want to
     *            list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrainingJobsForHyperParameterTuningJobRequest withHyperParameterTuningJobName(
            String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
        return this;
    }

    /**
     * <p>
     * If the result of the previous
     * <code>ListTrainingJobsForHyperParameterTuningJob</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of training jobs, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the result of the previous
     *         <code>ListTrainingJobsForHyperParameterTuningJob</code> request
     *         was truncated, the response includes a <code>NextToken</code>. To
     *         retrieve the next set of training jobs, use the token in the next
     *         request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the result of the previous
     * <code>ListTrainingJobsForHyperParameterTuningJob</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of training jobs, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the result of the previous
     *            <code>ListTrainingJobsForHyperParameterTuningJob</code>
     *            request was truncated, the response includes a
     *            <code>NextToken</code>. To retrieve the next set of training
     *            jobs, use the token in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous
     * <code>ListTrainingJobsForHyperParameterTuningJob</code> request was
     * truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of training jobs, use the token in the next request.
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
     *            If the result of the previous
     *            <code>ListTrainingJobsForHyperParameterTuningJob</code>
     *            request was truncated, the response includes a
     *            <code>NextToken</code>. To retrieve the next set of training
     *            jobs, use the token in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrainingJobsForHyperParameterTuningJobRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of training jobs to return. The default value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of training jobs to return. The default value
     *         is 10.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of training jobs to return. The default value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of training jobs to return. The default
     *            value is 10.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of training jobs to return. The default value is 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of training jobs to return. The default
     *            value is 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrainingJobsForHyperParameterTuningJobRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A filter that returns only training jobs with the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @return <p>
     *         A filter that returns only training jobs with the specified
     *         status.
     *         </p>
     * @see TrainingJobStatus
     */
    public String getStatusEquals() {
        return statusEquals;
    }

    /**
     * <p>
     * A filter that returns only training jobs with the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param statusEquals <p>
     *            A filter that returns only training jobs with the specified
     *            status.
     *            </p>
     * @see TrainingJobStatus
     */
    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * A filter that returns only training jobs with the specified status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param statusEquals <p>
     *            A filter that returns only training jobs with the specified
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobStatus
     */
    public ListTrainingJobsForHyperParameterTuningJobRequest withStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
        return this;
    }

    /**
     * <p>
     * A filter that returns only training jobs with the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param statusEquals <p>
     *            A filter that returns only training jobs with the specified
     *            status.
     *            </p>
     * @see TrainingJobStatus
     */
    public void setStatusEquals(TrainingJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
    }

    /**
     * <p>
     * A filter that returns only training jobs with the specified status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param statusEquals <p>
     *            A filter that returns only training jobs with the specified
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobStatus
     */
    public ListTrainingJobsForHyperParameterTuningJobRequest withStatusEquals(
            TrainingJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * If the value of this field is <code>FinalObjectiveMetricValue</code>, any
     * training jobs that did not return an objective metric are not listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status,
     * FinalObjectiveMetricValue
     *
     * @return <p>
     *         The field to sort results by. The default is <code>Name</code>.
     *         </p>
     *         <p>
     *         If the value of this field is
     *         <code>FinalObjectiveMetricValue</code>, any training jobs that
     *         did not return an objective metric are not listed.
     *         </p>
     * @see TrainingJobSortByOptions
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * If the value of this field is <code>FinalObjectiveMetricValue</code>, any
     * training jobs that did not return an objective metric are not listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status,
     * FinalObjectiveMetricValue
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is <code>Name</code>
     *            .
     *            </p>
     *            <p>
     *            If the value of this field is
     *            <code>FinalObjectiveMetricValue</code>, any training jobs that
     *            did not return an objective metric are not listed.
     *            </p>
     * @see TrainingJobSortByOptions
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * If the value of this field is <code>FinalObjectiveMetricValue</code>, any
     * training jobs that did not return an objective metric are not listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status,
     * FinalObjectiveMetricValue
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is <code>Name</code>
     *            .
     *            </p>
     *            <p>
     *            If the value of this field is
     *            <code>FinalObjectiveMetricValue</code>, any training jobs that
     *            did not return an objective metric are not listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobSortByOptions
     */
    public ListTrainingJobsForHyperParameterTuningJobRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * If the value of this field is <code>FinalObjectiveMetricValue</code>, any
     * training jobs that did not return an objective metric are not listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status,
     * FinalObjectiveMetricValue
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is <code>Name</code>
     *            .
     *            </p>
     *            <p>
     *            If the value of this field is
     *            <code>FinalObjectiveMetricValue</code>, any training jobs that
     *            did not return an objective metric are not listed.
     *            </p>
     * @see TrainingJobSortByOptions
     */
    public void setSortBy(TrainingJobSortByOptions sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * If the value of this field is <code>FinalObjectiveMetricValue</code>, any
     * training jobs that did not return an objective metric are not listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status,
     * FinalObjectiveMetricValue
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is <code>Name</code>
     *            .
     *            </p>
     *            <p>
     *            If the value of this field is
     *            <code>FinalObjectiveMetricValue</code>, any training jobs that
     *            did not return an objective metric are not listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingJobSortByOptions
     */
    public ListTrainingJobsForHyperParameterTuningJobRequest withSortBy(
            TrainingJobSortByOptions sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @return <p>
     *         The sort order for results. The default is <code>Ascending</code>
     *         .
     *         </p>
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results. The default is
     *            <code>Ascending</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results. The default is
     *            <code>Ascending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListTrainingJobsForHyperParameterTuningJobRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results. The default is
     *            <code>Ascending</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results. The default is
     *            <code>Ascending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListTrainingJobsForHyperParameterTuningJobRequest withSortOrder(SortOrder sortOrder) {
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
        if (getHyperParameterTuningJobName() != null)
            sb.append("HyperParameterTuningJobName: " + getHyperParameterTuningJobName() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: " + getStatusEquals() + ",");
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

        hashCode = prime
                * hashCode
                + ((getHyperParameterTuningJobName() == null) ? 0
                        : getHyperParameterTuningJobName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
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

        if (obj instanceof ListTrainingJobsForHyperParameterTuningJobRequest == false)
            return false;
        ListTrainingJobsForHyperParameterTuningJobRequest other = (ListTrainingJobsForHyperParameterTuningJobRequest) obj;

        if (other.getHyperParameterTuningJobName() == null
                ^ this.getHyperParameterTuningJobName() == null)
            return false;
        if (other.getHyperParameterTuningJobName() != null
                && other.getHyperParameterTuningJobName().equals(
                        this.getHyperParameterTuningJobName()) == false)
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
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null
                && other.getStatusEquals().equals(this.getStatusEquals()) == false)
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
