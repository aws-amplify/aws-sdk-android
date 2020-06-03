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

public class GetOrganizationsAccessReportResult implements Serializable {
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
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the report job was created.
     * </p>
     */
    private java.util.Date jobCreationDate;

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
     * The number of services that the applicable SCPs allow account principals
     * to access.
     * </p>
     */
    private Integer numberOfServicesAccessible;

    /**
     * <p>
     * The number of services that account principals are allowed but did not
     * attempt to access.
     * </p>
     */
    private Integer numberOfServicesNotAccessed;

    /**
     * <p>
     * An object that contains details about the most recent attempt to access
     * the service.
     * </p>
     */
    private java.util.List<AccessDetail> accessDetails;

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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String marker;

    /**
     * <p>
     * Contains information about the reason that the operation failed.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <a>GetOrganizationsAccessReport</a>,
     * <a>GetServiceLastAccessedDetails</a>, and
     * <a>GetServiceLastAccessedDetailsWithEntities</a> operations.
     * </p>
     */
    private ErrorDetails errorDetails;

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
    public GetOrganizationsAccessReportResult withJobStatus(String jobStatus) {
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
    public GetOrganizationsAccessReportResult withJobStatus(JobStatusType jobStatus) {
        this.jobStatus = jobStatus.toString();
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
    public GetOrganizationsAccessReportResult withJobCreationDate(java.util.Date jobCreationDate) {
        this.jobCreationDate = jobCreationDate;
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
    public GetOrganizationsAccessReportResult withJobCompletionDate(java.util.Date jobCompletionDate) {
        this.jobCompletionDate = jobCompletionDate;
        return this;
    }

    /**
     * <p>
     * The number of services that the applicable SCPs allow account principals
     * to access.
     * </p>
     *
     * @return <p>
     *         The number of services that the applicable SCPs allow account
     *         principals to access.
     *         </p>
     */
    public Integer getNumberOfServicesAccessible() {
        return numberOfServicesAccessible;
    }

    /**
     * <p>
     * The number of services that the applicable SCPs allow account principals
     * to access.
     * </p>
     *
     * @param numberOfServicesAccessible <p>
     *            The number of services that the applicable SCPs allow account
     *            principals to access.
     *            </p>
     */
    public void setNumberOfServicesAccessible(Integer numberOfServicesAccessible) {
        this.numberOfServicesAccessible = numberOfServicesAccessible;
    }

    /**
     * <p>
     * The number of services that the applicable SCPs allow account principals
     * to access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfServicesAccessible <p>
     *            The number of services that the applicable SCPs allow account
     *            principals to access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOrganizationsAccessReportResult withNumberOfServicesAccessible(
            Integer numberOfServicesAccessible) {
        this.numberOfServicesAccessible = numberOfServicesAccessible;
        return this;
    }

    /**
     * <p>
     * The number of services that account principals are allowed but did not
     * attempt to access.
     * </p>
     *
     * @return <p>
     *         The number of services that account principals are allowed but
     *         did not attempt to access.
     *         </p>
     */
    public Integer getNumberOfServicesNotAccessed() {
        return numberOfServicesNotAccessed;
    }

    /**
     * <p>
     * The number of services that account principals are allowed but did not
     * attempt to access.
     * </p>
     *
     * @param numberOfServicesNotAccessed <p>
     *            The number of services that account principals are allowed but
     *            did not attempt to access.
     *            </p>
     */
    public void setNumberOfServicesNotAccessed(Integer numberOfServicesNotAccessed) {
        this.numberOfServicesNotAccessed = numberOfServicesNotAccessed;
    }

    /**
     * <p>
     * The number of services that account principals are allowed but did not
     * attempt to access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfServicesNotAccessed <p>
     *            The number of services that account principals are allowed but
     *            did not attempt to access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOrganizationsAccessReportResult withNumberOfServicesNotAccessed(
            Integer numberOfServicesNotAccessed) {
        this.numberOfServicesNotAccessed = numberOfServicesNotAccessed;
        return this;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access
     * the service.
     * </p>
     *
     * @return <p>
     *         An object that contains details about the most recent attempt to
     *         access the service.
     *         </p>
     */
    public java.util.List<AccessDetail> getAccessDetails() {
        return accessDetails;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access
     * the service.
     * </p>
     *
     * @param accessDetails <p>
     *            An object that contains details about the most recent attempt
     *            to access the service.
     *            </p>
     */
    public void setAccessDetails(java.util.Collection<AccessDetail> accessDetails) {
        if (accessDetails == null) {
            this.accessDetails = null;
            return;
        }

        this.accessDetails = new java.util.ArrayList<AccessDetail>(accessDetails);
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access
     * the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessDetails <p>
     *            An object that contains details about the most recent attempt
     *            to access the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOrganizationsAccessReportResult withAccessDetails(AccessDetail... accessDetails) {
        if (getAccessDetails() == null) {
            this.accessDetails = new java.util.ArrayList<AccessDetail>(accessDetails.length);
        }
        for (AccessDetail value : accessDetails) {
            this.accessDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access
     * the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessDetails <p>
     *            An object that contains details about the most recent attempt
     *            to access the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOrganizationsAccessReportResult withAccessDetails(
            java.util.Collection<AccessDetail> accessDetails) {
        setAccessDetails(accessDetails);
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
    public GetOrganizationsAccessReportResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
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
    public GetOrganizationsAccessReportResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Contains information about the reason that the operation failed.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <a>GetOrganizationsAccessReport</a>,
     * <a>GetServiceLastAccessedDetails</a>, and
     * <a>GetServiceLastAccessedDetailsWithEntities</a> operations.
     * </p>
     *
     * @return <p>
     *         Contains information about the reason that the operation failed.
     *         </p>
     *         <p>
     *         This data type is used as a response element in the
     *         <a>GetOrganizationsAccessReport</a>,
     *         <a>GetServiceLastAccessedDetails</a>, and
     *         <a>GetServiceLastAccessedDetailsWithEntities</a> operations.
     *         </p>
     */
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    /**
     * <p>
     * Contains information about the reason that the operation failed.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <a>GetOrganizationsAccessReport</a>,
     * <a>GetServiceLastAccessedDetails</a>, and
     * <a>GetServiceLastAccessedDetailsWithEntities</a> operations.
     * </p>
     *
     * @param errorDetails <p>
     *            Contains information about the reason that the operation
     *            failed.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <a>GetOrganizationsAccessReport</a>,
     *            <a>GetServiceLastAccessedDetails</a>, and
     *            <a>GetServiceLastAccessedDetailsWithEntities</a> operations.
     *            </p>
     */
    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * <p>
     * Contains information about the reason that the operation failed.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <a>GetOrganizationsAccessReport</a>,
     * <a>GetServiceLastAccessedDetails</a>, and
     * <a>GetServiceLastAccessedDetailsWithEntities</a> operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorDetails <p>
     *            Contains information about the reason that the operation
     *            failed.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <a>GetOrganizationsAccessReport</a>,
     *            <a>GetServiceLastAccessedDetails</a>, and
     *            <a>GetServiceLastAccessedDetailsWithEntities</a> operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOrganizationsAccessReportResult withErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
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
        if (getJobCreationDate() != null)
            sb.append("JobCreationDate: " + getJobCreationDate() + ",");
        if (getJobCompletionDate() != null)
            sb.append("JobCompletionDate: " + getJobCompletionDate() + ",");
        if (getNumberOfServicesAccessible() != null)
            sb.append("NumberOfServicesAccessible: " + getNumberOfServicesAccessible() + ",");
        if (getNumberOfServicesNotAccessed() != null)
            sb.append("NumberOfServicesNotAccessed: " + getNumberOfServicesNotAccessed() + ",");
        if (getAccessDetails() != null)
            sb.append("AccessDetails: " + getAccessDetails() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: " + getErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getJobCreationDate() == null) ? 0 : getJobCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getJobCompletionDate() == null) ? 0 : getJobCompletionDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfServicesAccessible() == null) ? 0 : getNumberOfServicesAccessible()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfServicesNotAccessed() == null) ? 0
                        : getNumberOfServicesNotAccessed().hashCode());
        hashCode = prime * hashCode
                + ((getAccessDetails() == null) ? 0 : getAccessDetails().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOrganizationsAccessReportResult == false)
            return false;
        GetOrganizationsAccessReportResult other = (GetOrganizationsAccessReportResult) obj;

        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getJobCreationDate() == null ^ this.getJobCreationDate() == null)
            return false;
        if (other.getJobCreationDate() != null
                && other.getJobCreationDate().equals(this.getJobCreationDate()) == false)
            return false;
        if (other.getJobCompletionDate() == null ^ this.getJobCompletionDate() == null)
            return false;
        if (other.getJobCompletionDate() != null
                && other.getJobCompletionDate().equals(this.getJobCompletionDate()) == false)
            return false;
        if (other.getNumberOfServicesAccessible() == null
                ^ this.getNumberOfServicesAccessible() == null)
            return false;
        if (other.getNumberOfServicesAccessible() != null
                && other.getNumberOfServicesAccessible().equals(
                        this.getNumberOfServicesAccessible()) == false)
            return false;
        if (other.getNumberOfServicesNotAccessed() == null
                ^ this.getNumberOfServicesNotAccessed() == null)
            return false;
        if (other.getNumberOfServicesNotAccessed() != null
                && other.getNumberOfServicesNotAccessed().equals(
                        this.getNumberOfServicesNotAccessed()) == false)
            return false;
        if (other.getAccessDetails() == null ^ this.getAccessDetails() == null)
            return false;
        if (other.getAccessDetails() != null
                && other.getAccessDetails().equals(this.getAccessDetails()) == false)
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
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null
                && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        return true;
    }
}
