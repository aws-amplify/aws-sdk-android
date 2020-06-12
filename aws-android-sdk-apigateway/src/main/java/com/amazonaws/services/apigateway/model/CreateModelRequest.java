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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds a new <a>Model</a> resource to an existing <a>RestApi</a> resource.
 * </p>
 */
public class CreateModelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a>
     * will be created.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * [Required] The name of the model. Must be alphanumeric.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of the model.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this
     * should be <a href="https://tools.ietf.org/html/draft-zyp-json-schema-04"
     * target="_blank">JSON schema draft 4</a> model.
     * </p>
     */
    private String schema;

    /**
     * <p>
     * [Required] The content-type for the model.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a>
     * will be created.
     * </p>
     *
     * @return <p>
     *         [Required] The <a>RestApi</a> identifier under which the
     *         <a>Model</a> will be created.
     *         </p>
     */
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a>
     * will be created.
     * </p>
     *
     * @param restApiId <p>
     *            [Required] The <a>RestApi</a> identifier under which the
     *            <a>Model</a> will be created.
     *            </p>
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a>
     * will be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restApiId <p>
     *            [Required] The <a>RestApi</a> identifier under which the
     *            <a>Model</a> will be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * [Required] The name of the model. Must be alphanumeric.
     * </p>
     *
     * @return <p>
     *         [Required] The name of the model. Must be alphanumeric.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * [Required] The name of the model. Must be alphanumeric.
     * </p>
     *
     * @param name <p>
     *            [Required] The name of the model. Must be alphanumeric.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * [Required] The name of the model. Must be alphanumeric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            [Required] The name of the model. Must be alphanumeric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withName(String name) {
        this.name = name;
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
    public CreateModelRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this
     * should be <a href="https://tools.ietf.org/html/draft-zyp-json-schema-04"
     * target="_blank">JSON schema draft 4</a> model.
     * </p>
     *
     * @return <p>
     *         The schema for the model. For <code>application/json</code>
     *         models, this should be <a
     *         href="https://tools.ietf.org/html/draft-zyp-json-schema-04"
     *         target="_blank">JSON schema draft 4</a> model.
     *         </p>
     */
    public String getSchema() {
        return schema;
    }

    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this
     * should be <a href="https://tools.ietf.org/html/draft-zyp-json-schema-04"
     * target="_blank">JSON schema draft 4</a> model.
     * </p>
     *
     * @param schema <p>
     *            The schema for the model. For <code>application/json</code>
     *            models, this should be <a
     *            href="https://tools.ietf.org/html/draft-zyp-json-schema-04"
     *            target="_blank">JSON schema draft 4</a> model.
     *            </p>
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema for the model. For <code>application/json</code> models, this
     * should be <a href="https://tools.ietf.org/html/draft-zyp-json-schema-04"
     * target="_blank">JSON schema draft 4</a> model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schema <p>
     *            The schema for the model. For <code>application/json</code>
     *            models, this should be <a
     *            href="https://tools.ietf.org/html/draft-zyp-json-schema-04"
     *            target="_blank">JSON schema draft 4</a> model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * <p>
     * [Required] The content-type for the model.
     * </p>
     *
     * @return <p>
     *         [Required] The content-type for the model.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * [Required] The content-type for the model.
     * </p>
     *
     * @param contentType <p>
     *            [Required] The content-type for the model.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * [Required] The content-type for the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            [Required] The content-type for the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateModelRequest withContentType(String contentType) {
        this.contentType = contentType;
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
        if (getRestApiId() != null)
            sb.append("restApiId: " + getRestApiId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getSchema() != null)
            sb.append("schema: " + getSchema() + ",");
        if (getContentType() != null)
            sb.append("contentType: " + getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateModelRequest == false)
            return false;
        CreateModelRequest other = (CreateModelRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }
}
