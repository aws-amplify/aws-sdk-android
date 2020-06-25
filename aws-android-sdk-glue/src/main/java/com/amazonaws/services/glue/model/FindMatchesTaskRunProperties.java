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

/**
 * <p>
 * Specifies configuration properties for a Find Matches task run.
 * </p>
 */
public class FindMatchesTaskRunProperties implements Serializable {
    /**
     * <p>
     * The job ID for the Find Matches task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobId;

    /**
     * <p>
     * The name assigned to the job for the Find Matches task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * The job run ID for the Find Matches task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobRunId;

    /**
     * <p>
     * The job ID for the Find Matches task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The job ID for the Find Matches task run.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The job ID for the Find Matches task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobId <p>
     *            The job ID for the Find Matches task run.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID for the Find Matches task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobId <p>
     *            The job ID for the Find Matches task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesTaskRunProperties withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The name assigned to the job for the Find Matches task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name assigned to the job for the Find Matches task run.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name assigned to the job for the Find Matches task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobName <p>
     *            The name assigned to the job for the Find Matches task run.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name assigned to the job for the Find Matches task run.
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
     *            The name assigned to the job for the Find Matches task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesTaskRunProperties withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The job run ID for the Find Matches task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The job run ID for the Find Matches task run.
     *         </p>
     */
    public String getJobRunId() {
        return jobRunId;
    }

    /**
     * <p>
     * The job run ID for the Find Matches task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobRunId <p>
     *            The job run ID for the Find Matches task run.
     *            </p>
     */
    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The job run ID for the Find Matches task run.
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
     *            The job run ID for the Find Matches task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesTaskRunProperties withJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getJobName() != null)
            sb.append("JobName: " + getJobName() + ",");
        if (getJobRunId() != null)
            sb.append("JobRunId: " + getJobRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindMatchesTaskRunProperties == false)
            return false;
        FindMatchesTaskRunProperties other = (FindMatchesTaskRunProperties) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        return true;
    }
}
