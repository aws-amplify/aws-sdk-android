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
 * Represents an HTTP, HTTP_PROXY, AWS, AWS_PROXY, or Mock integration.
 * </p>
 * <div class="remarks">In the API Gateway console, the built-in Lambda
 * integration is an AWS integration.</div> <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
 * >Creating an API</a> </div>
 */
public class Integration implements Serializable {
    /**
     * <p>
     * Specifies an API method integration type. The valid value is one of the
     * following:
     * </p>
     * <ul>
     * <li><code>AWS</code>: for integrating the API method request with an AWS
     * service action, including the Lambda function-invoking action. With the
     * Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration.</li>
     * <li><code>AWS_PROXY</code>: for integrating the API method request with
     * the Lambda function-invoking action with the client request passed
     * through as-is. This integration is also referred to as the Lambda proxy
     * integration.</li>
     * <li><code>HTTP</code>: for integrating the API method request with an
     * HTTP endpoint, including a private HTTP endpoint within a VPC. This
     * integration is also referred to as the HTTP custom integration.</li>
     * <li><code>HTTP_PROXY</code>: for integrating the API method request with
     * an HTTP endpoint, including a private HTTP endpoint within a VPC, with
     * the client request passed through as-is. This is also referred to as the
     * HTTP proxy integration.</li>
     * <li><code>MOCK</code>: for integrating the API method request with API
     * Gateway as a "loop-back" endpoint without invoking any backend.</li>
     * </ul>
     * <p>
     * For the HTTP and HTTP proxy integrations, each integration can specify a
     * protocol (<code>http/https</code>), port and path. Standard 80 and 443
     * ports are supported as well as custom ports above 1024. An HTTP or HTTP
     * proxy integration with a <code>connectionType</code> of
     * <code>VPC_LINK</code> is referred to as a private integration and uses a
     * <a>VpcLink</a> to connect API Gateway to a network load balancer of a
     * VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY
     */
    private String type;

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     */
    private String httpMethod;

    /**
     * <p>
     * Specifies Uniform Resource Identifier (URI) of the integration endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations, the URI
     * must be a fully formed, encoded HTTP(S) URL according to the <a
     * target="_blank"
     * href="https://en.wikipedia.org/wiki/Uniform_Resource_Identifier">RFC-3986
     * specification</a>, for either standard integration, where
     * <code>connectionType</code> is not <code>VPC_LINK</code>, or private
     * integration, where <code>connectionType</code> is <code>VPC_LINK</code>.
     * For a private HTTP integration, the URI is not used for routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is
     * of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>
     * . Here, <code>{Region}</code> is the API Gateway region (e.g.,
     * <code>us-east-1</code>); <code>{service}</code> is the name of the
     * integrated AWS service (e.g., <code>s3</code>); and
     * <code>{subdomain}</code> is a designated subdomain supported by certain
     * AWS service for fast host-name lookup. <code>action</code> can be used
     * for an AWS service action-based API, using an
     * <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query string. The
     * ensuing <code>{service_api}</code> refers to a supported action
     * <code>{name}</code> plus any required input parameters. Alternatively,
     * <code>path</code> can be used for an AWS service path-based API. The
     * ensuing <code>service_api</code> refers to the path to an AWS service
     * resource, including the region of the integrated AWS service, if
     * applicable. For example, for integration with the S3 API of
     * <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>
     * , the <code>uri</code> can be either
     * <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code>
     * or <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     * </p>
     * </li>
     * </ul>
     */
    private String uri;

    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid
     * value is <code>INTERNET</code> for connections through the public
     * routable internet or <code>VPC_LINK</code> for private connections
     * between API Gateway and a network load balancer in a VPC. The default
     * value is <code>INTERNET</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNET, VPC_LINK
     */
    private String connectionType;

    /**
     * <p>
     * The (<a href=
     * "https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"
     * ><code>id</code></a>) of the <a>VpcLink</a> used for the integration when
     * <code>connectionType=VPC_LINK</code> and undefined, otherwise.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for API
     * Gateway to assume, use the role's Amazon Resource Name (ARN). To require
     * that the caller's identity be passed through from the request, specify
     * the string <code>arn:aws:iam::\*:user/\*</code>. To use resource-based
     * permissions on supported AWS services, specify null.
     * </p>
     */
    private String credentials;

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the
     * method request to the back end. The key is an integration request
     * parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and
     * pre-encoded as required by the back end. The method request parameter
     * value must match the pattern of
     * <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is <code>querystring</code>, <code>path</code>, or
     * <code>header</code> and <code>name</code> must be a valid and unique
     * method request parameter name.
     * </p>
     */
    private java.util.Map<String, String> requestParameters;

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request
     * payload based on the value of the Content-Type header sent by the client.
     * The content type value is the key in this map, and the template (as a
     * String) is the value.
     * </p>
     */
    private java.util.Map<String, String> requestTemplates;

    /**
     * <div>
     * <p>
     * Specifies how the method request body of an unmapped content type will be
     * passed through the integration request to the back end without
     * transformation. A content type is unmapped if no mapping template is
     * defined in the integration or the content type does not match any of the
     * mapped content types, as specified in <code>requestTemplates</code>. The
     * valid value is one of the following:
     * </p>
     * <ul>
     * <li> <code>WHEN_NO_MATCH</code>: passes the method request body through
     * the integration request to the back end without transformation when the
     * method request content type does not match any content type associated
     * with the mapping templates defined in the integration request.</li>
     * <li> <code>WHEN_NO_TEMPLATES</code>: passes the method request body
     * through the integration request to the back end without transformation
     * when no mapping template is defined in the integration request. If a
     * template is defined when this option is selected, the method request of
     * an unmapped content-type will be rejected with an HTTP
     * <code>415 Unsupported Media Type</code> response.</li>
     * <li> <code>NEVER</code>: rejects the method request with an HTTP
     * <code>415 Unsupported Media Type</code> response when either the method
     * request content type does not match any content type associated with the
     * mapping templates defined in the integration request or no mapping
     * template is defined in the integration request.</li>
     * </ul>
     * </div>
     */
    private String passthroughBehavior;

    /**
     * <p>
     * Specifies how to handle request payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed
     * through from the method request to integration request without
     * modification, provided that the <code>passthroughBehavior</code> is
     * configured to support payload pass-through.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     */
    private String contentHandling;

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds. The default value is
     * 29,000 milliseconds or 29 seconds.
     * </p>
     */
    private Integer timeoutInMillis;

    /**
     * <p>
     * An API-specific tag group of related cached parameters. To be valid
     * values for <code>cacheKeyParameters</code>, these parameters must also be
     * specified for <a>Method</a> <code>requestParameters</code>.
     * </p>
     */
    private String cacheNamespace;

    /**
     * <p>
     * A list of request parameters whose values API Gateway caches. To be valid
     * values for <code>cacheKeyParameters</code>, these parameters must also be
     * specified for <a>Method</a> <code>requestParameters</code>.
     * </p>
     */
    private java.util.List<String> cacheKeyParameters;

    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example: Get integration responses of a method</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns <code>200 OK</code> status and a payload
     * as follows:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
     * >Creating an API</a> </div>
     */
    private java.util.Map<String, IntegrationResponse> integrationResponses;

    /**
     * <p>
     * Specifies an API method integration type. The valid value is one of the
     * following:
     * </p>
     * <ul>
     * <li><code>AWS</code>: for integrating the API method request with an AWS
     * service action, including the Lambda function-invoking action. With the
     * Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration.</li>
     * <li><code>AWS_PROXY</code>: for integrating the API method request with
     * the Lambda function-invoking action with the client request passed
     * through as-is. This integration is also referred to as the Lambda proxy
     * integration.</li>
     * <li><code>HTTP</code>: for integrating the API method request with an
     * HTTP endpoint, including a private HTTP endpoint within a VPC. This
     * integration is also referred to as the HTTP custom integration.</li>
     * <li><code>HTTP_PROXY</code>: for integrating the API method request with
     * an HTTP endpoint, including a private HTTP endpoint within a VPC, with
     * the client request passed through as-is. This is also referred to as the
     * HTTP proxy integration.</li>
     * <li><code>MOCK</code>: for integrating the API method request with API
     * Gateway as a "loop-back" endpoint without invoking any backend.</li>
     * </ul>
     * <p>
     * For the HTTP and HTTP proxy integrations, each integration can specify a
     * protocol (<code>http/https</code>), port and path. Standard 80 and 443
     * ports are supported as well as custom ports above 1024. An HTTP or HTTP
     * proxy integration with a <code>connectionType</code> of
     * <code>VPC_LINK</code> is referred to as a private integration and uses a
     * <a>VpcLink</a> to connect API Gateway to a network load balancer of a
     * VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY
     *
     * @return <p>
     *         Specifies an API method integration type. The valid value is one
     *         of the following:
     *         </p>
     *         <ul>
     *         <li><code>AWS</code>: for integrating the API method request with
     *         an AWS service action, including the Lambda function-invoking
     *         action. With the Lambda function-invoking action, this is
     *         referred to as the Lambda custom integration. With any other AWS
     *         service action, this is known as AWS integration.</li>
     *         <li><code>AWS_PROXY</code>: for integrating the API method
     *         request with the Lambda function-invoking action with the client
     *         request passed through as-is. This integration is also referred
     *         to as the Lambda proxy integration.</li>
     *         <li><code>HTTP</code>: for integrating the API method request
     *         with an HTTP endpoint, including a private HTTP endpoint within a
     *         VPC. This integration is also referred to as the HTTP custom
     *         integration.</li>
     *         <li><code>HTTP_PROXY</code>: for integrating the API method
     *         request with an HTTP endpoint, including a private HTTP endpoint
     *         within a VPC, with the client request passed through as-is. This
     *         is also referred to as the HTTP proxy integration.</li>
     *         <li><code>MOCK</code>: for integrating the API method request
     *         with API Gateway as a "loop-back" endpoint without invoking any
     *         backend.</li>
     *         </ul>
     *         <p>
     *         For the HTTP and HTTP proxy integrations, each integration can
     *         specify a protocol (<code>http/https</code>), port and path.
     *         Standard 80 and 443 ports are supported as well as custom ports
     *         above 1024. An HTTP or HTTP proxy integration with a
     *         <code>connectionType</code> of <code>VPC_LINK</code> is referred
     *         to as a private integration and uses a <a>VpcLink</a> to connect
     *         API Gateway to a network load balancer of a VPC.
     *         </p>
     * @see IntegrationType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Specifies an API method integration type. The valid value is one of the
     * following:
     * </p>
     * <ul>
     * <li><code>AWS</code>: for integrating the API method request with an AWS
     * service action, including the Lambda function-invoking action. With the
     * Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration.</li>
     * <li><code>AWS_PROXY</code>: for integrating the API method request with
     * the Lambda function-invoking action with the client request passed
     * through as-is. This integration is also referred to as the Lambda proxy
     * integration.</li>
     * <li><code>HTTP</code>: for integrating the API method request with an
     * HTTP endpoint, including a private HTTP endpoint within a VPC. This
     * integration is also referred to as the HTTP custom integration.</li>
     * <li><code>HTTP_PROXY</code>: for integrating the API method request with
     * an HTTP endpoint, including a private HTTP endpoint within a VPC, with
     * the client request passed through as-is. This is also referred to as the
     * HTTP proxy integration.</li>
     * <li><code>MOCK</code>: for integrating the API method request with API
     * Gateway as a "loop-back" endpoint without invoking any backend.</li>
     * </ul>
     * <p>
     * For the HTTP and HTTP proxy integrations, each integration can specify a
     * protocol (<code>http/https</code>), port and path. Standard 80 and 443
     * ports are supported as well as custom ports above 1024. An HTTP or HTTP
     * proxy integration with a <code>connectionType</code> of
     * <code>VPC_LINK</code> is referred to as a private integration and uses a
     * <a>VpcLink</a> to connect API Gateway to a network load balancer of a
     * VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY
     *
     * @param type <p>
     *            Specifies an API method integration type. The valid value is
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li><code>AWS</code>: for integrating the API method request
     *            with an AWS service action, including the Lambda
     *            function-invoking action. With the Lambda function-invoking
     *            action, this is referred to as the Lambda custom integration.
     *            With any other AWS service action, this is known as AWS
     *            integration.</li>
     *            <li><code>AWS_PROXY</code>: for integrating the API method
     *            request with the Lambda function-invoking action with the
     *            client request passed through as-is. This integration is also
     *            referred to as the Lambda proxy integration.</li>
     *            <li><code>HTTP</code>: for integrating the API method request
     *            with an HTTP endpoint, including a private HTTP endpoint
     *            within a VPC. This integration is also referred to as the HTTP
     *            custom integration.</li>
     *            <li><code>HTTP_PROXY</code>: for integrating the API method
     *            request with an HTTP endpoint, including a private HTTP
     *            endpoint within a VPC, with the client request passed through
     *            as-is. This is also referred to as the HTTP proxy integration.
     *            </li>
     *            <li><code>MOCK</code>: for integrating the API method request
     *            with API Gateway as a "loop-back" endpoint without invoking
     *            any backend.</li>
     *            </ul>
     *            <p>
     *            For the HTTP and HTTP proxy integrations, each integration can
     *            specify a protocol (<code>http/https</code>), port and path.
     *            Standard 80 and 443 ports are supported as well as custom
     *            ports above 1024. An HTTP or HTTP proxy integration with a
     *            <code>connectionType</code> of <code>VPC_LINK</code> is
     *            referred to as a private integration and uses a <a>VpcLink</a>
     *            to connect API Gateway to a network load balancer of a VPC.
     *            </p>
     * @see IntegrationType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies an API method integration type. The valid value is one of the
     * following:
     * </p>
     * <ul>
     * <li><code>AWS</code>: for integrating the API method request with an AWS
     * service action, including the Lambda function-invoking action. With the
     * Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration.</li>
     * <li><code>AWS_PROXY</code>: for integrating the API method request with
     * the Lambda function-invoking action with the client request passed
     * through as-is. This integration is also referred to as the Lambda proxy
     * integration.</li>
     * <li><code>HTTP</code>: for integrating the API method request with an
     * HTTP endpoint, including a private HTTP endpoint within a VPC. This
     * integration is also referred to as the HTTP custom integration.</li>
     * <li><code>HTTP_PROXY</code>: for integrating the API method request with
     * an HTTP endpoint, including a private HTTP endpoint within a VPC, with
     * the client request passed through as-is. This is also referred to as the
     * HTTP proxy integration.</li>
     * <li><code>MOCK</code>: for integrating the API method request with API
     * Gateway as a "loop-back" endpoint without invoking any backend.</li>
     * </ul>
     * <p>
     * For the HTTP and HTTP proxy integrations, each integration can specify a
     * protocol (<code>http/https</code>), port and path. Standard 80 and 443
     * ports are supported as well as custom ports above 1024. An HTTP or HTTP
     * proxy integration with a <code>connectionType</code> of
     * <code>VPC_LINK</code> is referred to as a private integration and uses a
     * <a>VpcLink</a> to connect API Gateway to a network load balancer of a
     * VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY
     *
     * @param type <p>
     *            Specifies an API method integration type. The valid value is
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li><code>AWS</code>: for integrating the API method request
     *            with an AWS service action, including the Lambda
     *            function-invoking action. With the Lambda function-invoking
     *            action, this is referred to as the Lambda custom integration.
     *            With any other AWS service action, this is known as AWS
     *            integration.</li>
     *            <li><code>AWS_PROXY</code>: for integrating the API method
     *            request with the Lambda function-invoking action with the
     *            client request passed through as-is. This integration is also
     *            referred to as the Lambda proxy integration.</li>
     *            <li><code>HTTP</code>: for integrating the API method request
     *            with an HTTP endpoint, including a private HTTP endpoint
     *            within a VPC. This integration is also referred to as the HTTP
     *            custom integration.</li>
     *            <li><code>HTTP_PROXY</code>: for integrating the API method
     *            request with an HTTP endpoint, including a private HTTP
     *            endpoint within a VPC, with the client request passed through
     *            as-is. This is also referred to as the HTTP proxy integration.
     *            </li>
     *            <li><code>MOCK</code>: for integrating the API method request
     *            with API Gateway as a "loop-back" endpoint without invoking
     *            any backend.</li>
     *            </ul>
     *            <p>
     *            For the HTTP and HTTP proxy integrations, each integration can
     *            specify a protocol (<code>http/https</code>), port and path.
     *            Standard 80 and 443 ports are supported as well as custom
     *            ports above 1024. An HTTP or HTTP proxy integration with a
     *            <code>connectionType</code> of <code>VPC_LINK</code> is
     *            referred to as a private integration and uses a <a>VpcLink</a>
     *            to connect API Gateway to a network load balancer of a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntegrationType
     */
    public Integration withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Specifies an API method integration type. The valid value is one of the
     * following:
     * </p>
     * <ul>
     * <li><code>AWS</code>: for integrating the API method request with an AWS
     * service action, including the Lambda function-invoking action. With the
     * Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration.</li>
     * <li><code>AWS_PROXY</code>: for integrating the API method request with
     * the Lambda function-invoking action with the client request passed
     * through as-is. This integration is also referred to as the Lambda proxy
     * integration.</li>
     * <li><code>HTTP</code>: for integrating the API method request with an
     * HTTP endpoint, including a private HTTP endpoint within a VPC. This
     * integration is also referred to as the HTTP custom integration.</li>
     * <li><code>HTTP_PROXY</code>: for integrating the API method request with
     * an HTTP endpoint, including a private HTTP endpoint within a VPC, with
     * the client request passed through as-is. This is also referred to as the
     * HTTP proxy integration.</li>
     * <li><code>MOCK</code>: for integrating the API method request with API
     * Gateway as a "loop-back" endpoint without invoking any backend.</li>
     * </ul>
     * <p>
     * For the HTTP and HTTP proxy integrations, each integration can specify a
     * protocol (<code>http/https</code>), port and path. Standard 80 and 443
     * ports are supported as well as custom ports above 1024. An HTTP or HTTP
     * proxy integration with a <code>connectionType</code> of
     * <code>VPC_LINK</code> is referred to as a private integration and uses a
     * <a>VpcLink</a> to connect API Gateway to a network load balancer of a
     * VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY
     *
     * @param type <p>
     *            Specifies an API method integration type. The valid value is
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li><code>AWS</code>: for integrating the API method request
     *            with an AWS service action, including the Lambda
     *            function-invoking action. With the Lambda function-invoking
     *            action, this is referred to as the Lambda custom integration.
     *            With any other AWS service action, this is known as AWS
     *            integration.</li>
     *            <li><code>AWS_PROXY</code>: for integrating the API method
     *            request with the Lambda function-invoking action with the
     *            client request passed through as-is. This integration is also
     *            referred to as the Lambda proxy integration.</li>
     *            <li><code>HTTP</code>: for integrating the API method request
     *            with an HTTP endpoint, including a private HTTP endpoint
     *            within a VPC. This integration is also referred to as the HTTP
     *            custom integration.</li>
     *            <li><code>HTTP_PROXY</code>: for integrating the API method
     *            request with an HTTP endpoint, including a private HTTP
     *            endpoint within a VPC, with the client request passed through
     *            as-is. This is also referred to as the HTTP proxy integration.
     *            </li>
     *            <li><code>MOCK</code>: for integrating the API method request
     *            with API Gateway as a "loop-back" endpoint without invoking
     *            any backend.</li>
     *            </ul>
     *            <p>
     *            For the HTTP and HTTP proxy integrations, each integration can
     *            specify a protocol (<code>http/https</code>), port and path.
     *            Standard 80 and 443 ports are supported as well as custom
     *            ports above 1024. An HTTP or HTTP proxy integration with a
     *            <code>connectionType</code> of <code>VPC_LINK</code> is
     *            referred to as a private integration and uses a <a>VpcLink</a>
     *            to connect API Gateway to a network load balancer of a VPC.
     *            </p>
     * @see IntegrationType
     */
    public void setType(IntegrationType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specifies an API method integration type. The valid value is one of the
     * following:
     * </p>
     * <ul>
     * <li><code>AWS</code>: for integrating the API method request with an AWS
     * service action, including the Lambda function-invoking action. With the
     * Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS
     * integration.</li>
     * <li><code>AWS_PROXY</code>: for integrating the API method request with
     * the Lambda function-invoking action with the client request passed
     * through as-is. This integration is also referred to as the Lambda proxy
     * integration.</li>
     * <li><code>HTTP</code>: for integrating the API method request with an
     * HTTP endpoint, including a private HTTP endpoint within a VPC. This
     * integration is also referred to as the HTTP custom integration.</li>
     * <li><code>HTTP_PROXY</code>: for integrating the API method request with
     * an HTTP endpoint, including a private HTTP endpoint within a VPC, with
     * the client request passed through as-is. This is also referred to as the
     * HTTP proxy integration.</li>
     * <li><code>MOCK</code>: for integrating the API method request with API
     * Gateway as a "loop-back" endpoint without invoking any backend.</li>
     * </ul>
     * <p>
     * For the HTTP and HTTP proxy integrations, each integration can specify a
     * protocol (<code>http/https</code>), port and path. Standard 80 and 443
     * ports are supported as well as custom ports above 1024. An HTTP or HTTP
     * proxy integration with a <code>connectionType</code> of
     * <code>VPC_LINK</code> is referred to as a private integration and uses a
     * <a>VpcLink</a> to connect API Gateway to a network load balancer of a
     * VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY
     *
     * @param type <p>
     *            Specifies an API method integration type. The valid value is
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li><code>AWS</code>: for integrating the API method request
     *            with an AWS service action, including the Lambda
     *            function-invoking action. With the Lambda function-invoking
     *            action, this is referred to as the Lambda custom integration.
     *            With any other AWS service action, this is known as AWS
     *            integration.</li>
     *            <li><code>AWS_PROXY</code>: for integrating the API method
     *            request with the Lambda function-invoking action with the
     *            client request passed through as-is. This integration is also
     *            referred to as the Lambda proxy integration.</li>
     *            <li><code>HTTP</code>: for integrating the API method request
     *            with an HTTP endpoint, including a private HTTP endpoint
     *            within a VPC. This integration is also referred to as the HTTP
     *            custom integration.</li>
     *            <li><code>HTTP_PROXY</code>: for integrating the API method
     *            request with an HTTP endpoint, including a private HTTP
     *            endpoint within a VPC, with the client request passed through
     *            as-is. This is also referred to as the HTTP proxy integration.
     *            </li>
     *            <li><code>MOCK</code>: for integrating the API method request
     *            with API Gateway as a "loop-back" endpoint without invoking
     *            any backend.</li>
     *            </ul>
     *            <p>
     *            For the HTTP and HTTP proxy integrations, each integration can
     *            specify a protocol (<code>http/https</code>), port and path.
     *            Standard 80 and 443 ports are supported as well as custom
     *            ports above 1024. An HTTP or HTTP proxy integration with a
     *            <code>connectionType</code> of <code>VPC_LINK</code> is
     *            referred to as a private integration and uses a <a>VpcLink</a>
     *            to connect API Gateway to a network load balancer of a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IntegrationType
     */
    public Integration withType(IntegrationType type) {
        this.type = type.toString();
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
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     *
     * @param httpMethod <p>
     *            Specifies the integration's HTTP method type.
     *            </p>
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpMethod <p>
     *            Specifies the integration's HTTP method type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * <p>
     * Specifies Uniform Resource Identifier (URI) of the integration endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations, the URI
     * must be a fully formed, encoded HTTP(S) URL according to the <a
     * target="_blank"
     * href="https://en.wikipedia.org/wiki/Uniform_Resource_Identifier">RFC-3986
     * specification</a>, for either standard integration, where
     * <code>connectionType</code> is not <code>VPC_LINK</code>, or private
     * integration, where <code>connectionType</code> is <code>VPC_LINK</code>.
     * For a private HTTP integration, the URI is not used for routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is
     * of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>
     * . Here, <code>{Region}</code> is the API Gateway region (e.g.,
     * <code>us-east-1</code>); <code>{service}</code> is the name of the
     * integrated AWS service (e.g., <code>s3</code>); and
     * <code>{subdomain}</code> is a designated subdomain supported by certain
     * AWS service for fast host-name lookup. <code>action</code> can be used
     * for an AWS service action-based API, using an
     * <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query string. The
     * ensuing <code>{service_api}</code> refers to a supported action
     * <code>{name}</code> plus any required input parameters. Alternatively,
     * <code>path</code> can be used for an AWS service path-based API. The
     * ensuing <code>service_api</code> refers to the path to an AWS service
     * resource, including the region of the integrated AWS service, if
     * applicable. For example, for integration with the S3 API of
     * <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>
     * , the <code>uri</code> can be either
     * <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code>
     * or <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies Uniform Resource Identifier (URI) of the integration
     *         endpoint.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations,
     *         the URI must be a fully formed, encoded HTTP(S) URL according to
     *         the <a target="_blank" href=
     *         "https://en.wikipedia.org/wiki/Uniform_Resource_Identifier"
     *         >RFC-3986 specification</a>, for either standard integration,
     *         where <code>connectionType</code> is not <code>VPC_LINK</code>,
     *         or private integration, where <code>connectionType</code> is
     *         <code>VPC_LINK</code>. For a private HTTP integration, the URI is
     *         not used for routing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the
     *         URI is of the form
     *         <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>
     *         . Here, <code>{Region}</code> is the API Gateway region (e.g.,
     *         <code>us-east-1</code>); <code>{service}</code> is the name of
     *         the integrated AWS service (e.g., <code>s3</code>); and
     *         <code>{subdomain}</code> is a designated subdomain supported by
     *         certain AWS service for fast host-name lookup.
     *         <code>action</code> can be used for an AWS service action-based
     *         API, using an
     *         <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query
     *         string. The ensuing <code>{service_api}</code> refers to a
     *         supported action <code>{name}</code> plus any required input
     *         parameters. Alternatively, <code>path</code> can be used for an
     *         AWS service path-based API. The ensuing <code>service_api</code>
     *         refers to the path to an AWS service resource, including the
     *         region of the integrated AWS service, if applicable. For example,
     *         for integration with the S3 API of
     *         <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>
     *         , the <code>uri</code> can be either
     *         <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code>
     *         or
     *         <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getUri() {
        return uri;
    }

    /**
     * <p>
     * Specifies Uniform Resource Identifier (URI) of the integration endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations, the URI
     * must be a fully formed, encoded HTTP(S) URL according to the <a
     * target="_blank"
     * href="https://en.wikipedia.org/wiki/Uniform_Resource_Identifier">RFC-3986
     * specification</a>, for either standard integration, where
     * <code>connectionType</code> is not <code>VPC_LINK</code>, or private
     * integration, where <code>connectionType</code> is <code>VPC_LINK</code>.
     * For a private HTTP integration, the URI is not used for routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is
     * of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>
     * . Here, <code>{Region}</code> is the API Gateway region (e.g.,
     * <code>us-east-1</code>); <code>{service}</code> is the name of the
     * integrated AWS service (e.g., <code>s3</code>); and
     * <code>{subdomain}</code> is a designated subdomain supported by certain
     * AWS service for fast host-name lookup. <code>action</code> can be used
     * for an AWS service action-based API, using an
     * <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query string. The
     * ensuing <code>{service_api}</code> refers to a supported action
     * <code>{name}</code> plus any required input parameters. Alternatively,
     * <code>path</code> can be used for an AWS service path-based API. The
     * ensuing <code>service_api</code> refers to the path to an AWS service
     * resource, including the region of the integrated AWS service, if
     * applicable. For example, for integration with the S3 API of
     * <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>
     * , the <code>uri</code> can be either
     * <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code>
     * or <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param uri <p>
     *            Specifies Uniform Resource Identifier (URI) of the integration
     *            endpoint.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations,
     *            the URI must be a fully formed, encoded HTTP(S) URL according
     *            to the <a target="_blank" href=
     *            "https://en.wikipedia.org/wiki/Uniform_Resource_Identifier"
     *            >RFC-3986 specification</a>, for either standard integration,
     *            where <code>connectionType</code> is not <code>VPC_LINK</code>
     *            , or private integration, where <code>connectionType</code> is
     *            <code>VPC_LINK</code>. For a private HTTP integration, the URI
     *            is not used for routing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For <code>AWS</code> or <code>AWS_PROXY</code> integrations,
     *            the URI is of the form
     *            <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>
     *            . Here, <code>{Region}</code> is the API Gateway region (e.g.,
     *            <code>us-east-1</code>); <code>{service}</code> is the name of
     *            the integrated AWS service (e.g., <code>s3</code>); and
     *            <code>{subdomain}</code> is a designated subdomain supported
     *            by certain AWS service for fast host-name lookup.
     *            <code>action</code> can be used for an AWS service
     *            action-based API, using an
     *            <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query
     *            string. The ensuing <code>{service_api}</code> refers to a
     *            supported action <code>{name}</code> plus any required input
     *            parameters. Alternatively, <code>path</code> can be used for
     *            an AWS service path-based API. The ensuing
     *            <code>service_api</code> refers to the path to an AWS service
     *            resource, including the region of the integrated AWS service,
     *            if applicable. For example, for integration with the S3 API of
     *            <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>
     *            , the <code>uri</code> can be either
     *            <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code>
     *            or
     *            <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * Specifies Uniform Resource Identifier (URI) of the integration endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations, the URI
     * must be a fully formed, encoded HTTP(S) URL according to the <a
     * target="_blank"
     * href="https://en.wikipedia.org/wiki/Uniform_Resource_Identifier">RFC-3986
     * specification</a>, for either standard integration, where
     * <code>connectionType</code> is not <code>VPC_LINK</code>, or private
     * integration, where <code>connectionType</code> is <code>VPC_LINK</code>.
     * For a private HTTP integration, the URI is not used for routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is
     * of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>
     * . Here, <code>{Region}</code> is the API Gateway region (e.g.,
     * <code>us-east-1</code>); <code>{service}</code> is the name of the
     * integrated AWS service (e.g., <code>s3</code>); and
     * <code>{subdomain}</code> is a designated subdomain supported by certain
     * AWS service for fast host-name lookup. <code>action</code> can be used
     * for an AWS service action-based API, using an
     * <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query string. The
     * ensuing <code>{service_api}</code> refers to a supported action
     * <code>{name}</code> plus any required input parameters. Alternatively,
     * <code>path</code> can be used for an AWS service path-based API. The
     * ensuing <code>service_api</code> refers to the path to an AWS service
     * resource, including the region of the integrated AWS service, if
     * applicable. For example, for integration with the S3 API of
     * <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>
     * , the <code>uri</code> can be either
     * <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code>
     * or <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uri <p>
     *            Specifies Uniform Resource Identifier (URI) of the integration
     *            endpoint.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations,
     *            the URI must be a fully formed, encoded HTTP(S) URL according
     *            to the <a target="_blank" href=
     *            "https://en.wikipedia.org/wiki/Uniform_Resource_Identifier"
     *            >RFC-3986 specification</a>, for either standard integration,
     *            where <code>connectionType</code> is not <code>VPC_LINK</code>
     *            , or private integration, where <code>connectionType</code> is
     *            <code>VPC_LINK</code>. For a private HTTP integration, the URI
     *            is not used for routing.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For <code>AWS</code> or <code>AWS_PROXY</code> integrations,
     *            the URI is of the form
     *            <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>
     *            . Here, <code>{Region}</code> is the API Gateway region (e.g.,
     *            <code>us-east-1</code>); <code>{service}</code> is the name of
     *            the integrated AWS service (e.g., <code>s3</code>); and
     *            <code>{subdomain}</code> is a designated subdomain supported
     *            by certain AWS service for fast host-name lookup.
     *            <code>action</code> can be used for an AWS service
     *            action-based API, using an
     *            <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query
     *            string. The ensuing <code>{service_api}</code> refers to a
     *            supported action <code>{name}</code> plus any required input
     *            parameters. Alternatively, <code>path</code> can be used for
     *            an AWS service path-based API. The ensuing
     *            <code>service_api</code> refers to the path to an AWS service
     *            resource, including the region of the integrated AWS service,
     *            if applicable. For example, for integration with the S3 API of
     *            <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>
     *            , the <code>uri</code> can be either
     *            <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code>
     *            or
     *            <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid
     * value is <code>INTERNET</code> for connections through the public
     * routable internet or <code>VPC_LINK</code> for private connections
     * between API Gateway and a network load balancer in a VPC. The default
     * value is <code>INTERNET</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNET, VPC_LINK
     *
     * @return <p>
     *         The type of the network connection to the integration endpoint.
     *         The valid value is <code>INTERNET</code> for connections through
     *         the public routable internet or <code>VPC_LINK</code> for private
     *         connections between API Gateway and a network load balancer in a
     *         VPC. The default value is <code>INTERNET</code>.
     *         </p>
     * @see ConnectionType
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid
     * value is <code>INTERNET</code> for connections through the public
     * routable internet or <code>VPC_LINK</code> for private connections
     * between API Gateway and a network load balancer in a VPC. The default
     * value is <code>INTERNET</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNET, VPC_LINK
     *
     * @param connectionType <p>
     *            The type of the network connection to the integration
     *            endpoint. The valid value is <code>INTERNET</code> for
     *            connections through the public routable internet or
     *            <code>VPC_LINK</code> for private connections between API
     *            Gateway and a network load balancer in a VPC. The default
     *            value is <code>INTERNET</code>.
     *            </p>
     * @see ConnectionType
     */
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid
     * value is <code>INTERNET</code> for connections through the public
     * routable internet or <code>VPC_LINK</code> for private connections
     * between API Gateway and a network load balancer in a VPC. The default
     * value is <code>INTERNET</code>.
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
     *            endpoint. The valid value is <code>INTERNET</code> for
     *            connections through the public routable internet or
     *            <code>VPC_LINK</code> for private connections between API
     *            Gateway and a network load balancer in a VPC. The default
     *            value is <code>INTERNET</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionType
     */
    public Integration withConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid
     * value is <code>INTERNET</code> for connections through the public
     * routable internet or <code>VPC_LINK</code> for private connections
     * between API Gateway and a network load balancer in a VPC. The default
     * value is <code>INTERNET</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNET, VPC_LINK
     *
     * @param connectionType <p>
     *            The type of the network connection to the integration
     *            endpoint. The valid value is <code>INTERNET</code> for
     *            connections through the public routable internet or
     *            <code>VPC_LINK</code> for private connections between API
     *            Gateway and a network load balancer in a VPC. The default
     *            value is <code>INTERNET</code>.
     *            </p>
     * @see ConnectionType
     */
    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid
     * value is <code>INTERNET</code> for connections through the public
     * routable internet or <code>VPC_LINK</code> for private connections
     * between API Gateway and a network load balancer in a VPC. The default
     * value is <code>INTERNET</code>.
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
     *            endpoint. The valid value is <code>INTERNET</code> for
     *            connections through the public routable internet or
     *            <code>VPC_LINK</code> for private connections between API
     *            Gateway and a network load balancer in a VPC. The default
     *            value is <code>INTERNET</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConnectionType
     */
    public Integration withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
        return this;
    }

    /**
     * <p>
     * The (<a href=
     * "https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"
     * ><code>id</code></a>) of the <a>VpcLink</a> used for the integration when
     * <code>connectionType=VPC_LINK</code> and undefined, otherwise.
     * </p>
     *
     * @return <p>
     *         The (<a href=
     *         "https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"
     *         ><code>id</code></a>) of the <a>VpcLink</a> used for the
     *         integration when <code>connectionType=VPC_LINK</code> and
     *         undefined, otherwise.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The (<a href=
     * "https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"
     * ><code>id</code></a>) of the <a>VpcLink</a> used for the integration when
     * <code>connectionType=VPC_LINK</code> and undefined, otherwise.
     * </p>
     *
     * @param connectionId <p>
     *            The (<a href=
     *            "https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"
     *            ><code>id</code></a>) of the <a>VpcLink</a> used for the
     *            integration when <code>connectionType=VPC_LINK</code> and
     *            undefined, otherwise.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The (<a href=
     * "https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"
     * ><code>id</code></a>) of the <a>VpcLink</a> used for the integration when
     * <code>connectionType=VPC_LINK</code> and undefined, otherwise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The (<a href=
     *            "https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"
     *            ><code>id</code></a>) of the <a>VpcLink</a> used for the
     *            integration when <code>connectionType=VPC_LINK</code> and
     *            undefined, otherwise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for API
     * Gateway to assume, use the role's Amazon Resource Name (ARN). To require
     * that the caller's identity be passed through from the request, specify
     * the string <code>arn:aws:iam::\*:user/\*</code>. To use resource-based
     * permissions on supported AWS services, specify null.
     * </p>
     *
     * @return <p>
     *         Specifies the credentials required for the integration, if any.
     *         For AWS integrations, three options are available. To specify an
     *         IAM Role for API Gateway to assume, use the role's Amazon
     *         Resource Name (ARN). To require that the caller's identity be
     *         passed through from the request, specify the string
     *         <code>arn:aws:iam::\*:user/\*</code>. To use resource-based
     *         permissions on supported AWS services, specify null.
     *         </p>
     */
    public String getCredentials() {
        return credentials;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for API
     * Gateway to assume, use the role's Amazon Resource Name (ARN). To require
     * that the caller's identity be passed through from the request, specify
     * the string <code>arn:aws:iam::\*:user/\*</code>. To use resource-based
     * permissions on supported AWS services, specify null.
     * </p>
     *
     * @param credentials <p>
     *            Specifies the credentials required for the integration, if
     *            any. For AWS integrations, three options are available. To
     *            specify an IAM Role for API Gateway to assume, use the role's
     *            Amazon Resource Name (ARN). To require that the caller's
     *            identity be passed through from the request, specify the
     *            string <code>arn:aws:iam::\*:user/\*</code>. To use
     *            resource-based permissions on supported AWS services, specify
     *            null.
     *            </p>
     */
    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for API
     * Gateway to assume, use the role's Amazon Resource Name (ARN). To require
     * that the caller's identity be passed through from the request, specify
     * the string <code>arn:aws:iam::\*:user/\*</code>. To use resource-based
     * permissions on supported AWS services, specify null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credentials <p>
     *            Specifies the credentials required for the integration, if
     *            any. For AWS integrations, three options are available. To
     *            specify an IAM Role for API Gateway to assume, use the role's
     *            Amazon Resource Name (ARN). To require that the caller's
     *            identity be passed through from the request, specify the
     *            string <code>arn:aws:iam::\*:user/\*</code>. To use
     *            resource-based permissions on supported AWS services, specify
     *            null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withCredentials(String credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the
     * method request to the back end. The key is an integration request
     * parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and
     * pre-encoded as required by the back end. The method request parameter
     * value must match the pattern of
     * <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is <code>querystring</code>, <code>path</code>, or
     * <code>header</code> and <code>name</code> must be a valid and unique
     * method request parameter name.
     * </p>
     *
     * @return <p>
     *         A key-value map specifying request parameters that are passed
     *         from the method request to the back end. The key is an
     *         integration request parameter name and the associated value is a
     *         method request parameter value or static value that must be
     *         enclosed within single quotes and pre-encoded as required by the
     *         back end. The method request parameter value must match the
     *         pattern of <code>method.request.{location}.{name}</code>, where
     *         <code>location</code> is <code>querystring</code>,
     *         <code>path</code>, or <code>header</code> and <code>name</code>
     *         must be a valid and unique method request parameter name.
     *         </p>
     */
    public java.util.Map<String, String> getRequestParameters() {
        return requestParameters;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the
     * method request to the back end. The key is an integration request
     * parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and
     * pre-encoded as required by the back end. The method request parameter
     * value must match the pattern of
     * <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is <code>querystring</code>, <code>path</code>, or
     * <code>header</code> and <code>name</code> must be a valid and unique
     * method request parameter name.
     * </p>
     *
     * @param requestParameters <p>
     *            A key-value map specifying request parameters that are passed
     *            from the method request to the back end. The key is an
     *            integration request parameter name and the associated value is
     *            a method request parameter value or static value that must be
     *            enclosed within single quotes and pre-encoded as required by
     *            the back end. The method request parameter value must match
     *            the pattern of <code>method.request.{location}.{name}</code>,
     *            where <code>location</code> is <code>querystring</code>,
     *            <code>path</code>, or <code>header</code> and
     *            <code>name</code> must be a valid and unique method request
     *            parameter name.
     *            </p>
     */
    public void setRequestParameters(java.util.Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the
     * method request to the back end. The key is an integration request
     * parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and
     * pre-encoded as required by the back end. The method request parameter
     * value must match the pattern of
     * <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is <code>querystring</code>, <code>path</code>, or
     * <code>header</code> and <code>name</code> must be a valid and unique
     * method request parameter name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestParameters <p>
     *            A key-value map specifying request parameters that are passed
     *            from the method request to the back end. The key is an
     *            integration request parameter name and the associated value is
     *            a method request parameter value or static value that must be
     *            enclosed within single quotes and pre-encoded as required by
     *            the back end. The method request parameter value must match
     *            the pattern of <code>method.request.{location}.{name}</code>,
     *            where <code>location</code> is <code>querystring</code>,
     *            <code>path</code>, or <code>header</code> and
     *            <code>name</code> must be a valid and unique method request
     *            parameter name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withRequestParameters(java.util.Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
        return this;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the
     * method request to the back end. The key is an integration request
     * parameter name and the associated value is a method request parameter
     * value or static value that must be enclosed within single quotes and
     * pre-encoded as required by the back end. The method request parameter
     * value must match the pattern of
     * <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is <code>querystring</code>, <code>path</code>, or
     * <code>header</code> and <code>name</code> must be a valid and unique
     * method request parameter name.
     * </p>
     * <p>
     * The method adds a new key-value pair into requestParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into requestParameters.
     * @param value The corresponding value of the entry to be added into
     *            requestParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration addrequestParametersEntry(String key, String value) {
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
     * Removes all the entries added into requestParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Integration clearrequestParametersEntries() {
        this.requestParameters = null;
        return this;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request
     * payload based on the value of the Content-Type header sent by the client.
     * The content type value is the key in this map, and the template (as a
     * String) is the value.
     * </p>
     *
     * @return <p>
     *         Represents a map of Velocity templates that are applied on the
     *         request payload based on the value of the Content-Type header
     *         sent by the client. The content type value is the key in this
     *         map, and the template (as a String) is the value.
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
     * String) is the value.
     * </p>
     *
     * @param requestTemplates <p>
     *            Represents a map of Velocity templates that are applied on the
     *            request payload based on the value of the Content-Type header
     *            sent by the client. The content type value is the key in this
     *            map, and the template (as a String) is the value.
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
     * String) is the value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestTemplates <p>
     *            Represents a map of Velocity templates that are applied on the
     *            request payload based on the value of the Content-Type header
     *            sent by the client. The content type value is the key in this
     *            map, and the template (as a String) is the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withRequestTemplates(java.util.Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
        return this;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request
     * payload based on the value of the Content-Type header sent by the client.
     * The content type value is the key in this map, and the template (as a
     * String) is the value.
     * </p>
     * <p>
     * The method adds a new key-value pair into requestTemplates parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into requestTemplates.
     * @param value The corresponding value of the entry to be added into
     *            requestTemplates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration addrequestTemplatesEntry(String key, String value) {
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
     * Removes all the entries added into requestTemplates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Integration clearrequestTemplatesEntries() {
        this.requestTemplates = null;
        return this;
    }

    /**
     * <div>
     * <p>
     * Specifies how the method request body of an unmapped content type will be
     * passed through the integration request to the back end without
     * transformation. A content type is unmapped if no mapping template is
     * defined in the integration or the content type does not match any of the
     * mapped content types, as specified in <code>requestTemplates</code>. The
     * valid value is one of the following:
     * </p>
     * <ul>
     * <li> <code>WHEN_NO_MATCH</code>: passes the method request body through
     * the integration request to the back end without transformation when the
     * method request content type does not match any content type associated
     * with the mapping templates defined in the integration request.</li>
     * <li> <code>WHEN_NO_TEMPLATES</code>: passes the method request body
     * through the integration request to the back end without transformation
     * when no mapping template is defined in the integration request. If a
     * template is defined when this option is selected, the method request of
     * an unmapped content-type will be rejected with an HTTP
     * <code>415 Unsupported Media Type</code> response.</li>
     * <li> <code>NEVER</code>: rejects the method request with an HTTP
     * <code>415 Unsupported Media Type</code> response when either the method
     * request content type does not match any content type associated with the
     * mapping templates defined in the integration request or no mapping
     * template is defined in the integration request.</li>
     * </ul>
     * </div>
     *
     * @return <div>
     *         <p>
     *         Specifies how the method request body of an unmapped content type
     *         will be passed through the integration request to the back end
     *         without transformation. A content type is unmapped if no mapping
     *         template is defined in the integration or the content type does
     *         not match any of the mapped content types, as specified in
     *         <code>requestTemplates</code>. The valid value is one of the
     *         following:
     *         </p>
     *         <ul>
     *         <li> <code>WHEN_NO_MATCH</code>: passes the method request body
     *         through the integration request to the back end without
     *         transformation when the method request content type does not
     *         match any content type associated with the mapping templates
     *         defined in the integration request.</li>
     *         <li> <code>WHEN_NO_TEMPLATES</code>: passes the method request
     *         body through the integration request to the back end without
     *         transformation when no mapping template is defined in the
     *         integration request. If a template is defined when this option is
     *         selected, the method request of an unmapped content-type will be
     *         rejected with an HTTP <code>415 Unsupported Media Type</code>
     *         response.</li>
     *         <li> <code>NEVER</code>: rejects the method request with an HTTP
     *         <code>415 Unsupported Media Type</code> response when either the
     *         method request content type does not match any content type
     *         associated with the mapping templates defined in the integration
     *         request or no mapping template is defined in the integration
     *         request.</li>
     *         </ul>
     *         </div>
     */
    public String getPassthroughBehavior() {
        return passthroughBehavior;
    }

    /**
     * <div>
     * <p>
     * Specifies how the method request body of an unmapped content type will be
     * passed through the integration request to the back end without
     * transformation. A content type is unmapped if no mapping template is
     * defined in the integration or the content type does not match any of the
     * mapped content types, as specified in <code>requestTemplates</code>. The
     * valid value is one of the following:
     * </p>
     * <ul>
     * <li> <code>WHEN_NO_MATCH</code>: passes the method request body through
     * the integration request to the back end without transformation when the
     * method request content type does not match any content type associated
     * with the mapping templates defined in the integration request.</li>
     * <li> <code>WHEN_NO_TEMPLATES</code>: passes the method request body
     * through the integration request to the back end without transformation
     * when no mapping template is defined in the integration request. If a
     * template is defined when this option is selected, the method request of
     * an unmapped content-type will be rejected with an HTTP
     * <code>415 Unsupported Media Type</code> response.</li>
     * <li> <code>NEVER</code>: rejects the method request with an HTTP
     * <code>415 Unsupported Media Type</code> response when either the method
     * request content type does not match any content type associated with the
     * mapping templates defined in the integration request or no mapping
     * template is defined in the integration request.</li>
     * </ul>
     * </div>
     *
     * @param passthroughBehavior <div>
     *            <p>
     *            Specifies how the method request body of an unmapped content
     *            type will be passed through the integration request to the
     *            back end without transformation. A content type is unmapped if
     *            no mapping template is defined in the integration or the
     *            content type does not match any of the mapped content types,
     *            as specified in <code>requestTemplates</code>. The valid value
     *            is one of the following:
     *            </p>
     *            <ul>
     *            <li> <code>WHEN_NO_MATCH</code>: passes the method request body
     *            through the integration request to the back end without
     *            transformation when the method request content type does not
     *            match any content type associated with the mapping templates
     *            defined in the integration request.</li>
     *            <li> <code>WHEN_NO_TEMPLATES</code>: passes the method request
     *            body through the integration request to the back end without
     *            transformation when no mapping template is defined in the
     *            integration request. If a template is defined when this option
     *            is selected, the method request of an unmapped content-type
     *            will be rejected with an HTTP
     *            <code>415 Unsupported Media Type</code> response.</li>
     *            <li> <code>NEVER</code>: rejects the method request with an
     *            HTTP <code>415 Unsupported Media Type</code> response when
     *            either the method request content type does not match any
     *            content type associated with the mapping templates defined in
     *            the integration request or no mapping template is defined in
     *            the integration request.</li>
     *            </ul>
     *            </div>
     */
    public void setPassthroughBehavior(String passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
    }

    /**
     * <div>
     * <p>
     * Specifies how the method request body of an unmapped content type will be
     * passed through the integration request to the back end without
     * transformation. A content type is unmapped if no mapping template is
     * defined in the integration or the content type does not match any of the
     * mapped content types, as specified in <code>requestTemplates</code>. The
     * valid value is one of the following:
     * </p>
     * <ul>
     * <li> <code>WHEN_NO_MATCH</code>: passes the method request body through
     * the integration request to the back end without transformation when the
     * method request content type does not match any content type associated
     * with the mapping templates defined in the integration request.</li>
     * <li> <code>WHEN_NO_TEMPLATES</code>: passes the method request body
     * through the integration request to the back end without transformation
     * when no mapping template is defined in the integration request. If a
     * template is defined when this option is selected, the method request of
     * an unmapped content-type will be rejected with an HTTP
     * <code>415 Unsupported Media Type</code> response.</li>
     * <li> <code>NEVER</code>: rejects the method request with an HTTP
     * <code>415 Unsupported Media Type</code> response when either the method
     * request content type does not match any content type associated with the
     * mapping templates defined in the integration request or no mapping
     * template is defined in the integration request.</li>
     * </ul>
     * </div>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param passthroughBehavior <div>
     *            <p>
     *            Specifies how the method request body of an unmapped content
     *            type will be passed through the integration request to the
     *            back end without transformation. A content type is unmapped if
     *            no mapping template is defined in the integration or the
     *            content type does not match any of the mapped content types,
     *            as specified in <code>requestTemplates</code>. The valid value
     *            is one of the following:
     *            </p>
     *            <ul>
     *            <li> <code>WHEN_NO_MATCH</code>: passes the method request body
     *            through the integration request to the back end without
     *            transformation when the method request content type does not
     *            match any content type associated with the mapping templates
     *            defined in the integration request.</li>
     *            <li> <code>WHEN_NO_TEMPLATES</code>: passes the method request
     *            body through the integration request to the back end without
     *            transformation when no mapping template is defined in the
     *            integration request. If a template is defined when this option
     *            is selected, the method request of an unmapped content-type
     *            will be rejected with an HTTP
     *            <code>415 Unsupported Media Type</code> response.</li>
     *            <li> <code>NEVER</code>: rejects the method request with an
     *            HTTP <code>415 Unsupported Media Type</code> response when
     *            either the method request content type does not match any
     *            content type associated with the mapping templates defined in
     *            the integration request or no mapping template is defined in
     *            the integration request.</li>
     *            </ul>
     *            </div>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withPassthroughBehavior(String passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
        return this;
    }

    /**
     * <p>
     * Specifies how to handle request payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed
     * through from the method request to integration request without
     * modification, provided that the <code>passthroughBehavior</code> is
     * configured to support payload pass-through.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @return <p>
     *         Specifies how to handle request payload content type conversions.
     *         Supported values are <code>CONVERT_TO_BINARY</code> and
     *         <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CONVERT_TO_BINARY</code>: Converts a request payload from a
     *         Base64-encoded string to the corresponding binary blob.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONVERT_TO_TEXT</code>: Converts a request payload from a
     *         binary blob to a Base64-encoded string.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If this property is not defined, the request payload will be
     *         passed through from the method request to integration request
     *         without modification, provided that the
     *         <code>passthroughBehavior</code> is configured to support payload
     *         pass-through.
     *         </p>
     * @see ContentHandlingStrategy
     */
    public String getContentHandling() {
        return contentHandling;
    }

    /**
     * <p>
     * Specifies how to handle request payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed
     * through from the method request to integration request without
     * modification, provided that the <code>passthroughBehavior</code> is
     * configured to support payload pass-through.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandling <p>
     *            Specifies how to handle request payload content type
     *            conversions. Supported values are
     *            <code>CONVERT_TO_BINARY</code> and
     *            <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_BINARY</code>: Converts a request payload
     *            from a Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_TEXT</code>: Converts a request payload from
     *            a binary blob to a Base64-encoded string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If this property is not defined, the request payload will be
     *            passed through from the method request to integration request
     *            without modification, provided that the
     *            <code>passthroughBehavior</code> is configured to support
     *            payload pass-through.
     *            </p>
     * @see ContentHandlingStrategy
     */
    public void setContentHandling(String contentHandling) {
        this.contentHandling = contentHandling;
    }

    /**
     * <p>
     * Specifies how to handle request payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed
     * through from the method request to integration request without
     * modification, provided that the <code>passthroughBehavior</code> is
     * configured to support payload pass-through.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandling <p>
     *            Specifies how to handle request payload content type
     *            conversions. Supported values are
     *            <code>CONVERT_TO_BINARY</code> and
     *            <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_BINARY</code>: Converts a request payload
     *            from a Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_TEXT</code>: Converts a request payload from
     *            a binary blob to a Base64-encoded string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If this property is not defined, the request payload will be
     *            passed through from the method request to integration request
     *            without modification, provided that the
     *            <code>passthroughBehavior</code> is configured to support
     *            payload pass-through.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentHandlingStrategy
     */
    public Integration withContentHandling(String contentHandling) {
        this.contentHandling = contentHandling;
        return this;
    }

    /**
     * <p>
     * Specifies how to handle request payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed
     * through from the method request to integration request without
     * modification, provided that the <code>passthroughBehavior</code> is
     * configured to support payload pass-through.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandling <p>
     *            Specifies how to handle request payload content type
     *            conversions. Supported values are
     *            <code>CONVERT_TO_BINARY</code> and
     *            <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_BINARY</code>: Converts a request payload
     *            from a Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_TEXT</code>: Converts a request payload from
     *            a binary blob to a Base64-encoded string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If this property is not defined, the request payload will be
     *            passed through from the method request to integration request
     *            without modification, provided that the
     *            <code>passthroughBehavior</code> is configured to support
     *            payload pass-through.
     *            </p>
     * @see ContentHandlingStrategy
     */
    public void setContentHandling(ContentHandlingStrategy contentHandling) {
        this.contentHandling = contentHandling.toString();
    }

    /**
     * <p>
     * Specifies how to handle request payload content type conversions.
     * Supported values are <code>CONVERT_TO_BINARY</code> and
     * <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a
     * Base64-encoded string to the corresponding binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary
     * blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed
     * through from the method request to integration request without
     * modification, provided that the <code>passthroughBehavior</code> is
     * configured to support payload pass-through.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONVERT_TO_BINARY, CONVERT_TO_TEXT
     *
     * @param contentHandling <p>
     *            Specifies how to handle request payload content type
     *            conversions. Supported values are
     *            <code>CONVERT_TO_BINARY</code> and
     *            <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_BINARY</code>: Converts a request payload
     *            from a Base64-encoded string to the corresponding binary blob.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CONVERT_TO_TEXT</code>: Converts a request payload from
     *            a binary blob to a Base64-encoded string.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If this property is not defined, the request payload will be
     *            passed through from the method request to integration request
     *            without modification, provided that the
     *            <code>passthroughBehavior</code> is configured to support
     *            payload pass-through.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentHandlingStrategy
     */
    public Integration withContentHandling(ContentHandlingStrategy contentHandling) {
        this.contentHandling = contentHandling.toString();
        return this;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds. The default value is
     * 29,000 milliseconds or 29 seconds.
     * </p>
     *
     * @return <p>
     *         Custom timeout between 50 and 29,000 milliseconds. The default
     *         value is 29,000 milliseconds or 29 seconds.
     *         </p>
     */
    public Integer getTimeoutInMillis() {
        return timeoutInMillis;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds. The default value is
     * 29,000 milliseconds or 29 seconds.
     * </p>
     *
     * @param timeoutInMillis <p>
     *            Custom timeout between 50 and 29,000 milliseconds. The default
     *            value is 29,000 milliseconds or 29 seconds.
     *            </p>
     */
    public void setTimeoutInMillis(Integer timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds. The default value is
     * 29,000 milliseconds or 29 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeoutInMillis <p>
     *            Custom timeout between 50 and 29,000 milliseconds. The default
     *            value is 29,000 milliseconds or 29 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withTimeoutInMillis(Integer timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
        return this;
    }

    /**
     * <p>
     * An API-specific tag group of related cached parameters. To be valid
     * values for <code>cacheKeyParameters</code>, these parameters must also be
     * specified for <a>Method</a> <code>requestParameters</code>.
     * </p>
     *
     * @return <p>
     *         An API-specific tag group of related cached parameters. To be
     *         valid values for <code>cacheKeyParameters</code>, these
     *         parameters must also be specified for <a>Method</a>
     *         <code>requestParameters</code>.
     *         </p>
     */
    public String getCacheNamespace() {
        return cacheNamespace;
    }

    /**
     * <p>
     * An API-specific tag group of related cached parameters. To be valid
     * values for <code>cacheKeyParameters</code>, these parameters must also be
     * specified for <a>Method</a> <code>requestParameters</code>.
     * </p>
     *
     * @param cacheNamespace <p>
     *            An API-specific tag group of related cached parameters. To be
     *            valid values for <code>cacheKeyParameters</code>, these
     *            parameters must also be specified for <a>Method</a>
     *            <code>requestParameters</code>.
     *            </p>
     */
    public void setCacheNamespace(String cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
    }

    /**
     * <p>
     * An API-specific tag group of related cached parameters. To be valid
     * values for <code>cacheKeyParameters</code>, these parameters must also be
     * specified for <a>Method</a> <code>requestParameters</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNamespace <p>
     *            An API-specific tag group of related cached parameters. To be
     *            valid values for <code>cacheKeyParameters</code>, these
     *            parameters must also be specified for <a>Method</a>
     *            <code>requestParameters</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withCacheNamespace(String cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
        return this;
    }

    /**
     * <p>
     * A list of request parameters whose values API Gateway caches. To be valid
     * values for <code>cacheKeyParameters</code>, these parameters must also be
     * specified for <a>Method</a> <code>requestParameters</code>.
     * </p>
     *
     * @return <p>
     *         A list of request parameters whose values API Gateway caches. To
     *         be valid values for <code>cacheKeyParameters</code>, these
     *         parameters must also be specified for <a>Method</a>
     *         <code>requestParameters</code>.
     *         </p>
     */
    public java.util.List<String> getCacheKeyParameters() {
        return cacheKeyParameters;
    }

    /**
     * <p>
     * A list of request parameters whose values API Gateway caches. To be valid
     * values for <code>cacheKeyParameters</code>, these parameters must also be
     * specified for <a>Method</a> <code>requestParameters</code>.
     * </p>
     *
     * @param cacheKeyParameters <p>
     *            A list of request parameters whose values API Gateway caches.
     *            To be valid values for <code>cacheKeyParameters</code>, these
     *            parameters must also be specified for <a>Method</a>
     *            <code>requestParameters</code>.
     *            </p>
     */
    public void setCacheKeyParameters(java.util.Collection<String> cacheKeyParameters) {
        if (cacheKeyParameters == null) {
            this.cacheKeyParameters = null;
            return;
        }

        this.cacheKeyParameters = new java.util.ArrayList<String>(cacheKeyParameters);
    }

    /**
     * <p>
     * A list of request parameters whose values API Gateway caches. To be valid
     * values for <code>cacheKeyParameters</code>, these parameters must also be
     * specified for <a>Method</a> <code>requestParameters</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheKeyParameters <p>
     *            A list of request parameters whose values API Gateway caches.
     *            To be valid values for <code>cacheKeyParameters</code>, these
     *            parameters must also be specified for <a>Method</a>
     *            <code>requestParameters</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withCacheKeyParameters(String... cacheKeyParameters) {
        if (getCacheKeyParameters() == null) {
            this.cacheKeyParameters = new java.util.ArrayList<String>(cacheKeyParameters.length);
        }
        for (String value : cacheKeyParameters) {
            this.cacheKeyParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of request parameters whose values API Gateway caches. To be valid
     * values for <code>cacheKeyParameters</code>, these parameters must also be
     * specified for <a>Method</a> <code>requestParameters</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheKeyParameters <p>
     *            A list of request parameters whose values API Gateway caches.
     *            To be valid values for <code>cacheKeyParameters</code>, these
     *            parameters must also be specified for <a>Method</a>
     *            <code>requestParameters</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withCacheKeyParameters(java.util.Collection<String> cacheKeyParameters) {
        setCacheKeyParameters(cacheKeyParameters);
        return this;
    }

    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example: Get integration responses of a method</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns <code>200 OK</code> status and a payload
     * as follows:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
     * >Creating an API</a> </div>
     *
     * @return <p>
     *         Specifies the integration's responses.
     *         </p>
     *         <div class="remarks">
     *         <p/>
     *         <h4>Example: Get integration responses of a method</h4>
     *         <h5>Request</h5>
     *         <p/>
     * 
     *         <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     *         <h5>Response</h5>
     *         <p>
     *         The successful response returns <code>200 OK</code> status and a
     *         payload as follows:
     *         </p>
     * 
     *         <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     *         <p/>
     *         </div> <div class="seeAlso"> <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
     *         >Creating an API</a> </div>
     */
    public java.util.Map<String, IntegrationResponse> getIntegrationResponses() {
        return integrationResponses;
    }

    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example: Get integration responses of a method</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns <code>200 OK</code> status and a payload
     * as follows:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
     * >Creating an API</a> </div>
     *
     * @param integrationResponses <p>
     *            Specifies the integration's responses.
     *            </p>
     *            <div class="remarks">
     *            <p/>
     *            <h4>Example: Get integration responses of a method</h4>
     *            <h5>Request</h5>
     *            <p/>
     * 
     *            <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     *            <h5>Response</h5>
     *            <p>
     *            The successful response returns <code>200 OK</code> status and
     *            a payload as follows:
     *            </p>
     * 
     *            <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     *            <p/>
     *            </div> <div class="seeAlso"> <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
     *            >Creating an API</a> </div>
     */
    public void setIntegrationResponses(
            java.util.Map<String, IntegrationResponse> integrationResponses) {
        this.integrationResponses = integrationResponses;
    }

    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example: Get integration responses of a method</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns <code>200 OK</code> status and a payload
     * as follows:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
     * >Creating an API</a> </div>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param integrationResponses <p>
     *            Specifies the integration's responses.
     *            </p>
     *            <div class="remarks">
     *            <p/>
     *            <h4>Example: Get integration responses of a method</h4>
     *            <h5>Request</h5>
     *            <p/>
     * 
     *            <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     *            <h5>Response</h5>
     *            <p>
     *            The successful response returns <code>200 OK</code> status and
     *            a payload as follows:
     *            </p>
     * 
     *            <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     *            <p/>
     *            </div> <div class="seeAlso"> <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
     *            >Creating an API</a> </div>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration withIntegrationResponses(
            java.util.Map<String, IntegrationResponse> integrationResponses) {
        this.integrationResponses = integrationResponses;
        return this;
    }

    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example: Get integration responses of a method</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns <code>200 OK</code> status and a payload
     * as follows:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
     * >Creating an API</a> </div>
     * <p>
     * The method adds a new key-value pair into integrationResponses parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into integrationResponses.
     * @param value The corresponding value of the entry to be added into
     *            integrationResponses.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Integration addintegrationResponsesEntry(String key, IntegrationResponse value) {
        if (null == this.integrationResponses) {
            this.integrationResponses = new java.util.HashMap<String, IntegrationResponse>();
        }
        if (this.integrationResponses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.integrationResponses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into integrationResponses.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Integration clearintegrationResponsesEntries() {
        this.integrationResponses = null;
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getHttpMethod() != null)
            sb.append("httpMethod: " + getHttpMethod() + ",");
        if (getUri() != null)
            sb.append("uri: " + getUri() + ",");
        if (getConnectionType() != null)
            sb.append("connectionType: " + getConnectionType() + ",");
        if (getConnectionId() != null)
            sb.append("connectionId: " + getConnectionId() + ",");
        if (getCredentials() != null)
            sb.append("credentials: " + getCredentials() + ",");
        if (getRequestParameters() != null)
            sb.append("requestParameters: " + getRequestParameters() + ",");
        if (getRequestTemplates() != null)
            sb.append("requestTemplates: " + getRequestTemplates() + ",");
        if (getPassthroughBehavior() != null)
            sb.append("passthroughBehavior: " + getPassthroughBehavior() + ",");
        if (getContentHandling() != null)
            sb.append("contentHandling: " + getContentHandling() + ",");
        if (getTimeoutInMillis() != null)
            sb.append("timeoutInMillis: " + getTimeoutInMillis() + ",");
        if (getCacheNamespace() != null)
            sb.append("cacheNamespace: " + getCacheNamespace() + ",");
        if (getCacheKeyParameters() != null)
            sb.append("cacheKeyParameters: " + getCacheKeyParameters() + ",");
        if (getIntegrationResponses() != null)
            sb.append("integrationResponses: " + getIntegrationResponses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode
                + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode
                + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode
                + ((getRequestTemplates() == null) ? 0 : getRequestTemplates().hashCode());
        hashCode = prime * hashCode
                + ((getPassthroughBehavior() == null) ? 0 : getPassthroughBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getContentHandling() == null) ? 0 : getContentHandling().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutInMillis() == null) ? 0 : getTimeoutInMillis().hashCode());
        hashCode = prime * hashCode
                + ((getCacheNamespace() == null) ? 0 : getCacheNamespace().hashCode());
        hashCode = prime * hashCode
                + ((getCacheKeyParameters() == null) ? 0 : getCacheKeyParameters().hashCode());
        hashCode = prime * hashCode
                + ((getIntegrationResponses() == null) ? 0 : getIntegrationResponses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Integration == false)
            return false;
        Integration other = (Integration) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null
                && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null
                && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null
                && other.getCredentials().equals(this.getCredentials()) == false)
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
        if (other.getPassthroughBehavior() == null ^ this.getPassthroughBehavior() == null)
            return false;
        if (other.getPassthroughBehavior() != null
                && other.getPassthroughBehavior().equals(this.getPassthroughBehavior()) == false)
            return false;
        if (other.getContentHandling() == null ^ this.getContentHandling() == null)
            return false;
        if (other.getContentHandling() != null
                && other.getContentHandling().equals(this.getContentHandling()) == false)
            return false;
        if (other.getTimeoutInMillis() == null ^ this.getTimeoutInMillis() == null)
            return false;
        if (other.getTimeoutInMillis() != null
                && other.getTimeoutInMillis().equals(this.getTimeoutInMillis()) == false)
            return false;
        if (other.getCacheNamespace() == null ^ this.getCacheNamespace() == null)
            return false;
        if (other.getCacheNamespace() != null
                && other.getCacheNamespace().equals(this.getCacheNamespace()) == false)
            return false;
        if (other.getCacheKeyParameters() == null ^ this.getCacheKeyParameters() == null)
            return false;
        if (other.getCacheKeyParameters() != null
                && other.getCacheKeyParameters().equals(this.getCacheKeyParameters()) == false)
            return false;
        if (other.getIntegrationResponses() == null ^ this.getIntegrationResponses() == null)
            return false;
        if (other.getIntegrationResponses() != null
                && other.getIntegrationResponses().equals(this.getIntegrationResponses()) == false)
            return false;
        return true;
    }
}
