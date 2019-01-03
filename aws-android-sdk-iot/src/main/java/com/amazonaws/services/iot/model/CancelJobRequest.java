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
 * Cancels a job.
 * </p>
 */
public class CancelJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String jobId;

    /**
     * <p>
     * (Optional)A reason code string that explains why the job was canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Upper}\p{Digit}_]+<br/>
     */
    private String reasonCode;

    /**
     * <p>
     * An optional comment string describing why the job was canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String comment;

    /**
     * <p>
     * (Optional) If <code>true</code> job executions with status "IN_PROGRESS"
     * and "QUEUED" are canceled, otherwise only job executions with status
     * "QUEUED" are canceled. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job which is "IN_PROGRESS", will cause a device which is
     * executing the job to be unable to update the job execution status. Use
     * caution and ensure that each device executing a job which is canceled is
     * able to recover to a valid state.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The unique identifier you assigned to this job when it was
     *         created.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param jobId <p>
     *            The unique identifier you assigned to this job when it was
     *            created.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
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
     *            The unique identifier you assigned to this job when it was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * (Optional)A reason code string that explains why the job was canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Upper}\p{Digit}_]+<br/>
     *
     * @return <p>
     *         (Optional)A reason code string that explains why the job was
     *         canceled.
     *         </p>
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * <p>
     * (Optional)A reason code string that explains why the job was canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Upper}\p{Digit}_]+<br/>
     *
     * @param reasonCode <p>
     *            (Optional)A reason code string that explains why the job was
     *            canceled.
     *            </p>
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * <p>
     * (Optional)A reason code string that explains why the job was canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Upper}\p{Digit}_]+<br/>
     *
     * @param reasonCode <p>
     *            (Optional)A reason code string that explains why the job was
     *            canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJobRequest withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    /**
     * <p>
     * An optional comment string describing why the job was canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         An optional comment string describing why the job was canceled.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * An optional comment string describing why the job was canceled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param comment <p>
     *            An optional comment string describing why the job was
     *            canceled.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment string describing why the job was canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param comment <p>
     *            An optional comment string describing why the job was
     *            canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJobRequest withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> job executions with status "IN_PROGRESS"
     * and "QUEUED" are canceled, otherwise only job executions with status
     * "QUEUED" are canceled. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job which is "IN_PROGRESS", will cause a device which is
     * executing the job to be unable to update the job execution status. Use
     * caution and ensure that each device executing a job which is canceled is
     * able to recover to a valid state.
     * </p>
     *
     * @return <p>
     *         (Optional) If <code>true</code> job executions with status
     *         "IN_PROGRESS" and "QUEUED" are canceled, otherwise only job
     *         executions with status "QUEUED" are canceled. The default is
     *         <code>false</code>.
     *         </p>
     *         <p>
     *         Canceling a job which is "IN_PROGRESS", will cause a device which
     *         is executing the job to be unable to update the job execution
     *         status. Use caution and ensure that each device executing a job
     *         which is canceled is able to recover to a valid state.
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> job executions with status "IN_PROGRESS"
     * and "QUEUED" are canceled, otherwise only job executions with status
     * "QUEUED" are canceled. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job which is "IN_PROGRESS", will cause a device which is
     * executing the job to be unable to update the job execution status. Use
     * caution and ensure that each device executing a job which is canceled is
     * able to recover to a valid state.
     * </p>
     *
     * @return <p>
     *         (Optional) If <code>true</code> job executions with status
     *         "IN_PROGRESS" and "QUEUED" are canceled, otherwise only job
     *         executions with status "QUEUED" are canceled. The default is
     *         <code>false</code>.
     *         </p>
     *         <p>
     *         Canceling a job which is "IN_PROGRESS", will cause a device which
     *         is executing the job to be unable to update the job execution
     *         status. Use caution and ensure that each device executing a job
     *         which is canceled is able to recover to a valid state.
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> job executions with status "IN_PROGRESS"
     * and "QUEUED" are canceled, otherwise only job executions with status
     * "QUEUED" are canceled. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job which is "IN_PROGRESS", will cause a device which is
     * executing the job to be unable to update the job execution status. Use
     * caution and ensure that each device executing a job which is canceled is
     * able to recover to a valid state.
     * </p>
     *
     * @param force <p>
     *            (Optional) If <code>true</code> job executions with status
     *            "IN_PROGRESS" and "QUEUED" are canceled, otherwise only job
     *            executions with status "QUEUED" are canceled. The default is
     *            <code>false</code>.
     *            </p>
     *            <p>
     *            Canceling a job which is "IN_PROGRESS", will cause a device
     *            which is executing the job to be unable to update the job
     *            execution status. Use caution and ensure that each device
     *            executing a job which is canceled is able to recover to a
     *            valid state.
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * (Optional) If <code>true</code> job executions with status "IN_PROGRESS"
     * and "QUEUED" are canceled, otherwise only job executions with status
     * "QUEUED" are canceled. The default is <code>false</code>.
     * </p>
     * <p>
     * Canceling a job which is "IN_PROGRESS", will cause a device which is
     * executing the job to be unable to update the job execution status. Use
     * caution and ensure that each device executing a job which is canceled is
     * able to recover to a valid state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            (Optional) If <code>true</code> job executions with status
     *            "IN_PROGRESS" and "QUEUED" are canceled, otherwise only job
     *            executions with status "QUEUED" are canceled. The default is
     *            <code>false</code>.
     *            </p>
     *            <p>
     *            Canceling a job which is "IN_PROGRESS", will cause a device
     *            which is executing the job to be unable to update the job
     *            execution status. Use caution and ensure that each device
     *            executing a job which is canceled is able to recover to a
     *            valid state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelJobRequest withForce(Boolean force) {
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
        if (getReasonCode() != null)
            sb.append("reasonCode: " + getReasonCode() + ",");
        if (getComment() != null)
            sb.append("comment: " + getComment() + ",");
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
        hashCode = prime * hashCode + ((getReasonCode() == null) ? 0 : getReasonCode().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelJobRequest == false)
            return false;
        CancelJobRequest other = (CancelJobRequest) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getReasonCode() == null ^ this.getReasonCode() == null)
            return false;
        if (other.getReasonCode() != null
                && other.getReasonCode().equals(this.getReasonCode()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }
}
