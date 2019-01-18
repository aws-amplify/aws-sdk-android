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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class StopEntitiesDetectionJobResult implements Serializable {
    /**
     * <p>
     * The identifier of the entities detection job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobId;

    /**
     * <p>
     * Either <code>STOP_REQUESTED</code> if the job is currently running, or
     * <code>STOPPED</code> if the job was previously stopped with the
     * <code>StopEntitiesDetectionJob</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     */
    private String jobStatus;

    /**
     * <p>
     * The identifier of the entities detection job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The identifier of the entities detection job to stop.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The identifier of the entities detection job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobId <p>
     *            The identifier of the entities detection job to stop.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier of the entities detection job to stop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobId <p>
     *            The identifier of the entities detection job to stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopEntitiesDetectionJobResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * Either <code>STOP_REQUESTED</code> if the job is currently running, or
     * <code>STOPPED</code> if the job was previously stopped with the
     * <code>StopEntitiesDetectionJob</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @return <p>
     *         Either <code>STOP_REQUESTED</code> if the job is currently
     *         running, or <code>STOPPED</code> if the job was previously
     *         stopped with the <code>StopEntitiesDetectionJob</code> operation.
     *         </p>
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * Either <code>STOP_REQUESTED</code> if the job is currently running, or
     * <code>STOPPED</code> if the job was previously stopped with the
     * <code>StopEntitiesDetectionJob</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Either <code>STOP_REQUESTED</code> if the job is currently
     *            running, or <code>STOPPED</code> if the job was previously
     *            stopped with the <code>StopEntitiesDetectionJob</code>
     *            operation.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Either <code>STOP_REQUESTED</code> if the job is currently running, or
     * <code>STOPPED</code> if the job was previously stopped with the
     * <code>StopEntitiesDetectionJob</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Either <code>STOP_REQUESTED</code> if the job is currently
     *            running, or <code>STOPPED</code> if the job was previously
     *            stopped with the <code>StopEntitiesDetectionJob</code>
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public StopEntitiesDetectionJobResult withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * Either <code>STOP_REQUESTED</code> if the job is currently running, or
     * <code>STOPPED</code> if the job was previously stopped with the
     * <code>StopEntitiesDetectionJob</code> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Either <code>STOP_REQUESTED</code> if the job is currently
     *            running, or <code>STOPPED</code> if the job was previously
     *            stopped with the <code>StopEntitiesDetectionJob</code>
     *            operation.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * Either <code>STOP_REQUESTED</code> if the job is currently running, or
     * <code>STOPPED</code> if the job was previously stopped with the
     * <code>StopEntitiesDetectionJob</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            Either <code>STOP_REQUESTED</code> if the job is currently
     *            running, or <code>STOPPED</code> if the job was previously
     *            stopped with the <code>StopEntitiesDetectionJob</code>
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public StopEntitiesDetectionJobResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
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
            sb.append("JobId: " + getJobId() + ",");
        if (getJobStatus() != null)
            sb.append("JobStatus: " + getJobStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopEntitiesDetectionJobResult == false)
            return false;
        StopEntitiesDetectionJobResult other = (StopEntitiesDetectionJobResult) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        return true;
    }
}
