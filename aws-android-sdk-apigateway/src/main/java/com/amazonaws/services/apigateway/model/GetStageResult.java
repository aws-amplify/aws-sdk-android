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
 * <p>Represents a unique identifier for a version of a deployed <a>RestApi</a> that is callable by users.</p> <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html">Deploy an API</a> </div>
 */
public class GetStageResult implements Serializable {
    /**
     * <p>The identifier of the <a>Deployment</a> that the stage points to.</p>
     */
    private String deploymentId;

    /**
     * <p>The identifier of a client certificate for an API stage.</p>
     */
    private String clientCertificateId;

    /**
     * <p>The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.</p>
     */
    private String stageName;

    /**
     * <p>The stage's description.</p>
     */
    private String description;

    /**
     * <p>Specifies whether a cache cluster is enabled for the stage.</p>
     */
    private Boolean cacheClusterEnabled;

    /**
     * <p>The size of the cache cluster for the stage, if enabled.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     */
    private String cacheClusterSize;

    /**
     * <p>The status of the cache cluster for the stage, if enabled.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS
     */
    private String cacheClusterStatus;

    /**
     * <p>A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code> for an individual method override, or <code>/\*/\*</code> for overriding all methods in the stage. </p>
     */
    private java.util.Map<String, MethodSetting> methodSettings;

    /**
     * <p>A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.</p>
     */
    private java.util.Map<String, String> variables;

    /**
     * <p>The version of the associated API documentation.</p>
     */
    private String documentationVersion;

    /**
     * <p>Settings for logging access in this stage.</p>
     */
    private AccessLogSettings accessLogSettings;

    /**
     * <p>Settings for the canary deployment in this stage.</p>
     */
    private CanarySettings canarySettings;

    /**
     * <p>Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.</p>
     */
    private Boolean tracingEnabled;

    /**
     * <p>The ARN of the WebAcl associated with the <a>Stage</a>.</p>
     */
    private String webAclArn;

    /**
     * <p>The collection of tags. Each tag element is associated with a given resource.</p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>The timestamp when the stage was created.</p>
     */
    private java.util.Date createdDate;

    /**
     * <p>The timestamp when the stage last updated.</p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>The identifier of the <a>Deployment</a> that the stage points to.</p>
     *
     * @return <p>The identifier of the <a>Deployment</a> that the stage points to.</p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>The identifier of the <a>Deployment</a> that the stage points to.</p>
     *
     * @param deploymentId <p>The identifier of the <a>Deployment</a> that the stage points to.</p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>The identifier of the <a>Deployment</a> that the stage points to.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentId <p>The identifier of the <a>Deployment</a> that the stage points to.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>The identifier of a client certificate for an API stage.</p>
     *
     * @return <p>The identifier of a client certificate for an API stage.</p>
     */
    public String getClientCertificateId() {
        return clientCertificateId;
    }

    /**
     * <p>The identifier of a client certificate for an API stage.</p>
     *
     * @param clientCertificateId <p>The identifier of a client certificate for an API stage.</p>
     */
    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>The identifier of a client certificate for an API stage.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientCertificateId <p>The identifier of a client certificate for an API stage.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
        return this;
    }

    /**
     * <p>The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.</p>
     *
     * @return <p>The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.</p>
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * <p>The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.</p>
     *
     * @param stageName <p>The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.</p>
     */
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stageName <p>The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * <p>The stage's description.</p>
     *
     * @return <p>The stage's description.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>The stage's description.</p>
     *
     * @param description <p>The stage's description.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>The stage's description.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description <p>The stage's description.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>Specifies whether a cache cluster is enabled for the stage.</p>
     *
     * @return <p>Specifies whether a cache cluster is enabled for the stage.</p>
     */
    public Boolean isCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * <p>Specifies whether a cache cluster is enabled for the stage.</p>
     *
     * @return <p>Specifies whether a cache cluster is enabled for the stage.</p>
     */
    public Boolean getCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * <p>Specifies whether a cache cluster is enabled for the stage.</p>
     *
     * @param cacheClusterEnabled <p>Specifies whether a cache cluster is enabled for the stage.</p>
     */
    public void setCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    /**
     * <p>Specifies whether a cache cluster is enabled for the stage.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterEnabled <p>Specifies whether a cache cluster is enabled for the stage.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
        return this;
    }

    /**
     * <p>The size of the cache cluster for the stage, if enabled.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @return <p>The size of the cache cluster for the stage, if enabled.</p>
     *
     * @see CacheClusterSize
     */
    public String getCacheClusterSize() {
        return cacheClusterSize;
    }

    /**
     * <p>The size of the cache cluster for the stage, if enabled.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>The size of the cache cluster for the stage, if enabled.</p>
     *
     * @see CacheClusterSize
     */
    public void setCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    /**
     * <p>The size of the cache cluster for the stage, if enabled.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>The size of the cache cluster for the stage, if enabled.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CacheClusterSize
     */
    public GetStageResult withCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
        return this;
    }

    /**
     * <p>The size of the cache cluster for the stage, if enabled.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>The size of the cache cluster for the stage, if enabled.</p>
     *
     * @see CacheClusterSize
     */
    public void setCacheClusterSize(CacheClusterSize cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize.toString();
    }

    /**
     * <p>The size of the cache cluster for the stage, if enabled.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>The size of the cache cluster for the stage, if enabled.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CacheClusterSize
     */
    public GetStageResult withCacheClusterSize(CacheClusterSize cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize.toString();
        return this;
    }

    /**
     * <p>The status of the cache cluster for the stage, if enabled.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS
     *
     * @return <p>The status of the cache cluster for the stage, if enabled.</p>
     *
     * @see CacheClusterStatus
     */
    public String getCacheClusterStatus() {
        return cacheClusterStatus;
    }

    /**
     * <p>The status of the cache cluster for the stage, if enabled.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS
     *
     * @param cacheClusterStatus <p>The status of the cache cluster for the stage, if enabled.</p>
     *
     * @see CacheClusterStatus
     */
    public void setCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
    }

    /**
     * <p>The status of the cache cluster for the stage, if enabled.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS
     *
     * @param cacheClusterStatus <p>The status of the cache cluster for the stage, if enabled.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CacheClusterStatus
     */
    public GetStageResult withCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
        return this;
    }

    /**
     * <p>The status of the cache cluster for the stage, if enabled.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS
     *
     * @param cacheClusterStatus <p>The status of the cache cluster for the stage, if enabled.</p>
     *
     * @see CacheClusterStatus
     */
    public void setCacheClusterStatus(CacheClusterStatus cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus.toString();
    }

    /**
     * <p>The status of the cache cluster for the stage, if enabled.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS
     *
     * @param cacheClusterStatus <p>The status of the cache cluster for the stage, if enabled.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CacheClusterStatus
     */
    public GetStageResult withCacheClusterStatus(CacheClusterStatus cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus.toString();
        return this;
    }

    /**
     * <p>A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code> for an individual method override, or <code>/\*/\*</code> for overriding all methods in the stage. </p>
     *
     * @return <p>A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code> for an individual method override, or <code>/\*/\*</code> for overriding all methods in the stage. </p>
     */
    public java.util.Map<String, MethodSetting> getMethodSettings() {
        return methodSettings;
    }

    /**
     * <p>A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code> for an individual method override, or <code>/\*/\*</code> for overriding all methods in the stage. </p>
     *
     * @param methodSettings <p>A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code> for an individual method override, or <code>/\*/\*</code> for overriding all methods in the stage. </p>
     */
    public void setMethodSettings(java.util.Map<String, MethodSetting> methodSettings) {
        this.methodSettings = methodSettings;
    }

    /**
     * <p>A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code> for an individual method override, or <code>/\*/\*</code> for overriding all methods in the stage. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param methodSettings <p>A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code> for an individual method override, or <code>/\*/\*</code> for overriding all methods in the stage. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withMethodSettings(java.util.Map<String, MethodSetting> methodSettings) {
        this.methodSettings = methodSettings;
        return this;
    }

    /**
     * <p>A map that defines the method settings for a <a>Stage</a> resource. Keys (designated as <code>/{method_setting_key</code> below) are method paths defined as <code>{resource_path}/{http_method}</code> for an individual method override, or <code>/\*/\*</code> for overriding all methods in the stage. </p>
     * <p>
     * The method adds a new key-value pair into methodSettings parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into methodSettings.
     * @param value The corresponding value of the entry to be added into methodSettings.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult addmethodSettingsEntry(String key, MethodSetting value) {
        if (null == this.methodSettings) {
            this.methodSettings = new java.util.HashMap<String, MethodSetting>();
        }
        if (this.methodSettings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.methodSettings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into methodSettings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public GetStageResult clearmethodSettingsEntries() {
        this.methodSettings = null;
        return this;
    }

    /**
     * <p>A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.</p>
     *
     * @return <p>A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.</p>
     */
    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * <p>A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.</p>
     *
     * @param variables <p>A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.</p>
     */
    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * <p>A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param variables <p>A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
        return this;
    }

    /**
     * <p>A map that defines the stage variables for a <a>Stage</a> resource. Variable names can have alphanumeric and underscore characters, and the values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.</p>
     * <p>
     * The method adds a new key-value pair into variables parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into variables.
     * @param value The corresponding value of the entry to be added into variables.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult addvariablesEntry(String key, String value) {
        if (null == this.variables) {
            this.variables = new java.util.HashMap<String, String>();
        }
        if (this.variables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.variables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into variables.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public GetStageResult clearvariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>The version of the associated API documentation.</p>
     *
     * @return <p>The version of the associated API documentation.</p>
     */
    public String getDocumentationVersion() {
        return documentationVersion;
    }

    /**
     * <p>The version of the associated API documentation.</p>
     *
     * @param documentationVersion <p>The version of the associated API documentation.</p>
     */
    public void setDocumentationVersion(String documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    /**
     * <p>The version of the associated API documentation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param documentationVersion <p>The version of the associated API documentation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withDocumentationVersion(String documentationVersion) {
        this.documentationVersion = documentationVersion;
        return this;
    }

    /**
     * <p>Settings for logging access in this stage.</p>
     *
     * @return <p>Settings for logging access in this stage.</p>
     */
    public AccessLogSettings getAccessLogSettings() {
        return accessLogSettings;
    }

    /**
     * <p>Settings for logging access in this stage.</p>
     *
     * @param accessLogSettings <p>Settings for logging access in this stage.</p>
     */
    public void setAccessLogSettings(AccessLogSettings accessLogSettings) {
        this.accessLogSettings = accessLogSettings;
    }

    /**
     * <p>Settings for logging access in this stage.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessLogSettings <p>Settings for logging access in this stage.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withAccessLogSettings(AccessLogSettings accessLogSettings) {
        this.accessLogSettings = accessLogSettings;
        return this;
    }

    /**
     * <p>Settings for the canary deployment in this stage.</p>
     *
     * @return <p>Settings for the canary deployment in this stage.</p>
     */
    public CanarySettings getCanarySettings() {
        return canarySettings;
    }

    /**
     * <p>Settings for the canary deployment in this stage.</p>
     *
     * @param canarySettings <p>Settings for the canary deployment in this stage.</p>
     */
    public void setCanarySettings(CanarySettings canarySettings) {
        this.canarySettings = canarySettings;
    }

    /**
     * <p>Settings for the canary deployment in this stage.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param canarySettings <p>Settings for the canary deployment in this stage.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withCanarySettings(CanarySettings canarySettings) {
        this.canarySettings = canarySettings;
        return this;
    }

    /**
     * <p>Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.</p>
     *
     * @return <p>Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.</p>
     */
    public Boolean isTracingEnabled() {
        return tracingEnabled;
    }

    /**
     * <p>Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.</p>
     *
     * @return <p>Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.</p>
     */
    public Boolean getTracingEnabled() {
        return tracingEnabled;
    }

    /**
     * <p>Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.</p>
     *
     * @param tracingEnabled <p>Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.</p>
     */
    public void setTracingEnabled(Boolean tracingEnabled) {
        this.tracingEnabled = tracingEnabled;
    }

    /**
     * <p>Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tracingEnabled <p>Specifies whether active tracing with X-ray is enabled for the <a>Stage</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withTracingEnabled(Boolean tracingEnabled) {
        this.tracingEnabled = tracingEnabled;
        return this;
    }

    /**
     * <p>The ARN of the WebAcl associated with the <a>Stage</a>.</p>
     *
     * @return <p>The ARN of the WebAcl associated with the <a>Stage</a>.</p>
     */
    public String getWebAclArn() {
        return webAclArn;
    }

    /**
     * <p>The ARN of the WebAcl associated with the <a>Stage</a>.</p>
     *
     * @param webAclArn <p>The ARN of the WebAcl associated with the <a>Stage</a>.</p>
     */
    public void setWebAclArn(String webAclArn) {
        this.webAclArn = webAclArn;
    }

    /**
     * <p>The ARN of the WebAcl associated with the <a>Stage</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param webAclArn <p>The ARN of the WebAcl associated with the <a>Stage</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withWebAclArn(String webAclArn) {
        this.webAclArn = webAclArn;
        return this;
    }

    /**
     * <p>The collection of tags. Each tag element is associated with a given resource.</p>
     *
     * @return <p>The collection of tags. Each tag element is associated with a given resource.</p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>The collection of tags. Each tag element is associated with a given resource.</p>
     *
     * @param tags <p>The collection of tags. Each tag element is associated with a given resource.</p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>The collection of tags. Each tag element is associated with a given resource.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags <p>The collection of tags. Each tag element is associated with a given resource.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>The collection of tags. Each tag element is associated with a given resource.</p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public GetStageResult cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>The timestamp when the stage was created.</p>
     *
     * @return <p>The timestamp when the stage was created.</p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>The timestamp when the stage was created.</p>
     *
     * @param createdDate <p>The timestamp when the stage was created.</p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>The timestamp when the stage was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdDate <p>The timestamp when the stage was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>The timestamp when the stage last updated.</p>
     *
     * @return <p>The timestamp when the stage last updated.</p>
     */
    public java.util.Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * <p>The timestamp when the stage last updated.</p>
     *
     * @param lastUpdatedDate <p>The timestamp when the stage last updated.</p>
     */
    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>The timestamp when the stage last updated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedDate <p>The timestamp when the stage last updated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetStageResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeploymentId() != null) sb.append("deploymentId: " + getDeploymentId() + ",");
        if (getClientCertificateId() != null) sb.append("clientCertificateId: " + getClientCertificateId() + ",");
        if (getStageName() != null) sb.append("stageName: " + getStageName() + ",");
        if (getDescription() != null) sb.append("description: " + getDescription() + ",");
        if (getCacheClusterEnabled() != null) sb.append("cacheClusterEnabled: " + getCacheClusterEnabled() + ",");
        if (getCacheClusterSize() != null) sb.append("cacheClusterSize: " + getCacheClusterSize() + ",");
        if (getCacheClusterStatus() != null) sb.append("cacheClusterStatus: " + getCacheClusterStatus() + ",");
        if (getMethodSettings() != null) sb.append("methodSettings: " + getMethodSettings() + ",");
        if (getVariables() != null) sb.append("variables: " + getVariables() + ",");
        if (getDocumentationVersion() != null) sb.append("documentationVersion: " + getDocumentationVersion() + ",");
        if (getAccessLogSettings() != null) sb.append("accessLogSettings: " + getAccessLogSettings() + ",");
        if (getCanarySettings() != null) sb.append("canarySettings: " + getCanarySettings() + ",");
        if (getTracingEnabled() != null) sb.append("tracingEnabled: " + getTracingEnabled() + ",");
        if (getWebAclArn() != null) sb.append("webAclArn: " + getWebAclArn() + ",");
        if (getTags() != null) sb.append("tags: " + getTags() + ",");
        if (getCreatedDate() != null) sb.append("createdDate: " + getCreatedDate() + ",");
        if (getLastUpdatedDate() != null) sb.append("lastUpdatedDate: " + getLastUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getClientCertificateId() == null) ? 0 : getClientCertificateId().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterEnabled() == null) ? 0 : getCacheClusterEnabled().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterSize() == null) ? 0 : getCacheClusterSize().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterStatus() == null) ? 0 : getCacheClusterStatus().hashCode());
        hashCode = prime * hashCode + ((getMethodSettings() == null) ? 0 : getMethodSettings().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getDocumentationVersion() == null) ? 0 : getDocumentationVersion().hashCode());
        hashCode = prime * hashCode + ((getAccessLogSettings() == null) ? 0 : getAccessLogSettings().hashCode());
        hashCode = prime * hashCode + ((getCanarySettings() == null) ? 0 : getCanarySettings().hashCode());
        hashCode = prime * hashCode + ((getTracingEnabled() == null) ? 0 : getTracingEnabled().hashCode());
        hashCode = prime * hashCode + ((getWebAclArn() == null) ? 0 : getWebAclArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetStageResult == false) return false;
        GetStageResult other = (GetStageResult)obj;

        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null) return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false) return false;
        if (other.getClientCertificateId() == null ^ this.getClientCertificateId() == null) return false;
        if (other.getClientCertificateId() != null && other.getClientCertificateId().equals(this.getClientCertificateId()) == false) return false;
        if (other.getStageName() == null ^ this.getStageName() == null) return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getCacheClusterEnabled() == null ^ this.getCacheClusterEnabled() == null) return false;
        if (other.getCacheClusterEnabled() != null && other.getCacheClusterEnabled().equals(this.getCacheClusterEnabled()) == false) return false;
        if (other.getCacheClusterSize() == null ^ this.getCacheClusterSize() == null) return false;
        if (other.getCacheClusterSize() != null && other.getCacheClusterSize().equals(this.getCacheClusterSize()) == false) return false;
        if (other.getCacheClusterStatus() == null ^ this.getCacheClusterStatus() == null) return false;
        if (other.getCacheClusterStatus() != null && other.getCacheClusterStatus().equals(this.getCacheClusterStatus()) == false) return false;
        if (other.getMethodSettings() == null ^ this.getMethodSettings() == null) return false;
        if (other.getMethodSettings() != null && other.getMethodSettings().equals(this.getMethodSettings()) == false) return false;
        if (other.getVariables() == null ^ this.getVariables() == null) return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false) return false;
        if (other.getDocumentationVersion() == null ^ this.getDocumentationVersion() == null) return false;
        if (other.getDocumentationVersion() != null && other.getDocumentationVersion().equals(this.getDocumentationVersion()) == false) return false;
        if (other.getAccessLogSettings() == null ^ this.getAccessLogSettings() == null) return false;
        if (other.getAccessLogSettings() != null && other.getAccessLogSettings().equals(this.getAccessLogSettings()) == false) return false;
        if (other.getCanarySettings() == null ^ this.getCanarySettings() == null) return false;
        if (other.getCanarySettings() != null && other.getCanarySettings().equals(this.getCanarySettings()) == false) return false;
        if (other.getTracingEnabled() == null ^ this.getTracingEnabled() == null) return false;
        if (other.getTracingEnabled() != null && other.getTracingEnabled().equals(this.getTracingEnabled()) == false) return false;
        if (other.getWebAclArn() == null ^ this.getWebAclArn() == null) return false;
        if (other.getWebAclArn() != null && other.getWebAclArn().equals(this.getWebAclArn()) == false) return false;
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null) return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false) return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null) return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false) return false;
        return true;
    }
}
