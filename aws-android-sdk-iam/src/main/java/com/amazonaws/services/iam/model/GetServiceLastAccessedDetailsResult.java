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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

public class GetServiceLastAccessedDetailsResult implements Serializable {
    /**
     * <p>
     * The status of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED
     */
    private String jobStatus;

    /**
     * <p>
     * The type of job. Service jobs return information about when each service
     * was last accessed. Action jobs also include information about when
     * tracked actions within the service were last accessed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     */
    private String jobType;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the report job was created.
     * </p>
     */
    private java.util.Date jobCreationDate;

    /**
     * <p>
     * A <code>ServiceLastAccessed</code> object that contains details about the
     * most recent attempt to access the service.
     * </p>
     */
    private java.util.List<ServiceLastAccessed> servicesLastAccessed;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the generated report job was completed or
     * failed.
     * </p>
     * <p>
     * This field is null if the job is still in progress, as indicated by a job
     * status value of <code>IN_PROGRESS</code>.
     * </p>
     */
    private java.util.Date jobCompletionDate;

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * Note that IAM might return fewer than the <code>MaxItems</code> number of
     * results even when there are more results available. We recommend that you
     * check <code>IsTruncated</code> after every call to ensure that you
     * receive all your results.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * An object that contains details about the reason the operation failed.
     * </p>
     */
    private ErrorDetails error;

    /**
     * <p>
     * The status of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED
     *
     * @return <p>
     *         The status of the job.
     *         </p>
     * @see JobStatusType
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED
     *
     * @param jobStatus <p>
     *            The status of the job.
     *            </p>
     * @see JobStatusType
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED
     *
     * @param jobStatus <p>
     *            The status of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatusType
     */
    public GetServiceLastAccessedDetailsResult withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED
     *
     * @param jobStatus <p>
     *            The status of the job.
     *            </p>
     * @see JobStatusType
     */
    public void setJobStatus(JobStatusType jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, FAILED
     *
     * @param jobStatus <p>
     *            The status of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatusType
     */
    public GetServiceLastAccessedDetailsResult withJobStatus(JobStatusType jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of job. Service jobs return information about when each service
     * was last accessed. Action jobs also include information about when
     * tracked actions within the service were last accessed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     *
     * @return <p>
     *         The type of job. Service jobs return information about when each
     *         service was last accessed. Action jobs also include information
     *         about when tracked actions within the service were last accessed.
     *         </p>
     * @see AccessAdvisorUsageGranularityType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * <p>
     * The type of job. Service jobs return information about when each service
     * was last accessed. Action jobs also include information about when
     * tracked actions within the service were last accessed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     *
     * @param jobType <p>
     *            The type of job. Service jobs return information about when
     *            each service was last accessed. Action jobs also include
     *            information about when tracked actions within the service were
     *            last accessed.
     *            </p>
     * @see AccessAdvisorUsageGranularityType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type of job. Service jobs return information about when each service
     * was last accessed. Action jobs also include information about when
     * tracked actions within the service were last accessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     *
     * @param jobType <p>
     *            The type of job. Service jobs return information about when
     *            each service was last accessed. Action jobs also include
     *            information about when tracked actions within the service were
     *            last accessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessAdvisorUsageGranularityType
     */
    public GetServiceLastAccessedDetailsResult withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * <p>
     * The type of job. Service jobs return information about when each service
     * was last accessed. Action jobs also include information about when
     * tracked actions within the service were last accessed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     *
     * @param jobType <p>
     *            The type of job. Service jobs return information about when
     *            each service was last accessed. Action jobs also include
     *            information about when tracked actions within the service were
     *            last accessed.
     *            </p>
     * @see AccessAdvisorUsageGranularityType
     */
    public void setJobType(AccessAdvisorUsageGranularityType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * <p>
     * The type of job. Service jobs return information about when each service
     * was last accessed. Action jobs also include information about when
     * tracked actions within the service were last accessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_LEVEL, ACTION_LEVEL
     *
     * @param jobType <p>
     *            The type of job. Service jobs return information about when
     *            each service was last accessed. Action jobs also include
     *            information about when tracked actions within the service were
     *            last accessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccessAdvisorUsageGranularityType
     */
    public GetServiceLastAccessedDetailsResult withJobType(AccessAdvisorUsageGranularityType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the report job was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the report job was created.
     *         </p>
     */
    public java.util.Date getJobCreationDate() {
        return jobCreationDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the report job was created.
     * </p>
     *
     * @param jobCreationDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the report job was created.
     *            </p>
     */
    public void setJobCreationDate(java.util.Date jobCreationDate) {
        this.jobCreationDate = jobCreationDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the report job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobCreationDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the report job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceLastAccessedDetailsResult withJobCreationDate(java.util.Date jobCreationDate) {
        this.jobCreationDate = jobCreationDate;
        return this;
    }

    /**
     * <p>
     * A <code>ServiceLastAccessed</code> object that contains details about the
     * most recent attempt to access the service.
     * </p>
     *
     * @return <p>
     *         A <code>ServiceLastAccessed</code> object that contains details
     *         about the most recent attempt to access the service.
     *         </p>
     */
    public java.util.List<ServiceLastAccessed> getServicesLastAccessed() {
        return servicesLastAccessed;
    }

    /**
     * <p>
     * A <code>ServiceLastAccessed</code> object that contains details about the
     * most recent attempt to access the service.
     * </p>
     *
     * @param servicesLastAccessed <p>
     *            A <code>ServiceLastAccessed</code> object that contains
     *            details about the most recent attempt to access the service.
     *            </p>
     */
    public void setServicesLastAccessed(
            java.util.Collection<ServiceLastAccessed> servicesLastAccessed) {
        if (servicesLastAccessed == null) {
            this.servicesLastAccessed = null;
            return;
        }

        this.servicesLastAccessed = new java.util.ArrayList<ServiceLastAccessed>(
                servicesLastAccessed);
    }

    /**
     * <p>
     * A <code>ServiceLastAccessed</code> object that contains details about the
     * most recent attempt to access the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param servicesLastAccessed <p>
     *            A <code>ServiceLastAccessed</code> object that contains
     *            details about the most recent attempt to access the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceLastAccessedDetailsResult withServicesLastAccessed(
            ServiceLastAccessed... servicesLastAccessed) {
        if (getServicesLastAccessed() == null) {
            this.servicesLastAccessed = new java.util.ArrayList<ServiceLastAccessed>(
                    servicesLastAccessed.length);
        }
        for (ServiceLastAccessed value : servicesLastAccessed) {
            this.servicesLastAccessed.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A <code>ServiceLastAccessed</code> object that contains details about the
     * most recent attempt to access the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param servicesLastAccessed <p>
     *            A <code>ServiceLastAccessed</code> object that contains
     *            details about the most recent attempt to access the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceLastAccessedDetailsResult withServicesLastAccessed(
            java.util.Collection<ServiceLastAccessed> servicesLastAccessed) {
        setServicesLastAccessed(servicesLastAccessed);
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the generated report job was completed or
     * failed.
     * </p>
     * <p>
     * This field is null if the job is still in progress, as indicated by a job
     * status value of <code>IN_PROGRESS</code>.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the generated report job was completed or
     *         failed.
     *         </p>
     *         <p>
     *         This field is null if the job is still in progress, as indicated
     *         by a job status value of <code>IN_PROGRESS</code>.
     *         </p>
     */
    public java.util.Date getJobCompletionDate() {
        return jobCompletionDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the generated report job was completed or
     * failed.
     * </p>
     * <p>
     * This field is null if the job is still in progress, as indicated by a job
     * status value of <code>IN_PROGRESS</code>.
     * </p>
     *
     * @param jobCompletionDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the generated report job was completed or
     *            failed.
     *            </p>
     *            <p>
     *            This field is null if the job is still in progress, as
     *            indicated by a job status value of <code>IN_PROGRESS</code>.
     *            </p>
     */
    public void setJobCompletionDate(java.util.Date jobCompletionDate) {
        this.jobCompletionDate = jobCompletionDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the generated report job was completed or
     * failed.
     * </p>
     * <p>
     * This field is null if the job is still in progress, as indicated by a job
     * status value of <code>IN_PROGRESS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobCompletionDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the generated report job was completed or
     *            failed.
     *            </p>
     *            <p>
     *            This field is null if the job is still in progress, as
     *            indicated by a job status value of <code>IN_PROGRESS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceLastAccessedDetailsResult withJobCompletionDate(
            java.util.Date jobCompletionDate) {
        this.jobCompletionDate = jobCompletionDate;
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * Note that IAM might return fewer than the <code>MaxItems</code> number of
     * results even when there are more results available. We recommend that you
     * check <code>IsTruncated</code> after every call to ensure that you
     * receive all your results.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items to return. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to
     *         retrieve more items. Note that IAM might return fewer than the
     *         <code>MaxItems</code> number of results even when there are more
     *         results available. We recommend that you check
     *         <code>IsTruncated</code> after every call to ensure that you
     *         receive all your results.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * Note that IAM might return fewer than the <code>MaxItems</code> number of
     * results even when there are more results available. We recommend that you
     * check <code>IsTruncated</code> after every call to ensure that you
     * receive all your results.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items to return. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to
     *         retrieve more items. Note that IAM might return fewer than the
     *         <code>MaxItems</code> number of results even when there are more
     *         results available. We recommend that you check
     *         <code>IsTruncated</code> after every call to ensure that you
     *         receive all your results.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * Note that IAM might return fewer than the <code>MaxItems</code> number of
     * results even when there are more results available. We recommend that you
     * check <code>IsTruncated</code> after every call to ensure that you
     * receive all your results.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more items to return.
     *            If your results were truncated, you can make a subsequent
     *            pagination request using the <code>Marker</code> request
     *            parameter to retrieve more items. Note that IAM might return
     *            fewer than the <code>MaxItems</code> number of results even
     *            when there are more results available. We recommend that you
     *            check <code>IsTruncated</code> after every call to ensure that
     *            you receive all your results.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more items.
     * Note that IAM might return fewer than the <code>MaxItems</code> number of
     * results even when there are more results available. We recommend that you
     * check <code>IsTruncated</code> after every call to ensure that you
     * receive all your results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more items to return.
     *            If your results were truncated, you can make a subsequent
     *            pagination request using the <code>Marker</code> request
     *            parameter to retrieve more items. Note that IAM might return
     *            fewer than the <code>MaxItems</code> number of results even
     *            when there are more results available. We recommend that you
     *            check <code>IsTruncated</code> after every call to ensure that
     *            you receive all your results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceLastAccessedDetailsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     *
     * @return <p>
     *         When <code>IsTruncated</code> is <code>true</code>, this element
     *         is present and contains the value to use for the
     *         <code>Marker</code> parameter in a subsequent pagination request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     *
     * @param marker <p>
     *            When <code>IsTruncated</code> is <code>true</code>, this
     *            element is present and contains the value to use for the
     *            <code>Marker</code> parameter in a subsequent pagination
     *            request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            When <code>IsTruncated</code> is <code>true</code>, this
     *            element is present and contains the value to use for the
     *            <code>Marker</code> parameter in a subsequent pagination
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceLastAccessedDetailsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * An object that contains details about the reason the operation failed.
     * </p>
     *
     * @return <p>
     *         An object that contains details about the reason the operation
     *         failed.
     *         </p>
     */
    public ErrorDetails getError() {
        return error;
    }

    /**
     * <p>
     * An object that contains details about the reason the operation failed.
     * </p>
     *
     * @param error <p>
     *            An object that contains details about the reason the operation
     *            failed.
     *            </p>
     */
    public void setError(ErrorDetails error) {
        this.error = error;
    }

    /**
     * <p>
     * An object that contains details about the reason the operation failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param error <p>
     *            An object that contains details about the reason the operation
     *            failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceLastAccessedDetailsResult withError(ErrorDetails error) {
        this.error = error;
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
        if (getJobStatus() != null)
            sb.append("JobStatus: " + getJobStatus() + ",");
        if (getJobType() != null)
            sb.append("JobType: " + getJobType() + ",");
        if (getJobCreationDate() != null)
            sb.append("JobCreationDate: " + getJobCreationDate() + ",");
        if (getServicesLastAccessed() != null)
            sb.append("ServicesLastAccessed: " + getServicesLastAccessed() + ",");
        if (getJobCompletionDate() != null)
            sb.append("JobCompletionDate: " + getJobCompletionDate() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getError() != null)
            sb.append("Error: " + getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode
                + ((getJobCreationDate() == null) ? 0 : getJobCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getServicesLastAccessed() == null) ? 0 : getServicesLastAccessed().hashCode());
        hashCode = prime * hashCode
                + ((getJobCompletionDate() == null) ? 0 : getJobCompletionDate().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceLastAccessedDetailsResult == false)
            return false;
        GetServiceLastAccessedDetailsResult other = (GetServiceLastAccessedDetailsResult) obj;

        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getJobCreationDate() == null ^ this.getJobCreationDate() == null)
            return false;
        if (other.getJobCreationDate() != null
                && other.getJobCreationDate().equals(this.getJobCreationDate()) == false)
            return false;
        if (other.getServicesLastAccessed() == null ^ this.getServicesLastAccessed() == null)
            return false;
        if (other.getServicesLastAccessed() != null
                && other.getServicesLastAccessed().equals(this.getServicesLastAccessed()) == false)
            return false;
        if (other.getJobCompletionDate() == null ^ this.getJobCompletionDate() == null)
            return false;
        if (other.getJobCompletionDate() != null
                && other.getJobCompletionDate().equals(this.getJobCompletionDate()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }
}
