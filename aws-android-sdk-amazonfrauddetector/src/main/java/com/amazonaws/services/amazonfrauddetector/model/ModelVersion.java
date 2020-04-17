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
 * The model version.
 * </p>
 */
public class ModelVersion implements Serializable {
    /**
     * <p>
     * The parent model ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     */
    private String modelId;

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     */
    private String modelType;

    /**
     * <p>
     * The model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String modelVersionNumber;

    /**
     * <p>
     * The parent model ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @return <p>
     *         The parent model ID.
     *         </p>
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * <p>
     * The parent model ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param modelId <p>
     *            The parent model ID.
     *            </p>
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The parent model ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[0-9a-z_-]+$<br/>
     *
     * @param modelId <p>
     *            The parent model ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelVersion withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     *
     * @return <p>
     *         The model type.
     *         </p>
     * @see ModelTypeEnum
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @see ModelTypeEnum
     */
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelTypeEnum
     */
    public ModelVersion withModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @see ModelTypeEnum
     */
    public void setModelType(ModelTypeEnum modelType) {
        this.modelType = modelType.toString();
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONLINE_FRAUD_INSIGHTS
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelTypeEnum
     */
    public ModelVersion withModelType(ModelTypeEnum modelType) {
        this.modelType = modelType.toString();
        return this;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The model version.
     *         </p>
     */
    public String getModelVersionNumber() {
        return modelVersionNumber;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param modelVersionNumber <p>
     *            The model version.
     *            </p>
     */
    public void setModelVersionNumber(String modelVersionNumber) {
        this.modelVersionNumber = modelVersionNumber;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param modelVersionNumber <p>
     *            The model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelVersion withModelVersionNumber(String modelVersionNumber) {
        this.modelVersionNumber = modelVersionNumber;
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
        if (getModelId() != null)
            sb.append("modelId: " + getModelId() + ",");
        if (getModelType() != null)
            sb.append("modelType: " + getModelType() + ",");
        if (getModelVersionNumber() != null)
            sb.append("modelVersionNumber: " + getModelVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getModelType() == null) ? 0 : getModelType().hashCode());
        hashCode = prime * hashCode
                + ((getModelVersionNumber() == null) ? 0 : getModelVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelVersion == false)
            return false;
        ModelVersion other = (ModelVersion) obj;

        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getModelType() == null ^ this.getModelType() == null)
            return false;
        if (other.getModelType() != null
                && other.getModelType().equals(this.getModelType()) == false)
            return false;
        if (other.getModelVersionNumber() == null ^ this.getModelVersionNumber() == null)
            return false;
        if (other.getModelVersionNumber() != null
                && other.getModelVersionNumber().equals(this.getModelVersionNumber()) == false)
            return false;
        return true;
    }
}
