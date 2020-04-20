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

/**
 * <p>
 * Represents an API.
 * </p>
 */
public class Api implements Serializable {
    /**
     * <p>
     * The URI of the API, of the form
     * {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically
     * appended to this URI to form a complete path to a deployed API stage.
     * </p>
     */
    private String apiEndpoint;

    /**
     * <p>
     * The API ID.
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
     * The timestamp when the API was created.
     * </p>
     */
    private java.util.Date createdDate;

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
     * The validation information during API import. This may include particular
     * properties of your OpenAPI definition which are ignored during import.
     * Supported only for HTTP APIs.
     * </p>
     */
    private java.util.List<String> importInfo;

    /**
     * <p>
     * The name of the API.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The API protocol.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEBSOCKET, HTTP
     */
    private String protocolType;

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
     * A collection of tags associated with the API.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The warning messages reported when failonwarnings is turned on during API
     * import.
     * </p>
     */
    private java.util.List<String> warnings;

    /**
     * <p>
     * The URI of the API, of the form
     * {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically
     * appended to this URI to form a complete path to a deployed API stage.
     * </p>
     *
     * @return <p>
     *         The URI of the API, of the form
     *         {api-id}.execute-api.{region}.amazonaws.com. The stage name is
     *         typically appended to this URI to form a complete path to a
     *         deployed API stage.
     *         </p>
     */
    public String getApiEndpoint() {
        return apiEndpoint;
    }

    /**
     * <p>
     * The URI of the API, of the form
     * {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically
     * appended to this URI to form a complete path to a deployed API stage.
     * </p>
     *
     * @param apiEndpoint <p>
     *            The URI of the API, of the form
     *            {api-id}.execute-api.{region}.amazonaws.com. The stage name is
     *            typically appended to this URI to form a complete path to a
     *            deployed API stage.
     *            </p>
     */
    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    /**
     * <p>
     * The URI of the API, of the form
     * {api-id}.execute-api.{region}.amazonaws.com. The stage name is typically
     * appended to this URI to form a complete path to a deployed API stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiEndpoint <p>
     *            The URI of the API, of the form
     *            {api-id}.execute-api.{region}.amazonaws.com. The stage name is
     *            typically appended to this URI to form a complete path to a
     *            deployed API stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Api withApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     *
     * @return <p>
     *         The API ID.
     *         </p>
     */
    public String getApiId() {
        return apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     *
     * @param apiId <p>
     *            The API ID.
     *            </p>
     */
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiId <p>
     *            The API ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Api withApiId(String apiId) {
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
    public Api withApiKeySelectionExpression(String apiKeySelectionExpression) {
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
    public Api withCorsConfiguration(Cors corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
        return this;
    }

    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the API was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     *
     * @param createdDate <p>
     *            The timestamp when the API was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The timestamp when the API was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Api withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
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
    public Api withDescription(String description) {
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
    public Api withDisableSchemaValidation(Boolean disableSchemaValidation) {
        this.disableSchemaValidation = disableSchemaValidation;
        return this;
    }

    /**
     * <p>
     * The validation information during API import. This may include particular
     * properties of your OpenAPI definition which are ignored during import.
     * Supported only for HTTP APIs.
     * </p>
     *
     * @return <p>
     *         The validation information during API import. This may include
     *         particular properties of your OpenAPI definition which are
     *         ignored during import. Supported only for HTTP APIs.
     *         </p>
     */
    public java.util.List<String> getImportInfo() {
        return importInfo;
    }

    /**
     * <p>
     * The validation information during API import. This may include particular
     * properties of your OpenAPI definition which are ignored during import.
     * Supported only for HTTP APIs.
     * </p>
     *
     * @param importInfo <p>
     *            The validation information during API import. This may include
     *            particular properties of your OpenAPI definition which are
     *            ignored during import. Supported only for HTTP APIs.
     *            </p>
     */
    public void setImportInfo(java.util.Collection<String> importInfo) {
        if (importInfo == null) {
            this.importInfo = null;
            return;
        }

        this.importInfo = new java.util.ArrayList<String>(importInfo);
    }

    /**
     * <p>
     * The validation information during API import. This may include particular
     * properties of your OpenAPI definition which are ignored during import.
     * Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importInfo <p>
     *            The validation information during API import. This may include
     *            particular properties of your OpenAPI definition which are
     *            ignored during import. Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Api withImportInfo(String... importInfo) {
        if (getImportInfo() == null) {
            this.importInfo = new java.util.ArrayList<String>(importInfo.length);
        }
        for (String value : importInfo) {
            this.importInfo.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The validation information during API import. This may include particular
     * properties of your OpenAPI definition which are ignored during import.
     * Supported only for HTTP APIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importInfo <p>
     *            The validation information during API import. This may include
     *            particular properties of your OpenAPI definition which are
     *            ignored during import. Supported only for HTTP APIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Api withImportInfo(java.util.Collection<String> importInfo) {
        setImportInfo(importInfo);
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
    public Api withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The API protocol.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEBSOCKET, HTTP
     *
     * @return <p>
     *         The API protocol.
     *         </p>
     * @see ProtocolType
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * <p>
     * The API protocol.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEBSOCKET, HTTP
     *
     * @param protocolType <p>
     *            The API protocol.
     *            </p>
     * @see ProtocolType
     */
    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * <p>
     * The API protocol.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEBSOCKET, HTTP
     *
     * @param protocolType <p>
     *            The API protocol.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProtocolType
     */
    public Api withProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * <p>
     * The API protocol.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEBSOCKET, HTTP
     *
     * @param protocolType <p>
     *            The API protocol.
     *            </p>
     * @see ProtocolType
     */
    public void setProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType.toString();
    }

    /**
     * <p>
     * The API protocol.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WEBSOCKET, HTTP
     *
     * @param protocolType <p>
     *            The API protocol.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProtocolType
     */
    public Api withProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType.toString();
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
    public Api withRouteSelectionExpression(String routeSelectionExpression) {
        this.routeSelectionExpression = routeSelectionExpression;
        return this;
    }

    /**
     * <p>
     * A collection of tags associated with the API.
     * </p>
     *
     * @return <p>
     *         A collection of tags associated with the API.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of tags associated with the API.
     * </p>
     *
     * @param tags <p>
     *            A collection of tags associated with the API.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A collection of tags associated with the API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A collection of tags associated with the API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Api withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A collection of tags associated with the API.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Api addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Api clearTagsEntries() {
        this.tags = null;
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
    public Api withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The warning messages reported when failonwarnings is turned on during API
     * import.
     * </p>
     *
     * @return <p>
     *         The warning messages reported when failonwarnings is turned on
     *         during API import.
     *         </p>
     */
    public java.util.List<String> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * The warning messages reported when failonwarnings is turned on during API
     * import.
     * </p>
     *
     * @param warnings <p>
     *            The warning messages reported when failonwarnings is turned on
     *            during API import.
     *            </p>
     */
    public void setWarnings(java.util.Collection<String> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<String>(warnings);
    }

    /**
     * <p>
     * The warning messages reported when failonwarnings is turned on during API
     * import.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            The warning messages reported when failonwarnings is turned on
     *            during API import.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Api withWarnings(String... warnings) {
        if (getWarnings() == null) {
            this.warnings = new java.util.ArrayList<String>(warnings.length);
        }
        for (String value : warnings) {
            this.warnings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The warning messages reported when failonwarnings is turned on during API
     * import.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            The warning messages reported when failonwarnings is turned on
     *            during API import.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Api withWarnings(java.util.Collection<String> warnings) {
        setWarnings(warnings);
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
        if (getApiEndpoint() != null)
            sb.append("ApiEndpoint: " + getApiEndpoint() + ",");
        if (getApiId() != null)
            sb.append("ApiId: " + getApiId() + ",");
        if (getApiKeySelectionExpression() != null)
            sb.append("ApiKeySelectionExpression: " + getApiKeySelectionExpression() + ",");
        if (getCorsConfiguration() != null)
            sb.append("CorsConfiguration: " + getCorsConfiguration() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDisableSchemaValidation() != null)
            sb.append("DisableSchemaValidation: " + getDisableSchemaValidation() + ",");
        if (getImportInfo() != null)
            sb.append("ImportInfo: " + getImportInfo() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getProtocolType() != null)
            sb.append("ProtocolType: " + getProtocolType() + ",");
        if (getRouteSelectionExpression() != null)
            sb.append("RouteSelectionExpression: " + getRouteSelectionExpression() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getWarnings() != null)
            sb.append("Warnings: " + getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApiEndpoint() == null) ? 0 : getApiEndpoint().hashCode());
        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime
                * hashCode
                + ((getApiKeySelectionExpression() == null) ? 0 : getApiKeySelectionExpression()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCorsConfiguration() == null) ? 0 : getCorsConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisableSchemaValidation() == null) ? 0 : getDisableSchemaValidation()
                        .hashCode());
        hashCode = prime * hashCode + ((getImportInfo() == null) ? 0 : getImportInfo().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getProtocolType() == null) ? 0 : getProtocolType().hashCode());
        hashCode = prime
                * hashCode
                + ((getRouteSelectionExpression() == null) ? 0 : getRouteSelectionExpression()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Api == false)
            return false;
        Api other = (Api) obj;

        if (other.getApiEndpoint() == null ^ this.getApiEndpoint() == null)
            return false;
        if (other.getApiEndpoint() != null
                && other.getApiEndpoint().equals(this.getApiEndpoint()) == false)
            return false;
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
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
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
        if (other.getImportInfo() == null ^ this.getImportInfo() == null)
            return false;
        if (other.getImportInfo() != null
                && other.getImportInfo().equals(this.getImportInfo()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProtocolType() == null ^ this.getProtocolType() == null)
            return false;
        if (other.getProtocolType() != null
                && other.getProtocolType().equals(this.getProtocolType()) == false)
            return false;
        if (other.getRouteSelectionExpression() == null
                ^ this.getRouteSelectionExpression() == null)
            return false;
        if (other.getRouteSelectionExpression() != null
                && other.getRouteSelectionExpression().equals(this.getRouteSelectionExpression()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        return true;
    }
}
