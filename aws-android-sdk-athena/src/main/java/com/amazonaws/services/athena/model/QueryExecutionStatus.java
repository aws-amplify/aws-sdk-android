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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * The completion date, current state, submission time, and state change reason
 * (if applicable) for the query execution.
 * </p>
 */
public class QueryExecutionStatus implements Serializable {
    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> indicates that the
     * query has been submitted to the service, and Athena will execute the
     * query as soon as resources are available. <code>RUNNING</code> indicates
     * that the query is in execution phase. <code>SUCCEEDED</code> indicates
     * that the query completed without errors. <code>FAILED</code> indicates
     * that the query experienced an error and did not complete processing.
     * <code>CANCELLED</code> indicates that a user input interrupted query
     * execution.
     * </p>
     * <note>
     * <p>
     * Athena automatically retries your queries in cases of certain transient
     * errors. As a result, you may see the query state transition from
     * <code>RUNNING</code> or <code>FAILED</code> to <code>QUEUED</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED
     */
    private String state;

    /**
     * <p>
     * Further detail about the status of the query.
     * </p>
     */
    private String stateChangeReason;

    /**
     * <p>
     * The date and time that the query was submitted.
     * </p>
     */
    private java.util.Date submissionDateTime;

    /**
     * <p>
     * The date and time that the query completed.
     * </p>
     */
    private java.util.Date completionDateTime;

    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> indicates that the
     * query has been submitted to the service, and Athena will execute the
     * query as soon as resources are available. <code>RUNNING</code> indicates
     * that the query is in execution phase. <code>SUCCEEDED</code> indicates
     * that the query completed without errors. <code>FAILED</code> indicates
     * that the query experienced an error and did not complete processing.
     * <code>CANCELLED</code> indicates that a user input interrupted query
     * execution.
     * </p>
     * <note>
     * <p>
     * Athena automatically retries your queries in cases of certain transient
     * errors. As a result, you may see the query state transition from
     * <code>RUNNING</code> or <code>FAILED</code> to <code>QUEUED</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED
     *
     * @return <p>
     *         The state of query execution. <code>QUEUED</code> indicates that
     *         the query has been submitted to the service, and Athena will
     *         execute the query as soon as resources are available.
     *         <code>RUNNING</code> indicates that the query is in execution
     *         phase. <code>SUCCEEDED</code> indicates that the query completed
     *         without errors. <code>FAILED</code> indicates that the query
     *         experienced an error and did not complete processing.
     *         <code>CANCELLED</code> indicates that a user input interrupted
     *         query execution.
     *         </p>
     *         <note>
     *         <p>
     *         Athena automatically retries your queries in cases of certain
     *         transient errors. As a result, you may see the query state
     *         transition from <code>RUNNING</code> or <code>FAILED</code> to
     *         <code>QUEUED</code>.
     *         </p>
     *         </note>
     * @see QueryExecutionState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> indicates that the
     * query has been submitted to the service, and Athena will execute the
     * query as soon as resources are available. <code>RUNNING</code> indicates
     * that the query is in execution phase. <code>SUCCEEDED</code> indicates
     * that the query completed without errors. <code>FAILED</code> indicates
     * that the query experienced an error and did not complete processing.
     * <code>CANCELLED</code> indicates that a user input interrupted query
     * execution.
     * </p>
     * <note>
     * <p>
     * Athena automatically retries your queries in cases of certain transient
     * errors. As a result, you may see the query state transition from
     * <code>RUNNING</code> or <code>FAILED</code> to <code>QUEUED</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED
     *
     * @param state <p>
     *            The state of query execution. <code>QUEUED</code> indicates
     *            that the query has been submitted to the service, and Athena
     *            will execute the query as soon as resources are available.
     *            <code>RUNNING</code> indicates that the query is in execution
     *            phase. <code>SUCCEEDED</code> indicates that the query
     *            completed without errors. <code>FAILED</code> indicates that
     *            the query experienced an error and did not complete
     *            processing. <code>CANCELLED</code> indicates that a user input
     *            interrupted query execution.
     *            </p>
     *            <note>
     *            <p>
     *            Athena automatically retries your queries in cases of certain
     *            transient errors. As a result, you may see the query state
     *            transition from <code>RUNNING</code> or <code>FAILED</code> to
     *            <code>QUEUED</code>.
     *            </p>
     *            </note>
     * @see QueryExecutionState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> indicates that the
     * query has been submitted to the service, and Athena will execute the
     * query as soon as resources are available. <code>RUNNING</code> indicates
     * that the query is in execution phase. <code>SUCCEEDED</code> indicates
     * that the query completed without errors. <code>FAILED</code> indicates
     * that the query experienced an error and did not complete processing.
     * <code>CANCELLED</code> indicates that a user input interrupted query
     * execution.
     * </p>
     * <note>
     * <p>
     * Athena automatically retries your queries in cases of certain transient
     * errors. As a result, you may see the query state transition from
     * <code>RUNNING</code> or <code>FAILED</code> to <code>QUEUED</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED
     *
     * @param state <p>
     *            The state of query execution. <code>QUEUED</code> indicates
     *            that the query has been submitted to the service, and Athena
     *            will execute the query as soon as resources are available.
     *            <code>RUNNING</code> indicates that the query is in execution
     *            phase. <code>SUCCEEDED</code> indicates that the query
     *            completed without errors. <code>FAILED</code> indicates that
     *            the query experienced an error and did not complete
     *            processing. <code>CANCELLED</code> indicates that a user input
     *            interrupted query execution.
     *            </p>
     *            <note>
     *            <p>
     *            Athena automatically retries your queries in cases of certain
     *            transient errors. As a result, you may see the query state
     *            transition from <code>RUNNING</code> or <code>FAILED</code> to
     *            <code>QUEUED</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryExecutionState
     */
    public QueryExecutionStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> indicates that the
     * query has been submitted to the service, and Athena will execute the
     * query as soon as resources are available. <code>RUNNING</code> indicates
     * that the query is in execution phase. <code>SUCCEEDED</code> indicates
     * that the query completed without errors. <code>FAILED</code> indicates
     * that the query experienced an error and did not complete processing.
     * <code>CANCELLED</code> indicates that a user input interrupted query
     * execution.
     * </p>
     * <note>
     * <p>
     * Athena automatically retries your queries in cases of certain transient
     * errors. As a result, you may see the query state transition from
     * <code>RUNNING</code> or <code>FAILED</code> to <code>QUEUED</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED
     *
     * @param state <p>
     *            The state of query execution. <code>QUEUED</code> indicates
     *            that the query has been submitted to the service, and Athena
     *            will execute the query as soon as resources are available.
     *            <code>RUNNING</code> indicates that the query is in execution
     *            phase. <code>SUCCEEDED</code> indicates that the query
     *            completed without errors. <code>FAILED</code> indicates that
     *            the query experienced an error and did not complete
     *            processing. <code>CANCELLED</code> indicates that a user input
     *            interrupted query execution.
     *            </p>
     *            <note>
     *            <p>
     *            Athena automatically retries your queries in cases of certain
     *            transient errors. As a result, you may see the query state
     *            transition from <code>RUNNING</code> or <code>FAILED</code> to
     *            <code>QUEUED</code>.
     *            </p>
     *            </note>
     * @see QueryExecutionState
     */
    public void setState(QueryExecutionState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of query execution. <code>QUEUED</code> indicates that the
     * query has been submitted to the service, and Athena will execute the
     * query as soon as resources are available. <code>RUNNING</code> indicates
     * that the query is in execution phase. <code>SUCCEEDED</code> indicates
     * that the query completed without errors. <code>FAILED</code> indicates
     * that the query experienced an error and did not complete processing.
     * <code>CANCELLED</code> indicates that a user input interrupted query
     * execution.
     * </p>
     * <note>
     * <p>
     * Athena automatically retries your queries in cases of certain transient
     * errors. As a result, you may see the query state transition from
     * <code>RUNNING</code> or <code>FAILED</code> to <code>QUEUED</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, RUNNING, SUCCEEDED, FAILED, CANCELLED
     *
     * @param state <p>
     *            The state of query execution. <code>QUEUED</code> indicates
     *            that the query has been submitted to the service, and Athena
     *            will execute the query as soon as resources are available.
     *            <code>RUNNING</code> indicates that the query is in execution
     *            phase. <code>SUCCEEDED</code> indicates that the query
     *            completed without errors. <code>FAILED</code> indicates that
     *            the query experienced an error and did not complete
     *            processing. <code>CANCELLED</code> indicates that a user input
     *            interrupted query execution.
     *            </p>
     *            <note>
     *            <p>
     *            Athena automatically retries your queries in cases of certain
     *            transient errors. As a result, you may see the query state
     *            transition from <code>RUNNING</code> or <code>FAILED</code> to
     *            <code>QUEUED</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueryExecutionState
     */
    public QueryExecutionStatus withState(QueryExecutionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Further detail about the status of the query.
     * </p>
     *
     * @return <p>
     *         Further detail about the status of the query.
     *         </p>
     */
    public String getStateChangeReason() {
        return stateChangeReason;
    }

    /**
     * <p>
     * Further detail about the status of the query.
     * </p>
     *
     * @param stateChangeReason <p>
     *            Further detail about the status of the query.
     *            </p>
     */
    public void setStateChangeReason(String stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * Further detail about the status of the query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateChangeReason <p>
     *            Further detail about the status of the query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecutionStatus withStateChangeReason(String stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
        return this;
    }

    /**
     * <p>
     * The date and time that the query was submitted.
     * </p>
     *
     * @return <p>
     *         The date and time that the query was submitted.
     *         </p>
     */
    public java.util.Date getSubmissionDateTime() {
        return submissionDateTime;
    }

    /**
     * <p>
     * The date and time that the query was submitted.
     * </p>
     *
     * @param submissionDateTime <p>
     *            The date and time that the query was submitted.
     *            </p>
     */
    public void setSubmissionDateTime(java.util.Date submissionDateTime) {
        this.submissionDateTime = submissionDateTime;
    }

    /**
     * <p>
     * The date and time that the query was submitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submissionDateTime <p>
     *            The date and time that the query was submitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecutionStatus withSubmissionDateTime(java.util.Date submissionDateTime) {
        this.submissionDateTime = submissionDateTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the query completed.
     * </p>
     *
     * @return <p>
     *         The date and time that the query completed.
     *         </p>
     */
    public java.util.Date getCompletionDateTime() {
        return completionDateTime;
    }

    /**
     * <p>
     * The date and time that the query completed.
     * </p>
     *
     * @param completionDateTime <p>
     *            The date and time that the query completed.
     *            </p>
     */
    public void setCompletionDateTime(java.util.Date completionDateTime) {
        this.completionDateTime = completionDateTime;
    }

    /**
     * <p>
     * The date and time that the query completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionDateTime <p>
     *            The date and time that the query completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecutionStatus withCompletionDateTime(java.util.Date completionDateTime) {
        this.completionDateTime = completionDateTime;
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
        if (getSubmissionDateTime() != null)
            sb.append("SubmissionDateTime: " + getSubmissionDateTime() + ",");
        if (getCompletionDateTime() != null)
            sb.append("CompletionDateTime: " + getCompletionDateTime());
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
                + ((getSubmissionDateTime() == null) ? 0 : getSubmissionDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionDateTime() == null) ? 0 : getCompletionDateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryExecutionStatus == false)
            return false;
        QueryExecutionStatus other = (QueryExecutionStatus) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null
                && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        if (other.getSubmissionDateTime() == null ^ this.getSubmissionDateTime() == null)
            return false;
        if (other.getSubmissionDateTime() != null
                && other.getSubmissionDateTime().equals(this.getSubmissionDateTime()) == false)
            return false;
        if (other.getCompletionDateTime() == null ^ this.getCompletionDateTime() == null)
            return false;
        if (other.getCompletionDateTime() != null
                && other.getCompletionDateTime().equals(this.getCompletionDateTime()) == false)
            return false;
        return true;
    }
}
