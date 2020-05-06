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

package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a detection job.
 * </p>
 */
public class ComprehendMedicalAsyncJobProperties implements Serializable {
    /**
     * <p>
     * The identifier assigned to the detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobId;

    /**
     * <p>
     * The name that you assigned to the detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobName;

    /**
     * <p>
     * The current status of the detection job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * PARTIAL_SUCCESS, FAILED, STOP_REQUESTED, STOPPED
     */
    private String jobStatus;

    /**
     * <p>
     * A description of the status of a job.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The time that the detection job was submitted for processing.
     * </p>
     */
    private java.util.Date submitTime;

    /**
     * <p>
     * The time that the detection job completed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The date and time that job metadata is deleted from the server. Output
     * files in your S3 bucket will not be deleted. After the metadata is
     * deleted, the job will no longer appear in the results of the
     * <code>ListEntitiesDetectionV2Job</code> or the
     * <code>ListPHIDetectionJobs</code> operation.
     * </p>
     */
    private java.util.Date expirationTime;

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * detection job.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * The output data configuration that you supplied when you created the
     * detection job.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * The language code of the input documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en
     */
    private String languageCode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon Comprehend Medical read
     * access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * The path to the file that describes the results of a batch job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String manifestFilePath;

    /**
     * <p>
     * The AWS Key Management Service key, if any, used to encrypt the output
     * files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String kMSKey;

    /**
     * <p>
     * The version of the model used to analyze the documents. The version
     * number looks like X.X.X. You can use this information to track the model
     * used for a particular batch of documents.
     * </p>
     */
    private String modelVersion;

    /**
     * <p>
     * The identifier assigned to the detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The identifier assigned to the detection job.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The identifier assigned to the detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobId <p>
     *            The identifier assigned to the detection job.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier assigned to the detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobId <p>
     *            The identifier assigned to the detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The name that you assigned to the detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The name that you assigned to the detection job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name that you assigned to the detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            The name that you assigned to the detection job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name that you assigned to the detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            The name that you assigned to the detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The current status of the detection job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * PARTIAL_SUCCESS, FAILED, STOP_REQUESTED, STOPPED
     *
     * @return <p>
     *         The current status of the detection job. If the status is
     *         <code>FAILED</code>, the <code>Message</code> field shows the
     *         reason for the failure.
     *         </p>
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The current status of the detection job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * PARTIAL_SUCCESS, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The current status of the detection job. If the status is
     *            <code>FAILED</code>, the <code>Message</code> field shows the
     *            reason for the failure.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the detection job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * PARTIAL_SUCCESS, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The current status of the detection job. If the status is
     *            <code>FAILED</code>, the <code>Message</code> field shows the
     *            reason for the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public ComprehendMedicalAsyncJobProperties withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the detection job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * PARTIAL_SUCCESS, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The current status of the detection job. If the status is
     *            <code>FAILED</code>, the <code>Message</code> field shows the
     *            reason for the failure.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The current status of the detection job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED,
     * PARTIAL_SUCCESS, FAILED, STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The current status of the detection job. If the status is
     *            <code>FAILED</code>, the <code>Message</code> field shows the
     *            reason for the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public ComprehendMedicalAsyncJobProperties withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of a job.
     * </p>
     *
     * @return <p>
     *         A description of the status of a job.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A description of the status of a job.
     * </p>
     *
     * @param message <p>
     *            A description of the status of a job.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of a job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A description of the status of a job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The time that the detection job was submitted for processing.
     * </p>
     *
     * @return <p>
     *         The time that the detection job was submitted for processing.
     *         </p>
     */
    public java.util.Date getSubmitTime() {
        return submitTime;
    }

    /**
     * <p>
     * The time that the detection job was submitted for processing.
     * </p>
     *
     * @param submitTime <p>
     *            The time that the detection job was submitted for processing.
     *            </p>
     */
    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time that the detection job was submitted for processing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submitTime <p>
     *            The time that the detection job was submitted for processing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * <p>
     * The time that the detection job completed.
     * </p>
     *
     * @return <p>
     *         The time that the detection job completed.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time that the detection job completed.
     * </p>
     *
     * @param endTime <p>
     *            The time that the detection job completed.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the detection job completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time that the detection job completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The date and time that job metadata is deleted from the server. Output
     * files in your S3 bucket will not be deleted. After the metadata is
     * deleted, the job will no longer appear in the results of the
     * <code>ListEntitiesDetectionV2Job</code> or the
     * <code>ListPHIDetectionJobs</code> operation.
     * </p>
     *
     * @return <p>
     *         The date and time that job metadata is deleted from the server.
     *         Output files in your S3 bucket will not be deleted. After the
     *         metadata is deleted, the job will no longer appear in the results
     *         of the <code>ListEntitiesDetectionV2Job</code> or the
     *         <code>ListPHIDetectionJobs</code> operation.
     *         </p>
     */
    public java.util.Date getExpirationTime() {
        return expirationTime;
    }

    /**
     * <p>
     * The date and time that job metadata is deleted from the server. Output
     * files in your S3 bucket will not be deleted. After the metadata is
     * deleted, the job will no longer appear in the results of the
     * <code>ListEntitiesDetectionV2Job</code> or the
     * <code>ListPHIDetectionJobs</code> operation.
     * </p>
     *
     * @param expirationTime <p>
     *            The date and time that job metadata is deleted from the
     *            server. Output files in your S3 bucket will not be deleted.
     *            After the metadata is deleted, the job will no longer appear
     *            in the results of the <code>ListEntitiesDetectionV2Job</code>
     *            or the <code>ListPHIDetectionJobs</code> operation.
     *            </p>
     */
    public void setExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The date and time that job metadata is deleted from the server. Output
     * files in your S3 bucket will not be deleted. After the metadata is
     * deleted, the job will no longer appear in the results of the
     * <code>ListEntitiesDetectionV2Job</code> or the
     * <code>ListPHIDetectionJobs</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expirationTime <p>
     *            The date and time that job metadata is deleted from the
     *            server. Output files in your S3 bucket will not be deleted.
     *            After the metadata is deleted, the job will no longer appear
     *            in the results of the <code>ListEntitiesDetectionV2Job</code>
     *            or the <code>ListPHIDetectionJobs</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * detection job.
     * </p>
     *
     * @return <p>
     *         The input data configuration that you supplied when you created
     *         the detection job.
     *         </p>
     */
    public InputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * detection job.
     * </p>
     *
     * @param inputDataConfig <p>
     *            The input data configuration that you supplied when you
     *            created the detection job.
     *            </p>
     */
    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            The input data configuration that you supplied when you
     *            created the detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
        return this;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the
     * detection job.
     * </p>
     *
     * @return <p>
     *         The output data configuration that you supplied when you created
     *         the detection job.
     *         </p>
     */
    public OutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the
     * detection job.
     * </p>
     *
     * @param outputDataConfig <p>
     *            The output data configuration that you supplied when you
     *            created the detection job.
     *            </p>
     */
    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the
     * detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            The output data configuration that you supplied when you
     *            created the detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withOutputDataConfig(
            OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * The language code of the input documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en
     *
     * @return <p>
     *         The language code of the input documents.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code of the input documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en
     *
     * @param languageCode <p>
     *            The language code of the input documents.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the input documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en
     *
     * @param languageCode <p>
     *            The language code of the input documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public ComprehendMedicalAsyncJobProperties withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code of the input documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en
     *
     * @param languageCode <p>
     *            The language code of the input documents.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code of the input documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en
     *
     * @param languageCode <p>
     *            The language code of the input documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public ComprehendMedicalAsyncJobProperties withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon Comprehend Medical read
     * access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that gives Amazon Comprehend
     *         Medical read access to your input data.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon Comprehend Medical read
     * access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) that gives Amazon Comprehend
     *            Medical read access to your input data.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon Comprehend Medical read
     * access to your input data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) that gives Amazon Comprehend
     *            Medical read access to your input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * The path to the file that describes the results of a batch job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>
     *         The path to the file that describes the results of a batch job.
     *         </p>
     */
    public String getManifestFilePath() {
        return manifestFilePath;
    }

    /**
     * <p>
     * The path to the file that describes the results of a batch job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param manifestFilePath <p>
     *            The path to the file that describes the results of a batch
     *            job.
     *            </p>
     */
    public void setManifestFilePath(String manifestFilePath) {
        this.manifestFilePath = manifestFilePath;
    }

    /**
     * <p>
     * The path to the file that describes the results of a batch job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param manifestFilePath <p>
     *            The path to the file that describes the results of a batch
     *            job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withManifestFilePath(String manifestFilePath) {
        this.manifestFilePath = manifestFilePath;
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service key, if any, used to encrypt the output
     * files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The AWS Key Management Service key, if any, used to encrypt the
     *         output files.
     *         </p>
     */
    public String getKMSKey() {
        return kMSKey;
    }

    /**
     * <p>
     * The AWS Key Management Service key, if any, used to encrypt the output
     * files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kMSKey <p>
     *            The AWS Key Management Service key, if any, used to encrypt
     *            the output files.
     *            </p>
     */
    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The AWS Key Management Service key, if any, used to encrypt the output
     * files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kMSKey <p>
     *            The AWS Key Management Service key, if any, used to encrypt
     *            the output files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
        return this;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents. The version
     * number looks like X.X.X. You can use this information to track the model
     * used for a particular batch of documents.
     * </p>
     *
     * @return <p>
     *         The version of the model used to analyze the documents. The
     *         version number looks like X.X.X. You can use this information to
     *         track the model used for a particular batch of documents.
     *         </p>
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents. The version
     * number looks like X.X.X. You can use this information to track the model
     * used for a particular batch of documents.
     * </p>
     *
     * @param modelVersion <p>
     *            The version of the model used to analyze the documents. The
     *            version number looks like X.X.X. You can use this information
     *            to track the model used for a particular batch of documents.
     *            </p>
     */
    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the documents. The version
     * number looks like X.X.X. You can use this information to track the model
     * used for a particular batch of documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVersion <p>
     *            The version of the model used to analyze the documents. The
     *            version number looks like X.X.X. You can use this information
     *            to track the model used for a particular batch of documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComprehendMedicalAsyncJobProperties withModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
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
        if (getJobStatus() != null)
            sb.append("JobStatus: " + getJobStatus() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: " + getSubmitTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: " + getExpirationTime() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getManifestFilePath() != null)
            sb.append("ManifestFilePath: " + getManifestFilePath() + ",");
        if (getKMSKey() != null)
            sb.append("KMSKey: " + getKMSKey() + ",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: " + getModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getManifestFilePath() == null) ? 0 : getManifestFilePath().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode
                + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComprehendMedicalAsyncJobProperties == false)
            return false;
        ComprehendMedicalAsyncJobProperties other = (ComprehendMedicalAsyncJobProperties) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null
                && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null
                && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null
                && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null
                && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getManifestFilePath() == null ^ this.getManifestFilePath() == null)
            return false;
        if (other.getManifestFilePath() != null
                && other.getManifestFilePath().equals(this.getManifestFilePath()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null
                && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        return true;
    }
}
