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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new <a>Stage</a> resource that references a pre-existing
 * <a>Deployment</a> for the API.
 * </p>
 */
public class CreateStageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * [Required] The name for the <a>Stage</a> resource. Stage names can only
     * contain alphanumeric characters, hyphens, and underscores. Maximum length
     * is 128 characters.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * [Required] The identifier of the <a>Deployment</a> resource for the
     * <a>Stage</a> resource.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The description of the <a>Stage</a> resource.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Whether cache clustering is enabled for the stage.
     * </p>
     */
    private Boolean cacheClusterEnabled;

    /**
     * <p>
     * The stage's cache cluster size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     */
    private String cacheClusterSize;

    /**
     * <p>
     * A map that defines the stage variables for the new <a>Stage</a> resource.
     * Variable names can have alphanumeric and underscore characters, and the
     * values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     */
    private java.util.Map<String, String> variables;

    /**
     * <p>
     * The version of the associated API documentation.
     * </p>
     */
    private String documentationVersion;

    /**
     * <p>
     * The canary deployment settings of this stage.
     * </p>
     */
    private CanarySettings canarySettings;

    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the
     * <a>Stage</a>.
     * </p>
     */
    private Boolean tracingEnabled;

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @return <p>
     *         [Required] The string identifier of the associated
     *         <a>RestApi</a>.
     *         </p>
     */
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * [Required] The name for the <a>Stage</a> resource. Stage names can only
     * contain alphanumeric characters, hyphens, and underscores. Maximum length
     * is 128 characters.
     * </p>
     *
     * @return <p>
     *         [Required] The name for the <a>Stage</a> resource. Stage names
     *         can only contain alphanumeric characters, hyphens, and
     *         underscores. Maximum length is 128 characters.
     *         </p>
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * <p>
     * [Required] The name for the <a>Stage</a> resource. Stage names can only
     * contain alphanumeric characters, hyphens, and underscores. Maximum length
     * is 128 characters.
     * </p>
     *
     * @param stageName <p>
     *            [Required] The name for the <a>Stage</a> resource. Stage names
     *            can only contain alphanumeric characters, hyphens, and
     *            underscores. Maximum length is 128 characters.
     *            </p>
     */
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * [Required] The name for the <a>Stage</a> resource. Stage names can only
     * contain alphanumeric characters, hyphens, and underscores. Maximum length
     * is 128 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageName <p>
     *            [Required] The name for the <a>Stage</a> resource. Stage names
     *            can only contain alphanumeric characters, hyphens, and
     *            underscores. Maximum length is 128 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>Deployment</a> resource for the
     * <a>Stage</a> resource.
     * </p>
     *
     * @return <p>
     *         [Required] The identifier of the <a>Deployment</a> resource for
     *         the <a>Stage</a> resource.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>Deployment</a> resource for the
     * <a>Stage</a> resource.
     * </p>
     *
     * @param deploymentId <p>
     *            [Required] The identifier of the <a>Deployment</a> resource
     *            for the <a>Stage</a> resource.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>Deployment</a> resource for the
     * <a>Stage</a> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            [Required] The identifier of the <a>Deployment</a> resource
     *            for the <a>Stage</a> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource.
     * </p>
     *
     * @return <p>
     *         The description of the <a>Stage</a> resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource.
     * </p>
     *
     * @param description <p>
     *            The description of the <a>Stage</a> resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the <a>Stage</a> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Whether cache clustering is enabled for the stage.
     * </p>
     *
     * @return <p>
     *         Whether cache clustering is enabled for the stage.
     *         </p>
     */
    public Boolean isCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * <p>
     * Whether cache clustering is enabled for the stage.
     * </p>
     *
     * @return <p>
     *         Whether cache clustering is enabled for the stage.
     *         </p>
     */
    public Boolean getCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * <p>
     * Whether cache clustering is enabled for the stage.
     * </p>
     *
     * @param cacheClusterEnabled <p>
     *            Whether cache clustering is enabled for the stage.
     *            </p>
     */
    public void setCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    /**
     * <p>
     * Whether cache clustering is enabled for the stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterEnabled <p>
     *            Whether cache clustering is enabled for the stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
        return this;
    }

    /**
     * <p>
     * The stage's cache cluster size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @return <p>
     *         The stage's cache cluster size.
     *         </p>
     * @see CacheClusterSize
     */
    public String getCacheClusterSize() {
        return cacheClusterSize;
    }

    /**
     * <p>
     * The stage's cache cluster size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>
     *            The stage's cache cluster size.
     *            </p>
     * @see CacheClusterSize
     */
    public void setCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    /**
     * <p>
     * The stage's cache cluster size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>
     *            The stage's cache cluster size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CacheClusterSize
     */
    public CreateStageRequest withCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
        return this;
    }

    /**
     * <p>
     * The stage's cache cluster size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>
     *            The stage's cache cluster size.
     *            </p>
     * @see CacheClusterSize
     */
    public void setCacheClusterSize(CacheClusterSize cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize.toString();
    }

    /**
     * <p>
     * The stage's cache cluster size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>
     *            The stage's cache cluster size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CacheClusterSize
     */
    public CreateStageRequest withCacheClusterSize(CacheClusterSize cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize.toString();
        return this;
    }

    /**
     * <p>
     * A map that defines the stage variables for the new <a>Stage</a> resource.
     * Variable names can have alphanumeric and underscore characters, and the
     * values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     *
     * @return <p>
     *         A map that defines the stage variables for the new <a>Stage</a>
     *         resource. Variable names can have alphanumeric and underscore
     *         characters, and the values must match
     *         <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     *         </p>
     */
    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for the new <a>Stage</a> resource.
     * Variable names can have alphanumeric and underscore characters, and the
     * values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     *
     * @param variables <p>
     *            A map that defines the stage variables for the new
     *            <a>Stage</a> resource. Variable names can have alphanumeric
     *            and underscore characters, and the values must match
     *            <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     *            </p>
     */
    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for the new <a>Stage</a> resource.
     * Variable names can have alphanumeric and underscore characters, and the
     * values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variables <p>
     *            A map that defines the stage variables for the new
     *            <a>Stage</a> resource. Variable names can have alphanumeric
     *            and underscore characters, and the values must match
     *            <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
        return this;
    }

    /**
     * <p>
     * A map that defines the stage variables for the new <a>Stage</a> resource.
     * Variable names can have alphanumeric and underscore characters, and the
     * values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into variables parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into variables.
     * @param value The corresponding value of the entry to be added into
     *            variables.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest addvariablesEntry(String key, String value) {
        if (null == this.variables) {
            this.variables = new java.util.HashMap<String, String>();
        }
        if (this.variables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.variables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into variables.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateStageRequest clearvariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * The version of the associated API documentation.
     * </p>
     *
     * @return <p>
     *         The version of the associated API documentation.
     *         </p>
     */
    public String getDocumentationVersion() {
        return documentationVersion;
    }

    /**
     * <p>
     * The version of the associated API documentation.
     * </p>
     *
     * @param documentationVersion <p>
     *            The version of the associated API documentation.
     *            </p>
     */
    public void setDocumentationVersion(String documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    /**
     * <p>
     * The version of the associated API documentation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentationVersion <p>
     *            The version of the associated API documentation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withDocumentationVersion(String documentationVersion) {
        this.documentationVersion = documentationVersion;
        return this;
    }

    /**
     * <p>
     * The canary deployment settings of this stage.
     * </p>
     *
     * @return <p>
     *         The canary deployment settings of this stage.
     *         </p>
     */
    public CanarySettings getCanarySettings() {
        return canarySettings;
    }

    /**
     * <p>
     * The canary deployment settings of this stage.
     * </p>
     *
     * @param canarySettings <p>
     *            The canary deployment settings of this stage.
     *            </p>
     */
    public void setCanarySettings(CanarySettings canarySettings) {
        this.canarySettings = canarySettings;
    }

    /**
     * <p>
     * The canary deployment settings of this stage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canarySettings <p>
     *            The canary deployment settings of this stage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withCanarySettings(CanarySettings canarySettings) {
        this.canarySettings = canarySettings;
        return this;
    }

    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the
     * <a>Stage</a>.
     * </p>
     *
     * @return <p>
     *         Specifies whether active tracing with X-ray is enabled for the
     *         <a>Stage</a>.
     *         </p>
     */
    public Boolean isTracingEnabled() {
        return tracingEnabled;
    }

    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the
     * <a>Stage</a>.
     * </p>
     *
     * @return <p>
     *         Specifies whether active tracing with X-ray is enabled for the
     *         <a>Stage</a>.
     *         </p>
     */
    public Boolean getTracingEnabled() {
        return tracingEnabled;
    }

    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the
     * <a>Stage</a>.
     * </p>
     *
     * @param tracingEnabled <p>
     *            Specifies whether active tracing with X-ray is enabled for the
     *            <a>Stage</a>.
     *            </p>
     */
    public void setTracingEnabled(Boolean tracingEnabled) {
        this.tracingEnabled = tracingEnabled;
    }

    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the
     * <a>Stage</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tracingEnabled <p>
     *            Specifies whether active tracing with X-ray is enabled for the
     *            <a>Stage</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withTracingEnabled(Boolean tracingEnabled) {
        this.tracingEnabled = tracingEnabled;
        return this;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     *
     * @return <p>
     *         The key-value map of strings. The valid character set is
     *         [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     *         not start with <code>aws:</code>. The tag value can be up to 256
     *         characters.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     *
     * @param tags <p>
     *            The key-value map of strings. The valid character set is
     *            [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and
     *            must not start with <code>aws:</code>. The tag value can be up
     *            to 256 characters.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value map of strings. The valid character set is
     *            [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and
     *            must not start with <code>aws:</code>. The tag value can be up
     *            to 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStageRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
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
    public CreateStageRequest addtagsEntry(String key, String value) {
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
    public CreateStageRequest cleartagsEntries() {
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
        if (getRestApiId() != null)
            sb.append("restApiId: " + getRestApiId() + ",");
        if (getStageName() != null)
            sb.append("stageName: " + getStageName() + ",");
        if (getDeploymentId() != null)
            sb.append("deploymentId: " + getDeploymentId() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCacheClusterEnabled() != null)
            sb.append("cacheClusterEnabled: " + getCacheClusterEnabled() + ",");
        if (getCacheClusterSize() != null)
            sb.append("cacheClusterSize: " + getCacheClusterSize() + ",");
        if (getVariables() != null)
            sb.append("variables: " + getVariables() + ",");
        if (getDocumentationVersion() != null)
            sb.append("documentationVersion: " + getDocumentationVersion() + ",");
        if (getCanarySettings() != null)
            sb.append("canarySettings: " + getCanarySettings() + ",");
        if (getTracingEnabled() != null)
            sb.append("tracingEnabled: " + getTracingEnabled() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCacheClusterEnabled() == null) ? 0 : getCacheClusterEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getCacheClusterSize() == null) ? 0 : getCacheClusterSize().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentationVersion() == null) ? 0 : getDocumentationVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCanarySettings() == null) ? 0 : getCanarySettings().hashCode());
        hashCode = prime * hashCode
                + ((getTracingEnabled() == null) ? 0 : getTracingEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStageRequest == false)
            return false;
        CreateStageRequest other = (CreateStageRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null
                && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCacheClusterEnabled() == null ^ this.getCacheClusterEnabled() == null)
            return false;
        if (other.getCacheClusterEnabled() != null
                && other.getCacheClusterEnabled().equals(this.getCacheClusterEnabled()) == false)
            return false;
        if (other.getCacheClusterSize() == null ^ this.getCacheClusterSize() == null)
            return false;
        if (other.getCacheClusterSize() != null
                && other.getCacheClusterSize().equals(this.getCacheClusterSize()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null
                && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getDocumentationVersion() == null ^ this.getDocumentationVersion() == null)
            return false;
        if (other.getDocumentationVersion() != null
                && other.getDocumentationVersion().equals(this.getDocumentationVersion()) == false)
            return false;
        if (other.getCanarySettings() == null ^ this.getCanarySettings() == null)
            return false;
        if (other.getCanarySettings() != null
                && other.getCanarySettings().equals(this.getCanarySettings()) == false)
            return false;
        if (other.getTracingEnabled() == null ^ this.getTracingEnabled() == null)
            return false;
        if (other.getTracingEnabled() != null
                && other.getTracingEnabled().equals(this.getTracingEnabled()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
