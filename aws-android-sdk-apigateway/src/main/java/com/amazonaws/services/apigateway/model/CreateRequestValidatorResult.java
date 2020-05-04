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

/**
 * <p>
 * A set of validation rules for incoming <a>Method</a> requests.
 * </p>
 * <div class="remarks">
 * <p>
 * In OpenAPI, a <a>RequestValidator</a> of an API is defined by the <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validators.requestValidator.html"
 * >x-amazon-apigateway-request-validators.requestValidator</a> object. It the
 * referenced using the <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validator"
 * >x-amazon-apigateway-request-validator</a> property.
 * </p>
 * </div> <div class="seeAlso"><a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-request-validation.html"
 * >Enable Basic Request Validation in API Gateway</a></div>
 */
public class CreateRequestValidatorResult implements Serializable {
    /**
     * <p>
     * The identifier of this <a>RequestValidator</a>.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of this <a>RequestValidator</a>
     * </p>
     */
    private String name;

    /**
     * <p>
     * A Boolean flag to indicate whether to validate a request body according
     * to the configured <a>Model</a> schema.
     * </p>
     */
    private Boolean validateRequestBody;

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request parameters (
     * <code>true</code>) or not (<code>false</code>).
     * </p>
     */
    private Boolean validateRequestParameters;

    /**
     * <p>
     * The identifier of this <a>RequestValidator</a>.
     * </p>
     *
     * @return <p>
     *         The identifier of this <a>RequestValidator</a>.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of this <a>RequestValidator</a>.
     * </p>
     *
     * @param id <p>
     *            The identifier of this <a>RequestValidator</a>.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of this <a>RequestValidator</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of this <a>RequestValidator</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRequestValidatorResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of this <a>RequestValidator</a>
     * </p>
     *
     * @return <p>
     *         The name of this <a>RequestValidator</a>
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of this <a>RequestValidator</a>
     * </p>
     *
     * @param name <p>
     *            The name of this <a>RequestValidator</a>
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this <a>RequestValidator</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of this <a>RequestValidator</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRequestValidatorResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate a request body according
     * to the configured <a>Model</a> schema.
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether to validate a request body
     *         according to the configured <a>Model</a> schema.
     *         </p>
     */
    public Boolean isValidateRequestBody() {
        return validateRequestBody;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate a request body according
     * to the configured <a>Model</a> schema.
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether to validate a request body
     *         according to the configured <a>Model</a> schema.
     *         </p>
     */
    public Boolean getValidateRequestBody() {
        return validateRequestBody;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate a request body according
     * to the configured <a>Model</a> schema.
     * </p>
     *
     * @param validateRequestBody <p>
     *            A Boolean flag to indicate whether to validate a request body
     *            according to the configured <a>Model</a> schema.
     *            </p>
     */
    public void setValidateRequestBody(Boolean validateRequestBody) {
        this.validateRequestBody = validateRequestBody;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate a request body according
     * to the configured <a>Model</a> schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validateRequestBody <p>
     *            A Boolean flag to indicate whether to validate a request body
     *            according to the configured <a>Model</a> schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRequestValidatorResult withValidateRequestBody(Boolean validateRequestBody) {
        this.validateRequestBody = validateRequestBody;
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request parameters (
     * <code>true</code>) or not (<code>false</code>).
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether to validate request parameters
     *         (<code>true</code>) or not (<code>false</code>).
     *         </p>
     */
    public Boolean isValidateRequestParameters() {
        return validateRequestParameters;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request parameters (
     * <code>true</code>) or not (<code>false</code>).
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether to validate request parameters
     *         (<code>true</code>) or not (<code>false</code>).
     *         </p>
     */
    public Boolean getValidateRequestParameters() {
        return validateRequestParameters;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request parameters (
     * <code>true</code>) or not (<code>false</code>).
     * </p>
     *
     * @param validateRequestParameters <p>
     *            A Boolean flag to indicate whether to validate request
     *            parameters (<code>true</code>) or not (<code>false</code>).
     *            </p>
     */
    public void setValidateRequestParameters(Boolean validateRequestParameters) {
        this.validateRequestParameters = validateRequestParameters;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request parameters (
     * <code>true</code>) or not (<code>false</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validateRequestParameters <p>
     *            A Boolean flag to indicate whether to validate request
     *            parameters (<code>true</code>) or not (<code>false</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRequestValidatorResult withValidateRequestParameters(
            Boolean validateRequestParameters) {
        this.validateRequestParameters = validateRequestParameters;
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getValidateRequestBody() != null)
            sb.append("validateRequestBody: " + getValidateRequestBody() + ",");
        if (getValidateRequestParameters() != null)
            sb.append("validateRequestParameters: " + getValidateRequestParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getValidateRequestBody() == null) ? 0 : getValidateRequestBody().hashCode());
        hashCode = prime
                * hashCode
                + ((getValidateRequestParameters() == null) ? 0 : getValidateRequestParameters()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRequestValidatorResult == false)
            return false;
        CreateRequestValidatorResult other = (CreateRequestValidatorResult) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValidateRequestBody() == null ^ this.getValidateRequestBody() == null)
            return false;
        if (other.getValidateRequestBody() != null
                && other.getValidateRequestBody().equals(this.getValidateRequestBody()) == false)
            return false;
        if (other.getValidateRequestParameters() == null
                ^ this.getValidateRequestParameters() == null)
            return false;
        if (other.getValidateRequestParameters() != null
                && other.getValidateRequestParameters().equals(this.getValidateRequestParameters()) == false)
            return false;
        return true;
    }
}
