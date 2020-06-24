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
 * The execution state of a step.
 * </p>
 */
public class StepExecutionStatusDetail implements Serializable {
    /**
     * <p>
     * The state of the step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED,
     * FAILED, INTERRUPTED
     */
    private String state;

    /**
     * <p>
     * The creation date and time of the step.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The start date and time of the step.
     * </p>
     */
    private java.util.Date startDateTime;

    /**
     * <p>
     * The completion date and time of the step.
     * </p>
     */
    private java.util.Date endDateTime;

    /**
     * <p>
     * A description of the step's current state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String lastStateChangeReason;

    /**
     * <p>
     * The state of the step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED,
     * FAILED, INTERRUPTED
     *
     * @return <p>
     *         The state of the step.
     *         </p>
     * @see StepExecutionState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED,
     * FAILED, INTERRUPTED
     *
     * @param state <p>
     *            The state of the step.
     *            </p>
     * @see StepExecutionState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED,
     * FAILED, INTERRUPTED
     *
     * @param state <p>
     *            The state of the step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StepExecutionState
     */
    public StepExecutionStatusDetail withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED,
     * FAILED, INTERRUPTED
     *
     * @param state <p>
     *            The state of the step.
     *            </p>
     * @see StepExecutionState
     */
    public void setState(StepExecutionState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED,
     * FAILED, INTERRUPTED
     *
     * @param state <p>
     *            The state of the step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StepExecutionState
     */
    public StepExecutionStatusDetail withState(StepExecutionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The creation date and time of the step.
     * </p>
     *
     * @return <p>
     *         The creation date and time of the step.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the step.
     * </p>
     *
     * @param creationDateTime <p>
     *            The creation date and time of the step.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The creation date and time of the step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecutionStatusDetail withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The start date and time of the step.
     * </p>
     *
     * @return <p>
     *         The start date and time of the step.
     *         </p>
     */
    public java.util.Date getStartDateTime() {
        return startDateTime;
    }

    /**
     * <p>
     * The start date and time of the step.
     * </p>
     *
     * @param startDateTime <p>
     *            The start date and time of the step.
     *            </p>
     */
    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The start date and time of the step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDateTime <p>
     *            The start date and time of the step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecutionStatusDetail withStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * <p>
     * The completion date and time of the step.
     * </p>
     *
     * @return <p>
     *         The completion date and time of the step.
     *         </p>
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }

    /**
     * <p>
     * The completion date and time of the step.
     * </p>
     *
     * @param endDateTime <p>
     *            The completion date and time of the step.
     *            </p>
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The completion date and time of the step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDateTime <p>
     *            The completion date and time of the step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecutionStatusDetail withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * <p>
     * A description of the step's current state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A description of the step's current state.
     *         </p>
     */
    public String getLastStateChangeReason() {
        return lastStateChangeReason;
    }

    /**
     * <p>
     * A description of the step's current state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param lastStateChangeReason <p>
     *            A description of the step's current state.
     *            </p>
     */
    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }

    /**
     * <p>
     * A description of the step's current state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param lastStateChangeReason <p>
     *            A description of the step's current state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepExecutionStatusDetail withLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
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
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getStartDateTime() != null)
            sb.append("StartDateTime: " + getStartDateTime() + ",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: " + getEndDateTime() + ",");
        if (getLastStateChangeReason() != null)
            sb.append("LastStateChangeReason: " + getLastStateChangeReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastStateChangeReason() == null) ? 0 : getLastStateChangeReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepExecutionStatusDetail == false)
            return false;
        StepExecutionStatusDetail other = (StepExecutionStatusDetail) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null
                && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null
                && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        if (other.getLastStateChangeReason() == null ^ this.getLastStateChangeReason() == null)
            return false;
        if (other.getLastStateChangeReason() != null
                && other.getLastStateChangeReason().equals(this.getLastStateChangeReason()) == false)
            return false;
        return true;
    }
}
