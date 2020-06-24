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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a new job for a branch of an Amplify app.
 * </p>
 */
public class StartJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String appId;

    /**
     * <p>
     * The branch name for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String branchName;

    /**
     * <p>
     * The unique ID for an existing job. This is required if the value of
     * <code>jobType</code> is <code>RETRY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String jobId;

    /**
     * <p>
     * Describes the type for the job. The job type <code>RELEASE</code> starts
     * a new job with the latest change from the specified branch. This value is
     * available only for apps that are connected to a repository. The job type
     * <code>RETRY</code> retries an existing job. If the job type value is
     * <code>RETRY</code>, the <code>jobId</code> is also required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     */
    private String jobType;

    /**
     * <p>
     * A descriptive reason for starting this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String jobReason;

    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String commitId;

    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     */
    private String commitMessage;

    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     */
    private java.util.Date commitTime;

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The unique ID for an Amplify app.
     *         </p>
     */
    public String getAppId() {
        return appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param appId <p>
     *            The unique ID for an Amplify app.
     *            </p>
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param appId <p>
     *            The unique ID for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartJobRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * <p>
     * The branch name for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The branch name for the job.
     *         </p>
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * <p>
     * The branch name for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The branch name for the job.
     *            </p>
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The branch name for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param branchName <p>
     *            The branch name for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartJobRequest withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * <p>
     * The unique ID for an existing job. This is required if the value of
     * <code>jobType</code> is <code>RETRY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The unique ID for an existing job. This is required if the value
     *         of <code>jobType</code> is <code>RETRY</code>.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The unique ID for an existing job. This is required if the value of
     * <code>jobType</code> is <code>RETRY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param jobId <p>
     *            The unique ID for an existing job. This is required if the
     *            value of <code>jobType</code> is <code>RETRY</code>.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique ID for an existing job. This is required if the value of
     * <code>jobType</code> is <code>RETRY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param jobId <p>
     *            The unique ID for an existing job. This is required if the
     *            value of <code>jobType</code> is <code>RETRY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * Describes the type for the job. The job type <code>RELEASE</code> starts
     * a new job with the latest change from the specified branch. This value is
     * available only for apps that are connected to a repository. The job type
     * <code>RETRY</code> retries an existing job. If the job type value is
     * <code>RETRY</code>, the <code>jobId</code> is also required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     *
     * @return <p>
     *         Describes the type for the job. The job type <code>RELEASE</code>
     *         starts a new job with the latest change from the specified
     *         branch. This value is available only for apps that are connected
     *         to a repository. The job type <code>RETRY</code> retries an
     *         existing job. If the job type value is <code>RETRY</code>, the
     *         <code>jobId</code> is also required.
     *         </p>
     * @see JobType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * <p>
     * Describes the type for the job. The job type <code>RELEASE</code> starts
     * a new job with the latest change from the specified branch. This value is
     * available only for apps that are connected to a repository. The job type
     * <code>RETRY</code> retries an existing job. If the job type value is
     * <code>RETRY</code>, the <code>jobId</code> is also required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     *
     * @param jobType <p>
     *            Describes the type for the job. The job type
     *            <code>RELEASE</code> starts a new job with the latest change
     *            from the specified branch. This value is available only for
     *            apps that are connected to a repository. The job type
     *            <code>RETRY</code> retries an existing job. If the job type
     *            value is <code>RETRY</code>, the <code>jobId</code> is also
     *            required.
     *            </p>
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * Describes the type for the job. The job type <code>RELEASE</code> starts
     * a new job with the latest change from the specified branch. This value is
     * available only for apps that are connected to a repository. The job type
     * <code>RETRY</code> retries an existing job. If the job type value is
     * <code>RETRY</code>, the <code>jobId</code> is also required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     *
     * @param jobType <p>
     *            Describes the type for the job. The job type
     *            <code>RELEASE</code> starts a new job with the latest change
     *            from the specified branch. This value is available only for
     *            apps that are connected to a repository. The job type
     *            <code>RETRY</code> retries an existing job. If the job type
     *            value is <code>RETRY</code>, the <code>jobId</code> is also
     *            required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public StartJobRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * <p>
     * Describes the type for the job. The job type <code>RELEASE</code> starts
     * a new job with the latest change from the specified branch. This value is
     * available only for apps that are connected to a repository. The job type
     * <code>RETRY</code> retries an existing job. If the job type value is
     * <code>RETRY</code>, the <code>jobId</code> is also required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     *
     * @param jobType <p>
     *            Describes the type for the job. The job type
     *            <code>RELEASE</code> starts a new job with the latest change
     *            from the specified branch. This value is available only for
     *            apps that are connected to a repository. The job type
     *            <code>RETRY</code> retries an existing job. If the job type
     *            value is <code>RETRY</code>, the <code>jobId</code> is also
     *            required.
     *            </p>
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * <p>
     * Describes the type for the job. The job type <code>RELEASE</code> starts
     * a new job with the latest change from the specified branch. This value is
     * available only for apps that are connected to a repository. The job type
     * <code>RETRY</code> retries an existing job. If the job type value is
     * <code>RETRY</code>, the <code>jobId</code> is also required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     * <b>Allowed Values: </b>RELEASE, RETRY, MANUAL, WEB_HOOK
     *
     * @param jobType <p>
     *            Describes the type for the job. The job type
     *            <code>RELEASE</code> starts a new job with the latest change
     *            from the specified branch. This value is available only for
     *            apps that are connected to a repository. The job type
     *            <code>RETRY</code> retries an existing job. If the job type
     *            value is <code>RETRY</code>, the <code>jobId</code> is also
     *            required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public StartJobRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * A descriptive reason for starting this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         A descriptive reason for starting this job.
     *         </p>
     */
    public String getJobReason() {
        return jobReason;
    }

    /**
     * <p>
     * A descriptive reason for starting this job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param jobReason <p>
     *            A descriptive reason for starting this job.
     *            </p>
     */
    public void setJobReason(String jobReason) {
        this.jobReason = jobReason;
    }

    /**
     * <p>
     * A descriptive reason for starting this job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param jobReason <p>
     *            A descriptive reason for starting this job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartJobRequest withJobReason(String jobReason) {
        this.jobReason = jobReason;
        return this;
    }

    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The commit ID from a third-party repository provider for the job.
     *         </p>
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param commitId <p>
     *            The commit ID from a third-party repository provider for the
     *            job.
     *            </p>
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The commit ID from a third-party repository provider for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param commitId <p>
     *            The commit ID from a third-party repository provider for the
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartJobRequest withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @return <p>
     *         The commit message from a third-party repository provider for the
     *         job.
     *         </p>
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @param commitMessage <p>
     *            The commit message from a third-party repository provider for
     *            the job.
     *            </p>
     */
    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * The commit message from a third-party repository provider for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @param commitMessage <p>
     *            The commit message from a third-party repository provider for
     *            the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartJobRequest withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     *
     * @return <p>
     *         The commit date and time for the job.
     *         </p>
     */
    public java.util.Date getCommitTime() {
        return commitTime;
    }

    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     *
     * @param commitTime <p>
     *            The commit date and time for the job.
     *            </p>
     */
    public void setCommitTime(java.util.Date commitTime) {
        this.commitTime = commitTime;
    }

    /**
     * <p>
     * The commit date and time for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitTime <p>
     *            The commit date and time for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartJobRequest withCommitTime(java.util.Date commitTime) {
        this.commitTime = commitTime;
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
        if (getAppId() != null)
            sb.append("appId: " + getAppId() + ",");
        if (getBranchName() != null)
            sb.append("branchName: " + getBranchName() + ",");
        if (getJobId() != null)
            sb.append("jobId: " + getJobId() + ",");
        if (getJobType() != null)
            sb.append("jobType: " + getJobType() + ",");
        if (getJobReason() != null)
            sb.append("jobReason: " + getJobReason() + ",");
        if (getCommitId() != null)
            sb.append("commitId: " + getCommitId() + ",");
        if (getCommitMessage() != null)
            sb.append("commitMessage: " + getCommitMessage() + ",");
        if (getCommitTime() != null)
            sb.append("commitTime: " + getCommitTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getJobReason() == null) ? 0 : getJobReason().hashCode());
        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode + ((getCommitTime() == null) ? 0 : getCommitTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartJobRequest == false)
            return false;
        StartJobRequest other = (StartJobRequest) obj;

        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null
                && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getJobReason() == null ^ this.getJobReason() == null)
            return false;
        if (other.getJobReason() != null
                && other.getJobReason().equals(this.getJobReason()) == false)
            return false;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null
                && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        if (other.getCommitTime() == null ^ this.getCommitTime() == null)
            return false;
        if (other.getCommitTime() != null
                && other.getCommitTime().equals(this.getCommitTime()) == false)
            return false;
        return true;
    }
}
