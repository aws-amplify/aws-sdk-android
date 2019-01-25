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
 * Describes information about an entity recognizer.
 * </p>
 */
public class EntityRecognizerProperties implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity-recognizer
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String entityRecognizerArn;

    /**
     * <p>
     * The language of the input documents. All documents must be in the same
     * language. Only English ("en") is currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     */
    private String languageCode;

    /**
     * <p>
     * Provides the status of the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     */
    private String status;

    /**
     * <p>
     * A description of the status of the recognizer.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The time that the recognizer was submitted for processing.
     * </p>
     */
    private java.util.Date submitTime;

    /**
     * <p>
     * The time that the recognizer creation completed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The time that training of the entity recognizer started.
     * </p>
     */
    private java.util.Date trainingStartTime;

    /**
     * <p>
     * The time that training of the entity recognizer was completed.
     * </p>
     */
    private java.util.Date trainingEndTime;

    /**
     * <p>
     * The input data properties of an entity recognizer.
     * </p>
     */
    private EntityRecognizerInputDataConfig inputDataConfig;

    /**
     * <p>
     * Provides information about an entity recognizer.
     * </p>
     */
    private EntityRecognizerMetadata recognizerMetadata;

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
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity-recognizer
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the entity
     *         recognizer.
     *         </p>
     */
    public String getEntityRecognizerArn() {
        return entityRecognizerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity-recognizer
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param entityRecognizerArn <p>
     *            The Amazon Resource Name (ARN) that identifies the entity
     *            recognizer.
     *            </p>
     */
    public void setEntityRecognizerArn(String entityRecognizerArn) {
        this.entityRecognizerArn = entityRecognizerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity-recognizer
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param entityRecognizerArn <p>
     *            The Amazon Resource Name (ARN) that identifies the entity
     *            recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerProperties withEntityRecognizerArn(String entityRecognizerArn) {
        this.entityRecognizerArn = entityRecognizerArn;
        return this;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same
     * language. Only English ("en") is currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     *
     * @return <p>
     *         The language of the input documents. All documents must be in the
     *         same language. Only English ("en") is currently supported.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same
     * language. Only English ("en") is currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     *
     * @param languageCode <p>
     *            The language of the input documents. All documents must be in
     *            the same language. Only English ("en") is currently supported.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same
     * language. Only English ("en") is currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     *
     * @param languageCode <p>
     *            The language of the input documents. All documents must be in
     *            the same language. Only English ("en") is currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public EntityRecognizerProperties withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same
     * language. Only English ("en") is currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     *
     * @param languageCode <p>
     *            The language of the input documents. All documents must be in
     *            the same language. Only English ("en") is currently supported.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language of the input documents. All documents must be in the same
     * language. Only English ("en") is currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     *
     * @param languageCode <p>
     *            The language of the input documents. All documents must be in
     *            the same language. Only English ("en") is currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public EntityRecognizerProperties withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Provides the status of the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     *
     * @return <p>
     *         Provides the status of the entity recognizer.
     *         </p>
     * @see ModelStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Provides the status of the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            Provides the status of the entity recognizer.
     *            </p>
     * @see ModelStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides the status of the entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            Provides the status of the entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public EntityRecognizerProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Provides the status of the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            Provides the status of the entity recognizer.
     *            </p>
     * @see ModelStatus
     */
    public void setStatus(ModelStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Provides the status of the entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, IN_ERROR, TRAINED
     *
     * @param status <p>
     *            Provides the status of the entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public EntityRecognizerProperties withStatus(ModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the recognizer.
     * </p>
     *
     * @return <p>
     *         A description of the status of the recognizer.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A description of the status of the recognizer.
     * </p>
     *
     * @param message <p>
     *            A description of the status of the recognizer.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A description of the status of the recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The time that the recognizer was submitted for processing.
     * </p>
     *
     * @return <p>
     *         The time that the recognizer was submitted for processing.
     *         </p>
     */
    public java.util.Date getSubmitTime() {
        return submitTime;
    }

    /**
     * <p>
     * The time that the recognizer was submitted for processing.
     * </p>
     *
     * @param submitTime <p>
     *            The time that the recognizer was submitted for processing.
     *            </p>
     */
    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time that the recognizer was submitted for processing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submitTime <p>
     *            The time that the recognizer was submitted for processing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerProperties withSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * <p>
     * The time that the recognizer creation completed.
     * </p>
     *
     * @return <p>
     *         The time that the recognizer creation completed.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The time that the recognizer creation completed.
     * </p>
     *
     * @param endTime <p>
     *            The time that the recognizer creation completed.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the recognizer creation completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The time that the recognizer creation completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerProperties withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The time that training of the entity recognizer started.
     * </p>
     *
     * @return <p>
     *         The time that training of the entity recognizer started.
     *         </p>
     */
    public java.util.Date getTrainingStartTime() {
        return trainingStartTime;
    }

    /**
     * <p>
     * The time that training of the entity recognizer started.
     * </p>
     *
     * @param trainingStartTime <p>
     *            The time that training of the entity recognizer started.
     *            </p>
     */
    public void setTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
    }

    /**
     * <p>
     * The time that training of the entity recognizer started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingStartTime <p>
     *            The time that training of the entity recognizer started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerProperties withTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
        return this;
    }

    /**
     * <p>
     * The time that training of the entity recognizer was completed.
     * </p>
     *
     * @return <p>
     *         The time that training of the entity recognizer was completed.
     *         </p>
     */
    public java.util.Date getTrainingEndTime() {
        return trainingEndTime;
    }

    /**
     * <p>
     * The time that training of the entity recognizer was completed.
     * </p>
     *
     * @param trainingEndTime <p>
     *            The time that training of the entity recognizer was completed.
     *            </p>
     */
    public void setTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
    }

    /**
     * <p>
     * The time that training of the entity recognizer was completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingEndTime <p>
     *            The time that training of the entity recognizer was completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerProperties withTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
        return this;
    }

    /**
     * <p>
     * The input data properties of an entity recognizer.
     * </p>
     *
     * @return <p>
     *         The input data properties of an entity recognizer.
     *         </p>
     */
    public EntityRecognizerInputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * The input data properties of an entity recognizer.
     * </p>
     *
     * @param inputDataConfig <p>
     *            The input data properties of an entity recognizer.
     *            </p>
     */
    public void setInputDataConfig(EntityRecognizerInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data properties of an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            The input data properties of an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerProperties withInputDataConfig(
            EntityRecognizerInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
        return this;
    }

    /**
     * <p>
     * Provides information about an entity recognizer.
     * </p>
     *
     * @return <p>
     *         Provides information about an entity recognizer.
     *         </p>
     */
    public EntityRecognizerMetadata getRecognizerMetadata() {
        return recognizerMetadata;
    }

    /**
     * <p>
     * Provides information about an entity recognizer.
     * </p>
     *
     * @param recognizerMetadata <p>
     *            Provides information about an entity recognizer.
     *            </p>
     */
    public void setRecognizerMetadata(EntityRecognizerMetadata recognizerMetadata) {
        this.recognizerMetadata = recognizerMetadata;
    }

    /**
     * <p>
     * Provides information about an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recognizerMetadata <p>
     *            Provides information about an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerProperties withRecognizerMetadata(
            EntityRecognizerMetadata recognizerMetadata) {
        this.recognizerMetadata = recognizerMetadata;
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
    public EntityRecognizerProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
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
        if (getEntityRecognizerArn() != null)
            sb.append("EntityRecognizerArn: " + getEntityRecognizerArn() + ",");
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
        if (getRecognizerMetadata() != null)
            sb.append("RecognizerMetadata: " + getRecognizerMetadata() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEntityRecognizerArn() == null) ? 0 : getEntityRecognizerArn().hashCode());
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
                + ((getRecognizerMetadata() == null) ? 0 : getRecognizerMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerProperties == false)
            return false;
        EntityRecognizerProperties other = (EntityRecognizerProperties) obj;

        if (other.getEntityRecognizerArn() == null ^ this.getEntityRecognizerArn() == null)
            return false;
        if (other.getEntityRecognizerArn() != null
                && other.getEntityRecognizerArn().equals(this.getEntityRecognizerArn()) == false)
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
        if (other.getRecognizerMetadata() == null ^ this.getRecognizerMetadata() == null)
            return false;
        if (other.getRecognizerMetadata() != null
                && other.getRecognizerMetadata().equals(this.getRecognizerMetadata()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }
}
