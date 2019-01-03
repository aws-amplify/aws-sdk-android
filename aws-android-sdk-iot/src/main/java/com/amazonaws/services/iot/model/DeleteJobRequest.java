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
 * Deletes a job and its related job executions.
 * </p>
 * <p>
 * Deleting a job may take time, depending on the number of job executions
 * created for the job and various other factors. While the job is being
 * deleted, the status of the job will be shown as "DELETION_IN_PROGRESS".
 * Attempting to delete or cancel a job whose status is already
 * "DELETION_IN_PROGRESS" will result in an error.
 * </p>
 * <p>
 * Only 10 jobs may have status "DELETION_IN_PROGRESS" at the same time, or a
 * LimitExceededException will occur.
 * </p>
 */
public class DeleteJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the job to be deleted.
     * </p>
     * <p>
     * After a job deletion is completed, you may reuse this jobId when you
     * create a new job. However, this is not recommended, and you must ensure
     * that your devices are not using the jobId to refer to the deleted job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobId;

    /**
     * <p>
     * (Optional) When true, you can delete a job which is "IN_PROGRESS".
     * Otherwise, you can only delete a job which is in a terminal state
     * ("COMPLETED" or "CANCELED") or an exception will occur. The default is
     * false.
     * </p>
     * <note>
     * <p>
     * Deleting a job which is "IN_PROGRESS", will cause a device which is
     * executing the job to be unable to access job information or update the
     * job execution status. Use caution and ensure that each device executing a
     * job which is deleted is able to recover to a valid state.
     * </p>
     * </note>
     */
    private Boolean force;

    /**
     * <p>
     * The ID of the job to be deleted.
     * </p>
     * <p>
     * After a job deletion is completed, you may reuse this jobId when you
     * create a new job. However, this is not recommended, and you must ensure
     * that your devices are not using the jobId to refer to the deleted job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The ID of the job to be deleted.
     *         </p>
     *         <p>
     *         After a job deletion is completed, you may reuse this jobId when
     *         you create a new job. However, this is not recommended, and you
     *         must ensure that your devices are not using the jobId to refer to
     *         the deleted job.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The ID of the job to be deleted.
     * </p>
     * <p>
     * After a job deletion is completed, you may reuse this jobId when you
     * create a new job. However, this is not recommended, and you must ensure
     * that your devices are not using the jobId to refer to the deleted job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            The ID of the job to be deleted.
     *            </p>
     *            <p>
     *            After a job deletion is completed, you may reuse this jobId
     *            when you create a new job. However, this is not recommended,
     *            and you must ensure that your devices are not using the jobId
     *            to refer to the deleted job.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job to be deleted.
     * </p>
     * <p>
     * After a job deletion is completed, you may reuse this jobId when you
     * create a new job. However, this is not recommended, and you must ensure
     * that your devices are not using the jobId to refer to the deleted job.
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
     *            The ID of the job to be deleted.
     *            </p>
     *            <p>
     *            After a job deletion is completed, you may reuse this jobId
     *            when you create a new job. However, this is not recommended,
     *            and you must ensure that your devices are not using the jobId
     *            to refer to the deleted job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job which is "IN_PROGRESS".
     * Otherwise, you can only delete a job which is in a terminal state
     * ("COMPLETED" or "CANCELED") or an exception will occur. The default is
     * false.
     * </p>
     * <note>
     * <p>
     * Deleting a job which is "IN_PROGRESS", will cause a device which is
     * executing the job to be unable to access job information or update the
     * job execution status. Use caution and ensure that each device executing a
     * job which is deleted is able to recover to a valid state.
     * </p>
     * </note>
     *
     * @return <p>
     *         (Optional) When true, you can delete a job which is
     *         "IN_PROGRESS". Otherwise, you can only delete a job which is in a
     *         terminal state ("COMPLETED" or "CANCELED") or an exception will
     *         occur. The default is false.
     *         </p>
     *         <note>
     *         <p>
     *         Deleting a job which is "IN_PROGRESS", will cause a device which
     *         is executing the job to be unable to access job information or
     *         update the job execution status. Use caution and ensure that each
     *         device executing a job which is deleted is able to recover to a
     *         valid state.
     *         </p>
     *         </note>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job which is "IN_PROGRESS".
     * Otherwise, you can only delete a job which is in a terminal state
     * ("COMPLETED" or "CANCELED") or an exception will occur. The default is
     * false.
     * </p>
     * <note>
     * <p>
     * Deleting a job which is "IN_PROGRESS", will cause a device which is
     * executing the job to be unable to access job information or update the
     * job execution status. Use caution and ensure that each device executing a
     * job which is deleted is able to recover to a valid state.
     * </p>
     * </note>
     *
     * @return <p>
     *         (Optional) When true, you can delete a job which is
     *         "IN_PROGRESS". Otherwise, you can only delete a job which is in a
     *         terminal state ("COMPLETED" or "CANCELED") or an exception will
     *         occur. The default is false.
     *         </p>
     *         <note>
     *         <p>
     *         Deleting a job which is "IN_PROGRESS", will cause a device which
     *         is executing the job to be unable to access job information or
     *         update the job execution status. Use caution and ensure that each
     *         device executing a job which is deleted is able to recover to a
     *         valid state.
     *         </p>
     *         </note>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job which is "IN_PROGRESS".
     * Otherwise, you can only delete a job which is in a terminal state
     * ("COMPLETED" or "CANCELED") or an exception will occur. The default is
     * false.
     * </p>
     * <note>
     * <p>
     * Deleting a job which is "IN_PROGRESS", will cause a device which is
     * executing the job to be unable to access job information or update the
     * job execution status. Use caution and ensure that each device executing a
     * job which is deleted is able to recover to a valid state.
     * </p>
     * </note>
     *
     * @param force <p>
     *            (Optional) When true, you can delete a job which is
     *            "IN_PROGRESS". Otherwise, you can only delete a job which is
     *            in a terminal state ("COMPLETED" or "CANCELED") or an
     *            exception will occur. The default is false.
     *            </p>
     *            <note>
     *            <p>
     *            Deleting a job which is "IN_PROGRESS", will cause a device
     *            which is executing the job to be unable to access job
     *            information or update the job execution status. Use caution
     *            and ensure that each device executing a job which is deleted
     *            is able to recover to a valid state.
     *            </p>
     *            </note>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * (Optional) When true, you can delete a job which is "IN_PROGRESS".
     * Otherwise, you can only delete a job which is in a terminal state
     * ("COMPLETED" or "CANCELED") or an exception will occur. The default is
     * false.
     * </p>
     * <note>
     * <p>
     * Deleting a job which is "IN_PROGRESS", will cause a device which is
     * executing the job to be unable to access job information or update the
     * job execution status. Use caution and ensure that each device executing a
     * job which is deleted is able to recover to a valid state.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            (Optional) When true, you can delete a job which is
     *            "IN_PROGRESS". Otherwise, you can only delete a job which is
     *            in a terminal state ("COMPLETED" or "CANCELED") or an
     *            exception will occur. The default is false.
     *            </p>
     *            <note>
     *            <p>
     *            Deleting a job which is "IN_PROGRESS", will cause a device
     *            which is executing the job to be unable to access job
     *            information or update the job execution status. Use caution
     *            and ensure that each device executing a job which is deleted
     *            is able to recover to a valid state.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteJobRequest withForce(Boolean force) {
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
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteJobRequest == false)
            return false;
        DeleteJobRequest other = (DeleteJobRequest) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }
}
