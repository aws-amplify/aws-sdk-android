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
 * Updates an Api resource.
 * </p>
 */
public class UpdateApiRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;

    /**
     * <p>
     * An API key selection expression. Supported only for WebSocket APIs. See
     * <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     */
    private String apiKeySelectionExpression;

    /**
     * <p>
     * A CORS configuration. Supported only for HTTP APIs.
     * </p>
     */
    private Cors corsConfiguration;

    /**
     * <p>
     * This property is part of quick create. It specifies the credentials
     * required for the integration, if any. For a Lambda integration, three
     * options are available. To specify an IAM Role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To require that the caller's
     * identity be passed through from the request, specify
     * arn:aws:iam::*:user/*. To use resource-based permissions on supported AWS
     * services, specify null. Currently, this property is not used for HTTP
     * integrations. If provided, this value replaces the credentials associated
     * with the quick create integration. Supported only for HTTP APIs.
     * </p>
     */
    private String credentialsArn;

    /**
     * <p>
     * The description of the API.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Avoid validating models when creating a deployment. Supported only for
     * WebSocket APIs.
     * </p>
     */
    private Boolean disableSchemaValidation;

    /**
     * <p>
     * The name of the API.
     * </p>
     */
    private String name;

    /**
     * <p>
     * This property is part of quick create. If not specified, the route
     * created using quick create is kept. Otherwise, this value replaces the
     * route key of the quick create route. Additional routes may still be added
     * after the API is updated. Supported only for HTTP APIs.
     * </p>
     */
    private String routeKey;

    /**
     * <p>
     * The route selection expression for the API. For HTTP APIs, the
     * routeSelectionExpression must be ${request.method} ${request.path}. If
     * not provided, this will be the default for HTTP APIs. This property is
     * required for WebSocket APIs.
     * </p>
     */
    private String routeSelectionExpression;

    /**
     * <p>
     * This property is part of quick create. For HTTP integrations, specify a
     * fully qualified URL. For Lambda integrations, specify a function ARN. The
     * type of the integration will be HTTP_PROXY or AWS_PROXY, respectively.
     * The value provided updates the integration URI and integration type. You
     * can update a quick-created target, but you can't remove it from an API.
     * Supported only for HTTP APIs.
     * </p>
     */
    private String target;

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     */
    private String version;

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
    public UpdateApiRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * <p>
     * An API key selection expression. Supported only for WebSocket APIs. See
     * <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     *
     * @return <p>
     *         An API key selection expression. Supported only for WebSocket
     *         APIs. See <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     *         >API Key Selection Expressions</a>.
     *         </p>
     */
    public String getApiKeySelectionExpression() {
        return apiKeySelectionExpression;
    }

    /**
     * <p>
     * An API key selection expression. Supported only for WebSocket APIs. See
     * <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     *
     * @param apiKeySelectionExpression <p>
     *            An API key selection expression. Supported only for WebSocket
     *            APIs. See <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     *            >API Key Selection Expressions</a>.
     *            </p>
     */
    public void setApiKeySelectionExpression(String apiKeySelectionExpression) {
        this.apiKeySelectionExpression = apiKeySelectionExpression;
    }

    /**
     * <p>
     * An API key selection expression. Supported only for WebSocket APIs. See
     * <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiKeySelectionExpression <p>
     *            An API key selection expression. Supported only for WebSocket
     *            APIs. See <a href=
     *            "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     *            >API Key Selection Expressions</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiRequest withApiKeySelectionExpression(String apiKeySelectionExpression) {
        this.apiKeySelectionExpression = apiKeySelectionExpression;
        return this;
    }

    /**
     * <p>
     * A CORS configuration. Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         A CORS configuration. Supported only for HTTP APIs.
     *         </p>
     */
    public Cors getCorsConfiguration() {
        return corsConfiguration;
    }

    /**
     * <p>
     * A CORS configuration. Supported only for HTTP APIs.
     * </p>
     *
     * @param corsConfiguration <p>
     *            A CORS configuration. Supported only for HTTP APIs.
     *            </p>
     */
    public void setCorsConfiguration(Cors corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
    }

    /**
     * <p>
     * A CORS configuration. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param corsConfiguration <p>
     *            A CORS configuration. Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiRequest withCorsConfiguration(Cors corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
        return this;
    }

    /**
     * <p>
     * This property is part of quick create. It specifies the credentials
     * required for the integration, if any. For a Lambda integration, three
     * options are available. To specify an IAM Role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To require that the caller's
     * identity be passed through from the request, specify
     * arn:aws:iam::*:user/*. To use resource-based permissions on supported AWS
     * services, specify null. Currently, this property is not used for HTTP
     * integrations. If provided, this value replaces the credentials associated
     * with the quick create integration. Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         This property is part of quick create. It specifies the
     *         credentials required for the integration, if any. For a Lambda
     *         integration, three options are available. To specify an IAM Role
     *         for API Gateway to assume, use the role's Amazon Resource Name
     *         (ARN). To require that the caller's identity be passed through
     *         from the request, specify arn:aws:iam::*:user/*. To use
     *         resource-based permissions on supported AWS services, specify
     *         null. Currently, this property is not used for HTTP integrations.
     *         If provided, this value replaces the credentials associated with
     *         the quick create integration. Supported only for HTTP APIs.
     *         </p>
     */
    public String getCredentialsArn() {
        return credentialsArn;
    }

    /**
     * <p>
     * This property is part of quick create. It specifies the credentials
     * required for the integration, if any. For a Lambda integration, three
     * options are available. To specify an IAM Role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To require that the caller's
     * identity be passed through from the request, specify
     * arn:aws:iam::*:user/*. To use resource-based permissions on supported AWS
     * services, specify null. Currently, this property is not used for HTTP
     * integrations. If provided, this value replaces the credentials associated
     * with the quick create integration. Supported only for HTTP APIs.
     * </p>
     *
     * @param credentialsArn <p>
     *            This property is part of quick create. It specifies the
     *            credentials required for the integration, if any. For a Lambda
     *            integration, three options are available. To specify an IAM
     *            Role for API Gateway to assume, use the role's Amazon Resource
     *            Name (ARN). To require that the caller's identity be passed
     *            through from the request, specify arn:aws:iam::*:user/*. To
     *            use resource-based permissions on supported AWS services,
     *            specify null. Currently, this property is not used for HTTP
     *            integrations. If provided, this value replaces the credentials
     *            associated with the quick create integration. Supported only
     *            for HTTP APIs.
     *            </p>
     */
    public void setCredentialsArn(String credentialsArn) {
        this.credentialsArn = credentialsArn;
    }

    /**
     * <p>
     * This property is part of quick create. It specifies the credentials
     * required for the integration, if any. For a Lambda integration, three
     * options are available. To specify an IAM Role for API Gateway to assume,
     * use the role's Amazon Resource Name (ARN). To require that the caller's
     * identity be passed through from the request, specify
     * arn:aws:iam::*:user/*. To use resource-based permissions on supported AWS
     * services, specify null. Currently, this property is not used for HTTP
     * integrations. If provided, this value replaces the credentials associated
     * with the quick create integration. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credentialsArn <p>
     *            This property is part of quick create. It specifies the
     *            credentials required for the integration, if any. For a Lambda
     *            integration, three options are available. To specify an IAM
     *            Role for API Gateway to assume, use the role's Amazon Resource
     *            Name (ARN). To require that the caller's identity be passed
     *            through from the request, specify arn:aws:iam::*:user/*. To
     *            use resource-based permissions on supported AWS services,
     *            specify null. Currently, this property is not used for HTTP
     *            integrations. If provided, this value replaces the credentials
     *            associated with the quick create integration. Supported only
     *            for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiRequest withCredentialsArn(String credentialsArn) {
        this.credentialsArn = credentialsArn;
        return this;
    }

    /**
     * <p>
     * The description of the API.
     * </p>
     *
     * @return <p>
     *         The description of the API.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the API.
     * </p>
     *
     * @param description <p>
     *            The description of the API.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment. Supported only for
     * WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         Avoid validating models when creating a deployment. Supported
     *         only for WebSocket APIs.
     *         </p>
     */
    public Boolean isDisableSchemaValidation() {
        return disableSchemaValidation;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment. Supported only for
     * WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         Avoid validating models when creating a deployment. Supported
     *         only for WebSocket APIs.
     *         </p>
     */
    public Boolean getDisableSchemaValidation() {
        return disableSchemaValidation;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment. Supported only for
     * WebSocket APIs.
     * </p>
     *
     * @param disableSchemaValidation <p>
     *            Avoid validating models when creating a deployment. Supported
     *            only for WebSocket APIs.
     *            </p>
     */
    public void setDisableSchemaValidation(Boolean disableSchemaValidation) {
        this.disableSchemaValidation = disableSchemaValidation;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment. Supported only for
     * WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableSchemaValidation <p>
     *            Avoid validating models when creating a deployment. Supported
     *            only for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiRequest withDisableSchemaValidation(Boolean disableSchemaValidation) {
        this.disableSchemaValidation = disableSchemaValidation;
        return this;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     *
     * @return <p>
     *         The name of the API.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     *
     * @param name <p>
     *            The name of the API.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * This property is part of quick create. If not specified, the route
     * created using quick create is kept. Otherwise, this value replaces the
     * route key of the quick create route. Additional routes may still be added
     * after the API is updated. Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         This property is part of quick create. If not specified, the
     *         route created using quick create is kept. Otherwise, this value
     *         replaces the route key of the quick create route. Additional
     *         routes may still be added after the API is updated. Supported
     *         only for HTTP APIs.
     *         </p>
     */
    public String getRouteKey() {
        return routeKey;
    }

    /**
     * <p>
     * This property is part of quick create. If not specified, the route
     * created using quick create is kept. Otherwise, this value replaces the
     * route key of the quick create route. Additional routes may still be added
     * after the API is updated. Supported only for HTTP APIs.
     * </p>
     *
     * @param routeKey <p>
     *            This property is part of quick create. If not specified, the
     *            route created using quick create is kept. Otherwise, this
     *            value replaces the route key of the quick create route.
     *            Additional routes may still be added after the API is updated.
     *            Supported only for HTTP APIs.
     *            </p>
     */
    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }

    /**
     * <p>
     * This property is part of quick create. If not specified, the route
     * created using quick create is kept. Otherwise, this value replaces the
     * route key of the quick create route. Additional routes may still be added
     * after the API is updated. Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeKey <p>
     *            This property is part of quick create. If not specified, the
     *            route created using quick create is kept. Otherwise, this
     *            value replaces the route key of the quick create route.
     *            Additional routes may still be added after the API is updated.
     *            Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiRequest withRouteKey(String routeKey) {
        this.routeKey = routeKey;
        return this;
    }

    /**
     * <p>
     * The route selection expression for the API. For HTTP APIs, the
     * routeSelectionExpression must be ${request.method} ${request.path}. If
     * not provided, this will be the default for HTTP APIs. This property is
     * required for WebSocket APIs.
     * </p>
     *
     * @return <p>
     *         The route selection expression for the API. For HTTP APIs, the
     *         routeSelectionExpression must be ${request.method}
     *         ${request.path}. If not provided, this will be the default for
     *         HTTP APIs. This property is required for WebSocket APIs.
     *         </p>
     */
    public String getRouteSelectionExpression() {
        return routeSelectionExpression;
    }

    /**
     * <p>
     * The route selection expression for the API. For HTTP APIs, the
     * routeSelectionExpression must be ${request.method} ${request.path}. If
     * not provided, this will be the default for HTTP APIs. This property is
     * required for WebSocket APIs.
     * </p>
     *
     * @param routeSelectionExpression <p>
     *            The route selection expression for the API. For HTTP APIs, the
     *            routeSelectionExpression must be ${request.method}
     *            ${request.path}. If not provided, this will be the default for
     *            HTTP APIs. This property is required for WebSocket APIs.
     *            </p>
     */
    public void setRouteSelectionExpression(String routeSelectionExpression) {
        this.routeSelectionExpression = routeSelectionExpression;
    }

    /**
     * <p>
     * The route selection expression for the API. For HTTP APIs, the
     * routeSelectionExpression must be ${request.method} ${request.path}. If
     * not provided, this will be the default for HTTP APIs. This property is
     * required for WebSocket APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeSelectionExpression <p>
     *            The route selection expression for the API. For HTTP APIs, the
     *            routeSelectionExpression must be ${request.method}
     *            ${request.path}. If not provided, this will be the default for
     *            HTTP APIs. This property is required for WebSocket APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiRequest withRouteSelectionExpression(String routeSelectionExpression) {
        this.routeSelectionExpression = routeSelectionExpression;
        return this;
    }

    /**
     * <p>
     * This property is part of quick create. For HTTP integrations, specify a
     * fully qualified URL. For Lambda integrations, specify a function ARN. The
     * type of the integration will be HTTP_PROXY or AWS_PROXY, respectively.
     * The value provided updates the integration URI and integration type. You
     * can update a quick-created target, but you can't remove it from an API.
     * Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         This property is part of quick create. For HTTP integrations,
     *         specify a fully qualified URL. For Lambda integrations, specify a
     *         function ARN. The type of the integration will be HTTP_PROXY or
     *         AWS_PROXY, respectively. The value provided updates the
     *         integration URI and integration type. You can update a
     *         quick-created target, but you can't remove it from an API.
     *         Supported only for HTTP APIs.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * This property is part of quick create. For HTTP integrations, specify a
     * fully qualified URL. For Lambda integrations, specify a function ARN. The
     * type of the integration will be HTTP_PROXY or AWS_PROXY, respectively.
     * The value provided updates the integration URI and integration type. You
     * can update a quick-created target, but you can't remove it from an API.
     * Supported only for HTTP APIs.
     * </p>
     *
     * @param target <p>
     *            This property is part of quick create. For HTTP integrations,
     *            specify a fully qualified URL. For Lambda integrations,
     *            specify a function ARN. The type of the integration will be
     *            HTTP_PROXY or AWS_PROXY, respectively. The value provided
     *            updates the integration URI and integration type. You can
     *            update a quick-created target, but you can't remove it from an
     *            API. Supported only for HTTP APIs.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * This property is part of quick create. For HTTP integrations, specify a
     * fully qualified URL. For Lambda integrations, specify a function ARN. The
     * type of the integration will be HTTP_PROXY or AWS_PROXY, respectively.
     * The value provided updates the integration URI and integration type. You
     * can update a quick-created target, but you can't remove it from an API.
     * Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            This property is part of quick create. For HTTP integrations,
     *            specify a fully qualified URL. For Lambda integrations,
     *            specify a function ARN. The type of the integration will be
     *            HTTP_PROXY or AWS_PROXY, respectively. The value provided
     *            updates the integration URI and integration type. You can
     *            update a quick-created target, but you can't remove it from an
     *            API. Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiRequest withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     *
     * @return <p>
     *         A version identifier for the API.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     *
     * @param version <p>
     *            A version identifier for the API.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            A version identifier for the API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApiRequest withVersion(String version) {
        this.version = version;
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
        if (getApiKeySelectionExpression() != null)
            sb.append("ApiKeySelectionExpression: " + getApiKeySelectionExpression() + ",");
        if (getCorsConfiguration() != null)
            sb.append("CorsConfiguration: " + getCorsConfiguration() + ",");
        if (getCredentialsArn() != null)
            sb.append("CredentialsArn: " + getCredentialsArn() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDisableSchemaValidation() != null)
            sb.append("DisableSchemaValidation: " + getDisableSchemaValidation() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRouteKey() != null)
            sb.append("RouteKey: " + getRouteKey() + ",");
        if (getRouteSelectionExpression() != null)
            sb.append("RouteSelectionExpression: " + getRouteSelectionExpression() + ",");
        if (getTarget() != null)
            sb.append("Target: " + getTarget() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
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
                + ((getApiKeySelectionExpression() == null) ? 0 : getApiKeySelectionExpression()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCorsConfiguration() == null) ? 0 : getCorsConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getCredentialsArn() == null) ? 0 : getCredentialsArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisableSchemaValidation() == null) ? 0 : getDisableSchemaValidation()
                        .hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRouteKey() == null) ? 0 : getRouteKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getRouteSelectionExpression() == null) ? 0 : getRouteSelectionExpression()
                        .hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApiRequest == false)
            return false;
        UpdateApiRequest other = (UpdateApiRequest) obj;

        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getApiKeySelectionExpression() == null
                ^ this.getApiKeySelectionExpression() == null)
            return false;
        if (other.getApiKeySelectionExpression() != null
                && other.getApiKeySelectionExpression().equals(this.getApiKeySelectionExpression()) == false)
            return false;
        if (other.getCorsConfiguration() == null ^ this.getCorsConfiguration() == null)
            return false;
        if (other.getCorsConfiguration() != null
                && other.getCorsConfiguration().equals(this.getCorsConfiguration()) == false)
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
        if (other.getDisableSchemaValidation() == null ^ this.getDisableSchemaValidation() == null)
            return false;
        if (other.getDisableSchemaValidation() != null
                && other.getDisableSchemaValidation().equals(this.getDisableSchemaValidation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRouteKey() == null ^ this.getRouteKey() == null)
            return false;
        if (other.getRouteKey() != null && other.getRouteKey().equals(this.getRouteKey()) == false)
            return false;
        if (other.getRouteSelectionExpression() == null
                ^ this.getRouteSelectionExpression() == null)
            return false;
        if (other.getRouteSelectionExpression() != null
                && other.getRouteSelectionExpression().equals(this.getRouteSelectionExpression()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
