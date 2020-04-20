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
 * Defines a point that a job can resume processing.
 * </p>
 */
public class JobBookmarkEntry implements Serializable {
    /**
     * <p>
     * The name of the job in question.
     * </p>
     */
    private String jobName;

    /**
     * <p>
     * The version of the job.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The run ID number.
     * </p>
     */
    private Integer run;

    /**
     * <p>
     * The attempt ID number.
     * </p>
     */
    private Integer attempt;

    /**
     * <p>
     * The unique run identifier associated with the previous job run.
     * </p>
     */
    private String previousRunId;

    /**
     * <p>
     * The run ID number.
     * </p>
     */
    private String runId;

    /**
     * <p>
     * The bookmark itself.
     * </p>
     */
    private String jobBookmark;

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
    public JobBookmarkEntry withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The version of the job.
     * </p>
     *
     * @return <p>
     *         The version of the job.
     *         </p>
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the job.
     * </p>
     *
     * @param version <p>
     *            The version of the job.
     *            </p>
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobBookmarkEntry withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The run ID number.
     * </p>
     *
     * @return <p>
     *         The run ID number.
     *         </p>
     */
    public Integer getRun() {
        return run;
    }

    /**
     * <p>
     * The run ID number.
     * </p>
     *
     * @param run <p>
     *            The run ID number.
     *            </p>
     */
    public void setRun(Integer run) {
        this.run = run;
    }

    /**
     * <p>
     * The run ID number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param run <p>
     *            The run ID number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobBookmarkEntry withRun(Integer run) {
        this.run = run;
        return this;
    }

    /**
     * <p>
     * The attempt ID number.
     * </p>
     *
     * @return <p>
     *         The attempt ID number.
     *         </p>
     */
    public Integer getAttempt() {
        return attempt;
    }

    /**
     * <p>
     * The attempt ID number.
     * </p>
     *
     * @param attempt <p>
     *            The attempt ID number.
     *            </p>
     */
    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    /**
     * <p>
     * The attempt ID number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attempt <p>
     *            The attempt ID number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobBookmarkEntry withAttempt(Integer attempt) {
        this.attempt = attempt;
        return this;
    }

    /**
     * <p>
     * The unique run identifier associated with the previous job run.
     * </p>
     *
     * @return <p>
     *         The unique run identifier associated with the previous job run.
     *         </p>
     */
    public String getPreviousRunId() {
        return previousRunId;
    }

    /**
     * <p>
     * The unique run identifier associated with the previous job run.
     * </p>
     *
     * @param previousRunId <p>
     *            The unique run identifier associated with the previous job
     *            run.
     *            </p>
     */
    public void setPreviousRunId(String previousRunId) {
        this.previousRunId = previousRunId;
    }

    /**
     * <p>
     * The unique run identifier associated with the previous job run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param previousRunId <p>
     *            The unique run identifier associated with the previous job
     *            run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobBookmarkEntry withPreviousRunId(String previousRunId) {
        this.previousRunId = previousRunId;
        return this;
    }

    /**
     * <p>
     * The run ID number.
     * </p>
     *
     * @return <p>
     *         The run ID number.
     *         </p>
     */
    public String getRunId() {
        return runId;
    }

    /**
     * <p>
     * The run ID number.
     * </p>
     *
     * @param runId <p>
     *            The run ID number.
     *            </p>
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The run ID number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runId <p>
     *            The run ID number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobBookmarkEntry withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * <p>
     * The bookmark itself.
     * </p>
     *
     * @return <p>
     *         The bookmark itself.
     *         </p>
     */
    public String getJobBookmark() {
        return jobBookmark;
    }

    /**
     * <p>
     * The bookmark itself.
     * </p>
     *
     * @param jobBookmark <p>
     *            The bookmark itself.
     *            </p>
     */
    public void setJobBookmark(String jobBookmark) {
        this.jobBookmark = jobBookmark;
    }

    /**
     * <p>
     * The bookmark itself.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobBookmark <p>
     *            The bookmark itself.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobBookmarkEntry withJobBookmark(String jobBookmark) {
        this.jobBookmark = jobBookmark;
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
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getRun() != null)
            sb.append("Run: " + getRun() + ",");
        if (getAttempt() != null)
            sb.append("Attempt: " + getAttempt() + ",");
        if (getPreviousRunId() != null)
            sb.append("PreviousRunId: " + getPreviousRunId() + ",");
        if (getRunId() != null)
            sb.append("RunId: " + getRunId() + ",");
        if (getJobBookmark() != null)
            sb.append("JobBookmark: " + getJobBookmark());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getRun() == null) ? 0 : getRun().hashCode());
        hashCode = prime * hashCode + ((getAttempt() == null) ? 0 : getAttempt().hashCode());
        hashCode = prime * hashCode
                + ((getPreviousRunId() == null) ? 0 : getPreviousRunId().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode
                + ((getJobBookmark() == null) ? 0 : getJobBookmark().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobBookmarkEntry == false)
            return false;
        JobBookmarkEntry other = (JobBookmarkEntry) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getRun() == null ^ this.getRun() == null)
            return false;
        if (other.getRun() != null && other.getRun().equals(this.getRun()) == false)
            return false;
        if (other.getAttempt() == null ^ this.getAttempt() == null)
            return false;
        if (other.getAttempt() != null && other.getAttempt().equals(this.getAttempt()) == false)
            return false;
        if (other.getPreviousRunId() == null ^ this.getPreviousRunId() == null)
            return false;
        if (other.getPreviousRunId() != null
                && other.getPreviousRunId().equals(this.getPreviousRunId()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getJobBookmark() == null ^ this.getJobBookmark() == null)
            return false;
        if (other.getJobBookmark() != null
                && other.getJobBookmark().equals(this.getJobBookmark()) == false)
            return false;
        return true;
    }
}
