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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information on a job bookmark entry.
 * </p>
 */
public class GetJobBookmarkRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the job in question.
     * </p>
     */
    private String jobName;

    /**
     * <p>
     * The unique run identifier associated with this job run.
     * </p>
     */
    private String runId;

    /**
     * <p>
     * The name of the job in question.
     * </p>
     *
     * @return <p>
     *         The name of the job in question.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the job in question.
     * </p>
     *
     * @param jobName <p>
     *            The name of the job in question.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job in question.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobName <p>
     *            The name of the job in question.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobBookmarkRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The unique run identifier associated with this job run.
     * </p>
     *
     * @return <p>
     *         The unique run identifier associated with this job run.
     *         </p>
     */
    public String getRunId() {
        return runId;
    }

    /**
     * <p>
     * The unique run identifier associated with this job run.
     * </p>
     *
     * @param runId <p>
     *            The unique run identifier associated with this job run.
     *            </p>
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The unique run identifier associated with this job run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runId <p>
     *            The unique run identifier associated with this job run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobBookmarkRequest withRunId(String runId) {
        this.runId = runId;
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
        if (getRunId() != null)
            sb.append("RunId: " + getRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobBookmarkRequest == false)
            return false;
        GetJobBookmarkRequest other = (GetJobBookmarkRequest) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        return true;
    }
}
