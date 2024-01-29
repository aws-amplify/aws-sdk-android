/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class StartDocumentClassificationJobResult implements Serializable {
    /**
     * <p>
     * The identifier generated for the job. To get the status of the job, use
     * this identifier with the <code>DescribeDocumentClassificationJob</code>
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     */
    private String jobId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the document classification job. It is
     * a unique, fully qualified identifier for the job. It includes the Amazon
     * Web Services account, Amazon Web Services Region, and the job ID. The
     * format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:document-classification-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-
     * Z0-9-]{1,64}
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*((/dataset/[a-zA-Z0-9](-*[a-zA-Z0-
     * 9])*)|(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*))?<br/>
     */
    private String jobArn;

    /**
     * <p>
     * The status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SUBMITTED - The job has been received and queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - Amazon Comprehend is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The job was successfully completed and the output is
     * available.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The job did not complete. For details, use the
     * <code>DescribeDocumentClassificationJob</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_REQUESTED - Amazon Comprehend has received a stop request for the
     * job and is processing the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED - The job was successfully stopped without completing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     */
    private String jobStatus;

    /**
     * <p>
     * The ARN of the custom classification model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
     */
    private String documentClassifierArn;

    /**
     * <p>
     * The identifier generated for the job. To get the status of the job, use
     * this identifier with the <code>DescribeDocumentClassificationJob</code>
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @return <p>
     *         The identifier generated for the job. To get the status of the
     *         job, use this identifier with the
     *         <code>DescribeDocumentClassificationJob</code> operation.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The identifier generated for the job. To get the status of the job, use
     * this identifier with the <code>DescribeDocumentClassificationJob</code>
     * operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$<br/>
     *
     * @param jobId <p>
     *            The identifier generated for the job. To get the status of the
     *            job, use this identifier with the
     *            <code>DescribeDocumentClassificationJob</code> operation.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier generated for the job. To get the status of the job, use
     * this identifier with the <code>DescribeDocumentClassificationJob</code>
     * operation.
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
     *            The identifier generated for the job. To get the status of the
     *            job, use this identifier with the
     *            <code>DescribeDocumentClassificationJob</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDocumentClassificationJobResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the document classification job. It is
     * a unique, fully qualified identifier for the job. It includes the Amazon
     * Web Services account, Amazon Web Services Region, and the job ID. The
     * format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:document-classification-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-
     * Z0-9-]{1,64}
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*((/dataset/[a-zA-Z0-9](-*[a-zA-Z0-
     * 9])*)|(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*))?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the document classification
     *         job. It is a unique, fully qualified identifier for the job. It
     *         includes the Amazon Web Services account, Amazon Web Services
     *         Region, and the job ID. The format of the ARN is as follows:
     *         </p>
     *         <p>
     *         <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:document-classification-job/&lt;job-id&gt;</code>
     *         </p>
     *         <p>
     *         The following is an example job ARN:
     *         </p>
     *         <p>
     *         <code>arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab</code>
     *         </p>
     */
    public String getJobArn() {
        return jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the document classification job. It is
     * a unique, fully qualified identifier for the job. It includes the Amazon
     * Web Services account, Amazon Web Services Region, and the job ID. The
     * format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:document-classification-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-
     * Z0-9-]{1,64}
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*((/dataset/[a-zA-Z0-9](-*[a-zA-Z0-
     * 9])*)|(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*))?<br/>
     *
     * @param jobArn <p>
     *            The Amazon Resource Name (ARN) of the document classification
     *            job. It is a unique, fully qualified identifier for the job.
     *            It includes the Amazon Web Services account, Amazon Web
     *            Services Region, and the job ID. The format of the ARN is as
     *            follows:
     *            </p>
     *            <p>
     *            <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:document-classification-job/&lt;job-id&gt;</code>
     *            </p>
     *            <p>
     *            The following is an example job ARN:
     *            </p>
     *            <p>
     *            <code>arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab</code>
     *            </p>
     */
    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the document classification job. It is
     * a unique, fully qualified identifier for the job. It includes the Amazon
     * Web Services account, Amazon Web Services Region, and the job ID. The
     * format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:document-classification-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab</code>
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
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*((/dataset/[a-zA-Z0-9](-*[a-zA-Z0-
     * 9])*)|(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*))?<br/>
     *
     * @param jobArn <p>
     *            The Amazon Resource Name (ARN) of the document classification
     *            job. It is a unique, fully qualified identifier for the job.
     *            It includes the Amazon Web Services account, Amazon Web
     *            Services Region, and the job ID. The format of the ARN is as
     *            follows:
     *            </p>
     *            <p>
     *            <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:document-classification-job/&lt;job-id&gt;</code>
     *            </p>
     *            <p>
     *            The following is an example job ARN:
     *            </p>
     *            <p>
     *            <code>arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDocumentClassificationJobResult withJobArn(String jobArn) {
        this.jobArn = jobArn;
        return this;
    }

    /**
     * <p>
     * The status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SUBMITTED - The job has been received and queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - Amazon Comprehend is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The job was successfully completed and the output is
     * available.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The job did not complete. For details, use the
     * <code>DescribeDocumentClassificationJob</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_REQUESTED - Amazon Comprehend has received a stop request for the
     * job and is processing the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED - The job was successfully stopped without completing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @return <p>
     *         The status of the job:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         SUBMITTED - The job has been received and queued for processing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IN_PROGRESS - Amazon Comprehend is processing the job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPLETED - The job was successfully completed and the output is
     *         available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED - The job did not complete. For details, use the
     *         <code>DescribeDocumentClassificationJob</code> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOP_REQUESTED - Amazon Comprehend has received a stop request
     *         for the job and is processing the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOPPED - The job was successfully stopped without completing.
     *         </p>
     *         </li>
     *         </ul>
     * @see JobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SUBMITTED - The job has been received and queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - Amazon Comprehend is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The job was successfully completed and the output is
     * available.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The job did not complete. For details, use the
     * <code>DescribeDocumentClassificationJob</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_REQUESTED - Amazon Comprehend has received a stop request for the
     * job and is processing the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED - The job was successfully stopped without completing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The status of the job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            SUBMITTED - The job has been received and queued for
     *            processing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IN_PROGRESS - Amazon Comprehend is processing the job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPLETED - The job was successfully completed and the output
     *            is available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            FAILED - The job did not complete. For details, use the
     *            <code>DescribeDocumentClassificationJob</code> operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOP_REQUESTED - Amazon Comprehend has received a stop request
     *            for the job and is processing the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOPPED - The job was successfully stopped without completing.
     *            </p>
     *            </li>
     *            </ul>
     * @see JobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SUBMITTED - The job has been received and queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - Amazon Comprehend is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The job was successfully completed and the output is
     * available.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The job did not complete. For details, use the
     * <code>DescribeDocumentClassificationJob</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_REQUESTED - Amazon Comprehend has received a stop request for the
     * job and is processing the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED - The job was successfully stopped without completing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The status of the job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            SUBMITTED - The job has been received and queued for
     *            processing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IN_PROGRESS - Amazon Comprehend is processing the job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPLETED - The job was successfully completed and the output
     *            is available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            FAILED - The job did not complete. For details, use the
     *            <code>DescribeDocumentClassificationJob</code> operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOP_REQUESTED - Amazon Comprehend has received a stop request
     *            for the job and is processing the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOPPED - The job was successfully stopped without completing.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public StartDocumentClassificationJobResult withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SUBMITTED - The job has been received and queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - Amazon Comprehend is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The job was successfully completed and the output is
     * available.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The job did not complete. For details, use the
     * <code>DescribeDocumentClassificationJob</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_REQUESTED - Amazon Comprehend has received a stop request for the
     * job and is processing the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED - The job was successfully stopped without completing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The status of the job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            SUBMITTED - The job has been received and queued for
     *            processing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IN_PROGRESS - Amazon Comprehend is processing the job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPLETED - The job was successfully completed and the output
     *            is available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            FAILED - The job did not complete. For details, use the
     *            <code>DescribeDocumentClassificationJob</code> operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOP_REQUESTED - Amazon Comprehend has received a stop request
     *            for the job and is processing the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOPPED - The job was successfully stopped without completing.
     *            </p>
     *            </li>
     *            </ul>
     * @see JobStatus
     */
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SUBMITTED - The job has been received and queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - Amazon Comprehend is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The job was successfully completed and the output is
     * available.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The job did not complete. For details, use the
     * <code>DescribeDocumentClassificationJob</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_REQUESTED - Amazon Comprehend has received a stop request for the
     * job and is processing the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED - The job was successfully stopped without completing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, IN_PROGRESS, COMPLETED, FAILED,
     * STOP_REQUESTED, STOPPED
     *
     * @param jobStatus <p>
     *            The status of the job:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            SUBMITTED - The job has been received and queued for
     *            processing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IN_PROGRESS - Amazon Comprehend is processing the job.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            COMPLETED - The job was successfully completed and the output
     *            is available.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            FAILED - The job did not complete. For details, use the
     *            <code>DescribeDocumentClassificationJob</code> operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOP_REQUESTED - Amazon Comprehend has received a stop request
     *            for the job and is processing the request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOPPED - The job was successfully stopped without completing.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public StartDocumentClassificationJobResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the custom classification model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @return <p>
     *         The ARN of the custom classification model.
     *         </p>
     */
    public String getDocumentClassifierArn() {
        return documentClassifierArn;
    }

    /**
     * <p>
     * The ARN of the custom classification model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param documentClassifierArn <p>
     *            The ARN of the custom classification model.
     *            </p>
     */
    public void setDocumentClassifierArn(String documentClassifierArn) {
        this.documentClassifierArn = documentClassifierArn;
    }

    /**
     * <p>
     * The ARN of the custom classification model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param documentClassifierArn <p>
     *            The ARN of the custom classification model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDocumentClassificationJobResult withDocumentClassifierArn(
            String documentClassifierArn) {
        this.documentClassifierArn = documentClassifierArn;
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
        if (getJobStatus() != null)
            sb.append("JobStatus: " + getJobStatus() + ",");
        if (getDocumentClassifierArn() != null)
            sb.append("DocumentClassifierArn: " + getDocumentClassifierArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentClassifierArn() == null) ? 0 : getDocumentClassifierArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDocumentClassificationJobResult == false)
            return false;
        StartDocumentClassificationJobResult other = (StartDocumentClassificationJobResult) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getDocumentClassifierArn() == null ^ this.getDocumentClassifierArn() == null)
            return false;
        if (other.getDocumentClassifierArn() != null
                && other.getDocumentClassifierArn().equals(this.getDocumentClassifierArn()) == false)
            return false;
        return true;
    }
}
