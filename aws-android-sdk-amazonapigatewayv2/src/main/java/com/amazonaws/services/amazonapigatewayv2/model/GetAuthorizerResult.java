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

public class GetAuthorizerResult implements Serializable {
    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to
     * invoke the authorizer. To specify an IAM role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null. Supported only for
     * REQUEST authorizers.
     * </p>
     */
    private String authorizerCredentialsArn;

    /**
     * <p>
     * The authorizer identifier.
     * </p>
     */
    private String authorizerId;

    /**
     * <p>
     * Authorizer caching is not currently supported. Don't specify this value
     * for authorizers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     */
    private Integer authorizerResultTtlInSeconds;

    /**
     * <p>
     * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda
     * function using incoming request parameters. For HTTP APIs, specify JWT to
     * use JSON Web Tokens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REQUEST, JWT
     */
    private String authorizerType;

    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST
     * authorizers, this must be a well-formed Lambda function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:
     * lambda
     * :us-west-2:<replaceable>{account_id}</replaceable>:function:<replaceable
     * >{lambda_function_name}</replaceable>/invocations. In general, the URI
     * has this form:
     * arn:aws:apigateway:<replaceable>{region}</replaceable>:lambda
     * :path/<replaceable>{service_api}</replaceable> , where
     * <replaceable></replaceable>{region} is the same as the region hosting the
     * Lambda function, path indicates that the remaining substring in the URI
     * should be treated as the path to the resource, including the initial /.
     * For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations. Supported only for
     * REQUEST authorizers.
     * </p>
     */
    private String authorizerUri;

    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For a REQUEST authorizer, this is optional. The value is a set of one or
     * more mapping expressions of the specified request parameters. Currently,
     * the identity source can be headers, query string parameters, stage
     * variables, and context parameters. For example, if an Auth header and a
     * Name query string parameter are defined as identity sources, this value
     * is route.request.header.Auth, route.request.querystring.Name. These
     * parameters will be used to perform runtime validation for Lambda-based
     * authorizers by verifying all of the identity-related request parameters
     * are present in the request, not null, and non-empty. Only when this is
     * true does the authorizer invoke the authorizer Lambda function.
     * Otherwise, it returns a 401 Unauthorized response without calling the
     * Lambda function.
     * </p>
     * <p>
     * For JWT, a single entry that specifies where to extract the JSON Web
     * Token (JWT) from inbound requests. Currently only header-based and query
     * parameter-based selections are supported, for example
     * "$request.header.Authorization".
     * </p>
     */
    private java.util.List<String> identitySource;

    /**
     * <p>
     * The validation expression does not apply to the REQUEST authorizer.
     * </p>
     */
    private String identityValidationExpression;

    /**
     * <p>
     * Represents the configuration of a JWT authorizer. Required for the JWT
     * authorizer type. Supported only for HTTP APIs.
     * </p>
     */
    private JWTConfiguration jwtConfiguration;

    /**
     * <p>
     * The name of the authorizer.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to
     * invoke the authorizer. To specify an IAM role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null. Supported only for
     * REQUEST authorizers.
     * </p>
     *
     * @return <p>
     *         Specifies the required credentials as an IAM role for API Gateway
     *         to invoke the authorizer. To specify an IAM role for API Gateway
     *         to assume, use the role's Amazon Resource Name (ARN). To use
     *         resource-based permissions on the Lambda function, specify null.
     *         Supported only for REQUEST authorizers.
     *         </p>
     */
    public String getAuthorizerCredentialsArn() {
        return authorizerCredentialsArn;
    }

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to
     * invoke the authorizer. To specify an IAM role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null. Supported only for
     * REQUEST authorizers.
     * </p>
     *
     * @param authorizerCredentialsArn <p>
     *            Specifies the required credentials as an IAM role for API
     *            Gateway to invoke the authorizer. To specify an IAM role for
     *            API Gateway to assume, use the role's Amazon Resource Name
     *            (ARN). To use resource-based permissions on the Lambda
     *            function, specify null. Supported only for REQUEST
     *            authorizers.
     *            </p>
     */
    public void setAuthorizerCredentialsArn(String authorizerCredentialsArn) {
        this.authorizerCredentialsArn = authorizerCredentialsArn;
    }

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to
     * invoke the authorizer. To specify an IAM role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null. Supported only for
     * REQUEST authorizers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerCredentialsArn <p>
     *            Specifies the required credentials as an IAM role for API
     *            Gateway to invoke the authorizer. To specify an IAM role for
     *            API Gateway to assume, use the role's Amazon Resource Name
     *            (ARN). To use resource-based permissions on the Lambda
     *            function, specify null. Supported only for REQUEST
     *            authorizers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withAuthorizerCredentialsArn(String authorizerCredentialsArn) {
        this.authorizerCredentialsArn = authorizerCredentialsArn;
        return this;
    }

    /**
     * <p>
     * The authorizer identifier.
     * </p>
     *
     * @return <p>
     *         The authorizer identifier.
     *         </p>
     */
    public String getAuthorizerId() {
        return authorizerId;
    }

    /**
     * <p>
     * The authorizer identifier.
     * </p>
     *
     * @param authorizerId <p>
     *            The authorizer identifier.
     *            </p>
     */
    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * <p>
     * The authorizer identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerId <p>
     *            The authorizer identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    /**
     * <p>
     * Authorizer caching is not currently supported. Don't specify this value
     * for authorizers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     *
     * @return <p>
     *         Authorizer caching is not currently supported. Don't specify this
     *         value for authorizers.
     *         </p>
     */
    public Integer getAuthorizerResultTtlInSeconds() {
        return authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * Authorizer caching is not currently supported. Don't specify this value
     * for authorizers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     *
     * @param authorizerResultTtlInSeconds <p>
     *            Authorizer caching is not currently supported. Don't specify
     *            this value for authorizers.
     *            </p>
     */
    public void setAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * Authorizer caching is not currently supported. Don't specify this value
     * for authorizers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     *
     * @param authorizerResultTtlInSeconds <p>
     *            Authorizer caching is not currently supported. Don't specify
     *            this value for authorizers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
        return this;
    }

    /**
     * <p>
     * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda
     * function using incoming request parameters. For HTTP APIs, specify JWT to
     * use JSON Web Tokens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REQUEST, JWT
     *
     * @return <p>
     *         The authorizer type. For WebSocket APIs, specify REQUEST for a
     *         Lambda function using incoming request parameters. For HTTP APIs,
     *         specify JWT to use JSON Web Tokens.
     *         </p>
     * @see AuthorizerType
     */
    public String getAuthorizerType() {
        return authorizerType;
    }

    /**
     * <p>
     * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda
     * function using incoming request parameters. For HTTP APIs, specify JWT to
     * use JSON Web Tokens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REQUEST, JWT
     *
     * @param authorizerType <p>
     *            The authorizer type. For WebSocket APIs, specify REQUEST for a
     *            Lambda function using incoming request parameters. For HTTP
     *            APIs, specify JWT to use JSON Web Tokens.
     *            </p>
     * @see AuthorizerType
     */
    public void setAuthorizerType(String authorizerType) {
        this.authorizerType = authorizerType;
    }

    /**
     * <p>
     * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda
     * function using incoming request parameters. For HTTP APIs, specify JWT to
     * use JSON Web Tokens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REQUEST, JWT
     *
     * @param authorizerType <p>
     *            The authorizer type. For WebSocket APIs, specify REQUEST for a
     *            Lambda function using incoming request parameters. For HTTP
     *            APIs, specify JWT to use JSON Web Tokens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizerType
     */
    public GetAuthorizerResult withAuthorizerType(String authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }

    /**
     * <p>
     * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda
     * function using incoming request parameters. For HTTP APIs, specify JWT to
     * use JSON Web Tokens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REQUEST, JWT
     *
     * @param authorizerType <p>
     *            The authorizer type. For WebSocket APIs, specify REQUEST for a
     *            Lambda function using incoming request parameters. For HTTP
     *            APIs, specify JWT to use JSON Web Tokens.
     *            </p>
     * @see AuthorizerType
     */
    public void setAuthorizerType(AuthorizerType authorizerType) {
        this.authorizerType = authorizerType.toString();
    }

    /**
     * <p>
     * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda
     * function using incoming request parameters. For HTTP APIs, specify JWT to
     * use JSON Web Tokens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REQUEST, JWT
     *
     * @param authorizerType <p>
     *            The authorizer type. For WebSocket APIs, specify REQUEST for a
     *            Lambda function using incoming request parameters. For HTTP
     *            APIs, specify JWT to use JSON Web Tokens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizerType
     */
    public GetAuthorizerResult withAuthorizerType(AuthorizerType authorizerType) {
        this.authorizerType = authorizerType.toString();
        return this;
    }

    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST
     * authorizers, this must be a well-formed Lambda function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:
     * lambda
     * :us-west-2:<replaceable>{account_id}</replaceable>:function:<replaceable
     * >{lambda_function_name}</replaceable>/invocations. In general, the URI
     * has this form:
     * arn:aws:apigateway:<replaceable>{region}</replaceable>:lambda
     * :path/<replaceable>{service_api}</replaceable> , where
     * <replaceable></replaceable>{region} is the same as the region hosting the
     * Lambda function, path indicates that the remaining substring in the URI
     * should be treated as the path to the resource, including the initial /.
     * For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations. Supported only for
     * REQUEST authorizers.
     * </p>
     *
     * @return <p>
     *         The authorizer's Uniform Resource Identifier (URI). ForREQUEST
     *         authorizers, this must be a well-formed Lambda function URI, for
     *         example,
     *         arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions
     *         /arn:
     *         aws:lambda:us-west-2:<replaceable>{account_id}</replaceable>:
     *         function
     *         :<replaceable>{lambda_function_name}</replaceable>/invocations.
     *         In general, the URI has this form:
     *         arn:aws:apigateway:<replaceable
     *         >{region}</replaceable>:lambda:path
     *         /<replaceable>{service_api}</replaceable> , where
     *         <replaceable></replaceable>{region} is the same as the region
     *         hosting the Lambda function, path indicates that the remaining
     *         substring in the URI should be treated as the path to the
     *         resource, including the initial /. For Lambda functions, this is
     *         usually of the form
     *         /2015-03-31/functions/[FunctionARN]/invocations. Supported only
     *         for REQUEST authorizers.
     *         </p>
     */
    public String getAuthorizerUri() {
        return authorizerUri;
    }

    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST
     * authorizers, this must be a well-formed Lambda function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:
     * lambda
     * :us-west-2:<replaceable>{account_id}</replaceable>:function:<replaceable
     * >{lambda_function_name}</replaceable>/invocations. In general, the URI
     * has this form:
     * arn:aws:apigateway:<replaceable>{region}</replaceable>:lambda
     * :path/<replaceable>{service_api}</replaceable> , where
     * <replaceable></replaceable>{region} is the same as the region hosting the
     * Lambda function, path indicates that the remaining substring in the URI
     * should be treated as the path to the resource, including the initial /.
     * For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations. Supported only for
     * REQUEST authorizers.
     * </p>
     *
     * @param authorizerUri <p>
     *            The authorizer's Uniform Resource Identifier (URI). ForREQUEST
     *            authorizers, this must be a well-formed Lambda function URI,
     *            for example,
     *            arn:aws:apigateway:us-west-2:lambda:path/2015-03-31
     *            /functions/arn
     *            :aws:lambda:us-west-2:<replaceable>{account_id}</
     *            replaceable>:function
     *            :<replaceable>{lambda_function_name}</replaceable
     *            >/invocations. In general, the URI has this form:
     *            arn:aws:apigateway
     *            :<replaceable>{region}</replaceable>:lambda:path
     *            /<replaceable>{service_api}</replaceable> , where
     *            <replaceable></replaceable>{region} is the same as the region
     *            hosting the Lambda function, path indicates that the remaining
     *            substring in the URI should be treated as the path to the
     *            resource, including the initial /. For Lambda functions, this
     *            is usually of the form
     *            /2015-03-31/functions/[FunctionARN]/invocations. Supported
     *            only for REQUEST authorizers.
     *            </p>
     */
    public void setAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
    }

    /**
     * <p>
     * The authorizer's Uniform Resource Identifier (URI). ForREQUEST
     * authorizers, this must be a well-formed Lambda function URI, for example,
     * arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:
     * lambda
     * :us-west-2:<replaceable>{account_id}</replaceable>:function:<replaceable
     * >{lambda_function_name}</replaceable>/invocations. In general, the URI
     * has this form:
     * arn:aws:apigateway:<replaceable>{region}</replaceable>:lambda
     * :path/<replaceable>{service_api}</replaceable> , where
     * <replaceable></replaceable>{region} is the same as the region hosting the
     * Lambda function, path indicates that the remaining substring in the URI
     * should be treated as the path to the resource, including the initial /.
     * For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations. Supported only for
     * REQUEST authorizers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerUri <p>
     *            The authorizer's Uniform Resource Identifier (URI). ForREQUEST
     *            authorizers, this must be a well-formed Lambda function URI,
     *            for example,
     *            arn:aws:apigateway:us-west-2:lambda:path/2015-03-31
     *            /functions/arn
     *            :aws:lambda:us-west-2:<replaceable>{account_id}</
     *            replaceable>:function
     *            :<replaceable>{lambda_function_name}</replaceable
     *            >/invocations. In general, the URI has this form:
     *            arn:aws:apigateway
     *            :<replaceable>{region}</replaceable>:lambda:path
     *            /<replaceable>{service_api}</replaceable> , where
     *            <replaceable></replaceable>{region} is the same as the region
     *            hosting the Lambda function, path indicates that the remaining
     *            substring in the URI should be treated as the path to the
     *            resource, including the initial /. For Lambda functions, this
     *            is usually of the form
     *            /2015-03-31/functions/[FunctionARN]/invocations. Supported
     *            only for REQUEST authorizers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
        return this;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For a REQUEST authorizer, this is optional. The value is a set of one or
     * more mapping expressions of the specified request parameters. Currently,
     * the identity source can be headers, query string parameters, stage
     * variables, and context parameters. For example, if an Auth header and a
     * Name query string parameter are defined as identity sources, this value
     * is route.request.header.Auth, route.request.querystring.Name. These
     * parameters will be used to perform runtime validation for Lambda-based
     * authorizers by verifying all of the identity-related request parameters
     * are present in the request, not null, and non-empty. Only when this is
     * true does the authorizer invoke the authorizer Lambda function.
     * Otherwise, it returns a 401 Unauthorized response without calling the
     * Lambda function.
     * </p>
     * <p>
     * For JWT, a single entry that specifies where to extract the JSON Web
     * Token (JWT) from inbound requests. Currently only header-based and query
     * parameter-based selections are supported, for example
     * "$request.header.Authorization".
     * </p>
     *
     * @return <p>
     *         The identity source for which authorization is requested.
     *         </p>
     *         <p>
     *         For a REQUEST authorizer, this is optional. The value is a set of
     *         one or more mapping expressions of the specified request
     *         parameters. Currently, the identity source can be headers, query
     *         string parameters, stage variables, and context parameters. For
     *         example, if an Auth header and a Name query string parameter are
     *         defined as identity sources, this value is
     *         route.request.header.Auth, route.request.querystring.Name. These
     *         parameters will be used to perform runtime validation for
     *         Lambda-based authorizers by verifying all of the identity-related
     *         request parameters are present in the request, not null, and
     *         non-empty. Only when this is true does the authorizer invoke the
     *         authorizer Lambda function. Otherwise, it returns a 401
     *         Unauthorized response without calling the Lambda function.
     *         </p>
     *         <p>
     *         For JWT, a single entry that specifies where to extract the JSON
     *         Web Token (JWT) from inbound requests. Currently only
     *         header-based and query parameter-based selections are supported,
     *         for example "$request.header.Authorization".
     *         </p>
     */
    public java.util.List<String> getIdentitySource() {
        return identitySource;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For a REQUEST authorizer, this is optional. The value is a set of one or
     * more mapping expressions of the specified request parameters. Currently,
     * the identity source can be headers, query string parameters, stage
     * variables, and context parameters. For example, if an Auth header and a
     * Name query string parameter are defined as identity sources, this value
     * is route.request.header.Auth, route.request.querystring.Name. These
     * parameters will be used to perform runtime validation for Lambda-based
     * authorizers by verifying all of the identity-related request parameters
     * are present in the request, not null, and non-empty. Only when this is
     * true does the authorizer invoke the authorizer Lambda function.
     * Otherwise, it returns a 401 Unauthorized response without calling the
     * Lambda function.
     * </p>
     * <p>
     * For JWT, a single entry that specifies where to extract the JSON Web
     * Token (JWT) from inbound requests. Currently only header-based and query
     * parameter-based selections are supported, for example
     * "$request.header.Authorization".
     * </p>
     *
     * @param identitySource <p>
     *            The identity source for which authorization is requested.
     *            </p>
     *            <p>
     *            For a REQUEST authorizer, this is optional. The value is a set
     *            of one or more mapping expressions of the specified request
     *            parameters. Currently, the identity source can be headers,
     *            query string parameters, stage variables, and context
     *            parameters. For example, if an Auth header and a Name query
     *            string parameter are defined as identity sources, this value
     *            is route.request.header.Auth, route.request.querystring.Name.
     *            These parameters will be used to perform runtime validation
     *            for Lambda-based authorizers by verifying all of the
     *            identity-related request parameters are present in the
     *            request, not null, and non-empty. Only when this is true does
     *            the authorizer invoke the authorizer Lambda function.
     *            Otherwise, it returns a 401 Unauthorized response without
     *            calling the Lambda function.
     *            </p>
     *            <p>
     *            For JWT, a single entry that specifies where to extract the
     *            JSON Web Token (JWT) from inbound requests. Currently only
     *            header-based and query parameter-based selections are
     *            supported, for example "$request.header.Authorization".
     *            </p>
     */
    public void setIdentitySource(java.util.Collection<String> identitySource) {
        if (identitySource == null) {
            this.identitySource = null;
            return;
        }

        this.identitySource = new java.util.ArrayList<String>(identitySource);
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For a REQUEST authorizer, this is optional. The value is a set of one or
     * more mapping expressions of the specified request parameters. Currently,
     * the identity source can be headers, query string parameters, stage
     * variables, and context parameters. For example, if an Auth header and a
     * Name query string parameter are defined as identity sources, this value
     * is route.request.header.Auth, route.request.querystring.Name. These
     * parameters will be used to perform runtime validation for Lambda-based
     * authorizers by verifying all of the identity-related request parameters
     * are present in the request, not null, and non-empty. Only when this is
     * true does the authorizer invoke the authorizer Lambda function.
     * Otherwise, it returns a 401 Unauthorized response without calling the
     * Lambda function.
     * </p>
     * <p>
     * For JWT, a single entry that specifies where to extract the JSON Web
     * Token (JWT) from inbound requests. Currently only header-based and query
     * parameter-based selections are supported, for example
     * "$request.header.Authorization".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identitySource <p>
     *            The identity source for which authorization is requested.
     *            </p>
     *            <p>
     *            For a REQUEST authorizer, this is optional. The value is a set
     *            of one or more mapping expressions of the specified request
     *            parameters. Currently, the identity source can be headers,
     *            query string parameters, stage variables, and context
     *            parameters. For example, if an Auth header and a Name query
     *            string parameter are defined as identity sources, this value
     *            is route.request.header.Auth, route.request.querystring.Name.
     *            These parameters will be used to perform runtime validation
     *            for Lambda-based authorizers by verifying all of the
     *            identity-related request parameters are present in the
     *            request, not null, and non-empty. Only when this is true does
     *            the authorizer invoke the authorizer Lambda function.
     *            Otherwise, it returns a 401 Unauthorized response without
     *            calling the Lambda function.
     *            </p>
     *            <p>
     *            For JWT, a single entry that specifies where to extract the
     *            JSON Web Token (JWT) from inbound requests. Currently only
     *            header-based and query parameter-based selections are
     *            supported, for example "$request.header.Authorization".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withIdentitySource(String... identitySource) {
        if (getIdentitySource() == null) {
            this.identitySource = new java.util.ArrayList<String>(identitySource.length);
        }
        for (String value : identitySource) {
            this.identitySource.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * </p>
     * <p>
     * For a REQUEST authorizer, this is optional. The value is a set of one or
     * more mapping expressions of the specified request parameters. Currently,
     * the identity source can be headers, query string parameters, stage
     * variables, and context parameters. For example, if an Auth header and a
     * Name query string parameter are defined as identity sources, this value
     * is route.request.header.Auth, route.request.querystring.Name. These
     * parameters will be used to perform runtime validation for Lambda-based
     * authorizers by verifying all of the identity-related request parameters
     * are present in the request, not null, and non-empty. Only when this is
     * true does the authorizer invoke the authorizer Lambda function.
     * Otherwise, it returns a 401 Unauthorized response without calling the
     * Lambda function.
     * </p>
     * <p>
     * For JWT, a single entry that specifies where to extract the JSON Web
     * Token (JWT) from inbound requests. Currently only header-based and query
     * parameter-based selections are supported, for example
     * "$request.header.Authorization".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identitySource <p>
     *            The identity source for which authorization is requested.
     *            </p>
     *            <p>
     *            For a REQUEST authorizer, this is optional. The value is a set
     *            of one or more mapping expressions of the specified request
     *            parameters. Currently, the identity source can be headers,
     *            query string parameters, stage variables, and context
     *            parameters. For example, if an Auth header and a Name query
     *            string parameter are defined as identity sources, this value
     *            is route.request.header.Auth, route.request.querystring.Name.
     *            These parameters will be used to perform runtime validation
     *            for Lambda-based authorizers by verifying all of the
     *            identity-related request parameters are present in the
     *            request, not null, and non-empty. Only when this is true does
     *            the authorizer invoke the authorizer Lambda function.
     *            Otherwise, it returns a 401 Unauthorized response without
     *            calling the Lambda function.
     *            </p>
     *            <p>
     *            For JWT, a single entry that specifies where to extract the
     *            JSON Web Token (JWT) from inbound requests. Currently only
     *            header-based and query parameter-based selections are
     *            supported, for example "$request.header.Authorization".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withIdentitySource(java.util.Collection<String> identitySource) {
        setIdentitySource(identitySource);
        return this;
    }

    /**
     * <p>
     * The validation expression does not apply to the REQUEST authorizer.
     * </p>
     *
     * @return <p>
     *         The validation expression does not apply to the REQUEST
     *         authorizer.
     *         </p>
     */
    public String getIdentityValidationExpression() {
        return identityValidationExpression;
    }

    /**
     * <p>
     * The validation expression does not apply to the REQUEST authorizer.
     * </p>
     *
     * @param identityValidationExpression <p>
     *            The validation expression does not apply to the REQUEST
     *            authorizer.
     *            </p>
     */
    public void setIdentityValidationExpression(String identityValidationExpression) {
        this.identityValidationExpression = identityValidationExpression;
    }

    /**
     * <p>
     * The validation expression does not apply to the REQUEST authorizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityValidationExpression <p>
     *            The validation expression does not apply to the REQUEST
     *            authorizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withIdentityValidationExpression(String identityValidationExpression) {
        this.identityValidationExpression = identityValidationExpression;
        return this;
    }

    /**
     * <p>
     * Represents the configuration of a JWT authorizer. Required for the JWT
     * authorizer type. Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         Represents the configuration of a JWT authorizer. Required for
     *         the JWT authorizer type. Supported only for HTTP APIs.
     *         </p>
     */
    public JWTConfiguration getJwtConfiguration() {
        return jwtConfiguration;
    }

    /**
     * <p>
     * Represents the configuration of a JWT authorizer. Required for the JWT
     * authorizer type. Supported only for HTTP APIs.
     * </p>
     *
     * @param jwtConfiguration <p>
     *            Represents the configuration of a JWT authorizer. Required for
     *            the JWT authorizer type. Supported only for HTTP APIs.
     *            </p>
     */
    public void setJwtConfiguration(JWTConfiguration jwtConfiguration) {
        this.jwtConfiguration = jwtConfiguration;
    }

    /**
     * <p>
     * Represents the configuration of a JWT authorizer. Required for the JWT
     * authorizer type. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jwtConfiguration <p>
     *            Represents the configuration of a JWT authorizer. Required for
     *            the JWT authorizer type. Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withJwtConfiguration(JWTConfiguration jwtConfiguration) {
        this.jwtConfiguration = jwtConfiguration;
        return this;
    }

    /**
     * <p>
     * The name of the authorizer.
     * </p>
     *
     * @return <p>
     *         The name of the authorizer.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the authorizer.
     * </p>
     *
     * @param name <p>
     *            The name of the authorizer.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the authorizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the authorizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withName(String name) {
        this.name = name;
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
        if (getAuthorizerCredentialsArn() != null)
            sb.append("AuthorizerCredentialsArn: " + getAuthorizerCredentialsArn() + ",");
        if (getAuthorizerId() != null)
            sb.append("AuthorizerId: " + getAuthorizerId() + ",");
        if (getAuthorizerResultTtlInSeconds() != null)
            sb.append("AuthorizerResultTtlInSeconds: " + getAuthorizerResultTtlInSeconds() + ",");
        if (getAuthorizerType() != null)
            sb.append("AuthorizerType: " + getAuthorizerType() + ",");
        if (getAuthorizerUri() != null)
            sb.append("AuthorizerUri: " + getAuthorizerUri() + ",");
        if (getIdentitySource() != null)
            sb.append("IdentitySource: " + getIdentitySource() + ",");
        if (getIdentityValidationExpression() != null)
            sb.append("IdentityValidationExpression: " + getIdentityValidationExpression() + ",");
        if (getJwtConfiguration() != null)
            sb.append("JwtConfiguration: " + getJwtConfiguration() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAuthorizerCredentialsArn() == null) ? 0 : getAuthorizerCredentialsArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAuthorizerId() == null) ? 0 : getAuthorizerId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorizerResultTtlInSeconds() == null) ? 0
                        : getAuthorizerResultTtlInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getAuthorizerType() == null) ? 0 : getAuthorizerType().hashCode());
        hashCode = prime * hashCode
                + ((getAuthorizerUri() == null) ? 0 : getAuthorizerUri().hashCode());
        hashCode = prime * hashCode
                + ((getIdentitySource() == null) ? 0 : getIdentitySource().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentityValidationExpression() == null) ? 0
                        : getIdentityValidationExpression().hashCode());
        hashCode = prime * hashCode
                + ((getJwtConfiguration() == null) ? 0 : getJwtConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizerResult == false)
            return false;
        GetAuthorizerResult other = (GetAuthorizerResult) obj;

        if (other.getAuthorizerCredentialsArn() == null
                ^ this.getAuthorizerCredentialsArn() == null)
            return false;
        if (other.getAuthorizerCredentialsArn() != null
                && other.getAuthorizerCredentialsArn().equals(this.getAuthorizerCredentialsArn()) == false)
            return false;
        if (other.getAuthorizerId() == null ^ this.getAuthorizerId() == null)
            return false;
        if (other.getAuthorizerId() != null
                && other.getAuthorizerId().equals(this.getAuthorizerId()) == false)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() == null
                ^ this.getAuthorizerResultTtlInSeconds() == null)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() != null
                && other.getAuthorizerResultTtlInSeconds().equals(
                        this.getAuthorizerResultTtlInSeconds()) == false)
            return false;
        if (other.getAuthorizerType() == null ^ this.getAuthorizerType() == null)
            return false;
        if (other.getAuthorizerType() != null
                && other.getAuthorizerType().equals(this.getAuthorizerType()) == false)
            return false;
        if (other.getAuthorizerUri() == null ^ this.getAuthorizerUri() == null)
            return false;
        if (other.getAuthorizerUri() != null
                && other.getAuthorizerUri().equals(this.getAuthorizerUri()) == false)
            return false;
        if (other.getIdentitySource() == null ^ this.getIdentitySource() == null)
            return false;
        if (other.getIdentitySource() != null
                && other.getIdentitySource().equals(this.getIdentitySource()) == false)
            return false;
        if (other.getIdentityValidationExpression() == null
                ^ this.getIdentityValidationExpression() == null)
            return false;
        if (other.getIdentityValidationExpression() != null
                && other.getIdentityValidationExpression().equals(
                        this.getIdentityValidationExpression()) == false)
            return false;
        if (other.getJwtConfiguration() == null ^ this.getJwtConfiguration() == null)
            return false;
        if (other.getJwtConfiguration() != null
                && other.getJwtConfiguration().equals(this.getJwtConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
