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
 * Deletes a job execution.
 * </p>
 */
public class DeleteJobExecutionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the job whose execution on a particular device will be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobId;

    /**
     * <p>
     * The name of the thing whose job execution will be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The ID of the job execution to be deleted. The
     * <code>executionNumber</code> refers to the execution of a particular job
     * on a particular device.
     * </p>
     * <p>
     * Note that once a job execution is deleted, the
     * <code>executionNumber</code> may be reused by IoT, so be sure you get and
     * use the correct value here.
     * </p>
     */
    private Long executionNumber;

    /**
     * <p>
     * (Optional) When true, you can delete a job execution which is
     * "IN_PROGRESS". Otherwise, you can only delete a job execution which is in
     * a terminal state ("SUCCEEDED", "FAILED", "REJECTED", "REMOVED" or
     * "CANCELED") or an exception will occur. The default is false.
     * </p>
     * <note>
     * <p>
     * Deleting a job execution which is "IN_PROGRESS", will cause the device to
     * be unable to access job information or update the job execution status.
     * Use caution and ensure that the device is able to recover to a valid
     * state.
     * </p>
     * </note>
     */
    private Boolean force;

    /**
     * <p>
     * The ID of the job whose execution on a particular device will be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The ID of the job whose execution on a particular device will be
     *         deleted.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The ID of the job whose execution on a particular device will be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            The ID of the job whose execution on a particular device will
     *            be deleted.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job whose execution on a particular device will be deleted.
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
     *            The ID of the job whose execution on a particular device will
     *            be deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteJobExecutionRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The name of the thing whose job execution will be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing whose job execution will be deleted.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing whose job execution will be deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing whose job execution will be deleted.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing whose job execution will be deleted.
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
     *            The name of the thing whose job execution will be deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteJobExecutionRequest withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The ID of the job execution to be deleted. The
     * <code>executionNumber</code> refers to the execution of a particular job
     * on a particular device.
     * </p>
     * <p>
     * Note that once a job execution is deleted, the
     * <code>executionNumber</code> may be reused by IoT, so be sure you get and
     * use the correct value here.
     * </p>
     *
     * @return <p>
     *         The ID of the job execution to be deleted. The
     *         <code>executionNumber</code> refers to the execution of a
     *         particular job on a particular device.
     *         </p>
     *         <p>
     *         Note that once a job execution is deleted, the
     *         <code>executionNumber</code> may be reused by IoT, so be sure you
     *         get and use the correct value here.
     *         </p>
     */
    public Long getExecutionNumber() {
        return executionNumber;
    }

    /**
     * <p>
     * The ID of the job execution to be deleted. The
     * <code>executionNumber</code> refers to the execution of a particular job
     * on a particular device.
     * </p>
     * <p>
     * Note that once a job execution is deleted, the
     * <code>executionNumber</code> may be reused by IoT, so be sure you get and
     * use the correct value here.
     * </p>
     *
     * @param executionNumber <p>
     *            The ID of the job execution to be deleted. The
     *            <code>executionNumber</code> refers to the execution of a
     *            particular job on a particular device.
     *            </p>
     *            <p>
     *            Note that once a job execution is deleted, the
     *            <code>executionNumber</code> may be reused by IoT, so be sure
     *            you get and use the correct value here.
     *            </p>
     */
    public void setExecutionNumber(Long executionNumber) {
        this.executionNumber = executionNumber;
    }

    /**
     * <p>
     * The ID of the job execution to be deleted. The
     * <code>executionNumber</code> refers to the execution of a particular job
     * on a particular device.
     * </p>
     * <p>
     * Note that once a job execution is deleted, the
     * <code>executionNumber</code> may be reused by IoT, so be sure you get and
     * use the correct value here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionNumber <p>
     *            The ID of the job execution to be deleted. The
     *            <code>executionNumber</code> refers to the execution of a
     *            particular job on a particular device.
     *            </p>
     *            <p>
     *            Note that once a job execution is deleted, the
     *            <code>executionNumber</code> may be reused by IoT, so be sure
     *            you get and use the correct value here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteJobExecutionRequest withExecutionNumber(Long executionNumber) {
        this.executionNumber = executionNumber;
        return this;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job execution which is
     * "IN_PROGRESS". Otherwise, you can only delete a job execution which is in
     * a terminal state ("SUCCEEDED", "FAILED", "REJECTED", "REMOVED" or
     * "CANCELED") or an exception will occur. The default is false.
     * </p>
     * <note>
     * <p>
     * Deleting a job execution which is "IN_PROGRESS", will cause the device to
     * be unable to access job information or update the job execution status.
     * Use caution and ensure that the device is able to recover to a valid
     * state.
     * </p>
     * </note>
     *
     * @return <p>
     *         (Optional) When true, you can delete a job execution which is
     *         "IN_PROGRESS". Otherwise, you can only delete a job execution
     *         which is in a terminal state ("SUCCEEDED", "FAILED", "REJECTED",
     *         "REMOVED" or "CANCELED") or an exception will occur. The default
     *         is false.
     *         </p>
     *         <note>
     *         <p>
     *         Deleting a job execution which is "IN_PROGRESS", will cause the
     *         device to be unable to access job information or update the job
     *         execution status. Use caution and ensure that the device is able
     *         to recover to a valid state.
     *         </p>
     *         </note>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job execution which is
     * "IN_PROGRESS". Otherwise, you can only delete a job execution which is in
     * a terminal state ("SUCCEEDED", "FAILED", "REJECTED", "REMOVED" or
     * "CANCELED") or an exception will occur. The default is false.
     * </p>
     * <note>
     * <p>
     * Deleting a job execution which is "IN_PROGRESS", will cause the device to
     * be unable to access job information or update the job execution status.
     * Use caution and ensure that the device is able to recover to a valid
     * state.
     * </p>
     * </note>
     *
     * @return <p>
     *         (Optional) When true, you can delete a job execution which is
     *         "IN_PROGRESS". Otherwise, you can only delete a job execution
     *         which is in a terminal state ("SUCCEEDED", "FAILED", "REJECTED",
     *         "REMOVED" or "CANCELED") or an exception will occur. The default
     *         is false.
     *         </p>
     *         <note>
     *         <p>
     *         Deleting a job execution which is "IN_PROGRESS", will cause the
     *         device to be unable to access job information or update the job
     *         execution status. Use caution and ensure that the device is able
     *         to recover to a valid state.
     *         </p>
     *         </note>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job execution which is
     * "IN_PROGRESS". Otherwise, you can only delete a job execution which is in
     * a terminal state ("SUCCEEDED", "FAILED", "REJECTED", "REMOVED" or
     * "CANCELED") or an exception will occur. The default is false.
     * </p>
     * <note>
     * <p>
     * Deleting a job execution which is "IN_PROGRESS", will cause the device to
     * be unable to access job information or update the job execution status.
     * Use caution and ensure that the device is able to recover to a valid
     * state.
     * </p>
     * </note>
     *
     * @param force <p>
     *            (Optional) When true, you can delete a job execution which is
     *            "IN_PROGRESS". Otherwise, you can only delete a job execution
     *            which is in a terminal state ("SUCCEEDED", "FAILED",
     *            "REJECTED", "REMOVED" or "CANCELED") or an exception will
     *            occur. The default is false.
     *            </p>
     *            <note>
     *            <p>
     *            Deleting a job execution which is "IN_PROGRESS", will cause
     *            the device to be unable to access job information or update
     *            the job execution status. Use caution and ensure that the
     *            device is able to recover to a valid state.
     *            </p>
     *            </note>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job execution which is
     * "IN_PROGRESS". Otherwise, you can only delete a job execution which is in
     * a terminal state ("SUCCEEDED", "FAILED", "REJECTED", "REMOVED" or
     * "CANCELED") or an exception will occur. The default is false.
     * </p>
     * <note>
     * <p>
     * Deleting a job execution which is "IN_PROGRESS", will cause the device to
     * be unable to access job information or update the job execution status.
     * Use caution and ensure that the device is able to recover to a valid
     * state.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            (Optional) When true, you can delete a job execution which is
     *            "IN_PROGRESS". Otherwise, you can only delete a job execution
     *            which is in a terminal state ("SUCCEEDED", "FAILED",
     *            "REJECTED", "REMOVED" or "CANCELED") or an exception will
     *            occur. The default is false.
     *            </p>
     *            <note>
     *            <p>
     *            Deleting a job execution which is "IN_PROGRESS", will cause
     *            the device to be unable to access job information or update
     *            the job execution status. Use caution and ensure that the
     *            device is able to recover to a valid state.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteJobExecutionRequest withForce(Boolean force) {
        this.force = force;
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
        if (getExecutionNumber() != null)
            sb.append("executionNumber: " + getExecutionNumber() + ",");
        if (getForce() != null)
            sb.append("force: " + getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionNumber() == null) ? 0 : getExecutionNumber().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteJobExecutionRequest == false)
            return false;
        DeleteJobExecutionRequest other = (DeleteJobExecutionRequest) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getExecutionNumber() == null ^ this.getExecutionNumber() == null)
            return false;
        if (other.getExecutionNumber() != null
                && other.getExecutionNumber().equals(this.getExecutionNumber()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }
}
