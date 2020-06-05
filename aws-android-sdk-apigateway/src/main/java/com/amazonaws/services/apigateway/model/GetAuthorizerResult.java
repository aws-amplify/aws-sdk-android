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
 * Represents an authorization layer for methods. If enabled on a method, API
 * Gateway will activate the authorizer when a client calls the method.
 * </p>
 * <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-use-lambda-authorizer.html"
 * >Use Lambda Function as Authorizer</a> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-integrate-with-cognito.html"
 * >Use Cognito User Pool as Authorizer</a> </div>
 */
public class GetAuthorizerResult implements Serializable {
    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     */
    private String id;

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda
     * function using a single authorization token submitted in a custom header,
     * <code>REQUEST</code> for a Lambda function using incoming request
     * parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon
     * Cognito user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOKEN, REQUEST, COGNITO_USER_POOLS
     */
    private String type;

    /**
     * <p>
     * A list of the Amazon Cognito user pool ARNs for the
     * <code>COGNITO_USER_POOLS</code> authorizer. Each element is of this
     * format:
     * <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>
     * . For a <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is
     * not defined.
     * </p>
     */
    private java.util.List<String> providerARNs;

    /**
     * <p>
     * Optional customer-defined field, used in OpenAPI imports and exports
     * without functional impact.
     * </p>
     */
    private String authType;

    /**
     * <p>
     * Specifies the authorizer's Uniform Resource Identifier (URI). For
     * <code>TOKEN</code> or <code>REQUEST</code> authorizers, this must be a
     * well-formed Lambda function URI, for example,
     * <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     * . In general, the URI has this form
     * <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>, where
     * <code>{region}</code> is the same as the region hosting the Lambda
     * function, <code>path</code> indicates that the remaining substring in the
     * URI should be treated as the path to the resource, including the initial
     * <code>/</code>. For Lambda functions, this is usually of the form
     * <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     * </p>
     */
    private String authorizerUri;

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to
     * invoke the authorizer. To specify an IAM role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null.
     * </p>
     */
    private String authorizerCredentials;

    /**
     * <p>
     * The identity source for which authorization is requested.
     * <ul>
     * <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code>
     * authorizer, this is required and specifies the request header mapping
     * expression for the custom header holding the authorization token
     * submitted by the client. For example, if the token header name is
     * <code>Auth</code>, the header mapping expression is
     * <code>method.request.header.Auth</code>.</li>
     * <li>For the <code>REQUEST</code> authorizer, this is required when
     * authorization caching is enabled. The value is a comma-separated string
     * of one or more mapping expressions of the specified request parameters.
     * For example, if an <code>Auth</code> header, a <code>Name</code> query
     * string parameter are defined as identity sources, this value is
     * <code>method.request.header.Auth, method.request.querystring.Name</code>.
     * These parameters will be used to derive the authorization caching key and
     * to perform runtime validation of the <code>REQUEST</code> authorizer by
     * verifying all of the identity-related request parameters are present, not
     * null and non-empty. Only when this is true does the authorizer invoke the
     * authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     * response without calling the Lambda function. The valid value is a string
     * of comma-separated mapping expressions of the specified request
     * parameters. When the authorization caching is not enabled, this property
     * is optional.</li>
     * </ul>
     * </p>
     */
    private String identitySource;

    /**
     * <p>
     * A validation expression for the incoming identity token. For
     * <code>TOKEN</code> authorizers, this value is a regular expression. For
     * <code>COGNITO_USER_POOLS</code> authorizers, API Gateway will match the
     * <code>aud</code> field of the incoming token from the client against the
     * specified regular expression. It will invoke the authorizer's Lambda
     * function when there is a match. Otherwise, it will return a 401
     * Unauthorized response without calling the Lambda function. The validation
     * expression does not apply to the <code>REQUEST</code> authorizer.
     * </p>
     */
    private String identityValidationExpression;

    /**
     * <p>
     * The TTL in seconds of cached authorizer results. If it equals 0,
     * authorization caching is disabled. If it is greater than 0, API Gateway
     * will cache authorizer responses. If this field is not set, the default
     * value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     */
    private Integer authorizerResultTtlInSeconds;

    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     *
     * @return <p>
     *         The identifier for the authorizer resource.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     *
     * @param id <p>
     *            The identifier for the authorizer resource.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier for the authorizer resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     *
     * @return <p>
     *         [Required] The name of the authorizer.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     *
     * @param name <p>
     *            [Required] The name of the authorizer.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            [Required] The name of the authorizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda
     * function using a single authorization token submitted in a custom header,
     * <code>REQUEST</code> for a Lambda function using incoming request
     * parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon
     * Cognito user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOKEN, REQUEST, COGNITO_USER_POOLS
     *
     * @return <p>
     *         The authorizer type. Valid values are <code>TOKEN</code> for a
     *         Lambda function using a single authorization token submitted in a
     *         custom header, <code>REQUEST</code> for a Lambda function using
     *         incoming request parameters, and <code>COGNITO_USER_POOLS</code>
     *         for using an Amazon Cognito user pool.
     *         </p>
     * @see AuthorizerType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda
     * function using a single authorization token submitted in a custom header,
     * <code>REQUEST</code> for a Lambda function using incoming request
     * parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon
     * Cognito user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOKEN, REQUEST, COGNITO_USER_POOLS
     *
     * @param type <p>
     *            The authorizer type. Valid values are <code>TOKEN</code> for a
     *            Lambda function using a single authorization token submitted
     *            in a custom header, <code>REQUEST</code> for a Lambda function
     *            using incoming request parameters, and
     *            <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito
     *            user pool.
     *            </p>
     * @see AuthorizerType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda
     * function using a single authorization token submitted in a custom header,
     * <code>REQUEST</code> for a Lambda function using incoming request
     * parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon
     * Cognito user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOKEN, REQUEST, COGNITO_USER_POOLS
     *
     * @param type <p>
     *            The authorizer type. Valid values are <code>TOKEN</code> for a
     *            Lambda function using a single authorization token submitted
     *            in a custom header, <code>REQUEST</code> for a Lambda function
     *            using incoming request parameters, and
     *            <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito
     *            user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizerType
     */
    public GetAuthorizerResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda
     * function using a single authorization token submitted in a custom header,
     * <code>REQUEST</code> for a Lambda function using incoming request
     * parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon
     * Cognito user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOKEN, REQUEST, COGNITO_USER_POOLS
     *
     * @param type <p>
     *            The authorizer type. Valid values are <code>TOKEN</code> for a
     *            Lambda function using a single authorization token submitted
     *            in a custom header, <code>REQUEST</code> for a Lambda function
     *            using incoming request parameters, and
     *            <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito
     *            user pool.
     *            </p>
     * @see AuthorizerType
     */
    public void setType(AuthorizerType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda
     * function using a single authorization token submitted in a custom header,
     * <code>REQUEST</code> for a Lambda function using incoming request
     * parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon
     * Cognito user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOKEN, REQUEST, COGNITO_USER_POOLS
     *
     * @param type <p>
     *            The authorizer type. Valid values are <code>TOKEN</code> for a
     *            Lambda function using a single authorization token submitted
     *            in a custom header, <code>REQUEST</code> for a Lambda function
     *            using incoming request parameters, and
     *            <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito
     *            user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizerType
     */
    public GetAuthorizerResult withType(AuthorizerType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A list of the Amazon Cognito user pool ARNs for the
     * <code>COGNITO_USER_POOLS</code> authorizer. Each element is of this
     * format:
     * <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>
     * . For a <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is
     * not defined.
     * </p>
     *
     * @return <p>
     *         A list of the Amazon Cognito user pool ARNs for the
     *         <code>COGNITO_USER_POOLS</code> authorizer. Each element is of
     *         this format:
     *         <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>
     *         . For a <code>TOKEN</code> or <code>REQUEST</code> authorizer,
     *         this is not defined.
     *         </p>
     */
    public java.util.List<String> getProviderARNs() {
        return providerARNs;
    }

    /**
     * <p>
     * A list of the Amazon Cognito user pool ARNs for the
     * <code>COGNITO_USER_POOLS</code> authorizer. Each element is of this
     * format:
     * <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>
     * . For a <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is
     * not defined.
     * </p>
     *
     * @param providerARNs <p>
     *            A list of the Amazon Cognito user pool ARNs for the
     *            <code>COGNITO_USER_POOLS</code> authorizer. Each element is of
     *            this format:
     *            <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>
     *            . For a <code>TOKEN</code> or <code>REQUEST</code> authorizer,
     *            this is not defined.
     *            </p>
     */
    public void setProviderARNs(java.util.Collection<String> providerARNs) {
        if (providerARNs == null) {
            this.providerARNs = null;
            return;
        }

        this.providerARNs = new java.util.ArrayList<String>(providerARNs);
    }

    /**
     * <p>
     * A list of the Amazon Cognito user pool ARNs for the
     * <code>COGNITO_USER_POOLS</code> authorizer. Each element is of this
     * format:
     * <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>
     * . For a <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is
     * not defined.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerARNs <p>
     *            A list of the Amazon Cognito user pool ARNs for the
     *            <code>COGNITO_USER_POOLS</code> authorizer. Each element is of
     *            this format:
     *            <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>
     *            . For a <code>TOKEN</code> or <code>REQUEST</code> authorizer,
     *            this is not defined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withProviderARNs(String... providerARNs) {
        if (getProviderARNs() == null) {
            this.providerARNs = new java.util.ArrayList<String>(providerARNs.length);
        }
        for (String value : providerARNs) {
            this.providerARNs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the Amazon Cognito user pool ARNs for the
     * <code>COGNITO_USER_POOLS</code> authorizer. Each element is of this
     * format:
     * <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>
     * . For a <code>TOKEN</code> or <code>REQUEST</code> authorizer, this is
     * not defined.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerARNs <p>
     *            A list of the Amazon Cognito user pool ARNs for the
     *            <code>COGNITO_USER_POOLS</code> authorizer. Each element is of
     *            this format:
     *            <code>arn:aws:cognito-idp:{region}:{account_id}:userpool/{user_pool_id}</code>
     *            . For a <code>TOKEN</code> or <code>REQUEST</code> authorizer,
     *            this is not defined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withProviderARNs(java.util.Collection<String> providerARNs) {
        setProviderARNs(providerARNs);
        return this;
    }

    /**
     * <p>
     * Optional customer-defined field, used in OpenAPI imports and exports
     * without functional impact.
     * </p>
     *
     * @return <p>
     *         Optional customer-defined field, used in OpenAPI imports and
     *         exports without functional impact.
     *         </p>
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * <p>
     * Optional customer-defined field, used in OpenAPI imports and exports
     * without functional impact.
     * </p>
     *
     * @param authType <p>
     *            Optional customer-defined field, used in OpenAPI imports and
     *            exports without functional impact.
     *            </p>
     */
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * Optional customer-defined field, used in OpenAPI imports and exports
     * without functional impact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authType <p>
     *            Optional customer-defined field, used in OpenAPI imports and
     *            exports without functional impact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * <p>
     * Specifies the authorizer's Uniform Resource Identifier (URI). For
     * <code>TOKEN</code> or <code>REQUEST</code> authorizers, this must be a
     * well-formed Lambda function URI, for example,
     * <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     * . In general, the URI has this form
     * <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>, where
     * <code>{region}</code> is the same as the region hosting the Lambda
     * function, <code>path</code> indicates that the remaining substring in the
     * URI should be treated as the path to the resource, including the initial
     * <code>/</code>. For Lambda functions, this is usually of the form
     * <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the authorizer's Uniform Resource Identifier (URI). For
     *         <code>TOKEN</code> or <code>REQUEST</code> authorizers, this must
     *         be a well-formed Lambda function URI, for example,
     *         <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     *         . In general, the URI has this form
     *         <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>
     *         , where <code>{region}</code> is the same as the region hosting
     *         the Lambda function, <code>path</code> indicates that the
     *         remaining substring in the URI should be treated as the path to
     *         the resource, including the initial <code>/</code>. For Lambda
     *         functions, this is usually of the form
     *         <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     *         </p>
     */
    public String getAuthorizerUri() {
        return authorizerUri;
    }

    /**
     * <p>
     * Specifies the authorizer's Uniform Resource Identifier (URI). For
     * <code>TOKEN</code> or <code>REQUEST</code> authorizers, this must be a
     * well-formed Lambda function URI, for example,
     * <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     * . In general, the URI has this form
     * <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>, where
     * <code>{region}</code> is the same as the region hosting the Lambda
     * function, <code>path</code> indicates that the remaining substring in the
     * URI should be treated as the path to the resource, including the initial
     * <code>/</code>. For Lambda functions, this is usually of the form
     * <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     * </p>
     *
     * @param authorizerUri <p>
     *            Specifies the authorizer's Uniform Resource Identifier (URI).
     *            For <code>TOKEN</code> or <code>REQUEST</code> authorizers,
     *            this must be a well-formed Lambda function URI, for example,
     *            <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     *            . In general, the URI has this form
     *            <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>
     *            , where <code>{region}</code> is the same as the region
     *            hosting the Lambda function, <code>path</code> indicates that
     *            the remaining substring in the URI should be treated as the
     *            path to the resource, including the initial <code>/</code>.
     *            For Lambda functions, this is usually of the form
     *            <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     *            </p>
     */
    public void setAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
    }

    /**
     * <p>
     * Specifies the authorizer's Uniform Resource Identifier (URI). For
     * <code>TOKEN</code> or <code>REQUEST</code> authorizers, this must be a
     * well-formed Lambda function URI, for example,
     * <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     * . In general, the URI has this form
     * <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>, where
     * <code>{region}</code> is the same as the region hosting the Lambda
     * function, <code>path</code> indicates that the remaining substring in the
     * URI should be treated as the path to the resource, including the initial
     * <code>/</code>. For Lambda functions, this is usually of the form
     * <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerUri <p>
     *            Specifies the authorizer's Uniform Resource Identifier (URI).
     *            For <code>TOKEN</code> or <code>REQUEST</code> authorizers,
     *            this must be a well-formed Lambda function URI, for example,
     *            <code>arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations</code>
     *            . In general, the URI has this form
     *            <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>
     *            , where <code>{region}</code> is the same as the region
     *            hosting the Lambda function, <code>path</code> indicates that
     *            the remaining substring in the URI should be treated as the
     *            path to the resource, including the initial <code>/</code>.
     *            For Lambda functions, this is usually of the form
     *            <code>/2015-03-31/functions/[FunctionARN]/invocations</code>.
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
     * Specifies the required credentials as an IAM role for API Gateway to
     * invoke the authorizer. To specify an IAM role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null.
     * </p>
     *
     * @return <p>
     *         Specifies the required credentials as an IAM role for API Gateway
     *         to invoke the authorizer. To specify an IAM role for API Gateway
     *         to assume, use the role's Amazon Resource Name (ARN). To use
     *         resource-based permissions on the Lambda function, specify null.
     *         </p>
     */
    public String getAuthorizerCredentials() {
        return authorizerCredentials;
    }

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to
     * invoke the authorizer. To specify an IAM role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null.
     * </p>
     *
     * @param authorizerCredentials <p>
     *            Specifies the required credentials as an IAM role for API
     *            Gateway to invoke the authorizer. To specify an IAM role for
     *            API Gateway to assume, use the role's Amazon Resource Name
     *            (ARN). To use resource-based permissions on the Lambda
     *            function, specify null.
     *            </p>
     */
    public void setAuthorizerCredentials(String authorizerCredentials) {
        this.authorizerCredentials = authorizerCredentials;
    }

    /**
     * <p>
     * Specifies the required credentials as an IAM role for API Gateway to
     * invoke the authorizer. To specify an IAM role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerCredentials <p>
     *            Specifies the required credentials as an IAM role for API
     *            Gateway to invoke the authorizer. To specify an IAM role for
     *            API Gateway to assume, use the role's Amazon Resource Name
     *            (ARN). To use resource-based permissions on the Lambda
     *            function, specify null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withAuthorizerCredentials(String authorizerCredentials) {
        this.authorizerCredentials = authorizerCredentials;
        return this;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * <ul>
     * <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code>
     * authorizer, this is required and specifies the request header mapping
     * expression for the custom header holding the authorization token
     * submitted by the client. For example, if the token header name is
     * <code>Auth</code>, the header mapping expression is
     * <code>method.request.header.Auth</code>.</li>
     * <li>For the <code>REQUEST</code> authorizer, this is required when
     * authorization caching is enabled. The value is a comma-separated string
     * of one or more mapping expressions of the specified request parameters.
     * For example, if an <code>Auth</code> header, a <code>Name</code> query
     * string parameter are defined as identity sources, this value is
     * <code>method.request.header.Auth, method.request.querystring.Name</code>.
     * These parameters will be used to derive the authorization caching key and
     * to perform runtime validation of the <code>REQUEST</code> authorizer by
     * verifying all of the identity-related request parameters are present, not
     * null and non-empty. Only when this is true does the authorizer invoke the
     * authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     * response without calling the Lambda function. The valid value is a string
     * of comma-separated mapping expressions of the specified request
     * parameters. When the authorization caching is not enabled, this property
     * is optional.</li>
     * </ul>
     * </p>
     *
     * @return <p>
     *         The identity source for which authorization is requested.
     *         <ul>
     *         <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code>
     *         authorizer, this is required and specifies the request header
     *         mapping expression for the custom header holding the
     *         authorization token submitted by the client. For example, if the
     *         token header name is <code>Auth</code>, the header mapping
     *         expression is <code>method.request.header.Auth</code>.</li>
     *         <li>For the <code>REQUEST</code> authorizer, this is required
     *         when authorization caching is enabled. The value is a
     *         comma-separated string of one or more mapping expressions of the
     *         specified request parameters. For example, if an
     *         <code>Auth</code> header, a <code>Name</code> query string
     *         parameter are defined as identity sources, this value is
     *         <code>method.request.header.Auth, method.request.querystring.Name</code>
     *         . These parameters will be used to derive the authorization
     *         caching key and to perform runtime validation of the
     *         <code>REQUEST</code> authorizer by verifying all of the
     *         identity-related request parameters are present, not null and
     *         non-empty. Only when this is true does the authorizer invoke the
     *         authorizer Lambda function, otherwise, it returns a 401
     *         Unauthorized response without calling the Lambda function. The
     *         valid value is a string of comma-separated mapping expressions of
     *         the specified request parameters. When the authorization caching
     *         is not enabled, this property is optional.</li>
     *         </ul>
     *         </p>
     */
    public String getIdentitySource() {
        return identitySource;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * <ul>
     * <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code>
     * authorizer, this is required and specifies the request header mapping
     * expression for the custom header holding the authorization token
     * submitted by the client. For example, if the token header name is
     * <code>Auth</code>, the header mapping expression is
     * <code>method.request.header.Auth</code>.</li>
     * <li>For the <code>REQUEST</code> authorizer, this is required when
     * authorization caching is enabled. The value is a comma-separated string
     * of one or more mapping expressions of the specified request parameters.
     * For example, if an <code>Auth</code> header, a <code>Name</code> query
     * string parameter are defined as identity sources, this value is
     * <code>method.request.header.Auth, method.request.querystring.Name</code>.
     * These parameters will be used to derive the authorization caching key and
     * to perform runtime validation of the <code>REQUEST</code> authorizer by
     * verifying all of the identity-related request parameters are present, not
     * null and non-empty. Only when this is true does the authorizer invoke the
     * authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     * response without calling the Lambda function. The valid value is a string
     * of comma-separated mapping expressions of the specified request
     * parameters. When the authorization caching is not enabled, this property
     * is optional.</li>
     * </ul>
     * </p>
     *
     * @param identitySource <p>
     *            The identity source for which authorization is requested.
     *            <ul>
     *            <li>For a <code>TOKEN</code> or
     *            <code>COGNITO_USER_POOLS</code> authorizer, this is required
     *            and specifies the request header mapping expression for the
     *            custom header holding the authorization token submitted by the
     *            client. For example, if the token header name is
     *            <code>Auth</code>, the header mapping expression is
     *            <code>method.request.header.Auth</code>.</li>
     *            <li>For the <code>REQUEST</code> authorizer, this is required
     *            when authorization caching is enabled. The value is a
     *            comma-separated string of one or more mapping expressions of
     *            the specified request parameters. For example, if an
     *            <code>Auth</code> header, a <code>Name</code> query string
     *            parameter are defined as identity sources, this value is
     *            <code>method.request.header.Auth, method.request.querystring.Name</code>
     *            . These parameters will be used to derive the authorization
     *            caching key and to perform runtime validation of the
     *            <code>REQUEST</code> authorizer by verifying all of the
     *            identity-related request parameters are present, not null and
     *            non-empty. Only when this is true does the authorizer invoke
     *            the authorizer Lambda function, otherwise, it returns a 401
     *            Unauthorized response without calling the Lambda function. The
     *            valid value is a string of comma-separated mapping expressions
     *            of the specified request parameters. When the authorization
     *            caching is not enabled, this property is optional.</li>
     *            </ul>
     *            </p>
     */
    public void setIdentitySource(String identitySource) {
        this.identitySource = identitySource;
    }

    /**
     * <p>
     * The identity source for which authorization is requested.
     * <ul>
     * <li>For a <code>TOKEN</code> or <code>COGNITO_USER_POOLS</code>
     * authorizer, this is required and specifies the request header mapping
     * expression for the custom header holding the authorization token
     * submitted by the client. For example, if the token header name is
     * <code>Auth</code>, the header mapping expression is
     * <code>method.request.header.Auth</code>.</li>
     * <li>For the <code>REQUEST</code> authorizer, this is required when
     * authorization caching is enabled. The value is a comma-separated string
     * of one or more mapping expressions of the specified request parameters.
     * For example, if an <code>Auth</code> header, a <code>Name</code> query
     * string parameter are defined as identity sources, this value is
     * <code>method.request.header.Auth, method.request.querystring.Name</code>.
     * These parameters will be used to derive the authorization caching key and
     * to perform runtime validation of the <code>REQUEST</code> authorizer by
     * verifying all of the identity-related request parameters are present, not
     * null and non-empty. Only when this is true does the authorizer invoke the
     * authorizer Lambda function, otherwise, it returns a 401 Unauthorized
     * response without calling the Lambda function. The valid value is a string
     * of comma-separated mapping expressions of the specified request
     * parameters. When the authorization caching is not enabled, this property
     * is optional.</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identitySource <p>
     *            The identity source for which authorization is requested.
     *            <ul>
     *            <li>For a <code>TOKEN</code> or
     *            <code>COGNITO_USER_POOLS</code> authorizer, this is required
     *            and specifies the request header mapping expression for the
     *            custom header holding the authorization token submitted by the
     *            client. For example, if the token header name is
     *            <code>Auth</code>, the header mapping expression is
     *            <code>method.request.header.Auth</code>.</li>
     *            <li>For the <code>REQUEST</code> authorizer, this is required
     *            when authorization caching is enabled. The value is a
     *            comma-separated string of one or more mapping expressions of
     *            the specified request parameters. For example, if an
     *            <code>Auth</code> header, a <code>Name</code> query string
     *            parameter are defined as identity sources, this value is
     *            <code>method.request.header.Auth, method.request.querystring.Name</code>
     *            . These parameters will be used to derive the authorization
     *            caching key and to perform runtime validation of the
     *            <code>REQUEST</code> authorizer by verifying all of the
     *            identity-related request parameters are present, not null and
     *            non-empty. Only when this is true does the authorizer invoke
     *            the authorizer Lambda function, otherwise, it returns a 401
     *            Unauthorized response without calling the Lambda function. The
     *            valid value is a string of comma-separated mapping expressions
     *            of the specified request parameters. When the authorization
     *            caching is not enabled, this property is optional.</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withIdentitySource(String identitySource) {
        this.identitySource = identitySource;
        return this;
    }

    /**
     * <p>
     * A validation expression for the incoming identity token. For
     * <code>TOKEN</code> authorizers, this value is a regular expression. For
     * <code>COGNITO_USER_POOLS</code> authorizers, API Gateway will match the
     * <code>aud</code> field of the incoming token from the client against the
     * specified regular expression. It will invoke the authorizer's Lambda
     * function when there is a match. Otherwise, it will return a 401
     * Unauthorized response without calling the Lambda function. The validation
     * expression does not apply to the <code>REQUEST</code> authorizer.
     * </p>
     *
     * @return <p>
     *         A validation expression for the incoming identity token. For
     *         <code>TOKEN</code> authorizers, this value is a regular
     *         expression. For <code>COGNITO_USER_POOLS</code> authorizers, API
     *         Gateway will match the <code>aud</code> field of the incoming
     *         token from the client against the specified regular expression.
     *         It will invoke the authorizer's Lambda function when there is a
     *         match. Otherwise, it will return a 401 Unauthorized response
     *         without calling the Lambda function. The validation expression
     *         does not apply to the <code>REQUEST</code> authorizer.
     *         </p>
     */
    public String getIdentityValidationExpression() {
        return identityValidationExpression;
    }

    /**
     * <p>
     * A validation expression for the incoming identity token. For
     * <code>TOKEN</code> authorizers, this value is a regular expression. For
     * <code>COGNITO_USER_POOLS</code> authorizers, API Gateway will match the
     * <code>aud</code> field of the incoming token from the client against the
     * specified regular expression. It will invoke the authorizer's Lambda
     * function when there is a match. Otherwise, it will return a 401
     * Unauthorized response without calling the Lambda function. The validation
     * expression does not apply to the <code>REQUEST</code> authorizer.
     * </p>
     *
     * @param identityValidationExpression <p>
     *            A validation expression for the incoming identity token. For
     *            <code>TOKEN</code> authorizers, this value is a regular
     *            expression. For <code>COGNITO_USER_POOLS</code> authorizers,
     *            API Gateway will match the <code>aud</code> field of the
     *            incoming token from the client against the specified regular
     *            expression. It will invoke the authorizer's Lambda function
     *            when there is a match. Otherwise, it will return a 401
     *            Unauthorized response without calling the Lambda function. The
     *            validation expression does not apply to the
     *            <code>REQUEST</code> authorizer.
     *            </p>
     */
    public void setIdentityValidationExpression(String identityValidationExpression) {
        this.identityValidationExpression = identityValidationExpression;
    }

    /**
     * <p>
     * A validation expression for the incoming identity token. For
     * <code>TOKEN</code> authorizers, this value is a regular expression. For
     * <code>COGNITO_USER_POOLS</code> authorizers, API Gateway will match the
     * <code>aud</code> field of the incoming token from the client against the
     * specified regular expression. It will invoke the authorizer's Lambda
     * function when there is a match. Otherwise, it will return a 401
     * Unauthorized response without calling the Lambda function. The validation
     * expression does not apply to the <code>REQUEST</code> authorizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityValidationExpression <p>
     *            A validation expression for the incoming identity token. For
     *            <code>TOKEN</code> authorizers, this value is a regular
     *            expression. For <code>COGNITO_USER_POOLS</code> authorizers,
     *            API Gateway will match the <code>aud</code> field of the
     *            incoming token from the client against the specified regular
     *            expression. It will invoke the authorizer's Lambda function
     *            when there is a match. Otherwise, it will return a 401
     *            Unauthorized response without calling the Lambda function. The
     *            validation expression does not apply to the
     *            <code>REQUEST</code> authorizer.
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
     * The TTL in seconds of cached authorizer results. If it equals 0,
     * authorization caching is disabled. If it is greater than 0, API Gateway
     * will cache authorizer responses. If this field is not set, the default
     * value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     *
     * @return <p>
     *         The TTL in seconds of cached authorizer results. If it equals 0,
     *         authorization caching is disabled. If it is greater than 0, API
     *         Gateway will cache authorizer responses. If this field is not
     *         set, the default value is 300. The maximum value is 3600, or 1
     *         hour.
     *         </p>
     */
    public Integer getAuthorizerResultTtlInSeconds() {
        return authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The TTL in seconds of cached authorizer results. If it equals 0,
     * authorization caching is disabled. If it is greater than 0, API Gateway
     * will cache authorizer responses. If this field is not set, the default
     * value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     *
     * @param authorizerResultTtlInSeconds <p>
     *            The TTL in seconds of cached authorizer results. If it equals
     *            0, authorization caching is disabled. If it is greater than 0,
     *            API Gateway will cache authorizer responses. If this field is
     *            not set, the default value is 300. The maximum value is 3600,
     *            or 1 hour.
     *            </p>
     */
    public void setAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The TTL in seconds of cached authorizer results. If it equals 0,
     * authorization caching is disabled. If it is greater than 0, API Gateway
     * will cache authorizer responses. If this field is not set, the default
     * value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerResultTtlInSeconds <p>
     *            The TTL in seconds of cached authorizer results. If it equals
     *            0, authorization caching is disabled. If it is greater than 0,
     *            API Gateway will cache authorizer responses. If this field is
     *            not set, the default value is 300. The maximum value is 3600,
     *            or 1 hour.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAuthorizerResult withAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getProviderARNs() != null)
            sb.append("providerARNs: " + getProviderARNs() + ",");
        if (getAuthType() != null)
            sb.append("authType: " + getAuthType() + ",");
        if (getAuthorizerUri() != null)
            sb.append("authorizerUri: " + getAuthorizerUri() + ",");
        if (getAuthorizerCredentials() != null)
            sb.append("authorizerCredentials: " + getAuthorizerCredentials() + ",");
        if (getIdentitySource() != null)
            sb.append("identitySource: " + getIdentitySource() + ",");
        if (getIdentityValidationExpression() != null)
            sb.append("identityValidationExpression: " + getIdentityValidationExpression() + ",");
        if (getAuthorizerResultTtlInSeconds() != null)
            sb.append("authorizerResultTtlInSeconds: " + getAuthorizerResultTtlInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getProviderARNs() == null) ? 0 : getProviderARNs().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode
                + ((getAuthorizerUri() == null) ? 0 : getAuthorizerUri().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorizerCredentials() == null) ? 0 : getAuthorizerCredentials().hashCode());
        hashCode = prime * hashCode
                + ((getIdentitySource() == null) ? 0 : getIdentitySource().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentityValidationExpression() == null) ? 0
                        : getIdentityValidationExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorizerResultTtlInSeconds() == null) ? 0
                        : getAuthorizerResultTtlInSeconds().hashCode());
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

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getProviderARNs() == null ^ this.getProviderARNs() == null)
            return false;
        if (other.getProviderARNs() != null
                && other.getProviderARNs().equals(this.getProviderARNs()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getAuthorizerUri() == null ^ this.getAuthorizerUri() == null)
            return false;
        if (other.getAuthorizerUri() != null
                && other.getAuthorizerUri().equals(this.getAuthorizerUri()) == false)
            return false;
        if (other.getAuthorizerCredentials() == null ^ this.getAuthorizerCredentials() == null)
            return false;
        if (other.getAuthorizerCredentials() != null
                && other.getAuthorizerCredentials().equals(this.getAuthorizerCredentials()) == false)
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
        if (other.getAuthorizerResultTtlInSeconds() == null
                ^ this.getAuthorizerResultTtlInSeconds() == null)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() != null
                && other.getAuthorizerResultTtlInSeconds().equals(
                        this.getAuthorizerResultTtlInSeconds()) == false)
            return false;
        return true;
    }
}
