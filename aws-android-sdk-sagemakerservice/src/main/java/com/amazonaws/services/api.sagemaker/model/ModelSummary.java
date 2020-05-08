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

/**
 * <p>
 * Provides summary information about a model.
 * </p>
 */
public class ModelSummary implements Serializable {
    /**
     * <p>
     * The name of the model that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String modelName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     */
    private String modelArn;

    /**
     * <p>
     * A timestamp that indicates when the model was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The name of the model that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the model that you want a summary for.
     *         </p>
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * <p>
     * The name of the model that you want a summary for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param modelName <p>
     *            The name of the model that you want a summary for.
     *            </p>
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model that you want a summary for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param modelName <p>
     *            The name of the model that you want a summary for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelSummary withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the model.
     *         </p>
     */
    public String getModelArn() {
        return modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     *
     * @param modelArn <p>
     *            The Amazon Resource Name (ARN) of the model.
     *            </p>
     */
    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     *
     * @param modelArn <p>
     *            The Amazon Resource Name (ARN) of the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelSummary withModelArn(String modelArn) {
        this.modelArn = modelArn;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the model was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the model was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the model was created.
     * </p>
     *
     * @param creationTime <p>
     *            A timestamp that indicates when the model was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the model was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            A timestamp that indicates when the model was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
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
        if (getModelArn() != null)
            sb.append("ModelArn: " + getModelArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelSummary == false)
            return false;
        ModelSummary other = (ModelSummary) obj;

        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null
                && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }
}
