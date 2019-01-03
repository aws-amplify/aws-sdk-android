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
 * Cancels the execution of a job for a given thing.
 * </p>
 */
public class CancelJobExecutionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the job to be canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobId;

    /**
     * <p>
     * The name of the thing whose execution of the job will be canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * (Optional) If <code>true</code> the job execution will be canceled if it
     * has status IN_PROGRESS or QUEUED, otherwise the job execution will be
     * canceled only if it has status QUEUED. If you attempt to cancel a job
     * execution that is IN_PROGRESS, and you do not set <code>force</code> to
     * <code>true</code>, then an <code>InvalidStateTransitionException</code>
     * will be thrown. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job execution which is "IN_PROGRESS", will cause the device
     * to be unable to update the job execution status. Use caution and ensure
     * that the device is able to recover to a valid state.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * (Optional) The expected current version of the job execution. Each time
     * you update the job execution, its version is incremented. If the version
     * of the job execution stored in Jobs does not match, the update is
     * rejected with a VersionMismatch error, and an ErrorResponse that contains
     * the current job execution status data is returned. (This makes it
     * unnecessary to perform a separate DescribeJobExecution request in order
     * to obtain the job execution status data.)
     * </p>
     */
    private Long expectedVersion;

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job
     * execution. If not specified, the statusDetails are unchanged. You can
     * specify at most 10 name/value pairs.
     * </p>
     */
    private java.util.Map<String, String> statusDetails;

    /**
     * <p>
     * The ID of the job to be canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The ID of the job to be canceled.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The ID of the job to be canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            The ID of the job to be canceled.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job to be canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            The ID of the job to be canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJobExecutionRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The name of the thing whose execution of the job will be canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing whose execution of the job will be
     *         canceled.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing whose execution of the job will be canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing whose execution of the job will be
     *            canceled.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing whose execution of the job will be canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing whose execution of the job will be
     *            canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJobExecutionRequest withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> the job execution will be canceled if it
     * has status IN_PROGRESS or QUEUED, otherwise the job execution will be
     * canceled only if it has status QUEUED. If you attempt to cancel a job
     * execution that is IN_PROGRESS, and you do not set <code>force</code> to
     * <code>true</code>, then an <code>InvalidStateTransitionException</code>
     * will be thrown. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job execution which is "IN_PROGRESS", will cause the device
     * to be unable to update the job execution status. Use caution and ensure
     * that the device is able to recover to a valid state.
     * </p>
     *
     * @return <p>
     *         (Optional) If <code>true</code> the job execution will be
     *         canceled if it has status IN_PROGRESS or QUEUED, otherwise the
     *         job execution will be canceled only if it has status QUEUED. If
     *         you attempt to cancel a job execution that is IN_PROGRESS, and
     *         you do not set <code>force</code> to <code>true</code>, then an
     *         <code>InvalidStateTransitionException</code> will be thrown. The
     *         default is <code>false</code>.
     *         </p>
     *         <p>
     *         Canceling a job execution which is "IN_PROGRESS", will cause the
     *         device to be unable to update the job execution status. Use
     *         caution and ensure that the device is able to recover to a valid
     *         state.
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> the job execution will be canceled if it
     * has status IN_PROGRESS or QUEUED, otherwise the job execution will be
     * canceled only if it has status QUEUED. If you attempt to cancel a job
     * execution that is IN_PROGRESS, and you do not set <code>force</code> to
     * <code>true</code>, then an <code>InvalidStateTransitionException</code>
     * will be thrown. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job execution which is "IN_PROGRESS", will cause the device
     * to be unable to update the job execution status. Use caution and ensure
     * that the device is able to recover to a valid state.
     * </p>
     *
     * @return <p>
     *         (Optional) If <code>true</code> the job execution will be
     *         canceled if it has status IN_PROGRESS or QUEUED, otherwise the
     *         job execution will be canceled only if it has status QUEUED. If
     *         you attempt to cancel a job execution that is IN_PROGRESS, and
     *         you do not set <code>force</code> to <code>true</code>, then an
     *         <code>InvalidStateTransitionException</code> will be thrown. The
     *         default is <code>false</code>.
     *         </p>
     *         <p>
     *         Canceling a job execution which is "IN_PROGRESS", will cause the
     *         device to be unable to update the job execution status. Use
     *         caution and ensure that the device is able to recover to a valid
     *         state.
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> the job execution will be canceled if it
     * has status IN_PROGRESS or QUEUED, otherwise the job execution will be
     * canceled only if it has status QUEUED. If you attempt to cancel a job
     * execution that is IN_PROGRESS, and you do not set <code>force</code> to
     * <code>true</code>, then an <code>InvalidStateTransitionException</code>
     * will be thrown. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job execution which is "IN_PROGRESS", will cause the device
     * to be unable to update the job execution status. Use caution and ensure
     * that the device is able to recover to a valid state.
     * </p>
     *
     * @param force <p>
     *            (Optional) If <code>true</code> the job execution will be
     *            canceled if it has status IN_PROGRESS or QUEUED, otherwise the
     *            job execution will be canceled only if it has status QUEUED.
     *            If you attempt to cancel a job execution that is IN_PROGRESS,
     *            and you do not set <code>force</code> to <code>true</code>,
     *            then an <code>InvalidStateTransitionException</code> will be
     *            thrown. The default is <code>false</code>.
     *            </p>
     *            <p>
     *            Canceling a job execution which is "IN_PROGRESS", will cause
     *            the device to be unable to update the job execution status.
     *            Use caution and ensure that the device is able to recover to a
     *            valid state.
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> the job execution will be canceled if it
     * has status IN_PROGRESS or QUEUED, otherwise the job execution will be
     * canceled only if it has status QUEUED. If you attempt to cancel a job
     * execution that is IN_PROGRESS, and you do not set <code>force</code> to
     * <code>true</code>, then an <code>InvalidStateTransitionException</code>
     * will be thrown. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job execution which is "IN_PROGRESS", will cause the device
     * to be unable to update the job execution status. Use caution and ensure
     * that the device is able to recover to a valid state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            (Optional) If <code>true</code> the job execution will be
     *            canceled if it has status IN_PROGRESS or QUEUED, otherwise the
     *            job execution will be canceled only if it has status QUEUED.
     *            If you attempt to cancel a job execution that is IN_PROGRESS,
     *            and you do not set <code>force</code> to <code>true</code>,
     *            then an <code>InvalidStateTransitionException</code> will be
     *            thrown. The default is <code>false</code>.
     *            </p>
     *            <p>
     *            Canceling a job execution which is "IN_PROGRESS", will cause
     *            the device to be unable to update the job execution status.
     *            Use caution and ensure that the device is able to recover to a
     *            valid state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJobExecutionRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * <p>
     * (Optional) The expected current version of the job execution. Each time
     * you update the job execution, its version is incremented. If the version
     * of the job execution stored in Jobs does not match, the update is
     * rejected with a VersionMismatch error, and an ErrorResponse that contains
     * the current job execution status data is returned. (This makes it
     * unnecessary to perform a separate DescribeJobExecution request in order
     * to obtain the job execution status data.)
     * </p>
     *
     * @return <p>
     *         (Optional) The expected current version of the job execution.
     *         Each time you update the job execution, its version is
     *         incremented. If the version of the job execution stored in Jobs
     *         does not match, the update is rejected with a VersionMismatch
     *         error, and an ErrorResponse that contains the current job
     *         execution status data is returned. (This makes it unnecessary to
     *         perform a separate DescribeJobExecution request in order to
     *         obtain the job execution status data.)
     *         </p>
     */
    public Long getExpectedVersion() {
        return expectedVersion;
    }

    /**
     * <p>
     * (Optional) The expected current version of the job execution. Each time
     * you update the job execution, its version is incremented. If the version
     * of the job execution stored in Jobs does not match, the update is
     * rejected with a VersionMismatch error, and an ErrorResponse that contains
     * the current job execution status data is returned. (This makes it
     * unnecessary to perform a separate DescribeJobExecution request in order
     * to obtain the job execution status data.)
     * </p>
     *
     * @param expectedVersion <p>
     *            (Optional) The expected current version of the job execution.
     *            Each time you update the job execution, its version is
     *            incremented. If the version of the job execution stored in
     *            Jobs does not match, the update is rejected with a
     *            VersionMismatch error, and an ErrorResponse that contains the
     *            current job execution status data is returned. (This makes it
     *            unnecessary to perform a separate DescribeJobExecution request
     *            in order to obtain the job execution status data.)
     *            </p>
     */
    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * (Optional) The expected current version of the job execution. Each time
     * you update the job execution, its version is incremented. If the version
     * of the job execution stored in Jobs does not match, the update is
     * rejected with a VersionMismatch error, and an ErrorResponse that contains
     * the current job execution status data is returned. (This makes it
     * unnecessary to perform a separate DescribeJobExecution request in order
     * to obtain the job execution status data.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedVersion <p>
     *            (Optional) The expected current version of the job execution.
     *            Each time you update the job execution, its version is
     *            incremented. If the version of the job execution stored in
     *            Jobs does not match, the update is rejected with a
     *            VersionMismatch error, and an ErrorResponse that contains the
     *            current job execution status data is returned. (This makes it
     *            unnecessary to perform a separate DescribeJobExecution request
     *            in order to obtain the job execution status data.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJobExecutionRequest withExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job
     * execution. If not specified, the statusDetails are unchanged. You can
     * specify at most 10 name/value pairs.
     * </p>
     *
     * @return <p>
     *         A collection of name/value pairs that describe the status of the
     *         job execution. If not specified, the statusDetails are unchanged.
     *         You can specify at most 10 name/value pairs.
     *         </p>
     */
    public java.util.Map<String, String> getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job
     * execution. If not specified, the statusDetails are unchanged. You can
     * specify at most 10 name/value pairs.
     * </p>
     *
     * @param statusDetails <p>
     *            A collection of name/value pairs that describe the status of
     *            the job execution. If not specified, the statusDetails are
     *            unchanged. You can specify at most 10 name/value pairs.
     *            </p>
     */
    public void setStatusDetails(java.util.Map<String, String> statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job
     * execution. If not specified, the statusDetails are unchanged. You can
     * specify at most 10 name/value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusDetails <p>
     *            A collection of name/value pairs that describe the status of
     *            the job execution. If not specified, the statusDetails are
     *            unchanged. You can specify at most 10 name/value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJobExecutionRequest withStatusDetails(java.util.Map<String, String> statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job
     * execution. If not specified, the statusDetails are unchanged. You can
     * specify at most 10 name/value pairs.
     * </p>
     * <p>
     * The method adds a new key-value pair into statusDetails parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into statusDetails.
     * @param value The corresponding value of the entry to be added into
     *            statusDetails.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJobExecutionRequest addstatusDetailsEntry(String key, String value) {
        if (null == this.statusDetails) {
            this.statusDetails = new java.util.HashMap<String, String>();
        }
        if (this.statusDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.statusDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into statusDetails.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CancelJobExecutionRequest clearstatusDetailsEntries() {
        this.statusDetails = null;
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
        if (getJobId() != null)
            sb.append("jobId: " + getJobId() + ",");
        if (getThingName() != null)
            sb.append("thingName: " + getThingName() + ",");
        if (getForce() != null)
            sb.append("force: " + getForce() + ",");
        if (getExpectedVersion() != null)
            sb.append("expectedVersion: " + getExpectedVersion() + ",");
        if (getStatusDetails() != null)
            sb.append("statusDetails: " + getStatusDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        hashCode = prime * hashCode
                + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        hashCode = prime * hashCode
                + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelJobExecutionRequest == false)
            return false;
        CancelJobExecutionRequest other = (CancelJobExecutionRequest) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null
                && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null
                && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        return true;
    }
}
