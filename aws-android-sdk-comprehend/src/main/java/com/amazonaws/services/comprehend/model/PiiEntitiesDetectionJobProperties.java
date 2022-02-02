/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about a PII entities detection job.
 * </p>
 */
public class PiiEntitiesDetectionJobProperties implements Serializable {
    /**
     * <p>
     * The identifier assigned to the PII entities detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the PII entities detection job. It is a
     * unique, fully qualified identifier for the job. It includes the AWS
     * account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:pii-entities-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:pii-entities-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-
     * Z0-9-]{1,64}
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
     */
    private String jobArn;

    /**
     * <p>
     * The name that you assigned the PII entities detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobName;

    /**
     * <p>
     * The current status of the PII entities detection job. If the status is
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
     * A description of the status of a job.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The time that the PII entities detection job was submitted for
     * processing.
     * </p>
     */
    private java.util.Date submitTime;

    /**
     * <p>
     * The time that the PII entities detection job completed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * The output data configuration that you supplied when you created the PII
     * entities detection job.
     * </p>
     */
    private PiiOutputDataConfig outputDataConfig;

    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to
     * <code>ONLY_REDACTION</code>. In that case, you must provide a
     * <code>RedactionConfig</code> definition that includes the
     * <code>PiiEntityTypes</code> parameter.
     * </p>
     */
    private RedactionConfig redactionConfig;

    /**
     * <p>
     * The language code of the input documents
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     */
    private String languageCode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon Comprehend read access
     * to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     */
    private String mode;

    /**
     * <p>
     * The identifier assigned to the PII entities detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The identifier assigned to the PII entities detection job.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The identifier assigned to the PII entities detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobId <p>
     *            The identifier assigned to the PII entities detection job.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier assigned to the PII entities detection job.
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
     *            The identifier assigned to the PII entities detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntitiesDetectionJobProperties withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the PII entities detection job. It is a
     * unique, fully qualified identifier for the job. It includes the AWS
     * account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:pii-entities-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:pii-entities-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-
     * Z0-9-]{1,64}
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the PII entities detection job.
     *         It is a unique, fully qualified identifier for the job. It
     *         includes the AWS account, Region, and the job ID. The format of
     *         the ARN is as follows:
     *         </p>
     *         <p>
     *         <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:pii-entities-detection-job/&lt;job-id&gt;</code>
     *         </p>
     *         <p>
     *         The following is an example job ARN:
     *         </p>
     *         <p>
     *         <code>arn:aws:comprehend:us-west-2:111122223333:pii-entities-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     *         </p>
     */
    public String getJobArn() {
        return jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the PII entities detection job. It is a
     * unique, fully qualified identifier for the job. It includes the AWS
     * account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:pii-entities-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:pii-entities-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-
     * Z0-9-]{1,64}
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param jobArn <p>
     *            The Amazon Resource Name (ARN) of the PII entities detection
     *            job. It is a unique, fully qualified identifier for the job.
     *            It includes the AWS account, Region, and the job ID. The
     *            format of the ARN is as follows:
     *            </p>
     *            <p>
     *            <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:pii-entities-detection-job/&lt;job-id&gt;</code>
     *            </p>
     *            <p>
     *            The following is an example job ARN:
     *            </p>
     *            <p>
     *            <code>arn:aws:comprehend:us-west-2:111122223333:pii-entities-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     *            </p>
     */
    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the PII entities detection job. It is a
     * unique, fully qualified identifier for the job. It includes the AWS
     * account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:pii-entities-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:pii-entities-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-
     * Z0-9-]{1,64}
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param jobArn <p>
     *            The Amazon Resource Name (ARN) of the PII entities detection
     *            job. It is a unique, fully qualified identifier for the job.
     *            It includes the AWS account, Region, and the job ID. The
     *            format of the ARN is as follows:
     *            </p>
     *            <p>
     *            <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:pii-entities-detection-job/&lt;job-id&gt;</code>
     *            </p>
     *            <p>
     *            The following is an example job ARN:
     *            </p>
     *            <p>
     *            <code>arn:aws:comprehend:us-west-2:111122223333:pii-entities-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntitiesDetectionJobProperties withJobArn(String jobArn) {
        this.jobArn = jobArn;
        return this;
    }

    /**
     * <p>
     * The name that you assigned the PII entities detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The name that you assigned the PII entities detection job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name that you assigned the PII entities detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobName <p>
     *            The name that you assigned the PII entities detection job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name that you assigned the PII entities detection job.
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
     *            The name that you assigned the PII entities detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntitiesDetectionJobProperties withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The current status of the PII entities detection job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @return <p>
     *         The current status of the PII entities detection job. If the
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
     * The current status of the PII entities detection job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The current status of the PII entities detection job. If the
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
     * The current status of the PII entities detection job. If the status is
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
     *            The current status of the PII entities detection job. If the
     *            status is <code>FAILED</code>, the <code>Message</code> field
     *            shows the reason for the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public PiiEntitiesDetectionJobProperties withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the PII entities detection job. If the status is
     * <code>FAILED</code>, the <code>Message</code> field shows the reason for
     * the failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The current status of the PII entities detection job. If the
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
     * The current status of the PII entities detection job. If the status is
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
     *            The current status of the PII entities detection job. If the
     *            status is <code>FAILED</code>, the <code>Message</code> field
     *            shows the reason for the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public PiiEntitiesDetectionJobProperties withJobStatus(JobStatus jobStatus) {
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
    public PiiEntitiesDetectionJobProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The time that the PII entities detection job was submitted for
     * processing.
     * </p>
     *
     * @return <p>
     *         The time that the PII entities detection job was submitted for
     *         processing.
     *         </p>
     */
    public java.util.Date getSubmitTime() {
        return submitTime;
    }

    /**
     * <p>
     * The time that the PII entities detection job was submitted for
     * processing.
     * </p>
     *
     * @param submitTime <p>
     *            The time that the PII entities detection job was submitted for
     *            processing.
     *            </p>
     */
    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time that the PII entities detection job was submitted for
     * processing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submitTime <p>
     *            The time that the PII entities detection job was submitted for
     *            processing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntitiesDetectionJobProperties withSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * <p>
     * The time that the PII entities detection job completed.
     * </p>
     *
     * @return <p>
     *         The time that the PII entities detection job completed.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time that the PII entities detection job completed.
     * </p>
     *
     * @param endTime <p>
     *            The time that the PII entities detection job completed.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the PII entities detection job completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time that the PII entities detection job completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntitiesDetectionJobProperties withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     *
     * @return <p>
     *         The input properties for a PII entities detection job.
     *         </p>
     */
    public InputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     *
     * @param inputDataConfig <p>
     *            The input properties for a PII entities detection job.
     *            </p>
     */
    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input properties for a PII entities detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            The input properties for a PII entities detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntitiesDetectionJobProperties withInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
        return this;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the PII
     * entities detection job.
     * </p>
     *
     * @return <p>
     *         The output data configuration that you supplied when you created
     *         the PII entities detection job.
     *         </p>
     */
    public PiiOutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the PII
     * entities detection job.
     * </p>
     *
     * @param outputDataConfig <p>
     *            The output data configuration that you supplied when you
     *            created the PII entities detection job.
     *            </p>
     */
    public void setOutputDataConfig(PiiOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that you supplied when you created the PII
     * entities detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            The output data configuration that you supplied when you
     *            created the PII entities detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntitiesDetectionJobProperties withOutputDataConfig(
            PiiOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to
     * <code>ONLY_REDACTION</code>. In that case, you must provide a
     * <code>RedactionConfig</code> definition that includes the
     * <code>PiiEntityTypes</code> parameter.
     * </p>
     *
     * @return <p>
     *         Provides configuration parameters for PII entity redaction.
     *         </p>
     *         <p>
     *         This parameter is required if you set the <code>Mode</code>
     *         parameter to <code>ONLY_REDACTION</code>. In that case, you must
     *         provide a <code>RedactionConfig</code> definition that includes
     *         the <code>PiiEntityTypes</code> parameter.
     *         </p>
     */
    public RedactionConfig getRedactionConfig() {
        return redactionConfig;
    }

    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to
     * <code>ONLY_REDACTION</code>. In that case, you must provide a
     * <code>RedactionConfig</code> definition that includes the
     * <code>PiiEntityTypes</code> parameter.
     * </p>
     *
     * @param redactionConfig <p>
     *            Provides configuration parameters for PII entity redaction.
     *            </p>
     *            <p>
     *            This parameter is required if you set the <code>Mode</code>
     *            parameter to <code>ONLY_REDACTION</code>. In that case, you
     *            must provide a <code>RedactionConfig</code> definition that
     *            includes the <code>PiiEntityTypes</code> parameter.
     *            </p>
     */
    public void setRedactionConfig(RedactionConfig redactionConfig) {
        this.redactionConfig = redactionConfig;
    }

    /**
     * <p>
     * Provides configuration parameters for PII entity redaction.
     * </p>
     * <p>
     * This parameter is required if you set the <code>Mode</code> parameter to
     * <code>ONLY_REDACTION</code>. In that case, you must provide a
     * <code>RedactionConfig</code> definition that includes the
     * <code>PiiEntityTypes</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param redactionConfig <p>
     *            Provides configuration parameters for PII entity redaction.
     *            </p>
     *            <p>
     *            This parameter is required if you set the <code>Mode</code>
     *            parameter to <code>ONLY_REDACTION</code>. In that case, you
     *            must provide a <code>RedactionConfig</code> definition that
     *            includes the <code>PiiEntityTypes</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntitiesDetectionJobProperties withRedactionConfig(RedactionConfig redactionConfig) {
        this.redactionConfig = redactionConfig;
        return this;
    }

    /**
     * <p>
     * The language code of the input documents
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @return <p>
     *         The language code of the input documents
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code of the input documents
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language code of the input documents
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the input documents
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language code of the input documents
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public PiiEntitiesDetectionJobProperties withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code of the input documents
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language code of the input documents
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code of the input documents
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language code of the input documents
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public PiiEntitiesDetectionJobProperties withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon Comprehend read access
     * to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that gives Amazon Comprehend read
     *         access to your input data.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon Comprehend read access
     * to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) that gives Amazon Comprehend
     *            read access to your input data.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon Comprehend read access
     * to your input data.
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
     *            read access to your input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PiiEntitiesDetectionJobProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     *
     * @return <p>
     *         Specifies whether the output provides the locations (offsets) of
     *         PII entities or a file in which PII entities are redacted.
     *         </p>
     * @see PiiEntitiesDetectionMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     *
     * @param mode <p>
     *            Specifies whether the output provides the locations (offsets)
     *            of PII entities or a file in which PII entities are redacted.
     *            </p>
     * @see PiiEntitiesDetectionMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     *
     * @param mode <p>
     *            Specifies whether the output provides the locations (offsets)
     *            of PII entities or a file in which PII entities are redacted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PiiEntitiesDetectionMode
     */
    public PiiEntitiesDetectionJobProperties withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     *
     * @param mode <p>
     *            Specifies whether the output provides the locations (offsets)
     *            of PII entities or a file in which PII entities are redacted.
     *            </p>
     * @see PiiEntitiesDetectionMode
     */
    public void setMode(PiiEntitiesDetectionMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * Specifies whether the output provides the locations (offsets) of PII
     * entities or a file in which PII entities are redacted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLY_REDACTION, ONLY_OFFSETS
     *
     * @param mode <p>
     *            Specifies whether the output provides the locations (offsets)
     *            of PII entities or a file in which PII entities are redacted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PiiEntitiesDetectionMode
     */
    public PiiEntitiesDetectionJobProperties withMode(PiiEntitiesDetectionMode mode) {
        this.mode = mode.toString();
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
        if (getJobArn() != null)
            sb.append("JobArn: " + getJobArn() + ",");
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
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getRedactionConfig() != null)
            sb.append("RedactionConfig: " + getRedactionConfig() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getRedactionConfig() == null) ? 0 : getRedactionConfig().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PiiEntitiesDetectionJobProperties == false)
            return false;
        PiiEntitiesDetectionJobProperties other = (PiiEntitiesDetectionJobProperties) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
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
        if (other.getRedactionConfig() == null ^ this.getRedactionConfig() == null)
            return false;
        if (other.getRedactionConfig() != null
                && other.getRedactionConfig().equals(this.getRedactionConfig()) == false)
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
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }
}
