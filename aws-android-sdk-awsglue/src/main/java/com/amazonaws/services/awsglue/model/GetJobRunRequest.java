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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves the metadata for a given job run.
 * </p>
 */
public class GetJobRunRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the job definition being run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String runId;

    /**
     * <p>
     * True if a list of predecessor runs should be returned.
     * </p>
     */
    private Boolean predecessorsIncluded;

    /**
     * <p>
     * Name of the job definition being run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         Name of the job definition being run.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * Name of the job definition being run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param jobName <p>
     *            Name of the job definition being run.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * Name of the job definition being run.
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
     *            Name of the job definition being run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobRunRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of the job run.
     *         </p>
     */
    public String getRunId() {
        return runId;
    }

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param runId <p>
     *            The ID of the job run.
     *            </p>
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param runId <p>
     *            The ID of the job run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobRunRequest withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * <p>
     * True if a list of predecessor runs should be returned.
     * </p>
     *
     * @return <p>
     *         True if a list of predecessor runs should be returned.
     *         </p>
     */
    public Boolean isPredecessorsIncluded() {
        return predecessorsIncluded;
    }

    /**
     * <p>
     * True if a list of predecessor runs should be returned.
     * </p>
     *
     * @return <p>
     *         True if a list of predecessor runs should be returned.
     *         </p>
     */
    public Boolean getPredecessorsIncluded() {
        return predecessorsIncluded;
    }

    /**
     * <p>
     * True if a list of predecessor runs should be returned.
     * </p>
     *
     * @param predecessorsIncluded <p>
     *            True if a list of predecessor runs should be returned.
     *            </p>
     */
    public void setPredecessorsIncluded(Boolean predecessorsIncluded) {
        this.predecessorsIncluded = predecessorsIncluded;
    }

    /**
     * <p>
     * True if a list of predecessor runs should be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predecessorsIncluded <p>
     *            True if a list of predecessor runs should be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobRunRequest withPredecessorsIncluded(Boolean predecessorsIncluded) {
        this.predecessorsIncluded = predecessorsIncluded;
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
            sb.append("RunId: " + getRunId() + ",");
        if (getPredecessorsIncluded() != null)
            sb.append("PredecessorsIncluded: " + getPredecessorsIncluded());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode
                + ((getPredecessorsIncluded() == null) ? 0 : getPredecessorsIncluded().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobRunRequest == false)
            return false;
        GetJobRunRequest other = (GetJobRunRequest) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getPredecessorsIncluded() == null ^ this.getPredecessorsIncluded() == null)
            return false;
        if (other.getPredecessorsIncluded() != null
                && other.getPredecessorsIncluded().equals(this.getPredecessorsIncluded()) == false)
            return false;
        return true;
    }
}
