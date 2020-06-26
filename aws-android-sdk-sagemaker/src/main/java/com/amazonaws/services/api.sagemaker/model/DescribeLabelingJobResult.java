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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class DescribeLabelingJobResult implements Serializable {
    /**
     * <p>
     * The processing status of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     */
    private String labelingJobStatus;

    /**
     * <p>
     * Provides a breakdown of the number of data objects labeled by humans, the
     * number of objects labeled by machine, the number of objects than couldn't
     * be labeled, and the total number of objects labeled.
     * </p>
     */
    private LabelCounters labelCounters;

    /**
     * <p>
     * If the job failed, the reason that it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String failureReason;

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The date and time that the labeling job was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * A unique identifier for work done as part of a labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String jobReferenceCode;

    /**
     * <p>
     * The name assigned to the labeling job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String labelingJobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     */
    private String labelingJobArn;

    /**
     * <p>
     * The attribute used as the label in the output manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String labelAttributeName;

    /**
     * <p>
     * Input configuration information for the labeling job, such as the Amazon
     * S3 location of the data objects and the location of the manifest file
     * that describes the data objects.
     * </p>
     */
    private LabelingJobInputConfig inputConfig;

    /**
     * <p>
     * The location of the job's output data and the AWS Key Management Service
     * key ID for the key used to encrypt the output data, if any.
     * </p>
     */
    private LabelingJobOutputConfig outputConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform
     * tasks on your behalf during data labeling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The S3 location of the JSON file that defines the categories used to
     * label data objects. Please note the following label-category limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Semantic segmentation labeling jobs using automated labeling: 20 labels
     * </p>
     * </li>
     * <li>
     * <p>
     * Box bounding labeling jobs (all): 10 labels
     * </p>
     * </li>
     * </ul>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String labelCategoryConfigS3Uri;

    /**
     * <p>
     * A set of conditions for stopping a labeling job. If any of the conditions
     * are met, the job is automatically stopped.
     * </p>
     */
    private LabelingJobStoppingConditions stoppingConditions;

    /**
     * <p>
     * Configuration information for automated data labeling.
     * </p>
     */
    private LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig;

    /**
     * <p>
     * Configuration information required for human workers to complete a
     * labeling task.
     * </p>
     */
    private HumanTaskConfig humanTaskConfig;

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     */
    private LabelingJobOutput labelingJobOutput;

    /**
     * <p>
     * The processing status of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @return <p>
     *         The processing status of the labeling job.
     *         </p>
     * @see LabelingJobStatus
     */
    public String getLabelingJobStatus() {
        return labelingJobStatus;
    }

    /**
     * <p>
     * The processing status of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param labelingJobStatus <p>
     *            The processing status of the labeling job.
     *            </p>
     * @see LabelingJobStatus
     */
    public void setLabelingJobStatus(String labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus;
    }

    /**
     * <p>
     * The processing status of the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param labelingJobStatus <p>
     *            The processing status of the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LabelingJobStatus
     */
    public DescribeLabelingJobResult withLabelingJobStatus(String labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus;
        return this;
    }

    /**
     * <p>
     * The processing status of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param labelingJobStatus <p>
     *            The processing status of the labeling job.
     *            </p>
     * @see LabelingJobStatus
     */
    public void setLabelingJobStatus(LabelingJobStatus labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus.toString();
    }

    /**
     * <p>
     * The processing status of the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Stopping, Stopped
     *
     * @param labelingJobStatus <p>
     *            The processing status of the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LabelingJobStatus
     */
    public DescribeLabelingJobResult withLabelingJobStatus(LabelingJobStatus labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Provides a breakdown of the number of data objects labeled by humans, the
     * number of objects labeled by machine, the number of objects than couldn't
     * be labeled, and the total number of objects labeled.
     * </p>
     *
     * @return <p>
     *         Provides a breakdown of the number of data objects labeled by
     *         humans, the number of objects labeled by machine, the number of
     *         objects than couldn't be labeled, and the total number of objects
     *         labeled.
     *         </p>
     */
    public LabelCounters getLabelCounters() {
        return labelCounters;
    }

    /**
     * <p>
     * Provides a breakdown of the number of data objects labeled by humans, the
     * number of objects labeled by machine, the number of objects than couldn't
     * be labeled, and the total number of objects labeled.
     * </p>
     *
     * @param labelCounters <p>
     *            Provides a breakdown of the number of data objects labeled by
     *            humans, the number of objects labeled by machine, the number
     *            of objects than couldn't be labeled, and the total number of
     *            objects labeled.
     *            </p>
     */
    public void setLabelCounters(LabelCounters labelCounters) {
        this.labelCounters = labelCounters;
    }

    /**
     * <p>
     * Provides a breakdown of the number of data objects labeled by humans, the
     * number of objects labeled by machine, the number of objects than couldn't
     * be labeled, and the total number of objects labeled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelCounters <p>
     *            Provides a breakdown of the number of data objects labeled by
     *            humans, the number of objects labeled by machine, the number
     *            of objects than couldn't be labeled, and the total number of
     *            objects labeled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withLabelCounters(LabelCounters labelCounters) {
        this.labelCounters = labelCounters;
        return this;
    }

    /**
     * <p>
     * If the job failed, the reason that it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If the job failed, the reason that it failed.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If the job failed, the reason that it failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the job failed, the reason that it failed.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the job failed, the reason that it failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param failureReason <p>
     *            If the job failed, the reason that it failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     *
     * @return <p>
     *         The date and time that the labeling job was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time that the labeling job was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time that the labeling job was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the labeling job was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time that the labeling job was last updated.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was last updated.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time that the labeling job was last updated.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time that the labeling job was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * A unique identifier for work done as part of a labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         A unique identifier for work done as part of a labeling job.
     *         </p>
     */
    public String getJobReferenceCode() {
        return jobReferenceCode;
    }

    /**
     * <p>
     * A unique identifier for work done as part of a labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param jobReferenceCode <p>
     *            A unique identifier for work done as part of a labeling job.
     *            </p>
     */
    public void setJobReferenceCode(String jobReferenceCode) {
        this.jobReferenceCode = jobReferenceCode;
    }

    /**
     * <p>
     * A unique identifier for work done as part of a labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param jobReferenceCode <p>
     *            A unique identifier for work done as part of a labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withJobReferenceCode(String jobReferenceCode) {
        this.jobReferenceCode = jobReferenceCode;
        return this;
    }

    /**
     * <p>
     * The name assigned to the labeling job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name assigned to the labeling job when it was created.
     *         </p>
     */
    public String getLabelingJobName() {
        return labelingJobName;
    }

    /**
     * <p>
     * The name assigned to the labeling job when it was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param labelingJobName <p>
     *            The name assigned to the labeling job when it was created.
     *            </p>
     */
    public void setLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
    }

    /**
     * <p>
     * The name assigned to the labeling job when it was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param labelingJobName <p>
     *            The name assigned to the labeling job when it was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the labeling job.
     *         </p>
     */
    public String getLabelingJobArn() {
        return labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @param labelingJobArn <p>
     *            The Amazon Resource Name (ARN) of the labeling job.
     *            </p>
     */
    public void setLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @param labelingJobArn <p>
     *            The Amazon Resource Name (ARN) of the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
        return this;
    }

    /**
     * <p>
     * The attribute used as the label in the output manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The attribute used as the label in the output manifest file.
     *         </p>
     */
    public String getLabelAttributeName() {
        return labelAttributeName;
    }

    /**
     * <p>
     * The attribute used as the label in the output manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param labelAttributeName <p>
     *            The attribute used as the label in the output manifest file.
     *            </p>
     */
    public void setLabelAttributeName(String labelAttributeName) {
        this.labelAttributeName = labelAttributeName;
    }

    /**
     * <p>
     * The attribute used as the label in the output manifest file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param labelAttributeName <p>
     *            The attribute used as the label in the output manifest file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withLabelAttributeName(String labelAttributeName) {
        this.labelAttributeName = labelAttributeName;
        return this;
    }

    /**
     * <p>
     * Input configuration information for the labeling job, such as the Amazon
     * S3 location of the data objects and the location of the manifest file
     * that describes the data objects.
     * </p>
     *
     * @return <p>
     *         Input configuration information for the labeling job, such as the
     *         Amazon S3 location of the data objects and the location of the
     *         manifest file that describes the data objects.
     *         </p>
     */
    public LabelingJobInputConfig getInputConfig() {
        return inputConfig;
    }

    /**
     * <p>
     * Input configuration information for the labeling job, such as the Amazon
     * S3 location of the data objects and the location of the manifest file
     * that describes the data objects.
     * </p>
     *
     * @param inputConfig <p>
     *            Input configuration information for the labeling job, such as
     *            the Amazon S3 location of the data objects and the location of
     *            the manifest file that describes the data objects.
     *            </p>
     */
    public void setInputConfig(LabelingJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Input configuration information for the labeling job, such as the Amazon
     * S3 location of the data objects and the location of the manifest file
     * that describes the data objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputConfig <p>
     *            Input configuration information for the labeling job, such as
     *            the Amazon S3 location of the data objects and the location of
     *            the manifest file that describes the data objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withInputConfig(LabelingJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }

    /**
     * <p>
     * The location of the job's output data and the AWS Key Management Service
     * key ID for the key used to encrypt the output data, if any.
     * </p>
     *
     * @return <p>
     *         The location of the job's output data and the AWS Key Management
     *         Service key ID for the key used to encrypt the output data, if
     *         any.
     *         </p>
     */
    public LabelingJobOutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * The location of the job's output data and the AWS Key Management Service
     * key ID for the key used to encrypt the output data, if any.
     * </p>
     *
     * @param outputConfig <p>
     *            The location of the job's output data and the AWS Key
     *            Management Service key ID for the key used to encrypt the
     *            output data, if any.
     *            </p>
     */
    public void setOutputConfig(LabelingJobOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The location of the job's output data and the AWS Key Management Service
     * key ID for the key used to encrypt the output data, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            The location of the job's output data and the AWS Key
     *            Management Service key ID for the key used to encrypt the
     *            output data, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withOutputConfig(LabelingJobOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform
     * tasks on your behalf during data labeling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that Amazon SageMaker assumes to
     *         perform tasks on your behalf during data labeling.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform
     * tasks on your behalf during data labeling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) that Amazon SageMaker assumes
     *            to perform tasks on your behalf during data labeling.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform
     * tasks on your behalf during data labeling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) that Amazon SageMaker assumes
     *            to perform tasks on your behalf during data labeling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The S3 location of the JSON file that defines the categories used to
     * label data objects. Please note the following label-category limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Semantic segmentation labeling jobs using automated labeling: 20 labels
     * </p>
     * </li>
     * <li>
     * <p>
     * Box bounding labeling jobs (all): 10 labels
     * </p>
     * </li>
     * </ul>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The S3 location of the JSON file that defines the categories used
     *         to label data objects. Please note the following label-category
     *         limits:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Semantic segmentation labeling jobs using automated labeling: 20
     *         labels
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Box bounding labeling jobs (all): 10 labels
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The file is a JSON structure in the following format:
     *         </p>
     *         <p>
     *         <code>{</code>
     *         </p>
     *         <p>
     *         <code> "document-version": "2018-11-28"</code>
     *         </p>
     *         <p>
     *         <code> "labels": [</code>
     *         </p>
     *         <p>
     *         <code> {</code>
     *         </p>
     *         <p>
     *         <code> "label": "<i>label 1</i>"</code>
     *         </p>
     *         <p>
     *         <code> },</code>
     *         </p>
     *         <p>
     *         <code> {</code>
     *         </p>
     *         <p>
     *         <code> "label": "<i>label 2</i>"</code>
     *         </p>
     *         <p>
     *         <code> },</code>
     *         </p>
     *         <p>
     *         <code> ...</code>
     *         </p>
     *         <p>
     *         <code> {</code>
     *         </p>
     *         <p>
     *         <code> "label": "<i>label n</i>"</code>
     *         </p>
     *         <p>
     *         <code> }</code>
     *         </p>
     *         <p>
     *         <code> ]</code>
     *         </p>
     *         <p>
     *         <code>}</code>
     *         </p>
     */
    public String getLabelCategoryConfigS3Uri() {
        return labelCategoryConfigS3Uri;
    }

    /**
     * <p>
     * The S3 location of the JSON file that defines the categories used to
     * label data objects. Please note the following label-category limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Semantic segmentation labeling jobs using automated labeling: 20 labels
     * </p>
     * </li>
     * <li>
     * <p>
     * Box bounding labeling jobs (all): 10 labels
     * </p>
     * </li>
     * </ul>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param labelCategoryConfigS3Uri <p>
     *            The S3 location of the JSON file that defines the categories
     *            used to label data objects. Please note the following
     *            label-category limits:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Semantic segmentation labeling jobs using automated labeling:
     *            20 labels
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Box bounding labeling jobs (all): 10 labels
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The file is a JSON structure in the following format:
     *            </p>
     *            <p>
     *            <code>{</code>
     *            </p>
     *            <p>
     *            <code> "document-version": "2018-11-28"</code>
     *            </p>
     *            <p>
     *            <code> "labels": [</code>
     *            </p>
     *            <p>
     *            <code> {</code>
     *            </p>
     *            <p>
     *            <code> "label": "<i>label 1</i>"</code>
     *            </p>
     *            <p>
     *            <code> },</code>
     *            </p>
     *            <p>
     *            <code> {</code>
     *            </p>
     *            <p>
     *            <code> "label": "<i>label 2</i>"</code>
     *            </p>
     *            <p>
     *            <code> },</code>
     *            </p>
     *            <p>
     *            <code> ...</code>
     *            </p>
     *            <p>
     *            <code> {</code>
     *            </p>
     *            <p>
     *            <code> "label": "<i>label n</i>"</code>
     *            </p>
     *            <p>
     *            <code> }</code>
     *            </p>
     *            <p>
     *            <code> ]</code>
     *            </p>
     *            <p>
     *            <code>}</code>
     *            </p>
     */
    public void setLabelCategoryConfigS3Uri(String labelCategoryConfigS3Uri) {
        this.labelCategoryConfigS3Uri = labelCategoryConfigS3Uri;
    }

    /**
     * <p>
     * The S3 location of the JSON file that defines the categories used to
     * label data objects. Please note the following label-category limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Semantic segmentation labeling jobs using automated labeling: 20 labels
     * </p>
     * </li>
     * <li>
     * <p>
     * Box bounding labeling jobs (all): 10 labels
     * </p>
     * </li>
     * </ul>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param labelCategoryConfigS3Uri <p>
     *            The S3 location of the JSON file that defines the categories
     *            used to label data objects. Please note the following
     *            label-category limits:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Semantic segmentation labeling jobs using automated labeling:
     *            20 labels
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Box bounding labeling jobs (all): 10 labels
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The file is a JSON structure in the following format:
     *            </p>
     *            <p>
     *            <code>{</code>
     *            </p>
     *            <p>
     *            <code> "document-version": "2018-11-28"</code>
     *            </p>
     *            <p>
     *            <code> "labels": [</code>
     *            </p>
     *            <p>
     *            <code> {</code>
     *            </p>
     *            <p>
     *            <code> "label": "<i>label 1</i>"</code>
     *            </p>
     *            <p>
     *            <code> },</code>
     *            </p>
     *            <p>
     *            <code> {</code>
     *            </p>
     *            <p>
     *            <code> "label": "<i>label 2</i>"</code>
     *            </p>
     *            <p>
     *            <code> },</code>
     *            </p>
     *            <p>
     *            <code> ...</code>
     *            </p>
     *            <p>
     *            <code> {</code>
     *            </p>
     *            <p>
     *            <code> "label": "<i>label n</i>"</code>
     *            </p>
     *            <p>
     *            <code> }</code>
     *            </p>
     *            <p>
     *            <code> ]</code>
     *            </p>
     *            <p>
     *            <code>}</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withLabelCategoryConfigS3Uri(String labelCategoryConfigS3Uri) {
        this.labelCategoryConfigS3Uri = labelCategoryConfigS3Uri;
        return this;
    }

    /**
     * <p>
     * A set of conditions for stopping a labeling job. If any of the conditions
     * are met, the job is automatically stopped.
     * </p>
     *
     * @return <p>
     *         A set of conditions for stopping a labeling job. If any of the
     *         conditions are met, the job is automatically stopped.
     *         </p>
     */
    public LabelingJobStoppingConditions getStoppingConditions() {
        return stoppingConditions;
    }

    /**
     * <p>
     * A set of conditions for stopping a labeling job. If any of the conditions
     * are met, the job is automatically stopped.
     * </p>
     *
     * @param stoppingConditions <p>
     *            A set of conditions for stopping a labeling job. If any of the
     *            conditions are met, the job is automatically stopped.
     *            </p>
     */
    public void setStoppingConditions(LabelingJobStoppingConditions stoppingConditions) {
        this.stoppingConditions = stoppingConditions;
    }

    /**
     * <p>
     * A set of conditions for stopping a labeling job. If any of the conditions
     * are met, the job is automatically stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppingConditions <p>
     *            A set of conditions for stopping a labeling job. If any of the
     *            conditions are met, the job is automatically stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withStoppingConditions(
            LabelingJobStoppingConditions stoppingConditions) {
        this.stoppingConditions = stoppingConditions;
        return this;
    }

    /**
     * <p>
     * Configuration information for automated data labeling.
     * </p>
     *
     * @return <p>
     *         Configuration information for automated data labeling.
     *         </p>
     */
    public LabelingJobAlgorithmsConfig getLabelingJobAlgorithmsConfig() {
        return labelingJobAlgorithmsConfig;
    }

    /**
     * <p>
     * Configuration information for automated data labeling.
     * </p>
     *
     * @param labelingJobAlgorithmsConfig <p>
     *            Configuration information for automated data labeling.
     *            </p>
     */
    public void setLabelingJobAlgorithmsConfig(
            LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig) {
        this.labelingJobAlgorithmsConfig = labelingJobAlgorithmsConfig;
    }

    /**
     * <p>
     * Configuration information for automated data labeling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelingJobAlgorithmsConfig <p>
     *            Configuration information for automated data labeling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withLabelingJobAlgorithmsConfig(
            LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig) {
        this.labelingJobAlgorithmsConfig = labelingJobAlgorithmsConfig;
        return this;
    }

    /**
     * <p>
     * Configuration information required for human workers to complete a
     * labeling task.
     * </p>
     *
     * @return <p>
     *         Configuration information required for human workers to complete
     *         a labeling task.
     *         </p>
     */
    public HumanTaskConfig getHumanTaskConfig() {
        return humanTaskConfig;
    }

    /**
     * <p>
     * Configuration information required for human workers to complete a
     * labeling task.
     * </p>
     *
     * @param humanTaskConfig <p>
     *            Configuration information required for human workers to
     *            complete a labeling task.
     *            </p>
     */
    public void setHumanTaskConfig(HumanTaskConfig humanTaskConfig) {
        this.humanTaskConfig = humanTaskConfig;
    }

    /**
     * <p>
     * Configuration information required for human workers to complete a
     * labeling task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanTaskConfig <p>
     *            Configuration information required for human workers to
     *            complete a labeling task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withHumanTaskConfig(HumanTaskConfig humanTaskConfig) {
        this.humanTaskConfig = humanTaskConfig;
        return this;
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         An array of key/value pairs. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *         Management User Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            An array of key/value pairs. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key/value pairs. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of key/value pairs. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     *
     * @return <p>
     *         The location of the output produced by the labeling job.
     *         </p>
     */
    public LabelingJobOutput getLabelingJobOutput() {
        return labelingJobOutput;
    }

    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     *
     * @param labelingJobOutput <p>
     *            The location of the output produced by the labeling job.
     *            </p>
     */
    public void setLabelingJobOutput(LabelingJobOutput labelingJobOutput) {
        this.labelingJobOutput = labelingJobOutput;
    }

    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelingJobOutput <p>
     *            The location of the output produced by the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLabelingJobResult withLabelingJobOutput(LabelingJobOutput labelingJobOutput) {
        this.labelingJobOutput = labelingJobOutput;
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
        if (getLabelingJobStatus() != null)
            sb.append("LabelingJobStatus: " + getLabelingJobStatus() + ",");
        if (getLabelCounters() != null)
            sb.append("LabelCounters: " + getLabelCounters() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getJobReferenceCode() != null)
            sb.append("JobReferenceCode: " + getJobReferenceCode() + ",");
        if (getLabelingJobName() != null)
            sb.append("LabelingJobName: " + getLabelingJobName() + ",");
        if (getLabelingJobArn() != null)
            sb.append("LabelingJobArn: " + getLabelingJobArn() + ",");
        if (getLabelAttributeName() != null)
            sb.append("LabelAttributeName: " + getLabelAttributeName() + ",");
        if (getInputConfig() != null)
            sb.append("InputConfig: " + getInputConfig() + ",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getLabelCategoryConfigS3Uri() != null)
            sb.append("LabelCategoryConfigS3Uri: " + getLabelCategoryConfigS3Uri() + ",");
        if (getStoppingConditions() != null)
            sb.append("StoppingConditions: " + getStoppingConditions() + ",");
        if (getLabelingJobAlgorithmsConfig() != null)
            sb.append("LabelingJobAlgorithmsConfig: " + getLabelingJobAlgorithmsConfig() + ",");
        if (getHumanTaskConfig() != null)
            sb.append("HumanTaskConfig: " + getHumanTaskConfig() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getLabelingJobOutput() != null)
            sb.append("LabelingJobOutput: " + getLabelingJobOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLabelingJobStatus() == null) ? 0 : getLabelingJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLabelCounters() == null) ? 0 : getLabelCounters().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getJobReferenceCode() == null) ? 0 : getJobReferenceCode().hashCode());
        hashCode = prime * hashCode
                + ((getLabelingJobName() == null) ? 0 : getLabelingJobName().hashCode());
        hashCode = prime * hashCode
                + ((getLabelingJobArn() == null) ? 0 : getLabelingJobArn().hashCode());
        hashCode = prime * hashCode
                + ((getLabelAttributeName() == null) ? 0 : getLabelAttributeName().hashCode());
        hashCode = prime * hashCode
                + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getLabelCategoryConfigS3Uri() == null) ? 0 : getLabelCategoryConfigS3Uri()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStoppingConditions() == null) ? 0 : getStoppingConditions().hashCode());
        hashCode = prime
                * hashCode
                + ((getLabelingJobAlgorithmsConfig() == null) ? 0
                        : getLabelingJobAlgorithmsConfig().hashCode());
        hashCode = prime * hashCode
                + ((getHumanTaskConfig() == null) ? 0 : getHumanTaskConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getLabelingJobOutput() == null) ? 0 : getLabelingJobOutput().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLabelingJobResult == false)
            return false;
        DescribeLabelingJobResult other = (DescribeLabelingJobResult) obj;

        if (other.getLabelingJobStatus() == null ^ this.getLabelingJobStatus() == null)
            return false;
        if (other.getLabelingJobStatus() != null
                && other.getLabelingJobStatus().equals(this.getLabelingJobStatus()) == false)
            return false;
        if (other.getLabelCounters() == null ^ this.getLabelCounters() == null)
            return false;
        if (other.getLabelCounters() != null
                && other.getLabelCounters().equals(this.getLabelCounters()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getJobReferenceCode() == null ^ this.getJobReferenceCode() == null)
            return false;
        if (other.getJobReferenceCode() != null
                && other.getJobReferenceCode().equals(this.getJobReferenceCode()) == false)
            return false;
        if (other.getLabelingJobName() == null ^ this.getLabelingJobName() == null)
            return false;
        if (other.getLabelingJobName() != null
                && other.getLabelingJobName().equals(this.getLabelingJobName()) == false)
            return false;
        if (other.getLabelingJobArn() == null ^ this.getLabelingJobArn() == null)
            return false;
        if (other.getLabelingJobArn() != null
                && other.getLabelingJobArn().equals(this.getLabelingJobArn()) == false)
            return false;
        if (other.getLabelAttributeName() == null ^ this.getLabelAttributeName() == null)
            return false;
        if (other.getLabelAttributeName() != null
                && other.getLabelAttributeName().equals(this.getLabelAttributeName()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null
                && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null
                && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLabelCategoryConfigS3Uri() == null
                ^ this.getLabelCategoryConfigS3Uri() == null)
            return false;
        if (other.getLabelCategoryConfigS3Uri() != null
                && other.getLabelCategoryConfigS3Uri().equals(this.getLabelCategoryConfigS3Uri()) == false)
            return false;
        if (other.getStoppingConditions() == null ^ this.getStoppingConditions() == null)
            return false;
        if (other.getStoppingConditions() != null
                && other.getStoppingConditions().equals(this.getStoppingConditions()) == false)
            return false;
        if (other.getLabelingJobAlgorithmsConfig() == null
                ^ this.getLabelingJobAlgorithmsConfig() == null)
            return false;
        if (other.getLabelingJobAlgorithmsConfig() != null
                && other.getLabelingJobAlgorithmsConfig().equals(
                        this.getLabelingJobAlgorithmsConfig()) == false)
            return false;
        if (other.getHumanTaskConfig() == null ^ this.getHumanTaskConfig() == null)
            return false;
        if (other.getHumanTaskConfig() != null
                && other.getHumanTaskConfig().equals(this.getHumanTaskConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLabelingJobOutput() == null ^ this.getLabelingJobOutput() == null)
            return false;
        if (other.getLabelingJobOutput() != null
                && other.getLabelingJobOutput().equals(this.getLabelingJobOutput()) == false)
            return false;
        return true;
    }
}
