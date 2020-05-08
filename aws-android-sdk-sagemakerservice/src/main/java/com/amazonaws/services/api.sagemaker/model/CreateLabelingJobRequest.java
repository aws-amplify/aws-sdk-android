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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a job that uses workers to label the data objects in your input
 * dataset. You can use the labeled data to train machine learning models.
 * </p>
 * <p>
 * You can select your workforce from one of three providers:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A private workforce that you create. It can include employees, contractors,
 * and outside experts. Use a private workforce when want the data to stay
 * within your organization or when a specific set of skills is required.
 * </p>
 * </li>
 * <li>
 * <p>
 * One or more vendors that you select from the AWS Marketplace. Vendors provide
 * expertise in specific areas.
 * </p>
 * </li>
 * <li>
 * <p>
 * The Amazon Mechanical Turk workforce. This is the largest workforce, but it
 * should only be used for public data or data that has been stripped of any
 * personally identifiable information.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can also use <i>automated data labeling</i> to reduce the number of data
 * objects that need to be labeled by a human. Automated data labeling uses
 * <i>active learning</i> to determine if a data object can be labeled by
 * machine or if it needs to be sent to a human worker. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-automated-labeling.html"
 * >Using Automated Data Labeling</a>.
 * </p>
 * <p>
 * The data objects to be labeled are contained in an Amazon S3 bucket. You
 * create a <i>manifest file</i> that describes the location of each object. For
 * more information, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-data.html">Using
 * Input and Output Data</a>.
 * </p>
 * <p>
 * The output can be used as the manifest file for another labeling job or as
 * training data for your machine learning models.
 * </p>
 */
public class CreateLabelingJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the labeling job. This name is used to identify the job in a
     * list of labeling jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String labelingJobName;

    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This
     * is the key for the key/value pair formed with the label that a worker
     * assigns to the object. The name can't end with "-metadata". If you are
     * running a semantic segmentation labeling job, the attribute name must end
     * with "-ref". If you are running any other kind of labeling job, the
     * attribute name must not end with "-ref".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String labelAttributeName;

    /**
     * <p>
     * Input data for the labeling job, such as the Amazon S3 location of the
     * data objects and the location of the manifest file that describes the
     * data objects.
     * </p>
     */
    private LabelingJobInputConfig inputConfig;

    /**
     * <p>
     * The location of the output data and the AWS Key Management Service key ID
     * for the key used to encrypt the output data, if any.
     * </p>
     */
    private LabelingJobOutputConfig outputConfig;

    /**
     * <p>
     * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform
     * tasks on your behalf during data labeling. You must grant this role the
     * necessary permissions so that Amazon SageMaker can successfully complete
     * data labeling.
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
     * The S3 URL of the file that defines the categories used to label the data
     * objects.
     * </p>
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
     * A set of conditions for stopping the labeling job. If any of the
     * conditions are met, the job is automatically stopped. You can use these
     * conditions to control the cost of data labeling.
     * </p>
     */
    private LabelingJobStoppingConditions stoppingConditions;

    /**
     * <p>
     * Configures the information required to perform automated data labeling.
     * </p>
     */
    private LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig;

    /**
     * <p>
     * Configures the labeling task and how it is presented to workers;
     * including, but not limited to price, keywords, and batch size (task
     * count).
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
     * The name of the labeling job. This name is used to identify the job in a
     * list of labeling jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the labeling job. This name is used to identify the
     *         job in a list of labeling jobs.
     *         </p>
     */
    public String getLabelingJobName() {
        return labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job. This name is used to identify the job in a
     * list of labeling jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param labelingJobName <p>
     *            The name of the labeling job. This name is used to identify
     *            the job in a list of labeling jobs.
     *            </p>
     */
    public void setLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job. This name is used to identify the job in a
     * list of labeling jobs.
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
     *            The name of the labeling job. This name is used to identify
     *            the job in a list of labeling jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLabelingJobRequest withLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
        return this;
    }

    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This
     * is the key for the key/value pair formed with the label that a worker
     * assigns to the object. The name can't end with "-metadata". If you are
     * running a semantic segmentation labeling job, the attribute name must end
     * with "-ref". If you are running any other kind of labeling job, the
     * attribute name must not end with "-ref".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The attribute name to use for the label in the output manifest
     *         file. This is the key for the key/value pair formed with the
     *         label that a worker assigns to the object. The name can't end
     *         with "-metadata". If you are running a semantic segmentation
     *         labeling job, the attribute name must end with "-ref". If you are
     *         running any other kind of labeling job, the attribute name must
     *         not end with "-ref".
     *         </p>
     */
    public String getLabelAttributeName() {
        return labelAttributeName;
    }

    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This
     * is the key for the key/value pair formed with the label that a worker
     * assigns to the object. The name can't end with "-metadata". If you are
     * running a semantic segmentation labeling job, the attribute name must end
     * with "-ref". If you are running any other kind of labeling job, the
     * attribute name must not end with "-ref".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param labelAttributeName <p>
     *            The attribute name to use for the label in the output manifest
     *            file. This is the key for the key/value pair formed with the
     *            label that a worker assigns to the object. The name can't end
     *            with "-metadata". If you are running a semantic segmentation
     *            labeling job, the attribute name must end with "-ref". If you
     *            are running any other kind of labeling job, the attribute name
     *            must not end with "-ref".
     *            </p>
     */
    public void setLabelAttributeName(String labelAttributeName) {
        this.labelAttributeName = labelAttributeName;
    }

    /**
     * <p>
     * The attribute name to use for the label in the output manifest file. This
     * is the key for the key/value pair formed with the label that a worker
     * assigns to the object. The name can't end with "-metadata". If you are
     * running a semantic segmentation labeling job, the attribute name must end
     * with "-ref". If you are running any other kind of labeling job, the
     * attribute name must not end with "-ref".
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
     *            The attribute name to use for the label in the output manifest
     *            file. This is the key for the key/value pair formed with the
     *            label that a worker assigns to the object. The name can't end
     *            with "-metadata". If you are running a semantic segmentation
     *            labeling job, the attribute name must end with "-ref". If you
     *            are running any other kind of labeling job, the attribute name
     *            must not end with "-ref".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLabelingJobRequest withLabelAttributeName(String labelAttributeName) {
        this.labelAttributeName = labelAttributeName;
        return this;
    }

    /**
     * <p>
     * Input data for the labeling job, such as the Amazon S3 location of the
     * data objects and the location of the manifest file that describes the
     * data objects.
     * </p>
     *
     * @return <p>
     *         Input data for the labeling job, such as the Amazon S3 location
     *         of the data objects and the location of the manifest file that
     *         describes the data objects.
     *         </p>
     */
    public LabelingJobInputConfig getInputConfig() {
        return inputConfig;
    }

    /**
     * <p>
     * Input data for the labeling job, such as the Amazon S3 location of the
     * data objects and the location of the manifest file that describes the
     * data objects.
     * </p>
     *
     * @param inputConfig <p>
     *            Input data for the labeling job, such as the Amazon S3
     *            location of the data objects and the location of the manifest
     *            file that describes the data objects.
     *            </p>
     */
    public void setInputConfig(LabelingJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Input data for the labeling job, such as the Amazon S3 location of the
     * data objects and the location of the manifest file that describes the
     * data objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputConfig <p>
     *            Input data for the labeling job, such as the Amazon S3
     *            location of the data objects and the location of the manifest
     *            file that describes the data objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLabelingJobRequest withInputConfig(LabelingJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }

    /**
     * <p>
     * The location of the output data and the AWS Key Management Service key ID
     * for the key used to encrypt the output data, if any.
     * </p>
     *
     * @return <p>
     *         The location of the output data and the AWS Key Management
     *         Service key ID for the key used to encrypt the output data, if
     *         any.
     *         </p>
     */
    public LabelingJobOutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * The location of the output data and the AWS Key Management Service key ID
     * for the key used to encrypt the output data, if any.
     * </p>
     *
     * @param outputConfig <p>
     *            The location of the output data and the AWS Key Management
     *            Service key ID for the key used to encrypt the output data, if
     *            any.
     *            </p>
     */
    public void setOutputConfig(LabelingJobOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The location of the output data and the AWS Key Management Service key ID
     * for the key used to encrypt the output data, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            The location of the output data and the AWS Key Management
     *            Service key ID for the key used to encrypt the output data, if
     *            any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLabelingJobRequest withOutputConfig(LabelingJobOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform
     * tasks on your behalf during data labeling. You must grant this role the
     * necessary permissions so that Amazon SageMaker can successfully complete
     * data labeling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) that Amazon SageMaker assumes to
     *         perform tasks on your behalf during data labeling. You must grant
     *         this role the necessary permissions so that Amazon SageMaker can
     *         successfully complete data labeling.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform
     * tasks on your behalf during data labeling. You must grant this role the
     * necessary permissions so that Amazon SageMaker can successfully complete
     * data labeling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Number (ARN) that Amazon SageMaker assumes
     *            to perform tasks on your behalf during data labeling. You must
     *            grant this role the necessary permissions so that Amazon
     *            SageMaker can successfully complete data labeling.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform
     * tasks on your behalf during data labeling. You must grant this role the
     * necessary permissions so that Amazon SageMaker can successfully complete
     * data labeling.
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
     *            The Amazon Resource Number (ARN) that Amazon SageMaker assumes
     *            to perform tasks on your behalf during data labeling. You must
     *            grant this role the necessary permissions so that Amazon
     *            SageMaker can successfully complete data labeling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLabelingJobRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The S3 URL of the file that defines the categories used to label the data
     * objects.
     * </p>
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
     *         The S3 URL of the file that defines the categories used to label
     *         the data objects.
     *         </p>
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
     * The S3 URL of the file that defines the categories used to label the data
     * objects.
     * </p>
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
     *            The S3 URL of the file that defines the categories used to
     *            label the data objects.
     *            </p>
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
     * The S3 URL of the file that defines the categories used to label the data
     * objects.
     * </p>
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
     *            The S3 URL of the file that defines the categories used to
     *            label the data objects.
     *            </p>
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
    public CreateLabelingJobRequest withLabelCategoryConfigS3Uri(String labelCategoryConfigS3Uri) {
        this.labelCategoryConfigS3Uri = labelCategoryConfigS3Uri;
        return this;
    }

    /**
     * <p>
     * A set of conditions for stopping the labeling job. If any of the
     * conditions are met, the job is automatically stopped. You can use these
     * conditions to control the cost of data labeling.
     * </p>
     *
     * @return <p>
     *         A set of conditions for stopping the labeling job. If any of the
     *         conditions are met, the job is automatically stopped. You can use
     *         these conditions to control the cost of data labeling.
     *         </p>
     */
    public LabelingJobStoppingConditions getStoppingConditions() {
        return stoppingConditions;
    }

    /**
     * <p>
     * A set of conditions for stopping the labeling job. If any of the
     * conditions are met, the job is automatically stopped. You can use these
     * conditions to control the cost of data labeling.
     * </p>
     *
     * @param stoppingConditions <p>
     *            A set of conditions for stopping the labeling job. If any of
     *            the conditions are met, the job is automatically stopped. You
     *            can use these conditions to control the cost of data labeling.
     *            </p>
     */
    public void setStoppingConditions(LabelingJobStoppingConditions stoppingConditions) {
        this.stoppingConditions = stoppingConditions;
    }

    /**
     * <p>
     * A set of conditions for stopping the labeling job. If any of the
     * conditions are met, the job is automatically stopped. You can use these
     * conditions to control the cost of data labeling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppingConditions <p>
     *            A set of conditions for stopping the labeling job. If any of
     *            the conditions are met, the job is automatically stopped. You
     *            can use these conditions to control the cost of data labeling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLabelingJobRequest withStoppingConditions(
            LabelingJobStoppingConditions stoppingConditions) {
        this.stoppingConditions = stoppingConditions;
        return this;
    }

    /**
     * <p>
     * Configures the information required to perform automated data labeling.
     * </p>
     *
     * @return <p>
     *         Configures the information required to perform automated data
     *         labeling.
     *         </p>
     */
    public LabelingJobAlgorithmsConfig getLabelingJobAlgorithmsConfig() {
        return labelingJobAlgorithmsConfig;
    }

    /**
     * <p>
     * Configures the information required to perform automated data labeling.
     * </p>
     *
     * @param labelingJobAlgorithmsConfig <p>
     *            Configures the information required to perform automated data
     *            labeling.
     *            </p>
     */
    public void setLabelingJobAlgorithmsConfig(
            LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig) {
        this.labelingJobAlgorithmsConfig = labelingJobAlgorithmsConfig;
    }

    /**
     * <p>
     * Configures the information required to perform automated data labeling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelingJobAlgorithmsConfig <p>
     *            Configures the information required to perform automated data
     *            labeling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLabelingJobRequest withLabelingJobAlgorithmsConfig(
            LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig) {
        this.labelingJobAlgorithmsConfig = labelingJobAlgorithmsConfig;
        return this;
    }

    /**
     * <p>
     * Configures the labeling task and how it is presented to workers;
     * including, but not limited to price, keywords, and batch size (task
     * count).
     * </p>
     *
     * @return <p>
     *         Configures the labeling task and how it is presented to workers;
     *         including, but not limited to price, keywords, and batch size
     *         (task count).
     *         </p>
     */
    public HumanTaskConfig getHumanTaskConfig() {
        return humanTaskConfig;
    }

    /**
     * <p>
     * Configures the labeling task and how it is presented to workers;
     * including, but not limited to price, keywords, and batch size (task
     * count).
     * </p>
     *
     * @param humanTaskConfig <p>
     *            Configures the labeling task and how it is presented to
     *            workers; including, but not limited to price, keywords, and
     *            batch size (task count).
     *            </p>
     */
    public void setHumanTaskConfig(HumanTaskConfig humanTaskConfig) {
        this.humanTaskConfig = humanTaskConfig;
    }

    /**
     * <p>
     * Configures the labeling task and how it is presented to workers;
     * including, but not limited to price, keywords, and batch size (task
     * count).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanTaskConfig <p>
     *            Configures the labeling task and how it is presented to
     *            workers; including, but not limited to price, keywords, and
     *            batch size (task count).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLabelingJobRequest withHumanTaskConfig(HumanTaskConfig humanTaskConfig) {
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
    public CreateLabelingJobRequest withTags(Tag... tags) {
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
    public CreateLabelingJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getLabelingJobName() != null)
            sb.append("LabelingJobName: " + getLabelingJobName() + ",");
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
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLabelingJobName() == null) ? 0 : getLabelingJobName().hashCode());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLabelingJobRequest == false)
            return false;
        CreateLabelingJobRequest other = (CreateLabelingJobRequest) obj;

        if (other.getLabelingJobName() == null ^ this.getLabelingJobName() == null)
            return false;
        if (other.getLabelingJobName() != null
                && other.getLabelingJobName().equals(this.getLabelingJobName()) == false)
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
        return true;
    }
}
