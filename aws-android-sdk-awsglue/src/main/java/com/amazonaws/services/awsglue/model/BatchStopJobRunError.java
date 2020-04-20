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

/**
 * <p>
 * Records an error that occurred when attempting to stop a specified job run.
 * </p>
 */
public class BatchStopJobRunError implements Serializable {
    /**
     * <p>
     * The name of the job definition that is used in the job run in question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * The <code>JobRunId</code> of the job run in question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobRunId;

    /**
     * <p>
     * Specifies details about the error that was encountered.
     * </p>
     */
    private ErrorDetail errorDetail;

    /**
     * <p>
     * The name of the job definition that is used in the job run in question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the job definition that is used in the job run in
     *         question.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the job definition that is used in the job run in question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobName <p>
     *            The name of the job definition that is used in the job run in
     *            question.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job definition that is used in the job run in question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobName <p>
     *            The name of the job definition that is used in the job run in
     *            question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchStopJobRunError withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The <code>JobRunId</code> of the job run in question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The <code>JobRunId</code> of the job run in question.
     *         </p>
     */
    public String getJobRunId() {
        return jobRunId;
    }

    /**
     * <p>
     * The <code>JobRunId</code> of the job run in question.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobRunId <p>
     *            The <code>JobRunId</code> of the job run in question.
     *            </p>
     */
    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The <code>JobRunId</code> of the job run in question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobRunId <p>
     *            The <code>JobRunId</code> of the job run in question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchStopJobRunError withJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
        return this;
    }

    /**
     * <p>
     * Specifies details about the error that was encountered.
     * </p>
     *
     * @return <p>
     *         Specifies details about the error that was encountered.
     *         </p>
     */
    public ErrorDetail getErrorDetail() {
        return errorDetail;
    }

    /**
     * <p>
     * Specifies details about the error that was encountered.
     * </p>
     *
     * @param errorDetail <p>
     *            Specifies details about the error that was encountered.
     *            </p>
     */
    public void setErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * Specifies details about the error that was encountered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorDetail <p>
     *            Specifies details about the error that was encountered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchStopJobRunError withErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
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
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getJobRunId() != null)
            sb.append("JobRunId: " + getJobRunId() + ",");
        if (getErrorDetail() != null)
            sb.append("ErrorDetail: " + getErrorDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        hashCode = prime * hashCode
                + ((getErrorDetail() == null) ? 0 : getErrorDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStopJobRunError == false)
            return false;
        BatchStopJobRunError other = (BatchStopJobRunError) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        if (other.getErrorDetail() == null ^ this.getErrorDetail() == null)
            return false;
        if (other.getErrorDetail() != null
                && other.getErrorDetail().equals(this.getErrorDetail()) == false)
            return false;
        return true;
    }
}
