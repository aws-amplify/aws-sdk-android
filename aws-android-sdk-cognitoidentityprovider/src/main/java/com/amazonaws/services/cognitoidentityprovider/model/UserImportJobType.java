/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

public class UserImportJobType implements Serializable {
    /**
     * The new value for the jobName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String jobName;

    /**
     * The new value for the jobId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>import-[0-9a-zA-Z-]+<br/>
     */
    private String jobId;

    /**
     * The new value for the userPoolId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     */
    private String userPoolId;

    /**
     * The new value for the preSignedUrl property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String preSignedUrl;

    /**
     * The new value for the creationDate property for this object.
     */
    private java.util.Date creationDate;

    /**
     * The new value for the startDate property for this object.
     */
    private java.util.Date startDate;

    /**
     * The new value for the completionDate property for this object.
     */
    private java.util.Date completionDate;

    /**
     * The new value for the status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     */
    private String status;

    /**
     * The new value for the cloudWatchLogsRoleArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String cloudWatchLogsRoleArn;

    /**
     * The new value for the importedUsers property for this object.
     */
    private Long importedUsers;

    /**
     * The new value for the skippedUsers property for this object.
     */
    private Long skippedUsers;

    /**
     * The new value for the failedUsers property for this object.
     */
    private Long failedUsers;

    /**
     * The new value for the completionMessage property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String completionMessage;

    /**
     * Returns the value of the jobName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return The value of the jobName property for this object.
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * Sets the value of jobName
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param jobName The new value for the jobName property for this object.
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * Sets the value of the jobName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param jobName The new value for the jobName property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * Returns the value of the jobId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>import-[0-9a-zA-Z-]+<br/>
     *
     * @return The value of the jobId property for this object.
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of jobId
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>import-[0-9a-zA-Z-]+<br/>
     *
     * @param jobId The new value for the jobId property for this object.
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * Sets the value of the jobId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>import-[0-9a-zA-Z-]+<br/>
     *
     * @param jobId The new value for the jobId property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Returns the value of the userPoolId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @return The value of the userPoolId property for this object.
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * Sets the value of userPoolId
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The new value for the userPoolId property for this
     *            object.
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * Sets the value of the userPoolId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The new value for the userPoolId property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * Returns the value of the preSignedUrl property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return The value of the preSignedUrl property for this object.
     */
    public String getPreSignedUrl() {
        return preSignedUrl;
    }

    /**
     * Sets the value of preSignedUrl
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param preSignedUrl The new value for the preSignedUrl property for this
     *            object.
     */
    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * Sets the value of the preSignedUrl property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param preSignedUrl The new value for the preSignedUrl property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
        return this;
    }

    /**
     * Returns the value of the creationDate property for this object.
     *
     * @return The value of the creationDate property for this object.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of creationDate
     *
     * @param creationDate The new value for the creationDate property for this
     *            object.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Sets the value of the creationDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate The new value for the creationDate property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Returns the value of the startDate property for this object.
     *
     * @return The value of the startDate property for this object.
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of startDate
     *
     * @param startDate The new value for the startDate property for this
     *            object.
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Sets the value of the startDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDate The new value for the startDate property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withStartDate(java.util.Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Returns the value of the completionDate property for this object.
     *
     * @return The value of the completionDate property for this object.
     */
    public java.util.Date getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of completionDate
     *
     * @param completionDate The new value for the completionDate property for
     *            this object.
     */
    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * Sets the value of the completionDate property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionDate The new value for the completionDate property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * Returns the value of the status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     *
     * @return The value of the status property for this object.
     * @see UserImportJobStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of status
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     *
     * @param status The new value for the status property for this object.
     * @see UserImportJobStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets the value of the status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     *
     * @param status The new value for the status property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserImportJobStatusType
     */
    public UserImportJobType withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Sets the value of status
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     *
     * @param status The new value for the status property for this object.
     * @see UserImportJobStatusType
     */
    public void setStatus(UserImportJobStatusType status) {
        this.status = status.toString();
    }

    /**
     * Sets the value of the status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     *
     * @param status The new value for the status property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserImportJobStatusType
     */
    public UserImportJobType withStatus(UserImportJobStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Returns the value of the cloudWatchLogsRoleArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return The value of the cloudWatchLogsRoleArn property for this object.
     */
    public String getCloudWatchLogsRoleArn() {
        return cloudWatchLogsRoleArn;
    }

    /**
     * Sets the value of cloudWatchLogsRoleArn
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param cloudWatchLogsRoleArn The new value for the cloudWatchLogsRoleArn
     *            property for this object.
     */
    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    /**
     * Sets the value of the cloudWatchLogsRoleArn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param cloudWatchLogsRoleArn The new value for the cloudWatchLogsRoleArn
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
        return this;
    }

    /**
     * Returns the value of the importedUsers property for this object.
     *
     * @return The value of the importedUsers property for this object.
     */
    public Long getImportedUsers() {
        return importedUsers;
    }

    /**
     * Sets the value of importedUsers
     *
     * @param importedUsers The new value for the importedUsers property for
     *            this object.
     */
    public void setImportedUsers(Long importedUsers) {
        this.importedUsers = importedUsers;
    }

    /**
     * Sets the value of the importedUsers property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importedUsers The new value for the importedUsers property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withImportedUsers(Long importedUsers) {
        this.importedUsers = importedUsers;
        return this;
    }

    /**
     * Returns the value of the skippedUsers property for this object.
     *
     * @return The value of the skippedUsers property for this object.
     */
    public Long getSkippedUsers() {
        return skippedUsers;
    }

    /**
     * Sets the value of skippedUsers
     *
     * @param skippedUsers The new value for the skippedUsers property for this
     *            object.
     */
    public void setSkippedUsers(Long skippedUsers) {
        this.skippedUsers = skippedUsers;
    }

    /**
     * Sets the value of the skippedUsers property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skippedUsers The new value for the skippedUsers property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withSkippedUsers(Long skippedUsers) {
        this.skippedUsers = skippedUsers;
        return this;
    }

    /**
     * Returns the value of the failedUsers property for this object.
     *
     * @return The value of the failedUsers property for this object.
     */
    public Long getFailedUsers() {
        return failedUsers;
    }

    /**
     * Sets the value of failedUsers
     *
     * @param failedUsers The new value for the failedUsers property for this
     *            object.
     */
    public void setFailedUsers(Long failedUsers) {
        this.failedUsers = failedUsers;
    }

    /**
     * Sets the value of the failedUsers property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedUsers The new value for the failedUsers property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withFailedUsers(Long failedUsers) {
        this.failedUsers = failedUsers;
        return this;
    }

    /**
     * Returns the value of the completionMessage property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return The value of the completionMessage property for this object.
     */
    public String getCompletionMessage() {
        return completionMessage;
    }

    /**
     * Sets the value of completionMessage
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param completionMessage The new value for the completionMessage property
     *            for this object.
     */
    public void setCompletionMessage(String completionMessage) {
        this.completionMessage = completionMessage;
    }

    /**
     * Sets the value of the completionMessage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param completionMessage The new value for the completionMessage property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withCompletionMessage(String completionMessage) {
        this.completionMessage = completionMessage;
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: " + getPreSignedUrl() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate() + ",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: " + getCompletionDate() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCloudWatchLogsRoleArn() != null)
            sb.append("CloudWatchLogsRoleArn: " + getCloudWatchLogsRoleArn() + ",");
        if (getImportedUsers() != null)
            sb.append("ImportedUsers: " + getImportedUsers() + ",");
        if (getSkippedUsers() != null)
            sb.append("SkippedUsers: " + getSkippedUsers() + ",");
        if (getFailedUsers() != null)
            sb.append("FailedUsers: " + getFailedUsers() + ",");
        if (getCompletionMessage() != null)
            sb.append("CompletionMessage: " + getCompletionMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchLogsRoleArn() == null) ? 0 : getCloudWatchLogsRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getImportedUsers() == null) ? 0 : getImportedUsers().hashCode());
        hashCode = prime * hashCode
                + ((getSkippedUsers() == null) ? 0 : getSkippedUsers().hashCode());
        hashCode = prime * hashCode
                + ((getFailedUsers() == null) ? 0 : getFailedUsers().hashCode());
        hashCode = prime * hashCode
                + ((getCompletionMessage() == null) ? 0 : getCompletionMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserImportJobType == false)
            return false;
        UserImportJobType other = (UserImportJobType) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null
                && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null
                && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null
                && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCloudWatchLogsRoleArn() == null ^ this.getCloudWatchLogsRoleArn() == null)
            return false;
        if (other.getCloudWatchLogsRoleArn() != null
                && other.getCloudWatchLogsRoleArn().equals(this.getCloudWatchLogsRoleArn()) == false)
            return false;
        if (other.getImportedUsers() == null ^ this.getImportedUsers() == null)
            return false;
        if (other.getImportedUsers() != null
                && other.getImportedUsers().equals(this.getImportedUsers()) == false)
            return false;
        if (other.getSkippedUsers() == null ^ this.getSkippedUsers() == null)
            return false;
        if (other.getSkippedUsers() != null
                && other.getSkippedUsers().equals(this.getSkippedUsers()) == false)
            return false;
        if (other.getFailedUsers() == null ^ this.getFailedUsers() == null)
            return false;
        if (other.getFailedUsers() != null
                && other.getFailedUsers().equals(this.getFailedUsers()) == false)
            return false;
        if (other.getCompletionMessage() == null ^ this.getCompletionMessage() == null)
            return false;
        if (other.getCompletionMessage() != null
                && other.getCompletionMessage().equals(this.getCompletionMessage()) == false)
            return false;
        return true;
    }
}
