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

public class GetServiceLastAccessedDetailsWithEntitiesResult implements Serializable {
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
     * An <code>EntityDetailsList</code> object that contains details about when
     * an IAM entity (user or role) used group or policy permissions in an
     * attempt to access the specified AWS service.
     * </p>
     */
    private java.util.List<EntityDetails> entityDetailsList;

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
    public GetServiceLastAccessedDetailsWithEntitiesResult withJobStatus(String jobStatus) {
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
    public GetServiceLastAccessedDetailsWithEntitiesResult withJobStatus(JobStatusType jobStatus) {
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
    public GetServiceLastAccessedDetailsWithEntitiesResult withJobCreationDate(
            java.util.Date jobCreationDate) {
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
    public GetServiceLastAccessedDetailsWithEntitiesResult withJobCompletionDate(
            java.util.Date jobCompletionDate) {
        this.jobCompletionDate = jobCompletionDate;
        return this;
    }

    /**
     * <p>
     * An <code>EntityDetailsList</code> object that contains details about when
     * an IAM entity (user or role) used group or policy permissions in an
     * attempt to access the specified AWS service.
     * </p>
     *
     * @return <p>
     *         An <code>EntityDetailsList</code> object that contains details
     *         about when an IAM entity (user or role) used group or policy
     *         permissions in an attempt to access the specified AWS service.
     *         </p>
     */
    public java.util.List<EntityDetails> getEntityDetailsList() {
        return entityDetailsList;
    }

    /**
     * <p>
     * An <code>EntityDetailsList</code> object that contains details about when
     * an IAM entity (user or role) used group or policy permissions in an
     * attempt to access the specified AWS service.
     * </p>
     *
     * @param entityDetailsList <p>
     *            An <code>EntityDetailsList</code> object that contains details
     *            about when an IAM entity (user or role) used group or policy
     *            permissions in an attempt to access the specified AWS service.
     *            </p>
     */
    public void setEntityDetailsList(java.util.Collection<EntityDetails> entityDetailsList) {
        if (entityDetailsList == null) {
            this.entityDetailsList = null;
            return;
        }

        this.entityDetailsList = new java.util.ArrayList<EntityDetails>(entityDetailsList);
    }

    /**
     * <p>
     * An <code>EntityDetailsList</code> object that contains details about when
     * an IAM entity (user or role) used group or policy permissions in an
     * attempt to access the specified AWS service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityDetailsList <p>
     *            An <code>EntityDetailsList</code> object that contains details
     *            about when an IAM entity (user or role) used group or policy
     *            permissions in an attempt to access the specified AWS service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceLastAccessedDetailsWithEntitiesResult withEntityDetailsList(
            EntityDetails... entityDetailsList) {
        if (getEntityDetailsList() == null) {
            this.entityDetailsList = new java.util.ArrayList<EntityDetails>(
                    entityDetailsList.length);
        }
        for (EntityDetails value : entityDetailsList) {
            this.entityDetailsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An <code>EntityDetailsList</code> object that contains details about when
     * an IAM entity (user or role) used group or policy permissions in an
     * attempt to access the specified AWS service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityDetailsList <p>
     *            An <code>EntityDetailsList</code> object that contains details
     *            about when an IAM entity (user or role) used group or policy
     *            permissions in an attempt to access the specified AWS service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceLastAccessedDetailsWithEntitiesResult withEntityDetailsList(
            java.util.Collection<EntityDetails> entityDetailsList) {
        setEntityDetailsList(entityDetailsList);
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
    public GetServiceLastAccessedDetailsWithEntitiesResult withIsTruncated(Boolean isTruncated) {
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
    public GetServiceLastAccessedDetailsWithEntitiesResult withMarker(String marker) {
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
    public GetServiceLastAccessedDetailsWithEntitiesResult withError(ErrorDetails error) {
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
        if (getJobCreationDate() != null)
            sb.append("JobCreationDate: " + getJobCreationDate() + ",");
        if (getJobCompletionDate() != null)
            sb.append("JobCompletionDate: " + getJobCompletionDate() + ",");
        if (getEntityDetailsList() != null)
            sb.append("EntityDetailsList: " + getEntityDetailsList() + ",");
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
        hashCode = prime * hashCode
                + ((getJobCreationDate() == null) ? 0 : getJobCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getJobCompletionDate() == null) ? 0 : getJobCompletionDate().hashCode());
        hashCode = prime * hashCode
                + ((getEntityDetailsList() == null) ? 0 : getEntityDetailsList().hashCode());
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

        if (obj instanceof GetServiceLastAccessedDetailsWithEntitiesResult == false)
            return false;
        GetServiceLastAccessedDetailsWithEntitiesResult other = (GetServiceLastAccessedDetailsWithEntitiesResult) obj;

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
        if (other.getEntityDetailsList() == null ^ this.getEntityDetailsList() == null)
            return false;
        if (other.getEntityDetailsList() != null
                && other.getEntityDetailsList().equals(this.getEntityDetailsList()) == false)
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
