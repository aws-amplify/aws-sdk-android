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

public class UpdateIntegrationResult implements Serializable {
    /**
     * <p>
     * Specifies whether an integration is managed by API Gateway. If you
     * created an API using using quick create, the resulting integration is
     * managed by API Gateway. You can update a managed integration, but you
     * can't delete it.
     * </p>
     */
    private Boolean apiGatewayManaged;

    /**
     * <p>
     * The ID of the VPC link for a private integration. Supported only for HTTP
     * APIs.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Specify
     * INTERNET for connections through the public routable internet or VPC_LINK
     * for private connections between API Gateway and resources in a VPC. The
     * default value is INTERNET.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNET, VPC_LINK
     */
    private String connectionType;

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
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for API
     * Gateway to assume, use the role's Amazon Resource Name (ARN). To require
     * that the caller's identity be passed through from the request, specify
     * the string arn:aws:iam::*:user/*. To use resource-based permissions on
     * supported AWS services, specify null.
     * </p>
     */
    private String credentialsArn;

    /**
     * <p>
     * Represents the description of an integration.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Represents the identifier of an integration.
     * </p>
     */
    private String integrationId;

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     */
    private String integrationMethod;

    /**
     * <p>
     * The integration response selection expression for the integration.
     * Supported only for WebSocket APIs. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     * >Integration Response Selection Expressions</a>.
     * </p>
     */
    private String integrationResponseSelectionExpression;

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service
     * action, including the Lambda function-invoking action. With the Lambda
     * function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with the Lambda
     * function-invoking action with the client request passed through as-is.
     * This integration is also referred to as Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint.
     * This integration is also referred to as the HTTP custom integration.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating the route or method request with an HTTP
     * endpoint, with the client request passed through as-is. This is also
     * referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a
     * "loopback" endpoint without invoking any backend. Supported only for
     * WebSocket APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY
     */
    private String integrationType;

    /**
     * <p>
     * For a Lambda integration, specify the URI of a Lambda function.
     * </p>
     * <p>
     * For an HTTP integration, specify a fully-qualified URL.
     * </p>
     * <p>
     * For an HTTP API private integration, specify the ARN of an Application
     * Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map
     * service. If you specify the ARN of an AWS Cloud Map service, API Gateway
     * uses DiscoverInstances to identify resources. You can use query
     * parameters to target specific resources. To learn more, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html"
     * >DiscoverInstances</a>. For private integrations, all resources must be
     * owned by the same AWS account.
     * </p>
     */
    private String integrationUri;

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the
     * Content-Type header in the request, and the available mapping templates
     * specified as the requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through
     * to the integration backend without transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media
     * Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content
     * types mapped to templates. However, if there is at least one content type
     * defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES
     */
    private String passthroughBehavior;

    /**
     * <p>
     * Specifies the format of the payload sent to an integration. Required for
     * HTTP APIs.
     * </p>
     */
    private String payloadFormatVersion;

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the
     * method request to the backend. The key is an integration request
     * parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and
     * pre-encoded as required by the backend. The method request parameter
     * value must match the pattern of
     * method.request.<replaceable>{location}</replaceable
     * >.<replaceable>{name}</replaceable> , where
     * <replaceable>{location}</replaceable> is querystring, path, or header;
     * and <replaceable>{name}</replaceable> must be a valid and unique method
     * request parameter name. Supported only for WebSocket APIs.
     * </p>
     */
    private java.util.Map<String, String> requestParameters;

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request
     * payload based on the value of the Content-Type header sent by the client.
     * The content type value is the key in this map, and the template (as a
     * String) is the value. Supported only for WebSocket APIs.
     * </p>
     */
    private java.util.Map<String, String> requestTemplates;

    /**
     * <p>
     * The template selection expression for the integration. Supported only for
     * WebSocket APIs.
     * </p>
     */
    private String templateSelectionExpression;

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and
     * between 50 and 30,000 milliseconds for HTTP APIs. The default timeout is
     * 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 30000<br/>
     */
    private Integer timeoutInMillis;

    /**
     * <p>
     * The TLS configuration for a private integration. If you specify a TLS
     * configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     * </p>
     */
    private TlsConfig tlsConfig;

    /**
     * <p>
     * Specifies whether an integration is managed by API Gateway. If you
     * created an API using using quick create, the resulting integration is
     * managed by API Gateway. You can update a managed integration, but you
     * can't delete it.
     * </p>
     *
     * @return <p>
     *         Specifies whether an integration is managed by API Gateway. If
     *         you created an API using using quick create, the resulting
     *         integration is managed by API Gateway. You can update a managed
     *         integration, but you can't delete it.
     *         </p>
     */
    public Boolean isApiGatewayManaged() {
        return apiGatewayManaged;
    }

    /**
     * <p>
     * Specifies whether an integration is managed by API Gateway. If you
     * created an API using using quick create, the resulting integration is
     * managed by API Gateway. You can update a managed integration, but you
     * can't delete it.
     * </p>
     *
     * @return <p>
     *         Specifies whether an integration is managed by API Gateway. If
     *         you created an API using using quick create, the resulting
     *         integration is managed by API Gateway. You can update a managed
     *         integration, but you can't delete it.
     *         </p>
     */
    public Boolean getApiGatewayManaged() {
        return apiGatewayManaged;
    }

    /**
     * <p>
     * Specifies whether an integration is managed by API Gateway. If you
     * created an API using using quick create, the resulting integration is
     * managed by API Gateway. You can update a managed integration, but you
     * can't delete it.
     * </p>
     *
     * @param apiGatewayManaged <p>
     *            Specifies whether an integration is managed by API Gateway. If
     *            you created an API using using quick create, the resulting
     *            integration is managed by API Gateway. You can update a
     *            managed integration, but you can't delete it.
     *            </p>
     */
    public void setApiGatewayManaged(Boolean apiGatewayManaged) {
        this.apiGatewayManaged = apiGatewayManaged;
    }

    /**
     * <p>
     * Specifies whether an integration is managed by API Gateway. If you
     * created an API using using quick create, the resulting integration is
     * managed by API Gateway. You can update a managed integration, but you
     * can't delete it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiGatewayManaged <p>
     *            Specifies whether an integration is managed by API Gateway. If
     *            you created an API using using quick create, the resulting
     *            integration is managed by API Gateway. You can update a
     *            managed integration, but you can't delete it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withApiGatewayManaged(Boolean apiGatewayManaged) {
        this.apiGatewayManaged = apiGatewayManaged;
        return this;
    }

    /**
     * <p>
     * The ID of the VPC link for a private integration. Supported only for HTTP
     * APIs.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC link for a private integration. Supported only
     *         for HTTP APIs.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the VPC link for a private integration. Supported only for HTTP
     * APIs.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the VPC link for a private integration. Supported
     *            only for HTTP APIs.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the VPC link for a private integration. Supported only for HTTP
     * APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the VPC link for a private integration. Supported
     *            only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Specify
     * INTERNET for connections through the public routable internet or VPC_LINK
     * for private connections between API Gateway and resources in a VPC. The
     * default value is INTERNET.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNET, VPC_LINK
     *
     * @return <p>
     *         The type of the network connection to the integration endpoint.
     *         Specify INTERNET for connections through the public routable
     *         internet or VPC_LINK for private connections between API Gateway
     *         and resources in a VPC. The default value is INTERNET.
     *         </p>
     * @see ConnectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Specify
     * INTERNET for connections through the public routable internet or VPC_LINK
     * for private connections between API Gateway and resources in a VPC. The
     * default value is INTERNET.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNET, VPC_LINK
     *
     * @param connectionType <p>
     *            The type of the network connection to the integration
     *            endpoint. Specify INTERNET for connections through the public
     *            routable internet or VPC_LINK for private connections between
     *            API Gateway and resources in a VPC. The default value is
     *            INTERNET.
     *            </p>
     * @see ConnectionType
     */
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Specify
     * INTERNET for connections through the public routable internet or VPC_LINK
     * for private connections between API Gateway and resources in a VPC. The
     * default value is INTERNET.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNET, VPC_LINK
     *
     * @param connectionType <p>
     *            The type of the network connection to the integration
     *            endpoint. Specify INTERNET for connections through the public
     *            routable internet or VPC_LINK for private connections between
     *            API Gateway and resources in a VPC. The default value is
     *            INTERNET.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionType
     */
    public UpdateIntegrationResult withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Specify
     * INTERNET for connections through the public routable internet or VPC_LINK
     * for private connections between API Gateway and resources in a VPC. The
     * default value is INTERNET.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNET, VPC_LINK
     *
     * @param connectionType <p>
     *            The type of the network connection to the integration
     *            endpoint. Specify INTERNET for connections through the public
     *            routable internet or VPC_LINK for private connections between
     *            API Gateway and resources in a VPC. The default value is
     *            INTERNET.
     *            </p>
     * @see ConnectionType
     */
    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Specify
     * INTERNET for connections through the public routable internet or VPC_LINK
     * for private connections between API Gateway and resources in a VPC. The
     * default value is INTERNET.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNET, VPC_LINK
     *
     * @param connectionType <p>
     *            The type of the network connection to the integration
     *            endpoint. Specify INTERNET for connections through the public
     *            routable internet or VPC_LINK for private connections between
     *            API Gateway and resources in a VPC. The default value is
     *            INTERNET.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionType
     */
    public UpdateIntegrationResult withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
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
    public UpdateIntegrationResult withContentHandlingStrategy(String contentHandlingStrategy) {
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
    public UpdateIntegrationResult withContentHandlingStrategy(
            ContentHandlingStrategy contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for API
     * Gateway to assume, use the role's Amazon Resource Name (ARN). To require
     * that the caller's identity be passed through from the request, specify
     * the string arn:aws:iam::*:user/*. To use resource-based permissions on
     * supported AWS services, specify null.
     * </p>
     *
     * @return <p>
     *         Specifies the credentials required for the integration, if any.
     *         For AWS integrations, three options are available. To specify an
     *         IAM Role for API Gateway to assume, use the role's Amazon
     *         Resource Name (ARN). To require that the caller's identity be
     *         passed through from the request, specify the string
     *         arn:aws:iam::*:user/*. To use resource-based permissions on
     *         supported AWS services, specify null.
     *         </p>
     */
    public String getCredentialsArn() {
        return credentialsArn;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for API
     * Gateway to assume, use the role's Amazon Resource Name (ARN). To require
     * that the caller's identity be passed through from the request, specify
     * the string arn:aws:iam::*:user/*. To use resource-based permissions on
     * supported AWS services, specify null.
     * </p>
     *
     * @param credentialsArn <p>
     *            Specifies the credentials required for the integration, if
     *            any. For AWS integrations, three options are available. To
     *            specify an IAM Role for API Gateway to assume, use the role's
     *            Amazon Resource Name (ARN). To require that the caller's
     *            identity be passed through from the request, specify the
     *            string arn:aws:iam::*:user/*. To use resource-based
     *            permissions on supported AWS services, specify null.
     *            </p>
     */
    public void setCredentialsArn(String credentialsArn) {
        this.credentialsArn = credentialsArn;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for API
     * Gateway to assume, use the role's Amazon Resource Name (ARN). To require
     * that the caller's identity be passed through from the request, specify
     * the string arn:aws:iam::*:user/*. To use resource-based permissions on
     * supported AWS services, specify null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credentialsArn <p>
     *            Specifies the credentials required for the integration, if
     *            any. For AWS integrations, three options are available. To
     *            specify an IAM Role for API Gateway to assume, use the role's
     *            Amazon Resource Name (ARN). To require that the caller's
     *            identity be passed through from the request, specify the
     *            string arn:aws:iam::*:user/*. To use resource-based
     *            permissions on supported AWS services, specify null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withCredentialsArn(String credentialsArn) {
        this.credentialsArn = credentialsArn;
        return this;
    }

    /**
     * <p>
     * Represents the description of an integration.
     * </p>
     *
     * @return <p>
     *         Represents the description of an integration.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Represents the description of an integration.
     * </p>
     *
     * @param description <p>
     *            Represents the description of an integration.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Represents the description of an integration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            Represents the description of an integration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Represents the identifier of an integration.
     * </p>
     *
     * @return <p>
     *         Represents the identifier of an integration.
     *         </p>
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * <p>
     * Represents the identifier of an integration.
     * </p>
     *
     * @param integrationId <p>
     *            Represents the identifier of an integration.
     *            </p>
     */
    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    /**
     * <p>
     * Represents the identifier of an integration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationId <p>
     *            Represents the identifier of an integration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withIntegrationId(String integrationId) {
        this.integrationId = integrationId;
        return this;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     *
     * @return <p>
     *         Specifies the integration's HTTP method type.
     *         </p>
     */
    public String getIntegrationMethod() {
        return integrationMethod;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     *
     * @param integrationMethod <p>
     *            Specifies the integration's HTTP method type.
     *            </p>
     */
    public void setIntegrationMethod(String integrationMethod) {
        this.integrationMethod = integrationMethod;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationMethod <p>
     *            Specifies the integration's HTTP method type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withIntegrationMethod(String integrationMethod) {
        this.integrationMethod = integrationMethod;
        return this;
    }

    /**
     * <p>
     * The integration response selection expression for the integration.
     * Supported only for WebSocket APIs. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     * >Integration Response Selection Expressions</a>.
     * </p>
     *
     * @return <p>
     *         The integration response selection expression for the
     *         integration. Supported only for WebSocket APIs. See <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     *         >Integration Response Selection Expressions</a>.
     *         </p>
     */
    public String getIntegrationResponseSelectionExpression() {
        return integrationResponseSelectionExpression;
    }

    /**
     * <p>
     * The integration response selection expression for the integration.
     * Supported only for WebSocket APIs. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     * >Integration Response Selection Expressions</a>.
     * </p>
     *
     * @param integrationResponseSelectionExpression <p>
     *            The integration response selection expression for the
     *            integration. Supported only for WebSocket APIs. See <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     *            >Integration Response Selection Expressions</a>.
     *            </p>
     */
    public void setIntegrationResponseSelectionExpression(
            String integrationResponseSelectionExpression) {
        this.integrationResponseSelectionExpression = integrationResponseSelectionExpression;
    }

    /**
     * <p>
     * The integration response selection expression for the integration.
     * Supported only for WebSocket APIs. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     * >Integration Response Selection Expressions</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationResponseSelectionExpression <p>
     *            The integration response selection expression for the
     *            integration. Supported only for WebSocket APIs. See <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions"
     *            >Integration Response Selection Expressions</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withIntegrationResponseSelectionExpression(
            String integrationResponseSelectionExpression) {
        this.integrationResponseSelectionExpression = integrationResponseSelectionExpression;
        return this;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service
     * action, including the Lambda function-invoking action. With the Lambda
     * function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with the Lambda
     * function-invoking action with the client request passed through as-is.
     * This integration is also referred to as Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint.
     * This integration is also referred to as the HTTP custom integration.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating the route or method request with an HTTP
     * endpoint, with the client request passed through as-is. This is also
     * referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a
     * "loopback" endpoint without invoking any backend. Supported only for
     * WebSocket APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY
     *
     * @return <p>
     *         The integration type of an integration. One of the following:
     *         </p>
     *         <p>
     *         AWS: for integrating the route or method request with an AWS
     *         service action, including the Lambda function-invoking action.
     *         With the Lambda function-invoking action, this is referred to as
     *         the Lambda custom integration. With any other AWS service action,
     *         this is known as AWS integration. Supported only for WebSocket
     *         APIs.
     *         </p>
     *         <p>
     *         AWS_PROXY: for integrating the route or method request with the
     *         Lambda function-invoking action with the client request passed
     *         through as-is. This integration is also referred to as Lambda
     *         proxy integration.
     *         </p>
     *         <p>
     *         HTTP: for integrating the route or method request with an HTTP
     *         endpoint. This integration is also referred to as the HTTP custom
     *         integration. Supported only for WebSocket APIs.
     *         </p>
     *         <p>
     *         HTTP_PROXY: for integrating the route or method request with an
     *         HTTP endpoint, with the client request passed through as-is. This
     *         is also referred to as HTTP proxy integration.
     *         </p>
     *         <p>
     *         MOCK: for integrating the route or method request with API
     *         Gateway as a "loopback" endpoint without invoking any backend.
     *         Supported only for WebSocket APIs.
     *         </p>
     * @see IntegrationType
     */
    public String getIntegrationType() {
        return integrationType;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service
     * action, including the Lambda function-invoking action. With the Lambda
     * function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with the Lambda
     * function-invoking action with the client request passed through as-is.
     * This integration is also referred to as Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint.
     * This integration is also referred to as the HTTP custom integration.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating the route or method request with an HTTP
     * endpoint, with the client request passed through as-is. This is also
     * referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a
     * "loopback" endpoint without invoking any backend. Supported only for
     * WebSocket APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY
     *
     * @param integrationType <p>
     *            The integration type of an integration. One of the following:
     *            </p>
     *            <p>
     *            AWS: for integrating the route or method request with an AWS
     *            service action, including the Lambda function-invoking action.
     *            With the Lambda function-invoking action, this is referred to
     *            as the Lambda custom integration. With any other AWS service
     *            action, this is known as AWS integration. Supported only for
     *            WebSocket APIs.
     *            </p>
     *            <p>
     *            AWS_PROXY: for integrating the route or method request with
     *            the Lambda function-invoking action with the client request
     *            passed through as-is. This integration is also referred to as
     *            Lambda proxy integration.
     *            </p>
     *            <p>
     *            HTTP: for integrating the route or method request with an HTTP
     *            endpoint. This integration is also referred to as the HTTP
     *            custom integration. Supported only for WebSocket APIs.
     *            </p>
     *            <p>
     *            HTTP_PROXY: for integrating the route or method request with
     *            an HTTP endpoint, with the client request passed through
     *            as-is. This is also referred to as HTTP proxy integration.
     *            </p>
     *            <p>
     *            MOCK: for integrating the route or method request with API
     *            Gateway as a "loopback" endpoint without invoking any backend.
     *            Supported only for WebSocket APIs.
     *            </p>
     * @see IntegrationType
     */
    public void setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service
     * action, including the Lambda function-invoking action. With the Lambda
     * function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with the Lambda
     * function-invoking action with the client request passed through as-is.
     * This integration is also referred to as Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint.
     * This integration is also referred to as the HTTP custom integration.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating the route or method request with an HTTP
     * endpoint, with the client request passed through as-is. This is also
     * referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a
     * "loopback" endpoint without invoking any backend. Supported only for
     * WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY
     *
     * @param integrationType <p>
     *            The integration type of an integration. One of the following:
     *            </p>
     *            <p>
     *            AWS: for integrating the route or method request with an AWS
     *            service action, including the Lambda function-invoking action.
     *            With the Lambda function-invoking action, this is referred to
     *            as the Lambda custom integration. With any other AWS service
     *            action, this is known as AWS integration. Supported only for
     *            WebSocket APIs.
     *            </p>
     *            <p>
     *            AWS_PROXY: for integrating the route or method request with
     *            the Lambda function-invoking action with the client request
     *            passed through as-is. This integration is also referred to as
     *            Lambda proxy integration.
     *            </p>
     *            <p>
     *            HTTP: for integrating the route or method request with an HTTP
     *            endpoint. This integration is also referred to as the HTTP
     *            custom integration. Supported only for WebSocket APIs.
     *            </p>
     *            <p>
     *            HTTP_PROXY: for integrating the route or method request with
     *            an HTTP endpoint, with the client request passed through
     *            as-is. This is also referred to as HTTP proxy integration.
     *            </p>
     *            <p>
     *            MOCK: for integrating the route or method request with API
     *            Gateway as a "loopback" endpoint without invoking any backend.
     *            Supported only for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntegrationType
     */
    public UpdateIntegrationResult withIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service
     * action, including the Lambda function-invoking action. With the Lambda
     * function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with the Lambda
     * function-invoking action with the client request passed through as-is.
     * This integration is also referred to as Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint.
     * This integration is also referred to as the HTTP custom integration.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating the route or method request with an HTTP
     * endpoint, with the client request passed through as-is. This is also
     * referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a
     * "loopback" endpoint without invoking any backend. Supported only for
     * WebSocket APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY
     *
     * @param integrationType <p>
     *            The integration type of an integration. One of the following:
     *            </p>
     *            <p>
     *            AWS: for integrating the route or method request with an AWS
     *            service action, including the Lambda function-invoking action.
     *            With the Lambda function-invoking action, this is referred to
     *            as the Lambda custom integration. With any other AWS service
     *            action, this is known as AWS integration. Supported only for
     *            WebSocket APIs.
     *            </p>
     *            <p>
     *            AWS_PROXY: for integrating the route or method request with
     *            the Lambda function-invoking action with the client request
     *            passed through as-is. This integration is also referred to as
     *            Lambda proxy integration.
     *            </p>
     *            <p>
     *            HTTP: for integrating the route or method request with an HTTP
     *            endpoint. This integration is also referred to as the HTTP
     *            custom integration. Supported only for WebSocket APIs.
     *            </p>
     *            <p>
     *            HTTP_PROXY: for integrating the route or method request with
     *            an HTTP endpoint, with the client request passed through
     *            as-is. This is also referred to as HTTP proxy integration.
     *            </p>
     *            <p>
     *            MOCK: for integrating the route or method request with API
     *            Gateway as a "loopback" endpoint without invoking any backend.
     *            Supported only for WebSocket APIs.
     *            </p>
     * @see IntegrationType
     */
    public void setIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType.toString();
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service
     * action, including the Lambda function-invoking action. With the Lambda
     * function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with the Lambda
     * function-invoking action with the client request passed through as-is.
     * This integration is also referred to as Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint.
     * This integration is also referred to as the HTTP custom integration.
     * Supported only for WebSocket APIs.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating the route or method request with an HTTP
     * endpoint, with the client request passed through as-is. This is also
     * referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a
     * "loopback" endpoint without invoking any backend. Supported only for
     * WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY
     *
     * @param integrationType <p>
     *            The integration type of an integration. One of the following:
     *            </p>
     *            <p>
     *            AWS: for integrating the route or method request with an AWS
     *            service action, including the Lambda function-invoking action.
     *            With the Lambda function-invoking action, this is referred to
     *            as the Lambda custom integration. With any other AWS service
     *            action, this is known as AWS integration. Supported only for
     *            WebSocket APIs.
     *            </p>
     *            <p>
     *            AWS_PROXY: for integrating the route or method request with
     *            the Lambda function-invoking action with the client request
     *            passed through as-is. This integration is also referred to as
     *            Lambda proxy integration.
     *            </p>
     *            <p>
     *            HTTP: for integrating the route or method request with an HTTP
     *            endpoint. This integration is also referred to as the HTTP
     *            custom integration. Supported only for WebSocket APIs.
     *            </p>
     *            <p>
     *            HTTP_PROXY: for integrating the route or method request with
     *            an HTTP endpoint, with the client request passed through
     *            as-is. This is also referred to as HTTP proxy integration.
     *            </p>
     *            <p>
     *            MOCK: for integrating the route or method request with API
     *            Gateway as a "loopback" endpoint without invoking any backend.
     *            Supported only for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntegrationType
     */
    public UpdateIntegrationResult withIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType.toString();
        return this;
    }

    /**
     * <p>
     * For a Lambda integration, specify the URI of a Lambda function.
     * </p>
     * <p>
     * For an HTTP integration, specify a fully-qualified URL.
     * </p>
     * <p>
     * For an HTTP API private integration, specify the ARN of an Application
     * Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map
     * service. If you specify the ARN of an AWS Cloud Map service, API Gateway
     * uses DiscoverInstances to identify resources. You can use query
     * parameters to target specific resources. To learn more, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html"
     * >DiscoverInstances</a>. For private integrations, all resources must be
     * owned by the same AWS account.
     * </p>
     *
     * @return <p>
     *         For a Lambda integration, specify the URI of a Lambda function.
     *         </p>
     *         <p>
     *         For an HTTP integration, specify a fully-qualified URL.
     *         </p>
     *         <p>
     *         For an HTTP API private integration, specify the ARN of an
     *         Application Load Balancer listener, Network Load Balancer
     *         listener, or AWS Cloud Map service. If you specify the ARN of an
     *         AWS Cloud Map service, API Gateway uses DiscoverInstances to
     *         identify resources. You can use query parameters to target
     *         specific resources. To learn more, see <a href=
     *         "https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html"
     *         >DiscoverInstances</a>. For private integrations, all resources
     *         must be owned by the same AWS account.
     *         </p>
     */
    public String getIntegrationUri() {
        return integrationUri;
    }

    /**
     * <p>
     * For a Lambda integration, specify the URI of a Lambda function.
     * </p>
     * <p>
     * For an HTTP integration, specify a fully-qualified URL.
     * </p>
     * <p>
     * For an HTTP API private integration, specify the ARN of an Application
     * Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map
     * service. If you specify the ARN of an AWS Cloud Map service, API Gateway
     * uses DiscoverInstances to identify resources. You can use query
     * parameters to target specific resources. To learn more, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html"
     * >DiscoverInstances</a>. For private integrations, all resources must be
     * owned by the same AWS account.
     * </p>
     *
     * @param integrationUri <p>
     *            For a Lambda integration, specify the URI of a Lambda
     *            function.
     *            </p>
     *            <p>
     *            For an HTTP integration, specify a fully-qualified URL.
     *            </p>
     *            <p>
     *            For an HTTP API private integration, specify the ARN of an
     *            Application Load Balancer listener, Network Load Balancer
     *            listener, or AWS Cloud Map service. If you specify the ARN of
     *            an AWS Cloud Map service, API Gateway uses DiscoverInstances
     *            to identify resources. You can use query parameters to target
     *            specific resources. To learn more, see <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html"
     *            >DiscoverInstances</a>. For private integrations, all
     *            resources must be owned by the same AWS account.
     *            </p>
     */
    public void setIntegrationUri(String integrationUri) {
        this.integrationUri = integrationUri;
    }

    /**
     * <p>
     * For a Lambda integration, specify the URI of a Lambda function.
     * </p>
     * <p>
     * For an HTTP integration, specify a fully-qualified URL.
     * </p>
     * <p>
     * For an HTTP API private integration, specify the ARN of an Application
     * Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map
     * service. If you specify the ARN of an AWS Cloud Map service, API Gateway
     * uses DiscoverInstances to identify resources. You can use query
     * parameters to target specific resources. To learn more, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html"
     * >DiscoverInstances</a>. For private integrations, all resources must be
     * owned by the same AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationUri <p>
     *            For a Lambda integration, specify the URI of a Lambda
     *            function.
     *            </p>
     *            <p>
     *            For an HTTP integration, specify a fully-qualified URL.
     *            </p>
     *            <p>
     *            For an HTTP API private integration, specify the ARN of an
     *            Application Load Balancer listener, Network Load Balancer
     *            listener, or AWS Cloud Map service. If you specify the ARN of
     *            an AWS Cloud Map service, API Gateway uses DiscoverInstances
     *            to identify resources. You can use query parameters to target
     *            specific resources. To learn more, see <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html"
     *            >DiscoverInstances</a>. For private integrations, all
     *            resources must be owned by the same AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withIntegrationUri(String integrationUri) {
        this.integrationUri = integrationUri;
        return this;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the
     * Content-Type header in the request, and the available mapping templates
     * specified as the requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through
     * to the integration backend without transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media
     * Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content
     * types mapped to templates. However, if there is at least one content type
     * defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES
     *
     * @return <p>
     *         Specifies the pass-through behavior for incoming requests based
     *         on the Content-Type header in the request, and the available
     *         mapping templates specified as the requestTemplates property on
     *         the Integration resource. There are three valid values:
     *         WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported only for
     *         WebSocket APIs.
     *         </p>
     *         <p>
     *         WHEN_NO_MATCH passes the request body for unmapped content types
     *         through to the integration backend without transformation.
     *         </p>
     *         <p>
     *         NEVER rejects unmapped content types with an HTTP 415 Unsupported
     *         Media Type response.
     *         </p>
     *         <p>
     *         WHEN_NO_TEMPLATES allows pass-through when the integration has no
     *         content types mapped to templates. However, if there is at least
     *         one content type defined, unmapped content types will be rejected
     *         with the same HTTP 415 Unsupported Media Type response.
     *         </p>
     * @see PassthroughBehavior
     */
    public String getPassthroughBehavior() {
        return passthroughBehavior;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the
     * Content-Type header in the request, and the available mapping templates
     * specified as the requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through
     * to the integration backend without transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media
     * Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content
     * types mapped to templates. However, if there is at least one content type
     * defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES
     *
     * @param passthroughBehavior <p>
     *            Specifies the pass-through behavior for incoming requests
     *            based on the Content-Type header in the request, and the
     *            available mapping templates specified as the requestTemplates
     *            property on the Integration resource. There are three valid
     *            values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported
     *            only for WebSocket APIs.
     *            </p>
     *            <p>
     *            WHEN_NO_MATCH passes the request body for unmapped content
     *            types through to the integration backend without
     *            transformation.
     *            </p>
     *            <p>
     *            NEVER rejects unmapped content types with an HTTP 415
     *            Unsupported Media Type response.
     *            </p>
     *            <p>
     *            WHEN_NO_TEMPLATES allows pass-through when the integration has
     *            no content types mapped to templates. However, if there is at
     *            least one content type defined, unmapped content types will be
     *            rejected with the same HTTP 415 Unsupported Media Type
     *            response.
     *            </p>
     * @see PassthroughBehavior
     */
    public void setPassthroughBehavior(String passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the
     * Content-Type header in the request, and the available mapping templates
     * specified as the requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through
     * to the integration backend without transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media
     * Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content
     * types mapped to templates. However, if there is at least one content type
     * defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES
     *
     * @param passthroughBehavior <p>
     *            Specifies the pass-through behavior for incoming requests
     *            based on the Content-Type header in the request, and the
     *            available mapping templates specified as the requestTemplates
     *            property on the Integration resource. There are three valid
     *            values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported
     *            only for WebSocket APIs.
     *            </p>
     *            <p>
     *            WHEN_NO_MATCH passes the request body for unmapped content
     *            types through to the integration backend without
     *            transformation.
     *            </p>
     *            <p>
     *            NEVER rejects unmapped content types with an HTTP 415
     *            Unsupported Media Type response.
     *            </p>
     *            <p>
     *            WHEN_NO_TEMPLATES allows pass-through when the integration has
     *            no content types mapped to templates. However, if there is at
     *            least one content type defined, unmapped content types will be
     *            rejected with the same HTTP 415 Unsupported Media Type
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PassthroughBehavior
     */
    public UpdateIntegrationResult withPassthroughBehavior(String passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
        return this;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the
     * Content-Type header in the request, and the available mapping templates
     * specified as the requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through
     * to the integration backend without transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media
     * Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content
     * types mapped to templates. However, if there is at least one content type
     * defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES
     *
     * @param passthroughBehavior <p>
     *            Specifies the pass-through behavior for incoming requests
     *            based on the Content-Type header in the request, and the
     *            available mapping templates specified as the requestTemplates
     *            property on the Integration resource. There are three valid
     *            values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported
     *            only for WebSocket APIs.
     *            </p>
     *            <p>
     *            WHEN_NO_MATCH passes the request body for unmapped content
     *            types through to the integration backend without
     *            transformation.
     *            </p>
     *            <p>
     *            NEVER rejects unmapped content types with an HTTP 415
     *            Unsupported Media Type response.
     *            </p>
     *            <p>
     *            WHEN_NO_TEMPLATES allows pass-through when the integration has
     *            no content types mapped to templates. However, if there is at
     *            least one content type defined, unmapped content types will be
     *            rejected with the same HTTP 415 Unsupported Media Type
     *            response.
     *            </p>
     * @see PassthroughBehavior
     */
    public void setPassthroughBehavior(PassthroughBehavior passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior.toString();
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the
     * Content-Type header in the request, and the available mapping templates
     * specified as the requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through
     * to the integration backend without transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media
     * Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content
     * types mapped to templates. However, if there is at least one content type
     * defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES
     *
     * @param passthroughBehavior <p>
     *            Specifies the pass-through behavior for incoming requests
     *            based on the Content-Type header in the request, and the
     *            available mapping templates specified as the requestTemplates
     *            property on the Integration resource. There are three valid
     *            values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported
     *            only for WebSocket APIs.
     *            </p>
     *            <p>
     *            WHEN_NO_MATCH passes the request body for unmapped content
     *            types through to the integration backend without
     *            transformation.
     *            </p>
     *            <p>
     *            NEVER rejects unmapped content types with an HTTP 415
     *            Unsupported Media Type response.
     *            </p>
     *            <p>
     *            WHEN_NO_TEMPLATES allows pass-through when the integration has
     *            no content types mapped to templates. However, if there is at
     *            least one content type defined, unmapped content types will be
     *            rejected with the same HTTP 415 Unsupported Media Type
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PassthroughBehavior
     */
    public UpdateIntegrationResult withPassthroughBehavior(PassthroughBehavior passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the format of the payload sent to an integration. Required for
     * HTTP APIs.
     * </p>
     *
     * @return <p>
     *         Specifies the format of the payload sent to an integration.
     *         Required for HTTP APIs.
     *         </p>
     */
    public String getPayloadFormatVersion() {
        return payloadFormatVersion;
    }

    /**
     * <p>
     * Specifies the format of the payload sent to an integration. Required for
     * HTTP APIs.
     * </p>
     *
     * @param payloadFormatVersion <p>
     *            Specifies the format of the payload sent to an integration.
     *            Required for HTTP APIs.
     *            </p>
     */
    public void setPayloadFormatVersion(String payloadFormatVersion) {
        this.payloadFormatVersion = payloadFormatVersion;
    }

    /**
     * <p>
     * Specifies the format of the payload sent to an integration. Required for
     * HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payloadFormatVersion <p>
     *            Specifies the format of the payload sent to an integration.
     *            Required for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withPayloadFormatVersion(String payloadFormatVersion) {
        this.payloadFormatVersion = payloadFormatVersion;
        return this;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the
     * method request to the backend. The key is an integration request
     * parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and
     * pre-encoded as required by the backend. The method request parameter
     * value must match the pattern of
     * method.request.<replaceable>{location}</replaceable
     * >.<replaceable>{name}</replaceable> , where
     * <replaceable>{location}</replaceable> is querystring, path, or header;
     * and <replaceable>{name}</replaceable> must be a valid and unique method
     * request parameter name. Supported only for WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         A key-value map specifying request parameters that are passed
     *         from the method request to the backend. The key is an integration
     *         request parameter name and the associated value is a method
     *         request parameter value or static value that must be enclosed
     *         within single quotes and pre-encoded as required by the backend.
     *         The method request parameter value must match the pattern of
     *         method
     *         .request.<replaceable>{location}</replaceable>.<replaceable>
     *         {name}</replaceable> , where
     *         <replaceable>{location}</replaceable> is querystring, path, or
     *         header; and <replaceable>{name}</replaceable> must be a valid and
     *         unique method request parameter name. Supported only for
     *         WebSocket APIs.
     *         </p>
     */
    public java.util.Map<String, String> getRequestParameters() {
        return requestParameters;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the
     * method request to the backend. The key is an integration request
     * parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and
     * pre-encoded as required by the backend. The method request parameter
     * value must match the pattern of
     * method.request.<replaceable>{location}</replaceable
     * >.<replaceable>{name}</replaceable> , where
     * <replaceable>{location}</replaceable> is querystring, path, or header;
     * and <replaceable>{name}</replaceable> must be a valid and unique method
     * request parameter name. Supported only for WebSocket APIs.
     * </p>
     *
     * @param requestParameters <p>
     *            A key-value map specifying request parameters that are passed
     *            from the method request to the backend. The key is an
     *            integration request parameter name and the associated value is
     *            a method request parameter value or static value that must be
     *            enclosed within single quotes and pre-encoded as required by
     *            the backend. The method request parameter value must match the
     *            pattern of
     *            method.request.<replaceable>{location}</replaceable>
     *            .<replaceable>{name}</replaceable> , where
     *            <replaceable>{location}</replaceable> is querystring, path, or
     *            header; and <replaceable>{name}</replaceable> must be a valid
     *            and unique method request parameter name. Supported only for
     *            WebSocket APIs.
     *            </p>
     */
    public void setRequestParameters(java.util.Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the
     * method request to the backend. The key is an integration request
     * parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and
     * pre-encoded as required by the backend. The method request parameter
     * value must match the pattern of
     * method.request.<replaceable>{location}</replaceable
     * >.<replaceable>{name}</replaceable> , where
     * <replaceable>{location}</replaceable> is querystring, path, or header;
     * and <replaceable>{name}</replaceable> must be a valid and unique method
     * request parameter name. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestParameters <p>
     *            A key-value map specifying request parameters that are passed
     *            from the method request to the backend. The key is an
     *            integration request parameter name and the associated value is
     *            a method request parameter value or static value that must be
     *            enclosed within single quotes and pre-encoded as required by
     *            the backend. The method request parameter value must match the
     *            pattern of
     *            method.request.<replaceable>{location}</replaceable>
     *            .<replaceable>{name}</replaceable> , where
     *            <replaceable>{location}</replaceable> is querystring, path, or
     *            header; and <replaceable>{name}</replaceable> must be a valid
     *            and unique method request parameter name. Supported only for
     *            WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withRequestParameters(
            java.util.Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the
     * method request to the backend. The key is an integration request
     * parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and
     * pre-encoded as required by the backend. The method request parameter
     * value must match the pattern of
     * method.request.<replaceable>{location}</replaceable
     * >.<replaceable>{name}</replaceable> , where
     * <replaceable>{location}</replaceable> is querystring, path, or header;
     * and <replaceable>{name}</replaceable> must be a valid and unique method
     * request parameter name. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * The method adds a new key-value pair into RequestParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into RequestParameters.
     * @param value The corresponding value of the entry to be added into
     *            RequestParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult addRequestParametersEntry(String key, String value) {
        if (null == this.requestParameters) {
            this.requestParameters = new java.util.HashMap<String, String>();
        }
        if (this.requestParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.requestParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateIntegrationResult clearRequestParametersEntries() {
        this.requestParameters = null;
        return this;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request
     * payload based on the value of the Content-Type header sent by the client.
     * The content type value is the key in this map, and the template (as a
     * String) is the value. Supported only for WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         Represents a map of Velocity templates that are applied on the
     *         request payload based on the value of the Content-Type header
     *         sent by the client. The content type value is the key in this
     *         map, and the template (as a String) is the value. Supported only
     *         for WebSocket APIs.
     *         </p>
     */
    public java.util.Map<String, String> getRequestTemplates() {
        return requestTemplates;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request
     * payload based on the value of the Content-Type header sent by the client.
     * The content type value is the key in this map, and the template (as a
     * String) is the value. Supported only for WebSocket APIs.
     * </p>
     *
     * @param requestTemplates <p>
     *            Represents a map of Velocity templates that are applied on the
     *            request payload based on the value of the Content-Type header
     *            sent by the client. The content type value is the key in this
     *            map, and the template (as a String) is the value. Supported
     *            only for WebSocket APIs.
     *            </p>
     */
    public void setRequestTemplates(java.util.Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request
     * payload based on the value of the Content-Type header sent by the client.
     * The content type value is the key in this map, and the template (as a
     * String) is the value. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestTemplates <p>
     *            Represents a map of Velocity templates that are applied on the
     *            request payload based on the value of the Content-Type header
     *            sent by the client. The content type value is the key in this
     *            map, and the template (as a String) is the value. Supported
     *            only for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withRequestTemplates(
            java.util.Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
        return this;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request
     * payload based on the value of the Content-Type header sent by the client.
     * The content type value is the key in this map, and the template (as a
     * String) is the value. Supported only for WebSocket APIs.
     * </p>
     * <p>
     * The method adds a new key-value pair into RequestTemplates parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into RequestTemplates.
     * @param value The corresponding value of the entry to be added into
     *            RequestTemplates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult addRequestTemplatesEntry(String key, String value) {
        if (null == this.requestTemplates) {
            this.requestTemplates = new java.util.HashMap<String, String>();
        }
        if (this.requestTemplates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.requestTemplates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestTemplates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateIntegrationResult clearRequestTemplatesEntries() {
        this.requestTemplates = null;
        return this;
    }

    /**
     * <p>
     * The template selection expression for the integration. Supported only for
     * WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         The template selection expression for the integration. Supported
     *         only for WebSocket APIs.
     *         </p>
     */
    public String getTemplateSelectionExpression() {
        return templateSelectionExpression;
    }

    /**
     * <p>
     * The template selection expression for the integration. Supported only for
     * WebSocket APIs.
     * </p>
     *
     * @param templateSelectionExpression <p>
     *            The template selection expression for the integration.
     *            Supported only for WebSocket APIs.
     *            </p>
     */
    public void setTemplateSelectionExpression(String templateSelectionExpression) {
        this.templateSelectionExpression = templateSelectionExpression;
    }

    /**
     * <p>
     * The template selection expression for the integration. Supported only for
     * WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateSelectionExpression <p>
     *            The template selection expression for the integration.
     *            Supported only for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withTemplateSelectionExpression(
            String templateSelectionExpression) {
        this.templateSelectionExpression = templateSelectionExpression;
        return this;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and
     * between 50 and 30,000 milliseconds for HTTP APIs. The default timeout is
     * 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 30000<br/>
     *
     * @return <p>
     *         Custom timeout between 50 and 29,000 milliseconds for WebSocket
     *         APIs and between 50 and 30,000 milliseconds for HTTP APIs. The
     *         default timeout is 29 seconds for WebSocket APIs and 30 seconds
     *         for HTTP APIs.
     *         </p>
     */
    public Integer getTimeoutInMillis() {
        return timeoutInMillis;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and
     * between 50 and 30,000 milliseconds for HTTP APIs. The default timeout is
     * 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 30000<br/>
     *
     * @param timeoutInMillis <p>
     *            Custom timeout between 50 and 29,000 milliseconds for
     *            WebSocket APIs and between 50 and 30,000 milliseconds for HTTP
     *            APIs. The default timeout is 29 seconds for WebSocket APIs and
     *            30 seconds for HTTP APIs.
     *            </p>
     */
    public void setTimeoutInMillis(Integer timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and
     * between 50 and 30,000 milliseconds for HTTP APIs. The default timeout is
     * 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>50 - 30000<br/>
     *
     * @param timeoutInMillis <p>
     *            Custom timeout between 50 and 29,000 milliseconds for
     *            WebSocket APIs and between 50 and 30,000 milliseconds for HTTP
     *            APIs. The default timeout is 29 seconds for WebSocket APIs and
     *            30 seconds for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withTimeoutInMillis(Integer timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
        return this;
    }

    /**
     * <p>
     * The TLS configuration for a private integration. If you specify a TLS
     * configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         The TLS configuration for a private integration. If you specify a
     *         TLS configuration, private integration traffic uses the HTTPS
     *         protocol. Supported only for HTTP APIs.
     *         </p>
     */
    public TlsConfig getTlsConfig() {
        return tlsConfig;
    }

    /**
     * <p>
     * The TLS configuration for a private integration. If you specify a TLS
     * configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     * </p>
     *
     * @param tlsConfig <p>
     *            The TLS configuration for a private integration. If you
     *            specify a TLS configuration, private integration traffic uses
     *            the HTTPS protocol. Supported only for HTTP APIs.
     *            </p>
     */
    public void setTlsConfig(TlsConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
    }

    /**
     * <p>
     * The TLS configuration for a private integration. If you specify a TLS
     * configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tlsConfig <p>
     *            The TLS configuration for a private integration. If you
     *            specify a TLS configuration, private integration traffic uses
     *            the HTTPS protocol. Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIntegrationResult withTlsConfig(TlsConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
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
        if (getApiGatewayManaged() != null)
            sb.append("ApiGatewayManaged: " + getApiGatewayManaged() + ",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getConnectionType() != null)
            sb.append("ConnectionType: " + getConnectionType() + ",");
        if (getContentHandlingStrategy() != null)
            sb.append("ContentHandlingStrategy: " + getContentHandlingStrategy() + ",");
        if (getCredentialsArn() != null)
            sb.append("CredentialsArn: " + getCredentialsArn() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getIntegrationId() != null)
            sb.append("IntegrationId: " + getIntegrationId() + ",");
        if (getIntegrationMethod() != null)
            sb.append("IntegrationMethod: " + getIntegrationMethod() + ",");
        if (getIntegrationResponseSelectionExpression() != null)
            sb.append("IntegrationResponseSelectionExpression: "
                    + getIntegrationResponseSelectionExpression() + ",");
        if (getIntegrationType() != null)
            sb.append("IntegrationType: " + getIntegrationType() + ",");
        if (getIntegrationUri() != null)
            sb.append("IntegrationUri: " + getIntegrationUri() + ",");
        if (getPassthroughBehavior() != null)
            sb.append("PassthroughBehavior: " + getPassthroughBehavior() + ",");
        if (getPayloadFormatVersion() != null)
            sb.append("PayloadFormatVersion: " + getPayloadFormatVersion() + ",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: " + getRequestParameters() + ",");
        if (getRequestTemplates() != null)
            sb.append("RequestTemplates: " + getRequestTemplates() + ",");
        if (getTemplateSelectionExpression() != null)
            sb.append("TemplateSelectionExpression: " + getTemplateSelectionExpression() + ",");
        if (getTimeoutInMillis() != null)
            sb.append("TimeoutInMillis: " + getTimeoutInMillis() + ",");
        if (getTlsConfig() != null)
            sb.append("TlsConfig: " + getTlsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApiGatewayManaged() == null) ? 0 : getApiGatewayManaged().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime
                * hashCode
                + ((getContentHandlingStrategy() == null) ? 0 : getContentHandlingStrategy()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCredentialsArn() == null) ? 0 : getCredentialsArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getIntegrationId() == null) ? 0 : getIntegrationId().hashCode());
        hashCode = prime * hashCode
                + ((getIntegrationMethod() == null) ? 0 : getIntegrationMethod().hashCode());
        hashCode = prime
                * hashCode
                + ((getIntegrationResponseSelectionExpression() == null) ? 0
                        : getIntegrationResponseSelectionExpression().hashCode());
        hashCode = prime * hashCode
                + ((getIntegrationType() == null) ? 0 : getIntegrationType().hashCode());
        hashCode = prime * hashCode
                + ((getIntegrationUri() == null) ? 0 : getIntegrationUri().hashCode());
        hashCode = prime * hashCode
                + ((getPassthroughBehavior() == null) ? 0 : getPassthroughBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getPayloadFormatVersion() == null) ? 0 : getPayloadFormatVersion().hashCode());
        hashCode = prime * hashCode
                + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode
                + ((getRequestTemplates() == null) ? 0 : getRequestTemplates().hashCode());
        hashCode = prime
                * hashCode
                + ((getTemplateSelectionExpression() == null) ? 0
                        : getTemplateSelectionExpression().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutInMillis() == null) ? 0 : getTimeoutInMillis().hashCode());
        hashCode = prime * hashCode + ((getTlsConfig() == null) ? 0 : getTlsConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIntegrationResult == false)
            return false;
        UpdateIntegrationResult other = (UpdateIntegrationResult) obj;

        if (other.getApiGatewayManaged() == null ^ this.getApiGatewayManaged() == null)
            return false;
        if (other.getApiGatewayManaged() != null
                && other.getApiGatewayManaged().equals(this.getApiGatewayManaged()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null
                && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        if (other.getContentHandlingStrategy() == null ^ this.getContentHandlingStrategy() == null)
            return false;
        if (other.getContentHandlingStrategy() != null
                && other.getContentHandlingStrategy().equals(this.getContentHandlingStrategy()) == false)
            return false;
        if (other.getCredentialsArn() == null ^ this.getCredentialsArn() == null)
            return false;
        if (other.getCredentialsArn() != null
                && other.getCredentialsArn().equals(this.getCredentialsArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIntegrationId() == null ^ this.getIntegrationId() == null)
            return false;
        if (other.getIntegrationId() != null
                && other.getIntegrationId().equals(this.getIntegrationId()) == false)
            return false;
        if (other.getIntegrationMethod() == null ^ this.getIntegrationMethod() == null)
            return false;
        if (other.getIntegrationMethod() != null
                && other.getIntegrationMethod().equals(this.getIntegrationMethod()) == false)
            return false;
        if (other.getIntegrationResponseSelectionExpression() == null
                ^ this.getIntegrationResponseSelectionExpression() == null)
            return false;
        if (other.getIntegrationResponseSelectionExpression() != null
                && other.getIntegrationResponseSelectionExpression().equals(
                        this.getIntegrationResponseSelectionExpression()) == false)
            return false;
        if (other.getIntegrationType() == null ^ this.getIntegrationType() == null)
            return false;
        if (other.getIntegrationType() != null
                && other.getIntegrationType().equals(this.getIntegrationType()) == false)
            return false;
        if (other.getIntegrationUri() == null ^ this.getIntegrationUri() == null)
            return false;
        if (other.getIntegrationUri() != null
                && other.getIntegrationUri().equals(this.getIntegrationUri()) == false)
            return false;
        if (other.getPassthroughBehavior() == null ^ this.getPassthroughBehavior() == null)
            return false;
        if (other.getPassthroughBehavior() != null
                && other.getPassthroughBehavior().equals(this.getPassthroughBehavior()) == false)
            return false;
        if (other.getPayloadFormatVersion() == null ^ this.getPayloadFormatVersion() == null)
            return false;
        if (other.getPayloadFormatVersion() != null
                && other.getPayloadFormatVersion().equals(this.getPayloadFormatVersion()) == false)
            return false;
        if (other.getRequestParameters() == null ^ this.getRequestParameters() == null)
            return false;
        if (other.getRequestParameters() != null
                && other.getRequestParameters().equals(this.getRequestParameters()) == false)
            return false;
        if (other.getRequestTemplates() == null ^ this.getRequestTemplates() == null)
            return false;
        if (other.getRequestTemplates() != null
                && other.getRequestTemplates().equals(this.getRequestTemplates()) == false)
            return false;
        if (other.getTemplateSelectionExpression() == null
                ^ this.getTemplateSelectionExpression() == null)
            return false;
        if (other.getTemplateSelectionExpression() != null
                && other.getTemplateSelectionExpression().equals(
                        this.getTemplateSelectionExpression()) == false)
            return false;
        if (other.getTimeoutInMillis() == null ^ this.getTimeoutInMillis() == null)
            return false;
        if (other.getTimeoutInMillis() != null
                && other.getTimeoutInMillis().equals(this.getTimeoutInMillis()) == false)
            return false;
        if (other.getTlsConfig() == null ^ this.getTlsConfig() == null)
            return false;
        if (other.getTlsConfig() != null
                && other.getTlsConfig().equals(this.getTlsConfig()) == false)
            return false;
        return true;
    }
}
