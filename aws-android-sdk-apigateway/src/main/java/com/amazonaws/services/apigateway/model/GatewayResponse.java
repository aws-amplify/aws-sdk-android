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
 * A gateway response of a given response type and status code, with optional
 * response parameters and mapping templates.
 * </p>
 * <div class="remarks"> For more information about valid gateway response
 * types, see <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html"
 * >Gateway Response Types Supported by API Gateway</a> <div class="example">
 * <h4>Example: Get a Gateway Response of a given response type</h4> <h5>Request
 * </h5>
 * <p>
 * This example shows how to get a gateway response of the
 * <code>MISSING_AUTHENTICATION_TOKEN</code> type.
 * </p>
 * 
 * <pre>
 * <code>GET /restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN HTTP/1.1 Host: beta-apigateway.us-east-1.amazonaws.com Content-Type: application/json X-Amz-Date: 20170503T202516Z Authorization: AWS4-HMAC-SHA256 Credential={access-key-id}/20170503/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature=1b52460e3159c1a26cff29093855d50ea141c1c5b937528fecaf60f51129697a Cache-Control: no-cache Postman-Token: 3b2a1ce9-c848-2e26-2e2f-9c2caefbed45 </code>
 * </pre>
 * <p>
 * The response type is specified as a URL path.
 * </p>
 * <h5>Response</h5>
 * <p>
 * The successful operation returns the <code>200 OK</code> status code and a
 * payload similar to the following:
 * </p>
 * 
 * <pre>
 * <code>{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-gatewayresponse-{rel}.html", "name": "gatewayresponse", "templated": true }, "self": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, "gatewayresponse:delete": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" } }, "defaultResponse": false, "responseParameters": { "gatewayresponse.header.x-request-path": "method.request.path.petId", "gatewayresponse.header.Access-Control-Allow-Origin": "&apos;a.b.c&apos;", "gatewayresponse.header.x-request-query": "method.request.querystring.q", "gatewayresponse.header.x-request-header": "method.request.header.Accept" }, "responseTemplates": { "application/json": "{\n \"message\": $context.error.messageString,\n \"type\": \"$context.error.responseType\",\n \"stage\": \"$context.stage\",\n \"resourcePath\": \"$context.resourcePath\",\n \"stageVariables.a\": \"$stageVariables.a\",\n \"statusCode\": \"&apos;404&apos;\"\n}" }, "responseType": "MISSING_AUTHENTICATION_TOKEN", "statusCode": "404" }</code>
 * </pre>
 * <p>
 * </p>
 * </div> </div> <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/customize-gateway-responses.html"
 * >Customize Gateway Responses</a> </div>
 */
public class GatewayResponse implements Serializable {
    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     */
    private String responseType;

    /**
     * <p>
     * The HTTP status code for this <a>GatewayResponse</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     */
    private String statusCode;

    /**
     * <p>
     * Response parameters (paths, query strings and headers) of the
     * <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
     */
    private java.util.Map<String, String> responseParameters;

    /**
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string
     * map of key-value pairs.
     * </p>
     */
    private java.util.Map<String, String> responseTemplates;

    /**
     * <p>
     * A Boolean flag to indicate whether this <a>GatewayResponse</a> is the
     * default gateway response (<code>true</code>) or not (<code>false</code>).
     * A default gateway response is one generated by API Gateway without any
     * customization by an API developer.
     * </p>
     */
    private Boolean defaultResponse;

    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     *
     * @return <p>
     *         The response type of the associated <a>GatewayResponse</a>. Valid
     *         values are
     *         <ul>
     *         <li>ACCESS_DENIED</li>
     *         <li>API_CONFIGURATION_ERROR</li>
     *         <li>AUTHORIZER_FAILURE</li>
     *         <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *         <li>BAD_REQUEST_PARAMETERS</li>
     *         <li>BAD_REQUEST_BODY</li>
     *         <li>DEFAULT_4XX</li>
     *         <li>DEFAULT_5XX</li>
     *         <li>EXPIRED_TOKEN</li>
     *         <li>INVALID_SIGNATURE</li>
     *         <li>INTEGRATION_FAILURE</li>
     *         <li>INTEGRATION_TIMEOUT</li>
     *         <li>INVALID_API_KEY</li>
     *         <li>MISSING_AUTHENTICATION_TOKEN</li>
     *         <li>QUOTA_EXCEEDED</li>
     *         <li>REQUEST_TOO_LARGE</li>
     *         <li>RESOURCE_NOT_FOUND</li>
     *         <li>THROTTLED</li>
     *         <li>UNAUTHORIZED</li>
     *         <li>UNSUPPORTED_MEDIA_TYPE</li>
     *         </ul>
     *         </p>
     * @see GatewayResponseType
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     *
     * @param responseType <p>
     *            The response type of the associated <a>GatewayResponse</a>.
     *            Valid values are
     *            <ul>
     *            <li>ACCESS_DENIED</li>
     *            <li>API_CONFIGURATION_ERROR</li>
     *            <li>AUTHORIZER_FAILURE</li>
     *            <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *            <li>BAD_REQUEST_PARAMETERS</li>
     *            <li>BAD_REQUEST_BODY</li>
     *            <li>DEFAULT_4XX</li>
     *            <li>DEFAULT_5XX</li>
     *            <li>EXPIRED_TOKEN</li>
     *            <li>INVALID_SIGNATURE</li>
     *            <li>INTEGRATION_FAILURE</li>
     *            <li>INTEGRATION_TIMEOUT</li>
     *            <li>INVALID_API_KEY</li>
     *            <li>MISSING_AUTHENTICATION_TOKEN</li>
     *            <li>QUOTA_EXCEEDED</li>
     *            <li>REQUEST_TOO_LARGE</li>
     *            <li>RESOURCE_NOT_FOUND</li>
     *            <li>THROTTLED</li>
     *            <li>UNAUTHORIZED</li>
     *            <li>UNSUPPORTED_MEDIA_TYPE</li>
     *            </ul>
     *            </p>
     * @see GatewayResponseType
     */
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     *
     * @param responseType <p>
     *            The response type of the associated <a>GatewayResponse</a>.
     *            Valid values are
     *            <ul>
     *            <li>ACCESS_DENIED</li>
     *            <li>API_CONFIGURATION_ERROR</li>
     *            <li>AUTHORIZER_FAILURE</li>
     *            <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *            <li>BAD_REQUEST_PARAMETERS</li>
     *            <li>BAD_REQUEST_BODY</li>
     *            <li>DEFAULT_4XX</li>
     *            <li>DEFAULT_5XX</li>
     *            <li>EXPIRED_TOKEN</li>
     *            <li>INVALID_SIGNATURE</li>
     *            <li>INTEGRATION_FAILURE</li>
     *            <li>INTEGRATION_TIMEOUT</li>
     *            <li>INVALID_API_KEY</li>
     *            <li>MISSING_AUTHENTICATION_TOKEN</li>
     *            <li>QUOTA_EXCEEDED</li>
     *            <li>REQUEST_TOO_LARGE</li>
     *            <li>RESOURCE_NOT_FOUND</li>
     *            <li>THROTTLED</li>
     *            <li>UNAUTHORIZED</li>
     *            <li>UNSUPPORTED_MEDIA_TYPE</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayResponseType
     */
    public GatewayResponse withResponseType(String responseType) {
        this.responseType = responseType;
        return this;
    }

    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     *
     * @param responseType <p>
     *            The response type of the associated <a>GatewayResponse</a>.
     *            Valid values are
     *            <ul>
     *            <li>ACCESS_DENIED</li>
     *            <li>API_CONFIGURATION_ERROR</li>
     *            <li>AUTHORIZER_FAILURE</li>
     *            <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *            <li>BAD_REQUEST_PARAMETERS</li>
     *            <li>BAD_REQUEST_BODY</li>
     *            <li>DEFAULT_4XX</li>
     *            <li>DEFAULT_5XX</li>
     *            <li>EXPIRED_TOKEN</li>
     *            <li>INVALID_SIGNATURE</li>
     *            <li>INTEGRATION_FAILURE</li>
     *            <li>INTEGRATION_TIMEOUT</li>
     *            <li>INVALID_API_KEY</li>
     *            <li>MISSING_AUTHENTICATION_TOKEN</li>
     *            <li>QUOTA_EXCEEDED</li>
     *            <li>REQUEST_TOO_LARGE</li>
     *            <li>RESOURCE_NOT_FOUND</li>
     *            <li>THROTTLED</li>
     *            <li>UNAUTHORIZED</li>
     *            <li>UNSUPPORTED_MEDIA_TYPE</li>
     *            </ul>
     *            </p>
     * @see GatewayResponseType
     */
    public void setResponseType(GatewayResponseType responseType) {
        this.responseType = responseType.toString();
    }

    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values
     * are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND,
     * UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE,
     * AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN,
     * MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT,
     * API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS,
     * BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED
     *
     * @param responseType <p>
     *            The response type of the associated <a>GatewayResponse</a>.
     *            Valid values are
     *            <ul>
     *            <li>ACCESS_DENIED</li>
     *            <li>API_CONFIGURATION_ERROR</li>
     *            <li>AUTHORIZER_FAILURE</li>
     *            <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *            <li>BAD_REQUEST_PARAMETERS</li>
     *            <li>BAD_REQUEST_BODY</li>
     *            <li>DEFAULT_4XX</li>
     *            <li>DEFAULT_5XX</li>
     *            <li>EXPIRED_TOKEN</li>
     *            <li>INVALID_SIGNATURE</li>
     *            <li>INTEGRATION_FAILURE</li>
     *            <li>INTEGRATION_TIMEOUT</li>
     *            <li>INVALID_API_KEY</li>
     *            <li>MISSING_AUTHENTICATION_TOKEN</li>
     *            <li>QUOTA_EXCEEDED</li>
     *            <li>REQUEST_TOO_LARGE</li>
     *            <li>RESOURCE_NOT_FOUND</li>
     *            <li>THROTTLED</li>
     *            <li>UNAUTHORIZED</li>
     *            <li>UNSUPPORTED_MEDIA_TYPE</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayResponseType
     */
    public GatewayResponse withResponseType(GatewayResponseType responseType) {
        this.responseType = responseType.toString();
        return this;
    }

    /**
     * <p>
     * The HTTP status code for this <a>GatewayResponse</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @return <p>
     *         The HTTP status code for this <a>GatewayResponse</a>.
     *         </p>
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * <p>
     * The HTTP status code for this <a>GatewayResponse</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @param statusCode <p>
     *            The HTTP status code for this <a>GatewayResponse</a>.
     *            </p>
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code for this <a>GatewayResponse</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[1-5]\d\d<br/>
     *
     * @param statusCode <p>
     *            The HTTP status code for this <a>GatewayResponse</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewayResponse withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * <p>
     * Response parameters (paths, query strings and headers) of the
     * <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
     *
     * @return <p>
     *         Response parameters (paths, query strings and headers) of the
     *         <a>GatewayResponse</a> as a string-to-string map of key-value
     *         pairs.
     *         </p>
     */
    public java.util.Map<String, String> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * Response parameters (paths, query strings and headers) of the
     * <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
     *
     * @param responseParameters <p>
     *            Response parameters (paths, query strings and headers) of the
     *            <a>GatewayResponse</a> as a string-to-string map of key-value
     *            pairs.
     *            </p>
     */
    public void setResponseParameters(java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * Response parameters (paths, query strings and headers) of the
     * <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseParameters <p>
     *            Response parameters (paths, query strings and headers) of the
     *            <a>GatewayResponse</a> as a string-to-string map of key-value
     *            pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewayResponse withResponseParameters(java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
        return this;
    }

    /**
     * <p>
     * Response parameters (paths, query strings and headers) of the
     * <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
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
    public GatewayResponse addresponseParametersEntry(String key, String value) {
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
    public GatewayResponse clearresponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string
     * map of key-value pairs.
     * </p>
     *
     * @return <p>
     *         Response templates of the <a>GatewayResponse</a> as a
     *         string-to-string map of key-value pairs.
     *         </p>
     */
    public java.util.Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string
     * map of key-value pairs.
     * </p>
     *
     * @param responseTemplates <p>
     *            Response templates of the <a>GatewayResponse</a> as a
     *            string-to-string map of key-value pairs.
     *            </p>
     */
    public void setResponseTemplates(java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
    }

    /**
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string
     * map of key-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responseTemplates <p>
     *            Response templates of the <a>GatewayResponse</a> as a
     *            string-to-string map of key-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewayResponse withResponseTemplates(java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
        return this;
    }

    /**
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string
     * map of key-value pairs.
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
    public GatewayResponse addresponseTemplatesEntry(String key, String value) {
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
    public GatewayResponse clearresponseTemplatesEntries() {
        this.responseTemplates = null;
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether this <a>GatewayResponse</a> is the
     * default gateway response (<code>true</code>) or not (<code>false</code>).
     * A default gateway response is one generated by API Gateway without any
     * customization by an API developer.
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether this <a>GatewayResponse</a> is
     *         the default gateway response (<code>true</code>) or not (
     *         <code>false</code>). A default gateway response is one generated
     *         by API Gateway without any customization by an API developer.
     *         </p>
     */
    public Boolean isDefaultResponse() {
        return defaultResponse;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether this <a>GatewayResponse</a> is the
     * default gateway response (<code>true</code>) or not (<code>false</code>).
     * A default gateway response is one generated by API Gateway without any
     * customization by an API developer.
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether this <a>GatewayResponse</a> is
     *         the default gateway response (<code>true</code>) or not (
     *         <code>false</code>). A default gateway response is one generated
     *         by API Gateway without any customization by an API developer.
     *         </p>
     */
    public Boolean getDefaultResponse() {
        return defaultResponse;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether this <a>GatewayResponse</a> is the
     * default gateway response (<code>true</code>) or not (<code>false</code>).
     * A default gateway response is one generated by API Gateway without any
     * customization by an API developer.
     * </p>
     *
     * @param defaultResponse <p>
     *            A Boolean flag to indicate whether this <a>GatewayResponse</a>
     *            is the default gateway response (<code>true</code>) or not (
     *            <code>false</code>). A default gateway response is one
     *            generated by API Gateway without any customization by an API
     *            developer.
     *            </p>
     */
    public void setDefaultResponse(Boolean defaultResponse) {
        this.defaultResponse = defaultResponse;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether this <a>GatewayResponse</a> is the
     * default gateway response (<code>true</code>) or not (<code>false</code>).
     * A default gateway response is one generated by API Gateway without any
     * customization by an API developer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultResponse <p>
     *            A Boolean flag to indicate whether this <a>GatewayResponse</a>
     *            is the default gateway response (<code>true</code>) or not (
     *            <code>false</code>). A default gateway response is one
     *            generated by API Gateway without any customization by an API
     *            developer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewayResponse withDefaultResponse(Boolean defaultResponse) {
        this.defaultResponse = defaultResponse;
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
        if (getResponseType() != null)
            sb.append("responseType: " + getResponseType() + ",");
        if (getStatusCode() != null)
            sb.append("statusCode: " + getStatusCode() + ",");
        if (getResponseParameters() != null)
            sb.append("responseParameters: " + getResponseParameters() + ",");
        if (getResponseTemplates() != null)
            sb.append("responseTemplates: " + getResponseTemplates() + ",");
        if (getDefaultResponse() != null)
            sb.append("defaultResponse: " + getDefaultResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResponseType() == null) ? 0 : getResponseType().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode
                + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode
                + ((getResponseTemplates() == null) ? 0 : getResponseTemplates().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultResponse() == null) ? 0 : getDefaultResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayResponse == false)
            return false;
        GatewayResponse other = (GatewayResponse) obj;

        if (other.getResponseType() == null ^ this.getResponseType() == null)
            return false;
        if (other.getResponseType() != null
                && other.getResponseType().equals(this.getResponseType()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
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
        if (other.getDefaultResponse() == null ^ this.getDefaultResponse() == null)
            return false;
        if (other.getDefaultResponse() != null
                && other.getDefaultResponse().equals(this.getDefaultResponse()) == false)
            return false;
        return true;
    }
}
