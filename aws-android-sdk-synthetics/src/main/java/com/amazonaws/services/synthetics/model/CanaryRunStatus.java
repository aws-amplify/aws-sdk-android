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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

/**
 * <p>
 * This structure contains the status information about a canary run.
 * </p>
 */
public class CanaryRunStatus implements Serializable {
    /**
     * <p>
     * The current state of the run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PASSED, FAILED
     */
    private String state;

    /**
     * <p>
     * If run of the canary failed, this field contains the reason for the
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String stateReason;

    /**
     * <p>
     * If this value is <code>CANARY_FAILURE</code>, an exception occurred in
     * the canary code. If this value is <code>EXECUTION_FAILURE</code>, an
     * exception occurred in CloudWatch Synthetics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANARY_FAILURE, EXECUTION_FAILURE
     */
    private String stateReasonCode;

    /**
     * <p>
     * The current state of the run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PASSED, FAILED
     *
     * @return <p>
     *         The current state of the run.
     *         </p>
     * @see CanaryRunState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PASSED, FAILED
     *
     * @param state <p>
     *            The current state of the run.
     *            </p>
     * @see CanaryRunState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PASSED, FAILED
     *
     * @param state <p>
     *            The current state of the run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CanaryRunState
     */
    public CanaryRunStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PASSED, FAILED
     *
     * @param state <p>
     *            The current state of the run.
     *            </p>
     * @see CanaryRunState
     */
    public void setState(CanaryRunState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, PASSED, FAILED
     *
     * @param state <p>
     *            The current state of the run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CanaryRunState
     */
    public CanaryRunStatus withState(CanaryRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * If run of the canary failed, this field contains the reason for the
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         If run of the canary failed, this field contains the reason for
     *         the error.
     *         </p>
     */
    public String getStateReason() {
        return stateReason;
    }

    /**
     * <p>
     * If run of the canary failed, this field contains the reason for the
     * error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param stateReason <p>
     *            If run of the canary failed, this field contains the reason
     *            for the error.
     *            </p>
     */
    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * If run of the canary failed, this field contains the reason for the
     * error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param stateReason <p>
     *            If run of the canary failed, this field contains the reason
     *            for the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryRunStatus withStateReason(String stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * <p>
     * If this value is <code>CANARY_FAILURE</code>, an exception occurred in
     * the canary code. If this value is <code>EXECUTION_FAILURE</code>, an
     * exception occurred in CloudWatch Synthetics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANARY_FAILURE, EXECUTION_FAILURE
     *
     * @return <p>
     *         If this value is <code>CANARY_FAILURE</code>, an exception
     *         occurred in the canary code. If this value is
     *         <code>EXECUTION_FAILURE</code>, an exception occurred in
     *         CloudWatch Synthetics.
     *         </p>
     * @see CanaryRunStateReasonCode
     */
    public String getStateReasonCode() {
        return stateReasonCode;
    }

    /**
     * <p>
     * If this value is <code>CANARY_FAILURE</code>, an exception occurred in
     * the canary code. If this value is <code>EXECUTION_FAILURE</code>, an
     * exception occurred in CloudWatch Synthetics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANARY_FAILURE, EXECUTION_FAILURE
     *
     * @param stateReasonCode <p>
     *            If this value is <code>CANARY_FAILURE</code>, an exception
     *            occurred in the canary code. If this value is
     *            <code>EXECUTION_FAILURE</code>, an exception occurred in
     *            CloudWatch Synthetics.
     *            </p>
     * @see CanaryRunStateReasonCode
     */
    public void setStateReasonCode(String stateReasonCode) {
        this.stateReasonCode = stateReasonCode;
    }

    /**
     * <p>
     * If this value is <code>CANARY_FAILURE</code>, an exception occurred in
     * the canary code. If this value is <code>EXECUTION_FAILURE</code>, an
     * exception occurred in CloudWatch Synthetics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANARY_FAILURE, EXECUTION_FAILURE
     *
     * @param stateReasonCode <p>
     *            If this value is <code>CANARY_FAILURE</code>, an exception
     *            occurred in the canary code. If this value is
     *            <code>EXECUTION_FAILURE</code>, an exception occurred in
     *            CloudWatch Synthetics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CanaryRunStateReasonCode
     */
    public CanaryRunStatus withStateReasonCode(String stateReasonCode) {
        this.stateReasonCode = stateReasonCode;
        return this;
    }

    /**
     * <p>
     * If this value is <code>CANARY_FAILURE</code>, an exception occurred in
     * the canary code. If this value is <code>EXECUTION_FAILURE</code>, an
     * exception occurred in CloudWatch Synthetics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANARY_FAILURE, EXECUTION_FAILURE
     *
     * @param stateReasonCode <p>
     *            If this value is <code>CANARY_FAILURE</code>, an exception
     *            occurred in the canary code. If this value is
     *            <code>EXECUTION_FAILURE</code>, an exception occurred in
     *            CloudWatch Synthetics.
     *            </p>
     * @see CanaryRunStateReasonCode
     */
    public void setStateReasonCode(CanaryRunStateReasonCode stateReasonCode) {
        this.stateReasonCode = stateReasonCode.toString();
    }

    /**
     * <p>
     * If this value is <code>CANARY_FAILURE</code>, an exception occurred in
     * the canary code. If this value is <code>EXECUTION_FAILURE</code>, an
     * exception occurred in CloudWatch Synthetics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CANARY_FAILURE, EXECUTION_FAILURE
     *
     * @param stateReasonCode <p>
     *            If this value is <code>CANARY_FAILURE</code>, an exception
     *            occurred in the canary code. If this value is
     *            <code>EXECUTION_FAILURE</code>, an exception occurred in
     *            CloudWatch Synthetics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CanaryRunStateReasonCode
     */
    public CanaryRunStatus withStateReasonCode(CanaryRunStateReasonCode stateReasonCode) {
        this.stateReasonCode = stateReasonCode.toString();
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStateReason() != null)
            sb.append("StateReason: " + getStateReason() + ",");
        if (getStateReasonCode() != null)
            sb.append("StateReasonCode: " + getStateReasonCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode
                + ((getStateReasonCode() == null) ? 0 : getStateReasonCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryRunStatus == false)
            return false;
        CanaryRunStatus other = (CanaryRunStatus) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null
                && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getStateReasonCode() == null ^ this.getStateReasonCode() == null)
            return false;
        if (other.getStateReasonCode() != null
                && other.getStateReasonCode().equals(this.getStateReasonCode()) == false)
            return false;
        return true;
    }
}
