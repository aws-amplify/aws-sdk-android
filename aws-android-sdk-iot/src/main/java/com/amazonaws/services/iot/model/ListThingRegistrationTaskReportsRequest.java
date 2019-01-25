/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Information about the thing registration tasks.
 * </p>
 */
public class ListThingRegistrationTaskReportsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The id of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     */
    private String taskId;

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     */
    private String reportType;

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The id of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     *
     * @return <p>
     *         The id of the task.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The id of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     *
     * @param taskId <p>
     *            The id of the task.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The id of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 40<br/>
     *
     * @param taskId <p>
     *            The id of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingRegistrationTaskReportsRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     *
     * @return <p>
     *         The type of task report.
     *         </p>
     * @see ReportType
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     *
     * @param reportType <p>
     *            The type of task report.
     *            </p>
     * @see ReportType
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     *
     * @param reportType <p>
     *            The type of task report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportType
     */
    public ListThingRegistrationTaskReportsRequest withReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     *
     * @param reportType <p>
     *            The type of task report.
     *            </p>
     * @see ReportType
     */
    public void setReportType(ReportType reportType) {
        this.reportType = reportType.toString();
    }

    /**
     * <p>
     * The type of task report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERRORS, RESULTS
     *
     * @param reportType <p>
     *            The type of task report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReportType
     */
    public ListThingRegistrationTaskReportsRequest withReportType(ReportType reportType) {
        this.reportType = reportType.toString();
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     *
     * @return <p>
     *         The token to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingRegistrationTaskReportsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to return per request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingRegistrationTaskReportsRequest withMaxResults(Integer maxResults) {
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
        if (getTaskId() != null)
            sb.append("taskId: " + getTaskId() + ",");
        if (getReportType() != null)
            sb.append("reportType: " + getReportType() + ",");
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

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getReportType() == null) ? 0 : getReportType().hashCode());
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

        if (obj instanceof ListThingRegistrationTaskReportsRequest == false)
            return false;
        ListThingRegistrationTaskReportsRequest other = (ListThingRegistrationTaskReportsRequest) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getReportType() == null ^ this.getReportType() == null)
            return false;
        if (other.getReportType() != null
                && other.getReportType().equals(this.getReportType()) == false)
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
