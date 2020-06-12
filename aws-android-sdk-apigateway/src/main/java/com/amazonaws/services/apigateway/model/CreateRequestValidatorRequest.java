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
 * Creates a <a>ReqeustValidator</a> of a given <a>RestApi</a>.
 * </p>
 */
public class CreateRequestValidatorRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * The name of the to-be-created <a>RequestValidator</a>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request body according to
     * the configured model schema for the method (<code>true</code>) or not (
     * <code>false</code>).
     * </p>
     */
    private Boolean validateRequestBody;

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request parameters,
     * <code>true</code>, or not <code>false</code>.
     * </p>
     */
    private Boolean validateRequestParameters;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @return <p>
     *         [Required] The string identifier of the associated
     *         <a>RestApi</a>.
     *         </p>
     */
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRequestValidatorRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * The name of the to-be-created <a>RequestValidator</a>.
     * </p>
     *
     * @return <p>
     *         The name of the to-be-created <a>RequestValidator</a>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the to-be-created <a>RequestValidator</a>.
     * </p>
     *
     * @param name <p>
     *            The name of the to-be-created <a>RequestValidator</a>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the to-be-created <a>RequestValidator</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the to-be-created <a>RequestValidator</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRequestValidatorRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request body according to
     * the configured model schema for the method (<code>true</code>) or not (
     * <code>false</code>).
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether to validate request body
     *         according to the configured model schema for the method (
     *         <code>true</code>) or not (<code>false</code>).
     *         </p>
     */
    public Boolean isValidateRequestBody() {
        return validateRequestBody;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request body according to
     * the configured model schema for the method (<code>true</code>) or not (
     * <code>false</code>).
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether to validate request body
     *         according to the configured model schema for the method (
     *         <code>true</code>) or not (<code>false</code>).
     *         </p>
     */
    public Boolean getValidateRequestBody() {
        return validateRequestBody;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request body according to
     * the configured model schema for the method (<code>true</code>) or not (
     * <code>false</code>).
     * </p>
     *
     * @param validateRequestBody <p>
     *            A Boolean flag to indicate whether to validate request body
     *            according to the configured model schema for the method (
     *            <code>true</code>) or not (<code>false</code>).
     *            </p>
     */
    public void setValidateRequestBody(Boolean validateRequestBody) {
        this.validateRequestBody = validateRequestBody;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request body according to
     * the configured model schema for the method (<code>true</code>) or not (
     * <code>false</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validateRequestBody <p>
     *            A Boolean flag to indicate whether to validate request body
     *            according to the configured model schema for the method (
     *            <code>true</code>) or not (<code>false</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRequestValidatorRequest withValidateRequestBody(Boolean validateRequestBody) {
        this.validateRequestBody = validateRequestBody;
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request parameters,
     * <code>true</code>, or not <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether to validate request
     *         parameters, <code>true</code>, or not <code>false</code>.
     *         </p>
     */
    public Boolean isValidateRequestParameters() {
        return validateRequestParameters;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request parameters,
     * <code>true</code>, or not <code>false</code>.
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether to validate request
     *         parameters, <code>true</code>, or not <code>false</code>.
     *         </p>
     */
    public Boolean getValidateRequestParameters() {
        return validateRequestParameters;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request parameters,
     * <code>true</code>, or not <code>false</code>.
     * </p>
     *
     * @param validateRequestParameters <p>
     *            A Boolean flag to indicate whether to validate request
     *            parameters, <code>true</code>, or not <code>false</code>.
     *            </p>
     */
    public void setValidateRequestParameters(Boolean validateRequestParameters) {
        this.validateRequestParameters = validateRequestParameters;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether to validate request parameters,
     * <code>true</code>, or not <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validateRequestParameters <p>
     *            A Boolean flag to indicate whether to validate request
     *            parameters, <code>true</code>, or not <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRequestValidatorRequest withValidateRequestParameters(
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
        if (getRestApiId() != null)
            sb.append("restApiId: " + getRestApiId() + ",");
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

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
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

        if (obj instanceof CreateRequestValidatorRequest == false)
            return false;
        CreateRequestValidatorRequest other = (CreateRequestValidatorRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
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
