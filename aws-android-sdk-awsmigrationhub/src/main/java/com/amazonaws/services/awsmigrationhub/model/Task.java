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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

/**
 * <p>
 * Task object encapsulating task information.
 * </p>
 */
public class Task implements Serializable {
    /**
     * <p>
     * Status of the task - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, COMPLETED
     */
    private String status;

    /**
     * <p>
     * Details of task status as notified by a migration tool. A tool might use
     * this field to provide clarifying information about the status that is
     * unique to that tool or that explains an error state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     */
    private String statusDetail;

    /**
     * <p>
     * Indication of the percentage completion of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer progressPercent;

    /**
     * <p>
     * Status of the task - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         Status of the task - Not Started, In-Progress, Complete.
     *         </p>
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status of the task - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Status of the task - Not Started, In-Progress, Complete.
     *            </p>
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the task - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Status of the task - Not Started, In-Progress, Complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public Task withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Status of the task - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Status of the task - Not Started, In-Progress, Complete.
     *            </p>
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Status of the task - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Status of the task - Not Started, In-Progress, Complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public Task withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Details of task status as notified by a migration tool. A tool might use
     * this field to provide clarifying information about the status that is
     * unique to that tool or that explains an error state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     *
     * @return <p>
     *         Details of task status as notified by a migration tool. A tool
     *         might use this field to provide clarifying information about the
     *         status that is unique to that tool or that explains an error
     *         state.
     *         </p>
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    /**
     * <p>
     * Details of task status as notified by a migration tool. A tool might use
     * this field to provide clarifying information about the status that is
     * unique to that tool or that explains an error state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     *
     * @param statusDetail <p>
     *            Details of task status as notified by a migration tool. A tool
     *            might use this field to provide clarifying information about
     *            the status that is unique to that tool or that explains an
     *            error state.
     *            </p>
     */
    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    /**
     * <p>
     * Details of task status as notified by a migration tool. A tool might use
     * this field to provide clarifying information about the status that is
     * unique to that tool or that explains an error state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>^.{0,500}$<br/>
     *
     * @param statusDetail <p>
     *            Details of task status as notified by a migration tool. A tool
     *            might use this field to provide clarifying information about
     *            the status that is unique to that tool or that explains an
     *            error state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    /**
     * <p>
     * Indication of the percentage completion of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         Indication of the percentage completion of the task.
     *         </p>
     */
    public Integer getProgressPercent() {
        return progressPercent;
    }

    /**
     * <p>
     * Indication of the percentage completion of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param progressPercent <p>
     *            Indication of the percentage completion of the task.
     *            </p>
     */
    public void setProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
    }

    /**
     * <p>
     * Indication of the percentage completion of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param progressPercent <p>
     *            Indication of the percentage completion of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Task withProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusDetail() != null)
            sb.append("StatusDetail: " + getStatusDetail() + ",");
        if (getProgressPercent() != null)
            sb.append("ProgressPercent: " + getProgressPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusDetail() == null) ? 0 : getStatusDetail().hashCode());
        hashCode = prime * hashCode
                + ((getProgressPercent() == null) ? 0 : getProgressPercent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Task == false)
            return false;
        Task other = (Task) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetail() == null ^ this.getStatusDetail() == null)
            return false;
        if (other.getStatusDetail() != null
                && other.getStatusDetail().equals(this.getStatusDetail()) == false)
            return false;
        if (other.getProgressPercent() == null ^ this.getProgressPercent() == null)
            return false;
        if (other.getProgressPercent() != null
                && other.getProgressPercent().equals(this.getProgressPercent()) == false)
            return false;
        return true;
    }
}
