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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon SageMaker model.
 * </p>
 */
public class ExternalModel implements Serializable {
    /**
     * <p>
     * The Amazon SageMaker model endpoints.
     * </p>
     */
    private String modelEndpoint;

    /**
     * <p>
     * The source of the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAGEMAKER
     */
    private String modelSource;

    /**
     * <p>
     * The role used to invoke the model.
     * </p>
     */
    private Role role;

    /**
     * <p>
     * The input configuration.
     * </p>
     */
    private ModelInputConfiguration inputConfiguration;

    /**
     * <p>
     * The output configuration.
     * </p>
     */
    private ModelOutputConfiguration outputConfiguration;

    /**
     * <p>
     * The Amazon Fraud Detector status for the external model endpoint
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATED, DISSOCIATED
     */
    private String modelEndpointStatus;

    /**
     * <p>
     * Timestamp of when the model was last updated.
     * </p>
     */
    private String lastUpdatedTime;

    /**
     * <p>
     * Timestamp of when the model was last created.
     * </p>
     */
    private String createdTime;

    /**
     * <p>
     * The Amazon SageMaker model endpoints.
     * </p>
     *
     * @return <p>
     *         The Amazon SageMaker model endpoints.
     *         </p>
     */
    public String getModelEndpoint() {
        return modelEndpoint;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints.
     * </p>
     *
     * @param modelEndpoint <p>
     *            The Amazon SageMaker model endpoints.
     *            </p>
     */
    public void setModelEndpoint(String modelEndpoint) {
        this.modelEndpoint = modelEndpoint;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoints.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelEndpoint <p>
     *            The Amazon SageMaker model endpoints.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExternalModel withModelEndpoint(String modelEndpoint) {
        this.modelEndpoint = modelEndpoint;
        return this;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAGEMAKER
     *
     * @return <p>
     *         The source of the model.
     *         </p>
     * @see ModelSource
     */
    public String getModelSource() {
        return modelSource;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAGEMAKER
     *
     * @param modelSource <p>
     *            The source of the model.
     *            </p>
     * @see ModelSource
     */
    public void setModelSource(String modelSource) {
        this.modelSource = modelSource;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAGEMAKER
     *
     * @param modelSource <p>
     *            The source of the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelSource
     */
    public ExternalModel withModelSource(String modelSource) {
        this.modelSource = modelSource;
        return this;
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAGEMAKER
     *
     * @param modelSource <p>
     *            The source of the model.
     *            </p>
     * @see ModelSource
     */
    public void setModelSource(ModelSource modelSource) {
        this.modelSource = modelSource.toString();
    }

    /**
     * <p>
     * The source of the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAGEMAKER
     *
     * @param modelSource <p>
     *            The source of the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelSource
     */
    public ExternalModel withModelSource(ModelSource modelSource) {
        this.modelSource = modelSource.toString();
        return this;
    }

    /**
     * <p>
     * The role used to invoke the model.
     * </p>
     *
     * @return <p>
     *         The role used to invoke the model.
     *         </p>
     */
    public Role getRole() {
        return role;
    }

    /**
     * <p>
     * The role used to invoke the model.
     * </p>
     *
     * @param role <p>
     *            The role used to invoke the model.
     *            </p>
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * <p>
     * The role used to invoke the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role <p>
     *            The role used to invoke the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExternalModel withRole(Role role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * The input configuration.
     * </p>
     *
     * @return <p>
     *         The input configuration.
     *         </p>
     */
    public ModelInputConfiguration getInputConfiguration() {
        return inputConfiguration;
    }

    /**
     * <p>
     * The input configuration.
     * </p>
     *
     * @param inputConfiguration <p>
     *            The input configuration.
     *            </p>
     */
    public void setInputConfiguration(ModelInputConfiguration inputConfiguration) {
        this.inputConfiguration = inputConfiguration;
    }

    /**
     * <p>
     * The input configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputConfiguration <p>
     *            The input configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExternalModel withInputConfiguration(ModelInputConfiguration inputConfiguration) {
        this.inputConfiguration = inputConfiguration;
        return this;
    }

    /**
     * <p>
     * The output configuration.
     * </p>
     *
     * @return <p>
     *         The output configuration.
     *         </p>
     */
    public ModelOutputConfiguration getOutputConfiguration() {
        return outputConfiguration;
    }

    /**
     * <p>
     * The output configuration.
     * </p>
     *
     * @param outputConfiguration <p>
     *            The output configuration.
     *            </p>
     */
    public void setOutputConfiguration(ModelOutputConfiguration outputConfiguration) {
        this.outputConfiguration = outputConfiguration;
    }

    /**
     * <p>
     * The output configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfiguration <p>
     *            The output configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExternalModel withOutputConfiguration(ModelOutputConfiguration outputConfiguration) {
        this.outputConfiguration = outputConfiguration;
        return this;
    }

    /**
     * <p>
     * The Amazon Fraud Detector status for the external model endpoint
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATED, DISSOCIATED
     *
     * @return <p>
     *         The Amazon Fraud Detector status for the external model endpoint
     *         </p>
     * @see ModelEndpointStatus
     */
    public String getModelEndpointStatus() {
        return modelEndpointStatus;
    }

    /**
     * <p>
     * The Amazon Fraud Detector status for the external model endpoint
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATED, DISSOCIATED
     *
     * @param modelEndpointStatus <p>
     *            The Amazon Fraud Detector status for the external model
     *            endpoint
     *            </p>
     * @see ModelEndpointStatus
     */
    public void setModelEndpointStatus(String modelEndpointStatus) {
        this.modelEndpointStatus = modelEndpointStatus;
    }

    /**
     * <p>
     * The Amazon Fraud Detector status for the external model endpoint
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATED, DISSOCIATED
     *
     * @param modelEndpointStatus <p>
     *            The Amazon Fraud Detector status for the external model
     *            endpoint
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelEndpointStatus
     */
    public ExternalModel withModelEndpointStatus(String modelEndpointStatus) {
        this.modelEndpointStatus = modelEndpointStatus;
        return this;
    }

    /**
     * <p>
     * The Amazon Fraud Detector status for the external model endpoint
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATED, DISSOCIATED
     *
     * @param modelEndpointStatus <p>
     *            The Amazon Fraud Detector status for the external model
     *            endpoint
     *            </p>
     * @see ModelEndpointStatus
     */
    public void setModelEndpointStatus(ModelEndpointStatus modelEndpointStatus) {
        this.modelEndpointStatus = modelEndpointStatus.toString();
    }

    /**
     * <p>
     * The Amazon Fraud Detector status for the external model endpoint
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATED, DISSOCIATED
     *
     * @param modelEndpointStatus <p>
     *            The Amazon Fraud Detector status for the external model
     *            endpoint
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelEndpointStatus
     */
    public ExternalModel withModelEndpointStatus(ModelEndpointStatus modelEndpointStatus) {
        this.modelEndpointStatus = modelEndpointStatus.toString();
        return this;
    }

    /**
     * <p>
     * Timestamp of when the model was last updated.
     * </p>
     *
     * @return <p>
     *         Timestamp of when the model was last updated.
     *         </p>
     */
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the model was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            Timestamp of when the model was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the model was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            Timestamp of when the model was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExternalModel withLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * Timestamp of when the model was last created.
     * </p>
     *
     * @return <p>
     *         Timestamp of when the model was last created.
     *         </p>
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * Timestamp of when the model was last created.
     * </p>
     *
     * @param createdTime <p>
     *            Timestamp of when the model was last created.
     *            </p>
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Timestamp of when the model was last created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            Timestamp of when the model was last created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExternalModel withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
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
        if (getModelEndpoint() != null)
            sb.append("modelEndpoint: " + getModelEndpoint() + ",");
        if (getModelSource() != null)
            sb.append("modelSource: " + getModelSource() + ",");
        if (getRole() != null)
            sb.append("role: " + getRole() + ",");
        if (getInputConfiguration() != null)
            sb.append("inputConfiguration: " + getInputConfiguration() + ",");
        if (getOutputConfiguration() != null)
            sb.append("outputConfiguration: " + getOutputConfiguration() + ",");
        if (getModelEndpointStatus() != null)
            sb.append("modelEndpointStatus: " + getModelEndpointStatus() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("lastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getCreatedTime() != null)
            sb.append("createdTime: " + getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getModelEndpoint() == null) ? 0 : getModelEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getModelSource() == null) ? 0 : getModelSource().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode
                + ((getInputConfiguration() == null) ? 0 : getInputConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getOutputConfiguration() == null) ? 0 : getOutputConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getModelEndpointStatus() == null) ? 0 : getModelEndpointStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalModel == false)
            return false;
        ExternalModel other = (ExternalModel) obj;

        if (other.getModelEndpoint() == null ^ this.getModelEndpoint() == null)
            return false;
        if (other.getModelEndpoint() != null
                && other.getModelEndpoint().equals(this.getModelEndpoint()) == false)
            return false;
        if (other.getModelSource() == null ^ this.getModelSource() == null)
            return false;
        if (other.getModelSource() != null
                && other.getModelSource().equals(this.getModelSource()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getInputConfiguration() == null ^ this.getInputConfiguration() == null)
            return false;
        if (other.getInputConfiguration() != null
                && other.getInputConfiguration().equals(this.getInputConfiguration()) == false)
            return false;
        if (other.getOutputConfiguration() == null ^ this.getOutputConfiguration() == null)
            return false;
        if (other.getOutputConfiguration() != null
                && other.getOutputConfiguration().equals(this.getOutputConfiguration()) == false)
            return false;
        if (other.getModelEndpointStatus() == null ^ this.getModelEndpointStatus() == null)
            return false;
        if (other.getModelEndpointStatus() != null
                && other.getModelEndpointStatus().equals(this.getModelEndpointStatus()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }
}
