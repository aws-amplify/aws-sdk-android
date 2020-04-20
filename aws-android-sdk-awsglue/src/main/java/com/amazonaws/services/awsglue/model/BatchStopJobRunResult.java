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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class BatchStopJobRunResult implements Serializable {
    /**
     * <p>
     * A list of the JobRuns that were successfully submitted for stopping.
     * </p>
     */
    private java.util.List<BatchStopJobRunSuccessfulSubmission> successfulSubmissions;

    /**
     * <p>
     * A list of the errors that were encountered in trying to stop
     * <code>JobRuns</code>, including the <code>JobRunId</code> for which each
     * error was encountered and details about the error.
     * </p>
     */
    private java.util.List<BatchStopJobRunError> errors;

    /**
     * <p>
     * A list of the JobRuns that were successfully submitted for stopping.
     * </p>
     *
     * @return <p>
     *         A list of the JobRuns that were successfully submitted for
     *         stopping.
     *         </p>
     */
    public java.util.List<BatchStopJobRunSuccessfulSubmission> getSuccessfulSubmissions() {
        return successfulSubmissions;
    }

    /**
     * <p>
     * A list of the JobRuns that were successfully submitted for stopping.
     * </p>
     *
     * @param successfulSubmissions <p>
     *            A list of the JobRuns that were successfully submitted for
     *            stopping.
     *            </p>
     */
    public void setSuccessfulSubmissions(
            java.util.Collection<BatchStopJobRunSuccessfulSubmission> successfulSubmissions) {
        if (successfulSubmissions == null) {
            this.successfulSubmissions = null;
            return;
        }

        this.successfulSubmissions = new java.util.ArrayList<BatchStopJobRunSuccessfulSubmission>(
                successfulSubmissions);
    }

    /**
     * <p>
     * A list of the JobRuns that were successfully submitted for stopping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulSubmissions <p>
     *            A list of the JobRuns that were successfully submitted for
     *            stopping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchStopJobRunResult withSuccessfulSubmissions(
            BatchStopJobRunSuccessfulSubmission... successfulSubmissions) {
        if (getSuccessfulSubmissions() == null) {
            this.successfulSubmissions = new java.util.ArrayList<BatchStopJobRunSuccessfulSubmission>(
                    successfulSubmissions.length);
        }
        for (BatchStopJobRunSuccessfulSubmission value : successfulSubmissions) {
            this.successfulSubmissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the JobRuns that were successfully submitted for stopping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulSubmissions <p>
     *            A list of the JobRuns that were successfully submitted for
     *            stopping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchStopJobRunResult withSuccessfulSubmissions(
            java.util.Collection<BatchStopJobRunSuccessfulSubmission> successfulSubmissions) {
        setSuccessfulSubmissions(successfulSubmissions);
        return this;
    }

    /**
     * <p>
     * A list of the errors that were encountered in trying to stop
     * <code>JobRuns</code>, including the <code>JobRunId</code> for which each
     * error was encountered and details about the error.
     * </p>
     *
     * @return <p>
     *         A list of the errors that were encountered in trying to stop
     *         <code>JobRuns</code>, including the <code>JobRunId</code> for
     *         which each error was encountered and details about the error.
     *         </p>
     */
    public java.util.List<BatchStopJobRunError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of the errors that were encountered in trying to stop
     * <code>JobRuns</code>, including the <code>JobRunId</code> for which each
     * error was encountered and details about the error.
     * </p>
     *
     * @param errors <p>
     *            A list of the errors that were encountered in trying to stop
     *            <code>JobRuns</code>, including the <code>JobRunId</code> for
     *            which each error was encountered and details about the error.
     *            </p>
     */
    public void setErrors(java.util.Collection<BatchStopJobRunError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchStopJobRunError>(errors);
    }

    /**
     * <p>
     * A list of the errors that were encountered in trying to stop
     * <code>JobRuns</code>, including the <code>JobRunId</code> for which each
     * error was encountered and details about the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of the errors that were encountered in trying to stop
     *            <code>JobRuns</code>, including the <code>JobRunId</code> for
     *            which each error was encountered and details about the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchStopJobRunResult withErrors(BatchStopJobRunError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchStopJobRunError>(errors.length);
        }
        for (BatchStopJobRunError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the errors that were encountered in trying to stop
     * <code>JobRuns</code>, including the <code>JobRunId</code> for which each
     * error was encountered and details about the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            A list of the errors that were encountered in trying to stop
     *            <code>JobRuns</code>, including the <code>JobRunId</code> for
     *            which each error was encountered and details about the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchStopJobRunResult withErrors(java.util.Collection<BatchStopJobRunError> errors) {
        setErrors(errors);
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
        if (getSuccessfulSubmissions() != null)
            sb.append("SuccessfulSubmissions: " + getSuccessfulSubmissions() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSuccessfulSubmissions() == null) ? 0 : getSuccessfulSubmissions().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStopJobRunResult == false)
            return false;
        BatchStopJobRunResult other = (BatchStopJobRunResult) obj;

        if (other.getSuccessfulSubmissions() == null ^ this.getSuccessfulSubmissions() == null)
            return false;
        if (other.getSuccessfulSubmissions() != null
                && other.getSuccessfulSubmissions().equals(this.getSuccessfulSubmissions()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
