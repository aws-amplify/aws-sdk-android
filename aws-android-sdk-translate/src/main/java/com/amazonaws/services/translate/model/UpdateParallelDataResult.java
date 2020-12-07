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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

public class UpdateParallelDataResult implements Serializable {
    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * The status of the parallel data resource that you are attempting to
     * update. Your update request is accepted only if this status is either
     * <code>ACTIVE</code> or <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     */
    private String status;

    /**
     * <p>
     * The status of the parallel data update attempt. When the updated parallel
     * data resource is ready for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     */
    private String latestUpdateAttemptStatus;

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     */
    private java.util.Date latestUpdateAttemptAt;

    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @return <p>
     *         The name of the parallel data resource being updated.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the parallel data resource being updated.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the parallel data resource being updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateParallelDataResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The status of the parallel data resource that you are attempting to
     * update. Your update request is accepted only if this status is either
     * <code>ACTIVE</code> or <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @return <p>
     *         The status of the parallel data resource that you are attempting
     *         to update. Your update request is accepted only if this status is
     *         either <code>ACTIVE</code> or <code>FAILED</code>.
     *         </p>
     * @see ParallelDataStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the parallel data resource that you are attempting to
     * update. Your update request is accepted only if this status is either
     * <code>ACTIVE</code> or <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data resource that you are
     *            attempting to update. Your update request is accepted only if
     *            this status is either <code>ACTIVE</code> or
     *            <code>FAILED</code>.
     *            </p>
     * @see ParallelDataStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the parallel data resource that you are attempting to
     * update. Your update request is accepted only if this status is either
     * <code>ACTIVE</code> or <code>FAILED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data resource that you are
     *            attempting to update. Your update request is accepted only if
     *            this status is either <code>ACTIVE</code> or
     *            <code>FAILED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataStatus
     */
    public UpdateParallelDataResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the parallel data resource that you are attempting to
     * update. Your update request is accepted only if this status is either
     * <code>ACTIVE</code> or <code>FAILED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data resource that you are
     *            attempting to update. Your update request is accepted only if
     *            this status is either <code>ACTIVE</code> or
     *            <code>FAILED</code>.
     *            </p>
     * @see ParallelDataStatus
     */
    public void setStatus(ParallelDataStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the parallel data resource that you are attempting to
     * update. Your update request is accepted only if this status is either
     * <code>ACTIVE</code> or <code>FAILED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the parallel data resource that you are
     *            attempting to update. Your update request is accepted only if
     *            this status is either <code>ACTIVE</code> or
     *            <code>FAILED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataStatus
     */
    public UpdateParallelDataResult withStatus(ParallelDataStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status of the parallel data update attempt. When the updated parallel
     * data resource is ready for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @return <p>
     *         The status of the parallel data update attempt. When the updated
     *         parallel data resource is ready for you to use, the status is
     *         <code>ACTIVE</code>.
     *         </p>
     * @see ParallelDataStatus
     */
    public String getLatestUpdateAttemptStatus() {
        return latestUpdateAttemptStatus;
    }

    /**
     * <p>
     * The status of the parallel data update attempt. When the updated parallel
     * data resource is ready for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param latestUpdateAttemptStatus <p>
     *            The status of the parallel data update attempt. When the
     *            updated parallel data resource is ready for you to use, the
     *            status is <code>ACTIVE</code>.
     *            </p>
     * @see ParallelDataStatus
     */
    public void setLatestUpdateAttemptStatus(String latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus;
    }

    /**
     * <p>
     * The status of the parallel data update attempt. When the updated parallel
     * data resource is ready for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param latestUpdateAttemptStatus <p>
     *            The status of the parallel data update attempt. When the
     *            updated parallel data resource is ready for you to use, the
     *            status is <code>ACTIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataStatus
     */
    public UpdateParallelDataResult withLatestUpdateAttemptStatus(String latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus;
        return this;
    }

    /**
     * <p>
     * The status of the parallel data update attempt. When the updated parallel
     * data resource is ready for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param latestUpdateAttemptStatus <p>
     *            The status of the parallel data update attempt. When the
     *            updated parallel data resource is ready for you to use, the
     *            status is <code>ACTIVE</code>.
     *            </p>
     * @see ParallelDataStatus
     */
    public void setLatestUpdateAttemptStatus(ParallelDataStatus latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus.toString();
    }

    /**
     * <p>
     * The status of the parallel data update attempt. When the updated parallel
     * data resource is ready for you to use, the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, ACTIVE, DELETING, FAILED
     *
     * @param latestUpdateAttemptStatus <p>
     *            The status of the parallel data update attempt. When the
     *            updated parallel data resource is ready for you to use, the
     *            status is <code>ACTIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataStatus
     */
    public UpdateParallelDataResult withLatestUpdateAttemptStatus(
            ParallelDataStatus latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     *
     * @return <p>
     *         The time that the most recent update was attempted.
     *         </p>
     */
    public java.util.Date getLatestUpdateAttemptAt() {
        return latestUpdateAttemptAt;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     *
     * @param latestUpdateAttemptAt <p>
     *            The time that the most recent update was attempted.
     *            </p>
     */
    public void setLatestUpdateAttemptAt(java.util.Date latestUpdateAttemptAt) {
        this.latestUpdateAttemptAt = latestUpdateAttemptAt;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestUpdateAttemptAt <p>
     *            The time that the most recent update was attempted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateParallelDataResult withLatestUpdateAttemptAt(java.util.Date latestUpdateAttemptAt) {
        this.latestUpdateAttemptAt = latestUpdateAttemptAt;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLatestUpdateAttemptStatus() != null)
            sb.append("LatestUpdateAttemptStatus: " + getLatestUpdateAttemptStatus() + ",");
        if (getLatestUpdateAttemptAt() != null)
            sb.append("LatestUpdateAttemptAt: " + getLatestUpdateAttemptAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getLatestUpdateAttemptStatus() == null) ? 0 : getLatestUpdateAttemptStatus()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLatestUpdateAttemptAt() == null) ? 0 : getLatestUpdateAttemptAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateParallelDataResult == false)
            return false;
        UpdateParallelDataResult other = (UpdateParallelDataResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLatestUpdateAttemptStatus() == null
                ^ this.getLatestUpdateAttemptStatus() == null)
            return false;
        if (other.getLatestUpdateAttemptStatus() != null
                && other.getLatestUpdateAttemptStatus().equals(this.getLatestUpdateAttemptStatus()) == false)
            return false;
        if (other.getLatestUpdateAttemptAt() == null ^ this.getLatestUpdateAttemptAt() == null)
            return false;
        if (other.getLatestUpdateAttemptAt() != null
                && other.getLatestUpdateAttemptAt().equals(this.getLatestUpdateAttemptAt()) == false)
            return false;
        return true;
    }
}
