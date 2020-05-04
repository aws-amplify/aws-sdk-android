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
 * Represents an integration response. The status code must map to an existing
 * <a>MethodResponse</a>, and parameters and templates can be used to transform
 * the back-end response.
 * </p>
 * <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
 * >Creating an API</a> </div>
 */
public class GetIntegrationResponseResult implements Serializable {
    /**
     * <p>
     * Specifies the status code that is used to map the integration response to
     * an existing <a>MethodResponse</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     */
    private String statusCode;

    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an
     * integration response based on the response from the back end. For
     * example, if the success response returns nothing and the error response
     * returns some string, you could use the <code>.+</code> regex to match
     * error response. However, make sure that the error response does not
     * contain any newline (<code>\n</code>) character in such cases. If the
     * back end is an AWS Lambda function, the AWS Lambda function error header
     * is matched. For all other HTTP and AWS back ends, the HTTP status code is
     * matched.
     * </p>
     */
    private String selectionPattern;

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the
     * method response from the back end. The key is a method response header
     * parameter name and the mapped value is an integration response header
     * value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match
     * the pattern of <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid and unique header name. The mapped
     * non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or
     * <code>integration.response.body.{JSON-expression}</code>, where
     * <code>name</code> is a valid and unique response header name and
     * <code>JSON-expression</code> is a valid JSON expression without the
     * <code>$</code> prefix.
     * </p>
     */
    private java.util.Map<String, String> responseParameters;

    /**
     * <p>
     * Specifies the templates used to transform the integration response body.
     * Response templates are represented as a key/value map, with a
     * content-type as the key and a template as the value.
     * </p>
     */
    private java.util.Map<String, String> responseTemplates;

    /**
     * <p>
     * Specifies how to handle response payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the method response without
     * modification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     */
    private String contentHandling;

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to
     * an existing <a>MethodResponse</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @return <p>
     *         Specifies the status code that is used to map the integration
     *         response to an existing <a>MethodResponse</a>.
     *         </p>
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to
     * an existing <a>MethodResponse</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @param statusCode <p>
     *            Specifies the status code that is used to map the integration
     *            response to an existing <a>MethodResponse</a>.
     *            </p>
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to
     * an existing <a>MethodResponse</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @param statusCode <p>
     *            Specifies the status code that is used to map the integration
     *            response to an existing <a>MethodResponse</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationResponseResult withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an
     * integration response based on the response from the back end. For
     * example, if the success response returns nothing and the error response
     * returns some string, you could use the <code>.+</code> regex to match
     * error response. However, make sure that the error response does not
     * contain any newline (<code>\n</code>) character in such cases. If the
     * back end is an AWS Lambda function, the AWS Lambda function error header
     * is matched. For all other HTTP and AWS back ends, the HTTP status code is
     * matched.
     * </p>
     *
     * @return <p>
     *         Specifies the regular expression (regex) pattern used to choose
     *         an integration response based on the response from the back end.
     *         For example, if the success response returns nothing and the
     *         error response returns some string, you could use the
     *         <code>.+</code> regex to match error response. However, make sure
     *         that the error response does not contain any newline (
     *         <code>\n</code>) character in such cases. If the back end is an
     *         AWS Lambda function, the AWS Lambda function error header is
     *         matched. For all other HTTP and AWS back ends, the HTTP status
     *         code is matched.
     *         </p>
     */
    public String getSelectionPattern() {
        return selectionPattern;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an
     * integration response based on the response from the back end. For
     * example, if the success response returns nothing and the error response
     * returns some string, you could use the <code>.+</code> regex to match
     * error response. However, make sure that the error response does not
     * contain any newline (<code>\n</code>) character in such cases. If the
     * back end is an AWS Lambda function, the AWS Lambda function error header
     * is matched. For all other HTTP and AWS back ends, the HTTP status code is
     * matched.
     * </p>
     *
     * @param selectionPattern <p>
     *            Specifies the regular expression (regex) pattern used to
     *            choose an integration response based on the response from the
     *            back end. For example, if the success response returns nothing
     *            and the error response returns some string, you could use the
     *            <code>.+</code> regex to match error response. However, make
     *            sure that the error response does not contain any newline (
     *            <code>\n</code>) character in such cases. If the back end is
     *            an AWS Lambda function, the AWS Lambda function error header
     *            is matched. For all other HTTP and AWS back ends, the HTTP
     *            status code is matched.
     *            </p>
     */
    public void setSelectionPattern(String selectionPattern) {
        this.selectionPattern = selectionPattern;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an
     * integration response based on the response from the back end. For
     * example, if the success response returns nothing and the error response
     * returns some string, you could use the <code>.+</code> regex to match
     * error response. However, make sure that the error response does not
     * contain any newline (<code>\n</code>) character in such cases. If the
     * back end is an AWS Lambda function, the AWS Lambda function error header
     * is matched. For all other HTTP and AWS back ends, the HTTP status code is
     * matched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selectionPattern <p>
     *            Specifies the regular expression (regex) pattern used to
     *            choose an integration response based on the response from the
     *            back end. For example, if the success response returns nothing
     *            and the error response returns some string, you could use the
     *            <code>.+</code> regex to match error response. However, make
     *            sure that the error response does not contain any newline (
     *            <code>\n</code>) character in such cases. If the back end is
     *            an AWS Lambda function, the AWS Lambda function error header
     *            is matched. For all other HTTP and AWS back ends, the HTTP
     *            status code is matched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationResponseResult withSelectionPattern(String selectionPattern) {
        this.selectionPattern = selectionPattern;
        return this;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the
     * method response from the back end. The key is a method response header
     * parameter name and the mapped value is an integration response header
     * value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match
     * the pattern of <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid and unique header name. The mapped
     * non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or
     * <code>integration.response.body.{JSON-expression}</code>, where
     * <code>name</code> is a valid and unique response header name and
     * <code>JSON-expression</code> is a valid JSON expression without the
     * <code>$</code> prefix.
     * </p>
     *
     * @return <p>
     *         A key-value map specifying response parameters that are passed to
     *         the method response from the back end. The key is a method
     *         response header parameter name and the mapped value is an
     *         integration response header value, a static value enclosed within
     *         a pair of single quotes, or a JSON expression from the
     *         integration response body. The mapping key must match the pattern
     *         of <code>method.response.header.{name}</code>, where
     *         <code>name</code> is a valid and unique header name. The mapped
     *         non-static value must match the pattern of
     *         <code>integration.response.header.{name}</code> or
     *         <code>integration.response.body.{JSON-expression}</code>, where
     *         <code>name</code> is a valid and unique response header name and
     *         <code>JSON-expression</code> is a valid JSON expression without
     *         the <code>$</code> prefix.
     *         </p>
     */
    public java.util.Map<String, String> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the
     * method response from the back end. The key is a method response header
     * parameter name and the mapped value is an integration response header
     * value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match
     * the pattern of <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid and unique header name. The mapped
     * non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or
     * <code>integration.response.body.{JSON-expression}</code>, where
     * <code>name</code> is a valid and unique response header name and
     * <code>JSON-expression</code> is a valid JSON expression without the
     * <code>$</code> prefix.
     * </p>
     *
     * @param responseParameters <p>
     *            A key-value map specifying response parameters that are passed
     *            to the method response from the back end. The key is a method
     *            response header parameter name and the mapped value is an
     *            integration response header value, a static value enclosed
     *            within a pair of single quotes, or a JSON expression from the
     *            integration response body. The mapping key must match the
     *            pattern of <code>method.response.header.{name}</code>, where
     *            <code>name</code> is a valid and unique header name. The
     *            mapped non-static value must match the pattern of
     *            <code>integration.response.header.{name}</code> or
     *            <code>integration.response.body.{JSON-expression}</code>,
     *            where <code>name</code> is a valid and unique response header
     *            name and <code>JSON-expression</code> is a valid JSON
     *            expression without the <code>$</code> prefix.
     *            </p>
     */
    public void setResponseParameters(java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the
     * method response from the back end. The key is a method response header
     * parameter name and the mapped value is an integration response header
     * value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match
     * the pattern of <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid and unique header name. The mapped
     * non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or
     * <code>integration.response.body.{JSON-expression}</code>, where
     * <code>name</code> is a valid and unique response header name and
     * <code>JSON-expression</code> is a valid JSON expression without the
     * <code>$</code> prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseParameters <p>
     *            A key-value map specifying response parameters that are passed
     *            to the method response from the back end. The key is a method
     *            response header parameter name and the mapped value is an
     *            integration response header value, a static value enclosed
     *            within a pair of single quotes, or a JSON expression from the
     *            integration response body. The mapping key must match the
     *            pattern of <code>method.response.header.{name}</code>, where
     *            <code>name</code> is a valid and unique header name. The
     *            mapped non-static value must match the pattern of
     *            <code>integration.response.header.{name}</code> or
     *            <code>integration.response.body.{JSON-expression}</code>,
     *            where <code>name</code> is a valid and unique response header
     *            name and <code>JSON-expression</code> is a valid JSON
     *            expression without the <code>$</code> prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationResponseResult withResponseParameters(
            java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the
     * method response from the back end. The key is a method response header
     * parameter name and the mapped value is an integration response header
     * value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match
     * the pattern of <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid and unique header name. The mapped
     * non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or
     * <code>integration.response.body.{JSON-expression}</code>, where
     * <code>name</code> is a valid and unique response header name and
     * <code>JSON-expression</code> is a valid JSON expression without the
     * <code>$</code> prefix.
     * </p>
     * <p>
     * The method adds a new key-value pair into responseParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into responseParameters.
     * @param value The corresponding value of the entry to be added into
     *            responseParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationResponseResult addresponseParametersEntry(String key, String value) {
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
     * Removes all the entries added into responseParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetIntegrationResponseResult clearresponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the templates used to transform the integration response body.
     * Response templates are represented as a key/value map, with a
     * content-type as the key and a template as the value.
     * </p>
     *
     * @return <p>
     *         Specifies the templates used to transform the integration
     *         response body. Response templates are represented as a key/value
     *         map, with a content-type as the key and a template as the value.
     *         </p>
     */
    public java.util.Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * <p>
     * Specifies the templates used to transform the integration response body.
     * Response templates are represented as a key/value map, with a
     * content-type as the key and a template as the value.
     * </p>
     *
     * @param responseTemplates <p>
     *            Specifies the templates used to transform the integration
     *            response body. Response templates are represented as a
     *            key/value map, with a content-type as the key and a template
     *            as the value.
     *            </p>
     */
    public void setResponseTemplates(java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
    }

    /**
     * <p>
     * Specifies the templates used to transform the integration response body.
     * Response templates are represented as a key/value map, with a
     * content-type as the key and a template as the value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseTemplates <p>
     *            Specifies the templates used to transform the integration
     *            response body. Response templates are represented as a
     *            key/value map, with a content-type as the key and a template
     *            as the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationResponseResult withResponseTemplates(
            java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
        return this;
    }

    /**
     * <p>
     * Specifies the templates used to transform the integration response body.
     * Response templates are represented as a key/value map, with a
     * content-type as the key and a template as the value.
     * </p>
     * <p>
     * The method adds a new key-value pair into responseTemplates parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into responseTemplates.
     * @param value The corresponding value of the entry to be added into
     *            responseTemplates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIntegrationResponseResult addresponseTemplatesEntry(String key, String value) {
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
     * Removes all the entries added into responseTemplates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetIntegrationResponseResult clearresponseTemplatesEntries() {
        this.responseTemplates = null;
        return this;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the method response without
     * modification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @return <p>
     *         Specifies how to handle response payload content type
     *         conversions. Supported values are <code>CONVERT_TO_BINARY</code>
     *         and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CONVERT_TO_BINARY</code>: Converts a response payload from
     *         a Base64-encoded string to the corresponding binary blob.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONVERT_TO_TEXT</code>: Converts a response payload from a
     *         binary blob to a Base64-encoded string.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If this property is not defined, the response payload will be
     *         passed through from the integration response to the method
     *         response without modification.
     *         </p>
     * @see ContentHandlingStrategy
     */
    public String getContentHandling() {
        return contentHandling;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the method response without
     * modification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandling <p>
     *            Specifies how to handle response payload content type
     *            conversions. Supported values are
     *            <code>CONVERT_TO_BINARY</code> and
     *            <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_BINARY</code>: Converts a response payload
     *            from a Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_TEXT</code>: Converts a response payload from
     *            a binary blob to a Base64-encoded string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If this property is not defined, the response payload will be
     *            passed through from the integration response to the method
     *            response without modification.
     *            </p>
     * @see ContentHandlingStrategy
     */
    public void setContentHandling(String contentHandling) {
        this.contentHandling = contentHandling;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the method response without
     * modification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandling <p>
     *            Specifies how to handle response payload content type
     *            conversions. Supported values are
     *            <code>CONVERT_TO_BINARY</code> and
     *            <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_BINARY</code>: Converts a response payload
     *            from a Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_TEXT</code>: Converts a response payload from
     *            a binary blob to a Base64-encoded string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If this property is not defined, the response payload will be
     *            passed through from the integration response to the method
     *            response without modification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentHandlingStrategy
     */
    public GetIntegrationResponseResult withContentHandling(String contentHandling) {
        this.contentHandling = contentHandling;
        return this;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the method response without
     * modification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandling <p>
     *            Specifies how to handle response payload content type
     *            conversions. Supported values are
     *            <code>CONVERT_TO_BINARY</code> and
     *            <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_BINARY</code>: Converts a response payload
     *            from a Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_TEXT</code>: Converts a response payload from
     *            a binary blob to a Base64-encoded string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If this property is not defined, the response payload will be
     *            passed through from the integration response to the method
     *            response without modification.
     *            </p>
     * @see ContentHandlingStrategy
     */
    public void setContentHandling(ContentHandlingStrategy contentHandling) {
        this.contentHandling = contentHandling.toString();
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed
     * through from the integration response to the method response without
     * modification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandling <p>
     *            Specifies how to handle response payload content type
     *            conversions. Supported values are
     *            <code>CONVERT_TO_BINARY</code> and
     *            <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_BINARY</code>: Converts a response payload
     *            from a Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_TEXT</code>: Converts a response payload from
     *            a binary blob to a Base64-encoded string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If this property is not defined, the response payload will be
     *            passed through from the integration response to the method
     *            response without modification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentHandlingStrategy
     */
    public GetIntegrationResponseResult withContentHandling(ContentHandlingStrategy contentHandling) {
        this.contentHandling = contentHandling.toString();
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
        if (getStatusCode() != null)
            sb.append("statusCode: " + getStatusCode() + ",");
        if (getSelectionPattern() != null)
            sb.append("selectionPattern: " + getSelectionPattern() + ",");
        if (getResponseParameters() != null)
            sb.append("responseParameters: " + getResponseParameters() + ",");
        if (getResponseTemplates() != null)
            sb.append("responseTemplates: " + getResponseTemplates() + ",");
        if (getContentHandling() != null)
            sb.append("contentHandling: " + getContentHandling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode
                + ((getSelectionPattern() == null) ? 0 : getSelectionPattern().hashCode());
        hashCode = prime * hashCode
                + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode
                + ((getResponseTemplates() == null) ? 0 : getResponseTemplates().hashCode());
        hashCode = prime * hashCode
                + ((getContentHandling() == null) ? 0 : getContentHandling().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIntegrationResponseResult == false)
            return false;
        GetIntegrationResponseResult other = (GetIntegrationResponseResult) obj;

        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getSelectionPattern() == null ^ this.getSelectionPattern() == null)
            return false;
        if (other.getSelectionPattern() != null
                && other.getSelectionPattern().equals(this.getSelectionPattern()) == false)
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
        if (other.getContentHandling() == null ^ this.getContentHandling() == null)
            return false;
        if (other.getContentHandling() != null
                && other.getContentHandling().equals(this.getContentHandling()) == false)
            return false;
        return true;
    }
}
