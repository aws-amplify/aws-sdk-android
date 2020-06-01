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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Specification of the status of a CancelSteps request. Available only in
 * Amazon EMR version 4.8.0 and later, excluding version 5.0.0.
 * </p>
 */
public class CancelStepsInfo implements Serializable {
    /**
     * <p>
     * The encrypted StepId of a step.
     * </p>
     */
    private String stepId;

    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or
     * FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, FAILED
     */
    private String status;

    /**
     * <p>
     * The reason for the failure if the CancelSteps request fails.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The encrypted StepId of a step.
     * </p>
     *
     * @return <p>
     *         The encrypted StepId of a step.
     *         </p>
     */
    public String getStepId() {
        return stepId;
    }

    /**
     * <p>
     * The encrypted StepId of a step.
     * </p>
     *
     * @param stepId <p>
     *            The encrypted StepId of a step.
     *            </p>
     */
    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The encrypted StepId of a step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepId <p>
     *            The encrypted StepId of a step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelStepsInfo withStepId(String stepId) {
        this.stepId = stepId;
        return this;
    }

    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or
     * FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, FAILED
     *
     * @return <p>
     *         The status of a CancelSteps Request. The value may be SUBMITTED
     *         or FAILED.
     *         </p>
     * @see CancelStepsRequestStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or
     * FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, FAILED
     *
     * @param status <p>
     *            The status of a CancelSteps Request. The value may be
     *            SUBMITTED or FAILED.
     *            </p>
     * @see CancelStepsRequestStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or
     * FAILED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, FAILED
     *
     * @param status <p>
     *            The status of a CancelSteps Request. The value may be
     *            SUBMITTED or FAILED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CancelStepsRequestStatus
     */
    public CancelStepsInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or
     * FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, FAILED
     *
     * @param status <p>
     *            The status of a CancelSteps Request. The value may be
     *            SUBMITTED or FAILED.
     *            </p>
     * @see CancelStepsRequestStatus
     */
    public void setStatus(CancelStepsRequestStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of a CancelSteps Request. The value may be SUBMITTED or
     * FAILED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, FAILED
     *
     * @param status <p>
     *            The status of a CancelSteps Request. The value may be
     *            SUBMITTED or FAILED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CancelStepsRequestStatus
     */
    public CancelStepsInfo withStatus(CancelStepsRequestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the failure if the CancelSteps request fails.
     * </p>
     *
     * @return <p>
     *         The reason for the failure if the CancelSteps request fails.
     *         </p>
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * The reason for the failure if the CancelSteps request fails.
     * </p>
     *
     * @param reason <p>
     *            The reason for the failure if the CancelSteps request fails.
     *            </p>
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the failure if the CancelSteps request fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reason <p>
     *            The reason for the failure if the CancelSteps request fails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelStepsInfo withReason(String reason) {
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
        if (getStepId() != null)
            sb.append("StepId: " + getStepId() + ",");
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

        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
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

        if (obj instanceof CancelStepsInfo == false)
            return false;
        CancelStepsInfo other = (CancelStepsInfo) obj;

        if (other.getStepId() == null ^ this.getStepId() == null)
            return false;
        if (other.getStepId() != null && other.getStepId().equals(this.getStepId()) == false)
            return false;
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
