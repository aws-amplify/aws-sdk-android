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

public class GetServiceLinkedRoleDeletionStatusResult implements Serializable {
    /**
     * <p>
     * The status of the deletion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED
     */
    private String status;

    /**
     * <p>
     * An object that contains details about the reason the deletion failed.
     * </p>
     */
    private DeletionTaskFailureReasonType reason;

    /**
     * <p>
     * The status of the deletion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED
     *
     * @return <p>
     *         The status of the deletion.
     *         </p>
     * @see DeletionTaskStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the deletion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED
     *
     * @param status <p>
     *            The status of the deletion.
     *            </p>
     * @see DeletionTaskStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deletion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED
     *
     * @param status <p>
     *            The status of the deletion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeletionTaskStatusType
     */
    public GetServiceLinkedRoleDeletionStatusResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the deletion.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED
     *
     * @param status <p>
     *            The status of the deletion.
     *            </p>
     * @see DeletionTaskStatusType
     */
    public void setStatus(DeletionTaskStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the deletion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUCCEEDED, IN_PROGRESS, FAILED, NOT_STARTED
     *
     * @param status <p>
     *            The status of the deletion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeletionTaskStatusType
     */
    public GetServiceLinkedRoleDeletionStatusResult withStatus(DeletionTaskStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An object that contains details about the reason the deletion failed.
     * </p>
     *
     * @return <p>
     *         An object that contains details about the reason the deletion
     *         failed.
     *         </p>
     */
    public DeletionTaskFailureReasonType getReason() {
        return reason;
    }

    /**
     * <p>
     * An object that contains details about the reason the deletion failed.
     * </p>
     *
     * @param reason <p>
     *            An object that contains details about the reason the deletion
     *            failed.
     *            </p>
     */
    public void setReason(DeletionTaskFailureReasonType reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * An object that contains details about the reason the deletion failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reason <p>
     *            An object that contains details about the reason the deletion
     *            failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetServiceLinkedRoleDeletionStatusResult withReason(DeletionTaskFailureReasonType reason) {
        this.reason = reason;
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
        if (getReason() != null)
            sb.append("Reason: " + getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceLinkedRoleDeletionStatusResult == false)
            return false;
        GetServiceLinkedRoleDeletionStatusResult other = (GetServiceLinkedRoleDeletionStatusResult) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }
}
