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
 * Creates a <a>Deployment</a> resource, which makes a specified <a>RestApi</a>
 * callable over the internet.
 * </p>
 */
public class CreateDeploymentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * The name of the <a>Stage</a> resource for the <a>Deployment</a> resource
     * to create.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The description of the <a>Stage</a> resource for the <a>Deployment</a>
     * resource to create.
     * </p>
     */
    private String stageDescription;

    /**
     * <p>
     * The description for the <a>Deployment</a> resource to create.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Enables a cache cluster for the <a>Stage</a> resource specified in the
     * input.
     * </p>
     */
    private Boolean cacheClusterEnabled;

    /**
     * <p>
     * Specifies the cache cluster size for the <a>Stage</a> resource specified
     * in the input, if a cache cluster is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     */
    private String cacheClusterSize;

    /**
     * <p>
     * A map that defines the stage variables for the <a>Stage</a> resource that
     * is associated with the new deployment. Variable names can have
     * alphanumeric and underscore characters, and the values must match
     * <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     */
    private java.util.Map<String, String> variables;

    /**
     * <p>
     * The input configuration for the canary deployment when the deployment is
     * a canary release deployment.
     * </p>
     */
    private DeploymentCanarySettings canarySettings;

    /**
     * <p>
     * Specifies whether active tracing with X-ray is enabled for the
     * <a>Stage</a>.
     * </p>
     */
    private Boolean tracingEnabled;

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
    public CreateDeploymentRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource for the <a>Deployment</a> resource
     * to create.
     * </p>
     *
     * @return <p>
     *         The name of the <a>Stage</a> resource for the <a>Deployment</a>
     *         resource to create.
     *         </p>
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource for the <a>Deployment</a> resource
     * to create.
     * </p>
     *
     * @param stageName <p>
     *            The name of the <a>Stage</a> resource for the
     *            <a>Deployment</a> resource to create.
     *            </p>
     */
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource for the <a>Deployment</a> resource
     * to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageName <p>
     *            The name of the <a>Stage</a> resource for the
     *            <a>Deployment</a> resource to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource for the <a>Deployment</a>
     * resource to create.
     * </p>
     *
     * @return <p>
     *         The description of the <a>Stage</a> resource for the
     *         <a>Deployment</a> resource to create.
     *         </p>
     */
    public String getStageDescription() {
        return stageDescription;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource for the <a>Deployment</a>
     * resource to create.
     * </p>
     *
     * @param stageDescription <p>
     *            The description of the <a>Stage</a> resource for the
     *            <a>Deployment</a> resource to create.
     *            </p>
     */
    public void setStageDescription(String stageDescription) {
        this.stageDescription = stageDescription;
    }

    /**
     * <p>
     * The description of the <a>Stage</a> resource for the <a>Deployment</a>
     * resource to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageDescription <p>
     *            The description of the <a>Stage</a> resource for the
     *            <a>Deployment</a> resource to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withStageDescription(String stageDescription) {
        this.stageDescription = stageDescription;
        return this;
    }

    /**
     * <p>
     * The description for the <a>Deployment</a> resource to create.
     * </p>
     *
     * @return <p>
     *         The description for the <a>Deployment</a> resource to create.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the <a>Deployment</a> resource to create.
     * </p>
     *
     * @param description <p>
     *            The description for the <a>Deployment</a> resource to create.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the <a>Deployment</a> resource to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description for the <a>Deployment</a> resource to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Enables a cache cluster for the <a>Stage</a> resource specified in the
     * input.
     * </p>
     *
     * @return <p>
     *         Enables a cache cluster for the <a>Stage</a> resource specified
     *         in the input.
     *         </p>
     */
    public Boolean isCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * <p>
     * Enables a cache cluster for the <a>Stage</a> resource specified in the
     * input.
     * </p>
     *
     * @return <p>
     *         Enables a cache cluster for the <a>Stage</a> resource specified
     *         in the input.
     *         </p>
     */
    public Boolean getCacheClusterEnabled() {
        return cacheClusterEnabled;
    }

    /**
     * <p>
     * Enables a cache cluster for the <a>Stage</a> resource specified in the
     * input.
     * </p>
     *
     * @param cacheClusterEnabled <p>
     *            Enables a cache cluster for the <a>Stage</a> resource
     *            specified in the input.
     *            </p>
     */
    public void setCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
    }

    /**
     * <p>
     * Enables a cache cluster for the <a>Stage</a> resource specified in the
     * input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterEnabled <p>
     *            Enables a cache cluster for the <a>Stage</a> resource
     *            specified in the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withCacheClusterEnabled(Boolean cacheClusterEnabled) {
        this.cacheClusterEnabled = cacheClusterEnabled;
        return this;
    }

    /**
     * <p>
     * Specifies the cache cluster size for the <a>Stage</a> resource specified
     * in the input, if a cache cluster is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @return <p>
     *         Specifies the cache cluster size for the <a>Stage</a> resource
     *         specified in the input, if a cache cluster is enabled.
     *         </p>
     * @see CacheClusterSize
     */
    public String getCacheClusterSize() {
        return cacheClusterSize;
    }

    /**
     * <p>
     * Specifies the cache cluster size for the <a>Stage</a> resource specified
     * in the input, if a cache cluster is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>
     *            Specifies the cache cluster size for the <a>Stage</a> resource
     *            specified in the input, if a cache cluster is enabled.
     *            </p>
     * @see CacheClusterSize
     */
    public void setCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
    }

    /**
     * <p>
     * Specifies the cache cluster size for the <a>Stage</a> resource specified
     * in the input, if a cache cluster is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>
     *            Specifies the cache cluster size for the <a>Stage</a> resource
     *            specified in the input, if a cache cluster is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CacheClusterSize
     */
    public CreateDeploymentRequest withCacheClusterSize(String cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize;
        return this;
    }

    /**
     * <p>
     * Specifies the cache cluster size for the <a>Stage</a> resource specified
     * in the input, if a cache cluster is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>
     *            Specifies the cache cluster size for the <a>Stage</a> resource
     *            specified in the input, if a cache cluster is enabled.
     *            </p>
     * @see CacheClusterSize
     */
    public void setCacheClusterSize(CacheClusterSize cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize.toString();
    }

    /**
     * <p>
     * Specifies the cache cluster size for the <a>Stage</a> resource specified
     * in the input, if a cache cluster is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>0.5, 1.6, 6.1, 13.5, 28.4, 58.2, 118, 237
     *
     * @param cacheClusterSize <p>
     *            Specifies the cache cluster size for the <a>Stage</a> resource
     *            specified in the input, if a cache cluster is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CacheClusterSize
     */
    public CreateDeploymentRequest withCacheClusterSize(CacheClusterSize cacheClusterSize) {
        this.cacheClusterSize = cacheClusterSize.toString();
        return this;
    }

    /**
     * <p>
     * A map that defines the stage variables for the <a>Stage</a> resource that
     * is associated with the new deployment. Variable names can have
     * alphanumeric and underscore characters, and the values must match
     * <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     *
     * @return <p>
     *         A map that defines the stage variables for the <a>Stage</a>
     *         resource that is associated with the new deployment. Variable
     *         names can have alphanumeric and underscore characters, and the
     *         values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     *         </p>
     */
    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for the <a>Stage</a> resource that
     * is associated with the new deployment. Variable names can have
     * alphanumeric and underscore characters, and the values must match
     * <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     *
     * @param variables <p>
     *            A map that defines the stage variables for the <a>Stage</a>
     *            resource that is associated with the new deployment. Variable
     *            names can have alphanumeric and underscore characters, and the
     *            values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     *            </p>
     */
    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * <p>
     * A map that defines the stage variables for the <a>Stage</a> resource that
     * is associated with the new deployment. Variable names can have
     * alphanumeric and underscore characters, and the values must match
     * <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variables <p>
     *            A map that defines the stage variables for the <a>Stage</a>
     *            resource that is associated with the new deployment. Variable
     *            names can have alphanumeric and underscore characters, and the
     *            values must match <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
        return this;
    }

    /**
     * <p>
     * A map that defines the stage variables for the <a>Stage</a> resource that
     * is associated with the new deployment. Variable names can have
     * alphanumeric and underscore characters, and the values must match
     * <code>[A-Za-z0-9-._~:/?#&amp;=,]+</code>.
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
    public CreateDeploymentRequest addvariablesEntry(String key, String value) {
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
    public CreateDeploymentRequest clearvariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * The input configuration for the canary deployment when the deployment is
     * a canary release deployment.
     * </p>
     *
     * @return <p>
     *         The input configuration for the canary deployment when the
     *         deployment is a canary release deployment.
     *         </p>
     */
    public DeploymentCanarySettings getCanarySettings() {
        return canarySettings;
    }

    /**
     * <p>
     * The input configuration for the canary deployment when the deployment is
     * a canary release deployment.
     * </p>
     *
     * @param canarySettings <p>
     *            The input configuration for the canary deployment when the
     *            deployment is a canary release deployment.
     *            </p>
     */
    public void setCanarySettings(DeploymentCanarySettings canarySettings) {
        this.canarySettings = canarySettings;
    }

    /**
     * <p>
     * The input configuration for the canary deployment when the deployment is
     * a canary release deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canarySettings <p>
     *            The input configuration for the canary deployment when the
     *            deployment is a canary release deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withCanarySettings(DeploymentCanarySettings canarySettings) {
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
    public CreateDeploymentRequest withTracingEnabled(Boolean tracingEnabled) {
        this.tracingEnabled = tracingEnabled;
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
        if (getStageDescription() != null)
            sb.append("stageDescription: " + getStageDescription() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCacheClusterEnabled() != null)
            sb.append("cacheClusterEnabled: " + getCacheClusterEnabled() + ",");
        if (getCacheClusterSize() != null)
            sb.append("cacheClusterSize: " + getCacheClusterSize() + ",");
        if (getVariables() != null)
            sb.append("variables: " + getVariables() + ",");
        if (getCanarySettings() != null)
            sb.append("canarySettings: " + getCanarySettings() + ",");
        if (getTracingEnabled() != null)
            sb.append("tracingEnabled: " + getTracingEnabled());
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
                + ((getStageDescription() == null) ? 0 : getStageDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCacheClusterEnabled() == null) ? 0 : getCacheClusterEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getCacheClusterSize() == null) ? 0 : getCacheClusterSize().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode
                + ((getCanarySettings() == null) ? 0 : getCanarySettings().hashCode());
        hashCode = prime * hashCode
                + ((getTracingEnabled() == null) ? 0 : getTracingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentRequest == false)
            return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest) obj;

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
        if (other.getStageDescription() == null ^ this.getStageDescription() == null)
            return false;
        if (other.getStageDescription() != null
                && other.getStageDescription().equals(this.getStageDescription()) == false)
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
        return true;
    }
}
