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
 * Describes the status of the cluster (job flow).
 * </p>
 */
public class JobFlowExecutionStatusDetail implements Serializable {
    /**
     * <p>
     * The state of the job flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * SHUTTING_DOWN, TERMINATED, COMPLETED, FAILED
     */
    private String state;

    /**
     * <p>
     * The creation date and time of the job flow.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The start date and time of the job flow.
     * </p>
     */
    private java.util.Date startDateTime;

    /**
     * <p>
     * The date and time when the job flow was ready to start running bootstrap
     * actions.
     * </p>
     */
    private java.util.Date readyDateTime;

    /**
     * <p>
     * The completion date and time of the job flow.
     * </p>
     */
    private java.util.Date endDateTime;

    /**
     * <p>
     * Description of the job flow last changed state.
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
     * The state of the job flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * SHUTTING_DOWN, TERMINATED, COMPLETED, FAILED
     *
     * @return <p>
     *         The state of the job flow.
     *         </p>
     * @see JobFlowExecutionState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the job flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * SHUTTING_DOWN, TERMINATED, COMPLETED, FAILED
     *
     * @param state <p>
     *            The state of the job flow.
     *            </p>
     * @see JobFlowExecutionState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * SHUTTING_DOWN, TERMINATED, COMPLETED, FAILED
     *
     * @param state <p>
     *            The state of the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobFlowExecutionState
     */
    public JobFlowExecutionStatusDetail withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the job flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * SHUTTING_DOWN, TERMINATED, COMPLETED, FAILED
     *
     * @param state <p>
     *            The state of the job flow.
     *            </p>
     * @see JobFlowExecutionState
     */
    public void setState(JobFlowExecutionState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTING, BOOTSTRAPPING, RUNNING, WAITING,
     * SHUTTING_DOWN, TERMINATED, COMPLETED, FAILED
     *
     * @param state <p>
     *            The state of the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobFlowExecutionState
     */
    public JobFlowExecutionStatusDetail withState(JobFlowExecutionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The creation date and time of the job flow.
     * </p>
     *
     * @return <p>
     *         The creation date and time of the job flow.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the job flow.
     * </p>
     *
     * @param creationDateTime <p>
     *            The creation date and time of the job flow.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time of the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The creation date and time of the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowExecutionStatusDetail withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The start date and time of the job flow.
     * </p>
     *
     * @return <p>
     *         The start date and time of the job flow.
     *         </p>
     */
    public java.util.Date getStartDateTime() {
        return startDateTime;
    }

    /**
     * <p>
     * The start date and time of the job flow.
     * </p>
     *
     * @param startDateTime <p>
     *            The start date and time of the job flow.
     *            </p>
     */
    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The start date and time of the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDateTime <p>
     *            The start date and time of the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowExecutionStatusDetail withStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * <p>
     * The date and time when the job flow was ready to start running bootstrap
     * actions.
     * </p>
     *
     * @return <p>
     *         The date and time when the job flow was ready to start running
     *         bootstrap actions.
     *         </p>
     */
    public java.util.Date getReadyDateTime() {
        return readyDateTime;
    }

    /**
     * <p>
     * The date and time when the job flow was ready to start running bootstrap
     * actions.
     * </p>
     *
     * @param readyDateTime <p>
     *            The date and time when the job flow was ready to start running
     *            bootstrap actions.
     *            </p>
     */
    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }

    /**
     * <p>
     * The date and time when the job flow was ready to start running bootstrap
     * actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readyDateTime <p>
     *            The date and time when the job flow was ready to start running
     *            bootstrap actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowExecutionStatusDetail withReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
        return this;
    }

    /**
     * <p>
     * The completion date and time of the job flow.
     * </p>
     *
     * @return <p>
     *         The completion date and time of the job flow.
     *         </p>
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }

    /**
     * <p>
     * The completion date and time of the job flow.
     * </p>
     *
     * @param endDateTime <p>
     *            The completion date and time of the job flow.
     *            </p>
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The completion date and time of the job flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDateTime <p>
     *            The completion date and time of the job flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowExecutionStatusDetail withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * <p>
     * Description of the job flow last changed state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Description of the job flow last changed state.
     *         </p>
     */
    public String getLastStateChangeReason() {
        return lastStateChangeReason;
    }

    /**
     * <p>
     * Description of the job flow last changed state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param lastStateChangeReason <p>
     *            Description of the job flow last changed state.
     *            </p>
     */
    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }

    /**
     * <p>
     * Description of the job flow last changed state.
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
     *            Description of the job flow last changed state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobFlowExecutionStatusDetail withLastStateChangeReason(String lastStateChangeReason) {
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
        if (getReadyDateTime() != null)
            sb.append("ReadyDateTime: " + getReadyDateTime() + ",");
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
                + ((getReadyDateTime() == null) ? 0 : getReadyDateTime().hashCode());
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

        if (obj instanceof JobFlowExecutionStatusDetail == false)
            return false;
        JobFlowExecutionStatusDetail other = (JobFlowExecutionStatusDetail) obj;

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
        if (other.getReadyDateTime() == null ^ this.getReadyDateTime() == null)
            return false;
        if (other.getReadyDateTime() != null
                && other.getReadyDateTime().equals(this.getReadyDateTime()) == false)
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
