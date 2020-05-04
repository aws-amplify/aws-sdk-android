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
 * Represents a REST API.
 * </p>
 * <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html"
 * >Create an API</a> </div>
 */
public class CreateRestApiResult implements Serializable {
    /**
     * <p>
     * The API's identifier. This identifier is unique across all of your APIs
     * in API Gateway.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The API's name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The API's description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The timestamp when the API was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The warning messages reported when <code>failonwarnings</code> is turned
     * on during API import.
     * </p>
     */
    private java.util.List<String> warnings;

    /**
     * <p>
     * The list of binary media types supported by the <a>RestApi</a>. By
     * default, the <a>RestApi</a> supports only UTF-8-encoded text payloads.
     * </p>
     */
    private java.util.List<String> binaryMediaTypes;

    /**
     * <p>
     * A nullable integer that is used to enable compression (with non-negative
     * between 0 and 10485760 (10M) bytes, inclusive) or disable compression
     * (with a null value) on an API. When compression is enabled, compression
     * or decompression is not applied on the payload if the payload size is
     * smaller than this value. Setting it to zero allows compression for any
     * payload size.
     * </p>
     */
    private Integer minimumCompressionSize;

    /**
     * <p>
     * The source of the API key for metering requests according to a usage
     * plan. Valid values are:
     * <ul>
     * <li><code>HEADER</code> to read the API key from the
     * <code>X-API-Key</code> header of a request.</li>
     * <li><code>AUTHORIZER</code> to read the API key from the
     * <code>UsageIdentifierKey</code> from a custom authorizer.</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEADER, AUTHORIZER
     */
    private String apiKeySource;

    /**
     * <p>
     * The endpoint configuration of this <a>RestApi</a> showing the endpoint
     * types of the API.
     * </p>
     */
    private EndpointConfiguration endpointConfiguration;

    /**
     * A stringified JSON policy document that applies to this RestApi
     * regardless of the caller and <a>Method</a> configuration.
     */
    private String policy;

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The API's identifier. This identifier is unique across all of your APIs
     * in API Gateway.
     * </p>
     *
     * @return <p>
     *         The API's identifier. This identifier is unique across all of
     *         your APIs in API Gateway.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The API's identifier. This identifier is unique across all of your APIs
     * in API Gateway.
     * </p>
     *
     * @param id <p>
     *            The API's identifier. This identifier is unique across all of
     *            your APIs in API Gateway.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The API's identifier. This identifier is unique across all of your APIs
     * in API Gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The API's identifier. This identifier is unique across all of
     *            your APIs in API Gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The API's name.
     * </p>
     *
     * @return <p>
     *         The API's name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The API's name.
     * </p>
     *
     * @param name <p>
     *            The API's name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The API's name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The API's name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The API's description.
     * </p>
     *
     * @return <p>
     *         The API's description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The API's description.
     * </p>
     *
     * @param description <p>
     *            The API's description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The API's description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The API's description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult withDescription(String description) {
        this.description = description;
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
    public CreateRestApiResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
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
    public CreateRestApiResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The warning messages reported when <code>failonwarnings</code> is turned
     * on during API import.
     * </p>
     *
     * @return <p>
     *         The warning messages reported when <code>failonwarnings</code> is
     *         turned on during API import.
     *         </p>
     */
    public java.util.List<String> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * The warning messages reported when <code>failonwarnings</code> is turned
     * on during API import.
     * </p>
     *
     * @param warnings <p>
     *            The warning messages reported when <code>failonwarnings</code>
     *            is turned on during API import.
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
     * The warning messages reported when <code>failonwarnings</code> is turned
     * on during API import.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            The warning messages reported when <code>failonwarnings</code>
     *            is turned on during API import.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult withWarnings(String... warnings) {
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
     * The warning messages reported when <code>failonwarnings</code> is turned
     * on during API import.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warnings <p>
     *            The warning messages reported when <code>failonwarnings</code>
     *            is turned on during API import.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult withWarnings(java.util.Collection<String> warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * <p>
     * The list of binary media types supported by the <a>RestApi</a>. By
     * default, the <a>RestApi</a> supports only UTF-8-encoded text payloads.
     * </p>
     *
     * @return <p>
     *         The list of binary media types supported by the <a>RestApi</a>.
     *         By default, the <a>RestApi</a> supports only UTF-8-encoded text
     *         payloads.
     *         </p>
     */
    public java.util.List<String> getBinaryMediaTypes() {
        return binaryMediaTypes;
    }

    /**
     * <p>
     * The list of binary media types supported by the <a>RestApi</a>. By
     * default, the <a>RestApi</a> supports only UTF-8-encoded text payloads.
     * </p>
     *
     * @param binaryMediaTypes <p>
     *            The list of binary media types supported by the
     *            <a>RestApi</a>. By default, the <a>RestApi</a> supports only
     *            UTF-8-encoded text payloads.
     *            </p>
     */
    public void setBinaryMediaTypes(java.util.Collection<String> binaryMediaTypes) {
        if (binaryMediaTypes == null) {
            this.binaryMediaTypes = null;
            return;
        }

        this.binaryMediaTypes = new java.util.ArrayList<String>(binaryMediaTypes);
    }

    /**
     * <p>
     * The list of binary media types supported by the <a>RestApi</a>. By
     * default, the <a>RestApi</a> supports only UTF-8-encoded text payloads.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param binaryMediaTypes <p>
     *            The list of binary media types supported by the
     *            <a>RestApi</a>. By default, the <a>RestApi</a> supports only
     *            UTF-8-encoded text payloads.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult withBinaryMediaTypes(String... binaryMediaTypes) {
        if (getBinaryMediaTypes() == null) {
            this.binaryMediaTypes = new java.util.ArrayList<String>(binaryMediaTypes.length);
        }
        for (String value : binaryMediaTypes) {
            this.binaryMediaTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of binary media types supported by the <a>RestApi</a>. By
     * default, the <a>RestApi</a> supports only UTF-8-encoded text payloads.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param binaryMediaTypes <p>
     *            The list of binary media types supported by the
     *            <a>RestApi</a>. By default, the <a>RestApi</a> supports only
     *            UTF-8-encoded text payloads.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult withBinaryMediaTypes(java.util.Collection<String> binaryMediaTypes) {
        setBinaryMediaTypes(binaryMediaTypes);
        return this;
    }

    /**
     * <p>
     * A nullable integer that is used to enable compression (with non-negative
     * between 0 and 10485760 (10M) bytes, inclusive) or disable compression
     * (with a null value) on an API. When compression is enabled, compression
     * or decompression is not applied on the payload if the payload size is
     * smaller than this value. Setting it to zero allows compression for any
     * payload size.
     * </p>
     *
     * @return <p>
     *         A nullable integer that is used to enable compression (with
     *         non-negative between 0 and 10485760 (10M) bytes, inclusive) or
     *         disable compression (with a null value) on an API. When
     *         compression is enabled, compression or decompression is not
     *         applied on the payload if the payload size is smaller than this
     *         value. Setting it to zero allows compression for any payload
     *         size.
     *         </p>
     */
    public Integer getMinimumCompressionSize() {
        return minimumCompressionSize;
    }

    /**
     * <p>
     * A nullable integer that is used to enable compression (with non-negative
     * between 0 and 10485760 (10M) bytes, inclusive) or disable compression
     * (with a null value) on an API. When compression is enabled, compression
     * or decompression is not applied on the payload if the payload size is
     * smaller than this value. Setting it to zero allows compression for any
     * payload size.
     * </p>
     *
     * @param minimumCompressionSize <p>
     *            A nullable integer that is used to enable compression (with
     *            non-negative between 0 and 10485760 (10M) bytes, inclusive) or
     *            disable compression (with a null value) on an API. When
     *            compression is enabled, compression or decompression is not
     *            applied on the payload if the payload size is smaller than
     *            this value. Setting it to zero allows compression for any
     *            payload size.
     *            </p>
     */
    public void setMinimumCompressionSize(Integer minimumCompressionSize) {
        this.minimumCompressionSize = minimumCompressionSize;
    }

    /**
     * <p>
     * A nullable integer that is used to enable compression (with non-negative
     * between 0 and 10485760 (10M) bytes, inclusive) or disable compression
     * (with a null value) on an API. When compression is enabled, compression
     * or decompression is not applied on the payload if the payload size is
     * smaller than this value. Setting it to zero allows compression for any
     * payload size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumCompressionSize <p>
     *            A nullable integer that is used to enable compression (with
     *            non-negative between 0 and 10485760 (10M) bytes, inclusive) or
     *            disable compression (with a null value) on an API. When
     *            compression is enabled, compression or decompression is not
     *            applied on the payload if the payload size is smaller than
     *            this value. Setting it to zero allows compression for any
     *            payload size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult withMinimumCompressionSize(Integer minimumCompressionSize) {
        this.minimumCompressionSize = minimumCompressionSize;
        return this;
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage
     * plan. Valid values are:
     * <ul>
     * <li><code>HEADER</code> to read the API key from the
     * <code>X-API-Key</code> header of a request.</li>
     * <li><code>AUTHORIZER</code> to read the API key from the
     * <code>UsageIdentifierKey</code> from a custom authorizer.</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEADER, AUTHORIZER
     *
     * @return <p>
     *         The source of the API key for metering requests according to a
     *         usage plan. Valid values are:
     *         <ul>
     *         <li><code>HEADER</code> to read the API key from the
     *         <code>X-API-Key</code> header of a request.</li>
     *         <li><code>AUTHORIZER</code> to read the API key from the
     *         <code>UsageIdentifierKey</code> from a custom authorizer.</li>
     *         </ul>
     *         </p>
     * @see ApiKeySourceType
     */
    public String getApiKeySource() {
        return apiKeySource;
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage
     * plan. Valid values are:
     * <ul>
     * <li><code>HEADER</code> to read the API key from the
     * <code>X-API-Key</code> header of a request.</li>
     * <li><code>AUTHORIZER</code> to read the API key from the
     * <code>UsageIdentifierKey</code> from a custom authorizer.</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEADER, AUTHORIZER
     *
     * @param apiKeySource <p>
     *            The source of the API key for metering requests according to a
     *            usage plan. Valid values are:
     *            <ul>
     *            <li><code>HEADER</code> to read the API key from the
     *            <code>X-API-Key</code> header of a request.</li>
     *            <li><code>AUTHORIZER</code> to read the API key from the
     *            <code>UsageIdentifierKey</code> from a custom authorizer.</li>
     *            </ul>
     *            </p>
     * @see ApiKeySourceType
     */
    public void setApiKeySource(String apiKeySource) {
        this.apiKeySource = apiKeySource;
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage
     * plan. Valid values are:
     * <ul>
     * <li><code>HEADER</code> to read the API key from the
     * <code>X-API-Key</code> header of a request.</li>
     * <li><code>AUTHORIZER</code> to read the API key from the
     * <code>UsageIdentifierKey</code> from a custom authorizer.</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEADER, AUTHORIZER
     *
     * @param apiKeySource <p>
     *            The source of the API key for metering requests according to a
     *            usage plan. Valid values are:
     *            <ul>
     *            <li><code>HEADER</code> to read the API key from the
     *            <code>X-API-Key</code> header of a request.</li>
     *            <li><code>AUTHORIZER</code> to read the API key from the
     *            <code>UsageIdentifierKey</code> from a custom authorizer.</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApiKeySourceType
     */
    public CreateRestApiResult withApiKeySource(String apiKeySource) {
        this.apiKeySource = apiKeySource;
        return this;
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage
     * plan. Valid values are:
     * <ul>
     * <li><code>HEADER</code> to read the API key from the
     * <code>X-API-Key</code> header of a request.</li>
     * <li><code>AUTHORIZER</code> to read the API key from the
     * <code>UsageIdentifierKey</code> from a custom authorizer.</li>
     * </ul>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEADER, AUTHORIZER
     *
     * @param apiKeySource <p>
     *            The source of the API key for metering requests according to a
     *            usage plan. Valid values are:
     *            <ul>
     *            <li><code>HEADER</code> to read the API key from the
     *            <code>X-API-Key</code> header of a request.</li>
     *            <li><code>AUTHORIZER</code> to read the API key from the
     *            <code>UsageIdentifierKey</code> from a custom authorizer.</li>
     *            </ul>
     *            </p>
     * @see ApiKeySourceType
     */
    public void setApiKeySource(ApiKeySourceType apiKeySource) {
        this.apiKeySource = apiKeySource.toString();
    }

    /**
     * <p>
     * The source of the API key for metering requests according to a usage
     * plan. Valid values are:
     * <ul>
     * <li><code>HEADER</code> to read the API key from the
     * <code>X-API-Key</code> header of a request.</li>
     * <li><code>AUTHORIZER</code> to read the API key from the
     * <code>UsageIdentifierKey</code> from a custom authorizer.</li>
     * </ul>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEADER, AUTHORIZER
     *
     * @param apiKeySource <p>
     *            The source of the API key for metering requests according to a
     *            usage plan. Valid values are:
     *            <ul>
     *            <li><code>HEADER</code> to read the API key from the
     *            <code>X-API-Key</code> header of a request.</li>
     *            <li><code>AUTHORIZER</code> to read the API key from the
     *            <code>UsageIdentifierKey</code> from a custom authorizer.</li>
     *            </ul>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApiKeySourceType
     */
    public CreateRestApiResult withApiKeySource(ApiKeySourceType apiKeySource) {
        this.apiKeySource = apiKeySource.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>RestApi</a> showing the endpoint
     * types of the API.
     * </p>
     *
     * @return <p>
     *         The endpoint configuration of this <a>RestApi</a> showing the
     *         endpoint types of the API.
     *         </p>
     */
    public EndpointConfiguration getEndpointConfiguration() {
        return endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>RestApi</a> showing the endpoint
     * types of the API.
     * </p>
     *
     * @param endpointConfiguration <p>
     *            The endpoint configuration of this <a>RestApi</a> showing the
     *            endpoint types of the API.
     *            </p>
     */
    public void setEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>RestApi</a> showing the endpoint
     * types of the API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointConfiguration <p>
     *            The endpoint configuration of this <a>RestApi</a> showing the
     *            endpoint types of the API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult withEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
        return this;
    }

    /**
     * A stringified JSON policy document that applies to this RestApi
     * regardless of the caller and <a>Method</a> configuration.
     *
     * @return A stringified JSON policy document that applies to this RestApi
     *         regardless of the caller and <a>Method</a> configuration.
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * A stringified JSON policy document that applies to this RestApi
     * regardless of the caller and <a>Method</a> configuration.
     *
     * @param policy A stringified JSON policy document that applies to this
     *            RestApi regardless of the caller and <a>Method</a>
     *            configuration.
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * A stringified JSON policy document that applies to this RestApi
     * regardless of the caller and <a>Method</a> configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policy A stringified JSON policy document that applies to this
     *            RestApi regardless of the caller and <a>Method</a>
     *            configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @return <p>
     *         The collection of tags. Each tag element is associated with a
     *         given resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRestApiResult addtagsEntry(String key, String value) {
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
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateRestApiResult cleartagsEntries() {
        this.tags = null;
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
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCreatedDate() != null)
            sb.append("createdDate: " + getCreatedDate() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getWarnings() != null)
            sb.append("warnings: " + getWarnings() + ",");
        if (getBinaryMediaTypes() != null)
            sb.append("binaryMediaTypes: " + getBinaryMediaTypes() + ",");
        if (getMinimumCompressionSize() != null)
            sb.append("minimumCompressionSize: " + getMinimumCompressionSize() + ",");
        if (getApiKeySource() != null)
            sb.append("apiKeySource: " + getApiKeySource() + ",");
        if (getEndpointConfiguration() != null)
            sb.append("endpointConfiguration: " + getEndpointConfiguration() + ",");
        if (getPolicy() != null)
            sb.append("policy: " + getPolicy() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        hashCode = prime * hashCode
                + ((getBinaryMediaTypes() == null) ? 0 : getBinaryMediaTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumCompressionSize() == null) ? 0 : getMinimumCompressionSize()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getApiKeySource() == null) ? 0 : getApiKeySource().hashCode());
        hashCode = prime
                * hashCode
                + ((getEndpointConfiguration() == null) ? 0 : getEndpointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRestApiResult == false)
            return false;
        CreateRestApiResult other = (CreateRestApiResult) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        if (other.getBinaryMediaTypes() == null ^ this.getBinaryMediaTypes() == null)
            return false;
        if (other.getBinaryMediaTypes() != null
                && other.getBinaryMediaTypes().equals(this.getBinaryMediaTypes()) == false)
            return false;
        if (other.getMinimumCompressionSize() == null ^ this.getMinimumCompressionSize() == null)
            return false;
        if (other.getMinimumCompressionSize() != null
                && other.getMinimumCompressionSize().equals(this.getMinimumCompressionSize()) == false)
            return false;
        if (other.getApiKeySource() == null ^ this.getApiKeySource() == null)
            return false;
        if (other.getApiKeySource() != null
                && other.getApiKeySource().equals(this.getApiKeySource()) == false)
            return false;
        if (other.getEndpointConfiguration() == null ^ this.getEndpointConfiguration() == null)
            return false;
        if (other.getEndpointConfiguration() != null
                && other.getEndpointConfiguration().equals(this.getEndpointConfiguration()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
