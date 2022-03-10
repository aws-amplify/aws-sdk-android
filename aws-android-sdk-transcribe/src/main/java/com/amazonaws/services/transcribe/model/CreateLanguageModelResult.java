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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

public class CreateLanguageModelResult implements Serializable {
    /**
     * <p>
     * The language code you selected for your custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     */
    private String languageCode;

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, you used
     * when creating your custom language model.
     * </p>
     * <p>
     * If your audio has a sample rate of 16,000 Hz or greater, this value
     * should be <code>WideBand</code>. If your audio has a sample rate of less
     * than 16,000 Hz, this value should be <code>NarrowBand</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     */
    private String baseModelName;

    /**
     * <p>
     * The unique name you chose for your custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String modelName;

    /**
     * <p>
     * Lists your data access role ARN (Amazon Resource Name) and the Amazon S3
     * locations your provided for your training (<code>S3Uri</code>) and tuning
     * (<code>TuningDataS3Uri</code>) data.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * The status of your custom language model. When the status shows as
     * <code>COMPLETED</code>, your model is ready to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     */
    private String modelStatus;

    /**
     * <p>
     * The language code you selected for your custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     *
     * @return <p>
     *         The language code you selected for your custom language model.
     *         </p>
     * @see CLMLanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code you selected for your custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     *
     * @param languageCode <p>
     *            The language code you selected for your custom language model.
     *            </p>
     * @see CLMLanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code you selected for your custom language model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     *
     * @param languageCode <p>
     *            The language code you selected for your custom language model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CLMLanguageCode
     */
    public CreateLanguageModelResult withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code you selected for your custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     *
     * @param languageCode <p>
     *            The language code you selected for your custom language model.
     *            </p>
     * @see CLMLanguageCode
     */
    public void setLanguageCode(CLMLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code you selected for your custom language model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     *
     * @param languageCode <p>
     *            The language code you selected for your custom language model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CLMLanguageCode
     */
    public CreateLanguageModelResult withLanguageCode(CLMLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, you used
     * when creating your custom language model.
     * </p>
     * <p>
     * If your audio has a sample rate of 16,000 Hz or greater, this value
     * should be <code>WideBand</code>. If your audio has a sample rate of less
     * than 16,000 Hz, this value should be <code>NarrowBand</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     *
     * @return <p>
     *         The Amazon Transcribe standard language model, or base model, you
     *         used when creating your custom language model.
     *         </p>
     *         <p>
     *         If your audio has a sample rate of 16,000 Hz or greater, this
     *         value should be <code>WideBand</code>. If your audio has a sample
     *         rate of less than 16,000 Hz, this value should be
     *         <code>NarrowBand</code>.
     *         </p>
     * @see BaseModelName
     */
    public String getBaseModelName() {
        return baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, you used
     * when creating your custom language model.
     * </p>
     * <p>
     * If your audio has a sample rate of 16,000 Hz or greater, this value
     * should be <code>WideBand</code>. If your audio has a sample rate of less
     * than 16,000 Hz, this value should be <code>NarrowBand</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     *
     * @param baseModelName <p>
     *            The Amazon Transcribe standard language model, or base model,
     *            you used when creating your custom language model.
     *            </p>
     *            <p>
     *            If your audio has a sample rate of 16,000 Hz or greater, this
     *            value should be <code>WideBand</code>. If your audio has a
     *            sample rate of less than 16,000 Hz, this value should be
     *            <code>NarrowBand</code>.
     *            </p>
     * @see BaseModelName
     */
    public void setBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, you used
     * when creating your custom language model.
     * </p>
     * <p>
     * If your audio has a sample rate of 16,000 Hz or greater, this value
     * should be <code>WideBand</code>. If your audio has a sample rate of less
     * than 16,000 Hz, this value should be <code>NarrowBand</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     *
     * @param baseModelName <p>
     *            The Amazon Transcribe standard language model, or base model,
     *            you used when creating your custom language model.
     *            </p>
     *            <p>
     *            If your audio has a sample rate of 16,000 Hz or greater, this
     *            value should be <code>WideBand</code>. If your audio has a
     *            sample rate of less than 16,000 Hz, this value should be
     *            <code>NarrowBand</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BaseModelName
     */
    public CreateLanguageModelResult withBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, you used
     * when creating your custom language model.
     * </p>
     * <p>
     * If your audio has a sample rate of 16,000 Hz or greater, this value
     * should be <code>WideBand</code>. If your audio has a sample rate of less
     * than 16,000 Hz, this value should be <code>NarrowBand</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     *
     * @param baseModelName <p>
     *            The Amazon Transcribe standard language model, or base model,
     *            you used when creating your custom language model.
     *            </p>
     *            <p>
     *            If your audio has a sample rate of 16,000 Hz or greater, this
     *            value should be <code>WideBand</code>. If your audio has a
     *            sample rate of less than 16,000 Hz, this value should be
     *            <code>NarrowBand</code>.
     *            </p>
     * @see BaseModelName
     */
    public void setBaseModelName(BaseModelName baseModelName) {
        this.baseModelName = baseModelName.toString();
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, you used
     * when creating your custom language model.
     * </p>
     * <p>
     * If your audio has a sample rate of 16,000 Hz or greater, this value
     * should be <code>WideBand</code>. If your audio has a sample rate of less
     * than 16,000 Hz, this value should be <code>NarrowBand</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     *
     * @param baseModelName <p>
     *            The Amazon Transcribe standard language model, or base model,
     *            you used when creating your custom language model.
     *            </p>
     *            <p>
     *            If your audio has a sample rate of 16,000 Hz or greater, this
     *            value should be <code>WideBand</code>. If your audio has a
     *            sample rate of less than 16,000 Hz, this value should be
     *            <code>NarrowBand</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BaseModelName
     */
    public CreateLanguageModelResult withBaseModelName(BaseModelName baseModelName) {
        this.baseModelName = baseModelName.toString();
        return this;
    }

    /**
     * <p>
     * The unique name you chose for your custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The unique name you chose for your custom language model.
     *         </p>
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * <p>
     * The unique name you chose for your custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param modelName <p>
     *            The unique name you chose for your custom language model.
     *            </p>
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The unique name you chose for your custom language model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param modelName <p>
     *            The unique name you chose for your custom language model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLanguageModelResult withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * <p>
     * Lists your data access role ARN (Amazon Resource Name) and the Amazon S3
     * locations your provided for your training (<code>S3Uri</code>) and tuning
     * (<code>TuningDataS3Uri</code>) data.
     * </p>
     *
     * @return <p>
     *         Lists your data access role ARN (Amazon Resource Name) and the
     *         Amazon S3 locations your provided for your training (
     *         <code>S3Uri</code>) and tuning (<code>TuningDataS3Uri</code>)
     *         data.
     *         </p>
     */
    public InputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * Lists your data access role ARN (Amazon Resource Name) and the Amazon S3
     * locations your provided for your training (<code>S3Uri</code>) and tuning
     * (<code>TuningDataS3Uri</code>) data.
     * </p>
     *
     * @param inputDataConfig <p>
     *            Lists your data access role ARN (Amazon Resource Name) and the
     *            Amazon S3 locations your provided for your training (
     *            <code>S3Uri</code>) and tuning (<code>TuningDataS3Uri</code>)
     *            data.
     *            </p>
     */
    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Lists your data access role ARN (Amazon Resource Name) and the Amazon S3
     * locations your provided for your training (<code>S3Uri</code>) and tuning
     * (<code>TuningDataS3Uri</code>) data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            Lists your data access role ARN (Amazon Resource Name) and the
     *            Amazon S3 locations your provided for your training (
     *            <code>S3Uri</code>) and tuning (<code>TuningDataS3Uri</code>)
     *            data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLanguageModelResult withInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
        return this;
    }

    /**
     * <p>
     * The status of your custom language model. When the status shows as
     * <code>COMPLETED</code>, your model is ready to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         The status of your custom language model. When the status shows
     *         as <code>COMPLETED</code>, your model is ready to use.
     *         </p>
     * @see ModelStatus
     */
    public String getModelStatus() {
        return modelStatus;
    }

    /**
     * <p>
     * The status of your custom language model. When the status shows as
     * <code>COMPLETED</code>, your model is ready to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param modelStatus <p>
     *            The status of your custom language model. When the status
     *            shows as <code>COMPLETED</code>, your model is ready to use.
     *            </p>
     * @see ModelStatus
     */
    public void setModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
    }

    /**
     * <p>
     * The status of your custom language model. When the status shows as
     * <code>COMPLETED</code>, your model is ready to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param modelStatus <p>
     *            The status of your custom language model. When the status
     *            shows as <code>COMPLETED</code>, your model is ready to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public CreateLanguageModelResult withModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
        return this;
    }

    /**
     * <p>
     * The status of your custom language model. When the status shows as
     * <code>COMPLETED</code>, your model is ready to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param modelStatus <p>
     *            The status of your custom language model. When the status
     *            shows as <code>COMPLETED</code>, your model is ready to use.
     *            </p>
     * @see ModelStatus
     */
    public void setModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
    }

    /**
     * <p>
     * The status of your custom language model. When the status shows as
     * <code>COMPLETED</code>, your model is ready to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param modelStatus <p>
     *            The status of your custom language model. When the status
     *            shows as <code>COMPLETED</code>, your model is ready to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public CreateLanguageModelResult withModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getBaseModelName() != null)
            sb.append("BaseModelName: " + getBaseModelName() + ",");
        if (getModelName() != null)
            sb.append("ModelName: " + getModelName() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getModelStatus() != null)
            sb.append("ModelStatus: " + getModelStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getBaseModelName() == null) ? 0 : getBaseModelName().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getModelStatus() == null) ? 0 : getModelStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLanguageModelResult == false)
            return false;
        CreateLanguageModelResult other = (CreateLanguageModelResult) obj;

        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getBaseModelName() == null ^ this.getBaseModelName() == null)
            return false;
        if (other.getBaseModelName() != null
                && other.getBaseModelName().equals(this.getBaseModelName()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null
                && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null
                && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getModelStatus() == null ^ this.getModelStatus() == null)
            return false;
        if (other.getModelStatus() != null
                && other.getModelStatus().equals(this.getModelStatus()) == false)
            return false;
        return true;
    }
}
