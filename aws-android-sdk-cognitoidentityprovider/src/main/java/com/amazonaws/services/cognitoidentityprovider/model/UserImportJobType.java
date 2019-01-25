/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The user import job type.
 * </p>
 */
public class UserImportJobType implements Serializable {
    /**
     * <p>
     * The job name for the user import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String jobName;

    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>import-[0-9a-zA-Z-]+<br/>
     */
    private String jobId;

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported
     * into.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The pre-signed URL to be used to upload the <code>.csv</code> file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String preSignedUrl;

    /**
     * <p>
     * The date the user import job was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date when the user import job was started.
     * </p>
     */
    private java.util.Date startDate;

    /**
     * <p>
     * The date when the user import job was completed.
     * </p>
     */
    private java.util.Date completionDate;

    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but
     * it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being
     * imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not
     * stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped
     * importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job
     * within 24-48 hours. All data associated with the job was deleted, and the
     * job cannot be started.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     */
    private String status;

    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import
     * job. For more information, see "Creating the CloudWatch Logs IAM Role" in
     * the Amazon Cognito Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String cloudWatchLogsRoleArn;

    /**
     * <p>
     * The number of users that were successfully imported.
     * </p>
     */
    private Long importedUsers;

    /**
     * <p>
     * The number of users that were skipped.
     * </p>
     */
    private Long skippedUsers;

    /**
     * <p>
     * The number of users that could not be imported.
     * </p>
     */
    private Long failedUsers;

    /**
     * <p>
     * The message returned when the user import job is completed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String completionMessage;

    /**
     * <p>
     * The job name for the user import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return <p>
     *         The job name for the user import job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The job name for the user import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param jobName <p>
     *            The job name for the user import job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The job name for the user import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param jobName <p>
     *            The job name for the user import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>import-[0-9a-zA-Z-]+<br/>
     *
     * @return <p>
     *         The job ID for the user import job.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>import-[0-9a-zA-Z-]+<br/>
     *
     * @param jobId <p>
     *            The job ID for the user import job.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>import-[0-9a-zA-Z-]+<br/>
     *
     * @param jobId <p>
     *            The job ID for the user import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported
     * into.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool that the users are being
     *         imported into.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported
     * into.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool that the users are being
     *            imported into.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported
     * into.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool that the users are being
     *            imported into.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The pre-signed URL to be used to upload the <code>.csv</code> file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return <p>
     *         The pre-signed URL to be used to upload the <code>.csv</code>
     *         file.
     *         </p>
     */
    public String getPreSignedUrl() {
        return preSignedUrl;
    }

    /**
     * <p>
     * The pre-signed URL to be used to upload the <code>.csv</code> file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param preSignedUrl <p>
     *            The pre-signed URL to be used to upload the <code>.csv</code>
     *            file.
     *            </p>
     */
    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * The pre-signed URL to be used to upload the <code>.csv</code> file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param preSignedUrl <p>
     *            The pre-signed URL to be used to upload the <code>.csv</code>
     *            file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
        return this;
    }

    /**
     * <p>
     * The date the user import job was created.
     * </p>
     *
     * @return <p>
     *         The date the user import job was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the user import job was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date the user import job was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the user import job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the user import job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date when the user import job was started.
     * </p>
     *
     * @return <p>
     *         The date when the user import job was started.
     *         </p>
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * <p>
     * The date when the user import job was started.
     * </p>
     *
     * @param startDate <p>
     *            The date when the user import job was started.
     *            </p>
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date when the user import job was started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDate <p>
     *            The date when the user import job was started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withStartDate(java.util.Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * <p>
     * The date when the user import job was completed.
     * </p>
     *
     * @return <p>
     *         The date when the user import job was completed.
     *         </p>
     */
    public java.util.Date getCompletionDate() {
        return completionDate;
    }

    /**
     * <p>
     * The date when the user import job was completed.
     * </p>
     *
     * @param completionDate <p>
     *            The date when the user import job was completed.
     *            </p>
     */
    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date when the user import job was completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completionDate <p>
     *            The date when the user import job was completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but
     * it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being
     * imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not
     * stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped
     * importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job
     * within 24-48 hours. All data associated with the job was deleted, and the
     * job cannot be started.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     *
     * @return <p>
     *         The status of the user import job. One of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Created</code> - The job was created but not started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Pending</code> - A transition state. You have started the
     *         job, but it has not begun importing users yet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InProgress</code> - The job has started, and users are
     *         being imported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopping</code> - You have stopped the job, but the job has
     *         not stopped importing users yet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopped</code> - You have stopped the job, and the job has
     *         stopped importing users.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Succeeded</code> - The job has completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The job has stopped due to an error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Expired</code> - You created a job, but did not start the
     *         job within 24-48 hours. All data associated with the job was
     *         deleted, and the job cannot be started.
     *         </p>
     *         </li>
     *         </ul>
     * @see UserImportJobStatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but
     * it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being
     * imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not
     * stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped
     * importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job
     * within 24-48 hours. All data associated with the job was deleted, and the
     * job cannot be started.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     *
     * @param status <p>
     *            The status of the user import job. One of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Created</code> - The job was created but not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Pending</code> - A transition state. You have started
     *            the job, but it has not begun importing users yet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The job has started, and users are
     *            being imported.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - You have stopped the job, but the job
     *            has not stopped importing users yet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - You have stopped the job, and the job
     *            has stopped importing users.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code> - The job has completed successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The job has stopped due to an error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Expired</code> - You created a job, but did not start
     *            the job within 24-48 hours. All data associated with the job
     *            was deleted, and the job cannot be started.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserImportJobStatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but
     * it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being
     * imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not
     * stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped
     * importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job
     * within 24-48 hours. All data associated with the job was deleted, and the
     * job cannot be started.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     *
     * @param status <p>
     *            The status of the user import job. One of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Created</code> - The job was created but not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Pending</code> - A transition state. You have started
     *            the job, but it has not begun importing users yet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The job has started, and users are
     *            being imported.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - You have stopped the job, but the job
     *            has not stopped importing users yet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - You have stopped the job, and the job
     *            has stopped importing users.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code> - The job has completed successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The job has stopped due to an error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Expired</code> - You created a job, but did not start
     *            the job within 24-48 hours. All data associated with the job
     *            was deleted, and the job cannot be started.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserImportJobStatusType
     */
    public UserImportJobType withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but
     * it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being
     * imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not
     * stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped
     * importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job
     * within 24-48 hours. All data associated with the job was deleted, and the
     * job cannot be started.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     *
     * @param status <p>
     *            The status of the user import job. One of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Created</code> - The job was created but not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Pending</code> - A transition state. You have started
     *            the job, but it has not begun importing users yet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The job has started, and users are
     *            being imported.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - You have stopped the job, but the job
     *            has not stopped importing users yet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - You have stopped the job, and the job
     *            has stopped importing users.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code> - The job has completed successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The job has stopped due to an error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Expired</code> - You created a job, but did not start
     *            the job within 24-48 hours. All data associated with the job
     *            was deleted, and the job cannot be started.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserImportJobStatusType
     */
    public void setStatus(UserImportJobStatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but
     * it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being
     * imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not
     * stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped
     * importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job
     * within 24-48 hours. All data associated with the job was deleted, and the
     * job cannot be started.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Pending, InProgress, Stopping, Expired,
     * Stopped, Failed, Succeeded
     *
     * @param status <p>
     *            The status of the user import job. One of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Created</code> - The job was created but not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Pending</code> - A transition state. You have started
     *            the job, but it has not begun importing users yet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InProgress</code> - The job has started, and users are
     *            being imported.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopping</code> - You have stopped the job, but the job
     *            has not stopped importing users yet.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Stopped</code> - You have stopped the job, and the job
     *            has stopped importing users.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Succeeded</code> - The job has completed successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> - The job has stopped due to an error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Expired</code> - You created a job, but did not start
     *            the job within 24-48 hours. All data associated with the job
     *            was deleted, and the job cannot be started.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserImportJobStatusType
     */
    public UserImportJobType withStatus(UserImportJobStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import
     * job. For more information, see "Creating the CloudWatch Logs IAM Role" in
     * the Amazon Cognito Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         The role ARN for the Amazon CloudWatch Logging role for the user
     *         import job. For more information, see
     *         "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito
     *         Developer Guide.
     *         </p>
     */
    public String getCloudWatchLogsRoleArn() {
        return cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import
     * job. For more information, see "Creating the CloudWatch Logs IAM Role" in
     * the Amazon Cognito Developer Guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param cloudWatchLogsRoleArn <p>
     *            The role ARN for the Amazon CloudWatch Logging role for the
     *            user import job. For more information, see
     *            "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito
     *            Developer Guide.
     *            </p>
     */
    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import
     * job. For more information, see "Creating the CloudWatch Logs IAM Role" in
     * the Amazon Cognito Developer Guide.
     * </p>
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
     * @param cloudWatchLogsRoleArn <p>
     *            The role ARN for the Amazon CloudWatch Logging role for the
     *            user import job. For more information, see
     *            "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito
     *            Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
        return this;
    }

    /**
     * <p>
     * The number of users that were successfully imported.
     * </p>
     *
     * @return <p>
     *         The number of users that were successfully imported.
     *         </p>
     */
    public Long getImportedUsers() {
        return importedUsers;
    }

    /**
     * <p>
     * The number of users that were successfully imported.
     * </p>
     *
     * @param importedUsers <p>
     *            The number of users that were successfully imported.
     *            </p>
     */
    public void setImportedUsers(Long importedUsers) {
        this.importedUsers = importedUsers;
    }

    /**
     * <p>
     * The number of users that were successfully imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importedUsers <p>
     *            The number of users that were successfully imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withImportedUsers(Long importedUsers) {
        this.importedUsers = importedUsers;
        return this;
    }

    /**
     * <p>
     * The number of users that were skipped.
     * </p>
     *
     * @return <p>
     *         The number of users that were skipped.
     *         </p>
     */
    public Long getSkippedUsers() {
        return skippedUsers;
    }

    /**
     * <p>
     * The number of users that were skipped.
     * </p>
     *
     * @param skippedUsers <p>
     *            The number of users that were skipped.
     *            </p>
     */
    public void setSkippedUsers(Long skippedUsers) {
        this.skippedUsers = skippedUsers;
    }

    /**
     * <p>
     * The number of users that were skipped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skippedUsers <p>
     *            The number of users that were skipped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withSkippedUsers(Long skippedUsers) {
        this.skippedUsers = skippedUsers;
        return this;
    }

    /**
     * <p>
     * The number of users that could not be imported.
     * </p>
     *
     * @return <p>
     *         The number of users that could not be imported.
     *         </p>
     */
    public Long getFailedUsers() {
        return failedUsers;
    }

    /**
     * <p>
     * The number of users that could not be imported.
     * </p>
     *
     * @param failedUsers <p>
     *            The number of users that could not be imported.
     *            </p>
     */
    public void setFailedUsers(Long failedUsers) {
        this.failedUsers = failedUsers;
    }

    /**
     * <p>
     * The number of users that could not be imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedUsers <p>
     *            The number of users that could not be imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserImportJobType withFailedUsers(Long failedUsers) {
        this.failedUsers = failedUsers;
        return this;
    }

    /**
     * <p>
     * The message returned when the user import job is completed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The message returned when the user import job is completed.
     *         </p>
     */
    public String getCompletionMessage() {
        return completionMessage;
    }

    /**
     * <p>
     * The message returned when the user import job is completed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param completionMessage <p>
     *            The message returned when the user import job is completed.
     *            </p>
     */
    public void setCompletionMessage(String completionMessage) {
        this.completionMessage = completionMessage;
    }

    /**
     * <p>
     * The message returned when the user import job is completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param completionMessage <p>
     *            The message returned when the user import job is completed.
     *            </p>
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
