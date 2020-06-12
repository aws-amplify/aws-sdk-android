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
 * Exports a deployed version of a <a>RestApi</a> in a specified format.
 * </p>
 */
public class GetExportRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * [Required] The name of the <a>Stage</a> that will be exported.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * [Required] The type of export. Acceptable values are 'oas30' for OpenAPI
     * 3.0.x and 'swagger' for Swagger/OpenAPI 2.0.
     * </p>
     */
    private String exportType;

    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the
     * export, depending on the requested <code>exportType</code>. For
     * <code>exportType</code> <code>oas30</code> and <code>swagger</code>, any
     * combination of the following parameters are supported:
     * <code>extensions='integrations'</code> or
     * <code>extensions='apigateway'</code> will export the API with
     * x-amazon-apigateway-integration extensions.
     * <code>extensions='authorizers'</code> will export the API with
     * x-amazon-apigateway-authorizer extensions. <code>postman</code> will
     * export the API with Postman extensions, allowing for import to the
     * Postman tool
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The content-type of the export, for example <code>application/json</code>
     * . Currently <code>application/json</code> and
     * <code>application/yaml</code> are supported for <code>exportType</code>
     * of<code>oas30</code> and <code>swagger</code>. This should be specified
     * in the <code>Accept</code> header for direct API requests.
     * </p>
     */
    private String accepts;

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
    public GetExportRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * [Required] The name of the <a>Stage</a> that will be exported.
     * </p>
     *
     * @return <p>
     *         [Required] The name of the <a>Stage</a> that will be exported.
     *         </p>
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * <p>
     * [Required] The name of the <a>Stage</a> that will be exported.
     * </p>
     *
     * @param stageName <p>
     *            [Required] The name of the <a>Stage</a> that will be exported.
     *            </p>
     */
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * [Required] The name of the <a>Stage</a> that will be exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageName <p>
     *            [Required] The name of the <a>Stage</a> that will be exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportRequest withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * <p>
     * [Required] The type of export. Acceptable values are 'oas30' for OpenAPI
     * 3.0.x and 'swagger' for Swagger/OpenAPI 2.0.
     * </p>
     *
     * @return <p>
     *         [Required] The type of export. Acceptable values are 'oas30' for
     *         OpenAPI 3.0.x and 'swagger' for Swagger/OpenAPI 2.0.
     *         </p>
     */
    public String getExportType() {
        return exportType;
    }

    /**
     * <p>
     * [Required] The type of export. Acceptable values are 'oas30' for OpenAPI
     * 3.0.x and 'swagger' for Swagger/OpenAPI 2.0.
     * </p>
     *
     * @param exportType <p>
     *            [Required] The type of export. Acceptable values are 'oas30'
     *            for OpenAPI 3.0.x and 'swagger' for Swagger/OpenAPI 2.0.
     *            </p>
     */
    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    /**
     * <p>
     * [Required] The type of export. Acceptable values are 'oas30' for OpenAPI
     * 3.0.x and 'swagger' for Swagger/OpenAPI 2.0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportType <p>
     *            [Required] The type of export. Acceptable values are 'oas30'
     *            for OpenAPI 3.0.x and 'swagger' for Swagger/OpenAPI 2.0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportRequest withExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }

    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the
     * export, depending on the requested <code>exportType</code>. For
     * <code>exportType</code> <code>oas30</code> and <code>swagger</code>, any
     * combination of the following parameters are supported:
     * <code>extensions='integrations'</code> or
     * <code>extensions='apigateway'</code> will export the API with
     * x-amazon-apigateway-integration extensions.
     * <code>extensions='authorizers'</code> will export the API with
     * x-amazon-apigateway-authorizer extensions. <code>postman</code> will
     * export the API with Postman extensions, allowing for import to the
     * Postman tool
     * </p>
     *
     * @return <p>
     *         A key-value map of query string parameters that specify
     *         properties of the export, depending on the requested
     *         <code>exportType</code>. For <code>exportType</code>
     *         <code>oas30</code> and <code>swagger</code>, any combination of
     *         the following parameters are supported:
     *         <code>extensions='integrations'</code> or
     *         <code>extensions='apigateway'</code> will export the API with
     *         x-amazon-apigateway-integration extensions.
     *         <code>extensions='authorizers'</code> will export the API with
     *         x-amazon-apigateway-authorizer extensions. <code>postman</code>
     *         will export the API with Postman extensions, allowing for import
     *         to the Postman tool
     *         </p>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the
     * export, depending on the requested <code>exportType</code>. For
     * <code>exportType</code> <code>oas30</code> and <code>swagger</code>, any
     * combination of the following parameters are supported:
     * <code>extensions='integrations'</code> or
     * <code>extensions='apigateway'</code> will export the API with
     * x-amazon-apigateway-integration extensions.
     * <code>extensions='authorizers'</code> will export the API with
     * x-amazon-apigateway-authorizer extensions. <code>postman</code> will
     * export the API with Postman extensions, allowing for import to the
     * Postman tool
     * </p>
     *
     * @param parameters <p>
     *            A key-value map of query string parameters that specify
     *            properties of the export, depending on the requested
     *            <code>exportType</code>. For <code>exportType</code>
     *            <code>oas30</code> and <code>swagger</code>, any combination
     *            of the following parameters are supported:
     *            <code>extensions='integrations'</code> or
     *            <code>extensions='apigateway'</code> will export the API with
     *            x-amazon-apigateway-integration extensions.
     *            <code>extensions='authorizers'</code> will export the API with
     *            x-amazon-apigateway-authorizer extensions.
     *            <code>postman</code> will export the API with Postman
     *            extensions, allowing for import to the Postman tool
     *            </p>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the
     * export, depending on the requested <code>exportType</code>. For
     * <code>exportType</code> <code>oas30</code> and <code>swagger</code>, any
     * combination of the following parameters are supported:
     * <code>extensions='integrations'</code> or
     * <code>extensions='apigateway'</code> will export the API with
     * x-amazon-apigateway-integration extensions.
     * <code>extensions='authorizers'</code> will export the API with
     * x-amazon-apigateway-authorizer extensions. <code>postman</code> will
     * export the API with Postman extensions, allowing for import to the
     * Postman tool
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A key-value map of query string parameters that specify
     *            properties of the export, depending on the requested
     *            <code>exportType</code>. For <code>exportType</code>
     *            <code>oas30</code> and <code>swagger</code>, any combination
     *            of the following parameters are supported:
     *            <code>extensions='integrations'</code> or
     *            <code>extensions='apigateway'</code> will export the API with
     *            x-amazon-apigateway-integration extensions.
     *            <code>extensions='authorizers'</code> will export the API with
     *            x-amazon-apigateway-authorizer extensions.
     *            <code>postman</code> will export the API with Postman
     *            extensions, allowing for import to the Postman tool
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportRequest withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the
     * export, depending on the requested <code>exportType</code>. For
     * <code>exportType</code> <code>oas30</code> and <code>swagger</code>, any
     * combination of the following parameters are supported:
     * <code>extensions='integrations'</code> or
     * <code>extensions='apigateway'</code> will export the API with
     * x-amazon-apigateway-integration extensions.
     * <code>extensions='authorizers'</code> will export the API with
     * x-amazon-apigateway-authorizer extensions. <code>postman</code> will
     * export the API with Postman extensions, allowing for import to the
     * Postman tool
     * </p>
     * <p>
     * The method adds a new key-value pair into parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into parameters.
     * @param value The corresponding value of the entry to be added into
     *            parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportRequest addparametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetExportRequest clearparametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The content-type of the export, for example <code>application/json</code>
     * . Currently <code>application/json</code> and
     * <code>application/yaml</code> are supported for <code>exportType</code>
     * of<code>oas30</code> and <code>swagger</code>. This should be specified
     * in the <code>Accept</code> header for direct API requests.
     * </p>
     *
     * @return <p>
     *         The content-type of the export, for example
     *         <code>application/json</code>. Currently
     *         <code>application/json</code> and <code>application/yaml</code>
     *         are supported for <code>exportType</code> of<code>oas30</code>
     *         and <code>swagger</code>. This should be specified in the
     *         <code>Accept</code> header for direct API requests.
     *         </p>
     */
    public String getAccepts() {
        return accepts;
    }

    /**
     * <p>
     * The content-type of the export, for example <code>application/json</code>
     * . Currently <code>application/json</code> and
     * <code>application/yaml</code> are supported for <code>exportType</code>
     * of<code>oas30</code> and <code>swagger</code>. This should be specified
     * in the <code>Accept</code> header for direct API requests.
     * </p>
     *
     * @param accepts <p>
     *            The content-type of the export, for example
     *            <code>application/json</code>. Currently
     *            <code>application/json</code> and
     *            <code>application/yaml</code> are supported for
     *            <code>exportType</code> of<code>oas30</code> and
     *            <code>swagger</code>. This should be specified in the
     *            <code>Accept</code> header for direct API requests.
     *            </p>
     */
    public void setAccepts(String accepts) {
        this.accepts = accepts;
    }

    /**
     * <p>
     * The content-type of the export, for example <code>application/json</code>
     * . Currently <code>application/json</code> and
     * <code>application/yaml</code> are supported for <code>exportType</code>
     * of<code>oas30</code> and <code>swagger</code>. This should be specified
     * in the <code>Accept</code> header for direct API requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accepts <p>
     *            The content-type of the export, for example
     *            <code>application/json</code>. Currently
     *            <code>application/json</code> and
     *            <code>application/yaml</code> are supported for
     *            <code>exportType</code> of<code>oas30</code> and
     *            <code>swagger</code>. This should be specified in the
     *            <code>Accept</code> header for direct API requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportRequest withAccepts(String accepts) {
        this.accepts = accepts;
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
        if (getStageName() != null)
            sb.append("stageName: " + getStageName() + ",");
        if (getExportType() != null)
            sb.append("exportType: " + getExportType() + ",");
        if (getParameters() != null)
            sb.append("parameters: " + getParameters() + ",");
        if (getAccepts() != null)
            sb.append("accepts: " + getAccepts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getExportType() == null) ? 0 : getExportType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getAccepts() == null) ? 0 : getAccepts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportRequest == false)
            return false;
        GetExportRequest other = (GetExportRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null
                && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getExportType() == null ^ this.getExportType() == null)
            return false;
        if (other.getExportType() != null
                && other.getExportType().equals(this.getExportType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getAccepts() == null ^ this.getAccepts() == null)
            return false;
        if (other.getAccepts() != null && other.getAccepts().equals(this.getAccepts()) == false)
            return false;
        return true;
    }
}
