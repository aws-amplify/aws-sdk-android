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
 * Provides information about a document classifier.
 * </p>
 */
public class DocumentClassifierProperties implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
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
     * The language code for the language of the documents that the classifier
     * was trained on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     */
    private String languageCode;

    /**
     * <p>
     * The status of the document classifier. If the status is
     * <code>TRAINED</code> the classifier is ready to use. If the status is
     * <code>FAILED</code> you can see additional information about why the
     * classifier wasn't trained in the <code>Message</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     */
    private String status;

    /**
     * <p>
     * Additional information about the status of the classifier.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The time that the document classifier was submitted for training.
     * </p>
     */
    private java.util.Date submitTime;

    /**
     * <p>
     * The time that training the document classifier completed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * Indicates the time when the training starts on documentation classifiers.
     * You are billed for the time interval between this time and the value of
     * TrainingEndTime.
     * </p>
     */
    private java.util.Date trainingStartTime;

    /**
     * <p>
     * The time that training of the document classifier was completed.
     * Indicates the time when the training completes on documentation
     * classifiers. You are billed for the time interval between this time and
     * the value of TrainingStartTime.
     * </p>
     */
    private java.util.Date trainingEndTime;

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * document classifier for training.
     * </p>
     */
    private DocumentClassifierInputDataConfig inputDataConfig;

    /**
     * <p>
     * Provides output results configuration parameters for custom classifier
     * jobs.
     * </p>
     */
    private DocumentClassifierOutputDataConfig outputDataConfig;

    /**
     * <p>
     * Information about the document classifier, including the number of
     * documents used for training the classifier, the number of documents used
     * for test the classifier, and an accuracy rating.
     * </p>
     */
    private ClassifierMetadata classifierMetadata;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM)
     * role that grants Amazon Comprehend read access to your input data.
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
     * <b>Pattern: </b>.*<br/>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * Indicates the mode in which the specific classifier was trained. This
     * also indicates the format of input documents and the format of the
     * confusion matrix. Each classifier can only be trained in one mode and
     * this cannot be changed once the classifier is trained.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     */
    private String mode;

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt trained custom models. The ModelKmsKeyId can be either of
     * the following formats:
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
     * <b>Pattern: </b>.*<br/>
     */
    private String modelKmsKeyId;

    /**
     * <p>
     * The version name that you assigned to the document classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String versionName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source model. This model was
     * imported from a different AWS account to create the document classifier
     * model in your AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
     */
    private String sourceModelArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the document classifier.
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
     * -classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
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
     * -classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param documentClassifierArn <p>
     *            The Amazon Resource Name (ARN) that identifies the document
     *            classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withDocumentClassifierArn(String documentClassifierArn) {
        this.documentClassifierArn = documentClassifierArn;
        return this;
    }

    /**
     * <p>
     * The language code for the language of the documents that the classifier
     * was trained on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @return <p>
     *         The language code for the language of the documents that the
     *         classifier was trained on.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code for the language of the documents that the classifier
     * was trained on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language code for the language of the documents that the
     *            classifier was trained on.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the language of the documents that the classifier
     * was trained on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language code for the language of the documents that the
     *            classifier was trained on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public DocumentClassifierProperties withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code for the language of the documents that the classifier
     * was trained on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language code for the language of the documents that the
     *            classifier was trained on.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code for the language of the documents that the classifier
     * was trained on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language code for the language of the documents that the
     *            classifier was trained on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public DocumentClassifierProperties withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the document classifier. If the status is
     * <code>TRAINED</code> the classifier is ready to use. If the status is
     * <code>FAILED</code> you can see additional information about why the
     * classifier wasn't trained in the <code>Message</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     *
     * @return <p>
     *         The status of the document classifier. If the status is
     *         <code>TRAINED</code> the classifier is ready to use. If the
     *         status is <code>FAILED</code> you can see additional information
     *         about why the classifier wasn't trained in the
     *         <code>Message</code> field.
     *         </p>
     * @see ModelStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the document classifier. If the status is
     * <code>TRAINED</code> the classifier is ready to use. If the status is
     * <code>FAILED</code> you can see additional information about why the
     * classifier wasn't trained in the <code>Message</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            The status of the document classifier. If the status is
     *            <code>TRAINED</code> the classifier is ready to use. If the
     *            status is <code>FAILED</code> you can see additional
     *            information about why the classifier wasn't trained in the
     *            <code>Message</code> field.
     *            </p>
     * @see ModelStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the document classifier. If the status is
     * <code>TRAINED</code> the classifier is ready to use. If the status is
     * <code>FAILED</code> you can see additional information about why the
     * classifier wasn't trained in the <code>Message</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            The status of the document classifier. If the status is
     *            <code>TRAINED</code> the classifier is ready to use. If the
     *            status is <code>FAILED</code> you can see additional
     *            information about why the classifier wasn't trained in the
     *            <code>Message</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public DocumentClassifierProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the document classifier. If the status is
     * <code>TRAINED</code> the classifier is ready to use. If the status is
     * <code>FAILED</code> you can see additional information about why the
     * classifier wasn't trained in the <code>Message</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            The status of the document classifier. If the status is
     *            <code>TRAINED</code> the classifier is ready to use. If the
     *            status is <code>FAILED</code> you can see additional
     *            information about why the classifier wasn't trained in the
     *            <code>Message</code> field.
     *            </p>
     * @see ModelStatus
     */
    public void setStatus(ModelStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the document classifier. If the status is
     * <code>TRAINED</code> the classifier is ready to use. If the status is
     * <code>FAILED</code> you can see additional information about why the
     * classifier wasn't trained in the <code>Message</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            The status of the document classifier. If the status is
     *            <code>TRAINED</code> the classifier is ready to use. If the
     *            status is <code>FAILED</code> you can see additional
     *            information about why the classifier wasn't trained in the
     *            <code>Message</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public DocumentClassifierProperties withStatus(ModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the status of the classifier.
     * </p>
     *
     * @return <p>
     *         Additional information about the status of the classifier.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Additional information about the status of the classifier.
     * </p>
     *
     * @param message <p>
     *            Additional information about the status of the classifier.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Additional information about the status of the classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            Additional information about the status of the classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The time that the document classifier was submitted for training.
     * </p>
     *
     * @return <p>
     *         The time that the document classifier was submitted for training.
     *         </p>
     */
    public java.util.Date getSubmitTime() {
        return submitTime;
    }

    /**
     * <p>
     * The time that the document classifier was submitted for training.
     * </p>
     *
     * @param submitTime <p>
     *            The time that the document classifier was submitted for
     *            training.
     *            </p>
     */
    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time that the document classifier was submitted for training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submitTime <p>
     *            The time that the document classifier was submitted for
     *            training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * <p>
     * The time that training the document classifier completed.
     * </p>
     *
     * @return <p>
     *         The time that training the document classifier completed.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time that training the document classifier completed.
     * </p>
     *
     * @param endTime <p>
     *            The time that training the document classifier completed.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that training the document classifier completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time that training the document classifier completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * Indicates the time when the training starts on documentation classifiers.
     * You are billed for the time interval between this time and the value of
     * TrainingEndTime.
     * </p>
     *
     * @return <p>
     *         Indicates the time when the training starts on documentation
     *         classifiers. You are billed for the time interval between this
     *         time and the value of TrainingEndTime.
     *         </p>
     */
    public java.util.Date getTrainingStartTime() {
        return trainingStartTime;
    }

    /**
     * <p>
     * Indicates the time when the training starts on documentation classifiers.
     * You are billed for the time interval between this time and the value of
     * TrainingEndTime.
     * </p>
     *
     * @param trainingStartTime <p>
     *            Indicates the time when the training starts on documentation
     *            classifiers. You are billed for the time interval between this
     *            time and the value of TrainingEndTime.
     *            </p>
     */
    public void setTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
    }

    /**
     * <p>
     * Indicates the time when the training starts on documentation classifiers.
     * You are billed for the time interval between this time and the value of
     * TrainingEndTime.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingStartTime <p>
     *            Indicates the time when the training starts on documentation
     *            classifiers. You are billed for the time interval between this
     *            time and the value of TrainingEndTime.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
        return this;
    }

    /**
     * <p>
     * The time that training of the document classifier was completed.
     * Indicates the time when the training completes on documentation
     * classifiers. You are billed for the time interval between this time and
     * the value of TrainingStartTime.
     * </p>
     *
     * @return <p>
     *         The time that training of the document classifier was completed.
     *         Indicates the time when the training completes on documentation
     *         classifiers. You are billed for the time interval between this
     *         time and the value of TrainingStartTime.
     *         </p>
     */
    public java.util.Date getTrainingEndTime() {
        return trainingEndTime;
    }

    /**
     * <p>
     * The time that training of the document classifier was completed.
     * Indicates the time when the training completes on documentation
     * classifiers. You are billed for the time interval between this time and
     * the value of TrainingStartTime.
     * </p>
     *
     * @param trainingEndTime <p>
     *            The time that training of the document classifier was
     *            completed. Indicates the time when the training completes on
     *            documentation classifiers. You are billed for the time
     *            interval between this time and the value of TrainingStartTime.
     *            </p>
     */
    public void setTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
    }

    /**
     * <p>
     * The time that training of the document classifier was completed.
     * Indicates the time when the training completes on documentation
     * classifiers. You are billed for the time interval between this time and
     * the value of TrainingStartTime.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingEndTime <p>
     *            The time that training of the document classifier was
     *            completed. Indicates the time when the training completes on
     *            documentation classifiers. You are billed for the time
     *            interval between this time and the value of TrainingStartTime.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
        return this;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * document classifier for training.
     * </p>
     *
     * @return <p>
     *         The input data configuration that you supplied when you created
     *         the document classifier for training.
     *         </p>
     */
    public DocumentClassifierInputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * document classifier for training.
     * </p>
     *
     * @param inputDataConfig <p>
     *            The input data configuration that you supplied when you
     *            created the document classifier for training.
     *            </p>
     */
    public void setInputDataConfig(DocumentClassifierInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that you supplied when you created the
     * document classifier for training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            The input data configuration that you supplied when you
     *            created the document classifier for training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withInputDataConfig(
            DocumentClassifierInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
        return this;
    }

    /**
     * <p>
     * Provides output results configuration parameters for custom classifier
     * jobs.
     * </p>
     *
     * @return <p>
     *         Provides output results configuration parameters for custom
     *         classifier jobs.
     *         </p>
     */
    public DocumentClassifierOutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * Provides output results configuration parameters for custom classifier
     * jobs.
     * </p>
     *
     * @param outputDataConfig <p>
     *            Provides output results configuration parameters for custom
     *            classifier jobs.
     *            </p>
     */
    public void setOutputDataConfig(DocumentClassifierOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Provides output results configuration parameters for custom classifier
     * jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            Provides output results configuration parameters for custom
     *            classifier jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withOutputDataConfig(
            DocumentClassifierOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * Information about the document classifier, including the number of
     * documents used for training the classifier, the number of documents used
     * for test the classifier, and an accuracy rating.
     * </p>
     *
     * @return <p>
     *         Information about the document classifier, including the number
     *         of documents used for training the classifier, the number of
     *         documents used for test the classifier, and an accuracy rating.
     *         </p>
     */
    public ClassifierMetadata getClassifierMetadata() {
        return classifierMetadata;
    }

    /**
     * <p>
     * Information about the document classifier, including the number of
     * documents used for training the classifier, the number of documents used
     * for test the classifier, and an accuracy rating.
     * </p>
     *
     * @param classifierMetadata <p>
     *            Information about the document classifier, including the
     *            number of documents used for training the classifier, the
     *            number of documents used for test the classifier, and an
     *            accuracy rating.
     *            </p>
     */
    public void setClassifierMetadata(ClassifierMetadata classifierMetadata) {
        this.classifierMetadata = classifierMetadata;
    }

    /**
     * <p>
     * Information about the document classifier, including the number of
     * documents used for training the classifier, the number of documents used
     * for test the classifier, and an accuracy rating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classifierMetadata <p>
     *            Information about the document classifier, including the
     *            number of documents used for training the classifier, the
     *            number of documents used for test the classifier, and an
     *            accuracy rating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withClassifierMetadata(ClassifierMetadata classifierMetadata) {
        this.classifierMetadata = classifierMetadata;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM)
     * role that grants Amazon Comprehend read access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Identity and Management
     *         (IAM) role that grants Amazon Comprehend read access to your
     *         input data.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM)
     * role that grants Amazon Comprehend read access to your input data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Identity and
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to your input data.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM)
     * role that grants Amazon Comprehend read access to your input data.
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
     *            The Amazon Resource Name (ARN) of the AWS Identity and
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to your input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withDataAccessRoleArn(String dataAccessRoleArn) {
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
     * <b>Pattern: </b>.*<br/>
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
     * <b>Pattern: </b>.*<br/>
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
     * <b>Pattern: </b>.*<br/>
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
    public DocumentClassifierProperties withVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
        return this;
    }

    /**
     * <p>
     * Configuration parameters for a private Virtual Private Cloud (VPC)
     * containing the resources you are using for your custom classifier. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     *
     * @return <p>
     *         Configuration parameters for a private Virtual Private Cloud
     *         (VPC) containing the resources you are using for your custom
     *         classifier. For more information, see <a href=
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
     * containing the resources you are using for your custom classifier. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            Configuration parameters for a private Virtual Private Cloud
     *            (VPC) containing the resources you are using for your custom
     *            classifier. For more information, see <a href=
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
     * containing the resources you are using for your custom classifier. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     * >Amazon VPC</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            Configuration parameters for a private Virtual Private Cloud
     *            (VPC) containing the resources you are using for your custom
     *            classifier. For more information, see <a href=
     *            "https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html"
     *            >Amazon VPC</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * <p>
     * Indicates the mode in which the specific classifier was trained. This
     * also indicates the format of input documents and the format of the
     * confusion matrix. Each classifier can only be trained in one mode and
     * this cannot be changed once the classifier is trained.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     *
     * @return <p>
     *         Indicates the mode in which the specific classifier was trained.
     *         This also indicates the format of input documents and the format
     *         of the confusion matrix. Each classifier can only be trained in
     *         one mode and this cannot be changed once the classifier is
     *         trained.
     *         </p>
     * @see DocumentClassifierMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * Indicates the mode in which the specific classifier was trained. This
     * also indicates the format of input documents and the format of the
     * confusion matrix. Each classifier can only be trained in one mode and
     * this cannot be changed once the classifier is trained.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     *
     * @param mode <p>
     *            Indicates the mode in which the specific classifier was
     *            trained. This also indicates the format of input documents and
     *            the format of the confusion matrix. Each classifier can only
     *            be trained in one mode and this cannot be changed once the
     *            classifier is trained.
     *            </p>
     * @see DocumentClassifierMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Indicates the mode in which the specific classifier was trained. This
     * also indicates the format of input documents and the format of the
     * confusion matrix. Each classifier can only be trained in one mode and
     * this cannot be changed once the classifier is trained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     *
     * @param mode <p>
     *            Indicates the mode in which the specific classifier was
     *            trained. This also indicates the format of input documents and
     *            the format of the confusion matrix. Each classifier can only
     *            be trained in one mode and this cannot be changed once the
     *            classifier is trained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentClassifierMode
     */
    public DocumentClassifierProperties withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * Indicates the mode in which the specific classifier was trained. This
     * also indicates the format of input documents and the format of the
     * confusion matrix. Each classifier can only be trained in one mode and
     * this cannot be changed once the classifier is trained.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     *
     * @param mode <p>
     *            Indicates the mode in which the specific classifier was
     *            trained. This also indicates the format of input documents and
     *            the format of the confusion matrix. Each classifier can only
     *            be trained in one mode and this cannot be changed once the
     *            classifier is trained.
     *            </p>
     * @see DocumentClassifierMode
     */
    public void setMode(DocumentClassifierMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * Indicates the mode in which the specific classifier was trained. This
     * also indicates the format of input documents and the format of the
     * confusion matrix. Each classifier can only be trained in one mode and
     * this cannot be changed once the classifier is trained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     *
     * @param mode <p>
     *            Indicates the mode in which the specific classifier was
     *            trained. This also indicates the format of input documents and
     *            the format of the confusion matrix. Each classifier can only
     *            be trained in one mode and this cannot be changed once the
     *            classifier is trained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentClassifierMode
     */
    public DocumentClassifierProperties withMode(DocumentClassifierMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt trained custom models. The ModelKmsKeyId can be either of
     * the following formats:
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
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         ID for the AWS Key Management Service (KMS) key that Amazon
     *         Comprehend uses to encrypt trained custom models. The
     *         ModelKmsKeyId can be either of the following formats:
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
    public String getModelKmsKeyId() {
        return modelKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt trained custom models. The ModelKmsKeyId can be either of
     * the following formats:
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
     * <b>Pattern: </b>.*<br/>
     *
     * @param modelKmsKeyId <p>
     *            ID for the AWS Key Management Service (KMS) key that Amazon
     *            Comprehend uses to encrypt trained custom models. The
     *            ModelKmsKeyId can be either of the following formats:
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
    public void setModelKmsKeyId(String modelKmsKeyId) {
        this.modelKmsKeyId = modelKmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend
     * uses to encrypt trained custom models. The ModelKmsKeyId can be either of
     * the following formats:
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
     * <b>Pattern: </b>.*<br/>
     *
     * @param modelKmsKeyId <p>
     *            ID for the AWS Key Management Service (KMS) key that Amazon
     *            Comprehend uses to encrypt trained custom models. The
     *            ModelKmsKeyId can be either of the following formats:
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
    public DocumentClassifierProperties withModelKmsKeyId(String modelKmsKeyId) {
        this.modelKmsKeyId = modelKmsKeyId;
        return this;
    }

    /**
     * <p>
     * The version name that you assigned to the document classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The version name that you assigned to the document classifier.
     *         </p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>
     * The version name that you assigned to the document classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param versionName <p>
     *            The version name that you assigned to the document classifier.
     *            </p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The version name that you assigned to the document classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param versionName <p>
     *            The version name that you assigned to the document classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source model. This model was
     * imported from a different AWS account to create the document classifier
     * model in your AWS account.
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
     *         The Amazon Resource Name (ARN) of the source model. This model
     *         was imported from a different AWS account to create the document
     *         classifier model in your AWS account.
     *         </p>
     */
    public String getSourceModelArn() {
        return sourceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source model. This model was
     * imported from a different AWS account to create the document classifier
     * model in your AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:document
     * -classifier
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param sourceModelArn <p>
     *            The Amazon Resource Name (ARN) of the source model. This model
     *            was imported from a different AWS account to create the
     *            document classifier model in your AWS account.
     *            </p>
     */
    public void setSourceModelArn(String sourceModelArn) {
        this.sourceModelArn = sourceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source model. This model was
     * imported from a different AWS account to create the document classifier
     * model in your AWS account.
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
     * @param sourceModelArn <p>
     *            The Amazon Resource Name (ARN) of the source model. This model
     *            was imported from a different AWS account to create the
     *            document classifier model in your AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassifierProperties withSourceModelArn(String sourceModelArn) {
        this.sourceModelArn = sourceModelArn;
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
        if (getDocumentClassifierArn() != null)
            sb.append("DocumentClassifierArn: " + getDocumentClassifierArn() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: " + getSubmitTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getTrainingStartTime() != null)
            sb.append("TrainingStartTime: " + getTrainingStartTime() + ",");
        if (getTrainingEndTime() != null)
            sb.append("TrainingEndTime: " + getTrainingEndTime() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getClassifierMetadata() != null)
            sb.append("ClassifierMetadata: " + getClassifierMetadata() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: " + getVolumeKmsKeyId() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getModelKmsKeyId() != null)
            sb.append("ModelKmsKeyId: " + getModelKmsKeyId() + ",");
        if (getVersionName() != null)
            sb.append("VersionName: " + getVersionName() + ",");
        if (getSourceModelArn() != null)
            sb.append("SourceModelArn: " + getSourceModelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDocumentClassifierArn() == null) ? 0 : getDocumentClassifierArn().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingStartTime() == null) ? 0 : getTrainingStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingEndTime() == null) ? 0 : getTrainingEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getClassifierMetadata() == null) ? 0 : getClassifierMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode
                + ((getModelKmsKeyId() == null) ? 0 : getModelKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceModelArn() == null) ? 0 : getSourceModelArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentClassifierProperties == false)
            return false;
        DocumentClassifierProperties other = (DocumentClassifierProperties) obj;

        if (other.getDocumentClassifierArn() == null ^ this.getDocumentClassifierArn() == null)
            return false;
        if (other.getDocumentClassifierArn() != null
                && other.getDocumentClassifierArn().equals(this.getDocumentClassifierArn()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getTrainingStartTime() == null ^ this.getTrainingStartTime() == null)
            return false;
        if (other.getTrainingStartTime() != null
                && other.getTrainingStartTime().equals(this.getTrainingStartTime()) == false)
            return false;
        if (other.getTrainingEndTime() == null ^ this.getTrainingEndTime() == null)
            return false;
        if (other.getTrainingEndTime() != null
                && other.getTrainingEndTime().equals(this.getTrainingEndTime()) == false)
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
        if (other.getClassifierMetadata() == null ^ this.getClassifierMetadata() == null)
            return false;
        if (other.getClassifierMetadata() != null
                && other.getClassifierMetadata().equals(this.getClassifierMetadata()) == false)
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
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getModelKmsKeyId() == null ^ this.getModelKmsKeyId() == null)
            return false;
        if (other.getModelKmsKeyId() != null
                && other.getModelKmsKeyId().equals(this.getModelKmsKeyId()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null
                && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getSourceModelArn() == null ^ this.getSourceModelArn() == null)
            return false;
        if (other.getSourceModelArn() != null
                && other.getSourceModelArn().equals(this.getSourceModelArn()) == false)
            return false;
        return true;
    }
}
