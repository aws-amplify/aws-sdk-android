/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new version of a model and begins training. Models are managed as
 * part of an Amazon Rekognition Custom Labels project. The response from
 * <code>CreateProjectVersion</code> is an Amazon Resource Name (ARN) for the
 * version of the model.
 * </p>
 * <p>
 * Training uses the training and test datasets associated with the project. For
 * more information, see Creating training and test dataset in the <i>Amazon
 * Rekognition Custom Labels Developer Guide</i>.
 * </p>
 * <note>
 * <p>
 * You can train a model in a project that doesn't have associated datasets by
 * specifying manifest files in the <code>TrainingData</code> and
 * <code>TestingData</code> fields.
 * </p>
 * <p>
 * If you open the console after training a model with manifest files, Amazon
 * Rekognition Custom Labels creates the datasets for you using the most recent
 * manifest files. You can no longer train a model version for the project by
 * specifying manifest files.
 * </p>
 * <p>
 * Instead of training with a project without associated datasets, we recommend
 * that you use the manifest files to create training and test datasets for the
 * project.
 * </p>
 * </note>
 * <p>
 * Training takes a while to complete. You can get the current status by calling
 * <a>DescribeProjectVersions</a>. Training completed successfully if the value
 * of the <code>Status</code> field is <code>TRAINING_COMPLETED</code>.
 * </p>
 * <p>
 * If training fails, see Debugging a failed model training in the <i>Amazon
 * Rekognition Custom Labels</i> developer guide.
 * </p>
 * <p>
 * Once training has successfully completed, call <a>DescribeProjectVersions</a>
 * to get the training results and evaluate the model. For more information, see
 * Improving a trained Amazon Rekognition Custom Labels model in the <i>Amazon
 * Rekognition Custom Labels</i> developers guide.
 * </p>
 * <p>
 * After evaluating the model, you start the model by calling
 * <a>StartProjectVersion</a>.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:CreateProjectVersion</code> action.
 * </p>
 */
public class CreateProjectVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the
     * model that you want to train.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String projectArn;

    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String versionName;

    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The S3
     * bucket can be in any AWS account as long as the caller has
     * <code>s3:PutObject</code> permissions on the S3 bucket.
     * </p>
     */
    private OutputConfig outputConfig;

    /**
     * <p>
     * Specifies an external manifest that the services uses to train the model.
     * If you specify <code>TrainingData</code> you must also specify
     * <code>TestingData</code>. The project must not have any associated
     * datasets.
     * </p>
     */
    private TrainingData trainingData;

    /**
     * <p>
     * Specifies an external manifest that the service uses to test the model.
     * If you specify <code>TestingData</code> you must also specify
     * <code>TrainingData</code>. The project must not have any associated
     * datasets.
     * </p>
     */
    private TestingData testingData;

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You
     * can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your
     * KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training and test images copied into the service for model
     * training. Your source images are unaffected. The key is also used to
     * encrypt training results and manifest files written to the output Amazon
     * S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions
     * on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied
     * into the service are encrypted using a key that AWS owns and manages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the
     * model that you want to train.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The ARN of the Amazon Rekognition Custom Labels project that
     *         manages the model that you want to train.
     *         </p>
     */
    public String getProjectArn() {
        return projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the
     * model that you want to train.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectArn <p>
     *            The ARN of the Amazon Rekognition Custom Labels project that
     *            manages the model that you want to train.
     *            </p>
     */
    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project that manages the
     * model that you want to train.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectArn <p>
     *            The ARN of the Amazon Rekognition Custom Labels project that
     *            manages the model that you want to train.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectVersionRequest withProjectArn(String projectArn) {
        this.projectArn = projectArn;
        return this;
    }

    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         A name for the version of the model. This value must be unique.
     *         </p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param versionName <p>
     *            A name for the version of the model. This value must be
     *            unique.
     *            </p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * A name for the version of the model. This value must be unique.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param versionName <p>
     *            A name for the version of the model. This value must be
     *            unique.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectVersionRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The S3
     * bucket can be in any AWS account as long as the caller has
     * <code>s3:PutObject</code> permissions on the S3 bucket.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket location to store the results of training.
     *         The S3 bucket can be in any AWS account as long as the caller has
     *         <code>s3:PutObject</code> permissions on the S3 bucket.
     *         </p>
     */
    public OutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The S3
     * bucket can be in any AWS account as long as the caller has
     * <code>s3:PutObject</code> permissions on the S3 bucket.
     * </p>
     *
     * @param outputConfig <p>
     *            The Amazon S3 bucket location to store the results of
     *            training. The S3 bucket can be in any AWS account as long as
     *            the caller has <code>s3:PutObject</code> permissions on the S3
     *            bucket.
     *            </p>
     */
    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The Amazon S3 bucket location to store the results of training. The S3
     * bucket can be in any AWS account as long as the caller has
     * <code>s3:PutObject</code> permissions on the S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            The Amazon S3 bucket location to store the results of
     *            training. The S3 bucket can be in any AWS account as long as
     *            the caller has <code>s3:PutObject</code> permissions on the S3
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectVersionRequest withOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * Specifies an external manifest that the services uses to train the model.
     * If you specify <code>TrainingData</code> you must also specify
     * <code>TestingData</code>. The project must not have any associated
     * datasets.
     * </p>
     *
     * @return <p>
     *         Specifies an external manifest that the services uses to train
     *         the model. If you specify <code>TrainingData</code> you must also
     *         specify <code>TestingData</code>. The project must not have any
     *         associated datasets.
     *         </p>
     */
    public TrainingData getTrainingData() {
        return trainingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the services uses to train the model.
     * If you specify <code>TrainingData</code> you must also specify
     * <code>TestingData</code>. The project must not have any associated
     * datasets.
     * </p>
     *
     * @param trainingData <p>
     *            Specifies an external manifest that the services uses to train
     *            the model. If you specify <code>TrainingData</code> you must
     *            also specify <code>TestingData</code>. The project must not
     *            have any associated datasets.
     *            </p>
     */
    public void setTrainingData(TrainingData trainingData) {
        this.trainingData = trainingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the services uses to train the model.
     * If you specify <code>TrainingData</code> you must also specify
     * <code>TestingData</code>. The project must not have any associated
     * datasets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingData <p>
     *            Specifies an external manifest that the services uses to train
     *            the model. If you specify <code>TrainingData</code> you must
     *            also specify <code>TestingData</code>. The project must not
     *            have any associated datasets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectVersionRequest withTrainingData(TrainingData trainingData) {
        this.trainingData = trainingData;
        return this;
    }

    /**
     * <p>
     * Specifies an external manifest that the service uses to test the model.
     * If you specify <code>TestingData</code> you must also specify
     * <code>TrainingData</code>. The project must not have any associated
     * datasets.
     * </p>
     *
     * @return <p>
     *         Specifies an external manifest that the service uses to test the
     *         model. If you specify <code>TestingData</code> you must also
     *         specify <code>TrainingData</code>. The project must not have any
     *         associated datasets.
     *         </p>
     */
    public TestingData getTestingData() {
        return testingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the service uses to test the model.
     * If you specify <code>TestingData</code> you must also specify
     * <code>TrainingData</code>. The project must not have any associated
     * datasets.
     * </p>
     *
     * @param testingData <p>
     *            Specifies an external manifest that the service uses to test
     *            the model. If you specify <code>TestingData</code> you must
     *            also specify <code>TrainingData</code>. The project must not
     *            have any associated datasets.
     *            </p>
     */
    public void setTestingData(TestingData testingData) {
        this.testingData = testingData;
    }

    /**
     * <p>
     * Specifies an external manifest that the service uses to test the model.
     * If you specify <code>TestingData</code> you must also specify
     * <code>TrainingData</code>. The project must not have any associated
     * datasets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param testingData <p>
     *            Specifies an external manifest that the service uses to test
     *            the model. If you specify <code>TestingData</code> you must
     *            also specify <code>TrainingData</code>. The project must not
     *            have any associated datasets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectVersionRequest withTestingData(TestingData testingData) {
        this.testingData = testingData;
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     *
     * @return <p>
     *         A set of tags (key-value pairs) that you want to attach to the
     *         model.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) that you want to attach to the
     *            model.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) that you want to attach to the
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectVersionRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the model.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectVersionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateProjectVersionRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You
     * can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your
     * KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training and test images copied into the service for model
     * training. Your source images are unaffected. The key is also used to
     * encrypt training results and manifest files written to the output Amazon
     * S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions
     * on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied
     * into the service are encrypted using a key that AWS owns and manages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The identifier for your AWS Key Management Service key (AWS KMS
     *         key). You can supply the Amazon Resource Name (ARN) of your KMS
     *         key, the ID of your KMS key, an alias for your KMS key, or an
     *         alias ARN. The key is used to encrypt training and test images
     *         copied into the service for model training. Your source images
     *         are unaffected. The key is also used to encrypt training results
     *         and manifest files written to the output Amazon S3 bucket (
     *         <code>OutputConfig</code>).
     *         </p>
     *         <p>
     *         If you choose to use your own KMS key, you need the following
     *         permissions on the KMS key.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         kms:CreateGrant
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:DescribeKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:GenerateDataKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         kms:Decrypt
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a value for <code>KmsKeyId</code>, images
     *         copied into the service are encrypted using a key that AWS owns
     *         and manages.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You
     * can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your
     * KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training and test images copied into the service for model
     * training. Your source images are unaffected. The key is also used to
     * encrypt training results and manifest files written to the output Amazon
     * S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions
     * on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied
     * into the service are encrypted using a key that AWS owns and manages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifier for your AWS Key Management Service key (AWS
     *            KMS key). You can supply the Amazon Resource Name (ARN) of
     *            your KMS key, the ID of your KMS key, an alias for your KMS
     *            key, or an alias ARN. The key is used to encrypt training and
     *            test images copied into the service for model training. Your
     *            source images are unaffected. The key is also used to encrypt
     *            training results and manifest files written to the output
     *            Amazon S3 bucket (<code>OutputConfig</code>).
     *            </p>
     *            <p>
     *            If you choose to use your own KMS key, you need the following
     *            permissions on the KMS key.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            kms:CreateGrant
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:DescribeKey
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:GenerateDataKey
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:Decrypt
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a value for <code>KmsKeyId</code>, images
     *            copied into the service are encrypted using a key that AWS
     *            owns and manages.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). You
     * can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your
     * KMS key, an alias for your KMS key, or an alias ARN. The key is used to
     * encrypt training and test images copied into the service for model
     * training. Your source images are unaffected. The key is also used to
     * encrypt training results and manifest files written to the output Amazon
     * S3 bucket (<code>OutputConfig</code>).
     * </p>
     * <p>
     * If you choose to use your own KMS key, you need the following permissions
     * on the KMS key.
     * </p>
     * <ul>
     * <li>
     * <p>
     * kms:CreateGrant
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:DescribeKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:GenerateDataKey
     * </p>
     * </li>
     * <li>
     * <p>
     * kms:Decrypt
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>KmsKeyId</code>, images copied
     * into the service are encrypted using a key that AWS owns and manages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifier for your AWS Key Management Service key (AWS
     *            KMS key). You can supply the Amazon Resource Name (ARN) of
     *            your KMS key, the ID of your KMS key, an alias for your KMS
     *            key, or an alias ARN. The key is used to encrypt training and
     *            test images copied into the service for model training. Your
     *            source images are unaffected. The key is also used to encrypt
     *            training results and manifest files written to the output
     *            Amazon S3 bucket (<code>OutputConfig</code>).
     *            </p>
     *            <p>
     *            If you choose to use your own KMS key, you need the following
     *            permissions on the KMS key.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            kms:CreateGrant
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:DescribeKey
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:GenerateDataKey
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            kms:Decrypt
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you don't specify a value for <code>KmsKeyId</code>, images
     *            copied into the service are encrypted using a key that AWS
     *            owns and manages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProjectVersionRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: " + getProjectArn() + ",");
        if (getVersionName() != null)
            sb.append("VersionName: " + getVersionName() + ",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        if (getTrainingData() != null)
            sb.append("TrainingData: " + getTrainingData() + ",");
        if (getTestingData() != null)
            sb.append("TestingData: " + getTestingData() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode
                + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode
                + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingData() == null) ? 0 : getTrainingData().hashCode());
        hashCode = prime * hashCode
                + ((getTestingData() == null) ? 0 : getTestingData().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectVersionRequest == false)
            return false;
        CreateProjectVersionRequest other = (CreateProjectVersionRequest) obj;

        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null
                && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null
                && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null
                && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getTrainingData() == null ^ this.getTrainingData() == null)
            return false;
        if (other.getTrainingData() != null
                && other.getTrainingData().equals(this.getTrainingData()) == false)
            return false;
        if (other.getTestingData() == null ^ this.getTestingData() == null)
            return false;
        if (other.getTestingData() != null
                && other.getTestingData().equals(this.getTestingData()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
