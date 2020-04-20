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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an IntegrationResponses.
 * </p>
 */
public class UpdateIntegrationResponseRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response
     * payload content type conversions. Supported values are CONVERT_TO_BINARY
     * and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded
     * string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a
     * Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the route response or method
     * response without modification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     */
    private String contentHandlingStrategy;

    /**
     * <p>
     * The integration ID.
     * </p>
     */
    private String integrationId;

    /**
     * <p>
     * The integration response ID.
     * </p>
     */
    private String integrationResponseId;

    /**
     * <p>
     * The integration response key.
     * </p>
     */
    private String integrationResponseKey;

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the
     * method response from the backend. The key is a method response header
     * parameter name and the mapped value is an integration response header
     * value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match
     * the pattern of method.response.header.<replaceable>{name}</replaceable> ,
     * where name is a valid and unique header name. The mapped non-static value
     * must match the pattern of
     * integration.response.header.<replaceable>{name}</replaceable> or
     * integration.response.body.<replaceable>{JSON-expression}</replaceable> ,
     * where <replaceable>{name}</replaceable> is a valid and unique response
     * header name and <replaceable>{JSON-expression}</replaceable> is a valid
     * JSON expression without the $ prefix.
     * </p>
     */
    private java.util.Map<String, String> responseParameters;

    /**
     * <p>
     * The collection of response templates for the integration response as a
     * string-to-string map of key-value pairs. Response templates are
     * represented as a key/value map, with a content-type as the key and a
     * template as the value.
     * </p>
     */
    private java.util.Map<String, String> responseTemplates;

    /**
     * <p>
     * The template selection expression for the integration response. Supported
     * only for WebSocket APIs.
     * </p>
     */
    private String templateSelectionExpression;

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @return <p>
     *         The API identifier.
     *         </p>
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiId <p>
     *            The API identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResponseRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response
     * payload content type conversions. Supported values are CONVERT_TO_BINARY
     * and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded
     * string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a
     * Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the route response or method
     * response without modification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @return <p>
     *         Supported only for WebSocket APIs. Specifies how to handle
     *         response payload content type conversions. Supported values are
     *         CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following
     *         behaviors:
     *         </p>
     *         <p>
     *         CONVERT_TO_BINARY: Converts a response payload from a
     *         Base64-encoded string to the corresponding binary blob.
     *         </p>
     *         <p>
     *         CONVERT_TO_TEXT: Converts a response payload from a binary blob
     *         to a Base64-encoded string.
     *         </p>
     *         <p>
     *         If this property is not defined, the response payload will be
     *         passed through from the integration response to the route
     *         response or method response without modification.
     *         </p>
     * @see ContentHandlingStrategy
     */
    public String getContentHandlingStrategy() {
        return contentHandlingStrategy;
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response
     * payload content type conversions. Supported values are CONVERT_TO_BINARY
     * and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded
     * string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a
     * Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the route response or method
     * response without modification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandlingStrategy <p>
     *            Supported only for WebSocket APIs. Specifies how to handle
     *            response payload content type conversions. Supported values
     *            are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following
     *            behaviors:
     *            </p>
     *            <p>
     *            CONVERT_TO_BINARY: Converts a response payload from a
     *            Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            <p>
     *            CONVERT_TO_TEXT: Converts a response payload from a binary
     *            blob to a Base64-encoded string.
     *            </p>
     *            <p>
     *            If this property is not defined, the response payload will be
     *            passed through from the integration response to the route
     *            response or method response without modification.
     *            </p>
     * @see ContentHandlingStrategy
     */
    public void setContentHandlingStrategy(String contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy;
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response
     * payload content type conversions. Supported values are CONVERT_TO_BINARY
     * and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded
     * string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a
     * Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the route response or method
     * response without modification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandlingStrategy <p>
     *            Supported only for WebSocket APIs. Specifies how to handle
     *            response payload content type conversions. Supported values
     *            are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following
     *            behaviors:
     *            </p>
     *            <p>
     *            CONVERT_TO_BINARY: Converts a response payload from a
     *            Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            <p>
     *            CONVERT_TO_TEXT: Converts a response payload from a binary
     *            blob to a Base64-encoded string.
     *            </p>
     *            <p>
     *            If this property is not defined, the response payload will be
     *            passed through from the integration response to the route
     *            response or method response without modification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentHandlingStrategy
     */
    public UpdateIntegrationResponseRequest withContentHandlingStrategy(
            String contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy;
        return this;
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response
     * payload content type conversions. Supported values are CONVERT_TO_BINARY
     * and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded
     * string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a
     * Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the route response or method
     * response without modification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandlingStrategy <p>
     *            Supported only for WebSocket APIs. Specifies how to handle
     *            response payload content type conversions. Supported values
     *            are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following
     *            behaviors:
     *            </p>
     *            <p>
     *            CONVERT_TO_BINARY: Converts a response payload from a
     *            Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            <p>
     *            CONVERT_TO_TEXT: Converts a response payload from a binary
     *            blob to a Base64-encoded string.
     *            </p>
     *            <p>
     *            If this property is not defined, the response payload will be
     *            passed through from the integration response to the route
     *            response or method response without modification.
     *            </p>
     * @see ContentHandlingStrategy
     */
    public void setContentHandlingStrategy(ContentHandlingStrategy contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy.toString();
    }

    /**
     * <p>
     * Supported only for WebSocket APIs. Specifies how to handle response
     * payload content type conversions. Supported values are CONVERT_TO_BINARY
     * and CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded
     * string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a
     * Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the route response or method
     * response without modification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandlingStrategy <p>
     *            Supported only for WebSocket APIs. Specifies how to handle
     *            response payload content type conversions. Supported values
     *            are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following
     *            behaviors:
     *            </p>
     *            <p>
     *            CONVERT_TO_BINARY: Converts a response payload from a
     *            Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            <p>
     *            CONVERT_TO_TEXT: Converts a response payload from a binary
     *            blob to a Base64-encoded string.
     *            </p>
     *            <p>
     *            If this property is not defined, the response payload will be
     *            passed through from the integration response to the route
     *            response or method response without modification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentHandlingStrategy
     */
    public UpdateIntegrationResponseRequest withContentHandlingStrategy(
            ContentHandlingStrategy contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The integration ID.
     * </p>
     *
     * @return <p>
     *         The integration ID.
     *         </p>
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * <p>
     * The integration ID.
     * </p>
     *
     * @param integrationId <p>
     *            The integration ID.
     *            </p>
     */
    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    /**
     * <p>
     * The integration ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationId <p>
     *            The integration ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResponseRequest withIntegrationId(String integrationId) {
        this.integrationId = integrationId;
        return this;
    }

    /**
     * <p>
     * The integration response ID.
     * </p>
     *
     * @return <p>
     *         The integration response ID.
     *         </p>
     */
    public String getIntegrationResponseId() {
        return integrationResponseId;
    }

    /**
     * <p>
     * The integration response ID.
     * </p>
     *
     * @param integrationResponseId <p>
     *            The integration response ID.
     *            </p>
     */
    public void setIntegrationResponseId(String integrationResponseId) {
        this.integrationResponseId = integrationResponseId;
    }

    /**
     * <p>
     * The integration response ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationResponseId <p>
     *            The integration response ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResponseRequest withIntegrationResponseId(String integrationResponseId) {
        this.integrationResponseId = integrationResponseId;
        return this;
    }

    /**
     * <p>
     * The integration response key.
     * </p>
     *
     * @return <p>
     *         The integration response key.
     *         </p>
     */
    public String getIntegrationResponseKey() {
        return integrationResponseKey;
    }

    /**
     * <p>
     * The integration response key.
     * </p>
     *
     * @param integrationResponseKey <p>
     *            The integration response key.
     *            </p>
     */
    public void setIntegrationResponseKey(String integrationResponseKey) {
        this.integrationResponseKey = integrationResponseKey;
    }

    /**
     * <p>
     * The integration response key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationResponseKey <p>
     *            The integration response key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResponseRequest withIntegrationResponseKey(String integrationResponseKey) {
        this.integrationResponseKey = integrationResponseKey;
        return this;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the
     * method response from the backend. The key is a method response header
     * parameter name and the mapped value is an integration response header
     * value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match
     * the pattern of method.response.header.<replaceable>{name}</replaceable> ,
     * where name is a valid and unique header name. The mapped non-static value
     * must match the pattern of
     * integration.response.header.<replaceable>{name}</replaceable> or
     * integration.response.body.<replaceable>{JSON-expression}</replaceable> ,
     * where <replaceable>{name}</replaceable> is a valid and unique response
     * header name and <replaceable>{JSON-expression}</replaceable> is a valid
     * JSON expression without the $ prefix.
     * </p>
     *
     * @return <p>
     *         A key-value map specifying response parameters that are passed to
     *         the method response from the backend. The key is a method
     *         response header parameter name and the mapped value is an
     *         integration response header value, a static value enclosed within
     *         a pair of single quotes, or a JSON expression from the
     *         integration response body. The mapping key must match the pattern
     *         of method.response.header.<replaceable>{name}</replaceable> ,
     *         where name is a valid and unique header name. The mapped
     *         non-static value must match the pattern of
     *         integration.response.header.<replaceable>{name}</replaceable> or
     *         integration
     *         .response.body.<replaceable>{JSON-expression}</replaceable> ,
     *         where <replaceable>{name}</replaceable> is a valid and unique
     *         response header name and
     *         <replaceable>{JSON-expression}</replaceable> is a valid JSON
     *         expression without the $ prefix.
     *         </p>
     */
    public java.util.Map<String, String> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the
     * method response from the backend. The key is a method response header
     * parameter name and the mapped value is an integration response header
     * value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match
     * the pattern of method.response.header.<replaceable>{name}</replaceable> ,
     * where name is a valid and unique header name. The mapped non-static value
     * must match the pattern of
     * integration.response.header.<replaceable>{name}</replaceable> or
     * integration.response.body.<replaceable>{JSON-expression}</replaceable> ,
     * where <replaceable>{name}</replaceable> is a valid and unique response
     * header name and <replaceable>{JSON-expression}</replaceable> is a valid
     * JSON expression without the $ prefix.
     * </p>
     *
     * @param responseParameters <p>
     *            A key-value map specifying response parameters that are passed
     *            to the method response from the backend. The key is a method
     *            response header parameter name and the mapped value is an
     *            integration response header value, a static value enclosed
     *            within a pair of single quotes, or a JSON expression from the
     *            integration response body. The mapping key must match the
     *            pattern of
     *            method.response.header.<replaceable>{name}</replaceable> ,
     *            where name is a valid and unique header name. The mapped
     *            non-static value must match the pattern of
     *            integration.response.header.<replaceable>{name}</replaceable>
     *            or integration.response.body.<replaceable>{JSON-expression}</
     *            replaceable> , where <replaceable>{name}</replaceable> is a
     *            valid and unique response header name and
     *            <replaceable>{JSON-expression}</replaceable> is a valid JSON
     *            expression without the $ prefix.
     *            </p>
     */
    public void setResponseParameters(java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the
     * method response from the backend. The key is a method response header
     * parameter name and the mapped value is an integration response header
     * value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match
     * the pattern of method.response.header.<replaceable>{name}</replaceable> ,
     * where name is a valid and unique header name. The mapped non-static value
     * must match the pattern of
     * integration.response.header.<replaceable>{name}</replaceable> or
     * integration.response.body.<replaceable>{JSON-expression}</replaceable> ,
     * where <replaceable>{name}</replaceable> is a valid and unique response
     * header name and <replaceable>{JSON-expression}</replaceable> is a valid
     * JSON expression without the $ prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseParameters <p>
     *            A key-value map specifying response parameters that are passed
     *            to the method response from the backend. The key is a method
     *            response header parameter name and the mapped value is an
     *            integration response header value, a static value enclosed
     *            within a pair of single quotes, or a JSON expression from the
     *            integration response body. The mapping key must match the
     *            pattern of
     *            method.response.header.<replaceable>{name}</replaceable> ,
     *            where name is a valid and unique header name. The mapped
     *            non-static value must match the pattern of
     *            integration.response.header.<replaceable>{name}</replaceable>
     *            or integration.response.body.<replaceable>{JSON-expression}</
     *            replaceable> , where <replaceable>{name}</replaceable> is a
     *            valid and unique response header name and
     *            <replaceable>{JSON-expression}</replaceable> is a valid JSON
     *            expression without the $ prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResponseRequest withResponseParameters(
            java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the
     * method response from the backend. The key is a method response header
     * parameter name and the mapped value is an integration response header
     * value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match
     * the pattern of method.response.header.<replaceable>{name}</replaceable> ,
     * where name is a valid and unique header name. The mapped non-static value
     * must match the pattern of
     * integration.response.header.<replaceable>{name}</replaceable> or
     * integration.response.body.<replaceable>{JSON-expression}</replaceable> ,
     * where <replaceable>{name}</replaceable> is a valid and unique response
     * header name and <replaceable>{JSON-expression}</replaceable> is a valid
     * JSON expression without the $ prefix.
     * </p>
     * <p>
     * The method adds a new key-value pair into ResponseParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ResponseParameters.
     * @param value The corresponding value of the entry to be added into
     *            ResponseParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResponseRequest addResponseParametersEntry(String key, String value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, String>();
        }
        if (this.responseParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.responseParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateIntegrationResponseRequest clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * The collection of response templates for the integration response as a
     * string-to-string map of key-value pairs. Response templates are
     * represented as a key/value map, with a content-type as the key and a
     * template as the value.
     * </p>
     *
     * @return <p>
     *         The collection of response templates for the integration response
     *         as a string-to-string map of key-value pairs. Response templates
     *         are represented as a key/value map, with a content-type as the
     *         key and a template as the value.
     *         </p>
     */
    public java.util.Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * <p>
     * The collection of response templates for the integration response as a
     * string-to-string map of key-value pairs. Response templates are
     * represented as a key/value map, with a content-type as the key and a
     * template as the value.
     * </p>
     *
     * @param responseTemplates <p>
     *            The collection of response templates for the integration
     *            response as a string-to-string map of key-value pairs.
     *            Response templates are represented as a key/value map, with a
     *            content-type as the key and a template as the value.
     *            </p>
     */
    public void setResponseTemplates(java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
    }

    /**
     * <p>
     * The collection of response templates for the integration response as a
     * string-to-string map of key-value pairs. Response templates are
     * represented as a key/value map, with a content-type as the key and a
     * template as the value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseTemplates <p>
     *            The collection of response templates for the integration
     *            response as a string-to-string map of key-value pairs.
     *            Response templates are represented as a key/value map, with a
     *            content-type as the key and a template as the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResponseRequest withResponseTemplates(
            java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
        return this;
    }

    /**
     * <p>
     * The collection of response templates for the integration response as a
     * string-to-string map of key-value pairs. Response templates are
     * represented as a key/value map, with a content-type as the key and a
     * template as the value.
     * </p>
     * <p>
     * The method adds a new key-value pair into ResponseTemplates parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ResponseTemplates.
     * @param value The corresponding value of the entry to be added into
     *            ResponseTemplates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResponseRequest addResponseTemplatesEntry(String key, String value) {
        if (null == this.responseTemplates) {
            this.responseTemplates = new java.util.HashMap<String, String>();
        }
        if (this.responseTemplates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.responseTemplates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseTemplates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateIntegrationResponseRequest clearResponseTemplatesEntries() {
        this.responseTemplates = null;
        return this;
    }

    /**
     * <p>
     * The template selection expression for the integration response. Supported
     * only for WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         The template selection expression for the integration response.
     *         Supported only for WebSocket APIs.
     *         </p>
     */
    public String getTemplateSelectionExpression() {
        return templateSelectionExpression;
    }

    /**
     * <p>
     * The template selection expression for the integration response. Supported
     * only for WebSocket APIs.
     * </p>
     *
     * @param templateSelectionExpression <p>
     *            The template selection expression for the integration
     *            response. Supported only for WebSocket APIs.
     *            </p>
     */
    public void setTemplateSelectionExpression(String templateSelectionExpression) {
        this.templateSelectionExpression = templateSelectionExpression;
    }

    /**
     * <p>
     * The template selection expression for the integration response. Supported
     * only for WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateSelectionExpression <p>
     *            The template selection expression for the integration
     *            response. Supported only for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResponseRequest withTemplateSelectionExpression(
            String templateSelectionExpression) {
        this.templateSelectionExpression = templateSelectionExpression;
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
        if (getApiId() != null)
            sb.append("ApiId: " + getApiId() + ",");
        if (getContentHandlingStrategy() != null)
            sb.append("ContentHandlingStrategy: " + getContentHandlingStrategy() + ",");
        if (getIntegrationId() != null)
            sb.append("IntegrationId: " + getIntegrationId() + ",");
        if (getIntegrationResponseId() != null)
            sb.append("IntegrationResponseId: " + getIntegrationResponseId() + ",");
        if (getIntegrationResponseKey() != null)
            sb.append("IntegrationResponseKey: " + getIntegrationResponseKey() + ",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: " + getResponseParameters() + ",");
        if (getResponseTemplates() != null)
            sb.append("ResponseTemplates: " + getResponseTemplates() + ",");
        if (getTemplateSelectionExpression() != null)
            sb.append("TemplateSelectionExpression: " + getTemplateSelectionExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime
                * hashCode
                + ((getContentHandlingStrategy() == null) ? 0 : getContentHandlingStrategy()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIntegrationId() == null) ? 0 : getIntegrationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getIntegrationResponseId() == null) ? 0 : getIntegrationResponseId().hashCode());
        hashCode = prime
                * hashCode
                + ((getIntegrationResponseKey() == null) ? 0 : getIntegrationResponseKey()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode
                + ((getResponseTemplates() == null) ? 0 : getResponseTemplates().hashCode());
        hashCode = prime
                * hashCode
                + ((getTemplateSelectionExpression() == null) ? 0
                        : getTemplateSelectionExpression().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIntegrationResponseRequest == false)
            return false;
        UpdateIntegrationResponseRequest other = (UpdateIntegrationResponseRequest) obj;

        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getContentHandlingStrategy() == null ^ this.getContentHandlingStrategy() == null)
            return false;
        if (other.getContentHandlingStrategy() != null
                && other.getContentHandlingStrategy().equals(this.getContentHandlingStrategy()) == false)
            return false;
        if (other.getIntegrationId() == null ^ this.getIntegrationId() == null)
            return false;
        if (other.getIntegrationId() != null
                && other.getIntegrationId().equals(this.getIntegrationId()) == false)
            return false;
        if (other.getIntegrationResponseId() == null ^ this.getIntegrationResponseId() == null)
            return false;
        if (other.getIntegrationResponseId() != null
                && other.getIntegrationResponseId().equals(this.getIntegrationResponseId()) == false)
            return false;
        if (other.getIntegrationResponseKey() == null ^ this.getIntegrationResponseKey() == null)
            return false;
        if (other.getIntegrationResponseKey() != null
                && other.getIntegrationResponseKey().equals(this.getIntegrationResponseKey()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null
                && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getResponseTemplates() == null ^ this.getResponseTemplates() == null)
            return false;
        if (other.getResponseTemplates() != null
                && other.getResponseTemplates().equals(this.getResponseTemplates()) == false)
            return false;
        if (other.getTemplateSelectionExpression() == null
                ^ this.getTemplateSelectionExpression() == null)
            return false;
        if (other.getTemplateSelectionExpression() != null
                && other.getTemplateSelectionExpression().equals(
                        this.getTemplateSelectionExpression()) == false)
            return false;
        return true;
    }
}
