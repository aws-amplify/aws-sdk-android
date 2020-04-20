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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

public class CreateModelResult implements Serializable {
    /**
     * <p>
     * The content-type for the model, for example, "application/json".
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The description of the model.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The model identifier.
     * </p>
     */
    private String modelId;

    /**
     * <p>
     * The name of the model. Must be alphanumeric.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The schema for the model. For application/json models, this should be
     * JSON schema draft 4 model.
     * </p>
     */
    private String schema;

    /**
     * <p>
     * The content-type for the model, for example, "application/json".
     * </p>
     *
     * @return <p>
     *         The content-type for the model, for example, "application/json".
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The content-type for the model, for example, "application/json".
     * </p>
     *
     * @param contentType <p>
     *            The content-type for the model, for example,
     *            "application/json".
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content-type for the model, for example, "application/json".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            The content-type for the model, for example,
     *            "application/json".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelResult withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     *
     * @return <p>
     *         The description of the model.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     *
     * @param description <p>
     *            The description of the model.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The model identifier.
     * </p>
     *
     * @return <p>
     *         The model identifier.
     *         </p>
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * <p>
     * The model identifier.
     * </p>
     *
     * @param modelId <p>
     *            The model identifier.
     *            </p>
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The model identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelId <p>
     *            The model identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelResult withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * <p>
     * The name of the model. Must be alphanumeric.
     * </p>
     *
     * @return <p>
     *         The name of the model. Must be alphanumeric.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the model. Must be alphanumeric.
     * </p>
     *
     * @param name <p>
     *            The name of the model. Must be alphanumeric.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the model. Must be alphanumeric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the model. Must be alphanumeric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The schema for the model. For application/json models, this should be
     * JSON schema draft 4 model.
     * </p>
     *
     * @return <p>
     *         The schema for the model. For application/json models, this
     *         should be JSON schema draft 4 model.
     *         </p>
     */
    public String getSchema() {
        return schema;
    }

    /**
     * <p>
     * The schema for the model. For application/json models, this should be
     * JSON schema draft 4 model.
     * </p>
     *
     * @param schema <p>
     *            The schema for the model. For application/json models, this
     *            should be JSON schema draft 4 model.
     *            </p>
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema for the model. For application/json models, this should be
     * JSON schema draft 4 model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schema <p>
     *            The schema for the model. For application/json models, this
     *            should be JSON schema draft 4 model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelResult withSchema(String schema) {
        this.schema = schema;
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
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getModelId() != null)
            sb.append("ModelId: " + getModelId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSchema() != null)
            sb.append("Schema: " + getSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateModelResult == false)
            return false;
        CreateModelResult other = (CreateModelResult) obj;

        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        return true;
    }
}
