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
 * The execution status details of the cluster step.
 * </p>
 */
public class StepStatus implements Serializable {
    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CANCEL_PENDING, RUNNING, COMPLETED,
     * CANCELLED, FAILED, INTERRUPTED
     */
    private String state;

    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     */
    private StepStateChangeReason stateChangeReason;

    /**
     * <p>
     * The details for the step failure including reason, message, and log file
     * path where the root cause was identified.
     * </p>
     */
    private FailureDetails failureDetails;

    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     */
    private StepTimeline timeline;

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CANCEL_PENDING, RUNNING, COMPLETED,
     * CANCELLED, FAILED, INTERRUPTED
     *
     * @return <p>
     *         The execution state of the cluster step.
     *         </p>
     * @see StepState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CANCEL_PENDING, RUNNING, COMPLETED,
     * CANCELLED, FAILED, INTERRUPTED
     *
     * @param state <p>
     *            The execution state of the cluster step.
     *            </p>
     * @see StepState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CANCEL_PENDING, RUNNING, COMPLETED,
     * CANCELLED, FAILED, INTERRUPTED
     *
     * @param state <p>
     *            The execution state of the cluster step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StepState
     */
    public StepStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CANCEL_PENDING, RUNNING, COMPLETED,
     * CANCELLED, FAILED, INTERRUPTED
     *
     * @param state <p>
     *            The execution state of the cluster step.
     *            </p>
     * @see StepState
     */
    public void setState(StepState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CANCEL_PENDING, RUNNING, COMPLETED,
     * CANCELLED, FAILED, INTERRUPTED
     *
     * @param state <p>
     *            The execution state of the cluster step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StepState
     */
    public StepStatus withState(StepState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     *
     * @return <p>
     *         The reason for the step execution status change.
     *         </p>
     */
    public StepStateChangeReason getStateChangeReason() {
        return stateChangeReason;
    }

    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     *
     * @param stateChangeReason <p>
     *            The reason for the step execution status change.
     *            </p>
     */
    public void setStateChangeReason(StepStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateChangeReason <p>
     *            The reason for the step execution status change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepStatus withStateChangeReason(StepStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
        return this;
    }

    /**
     * <p>
     * The details for the step failure including reason, message, and log file
     * path where the root cause was identified.
     * </p>
     *
     * @return <p>
     *         The details for the step failure including reason, message, and
     *         log file path where the root cause was identified.
     *         </p>
     */
    public FailureDetails getFailureDetails() {
        return failureDetails;
    }

    /**
     * <p>
     * The details for the step failure including reason, message, and log file
     * path where the root cause was identified.
     * </p>
     *
     * @param failureDetails <p>
     *            The details for the step failure including reason, message,
     *            and log file path where the root cause was identified.
     *            </p>
     */
    public void setFailureDetails(FailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * The details for the step failure including reason, message, and log file
     * path where the root cause was identified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureDetails <p>
     *            The details for the step failure including reason, message,
     *            and log file path where the root cause was identified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepStatus withFailureDetails(FailureDetails failureDetails) {
        this.failureDetails = failureDetails;
        return this;
    }

    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     *
     * @return <p>
     *         The timeline of the cluster step status over time.
     *         </p>
     */
    public StepTimeline getTimeline() {
        return timeline;
    }

    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     *
     * @param timeline <p>
     *            The timeline of the cluster step status over time.
     *            </p>
     */
    public void setTimeline(StepTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeline <p>
     *            The timeline of the cluster step status over time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepStatus withTimeline(StepTimeline timeline) {
        this.timeline = timeline;
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
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: " + getStateChangeReason() + ",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: " + getFailureDetails() + ",");
        if (getTimeline() != null)
            sb.append("Timeline: " + getTimeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        hashCode = prime * hashCode
                + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getTimeline() == null) ? 0 : getTimeline().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepStatus == false)
            return false;
        StepStatus other = (StepStatus) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null
                && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null
                && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        if (other.getTimeline() == null ^ this.getTimeline() == null)
            return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false)
            return false;
        return true;
    }
}
