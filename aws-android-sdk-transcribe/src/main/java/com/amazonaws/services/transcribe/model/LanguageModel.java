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

/**
 * <p>
 * The structure used to describe a custom language model.
 * </p>
 */
public class LanguageModel implements Serializable {
    /**
     * <p>
     * The name of the custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String modelName;

    /**
     * <p>
     * The time the custom language model was created.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The most recent time the custom language model was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The language code you used to create your custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     */
    private String languageCode;

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to
     * create the custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     */
    private String baseModelName;

    /**
     * <p>
     * The creation status of a custom language model. When the status is
     * <code>COMPLETED</code> the model is ready for use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     */
    private String modelStatus;

    /**
     * <p>
     * Whether the base model used for the custom language model is up to date.
     * If this field is <code>false</code> then you are running the most
     * up-to-date version of the base model in your custom language model.
     * </p>
     */
    private Boolean upgradeAvailability;

    /**
     * <p>
     * The reason why the custom language model couldn't be created.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The data access role and Amazon S3 prefixes for the input files used to
     * train the custom language model.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * The name of the custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the custom language model.
     *         </p>
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * <p>
     * The name of the custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param modelName <p>
     *            The name of the custom language model.
     *            </p>
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the custom language model.
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
     *            The name of the custom language model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LanguageModel withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * <p>
     * The time the custom language model was created.
     * </p>
     *
     * @return <p>
     *         The time the custom language model was created.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The time the custom language model was created.
     * </p>
     *
     * @param createTime <p>
     *            The time the custom language model was created.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time the custom language model was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The time the custom language model was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LanguageModel withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The most recent time the custom language model was modified.
     * </p>
     *
     * @return <p>
     *         The most recent time the custom language model was modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time the custom language model was modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The most recent time the custom language model was modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time the custom language model was modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The most recent time the custom language model was modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LanguageModel withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The language code you used to create your custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     *
     * @return <p>
     *         The language code you used to create your custom language model.
     *         </p>
     * @see CLMLanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code you used to create your custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     *
     * @param languageCode <p>
     *            The language code you used to create your custom language
     *            model.
     *            </p>
     * @see CLMLanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code you used to create your custom language model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     *
     * @param languageCode <p>
     *            The language code you used to create your custom language
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CLMLanguageCode
     */
    public LanguageModel withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code you used to create your custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     *
     * @param languageCode <p>
     *            The language code you used to create your custom language
     *            model.
     *            </p>
     * @see CLMLanguageCode
     */
    public void setLanguageCode(CLMLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code you used to create your custom language model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en-US, hi-IN, es-US, en-GB, en-AU
     *
     * @param languageCode <p>
     *            The language code you used to create your custom language
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CLMLanguageCode
     */
    public LanguageModel withLanguageCode(CLMLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to
     * create the custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     *
     * @return <p>
     *         The Amazon Transcribe standard language model, or base model used
     *         to create the custom language model.
     *         </p>
     * @see BaseModelName
     */
    public String getBaseModelName() {
        return baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to
     * create the custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     *
     * @param baseModelName <p>
     *            The Amazon Transcribe standard language model, or base model
     *            used to create the custom language model.
     *            </p>
     * @see BaseModelName
     */
    public void setBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to
     * create the custom language model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     *
     * @param baseModelName <p>
     *            The Amazon Transcribe standard language model, or base model
     *            used to create the custom language model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BaseModelName
     */
    public LanguageModel withBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to
     * create the custom language model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     *
     * @param baseModelName <p>
     *            The Amazon Transcribe standard language model, or base model
     *            used to create the custom language model.
     *            </p>
     * @see BaseModelName
     */
    public void setBaseModelName(BaseModelName baseModelName) {
        this.baseModelName = baseModelName.toString();
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model used to
     * create the custom language model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NarrowBand, WideBand
     *
     * @param baseModelName <p>
     *            The Amazon Transcribe standard language model, or base model
     *            used to create the custom language model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BaseModelName
     */
    public LanguageModel withBaseModelName(BaseModelName baseModelName) {
        this.baseModelName = baseModelName.toString();
        return this;
    }

    /**
     * <p>
     * The creation status of a custom language model. When the status is
     * <code>COMPLETED</code> the model is ready for use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         The creation status of a custom language model. When the status
     *         is <code>COMPLETED</code> the model is ready for use.
     *         </p>
     * @see ModelStatus
     */
    public String getModelStatus() {
        return modelStatus;
    }

    /**
     * <p>
     * The creation status of a custom language model. When the status is
     * <code>COMPLETED</code> the model is ready for use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param modelStatus <p>
     *            The creation status of a custom language model. When the
     *            status is <code>COMPLETED</code> the model is ready for use.
     *            </p>
     * @see ModelStatus
     */
    public void setModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
    }

    /**
     * <p>
     * The creation status of a custom language model. When the status is
     * <code>COMPLETED</code> the model is ready for use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param modelStatus <p>
     *            The creation status of a custom language model. When the
     *            status is <code>COMPLETED</code> the model is ready for use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public LanguageModel withModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
        return this;
    }

    /**
     * <p>
     * The creation status of a custom language model. When the status is
     * <code>COMPLETED</code> the model is ready for use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param modelStatus <p>
     *            The creation status of a custom language model. When the
     *            status is <code>COMPLETED</code> the model is ready for use.
     *            </p>
     * @see ModelStatus
     */
    public void setModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
    }

    /**
     * <p>
     * The creation status of a custom language model. When the status is
     * <code>COMPLETED</code> the model is ready for use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param modelStatus <p>
     *            The creation status of a custom language model. When the
     *            status is <code>COMPLETED</code> the model is ready for use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public LanguageModel withModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
        return this;
    }

    /**
     * <p>
     * Whether the base model used for the custom language model is up to date.
     * If this field is <code>false</code> then you are running the most
     * up-to-date version of the base model in your custom language model.
     * </p>
     *
     * @return <p>
     *         Whether the base model used for the custom language model is up
     *         to date. If this field is <code>false</code> then you are running
     *         the most up-to-date version of the base model in your custom
     *         language model.
     *         </p>
     */
    public Boolean isUpgradeAvailability() {
        return upgradeAvailability;
    }

    /**
     * <p>
     * Whether the base model used for the custom language model is up to date.
     * If this field is <code>false</code> then you are running the most
     * up-to-date version of the base model in your custom language model.
     * </p>
     *
     * @return <p>
     *         Whether the base model used for the custom language model is up
     *         to date. If this field is <code>false</code> then you are running
     *         the most up-to-date version of the base model in your custom
     *         language model.
     *         </p>
     */
    public Boolean getUpgradeAvailability() {
        return upgradeAvailability;
    }

    /**
     * <p>
     * Whether the base model used for the custom language model is up to date.
     * If this field is <code>false</code> then you are running the most
     * up-to-date version of the base model in your custom language model.
     * </p>
     *
     * @param upgradeAvailability <p>
     *            Whether the base model used for the custom language model is
     *            up to date. If this field is <code>false</code> then you are
     *            running the most up-to-date version of the base model in your
     *            custom language model.
     *            </p>
     */
    public void setUpgradeAvailability(Boolean upgradeAvailability) {
        this.upgradeAvailability = upgradeAvailability;
    }

    /**
     * <p>
     * Whether the base model used for the custom language model is up to date.
     * If this field is <code>false</code> then you are running the most
     * up-to-date version of the base model in your custom language model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param upgradeAvailability <p>
     *            Whether the base model used for the custom language model is
     *            up to date. If this field is <code>false</code> then you are
     *            running the most up-to-date version of the base model in your
     *            custom language model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LanguageModel withUpgradeAvailability(Boolean upgradeAvailability) {
        this.upgradeAvailability = upgradeAvailability;
        return this;
    }

    /**
     * <p>
     * The reason why the custom language model couldn't be created.
     * </p>
     *
     * @return <p>
     *         The reason why the custom language model couldn't be created.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The reason why the custom language model couldn't be created.
     * </p>
     *
     * @param failureReason <p>
     *            The reason why the custom language model couldn't be created.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why the custom language model couldn't be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            The reason why the custom language model couldn't be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LanguageModel withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The data access role and Amazon S3 prefixes for the input files used to
     * train the custom language model.
     * </p>
     *
     * @return <p>
     *         The data access role and Amazon S3 prefixes for the input files
     *         used to train the custom language model.
     *         </p>
     */
    public InputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * The data access role and Amazon S3 prefixes for the input files used to
     * train the custom language model.
     * </p>
     *
     * @param inputDataConfig <p>
     *            The data access role and Amazon S3 prefixes for the input
     *            files used to train the custom language model.
     *            </p>
     */
    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The data access role and Amazon S3 prefixes for the input files used to
     * train the custom language model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            The data access role and Amazon S3 prefixes for the input
     *            files used to train the custom language model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LanguageModel withInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
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
        if (getModelName() != null)
            sb.append("ModelName: " + getModelName() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getBaseModelName() != null)
            sb.append("BaseModelName: " + getBaseModelName() + ",");
        if (getModelStatus() != null)
            sb.append("ModelStatus: " + getModelStatus() + ",");
        if (getUpgradeAvailability() != null)
            sb.append("UpgradeAvailability: " + getUpgradeAvailability() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getBaseModelName() == null) ? 0 : getBaseModelName().hashCode());
        hashCode = prime * hashCode
                + ((getModelStatus() == null) ? 0 : getModelStatus().hashCode());
        hashCode = prime * hashCode
                + ((getUpgradeAvailability() == null) ? 0 : getUpgradeAvailability().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LanguageModel == false)
            return false;
        LanguageModel other = (LanguageModel) obj;

        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null
                && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
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
        if (other.getModelStatus() == null ^ this.getModelStatus() == null)
            return false;
        if (other.getModelStatus() != null
                && other.getModelStatus().equals(this.getModelStatus()) == false)
            return false;
        if (other.getUpgradeAvailability() == null ^ this.getUpgradeAvailability() == null)
            return false;
        if (other.getUpgradeAvailability() != null
                && other.getUpgradeAvailability().equals(this.getUpgradeAvailability()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null
                && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        return true;
    }
}
