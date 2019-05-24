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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a document classification job.
 * </p>
 */
public class DocumentClassificationJobProperties implements Serializable {
    /**
     * <p>
     * The identifier assigned to the document classification job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobId;

    /**
     * <p>
     * The name that you assigned to the document classification job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobName;

    /**
     * <p>
     * The current status of the document classification job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     */
    private String jobStatus;

    /**
     * <p>
     * A description of the status of the job.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The time that the document classification job was submitted for
     * processing.
     * </p>
     */
    private java.util.Date submitTime;

    /**
     * <p>
     * The time that the document classification job completed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String documentClassifierArn;

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * document classification job.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * The output data configuration that you supplied when you created the
     * document classification job.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute
     * instance(s) that process the analysis job. The VolumeKmsKeyId can be
     * either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your document classification
     * job. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * The identifier assigned to the document classification job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The identifier assigned to the document classification job.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The identifier assigned to the document classification job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobId <p>
     *            The identifier assigned to the document classification job.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier assigned to the document classification job.
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
     *            The identifier assigned to the document classification job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationJobProperties withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The name that you assigned to the document classification job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The name that you assigned to the document classification job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name that you assigned to the document classification job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            The name that you assigned to the document classification job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name that you assigned to the document classification job.
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
     *            The name that you assigned to the document classification job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationJobProperties withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The current status of the document classification job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @return <p>
     *         The current status of the document classification job. If the
     *         status is <code>FAILED</code>, the <code>Message</code> field
     *         shows the reason for the failure.
     *         </p>
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The current status of the document classification job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The current status of the document classification job. If the
     *            status is <code>FAILED</code>, the <code>Message</code> field
     *            shows the reason for the failure.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the document classification job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The current status of the document classification job. If the
     *            status is <code>FAILED</code>, the <code>Message</code> field
     *            shows the reason for the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public DocumentClassificationJobProperties withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the document classification job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The current status of the document classification job. If the
     *            status is <code>FAILED</code>, the <code>Message</code> field
     *            shows the reason for the failure.
     *            </p>
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The current status of the document classification job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The current status of the document classification job. If the
     *            status is <code>FAILED</code>, the <code>Message</code> field
     *            shows the reason for the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public DocumentClassificationJobProperties withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the job.
     * </p>
     *
     * @return <p>
     *         A description of the status of the job.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A description of the status of the job.
     * </p>
     *
     * @param message <p>
     *            A description of the status of the job.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A description of the status of the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationJobProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The time that the document classification job was submitted for
     * processing.
     * </p>
     *
     * @return <p>
     *         The time that the document classification job was submitted for
     *         processing.
     *         </p>
     */
    public java.util.Date getSubmitTime() {
        return submitTime;
    }

    /**
     * <p>
     * The time that the document classification job was submitted for
     * processing.
     * </p>
     *
     * @param submitTime <p>
     *            The time that the document classification job was submitted
     *            for processing.
     *            </p>
     */
    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time that the document classification job was submitted for
     * processing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submitTime <p>
     *            The time that the document classification job was submitted
     *            for processing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationJobProperties withSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * <p>
     * The time that the document classification job completed.
     * </p>
     *
     * @return <p>
     *         The time that the document classification job completed.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time that the document classification job completed.
     * </p>
     *
     * @param endTime <p>
     *            The time that the document classification job completed.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the document classification job completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time that the document classification job completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationJobProperties withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the document
     *         classifier.
     *         </p>
     */
    public String getDocumentClassifierArn() {
        return documentClassifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param documentClassifierArn <p>
     *            The Amazon Resource Name (ARN) that identifies the document
     *            classifier.
     *            </p>
     */
    public void setDocumentClassifierArn(String documentClassifierArn) {
        this.documentClassifierArn = documentClassifierArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param documentClassifierArn <p>
     *            The Amazon Resource Name (ARN) that identifies the document
     *            classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationJobProperties withDocumentClassifierArn(
            String documentClassifierArn) {
        this.documentClassifierArn = documentClassifierArn;
        return this;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * document classification job.
     * </p>
     *
     * @return <p>
     *         The input data configuration that you supplied when you created
     *         the document classification job.
     *         </p>
     */
    public InputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * document classification job.
     * </p>
     *
     * @param inputDataConfig <p>
     *            The input data configuration that you supplied when you
     *            created the document classification job.
     *            </p>
     */
    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * document classification job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            The input data configuration that you supplied when you
     *            created the document classification job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationJobProperties withInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
        return this;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the
     * document classification job.
     * </p>
     *
     * @return <p>
     *         The output data configuration that you supplied when you created
     *         the document classification job.
     *         </p>
     */
    public OutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the
     * document classification job.
     * </p>
     *
     * @param outputDataConfig <p>
     *            The output data configuration that you supplied when you
     *            created the document classification job.
     *            </p>
     */
    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the
     * document classification job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            The output data configuration that you supplied when you
     *            created the document classification job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationJobProperties withOutputDataConfig(
            OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS identity and Access
     *         Management (IAM) role that grants Amazon Comprehend read access
     *         to your input data.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS identity and Access
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to your input data.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to your input data.
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
     *            The Amazon Resource Name (ARN) of the AWS identity and Access
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to your input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationJobProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute
     * instance(s) that process the analysis job. The VolumeKmsKeyId can be
     * either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         ID for the AWS Key Management Service (KMS) key that Amazon
     *         Comprehend uses to encrypt data on the storage volume attached to
     *         the ML compute instance(s) that process the analysis job. The
     *         VolumeKmsKeyId can be either of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getVolumeKmsKeyId() {
        return volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute
     * instance(s) that process the analysis job. The VolumeKmsKeyId can be
     * either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param volumeKmsKeyId <p>
     *            ID for the AWS Key Management Service (KMS) key that Amazon
     *            Comprehend uses to encrypt data on the storage volume attached
     *            to the ML compute instance(s) that process the analysis job.
     *            The VolumeKmsKeyId can be either of the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            KMS Key ID:
     *            <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Resource Name (ARN) of a KMS Key:
     *            <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt data on the storage volume attached to the ML compute
     * instance(s) that process the analysis job. The VolumeKmsKeyId can be
     * either of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param volumeKmsKeyId <p>
     *            ID for the AWS Key Management Service (KMS) key that Amazon
     *            Comprehend uses to encrypt data on the storage volume attached
     *            to the ML compute instance(s) that process the analysis job.
     *            The VolumeKmsKeyId can be either of the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            KMS Key ID:
     *            <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Resource Name (ARN) of a KMS Key:
     *            <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationJobProperties withVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
        return this;
    }

    /**
     * <p>
     * Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your document classification
     * job. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     *
     * @return <p>
     *         Configuration parameters for a private Virtual Private Cloud
     *         (VPC) containing the resources you are using for your document
     *         classification job. For more information, see <a href=
     *         "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     *         >Amazon VPC</a>.
     *         </p>
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your document classification
     * job. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            Configuration parameters for a private Virtual Private Cloud
     *            (VPC) containing the resources you are using for your document
     *            classification job. For more information, see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     *            >Amazon VPC</a>.
     *            </p>
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your document classification
     * job. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            Configuration parameters for a private Virtual Private Cloud
     *            (VPC) containing the resources you are using for your document
     *            classification job. For more information, see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     *            >Amazon VPC</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationJobProperties withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
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
        if (getDocumentClassifierArn() != null)
            sb.append("DocumentClassifierArn: " + getDocumentClassifierArn() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: " + getVolumeKmsKeyId() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig());
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
        hashCode = prime
                * hashCode
                + ((getDocumentClassifierArn() == null) ? 0 : getDocumentClassifierArn().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentClassificationJobProperties == false)
            return false;
        DocumentClassificationJobProperties other = (DocumentClassificationJobProperties) obj;

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
        if (other.getDocumentClassifierArn() == null ^ this.getDocumentClassifierArn() == null)
            return false;
        if (other.getDocumentClassifierArn() != null
                && other.getDocumentClassifierArn().equals(this.getDocumentClassifierArn()) == false)
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
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null
                && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }
}
